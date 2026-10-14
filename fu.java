public final class fu extends a
{
    public static boolean w;
    private static final int[] x;
    private static int y;
    private static String[] z;
    private static int aa;
    private static final int[] ab;
    private fq ac;
    private static long ad;
    public int danhCumState;
    
    public final void a() {
        this.ac = aa.m(0);
    }
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = fu.x[0];
            "".length();
            if ("   ".length() == "  ".length()) {
                return ((0x5C ^ 0x4E) & ~(0x7D ^ 0x6F)) != 0x0;
            }
        }
        else {
            n = fu.x[1];
        }
        return n != 0;
    }
    
    public fu() {
        super();
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public final String toString() {
        return new StringBuffer().append("Auto Nhi\u1ec7m v\u1ee5 h\u1eb1ng ng\u00e0y: ").append(fu.aa).append("/20").toString();
    }
    
    private static int b(final long n, final long n2) {
        return a(n, n2);
    }
    
    private static boolean b(final Object o) {
        return o == null;
    }
    
    static {
        o();
        p();
        fu.w = false;
        fu.z = new String[] { "H\u00f4m nay con \u0111\u00e3 l\u00e0m h\u1ebft nhi\u1ec7m v\u1ee5 ta giao. H\u00e3y quay l\u1ea1i v\u00e0o ng\u00e0y h\u00f4m sau..", "\u0110\u00e2y l\u00e0 l\u1ea7n nh\u1eadn nhi\u1ec7m v\u1ee5 th\u1ee9 ", " trong ng\u00e0y h\u00f4m nay. M\u1ed7i ng\u00e0y \u0111\u01b0\u1ee3c nh\u1eadn t\u1ed1i \u0111a 20 l\u1ea7n con nh\u00e9." };
    }
    
    private static boolean d(final int n) {
        int n2;
        if (i(n)) {
            n2 = fu.x[0];
            "".length();
            if (" ".length() >= (0xB8 ^ 0xBC)) {
                return ((0x91 ^ 0xA3) & ~(0x18 ^ 0x2A)) != 0x0;
            }
        }
        else {
            n2 = fu.x[1];
        }
        return n2 != 0;
    }
    
    private static void o() {
        (x = new int[23])[0] = " ".length();
        fu.x[1] = ((0x26 ^ 0x8) & ~(0x63 ^ 0x4D));
        fu.x[2] = "  ".length();
        fu.x[3] = "   ".length();
        fu.x[4] = (0x36 ^ 0x41 ^ (0x7F ^ 0xE));
        fu.x[5] = (0xF ^ 0x1C ^ (0xA2 ^ 0xAF));
        fu.x[6] = (0x44 ^ 0x41);
        fu.x[7] = (0x10 ^ 0x1F);
        fu.x[8] = (0x45 ^ 0x42);
        fu.x[9] = (0x28 ^ 0x20);
        fu.x[10] = (0xF4 ^ 0x89);
        fu.x[11] = (0x3B ^ 0x2E ^ (0x3 ^ 0x7D));
        fu.x[12] = 123 + 90 - 154 + 92 + (0xFA ^ 0x8F) - (0xFFFFFD37 & 0x3CD) + (150 + 59 - 116 + 59);
        fu.x[13] = (0xD2 ^ 0xA5) + (0x94 ^ 0xA0) - (112 + 103 - 150 + 87) + (0xB3 ^ 0xC5);
        fu.x[14] = -" ".length();
        fu.x[15] = 76 + 89 - 45 + 59;
        fu.x[16] = (0x2B ^ 0x6E) + "   ".length() - (0x27 ^ 0x15) + (110 + 31 - 114 + 117);
        fu.x[17] = (0xE6 ^ 0x96 ^ (0x7 ^ 0x73));
        fu.x[18] = (0xE2 ^ 0x9F) + (18 + 20 - 18 + 112) - (130 + 136 - 195 + 128) + (0xE7 ^ 0xAB);
        fu.x[19] = (0x0 ^ 0x4) + (0x77 ^ 0x2E) - (0x63 ^ 0x33) + (123 + 126 - 169 + 53);
        fu.x[20] = (0x7 ^ 0x45) + (0x52 ^ 0x4A) - -(0xBC ^ 0x9E) + (0x3B ^ 0x70);
        fu.x[21] = (0x72 ^ 0x2D) + (0x47 ^ 0x7E) - (96 + 52 - 118 + 120) + (74 + 63 - 38 + 32);
        fu.x[22] = 150 + 54 - 46 + 38;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (k(n, n2)) {
            n3 = fu.x[0];
            "".length();
            if (-(0xA3 ^ 0xA6) >= 0) {
                return ((0xE6 ^ 0xB4) & ~(0x1B ^ 0x49)) != 0x0;
            }
        }
        else {
            n3 = fu.x[1];
        }
        return n3 != 0;
    }
    
    private static boolean d(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean e(final int n) {
        return n <= 0;
    }
    
    private static boolean e(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean c(final Object o) {
        return o != null;
    }
    
    public final void e() {
        if (this.ac != null || fr.g(fr.s)) {
            if (this.danhCumState == 0) {
                this.danhCumState = (InputNpc.danhCum ? 2 : 1);
                InputNpc.danhCum = false;
            }
            if (j(c(System.currentTimeMillis() - fu.ad, 20000L))) {
                fu.y = fu.x[1];
                fu.ad = System.currentTimeMillis();
            }
            Label_0624: {
                Label_0606: {
                    if (h(fu.aa, fu.x[5])) {
                        if (!i(d((super.t instanceof b) ? 1 : 0) ? 1 : 0) || i(k(b(System.currentTimeMillis() - super.g, 3600000L)) ? 1 : 0)) {}
                        if (i(h(aa.z().dk) ? 1 : 0)) {
                            a.a(false);
                            break Label_0624;
                        }
                        if (!i(d(fr.g(fr.s) ? 1 : 0) ? 1 : 0)) {
                            if (i(d(this.ac) ? 1 : 0) && i(c(fr.s, this.ac.f) ? 1 : 0)) {
                                if (i(j(this.ac.e, this.ac.d) ? 1 : 0)) {
                                    a.die();
                                    a.a(1000L);
                                    fl.u().af();
                                    return;
                                }
                                this.a(this.ac.g, 1);
                                this.c(-1);
                                if (i(d(fu.w ? 1 : 0) ? 1 : 0)) {
                                    ee.b(new StringBuffer().append("Nhi\u1ec7m v\u1ee5 ").append(fu.aa).append("/20: ").append(this.ac.e).append("/").append(this.ac.d).append(" ").append(ev.o[this.ac.g].c).toString());
                                    fu.w = false;
                                }
                            }
                            return;
                        }
                        if (i(a(this.ac) ? 1 : 0)) {
                            ee.b(new StringBuffer().append("Nh\u1eadn NV ").append(fu.aa + 1).append("/20").toString());
                            ee.a(25, InputNpc.indexNpc, 0);
                            es.o();
                            this.ac = aa.m(0);
                            fu.y += fu.x[0];
                            fu.ad = System.currentTimeMillis();
                            if (e(fu.y, fu.x[7])) {
                                "".length();
                                if (" ".length() > " ".length()) {
                                    return;
                                }
                                break Label_0606;
                            }
                        }
                        if (i(i(this.ac.e, this.ac.d) ? 1 : 0)) {
                            ee.b(new StringBuffer().append("\u0110i l\u00e0m NV ").append(fu.aa).append("/20").toString());
                            ee.a(25, InputNpc.indexNpc, 3);
                            fr.h();
                            this.b(super.b);
                            return;
                        }
                        if (i(h(aa.a()) ? 1 : 0)) {
                            ee.b("H\u00e0nh trang \u0111\u1ea7y");
                            return;
                        }
                        ee.b(new StringBuffer().append("Ho\u00e0n th\u00e0nh NV ").append(fu.aa).append("/20").toString());
                        ee.a(25, InputNpc.indexNpc, 2);
                        this.ac = null;
                        fu.y = fu.x[1];
                        return;
                    }
                }
                ee.b("Ho\u00e0n th\u00e0nh!");
                final cv i = cv.i;
                "".length();
                cv.d();
            }
            InputNpc.danhCum = (this.danhCumState == 2);
            this.danhCumState = 0;
            return;
        }
        a.a(2000L);
        a.die();
        fl.u().af();
    }
    
    private static boolean f(final int n) {
        int n2;
        if (j(n)) {
            n2 = fu.x[0];
            "".length();
            if (-"  ".length() > 0) {
                return ((108 + 123 - 103 + 1 ^ 136 + 127 - 242 + 171) & (0xD6 ^ 0xB8 ^ (0x4D ^ 0x62) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fu.x[1];
        }
        return n2 != 0;
    }
    
    private static boolean g(final int n) {
        return n < 0;
    }
    
    private static boolean h(final int n) {
        int n2;
        if (e(n)) {
            n2 = fu.x[0];
            "".length();
            if (" ".length() < 0) {
                return ((0x81 ^ 0x96 ^ (0x48 ^ 0x4C)) & (0xA2 ^ 0x96 ^ (0xE6 ^ 0xC1) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fu.x[1];
        }
        return n2 != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        return n <= n2;
    }
    
    private static void p() {
        (ab = new int[fu.x[9]])[fu.x[1]] = ((fu.x[10] ^ fu.x[11]) & (fu.x[12] ^ fu.x[13] ^ fu.x[14]));
        fu.ab[fu.x[0]] = (fu.x[15] ^ fu.x[16]);
        fu.ab[fu.x[2]] = " ".length();
        fu.ab[fu.x[3]] = "  ".length();
        fu.ab[fu.x[17]] = (fu.x[18] ^ fu.x[19]);
        fu.ab[fu.x[6]] = (fu.x[12] ^ fu.x[20] ^ (fu.x[21] ^ fu.x[22]));
        fu.ab[fu.x[4]] = "   ".length();
        fu.ab[fu.x[8]] = -" ".length();
    }
    
    private static boolean i(final int n) {
        return n != 0;
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = fu.x[0];
            "".length();
            if (((0x77 ^ 0x58) & ~(0x28 ^ 0x7)) > ("  ".length() & ~"  ".length())) {
                return ((0x98 ^ 0xAF) & ~(0xBC ^ 0x8B)) != 0x0;
            }
        }
        else {
            n3 = fu.x[1];
        }
        return n3 != 0;
    }
    
    private static boolean h(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean i(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = fu.x[0];
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x8F ^ 0x8B ^ (0x14 ^ 0x5E)) & (0x3F ^ 0x67 ^ (0x26 ^ 0x30) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fu.x[1];
        }
        return n3 != 0;
    }
    
    private static int c(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean j(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = fu.x[0];
            "".length();
            if ("  ".length() == "   ".length()) {
                return ((0x42 ^ 0xC) & ~(0x47 ^ 0x9)) != 0x0;
            }
        }
        else {
            n3 = fu.x[1];
        }
        return n3 != 0;
    }
    
    private static boolean k(final int n, final int n2) {
        return n == n2;
    }
    
    public static void a(String trim) {
        if (i(d(trim.equals(fu.z[0]) ? 1 : 0) ? 1 : 0)) {
            fu.aa = 21;
            es.y();
            return;
        }
        final int index;
        if (i(f(index = trim.indexOf(fu.z[1])) ? 1 : 0)) {
            trim = trim.substring(index + fu.z[1].length(), trim.indexOf(fu.z[2])).trim();
            try {
                fu.aa = Integer.parseInt(trim);
            }
            catch (final NumberFormatException ex) {
                "".length();
            }
        }
    }
    
    @Override
    public final void b() {
        fu.aa = 0;
        this.ac = aa.m(0);
        super.b();
    }
    
    private static boolean d(final Object o) {
        int n;
        if (c(o)) {
            n = fu.x[0];
            "".length();
            if ((0xE4 ^ 0x9E ^ 119 + 101 - 110 + 17) <= 0) {
                return ((167 + 176 - 256 + 111 ^ 26 + 54 - 38 + 104) & (0xB5 ^ 0x89 ^ (0xC6 ^ 0xAE) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = fu.x[1];
        }
        return n != 0;
    }
    
    private static boolean j(final int n) {
        return n >= 0;
    }
    
    private static boolean k(final int n) {
        int n2;
        if (g(n)) {
            n2 = fu.x[0];
            "".length();
            if (null != null) {
                return ((0xEF ^ 0x8D) & ~(0x51 ^ 0x33)) != 0x0;
            }
        }
        else {
            n2 = fu.x[1];
        }
        return n2 != 0;
    }
}
