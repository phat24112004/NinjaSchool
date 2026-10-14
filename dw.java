import java.util.*;

public final class dw implements Runnable
{
    private static final int[] a;
    private fm b;
    
    private static boolean a(final int n, final int n2) {
        return n < n2;
    }
    
    public final void run() {
        do {
            try {
                ff.b();
                this.b.e();
                Thread.sleep(1000L);
                while (autoh.isTimerActive && autoh.isSleeping) {
                    final Calendar instance = Calendar.getInstance();
                    if (instance.get(11) == autoh.hOn && instance.get(12) == autoh.mOn) {
                        autoh.isSleeping = false;
                        break;
                    }
                    Thread.sleep(1000L);
                }
                this.b.a(fm.g, fm.i);
                ed.b = fm.o;
                fl.u().b(dd.e, dd.c, "2.1.7");
                fm.a(1000L);
                fl.u().l(an.h);
                fm.a(1000L);
                "".length();
                "".length();
                if (a("  ".length(), (dw.a[2] ^ dw.a[3]) & (dw.a[4] ^ dw.a[5] ^ dw.a[6]))) {
                    return;
                }
            }
            catch (final InterruptedException ex) {
                final Throwable t;
                t.printStackTrace();
            }
        } while (a(b(fm.c ? 1 : 0) ? 1 : 0) && !a(b(ff.ae, ee.i) ? 1 : 0));
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    static {
        a();
    }
    
    private static void a() {
        (a = new int[7])[0] = " ".length();
        dw.a[1] = ((0x9D ^ 0xB6) & ~(0x48 ^ 0x63));
        dw.a[2] = (0xC0 ^ 0x82) + (135 + 170 - 184 + 108) - (219 + 23 - 4 + 11) + (186 + 84 - 187 + 124);
        dw.a[3] = (0xA ^ 0x1) + (0xE ^ 0x4A) - (0x59 ^ 0x1D) + (50 + 65 - 100 + 130);
        dw.a[4] = (0xE7 ^ 0xBF);
        dw.a[5] = (11 + 154 - 32 + 30 ^ 72 + 37 - 78 + 123);
        dw.a[6] = -" ".length();
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = dw.a[0];
            "".length();
            if ((0x6B ^ 0x6F) < -" ".length()) {
                return ((0xB ^ 0x0) & ~(0x2 ^ 0x9)) != 0x0;
            }
        }
        else {
            n = dw.a[1];
        }
        return n != 0;
    }
    
    dw(final fm b) {
        super();
        this.b = b;
    }
    
    private static boolean b(final int n) {
        int n2;
        if (a(n)) {
            n2 = dw.a[0];
            "".length();
            if (-(112 + 94 - 104 + 40 ^ 93 + 112 - 82 + 16) >= 0) {
                return ((0x27 ^ 0x3C ^ (0x53 ^ 0x1)) & (0x12 ^ 0x36 ^ (0x55 ^ 0x38) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dw.a[1];
        }
        return n2 != 0;
    }
}
