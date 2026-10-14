import java.util.*;

public final class dy implements Runnable
{
    public static int a;
    public static Random b;
    private static final int[] e;
    private static final int[] f;
    public static long c;
    public static boolean d;
    private int g;
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static boolean a(final int n, final int n2) {
        int n3;
        if (c(n, n2)) {
            n3 = dy.e[0];
            "".length();
            if ((0x27 ^ 0x23) < 0) {
                return ((0xBE ^ 0x8C) & ~(0x6E ^ 0x5C)) != 0x0;
            }
        }
        else {
            n3 = dy.e[1];
        }
        return n3 != 0;
    }
    
    static {
        b();
        a();
        dy.b = new Random();
        dy.c = 10L;
    }
    
    private static boolean b(final int n) {
        return n <= 0;
    }
    
    public final void run() {
        if (a(a(fr.s, 72) ? 1 : 0)) {
            ee.b("H\u00e3y v\u1ec1 okaza !");
            return;
        }
        int n = 0;
        ee.a(30, 0, 0);
        do {
            ++n;
            fl.u().y();
            ff.f();
            try {
                Thread.sleep(dy.c);
                "".length();
                "".length();
                if (b(dy.e[3] ^ dy.e[4])) {
                    return;
                }
                continue;
            }
            catch (final InterruptedException ex) {
                final Throwable t;
                t.printStackTrace();
            }
        } while (!a(d(n, this.g) ? 1 : 0));
    }
    
    private static void a() {
        (f = new int[dy.e[5]])[dy.e[1]] = (dy.e[6] ^ dy.e[7]);
        dy.f[dy.e[0]] = ("  ".length() & ("  ".length() ^ -" ".length()));
        dy.f[dy.e[2]] = (dy.e[8] ^ dy.e[9]);
    }
    
    private static boolean b(final int n, final int n2) {
        return n > n2;
    }
    
    private static void b() {
        (e = new int[10])[0] = " ".length();
        dy.e[1] = ((0xD6 ^ 0xC7 ^ (0x4B ^ 0x4E)) & (116 + 28 - 117 + 146 ^ 20 + 153 - 52 + 64 ^ -" ".length()));
        dy.e[2] = "  ".length();
        dy.e[3] = (0x9D ^ 0xC1);
        dy.e[4] = (0x11 ^ 0x52 ^ (0x2F ^ 0x34));
        dy.e[5] = "   ".length();
        dy.e[6] = (0x7F ^ 0x1A ^ (0x42 ^ 0x61));
        dy.e[7] = (0x92 ^ 0x9C);
        dy.e[8] = (0x27 ^ 0x20);
        dy.e[9] = (0x6A ^ 0x73);
    }
    
    private static boolean c(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = dy.e[0];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x36 ^ 0x1E) & ~(0x6D ^ 0x45)) != 0x0;
            }
        }
        else {
            n3 = dy.e[1];
        }
        return n3 != 0;
    }
    
    dy(final int g) {
        super();
        this.g = g;
    }
}
