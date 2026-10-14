final class dk extends a
{
    private int w;
    private static final int[] x;
    private int y;
    private static final int[] z;
    private boolean aa;
    
    dk() {
        super();
        this.w = 0;
        this.aa = false;
    }
    
    public final void e() {
        if (f(h(this.aa ? 1 : 0) ? 1 : 0)) {
            cv.i();
            return;
        }
        if (f(h(a.h() ? 1 : 0) ? 1 : 0)) {
            if (f(h(aa.et ? 1 : 0) ? 1 : 0)) {
                a.a(true);
            }
            return;
        }
        if (f(g(a.s ? 1 : 0) ? 1 : 0) && f(h(aa.z().es ? 1 : 0) ? 1 : 0)) {
            this.c();
            return;
        }
        if (f(c(this.w, this.y) ? 1 : 0)) {
            if (f(g(this.w) ? 1 : 0)) {
                ee.b(ek.a);
                fl.u().z(ek.a);
                a.b(50L);
            }
            fl.u().c(ek.a, ek.c, ek.b);
            a.b(10L);
            ++this.w;
            if (f(e(this.w, this.y) ? 1 : 0)) {
                this.aa = true;
                ee.b(new StringBuffer().append("Ho\u00e0n th\u00e0nh Auto NPC ").append(this.y).append(" l\u1ea7n!").toString());
                if (f(h(aa.et ? 1 : 0) ? 1 : 0)) {
                    this.a(super.k, super.b, super.n, super.d);
                }
            }
        }
    }
    
    public final void d(final int y) {
        super.b();
        super.k = fr.s;
        super.b = fr.g;
        this.y = y;
        this.w = 0;
        this.aa = false;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = dk.x[0];
            "".length();
            if (-(0x5F ^ 0x35 ^ (0xEC ^ 0x82)) > 0) {
                return ((0x34 ^ 0x3A ^ (0xE4 ^ 0xA0)) & (0x99 ^ 0xB9 ^ (0x63 ^ 0x9) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = dk.x[1];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n) {
        return n == 0;
    }
    
    private static boolean d(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean f(final int n) {
        return n != 0;
    }
    
    private static boolean g(final int n) {
        int n2;
        if (e(n)) {
            n2 = dk.x[0];
            "".length();
            if (((0x60 ^ 0x52 ^ (0x49 ^ 0x65)) & (0x8E ^ 0x95 ^ (0x10 ^ 0x15) ^ -" ".length())) == "  ".length()) {
                return ((0xFB ^ 0xBF ^ (0x11 ^ 0x46)) & (0x7D ^ 0x6F ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dk.x[1];
        }
        return n2 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = dk.x[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0x2B ^ 0x17) & ~(0x6C ^ 0x50)) != 0x0;
            }
        }
        else {
            n3 = dk.x[1];
        }
        return n3 != 0;
    }
    
    private static boolean h(final int n) {
        int n2;
        if (f(n)) {
            n2 = dk.x[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0xDE ^ 0xA3 ^ (0x8F ^ 0xA7)) & (0x2C ^ 0x15 ^ (0x39 ^ 0x55) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dk.x[1];
        }
        return n2 != 0;
    }
    
    static {
        p();
        o();
    }
    
    @Override
    public final String toString() {
        return new StringBuffer().append("Auto NPC: ").append(ek.a).append(" (").append(this.w).append("/").append(this.y).append(")").toString();
    }
    
    private static boolean f(final int n, final int n2) {
        return n >= n2;
    }
    
    private static void o() {
        (z = new int[dk.x[2]])[dk.x[1]] = ((dk.x[3] ^ dk.x[4] ^ (dk.x[5] ^ dk.x[6])) & (dk.x[7] ^ dk.x[8] ^ (dk.x[9] ^ dk.x[10]) ^ -" ".length()));
        dk.z[dk.x[0]] = " ".length();
    }
    
    private static void p() {
        (x = new int[11])[0] = " ".length();
        dk.x[1] = ((0x55 ^ 0x40 ^ (0x73 ^ 0x41)) & (0x24 ^ 0x37 ^ (0x7A ^ 0x4E) ^ -" ".length()));
        dk.x[2] = "  ".length();
        dk.x[3] = (0x9D ^ 0xBA);
        dk.x[4] = (0xFC ^ 0xBF ^ (0x80 ^ 0x9F));
        dk.x[5] = 213 + 90 - 231 + 156;
        dk.x[6] = 38 + 97 - 20 + 39;
        dk.x[7] = (0xF2 ^ 0xB0) + (81 + 110 - 74 + 12) - (0x24 ^ 0x10) + (0xA7 ^ 0xBD);
        dk.x[8] = (0x64 ^ 0x41) + (0x4B ^ 0x2E) - (0x35 ^ 0x68) + (0x77 ^ 0x17);
        dk.x[9] = (0xCE ^ 0xC2) + (0x2 ^ 0x76) - (0x8D ^ 0xB9) + (0x34 ^ 0x64);
        dk.x[10] = 93 + 49 - 91 + 85 + (0xD5 ^ 0x8B) - (60 + 138 - 177 + 169) + (3 + 102 - 53 + 97);
    }
}
