public final class am implements bj
{
    public at a;
    public String b;
    private static final int[] h;
    private long i;
    public boolean c;
    public fe d;
    public cc e;
    private static am j;
    public fe f;
    public fe g;
    private static final int[] k;
    
    public final void a(final String s) {
        this.f.f = co.jg;
        this.b = s;
        if (e(a(ff.i) ? 1 : 0)) {
            this.c = true;
            if (e(f(ff.at ? 1 : 0) ? 1 : 0)) {
                this.e.c();
            }
        }
        this.e.a = s;
    }
    
    private static void b() {
        (k = new int[am.h[9]])[am.h[0]] = ((am.h[10] + am.h[11] - am.h[12] + am.h[13] ^ am.h[14] + am.h[15] - am.h[16] + am.h[17]) & (am.h[18] ^ am.h[19] ^ (am.h[20] ^ am.h[21]) ^ -" ".length()));
        am.k[am.h[2]] = (-(am.h[22] & am.h[23]) & (am.h[24] & am.h[25]));
        am.k[am.h[1]] = " ".length();
        am.k[am.h[3]] = (am.h[26] & am.h[27]);
        am.k[am.h[4]] = (am.h[28] ^ am.h[29] ^ (am.h[30] ^ am.h[31]));
        am.k[am.h[5]] = (am.h[32] + am.h[33] - am.h[34] + am.h[35] ^ am.h[36] + am.h[37] - am.h[9] + am.h[38]);
        am.k[am.h[6]] = (am.h[39] ^ am.h[40] ^ (am.h[41] ^ am.h[42]));
        am.k[am.h[7]] = "  ".length();
        am.k[am.h[8]] = (am.h[43] ^ am.h[44]);
    }
    
    private static void c() {
        (h = new int[45])[0] = ((0xE5 ^ 0x8C ^ (0x7E ^ 0x25)) & (0x74 ^ 0x44 ^ "  ".length() ^ -" ".length()));
        am.h[1] = "  ".length();
        am.h[2] = " ".length();
        am.h[3] = "   ".length();
        am.h[4] = (0x77 ^ 0x73);
        am.h[5] = (0xAA ^ 0x8C ^ (0x9D ^ 0xBE));
        am.h[6] = (0xB9 ^ 0xAF ^ (0x29 ^ 0x39));
        am.h[7] = (0x4D ^ 0x4A);
        am.h[8] = (0xC ^ 0x4);
        am.h[9] = ("   ".length() ^ (0x98 ^ 0x92));
        am.h[10] = 155 + 52 - 142 + 91 + (0xF8 ^ 0x9B) - (87 + 42 - 43 + 48) + (0xAE ^ 0x87);
        am.h[11] = (0x2B ^ 0x1B);
        am.h[12] = (0x1E ^ 0x53);
        am.h[13] = (0xF1 ^ 0x9A ^ (0x6D ^ 0x33));
        am.h[14] = (0x43 ^ 0x59);
        am.h[15] = 0 + 123 - 52 + 60;
        am.h[16] = (0x6B ^ 0x2F);
        am.h[17] = (0xBE ^ 0x90);
        am.h[18] = 100 + 150 - 236 + 168;
        am.h[19] = 92 + 75 - 77 + 56;
        am.h[20] = (0x62 ^ 0x0);
        am.h[21] = (0xDD ^ 0x8F ^ (0xBA ^ 0x93));
        am.h[22] = -(0x97 ^ 0xBA);
        am.h[23] = (-(0xFFFFBFDB & 0x4325) & (0xFFFFEFFF & 0x73AF));
        am.h[24] = -(0x8D ^ 0x93);
        am.h[25] = (-1 & 0x7FDF);
        am.h[26] = -(0x8 ^ 0xF);
        am.h[27] = (-(0xFFFFD0B3 & 0x6FDD) & (0xFFFFDFDF & 0x7FF7));
        am.h[28] = (0x3D ^ 0x21 ^ (0x4D ^ 0x63));
        am.h[29] = (0x5 ^ 0x9);
        am.h[30] = (0x46 ^ 0x21 ^ (0x64 ^ 0x72));
        am.h[31] = (0xD4 ^ 0xAE);
        am.h[32] = (0x46 ^ 0x54);
        am.h[33] = 110 + 44 - 90 + 73;
        am.h[34] = (0x9F ^ 0xA4 ^ (0x54 ^ 0x35));
        am.h[35] = (0x69 ^ 0x38);
        am.h[36] = (0x89 ^ 0xC5);
        am.h[37] = (0x67 ^ 0x56);
        am.h[38] = (0xA0 ^ 0xAE);
        am.h[39] = (0x50 ^ 0x2D ^ (0xA1 ^ 0x84));
        am.h[40] = (0x30 ^ 0x2D);
        am.h[41] = (122 + 65 - 157 + 134 ^ 8 + 71 - 51 + 100);
        am.h[42] = (" ".length() ^ (0x87 ^ 0xC7));
        am.h[43] = (148 + 138 - 199 + 70 ^ 27 + 65 - 4 + 74);
        am.h[44] = (0x5B ^ 0x3B ^ (0xE2 ^ 0x95));
    }
    
    public static am a() {
        if (e(a(am.j) ? 1 : 0)) {
            return am.j = new am();
        }
        return am.j;
    }
    
    private static boolean a(final int n) {
        return n == 0;
    }
    
    public final void a(final int n, final Object o) {
        switch (n) {
            case 8000: {
                if (!e(c(this.a) ? 1 : 0)) {
                    break;
                }
                final long currentTimeMillis;
                if (e(d(b((currentTimeMillis = System.currentTimeMillis()) - this.i, 1000L)) ? 1 : 0)) {
                    return;
                }
                this.i = currentTimeMillis;
                this.a.a(this.e.d(), this.b);
                this.e.a("");
                this.f.f = co.jg;
                return;
            }
            case 8001: {
                this.e.a();
                if (e(f(this.e.d().equals("") ? 1 : 0) ? 1 : 0)) {
                    this.c = false;
                    this.a.b();
                    break;
                }
                break;
            }
        }
    }
    
    private static boolean a(final Object o) {
        int n;
        if (d(o)) {
            n = am.h[2];
            "".length();
            if (-" ".length() >= 0) {
                return ((102 + 62 - 111 + 76 ^ 9 + 45 + 62 + 16) & (0xE1 ^ 0x96 ^ (0x68 ^ 0x1A) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = am.h[0];
        }
        return n != 0;
    }
    
    private static boolean b(final int n) {
        return n < 0;
    }
    
    static {
        c();
        b();
    }
    
    private static boolean c(final int n) {
        int n2;
        if (a(n)) {
            n2 = am.h[2];
            "".length();
            if ((0x22 ^ 0x26) > (0x94 ^ 0x90)) {
                return ((0x45 ^ 0x2) & ~(0x7 ^ 0x40)) != 0x0;
            }
        }
        else {
            n2 = am.h[0];
        }
        return n2 != 0;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (b(n)) {
            n2 = am.h[2];
            "".length();
            if ("   ".length() == (0x1F ^ 0x1B)) {
                return ((0x7F ^ 0x1D) & ~(0xCD ^ 0xAF) & ~((0x68 ^ 0x8) & ~(0x46 ^ 0x26))) != 0x0;
            }
        }
        else {
            n2 = am.h[0];
        }
        return n2 != 0;
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean b(final Object o) {
        return o != null;
    }
    
    public final void a(final cn cn) {
        if (e(f(this.c ? 1 : 0) ? 1 : 0)) {
            this.e.b(cn);
        }
    }
    
    private static boolean e(final int n) {
        return n != 0;
    }
    
    public final void a(final int n, final at a, final String s) {
        this.f.f = co.jg;
        this.b = s;
        this.e.c(n);
        "".length();
        if (e(c(this.e.d().equals("") ? 1 : 0) ? 1 : 0) && e(a(ff.i) ? 1 : 0)) {
            this.a = a;
            this.c = true;
        }
        this.e.a = s;
    }
    
    private static boolean c(final Object o) {
        int n;
        if (b(o)) {
            n = am.h[2];
            "".length();
            if ("   ".length() > (0x6D ^ 0x69)) {
                return ((0x9B ^ 0x85) & ~(0x56 ^ 0x48)) != 0x0;
            }
        }
        else {
            n = am.h[0];
        }
        return n != 0;
    }
    
    private static int b(final long n, final long n2) {
        return a(n, n2);
    }
    
    private static boolean f(final int n) {
        int n2;
        if (e(n)) {
            n2 = am.h[2];
            "".length();
            if ("  ".length() == 0) {
                return ((60 + 71 - 24 + 58 ^ 63 + 111 - 158 + 154) & (0x0 ^ 0x5F ^ (0x21 ^ 0x71) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = am.h[0];
        }
        return n2 != 0;
    }
    
    protected am() {
        super();
        this.c = false;
        this.i = 0L;
        this.d = new fe(co.lz, this, 8000, 1, ff.au - di.q + 1);
        this.f = new fe(co.hb, this, 8001, ff.w - 53, ff.au - di.q + 1);
        this.g = null;
        this.e = new cc();
        this.e.e = "chat";
        this.e.i = 16;
        final ff ah = ff.ah;
        "".length();
        this.e.f = ey.a.a() - 32;
        this.e.k = di.r + 2;
        this.e.g = true;
        this.e.b(40);
    }
    
    private static boolean d(final Object o) {
        return o == null;
    }
}
