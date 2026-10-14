import javax.microedition.lcdui.*;
import java.io.*;

public final class cl
{
    public static cl a;
    public static cl b;
    public static cl c;
    public static cl d;
    private static String u;
    public static cl e;
    private static final int[] v;
    public static cl f;
    public static cl g;
    public static cl h;
    public static cl i;
    public static cl j;
    private String w;
    private String x;
    private int[][] y;
    private static final int[] z;
    public static cl k;
    public static cl l;
    public static cl m;
    private Image aa;
    public static cl n;
    public static cl o;
    public static cl p;
    public static cl q;
    public static cl r;
    public static cl s;
    private int ab;
    private int ac;
    public static cl t;
    
    private static boolean a(final int n) {
        return n >= 0;
    }
    
    private static boolean b(final int n) {
        int n2;
        if (f(n)) {
            n2 = cl.v[0];
            "".length();
            if (null != null) {
                return ((0x4A ^ 0x70) & ~(0xB5 ^ 0x8F)) != 0x0;
            }
        }
        else {
            n2 = cl.v[1];
        }
        return n2 != 0;
    }
    
    private static boolean a(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean c(final int n) {
        return n != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (i(n, n2)) {
            n3 = cl.v[0];
            "".length();
            if (-" ".length() > (0x81 ^ 0x85)) {
                return ((0x66 ^ 0x42) & ~(0x9 ^ 0x2D)) != 0x0;
            }
        }
        else {
            n3 = cl.v[1];
        }
        return n3 != 0;
    }
    
    public final int a(final String s) {
        int n = 0;
        int index = 0;
        while (c(e(index, s.length()) ? 1 : 0)) {
            int index2;
            if (c(b(index2 = this.x.indexOf(s.charAt(index)), -1) ? 1 : 0)) {
                index2 = 0;
            }
            n += this.y[index2][2] + this.ab;
            ++index;
            "".length();
            "".length();
            if (e("   ".length())) {
                return (cl.v[45] ^ cl.v[46]) & (cl.v[47] ^ cl.v[48] ^ cl.v[8]);
            }
        }
        return n;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (e(n)) {
            n2 = cl.v[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return (" ".length() & ~" ".length()) != 0x0;
            }
        }
        else {
            n2 = cl.v[1];
        }
        return n2 != 0;
    }
    
    private static boolean e(final int n) {
        return n < 0;
    }
    
    private static boolean c(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (c(n, n2)) {
            n3 = cl.v[0];
            "".length();
            if (null != null) {
                return ((0x10 ^ 0x43 ^ (0x24 ^ 0x6C)) & (35 + 174 - 49 + 18 ^ 17 + 94 - 100 + 158 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = cl.v[1];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = cl.v[0];
            "".length();
            if ("   ".length() == -" ".length()) {
                return ((0x4D ^ 0x43) & ~(0x34 ^ 0x3A)) != 0x0;
            }
        }
        else {
            n3 = cl.v[1];
        }
        return n3 != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        return n <= n2;
    }
    
    public final void a() {
        this.aa = null;
    }
    
    private cl(String x, final String w, final String name, final int ab) {
        super();
        try {
            this.x = x;
            this.ab = ab;
            this.w = w;
            x = null;
            this.c();
            try {
                x = (String)new DataInputStream(this.getClass().getResourceAsStream(name));
                this.y = new int[((DataInputStream)x).readShort()][];
                int n = 0;
                while (c(e(n, this.y.length) ? 1 : 0)) {
                    (this.y[n] = new int[4])[0] = ((DataInputStream)x).readShort();
                    this.y[n][1] = ((DataInputStream)x).readShort();
                    this.y[n][2] = ((DataInputStream)x).readShort();
                    this.y[n][3] = ((DataInputStream)x).readShort();
                    this.ac = this.y[n][3];
                    ++n;
                    "".length();
                    "".length();
                    if (h(-"   ".length())) {
                        throw null;
                    }
                }
                "".length();
                "".length();
                if (f(" ".length(), ("  ".length() ^ (cl.v[24] ^ cl.v[11])) & (cl.v[25] ^ cl.v[26] ^ (cl.v[27] ^ cl.v[28]) ^ -" ".length()))) {
                    throw null;
                }
            }
            catch (final Exception ex) {
                "".length();
                try {
                    ((FilterInputStream)x).close();
                    "".length();
                    "".length();
                    if (f(cl.v[29] ^ cl.v[10])) {
                        throw null;
                    }
                }
                catch (final IOException ex2) {
                    final Throwable t;
                    t.printStackTrace();
                }
            }
        }
        catch (final Exception ex3) {
            final Throwable t2;
            t2.printStackTrace();
        }
    }
    
    private static boolean f(final int n) {
        return n == 0;
    }
    
    public final int b() {
        return this.ac;
    }
    
    private static void d() {
        (z = new int[cl.v[31]])[cl.v[1]] = ((cl.v[32] ^ cl.v[22]) & (cl.v[33] ^ cl.v[34] ^ cl.v[8]));
        cl.z[cl.v[0]] = (cl.v[21] ^ cl.v[35]);
        cl.z[cl.v[3]] = " ".length();
        cl.z[cl.v[13]] = "  ".length();
        cl.z[cl.v[14]] = "   ".length();
        cl.z[cl.v[2]] = -" ".length();
        cl.z[cl.v[15]] = (cl.v[36] ^ cl.v[37]);
        cl.z[cl.v[16]] = (cl.v[38] ^ cl.v[39]);
        cl.z[cl.v[17]] = (cl.v[14] ^ cl.v[40] ^ (cl.v[41] ^ cl.v[42]));
    }
    
    private static boolean g(final int n) {
        int n2;
        if (a(n)) {
            n2 = cl.v[0];
            "".length();
            if (null != null) {
                return ((0x93 ^ 0xBD) & ~(0x7D ^ 0x53)) != 0x0;
            }
        }
        else {
            n2 = cl.v[1];
        }
        return n2 != 0;
    }
    
    private static boolean h(final int n) {
        return n > 0;
    }
    
    public final void c() {
        this.aa = ff.a(this.w);
    }
    
    static {
        e();
        d();
        cl.u = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():a\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7bcd\u0111e\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7fghi\u00ed\u00ec\u1ec9\u0129\u1ecbjklmno\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3pqrstu\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1vxy\u00fd\u1ef3\u1ef7\u1ef9\u1ef5zwA\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eb0\u1eae\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eacBCD\u0110E\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6FGHI\u00cd\u00cc\u1ec8\u0128\u1ecaJKLMNO\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2PQRSTU\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0VXY\u00dd\u1ef2\u1ef6\u1ef8\u1ef4ZW";
        cl.e = new cl(cl.u, "/font/tahoma_7b_red.png", "/font/tahoma_7b", 0);
        cl.i = new cl(cl.u, "/font/tahoma_7b_blue.png", "/font/tahoma_7b", 0);
        cl.o = new cl(cl.u, "/font/tahoma_7b_purple.png", "/font/tahoma_7b", 0);
        cl.c = new cl(cl.u, "/font/tahoma_7b_yellow.png", "/font/tahoma_7b", 0);
        cl.h = new cl(cl.u, "/font/tahoma_7b_white.png", "/font/tahoma_7b", 0);
        cl.r = new cl(cl.u, "/font/tahoma_7b_green.png", "/font/tahoma_7b", 0);
        cl.m = new cl(cl.u, "/font/tahoma_7.png", "/font/tahoma_7", 0);
        cl.s = new cl(cl.u, "/font/tahoma_7_blue1.png", "/font/tahoma_7", 0);
        cl.n = new cl(cl.u, "/font/tahoma_7_white.png", "/font/tahoma_7", 0);
        cl.q = new cl(cl.u, "/font/tahoma_7_yellow.png", "/font/tahoma_7", 0);
        cl.g = new cl(cl.u, "/font/tahoma_7_grey.png", "/font/tahoma_7", 0);
        cl.j = new cl(cl.u, "/font/tahoma_7_red.png", "/font/tahoma_7", 0);
        cl.k = new cl(cl.u, "/font/tahoma_7_blue.png", "/font/tahoma_7", 0);
        cl.t = new cl(cl.u, "/font/tahoma_7_green.png", "/font/tahoma_7", 0);
        cl.d = new cl(cl.u, "/font/tahoma_8b.png", "/font/tahoma_8b", -1);
        cl.a = new cl(" 0123456789+-", "/font/number_yellow.png", "/font/number", 0);
        cl.p = new cl(" 0123456789+-", "/font/number_red.png", "/font/number", 0);
        cl.l = new cl(" 0123456789+-", "/font/number_green.png", "/font/number", 0);
        cl.f = new cl(" 0123456789+-", "/font/number_white.png", "/font/number", 0);
        cl.b = new cl(" 0123456789+-", "/font/number_orange.png", "/font/number", 0);
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    private static void e() {
        (v = new int[49])[0] = " ".length();
        cl.v[1] = ((140 + 72 - 58 + 35 ^ 99 + 126 - 193 + 123) & (153 + 36 - 142 + 112 ^ 26 + 126 - 133 + 166 ^ -" ".length()));
        cl.v[2] = (0x73 ^ 0x76);
        cl.v[3] = "  ".length();
        cl.v[4] = (0xE4 ^ 0xB3);
        cl.v[5] = (45 + 156 - 171 + 186 ^ 145 + 171 - 134 + 15);
        cl.v[6] = (0x4E ^ 0x11 ^ (0xE7 ^ 0x95));
        cl.v[7] = (103 + 47 + 29 + 73 ^ 4 + 3 + 3 + 145);
        cl.v[8] = -" ".length();
        cl.v[9] = 80 + 96 - 126 + 157 + " ".length() - -"  ".length() + (0xB3 ^ 0x99);
        cl.v[10] = 65 + 48 + 13 + 51;
        cl.v[11] = (0xFD ^ 0xAC);
        cl.v[12] = (79 + 1 + 31 + 24 ^ 54 + 60 - 50 + 91);
        cl.v[13] = "   ".length();
        cl.v[14] = (0xF ^ 0x56 ^ (0x5B ^ 0x6));
        cl.v[15] = (0x11 ^ 0x17);
        cl.v[16] = (0x5B ^ 0x73 ^ (0x13 ^ 0x3C));
        cl.v[17] = (0x9C ^ 0x94);
        cl.v[18] = (0x41 ^ 0x0);
        cl.v[19] = (0x10 ^ 0x75 ^ (0xE8 ^ 0x95));
        cl.v[20] = (0xD9 ^ 0x83);
        cl.v[21] = (0x29 ^ 0x79) + (0x5C ^ 0x9) - (0xEE ^ 0x8C) + (0x7A ^ 0x46);
        cl.v[22] = (0x2F ^ 0x74) + "  ".length() - (0x8C ^ 0x96) + (0xF0 ^ 0x9D);
        cl.v[23] = 69 + 41 + 5 + 14 + (0x51 ^ 0x5F) - (0x8D ^ 0xC7) + (0x31 ^ 0x61);
        cl.v[24] = (0x6D ^ 0x35 ^ (0x5B ^ 0x45));
        cl.v[25] = (6 + 133 - 98 + 195 ^ 158 + 134 - 182 + 74);
        cl.v[26] = (0xA8 ^ 0xB1);
        cl.v[27] = (0x77 ^ 0x73 ^ (0xDB ^ 0xA7));
        cl.v[28] = (" ".length() ^ (0x78 ^ 0x59));
        cl.v[29] = 136 + 41 - 164 + 167;
        cl.v[30] = (0x5E ^ 0xB);
        cl.v[31] = (137 + 156 - 238 + 121 ^ 104 + 126 - 55 + 10);
        cl.v[32] = 114 + 145 - 108 + 34 + (0xCE ^ 0x96) - (177 + 52 - 43 + 43) + (107 + 89 - 84 + 54);
        cl.v[33] = (0xD0 ^ 0x99);
        cl.v[34] = (126 + 17 - 82 + 108 ^ 79 + 62 - 60 + 49);
        cl.v[35] = (156 + 12 + 4 + 39 ^ 151 + 24 - 125 + 118);
        cl.v[36] = (0x79 ^ 0x16 ^ (0x52 ^ 0x7));
        cl.v[37] = (0x4A ^ 0x15 ^ (0xD ^ 0x7C));
        cl.v[38] = (0x62 ^ 0x15) + (0x27 ^ 0x5B) - (9 + 160 + 31 + 16) + (0x31 ^ 0x56);
        cl.v[39] = 8 + 19 + 3 + 106;
        cl.v[40] = (0x67 ^ 0x5F);
        cl.v[41] = (0x48 ^ 0x17 ^ (0xB6 ^ 0x95));
        cl.v[42] = (0x80 ^ 0x9F ^ 70 + 69 - 120 + 108);
        cl.v[43] = (0x66 ^ 0x2B ^ (0x17 ^ 0x51));
        cl.v[44] = (0x5 ^ 0xB);
        cl.v[45] = (0x2A ^ 0x46) + (4 + 56 + 82 + 10) - (0x5C ^ 0x18) + "   ".length();
        cl.v[46] = (0xE5 ^ 0x9C) + (2 + 84 - 21 + 62) - (23 + 24 - 12 + 175) + (0xF5 ^ 0x95);
        cl.v[47] = (0x10 ^ 0x6A) + (0xF7 ^ 0x8F) - (174 + 178 - 181 + 9) + (49 + 17 - 42 + 128);
        cl.v[48] = 24 + 143 - 80 + 60;
    }
    
    private static boolean g(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean i(final int n) {
        return n <= 0;
    }
    
    public final fa a(final String s, final int n) {
        final fa fa = new fa();
        String string = "";
        int n2 = 0;
        while (c(e(n2, s.length()) ? 1 : 0)) {
            if (c(b(s.charAt(n2), 10) ? 1 : 0)) {
                fa.addElement(string);
                string = "";
                "".length();
                "".length();
                if (f("   ".length(), (cl.v[17] ^ cl.v[18]) & (cl.v[11] ^ cl.v[19] ^ cl.v[8]))) {
                    return null;
                }
            }
            else {
                string = new StringBuffer().append(string).append(s.charAt(n2)).toString();
                if (c(h(this.a(string), n) ? 1 : 0)) {
                    int n3 = string.length() - 1;
                    while (c(g(n3) ? 1 : 0) && c(d(string.charAt(n3), 32) ? 1 : 0)) {
                        --n3;
                        "".length();
                        "".length();
                        if (c((cl.v[20] ^ cl.v[21]) & (cl.v[22] ^ cl.v[23] ^ cl.v[8]))) {
                            return null;
                        }
                    }
                    if (c(d(n3) ? 1 : 0)) {
                        n3 = string.length() - 1;
                    }
                    fa.addElement(string.substring(0, n3));
                    n2 = n2 - (string.length() - n3) + 1;
                    string = "";
                }
                if (c(b(n2, s.length() - 1) ? 1 : 0) && c(b(string.trim().equals("") ? 1 : 0) ? 1 : 0)) {
                    fa.addElement(string);
                }
            }
            ++n2;
            "".length();
            "".length();
            if (i("  ".length())) {
                return null;
            }
        }
        return fa;
    }
    
    public final void a(final cn cn, final String s, int index, final int n, int n2, final cl cl) {
        final int length = s.length();
        if (c(b(n2) ? 1 : 0)) {
            n2 = index;
            "".length();
            "".length();
            if (a((Object)null)) {
                return;
            }
        }
        else if (c(b(n2, 1) ? 1 : 0)) {
            n2 = index - this.a(s);
            "".length();
            "".length();
            if (g((cl.v[4] ^ cl.v[5]) & (cl.v[6] ^ cl.v[7] ^ cl.v[8]), (cl.v[9] ^ cl.v[10]) & (cl.v[11] ^ cl.v[12] ^ cl.v[8]))) {
                return;
            }
        }
        else {
            n2 = index - (this.a(s) >> 1);
        }
        int index2 = 0;
        while (c(e(index2, length) ? 1 : 0)) {
            if (c(b(index = this.x.indexOf(s.charAt(index2)), -1) ? 1 : 0)) {
                index = 0;
            }
            if (c(g(index) ? 1 : 0)) {
                cn.a(cl.aa, this.y[index][0], this.y[index][1], this.y[index][2], this.y[index][3], 0, n2 + 1, n, 20);
                cn.a(cl.aa, this.y[index][0], this.y[index][1], this.y[index][2], this.y[index][3], 0, n2, n + 1, 20);
                cn.a(this.aa, this.y[index][0], this.y[index][1], this.y[index][2], this.y[index][3], 0, n2, n, 20);
            }
            n2 += this.y[index][2] + this.ab;
            ++index2;
            "".length();
            "".length();
            if (a("   ".length(), "   ".length())) {
                return;
            }
        }
    }
    
    private static boolean h(final int n, final int n2) {
        int n3;
        if (g(n, n2)) {
            n3 = cl.v[0];
            "".length();
            if (null != null) {
                return ((0xF9 ^ 0x92 ^ (0x3E ^ 0x7D)) & (77 + 74 - 70 + 99 ^ 139 + 74 - 96 + 39 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = cl.v[1];
        }
        return n3 != 0;
    }
    
    public final String[] b(final String s, final int n) {
        final fa a;
        final String[] array = new String[(a = this.a(s, n)).size()];
        int n2 = 0;
        while (c(e(n2, a.size()) ? 1 : 0)) {
            array[n2] = a.elementAt(n2).toString();
            ++n2;
            "".length();
            "".length();
            if (a(-(cl.v[43] ^ cl.v[44]))) {
                return null;
            }
        }
        return array;
    }
    
    private static boolean i(final int n, final int n2) {
        return n == n2;
    }
    
    public final void a(final cn cn, final String s, int index, final int n, int n2) {
        final int length = s.length();
        if (c(b(n2) ? 1 : 0)) {
            n2 = index;
            "".length();
            "".length();
            if (i("   ".length(), "  ".length())) {
                return;
            }
        }
        else if (c(b(n2, 1) ? 1 : 0)) {
            n2 = index - this.a(s);
            "".length();
            "".length();
            if (g(-" ".length(), cl.v[11] ^ cl.v[30])) {
                return;
            }
        }
        else {
            n2 = index - (this.a(s) >> 1);
        }
        int index2 = 0;
        while (c(e(index2, length) ? 1 : 0)) {
            if (c(b(index = this.x.indexOf(s.charAt(index2)), -1) ? 1 : 0)) {
                index = 0;
            }
            if (c(g(index) ? 1 : 0)) {
                cn.a(this.aa, this.y[index][0], this.y[index][1], this.y[index][2], this.y[index][3], 0, n2, n, 20);
            }
            n2 += this.y[index][2] + this.ab;
            ++index2;
            "".length();
            "".length();
            if (i("   ".length())) {
                return;
            }
        }
    }
}
