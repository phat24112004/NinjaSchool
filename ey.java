import javax.microedition.lcdui.*;

public final class ey extends Canvas implements Runnable
{
    public static ey a;
    private static final int[] d;
    private int e;
    private static final int[] f;
    public static boolean b;
    public fs c;
    
    static {
        e();
        d();
    }
    
    protected final void pointerDragged(int n, int n2) {
        n /= this.e;
        n2 /= this.e;
        this.c.c(n, n2);
    }
    
    private static boolean a(final int n) {
        return n < 0;
    }
    
    private static int a(final long n, final long n2) {
        return b(n, n2);
    }
    
    protected final void keyReleased(final int n) {
        this.c.b(n);
    }
    
    private static boolean b(final int n) {
        return n > 0;
    }
    
    public final void run() {
        try {
            Thread.sleep(10L);
            "".length();
            "".length();
            if (b((ey.f[7] + ey.f[8] - ey.f[9] + ey.f[0] ^ ey.f[3] + ey.f[10] - ey.f[11] + ey.f[12]) & (ey.f[13] + ey.f[14] - ey.f[15] + ey.f[14] ^ ey.f[16] + ey.f[17] - ey.f[18] + ey.f[19] ^ -" ".length()))) {
                return;
            }
        }
        catch (final InterruptedException ex) {
            "".length();
        }
        ey.b = true;
        while (c(f(ey.b ? 1 : 0) ? 1 : 0)) {
            try {
                final long currentTimeMillis = System.currentTimeMillis();
                this.c.i();
                final long n = System.currentTimeMillis() - currentTimeMillis;
                try {
                    long millis;
                    if (c(e(a(n, cv.v)) ? 1 : 0)) {
                        millis = cv.v - n;
                        "".length();
                        "".length();
                        if (d(-(ey.f[20] ^ ey.f[21] ^ (ey.f[22] ^ ey.f[23])))) {
                            return;
                        }
                    }
                    else {
                        millis = 1L;
                    }
                    Thread.sleep(millis);
                    "".length();
                    "".length();
                    if (g("  ".length())) {
                        return;
                    }
                    continue;
                }
                catch (final InterruptedException ex2) {
                    "".length();
                    "".length();
                    "".length();
                    if (a("  ".length(), ey.f[24] ^ ey.f[25] ^ (ey.f[26] ^ ey.f[27]))) {
                        return;
                    }
                    continue;
                }
            }
            catch (final Exception ex3) {
                try {
                    Thread.sleep(1000L);
                    "".length();
                    "".length();
                    if (a(-" ".length(), "  ".length())) {
                        return;
                    }
                }
                catch (final InterruptedException ex4) {
                    final Throwable t;
                    t.printStackTrace();
                }
                ex3.printStackTrace();
                "".length();
                "".length();
                if (b(-"  ".length())) {
                    return;
                }
                continue;
            }
            break;
        }
    }
    
    protected final void pointerReleased(int n, int n2) {
        n /= this.e;
        n2 /= this.e;
        if (ee.ae(ee.s(ff.at ? 1 : 0) ? 1 : 0) && (!ee.ae(ee.s(ff.k.a ? 1 : 0) ? 1 : 0) || ee.ae(ee.q(ff.e ? 1 : 0) ? 1 : 0)) && ee.ae(ee.c(ff.i) ? 1 : 0) && ee.ae(ee.c(h.b) ? 1 : 0) && ee.ae(ee.q(ff.k.a ? 1 : 0) ? 1 : 0) && ee.ae(ee.q(ee.bs() ? 1 : 0) ? 1 : 0) && ee.ae(ee.q(am.a().c ? 1 : 0) ? 1 : 0) && ee.pz + 4 <= n && ee.pz + 30 >= n && ee.gy - 58 <= n2 && ee.gy - 32 >= n2) {
            if (!ek.tansat) {
                ek.tansat = true;
                ee.b("B\u1eadt T\u00e0n S\u00e1t All");
                cv.a(-1, fr.s);
            }
            else {
                ek.tansat = false;
                ee.b("End Auto");
                cv.i();
            }
            n = -100000;
            n2 = -100000;
        }
        this.c.b(n, n2);
    }
    
    private static boolean c(final int n) {
        return n != 0;
    }
    
    public ey() {
        super();
        this.e = 1;
        this.setFullScreenMode(true);
        final int n = 1;
        this.e = n;
        cn.a = n;
    }
    
    public final int a() {
        if (c(b(this.e, 1) ? 1 : 0)) {
            return this.getWidth();
        }
        return 0;
    }
    
    private static void d() {
        (d = new int[ey.f[0]])[ey.f[1]] = " ".length();
        ey.d[ey.f[2]] = ((ey.f[3] ^ ey.f[4]) & (ey.f[5] ^ ey.f[0] ^ ey.f[6]));
    }
    
    private static boolean d(final int n) {
        return n >= 0;
    }
    
    private static void e() {
        (f = new int[28])[0] = "  ".length();
        ey.f[1] = ((0x16 ^ 0x10 ^ (0x18 ^ 0x4B)) & (0x13 ^ 0x2B ^ (0x74 ^ 0x19) ^ -" ".length()));
        ey.f[2] = " ".length();
        ey.f[3] = "   ".length();
        ey.f[4] = (0x41 ^ 0xB);
        ey.f[5] = (182 + 2 - 176 + 227 ^ 47 + 53 + 55 + 5);
        ey.f[6] = -" ".length();
        ey.f[7] = 54 + 92 - 31 + 26 + (0x71 ^ 0x49) - (0x69 ^ 0x15) + (0xDB ^ 0x92);
        ey.f[8] = (0x66 ^ 0x18) + (0x8 ^ 0x44) - (107 + 98 - 91 + 20) + (0xCD ^ 0x9D);
        ey.f[9] = (0x16 ^ 0x6B);
        ey.f[10] = (185 + 142 - 311 + 181 ^ 7 + 24 + 118 + 11);
        ey.f[11] = (0x56 ^ 0x7E);
        ey.f[12] = (128 + 24 - 29 + 83 ^ 8 + 73 + 41 + 32);
        ey.f[13] = (33 + 126 - 44 + 24 ^ 193 + 34 - 56 + 24);
        ey.f[14] = (0x5C ^ 0x22);
        ey.f[15] = (0xF7 ^ 0xAD) + (0x27 ^ 0x5) - (0x3C ^ 0x18) + (0x2B ^ 0x43);
        ey.f[16] = (0x37 ^ 0x1A);
        ey.f[17] = (107 + 177 - 96 + 20 ^ 137 + 74 - 179 + 154);
        ey.f[18] = -(0x90 ^ 0x9B);
        ey.f[19] = (0x96 ^ 0x8F);
        ey.f[20] = (0x63 ^ 0x1F) + (0x63 ^ 0x57) - -(0x4A ^ 0x59) + (0x0 ^ 0x6);
        ey.f[21] = (0x4E ^ 0x43) + (0xF6 ^ 0x9D) - -(0x62 ^ 0x47) + (0x33 ^ 0x2D);
        ey.f[22] = (0xE6 ^ 0x8F);
        ey.f[23] = (0x56 ^ 0x68 ^ (0x7 ^ 0x26));
        ey.f[24] = 147 + 85 - 183 + 111;
        ey.f[25] = 23 + 32 + 45 + 34;
        ey.f[26] = (0x38 ^ 0x4E ^ (0x83 ^ 0xC7));
        ey.f[27] = (0x41 ^ 0x51);
    }
    
    private static int b(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = ey.f[2];
            "".length();
            if (-" ".length() >= 0) {
                return ((0xA8 ^ 0x98) & ~(0x64 ^ 0x54)) != 0x0;
            }
        }
        else {
            n = ey.f[1];
        }
        return n != 0;
    }
    
    private static boolean e(final int n) {
        int n2;
        if (a(n)) {
            n2 = ey.f[2];
            "".length();
            if (((0x32 ^ 0x20 ^ (0x81 ^ 0x8B)) & (0xFC ^ 0x86 ^ (0xC8 ^ 0xAA) ^ -" ".length())) != 0x0) {
                return ((0xD5 ^ 0xB6 ^ (0x34 ^ 0x48)) & (12 + 69 + 78 + 63 ^ 49 + 88 - 95 + 151 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ey.f[1];
        }
        return n2 != 0;
    }
    
    private static boolean f(final int n) {
        int n2;
        if (c(n)) {
            n2 = ey.f[2];
            "".length();
            if ("   ".length() <= 0) {
                return ((100 + 139 - 221 + 178 ^ 8 + 25 + 57 + 39) & (61 + 112 - 95 + 124 ^ 132 + 19 - 27 + 19 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ey.f[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final Object o) {
        return o == null;
    }
    
    private static boolean g(final int n) {
        return n == 0;
    }
    
    private static boolean a(final int n, final int n2) {
        return n >= n2;
    }
    
    protected final void pointerPressed(int n, int n2) {
        n /= this.e;
        n2 /= this.e;
        this.c.d(n, n2);
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (c(n, n2)) {
            n3 = ey.f[2];
            "".length();
            if ((0xA3 ^ 0xA7) == " ".length()) {
                return ((0xE8 ^ 0xC6) & ~(0x4A ^ 0x64)) != 0x0;
            }
        }
        else {
            n3 = ey.f[1];
        }
        return n3 != 0;
    }
    
    protected final void paint(final Graphics graphics) {
        this.c.a(graphics);
    }
    
    public final int b() {
        if (c(b(this.e, 1) ? 1 : 0)) {
            return this.getHeight();
        }
        return 0;
    }
    
    protected final void keyPressed(final int n) {
        this.c.a(n);
    }
    
    private static boolean c(final int n, final int n2) {
        return n == n2;
    }
    
    public static ey c() {
        if (c(a(ey.a) ? 1 : 0)) {
            ey.a = new ey();
        }
        return ey.a;
    }
}
