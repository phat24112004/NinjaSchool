import javax.microedition.lcdui.*;
import java.io.*;

public final class fr
{
    private static boolean[] aj;
    private static Image ak;
    public static int a;
    public static bw b;
    public static Image c;
    public static int d;
    public static short e;
    public static int f;
    public static byte g;
    public static int h;
    public static int i;
    private static int al;
    public static int j;
    private static int am;
    public static int k;
    public static int l;
    private static int[] an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int ar;
    public static int[] m;
    public static int n;
    public static int o;
    private static int as;
    private static Image[] at;
    public static boolean p;
    private static int[] au;
    public static char[] q;
    private static Image av;
    public static int r;
    private static Image aw;
    public static short s;
    public static byte t;
    public static String u;
    public static boolean v;
    private static final int[] ax;
    public static int w;
    public static bw x;
    private static Object ay;
    private static Image az;
    private static Image ba;
    public static int y;
    private static int bb;
    private static int bc;
    public static byte z;
    public static String aa;
    public static int ab;
    public static int ac;
    public static fa ad;
    private static final int[] bd;
    public static int ae;
    private static int be;
    public static byte af;
    private static int bf;
    private static Image[] bg;
    public static int ag;
    public static String[] ah;
    public static short[][] ai;
    private static short[] bh;
    private static Image bi;
    private static Image bj;
    private static byte[][] bk;
    
    private static boolean o(final int n) {
        return n >= 0;
    }
    
    public static final void a(final cn cn) {
        if (ek.xdh) {
            int bp = ee.bp;
            while (r(o(bp, ee.bs) ? 1 : 0)) {
                for (int bh = ee.bh; r(o(bh, ee.ak) ? 1 : 0); ++bh) {
                    final int i = i(bp, bh);
                    if (i != 0) {
                        if ((i & 0xE) != 0x0) {
                            final Graphics b = cn.b;
                            final int n = ff.am / 15 % 11;
                            b.setColor((n != 0) ? ((n != 1) ? ((n != 2) ? ((n != 3) ? ((n != 4) ? ((n != 5) ? ((n != 6) ? ((n != 7) ? ((n != 8) ? ((n != 9) ? 16777215 : 16756655) : 8388736) : 16711935) : 255) : 65535) : 65280) : 8454016) : 16776960) : 16753920) : 16711680);
                            if ((i & 0x2) != 0x0) {
                                cn.b.fillRect(bp * fr.af, bh * fr.af, (int)fr.af, 2);
                            }
                            if ((i & 0xC) != 0x0) {
                                if ((i(bp - 1, bh) & 0xC) == 0x0) {
                                    cn.b.fillRect(bp * fr.af, bh * fr.af, 2, (int)fr.af);
                                }
                                if ((i(bp + 1, bh) & 0xC) == 0x0) {
                                    cn.b.fillRect(bp * fr.af + fr.af - 2, bh * fr.af, 2, (int)fr.af);
                                }
                            }
                        }
                        if ((i & 0x2E) == 0x0 && (i & 0x40) != 0x0 && (bh == 0 || (i(bp, bh - 1) & 0x40) == 0x0)) {
                            cn.b.setColor(255);
                            cn.b.fillRect(bp * fr.af, bh * fr.af + 11, (int)fr.af, 2);
                        }
                    }
                }
                ++bp;
                if (b((Object)null)) {
                    break;
                }
            }
        }
        else {
            int bp2 = ee.bp;
            while (r(o(bp2, ee.bs) ? 1 : 0)) {
                int bh2 = ee.bh;
                while (r(o(bh2, ee.ak) ? 1 : 0)) {
                    int n2 = fr.q[bh2 * fr.y + bp2] - '\u0001';
                    Label_2952: {
                        if (r(q(i(bp2, bh2) & 0x100, 256) ? 1 : 0)) {
                            if (r(j(fr.l, 4) ? 1 : 0) && r(j(i(bp2, bh2) & 0x40, 64) ? 1 : 0)) {
                                if (r(j(n2 = fr.q[(bh2 - 1) * fr.y + bp2] - '\u0001', 15) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, 17 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (s(" ".length(), "   ".length())) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (r(j(n2, 5) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, 7 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (s(-" ".length(), (fr.ax[89] ^ fr.ax[90]) & (fr.ax[4] ^ fr.ax[91] ^ fr.ax[13]))) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (!r(q(n2, 18) ? 1 : 0) || !r(q(n2, 22) ? 1 : 0) || r(j(n2, 15) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, 17 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (b((Object)null)) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (!r(q(n2, 44) ? 1 : 0) || !r(q(n2, 52) ? 1 : 0) || r(j(n2, 51) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, 56 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (u("   ".length())) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else {
                                    if (!r(q(n2, 24) ? 1 : 0) || !r(q(n2, 23) ? 1 : 0) || !r(q(n2, 20) ? 1 : 0) || !r(q(n2, 21) ? 1 : 0) || !r(q(n2, 19) ? 1 : 0) || !r(q(n2, 12) ? 1 : 0) || !r(q(n2, 13) ? 1 : 0)) {
                                        break Label_2952;
                                    }
                                    if (r(q(n2, -1) ? 1 : 0)) {
                                        cn.a(fr.bj, 0, n2 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (u(fr.ax[66] + fr.ax[86] - fr.ax[79] + fr.ax[40] ^ fr.ax[96] + fr.ax[37] - fr.ax[97] + fr.ax[98])) {
                                            return;
                                        }
                                    }
                                    else if (!r(q(n2, -1) ? 1 : 0)) {
                                        break Label_2952;
                                    }
                                }
                            }
                            if (r(j(fr.l, 1) ? 1 : 0)) {
                                if (r(j(i(bp2, bh2) & 0x20, 32) ? 1 : 0)) {
                                    cn.a(fr.ak, 0, 24 * (ff.am % 4), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (t("   ".length())) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (!r(q(i(bp2, bh2) & 0x40, 64) ? 1 : 0) || r(j(i(bp2, bh2) & 0x800, 2048) ? 1 : 0)) {
                                    if (r(j(i(bp2, bh2 - 1) & 0x20, 32) ? 1 : 0)) {
                                        cn.a(fr.ak, 0, 24 * (ff.am % 4), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (g("   ".length(), fr.ax[99] ^ fr.ax[100])) {
                                            return;
                                        }
                                        break Label_2952;
                                    }
                                    else if (r(j(i(bp2, bh2 - 1) & 0x1000, 4096) ? 1 : 0)) {
                                        cn.a(fr.bj, 0, 504, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (u(fr.ax[28] + fr.ax[103] - fr.ax[104] + fr.ax[56] ^ fr.ax[105] + fr.ax[46] - fr.ax[106] + fr.ax[0])) {
                                            return;
                                        }
                                        break Label_2952;
                                    }
                                }
                            }
                            if (r(j(fr.l, 2) ? 1 : 0)) {
                                if (r(j(i(bp2, bh2) & 0x20, 32) ? 1 : 0)) {
                                    cn.a(fr.ak, 0, 24 * (ff.am % 8 >> 1), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (h(" ".length(), " ".length())) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (r(j(n2, 17) ? 1 : 0)) {
                                    cn.a(fr.bi, 0, 24 * (ff.am % 8 >> 1), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (b((Object)null)) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (r(j(n2, 133) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, 132 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (o(-(fr.ax[95] + fr.ax[61] - fr.ax[108] + fr.ax[109] ^ fr.ax[43] + fr.ax[110] - fr.ax[111] + fr.ax[30]))) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (!r(q(i(bp2, bh2) & 0x40, 64) ? 1 : 0) || r(j(i(bp2, bh2) & 0x800, 2048) ? 1 : 0)) {
                                    if (r(j(i(bp2, bh2 - 1) & 0x20, 32) ? 1 : 0)) {
                                        cn.a(fr.ak, 0, 24 * (ff.am % 4), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (b((Object)null)) {
                                            return;
                                        }
                                        break Label_2952;
                                    }
                                    else if (r(j(i(bp2, bh2 - 1) & 0x1000, 4096) ? 1 : 0)) {
                                        final int p;
                                        int p2;
                                        if (r(j(p = p(bp2, bh2 - 1), 55) ? 1 : 0)) {
                                            p2 = 54;
                                            "".length();
                                            "".length();
                                            if (g("  ".length(), (fr.ax[59] ^ fr.ax[113]) & (fr.ax[114] ^ fr.ax[5] ^ fr.ax[13]))) {
                                                return;
                                            }
                                        }
                                        else if (r(q(p, 19) ? 1 : 0) && r(q(p, 35) ? 1 : 0)) {
                                            if (r(o(p, 40) ? 1 : 0)) {
                                                p2 = 21;
                                                "".length();
                                                "".length();
                                                if (b((Object)null)) {
                                                    return;
                                                }
                                            }
                                            else {
                                                p2 = 110;
                                                "".length();
                                                "".length();
                                                if (s(-" ".length(), "  ".length())) {
                                                    return;
                                                }
                                            }
                                        }
                                        else if (r(j(p2 = p(bp2, bh2 - 2), 55) ? 1 : 0)) {
                                            p2 = 54;
                                            "".length();
                                            "".length();
                                            if (w(" ".length())) {
                                                return;
                                            }
                                        }
                                        else if (r(o(p2, 40) ? 1 : 0)) {
                                            p2 = 21;
                                        }
                                        cn.a(fr.bj, 0, p2 * 24, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (t(fr.ax[116] ^ fr.ax[117])) {
                                            return;
                                        }
                                        break Label_2952;
                                    }
                                }
                            }
                            if (r(j(fr.l, 3) ? 1 : 0)) {
                                if (r(j(i(bp2, bh2) & 0x20, 32) ? 1 : 0)) {
                                    cn.a(fr.ak, 0, 24 * (ff.am % 8 >> 1), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (r((fr.ax[118] + fr.ax[119] - fr.ax[120] + fr.ax[61] ^ fr.ax[121] + fr.ax[3] - fr.ax[34] + fr.ax[100]) & (fr.ax[21] ^ fr.ax[122] ^ (fr.ax[81] ^ fr.ax[123]) ^ -" ".length()))) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (r(j(n2, 23) ? 1 : 0)) {
                                    cn.a(fr.bi, 0, 24 * (ff.am % 8 >> 1), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    "".length();
                                    "".length();
                                    if (y(-"  ".length())) {
                                        return;
                                    }
                                    break Label_2952;
                                }
                                else if (!r(q(i(bp2, bh2) & 0x40, 64) ? 1 : 0) || r(j(i(bp2, bh2) & 0x800, 2048) ? 1 : 0)) {
                                    if (r(j(i(bp2, bh2 - 1) & 0x20, 32) ? 1 : 0)) {
                                        cn.a(fr.ak, 0, 24 * (ff.am % 4), 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (h((fr.ax[124] ^ fr.ax[125]) & (fr.ax[18] ^ fr.ax[107] ^ fr.ax[13]), "  ".length())) {
                                            return;
                                        }
                                        break Label_2952;
                                    }
                                    else if (r(j(i(bp2, bh2 - 1) & 0x1000, 4096) ? 1 : 0)) {
                                        int n3;
                                        if (r(j(n3 = p(bp2, bh2 - 1), 25) ? 1 : 0)) {
                                            n3 = p(bp2, bh2 - 2);
                                        }
                                        if (r(j(n3, 45) ? 1 : 0)) {
                                            n3 = 44;
                                        }
                                        --n3;
                                        cn.a(fr.bj, 0, n3 * 24, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                        "".length();
                                        "".length();
                                        if (b((Object)null)) {
                                            return;
                                        }
                                        break Label_2952;
                                    }
                                }
                            }
                            if (r(j(i(bp2, bh2) & 0x10, 16) ? 1 : 0)) {
                                fr.bb = bp2 * fr.af - ee.bj - ee.eq;
                                fr.ar = (fr.af - 2) * fr.bb / fr.af + ee.eq;
                                cn.a(fr.bj, 0, n2 * fr.af, 24, 24, 0, fr.ar + ee.bj, bh2 * fr.af, 0);
                                "".length();
                                "".length();
                                if (m(fr.ax[105] + fr.ax[63] - fr.ax[127] + fr.ax[11] ^ fr.ax[10] + fr.ax[128] - fr.ax[129] + fr.ax[86], fr.ax[130] ^ fr.ax[131] ^ (fr.ax[132] ^ fr.ax[64]))) {
                                    return;
                                }
                            }
                            else if (r(j(i(bp2, bh2) & 0x200, 512) ? 1 : 0)) {
                                if (r(q(n2, -1) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, n2 * fr.af, 24, 1, 0, bp2 * fr.af, bh2 * fr.af, 0);
                                    cn.a(fr.bj, 0, n2 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af + 1, 0);
                                    "".length();
                                    "".length();
                                    if (s("  ".length(), "   ".length())) {
                                        return;
                                    }
                                }
                            }
                            else if (r(q(n2, -1) ? 1 : 0)) {
                                cn.a(fr.bj, 0, n2 * fr.af, 24, 24, 0, bp2 * fr.af, bh2 * fr.af, 0);
                            }
                        }
                    }
                    ++bh2;
                    "".length();
                    "".length();
                    if (r("  ".length() & ("  ".length() ^ fr.ax[13]))) {
                        return;
                    }
                }
                ++bp2;
                "".length();
                "".length();
                if (b((Object)null)) {
                    return;
                }
            }
        }
    }
    
    public static boolean a(final int n) {
        return r(n(n, 134) ? 1 : 0) && r(f(n, 138) ? 1 : 0);
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (k(n, n2)) {
            n3 = fr.ax[0];
            "".length();
            if (-" ".length() > ((30 + 130 - 131 + 143 ^ 65 + 115 - 124 + 100) & (30 + 142 - 68 + 67 ^ 154 + 19 - 145 + 127 ^ -" ".length()))) {
                return ((133 + 76 - 79 + 13 ^ 37 + 6 + 28 + 118) & (5 + 164 - 62 + 58 ^ 32 + 128 - 18 + 9 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fr.ax[1];
        }
        return n3 != 0;
    }
    
    public static boolean b(final int n) {
        return !r(q(n, 91) ? 1 : 0) || !r(q(n, 92) ? 1 : 0) || !r(q(n, 93) ? 1 : 0) || !r(q(n, 94) ? 1 : 0) || !r(q(n, 95) ? 1 : 0) || !r(q(n, 96) ? 1 : 0) || !r(q(n, 97) ? 1 : 0) || !r(q(n, 105) ? 1 : 0) || !r(q(n, 106) ? 1 : 0) || !r(q(n, 107) ? 1 : 0) || !r(q(n, 108) ? 1 : 0) || !r(q(n, 109) ? 1 : 0) || !r(q(n, 114) ? 1 : 0) || !r(q(n, 115) ? 1 : 0) || !r(q(n, 116) ? 1 : 0) || !r(q(n, 125) ? 1 : 0) || !r(q(n, 126) ? 1 : 0) || !r(q(n, 127) ? 1 : 0) || !r(q(n, 128) ? 1 : 0) || !r(q(n, 157) ? 1 : 0) || !r(q(n, 158) ? 1 : 0) || r(j(n, 159) ? 1 : 0);
    }
    
    public static void a() {
        fr.bj = null;
        System.gc();
        fr.bj = fr.at[fr.l];
        fr.az = fr.bg[fr.l];
    }
    
    public static boolean c(final int n) {
        final short s = fr.s;
        fr.ac = n;
        fa fa = null;
        Label_5382: {
            if (r(s(s) ? 1 : 0) && r(o(s, fr.ai.length) ? 1 : 0) && r(s(n) ? 1 : 0) && r(o(n, fr.ai.length) ? 1 : 0) && r(q(fr.ai[s].length) ? 1 : 0)) {
                final fq m = aa.m(0);
                int n2 = 0;
                while (r(o(n2, fr.aj.length) ? 1 : 0)) {
                    fr.aj[n2] = true;
                    fr.an[n2] = -1;
                    fr.bh[n2] = -1;
                    ++n2;
                    "".length();
                    "".length();
                    if (g("  ".length(), " ".length())) {
                        return ((fr.ax[166] + fr.ax[5] - fr.ax[146] + fr.ax[101] ^ fr.ax[42] + fr.ax[19] - fr.ax[211] + fr.ax[66]) & (fr.ax[212] ^ fr.ax[62] ^ (fr.ax[213] ^ fr.ax[100]) ^ -" ".length())) != 0x0;
                    }
                }
                fr.an[s] = 0;
                while (!r(p(fr.aj[n] ? 1 : 0) ? 1 : 0)) {
                    int n3 = -1;
                    short n4 = -1;
                    int n5 = 0;
                    while (r(o(n5, fr.ai.length) ? 1 : 0)) {
                        if (r(x(fr.aj[n5] ? 1 : 0) ? 1 : 0) && r(q(fr.an[n5], -1) ? 1 : 0) && (!r(n(fr.an[n5], n3) ? 1 : 0) || r(j(n3, -1) ? 1 : 0))) {
                            n3 = fr.an[n5];
                            n4 = (short)n5;
                        }
                        ++n5;
                        "".length();
                        "".length();
                        if (w("  ".length())) {
                            return ((fr.ax[36] + fr.ax[135] - fr.ax[97] + fr.ax[83] ^ fr.ax[159] + fr.ax[125] - fr.ax[182] + fr.ax[16]) & (fr.ax[112] ^ fr.ax[177] ^ (fr.ax[11] ^ fr.ax[64]) ^ -" ".length())) != 0x0;
                        }
                    }
                    if (r(j(n4, -1) ? 1 : 0)) {
                        fa = null;
                        "".length();
                        "".length();
                        if (r((fr.ax[5] + fr.ax[186] - fr.ax[13] + fr.ax[4] ^ fr.ax[102] + fr.ax[72] - fr.ax[216] + fr.ax[158]) & (fr.ax[88] ^ fr.ax[114] ^ (fr.ax[10] ^ fr.ax[79]) ^ -" ".length()))) {
                            return ((fr.ax[73] + fr.ax[169] - fr.ax[15] + fr.ax[125] ^ fr.ax[136] + fr.ax[165] - fr.ax[44] + fr.ax[182]) & (fr.ax[17] ^ fr.ax[74] ^ (fr.ax[176] ^ fr.ax[50]) ^ -" ".length())) != 0x0;
                        }
                        break Label_5382;
                    }
                    else {
                        fr.aj[n4] = false;
                        final int g = g(n4) ? 1 : 0;
                        final short[] array = fr.ai[n4];
                        int n6 = 0;
                        while (r(o(n6, array.length) ? 1 : 0)) {
                            final short n7 = array[n6];
                            if (r(x(fr.aj[n7] ? 1 : 0) ? 1 : 0)) {
                                int n8 = 0;
                                Label_4586: {
                                    if (r(x(aa.z().es ? 1 : 0) ? 1 : 0)) {
                                        final int aj = aa.z().aj;
                                        if ((!r(q(n7, 1) ? 1 : 0) || !r(q(n7, 27) ? 1 : 0) || r(j(n7, 72) ? 1 : 0)) && r(o(aj, 6) ? 1 : 0)) {
                                            n8 = 0;
                                            "".length();
                                            "".length();
                                            if (r((fr.ax[121] ^ fr.ax[177]) & (fr.ax[145] ^ fr.ax[148] ^ fr.ax[13]))) {
                                                return ((fr.ax[217] ^ fr.ax[100]) & (fr.ax[180] ^ fr.ax[153] ^ fr.ax[13])) != 0x0;
                                            }
                                            break Label_4586;
                                        }
                                        else if ((!r(q(n7, 10) ? 1 : 0) || !r(q(n7, 32) ? 1 : 0) || r(j(n7, 48) ? 1 : 0)) && r(o(aj, 17) ? 1 : 0)) {
                                            n8 = 0;
                                            "".length();
                                            "".length();
                                            if (g(" ".length(), (fr.ax[225] ^ fr.ax[194] ^ (fr.ax[154] ^ fr.ax[8])) & (fr.ax[9] ^ fr.ax[86] ^ (fr.ax[64] ^ fr.ax[151]) ^ -" ".length()))) {
                                                return ((fr.ax[189] ^ fr.ax[133] ^ (fr.ax[131] ^ fr.ax[72])) & (fr.ax[41] + fr.ax[51] - fr.ax[47] + fr.ax[94] ^ fr.ax[66] + fr.ax[117] - fr.ax[66] + fr.ax[39] ^ -" ".length())) != 0x0;
                                            }
                                            break Label_4586;
                                        }
                                        else if (r(j(n7, 38) ? 1 : 0) && r(o(aj, 28) ? 1 : 0)) {
                                            n8 = 0;
                                            "".length();
                                            "".length();
                                            if (w(fr.ax[226] ^ fr.ax[102] ^ (fr.ax[206] ^ fr.ax[131]))) {
                                                return ((fr.ax[93] + fr.ax[121] - fr.ax[149] + fr.ax[33] ^ fr.ax[153] + fr.ax[132] - fr.ax[14] + fr.ax[82]) & (fr.ax[11] + fr.ax[17] - fr.ax[130] + fr.ax[87] ^ fr.ax[16] + fr.ax[166] - fr.ax[143] + fr.ax[83] ^ -" ".length())) != 0x0;
                                            }
                                            break Label_4586;
                                        }
                                        else if (r(j(n7, 43) ? 1 : 0) && r(o(aj, 33) ? 1 : 0)) {
                                            n8 = 0;
                                            "".length();
                                            "".length();
                                            if (u("  ".length())) {
                                                return ((fr.ax[86] ^ fr.ax[60] ^ (fr.ax[7] ^ fr.ax[88])) & (fr.ax[227] ^ fr.ax[54] ^ (fr.ax[36] ^ fr.ax[120]) ^ -" ".length())) != 0x0;
                                            }
                                            break Label_4586;
                                        }
                                        else if (r(j(n7, 17) ? 1 : 0) && r(o(aj, 38) ? 1 : 0)) {
                                            n8 = 0;
                                            "".length();
                                            "".length();
                                            if (y(-"  ".length())) {
                                                return ((fr.ax[116] + fr.ax[162] - fr.ax[138] + fr.ax[114] ^ fr.ax[128] + fr.ax[48] - fr.ax[151] + fr.ax[81]) & (fr.ax[161] + fr.ax[62] - fr.ax[25] + fr.ax[165] ^ fr.ax[50] + fr.ax[42] - fr.ax[58] + fr.ax[193] ^ -" ".length())) != 0x0;
                                            }
                                            break Label_4586;
                                        }
                                        else if (r(j(n7, 7) ? 1 : 0) && r(o(aj, 15) ? 1 : 0)) {
                                            n8 = 0;
                                            "".length();
                                            "".length();
                                            if (b((Object)null)) {
                                                return ((fr.ax[228] ^ fr.ax[16]) & (fr.ax[2] ^ fr.ax[125] ^ fr.ax[13])) != 0x0;
                                            }
                                            break Label_4586;
                                        }
                                    }
                                    n8 = 1;
                                }
                                if (r(x(n8) ? 1 : 0) && (!r(x(g) ? 1 : 0) || !r(x(g(n7) ? 1 : 0) ? 1 : 0) || r(n(aa.z().aj, 9) ? 1 : 0)) && (!r(q(fr.an[n7], -1) ? 1 : 0) || r(r(fr.an[n7], fr.an[n4] + 1) ? 1 : 0))) {
                                    fr.an[n7] = fr.an[n4] + 1;
                                    fr.bh[n7] = n4;
                                }
                            }
                            ++n6;
                            "".length();
                            "".length();
                            if (h(-" ".length(), "   ".length())) {
                                return ((fr.ax[166] + fr.ax[169] - fr.ax[132] + fr.ax[93] ^ fr.ax[57] + fr.ax[42] - fr.ax[224] + fr.ax[18]) & (fr.ax[223] ^ fr.ax[189] ^ (fr.ax[191] ^ fr.ax[195]) ^ -" ".length())) != 0x0;
                            }
                        }
                        if (r(x(g) ? 1 : 0) && r(d(m) ? 1 : 0) && r(x(fr.aj[m.f] ? 1 : 0) ? 1 : 0) && (!r(q(fr.an[m.f], -1) ? 1 : 0) || r(r(fr.an[m.f], fr.an[n4] + 1) ? 1 : 0))) {
                            fr.an[m.f] = fr.an[n4] + 1;
                            fr.bh[m.f] = n4;
                        }
                        if (r(x(g) ? 1 : 0)) {
                            int n9;
                            if (r(x(ee.eo ? 1 : 0) ? 1 : 0)) {
                                n9 = 98;
                                "".length();
                                "".length();
                                if (g(-" ".length(), " ".length())) {
                                    return ((fr.ax[77] ^ fr.ax[189] ^ (fr.ax[14] ^ fr.ax[30])) & (fr.ax[135] + fr.ax[119] - fr.ax[105] + fr.ax[79] ^ fr.ax[65] + fr.ax[10] - fr.ax[229] + fr.ax[4] ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                n9 = 104;
                            }
                            final short n10 = (short)n9;
                            if (!r(q(fr.an[n10], -1) ? 1 : 0) || r(r(fr.an[n10], fr.an[n4] + 1) ? 1 : 0)) {
                                fr.an[n10] = fr.an[n4] + 1;
                                fr.bh[n10] = n4;
                            }
                        }
                        if (r(x(aa.y ? 1 : 0) ? 1 : 0) && (!r(q(fr.an[138], -1) ? 1 : 0) || r(r(fr.an[138], fr.an[n4] + 1) ? 1 : 0))) {
                            fr.an[138] = fr.an[n4] + 1;
                            fr.bh[138] = n4;
                        }
                        if (!r(x(aa.y ? 1 : 0) ? 1 : 0) || (r(q(fr.an[162], -1) ? 1 : 0) && !r(r(fr.an[162], fr.an[n4] + 1) ? 1 : 0))) {
                            continue;
                        }
                        fr.an[162] = fr.an[n4] + 1;
                        fr.bh[162] = n4;
                        "".length();
                        "".length();
                        if (g(fr.ax[165] ^ fr.ax[167], "   ".length())) {
                            return ((fr.ax[118] ^ fr.ax[178]) & (fr.ax[170] ^ fr.ax[32] ^ fr.ax[13])) != 0x0;
                        }
                        continue;
                    }
                }
                final fa fa2;
                (fa2 = new fa()).addElement(new Integer(n));
                int n11 = n;
                while (r(q(n11, s) ? 1 : 0)) {
                    int value;
                    if (r(x(i(value = fr.bh[n11]) ? 1 : 0) ? 1 : 0)) {
                        if (r(x(i(n11) ? 1 : 0) ? 1 : 0) && r(q(n11, 138) ? 1 : 0) && r(q(n11, 162) ? 1 : 0)) {
                            int n12 = 1;
                            if (r(j(n11, 10) ? 1 : 0)) {
                                n12 = 1;
                                "".length();
                                "".length();
                                if (b((Object)null)) {
                                    return ((fr.ax[198] ^ fr.ax[133] ^ (fr.ax[163] ^ fr.ax[165])) & (fr.ax[113] ^ fr.ax[135] ^ (fr.ax[45] ^ fr.ax[121]) ^ -" ".length())) != 0x0;
                                }
                            }
                            else if (r(j(n11, 17) ? 1 : 0)) {
                                n12 = 2;
                                "".length();
                                "".length();
                                if (b((Object)null)) {
                                    return ((fr.ax[100] ^ fr.ax[21]) & (fr.ax[214] ^ fr.ax[193] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 22) ? 1 : 0)) {
                                n12 = 3;
                                "".length();
                                "".length();
                                if (g("  ".length(), -" ".length())) {
                                    return ((fr.ax[215] ^ fr.ax[142]) & (fr.ax[174] ^ fr.ax[51] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 32) ? 1 : 0)) {
                                n12 = 4;
                                "".length();
                                "".length();
                                if (h("  ".length(), "  ".length())) {
                                    return ((fr.ax[78] ^ fr.ax[25]) & (fr.ax[105] ^ fr.ax[128] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 38) ? 1 : 0)) {
                                n12 = 5;
                                "".length();
                                "".length();
                                if (r((fr.ax[149] ^ fr.ax[70]) & (fr.ax[172] ^ fr.ax[113] ^ fr.ax[13]))) {
                                    return ((fr.ax[32] ^ fr.ax[23]) & (fr.ax[86] ^ fr.ax[75] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 43) ? 1 : 0)) {
                                n12 = 6;
                                "".length();
                                "".length();
                                if (h("  ".length(), "  ".length())) {
                                    return ((fr.ax[18] ^ fr.ax[154]) & (fr.ax[209] ^ fr.ax[72] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 48) ? 1 : 0)) {
                                n12 = 7;
                            }
                            value = (value | Integer.MIN_VALUE | 0x7000000 | (n12 << 20 & 0xF00000));
                            "".length();
                            "".length();
                            if (g("   ".length(), -" ".length())) {
                                return ((fr.ax[217] ^ fr.ax[27]) & (fr.ax[179] ^ fr.ax[43] ^ fr.ax[13])) != 0x0;
                            }
                        }
                        else if (r(j(n11, 139) ? 1 : 0)) {
                            value = (value | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                            "".length();
                            "".length();
                            if (s("  ".length(), fr.ax[131] ^ fr.ax[218])) {
                                return ((fr.ax[32] ^ fr.ax[172]) & (fr.ax[217] ^ fr.ax[26] ^ fr.ax[13])) != 0x0;
                            }
                        }
                    }
                    else if (r(x(g(value) ? 1 : 0) ? 1 : 0)) {
                        if (r(x(g(n11) ? 1 : 0) ? 1 : 0)) {
                            int n13 = 0;
                            if (r(j(n11, 1) ? 1 : 0)) {
                                n13 = 0;
                                "".length();
                                "".length();
                                if (w(fr.ax[178] ^ fr.ax[23])) {
                                    return ((fr.ax[219] ^ fr.ax[16]) & (fr.ax[14] ^ fr.ax[128] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 27) ? 1 : 0)) {
                                n13 = 1;
                                "".length();
                                "".length();
                                if (r((fr.ax[117] ^ fr.ax[57]) & (fr.ax[103] ^ fr.ax[148] ^ fr.ax[13]))) {
                                    return ((fr.ax[198] ^ fr.ax[27]) & (fr.ax[24] ^ fr.ax[5] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n11, 72) ? 1 : 0)) {
                                n13 = 2;
                            }
                            value = (value | Integer.MIN_VALUE | 0x8000000 | (n13 << 20 & 0xF00000));
                            "".length();
                            "".length();
                            if (t(fr.ax[18] ^ fr.ax[107])) {
                                return ((fr.ax[26] ^ fr.ax[72]) & (fr.ax[39] ^ fr.ax[33] ^ fr.ax[13])) != 0x0;
                            }
                        }
                        else if (r(d(m) ? 1 : 0) && r(j(n11, m.f) ? 1 : 0)) {
                            value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz << 20 & 0xF00000) | 0x30000);
                            "".length();
                            "".length();
                            if (g((fr.ax[135] ^ fr.ax[112]) & (fr.ax[214] ^ fr.ax[199] ^ fr.ax[13]), fr.ax[107] ^ fr.ax[11])) {
                                return ((fr.ax[163] ^ fr.ax[162]) & (fr.ax[172] ^ fr.ax[19] ^ fr.ax[13])) != 0x0;
                            }
                        }
                        else {
                            switch (n11) {
                                case 80: {
                                    value = (value | Integer.MIN_VALUE | 0x100000 | 0x10000);
                                    "".length();
                                    "".length();
                                    if (m("   ".length(), "   ".length())) {
                                        return ((fr.ax[101] ^ fr.ax[0]) & (fr.ax[123] ^ fr.ax[220] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 91: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x10000);
                                    "".length();
                                    "".length();
                                    if (t("  ".length())) {
                                        return ((fr.ax[9] ^ fr.ax[150]) & (fr.ax[218] ^ fr.ax[196] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 94: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x20000);
                                    "".length();
                                    "".length();
                                    if (h(-" ".length(), " ".length())) {
                                        return ((fr.ax[221] ^ fr.ax[189]) & (fr.ax[15] ^ fr.ax[184] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 98: {
                                    value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz + 2 << 20 & 0xF00000));
                                    "".length();
                                    "".length();
                                    if (m(fr.ax[19] ^ fr.ax[175], fr.ax[59] ^ fr.ax[163])) {
                                        return ((fr.ax[23] ^ fr.ax[112]) & (fr.ax[88] ^ fr.ax[61] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 104: {
                                    value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz + 2 << 20 & 0xF00000) | 0x10000);
                                    "".length();
                                    "".length();
                                    if (r((fr.ax[222] ^ fr.ax[189]) & (fr.ax[50] ^ fr.ax[33] ^ fr.ax[13]))) {
                                        return ((fr.ax[0] ^ fr.ax[88]) & (fr.ax[56] ^ fr.ax[101] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 105: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x30000);
                                    "".length();
                                    "".length();
                                    if (k("   ".length(), (fr.ax[161] ^ fr.ax[101]) & (fr.ax[136] ^ fr.ax[179] ^ fr.ax[13]))) {
                                        return ((fr.ax[16] ^ fr.ax[182]) & (fr.ax[175] ^ fr.ax[42] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 113: {
                                    value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz + 3 << 20 & 0xF00000));
                                    "".length();
                                    "".length();
                                    if (t(" ".length())) {
                                        return ((fr.ax[211] ^ fr.ax[66]) & (fr.ax[75] ^ fr.ax[149] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 114: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x40000);
                                    "".length();
                                    "".length();
                                    if (k(" ".length(), -" ".length())) {
                                        return ((fr.ax[148] ^ fr.ax[63] ^ "  ".length()) & (fr.ax[169] ^ fr.ax[155] ^ (fr.ax[96] ^ fr.ax[80]) ^ -" ".length())) != 0x0;
                                    }
                                    break;
                                }
                                case 125: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x50000);
                                    "".length();
                                    "".length();
                                    if (l("   ".length(), "   ".length())) {
                                        return ((fr.ax[145] ^ fr.ax[40]) & (fr.ax[33] ^ fr.ax[43] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 139: {
                                    value = (value | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                                    "".length();
                                    "".length();
                                    if (l((fr.ax[210] ^ fr.ax[192] ^ (fr.ax[184] ^ fr.ax[186])) & (fr.ax[54] ^ fr.ax[77] ^ (fr.ax[34] ^ fr.ax[82]) ^ -" ".length()), (fr.ax[165] ^ fr.ax[156] ^ (fr.ax[136] ^ fr.ax[121])) & (fr.ax[121] ^ fr.ax[44] ^ (fr.ax[52] ^ fr.ax[189]) ^ -" ".length()))) {
                                        return ((fr.ax[143] + fr.ax[88] - fr.ax[200] + fr.ax[189] ^ fr.ax[56] + fr.ax[72] - fr.ax[3] + fr.ax[157]) & (fr.ax[57] ^ fr.ax[202] ^ (fr.ax[112] ^ fr.ax[14]) ^ -" ".length())) != 0x0;
                                    }
                                    break;
                                }
                                case 157: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x60000);
                                    break;
                                }
                            }
                        }
                    }
                    fa2.addElement(new Integer(value));
                    n11 = fr.bh[n11];
                    "".length();
                    "".length();
                    if (o(-(fr.ax[103] ^ fr.ax[95]))) {
                        return ((fr.ax[116] ^ fr.ax[220]) & (fr.ax[98] ^ fr.ax[195] ^ fr.ax[13])) != 0x0;
                    }
                }
                final fa fa3 = new fa();
                int n14 = fa2.size() - 1;
                while (r(s(n14) ? 1 : 0)) {
                    fa3.addElement(fa2.elementAt(n14));
                    --n14;
                    "".length();
                    "".length();
                    if (g((fr.ax[52] ^ fr.ax[200]) & (fr.ax[36] ^ fr.ax[118] ^ fr.ax[13]), fr.ax[204] ^ fr.ax[201])) {
                        return ((fr.ax[8] ^ fr.ax[107]) & (fr.ax[144] ^ fr.ax[199] ^ fr.ax[13])) != 0x0;
                    }
                }
                fa = fa3;
                "".length();
                "".length();
                if (g("   ".length(), (fr.ax[55] ^ fr.ax[186]) & (fr.ax[29] ^ fr.ax[70] ^ fr.ax[13]))) {
                    return ((fr.ax[136] ^ fr.ax[170]) & (fr.ax[140] ^ fr.ax[75] ^ fr.ax[13])) != 0x0;
                }
            }
            else {
                fa = null;
            }
        }
        final fa fa4 = fa;
        if (r(c(fa) ? 1 : 0)) {
            dy.d = true;
            eh.a("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, cl.q);
            return false;
        }
        fr.v = true;
        try {
            int s2 = fr.s;
            int n15 = 1;
            while (r(o(n15, fa4.size()) ? 1 : 0) && r(x(fr.v ? 1 : 0) ? 1 : 0) && r(j(s2, fr.s) ? 1 : 0)) {
                final int intValue = (int)fa4.elementAt(n15 - 1);
                s2 = ((int)fa4.elementAt(n15) & 0xFFFF);
                if (r(v(intValue) ? 1 : 0)) {
                    ee.a(intValue >> 24 & 0x7F, intValue >> 20 & 0xF, intValue >> 16 & 0xF);
                    "".length();
                    "".length();
                    if (l(fr.ax[17] ^ fr.ax[116], "   ".length())) {
                        return ((fr.ax[103] ^ fr.ax[95]) & (fr.ax[195] ^ fr.ax[198] ^ fr.ax[13])) != 0x0;
                    }
                }
                else if ((!r(n(intValue, 134) ? 1 : 0) || r(r(intValue, 162) ? 1 : 0)) && r(j(s2, 162) ? 1 : 0)) {
                    if (r(q(aa.z().f) ? 1 : 0)) {
                        eh.a("Hi\u1ebfu chi\u1ebfn qu\u00e1 cao!", 50, cl.q);
                        return false;
                    }
                    final el d;
                    if (!r(d(d = aa.d(InputNpc.ltt)) ? 1 : 0) || r(q(d.j.d, InputNpc.ltt) ? 1 : 0)) {
                        if (r(x(aa.q ? 1 : 0) ? 1 : 0) && r(n(aa.z().w, 10) ? 1 : 0)) {
                            fl.u().b(14, InputNpc.muaLTT, 2);
                            es.w();
                            return false;
                        }
                        eh.a("!", 50, cl.q);
                        return false;
                    }
                    else {
                        fl.u().t(d.p);
                        "".length();
                        "".length();
                        if (b((Object)null)) {
                            return ((fr.ax[150] ^ fr.ax[103] ^ (fr.ax[203] ^ fr.ax[192])) & (fr.ax[88] + fr.ax[122] - fr.ax[130] + fr.ax[187] ^ fr.ax[179] + fr.ax[103] - fr.ax[60] + fr.ax[107] ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else if ((!r(n(intValue, 134) ? 1 : 0) || r(r(intValue, 138) ? 1 : 0)) && r(j(s2, 138) ? 1 : 0)) {
                    if (r(q(aa.z().f) ? 1 : 0)) {
                        return false;
                    }
                    final el d2;
                    if (!r(d(d2 = aa.d(InputNpc.cl)) ? 1 : 0) || r(q(d2.j.d, InputNpc.cl) ? 1 : 0)) {
                        if (r(x(aa.q ? 1 : 0) ? 1 : 0) && r(n(aa.z().w, 10) ? 1 : 0)) {
                            fl.u().b(14, InputNpc.muaCL, 2);
                            es.w();
                            return false;
                        }
                        eh.a("!", 50, cl.q);
                        return false;
                    }
                    else {
                        fl.u().t(d2.p);
                        "".length();
                        "".length();
                        if (y(-"  ".length())) {
                            return ((fr.ax[99] ^ fr.ax[220]) & (fr.ax[147] ^ fr.ax[148] ^ fr.ax[13])) != 0x0;
                        }
                    }
                }
                else if (r(x(intValue) ? 1 : 0) && r(q(intValue, 56) ? 1 : 0) && r(q(intValue, 73) ? 1 : 0)) {
                    int n16 = -1;
                    int n17 = 0;
                    while (r(o(n17, fr.ai[intValue].length) ? 1 : 0)) {
                        if (r(j(fr.ai[intValue][n17], s2) ? 1 : 0)) {
                            n16 = n17;
                            "".length();
                            "".length();
                            if (r((fr.ax[18] ^ fr.ax[64]) & (fr.ax[223] ^ fr.ax[144] ^ fr.ax[13]))) {
                                return ((fr.ax[85] ^ fr.ax[148]) & (fr.ax[99] ^ fr.ax[17] ^ fr.ax[13])) != 0x0;
                            }
                            break;
                        }
                        else {
                            ++n17;
                            "".length();
                            "".length();
                            if (g(-" ".length(), fr.ax[147] ^ fr.ax[50] ^ (fr.ax[19] ^ fr.ax[108]))) {
                                return ((fr.ax[130] ^ fr.ax[195] ^ (fr.ax[107] ^ fr.ax[158])) & (fr.ax[85] ^ fr.ax[11] ^ (fr.ax[40] ^ fr.ax[163]) ^ -" ".length())) != 0x0;
                            }
                            continue;
                        }
                    }
                    if (r(j(n16, -1) ? 1 : 0)) {
                        dy.d = true;
                        eh.a("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, cl.q);
                        return false;
                    }
                    n(n16);
                    "".length();
                    "".length();
                    if (b((Object)null)) {
                        return ((fr.ax[230] ^ fr.ax[130]) & (fr.ax[112] ^ fr.ax[149] ^ fr.ax[13])) != 0x0;
                    }
                }
                else {
                    final fc c;
                    if (r(d(c = (fc)ee.dr.elementAt(0)) ? 1 : 0) && r(q(c.dw, 15) ? 1 : 0)) {
                        aa.a(c.ai, c.eu);
                        "".length();
                        aa.z().c = c;
                        fl.u().s(c.gm.a);
                        fl.u().c(c.gm.a, 0, 0);
                        fl.u().j(c.gm.a, 0);
                    }
                }
                if (r(q(fr.s, s2) ? 1 : 0)) {
                    h();
                }
                Thread.sleep(1L);
                ++n15;
                "".length();
                "".length();
                if (y(-" ".length())) {
                    return ((fr.ax[10] ^ fr.ax[87] ^ (fr.ax[207] ^ fr.ax[190])) & (fr.ax[121] ^ fr.ax[177] ^ (fr.ax[87] ^ fr.ax[164]) ^ -" ".length())) != 0x0;
                }
            }
            "".length();
            "".length();
            if (t(fr.ax[61] ^ fr.ax[87] ^ (fr.ax[71] ^ fr.ax[113]))) {
                return ((fr.ax[224] ^ fr.ax[15] ^ (fr.ax[160] ^ fr.ax[41])) & (fr.ax[176] + fr.ax[174] - fr.ax[137] + fr.ax[118] ^ fr.ax[112] + fr.ax[64] - fr.ax[88] + fr.ax[38] ^ -" ".length())) != 0x0;
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
            return false;
        }
        fr.v = false;
        return r(j(fr.s, n) ? 1 : 0);
    }
    
    private static boolean p(final int n) {
        int n2;
        if (w(n)) {
            n2 = fr.ax[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x93 ^ 0xAB) & ~(0x68 ^ 0x50)) != 0x0;
            }
        }
        else {
            n2 = fr.ax[1];
        }
        return n2 != 0;
    }
    
    private static boolean q(final int n) {
        int n2;
        if (y(n)) {
            n2 = fr.ax[0];
            "".length();
            if ((0x55 ^ 0x51) < "   ".length()) {
                return ((0xAF ^ 0x90) & ~(0x0 ^ 0x3F)) != 0x0;
            }
        }
        else {
            n2 = fr.ax[1];
        }
        return n2 != 0;
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    public static boolean d(final int n) {
        return !r(q(n, 10) ? 1 : 0) || !r(q(n, 17) ? 1 : 0) || !r(q(n, 22) ? 1 : 0) || !r(q(n, 32) ? 1 : 0) || !r(q(n, 38) ? 1 : 0) || !r(q(n, 43) ? 1 : 0) || !r(q(n, 48) ? 1 : 0) || !r(q(n, 138) ? 1 : 0) || !r(q(n, 1) ? 1 : 0) || !r(q(n, 27) ? 1 : 0) || r(j(n, 72) ? 1 : 0);
    }
    
    public static int a(final int n, int j) {
        if (r(x(e(n, j - 16) & 0x4002) ? 1 : 0)) {
            j = j(j);
            int n2 = 24;
            while (r(o(n2, 240) ? 1 : 0)) {
                final int e = e(n, j - n2);
                if (r(q(j - n2) ? 1 : 0) && r(p(e & 0x4002) ? 1 : 0)) {
                    return j - n2 + 24;
                }
                n2 += 24;
                "".length();
                "".length();
                if (k(fr.ax[47] ^ fr.ax[113], -" ".length())) {
                    return (fr.ax[47] ^ fr.ax[28]) & (fr.ax[135] ^ fr.ax[5] ^ fr.ax[13]);
                }
            }
            int n3 = 24;
            while (r(o(n3, 120) ? 1 : 0)) {
                final int e2 = e(n, j + n3);
                if (r(o(j + n3, fr.a) ? 1 : 0) && r(p(e2 & 0x4002) ? 1 : 0)) {
                    return j + n3;
                }
                n3 += 24;
                "".length();
                "".length();
                if (y(-"   ".length())) {
                    return (fr.ax[137] ^ fr.ax[138] ^ (fr.ax[139] ^ fr.ax[78])) & (fr.ax[100] ^ fr.ax[52] ^ (fr.ax[140] ^ fr.ax[141]) ^ -" ".length());
                }
            }
        }
        return j;
    }
    
    private static boolean g(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean b(final Object o) {
        return o != null;
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o != o2;
    }
    
    private static boolean c(final Object o) {
        int n;
        if (a(o)) {
            n = fr.ax[0];
            "".length();
            if (((0x69 ^ 0x3C) & ~(0x3F ^ 0x6A)) == "  ".length()) {
                return ((0x31 ^ 0x0) & ~(0x1C ^ 0x2D)) != 0x0;
            }
        }
        else {
            n = fr.ax[1];
        }
        return n != 0;
    }
    
    private static boolean r(final int n) {
        return n != 0;
    }
    
    private static boolean s(final int n) {
        int n2;
        if (o(n)) {
            n2 = fr.ax[0];
            "".length();
            if ((0x2 ^ 0x6) <= 0) {
                return ((0x3 ^ 0x55) & ~(0x55 ^ 0x3)) != 0x0;
            }
        }
        else {
            n2 = fr.ax[1];
        }
        return n2 != 0;
    }
    
    public static final void b(int n, final int n2) {
        final int[] m = fr.m;
        n = n2 / fr.af * fr.y + n / fr.af;
        final int[] array = m;
        final int n3 = n;
        array[n3] &= 0xFFFFFDFF;
    }
    
    public static int c(final int n, int j) {
        j = j(j);
        if (r(p(a(n, j, 2) ? 1 : 0) ? 1 : 0)) {
            int n2 = 0;
            while (r(o(n2, 7) ? 1 : 0)) {
                final int n3;
                if (r(q(n3 = j - 48 + n2 * 24) ? 1 : 0) && r(o(n3, fr.a) ? 1 : 0) && r(x(a(n, n3, 2) ? 1 : 0) ? 1 : 0)) {
                    return n3;
                }
                ++n2;
                "".length();
                "".length();
                if (g(" ".length(), "   ".length())) {
                    return (fr.ax[68] ^ fr.ax[175] ^ (fr.ax[87] ^ fr.ax[12])) & (fr.ax[74] + fr.ax[171] - fr.ax[62] + fr.ax[138] ^ fr.ax[35] + fr.ax[45] - fr.ax[137] + fr.ax[174] ^ -" ".length());
                }
            }
        }
        return j;
    }
    
    public static int e(final int n) {
        if (r(x(b(n) ? 1 : 0) ? 1 : 0)) {
            switch (n) {
                case 91: {
                    return 92;
                }
                case 92: {
                    return 93;
                }
                case 94: {
                    return 95;
                }
                case 95: {
                    return 96;
                }
                case 96: {
                    return 97;
                }
                case 105: {
                    return 106;
                }
                case 106: {
                    return 107;
                }
                case 107: {
                    return 108;
                }
                case 108: {
                    return 109;
                }
                case 114: {
                    return 115;
                }
                case 115: {
                    return 116;
                }
                case 125: {
                    return 126;
                }
                case 126: {
                    return 127;
                }
                case 127: {
                    return 128;
                }
                case 157: {
                    return 158;
                }
                case 158: {
                    return 159;
                }
                case 159: {
                    return 157;
                }
            }
        }
        return -1;
    }
    
    private static boolean h(final int n, final int n2) {
        return n > n2;
    }
    
    public static void b() {
        if (!r(o(fr.y * fr.o, fr.ag) ? 1 : 0) || r(n(fr.w * fr.o, fr.j) ? 1 : 0)) {
            if (r(q(fr.bc, fr.ap) ? 1 : 0)) {
                fr.am = fr.ap - fr.bc << 2;
                fr.aq += fr.am;
                fr.bc += fr.aq >> 4;
                fr.aq &= 0xF;
            }
            if (r(q(fr.al, fr.as) ? 1 : 0)) {
                fr.bf = fr.as - fr.al << 2;
                fr.be += fr.bf;
                fr.al += fr.be >> 4;
                fr.be &= 0xF;
            }
        }
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = fr.ax[0];
            "".length();
            if ((0x6 ^ 0x3) <= 0) {
                return ((0x50 ^ 0xF) & ~(0x75 ^ 0x2A)) != 0x0;
            }
        }
        else {
            n = fr.ax[1];
        }
        return n != 0;
    }
    
    public static int f(final int n) {
        if (r(x(b(n) ? 1 : 0) ? 1 : 0)) {
            switch (n) {
                case 92: {
                    return 91;
                }
                case 93: {
                    return 92;
                }
                case 95: {
                    return 94;
                }
                case 96: {
                    return 95;
                }
                case 97: {
                    return 96;
                }
                case 106: {
                    return 105;
                }
                case 107: {
                    return 106;
                }
                case 108: {
                    return 107;
                }
                case 109: {
                    return 108;
                }
                case 115: {
                    return 114;
                }
                case 116: {
                    return 115;
                }
                case 126: {
                    return 125;
                }
                case 127: {
                    return 126;
                }
                case 128: {
                    return 127;
                }
                case 158: {
                    return 157;
                }
                case 159: {
                    return 158;
                }
            }
        }
        return -1;
    }
    
    private static int i(final int n, final int n2) {
        try {
            return fr.m[n2 * fr.y + n];
        }
        catch (final Exception ex) {
            "".length();
            return 1000;
        }
    }
    
    private static boolean t(final int n) {
        return n <= 0;
    }
    
    private static boolean u(final int n) {
        return n < 0;
    }
    
    private static boolean j(final int n, final int n2) {
        int n3;
        if (g(n, n2)) {
            n3 = fr.ax[0];
            "".length();
            if (" ".length() > " ".length()) {
                return ((0x4E ^ 0x11) & ~(0x3 ^ 0x5C)) != 0x0;
            }
        }
        else {
            n3 = fr.ax[1];
        }
        return n3 != 0;
    }
    
    public static boolean g(final int n) {
        return !r(q(n, 1) ? 1 : 0) || !r(q(n, 27) ? 1 : 0) || r(j(n, 72) ? 1 : 0);
    }
    
    public static void h(final int n) {
        ff.b();
        new Thread(new dh(n)).start();
    }
    
    private static boolean v(final int n) {
        int n2;
        if (u(n)) {
            n2 = fr.ax[0];
            "".length();
            if (((0x38 ^ 0x5A) & ~(0x2E ^ 0x4C)) < ((0x2E ^ 0x67) & ~(0xF6 ^ 0xBF))) {
                return ((0x29 ^ 0x70) & ~(0xD6 ^ 0x8F)) != 0x0;
            }
        }
        else {
            n2 = fr.ax[1];
        }
        return n2 != 0;
    }
    
    public static void c() {
        int n = 1;
        while (r(o(n, fr.at.length) ? 1 : 0)) {
            fr.at[n] = ff.a(new StringBuffer().append("/t/").append(n).append(".png").toString());
            fr.bg[n] = ff.a(new StringBuffer().append("/t/mini_").append(n).append(".png").toString());
            ++n;
            "".length();
            "".length();
            if (t(fr.ax[51] ^ fr.ax[85] ^ (fr.ax[15] ^ fr.ax[54]))) {
                return;
            }
        }
    }
    
    private static boolean w(final int n) {
        return n == 0;
    }
    
    private static boolean k(final int n, final int n2) {
        return n <= n2;
    }
    
    public static final void d(int n, final int n2) {
        final int[] m = fr.m;
        n = n2 / fr.af * fr.y + n / fr.af;
        final int[] array = m;
        final int n3 = n;
        array[n3] |= 0x200;
    }
    
    public static void d() {
        if (r(p(ff.am % 700) ? 1 : 0) && r(x(fr.s) ? 1 : 0) && r(r(fr.s, 4) ? 1 : 0) && (!r(n(fr.s, 16) ? 1 : 0) || r(r(fr.s, 18) ? 1 : 0)) && (!r(n(fr.s, 24) ? 1 : 0) || r(r(fr.s, 27) ? 1 : 0)) && r(q(fr.s, 22) ? 1 : 0) && r(q(fr.s, 33) ? 1 : 0) && r(q(fr.s, 34) ? 1 : 0) && r(q(fr.s, 38) ? 1 : 0) && r(q(fr.s, 57) ? 1 : 0) && r(q(fr.s, 58) ? 1 : 0) && r(q(fr.s, 60) ? 1 : 0) && r(q(fr.s, 68) ? 1 : 0) && (!r(n(fr.s, 70) ? 1 : 0) || r(r(fr.s, 75) ? 1 : 0)) && r(q(fr.s, 81) ? 1 : 0)) {
            if ((r(n(fr.s, 39) ? 1 : 0) && !r(r(fr.s, 44) ? 1 : 0)) || (r(n(fr.s, 46) ? 1 : 0) && !r(r(fr.s, 48) ? 1 : 0)) || !r(q(fr.s, 56) ? 1 : 0) || (r(n(fr.s, 62) ? 1 : 0) && r(f(fr.s, 65) ? 1 : 0))) {
                return;
            }
            if (!r(q(fr.s, 29) ? 1 : 0) || r(j(fr.s, 35) ? 1 : 0)) {
                return;
            }
            if (!r(q(fr.s, 50) ? 1 : 0) || !r(q(fr.s, 51) ? 1 : 0) || r(j(fr.s, 52) ? 1 : 0)) {
                return;
            }
            if (r(j(fr.s, 64) ? 1 : 0)) {
                if (r(p(fj.b(0, 8) % 2) ? 1 : 0)) {
                    return;
                }
            }
        }
    }
    
    static final void e() {
        if (r(c(fr.aw) ? 1 : 0)) {
            fr.aw = ff.a("/t/uwt.png");
        }
        if (r(c(fr.ak) ? 1 : 0)) {
            fr.ak = ff.a("/t/wtf.png");
        }
        if (r(c(fr.bi) ? 1 : 0)) {
            fr.bi = ff.a("/t/twtf.png");
        }
        if (r(c(fr.av) ? 1 : 0)) {
            fr.av = ff.a("/t/wts.png");
        }
        if (r(c(fr.ba) ? 1 : 0)) {
            fr.ba = ff.a("/t/wts1.png");
        }
        System.gc();
    }
    
    private static boolean l(final int n, final int n2) {
        return n < n2;
    }
    
    public static boolean i(final int n) {
        return !r(q(n, 10) ? 1 : 0) || !r(q(n, 17) ? 1 : 0) || !r(q(n, 22) ? 1 : 0) || !r(q(n, 32) ? 1 : 0) || !r(q(n, 38) ? 1 : 0) || !r(q(n, 43) ? 1 : 0) || !r(q(n, 48) ? 1 : 0) || r(j(n, 138) ? 1 : 0);
    }
    
    public static final int j(final int n) {
        return n / fr.af * fr.af;
    }
    
    public static void a(final int ae, final int f, final int ag, final int j) {
        fr.ag = ag;
        fr.j = j;
        fr.ae = ae;
        fr.f = f;
    }
    
    public static void f() {
        fr.as = aa.z().ai / 12;
        fr.ap = aa.z().eu / 12;
        if (r(r(fr.as, fr.y * fr.o - fr.ag / 2) ? 1 : 0)) {
            fr.as = fr.y * fr.o - fr.ag;
            "".length();
            "".length();
            if (w("   ".length())) {
                return;
            }
        }
        else if (r(o(fr.as, fr.ag / 2) ? 1 : 0)) {
            fr.as = 0;
            "".length();
            "".length();
            if (s(" ".length(), "  ".length())) {
                return;
            }
        }
        else {
            fr.as -= fr.ag / 2;
        }
        if (r(o(fr.ap, fr.j / 2) ? 1 : 0)) {
            fr.ap = 0;
            "".length();
            "".length();
            if (b((Object)null)) {
                return;
            }
        }
        else {
            fr.ap -= fr.j / 2;
        }
        if (r(r(fr.ap, fr.w * fr.o - fr.j) ? 1 : 0)) {
            fr.ap = fr.w * fr.o - fr.j;
        }
    }
    
    private static boolean m(final int n, final int n2) {
        return n != n2;
    }
    
    public static final boolean a(final int n, final int n2, final int n3) {
        try {
            return r(j(fr.m[n2 / fr.af * fr.y + n / fr.af] & n3, n3) ? 1 : 0);
        }
        catch (final Exception ex) {
            "".length();
            return false;
        }
    }
    
    public static void k(final int n) {
        ff.b();
        new Thread(new dg(n)).start();
    }
    
    private static boolean n(final int n, final int n2) {
        int n3;
        if (s(n, n2)) {
            n3 = fr.ax[0];
            "".length();
            if (null != null) {
                return ((0xE6 ^ 0xAA ^ (0xA0 ^ 0xB4)) & (42 + 9 + 146 + 6 ^ 116 + 46 - 67 + 52 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fr.ax[1];
        }
        return n3 != 0;
    }
    
    private static boolean o(final int n, final int n2) {
        int n3;
        if (l(n, n2)) {
            n3 = fr.ax[0];
            "".length();
            if (-"  ".length() > 0) {
                return ((0x38 ^ 0x15 ^ (0xAA ^ 0x9E)) & (0x72 ^ 0x5 ^ (0xE3 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fr.ax[1];
        }
        return n3 != 0;
    }
    
    private static int p(final int n, final int n2) {
        try {
            return fr.q[n2 * fr.y + n];
        }
        catch (final Exception ex) {
            "".length();
            return 1000;
        }
    }
    
    private static boolean x(final int n) {
        int n2;
        if (r(n)) {
            n2 = fr.ax[0];
            "".length();
            if (((0x8 ^ 0x2E) & ~(0x2 ^ 0x24)) > 0) {
                return ((0x1 ^ 0x6) & ~(0x71 ^ 0x76)) != 0x0;
            }
        }
        else {
            n2 = fr.ax[1];
        }
        return n2 != 0;
    }
    
    public static final void b(final cn cn) {
        if (r(r(ff.w, 176) ? 1 : 0)) {
            fj.a(cn);
            cn.a(fr.ae + 1, fr.f + 2);
            cn.a(0);
            cn.c(-2, -2, fr.ag + 2, fr.j);
            cn.d(-2, -2, fr.ag + 4, fr.j + 4);
            int n = 0;
            while (r(o(n, 2) ? 1 : 0)) {
                cn.a(fr.au[n]);
                cn.e(n - 2, n - 2, fr.ag + 2 - (n << 1), fr.j - (n << 1));
                ++n;
                "".length();
                "".length();
                if (b((Object)null)) {
                    return;
                }
            }
            cn.d(0, 0, fr.ag - 2, fr.j - 3);
            if (!r(f(cn.b(fr.c), fr.ag) ? 1 : 0) || r(r(cn.a(fr.c), fr.j) ? 1 : 0)) {
                cn.a(-fr.al, -fr.bc);
            }
            cn.a(fr.c, 0, 0, 0);
            int n2 = 0;
            while (r(o(n2, a.m.size()) ? 1 : 0)) {
                final ev ev;
                int bf = (ev = (ev)a.m.elementAt(n2)).w / 12;
                int am = ev.k / 12;
                if (r(o(bf, fr.bf) ? 1 : 0)) {
                    bf = fr.bf;
                }
                if (r(o(am, fr.am) ? 1 : 0)) {
                    am = fr.am;
                }
                if (r(r(bf, fr.bf + fr.ag) ? 1 : 0)) {
                    bf = fr.bf + fr.ag;
                }
                if (r(r(am, fr.am + fr.j) ? 1 : 0)) {
                    am = fr.am + fr.j;
                }
                if (r(o(ff.am % 10, 8) ? 1 : 0)) {
                    cn.a(16777215);
                    cn.c(bf - 2, am - 2, 5, 5);
                    int n3;
                    if (r(j(ev.l, 1) ? 1 : 0)) {
                        n3 = 255;
                        "".length();
                        "".length();
                        if (t(fr.ax[56] + fr.ax[58] - fr.ax[59] + fr.ax[12] ^ fr.ax[60] + fr.ax[18] - fr.ax[61] + fr.ax[3])) {
                            return;
                        }
                    }
                    else if (r(j(ev.l, 2) ? 1 : 0)) {
                        n3 = 16711935;
                        "".length();
                        "".length();
                        if (b((Object)null)) {
                            return;
                        }
                    }
                    else {
                        n3 = 65535;
                    }
                    cn.a(n3);
                    cn.c(bf - 1, am - 1, 3, 3);
                }
                ++n2;
                "".length();
                "".length();
                if (h((fr.ax[51] ^ fr.ax[63]) & (fr.ax[31] ^ fr.ax[24] ^ fr.ax[13]), fr.ax[64] ^ fr.ax[65])) {
                    return;
                }
            }
            final int n4 = aa.z().ai / 12;
            final int n5 = aa.z().eu / 12;
            cn.a(16777215);
            cn.c(n4 - 2, n5 - 2, 5, 5);
            cn.a(16711680);
            cn.c(n4 - 1, n5 - 1, 3, 3);
            if (r(x(cv.k ? 1 : 0) ? 1 : 0)) {
                int n6 = 0;
                while (r(o(n6, cv.f.size()) ? 1 : 0)) {
                    final int n7 = (int)cv.f.elementAt(n6) / 12;
                    final int n8 = (int)cv.c.elementAt(n6) / 12;
                    if (r(j(cv.an, n6) ? 1 : 0)) {
                        cn.a(16777215);
                        cn.c(n7 - 2, n8 - 2, 5, 5);
                    }
                    cn.a(16777215);
                    cn.c(n7 - 1, n8 - 1, 3, 3);
                    ++n6;
                    "".length();
                    "".length();
                    if (w("  ".length())) {
                        return;
                    }
                }
            }
            int n9 = 0;
            while (r(o(n9, ee.bf.size()) ? 1 : 0)) {
                final ec ec;
                if (r(d((ec = (ec)ee.bf.elementAt(n9)).f) ? 1 : 0) && r(b(ec.f, aa.z()) ? 1 : 0)) {
                    int bf2 = ec.f.ai / 12;
                    int am2 = ec.f.eu / 12;
                    if (r(o(bf2, fr.bf) ? 1 : 0)) {
                        bf2 = fr.bf;
                    }
                    if (r(o(am2, fr.am) ? 1 : 0)) {
                        am2 = fr.am;
                    }
                    if (r(r(bf2, fr.bf + fr.ag) ? 1 : 0)) {
                        bf2 = fr.bf + fr.ag;
                    }
                    if (r(r(am2, fr.am + fr.j) ? 1 : 0)) {
                        am2 = fr.am + fr.j;
                    }
                    if (r(o(ff.am % 10, 8) ? 1 : 0)) {
                        cn.a(16777215);
                        cn.c(bf2 - 2, am2 - 2, 5, 5);
                        cn.a(65280);
                        cn.c(bf2 - 1, am2 - 1, 3, 3);
                    }
                }
                ++n9;
                "".length();
                "".length();
                if (y(-"  ".length())) {
                    return;
                }
            }
            fj.a(cn);
            if (r(x(ff.at ? 1 : 0) ? 1 : 0)) {
                cn.a(ee.a, fr.ae - 1, fr.f, 0);
                cl.q.a(cn, new StringBuffer().append("Map : ").append(fr.s).toString(), fr.ae - 1, fr.f, 0, cl.m);
                cl.q.a(cn, new StringBuffer().append("Khu : ").append(fr.g).toString(), fr.ae - 1, fr.f + 10, 0, cl.m);
                final cl q = cl.q;
                final StringBuffer sb = new StringBuffer("pk/ko: ");
                int i = 0;
                for (int j = 0; j < ee.de.size(); ++j) {
                    if (((aa)ee.de.elementAt(j)).r == 3) {
                        ++i;
                    }
                }
                final StringBuffer append = sb.append(i).append("/");
                int k = 0;
                for (int l = 0; l < ee.de.size(); ++l) {
                    if (((aa)ee.de.elementAt(l)).r != 3) {
                        ++k;
                    }
                }
                q.a(cn, append.append(k).toString(), fr.ae - 1, fr.f + 20, 0, cl.m);
                int m = 0;
                int i2 = 0;
                int i3 = 0;
                for (int n10 = 0; n10 < ee.ed.size(); ++n10) {
                    final ev ev2 = (ev)ee.ed.elementAt(n10);
                    if (ev2.ac != 0) {
                        if (ev2.l == 0) {
                            ++m;
                        }
                        else if (ev2.l == 1) {
                            ++i2;
                            continue;
                        }
                        if (ev2.l == 2) {
                            ++i3;
                        }
                    }
                }
                cl.q.a(cn, new StringBuffer().append(m).append("-").append(i2).append("-").append(i3).toString(), fr.ae - 1, fr.f + 30, 0, cl.m);
            }
        }
    }
    
    public static void g() {
        if (r(x(fr.p ? 1 : 0) ? 1 : 0)) {
            fr.p = false;
            synchronized (fr.ay) {
                fr.ay.notifyAll();
            }
        }
    }
    
    private static boolean d(final Object o) {
        int n;
        if (b(o)) {
            n = fr.ax[0];
            "".length();
            if (-"  ".length() > 0) {
                return ((45 + 72 + 13 + 33 ^ 124 + 12 - 34 + 47) & (0x79 ^ 0x1D ^ (0x23 ^ 0x71) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = fr.ax[1];
        }
        return n != 0;
    }
    
    private static boolean q(final int n, final int n2) {
        int n3;
        if (m(n, n2)) {
            n3 = fr.ax[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((139 + 145 - 222 + 129 ^ 59 + 51 - 48 + 92) & (0x88 ^ 0x93 ^ (0x9A ^ 0xA4) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fr.ax[1];
        }
        return n3 != 0;
    }
    
    public static void h() {
        fr.p = true;
        synchronized (fr.ay) {
            try {
                fr.ay.wait(500L);
                "".length();
                "".length();
                if (g(fr.ax[142] ^ fr.ax[143], "  ".length())) {
                    return;
                }
            }
            catch (final InterruptedException ex) {
                "".length();
            }
        }
    }
    
    public static final void c(final cn cn) {
        if (r(p(ff.ar ? 1 : 0) ? 1 : 0)) {
            int bp = ee.bp;
            while (r(o(bp, ee.bs) ? 1 : 0)) {
                int bh = ee.bh;
                while (r(o(bh, ee.ak) ? 1 : 0)) {
                    if (r(j(fr.l, 4) ? 1 : 0)) {
                        final Image ba = fr.ba;
                        "".length();
                        "".length();
                        if (b((Object)null)) {
                            return;
                        }
                    }
                    else {
                        final Image av = fr.av;
                    }
                    if (r(j(i(bp, bh) & 0x800, 2048) ? 1 : 0)) {}
                    if (r(j(i(bp, bh) & 0x40, 64) ? 1 : 0)) {}
                    if (r(j(i(bp, bh) & 0x100, 256) ? 1 : 0)) {}
                    ++bh;
                    "".length();
                    "".length();
                    if (w(" ".length())) {
                        return;
                    }
                }
                ++bp;
                "".length();
                "".length();
                if (b((Object)null)) {
                    return;
                }
            }
            if (!ek.xdh) {
                if (r(q(fr.l, 4) ? 1 : 0) && r(x(ff.at ? 1 : 0) ? 1 : 0) && r(x(ff.m ? 1 : 0) ? 1 : 0) && r(n(ee.ak, fr.w - 2) ? 1 : 0)) {
                    int bp2 = ee.bp;
                    while (r(o(bp2, ee.bs) ? 1 : 0)) {
                        final int n = fr.w - 2;
                        int ao = fr.q[n * fr.y + bp2] - '\u0001';
                        if (r(j(i(bp2, n) & 0x20, 32) ? 1 : 0)) {
                            int n2 = 1;
                            while (r(f(n2, 4) ? 1 : 0)) {
                                cn.a(fr.ak, 0, 24 * (ff.am % 4), 24, 24, 0, bp2 * fr.af, (n + n2) * fr.af, 0);
                                ++n2;
                                "".length();
                                "".length();
                                if (r((fr.ax[0] ^ fr.ax[11]) & (fr.ax[12] ^ fr.ax[3] ^ fr.ax[13]))) {
                                    return;
                                }
                            }
                        }
                        else {
                            if (r(j(fr.s, 64) ? 1 : 0)) {
                                fr.ao = 115;
                            }
                            if (!r(q(i(bp2, n) & 0x2, 2) ? 1 : 0) || r(j(i(bp2, n) & 0x40, 64) ? 1 : 0)) {
                                ao = fr.ao;
                            }
                            if (r(s(ao) ? 1 : 0)) {
                                int n3 = 1;
                                while (r(f(n3, 4) ? 1 : 0)) {
                                    cn.a(fr.bj, 0, ao * fr.af, 24, 24, 0, bp2 * fr.af, (n + n3) * fr.af, 0);
                                    ++n3;
                                    "".length();
                                    "".length();
                                    if (y((fr.ax[15] + fr.ax[16] - fr.ax[17] + fr.ax[18] ^ fr.ax[19] + fr.ax[20] - fr.ax[21] + fr.ax[22]) & (fr.ax[23] ^ fr.ax[24] ^ (fr.ax[15] ^ fr.ax[25]) ^ -" ".length()))) {
                                        return;
                                    }
                                }
                            }
                        }
                        ++bp2;
                        "".length();
                        "".length();
                        if (h((fr.ax[25] ^ fr.ax[26]) & (fr.ax[17] ^ fr.ax[27] ^ fr.ax[13]), fr.ax[28] ^ fr.ax[4])) {
                            return;
                        }
                    }
                }
            }
        }
    }
    
    public static void i() {
        fr.bj = null;
        System.gc();
    }
    
    static {
        l();
        m();
        fr.af = 24;
        fr.u = null;
        fr.aa = "";
        fr.e = 0;
        fr.ad = new fa();
        fr.b = new bw();
        fr.x = new bw();
        fr.o = 2;
        fr.au = new int[] { 5257738, 8807192 };
        fr.ai = new short[190][];
        fr.aj = new boolean[190];
        fr.an = new int[190];
        fr.bh = new short[190];
        fr.ai[0] = new short[] { 27 };
        fr.ai[1] = new short[] { 2, 3, 27, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80 };
        fr.ai[2] = new short[] { 6, 1 };
        fr.ai[3] = new short[] { 1, 4 };
        fr.ai[4] = new short[] { 3, 5 };
        fr.ai[5] = new short[] { 7, 4 };
        fr.ai[6] = new short[] { 7, 2, 20, 21 };
        fr.ai[7] = new short[] { 6, 5, 8 };
        fr.ai[8] = new short[] { 7, 9 };
        fr.ai[9] = new short[] { 8, 10 };
        fr.ai[10] = new short[] { 9, 11, 17, 22, 32, 38, 43, 48, 139 };
        fr.ai[11] = new short[] { 12, 10 };
        fr.ai[12] = new short[] { 11, 57 };
        fr.ai[13] = new short[] { 57, 14 };
        fr.ai[14] = new short[] { 13, 15 };
        fr.ai[15] = new short[] { 14, 16 };
        fr.ai[16] = new short[] { 15, 17 };
        fr.ai[17] = new short[] { 16, 18, 10, 22, 32, 38, 43, 48, 139 };
        fr.ai[18] = new short[] { 17, 19 };
        fr.ai[19] = new short[] { 18, 58 };
        fr.ai[20] = new short[] { 6 };
        fr.ai[21] = new short[] { 22, 6 };
        fr.ai[22] = new short[] { 23, 21, 10, 17, 32, 38, 43, 48, 189, 188, 139 };
        fr.ai[23] = new short[] { 22, 69, 25 };
        fr.ai[24] = new short[] { 59, 36 };
        fr.ai[25] = new short[] { 23, 26 };
        fr.ai[26] = new short[] { 27, 25 };
        fr.ai[27] = new short[] { 26, 28, 1, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80 };
        fr.ai[28] = new short[] { 27, 60 };
        fr.ai[29] = new short[] { 60, 30 };
        fr.ai[30] = new short[] { 29, 31 };
        fr.ai[31] = new short[] { 32, 30 };
        fr.ai[32] = new short[] { 31, 61, 10, 17, 22, 38, 43, 48, 139 };
        fr.ai[33] = new short[] { 61, 34 };
        fr.ai[34] = new short[] { 35, 33 };
        fr.ai[35] = new short[] { 34, 66 };
        fr.ai[36] = new short[] { 37, 24 };
        fr.ai[37] = new short[] { 36 };
        fr.ai[38] = new short[] { 67, 68, 10, 17, 22, 32, 43, 48, 139 };
        fr.ai[39] = new short[] { 72, 46, 40 };
        fr.ai[40] = new short[] { 39, 65, 41 };
        fr.ai[41] = new short[] { 42, 40, 43 };
        fr.ai[42] = new short[] { 62, 41 };
        fr.ai[43] = new short[] { 41, 44, 10, 17, 22, 32, 38, 48, 139 };
        fr.ai[44] = new short[] { 43, 45 };
        fr.ai[45] = new short[] { 44, 53 };
        fr.ai[46] = new short[] { 63, 39, 47 };
        fr.ai[47] = new short[] { 46, 48 };
        fr.ai[48] = new short[] { 47, 50, 10, 17, 22, 32, 38, 43, 139 };
        fr.ai[49] = new short[] { 50, 51 };
        fr.ai[50] = new short[] { 48, 49 };
        fr.ai[51] = new short[] { 52, 49 };
        fr.ai[52] = new short[] { 51, 64 };
        fr.ai[53] = new short[] { 54, 45 };
        fr.ai[54] = new short[] { 55, 53 };
        fr.ai[55] = new short[] { 54 };
        fr.ai[56] = new short[] { 72 };
        fr.ai[57] = new short[] { 12, 13 };
        fr.ai[58] = new short[] { 19 };
        fr.ai[59] = new short[] { 68, 24 };
        fr.ai[60] = new short[] { 28, 29 };
        fr.ai[61] = new short[] { 33, 32 };
        fr.ai[62] = new short[] { 42 };
        fr.ai[63] = new short[] { 46 };
        fr.ai[64] = new short[] { 52 };
        fr.ai[65] = new short[] { 40 };
        fr.ai[66] = new short[] { 67, 35 };
        fr.ai[67] = new short[] { 66, 38 };
        fr.ai[68] = new short[] { 59, 38 };
        fr.ai[69] = new short[] { 70, 23 };
        fr.ai[70] = new short[] { 69, 71 };
        fr.ai[71] = new short[] { 72, 70 };
        fr.ai[72] = new short[] { 71, 39, 1, 27, 91, 94, 105, 114, 125, 157, 139, 113, 80 };
        fr.ai[73] = new short[] { 1 };
        fr.ai[74] = new short[0];
        fr.ai[75] = new short[0];
        fr.ai[76] = new short[0];
        fr.ai[77] = new short[0];
        fr.ai[78] = new short[0];
        fr.ai[79] = new short[0];
        fr.ai[80] = new short[] { 81, 82, 83 };
        fr.ai[81] = new short[] { 80, 84 };
        fr.ai[82] = new short[] { 80, 85 };
        fr.ai[83] = new short[] { 80, 86 };
        fr.ai[84] = new short[] { 81, 87 };
        fr.ai[85] = new short[] { 82, 88 };
        fr.ai[86] = new short[] { 83, 89 };
        fr.ai[87] = new short[] { 84, 90 };
        fr.ai[88] = new short[] { 85, 90 };
        fr.ai[89] = new short[] { 86, 90 };
        fr.ai[90] = new short[0];
        fr.ai[91] = new short[] { 92 };
        fr.ai[92] = new short[] { 91, 93 };
        fr.ai[93] = new short[] { 92 };
        fr.ai[94] = new short[] { 95 };
        fr.ai[95] = new short[] { 94, 96 };
        fr.ai[96] = new short[] { 95, 97 };
        fr.ai[97] = new short[] { 96 };
        fr.ai[98] = new short[] { 99 };
        fr.ai[99] = new short[] { 98, 101, 100, 102 };
        fr.ai[100] = new short[] { 99, 103 };
        fr.ai[101] = new short[] { 99, 103 };
        fr.ai[102] = new short[] { 99, 103 };
        fr.ai[103] = new short[] { 101, 102, 104, 100 };
        fr.ai[104] = new short[] { 103 };
        fr.ai[105] = new short[] { 107, 106, 108 };
        fr.ai[106] = new short[] { 105, 109 };
        fr.ai[107] = new short[] { 105, 109 };
        fr.ai[108] = new short[] { 105, 109 };
        fr.ai[109] = new short[] { 106, 107, 108 };
        fr.ai[110] = new short[0];
        fr.ai[111] = new short[0];
        fr.ai[112] = new short[] { 113 };
        fr.ai[113] = new short[] { 112 };
        fr.ai[114] = new short[] { 115 };
        fr.ai[115] = new short[] { 114, 116 };
        fr.ai[116] = new short[] { 115 };
        fr.ai[117] = new short[0];
        fr.ai[118] = new short[] { 120 };
        fr.ai[119] = new short[] { 124 };
        fr.ai[120] = new short[] { 118, 121, 122, 123 };
        fr.ai[121] = new short[] { 120, 124 };
        fr.ai[122] = new short[] { 120, 124 };
        fr.ai[123] = new short[] { 120, 124 };
        fr.ai[124] = new short[] { 119, 121, 122, 123 };
        fr.ai[125] = new short[] { 126 };
        fr.ai[126] = new short[] { 125, 127 };
        fr.ai[127] = new short[] { 126, 128 };
        fr.ai[128] = new short[] { 127 };
        fr.ai[129] = new short[0];
        fr.ai[130] = new short[0];
        fr.ai[131] = new short[0];
        fr.ai[132] = new short[0];
        fr.ai[133] = new short[0];
        fr.ai[134] = new short[] { 138 };
        fr.ai[135] = new short[] { 138 };
        fr.ai[136] = new short[] { 138 };
        fr.ai[137] = new short[] { 138 };
        fr.ai[138] = new short[] { 134, 135, 136, 137 };
        fr.ai[139] = new short[] { 140 };
        fr.ai[140] = new short[] { 139, 141 };
        fr.ai[141] = new short[] { 140, 142 };
        fr.ai[142] = new short[] { 141, 143 };
        fr.ai[143] = new short[] { 142, 144 };
        fr.ai[144] = new short[] { 143, 145 };
        fr.ai[145] = new short[] { 144, 146 };
        fr.ai[146] = new short[] { 145, 147 };
        fr.ai[147] = new short[] { 146, 148 };
        fr.ai[148] = new short[] { 147 };
        fr.ai[149] = new short[0];
        fr.ai[150] = new short[0];
        fr.ai[151] = new short[0];
        fr.ai[152] = new short[0];
        fr.ai[153] = new short[0];
        fr.ai[154] = new short[0];
        fr.ai[155] = new short[0];
        fr.ai[156] = new short[0];
        fr.ai[157] = new short[] { 158, 159 };
        fr.ai[158] = new short[] { 159, 157 };
        fr.ai[159] = new short[] { 157, 158 };
        fr.ai[162] = new short[] { 165, 163, 164 };
        fr.ai[188] = new short[0];
        fr.ai[189] = new short[0];
        fr.ai[163] = new short[] { 162 };
        fr.ai[164] = (fr.ai[165] = new short[] { 162 });
        fr.ac = -1;
        fr.v = false;
        fr.p = false;
        fr.ay = new Object();
        fr.bk = new byte[190][];
        int n = 0;
        while (r(o(n, 190) ? 1 : 0)) {
            final int i = n;
            InputStream resourceAsStream = null;
            try {
                resourceAsStream = "".getClass().getResourceAsStream(new StringBuffer().append("/map/").append(i).toString());
                resourceAsStream.read(fr.bk[i] = new byte[resourceAsStream.available()]);
                "".length();
                resourceAsStream.close();
                try {
                    resourceAsStream.close();
                    "".length();
                    "".length();
                    if (o(-"   ".length())) {
                        return;
                    }
                }
                catch (final Exception ex) {
                    "".length();
                    "".length();
                    "".length();
                    if (g(-" ".length(), "   ".length())) {
                        return;
                    }
                }
            }
            catch (final Exception ex2) {
                final Throwable t;
                t.printStackTrace();
                try {
                    resourceAsStream.close();
                    "".length();
                    "".length();
                    if (o(-(fr.ax[153] ^ fr.ax[92]))) {
                        return;
                    }
                }
                catch (final Exception ex3) {
                    "".length();
                    "".length();
                    "".length();
                    if (h(" ".length(), fr.ax[140] ^ fr.ax[150])) {
                        return;
                    }
                }
            }
            finally {
                try {
                    resourceAsStream.close();
                    "".length();
                    "".length();
                    if (y(-(fr.ax[10] ^ fr.ax[156] ^ (fr.ax[125] ^ fr.ax[47])))) {
                        return;
                    }
                }
                catch (final Exception ex4) {
                    "".length();
                }
            }
            ++n;
            "".length();
            "".length();
            if (g("  ".length(), "   ".length())) {
                return;
            }
        }
        fr.at = new Image[5];
        fr.bg = new Image[5];
    }
    
    private static void l() {
        (ax = new int[353])[0] = " ".length();
        fr.ax[1] = ((0x7B ^ 0x37) & ~(0xE0 ^ 0xAC));
        fr.ax[2] = "   ".length();
        fr.ax[3] = (0x25 ^ 0x15 ^ (0x41 ^ 0x4B));
        fr.ax[4] = "  ".length();
        fr.ax[5] = (101 + 52 - 131 + 121 ^ 144 + 64 - 117 + 60);
        fr.ax[6] = (25 + 139 - 47 + 33 ^ 90 + 29 - 27 + 38);
        fr.ax[7] = (0x4A ^ 0x2A ^ (0x37 ^ 0x3B));
        fr.ax[8] = (94 + 32 - 78 + 96 ^ 117 + 30 - 107 + 133);
        fr.ax[9] = (0x94 ^ 0x91);
        fr.ax[10] = (0xAF ^ 0xC1 ^ (0x71 ^ 0x2A));
        fr.ax[11] = (168 + 63 - 88 + 112 ^ 16 + 12 + 11 + 119);
        fr.ax[12] = (0x5A ^ 0x0);
        fr.ax[13] = -" ".length();
        fr.ax[14] = (64 + 66 - 126 + 216 ^ 19 + 99 - 22 + 45);
        fr.ax[15] = 134 + 152 - 225 + 93;
        fr.ax[16] = 145 + 53 - 174 + 123;
        fr.ax[17] = 79 + 68 - 101 + 97;
        fr.ax[18] = (0x63 ^ 0x3);
        fr.ax[19] = (0xED ^ 0x9F);
        fr.ax[20] = 10 + 120 - 43 + 69;
        fr.ax[21] = 97 + 13 + 52 + 35;
        fr.ax[22] = (0x65 ^ 0x5B ^ (0xE4 ^ 0x8F));
        fr.ax[23] = (0xD3 ^ 0xAD);
        fr.ax[24] = (0x2C ^ 0x52 ^ (0xD3 ^ 0xA5));
        fr.ax[25] = 98 + 73 - 53 + 22;
        fr.ax[26] = (0xD5 ^ 0x98) + (0x51 ^ 0x66) - (0x7 ^ 0x77) + (44 + 13 + 81 + 16);
        fr.ax[27] = 130 + 96 - 199 + 146;
        fr.ax[28] = (0x7D ^ 0x64 ^ (0x7D ^ 0x62));
        fr.ax[29] = (0x26 ^ 0x3 ^ (0x3B ^ 0x14));
        fr.ax[30] = (0x48 ^ 0x7C);
        fr.ax[31] = (0x5A ^ 0x41);
        fr.ax[32] = (0x4F ^ 0x62 ^ (0xD8 ^ 0xC5));
        fr.ax[33] = (0x65 ^ 0x6A);
        fr.ax[34] = 52 + 108 - 83 + 58;
        fr.ax[35] = (0xBB ^ 0xB1 ^ (0x5C ^ 0x31));
        fr.ax[36] = 36 + 36 - 71 + 126;
        fr.ax[37] = (0x7D ^ 0x48 ^ (0x59 ^ 0x32));
        fr.ax[38] = (0x5C ^ 0x69 ^ (0xB2 ^ 0x83));
        fr.ax[39] = (0x32 ^ 0x54 ^ (0x27 ^ 0x60));
        fr.ax[40] = (31 + 24 - 43 + 138 ^ 151 + 150 - 233 + 112);
        fr.ax[41] = (0x4E ^ 0x5A ^ (0x61 ^ 0x18));
        fr.ax[42] = (0x16 ^ 0x44 ^ (0xB4 ^ 0x89));
        fr.ax[43] = (0x20 ^ 0x6);
        fr.ax[44] = (0x68 ^ 0xA);
        fr.ax[45] = (125 + 141 - 175 + 141 ^ 55 + 103 - 109 + 90);
        fr.ax[46] = (0xF1 ^ 0xB4);
        fr.ax[47] = (0x33 ^ 0x75);
        fr.ax[48] = (0x11 ^ 0x39);
        fr.ax[49] = (0xD ^ 0x46);
        fr.ax[50] = (59 + 37 + 19 + 78 ^ 32 + 50 + 49 + 10);
        fr.ax[51] = (0xF6 ^ 0xC1);
        fr.ax[52] = (0x6A ^ 0x63) + (0xF7 ^ 0xC2) - (0xB6 ^ 0x86) + (12 + 113 - 7 + 25);
        fr.ax[53] = (0xA3 ^ 0xBF) + (0x26 ^ 0x61) - -(0x50 ^ 0x5B) + (0xA1 ^ 0x91);
        fr.ax[54] = 61 + 82 - 103 + 104;
        fr.ax[55] = 9 + 5 + 35 + 90 + (0xAF ^ 0x80) - (0xBD ^ 0x85) + (0xA1 ^ 0xAE);
        fr.ax[56] = (24 + 89 - 112 + 157 ^ 26 + 136 - 93 + 84);
        fr.ax[57] = (0x74 ^ 0x55) + (0xCD ^ 0x91) - (0x93 ^ 0xAD) + (0x6C ^ 0x3F);
        fr.ax[58] = 6 + 142 - 79 + 97 + (0xD2 ^ 0xBB) - (120 + 67 - 18 + 11) + (0xFD ^ 0xA0);
        fr.ax[59] = (0x7A ^ 0x2C);
        fr.ax[60] = (0x21 ^ 0x78);
        fr.ax[61] = (0x3C ^ 0x11);
        fr.ax[62] = 70 + 136 - 126 + 68;
        fr.ax[63] = (0x86 ^ 0xA2);
        fr.ax[64] = (0xF2 ^ 0xA2);
        fr.ax[65] = (0x2F ^ 0x7B);
        fr.ax[66] = 106 + 55 - 114 + 102;
        fr.ax[67] = (0x22 ^ 0x5C) + (0x69 ^ 0x3B) - (0x2A ^ 0x7B) + (0xF ^ 0x18);
        fr.ax[68] = (0x6E ^ 0x29 ^ (0xC ^ 0x78));
        fr.ax[69] = (2 + 46 + 24 + 98 ^ 53 + 129 - 167 + 141);
        fr.ax[70] = (0xD2 ^ 0x84 ^ (0xFD ^ 0x90));
        fr.ax[71] = (0xB4 ^ 0x88);
        fr.ax[72] = 70 + 107 - 103 + 54;
        fr.ax[73] = (0x23 ^ 0x25) + (0x69 ^ 0x35) - -(0xDA ^ 0xC3) + (0x3A ^ 0x3C);
        fr.ax[74] = (0xA3 ^ 0x97) + (0xA0 ^ 0x9C) - (0x2E ^ 0x0) + (0x13 ^ 0x53);
        fr.ax[75] = (0x9C ^ 0xC0);
        fr.ax[76] = (0x76 ^ 0x1E) + (0xF ^ 0x77) - (56 + 83 - 72 + 73) + (0xEC ^ 0xC3);
        fr.ax[77] = 44 + 22 - 46 + 111 + (0xEC ^ 0x99) - (118 + 137 - 217 + 120) + (0x6D ^ 0x47);
        fr.ax[78] = (0x1C ^ 0x50) + (0xC9 ^ 0x80) - (0xCC ^ 0xB2) + (0xE8 ^ 0x86);
        fr.ax[79] = (0x16 ^ 0x27);
        fr.ax[80] = (0xD3 ^ 0x8C ^ (0xE0 ^ 0xAF));
        fr.ax[81] = (0xD0 ^ 0xA3) + (0x57 ^ 0x37) - (0x64 ^ 0x13) + (0x67 ^ 0x4D);
        fr.ax[82] = (0x4 ^ 0x4B) + (0x6C ^ 0x76) - (0xDD ^ 0x81) + (0xCA ^ 0xB1);
        fr.ax[83] = 104 + 134 - 158 + 57;
        fr.ax[84] = 109 + 64 - 144 + 126;
        fr.ax[85] = (0x9E ^ 0xA7);
        fr.ax[86] = (0x90 ^ 0xB0 ^ (0xB4 ^ 0x86));
        fr.ax[87] = (0xC3 ^ 0xAA ^ (0x1D ^ 0x23));
        fr.ax[88] = (0x4E ^ 0x52);
        fr.ax[89] = 193 + 66 - 231 + 218;
        fr.ax[90] = 42 + 80 + 38 + 19;
        fr.ax[91] = (0xC7 ^ 0x80);
        fr.ax[92] = (0xB4 ^ 0x9B);
        fr.ax[93] = (0x26 ^ 0x7D ^ (0x70 ^ 0x5));
        fr.ax[94] = (0x5E ^ 0x1B ^ (0x3A ^ 0x47));
        fr.ax[95] = (0x11 ^ 0x1C);
        fr.ax[96] = (220 + 99 - 69 + 0 ^ 98 + 43 - 133 + 134);
        fr.ax[97] = 105 + 96 - 96 + 100;
        fr.ax[98] = (0x59 ^ 0x4B) + (0x41 ^ 0x4) - (0x39 ^ 0x1D) + (0xE0 ^ 0x84);
        fr.ax[99] = (0x7B ^ 0x49) + (0x4D ^ 0x13) - (0 + 104 - 30 + 57) + (39 + 116 - 134 + 129);
        fr.ax[100] = 2 + 32 + 17 + 116;
        fr.ax[101] = (0x10 ^ 0x50 ^ (0x22 ^ 0x78));
        fr.ax[102] = (0xC ^ 0x3F) + (0x17 ^ 0x65) - (0xF ^ 0x42) + (0x5D ^ 0x68);
        fr.ax[103] = (146 + 113 - 184 + 74 ^ 130 + 144 - 197 + 79);
        fr.ax[104] = -((0xAE ^ 0x8B) + (0xE9 ^ 0x87) - (93 + 11 - 59 + 90) + (0x1B ^ 0x68));
        fr.ax[105] = (0xFB ^ 0x95 ^ (0x79 ^ 0x8));
        fr.ax[106] = -(0x53 ^ 0x7F);
        fr.ax[107] = (0x47 ^ 0x22);
        fr.ax[108] = (0x14 ^ 0x3D);
        fr.ax[109] = (0x86 ^ 0xAA ^ (0xFD ^ 0xA2));
        fr.ax[110] = (0xBE ^ 0xAF);
        fr.ax[111] = -(12 + 173 - 54 + 49 ^ 92 + 45 - 54 + 79);
        fr.ax[112] = (0xC5 ^ 0x8A);
        fr.ax[113] = (198 + 207 - 180 + 9 ^ 150 + 101 - 242 + 159);
        fr.ax[114] = (0x37 ^ 0x3B);
        fr.ax[115] = (0x7F ^ 0x6);
        fr.ax[116] = 86 + 117 - 200 + 136;
        fr.ax[117] = 74 + 92 - 70 + 46;
        fr.ax[118] = (0xBA ^ 0x92 ^ (0x83 ^ 0x8B));
        fr.ax[119] = (0x20 ^ 0x44);
        fr.ax[120] = (0x47 ^ 0x62);
        fr.ax[121] = (0xD4 ^ 0xB2);
        fr.ax[122] = 29 + 49 - 73 + 172;
        fr.ax[123] = 111 + 118 - 55 + 16;
        fr.ax[124] = (0xC0 ^ 0x8D);
        fr.ax[125] = (149 + 6 + 6 + 37 ^ 120 + 132 - 125 + 15);
        fr.ax[126] = (0xE1 ^ 0x90);
        fr.ax[127] = -(0x24 ^ 0x28);
        fr.ax[128] = (114 + 134 - 171 + 101 ^ 138 + 47 - 147 + 126);
        fr.ax[129] = -(0x79 ^ 0x2E);
        fr.ax[130] = 134 + 138 - 232 + 116 + (0xB1 ^ 0x86) - (0x28 ^ 0x7) + (0xB4 ^ 0xA7);
        fr.ax[131] = (0x92 ^ 0xBD) + (0x20 ^ 0x7C) - (0x23 ^ 0x24) + (0xB9 ^ 0xA7);
        fr.ax[132] = (0xB4 ^ 0xBD ^ (0xF2 ^ 0xBA));
        fr.ax[133] = (0x29 ^ 0x39) + (115 + 99 - 151 + 79) - (0x3B ^ 0x2F) + (0x9B ^ 0xBA);
        fr.ax[134] = (0x32 ^ 0x3) + (0xBF ^ 0xB7) - (0x96 ^ 0x9B) + (44 + 39 + 18 + 27);
        fr.ax[135] = (0xE9 ^ 0xB1);
        fr.ax[136] = (0x18 ^ 0x35 ^ (0xA3 ^ 0xA5));
        fr.ax[137] = (0xD1 ^ 0x84 ^ (0x70 ^ 0x59));
        fr.ax[138] = (0xA8 ^ 0x9A);
        fr.ax[139] = 174 + 157 - 209 + 85;
        fr.ax[140] = (0 + 29 + 42 + 103 ^ 170 + 9 - 2 + 2);
        fr.ax[141] = (0x8C ^ 0x87 ^ (0x7B ^ 0x53));
        fr.ax[142] = 175 + 35 - 76 + 57;
        fr.ax[143] = 96 + 119 - 209 + 181;
        fr.ax[144] = (0x6B ^ 0x0) + (0x53 ^ 0x39) - (0x1F ^ 0x4B) + (0x4 ^ 0x13);
        fr.ax[145] = (67 + 166 - 97 + 36 ^ 105 + 146 - 118 + 34);
        fr.ax[146] = (59 + 118 - 33 + 46 ^ 128 + 31 - 105 + 122);
        fr.ax[147] = (0x69 ^ 0x7A);
        fr.ax[148] = (0x85 ^ 0xBA ^ (0x4A ^ 0x60));
        fr.ax[149] = (0x7 ^ 0x5B ^ (0x70 ^ 0x3B));
        fr.ax[150] = (79 + 15 + 54 + 42 ^ 81 + 126 - 177 + 137);
        fr.ax[151] = (4 + 5 + 41 + 81 ^ 107 + 148 - 206 + 108);
        fr.ax[152] = (0x96 ^ 0xB1);
        fr.ax[153] = (0xF ^ 0x25);
        fr.ax[154] = (0x1D ^ 0x31);
        fr.ax[155] = (34 + 67 - 25 + 60 ^ 105 + 118 - 91 + 50);
        fr.ax[156] = (0x12 ^ 0x7C ^ (0x4A ^ 0x1B));
        fr.ax[157] = (0x5B ^ 0x1B);
        fr.ax[158] = (0xC5 ^ 0xBF ^ (0x23 ^ 0x1A));
        fr.ax[159] = (0xE1 ^ 0xA5);
        fr.ax[160] = (0x29 ^ 0x68 ^ (0x70 ^ 0x78));
        fr.ax[161] = (0xDE ^ 0x94);
        fr.ax[162] = (151 + 221 - 291 + 162 ^ 181 + 0 - 56 + 64);
        fr.ax[163] = (41 + 26 + 84 + 82 ^ 60 + 179 - 211 + 159);
        fr.ax[164] = (0x23 ^ 0x70);
        fr.ax[165] = (0x7 ^ 0x5C);
        fr.ax[166] = (0x4B ^ 0x70 ^ (0x17 ^ 0x71));
        fr.ax[167] = (0xD0 ^ 0x8F);
        fr.ax[168] = (29 + 101 - 36 + 122 ^ 65 + 108 - 9 + 12);
        fr.ax[169] = (19 + 28 - 45 + 230 ^ 8 + 89 + 17 + 15);
        fr.ax[170] = (169 + 157 - 165 + 14 ^ 118 + 143 - 153 + 89);
        fr.ax[171] = (0x38 ^ 0x5F ^ (0x70 ^ 0x7C));
        fr.ax[172] = (0x3B ^ 0x4B ^ (0x38 ^ 0x26));
        fr.ax[173] = (0x3F ^ 0x60 ^ (0x6B ^ 0x44));
        fr.ax[174] = (0x5B ^ 0x2E);
        fr.ax[175] = (0x3C ^ 0x4A);
        fr.ax[176] = (0x7C ^ 0x9 ^ "  ".length());
        fr.ax[177] = (0x70 ^ 0x58 ^ (0xF4 ^ 0xA4));
        fr.ax[178] = (0x53 ^ 0x29);
        fr.ax[179] = (0xF1 ^ 0x8A);
        fr.ax[180] = (0x4A ^ 0x37);
        fr.ax[181] = 104 + 32 + 13 + 10;
        fr.ax[182] = 106 + 68 - 62 + 26;
        fr.ax[183] = (0x80 ^ 0xA1) + (0x53 ^ 0x65) - -(0xB6 ^ 0x81) + (0xF9 ^ 0xA5);
        fr.ax[184] = (0xC4 ^ 0xBE) + (0x2F ^ 0x6) - (56 + 111 - 90 + 63) + (70 + 159 - 66 + 7);
        fr.ax[185] = 128 + 155 - 264 + 145;
        fr.ax[186] = (0x8C ^ 0xBE) + (0x12 ^ 0x6) - -(0x6C ^ 0x5C) + (0x22 ^ 0x8);
        fr.ax[187] = 43 + 120 - 120 + 156 + (0x21 ^ 0xA) - (102 + 138 - 186 + 98) + (96 + 10 + 16 + 8);
        fr.ax[188] = (0x83 ^ 0xC3) + (123 + 83 - 100 + 31) - (0x3C ^ 0x69) + (0x15 ^ 0x2E);
        fr.ax[189] = 27 + 76 + 10 + 63;
        fr.ax[190] = 152 + 165 - 142 + 3;
        fr.ax[191] = 162 + 150 - 224 + 82;
        fr.ax[192] = 26 + 19 + 88 + 47;
        fr.ax[193] = (0xAC ^ 0xAB) + (0x6F ^ 0x56) - (0x10 ^ 0x19) + (0xC9 ^ 0xB7);
        fr.ax[194] = (0x3A ^ 0x24) + (0x7D ^ 0x75) - -(0xA8 ^ 0x84) + (0x5D ^ 0x39);
        fr.ax[195] = 166 + 131 - 291 + 179;
        fr.ax[196] = (0xC ^ 0x2C) + (31 + 153 - 17 + 5) - (0x2F ^ 0x65) + (0x53 ^ 0x6B);
        fr.ax[197] = 2 + 53 - 47 + 169 + ((0x71 ^ 0x4A) & ~(0x60 ^ 0x5B)) - (92 + 60 - 31 + 11) + (47 + 136 - 158 + 118);
        fr.ax[198] = (0x58 ^ 0x60) + (0x5E ^ 0x1) - -(0x1F ^ 0x1) + (0x42 ^ 0x4A);
        fr.ax[199] = 104 + 64 - 48 + 9 + (66 + 82 - 114 + 97) - (154 + 133 - 262 + 141) + (0xE2 ^ 0x80);
        fr.ax[200] = (0xAC ^ 0x88) + (0x5C ^ 0x45) - -(0x70 ^ 0x3C) + (0x9D ^ 0xA4);
        fr.ax[201] = 184 + 148 - 252 + 115;
        fr.ax[202] = 97 + 75 - 51 + 17 + (0x17 ^ 0x2) - (0xA3 ^ 0xB1) + (0x77 ^ 0x40);
        fr.ax[203] = (0xC5 ^ 0xA7) + (0x14 ^ 0x39) - " ".length() + (0x3B ^ 0x3);
        fr.ax[204] = 6 + 60 + 50 + 60 + (82 + 5 - 61 + 104) - (137 + 117 - 152 + 89) + (0x47 ^ 0x13);
        fr.ax[205] = (0x3D ^ 0x5B) + (0x17 ^ 0x2A) - (0x33 ^ 0x11) + (0x2D ^ 0x6A);
        fr.ax[206] = 147 + 22 - 94 + 126;
        fr.ax[207] = 69 + 45 - 65 + 131 + (0x7E ^ 0x1E) - (178 + 7 - 117 + 119) + (0xD2 ^ 0xA3);
        fr.ax[208] = (0xFB ^ 0xC6) + (82 + 193 - 147 + 67) - (129 + 24 - 84 + 177) + (4 + 147 - 34 + 76);
        fr.ax[209] = 64 + 131 - 127 + 136;
        fr.ax[210] = (0x78 ^ 0x4B) + (0xE2 ^ 0x83) - -(0x43 ^ 0x65) + (0x75 ^ 0x61);
        fr.ax[211] = (0xA2 ^ 0x8D) + (0x45 ^ 0x1C) - (0x39 ^ 0xC) + (129 + 50 - 86 + 46);
        fr.ax[212] = 127 + 202 - 101 + 17;
        fr.ax[213] = (0xF3 ^ 0x98) + (132 + 46 - 97 + 95) - (0xDA ^ 0x9D) + (0x44 ^ 0x4F);
        fr.ax[214] = 191 + 171 - 279 + 132;
        fr.ax[215] = 151 + 120 - 201 + 91 + (200 + 6 - 113 + 149) - (93 + 60 - 47 + 109) + (0xD9 ^ 0x98);
        fr.ax[216] = 159 + 10 - 128 + 120;
        fr.ax[217] = 207 + 109 - 249 + 173;
        fr.ax[218] = (0xDB ^ 0x8D) + (0x62 ^ 0x7B) - (0x7C ^ 0x1F) + (140 + 19 - 75 + 70);
        fr.ax[219] = 0 + 82 + 67 + 16 + (0x6B ^ 0x4D) - (0xA ^ 0x4D) + (0xF5 ^ 0xA5);
        fr.ax[220] = 85 + 133 - 112 + 59;
        fr.ax[221] = 14 + 6 + 132 + 6 + (0xF2 ^ 0x92) - (9 + 43 + 37 + 38) + (0x16 ^ 0x7A);
        fr.ax[222] = 74 + 139 - 90 + 23 + (100 + 81 - 44 + 51) - (0xFFFF83E5 & 0x7D1B) + (7 + 61 - 36 + 134);
        fr.ax[223] = 134 + 3 - 68 + 99;
        fr.ax[224] = 33 + 49 + 86 + 1;
        fr.ax[225] = 250 + 105 - 150 + 49;
        fr.ax[226] = 205 + 25 - 56 + 52;
        fr.ax[227] = (0xCC ^ 0xC1) + (0xF0 ^ 0xAD) - -(0x46 ^ 0x35) + (0x7 ^ 0x13);
        fr.ax[228] = 191 + 151 - 311 + 165 + (90 + 43 - 77 + 150) - (0xFFFFB1FD & 0x4F6F) + (174 + 73 - 120 + 52);
        fr.ax[229] = -(0xBB ^ 0xAF);
        fr.ax[230] = 6 + 23 + 200 + 10;
        fr.ax[231] = (0x4B ^ 0xD) + "   ".length() - -(0x99 ^ 0xB0) + (0x3C ^ 0x62);
        fr.ax[232] = -(0xA8 ^ 0xBF);
        fr.ax[233] = 129 + 20 + 60 + 12;
        fr.ax[234] = -(0x76 ^ 0x42);
        fr.ax[235] = -(-(0xFFFFD98F & 0x76F5) & (0xFFFFD7BE & 0x7EFF));
        fr.ax[236] = (0xFFFFEFFF & 0x77FF);
        fr.ax[237] = -(-(0xFFFFDD2D & 0x27DF) & (0xFFFF9F1F & 0x7FFF));
        fr.ax[238] = (-(0x48 ^ 0x41) & (0xFFFFFFDF & 0x7FFF));
        fr.ax[239] = 124 + 160 - 40 + 11;
        fr.ax[240] = -(0xB ^ 0x17);
        fr.ax[241] = -(-(0xFFFFBE9F & 0x4FED) & (-1 & 0x5E8D));
        fr.ax[242] = (-(0xFFFFA50D & 0x5BF3) & (0xFFFFFFFE & 0x7BFF));
        fr.ax[243] = -(-(0xFFFFDCF5 & 0x6BDF) & (0xFFFFEDF7 & 0x5BDF));
        fr.ax[244] = (-(0xFFFFCFC5 & 0x703B) & (-1 & 0x7BFF));
        fr.ax[245] = -(0x86 ^ 0xAE);
        fr.ax[246] = (0xAA ^ 0xA1) + (59 + 149 - 158 + 110) - (0xC4 ^ 0x9E) + (33 + 126 - 135 + 133);
        fr.ax[247] = 137 + 100 - 157 + 134;
        fr.ax[248] = -(0xFFFFB9C9 & 0x4E37);
        fr.ax[249] = (0xFFFFF9FD & 0x3F7F);
        fr.ax[250] = -(-(0xFFFFB363 & 0x6EFF) & (0xFFFFEFF6 & 0x72EF));
        fr.ax[251] = (-1 & 0x79FF);
        fr.ax[252] = -(0x42 ^ 0x39);
        fr.ax[253] = -(-(0xFFFFFAB7 & 0x77DB) & (0xFFFFFBF7 & 0x7EBF));
        fr.ax[254] = (-(0xD6 ^ 0xC7) & (0xFFFFFEFD & 0x7DFF));
        fr.ax[255] = -(-(0xFFFFD7F9 & 0x7D4F) & (0xFFFFDDDB & 0x7F6E));
        fr.ax[256] = (-(0xFFFFF2FB & 0xF35) & (0xFFFFFFFB & 0x7FFD));
        fr.ax[257] = 50 + 87 + 3 + 73;
        fr.ax[258] = 110 + 74 - 122 + 103 + (114 + 113 - 172 + 102) - (0x74 ^ 0xC) + (0x1 ^ 0x22);
        fr.ax[259] = 220 + 79 - 277 + 211;
        fr.ax[260] = (0xF ^ 0x4) + (0x98 ^ 0x88) - -(0x6D ^ 0x56) + (40 + 108 - 51 + 48);
        fr.ax[261] = 30 + 78 + 48 + 88;
        fr.ax[262] = 130 + 158 - 177 + 70 + (0x59 ^ 0x20) - (0xDB ^ 0xBC) + (0x99 ^ 0x84);
        fr.ax[263] = -(0xFFFFFAB3 & 0x55DD);
        fr.ax[264] = (-(0xFFFF975F & 0x6AE7) & (0xFFFFDFFF & 0x7FFF));
        fr.ax[265] = -((0x6E ^ 0x55) + (112 + 32 - 68 + 75) - (0x50 ^ 0x44) + (0x49 ^ 0x4D));
        fr.ax[266] = (-(0x95 ^ 0x84) & (0xFFFFFFFB & 0x2DFD));
        fr.ax[267] = 138 + 62 - 168 + 179;
        fr.ax[268] = (-(0xFFFFFEE7 & 0x4DBD) & (0xFFFFDFAE & 0x6DFF));
        fr.ax[269] = 96 + 81 - 119 + 161;
        fr.ax[270] = 80 + 31 + 35 + 64;
        fr.ax[271] = 181 + 26 - 131 + 142;
        fr.ax[272] = -(-(0xFFFFA2CF & 0x7FF3) & (0xFFFFBFDF & 0x6FFA));
        fr.ax[273] = (-(0xFFFFBA65 & 0x77FB) & (0xFFFFFF7F & 0x7FF7));
        fr.ax[274] = -(0xFFFFB9F7 & 0x6E8B);
        fr.ax[275] = (0xFFFFECAF & 0x13BD2);
        fr.ax[276] = -(0xFFFF93FA & 0x7CFF);
        fr.ax[277] = (-(0xFFFFFFEF & 0x2011) & (0xFFFFFEFD & 0x7FFF));
        fr.ax[278] = -(0x74 ^ 0x25);
        fr.ax[279] = (-(0xFFFFF9AD & 0x36D3) & (0xFFFFFFDB & 0xFEF7));
        fr.ax[280] = -(-(0xFFFFBEFF & 0x45BB) & (0xFFFFBFFF & 0x77BF));
        fr.ax[281] = (0xFFFFF7F7 & 0x7FEE);
        fr.ax[282] = -(-(0xFFFFDD77 & 0x36E9) & (0xFFFFFD7F & 0x3FFF));
        fr.ax[283] = (-1 & 0x26DFF);
        fr.ax[284] = -(-(0xFFFF9D6A & 0x6F9F) & (0xFFFFFFCF & 0x7DFF));
        fr.ax[285] = (0xFFFFF5D7 & 0x47AED);
        fr.ax[286] = -(-(0xFFFFEFB3 & 0x76FD) & (0xFFFFEFFF & 0x7EB9));
        fr.ax[287] = (-(0xFFFFBD77 & 0x46D9) & (0xFFFFFFDF & 0x6FFB));
        fr.ax[288] = -(0x52 ^ 0x9 ^ (0x69 ^ 0x4F));
        fr.ax[289] = (0xFFFFE7FE & 0x87BFF);
        fr.ax[290] = (-(0xFFFFFBED & 0x747B) & (0xFFFFFD7E & 0x73F9));
        fr.ax[291] = (0x6A ^ 0x3) + (95 + 136 - 94 + 7) - (0x94 ^ 0x8B) + (0x1A ^ 0x16);
        fr.ax[292] = -(152 + 82 - 168 + 115 ^ 144 + 71 - 192 + 126);
        fr.ax[293] = -(-(0xFFFFFAEC & 0x2DBB) & (0xFFFFEFEF & 0x3EBF));
        fr.ax[294] = (0xFFFFB7FF & 0x4FFF);
        fr.ax[295] = -(82 + 86 - 53 + 37 ^ 10 + 40 - 46 + 140);
        fr.ax[296] = -(-(0xFFFF8FDD & 0x71FB) & (0xFFFFDDFF & 0x7FF9));
        fr.ax[297] = (0xFFFFDEAE & 0x7FFF);
        fr.ax[298] = (-1 & 0xFFFFFF);
        fr.ax[299] = (0xFFFFA71E & 0x59FD);
        fr.ax[300] = -(-(0xFFFFF7CD & 0x4A3B) & (0xFFFFCE5F & 0x7FEF));
        fr.ax[301] = (-(0xFFFFE803 & 0x77FD) & (0xFFFFFFD7 & 0x7F6F));
        fr.ax[302] = -(-(0xFFFFDBBD & 0x36FF) & (0xFFFFFBBD & 0x7EFF));
        fr.ax[303] = (-(0xFFFF8701 & 0x7CFF) & (-1 & 0xFF7FFF));
        fr.ax[304] = (-1 & 0xFFFF);
        fr.ax[305] = -(0xFFFFD1F5 & 0x6E4F);
        fr.ax[306] = (-(0xFFFFAD6F & 0x769B) & (0xFFFFFDFF & 0x7FFF));
        fr.ax[307] = -(-(0xFFFFFDCC & 0x52F7) & (0xFFFFF6FF & 0x7FCF));
        fr.ax[308] = (-(0xE8 ^ 0xAD) & (-1 & 0xFF3FFF));
        fr.ax[309] = -(0xF4 ^ 0xBF);
        fr.ax[310] = (-1 & 0xFF7F);
        fr.ax[311] = -(-(0xFFFF99AB & 0x675D) & (0xFFFF9D9D & 0x7F6F));
        fr.ax[312] = (0xFFFFFFFC & 0x1FEF);
        fr.ax[313] = (0x62 ^ 0x70) + (0x2 ^ 0x4B) - (0x20 ^ 0x6C) + (102 + 102 - 101 + 35);
        fr.ax[314] = -(-(0xFFFFDFFF & 0x663D) & (0xFFFFD7FD & 0x7F3F));
        fr.ax[315] = (0xFFFFFDFF & 0x737F);
        fr.ax[316] = -(0xFFFFFCC7 & 0x739);
        fr.ax[317] = (0xFFFFF6FF & 0x6F7F);
        fr.ax[318] = -(-(0xFFFFEF9D & 0x347E) & (0xFFFFFD1F & 0x66FF));
        fr.ax[319] = (-(0xFFFFBFFD & 0x7D43) & (-1 & 0x7FFF));
        fr.ax[320] = -(0xFFFFFE15 & 0x73FB);
        fr.ax[321] = (-(0xFFFFCDCF & 0x3A72) & (0xFFFFFFFB & 0x7B7F));
        fr.ax[322] = -(-(0x68 ^ 0x6D) & (0xFFFFFDBF & 0x77DF));
        fr.ax[323] = (-(0xF ^ 0x2E) & (-1 & 0x70075BA));
        fr.ax[324] = -(-(0xFFFFDDFF & 0x6283) & (0xFFFFFFFE & 0x6FE7));
        fr.ax[325] = (0xFFFFBFE3 & 0xF06F7F);
        fr.ax[326] = -(-(0xFFFFE5FD & 0x3A37) & (0xFFFFFEFF & 0x7DFF));
        fr.ax[327] = (0xFFFFDECE & 0x5007DFB);
        fr.ax[328] = -(-(0xFFFFCFA7 & 0x3B7D) & (-1 & 0x7FF7));
        fr.ax[329] = (0xFFFFFEF6 & 0x2075DB);
        fr.ax[330] = -(-(0xFFFFBAEA & 0x6FF7) & (0xFFFFFEFF & 0x7FFF));
        fr.ax[331] = (-(142 + 47 - 127 + 131) & (0xFFFFD5FF & 0x8007EDD));
        fr.ax[332] = -(-(0xFFFFE2FF & 0x5D01) & (0xFFFFFF7E & 0x7DFD));
        fr.ax[333] = (-(0xFFFFDB1F & 0x66E5) & (0xFFFFFF7F & 0x19007FFF));
        fr.ax[334] = -(0xFFFFBFFD & 0x6936);
        fr.ax[335] = (0xFFFFE973 & 0x33FBF);
        fr.ax[336] = -(0xFFFFBEBB & 0x4547);
        fr.ax[337] = (-"  ".length() & (0xFFFFDFD7 & 0x7FBF));
        fr.ax[338] = -(0x1E ^ 0x33 ^ (0x19 ^ 0x7D));
        fr.ax[339] = (-(0xFFFFB5AF & 0x6E71) & (0xFFFFFFFB & 0x107FFF));
        fr.ax[340] = -(-(0xFFFFDDAA & 0x335D) & (0xFFFF9FDF & 0x7DFF));
        fr.ax[341] = (-(0xFFFFF8BD & 0x6763) & (-1 & 0x56CF7));
        fr.ax[342] = -(-(0xFFFFDDF3 & 0x3AFD) & (0xFFFFFEF9 & 0x7FFF));
        fr.ax[343] = (-(0xFFFFF26F & 0x1DF3) & (0xFFFFFF7F & 0x676EA));
        fr.ax[344] = -(0xFFFFCB8D & 0x7677);
        fr.ax[345] = (0xFFFFFAFF & 0x6FFE);
        fr.ax[346] = -(-(0xFFFFCFF3 & 0x3C7F) & (0xFFFFFF77 & 0x1DFF));
        fr.ax[347] = -(0xDA ^ 0xBB);
        fr.ax[348] = (-(0x37 ^ 0x26) & (0xFFFFBEFB & 0x507B7E));
        fr.ax[349] = -(-(0xFFFFDF6F & 0x619D) & (0xFFFFF7FF & 0x5DEF));
        fr.ax[350] = (-" ".length() & (0xFFFFFFFA & 0x8677FF));
        fr.ax[351] = -(0x87 ^ 0x8C ^ (0x3B ^ 0xE));
        fr.ax[352] = -"  ".length();
    }
    
    public static boolean a(final int n, int j, final int[] array) {
        j = j(j);
        if (r(x(a(n, j, 2) ? 1 : 0) ? 1 : 0)) {
            array[0] = n;
            array[1] = j;
            return true;
        }
        int n2 = 0;
        while (r(o(n2, 5) ? 1 : 0)) {
            final int n3 = j + n2 * 24;
            int n4 = 0;
            while (r(o(n4, 5) ? 1 : 0)) {
                final int n5 = n - 48 + n4 * 24;
                if (r(o(n3, fr.a) ? 1 : 0) && r(r(n5, 24) ? 1 : 0) && r(o(n5, fr.k - 24) ? 1 : 0) && r(x(a(n5, n3, 2) ? 1 : 0) ? 1 : 0)) {
                    array[0] = n5;
                    array[1] = n3;
                    return true;
                }
                ++n4;
                "".length();
                "".length();
                if (o(-(fr.ax[107] ^ fr.ax[11]))) {
                    return ((fr.ax[183] ^ fr.ax[184]) & (fr.ax[69] ^ fr.ax[140] ^ fr.ax[13])) != 0x0;
                }
            }
            ++n2;
            "".length();
            "".length();
            if (u(fr.ax[185] ^ fr.ax[186])) {
                return ((fr.ax[187] ^ fr.ax[182]) & (fr.ax[164] ^ fr.ax[9] ^ fr.ax[13])) != 0x0;
            }
        }
        return false;
    }
    
    public static void j() {
        try {
            final DataInputStream dataInputStream;
            fr.y = (char)(dataInputStream = new DataInputStream(new ByteArrayInputStream(fr.bk[fr.s]))).readUnsignedByte();
            fr.w = (char)dataInputStream.readUnsignedByte();
            fr.q = new char[dataInputStream.available()];
            int n = 0;
            while (r(o(n, fr.y * fr.w) ? 1 : 0)) {
                fr.q[n] = (char)dataInputStream.readUnsignedByte();
                ++n;
                "".length();
                "".length();
                if (b((Object)null)) {
                    return;
                }
            }
            fr.m = new int[fr.q.length];
        }
        catch (final IOException ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    public static final int e(final int n, final int n2) {
        try {
            return fr.m[n2 / fr.af * fr.y + n / fr.af];
        }
        catch (final Exception ex) {
            "".length();
            return 1000;
        }
    }
    
    public static void l(int n) {
        fr.a = fr.w * fr.af;
        fr.k = fr.y * fr.af;
        try {
            int i = 0;
            while (r(o(i, fr.y * fr.w) ? 1 : 0)) {
                if (r(d(fr.b) ? 1 : 0) && r(d(fr.b.get(String.valueOf(i))) ? 1 : 0)) {
                    final int[] m = fr.m;
                    final int n2 = i;
                    m[n2] |= 0x2;
                }
                if (r(j(n, 4) ? 1 : 0)) {
                    if (!r(q(fr.q[i], 1) ? 1 : 0) || !r(q(fr.q[i], 2) ? 1 : 0) || !r(q(fr.q[i], 3) ? 1 : 0) || !r(q(fr.q[i], 4) ? 1 : 0) || !r(q(fr.q[i], 5) ? 1 : 0) || !r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 9) ? 1 : 0) || !r(q(fr.q[i], 10) ? 1 : 0) || !r(q(fr.q[i], 79) ? 1 : 0) || !r(q(fr.q[i], 80) ? 1 : 0) || !r(q(fr.q[i], 13) ? 1 : 0) || !r(q(fr.q[i], 14) ? 1 : 0) || !r(q(fr.q[i], 43) ? 1 : 0) || !r(q(fr.q[i], 44) ? 1 : 0) || !r(q(fr.q[i], 45) ? 1 : 0) || r(j(fr.q[i], 50) ? 1 : 0)) {
                        final int[] j = fr.m;
                        final int n3 = i;
                        j[n3] |= 0x2;
                    }
                    if (!r(q(fr.q[i], 9) ? 1 : 0) || r(j(fr.q[i], 11) ? 1 : 0)) {
                        final int[] k = fr.m;
                        final int n4 = i;
                        k[n4] |= 0x4;
                    }
                    if (!r(q(fr.q[i], 10) ? 1 : 0) || r(j(fr.q[i], 12) ? 1 : 0)) {
                        final int[] l = fr.m;
                        final int n5 = i;
                        l[n5] |= 0x8;
                    }
                    if (!r(q(fr.q[i], 13) ? 1 : 0) || r(j(fr.q[i], 14) ? 1 : 0)) {
                        final int[] m2 = fr.m;
                        final int n6 = i;
                        m2[n6] |= 0x400;
                    }
                    if (!r(q(fr.q[i], 76) ? 1 : 0) || r(j(fr.q[i], 77) ? 1 : 0)) {
                        final int[] m3 = fr.m;
                        final int n7 = i;
                        m3[n7] |= 0x40;
                        if (r(j(fr.q[i], 78) ? 1 : 0)) {
                            final int[] m4 = fr.m;
                            final int n8 = i;
                            m4[n8] |= 0x1000;
                        }
                    }
                }
                if (r(j(n, 1) ? 1 : 0)) {
                    if (r(j(fr.q[i], 22) ? 1 : 0)) {
                        fr.ao = fr.q[i] - '\u0001';
                    }
                    if (!r(q(fr.q[i], 1) ? 1 : 0) || !r(q(fr.q[i], 2) ? 1 : 0) || !r(q(fr.q[i], 3) ? 1 : 0) || !r(q(fr.q[i], 4) ? 1 : 0) || !r(q(fr.q[i], 5) ? 1 : 0) || !r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 7) ? 1 : 0) || !r(q(fr.q[i], 36) ? 1 : 0) || !r(q(fr.q[i], 37) ? 1 : 0) || !r(q(fr.q[i], 54) ? 1 : 0) || !r(q(fr.q[i], 91) ? 1 : 0) || !r(q(fr.q[i], 92) ? 1 : 0) || !r(q(fr.q[i], 93) ? 1 : 0) || !r(q(fr.q[i], 94) ? 1 : 0) || !r(q(fr.q[i], 73) ? 1 : 0) || !r(q(fr.q[i], 74) ? 1 : 0) || !r(q(fr.q[i], 97) ? 1 : 0) || !r(q(fr.q[i], 98) ? 1 : 0) || !r(q(fr.q[i], 116) ? 1 : 0) || !r(q(fr.q[i], 117) ? 1 : 0) || !r(q(fr.q[i], 118) ? 1 : 0) || !r(q(fr.q[i], 120) ? 1 : 0) || r(j(fr.q[i], 61) ? 1 : 0)) {
                        final int[] m5 = fr.m;
                        final int n9 = i;
                        m5[n9] |= 0x2;
                    }
                    if (!r(q(fr.q[i], 2) ? 1 : 0) || !r(q(fr.q[i], 3) ? 1 : 0) || !r(q(fr.q[i], 4) ? 1 : 0) || !r(q(fr.q[i], 5) ? 1 : 0) || !r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 20) ? 1 : 0) || !r(q(fr.q[i], 21) ? 1 : 0) || !r(q(fr.q[i], 22) ? 1 : 0) || !r(q(fr.q[i], 23) ? 1 : 0) || !r(q(fr.q[i], 36) ? 1 : 0) || !r(q(fr.q[i], 37) ? 1 : 0) || !r(q(fr.q[i], 38) ? 1 : 0) || !r(q(fr.q[i], 39) ? 1 : 0) || r(j(fr.q[i], 61) ? 1 : 0)) {
                        final int[] m6 = fr.m;
                        final int n10 = i;
                        m6[n10] |= 0x1000;
                    }
                    if (!r(q(fr.q[i], 8) ? 1 : 0) || !r(q(fr.q[i], 9) ? 1 : 0) || !r(q(fr.q[i], 10) ? 1 : 0) || !r(q(fr.q[i], 12) ? 1 : 0) || !r(q(fr.q[i], 13) ? 1 : 0) || !r(q(fr.q[i], 14) ? 1 : 0) || r(j(fr.q[i], 30) ? 1 : 0)) {
                        final int[] m7 = fr.m;
                        final int n11 = i;
                        m7[n11] |= 0x10;
                    }
                    if (r(j(fr.q[i], 17) ? 1 : 0)) {
                        final int[] m8 = fr.m;
                        final int n12 = i;
                        m8[n12] |= 0x20;
                    }
                    if (r(j(fr.q[i], 18) ? 1 : 0)) {
                        final int[] m9 = fr.m;
                        final int n13 = i;
                        m9[n13] |= 0x80;
                    }
                    if (!r(q(fr.q[i], 37) ? 1 : 0) || !r(q(fr.q[i], 38) ? 1 : 0) || r(j(fr.q[i], 61) ? 1 : 0)) {
                        final int[] m10 = fr.m;
                        final int n14 = i;
                        m10[n14] |= 0x4;
                    }
                    if (!r(q(fr.q[i], 36) ? 1 : 0) || !r(q(fr.q[i], 39) ? 1 : 0) || r(j(fr.q[i], 61) ? 1 : 0)) {
                        final int[] m11 = fr.m;
                        final int n15 = i;
                        m11[n15] |= 0x8;
                    }
                    if (r(j(fr.q[i], 19) ? 1 : 0)) {
                        final int[] m12 = fr.m;
                        final int n16 = i;
                        m12[n16] |= 0x40;
                        if (r(j(fr.m[i - fr.y] & 0x1000, 4096) ? 1 : 0)) {
                            final int[] m13 = fr.m;
                            final int n17 = i;
                            m13[n17] |= 0x1000;
                        }
                    }
                    if (r(j(fr.q[i], 35) ? 1 : 0)) {
                        final int[] m14 = fr.m;
                        final int n18 = i;
                        m14[n18] |= 0x800;
                    }
                    if (r(j(fr.q[i], 7) ? 1 : 0)) {
                        final int[] m15 = fr.m;
                        final int n19 = i;
                        m15[n19] |= 0x400;
                    }
                    if (!r(q(fr.q[i], 32) ? 1 : 0) || !r(q(fr.q[i], 33) ? 1 : 0) || r(j(fr.q[i], 34) ? 1 : 0)) {
                        final int[] m16 = fr.m;
                        final int n20 = i;
                        m16[n20] |= 0x100;
                    }
                }
                if (r(j(n, 2) ? 1 : 0)) {
                    if (!r(q(fr.q[i], 22) ? 1 : 0) || !r(q(fr.q[i], 103) ? 1 : 0) || r(j(fr.q[i], 111) ? 1 : 0)) {
                        fr.ao = fr.q[i] - '\u0001';
                    }
                    if (!r(q(fr.q[i], 1) ? 1 : 0) || !r(q(fr.q[i], 2) ? 1 : 0) || !r(q(fr.q[i], 3) ? 1 : 0) || !r(q(fr.q[i], 4) ? 1 : 0) || !r(q(fr.q[i], 5) ? 1 : 0) || !r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 7) ? 1 : 0) || !r(q(fr.q[i], 36) ? 1 : 0) || !r(q(fr.q[i], 37) ? 1 : 0) || !r(q(fr.q[i], 54) ? 1 : 0) || !r(q(fr.q[i], 61) ? 1 : 0) || !r(q(fr.q[i], 73) ? 1 : 0) || !r(q(fr.q[i], 76) ? 1 : 0) || !r(q(fr.q[i], 77) ? 1 : 0) || !r(q(fr.q[i], 78) ? 1 : 0) || !r(q(fr.q[i], 79) ? 1 : 0) || !r(q(fr.q[i], 82) ? 1 : 0) || !r(q(fr.q[i], 83) ? 1 : 0) || !r(q(fr.q[i], 98) ? 1 : 0) || !r(q(fr.q[i], 99) ? 1 : 0) || !r(q(fr.q[i], 100) ? 1 : 0) || !r(q(fr.q[i], 102) ? 1 : 0) || !r(q(fr.q[i], 103) ? 1 : 0) || !r(q(fr.q[i], 108) ? 1 : 0) || !r(q(fr.q[i], 109) ? 1 : 0) || !r(q(fr.q[i], 110) ? 1 : 0) || !r(q(fr.q[i], 112) ? 1 : 0) || !r(q(fr.q[i], 113) ? 1 : 0) || !r(q(fr.q[i], 116) ? 1 : 0) || !r(q(fr.q[i], 117) ? 1 : 0) || !r(q(fr.q[i], 125) ? 1 : 0) || !r(q(fr.q[i], 126) ? 1 : 0) || !r(q(fr.q[i], 127) ? 1 : 0) || !r(q(fr.q[i], 129) ? 1 : 0) || r(j(fr.q[i], 130) ? 1 : 0)) {
                        final int[] m17 = fr.m;
                        final int n21 = i;
                        m17[n21] |= 0x2;
                    }
                    if (!r(q(fr.q[i], 1) ? 1 : 0) || !r(q(fr.q[i], 3) ? 1 : 0) || !r(q(fr.q[i], 4) ? 1 : 0) || !r(q(fr.q[i], 5) ? 1 : 0) || !r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 20) ? 1 : 0) || !r(q(fr.q[i], 21) ? 1 : 0) || !r(q(fr.q[i], 22) ? 1 : 0) || !r(q(fr.q[i], 23) ? 1 : 0) || !r(q(fr.q[i], 36) ? 1 : 0) || !r(q(fr.q[i], 37) ? 1 : 0) || !r(q(fr.q[i], 38) ? 1 : 0) || !r(q(fr.q[i], 39) ? 1 : 0) || !r(q(fr.q[i], 55) ? 1 : 0) || !r(q(fr.q[i], 109) ? 1 : 0) || !r(q(fr.q[i], 111) ? 1 : 0) || !r(q(fr.q[i], 112) ? 1 : 0) || !r(q(fr.q[i], 113) ? 1 : 0) || !r(q(fr.q[i], 114) ? 1 : 0) || !r(q(fr.q[i], 115) ? 1 : 0) || !r(q(fr.q[i], 116) ? 1 : 0) || !r(q(fr.q[i], 127) ? 1 : 0) || !r(q(fr.q[i], 129) ? 1 : 0) || r(j(fr.q[i], 130) ? 1 : 0)) {
                        final int[] m18 = fr.m;
                        final int n22 = i;
                        m18[n22] |= 0x1000;
                    }
                    if (!r(q(fr.q[i], 8) ? 1 : 0) || !r(q(fr.q[i], 9) ? 1 : 0) || !r(q(fr.q[i], 10) ? 1 : 0) || !r(q(fr.q[i], 12) ? 1 : 0) || !r(q(fr.q[i], 13) ? 1 : 0) || !r(q(fr.q[i], 14) ? 1 : 0) || !r(q(fr.q[i], 30) ? 1 : 0) || r(j(fr.q[i], 135) ? 1 : 0)) {
                        final int[] m19 = fr.m;
                        final int n23 = i;
                        m19[n23] |= 0x10;
                    }
                    if (r(j(fr.q[i], 17) ? 1 : 0)) {
                        final int[] m20 = fr.m;
                        final int n24 = i;
                        m20[n24] |= 0x20;
                    }
                    if (r(j(fr.q[i], 18) ? 1 : 0)) {
                        final int[] m21 = fr.m;
                        final int n25 = i;
                        m21[n25] |= 0x80;
                    }
                    if (!r(q(fr.q[i], 61) ? 1 : 0) || !r(q(fr.q[i], 37) ? 1 : 0) || !r(q(fr.q[i], 38) ? 1 : 0) || !r(q(fr.q[i], 127) ? 1 : 0) || !r(q(fr.q[i], 130) ? 1 : 0) || r(j(fr.q[i], 131) ? 1 : 0)) {
                        final int[] m22 = fr.m;
                        final int n26 = i;
                        m22[n26] |= 0x4;
                    }
                    if (!r(q(fr.q[i], 61) ? 1 : 0) || !r(q(fr.q[i], 36) ? 1 : 0) || !r(q(fr.q[i], 39) ? 1 : 0) || !r(q(fr.q[i], 127) ? 1 : 0) || !r(q(fr.q[i], 129) ? 1 : 0) || r(j(fr.q[i], 132) ? 1 : 0)) {
                        final int[] m23 = fr.m;
                        final int n27 = i;
                        m23[n27] |= 0x8;
                    }
                    if (r(j(fr.q[i], 19) ? 1 : 0)) {
                        final int[] m24 = fr.m;
                        final int n28 = i;
                        m24[n28] |= 0x40;
                        if (r(j(fr.m[i - fr.y] & 0x1000, 4096) ? 1 : 0)) {
                            final int[] m25 = fr.m;
                            final int n29 = i;
                            m25[n29] |= 0x1000;
                        }
                    }
                    if (r(j(fr.q[i], 134) ? 1 : 0)) {
                        final int[] m26 = fr.m;
                        final int n30 = i;
                        m26[n30] |= 0x40;
                        if (r(j(fr.m[i - fr.y] & 0x1000, 4096) ? 1 : 0)) {
                            final int[] m27 = fr.m;
                            final int n31 = i;
                            m27[n31] |= 0x1000;
                        }
                    }
                    if (r(j(fr.q[i], 35) ? 1 : 0)) {
                        final int[] m28 = fr.m;
                        final int n32 = i;
                        m28[n32] |= 0x800;
                    }
                    if (r(j(fr.q[i], 7) ? 1 : 0)) {
                        final int[] m29 = fr.m;
                        final int n33 = i;
                        m29[n33] |= 0x400;
                    }
                    if (!r(q(fr.q[i], 32) ? 1 : 0) || !r(q(fr.q[i], 33) ? 1 : 0) || r(j(fr.q[i], 34) ? 1 : 0)) {
                        final int[] m30 = fr.m;
                        final int n34 = i;
                        m30[n34] |= 0x100;
                    }
                    if (!r(q(fr.q[i], 61) ? 1 : 0) || r(j(fr.q[i], 127) ? 1 : 0)) {
                        final int[] m31 = fr.m;
                        final int n35 = i;
                        m31[n35] |= 0x2000;
                    }
                }
                if (r(j(n, 3) ? 1 : 0)) {
                    if (!r(q(fr.q[i], 12) ? 1 : 0) || !r(q(fr.q[i], 51) ? 1 : 0) || !r(q(fr.q[i], 88) ? 1 : 0) || !r(q(fr.q[i], 116) ? 1 : 0) || r(j(fr.q[i], 128) ? 1 : 0)) {
                        fr.ao = fr.q[i] - '\u0001';
                    }
                    if (!r(q(fr.q[i], 109) ? 1 : 0) || r(j(fr.q[i], 110) ? 1 : 0)) {
                        fr.ao = fr.q[i];
                    }
                    if (!r(q(fr.q[i], 1) ? 1 : 0) || !r(q(fr.q[i], 2) ? 1 : 0) || !r(q(fr.q[i], 3) ? 1 : 0) || !r(q(fr.q[i], 4) ? 1 : 0) || !r(q(fr.q[i], 5) ? 1 : 0) || !r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 7) ? 1 : 0) || !r(q(fr.q[i], 11) ? 1 : 0) || !r(q(fr.q[i], 14) ? 1 : 0) || !r(q(fr.q[i], 17) ? 1 : 0) || !r(q(fr.q[i], 43) ? 1 : 0) || !r(q(fr.q[i], 51) ? 1 : 0) || !r(q(fr.q[i], 63) ? 1 : 0) || !r(q(fr.q[i], 65) ? 1 : 0) || !r(q(fr.q[i], 67) ? 1 : 0) || !r(q(fr.q[i], 68) ? 1 : 0) || !r(q(fr.q[i], 71) ? 1 : 0) || !r(q(fr.q[i], 72) ? 1 : 0) || !r(q(fr.q[i], 83) ? 1 : 0) || !r(q(fr.q[i], 84) ? 1 : 0) || !r(q(fr.q[i], 85) ? 1 : 0) || !r(q(fr.q[i], 87) ? 1 : 0) || !r(q(fr.q[i], 91) ? 1 : 0) || !r(q(fr.q[i], 94) ? 1 : 0) || !r(q(fr.q[i], 97) ? 1 : 0) || !r(q(fr.q[i], 98) ? 1 : 0) || !r(q(fr.q[i], 106) ? 1 : 0) || !r(q(fr.q[i], 107) ? 1 : 0) || !r(q(fr.q[i], 111) ? 1 : 0) || !r(q(fr.q[i], 113) ? 1 : 0) || !r(q(fr.q[i], 117) ? 1 : 0) || !r(q(fr.q[i], 118) ? 1 : 0) || !r(q(fr.q[i], 119) ? 1 : 0) || !r(q(fr.q[i], 125) ? 1 : 0) || !r(q(fr.q[i], 126) ? 1 : 0) || !r(q(fr.q[i], 129) ? 1 : 0) || !r(q(fr.q[i], 130) ? 1 : 0) || !r(q(fr.q[i], 131) ? 1 : 0) || !r(q(fr.q[i], 133) ? 1 : 0) || !r(q(fr.q[i], 136) ? 1 : 0) || !r(q(fr.q[i], 138) ? 1 : 0) || !r(q(fr.q[i], 139) ? 1 : 0) || r(j(fr.q[i], 142) ? 1 : 0)) {
                        final int[] m32 = fr.m;
                        final int n36 = i;
                        m32[n36] |= 0x2;
                    }
                    if (!r(q(fr.q[i], 124) ? 1 : 0) || !r(q(fr.q[i], 116) ? 1 : 0) || !r(q(fr.q[i], 123) ? 1 : 0) || !r(q(fr.q[i], 44) ? 1 : 0) || !r(q(fr.q[i], 12) ? 1 : 0) || !r(q(fr.q[i], 15) ? 1 : 0) || !r(q(fr.q[i], 16) ? 1 : 0) || !r(q(fr.q[i], 45) ? 1 : 0) || !r(q(fr.q[i], 10) ? 1 : 0) || r(j(fr.q[i], 9) ? 1 : 0)) {
                        final int[] m33 = fr.m;
                        final int n37 = i;
                        m33[n37] |= 0x1000;
                    }
                    if (r(j(fr.q[i], 23) ? 1 : 0)) {
                        final int[] m34 = fr.m;
                        final int n38 = i;
                        m34[n38] |= 0x20;
                    }
                    if (r(j(fr.q[i], 24) ? 1 : 0)) {
                        final int[] m35 = fr.m;
                        final int n39 = i;
                        m35[n39] |= 0x80;
                    }
                    if (!r(q(fr.q[i], 6) ? 1 : 0) || !r(q(fr.q[i], 15) ? 1 : 0) || !r(q(fr.q[i], 51) ? 1 : 0) || !r(q(fr.q[i], 95) ? 1 : 0) || !r(q(fr.q[i], 97) ? 1 : 0) || !r(q(fr.q[i], 106) ? 1 : 0) || !r(q(fr.q[i], 111) ? 1 : 0) || !r(q(fr.q[i], 123) ? 1 : 0) || !r(q(fr.q[i], 125) ? 1 : 0) || !r(q(fr.q[i], 138) ? 1 : 0) || r(j(fr.q[i], 140) ? 1 : 0)) {
                        final int[] m36 = fr.m;
                        final int n40 = i;
                        m36[n40] |= 0x4;
                    }
                    if (!r(q(fr.q[i], 7) ? 1 : 0) || !r(q(fr.q[i], 16) ? 1 : 0) || !r(q(fr.q[i], 51) ? 1 : 0) || !r(q(fr.q[i], 96) ? 1 : 0) || !r(q(fr.q[i], 98) ? 1 : 0) || !r(q(fr.q[i], 107) ? 1 : 0) || !r(q(fr.q[i], 111) ? 1 : 0) || !r(q(fr.q[i], 124) ? 1 : 0) || !r(q(fr.q[i], 126) ? 1 : 0) || !r(q(fr.q[i], 139) ? 1 : 0) || r(j(fr.q[i], 141) ? 1 : 0)) {
                        final int[] m37 = fr.m;
                        final int n41 = i;
                        m37[n41] |= 0x8;
                    }
                    if (r(j(fr.q[i], 25) ? 1 : 0)) {
                        final int[] m38 = fr.m;
                        final int n42 = i;
                        m38[n42] |= 0x40;
                        if (r(j(fr.m[i - fr.y] & 0x1000, 4096) ? 1 : 0)) {
                            final int[] m39 = fr.m;
                            final int n43 = i;
                            m39[n43] |= 0x1000;
                        }
                    }
                    if (r(j(fr.q[i], 34) ? 1 : 0)) {
                        final int[] m40 = fr.m;
                        final int n44 = i;
                        m40[n44] |= 0x800;
                    }
                    if (r(j(fr.q[i], 17) ? 1 : 0)) {
                        final int[] m41 = fr.m;
                        final int n45 = i;
                        m41[n45] |= 0x400;
                    }
                    if (!r(q(fr.q[i], 33) ? 1 : 0) || !r(q(fr.q[i], 103) ? 1 : 0) || !r(q(fr.q[i], 104) ? 1 : 0) || !r(q(fr.q[i], 105) ? 1 : 0) || !r(q(fr.q[i], 26) ? 1 : 0) || r(j(fr.q[i], 33) ? 1 : 0)) {
                        final int[] m42 = fr.m;
                        final int n46 = i;
                        m42[n46] |= 0x100;
                    }
                    if (!r(q(fr.q[i], 51) ? 1 : 0) || !r(q(fr.q[i], 111) ? 1 : 0) || r(j(fr.q[i], 68) ? 1 : 0)) {
                        final int[] m43 = fr.m;
                        final int n47 = i;
                        m43[n47] |= 0x2000;
                    }
                    if (!r(q(fr.q[i], 82) ? 1 : 0) || !r(q(fr.q[i], 110) ? 1 : 0) || r(j(fr.q[i], 143) ? 1 : 0)) {
                        final int[] m44 = fr.m;
                        final int n48 = i;
                        m44[n48] |= 0x4000;
                    }
                    if (r(j(fr.q[i], 113) ? 1 : 0)) {
                        final int[] m45 = fr.m;
                        final int n49 = i;
                        m45[n49] |= 0x10000;
                    }
                    if (r(j(fr.q[i], 142) ? 1 : 0)) {
                        final int[] m46 = fr.m;
                        final int n50 = i;
                        m46[n50] |= 0x8000;
                    }
                    if (!r(q(fr.q[i], 40) ? 1 : 0) || r(j(fr.q[i], 41) ? 1 : 0)) {
                        final int[] m47 = fr.m;
                        final int n51 = i;
                        m47[n51] |= 0x20000;
                    }
                    if (r(j(fr.q[i], 110) ? 1 : 0)) {
                        final int[] m48 = fr.m;
                        final int n52 = i;
                        m48[n52] |= 0x40000;
                    }
                    if (r(j(fr.q[i], 143) ? 1 : 0)) {
                        final int[] m49 = fr.m;
                        final int n53 = i;
                        m49[n53] |= 0x80000;
                    }
                }
                ++i;
                "".length();
                "".length();
                if (h("  ".length(), "   ".length())) {
                    return;
                }
            }
            fr.c = Image.createImage(fr.y * fr.o * cn.a, fr.w * fr.o * cn.a);
            final cn cn;
            (cn = new cn(fr.c.getGraphics())).a(0);
            cn.c(0, 0, fr.y * fr.o, fr.w * fr.o);
            n = 0;
            while (r(o(n, fr.y) ? 1 : 0)) {
                int n54 = 0;
                while (r(o(n54, fr.w) ? 1 : 0)) {
                    final int n55;
                    if (r(q(n55 = fr.q[n54 * fr.y + n] - '\u0001', -1) ? 1 : 0)) {
                        cn.a(fr.az, 0, n55 * fr.o, fr.o, fr.o, 0, n * fr.o, n54 * fr.o, 0);
                    }
                    ++n54;
                    "".length();
                    "".length();
                    if (y("   ".length() & ("   ".length() ^ -" ".length()))) {
                        return;
                    }
                }
                ++n;
                "".length();
                "".length();
                if (s(-" ".length(), fr.ax[49] ^ fr.ax[132] ^ (fr.ax[181] ^ fr.ax[55]))) {
                    return;
                }
            }
            if (r(p(ff.ar ? 1 : 0) ? 1 : 0)) {
                if (!r(x(fr.s) ? 1 : 0) || !r(r(fr.s, 4) ? 1 : 0) || (r(n(fr.s, 16) ? 1 : 0) && !r(r(fr.s, 18) ? 1 : 0)) || (r(n(fr.s, 24) ? 1 : 0) && !r(r(fr.s, 27) ? 1 : 0)) || !r(q(fr.s, 22) ? 1 : 0) || !r(q(fr.s, 33) ? 1 : 0) || !r(q(fr.s, 34) ? 1 : 0) || !r(q(fr.s, 38) ? 1 : 0) || !r(q(fr.s, 57) ? 1 : 0) || !r(q(fr.s, 58) ? 1 : 0) || !r(q(fr.s, 60) ? 1 : 0) || !r(q(fr.s, 68) ? 1 : 0) || (r(n(fr.s, 70) ? 1 : 0) && !r(r(fr.s, 75) ? 1 : 0)) || r(j(fr.s, 81) ? 1 : 0)) {
                    k.f.addElement(new g((byte)1, 10));
                }
                if ((r(n(fr.s, 39) ? 1 : 0) && !r(r(fr.s, 44) ? 1 : 0)) || (r(n(fr.s, 46) ? 1 : 0) && !r(r(fr.s, 48) ? 1 : 0)) || !r(q(fr.s, 56) ? 1 : 0) || (r(n(fr.s, 62) ? 1 : 0) && r(f(fr.s, 65) ? 1 : 0))) {
                    k.f.addElement(new g((byte)3, fj.b(150, 200)));
                }
            }
        }
        catch (final Exception ex) {
            System.out.println("Error Load Map");
            ex.printStackTrace();
            final ed c = ed.c;
            ey.b = false;
            System.gc();
            c.notifyDestroyed();
        }
    }
    
    public static void k() {
        if (r(q(fr.e, fr.s) ? 1 : 0)) {
            switch (fr.s) {
                case 1: {}
                case 10: {}
                case 17: {}
                case 22: {}
                case 27: {}
                case 32: {}
                case 38: {}
                case 43: {}
                case 48: {}
                case 72: {}
            }
        }
    }
    
    public static final int m(final int n) {
        return n / fr.af * fr.af;
    }
    
    private static boolean r(final int n, final int n2) {
        int n3;
        if (h(n, n2)) {
            n3 = fr.ax[0];
            "".length();
            if ((0x15 ^ 0x5C ^ (0x7B ^ 0x36)) != (142 + 98 - 226 + 159 ^ 141 + 90 - 171 + 109)) {
                return ((186 + 9 + 29 + 10 ^ 6 + 71 - 52 + 145) & (0x62 ^ 0x51 ^ (0xF1 ^ 0x82) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fr.ax[1];
        }
        return n3 != 0;
    }
    
    public static void a(final int n, final InputStream inputStream) {
        try {
            if (r(f(fr.bk.length, n) ? 1 : 0)) {
                final byte[][] bk = new byte[n + 10][];
                System.arraycopy(fr.bk, 0, bk, 0, fr.bk.length);
                fr.bk = bk;
            }
            inputStream.read(fr.bk[n] = new byte[inputStream.available()]);
            "".length();
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    private static void m() {
        (bd = new int[fr.ax[231]])[fr.ax[1]] = (fr.ax[159] ^ fr.ax[125]);
        fr.bd[fr.ax[0]] = "  ".length();
        fr.bd[fr.ax[4]] = ((fr.ax[35] ^ fr.ax[167]) & (fr.ax[145] ^ fr.ax[68] ^ fr.ax[13]));
        fr.bd[fr.ax[2]] = (fr.ax[35] ^ fr.ax[45]);
        fr.bd[fr.ax[38]] = (fr.ax[108] ^ fr.ax[43]);
        fr.bd[fr.ax[9]] = " ".length();
        fr.bd[fr.ax[28]] = "   ".length();
        fr.bd[fr.ax[56]] = (fr.ax[35] ^ fr.ax[44]);
        fr.bd[fr.ax[24]] = (fr.ax[182] ^ fr.ax[25]);
        fr.bd[fr.ax[103]] = (fr.ax[30] + fr.ax[153] - fr.ax[232] + fr.ax[69] ^ fr.ax[172] + fr.ax[176] - fr.ax[119] + fr.ax[39]);
        fr.bd[fr.ax[29]] = (fr.ax[69] ^ fr.ax[173] ^ (fr.ax[79] ^ fr.ax[180]));
        fr.bd[fr.ax[145]] = (fr.ax[155] ^ fr.ax[126]);
        fr.bd[fr.ax[114]] = (fr.ax[76] + fr.ax[125] - fr.ax[185] + fr.ax[197] ^ fr.ax[117] + fr.ax[66] - fr.ax[233] + fr.ax[41]);
        fr.bd[fr.ax[95]] = (fr.ax[23] + fr.ax[53] - fr.ax[7] + fr.ax[105] ^ fr.ax[110] + fr.ax[177] - fr.ax[234] + fr.ax[9]);
        fr.bd[fr.ax[146]] = (fr.ax[49] ^ fr.ax[95] ^ (fr.ax[150] ^ fr.ax[14]));
        fr.bd[fr.ax[33]] = (fr.ax[18] + fr.ax[76] - fr.ax[25] + fr.ax[59] ^ fr.ax[163] + fr.ax[37] - fr.ax[223] + fr.ax[23]);
        fr.bd[fr.ax[80]] = (fr.ax[123] ^ fr.ax[53] ^ (fr.ax[110] ^ fr.ax[140]));
        fr.bd[fr.ax[110]] = (fr.ax[12] ^ fr.ax[85] ^ (fr.ax[139] ^ fr.ax[73]));
        fr.bd[fr.ax[86]] = (fr.ax[94] ^ fr.ax[29]);
        fr.bd[fr.ax[147]] = (fr.ax[69] ^ fr.ax[8]);
        fr.bd[fr.ax[6]] = (fr.ax[188] ^ fr.ax[100]);
        fr.bd[fr.ax[148]] = (-(fr.ax[235] & fr.ax[236]) & (fr.ax[237] & fr.ax[238]));
        fr.bd[fr.ax[128]] = (fr.ax[239] ^ fr.ax[90]);
        fr.bd[fr.ax[149]] = (fr.ax[93] ^ fr.ax[45]);
        fr.bd[fr.ax[5]] = (fr.ax[154] ^ fr.ax[7]);
        fr.bd[fr.ax[150]] = (fr.ax[163] + fr.ax[10] - fr.ax[240] + fr.ax[124] ^ fr.ax[87] + fr.ax[62] - fr.ax[119] + fr.ax[51]);
        fr.bd[fr.ax[101]] = (-(fr.ax[241] & fr.ax[242]) & (fr.ax[243] & fr.ax[244]));
        fr.bd[fr.ax[31]] = (fr.ax[24] + fr.ax[49] - fr.ax[153] + fr.ax[81] ^ fr.ax[105] + fr.ax[153] - fr.ax[245] + fr.ax[125]);
        fr.bd[fr.ax[88]] = (fr.ax[76] ^ fr.ax[77]);
        fr.bd[fr.ax[140]] = (fr.ax[201] ^ fr.ax[15] ^ (fr.ax[222] ^ fr.ax[117]));
        fr.bd[fr.ax[151]] = (fr.ax[128] ^ fr.ax[152] ^ (fr.ax[185] ^ fr.ax[189]));
        fr.bd[fr.ax[105]] = (fr.ax[195] ^ fr.ax[122] ^ (fr.ax[3] ^ fr.ax[38]));
        fr.bd[fr.ax[118]] = (fr.ax[53] ^ fr.ax[21]);
        fr.bd[fr.ax[39]] = (fr.ax[171] + fr.ax[40] - fr.ax[80] + fr.ax[168] ^ fr.ax[173] + fr.ax[48] - fr.ax[135] + fr.ax[115]);
        fr.bd[fr.ax[40]] = (fr.ax[184] ^ fr.ax[62] ^ (fr.ax[175] ^ fr.ax[23]));
        fr.bd[fr.ax[141]] = (fr.ax[146] ^ fr.ax[64]);
        fr.bd[fr.ax[63]] = (fr.ax[246] ^ fr.ax[100]);
        fr.bd[fr.ax[120]] = ("  ".length() ^ (fr.ax[64] ^ fr.ax[5]));
        fr.bd[fr.ax[43]] = (fr.ax[108] ^ fr.ax[125]);
        fr.bd[fr.ax[152]] = (fr.ax[148] ^ fr.ax[135] ^ (fr.ax[71] ^ fr.ax[147]));
        fr.bd[fr.ax[48]] = (fr.ax[33] ^ fr.ax[179]);
        fr.bd[fr.ax[108]] = (fr.ax[14] ^ fr.ax[63]);
        fr.bd[fr.ax[153]] = (fr.ax[174] ^ fr.ax[170] ^ (fr.ax[169] ^ fr.ax[1]));
        fr.bd[fr.ax[136]] = (fr.ax[207] ^ fr.ax[195] ^ (fr.ax[77] ^ fr.ax[17]));
        fr.bd[fr.ax[154]] = (fr.ax[161] ^ fr.ax[176]);
        fr.bd[fr.ax[61]] = (fr.ax[247] ^ fr.ax[200]);
        fr.bd[fr.ax[93]] = (fr.ax[76] ^ fr.ax[67]);
        fr.bd[fr.ax[92]] = (fr.ax[32] ^ fr.ax[50] ^ (fr.ax[135] ^ fr.ax[68]));
        fr.bd[fr.ax[32]] = (fr.ax[170] ^ fr.ax[119] ^ (fr.ax[27] ^ fr.ax[78]));
        fr.bd[fr.ax[79]] = (fr.ax[172] ^ fr.ax[96] ^ (fr.ax[151] ^ fr.ax[141]));
        fr.bd[fr.ax[138]] = (fr.ax[133] ^ fr.ax[193]);
        fr.bd[fr.ax[68]] = (fr.ax[114] ^ fr.ax[64] ^ (fr.ax[169] ^ fr.ax[120]));
        fr.bd[fr.ax[30]] = (fr.ax[54] + fr.ax[156] - fr.ax[203] + fr.ax[144] ^ fr.ax[162] + fr.ax[84] - fr.ax[219] + fr.ax[84]);
        fr.bd[fr.ax[10]] = (fr.ax[15] ^ fr.ax[196]);
        fr.bd[fr.ax[69]] = (fr.ax[137] ^ fr.ax[172]);
        fr.bd[fr.ax[51]] = fr.ax[138] + fr.ax[126] - fr.ax[54] + fr.ax[41];
        fr.bd[fr.ax[94]] = (fr.ax[27] ^ fr.ax[123]);
        fr.bd[fr.ax[85]] = (fr.ax[47] + fr.ax[38] - fr.ax[140] + fr.ax[96] ^ fr.ax[28] + fr.ax[64] - fr.ax[1] + fr.ax[154]);
        fr.bd[fr.ax[3]] = (-(fr.ax[248] & fr.ax[249]) & (fr.ax[250] & fr.ax[251]));
        fr.bd[fr.ax[70]] = (fr.ax[39] + fr.ax[9] - fr.ax[252] + fr.ax[146] ^ fr.ax[169] + fr.ax[110] - fr.ax[125] + fr.ax[75]);
        fr.bd[fr.ax[71]] = (fr.ax[119] ^ fr.ax[47]);
        fr.bd[fr.ax[8]] = (-(fr.ax[253] & fr.ax[254]) & (fr.ax[255] & fr.ax[256]));
        fr.bd[fr.ax[155]] = (fr.ax[171] + fr.ax[63] - fr.ax[65] + fr.ax[35] ^ fr.ax[181] + fr.ax[39] - fr.ax[77] + fr.ax[83]);
        fr.bd[fr.ax[156]] = (fr.ax[63] ^ fr.ax[49]);
        fr.bd[fr.ax[157]] = (fr.ax[257] ^ fr.ax[34]);
        fr.bd[fr.ax[132]] = (fr.ax[114] ^ fr.ax[167]);
        fr.bd[fr.ax[113]] = (fr.ax[258] ^ fr.ax[190] ^ (fr.ax[99] ^ fr.ax[181]));
        fr.bd[fr.ax[158]] = (fr.ax[80] ^ fr.ax[96]);
        fr.bd[fr.ax[159]] = (fr.ax[18] ^ fr.ax[28]);
        fr.bd[fr.ax[46]] = (fr.ax[119] ^ fr.ax[24]);
        fr.bd[fr.ax[47]] = (fr.ax[39] ^ fr.ax[50]);
        fr.bd[fr.ax[91]] = (fr.ax[130] + fr.ax[115] - fr.ax[96] + fr.ax[80] ^ fr.ax[110] + fr.ax[22] - fr.ax[164] + fr.ax[17]);
        fr.bd[fr.ax[125]] = (fr.ax[246] ^ fr.ax[53]);
        fr.bd[fr.ax[160]] = (fr.ax[47] ^ fr.ax[136] ^ (fr.ax[101] ^ fr.ax[28]));
        fr.bd[fr.ax[161]] = (fr.ax[132] ^ fr.ax[71]);
        fr.bd[fr.ax[49]] = (fr.ax[207] ^ fr.ax[192]);
        fr.bd[fr.ax[50]] = fr.ax[38] + fr.ax[48] - fr.ax[150] + fr.ax[7];
        fr.bd[fr.ax[124]] = (fr.ax[52] ^ fr.ax[203]) + (fr.ax[63] ^ fr.ax[41]) - (fr.ax[259] ^ fr.ax[197]) + (fr.ax[166] ^ fr.ax[42]);
        fr.bd[fr.ax[162]] = (fr.ax[58] ^ fr.ax[189]) + "  ".length() - -(fr.ax[69] ^ fr.ax[46]) + (fr.ax[57] ^ fr.ax[98]);
        fr.bd[fr.ax[112]] = (fr.ax[196] ^ fr.ax[204] ^ (fr.ax[260] ^ fr.ax[27]));
        fr.bd[fr.ax[64]] = (fr.ax[11] ^ fr.ax[167] ^ (fr.ax[136] ^ fr.ax[35]));
        fr.bd[fr.ax[14]] = (fr.ax[125] ^ fr.ax[80] ^ (fr.ax[24] ^ fr.ax[141]));
        fr.bd[fr.ax[163]] = (fr.ax[6] ^ fr.ax[10]) + (fr.ax[261] ^ fr.ax[102]) - (fr.ax[56] ^ fr.ax[7]) + (fr.ax[173] ^ fr.ax[48]);
        fr.bd[fr.ax[164]] = (fr.ax[175] ^ fr.ax[153]) + (fr.ax[95] ^ fr.ax[162]) - (fr.ax[262] ^ fr.ax[55]) + (fr.ax[113] ^ fr.ax[31]);
        fr.bd[fr.ax[65]] = fr.ax[74] + fr.ax[118] - fr.ax[11] + fr.ax[158];
        fr.bd[fr.ax[22]] = fr.ax[14] + fr.ax[77] - fr.ax[143] + fr.ax[7];
        fr.bd[fr.ax[59]] = (-(fr.ax[263] & fr.ax[264]) & (fr.ax[265] & fr.ax[266]));
        fr.bd[fr.ax[87]] = (fr.ax[160] ^ fr.ax[178]);
        fr.bd[fr.ax[135]] = (fr.ax[180] ^ fr.ax[120]);
        fr.bd[fr.ax[60]] = (fr.ax[146] ^ fr.ax[79]);
        fr.bd[fr.ax[12]] = (fr.ax[118] ^ fr.ax[11]);
        fr.bd[fr.ax[165]] = (fr.ax[60] ^ fr.ax[101]);
        fr.bd[fr.ax[75]] = (fr.ax[267] ^ fr.ax[98]);
        fr.bd[fr.ax[166]] = (fr.ax[178] ^ fr.ax[12] ^ (fr.ax[107] ^ fr.ax[4]));
        fr.bd[fr.ax[37]] = (fr.ax[9] ^ fr.ax[124]);
        fr.bd[fr.ax[167]] = (fr.ax[227] ^ fr.ax[220]);
        fr.bd[fr.ax[18]] = (fr.ax[57] ^ fr.ax[204]);
        fr.bd[fr.ax[11]] = (fr.ax[207] ^ fr.ax[52]);
        fr.bd[fr.ax[44]] = (fr.ax[91] ^ fr.ax[61]);
        fr.bd[fr.ax[45]] = (fr.ax[239] ^ fr.ax[62]);
        fr.bd[fr.ax[119]] = (fr.ax[146] + fr.ax[262] - fr.ax[8] + fr.ax[79] ^ fr.ax[54] + fr.ax[43] - fr.ax[161] + fr.ax[120]);
        fr.bd[fr.ax[107]] = fr.ax[51] + fr.ax[11] - fr.ax[22] + fr.ax[132] + (fr.ax[110] ^ fr.ax[148]) - (fr.ax[29] ^ fr.ax[8]) + (fr.ax[80] ^ fr.ax[63]);
        fr.bd[fr.ax[121]] = fr.ax[85] + fr.ax[7] - fr.ax[159] + fr.ax[40] + (fr.ax[216] ^ fr.ax[199]) - (fr.ax[125] + fr.ax[68] - fr.ax[69] + fr.ax[112]) + (fr.ax[47] ^ fr.ax[23]);
        fr.bd[fr.ax[35]] = fr.ax[9] + fr.ax[138] - fr.ax[40] + fr.ax[126] + (fr.ax[123] ^ fr.ax[17]) - (fr.ax[168] + fr.ax[154] - fr.ax[12] + fr.ax[119]) + (fr.ax[9] ^ fr.ax[96]);
        fr.bd[fr.ax[168]] = fr.ax[12] + fr.ax[14] - fr.ax[172] + fr.ax[162];
        fr.bd[fr.ax[169]] = fr.ax[83] + fr.ax[77] - fr.ax[268] + fr.ax[116];
        fr.bd[fr.ax[170]] = (fr.ax[269] ^ fr.ax[100]);
        fr.bd[fr.ax[171]] = (fr.ax[270] ^ fr.ax[224]);
        fr.bd[fr.ax[7]] = (fr.ax[66] ^ fr.ax[102]);
        fr.bd[fr.ax[41]] = (fr.ax[171] + fr.ax[164] - fr.ax[87] + fr.ax[179] ^ fr.ax[60] + fr.ax[119] - fr.ax[86] + fr.ax[86]);
        fr.bd[fr.ax[172]] = fr.ax[73] + fr.ax[161] - fr.ax[134] + fr.ax[41];
        fr.bd[fr.ax[42]] = (fr.ax[146] ^ fr.ax[172]);
        fr.bd[fr.ax[173]] = fr.ax[31] + fr.ax[37] - fr.ax[125] + fr.ax[75];
        fr.bd[fr.ax[126]] = (fr.ax[75] + fr.ax[94] - fr.ax[14] + fr.ax[35] ^ fr.ax[223] + fr.ax[55] - fr.ax[218] + fr.ax[118]);
        fr.bd[fr.ax[19]] = (fr.ax[103] ^ fr.ax[9] ^ (fr.ax[271] ^ fr.ax[123]));
        fr.bd[fr.ax[109]] = (fr.ax[64] ^ fr.ax[180] ^ (fr.ax[41] ^ fr.ax[108]));
        fr.bd[fr.ax[96]] = (fr.ax[180] ^ fr.ax[35]);
        fr.bd[fr.ax[174]] = (fr.ax[139] ^ fr.ax[34]) + (fr.ax[12] ^ fr.ax[65]) - (fr.ax[37] ^ fr.ax[145]) + (fr.ax[149] + fr.ax[50] - fr.ax[167] + fr.ax[182]);
        fr.bd[fr.ax[175]] = (fr.ax[272] & fr.ax[273]);
        fr.bd[fr.ax[176]] = (fr.ax[274] & fr.ax[275]);
        fr.bd[fr.ax[177]] = (-(fr.ax[276] & fr.ax[277]) & (fr.ax[278] & fr.ax[279]));
        fr.bd[fr.ax[115]] = (fr.ax[0] + fr.ax[121] - fr.ax[2] + fr.ax[153] ^ fr.ax[70] + fr.ax[34] - fr.ax[32] + fr.ax[6]);
        fr.bd[fr.ax[178]] = (fr.ax[117] ^ fr.ax[100]);
        fr.bd[fr.ax[179]] = (-(fr.ax[280] & fr.ax[281]) & (fr.ax[282] & fr.ax[283]));
        fr.bd[fr.ax[137]] = (fr.ax[284] & fr.ax[285]);
        fr.bd[fr.ax[180]] = (-(fr.ax[286] & fr.ax[287]) & (fr.ax[288] & fr.ax[289]));
        fr.bd[fr.ax[23]] = -" ".length();
        fr.bd[fr.ax[36]] = (fr.ax[98] + fr.ax[78] - fr.ax[290] + fr.ax[62] ^ fr.ax[81] + fr.ax[186] - fr.ax[267] + fr.ax[168]);
        fr.bd[fr.ax[72]] = (fr.ax[187] ^ fr.ax[197] ^ (fr.ax[119] ^ fr.ax[8]));
        fr.bd[fr.ax[73]] = (fr.ax[142] ^ fr.ax[78]);
        fr.bd[fr.ax[74]] = (fr.ax[80] ^ fr.ax[154]);
        fr.bd[fr.ax[76]] = (fr.ax[291] ^ fr.ax[186]);
        fr.bd[fr.ax[77]] = (fr.ax[216] ^ fr.ax[201] ^ (fr.ax[99] ^ fr.ax[182]));
        fr.bd[fr.ax[78]] = (fr.ax[169] + fr.ax[203] - fr.ax[224] + fr.ax[159] ^ fr.ax[108] + fr.ax[113] - fr.ax[292] + fr.ax[80]);
        fr.bd[fr.ax[81]] = (fr.ax[145] ^ fr.ax[28] ^ (fr.ax[192] ^ fr.ax[98]));
        fr.bd[fr.ax[34]] = (fr.ax[133] ^ fr.ax[84]);
        fr.bd[fr.ax[82]] = (fr.ax[94] ^ fr.ax[112] ^ (fr.ax[201] ^ fr.ax[25]));
        fr.bd[fr.ax[83]] = (fr.ax[114] ^ fr.ax[138]);
        fr.bd[fr.ax[182]] = fr.ax[91] + fr.ax[72] - fr.ax[64] + fr.ax[105];
        fr.bd[fr.ax[116]] = fr.ax[46] + fr.ax[109] - fr.ax[153] + fr.ax[3];
        fr.bd[fr.ax[25]] = (fr.ax[47] ^ fr.ax[19]);
        fr.bd[fr.ax[102]] = (fr.ax[293] & fr.ax[294]);
        fr.bd[fr.ax[117]] = (-(fr.ax[152] + fr.ax[160] - fr.ax[295] + fr.ax[149]) & (fr.ax[296] & fr.ax[297]));
        fr.bd[fr.ax[17]] = (fr.ax[33] ^ fr.ax[113]) + (fr.ax[123] ^ fr.ax[20]) - (fr.ax[5] ^ fr.ax[43]) + (fr.ax[46] + fr.ax[61] - fr.ax[140] + fr.ax[153]);
        fr.bd[fr.ax[54]] = -"  ".length();
        fr.bd[fr.ax[55]] = (fr.ax[13] & fr.ax[298]);
        fr.bd[fr.ax[57]] = fr.ax[81] + fr.ax[225] - fr.ax[299] + fr.ax[98];
        fr.bd[fr.ax[16]] = (-(fr.ax[300] & fr.ax[301]) & (fr.ax[302] & fr.ax[303]));
        fr.bd[fr.ax[62]] = (fr.ax[13] & fr.ax[304]);
        fr.bd[fr.ax[66]] = (-(fr.ax[305] & fr.ax[306]) & (fr.ax[307] & fr.ax[308]));
        fr.bd[fr.ax[67]] = (-(fr.ax[195] ^ fr.ax[17]) & (fr.ax[309] & fr.ax[310]));
        fr.bd[fr.ax[98]] = -("  ".length() ^ (fr.ax[181] ^ fr.ax[191]));
        fr.bd[fr.ax[144]] = (fr.ax[311] & fr.ax[312]);
        fr.bd[fr.ax[313]] = -(-(fr.ax[314] & fr.ax[315]) & (fr.ax[316] & fr.ax[317]));
        fr.bd[fr.ax[15]] = (fr.ax[318] & fr.ax[319]);
        fr.bd[fr.ax[84]] = (fr.ax[146] ^ fr.ax[147]);
        fr.bd[fr.ax[20]] = fr.ax[65] + fr.ax[85] - fr.ax[0] + fr.ax[110];
        fr.bd[fr.ax[52]] = fr.ax[154] + fr.ax[135] - fr.ax[38] + fr.ax[151];
        fr.bd[fr.ax[53]] = fr.ax[96] + fr.ax[136] - fr.ax[144] + fr.ax[144];
        fr.bd[fr.ax[181]] = fr.ax[103] + fr.ax[12] - fr.ax[10] + fr.ax[126] + (fr.ax[120] + fr.ax[163] - fr.ax[92] + fr.ax[87]) - (fr.ax[320] & fr.ax[321]) + (fr.ax[60] + fr.ax[33] - fr.ax[9] + fr.ax[136]);
        fr.bd[fr.ax[186]] = (fr.ax[322] & fr.ax[323]);
        fr.bd[fr.ax[216]] = (fr.ax[324] & fr.ax[325]);
        fr.bd[fr.ax[131]] = (fr.ax[326] & fr.ax[327]);
        fr.bd[fr.ax[99]] = (fr.ax[328] & fr.ax[329]);
        fr.bd[fr.ax[185]] = (fr.ax[330] & fr.ax[331]);
        fr.bd[fr.ax[220]] = (fr.ax[332] & fr.ax[333]);
        fr.bd[fr.ax[218]] = (fr.ax[334] & fr.ax[335]);
        fr.bd[fr.ax[100]] = (-(fr.ax[336] & fr.ax[337]) & (fr.ax[338] & fr.ax[339]));
        fr.bd[fr.ax[223]] = (fr.ax[340] & fr.ax[341]);
        fr.bd[fr.ax[224]] = (fr.ax[342] & fr.ax[343]);
        fr.bd[fr.ax[191]] = (fr.ax[19] + fr.ax[46] - fr.ax[126] + fr.ax[126] ^ fr.ax[158] + fr.ax[173] - fr.ax[121] + fr.ax[37]);
        fr.bd[fr.ax[133]] = (-(fr.ax[344] & fr.ax[345]) & (fr.ax[346] & fr.ax[251]));
        fr.bd[fr.ax[134]] = (fr.ax[93] ^ fr.ax[48]) + (fr.ax[171] ^ fr.ax[7]) - -(fr.ax[133] ^ fr.ax[99]) + (fr.ax[141] + fr.ax[216] - fr.ax[153] + fr.ax[132]);
        fr.bd[fr.ax[27]] = (fr.ax[347] & fr.ax[348]);
        fr.bd[fr.ax[26]] = (fr.ax[349] & fr.ax[350]);
        fr.bd[fr.ax[188]] = fr.ax[41] + fr.ax[108] - fr.ax[41] + fr.ax[66];
        fr.bd[fr.ax[189]] = fr.ax[186] + fr.ax[73] - fr.ax[212] + fr.ax[55];
        fr.bd[fr.ax[122]] = (fr.ax[141] ^ fr.ax[168]) + (fr.ax[226] ^ fr.ax[133]) - (fr.ax[207] ^ fr.ax[82]) + (fr.ax[183] ^ fr.ax[72]);
        fr.bd[fr.ax[190]] = (fr.ax[222] ^ fr.ax[194]);
        fr.bd[fr.ax[90]] = (fr.ax[115] ^ fr.ax[113]);
        fr.bd[fr.ax[192]] = (fr.ax[124] ^ fr.ax[163]);
        fr.bd[fr.ax[193]] = (fr.ax[147] ^ fr.ax[95] ^ (fr.ax[79] ^ fr.ax[41]));
        fr.bd[fr.ax[194]] = (fr.ax[33] + fr.ax[87] - fr.ax[127] + fr.ax[30] ^ fr.ax[118] + fr.ax[68] - fr.ax[51] + fr.ax[173]);
        fr.bd[fr.ax[130]] = (fr.ax[143] ^ fr.ax[194] ^ (fr.ax[74] ^ fr.ax[196]));
        fr.bd[fr.ax[58]] = (fr.ax[66] ^ fr.ax[116] ^ (fr.ax[94] ^ fr.ax[103]));
        fr.bd[fr.ax[195]] = (fr.ax[182] ^ fr.ax[143]);
        fr.bd[fr.ax[196]] = (fr.ax[152] ^ fr.ax[126]);
        fr.bd[fr.ax[143]] = (fr.ax[79] ^ fr.ax[18] ^ (fr.ax[26] ^ fr.ax[218]));
        fr.bd[fr.ax[197]] = (fr.ax[168] ^ fr.ax[138]);
        fr.bd[fr.ax[198]] = (fr.ax[6] ^ fr.ax[86] ^ (fr.ax[202] ^ fr.ax[100]));
        fr.bd[fr.ax[123]] = (fr.ax[159] ^ fr.ax[8]);
        fr.bd[fr.ax[142]] = (fr.ax[47] ^ fr.ax[87] ^ (fr.ax[40] ^ fr.ax[160]));
        fr.bd[fr.ax[199]] = (fr.ax[116] ^ fr.ax[78]) + (fr.ax[247] ^ fr.ax[55]) - (fr.ax[147] ^ fr.ax[88]) + (fr.ax[51] ^ fr.ax[96]);
        fr.bd[fr.ax[184]] = (fr.ax[52] ^ fr.ax[134]) + (fr.ax[68] ^ fr.ax[105]) - -(fr.ax[2] ^ fr.ax[152]) + (fr.ax[156] ^ fr.ax[32]);
        fr.bd[fr.ax[200]] = fr.ax[18] + fr.ax[119] - fr.ax[200] + fr.ax[17];
        fr.bd[fr.ax[201]] = (fr.ax[11] ^ fr.ax[24]) + " ".length() - (fr.ax[64] ^ fr.ax[11]) + (fr.ax[132] ^ fr.ax[5]);
        fr.bd[fr.ax[202]] = (fr.ax[22] ^ fr.ax[119]) + (fr.ax[66] ^ fr.ax[194]) - (fr.ax[164] ^ fr.ax[0]) + (fr.ax[81] + fr.ax[146] - fr.ax[10] + fr.ax[138]);
        fr.bd[fr.ax[21]] = (fr.ax[3] ^ fr.ax[160]) + (fr.ax[269] ^ fr.ax[122]) - (fr.ax[150] ^ fr.ax[87]) + (fr.ax[130] ^ fr.ax[190]);
        fr.bd[fr.ax[203]] = fr.ax[25] + fr.ax[85] - fr.ax[52] + fr.ax[41];
        fr.bd[fr.ax[204]] = fr.ax[10] + fr.ax[146] - fr.ax[51] + fr.ax[116];
        fr.bd[fr.ax[205]] = (fr.ax[239] ^ fr.ax[25]) + (fr.ax[258] ^ fr.ax[122]) - (fr.ax[207] ^ fr.ax[15]) + (fr.ax[80] ^ fr.ax[103]);
        fr.bd[fr.ax[206]] = fr.ax[151] + fr.ax[48] - fr.ax[351] + fr.ax[148];
        fr.bd[fr.ax[207]] = (fr.ax[215] ^ fr.ax[220]) + (fr.ax[120] + fr.ax[137] - fr.ax[161] + fr.ax[85]) - (fr.ax[35] + fr.ax[8] - fr.ax[128] + fr.ax[71]) + (fr.ax[86] ^ fr.ax[172]);
        fr.bd[fr.ax[208]] = fr.ax[3] + fr.ax[85] - fr.ax[352] + fr.ax[43];
        fr.bd[fr.ax[209]] = (fr.ax[167] ^ fr.ax[64]) + (fr.ax[270] ^ fr.ax[195]) - (fr.ax[85] ^ fr.ax[65]) + (fr.ax[121] + fr.ax[177] - fr.ax[163] + fr.ax[2]);
        fr.bd[fr.ax[97]] = (fr.ax[97] ^ fr.ax[25]) + (fr.ax[217] ^ fr.ax[195]) - (fr.ax[32] ^ fr.ax[156]) + (fr.ax[40] ^ fr.ax[24]);
        fr.bd[fr.ax[210]] = fr.ax[36] + fr.ax[84] - fr.ax[90] + fr.ax[71];
        fr.bd[fr.ax[139]] = (fr.ax[28] ^ fr.ax[35]) + (fr.ax[108] ^ fr.ax[179]) - (fr.ax[116] + fr.ax[7] - fr.ax[121] + fr.ax[151]) + (fr.ax[128] + fr.ax[72] - fr.ax[6] + fr.ax[151]);
    }
    
    private static boolean s(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean y(final int n) {
        return n > 0;
    }
    
    public static void n(final int n) {
        final af af;
        int c = (af = (af)fr.ad.elementAt(n)).c;
        int n2 = af.d;
        if (r(x(af.d) ? 1 : 0) && r(o(af.a, fr.a - 24) ? 1 : 0)) {
            if (r(f(af.b, fr.k / 2) ? 1 : 0)) {
                c = af.b + 12;
                n2 = af.a;
            }
            else if (r(n(af.c, fr.k / 2) ? 1 : 0)) {
                c = af.c - 12;
                n2 = af.a;
            }
        }
        else if (r(f(af.a, fr.a / 2) ? 1 : 0)) {
            c = (af.b + af.c) / 2;
            n2 = af.a + 24;
        }
        else if (r(n(af.d, fr.a / 2) ? 1 : 0)) {
            c = (af.b + af.c) / 2 + 24;
            n2 = af.a - 48;
        }
        if (r(q(fr.s, 114) ? 1 : 0) && r(q(fr.s, 115) ? 1 : 0) && r(q(fr.s, 116) ? 1 : 0)) {
            aa.telePick(c, n2);
        }
        else {
            aa.telePick(c, n2);
        }
        try {
            Thread.sleep(10L);
        }
        catch (final InterruptedException ex) {
            final Throwable t;
            t.printStackTrace();
        }
        fl.u().ac();
    }
    
    public static boolean map(final int n) {
        final short s = fr.s;
        fr.ac = n;
        fa fa = null;
        Label_5385: {
            if (r(s(s) ? 1 : 0) && r(o(s, fr.ai.length) ? 1 : 0) && r(s(n) ? 1 : 0) && r(o(n, fr.ai.length) ? 1 : 0) && r(q(fr.ai[s].length) ? 1 : 0)) {
                final fq m = aa.m(0);
                int n2 = 0;
                while (r(o(n2, fr.aj.length) ? 1 : 0)) {
                    fr.aj[n2] = true;
                    fr.an[n2] = -1;
                    fr.bh[n2] = -1;
                    ++n2;
                    "".length();
                    "".length();
                    if (g("  ".length(), " ".length())) {
                        return ((fr.ax[166] + fr.ax[5] - fr.ax[146] + fr.ax[101] ^ fr.ax[42] + fr.ax[19] - fr.ax[211] + fr.ax[66]) & (fr.ax[212] ^ fr.ax[62] ^ (fr.ax[213] ^ fr.ax[100]) ^ -" ".length())) != 0x0;
                    }
                }
                fr.an[s] = 0;
                while (!r(p(fr.aj[n] ? 1 : 0) ? 1 : 0)) {
                    int n3 = -1;
                    short n4 = -1;
                    int n5 = 0;
                    while (r(o(n5, fr.ai.length) ? 1 : 0)) {
                        if (r(x(fr.aj[n5] ? 1 : 0) ? 1 : 0) && r(q(fr.an[n5], -1) ? 1 : 0) && (!r(n(fr.an[n5], n3) ? 1 : 0) || r(j(n3, -1) ? 1 : 0))) {
                            n3 = fr.an[n5];
                            n4 = (short)n5;
                        }
                        ++n5;
                        "".length();
                        "".length();
                        if (w("  ".length())) {
                            return ((fr.ax[36] + fr.ax[135] - fr.ax[97] + fr.ax[83] ^ fr.ax[159] + fr.ax[125] - fr.ax[182] + fr.ax[16]) & (fr.ax[112] ^ fr.ax[177] ^ (fr.ax[11] ^ fr.ax[64]) ^ -" ".length())) != 0x0;
                        }
                    }
                    if (r(j(n4, -1) ? 1 : 0)) {
                        fa = null;
                        "".length();
                        "".length();
                        if (r((fr.ax[5] + fr.ax[186] - fr.ax[13] + fr.ax[4] ^ fr.ax[102] + fr.ax[72] - fr.ax[216] + fr.ax[158]) & (fr.ax[88] ^ fr.ax[114] ^ (fr.ax[10] ^ fr.ax[79]) ^ -" ".length()))) {
                            return ((fr.ax[73] + fr.ax[169] - fr.ax[15] + fr.ax[125] ^ fr.ax[136] + fr.ax[165] - fr.ax[44] + fr.ax[182]) & (fr.ax[17] ^ fr.ax[74] ^ (fr.ax[176] ^ fr.ax[50]) ^ -" ".length())) != 0x0;
                        }
                        break Label_5385;
                    }
                    else {
                        fr.aj[n4] = false;
                        final int g = g(n4) ? 1 : 0;
                        final short[] array = fr.ai[n4];
                        int n6 = 0;
                        while (r(o(n6, array.length) ? 1 : 0)) {
                            final short n7 = array[n6];
                            if (r(x(fr.aj[n7] ? 1 : 0) ? 1 : 0) && (!r(q(fr.an[n7], -1) ? 1 : 0) || r(r(fr.an[n7], fr.an[n4] + 1) ? 1 : 0))) {
                                fr.an[n7] = fr.an[n4] + 1;
                                fr.bh[n7] = n4;
                            }
                            ++n6;
                            "".length();
                            "".length();
                            if (h(-" ".length(), "   ".length())) {
                                return ((fr.ax[166] + fr.ax[169] - fr.ax[132] + fr.ax[93] ^ fr.ax[57] + fr.ax[42] - fr.ax[224] + fr.ax[18]) & (fr.ax[223] ^ fr.ax[189] ^ (fr.ax[191] ^ fr.ax[195]) ^ -" ".length())) != 0x0;
                            }
                        }
                        if (r(x(g) ? 1 : 0) && r(d(m) ? 1 : 0) && r(x(fr.aj[m.f] ? 1 : 0) ? 1 : 0) && (!r(q(fr.an[m.f], -1) ? 1 : 0) || r(r(fr.an[m.f], fr.an[n4] + 1) ? 1 : 0))) {
                            fr.an[m.f] = fr.an[n4] + 1;
                            fr.bh[m.f] = n4;
                        }
                        if (r(x(g) ? 1 : 0)) {
                            int n8;
                            if (r(x(ee.eo ? 1 : 0) ? 1 : 0)) {
                                n8 = 98;
                                "".length();
                                "".length();
                                if (g(-" ".length(), " ".length())) {
                                    return ((fr.ax[77] ^ fr.ax[189] ^ (fr.ax[14] ^ fr.ax[30])) & (fr.ax[135] + fr.ax[119] - fr.ax[105] + fr.ax[79] ^ fr.ax[65] + fr.ax[10] - fr.ax[229] + fr.ax[4] ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                n8 = 104;
                            }
                            final short n9 = (short)n8;
                            if (!r(q(fr.an[n9], -1) ? 1 : 0) || r(r(fr.an[n9], fr.an[n4] + 1) ? 1 : 0)) {
                                fr.an[n9] = fr.an[n4] + 1;
                                fr.bh[n9] = n4;
                            }
                        }
                        if (r(x(aa.y ? 1 : 0) ? 1 : 0) && (!r(q(fr.an[138], -1) ? 1 : 0) || r(r(fr.an[138], fr.an[n4] + 1) ? 1 : 0))) {
                            fr.an[138] = fr.an[n4] + 1;
                            fr.bh[138] = n4;
                        }
                        if (!r(x(aa.y ? 1 : 0) ? 1 : 0) || (r(q(fr.an[162], -1) ? 1 : 0) && !r(r(fr.an[162], fr.an[n4] + 1) ? 1 : 0))) {
                            continue;
                        }
                        fr.an[162] = fr.an[n4] + 1;
                        fr.bh[162] = n4;
                        "".length();
                        "".length();
                        if (g(fr.ax[165] ^ fr.ax[167], "   ".length())) {
                            return ((fr.ax[118] ^ fr.ax[178]) & (fr.ax[170] ^ fr.ax[32] ^ fr.ax[13])) != 0x0;
                        }
                        continue;
                    }
                }
                final fa fa2;
                (fa2 = new fa()).addElement(new Integer(n));
                int n10 = n;
                while (r(q(n10, s) ? 1 : 0)) {
                    int value;
                    if (r(x(i(value = fr.bh[n10]) ? 1 : 0) ? 1 : 0)) {
                        if (r(x(i(n10) ? 1 : 0) ? 1 : 0) && r(q(n10, 138) ? 1 : 0) && r(q(n10, 162) ? 1 : 0)) {
                            int n11 = 1;
                            if (r(j(n10, 10) ? 1 : 0)) {
                                n11 = 1;
                                "".length();
                                "".length();
                                if (b((Object)null)) {
                                    return ((fr.ax[198] ^ fr.ax[133] ^ (fr.ax[163] ^ fr.ax[165])) & (fr.ax[113] ^ fr.ax[135] ^ (fr.ax[45] ^ fr.ax[121]) ^ -" ".length())) != 0x0;
                                }
                            }
                            else if (r(j(n10, 17) ? 1 : 0)) {
                                n11 = 2;
                                "".length();
                                "".length();
                                if (b((Object)null)) {
                                    return ((fr.ax[100] ^ fr.ax[21]) & (fr.ax[214] ^ fr.ax[193] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 22) ? 1 : 0)) {
                                n11 = 3;
                                "".length();
                                "".length();
                                if (g("  ".length(), -" ".length())) {
                                    return ((fr.ax[215] ^ fr.ax[142]) & (fr.ax[174] ^ fr.ax[51] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 32) ? 1 : 0)) {
                                n11 = 4;
                                "".length();
                                "".length();
                                if (h("  ".length(), "  ".length())) {
                                    return ((fr.ax[78] ^ fr.ax[25]) & (fr.ax[105] ^ fr.ax[128] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 38) ? 1 : 0)) {
                                n11 = 5;
                                "".length();
                                "".length();
                                if (r((fr.ax[149] ^ fr.ax[70]) & (fr.ax[172] ^ fr.ax[113] ^ fr.ax[13]))) {
                                    return ((fr.ax[32] ^ fr.ax[23]) & (fr.ax[86] ^ fr.ax[75] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 43) ? 1 : 0)) {
                                n11 = 6;
                                "".length();
                                "".length();
                                if (h("  ".length(), "  ".length())) {
                                    return ((fr.ax[18] ^ fr.ax[154]) & (fr.ax[209] ^ fr.ax[72] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 48) ? 1 : 0)) {
                                n11 = 7;
                            }
                            value = (value | Integer.MIN_VALUE | 0x7000000 | (n11 << 20 & 0xF00000));
                            "".length();
                            "".length();
                            if (g("   ".length(), -" ".length())) {
                                return ((fr.ax[217] ^ fr.ax[27]) & (fr.ax[179] ^ fr.ax[43] ^ fr.ax[13])) != 0x0;
                            }
                        }
                        else if (r(j(n10, 139) ? 1 : 0)) {
                            value = (value | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                            "".length();
                            "".length();
                            if (s("  ".length(), fr.ax[131] ^ fr.ax[218])) {
                                return ((fr.ax[32] ^ fr.ax[172]) & (fr.ax[217] ^ fr.ax[26] ^ fr.ax[13])) != 0x0;
                            }
                        }
                    }
                    else if (r(x(g(value) ? 1 : 0) ? 1 : 0)) {
                        if (r(x(g(n10) ? 1 : 0) ? 1 : 0)) {
                            int n12 = 0;
                            if (r(j(n10, 1) ? 1 : 0)) {
                                n12 = 0;
                                "".length();
                                "".length();
                                if (w(fr.ax[178] ^ fr.ax[23])) {
                                    return ((fr.ax[219] ^ fr.ax[16]) & (fr.ax[14] ^ fr.ax[128] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 27) ? 1 : 0)) {
                                n12 = 1;
                                "".length();
                                "".length();
                                if (r((fr.ax[117] ^ fr.ax[57]) & (fr.ax[103] ^ fr.ax[148] ^ fr.ax[13]))) {
                                    return ((fr.ax[198] ^ fr.ax[27]) & (fr.ax[24] ^ fr.ax[5] ^ fr.ax[13])) != 0x0;
                                }
                            }
                            else if (r(j(n10, 72) ? 1 : 0)) {
                                n12 = 2;
                            }
                            value = (value | Integer.MIN_VALUE | 0x8000000 | (n12 << 20 & 0xF00000));
                            "".length();
                            "".length();
                            if (t(fr.ax[18] ^ fr.ax[107])) {
                                return ((fr.ax[26] ^ fr.ax[72]) & (fr.ax[39] ^ fr.ax[33] ^ fr.ax[13])) != 0x0;
                            }
                        }
                        else if (r(d(m) ? 1 : 0) && r(j(n10, m.f) ? 1 : 0)) {
                            value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz << 20 & 0xF00000) | 0x30000);
                            "".length();
                            "".length();
                            if (g((fr.ax[135] ^ fr.ax[112]) & (fr.ax[214] ^ fr.ax[199] ^ fr.ax[13]), fr.ax[107] ^ fr.ax[11])) {
                                return ((fr.ax[163] ^ fr.ax[162]) & (fr.ax[172] ^ fr.ax[19] ^ fr.ax[13])) != 0x0;
                            }
                        }
                        else {
                            switch (n10) {
                                case 80: {
                                    value = (value | Integer.MIN_VALUE | 0x100000 | 0x10000);
                                    "".length();
                                    "".length();
                                    if (m("   ".length(), "   ".length())) {
                                        return ((fr.ax[101] ^ fr.ax[0]) & (fr.ax[123] ^ fr.ax[220] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 91: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x10000);
                                    "".length();
                                    "".length();
                                    if (t("  ".length())) {
                                        return ((fr.ax[9] ^ fr.ax[150]) & (fr.ax[218] ^ fr.ax[196] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 94: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x20000);
                                    "".length();
                                    "".length();
                                    if (h(-" ".length(), " ".length())) {
                                        return ((fr.ax[221] ^ fr.ax[189]) & (fr.ax[15] ^ fr.ax[184] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 98: {
                                    value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz + 2 << 20 & 0xF00000));
                                    "".length();
                                    "".length();
                                    if (m(fr.ax[19] ^ fr.ax[175], fr.ax[59] ^ fr.ax[163])) {
                                        return ((fr.ax[23] ^ fr.ax[112]) & (fr.ax[88] ^ fr.ax[61] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 104: {
                                    value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz + 2 << 20 & 0xF00000) | 0x10000);
                                    "".length();
                                    "".length();
                                    if (r((fr.ax[222] ^ fr.ax[189]) & (fr.ax[50] ^ fr.ax[33] ^ fr.ax[13]))) {
                                        return ((fr.ax[0] ^ fr.ax[88]) & (fr.ax[56] ^ fr.ax[101] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 105: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x30000);
                                    "".length();
                                    "".length();
                                    if (k("   ".length(), (fr.ax[161] ^ fr.ax[101]) & (fr.ax[136] ^ fr.ax[179] ^ fr.ax[13]))) {
                                        return ((fr.ax[16] ^ fr.ax[182]) & (fr.ax[175] ^ fr.ax[42] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 113: {
                                    value = (value | Integer.MIN_VALUE | 0x19000000 | (ee.bz + 3 << 20 & 0xF00000));
                                    "".length();
                                    "".length();
                                    if (t(" ".length())) {
                                        return ((fr.ax[211] ^ fr.ax[66]) & (fr.ax[75] ^ fr.ax[149] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 114: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x40000);
                                    "".length();
                                    "".length();
                                    if (k(" ".length(), -" ".length())) {
                                        return ((fr.ax[148] ^ fr.ax[63] ^ "  ".length()) & (fr.ax[169] ^ fr.ax[155] ^ (fr.ax[96] ^ fr.ax[80]) ^ -" ".length())) != 0x0;
                                    }
                                    break;
                                }
                                case 125: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x50000);
                                    "".length();
                                    "".length();
                                    if (l("   ".length(), "   ".length())) {
                                        return ((fr.ax[145] ^ fr.ax[40]) & (fr.ax[33] ^ fr.ax[43] ^ fr.ax[13])) != 0x0;
                                    }
                                    break;
                                }
                                case 139: {
                                    value = (value | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                                    "".length();
                                    "".length();
                                    if (l((fr.ax[210] ^ fr.ax[192] ^ (fr.ax[184] ^ fr.ax[186])) & (fr.ax[54] ^ fr.ax[77] ^ (fr.ax[34] ^ fr.ax[82]) ^ -" ".length()), (fr.ax[165] ^ fr.ax[156] ^ (fr.ax[136] ^ fr.ax[121])) & (fr.ax[121] ^ fr.ax[44] ^ (fr.ax[52] ^ fr.ax[189]) ^ -" ".length()))) {
                                        return ((fr.ax[143] + fr.ax[88] - fr.ax[200] + fr.ax[189] ^ fr.ax[56] + fr.ax[72] - fr.ax[3] + fr.ax[157]) & (fr.ax[57] ^ fr.ax[202] ^ (fr.ax[112] ^ fr.ax[14]) ^ -" ".length())) != 0x0;
                                    }
                                    break;
                                }
                                case 157: {
                                    value = (value | Integer.MIN_VALUE | 0x200000 | 0x60000);
                                    break;
                                }
                            }
                        }
                    }
                    fa2.addElement(new Integer(value));
                    n10 = fr.bh[n10];
                    "".length();
                    "".length();
                    if (o(-(fr.ax[103] ^ fr.ax[95]))) {
                        return ((fr.ax[116] ^ fr.ax[220]) & (fr.ax[98] ^ fr.ax[195] ^ fr.ax[13])) != 0x0;
                    }
                }
                final fa fa3 = new fa();
                int n13 = fa2.size() - 1;
                while (r(s(n13) ? 1 : 0)) {
                    fa3.addElement(fa2.elementAt(n13));
                    --n13;
                    "".length();
                    "".length();
                    if (g((fr.ax[52] ^ fr.ax[200]) & (fr.ax[36] ^ fr.ax[118] ^ fr.ax[13]), fr.ax[204] ^ fr.ax[201])) {
                        return ((fr.ax[8] ^ fr.ax[107]) & (fr.ax[144] ^ fr.ax[199] ^ fr.ax[13])) != 0x0;
                    }
                }
                fa = fa3;
                "".length();
                "".length();
                if (g("   ".length(), (fr.ax[55] ^ fr.ax[186]) & (fr.ax[29] ^ fr.ax[70] ^ fr.ax[13]))) {
                    return ((fr.ax[136] ^ fr.ax[170]) & (fr.ax[140] ^ fr.ax[75] ^ fr.ax[13])) != 0x0;
                }
            }
            else {
                fa = null;
            }
        }
        final fa fa4 = fa;
        if (r(c(fa) ? 1 : 0)) {
            dy.d = true;
            eh.a("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, cl.q);
            return false;
        }
        fr.v = true;
        try {
            int s2 = fr.s;
            int n14 = 1;
            while (r(o(n14, fa4.size()) ? 1 : 0) && r(x(fr.v ? 1 : 0) ? 1 : 0) && r(j(s2, fr.s) ? 1 : 0)) {
                final int intValue = (int)fa4.elementAt(n14 - 1);
                s2 = ((int)fa4.elementAt(n14) & 0xFFFF);
                if (r(v(intValue) ? 1 : 0)) {
                    ee.a(intValue >> 24 & 0x7F, intValue >> 20 & 0xF, intValue >> 16 & 0xF);
                    "".length();
                    "".length();
                    if (l(fr.ax[17] ^ fr.ax[116], "   ".length())) {
                        return ((fr.ax[103] ^ fr.ax[95]) & (fr.ax[195] ^ fr.ax[198] ^ fr.ax[13])) != 0x0;
                    }
                }
                else if ((!r(n(intValue, 134) ? 1 : 0) || r(r(intValue, 162) ? 1 : 0)) && r(j(s2, 162) ? 1 : 0)) {
                    if (r(q(aa.z().f) ? 1 : 0)) {
                        eh.a("Hi\u1ebfu chi\u1ebfn qu\u00e1 cao!", 50, cl.q);
                        return false;
                    }
                    final el d;
                    if (!r(d(d = aa.d(InputNpc.ltt)) ? 1 : 0) || r(q(d.j.d, InputNpc.ltt) ? 1 : 0)) {
                        if (r(x(aa.q ? 1 : 0) ? 1 : 0) && r(n(aa.z().w, 10) ? 1 : 0)) {
                            fl.u().b(14, InputNpc.muaLTT, 2);
                            es.w();
                            return false;
                        }
                        eh.a("!", 50, cl.q);
                        return false;
                    }
                    else {
                        fl.u().t(d.p);
                        "".length();
                        "".length();
                        if (b((Object)null)) {
                            return ((fr.ax[150] ^ fr.ax[103] ^ (fr.ax[203] ^ fr.ax[192])) & (fr.ax[88] + fr.ax[122] - fr.ax[130] + fr.ax[187] ^ fr.ax[179] + fr.ax[103] - fr.ax[60] + fr.ax[107] ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else if ((!r(n(intValue, 134) ? 1 : 0) || r(r(intValue, 138) ? 1 : 0)) && r(j(s2, 138) ? 1 : 0)) {
                    if (r(q(aa.z().f) ? 1 : 0)) {
                        return false;
                    }
                    final el d2;
                    if (!r(d(d2 = aa.d(InputNpc.cl)) ? 1 : 0) || r(q(d2.j.d, InputNpc.cl) ? 1 : 0)) {
                        if (r(x(aa.q ? 1 : 0) ? 1 : 0) && r(n(aa.z().w, 10) ? 1 : 0)) {
                            fl.u().b(14, InputNpc.muaCL, 2);
                            es.w();
                            return false;
                        }
                        eh.a("!", 50, cl.q);
                        return false;
                    }
                    else {
                        fl.u().t(d2.p);
                        "".length();
                        "".length();
                        if (y(-"  ".length())) {
                            return ((fr.ax[99] ^ fr.ax[220]) & (fr.ax[147] ^ fr.ax[148] ^ fr.ax[13])) != 0x0;
                        }
                    }
                }
                else if (r(x(intValue) ? 1 : 0) && r(q(intValue, 56) ? 1 : 0) && r(q(intValue, 73) ? 1 : 0)) {
                    int n15 = -1;
                    int n16 = 0;
                    while (r(o(n16, fr.ai[intValue].length) ? 1 : 0)) {
                        if (r(j(fr.ai[intValue][n16], s2) ? 1 : 0)) {
                            n15 = n16;
                            "".length();
                            "".length();
                            if (r((fr.ax[18] ^ fr.ax[64]) & (fr.ax[223] ^ fr.ax[144] ^ fr.ax[13]))) {
                                return ((fr.ax[85] ^ fr.ax[148]) & (fr.ax[99] ^ fr.ax[17] ^ fr.ax[13])) != 0x0;
                            }
                            break;
                        }
                        else {
                            ++n16;
                            "".length();
                            "".length();
                            if (g(-" ".length(), fr.ax[147] ^ fr.ax[50] ^ (fr.ax[19] ^ fr.ax[108]))) {
                                return ((fr.ax[130] ^ fr.ax[195] ^ (fr.ax[107] ^ fr.ax[158])) & (fr.ax[85] ^ fr.ax[11] ^ (fr.ax[40] ^ fr.ax[163]) ^ -" ".length())) != 0x0;
                            }
                            continue;
                        }
                    }
                    if (r(j(n15, -1) ? 1 : 0)) {
                        dy.d = true;
                        eh.a("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, cl.q);
                        return false;
                    }
                    n(n15);
                    "".length();
                    "".length();
                    if (b((Object)null)) {
                        return ((fr.ax[230] ^ fr.ax[130]) & (fr.ax[112] ^ fr.ax[149] ^ fr.ax[13])) != 0x0;
                    }
                }
                else {
                    final fc c;
                    if (r(d(c = (fc)ee.dr.elementAt(0)) ? 1 : 0) && r(q(c.dw, 15) ? 1 : 0)) {
                        aa.a(c.ai, c.eu);
                        "".length();
                        aa.z().c = c;
                        fl.u().s(c.gm.a);
                        fl.u().c(c.gm.a, 0, 0);
                        fl.u().j(c.gm.a, 0);
                    }
                }
                if (r(q(fr.s, s2) ? 1 : 0)) {
                    h();
                }
                Thread.sleep(1L);
                ++n14;
                "".length();
                "".length();
                if (y(-" ".length())) {
                    return ((fr.ax[10] ^ fr.ax[87] ^ (fr.ax[207] ^ fr.ax[190])) & (fr.ax[121] ^ fr.ax[177] ^ (fr.ax[87] ^ fr.ax[164]) ^ -" ".length())) != 0x0;
                }
            }
            "".length();
            "".length();
            if (t(fr.ax[61] ^ fr.ax[87] ^ (fr.ax[71] ^ fr.ax[113]))) {
                return ((fr.ax[224] ^ fr.ax[15] ^ (fr.ax[160] ^ fr.ax[41])) & (fr.ax[176] + fr.ax[174] - fr.ax[137] + fr.ax[118] ^ fr.ax[112] + fr.ax[64] - fr.ax[88] + fr.ax[38] ^ -" ".length())) != 0x0;
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
            return false;
        }
        fr.v = false;
        return r(j(fr.s, n) ? 1 : 0);
    }
}
