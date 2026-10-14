public final class gb extends a
{
    private long y;
    public int w;
    private static final int[] z;
    private int aa;
    private fa ab;
    private fa ac;
    private static final int[] ad;
    public int x;
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (j(n)) {
            n2 = gb.z[7];
            "".length();
            if (" ".length() == 0) {
                return ((0xB ^ 0x3F ^ (0x8 ^ 0x7)) & (0x3A ^ 0x4D ^ (0x3F ^ 0x73) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = gb.z[1];
        }
        return n2 != 0;
    }
    
    private static boolean e(final int n) {
        return n <= 0;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = gb.z[7];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x3E ^ 0x25) & ~(0x17 ^ 0xC)) != 0x0;
            }
        }
        else {
            n3 = gb.z[1];
        }
        return n3 != 0;
    }
    
    private static boolean f(final int n) {
        int n2;
        if (h(n)) {
            n2 = gb.z[7];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x46 ^ 0x58 ^ (0x30 ^ 0x17)) & (0x12 ^ 0x45 ^ (0x1 ^ 0x6F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = gb.z[1];
        }
        return n2 != 0;
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int b(final long n, final long n2) {
        return a(n, n2);
    }
    
    private static boolean g(final int n) {
        return n != 0;
    }
    
    private static void o() {
        (z = new int[35])[0] = (0x74 ^ 0x7F);
        gb.z[1] = ((93 + 196 - 189 + 122 ^ 66 + 15 - 70 + 135) & (((0x1 ^ 0x40) & ~(0x84 ^ 0xC5)) ^ (0x73 ^ 0x3F) ^ -" ".length()));
        gb.z[2] = (0xFA ^ 0xB7);
        gb.z[3] = (0x84 ^ 0x90);
        gb.z[4] = (0x13 ^ 0x56) + (0xE4 ^ 0x8A) - -"  ".length() + (0x33 ^ 0x3F);
        gb.z[5] = 43 + 130 - 120 + 99;
        gb.z[6] = -" ".length();
        gb.z[7] = " ".length();
        gb.z[8] = "  ".length();
        gb.z[9] = "   ".length();
        gb.z[10] = (0x86 ^ 0xB8 ^ (0x2A ^ 0xA));
        gb.z[11] = (0x5B ^ 0x3D ^ (0xDD ^ 0x83));
        gb.z[12] = (83 + 187 - 125 + 47 ^ 54 + 121 - 92 + 113);
        gb.z[13] = 73 + 42 + 14 + 13;
        gb.z[14] = (0xF8 ^ 0xAD);
        gb.z[15] = 28 + 155 - 68 + 52;
        gb.z[16] = (0xE6 ^ 0x80);
        gb.z[17] = (0xBA ^ 0x88 ^ (0x39 ^ 0x77));
        gb.z[18] = (0x58 ^ 0x7);
        gb.z[19] = (0xE ^ 0x18 ^ (0x7 ^ 0x2B));
        gb.z[20] = (0x97 ^ 0x81);
        gb.z[21] = (0x32 ^ 0x6B ^ (0xE1 ^ 0xBD));
        gb.z[22] = (0x5B ^ 0x5D);
        gb.z[23] = (0x9D ^ 0xC5 ^ (0xCC ^ 0x93));
        gb.z[24] = (0xEE ^ 0xBB) + (0xF8 ^ 0x90) - (79 + 164 - 223 + 152) + (99 + 99 - 84 + 33);
        gb.z[25] = (0x35 ^ 0x5F) + (0x27 ^ 0xE) - (0x7A ^ 0x1A) + (0x3E ^ 0x53);
        gb.z[26] = (0xAE ^ 0x84 ^ (0xE2 ^ 0xC0));
        gb.z[27] = (0x50 ^ 0x59);
        gb.z[28] = (0x1B ^ 0x4A ^ (0xFF ^ 0xC4));
        gb.z[29] = (0xE0 ^ 0x8F);
        gb.z[30] = (((0xF3 ^ 0xA7) & ~(0x25 ^ 0x71)) ^ (0x82 ^ 0x88));
        gb.z[31] = (0x12 ^ 0x8 ^ (0xC6 ^ 0x9B));
        gb.z[32] = (0x5C ^ 0x51);
        gb.z[33] = (0xFD ^ 0x87);
        gb.z[34] = (0xA1 ^ 0x87);
    }
    
    @Override
    protected final void e() {
        if (g(k(aa.z().dk) ? 1 : 0)) {
            a.a(true);
            return;
        }
        switch (this.w) {
            case 0: {
                if (g(d(fr.s, 38) ? 1 : 0) && g(d(fr.g, 21) ? 1 : 0)) {
                    es.l();
                    this.w = 2;
                    return;
                }
                this.a(38, 21, -1, -1);
                return;
            }
            case 1: {
                if (g(d(b(System.currentTimeMillis() - this.y, 180000L)) ? 1 : 0)) {
                    final cv i = cv.i;
                    "".length();
                    cv.d();
                    return;
                }
                if (!g(d(fr.s, 38) ? 1 : 0) || g(c(fr.g, 21) ? 1 : 0)) {
                    this.a(38, 21, -1, -1);
                    return;
                }
                break;
            }
            case 2: {
                if (g(d(this.ab.size()) ? 1 : 0)) {
                    final int n = this.ab.size() - 1;
                    super.k = (int)this.ab.elementAt(n);
                    this.x = (int)this.ac.elementAt(n);
                    this.ab.removeElementAt(n);
                    this.ac.removeElementAt(n);
                    this.w = 3;
                    fl.u().s(new StringBuffer().append("pkms ").append(super.k).append(" ").append(this.x).toString());
                    return;
                }
                this.w = 4;
                fl.u().s("pkes");
                return;
            }
            case 3: {
                if (!g(d(this.x) ? 1 : 0)) {
                    break;
                }
                if (g(c(fr.s, this.x) ? 1 : 0)) {
                    this.a(this.x, -2, -1, -1);
                    return;
                }
                ee.a(5, 1, 0);
                if (g(i(es.e() ? 1 : 0) ? 1 : 0)) {
                    this.w = 5;
                    final cv j = cv.i;
                    "".length();
                    cv.a(new cp(super.k));
                    return;
                }
                break;
            }
            case 4: {
                if (!g(d(this.aa) ? 1 : 0)) {
                    this.aa = 22;
                    return;
                }
                if (g(c(fr.s, this.aa) ? 1 : 0)) {
                    this.a(this.aa, -2, -1, -1);
                    return;
                }
                ee.a(5, 1, 0);
                if (g(i(es.e() ? 1 : 0) ? 1 : 0)) {
                    final cv k = cv.i;
                    "".length();
                    cv.d();
                    return;
                }
                break;
            }
            case 5: {
                a.b(10000L);
                if (g(b(cv.n) ? 1 : 0) && g(f(aa.z().ei.equals(cv.n) ? 1 : 0) ? 1 : 0)) {
                    this.w = 1;
                    this.y = System.currentTimeMillis();
                    return;
                }
                this.w = 2;
            }
        }
    }
    
    public gb(final fa ab, final fa ac, final int aa) {
        super();
        this.w = 0;
        this.x = -1;
        this.aa = aa;
        this.ab = ab;
        this.ac = ac;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = gb.z[7];
            "".length();
            if (((0xFB ^ 0xAC) & ~(0x36 ^ 0x61)) != ((0x41 ^ 0x1C) & ~(0x24 ^ 0x79))) {
                return ((0xAE ^ 0x87) & ~(0x8B ^ 0xA2)) != 0x0;
            }
        }
        else {
            n3 = gb.z[1];
        }
        return n3 != 0;
    }
    
    private static boolean h(final int n) {
        return n == 0;
    }
    
    private static boolean i(final int n) {
        int n2;
        if (g(n)) {
            n2 = gb.z[7];
            "".length();
            if (null != null) {
                return ((0x2 ^ 0x44) & ~(0x7E ^ 0x38)) != 0x0;
            }
        }
        else {
            n2 = gb.z[1];
        }
        return n2 != 0;
    }
    
    @Override
    public final String toString() {
        return "PKBoss S";
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = gb.z[7];
            "".length();
            if (-(0x97 ^ 0x93) > 0) {
                return ((0x16 ^ 0x52) & ~(0x30 ^ 0x74)) != 0x0;
            }
        }
        else {
            n = gb.z[1];
        }
        return n != 0;
    }
    
    private static void p() {
        (ad = new int[gb.z[0]])[gb.z[1]] = ((gb.z[2] ^ gb.z[3]) & (gb.z[4] ^ gb.z[5] ^ gb.z[6]));
        gb.ad[gb.z[7]] = -" ".length();
        gb.ad[gb.z[8]] = " ".length();
        gb.ad[gb.z[9]] = (gb.z[10] ^ gb.z[11]);
        gb.ad[gb.z[12]] = (gb.z[13] + gb.z[14] - gb.z[15] + gb.z[16] ^ gb.z[17] + gb.z[18] - gb.z[19] + gb.z[20]);
        gb.ad[gb.z[21]] = "  ".length();
        gb.ad[gb.z[22]] = "   ".length();
        gb.ad[gb.z[23]] = (gb.z[24] ^ gb.z[25]);
        gb.ad[gb.z[26]] = -"  ".length();
        gb.ad[gb.z[27]] = (gb.z[28] ^ gb.z[29]);
        gb.ad[gb.z[30]] = (gb.z[31] ^ gb.z[32] ^ (gb.z[33] ^ gb.z[34]));
    }
    
    static {
        o();
        p();
    }
    
    private static boolean j(final int n) {
        return n > 0;
    }
    
    private static boolean k(final int n) {
        int n2;
        if (e(n)) {
            n2 = gb.z[7];
            "".length();
            if ((0x61 ^ 0x65) == "   ".length()) {
                return ((0xDD ^ 0x82) & ~(0x2 ^ 0x5D)) != 0x0;
            }
        }
        else {
            n2 = gb.z[1];
        }
        return n2 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        return n != n2;
    }
    
    public gb(final int aa) {
        super();
        this.w = 1;
        this.x = -1;
        this.aa = aa;
        this.y = System.currentTimeMillis();
    }
    
    private static boolean f(final int n, final int n2) {
        return n == n2;
    }
}
