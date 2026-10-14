public final class da
{
    public int a;
    public int b;
    public int c;
    private static final int[] g;
    public static ev d;
    private static final int[] h;
    public int e;
    public byte f;
    public static long timePK;
    public static boolean isAutoPK;
    public static long timeInfo;
    public static long timeDel;
    public static int countDVP;
    public static int lastDayDVP;
    public static long timeDVP;
    public static long timeBuy;
    public static int dvp_remain;
    public static long timeLB;
    
    private static boolean a(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean b(final int n, final int n2) {
        return n > n2;
    }
    
    private static void b() {
        (g = new int[da.h[0]])[da.h[1]] = ((da.h[2] ^ da.h[3]) & (da.h[4] ^ da.h[5] ^ da.h[6]));
        da.g[da.h[7]] = (da.h[8] ^ da.h[9] ^ (da.h[10] ^ da.h[11]));
        da.g[da.h[12]] = (da.h[13] ^ da.h[0]);
        da.g[da.h[14]] = " ".length();
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = da.h[7];
            "".length();
            if (((0x88 ^ 0xB1) & ~(0x1B ^ 0x22)) < -" ".length()) {
                return ((0xC2 ^ 0x85) & ~(0x42 ^ 0x5)) != 0x0;
            }
        }
        else {
            n3 = da.h[1];
        }
        return n3 != 0;
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = da.h[7];
            "".length();
            if ((0x99 ^ 0x9D) < (0x26 ^ 0x22)) {
                return ((0x86 ^ 0xBF) & ~(0xBF ^ 0x86)) != 0x0;
            }
        }
        else {
            n = da.h[1];
        }
        return n != 0;
    }
    
    public da(final int a, final int e) {
        super();
        this.c = 0;
        this.f = 0;
        this.a = a;
        this.e = e;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = da.h[7];
            "".length();
            if (" ".length() == ((0x7C ^ 0x68 ^ (0x1B ^ 0x2B)) & (0x43 ^ 0x7E ^ (0x7F ^ 0x66) ^ -" ".length()))) {
                return ((0xEC ^ 0xBD ^ (0x3E ^ 0xF)) & (0x11 ^ 0xB ^ (0xFE ^ 0x84) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = da.h[1];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = da.h[7];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x8C ^ 0xC4 ^ (0x77 ^ 0xB)) & (0xB6 ^ 0x95 ^ (0x91 ^ 0x86) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = da.h[1];
        }
        return n3 != 0;
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static void c() {
        (h = new int[15])[0] = (0xAD ^ 0xA9);
        da.h[1] = ((0x53 ^ 0x5E ^ (0x15 ^ 0xB)) & (0x83 ^ 0xB9 ^ (0x24 ^ 0xD) ^ -" ".length()));
        da.h[2] = (0xB7 ^ 0x8A);
        da.h[3] = (0x5F ^ 0x55);
        da.h[4] = (0x43 ^ 0x1E);
        da.h[5] = (170 + 148 - 218 + 101 ^ 140 + 63 - 129 + 89);
        da.h[6] = -" ".length();
        da.h[7] = " ".length();
        da.h[8] = (0x58 ^ 0x26);
        da.h[9] = (62 + 113 - 129 + 157 ^ 141 + 58 - 161 + 147);
        da.h[10] = (0x96 ^ 0xB2 ^ (0xD2 ^ 0xA7));
        da.h[11] = (0xA2 ^ 0xC2 ^ (0x5E ^ 0x7D));
        da.h[12] = "  ".length();
        da.h[13] = (0x53 ^ 0x5F);
        da.h[14] = "   ".length();
    }
    
    static {
        c();
        b();
    }
    
    public final boolean a() {
        return !a(c(this.a, ee.bj) ? 1 : 0) && !a(f(this.a, ee.bj + ee.br) ? 1 : 0) && !a(c(this.e, ee.bm) ? 1 : 0) && !a(f(this.e, ee.bm + ee.ar + 30) ? 1 : 0) && (!a(b(da.d) ? 1 : 0) || a(d(da.d.ac, 8) ? 1 : 0));
    }
}
