public final class j extends k
{
    private int a;
    private int[] b;
    private static final int[] g;
    private int h;
    private boolean i;
    private fa[] j;
    private boolean k;
    private int l;
    private long m;
    private co n;
    private static final int[] o;
    private fa p;
    private int q;
    
    public static void a(final fa fa, final co co, int n) {
        final j j;
        (j = new j()).b[1] = n;
        n = 0;
        while (j(b(n, fa.size()) ? 1 : 0)) {
            final co co2;
            if (j(c(co2 = (co)fa.elementAt(n)) ? 1 : 0) && (!j(b(fj.a(co2.gh - co.gh), 100) ? 1 : 0) || j(h(fj.a(co2.pz - co.pz), 50) ? 1 : 0))) {
                fa.removeElementAt(n);
            }
            ++n;
            "".length();
            "".length();
            if (e(-(j.g[4] ^ j.g[5]))) {
                return;
            }
        }
        j.a(fa, co, true);
        k.e.addElement(j);
    }
    
    private static int a(final long n, final long n2) {
        return b(n, n2);
    }
    
    @Override
    public final void a(final cn cn) {
        this.q = 0;
        if (j(h(++this.a, 12) ? 1 : 0)) {
            this.a = 0;
        }
        if (j(c(this.j) ? 1 : 0)) {
            int n = 0;
            while (j(b(n, this.j.length) ? 1 : 0)) {
                int n2 = 0;
                while (j(b(n2, this.j[n].size()) ? 1 : 0)) {
                    final co co;
                    if (j(a((co = (co)this.j[n].elementAt(n2)).af) ? 1 : 0) && j(b(co.af, this.j[n].size()) ? 1 : 0)) {
                        final co co2 = (co)this.j[n].elementAt(co.af);
                        if (j(b(ff.e(co.gh, co.pz) ? 1 : 0) ? 1 : 0) && j(b(ff.e(co2.gh, co2.pz) ? 1 : 0) ? 1 : 0)) {
                            cn.a(this.b[0]);
                            cn.b(co.gh, co.pz, co2.gh, co2.pz);
                            if (j(e(co.re, -1) ? 1 : 0)) {
                                cn.a(this.b[1]);
                                cn.b(co.gh - 1, co.pz, co2.gh - 1, co2.pz);
                                if (j(b(this.i ? 1 : 0) ? 1 : 0) && j(b(this.k ? 1 : 0) ? 1 : 0)) {
                                    cn.b(co.gh + 1, co.pz, co2.gh + 1, co2.pz);
                                }
                            }
                        }
                        if (j(b(this.i ? 1 : 0) ? 1 : 0) && j(b(this.k ? 1 : 0) ? 1 : 0)) {
                            ++this.q;
                            if (j(h(this.q, this.h) ? 1 : 0)) {
                                this.h += 7;
                                return;
                            }
                        }
                    }
                    ++n2;
                    "".length();
                    "".length();
                    if (c("  ".length(), " ".length())) {
                        return;
                    }
                }
                ++n;
                "".length();
                "".length();
                if (d(" ".length(), "  ".length())) {
                    return;
                }
            }
        }
    }
    
    static {
        b();
        c();
    }
    
    private static void b() {
        (g = new int[75])[0] = "   ".length();
        j.g[1] = " ".length();
        j.g[2] = (0x46 ^ 0x18 ^ (0x99 ^ 0xC1));
        j.g[3] = (0 + 42 + 110 + 13 ^ 133 + 11 - 50 + 68);
        j.g[4] = (83 + 222 - 176 + 99 ^ 45 + 74 + 55 + 4);
        j.g[5] = (0x46 ^ 0x15);
        j.g[6] = ((0x30 ^ 0x5 ^ (0x50 ^ 0x48)) & (0x63 ^ 0x68 ^ (0x87 ^ 0xA1) ^ -" ".length()));
        j.g[7] = (0x93 ^ 0x9B);
        j.g[8] = (0x5A ^ 0x2 ^ (0xC8 ^ 0x9E));
        j.g[9] = (0x4E ^ 0x4B);
        j.g[10] = (0x93 ^ 0xAF ^ (0x34 ^ 0x18));
        j.g[11] = 53 + 196 - 200 + 183;
        j.g[12] = 85 + 156 - 185 + 142;
        j.g[13] = (0x70 ^ 0xA);
        j.g[14] = (0x45 ^ 0x6 ^ (0x76 ^ 0x61));
        j.g[15] = -" ".length();
        j.g[16] = "  ".length();
        j.g[17] = -(-(0xFFFFEBD5 & 0x172B) & (0xFFFFD3EF & 0x7F7F));
        j.g[18] = (-(0xFFFFAF97 & 0x7CF9) & (-1 & 0x7EFF));
        j.g[19] = -"   ".length();
        j.g[20] = (-" ".length() & (0xFFFFFEFF & 0xFCFFFF));
        j.g[21] = (0x64 ^ 0x0 ^ (0xC ^ 0x6C));
        j.g[22] = -(-(0xFFFFCC7A & 0x7F8F) & (-1 & 0x4FFD));
        j.g[23] = (-(0xFFFFA12B & 0x7EDD) & (0xFFFFFBFF & 0x6FFF));
        j.g[24] = (-1 & 0xAAFFFF);
        j.g[25] = (0x32 ^ 0x2A ^ (0x43 ^ 0x56));
        j.g[26] = (0x12 ^ 0x2B) + (0x7D ^ 0x44) - (0x3 ^ 0x37) + (0xE1 ^ 0xA0);
        j.g[27] = 154 + 81 - 223 + 165;
        j.g[28] = 114 + 59 - 73 + 44 + (56 + 79 - 131 + 171) - (2 + 96 + 20 + 13) + (0xCB ^ 0xC3);
        j.g[29] = (0x13 ^ 0x7A);
        j.g[30] = (0xBC ^ 0x84);
        j.g[31] = (0x7 ^ 0xC ^ " ".length());
        j.g[32] = (0x60 ^ 0x59 ^ (0x79 ^ 0x49));
        j.g[33] = (0xAB ^ 0xC5) + (0x2D ^ 0x3) - (0x63 ^ 0x3C) + (0x7 ^ 0x4D);
        j.g[34] = 92 + 23 + 12 + 9;
        j.g[35] = (0xAF ^ 0x96);
        j.g[36] = (0x47 ^ 0x2C);
        j.g[37] = (0x43 ^ 0x2C);
        j.g[38] = (0x74 ^ 0x34);
        j.g[39] = (77 + 12 + 105 + 14 ^ 174 + 40 - 71 + 35);
        j.g[40] = (25 + 61 + 55 + 59 ^ 155 + 100 - 248 + 188);
        j.g[41] = (0x6F ^ 0x12 ^ (0x61 ^ 0x71));
        j.g[42] = 84 + 50 - 48 + 44;
        j.g[43] = (0xA1 ^ 0x9E) + (0x10 ^ 0x3C) - -(0x9 ^ 0x26) + (0x7D ^ 0x6B);
        j.g[44] = (0x57 ^ 0x1B);
        j.g[45] = (0x83 ^ 0x99 ^ (0x46 ^ 0x2E));
        j.g[46] = (0x23 ^ 0x7 ^ (0xD1 ^ 0xA0));
        j.g[47] = (0xE2 ^ 0x99);
        j.g[48] = (0xCD ^ 0x8F);
        j.g[49] = (0x6B ^ 0x67);
        j.g[50] = (0x20 ^ 0x16 ^ (0xDF ^ 0x8C));
        j.g[51] = (0x65 ^ 0x14 ^ (0xF4 ^ 0xA5));
        j.g[52] = (0x94 ^ 0xC4);
        j.g[53] = (0x1A ^ 0x64 ^ "   ".length());
        j.g[54] = 48 + 124 - 94 + 84;
        j.g[55] = (-(0xFFFFFEED & 0x3DFB) & (0xFFFFBDFE & 0x7FFF));
        j.g[56] = 5 + 131 - 123 + 126 + (0x44 ^ 0x78) - (13 + 63 - 14 + 88) + (0x37 ^ 0x4D);
        j.g[57] = (0x11 ^ 0x38 ^ (0x60 ^ 0x46));
        j.g[58] = (0x34 ^ 0x1A);
        j.g[59] = (0x60 ^ 0x42);
        j.g[60] = 52 + 79 - 116 + 177;
        j.g[61] = 103 + 96 - 184 + 140;
        j.g[62] = (0x15 ^ 0x56);
        j.g[63] = (42 + 77 - 55 + 72 ^ 108 + 36 - 123 + 123);
        j.g[64] = (0xBF ^ 0xAE);
        j.g[65] = (0x7C ^ 0x6B);
        j.g[66] = 6 + 74 - 1 + 50;
        j.g[67] = 114 + 78 - 88 + 41;
        j.g[68] = (0x74 ^ 0x6F) + (9 + 92 + 28 + 11) - (0xCA ^ 0xAB) + (0x32 ^ 0x7A);
        j.g[69] = 41 + 112 - 145 + 172;
        j.g[70] = (0x47 ^ 0x19 ^ (0x36 ^ 0x4E));
        j.g[71] = 204 + 210 - 182 + 14;
        j.g[72] = (0x32 ^ 0x70) + "  ".length() - -(0xD2 ^ 0xC6) + (0x21 ^ 0x71);
        j.g[73] = (0xD ^ 0x65);
        j.g[74] = (0x6A ^ 0x58);
    }
    
    private static boolean a(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = j.g[1];
            "".length();
            if ((193 + 121 - 276 + 156 ^ 180 + 66 - 127 + 79) != (38 + 4 + 59 + 26 ^ (0x38 ^ 0x43))) {
                return ((62 + 71 - 120 + 141 ^ 41 + 35 + 92 + 25) & (0x4A ^ 0x1B ^ (0x95 ^ 0x9F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = j.g[6];
        }
        return n3 != 0;
    }
    
    private static boolean a(final int n) {
        int n2;
        if (e(n)) {
            n2 = j.g[1];
            "".length();
            if ((0xF7 ^ 0x85 ^ (0x54 ^ 0x22)) == "  ".length()) {
                return ((115 + 18 - 14 + 10 ^ 55 + 97 - 18 + 36) & (0x66 ^ 0x6D ^ (0xB9 ^ 0x99) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = j.g[6];
        }
        return n2 != 0;
    }
    
    private static boolean b(final int n) {
        int n2;
        if (j(n)) {
            n2 = j.g[1];
            "".length();
            if ((31 + 26 - 19 + 145 ^ 106 + 163 - 212 + 122) == ((0x5F ^ 0x28 ^ (0x5A ^ 0x3D)) & (0xF6 ^ 0xC4 ^ (0xAD ^ 0x8F) ^ -" ".length()))) {
                return ((31 + 42 + 60 + 77 ^ 164 + 52 - 158 + 140) & (0x13 ^ 0x7C ^ (0x7B ^ 0x0) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = j.g[6];
        }
        return n2 != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (k(n, n2)) {
            n3 = j.g[1];
            "".length();
            if (((0x62 ^ 0x40) & ~(0xE2 ^ 0xC0)) != 0x0) {
                return ((0x51 ^ 0x48) & ~(0x5C ^ 0x45)) != 0x0;
            }
        }
        else {
            n3 = j.g[6];
        }
        return n3 != 0;
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static boolean c(final int n) {
        return n > 0;
    }
    
    private static boolean d(final int n) {
        return n < 0;
    }
    
    public j() {
        super();
        this.b = new int[] { 16579837, 11188220 };
        this.p = new fa();
        this.m = 0L;
        this.i = false;
        this.k = true;
        this.l = 0;
        this.a = 0;
        this.q = 0;
        this.h = 7;
    }
    
    private static boolean c(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean d(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (j(n, n2)) {
            n3 = j.g[1];
            "".length();
            if (((0x8F ^ 0x90) & ~(0x3D ^ 0x22)) != ((0x46 ^ 0x55) & ~(0x95 ^ 0x86))) {
                return ((0x40 ^ 0x67) & ~(0x9B ^ 0xBC)) != 0x0;
            }
        }
        else {
            n3 = j.g[6];
        }
        return n3 != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (i(n, n2)) {
            n3 = j.g[1];
            "".length();
            if (" ".length() <= 0) {
                return ((0x60 ^ 0x3A) & ~(0xEB ^ 0xB1)) != 0x0;
            }
        }
        else {
            n3 = j.g[6];
        }
        return n3 != 0;
    }
    
    private static boolean h(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = j.g[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x39 ^ 0x3C) & ~(0x1C ^ 0x19)) != 0x0;
            }
        }
        else {
            n3 = j.g[6];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n) {
        return n >= 0;
    }
    
    @Override
    public final void a() {
        if (j(b(this.n) ? 1 : 0)) {
            k.c.addElement(this);
            return;
        }
        try {
            if (j(e(ff.am % 2, 1) ? 1 : 0)) {
                this.n.af = -1;
                this.n.re = -1;
                int n = 0;
                while (j(b(n, this.p.size()) ? 1 : 0)) {
                    final co co;
                    (co = (co)this.p.elementAt(n)).re = -1;
                    co.af = -1;
                    ++n;
                    "".length();
                    "".length();
                    if (c(-" ".length())) {
                        return;
                    }
                }
                if (j(b(this.i ? 1 : 0) ? 1 : 0) && j(b(this.k ? 1 : 0) ? 1 : 0) && j(a(this.p.size(), 1) ? 1 : 0) && j(f(a(System.currentTimeMillis() - this.m, 1L)) ? 1 : 0)) {
                    this.m = System.currentTimeMillis();
                    this.n = (co)this.p.elementAt(0);
                    this.p.removeElementAt(0);
                }
                this.a(this.p, this.n, this.i);
                if (j(a(this.l, 3) ? 1 : 0)) {
                    this.h = 7;
                    k.e.removeElement(this);
                    "".length();
                }
                ++this.l;
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static boolean i(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean f(final int n) {
        int n2;
        if (c(n)) {
            n2 = j.g[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0x76 ^ 0x7F) & ~(0x1A ^ 0x13)) != 0x0;
            }
        }
        else {
            n2 = j.g[6];
        }
        return n2 != 0;
    }
    
    private static void c() {
        (o = new int[j.g[10]])[j.g[6]] = "  ".length();
        j.o[j.g[1]] = ((j.g[11] ^ j.g[12]) & (j.g[13] ^ j.g[14] ^ j.g[15]));
        j.o[j.g[16]] = (-(j.g[17] & j.g[18]) & (j.g[19] & j.g[20]));
        j.o[j.g[0]] = " ".length();
        j.o[j.g[21]] = (-(j.g[22] & j.g[23]) & (j.g[15] & j.g[24]));
        j.o[j.g[9]] = (j.g[25] ^ j.g[26] ^ (j.g[27] ^ j.g[28]));
        j.o[j.g[2]] = (j.g[25] ^ j.g[29]);
        j.o[j.g[3]] = (j.g[30] ^ j.g[31]);
        j.o[j.g[7]] = -" ".length();
        j.o[j.g[32]] = (j.g[33] ^ j.g[34]);
        j.o[j.g[31]] = (j.g[35] + j.g[29] - j.g[36] + j.g[37] ^ j.g[14] + j.g[38] - j.g[39] + j.g[13]);
        j.o[j.g[40]] = (j.g[41] + j.g[42] - j.g[43] + j.g[44] ^ j.g[45] + j.g[46] - j.g[47] + j.g[48]);
        j.o[j.g[49]] = (j.g[50] ^ j.g[1] ^ (j.g[51] ^ j.g[52]));
        j.o[j.g[25]] = j.g[53] + j.g[54] - j.g[55] + j.g[56];
        j.o[j.g[8]] = "   ".length();
        j.o[j.g[57]] = (j.g[58] ^ j.g[59]);
    }
    
    private static boolean j(final int n, final int n2) {
        return n == n2;
    }
    
    private void a(final fa p3, final co n, final boolean i) {
        if (j(b(p3.size()) ? 1 : 0)) {
            this.i = i;
            if (j(i(i ? 1 : 0) ? 1 : 0)) {
                final int size = p3.size();
                int index = 0;
                while (j(b(index, size - 1) ? 1 : 0)) {
                    co obj = (co)p3.elementAt(index);
                    int index2 = index + 1;
                    while (j(b(index2, size) ? 1 : 0)) {
                        final co obj2 = (co)p3.elementAt(index2);
                        if (j(a(obj.gh, obj2.gh) ? 1 : 0)) {
                            p3.setElementAt(obj, index2);
                            p3.setElementAt(obj2, index);
                            obj = obj2;
                        }
                        ++index2;
                        "".length();
                        "".length();
                        if (h(" ".length())) {
                            return;
                        }
                    }
                    ++index;
                    "".length();
                    "".length();
                    if (k(" ".length(), -" ".length())) {
                        return;
                    }
                }
            }
            this.p = p3;
            this.n = n;
            this.j = new fa[p3.size()];
            int n2 = 0;
            while (j(b(n2, this.j.length) ? 1 : 0)) {
                this.j[n2] = new fa();
                ++n2;
                "".length();
                "".length();
                if (f(-" ".length(), "  ".length())) {
                    return;
                }
            }
            n.af = -1;
            this.j[0].addElement(n);
            int n3 = -1;
            int n4 = 0;
        Label_0304:
            while (j(b(n4, p3.size()) ? 1 : 0)) {
                int n5 = n.gh;
                int n6 = n.pz;
                if (j(b(i ? 1 : 0) ? 1 : 0) && j(g(n3, -1) ? 1 : 0)) {
                    final co co;
                    n5 = (co = (co)p3.elementAt(n3)).gh;
                    n6 = co.pz;
                }
                if (j(b(i ? 1 : 0) ? 1 : 0)) {
                    ++n3;
                    "".length();
                    "".length();
                    if (i(-" ".length(), -" ".length())) {
                        return;
                    }
                }
                else {
                    int n7 = 0;
                    int n8 = 0;
                    while (j(b(n8, p3.size()) ? 1 : 0)) {
                        if (j(e(((co)p3.elementAt(n8)).re, -1) ? 1 : 0)) {
                            ++n7;
                        }
                        ++n8;
                        "".length();
                        "".length();
                        if (d(" ".length())) {
                            return;
                        }
                    }
                    int n11 = 0;
                    Label_0652: {
                        if (j(b(n7) ? 1 : 0)) {
                            final int d = fj.d(n7);
                            int n9 = 0;
                            int n10 = 0;
                            while (j(b(n10, p3.size()) ? 1 : 0)) {
                                final co co2;
                                if (j(e((co2 = (co)p3.elementAt(n10)).re, -1) ? 1 : 0)) {
                                    if (j(e(d, n9) ? 1 : 0)) {
                                        co2.re = 0;
                                        n11 = n10;
                                        "".length();
                                        "".length();
                                        if (j(" ".length(), "   ".length())) {
                                            return;
                                        }
                                        break Label_0652;
                                    }
                                    else {
                                        ++n9;
                                    }
                                }
                                ++n10;
                                "".length();
                                "".length();
                                if (c("   ".length(), -" ".length())) {
                                    return;
                                }
                            }
                        }
                        n11 = -1;
                    }
                    n3 = n11;
                }
                int n12 = this.j[n3].size() - 1;
                final co co3;
                final int a = fj.a((co3 = (co)p3.elementAt(n3)).gh - n5, -(co3.pz - n6));
                final int n13 = fj.d(15) + 10;
                int n14 = 0;
                do {
                    int n15 = 0;
                    if (j(b(n14) ? 1 : 0)) {
                        n15 = a - 5 + fj.d(10);
                    }
                    final int f = fj.f(n15);
                    final int n16 = n13 * n14 * fj.c(f) >> 10;
                    final int n17 = -(n13 * n14 * fj.e(f)) >> 10;
                    this.j[n3].addElement(new co(n5 + n16, n6 + n17, n12++));
                    if (j(b(fj.a(n5, n6, n5 + n16, n6 + n17), fj.a(n5, n6, co3.gh, co3.pz) - 20) ? 1 : 0)) {
                        ++n14;
                        "".length();
                        "".length();
                    }
                    else {
                        ++n4;
                        "".length();
                        "".length();
                        if (h(j.g[64] ^ j.g[38] ^ (j.g[65] ^ j.g[48]))) {
                            return;
                        }
                        continue Label_0304;
                    }
                } while (!j((j.g[60] ^ j.g[61]) & (j.g[62] ^ j.g[63] ^ j.g[15])));
                return;
            }
            int n18 = 0;
            while (j(b(n18, this.j.length) ? 1 : 0)) {
                final int size2 = this.j[n18].size();
                final co co4;
                (co4 = (co)p3.elementAt(n18)).af = (byte)(this.j[n18].size() - 1);
                co4.re = -1;
                final co co5;
                (co5 = new co(co4.gh, co4.pz, co4.af)).re = -1;
                this.j[n18].addElement(co5);
                int n19 = 1;
                while (j(b(n19, size2) ? 1 : 0)) {
                    final co co6 = (co)this.j[n18].elementAt(n19);
                    final int d2 = fj.d(2);
                    int n20 = 0;
                    while (j(b(n20, d2) ? 1 : 0)) {
                        final int n21 = 180 + fj.d(180);
                        final int n22 = 5 + fj.d(10);
                        final co co7;
                        (co7 = new co(co6.gh + (n22 * fj.c(fj.f(n21)) >> 10), co6.pz + (-(n22 * fj.e(fj.f(n21))) >> 10), n19)).re = 0;
                        this.j[n18].addElement(co7);
                        ++n20;
                        "".length();
                        "".length();
                        if (j((j.g[66] ^ j.g[67] ^ (j.g[68] ^ j.g[69])) & (j.g[40] ^ j.g[53] ^ (j.g[13] ^ j.g[70]) ^ -" ".length()))) {
                            return;
                        }
                    }
                    ++n19;
                    "".length();
                    "".length();
                    if (g(" ".length())) {
                        return;
                    }
                }
                ++n18;
                "".length();
                "".length();
                if (k(j.g[71] ^ j.g[72] ^ (j.g[73] ^ j.g[74]), " ".length())) {
                    return;
                }
            }
        }
    }
    
    private static boolean g(final int n) {
        return n <= 0;
    }
    
    private static boolean h(final int n) {
        return n == 0;
    }
    
    private static boolean i(final int n) {
        int n2;
        if (h(n)) {
            n2 = j.g[1];
            "".length();
            if ((76 + 86 - 129 + 98 ^ 94 + 9 - 17 + 48) <= 0) {
                return ((0x16 ^ 0x3A ^ (0xCB ^ 0xA7)) & (64 + 37 + 31 + 106 ^ 172 + 44 - 117 + 75 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = j.g[6];
        }
        return n2 != 0;
    }
    
    private static boolean j(final int n) {
        return n != 0;
    }
    
    private static int b(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = j.g[1];
            "".length();
            if (null != null) {
                return (("  ".length() ^ (0x3F ^ 0xE)) & (109 + 59 - 60 + 23 ^ 38 + 135 - 122 + 125 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = j.g[6];
        }
        return n != 0;
    }
    
    private static boolean c(final Object o) {
        int n;
        if (d(o)) {
            n = j.g[1];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0xC8 ^ 0xA0 ^ (0xEE ^ 0x8F)) & (0xAA ^ 0xB2 ^ (0xBD ^ 0xAC) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = j.g[6];
        }
        return n != 0;
    }
    
    private static boolean d(final Object o) {
        return o != null;
    }
    
    private static boolean k(final int n, final int n2) {
        return n < n2;
    }
}
