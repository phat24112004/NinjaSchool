import java.util.*;

public final class eq
{
    private static final int[] b;
    public static bw a;
    private static final int[] c;
    
    private static boolean a(final int n) {
        int n2;
        if (d(n)) {
            n2 = eq.c[0];
            "".length();
            if (((0x68 ^ 0x40) & ~(0xA4 ^ 0x8C)) > 0) {
                return ((0xA0 ^ 0xA9) & ~(0x16 ^ 0x1F)) != 0x0;
            }
        }
        else {
            n2 = eq.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean a(final int n, final int n2) {
        int n3;
        if (c(n, n2)) {
            n3 = eq.c[0];
            "".length();
            if ("   ".length() == ((0x5F ^ 0xD) & ~(0x58 ^ 0xA))) {
                return ((0x4 ^ 0xD) & ~(0x1C ^ 0x15)) != 0x0;
            }
        }
        else {
            n3 = eq.c[1];
        }
        return n3 != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = eq.c[0];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x12 ^ 0x17) & ~(0x32 ^ 0x37)) != 0x0;
            }
        }
        else {
            n3 = eq.c[1];
        }
        return n3 != 0;
    }
    
    public static ep a(final short value) {
        return (ep)eq.a.get(new Short(value));
    }
    
    private static boolean c(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    private static void a() {
        (c = new int[2])[0] = " ".length();
        eq.c[1] = ((79 + 186 - 156 + 78 ^ 12 + 36 + 98 + 11) & (0x7F ^ 0x3 ^ (0x27 ^ 0x7D) ^ -" ".length()));
    }
    
    private static boolean d(final int n, final int n2) {
        return n != n2;
    }
    
    static {
        a();
        b();
        eq.a = new bw();
    }
    
    public static short b(final short n) {
        return a(n).c;
    }
    
    private static boolean c(final int n) {
        int n2;
        if (b(n)) {
            n2 = eq.c[0];
            "".length();
            if (-" ".length() >= (0x33 ^ 0x37)) {
                return ((0x2D ^ 0xB) & ~(0xE1 ^ 0xC7)) != 0x0;
            }
        }
        else {
            n2 = eq.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean d(final int n) {
        return n == 0;
    }
    
    public static void a(final ep ep) {
        eq.a.put(new Short(ep.d), ep);
        "".length();
    }
    
    private static void b() {
        (b = new int[eq.c[0]])[eq.c[1]] = "  ".length();
    }
    
    public static ep a(final String anObject, final byte b) {
        final Enumeration<Object> elements = eq.a.elements();
        while (!b(a(elements.hasMoreElements() ? 1 : 0) ? 1 : 0)) {
            final ep ep;
            if (b(c((ep = elements.nextElement()).a.equals(anObject) ? 1 : 0) ? 1 : 0) && (!b(b(ep.e, 2) ? 1 : 0) || b(a(ep.e, b) ? 1 : 0))) {
                return ep;
            }
        }
        return null;
    }
}
