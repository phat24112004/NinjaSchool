import java.io.*;

public final class gc
{
    private static final int[] a;
    private static fa b;
    private static final int[] c;
    
    private static boolean a(final int n, final int n2) {
        return n == n2;
    }
    
    private static void c() {
        (a = new int[gc.c[0]])[gc.c[1]] = ((gc.c[2] ^ gc.c[3]) & (gc.c[4] ^ gc.c[5] ^ gc.c[6]));
    }
    
    private static boolean a(final int n) {
        int n2;
        if (b(n)) {
            n2 = gc.c[0];
            "".length();
            if ((0x80 ^ 0x84) < 0) {
                return ((0x27 ^ 0x3B) & ~(0x6D ^ 0x71)) != 0x0;
            }
        }
        else {
            n2 = gc.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    public static void a() {
        gc.b.removeAllElements();
        d();
    }
    
    public static void a(final String o) {
        if (b(a(gc.b.contains(o) ? 1 : 0) ? 1 : 0)) {
            gc.b.removeElement(o);
            "".length();
            d();
        }
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = gc.c[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x53 ^ 0x6E ^ (0xA2 ^ 0x9A)) & (47 + 175 - 142 + 100 ^ 74 + 68 - 80 + 115 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = gc.c[1];
        }
        return n3 != 0;
    }
    
    public static void b(final String o) {
        if (b(c(gc.b.contains(o) ? 1 : 0) ? 1 : 0)) {
            gc.b.addElement(o);
            d();
        }
    }
    
    public static boolean c(final String o) {
        return gc.b.contains(o);
    }
    
    private static boolean c(final int n) {
        int n2;
        if (d(n)) {
            n2 = gc.c[0];
            "".length();
            if (-" ".length() > 0) {
                return ((0x6C ^ 0x62) & ~(0x31 ^ 0x3F)) != 0x0;
            }
        }
        else {
            n2 = gc.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean d(final int n) {
        return n == 0;
    }
    
    private static void d() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        try {
            dataOutputStream.writeInt(gc.b.size());
            int n = 0;
            while (b(b(n, gc.b.size()) ? 1 : 0)) {
                dataOutputStream.writeUTF((String)gc.b.elementAt(n));
                ++n;
                "".length();
                "".length();
                if (c(" ".length(), "  ".length())) {
                    return;
                }
            }
            dataOutputStream.flush();
            out.flush();
            fh.a("V6PKS", out.toByteArray());
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static void e() {
        (c = new int[21])[0] = " ".length();
        gc.c[1] = ((0xF3 ^ 0xA0 ^ (0x37 ^ 0x62)) & (0x60 ^ 0x41 ^ (0x1A ^ 0x3D) ^ -" ".length()));
        gc.c[2] = (0x18 ^ 0x44);
        gc.c[3] = (0x57 ^ 0x21);
        gc.c[4] = "   ".length();
        gc.c[5] = (0x73 ^ 0x5A);
        gc.c[6] = -" ".length();
        gc.c[7] = (0x44 ^ 0x16);
        gc.c[8] = (0x1B ^ 0x37 ^ (0xF ^ 0x75));
        gc.c[9] = (0xEF ^ 0xA6);
        gc.c[10] = (0xE ^ 0x4B);
        gc.c[11] = (0x2E ^ 0x71 ^ (0x20 ^ 0x44));
        gc.c[12] = (0x3B ^ 0x55);
        gc.c[13] = (0xB ^ 0x67);
        gc.c[14] = (0xA4 ^ 0xA9);
        gc.c[15] = (0xBA ^ 0xAF);
        gc.c[16] = (0x40 ^ 0x73 ^ (0x28 ^ 0x7A));
        gc.c[17] = (0xD ^ 0x9);
        gc.c[18] = (118 + 47 - 18 + 14 ^ 22 + 103 + 3 + 14);
        gc.c[19] = (0xCF ^ 0x85);
        gc.c[20] = (((0x3 ^ 0x32) & ~(0x93 ^ 0xA2)) ^ (0xA3 ^ 0xC6));
    }
    
    private static boolean c(final int n, final int n2) {
        return n >= n2;
    }
    
    public static fa b() {
        final fa fa = new fa();
        int i = 0;
        while (b(b(i, gc.b.size()) ? 1 : 0)) {
            fa.addElement(new StringBuffer().append(i).append(". ").append((String)gc.b.elementAt(i)).toString());
            ++i;
            "".length();
            "".length();
            if (a(gc.c[7] ^ gc.c[8], "   ".length())) {
                return null;
            }
        }
        return fa;
    }
    
    static {
        e();
        c();
        (gc.b = new fa()).removeAllElements();
        try {
            final ByteArrayInputStream in = new ByteArrayInputStream(fh.a("V6PKS"));
            final DataInputStream dataInputStream;
            final int int1 = (dataInputStream = new DataInputStream(in)).readInt();
            int n = 0;
            while (b(b(n, int1) ? 1 : 0)) {
                gc.b.addElement(dataInputStream.readUTF());
                ++n;
                "".length();
                "".length();
                if (e(gc.c[9] + gc.c[10] - gc.c[11] + gc.c[12] ^ gc.c[13] + gc.c[14] - gc.c[15] + gc.c[16], gc.c[17] ^ gc.c[18] ^ (gc.c[19] ^ gc.c[20]))) {
                    return;
                }
            }
            dataInputStream.close();
            in.close();
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static boolean d(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean e(final int n, final int n2) {
        return n != n2;
    }
}
