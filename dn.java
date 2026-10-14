public final class dn extends a
{
    private static final int[] z;
    private boolean aa;
    public static boolean w;
    public static boolean x;
    private static final int[] ab;
    private String ac;
    public static boolean y;
    
    public final void e() {
        if (l(i(aa.z().dk) ? 1 : 0)) {
            a.a(true);
            return;
        }
        if (l(f(super.k, fr.s) ? 1 : 0) && l(f(super.b, fr.g) ? 1 : 0)) {
            if (l(h(this.aa ? 1 : 0) ? 1 : 0)) {
                fv.w = false;
                if (l(j(dr.a.equals("") ? 1 : 0) ? 1 : 0)) {
                    ee.b("H\u00e3y Th\u00eam Item C\u1ea7n Giao D\u1ecbch!");
                    cv.d();
                    return;
                }
                while (l(e(p()) ? 1 : 0)) {
                    dl.a(this.ac);
                    if (!l(e(p()) ? 1 : 0) || !l(h(dn.x ? 1 : 0) ? 1 : 0)) {
                        break;
                    }
                    if (l(j(dn.y ? 1 : 0) ? 1 : 0)) {
                        ee.b("H\u00e0nh trang \u0111\u1ed1i ph\u01b0\u01a1ng kh\u00f4ng c\u00f2n \u0111\u1ee7 ch\u1ed7 tr\u1ed1ng!");
                        "".length();
                        "".length();
                        if (f(-"  ".length())) {
                            return;
                        }
                        break;
                    }
                    else {
                        ee.b("V\u1eabn c\u00f2n vp s\u1ebd gd l\u1ea1i sau 30s");
                        a.a(32000L);
                        "".length();
                        "".length();
                        if (i(dn.z[12] ^ dn.z[13], " ".length())) {
                            return;
                        }
                        continue;
                    }
                }
                if (l(h(dn.y ? 1 : 0) ? 1 : 0)) {
                    ee.b("\u0110\u00e3 h\u1ebft vp c\u1ea7n gd trong h\u00e0nh trang, Ho\u1eb7c \u0111\u1ed1i ph\u01b0\u01a1ng k c\u00f3 trong khu v\u1ef1c n\u00e0y ! !");
                }
                this.aa = true;
            }
            else if (l(c(fj.a().get(12), dl.x) ? 1 : 0)) {
                cv.d();
            }
        }
        else {
            this.a(super.k, super.b, -1, -1);
            if (l(j(dy.d ? 1 : 0) ? 1 : 0)) {
                cv.l();
                dy.d = false;
            }
        }
    }
    
    private static boolean d(final int n) {
        return n == 0;
    }
    
    private static boolean e(final int n) {
        int n2;
        if (g(n)) {
            n2 = dn.z[0];
            "".length();
            if (-(0x3B ^ 0x3E) >= 0) {
                return (" ".length() & ~" ".length()) != 0x0;
            }
        }
        else {
            n2 = dn.z[1];
        }
        return n2 != 0;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = dn.z[0];
            "".length();
            if ("   ".length() <= 0) {
                return ((0xC3 ^ 0xAA ^ (0xB6 ^ 0x8C)) & (0xC8 ^ 0xC4 ^ (0x6C ^ 0x33) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = dn.z[1];
        }
        return n3 != 0;
    }
    
    public dn(final int k, final int b, final String ac) {
        super();
        super.b();
        this.aa = false;
        super.k = k;
        super.b = b;
        this.ac = ac;
    }
    
    @Override
    public final String toString() {
        return "Auto Send";
    }
    
    private static boolean d(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean e(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = dn.z[0];
            "".length();
            if ((0xB6 ^ 0xB2) <= "  ".length()) {
                return ((0xC2 ^ 0x9B) & ~(0x1B ^ 0x42)) != 0x0;
            }
        }
        else {
            n = dn.z[1];
        }
        return n != 0;
    }
    
    private static boolean f(final int n) {
        return n >= 0;
    }
    
    private static boolean g(final int n) {
        return n > 0;
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = dn.z[0];
            "".length();
            if ("   ".length() == 0) {
                return ((0x8B ^ 0x87) & ~(0x1E ^ 0x12)) != 0x0;
            }
        }
        else {
            n3 = dn.z[1];
        }
        return n3 != 0;
    }
    
    static {
        r();
        q();
    }
    
    public static void o() {
        int n = 0;
        while (l(h(n, aa.z().fg.length) ? 1 : 0)) {
            final el el;
            if (l(a(el = aa.z().fg[n]) ? 1 : 0)) {
                fl.u().ae(el.p);
            }
            ++n;
            "".length();
            "".length();
            if (d(" ".length(), " ".length())) {
                return;
            }
        }
    }
    
    public static int p() {
        final el[] fg = aa.z().fg;
        int n = 0;
        int n2 = 0;
        while (l(h(n2, cv.a(dr.a, ",").length) ? 1 : 0)) {
            int n3 = 0;
            while (l(h(n3, fg.length) ? 1 : 0)) {
                final el el;
                if (l(a(el = fg[n3]) ? 1 : 0) && l(f(el.j.d, Integer.parseInt(cv.a(dr.a, ",")[n2])) ? 1 : 0) && l(h(el.o ? 1 : 0) ? 1 : 0)) {
                    ++n;
                }
                ++n3;
                "".length();
                "".length();
                if (j(dn.z[14] ^ dn.z[15], -" ".length())) {
                    return (dn.z[16] ^ dn.z[17]) & (dn.z[18] ^ dn.z[19] ^ dn.z[7]);
                }
            }
            ++n2;
            "".length();
            "".length();
            if (g("   ".length(), "   ".length())) {
                return (dn.z[20] ^ dn.z[21]) & (dn.z[22] ^ dn.z[13] ^ dn.z[7]);
            }
        }
        return n;
    }
    
    private static boolean h(final int n) {
        int n2;
        if (d(n)) {
            n2 = dn.z[0];
            "".length();
            if (null != null) {
                return ((71 + 48 - 95 + 103 ^ (0x76 ^ 0x19)) & (0x70 ^ 0x14 ^ (0x31 ^ 0x45) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dn.z[1];
        }
        return n2 != 0;
    }
    
    private static boolean g(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean h(final int n, final int n2) {
        int n3;
        if (i(n, n2)) {
            n3 = dn.z[0];
            "".length();
            if (null != null) {
                return ((0x5F ^ 0x39 ^ (0x59 ^ 0x17)) & (120 + 78 - 184 + 223 ^ 82 + 182 - 221 + 154 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = dn.z[1];
        }
        return n3 != 0;
    }
    
    private static boolean b(final Object o) {
        return o != null;
    }
    
    private static boolean i(final int n) {
        int n2;
        if (k(n)) {
            n2 = dn.z[0];
            "".length();
            if (-" ".length() < -" ".length()) {
                return ((0x3E ^ 0x28) & ~(0x2D ^ 0x3B)) != 0x0;
            }
        }
        else {
            n2 = dn.z[1];
        }
        return n2 != 0;
    }
    
    private static boolean j(final int n) {
        int n2;
        if (l(n)) {
            n2 = dn.z[0];
            "".length();
            if (null != null) {
                return ((0x24 ^ 0x33) & ~(0x43 ^ 0x54)) != 0x0;
            }
        }
        else {
            n2 = dn.z[1];
        }
        return n2 != 0;
    }
    
    private static boolean i(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean k(final int n) {
        return n <= 0;
    }
    
    private static void q() {
        (ab = new int[dn.z[2]])[dn.z[1]] = ((dn.z[3] ^ dn.z[4]) & (dn.z[5] ^ dn.z[6] ^ dn.z[7]));
        dn.ab[dn.z[0]] = " ".length();
        dn.ab[dn.z[8]] = (dn.z[9] ^ dn.z[10]);
        dn.ab[dn.z[11]] = -" ".length();
    }
    
    private static boolean j(final int n, final int n2) {
        return n <= n2;
    }
    
    private static void r() {
        (z = new int[23])[0] = " ".length();
        dn.z[1] = (" ".length() & ~" ".length());
        dn.z[2] = (106 + 118 - 202 + 109 ^ 44 + 54 - 9 + 46);
        dn.z[3] = 89 + 37 + 55 + 45;
        dn.z[4] = (0x67 ^ 0x49) + (0x3E ^ 0x3) - -(0x27 ^ 0x10) + (0x9F ^ 0x8A);
        dn.z[5] = (0x45 ^ 0x79 ^ (0xD5 ^ 0x98));
        dn.z[6] = (0x54 ^ 0x1C ^ (0x4D ^ 0x21));
        dn.z[7] = -" ".length();
        dn.z[8] = "  ".length();
        dn.z[9] = (0x74 ^ 0x26);
        dn.z[10] = (0x18 ^ 0x46);
        dn.z[11] = "   ".length();
        dn.z[12] = 115 + 38 + 3 + 0;
        dn.z[13] = 0 + 40 - 20 + 132;
        dn.z[14] = (0x8A ^ 0x9A);
        dn.z[15] = (0x73 ^ 0x67);
        dn.z[16] = (0x2B ^ 0x6C);
        dn.z[17] = (0x4D ^ 0x54);
        dn.z[18] = (0xF ^ 0x7E ^ (0x4 ^ 0x6D));
        dn.z[19] = (0x9A ^ 0xB4 ^ (0x1C ^ 0x74));
        dn.z[20] = (188 + 97 - 210 + 164 ^ 21 + 56 - 56 + 120);
        dn.z[21] = (0xFB ^ 0xAD);
        dn.z[22] = (0x87 ^ 0xB8) + (4 + 113 - 110 + 133) - (23 + 80 + 28 + 6) + (0xAE ^ 0xC4);
    }
    
    private static boolean l(final int n) {
        return n != 0;
    }
}
