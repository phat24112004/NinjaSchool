import java.lang.reflect.*;

public final class NewMount
{
    private static aa cur;
    private static boolean mine;
    private static boolean hideChanged;
    private static boolean hideSaved;
    private static int nr;
    public static boolean stepOn;
    private static Field effE;
    public static boolean wDone;
    static int lst;
    
    public NewMount() {
        super();
    }
    
    private static int coatIdx(final aa aa, final int n) {
        final int dw = aa.dw;
        int n2 = 10;
        if (dw == 2 || dw == 10) {
            n2 = 2;
        }
        else if (dw == 3 || dw == 4) {
            n2 = 3;
        }
        final int n3 = ff.am / n2 % n;
        return (n3 < 0) ? 0 : n3;
    }
    
    private static boolean isOldId(final int n) {
        return n == 443 || n == 523 || n == 485 || n == 524;
    }
    
    public static boolean has(final aa aa) {
        if (CostumeX.prof) {
            return false;
        }
        try {
            final el[] fw = aa.fw;
            if (fw == null || fw.length < 5) {
                return false;
            }
            final el el = fw[4];
            return el != null && el.j != null && !isOldId(el.j.d);
        }
        catch (final Throwable t) {
            return false;
        }
    }
    
    public static boolean isNew(final aa aa) {
        return has(aa) && !aa.dm;
    }
    
    public static boolean h(final aa aa) {
        return !CostumeX.prof && (aa.h || isNew(aa));
    }
    
    public static int[][] frames(final aa aa) {
        try {
            return CharPartInfo.tFrames.get(new Integer(aa.fw[4].j.d));
        }
        catch (final Throwable t) {
            return null;
        }
    }
    
    public static boolean block(final int n) {
        final aa cur = NewMount.cur;
        if (cur == null || NewMount.mine) {
            return false;
        }
        try {
            final int[] t = cur.t();
            return t != null && cur.bd >= 0 && cur.bd < t.length && t[cur.bd] == n;
        }
        catch (final Throwable t2) {
            return false;
        }
    }
    
    public static void begin(final aa aa) {
        CostumeX.prof = false;
        NewMount.stepOn = false;
        NewMount.cur = null;
        NewMount.hideChanged = false;
    }
    
    public static void end(final aa aa) {
        if (NewMount.hideChanged) {
            CostumeX.hide = NewMount.hideSaved;
            NewMount.hideChanged = false;
        }
        NewMount.cur = null;
    }
    
    private static void spr(final cn cn, final int n, final int n2, final int n3, final int n4, final int n5) {
        NewMount.mine = true;
        try {
            fo.a(cn, n, n2, n3, n4, n5);
        }
        finally {
            NewMount.mine = false;
        }
    }
    
    public static void draw(final aa cur, final cn cn) {
        pw(cur, cn);
        try {
            if (!has(cur) || CostumeX.horseSwap) {
                return;
            }
            final int[][] frames = frames(cur);
            if (frames == null || frames.length < 6) {
                return;
            }
            final int am = ff.am;
            final int dw = cur.dw;
            int n = 0;
            int n2 = 0;
            NewMount.nr = NewMount.lst;
            int n3 = 0;
            if (cur.dm) {
                n3 = 0;
            }
            final int n4 = n3;
            if (cur.dm) {
                n = 5;
                n2 = am % frames[5].length;
            }
            else if (dw == 1 || dw == 6) {
                n = 0;
                n2 = (NewMount.nr = ((am % 20 > 12) ? 1 : 0));
                NewMount.lst = NewMount.nr;
            }
            else if (dw == 2 || dw == 10) {
                n = 1;
                final int length = frames[1].length;
                n2 = am % length;
                NewMount.nr = ((n2 < length / 3) ? 0 : ((n2 < length / 3 * 2) ? 1 : 2));
                NewMount.lst = NewMount.nr;
            }
            else if (dw == 3) {
                n = 2;
                n2 = np(frames, 2);
            }
            else if (dw == 4) {
                n = 3;
                n2 = np(frames, 3);
            }
            else if (dw == 14) {
                n = 4;
                n2 = np(frames, 4);
            }
            if (frames[n] == null || frames[n].length == 0) {
                return;
            }
            if (n2 >= frames[n].length) {
                n2 = 0;
            }
            final int cb;
            final int n5 = ((cb = cur.cb) == 1) ? 0 : 2;
            final int n6 = (cb == 1) ? 0 : 24;
            final int ai = cur.ai;
            final int eu = cur.eu;
            if (n4 == 0) {
                spr(cn, frames[n][n2], ai, eu, n5, 33);
                return;
            }
            NewMount.cur = cur;
            final boolean hide = CostumeX.hide;
            if (!hide) {
                NewMount.hideSaved = CostumeX.hide;
                CostumeX.hide = true;
                NewMount.hideChanged = true;
            }
            final int[][][] bc = aa.bc;
            final int bi = cur.bi;
            final cb cb2 = ee.bg[cur.gb];
            cb cb3 = ee.bg[cur.bp];
            if (cur.dl != null && cur.dl.length > 11 && cur.dl[11] != null && cur.dl[11].j != null) {
                cb3 = ee.bg[cur.dl[11].j.g];
            }
            if (cur.at != null) {}
            if (!hide) {
                if (cb2 != null && cb2.a != null) {
                    final bt bt = cb2.a[bc[bi][3][0]];
                    spr(cn, bt.b, ai + (bc[bi][3][1] + bt.a) * cb, eu - bc[bi][3][2] + bt.c - 10 + NewMount.nr, n5, n6);
                }
                final int be = cur.be();
                final int as = cur.as();
                final int a = fo.a(cur.au());
                final int[] t = cur.t();
                if (t != null && t.length > 0) {
                    spr(cn, t[coatIdx(cur, t.length)], ai + (cur.ih - 7) * cb, eu - a - 19 + cur.hd + NewMount.nr, n5, 17);
                }
                spr(cn, frames[n][n2], ai, eu, n5, 33);
                spr(cn, be, ai + cur.ih * cb, eu - a - 9 + cur.hd + NewMount.nr, n5, 33);
                spr(cn, as, ai + cur.gp * cb, eu - bc[0][0][2] + cb3.a[bc[0][0][0]].c - 12 + cur.gq + NewMount.nr, n5, 17);
            }
            else {
                spr(cn, frames[n][n2], ai, eu, n5, 33);
            }
        }
        catch (final Throwable t2) {}
    }
    
    static int nrOf0(final aa aa) {
        try {
            final int dw = aa.dw;
            final int am = ff.am;
            if (dw == 1 || dw == 6) {
                return (am % 20 > 12) ? 1 : 0;
            }
            if (dw == 2 || dw == 10) {
                final int[][] frames = frames(aa);
                if (frames == null || frames.length < 2 || frames[1] == null || frames[1].length == 0) {
                    return 0;
                }
                final int length = frames[1].length;
                final int n = am % length;
                return (n < length / 3) ? 0 : ((n < length / 3 * 2) ? 1 : 2);
            }
        }
        catch (final Throwable t) {}
        return 0;
    }
    
    static int kind(final aa aa) {
        try {
            if (isNew(aa)) {
                return 1;
            }
            final el[] fw = aa.fw;
            if (fw == null || fw.length < 5 || fw[4] == null || fw[4].j == null) {
                return 0;
            }
            final short d = fw[4].j.d;
            if ((d == 443 || d == 523) && aa.h) {
                return 2;
            }
            if ((d == 485 || d == 524) && (aa.co || aa.dm)) {
                return (d == 485) ? 3 : 4;
            }
        }
        catch (final Throwable t) {}
        return 0;
    }
    
    public static boolean ok(final aa aa) {
        return kind(aa) != 0;
    }
    
    public static int dx(final aa aa) {
        switch (kind(aa)) {
            case 2: {
                return -5 * aa.cb;
            }
            case 3: {
                return -4 * aa.cb;
            }
            case 4: {
                return -7 * aa.cb;
            }
            default: {
                return 2 * aa.cb;
            }
        }
    }
    
    public static int dy0(final aa aa) {
        final int dw = aa.dw;
        final boolean b = (dw == 1 || dw == 6) && aa.bi >= 0 && aa.bi <= 1;
        switch (kind(aa)) {
            case 2: {
                return -15 + (b ? (2 * aa.bi) : 0);
            }
            case 3: {
                return -12 + (b ? (2 * aa.bi) : 0);
            }
            case 4: {
                return -14 + (b ? (2 * aa.bi) : 0);
            }
            default: {
                return -18 - 2 * ((dw == 3) ? 4 : 2) + nrOf(aa) + (b ? aa.bi : 0);
            }
        }
    }
    
    public static int step(final Object obj) {
        int n = 1;
        try {
            if (NewMount.effE == null) {
                (NewMount.effE = obj.getClass().getDeclaredField("e")).setAccessible(true);
            }
            n = ((o)NewMount.effE.get(obj)).b.size() / 30;
        }
        catch (final Throwable t) {}
        if (n <= 0) {
            n = 1;
        }
        return ff.am / 6 % n;
    }
    
    public static int seat0(final aa aa) {
        NewMount.stepOn = false;
        try {
            if (aa.at != null) {
                return -1;
            }
            if (kind(aa) == 0) {
                return -1;
            }
            NewMount.stepOn = true;
            final int dw = aa.dw;
            if (dw != 1 && dw != 6) {
                return 5;
            }
            return (aa.bi >= 0 && aa.bi <= 1) ? aa.bi : 0;
        }
        catch (final Throwable t) {
            return -1;
        }
    }
    
    public static void av(final cn cn, final int n, int n2, int n3, final int n4, final int n5) {
        final aa cur = NewMount.cur;
        if (cur != null && !CostumeX.horseSwap) {
            n2 += 3 * cur.cb;
            n3 += -12 + NewMount.nr;
        }
        fo.a(cn, n, n2, n3, n4, n5);
    }
    
    public static boolean icon(final cn cn, final aa aa, final int n, final int n2) {
        try {
            if (aa == null || !has(aa)) {
                return false;
            }
            final int[][] frames = frames(aa);
            if (frames == null || frames.length < 1 || frames[0] == null || frames[0].length < 2) {
                return false;
            }
            spr(cn, frames[0][ff.am % 20 <= 15], n, n2, 0, 3);
            return true;
        }
        catch (final Throwable t) {
            return false;
        }
    }
    
    public static void pw(final aa aa, final cn cn) {
        NewMount.wDone = false;
        try {
            if (!CostumeX.hide || CostumeX.horseSwap || CostumeX.oldSwing) {
                return;
            }
            if (!isNew(aa) || frames(aa) == null) {
                return;
            }
            final Method declaredMethod = CostumeX.class.getDeclaredMethod("lookup", aa.class);
            declaredMethod.setAccessible(true);
            final Object invoke = declaredMethod.invoke(null, aa);
            if (invoke == null) {
                return;
            }
            final Field declaredField = invoke.getClass().getDeclaredField("ids");
            declaredField.setAccessible(true);
            final short[] array = (short[])declaredField.get(invoke);
            if (array == null) {
                return;
            }
            final Method declaredMethod2 = CostumeX.class.getDeclaredMethod("eff", Integer.TYPE);
            declaredMethod2.setAccessible(true);
            boolean b = false;
            for (int n = 0; n < 3 && n < array.length; ++n) {
                if (array[n] >= 0) {
                    if (declaredMethod2.invoke(null, new Integer(array[n])) != null) {
                        b = true;
                    }
                }
            }
            if (!b) {
                return;
            }
            if (array.length > 3 && array[3] >= 0 && declaredMethod2.invoke(null, new Integer(array[3])) != null) {
                return;
            }
            final cb cb = ee.bg[aa.gb];
            if (cb == null || cb.a == null) {
                return;
            }
            final int[][][] bc = aa.bc;
            final int bi = aa.bi;
            final int cb2 = aa.cb;
            final bt bt = cb.a[bc[bi][3][0]];
            fo.a(cn, bt.b, aa.ai + (bc[bi][3][1] + bt.a) * cb2, aa.eu - bc[bi][3][2] + bt.c - 10 + nrOf(aa), (cb2 == 1) ? 0 : 2, (cb2 == 1) ? 0 : 24);
            NewMount.wDone = true;
        }
        catch (final Throwable t) {}
    }
    
    public static void wp(final cn cn, final int n, final int n2, int n3, final int n4, final int n5) {
        if (NewMount.wDone) {
            return;
        }
        try {
            final aa dch = CostumeX.dch;
            if (dch != null && !CostumeX.oldSwing && isNew(dch)) {
                n3 += -2 + nrOf(dch);
            }
        }
        catch (final Throwable t) {}
        fo.a(cn, n, n2, n3, n4, n5);
    }
    
    static int np(final int[][] array, final int n) {
        try {
            final int length = array[n].length;
            return (length > 0) ? (ff.am % length) : 0;
        }
        catch (final Throwable t) {
            return 0;
        }
    }
    
    static int fr(final int n) {
        return n % 10 / 2 + 2;
    }
    
    static int pp(final int n, final aa aa) {
        try {
            final CostumeX.St lookup = CostumeX.lookup(aa);
            if (lookup != null && lookup.ids != null && lookup.ids.length > 4 && lookup.ids[4] >= 0 && CostumeX.eff(lookup.ids[4]) != null) {
                return aa.bi;
            }
        }
        catch (final Throwable t) {}
        return n;
    }
    
    static int nrOf(final aa aa) {
        final int dw = aa.dw;
        if (aa.dm || dw == 3 || dw == 4 || dw == 14) {
            return NewMount.lst;
        }
        final int nrOf0 = nrOf0(aa);
        if (dw == 1 || dw == 6 || dw == 2 || dw == 10) {
            NewMount.lst = nrOf0;
        }
        return nrOf0;
    }
    
    static int sy() {
        return (ff.am % 20 > 12) ? 1 : 0;
    }
    
    static int dy(final aa aa) {
        int dy0 = dy0(aa);
        final int dw = aa.dw;
        if (dw == 2 || dw == 10) {
            final int kind = kind(aa);
            final int am = ff.am;
            if (kind == 2) {
                final int n = am % 12;
                dy0 -= ((n <= 3) ? 0 : ((n <= 6) ? 2 : ((n <= 9) ? 4 : 2)));
            }
            else if (kind == 3 || kind == 4) {
                dy0 += ((am % 6 > 3) ? 1 : 0);
            }
        }
        else if ((dw == 1 || dw == 6) && aa.bi >= 0 && aa.bi <= 1 && kind(aa) >= 2) {
            dy0 += 2 * (sy() - aa.bi);
        }
        return dy0;
    }
    
    static int seat(final aa aa) {
        int n = seat0(aa);
        final int dw = aa.dw;
        if (n >= 0 && n <= 1 && (dw == 1 || dw == 6) && kind(aa) >= 2) {
            n = sy();
        }
        return n;
    }
}
