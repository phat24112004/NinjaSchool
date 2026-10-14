import javax.microedition.lcdui.*;
import java.util.*;
import java.io.*;

public final class CostumeX
{
    private static final Hashtable states;
    private static final Hashtable statesById;
    private static final Hashtable effs;
    private static long lastPurge;
    private static short[] selfIds;
    private static Object selfRef;
    static boolean hide;
    static boolean oldSwing;
    static final int SIT_FRAME = 0;
    static final int SIT_UP = 10;
    static final boolean SIT_SKIP_LEG = true;
    static final boolean SIT_SWING = true;
    static final boolean SIT_OLD_SWING = true;
    static final int ACC_DX = 0;
    static final int ACC_DY = 0;
    static final int MS_PER_TICK = 33;
    static final int TICK_FHO = 3;
    static final int TICK_MV = 10;
    static boolean posted;
    static boolean horseSwap;
    static aa curChar;
    static boolean sdm;
    static boolean sh;
    static boolean sco;
    static final int[] WARM_MOTO;
    static final int[] WARM_WOLF;
    static final Hashtable warmed;
    private static ep dummyIt;
    static boolean prof;
    static aa dch;
    static Hashtable nhu;
    
    public CostumeX() {
        super();
    }
    
    static int oldMountId(final aa aa) {
        try {
            if (aa.l() || aa.o()) {
                final el[] fw = aa.fw;
                if (fw != null && fw.length > 4 && fw[4] != null && fw[4].j != null) {
                    return fw[4].j.d;
                }
                return 1;
            }
        }
        catch (final Throwable t) {}
        return 0;
    }
    
    static void track(final aa aa, final St st) {
        if (st == null || st.ids == null || st.ids.length < 7) {
            return;
        }
        final short n = st.ids[6];
        final int oldMountId = oldMountId(aa);
        if (!st.trk) {
            st.trk = true;
            st.lastHorse = n;
            st.lastOld = oldMountId;
            st.prefOld = false;
        }
        else {
            if (oldMountId != st.lastOld) {
                if (oldMountId != 0) {
                    st.prefOld = true;
                }
                st.lastOld = oldMountId;
            }
            if (n != st.lastHorse) {
                if (n > -1) {
                    st.prefOld = false;
                }
                st.lastHorse = n;
            }
        }
        st.noHorse = (n > -1 && oldMountId != 0 && st.prefOld);
    }
    
    static void warm(final aa key) {
        try {
            final int oldMountId = oldMountId(key);
            final Integer value = CostumeX.warmed.get(key);
            if (oldMountId == 0) {
                if (value != null) {
                    CostumeX.warmed.remove(key);
                }
                return;
            }
            if (value != null && value == oldMountId) {
                return;
            }
            if (CostumeX.warmed.size() > 300) {
                CostumeX.warmed.clear();
            }
            CostumeX.warmed.put(key, new Integer(oldMountId));
            final int[] array = key.o() ? CostumeX.WARM_WOLF : CostumeX.WARM_MOTO;
            for (int i = 0; i < array.length; ++i) {
                try {
                    fo.b(array[i]);
                }
                catch (final Throwable t) {}
            }
        }
        catch (final Throwable t2) {}
    }
    
    static boolean horseCos(final St st) {
        return st != null && st.ids != null && st.ids.length > 6 && st.ids[6] > -1 && !st.noHorse;
    }
    
    public static void set(final aa selfRef, final short[] array) {
        try {
            if (selfRef == null || array == null || array.length < 10) {
                return;
            }
            final short[] array2 = new short[10];
            for (int i = 0; i < 10; ++i) {
                array2[i] = array[i];
                if (array2[i] <= -1) {}
            }
            if (array2[5] > 3000) {
                array2[5] = -1;
            }
            St st;
            if ((st = CostumeX.states.get(selfRef)) == null) {
                st = new St();
            }
            st.ids = array2;
            st.seen = System.currentTimeMillis();
            CostumeX.states.put(selfRef, st);
            try {
                if (selfRef.ay != 0) {
                    CostumeX.statesById.put(new Integer(selfRef.ay), st);
                }
            }
            catch (final Throwable t) {}
            try {
                final aa z = aa.z();
                if (z != null && (z == selfRef || z.ay == selfRef.ay)) {
                    CostumeX.selfRef = selfRef;
                    CostumeX.selfIds = array2;
                }
            }
            catch (final Throwable t2) {}
        }
        catch (final Throwable t3) {}
    }
    
    static Eff eff(final int n) {
        if (n <= -1) {
            return null;
        }
        final Integer n2 = new Integer(n);
        Eff value = CostumeX.effs.get(n2);
        if (value == null) {
            value = new Eff();
            value.id = n;
            try {
                value.e = new o((short)n, -1L, 0);
            }
            catch (final Throwable t) {
                value.e = null;
            }
            CostumeX.effs.put(n2, value);
        }
        if (value.e == null) {
            return null;
        }
        if (!value.ok) {
            value.lastTry = System.currentTimeMillis();
            try {
                value.ok = value.e.b();
            }
            catch (final Throwable t2) {
                value.ok = false;
            }
            if (!value.ok) {
                return null;
            }
        }
        return value;
    }
    
    private static boolean parseHorse(final Eff eff) {
        if (eff.parsed) {
            return eff.actStand != null;
        }
        final byte[] h = eff.e.h;
        if (h == null || h.length < 4) {
            return false;
        }
        eff.parsed = true;
        int n = 0;
        final int[][] array = new int[9][];
        final int[] array2 = new int[9];
        for (int i = 0; i < 9; ++i) {
            array[i] = new int[h.length];
        }
        for (int j = 0; j < h.length; ++j) {
            if (h[j] == -1) {
                ++n;
            }
            else if (n >= 2) {
                if (n <= 8) {
                    array[n][array2[n]++] = h[j];
                }
            }
        }
        eff.cnt = h[0];
        eff.dxH = h[2];
        eff.dyH = h[3];
        eff.frameChar = toB(array[2], array2[2]);
        eff.actStand = toB(array[3], array2[3]);
        eff.actRun = toB(array[4], array2[4]);
        eff.actJump = toB(array[5], array2[5]);
        eff.actFall = toB(array[6], array2[6]);
        eff.dxChar = toB(array[7], array2[7]);
        eff.dyChar = toB(array[8], array2[8]);
        if (eff.dxChar.length == 0) {
            eff.dxChar = new byte[Math.max(1, eff.cnt)];
        }
        if (eff.dyChar.length == 0) {
            eff.dyChar = new byte[Math.max(1, eff.cnt)];
        }
        if (eff.actStand.length == 0) {
            eff.actStand = null;
            return false;
        }
        return true;
    }
    
    private static byte[] toB(final int[] array, final int n) {
        final byte[] array2 = new byte[n];
        for (int i = 0; i < n; ++i) {
            array2[i] = (byte)array[i];
        }
        return array2;
    }
    
    private static int step(final Eff eff, final long n, final int n2) {
        if (NewMount.stepOn) {
            return NewMount.step(eff);
        }
        int n3 = eff.e.b.size() / 30;
        if (n3 <= 0) {
            n3 = 1;
        }
        int n4;
        if ((n4 = (n2 + 16) / 33) < 1) {
            n4 = 1;
        }
        return ff.am / n4 % n3;
    }
    
    private static void draw(final cn cn, final Eff eff, final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        try {
            if (eff == null || cn == null) {
                return;
            }
            if (n3 < 0 || n3 >= eff.e.b.size()) {
                return;
            }
            final n b3 = q.b((short)eff.id);
            if (b3 == null || b3.b == null) {
                return;
            }
            final Image b4 = b3.b;
            final r r = (r)eff.e.b.elementAt(n3);
            if (b) {
                part(cn, eff, r.b, b4, n, n2, n4);
            }
            if (b2) {
                part(cn, eff, r.a, b4, n, n2, n4);
            }
        }
        catch (final Throwable t) {}
    }
    
    private static void part(final cn cn, final Eff eff, final fa fa, final Image image, final int n, final int n2, final int n3) {
        if (fa == null) {
            return;
        }
        final int width = image.getWidth();
        final int height = image.getHeight();
        for (int i = 0; i < fa.size(); ++i) {
            final p p7 = (p)fa.elementAt(i);
            if (p7.e >= 0) {
                if (p7.e < eff.e.d.length) {
                    final fo fo = eff.e.d[p7.e];
                    int d = p7.d;
                    int f = fo.f;
                    int d2 = fo.d;
                    int c = fo.c;
                    int a = fo.a;
                    if (c > width) {
                        c = 0;
                    }
                    if (a > height) {
                        a = 0;
                    }
                    if (c + f > width) {
                        f = width - c;
                    }
                    if (a + d2 > height) {
                        d2 = height - a;
                    }
                    if (f > 0) {
                        if (d2 > 0) {
                            int n4 = (p7.b == 1) ? 2 : 0;
                            if (n3 == 2 || n3 == 6) {
                                n4 = ((n4 == 2) ? 0 : 2);
                                d = -(d + f);
                            }
                            cn.a(image, c, a, f, d2, n4, n + d, n2 + p7.a, 0);
                        }
                    }
                }
            }
        }
    }
    
    private static int seqFrame(final Eff eff, final long n) {
        final byte[] h = eff.e.h;
        if (h == null || h.length == 0) {
            return -1;
        }
        return h[ff.am % h.length];
    }
    
    private static void purge(final long lastPurge) {
        if (lastPurge - CostumeX.lastPurge < 30000L) {
            return;
        }
        CostumeX.lastPurge = lastPurge;
        final Enumeration keys = CostumeX.states.keys();
        while (keys.hasMoreElements()) {
            final Object nextElement = keys.nextElement();
            final St st = CostumeX.states.get(nextElement);
            if (st != null) {
                if (lastPurge - st.seen <= 60000L) {
                    continue;
                }
                CostumeX.states.remove(nextElement);
            }
        }
    }
    
    static St lookup(final aa aa) {
        if (aa == null) {
            return null;
        }
        St st = CostumeX.states.get(aa);
        if (st != null && st.ids != null) {
            return st;
        }
        try {
            if (aa.ay != 0 && (st = CostumeX.statesById.get(new Integer(aa.ay))) != null && st.ids != null) {
                CostumeX.states.put(aa, st);
                return st;
            }
        }
        catch (final Throwable t) {}
        try {
            final aa z = aa.z();
            if (z != null && (z == aa || z.ay == aa.ay) && CostumeX.selfIds != null) {
                if (st == null) {
                    st = new St();
                }
                st.ids = CostumeX.selfIds;
                CostumeX.states.put(aa, st);
                if (aa.ay != 0) {
                    CostumeX.statesById.put(new Integer(aa.ay), st);
                }
                return st;
            }
        }
        catch (final Throwable t2) {}
        try {
            final aa z2;
            if (CostumeX.selfRef != null && CostumeX.selfIds != null && (z2 = aa.z()) != null && (z2 == aa || aa == CostumeX.selfRef)) {
                if (st == null) {
                    st = new St();
                }
                st.ids = CostumeX.selfIds;
                CostumeX.states.put(aa, st);
                return st;
            }
        }
        catch (final Throwable t3) {}
        return st;
    }
    
    public static void pre(final aa aa, final cn cn) {
        try {
            final St lookup = lookup(aa);
            if (lookup == null || lookup.ids == null) {
                return;
            }
            if (lookup.shifted) {
                unshift(aa, lookup);
            }
            final long n = lookup.seen = System.currentTimeMillis();
            purge(lookup.seen);
            final short[] ids = lookup.ids;
            final int ai = aa.ai;
            final int eu = aa.eu;
            final int n2 = (aa.cb == 1) ? 0 : 2;
            lookup.horseOn = false;
            Eff eff = null;
            if (!lookup.noHorse) {
                eff = eff(ids[6]);
            }
            final Eff eff2 = eff;
            if (eff2 != null && parseHorse(eff2)) {
                final int dw = aa.dw;
                final byte[] array = (dw == 1 || dw == 6) ? eff2.actStand : ((dw == 2 || dw == 10) ? ((eff2.actRun.length > 0) ? eff2.actRun : eff2.actStand) : ((dw == 4) ? ((eff2.actFall.length > 0) ? eff2.actFall : eff2.actStand) : ((dw == 3) ? ((eff2.actJump.length > 0) ? eff2.actJump : eff2.actStand) : eff2.actStand)));
                final int am = ff.am;
                if (am < lookup.fhoT || am - lookup.fhoT >= 3L) {
                    lookup.fhoT = am;
                    lookup.fho = (lookup.fho + 1) % array.length;
                }
                if (am < lookup.mvT || am - lookup.mvT >= 10L) {
                    lookup.mvT = am;
                    int n3 = eff2.e.b.size() / ((eff2.e.h != null && eff2.e.h.length > 0) ? eff2.e.h.length : 1);
                    if (n3 <= 0) {
                        n3 = 1;
                    }
                    lookup.mv = (lookup.mv + 1) % n3;
                }
                byte hbw;
                if ((hbw = (byte)(array[(lookup.fho >= array.length) ? (array.length - 1) : lookup.fho] + lookup.mv * eff2.cnt)) < 0) {
                    hbw = 0;
                }
                int n4 = eff2.dxH + ((hbw < eff2.dxChar.length) ? eff2.dxChar[hbw] : 0);
                final int hdy = eff2.dyH + ((hbw < eff2.dyChar.length) ? eff2.dyChar[hbw] : 0);
                if (aa.cb == 1) {
                    n4 = -n4;
                }
                final int n5 = (hbw < eff2.frameChar.length) ? eff2.frameChar[hbw] : aa.bi;
                lookup.hbw = hbw;
                lookup.horseOn = true;
                lookup.addX = n4;
                lookup.addY = -hdy;
                lookup.oldCf = aa.bi;
                lookup.shifted = true;
                lookup.hdx = n4;
                lookup.hdy = hdy;
                lookup.hcf = n5;
                draw(cn, eff2, ai, eu, hbw, cb2(aa), true, false);
                aa.ai = ai + n4;
                aa.eu = eu - hdy;
                aa.bi = n5;
            }
            final Eff eff3;
            if ((eff3 = eff(ids[7])) != null) {
                draw(cn, eff3, ai, eu - offT(aa), seqFrame(eff3, n), n2, true, false);
            }
            final Eff eff4;
            if ((eff4 = eff(ids[5])) != null) {
                draw(cn, eff4, ai, eu - offT(aa), seqFrame(eff4, n), 0, true, false);
            }
            final Eff eff5;
            if ((eff5 = eff(ids[4])) != null) {
                int n6 = lookup.horseOn ? (ai + lookup.hdx) : ai;
                int n7 = lookup.horseOn ? (eu - lookup.hdy) : eu;
                int bi = 0;
                if (lookup.horseOn) {
                    final int hcf = lookup.hcf;
                }
                else {
                    bi = aa.bi;
                }
                int seatFrame = bi;
                if (sit(aa, lookup)) {
                    n6 = ai + sitDx(aa);
                    n7 = eu + sitDy(aa);
                    seatFrame = seatFrame(aa);
                }
                draw(cn, eff5, n6 + 0 * aa.cb, n7 + 0, seatFrame + step(eff5, n, 330) * 30, n2, true, false);
            }
        }
        catch (final Throwable t) {}
    }
    
    private static int cb2(final aa aa) {
        return (aa.cb == 1) ? 2 : 0;
    }
    
    private static void unshift(final aa aa, final St st) {
        aa.ai -= st.addX;
        aa.eu -= st.addY;
        if (aa.at == null && aa.bi == st.hcf) {
            aa.bi = st.oldCf;
        }
        st.shifted = false;
    }
    
    public static void post(final aa aa, final cn cn) {
        if (CostumeX.oldSwing) {
            CostumeX.oldSwing = false;
            drawOldSwing(aa, cn);
            return;
        }
        try {
            final St lookup = lookup(aa);
            if (lookup == null || lookup.ids == null) {
                return;
            }
            if (lookup.shifted) {
                unshift(aa, lookup);
            }
            final long currentTimeMillis = System.currentTimeMillis();
            final short[] ids = lookup.ids;
            final int ai = aa.ai;
            final int eu = aa.eu;
            final int n = (aa.cb == 1) ? 0 : 2;
            int n2 = lookup.horseOn ? (ai + lookup.hdx) : ai;
            int n3 = lookup.horseOn ? (eu - lookup.hdy) : eu;
            int seatFrame = useHcf(aa, lookup) ? lookup.hcf : aa.bi;
            final boolean sit = sit(aa, lookup);
            if (sit) {
                n2 = ai + sitDx(aa);
                n3 = eu + sitDy(aa);
                seatFrame = seatFrame(aa);
            }
            final Eff eff;
            if ((eff = eff(ids[3])) != null) {
                draw(cn, eff, n2, n3, seatFrame + step(eff, currentTimeMillis, 200) * 30, n, true, false);
            }
            Eff eff2 = null;
            if (!sit) {
                eff2 = eff(ids[2]);
            }
            final Eff eff3 = eff2;
            if (eff3 != null) {
                draw(cn, eff3, n2, n3, seatFrame + step(eff3, currentTimeMillis, 200) * 30, n, true, true);
            }
            final Eff eff4;
            if ((eff4 = eff(ids[1])) != null) {
                draw(cn, eff4, n2, n3, seatFrame + step(eff4, currentTimeMillis, 200) * 30, n, true, true);
            }
            final Eff eff5;
            if ((eff5 = eff(ids[0])) != null) {
                draw(cn, eff5, n2, n3, seatFrame + step(eff5, currentTimeMillis, 200) * 30, n, true, true);
            }
            final Eff eff6;
            if ((eff6 = eff(ids[8])) != null) {
                draw(cn, eff6, n2, n3, seatFrame + step(eff6, currentTimeMillis, 200) * 30, n, true, true);
            }
            final Eff eff7;
            if ((eff7 = eff(ids[3])) != null) {
                draw(cn, eff7, n2, n3, seatFrame + step(eff7, currentTimeMillis, 200) * 30, n, false, true);
            }
            final int capeBase = capeBase(seatFrame, aa, sit, lookup);
            final Eff eff8 = eff(ids[4]);
            if (eff8 != null) {
                draw(cn, eff8, n2 + 0 * aa.cb, n3 + 0, capeBase + step(eff8, currentTimeMillis, 330) * 30, n, false, true);
            }
            final Eff eff9;
            if ((eff9 = eff(ids[6])) != null && lookup.horseOn) {
                draw(cn, eff9, ai, eu, lookup.hbw, cb2(aa), false, true);
            }
            final Eff eff10;
            if ((eff10 = eff(ids[5])) != null) {
                draw(cn, eff10, ai, eu - offT(aa), seqFrame(eff10, currentTimeMillis), 0, false, true);
            }
            final Eff eff11;
            if ((eff11 = eff(ids[7])) != null) {
                draw(cn, eff11, ai, eu - offT(aa), seqFrame(eff11, currentTimeMillis), n, false, true);
            }
            final Eff eff12;
            if ((eff12 = eff(-1)) != null) {
                if (sit) {
                    draw(cn, eff12, n2, n3, seatFrame + step(eff12, currentTimeMillis, 200) * 30, n, true, true);
                }
                else {
                    draw(cn, eff12, ai, eu, aa.bi + step(eff12, currentTimeMillis, 200) * 30, n, true, true);
                }
            }
        }
        catch (final Throwable t) {}
    }
    
    static void begin(final aa curChar) {
        CostumeX.hide = false;
        CostumeX.oldSwing = false;
        CostumeX.horseSwap = false;
        warm(curChar);
        final St lookup = lookup(curChar);
        track(curChar, lookup);
        fix(curChar);
        if (horseCos(lookup) && (curChar.dm || curChar.h || curChar.co)) {
            CostumeX.sdm = curChar.dm;
            CostumeX.sh = curChar.h;
            CostumeX.sco = curChar.co;
            curChar.dm = false;
            curChar.h = false;
            curChar.co = false;
            CostumeX.horseSwap = true;
            CostumeX.curChar = curChar;
        }
        if (lookup != null) {
            final short[] ids = lookup.ids;
            if (lookup.ids != null) {
                final short n = ids[0];
                if (n >= 0 && eff(n) != null) {
                    CostumeX.hide = true;
                    return;
                }
                final short n2 = ids[1];
                if (n2 >= 0 && eff(n2) != null) {
                    CostumeX.hide = true;
                    return;
                }
                final short n3 = ids[2];
                if (n3 >= 0 && eff(n3) != null) {
                    CostumeX.hide = true;
                    return;
                }
            }
        }
        if ((curChar.dm || curChar.h) && curChar.at != null) {
            CostumeX.hide = true;
            CostumeX.oldSwing = true;
        }
    }
    
    static void end() {
        CostumeX.hide = false;
        if (CostumeX.horseSwap) {
            CostumeX.horseSwap = false;
            final aa curChar = CostumeX.curChar;
            CostumeX.curChar = null;
            if (curChar != null) {
                curChar.dm = CostumeX.sdm;
                curChar.h = CostumeX.sh;
                curChar.co = CostumeX.sco;
            }
        }
    }
    
    static void fa(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (!CostumeX.hide) {
            fo.a(cn, n, n2, n3, n4, n5);
        }
    }
    
    static int seatFrame(final aa aa) {
        final int seat = NewMount.seat(aa);
        if (seat >= 0) {
            return seat;
        }
        if (aa.at != null) {
            return aa.bi;
        }
        return 0;
    }
    
    static boolean sit(final aa aa, final St st) {
        return !st.horseOn && !horseCos(st) && (aa.dm || NewMount.h(aa));
    }
    
    static int sitDx(final aa aa) {
        if (NewMount.ok(aa)) {
            return NewMount.dx(aa);
        }
        final int cb = aa.cb;
        final int dw = aa.dw;
        return (NewMount.h(aa) ? (((dw == 3) ? -5 : -3) * cb) : ((dw == 3) ? (-5 * cb) : 0)) + (aa.gp + aa.ih) * cb / 2;
    }
    
    static int sitDy(final aa aa) {
        if (NewMount.ok(aa)) {
            return NewMount.dy(aa);
        }
        final int dw = aa.dw;
        final int am = ff.am;
        int n = -10;
        if (NewMount.h(aa)) {
            if (dw == 3) {
                n -= 5;
            }
            else if (dw == 1 || dw == 6) {
                n += ((am % 20 > 12) ? 1 : 0);
            }
            else if (dw == 2 || dw == 10) {
                final int n2 = am % 12;
                n -= ((n2 <= 3) ? 0 : ((n2 <= 6) ? 2 : ((n2 <= 9) ? 4 : 2)));
            }
        }
        else if (dw == 1 || dw == 6) {
            n += ((am % 20 > 12) ? 1 : 0);
        }
        else if (dw == 2 || dw == 10) {
            n += ((am % 6 > 3) ? 1 : 0);
        }
        return n + (aa.gq + aa.hd) / 2;
    }
    
    static void drawOldSwing(final aa aa, final cn cn) {
        try {
            final int[][][] bc = aa.bc;
            final int bi = aa.bi;
            if (bc == null || bi < 0 || bi >= bc.length) {
                return;
            }
            final int n = aa.ai + sitDx(aa);
            final int n2 = aa.eu + sitDy(aa);
            final boolean b = aa.cb == 1;
            oldPart(cn, ee.bg[aa.gb], bc[bi][3], n, n2, b);
            oldPart(cn, ee.bg[aa.bp], bc[bi][0], n, n2, b);
            oldPart(cn, ee.bg[aa.bm], bc[bi][2], n, n2, b);
        }
        catch (final Throwable t) {}
    }
    
    private static void oldPart(final cn cn, final cb cb, final int[] array, final int n, final int n2, final boolean b) {
        if (cb == null || cb.a == null || array == null) {
            return;
        }
        final int n3 = array[0];
        if (n3 < 0 || n3 >= cb.a.length || cb.a[n3] == null) {
            return;
        }
        final bt bt = cb.a[n3];
        final int n4 = n2 - array[2] + bt.c;
        if (b) {
            fo.a(cn, bt.b, n + array[1] + bt.a, n4, 0, 0);
        }
        else {
            fo.a(cn, bt.b, n - array[1] - bt.a, n4, 2, 24);
        }
    }
    
    static boolean useHcf(final aa aa, final St st) {
        final int dw;
        return st.horseOn && aa.at == null && ((dw = aa.dw) == 1 || dw == 2 || dw == 3 || dw == 4 || dw == 6 || dw == 10);
    }
    
    public static void preT(final aa aa, final cn cn) {
        try {
            bhT(aa, cn);
        }
        catch (final Throwable t) {}
        pre(aa, cn);
    }
    
    private static void bhT(final aa aa, final cn cn) {
        final St lookup = lookup(aa);
        if (lookup == null || lookup.ids == null || lookup.ids.length < 10) {
            return;
        }
        final Eff eff = eff(lookup.ids[9]);
        if (eff == null) {
            return;
        }
        if (lookup.shifted) {
            unshift(aa, lookup);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final int n = (aa.cb == 1) ? 0 : 2;
        int ai = aa.ai;
        int eu = aa.eu;
        int n2 = aa.bi;
        if (sit(aa, lookup)) {
            ai = aa.ai + sitDx(aa);
            eu = aa.eu + sitDy(aa);
            n2 = seatFrame(aa);
        }
        draw(cn, eff, ai, eu, n2 + step(eff, currentTimeMillis, 200) * 30, n, true, true);
    }
    
    public static int offT(final aa aa) {
        try {
            final St lookup = lookup(aa);
            if (lookup != null && lookup.horseOn) {
                return lookup.hdy;
            }
            if (!horseCos(lookup) && (aa.dm || NewMount.h(aa))) {
                return 12;
            }
        }
        catch (final Throwable t) {}
        return 0;
    }
    
    static void rst() {
        CostumeX.posted = false;
    }
    
    static void mid(final aa aa, final cn cn) {
        if (CostumeX.posted) {
            return;
        }
        CostumeX.posted = true;
        final St lookup = lookup(aa);
        final boolean b = lookup != null && lookup.shifted;
        final int ai = aa.ai;
        final int eu = aa.eu;
        final int bi = aa.bi;
        post(aa, cn);
        if (b) {
            aa.ai = ai;
            aa.eu = eu;
            aa.bi = bi;
            lookup.shifted = true;
        }
    }
    
    static void fin(final aa aa, final cn cn) {
        final boolean posted = CostumeX.posted;
        CostumeX.posted = false;
        if (!posted) {
            post(aa, cn);
            return;
        }
        final St lookup = lookup(aa);
        if (lookup != null && lookup.shifted) {
            unshift(aa, lookup);
        }
    }
    
    public static int rdAny(final DataInputStream dataInputStream) throws Exception {
        if (dataInputStream.available() >= 3) {
            return dataInputStream.readUnsignedShort();
        }
        return dataInputStream.readUnsignedByte();
    }
    
    public static int rd69(final DataInputStream dataInputStream) throws Exception {
        return rdAny(dataInputStream);
    }
    
    public static int rd68(final DataInputStream dataInputStream) throws Exception {
        return rdAny(dataInputStream);
    }
    
    public static void wrReq(final DataOutputStream dataOutputStream, final int v) throws Exception {
        dataOutputStream.writeShort(v);
    }
    
    public static boolean fitsMob(final DataInputStream dataInputStream, final boolean b) throws Exception {
        dataInputStream.mark(1048576);
        try {
            for (int n = b ? dataInputStream.readUnsignedShort() : dataInputStream.readUnsignedByte(), i = 0; i < n; ++i) {
                dataInputStream.readByte();
                final int unsignedShort = dataInputStream.readUnsignedShort();
                if (dataInputStream.skipBytes(unsignedShort) != unsignedShort) {
                    dataInputStream.reset();
                    return false;
                }
                dataInputStream.readInt();
                dataInputStream.readByte();
                dataInputStream.readByte();
            }
            final boolean b2 = dataInputStream.available() == 0;
            dataInputStream.reset();
            return b2;
        }
        catch (final Throwable t) {
            try {
                dataInputStream.reset();
            }
            catch (final Throwable t2) {}
            return false;
        }
    }
    
    public static int rdCnt(final DataInputStream dataInputStream) throws Exception {
        if (dataInputStream.markSupported()) {
            if (fitsMob(dataInputStream, true)) {
                return dataInputStream.readUnsignedShort();
            }
            if (fitsMob(dataInputStream, false)) {
                return dataInputStream.readUnsignedByte();
            }
        }
        return dataInputStream.readUnsignedByte();
    }
    
    public static void setIt(final em em, ep dummyIt) {
        if (dummyIt == null) {
            try {
                if (CostumeX.dummyIt == null) {
                    CostumeX.dummyIt = new ep((short)0, (byte)0, (byte)0, "", "", (byte)0, (short)0, (short)0, false);
                }
                dummyIt = CostumeX.dummyIt;
            }
            catch (final Throwable t) {}
        }
        em.l = dummyIt;
    }
    
    static int capeBase(final int n, final aa aa, final boolean b, final St st) {
        try {
            final int dw = aa.dw;
            if (dw != 1 && dw != 6 && (b || (st != null && (st.horseOn || horseCos(st))))) {
                return (ff.am % 10 >> 1) + 2;
            }
            return n;
        }
        catch (final Throwable t) {
            return n;
        }
    }
    
    public static boolean hp(final cn cn, final aa aa, final int n, final int n2) {
        fix(aa);
        try {
            final St lookup = lookup(aa);
            if (lookup == null || lookup.ids == null || lookup.ids.length < 7 || lookup.noHorse) {
                return false;
            }
            final Eff eff = eff(lookup.ids[6]);
            if (eff == null || !parseHorse(eff)) {
                return false;
            }
            final byte[] actStand = eff.actStand;
            if (actStand == null || actStand.length == 0) {
                return false;
            }
            final int size = eff.e.b.size();
            int n3 = size / ((eff.e.h != null && eff.e.h.length > 0) ? eff.e.h.length : 1);
            if (n3 <= 0) {
                n3 = 1;
            }
            final int am = ff.am;
            int n4 = actStand[am / 3 % actStand.length] + am / 10 % n3 * 30;
            if (n4 < 0 || n4 >= size) {
                n4 = actStand[0];
            }
            if (n4 < 0 || n4 >= size) {
                n4 = 0;
            }
            draw(cn, eff, n, n2, n4, 2, true, true);
            return true;
        }
        catch (final Throwable t) {
            return false;
        }
    }
    
    static {
        states = new Hashtable();
        statesById = new Hashtable();
        effs = new Hashtable();
        CostumeX.lastPurge = 0L;
        WARM_MOTO = new int[] { 1709, 1710, 1711, 1800, 2063, 2055, 2056, 2057, 2064, 2065, 2066, 2067, 2068, 2069, 2070, 2071 };
        WARM_WOLF = new int[] { 1712, 1713, 1714, 1715, 1716, 1717, 1737, 1738, 2047, 2048, 2049, 2050, 2051, 2052, 2053, 2072, 2073, 2074, 2075, 2076, 2077, 2078, 2079 };
        warmed = new Hashtable();
    }
    
    static int fr(final aa aa) {
        return (aa.g % 15 >= 5) ? 1 : 0;
    }
    
    static Eff ef(final aa aa, final int n) {
        try {
            final St lookup = lookup(aa);
            if (lookup == null || lookup.ids == null || n >= lookup.ids.length) {
                return null;
            }
            final short n2 = lookup.ids[n];
            return (n2 >= 0) ? eff(n2) : null;
        }
        catch (final Throwable t) {
            return null;
        }
    }
    
    static void cd(final cn cn, final aa aa, final int n, final boolean b, final boolean b2, final int n2) {
        try {
            final Eff ef = ef(aa, n);
            if (ef == null) {
                return;
            }
            draw(cn, ef, ee.eq, ee.cf - 24, fr(aa) + step(ef, System.currentTimeMillis(), n2) * 30, 0, b, b2);
        }
        catch (final Throwable t) {}
    }
    
    static void cape(final cn cn, final aa aa, final boolean b, final boolean b2) {
        try {
            final Eff ef = ef(aa, 4);
            if (ef == null) {
                return;
            }
            draw(cn, ef, ee.eq, ee.cf - 24, (b2 ? capeBase(fr(aa), aa, false, lookup(aa)) : fr(aa)) + step(ef, System.currentTimeMillis(), 330) * 30, 0, b, b2);
        }
        catch (final Throwable t) {}
    }
    
    public static void pbx(final cn cn, final aa aa, final int n, final int n2) {
        CostumeX.prof = true;
        NewMount.stepOn = false;
        cd(cn, aa, 3, true, CostumeX.hide = false, 200);
        cape(cn, aa, true, false);
    }
    
    public static void pex(final cn cn, final aa aa, final int n, final int n2) {
        cd(cn, aa, 8, true, true, 200);
        cape(cn, aa, false, true);
        cd(cn, aa, 3, false, true, 200);
        CostumeX.prof = false;
    }
    
    public static void fkc(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (ef(ee.dw, 4) == null) {
            fo.k(cn, n, n2, n3, n4, n5);
        }
    }
    
    public static void fkw(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (ef(ee.dw, 3) == null) {
            fo.k(cn, n, n2, n3, n4, n5);
        }
    }
    
    public static void fkh(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (ef(ee.dw, 0) != null) {
            cd(cn, ee.dw, 0, true, true, 200);
        }
        else {
            fo.k(cn, n, n2, n3, n4, n5);
        }
    }
    
    public static void fkb(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (ef(ee.dw, 1) != null) {
            cd(cn, ee.dw, 1, true, true, 200);
        }
        else {
            fo.k(cn, n, n2, n3, n4, n5);
        }
    }
    
    public static void fkl(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (ef(ee.dw, 2) != null) {
            cd(cn, ee.dw, 2, true, true, 200);
        }
        else {
            fo.k(cn, n, n2, n3, n4, n5);
        }
    }
    
    public static void faw(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (!CostumeX.hide) {
            fo.a(cn, n, n2, n3, n4, n5);
            return;
        }
        try {
            final aa dch = CostumeX.dch;
            if (dch == null || CostumeX.oldSwing) {
                return;
            }
            final St lookup = lookup(dch);
            if (lookup == null || lookup.ids == null) {
                return;
            }
            boolean b = false;
            for (int n6 = 0; n6 < 3 && n6 < lookup.ids.length; ++n6) {
                final short n7 = lookup.ids[n6];
                if (n7 >= 0 && eff(n7) != null) {
                    b = true;
                }
            }
            if (!b) {
                return;
            }
            final short n8 = (short)((lookup.ids.length > 3) ? lookup.ids[3] : -1);
            if (n8 >= 0 && eff(n8) != null) {
                return;
            }
            NewMount.wp(cn, n, n2, n3, n4, n5);
        }
        catch (final Throwable t) {}
    }
    
    public static void fix(final aa aa) {
        try {
            final St lookup = lookup(aa);
            if (lookup == null) {
                return;
            }
            if (CostumeX.nhu == null) {
                CostumeX.nhu = new Hashtable();
            }
            if (NewMount.frames(aa) != null) {
                if (!lookup.noHorse) {
                    lookup.noHorse = true;
                    CostumeX.nhu.put(lookup, lookup);
                }
            }
            else if (CostumeX.nhu.remove(lookup) != null) {
                lookup.noHorse = false;
            }
        }
        catch (final Throwable t) {}
    }
    
    private static final class St
    {
        short[] ids;
        long seen;
        boolean shifted;
        int addX;
        int addY;
        int oldCf;
        int fho;
        int mv;
        long fhoT;
        long mvT;
        int hdx;
        int hdy;
        int hbw;
        int hcf;
        boolean horseOn;
        boolean trk;
        short lastHorse;
        int lastOld;
        boolean prefOld;
        boolean noHorse;
        
        private St() {
            super();
        }
        
        St(final CostumeX$1 object) {
            this();
        }
    }
    
    private static final class Eff
    {
        o e;
        int id;
        boolean parsed;
        int cnt;
        int dxH;
        int dyH;
        byte[] frameChar;
        byte[] actStand;
        byte[] actRun;
        byte[] actJump;
        byte[] actFall;
        byte[] dxChar;
        byte[] dyChar;
        long lastTry;
        boolean ok;
        
        private Eff() {
            super();
        }
        
        Eff(final CostumeX$1 object) {
            this();
        }
    }
}
