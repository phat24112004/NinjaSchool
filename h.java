public final class h extends k implements bj
{
    private String[] g;
    private int h;
    public fe a;
    private int i;
    public static h b;
    private int j;
    private int k;
    private int l;
    private static final int[] m;
    private String[] n;
    private int o;
    private static final int[] p;
    private int q;
    private aa r;
    
    @Override
    public final void a() {
        if (d(b(this.r) ? 1 : 0)) {
            this.j = this.r.ai;
            this.i = this.r.eu;
            this.l = this.r.ba + 10;
        }
        if (d(a(this.o) ? 1 : 0)) {
            --this.o;
        }
        if (d(g(this.h, 1) ? 1 : 0)) {
            --this.h;
        }
        if ((d(b(this.r) ? 1 : 0) && d(b(this.r.en) ? 1 : 0) && !d(b(this.r.en, this) ? 1 : 0)) || (d(b(this.r) ? 1 : 0) && !d(b(this.r.en) ? 1 : 0)) || d(e(this.o) ? 1 : 0)) {
            k.d.removeElement(this);
            "".length();
            k.e.removeElement(this);
            "".length();
        }
    }
    
    public final void a(int k, final Object o) {
        if (d(c(k, 8000) ? 1 : 0)) {
            k = h.b.k;
            if (d(b(++k, h.b.g.length) ? 1 : 0)) {
                h.b.r.en = null;
                h.b = null;
                return;
            }
            final h a;
            (a = a(h.b.g[k], h.b.o, h.b.r)).k = k;
            a.g = h.b.g;
            a.a = h.b.a;
            h.b = a;
        }
    }
    
    private static boolean a(final int n, final int n2) {
        return n < n2;
    }
    
    static {
        b();
        c();
    }
    
    private static void b() {
        (m = new int[53])[0] = (0x64 ^ 0x45 ^ (0x65 ^ 0x40));
        h.m[1] = (0x41 ^ 0x48);
        h.m[2] = (0x9D ^ 0xB8 ^ (0xE8 ^ 0xC7));
        h.m[3] = "  ".length();
        h.m[4] = (0x5B ^ 0x50);
        h.m[5] = (0x7 ^ 0xB);
        h.m[6] = (16 + 46 + 41 + 85 ^ 165 + 5 - 24 + 39);
        h.m[7] = " ".length();
        h.m[8] = (0x61 ^ 0x2E ^ (0xF8 ^ 0xBA));
        h.m[9] = (0xA2 ^ 0xAC);
        h.m[10] = (0xBD ^ 0xB2);
        h.m[11] = (0x79 ^ 0x69);
        h.m[12] = ((0x12 ^ 0x58) & ~(0x26 ^ 0x6C));
        h.m[13] = (0x6D ^ 0x6B);
        h.m[14] = (0xC ^ 0xB);
        h.m[15] = (0x26 ^ 0x2E);
        h.m[16] = (0x1E ^ 0xF);
        h.m[17] = (0x63 ^ 0x6);
        h.m[18] = (105 + 184 - 112 + 52 ^ 145 + 120 - 166 + 68);
        h.m[19] = (0xB7 ^ 0x81) + (29 + 173 - 102 + 101) - (0x4F ^ 0x74) + (0x41 ^ 0x75);
        h.m[20] = (0x36 ^ 0x71) + (0x38 ^ 0x5F) - (0xE1 ^ 0xC6) + (0xB9 ^ 0x90);
        h.m[21] = -" ".length();
        h.m[22] = "   ".length();
        h.m[23] = -(0xFFFFDD2A & 0x7AD7);
        h.m[24] = (0xFFFFDBFB & 0x7FFD);
        h.m[25] = -(0xFFFF9E9F & 0x7BEB);
        h.m[26] = (-(0x7E ^ 0x38) & (-1 & 0x7AFF));
        h.m[27] = (0xFFFFFF7F & 0x7FEF);
        h.m[28] = (0x23 ^ 0x2D) + (0x6D ^ 0x72) - -(84 + 11 - 94 + 126) + (0x51 ^ 0x65);
        h.m[29] = 13 + 43 + 75 + 4;
        h.m[30] = (0x6A ^ 0x2A ^ (0x3C ^ 0x13));
        h.m[31] = 3 + 52 - 12 + 93 + (95 + 87 - 72 + 26) - (17 + 53 - 25 + 104) + (0x74 ^ 0x27);
        h.m[32] = 56 + 23 - 62 + 131;
        h.m[33] = 128 + 99 - 87 + 17;
        h.m[34] = (0xF4 ^ 0x95 ^ (0x31 ^ 0x34));
        h.m[35] = (0xFA ^ 0x94);
        h.m[36] = 176 + 57 - 61 + 22;
        h.m[37] = (0xA ^ 0x23 ^ (0xCE ^ 0x97));
        h.m[38] = (0x92 ^ 0xB2);
        h.m[39] = (87 + 129 - 127 + 85 ^ 51 + 130 - 91 + 47);
        h.m[40] = (-1 & 0xFFFFFF);
        h.m[41] = (0xB5 ^ 0x90);
        h.m[42] = (0x4D ^ 0x67);
        h.m[43] = 91 + 109 - 103 + 40;
        h.m[44] = (0x2B ^ 0x66) + (0xB1 ^ 0x9A) - (0x52 ^ 0x75) + (0x36 ^ 0x77);
        h.m[45] = (0xA4 ^ 0xB3);
        h.m[46] = -(-(0xFFFFFDBB & 0x63CD) & (0xFFFFFDFF & 0x7FD9));
        h.m[47] = (-(0xFFFFBD47 & 0x62BB) & (-1 & 0x3FFF));
        h.m[48] = (0x64 ^ 0x1A ^ (0x22 ^ 0x2F));
        h.m[49] = (0xFF ^ 0xB7 ^ (0xED ^ 0x9B));
        h.m[50] = (0x70 ^ 0x66);
        h.m[51] = (140 + 71 - 39 + 83 ^ 71 + 128 - 72 + 54);
        h.m[52] = (125 + 42 - 50 + 33 ^ 58 + 152 - 43 + 14);
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (h(n, n2)) {
            n3 = h.m[7];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x9F ^ 0xAF) & ~(0x61 ^ 0x51)) != 0x0;
            }
        }
        else {
            n3 = h.m[12];
        }
        return n3 != 0;
    }
    
    public static h a(final String s, final int o, final aa r) {
        final h en = new h();
        if (d(d(s.length(), 10) ? 1 : 0)) {
            en.q = 64;
        }
        if (d(c(ff.w, 128) ? 1 : 0)) {
            en.q = 128;
        }
        en.n = cl.j.b(s, en.q - 10);
        en.o = o;
        en.r = r;
        en.j = r.ai;
        en.i = r.eu;
        r.en = en;
        en.h = 7;
        k.e.addElement(en);
        return en;
    }
    
    private static boolean a(final int n) {
        int n2;
        if (b(n)) {
            n2 = h.m[7];
            "".length();
            if (-(0x5 ^ 0x1) > 0) {
                return ((0x36 ^ 0x26) & ~(0x25 ^ 0x35)) != 0x0;
            }
        }
        else {
            n2 = h.m[12];
        }
        return n2 != 0;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = h.m[7];
            "".length();
            if (null != null) {
                return ((0x5D ^ 0x10) & ~(0x53 ^ 0x1E)) != 0x0;
            }
        }
        else {
            n3 = h.m[12];
        }
        return n3 != 0;
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    @Override
    public final void a(final cn cn) {
        final int j = this.j;
        final int i = this.i;
        cn.a(16777215);
        cn.a(j - this.q / 2 - 1, i - this.l - 15 + this.h - this.n.length * 12 - 10, this.q + 2, (this.n.length + 1) * 12 + 1, 12, 12);
        cn.a(0);
        cn.b(j - this.q / 2 - 1, i - this.l - 15 + this.h - this.n.length * 12 - 10, this.q + 1, (this.n.length + 1) * 12, 12, 12);
        fo.a(cn, 941, j - 3, i - this.l - 15 + this.h + 2, 0, 17);
        int n = 0;
        while (d(d(n, this.n.length) ? 1 : 0)) {
            cl.m.a(cn, this.n[n], j, i - this.l - 15 + this.h + n * 12 - this.n.length * 12 - 4, 2);
            ++n;
            "".length();
            "".length();
            if (c("   ".length())) {
                return;
            }
        }
    }
    
    private static void c() {
        (p = new int[h.m[16]])[h.m[12]] = (h.m[17] ^ h.m[7]);
        h.p[h.m[7]] = ((h.m[18] ^ h.m[2]) & (h.m[19] ^ h.m[20] ^ h.m[21]));
        h.p[h.m[3]] = " ".length();
        h.p[h.m[22]] = (-(h.m[16] ^ h.m[12]) & (h.m[23] & h.m[24]));
        h.p[h.m[0]] = (-(h.m[25] & h.m[26]) & (h.m[21] & h.m[27]));
        h.p[h.m[6]] = (h.m[28] ^ h.m[29] ^ (h.m[3] ^ h.m[30]));
        h.p[h.m[13]] = (h.m[31] ^ h.m[32] ^ (h.m[33] ^ h.m[29]));
        h.p[h.m[14]] = h.m[34] + h.m[35] - h.m[36] + h.m[37];
        h.p[h.m[15]] = (h.m[38] ^ h.m[39]);
        h.p[h.m[1]] = (h.m[21] & h.m[40]);
        h.p[h.m[2]] = "  ".length();
        h.p[h.m[4]] = (h.m[41] ^ h.m[42]);
        h.p[h.m[5]] = (h.m[43] ^ h.m[44] ^ (h.m[12] ^ h.m[45]));
        h.p[h.m[8]] = (h.m[46] & h.m[47]);
        h.p[h.m[9]] = "   ".length();
        h.p[h.m[10]] = (h.m[48] ^ h.m[49] ^ (h.m[50] ^ h.m[51]));
        h.p[h.m[11]] = (h.m[52] ^ h.m[39]);
    }
    
    private static boolean b(final int n) {
        return n > 0;
    }
    
    public static void a(final String s, final aa aa) {
        final String[] a;
        if (d(c((a = fj.a(s, "\n", 0)).length, 1) ? 1 : 0)) {
            a(a[0], 1000, aa);
            "".length();
            return;
        }
        (h.b = a(a[0], 1000, aa)).k = 0;
        h.b.g = a;
        h.b.a = new fe(co.dv, h.b, 8000, null);
    }
    
    private static boolean c(final int n) {
        return n == 0;
    }
    
    public h() {
        super();
        this.q = 100;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = h.m[7];
            "".length();
            if (null != null) {
                return ((0xD0 ^ 0xB4 ^ (0x79 ^ 0x24)) & (104 + 76 - 157 + 140 ^ 115 + 125 - 180 + 94 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = h.m[12];
        }
        return n != 0;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = h.m[7];
            "".length();
            if (" ".length() <= 0) {
                return ((0xD ^ 0x66 ^ (0x6A ^ 0x5)) & (0xCD ^ 0x94 ^ (0x5F ^ 0x2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = h.m[12];
        }
        return n3 != 0;
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean e(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean f(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = h.m[7];
            "".length();
            if (((0x67 ^ 0x6C) & ~(0x4A ^ 0x41)) != 0x0) {
                return ((0x27 ^ 0x21) & ~(0x84 ^ 0x82)) != 0x0;
            }
        }
        else {
            n3 = h.m[12];
        }
        return n3 != 0;
    }
    
    private static boolean h(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean d(final int n) {
        return n != 0;
    }
    
    private static boolean e(final int n) {
        int n2;
        if (c(n)) {
            n2 = h.m[7];
            "".length();
            if ((0x3 ^ 0x6D ^ (0xF6 ^ 0x9C)) <= 0) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = h.m[12];
        }
        return n2 != 0;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = h.m[7];
            "".length();
            if ("   ".length() >= (0x6D ^ 0x69)) {
                return ((0xEA ^ 0xA7) & ~(0x67 ^ 0x2A)) != 0x0;
            }
        }
        else {
            n = h.m[12];
        }
        return n != 0;
    }
}
