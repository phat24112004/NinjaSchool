public final class aq implements Runnable
{
    private static final int[] a;
    private final el b;
    private static final int[] c;
    
    public final void run() {
        ee.t = true;
        try {
            int n = 0;
            final short d = this.b.j.d;
            while (aa.hanhtrang() != 0 && aa.checkDungMoAll(this.b.p, d) && e(a(aa.a()) ? 1 : 0) && e(c((ff.ae instanceof ee) ? 1 : 0) ? 1 : 0)) {
                fl.u().t(this.b.p);
                Thread.sleep(cv.w);
                ++n;
                "".length();
                "".length();
                if (c("  ".length(), " ".length())) {
                    return;
                }
            }
            "".length();
            "".length();
            if (b(-"  ".length())) {
                return;
            }
        }
        catch (final InterruptedException ex) {
            "".length();
        }
        ee.t = false;
    }
    
    private static boolean a(final int n, final int n2) {
        return n < n2;
    }
    
    private static void a() {
        (c = new int[8])[0] = " ".length();
        aq.c[1] = ((0x3C ^ 0x5F) & ~(0x6A ^ 0x9));
        aq.c[2] = "  ".length();
        aq.c[3] = (0xA3 ^ 0x8F) + (44 + 125 - 8 + 26) - (0xE0 ^ 0xBE) + (0x52 ^ 0x21);
        aq.c[4] = 69 + 49 - 60 + 98 + (132 + 97 - 200 + 111) - (103 + 9 - 93 + 147) + (0x35 ^ 0x2E);
        aq.c[5] = (0x42 ^ 0x5);
        aq.c[6] = (0xE7 ^ 0x8C ^ (0xDF ^ 0x92));
        aq.c[7] = -" ".length();
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = aq.c[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x9E ^ 0x8F) & ~(0xF ^ 0x1E)) != 0x0;
            }
        }
        else {
            n3 = aq.c[1];
        }
        return n3 != 0;
    }
    
    private static boolean a(final int n) {
        int n2;
        if (d(n)) {
            n2 = aq.c[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x83 ^ 0x93) & ~(0x9B ^ 0x8B)) != 0x0;
            }
        }
        else {
            n2 = aq.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final int n) {
        return n >= 0;
    }
    
    aq(final el b) {
        super();
        this.b = b;
    }
    
    private static void b() {
        (a = new int[aq.c[2]])[aq.c[1]] = " ".length();
        aq.a[aq.c[0]] = ((aq.c[3] ^ aq.c[4]) & (aq.c[5] ^ aq.c[6] ^ aq.c[7]));
    }
    
    private static boolean c(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean c(final int n) {
        int n2;
        if (e(n)) {
            n2 = aq.c[0];
            "".length();
            if (((0xF8 ^ 0xAA ^ (0x2F ^ 0x72)) & (((0x56 ^ 0x1E) & ~(0x66 ^ 0x2E)) ^ (0x22 ^ 0x2D) ^ -" ".length())) > 0) {
                return ((0x75 ^ 0x6F ^ (0xBB ^ 0xBD)) & (0x35 ^ 0x2A ^ "   ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = aq.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean d(final int n) {
        return n > 0;
    }
    
    static {
        a();
        b();
    }
    
    private static boolean e(final int n) {
        return n != 0;
    }
}
