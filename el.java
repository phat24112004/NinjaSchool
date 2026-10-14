import javax.microedition.lcdui.*;
import java.util.*;

public final class el
{
    private static final int[] x;
    public boolean a;
    public int b;
    private static final int[] y;
    public boolean c;
    public fa d;
    public int e;
    public long f;
    public int g;
    public boolean h;
    public int i;
    public ep j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public Image q;
    public long r;
    public long s;
    public int t;
    public bb u;
    public int v;
    public int w;
    
    private static boolean b(final int n) {
        int n2;
        if (e(n)) {
            n2 = el.x[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0x3F ^ 0x17) & ~(0xBB ^ 0x93)) != 0x0;
            }
        }
        else {
            n2 = el.x[2];
        }
        return n2 != 0;
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    private static boolean a(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean c(final int n) {
        return n >= 0;
    }
    
    public final int a() {
        if (e(b(this.d) ? 1 : 0)) {
            int n = 0;
            while (e(d(n, this.d.size()) ? 1 : 0)) {
                final en en;
                if (e(b(en = (en)this.d.elementAt(n)) ? 1 : 0) && e(c(en.b.a, 85) ? 1 : 0)) {
                    return en.c;
                }
                ++n;
                "".length();
                "".length();
                if (e((el.x[52] + el.x[53] - el.x[54] + el.x[55] ^ el.x[56] + el.x[18] - el.x[57] + el.x[13]) & (el.x[18] ^ el.x[58] ^ (el.x[59] ^ el.x[60]) ^ -" ".length()))) {
                    return (el.x[61] ^ el.x[62] ^ (el.x[22] ^ el.x[63])) & (el.x[64] + el.x[65] - el.x[66] + el.x[67] ^ el.x[68] + el.x[65] - el.x[69] + el.x[70] ^ -" ".length());
                }
            }
        }
        return -1;
    }
    
    public final boolean b() {
        return e(c(this.v(), this.n) ? 1 : 0);
    }
    
    public final void c() {
        if (e(d(this.k() ? 1 : 0) ? 1 : 0)) {
            this.s = 0L;
        }
    }
    
    public final String d() {
        if (e(g(a(this.s, 0L)) ? 1 : 0)) {
            return co.ek;
        }
        final Calendar instance;
        (instance = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("GMT+7"));
        instance.setTime(new Date(this.s));
        return new StringBuffer().append(instance.get(5)).append("/").append(instance.get(2) + 1).append("/").append(instance.get(1)).append(" ").append(instance.get(11)).append("h").append(instance.get(12)).append("'").toString();
    }
    
    private static int a(final long n, final long n2) {
        return b(n, n2);
    }
    
    private static boolean d(final int n) {
        int n2;
        if (j(n)) {
            n2 = el.x[1];
            "".length();
            if (null != null) {
                return ((0x4F ^ 0x1F) & ~(0xFE ^ 0xAE)) != 0x0;
            }
        }
        else {
            n2 = el.x[2];
        }
        return n2 != 0;
    }
    
    public final el e() {
        final el el;
        (el = new el()).j = this.j;
        if (e(b(this.d) ? 1 : 0)) {
            el.d = new fa();
            int n = 0;
            while (e(d(n, this.d.size()) ? 1 : 0)) {
                final en en;
                (en = new en()).b = ((en)this.d.elementAt(n)).b;
                en.c = ((en)this.d.elementAt(n)).c;
                el.d.addElement(en);
                ++n;
                "".length();
                "".length();
                if (f(-" ".length(), "  ".length())) {
                    return null;
                }
            }
        }
        el.v = this.v;
        el.p = this.p;
        el.l = this.l;
        el.s = this.s;
        el.o = this.o;
        el.g = this.g;
        el.n = this.n;
        el.m = this.m;
        el.t = this.t;
        el.k = this.k;
        el.e = this.e;
        el.i = this.i;
        el.c = this.c;
        return el;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = el.x[1];
            "".length();
            if ((0x60 ^ 0x64) <= "  ".length()) {
                return ((0x76 ^ 0x27) & ~(0x5B ^ 0xA)) != 0x0;
            }
        }
        else {
            n = el.x[2];
        }
        return n != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        return n >= n2;
    }
    
    private static int b(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public el() {
        super();
        this.f = 0L;
        this.h = false;
        this.a = false;
        this.b = 0;
        this.r = 0L;
    }
    
    private static boolean e(final int n) {
        return n != 0;
    }
    
    public final String f() {
        if (e(g(c(this.s, 0L)) ? 1 : 0)) {
            return co.ek;
        }
        if (e(l(c(this.s / 1000L, 2592000L)) ? 1 : 0)) {
            return new StringBuffer().append(this.s / 1000L / 2592000L).append(" ").append(co.hz).toString();
        }
        if (e(l(c(this.s / 1000L, 604800L)) ? 1 : 0)) {
            return new StringBuffer().append(this.s / 1000L / 604800L).append(" ").append(co.mh).toString();
        }
        if (e(l(c(this.s / 1000L, 86400L)) ? 1 : 0)) {
            return new StringBuffer().append(this.s / 1000L / 86400L).append(" ").append(co.my).toString();
        }
        if (e(l(c(this.s / 1000L, 3600L)) ? 1 : 0)) {
            return new StringBuffer().append(this.s / 1000L / 3600L).append(" ").append(co.kq).toString();
        }
        if (e(l(c(this.s / 1000L, 60L)) ? 1 : 0)) {
            return new StringBuffer().append(this.s / 1000L / 60L).append(" ").append(co.ck).toString();
        }
        return "";
    }
    
    public final boolean g() {
        return e(c(this.i, 14) ? 1 : 0);
    }
    
    public final boolean h() {
        return e(c(this.j.b, 34) ? 1 : 0);
    }
    
    private static boolean f(final int n) {
        int n2;
        if (i(n)) {
            n2 = el.x[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0x16 ^ 0x21 ^ (0x1A ^ 0x29)) & (70 + 142 - 210 + 182 ^ 103 + 93 - 50 + 42 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = el.x[2];
        }
        return n2 != 0;
    }
    
    private static boolean g(final int n) {
        int n2;
        if (k(n)) {
            n2 = el.x[1];
            "".length();
            if ((0x77 ^ 0x13 ^ (0xA4 ^ 0xC5)) <= 0) {
                return ((0xA4 ^ 0x8B ^ " ".length()) & (0xC3 ^ 0xA3 ^ (0x89 ^ 0xC7) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = el.x[2];
        }
        return n2 != 0;
    }
    
    public final boolean i() {
        return !e(k(this.i, 5) ? 1 : 0) || !e(k(this.i, 3) ? 1 : 0) || !e(k(this.i, 4) ? 1 : 0) || e(c(this.i, 39) ? 1 : 0);
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = el.x[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0xCC ^ 0x96) & ~(0xB ^ 0x51)) != 0x0;
            }
        }
        else {
            n3 = el.x[2];
        }
        return n3 != 0;
    }
    
    private static int c(final long n, final long n2) {
        return d(n, n2);
    }
    
    public final boolean j() {
        return !e(k(this.j.b, 3) ? 1 : 0) || !e(k(this.j.b, 5) ? 1 : 0) || !e(k(this.j.b, 7) ? 1 : 0) || e(c(this.j.b, 9) ? 1 : 0);
    }
    
    public final boolean k() {
        return e(g(29, this.j.b) ? 1 : 0) && e(g(this.j.b, 33) ? 1 : 0);
    }
    
    public final el a(int n) {
        final el e;
        (e = this.e()).o = true;
        final int n2;
        if (e(d(n2 = n - e.n) ? 1 : 0)) {
            return e;
        }
        e.n = n;
        if (e(b(e.d) ? 1 : 0)) {
            n = 0;
            while (e(d(n, e.d.size()) ? 1 : 0)) {
                final en en;
                if (e(k((en = (en)e.d.elementAt(n)).b.a, 6) ? 1 : 0) && e(k(en.b.a, 7) ? 1 : 0)) {
                    if (e(k(en.b.a, 8) ? 1 : 0) && e(k(en.b.a, 9) ? 1 : 0) && e(k(en.b.a, 19) ? 1 : 0)) {
                        if (e(k(en.b.a, 10) ? 1 : 0) && e(k(en.b.a, 11) ? 1 : 0) && e(k(en.b.a, 12) ? 1 : 0) && e(k(en.b.a, 13) ? 1 : 0) && e(k(en.b.a, 14) ? 1 : 0) && e(k(en.b.a, 15) ? 1 : 0) && e(k(en.b.a, 17) ? 1 : 0) && e(k(en.b.a, 18) ? 1 : 0) && e(k(en.b.a, 20) ? 1 : 0)) {
                            if (e(k(en.b.a, 21) ? 1 : 0) && e(k(en.b.a, 22) ? 1 : 0) && e(k(en.b.a, 23) ? 1 : 0) && e(k(en.b.a, 24) ? 1 : 0) && e(k(en.b.a, 25) ? 1 : 0) && e(k(en.b.a, 26) ? 1 : 0)) {
                                if (e(c(en.b.a, 16) ? 1 : 0)) {
                                    final en en2 = en;
                                    en2.c += n2 * 3;
                                    "".length();
                                    "".length();
                                    if (i(-"  ".length())) {
                                        return null;
                                    }
                                }
                            }
                            else {
                                final en en3 = en;
                                en3.c += n2 * 150;
                                "".length();
                                "".length();
                                if (j(el.x[36] ^ el.x[37])) {
                                    return null;
                                }
                            }
                        }
                        else {
                            final en en4 = en;
                            en4.c += n2 * 5;
                            "".length();
                            "".length();
                            if (e((el.x[38] ^ el.x[39] ^ (el.x[40] ^ el.x[41])) & (el.x[34] ^ el.x[4] ^ (el.x[17] ^ el.x[42]) ^ -" ".length()))) {
                                return null;
                            }
                        }
                    }
                    else {
                        final en en5 = en;
                        en5.c += n2 * 10;
                        "".length();
                        "".length();
                        if (h(el.x[43] + el.x[44] - el.x[45] + el.x[46] ^ el.x[47] + el.x[48] - el.x[49] + el.x[42])) {
                            return null;
                        }
                    }
                }
                else {
                    final en en6 = en;
                    en6.c += n2 * 15;
                }
                ++n;
                "".length();
                "".length();
                if (c(-"   ".length())) {
                    return null;
                }
            }
        }
        return e;
    }
    
    private static void w() {
        (y = new int[el.x[71]])[el.x[2]] = ((el.x[72] ^ el.x[73] ^ (el.x[18] ^ el.x[48])) & (el.x[45] ^ el.x[66] ^ (el.x[74] ^ el.x[75]) ^ -" ".length()));
        el.y[el.x[1]] = " ".length();
        el.y[el.x[18]] = (el.x[62] ^ el.x[76]);
        el.y[el.x[20]] = (el.x[77] ^ el.x[78] ^ (el.x[64] ^ el.x[60]));
        el.y[el.x[19]] = (el.x[79] ^ el.x[80] ^ (el.x[81] ^ el.x[82]));
        el.y[el.x[21]] = (el.x[83] ^ el.x[84]);
        el.y[el.x[16]] = (el.x[34] ^ el.x[19]);
        el.y[el.x[31]] = (el.x[45] + el.x[85] - el.x[86] + el.x[80] ^ el.x[46] + el.x[87] - el.x[55] + el.x[69]);
        el.y[el.x[29]] = (el.x[28] ^ el.x[65]);
        el.y[el.x[27]] = (el.x[88] ^ el.x[63]);
        el.y[el.x[32]] = (el.x[89] ^ el.x[90]);
        el.y[el.x[22]] = (el.x[66] ^ el.x[43]);
        el.y[el.x[33]] = (el.x[29] ^ el.x[31]);
        el.y[el.x[14]] = (el.x[4] ^ el.x[1]);
        el.y[el.x[15]] = (el.x[91] + el.x[92] - el.x[93] + el.x[53] ^ el.x[94] + el.x[3] - el.x[15] + el.x[33]);
        el.y[el.x[3]] = (el.x[95] + el.x[86] - el.x[74] + el.x[23] ^ el.x[65] + el.x[74] - el.x[96] + el.x[97]);
        el.y[el.x[4]] = (el.x[32] ^ el.x[98] ^ (el.x[27] ^ el.x[26]));
        el.y[el.x[5]] = (el.x[85] ^ el.x[99]);
        el.y[el.x[6]] = (el.x[69] ^ el.x[100]);
        el.y[el.x[7]] = (el.x[101] + el.x[45] - el.x[102] + el.x[103] ^ el.x[7] + el.x[31] - el.x[104] + el.x[105]);
        el.y[el.x[8]] = (el.x[106] ^ el.x[107]);
        el.y[el.x[9]] = (el.x[108] ^ el.x[63]);
        el.y[el.x[13]] = (el.x[6] + el.x[70] - el.x[109] + el.x[2] ^ el.x[50] + el.x[110] - el.x[73] + el.x[111]);
        el.y[el.x[34]] = "   ".length();
        el.y[el.x[35]] = el.x[42] + el.x[33] - el.x[112] + el.x[8];
        el.y[el.x[30]] = (el.x[113] ^ el.x[114] ^ (el.x[23] ^ el.x[98]));
        el.y[el.x[12]] = (el.x[115] ^ el.x[45]);
        el.y[el.x[50]] = (el.x[85] + el.x[4] - el.x[10] + el.x[101] ^ el.x[22] + el.x[116] - el.x[9] + el.x[117]);
        el.y[el.x[0]] = (el.x[6] ^ el.x[46]);
        el.y[el.x[17]] = "  ".length();
        el.y[el.x[24]] = (el.x[118] ^ el.x[119] ^ (el.x[62] ^ el.x[120]));
        el.y[el.x[121]] = (el.x[55] + el.x[14] - el.x[70] + el.x[93] ^ el.x[95] + el.x[80] - el.x[97] + el.x[30]);
        el.y[el.x[10]] = (el.x[60] + el.x[122] - el.x[123] + el.x[124] ^ el.x[125] + el.x[21] - el.x[45] + el.x[86]);
        el.y[el.x[11]] = (el.x[126] + el.x[89] - el.x[127] + el.x[45] ^ el.x[128] + el.x[97] - el.x[122] + el.x[95]);
        el.y[el.x[23]] = (el.x[129] ^ el.x[120] ^ (el.x[41] ^ el.x[130]));
        el.y[el.x[25]] = (el.x[131] ^ el.x[44] ^ (el.x[132] ^ el.x[133]));
        el.y[el.x[26]] = (el.x[134] + el.x[135] - el.x[54] + el.x[63] ^ el.x[130] + el.x[136] - el.x[137] + el.x[100]);
        el.y[el.x[28]] = (el.x[138] ^ el.x[111] ^ (el.x[139] ^ el.x[3]));
        el.y[el.x[51]] = (el.x[140] ^ el.x[141] ^ (el.x[32] ^ el.x[5]));
        el.y[el.x[47]] = -" ".length();
    }
    
    public final boolean l() {
        return !e(b(this.j.b) ? 1 : 0) || !e(k(this.j.b, 2) ? 1 : 0) || !e(k(this.j.b, 4) ? 1 : 0) || !e(k(this.j.b, 6) ? 1 : 0) || e(c(this.j.b, 8) ? 1 : 0);
    }
    
    public final boolean m() {
        return e(c(this.i, 34) ? 1 : 0);
    }
    
    public final boolean n() {
        return e(c(this.j.b, 1) ? 1 : 0);
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (i(n, n2)) {
            n3 = el.x[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x41 ^ 0x56) & ~(0x8F ^ 0x98)) != 0x0;
            }
        }
        else {
            n3 = el.x[2];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean h(final int n) {
        return n < 0;
    }
    
    public final int o() {
        if (e(b(this.d) ? 1 : 0)) {
            int n = 0;
            while (e(d(n, this.d.size()) ? 1 : 0)) {
                final en en;
                if (e(b(en = (en)this.d.elementAt(n)) ? 1 : 0) && e(c(en.b.a, 85) ? 1 : 0)) {
                    return en.c;
                }
                ++n;
                "".length();
                "".length();
                if (a(el.x[142] ^ el.x[133], -" ".length())) {
                    return (el.x[20] ^ el.x[69]) & (el.x[95] ^ el.x[18] ^ el.x[57]);
                }
            }
        }
        return -1;
    }
    
    private static boolean f(final int n, final int n2) {
        return n > n2;
    }
    
    public final boolean p() {
        return e(c(this.i, 15) ? 1 : 0);
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (h(n, n2)) {
            n3 = el.x[1];
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0x84 ^ 0xA4) & ~(0x36 ^ 0x16)) != 0x0;
            }
        }
        else {
            n3 = el.x[2];
        }
        return n3 != 0;
    }
    
    private static boolean i(final int n) {
        return n > 0;
    }
    
    private static boolean j(final int n) {
        return n == 0;
    }
    
    public final boolean q() {
        return !e(k(this.i, 7) ? 1 : 0) || e(c(this.i, 9) ? 1 : 0);
    }
    
    private static boolean h(final int n, final int n2) {
        return n <= n2;
    }
    
    private static int d(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public final boolean r() {
        return !e(d(this.u() ? 1 : 0) ? 1 : 0) || !e(d(this.g() ? 1 : 0) ? 1 : 0) || !e(d(this.p() ? 1 : 0) ? 1 : 0) || !e(d(this.s() ? 1 : 0) ? 1 : 0) || e(b(this.m() ? 1 : 0) ? 1 : 0);
    }
    
    private static void x() {
        (x = new int[143])[0] = (0x7F ^ 0x60 ^ "   ".length());
        el.x[1] = " ".length();
        el.x[2] = ((0xE5 ^ 0xAD ^ (0xED ^ 0x99)) & (238 + 163 - 372 + 221 ^ 116 + 140 - 236 + 178 ^ -" ".length()));
        el.x[3] = (0x8 ^ 0x79 ^ (0xF1 ^ 0x8F));
        el.x[4] = (0x10 ^ 0x0);
        el.x[5] = (0x73 ^ 0x62);
        el.x[6] = (0x2B ^ 0x3F ^ (0x34 ^ 0x32));
        el.x[7] = (0x78 ^ 0x6B);
        el.x[8] = (0x5F ^ 0x4B);
        el.x[9] = (204 + 183 - 239 + 65 ^ 83 + 106 - 160 + 163);
        el.x[10] = (0x3B ^ 0x5F ^ (0xDC ^ 0x98));
        el.x[11] = (0xE5 ^ 0xB9 ^ (0xB9 ^ 0xC4));
        el.x[12] = (0xB4 ^ 0xAE);
        el.x[13] = (0xFC ^ 0xAD ^ (0x14 ^ 0x53));
        el.x[14] = (0x32 ^ 0x14 ^ (0x31 ^ 0x1A));
        el.x[15] = (0xB7 ^ 0xB9);
        el.x[16] = (0xAA ^ 0xAC);
        el.x[17] = (0x33 ^ 0x2E);
        el.x[18] = "  ".length();
        el.x[19] = (0x6A ^ 0x6E);
        el.x[20] = "   ".length();
        el.x[21] = (0x63 ^ 0x66);
        el.x[22] = (0x8D ^ 0x86);
        el.x[23] = (0x45 ^ 0x67);
        el.x[24] = (138 + 46 - 27 + 28 ^ 58 + 10 + 81 + 18);
        el.x[25] = (0x17 ^ 0x34 ^ ((0x19 ^ 0xD) & ~(0x30 ^ 0x24)));
        el.x[26] = (0xB4 ^ 0x90);
        el.x[27] = (0x6A ^ 0x36 ^ (0x4F ^ 0x1A));
        el.x[28] = (0x7D ^ 0x46 ^ (0x78 ^ 0x66));
        el.x[29] = (128 + 70 - 144 + 129 ^ 143 + 117 - 251 + 182);
        el.x[30] = (0x8C ^ 0x95);
        el.x[31] = (0xA9 ^ 0xAE);
        el.x[32] = (0xC1 ^ 0xBA ^ (0xE1 ^ 0x90));
        el.x[33] = (0x1A ^ 0x16);
        el.x[34] = (0x16 ^ 0x1);
        el.x[35] = (0x25 ^ 0x6C ^ (0x3D ^ 0x6C));
        el.x[36] = (122 + 84 - 188 + 162 ^ 94 + 70 - 142 + 109);
        el.x[37] = (0x11 ^ 0x15 ^ (0x9A ^ 0xAD));
        el.x[38] = (0xCF ^ 0xB9 ^ (0x3F ^ 0xB));
        el.x[39] = (0xB0 ^ 0xC2 ^ (0x67 ^ 0x7F));
        el.x[40] = (0x3C ^ 0x6F) + (181 + 4 - 73 + 81) - (138 + 55 - 178 + 187) + (105 + 137 - 137 + 59);
        el.x[41] = (0x55 ^ 0x2D) + (0x19 ^ 0x17) - (0xB9 ^ 0xAD) + (0x82 ^ 0x92);
        el.x[42] = (0x2E ^ 0x70);
        el.x[43] = (0x1C ^ 0x73 ^ (0x63 ^ 0x44));
        el.x[44] = (0x49 ^ 0x44) + (0x1B ^ 0x20) - -" ".length() + (0x32 ^ 0xA);
        el.x[45] = (0xAA ^ 0xA1 ^ 21 + 83 - 81 + 104);
        el.x[46] = (0xD1 ^ 0x9B ^ (0xBF ^ 0xC5));
        el.x[47] = (0x83 ^ 0xA4);
        el.x[48] = (0x4F ^ 0x9 ^ (0x13 ^ 0x1));
        el.x[49] = (0x4B ^ 0x13);
        el.x[50] = (112 + 167 - 166 + 63 ^ 52 + 21 + 60 + 38);
        el.x[51] = (35 + 68 + 11 + 13 ^ (0xB ^ 0x52));
        el.x[52] = 120 + 166 - 247 + 128;
        el.x[53] = (0xA8 ^ 0x92 ^ (0x5D ^ 0x3D));
        el.x[54] = 85 + 29 + 31 + 27;
        el.x[55] = (0x41 ^ 0x62) + (0x3C ^ 0x46) - (0x72 ^ 0x38) + (0x35 ^ 0x0);
        el.x[56] = 88 + 17 + 38 + 30;
        el.x[57] = -" ".length();
        el.x[58] = (106 + 135 - 193 + 93 ^ 144 + 43 - 86 + 83);
        el.x[59] = (0x15 ^ 0x71 ^ (0x6B ^ 0x5C));
        el.x[60] = (0x5A ^ 0x26) + (0x9D ^ 0x8F) - (0xC8 ^ 0xA9) + (0x1B ^ 0x49);
        el.x[61] = (0x87 ^ 0xC4);
        el.x[62] = (0xB5 ^ 0xAA ^ (0x21 ^ 0x14));
        el.x[63] = (0xF2 ^ 0xAE ^ (0xA1 ^ 0x90));
        el.x[64] = (0x96 ^ 0xAE);
        el.x[65] = (0x9C ^ 0xB2);
        el.x[66] = (0xBD ^ 0xA1 ^ (0xC0 ^ 0x9A));
        el.x[67] = (0x3B ^ 0x57);
        el.x[68] = (0 + 77 + 6 + 161 ^ 142 + 138 - 233 + 138);
        el.x[69] = (0xCB ^ 0x94 ^ "   ".length());
        el.x[70] = (0x52 ^ 0x23 ^ (0xAB ^ 0xBE));
        el.x[71] = (0x7 ^ 0x5A ^ (0xFA ^ 0x8F));
        el.x[72] = 145 + 89 - 225 + 138;
        el.x[73] = (0x1C ^ 0x3A) + (0x58 ^ 0x60) - (0x4B ^ 0x5A) + (0x31 ^ 0xD);
        el.x[74] = (0x3B ^ 0x8 ^ (0x62 ^ 0x6E));
        el.x[75] = (0xCD ^ 0x8C);
        el.x[76] = (0x10 ^ 0x3C);
        el.x[77] = 32 + 142 - 100 + 150;
        el.x[78] = 111 + 17 - 53 + 85;
        el.x[79] = (0xA3 ^ 0x92);
        el.x[80] = (0x0 ^ 0x36 ^ (0x37 ^ 0x41));
        el.x[81] = 4 + 90 - 58 + 148 + (0x27 ^ 0x64) - (0x49 ^ 0x34) + (0x22 ^ 0x1D);
        el.x[82] = 121 + 12 - 61 + 124;
        el.x[83] = 115 + 89 - 187 + 185;
        el.x[84] = (0x27 ^ 0x1F) + (136 + 49 - 94 + 57) - (0x97 ^ 0x8C) + (0xB7 ^ 0xA5);
        el.x[85] = (0x83 ^ 0x8E) + (0x49 ^ 0x52) - -(0x96 ^ 0xB2) + (0x1A ^ 0x2E);
        el.x[86] = (0xDD ^ 0xAB);
        el.x[87] = 17 + 81 + 58 + 20;
        el.x[88] = (0x28 ^ 0x49 ^ ((0x62 ^ 0x64) & ~(0xB8 ^ 0xBE)));
        el.x[89] = (0x71 ^ 0x2E);
        el.x[90] = (73 + 162 - 174 + 140 ^ 102 + 117 - 92 + 28);
        el.x[91] = 52 + 102 - 62 + 40;
        el.x[92] = (0xB9 ^ 0x84);
        el.x[93] = (0xEE ^ 0x97);
        el.x[94] = 95 + 120 - 90 + 38;
        el.x[95] = (243 + 127 - 360 + 238 ^ 130 + 69 - 106 + 72);
        el.x[96] = -(0x44 ^ 0x48);
        el.x[97] = (108 + 111 - 123 + 34 ^ 133 + 134 - 142 + 46);
        el.x[98] = (0xF7 ^ 0xBD ^ (0xEA ^ 0x92));
        el.x[99] = (0xA9 ^ 0x89) + (0x9D ^ 0x90) - -(0x5C ^ 0x8) + (0xA5 ^ 0xB0);
        el.x[100] = (0xFE ^ 0xB5);
        el.x[101] = (0x44 ^ 0x3C ^ (0x98 ^ 0x92));
        el.x[102] = 24 + 47 + 6 + 68 + (0x81 ^ 0x94) - (0x6 ^ 0x7B) + (0xF0 ^ 0x85);
        el.x[103] = (149 + 158 - 173 + 32 ^ 139 + 119 - 164 + 60);
        el.x[104] = -(0x4C ^ 0x4);
        el.x[105] = (0xA1 ^ 0xA8 ^ (0x94 ^ 0xA7));
        el.x[106] = (0xBD ^ 0xB0 ^ (0x55 ^ 0x77));
        el.x[107] = (0x2 ^ 0x69 ^ (0x27 ^ 0x7A));
        el.x[108] = (80 + 172 - 75 + 32 ^ 89 + 61 - 25 + 41);
        el.x[109] = -(0x1D ^ 0x57 ^ (0x56 ^ 0xC));
        el.x[110] = 47 + 112 - 44 + 33;
        el.x[111] = (0x59 ^ 0x29);
        el.x[112] = -(0x1 ^ 0x19);
        el.x[113] = (0xB1 ^ 0x96) + (0x0 ^ 0x17) - ((0xDB ^ 0x96) & ~(0xFD ^ 0xB0)) + (0x34 ^ 0x42);
        el.x[114] = " ".length() + (0xB1 ^ 0xBA) - -(118 + 55 - 77 + 50) + "   ".length();
        el.x[115] = (0xDC ^ 0xBA ^ (0x93 ^ 0x9C));
        el.x[116] = (0x41 ^ 0x75);
        el.x[117] = 104 + 33 - 39 + 55;
        el.x[118] = 184 + 135 - 262 + 189;
        el.x[119] = " ".length() + (0xC6 ^ 0xBA) - (0x9F ^ 0xA4) + (0x35 ^ 0x79);
        el.x[120] = (0xD1 ^ 0xBD ^ (0x6C ^ 0x56));
        el.x[121] = (0x4 ^ 0x34 ^ (0x9A ^ 0xB5));
        el.x[122] = (0x5A ^ 0x1D);
        el.x[123] = 44 + 10 + 77 + 59;
        el.x[124] = (0x51 ^ 0x1A) + (0x30 ^ 0x16) - (0x72 ^ 0x19) + (18 + 89 - 72 + 105);
        el.x[125] = (0x7D ^ 0x7);
        el.x[126] = 20 + 133 - 90 + 77;
        el.x[127] = 162 + 157 - 169 + 15;
        el.x[128] = (0x38 ^ 0x5F);
        el.x[129] = (0x73 ^ 0x3F);
        el.x[130] = 84 + 140 - 149 + 109;
        el.x[131] = (0xD9 ^ 0xB9) + (0x23 ^ 0x47) - (0x53 ^ 0x77) + (0x2D ^ 0x3A);
        el.x[132] = (0xA6 ^ 0xC0);
        el.x[133] = (0xF2 ^ 0xA7 ^ (0x19 ^ 0x34));
        el.x[134] = (0x2C ^ 0x55) + (142 + 90 - 217 + 128) - (36 + 43 - 70 + 237) + (149 + 160 - 264 + 148);
        el.x[135] = (180 + 27 - 104 + 129 ^ 25 + 7 + 106 + 1);
        el.x[136] = 113 + 71 - 46 + 45 + (102 + 123 - 98 + 25) - (0xFFFFBD03 & 0x43FF) + (0x1D ^ 0x73);
        el.x[137] = 85 + 181 - 157 + 139;
        el.x[138] = (50 + 42 + 123 + 28 ^ 9 + 64 + 11 + 58);
        el.x[139] = (0x69 ^ 0x57);
        el.x[140] = (0x44 ^ 0x2) + (65 + 36 + 22 + 37) - (0xAF ^ 0x80) + (0xBE ^ 0x91);
        el.x[141] = (0xAB ^ 0xC2) + (0x86 ^ 0xC4) - (0x9E ^ 0xA8) + (0x77 ^ 0x44);
        el.x[142] = (0x4D ^ 0x31);
    }
    
    private static boolean i(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean j(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = el.x[1];
            "".length();
            if (-"  ".length() > 0) {
                return ((106 + 210 - 263 + 178 ^ 69 + 167 - 92 + 40) & (43 + 180 - 152 + 168 ^ 74 + 37 + 36 + 29 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = el.x[2];
        }
        return n3 != 0;
    }
    
    private static boolean k(final int n) {
        return n <= 0;
    }
    
    public final boolean s() {
        return e(c(this.i, 32) ? 1 : 0);
    }
    
    public final boolean t() {
        return e(l(this.j.b) ? 1 : 0) && e(g(this.j.b, 15) ? 1 : 0);
    }
    
    static {
        x();
        w();
    }
    
    public final boolean u() {
        return !e(k(this.i, 20) ? 1 : 0) || !e(k(this.i, 21) ? 1 : 0) || !e(k(this.i, 22) ? 1 : 0) || !e(k(this.i, 23) ? 1 : 0) || !e(k(this.i, 24) ? 1 : 0) || !e(k(this.i, 25) ? 1 : 0) || !e(k(this.i, 26) ? 1 : 0) || !e(k(this.i, 27) ? 1 : 0) || !e(k(this.i, 28) ? 1 : 0) || !e(k(this.i, 29) ? 1 : 0) || !e(k(this.i, 16) ? 1 : 0) || !e(k(this.i, 17) ? 1 : 0) || !e(k(this.i, 18) ? 1 : 0) || !e(k(this.i, 19) ? 1 : 0) || !e(k(this.i, 2) ? 1 : 0) || !e(k(this.i, 6) ? 1 : 0) || !e(k(this.i, 8) ? 1 : 0) || e(c(this.i, 34) ? 1 : 0);
    }
    
    public final int v() {
        if (e(f(this.j.f) ? 1 : 0) && e(d(this.j.f, 20) ? 1 : 0)) {
            return 4;
        }
        if (e(j(this.j.f, 20) ? 1 : 0) && e(d(this.j.f, 40) ? 1 : 0)) {
            return 8;
        }
        if (e(j(this.j.f, 40) ? 1 : 0) && e(d(this.j.f, 50) ? 1 : 0)) {
            return 12;
        }
        if (e(j(this.j.f, 50) ? 1 : 0) && e(d(this.j.f, 60) ? 1 : 0)) {
            return 14;
        }
        return 16;
    }
    
    private static boolean k(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = el.x[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x74 ^ 0x3D) & ~(0x3E ^ 0x77)) != 0x0;
            }
        }
        else {
            n3 = el.x[2];
        }
        return n3 != 0;
    }
    
    private static boolean l(final int n) {
        int n2;
        if (c(n)) {
            n2 = el.x[1];
            "".length();
            if (-" ".length() >= ((0x6B ^ 0x6C) & ~(0x92 ^ 0x95))) {
                return ((0xF8 ^ 0xB6) & ~(0x3B ^ 0x75)) != 0x0;
            }
        }
        else {
            n2 = el.x[2];
        }
        return n2 != 0;
    }
}
