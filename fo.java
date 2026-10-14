import javax.microedition.lcdui.*;
import java.io.*;
import java.util.*;

public final class fo
{
    public short a;
    private static Image[] g;
    public static bw b;
    public short c;
    private static final int[] h;
    public short d;
    public static int[][] e;
    private static final int[] i;
    public short f;
    
    public static void a(final int i, final byte[] array) {
        ez ez;
        if (g(c(ez = (ez)fo.b.get(String.valueOf(i))) ? 1 : 0)) {
            ez = new ez();
            fo.b.put(String.valueOf(i), ez);
            "".length();
        }
        ez.b = cx.a(array);
        if (g(d(ed.g, 1) ? 1 : 0)) {
            fh.a(String.valueOf(i), array);
        }
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static int b(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean c(final int n) {
        return n <= 0;
    }
    
    private static boolean a(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (d(o)) {
            n = fo.h[1];
            "".length();
            if ((0xA0 ^ 0xA4) <= "   ".length()) {
                return ((0x8C ^ 0xAD) & ~(0x84 ^ 0xA5)) != 0x0;
            }
        }
        else {
            n = fo.h[0];
        }
        return n != 0;
    }
    
    private static boolean c(final Object o) {
        int n;
        if (a(o)) {
            n = fo.h[1];
            "".length();
            if (null != null) {
                return ((0x70 ^ 0x4C ^ (0xEB ^ 0x89)) & (0xEC ^ 0x92 ^ (0x31 ^ 0x11) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = fo.h[0];
        }
        return n != 0;
    }
    
    public static int a(final int n) {
        return fo.e[n][4];
    }
    
    static {
        f();
        e();
        fo.b = new bw();
    }
    
    public static void a() {
        fo.g = null;
        System.gc();
    }
    
    private static boolean b(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (g(n)) {
            n2 = fo.h[1];
            "".length();
            if (null != null) {
                return ((0x44 ^ 0x79) & ~(0x79 ^ 0x44)) != 0x0;
            }
        }
        else {
            n2 = fo.h[0];
        }
        return n2 != 0;
    }
    
    private static boolean e(final int n) {
        return n > 0;
    }
    
    public fo() {
        super();
        g();
    }
    
    private static void e() {
        (i = new int[fo.h[7]])[fo.h[0]] = (fo.h[8] + fo.h[9] - fo.h[10] + fo.h[11] ^ fo.h[12] + fo.h[13] - fo.h[14] + fo.h[15]);
        fo.i[fo.h[1]] = ((fo.h[16] ^ fo.h[17]) & (fo.h[18] ^ fo.h[3] ^ fo.h[19]));
        fo.i[fo.h[2]] = " ".length();
        fo.i[fo.h[3]] = "  ".length();
        fo.i[fo.h[4]] = "   ".length();
        fo.i[fo.h[5]] = (fo.h[20] + fo.h[21] - fo.h[22] + fo.h[23] ^ fo.h[3] + fo.h[24] - fo.h[25] + fo.h[26]);
        fo.i[fo.h[6]] = -(-(fo.h[19] & fo.h[27]) & (fo.h[28] & fo.h[29]));
    }
    
    public static boolean b(final int i) {
        if (!g(f(i, fo.e.length) ? 1 : 0) || !g(f(fo.e[i][1], fo.g[fo.e[i][0]].getWidth()) ? 1 : 0) || !g(f(fo.e[i][3], fo.g[fo.e[i][0]].getWidth()) ? 1 : 0) || !g(f(fo.e[i][2], fo.g[fo.e[i][0]].getHeight()) ? 1 : 0) || g(c(fo.e[i][4], fo.g[fo.e[i][0]].getHeight()) ? 1 : 0)) {
            final ez ez;
            if (g(c(ez = (ez)fo.b.get(String.valueOf(i))) ? 1 : 0)) {
                final ez ez2 = new ez();
                fo.b.put(String.valueOf(i), ez2);
                "".length();
                ez2.b = cx.a(fh.a(String.valueOf(i)));
                if (g(c(ez2.b) ? 1 : 0)) {
                    ez2.a = System.currentTimeMillis();
                    fl.u().ah(i);
                }
                return false;
            }
            if (g(b(ez.b) ? 1 : 0)) {
                return true;
            }
            if (g(c(ez.b) ? 1 : 0) && g(f(d(System.currentTimeMillis() - ez.a, 60000L)) ? 1 : 0)) {
                ez.a = System.currentTimeMillis();
                fl.u().ah(i);
                return false;
            }
        }
        return true;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = fo.h[1];
            "".length();
            if (" ".length() > (0x6F ^ 0x6B)) {
                return ((0xFE ^ 0xB1) & ~(0x4B ^ 0x4)) != 0x0;
            }
        }
        else {
            n3 = fo.h[0];
        }
        return n3 != 0;
    }
    
    private static int c(final long n, final long n2) {
        return b(n, n2);
    }
    
    private static void f() {
        (h = new int[30])[0] = ((0xCF ^ 0x92) & ~(0x69 ^ 0x34));
        fo.h[1] = " ".length();
        fo.h[2] = "  ".length();
        fo.h[3] = "   ".length();
        fo.h[4] = (0x63 ^ 0x15 ^ (0x65 ^ 0x17));
        fo.h[5] = (0xCF ^ 0x92 ^ (0x5 ^ 0x5D));
        fo.h[6] = (0x82 ^ 0x84);
        fo.h[7] = (0x74 ^ 0x59 ^ (0x5A ^ 0x70));
        fo.h[8] = (0xC2 ^ 0x86);
        fo.h[9] = (0x5 ^ 0x4D);
        fo.h[10] = -(0x88 ^ 0x86);
        fo.h[11] = (0xC ^ 0x7B ^ (0x78 ^ 0x2D));
        fo.h[12] = (0x27 ^ 0x18 ^ (0x33 ^ 0x57));
        fo.h[13] = (219 + 225 - 250 + 33 ^ 43 + 5 + 45 + 80);
        fo.h[14] = (0x7C ^ 0x52);
        fo.h[15] = (0x62 ^ 0x45 ^ (0x74 ^ 0x6D));
        fo.h[16] = 5 + 30 + 13 + 144 + (0xF3 ^ 0xB6) - (0x61 ^ 0xF) + (0x85 ^ 0xBF);
        fo.h[17] = 49 + 13 - 1 + 82;
        fo.h[18] = (0x3D ^ 0x60);
        fo.h[19] = -" ".length();
        fo.h[20] = (0xFC ^ 0x9B ^ (0x17 ^ 0x40));
        fo.h[21] = (0xE1 ^ 0xA4 ^ (0x18 ^ 0x2B));
        fo.h[22] = (0x97 ^ 0x84);
        fo.h[23] = (0xB2 ^ 0xA2);
        fo.h[24] = 74 + 4 + 44 + 14;
        fo.h[25] = (0xE ^ 0x73);
        fo.h[26] = ((0x65 ^ 0x25) & ~(0xC ^ 0x4C)) + (0x9C ^ 0x82) - -(0xD3 ^ 0x94) + (0xA1 ^ 0x95);
        fo.h[27] = (0xFFFFFFAA & 0x7FFD);
        fo.h[28] = -(0xD ^ 0x4);
        fo.h[29] = (-(0x8C ^ 0x9D) & (-1 & 0x78007FBF));
    }
    
    private static void g() {
        try {
            final DataInputStream dataInputStream;
            final short short1;
            fo.e = new int[short1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(fh.a("nj_image")))).readShort()][5];
            int n = 0;
            while (g(f(n, short1) ? 1 : 0)) {
                fo.e[n][0] = dataInputStream.readUnsignedByte();
                fo.e[n][1] = dataInputStream.readShort();
                fo.e[n][2] = dataInputStream.readShort();
                fo.e[n][3] = dataInputStream.readShort();
                fo.e[n][4] = dataInputStream.readShort();
                ++n;
                "".length();
                "".length();
                if (c(" ".length())) {
                    return;
                }
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = fo.h[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x50 ^ 0x31) & ~(0x76 ^ 0x17)) != 0x0;
            }
        }
        else {
            n3 = fo.h[0];
        }
        return n3 != 0;
    }
    
    public static void b() {
        new fo();
    }
    
    public static void a(final cn cn, final int i, final int n, final int n2, final int n3, final int n4) {
        if (NewMount.block(i)) {
            return;
        }
        if (g(f(i, fo.e.length) ? 1 : 0) && g(f(fo.e[i][1], fo.g[fo.e[i][0]].getWidth()) ? 1 : 0) && g(f(fo.e[i][3], fo.g[fo.e[i][0]].getWidth()) ? 1 : 0) && g(f(fo.e[i][2], fo.g[fo.e[i][0]].getHeight()) ? 1 : 0) && g(f(fo.e[i][4], fo.g[fo.e[i][0]].getHeight()) ? 1 : 0)) {
            cn.a(fo.g[fo.e[i][0]], fo.e[i][1], fo.e[i][2], fo.e[i][3], fo.e[i][4], n3, n, n2, n4);
            return;
        }
        ez ez;
        if (g(c(ez = (ez)fo.b.get(String.valueOf(i))) ? 1 : 0)) {
            ez = new ez();
            fo.b.put(String.valueOf(i), ez);
            "".length();
            ez.b = cx.a(fh.a(String.valueOf(i)));
            if (g(c(ez.b) ? 1 : 0)) {
                ez.a = System.currentTimeMillis();
                fl.u().ah(i);
                "".length();
                "".length();
                if (e("  ".length(), "  ".length())) {
                    return;
                }
            }
        }
        else if (g(c(ez.b) ? 1 : 0) && g(f(f(System.currentTimeMillis() - ez.a, 60000L)) ? 1 : 0)) {
            ez.a = System.currentTimeMillis();
            fl.u().ah(i);
        }
        if (g(b(ez) ? 1 : 0)) {
            if (g(b(ez.b) ? 1 : 0)) {
                cn.a(ez.b, 0, 0, ez.b.getWidth(), ez.b.getHeight(), n3, n, n2, n4);
            }
            ez.c = System.currentTimeMillis();
        }
    }
    
    public static void k(final cn cn, final int i, final int n, final int n2, final int n3, final int n4) {
        if (NewMount.block(i)) {
            return;
        }
        if (g(f(i, fo.e.length) ? 1 : 0) && g(f(fo.e[i][1], fo.g[fo.e[i][0]].getWidth()) ? 1 : 0) && g(f(fo.e[i][3], fo.g[fo.e[i][0]].getWidth()) ? 1 : 0) && g(f(fo.e[i][2], fo.g[fo.e[i][0]].getHeight()) ? 1 : 0) && g(f(fo.e[i][4], fo.g[fo.e[i][0]].getHeight()) ? 1 : 0)) {
            cn.a(fo.g[fo.e[i][0]], fo.e[i][1], fo.e[i][2], fo.e[i][3], fo.e[i][4], n3, n, n2, n4);
            return;
        }
        ez ez;
        if (g(c(ez = (ez)fo.b.get(String.valueOf(i))) ? 1 : 0)) {
            ez = new ez();
            fo.b.put(String.valueOf(i), ez);
            "".length();
            ez.b = cx.a(fh.a(String.valueOf(i)));
            if (g(c(ez.b) ? 1 : 0)) {
                ez.a = System.currentTimeMillis();
                fl.u().ah(i);
                "".length();
                "".length();
                if (e("  ".length(), "  ".length())) {
                    return;
                }
            }
        }
        else if (g(c(ez.b) ? 1 : 0) && g(f(f(System.currentTimeMillis() - ez.a, 60000L)) ? 1 : 0)) {
            ez.a = System.currentTimeMillis();
            fl.u().ah(i);
        }
        if (g(b(ez) ? 1 : 0)) {
            if (g(b(ez.b) ? 1 : 0)) {
                h(cn, ez.b, 0, 0, ez.b.getWidth(), ez.b.getHeight(), n3, n, n2, n4);
            }
            ez.c = System.currentTimeMillis();
        }
    }
    
    public static void c() {
        fo.g = null;
        System.gc();
        fo.g = new Image[] { ff.a("/img/Big0.png"), ff.a("/img/Big1.png"), ff.a("/img/Big2.png"), ff.a("/img/Big3.png"), ff.a("/img/Big4.png") };
        Image.createRGBImage(new int[] { -2013265920 }, 1, 1, true);
        "".length();
    }
    
    public static void d() {
        try {
            final Enumeration<Object> keys = fo.b.keys();
            while (g(d(keys.hasMoreElements() ? 1 : 0) ? 1 : 0)) {
                final String s = keys.nextElement();
                if (g(f(c(System.currentTimeMillis() - ((ez)fo.b.get(s)).c, 180000L)) ? 1 : 0)) {
                    fo.b.remove(s);
                    "".length();
                }
                "".length();
                "".length();
                if (a("  ".length(), "   ".length())) {
                    return;
                }
            }
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    public fo(final int n, final int n2, final int n3, final int n4) {
        super();
        this.c = (short)n;
        this.a = (short)n2;
        this.f = (short)n3;
        this.d = (short)n4;
    }
    
    private static boolean e(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = fo.h[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((161 + 53 - 73 + 91 ^ 65 + 39 - 70 + 145) & (0x7F ^ 0x71 ^ (0x0 ^ 0x55) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fo.h[0];
        }
        return n3 != 0;
    }
    
    private static boolean f(final int n) {
        int n2;
        if (e(n)) {
            n2 = fo.h[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0x50 ^ 0x21 ^ (0xC8 ^ 0xA9)) & (0x20 ^ 0x67 ^ (0xF8 ^ 0xAF) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fo.h[0];
        }
        return n2 != 0;
    }
    
    private static int d(final long n, final long n2) {
        return e(n, n2);
    }
    
    private static boolean g(final int n) {
        return n != 0;
    }
    
    private static boolean d(final Object o) {
        return o != null;
    }
    
    private static int e(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int f(final long n, final long n2) {
        return a(n, n2);
    }
    
    private static void h(final cn cn, final Image image, final int n, int n2, final int n3, int n4, final int n5, final int n6, final int n7, final int n8) {
        final int height = image.getHeight();
        if (height > 35 && height % 3 == 0) {
            n4 = height / 3;
            n2 = (int)(System.currentTimeMillis() / 200L % 3L) * n4;
        }
        cn.a(image, n, n2, n3, n4, n5, n6, n7, n8);
    }
}
