import javax.microedition.io.*;

public final class fb implements Runnable
{
    private final String b;
    private static final int[] c;
    private static final int[] d;
    final fm a;
    
    public final void run() {
        try {
            fm.a(this.a, new Thread(new dv(this)));
            fm.h(this.a).start();
            this.a.m = System.currentTimeMillis();
            this.a.p = true;
            this.a.n = true;
            this.a.a = (SocketConnection)Connector.open(dd.g());
            this.a.f = this.a.a.openDataOutputStream();
            this.a.l = this.a.a.openDataInputStream();
            fm.c(this.a, new Thread(fm.f(this.a)));
            fm.b(this.a, new Thread(fm.g(this.a)));
            fm.c(this.a).start();
            fm.a(this.a).start();
            fm.a(this.a, System.currentTimeMillis());
            fm.a(this.a, new eu((byte)(-27)));
            this.a.p = false;
            this.a.h.a();
        }
        catch (final Exception ex) {
            "".length();
            this.a.e();
            if (a(a(this.a.h) ? 1 : 0)) {
                this.a.h.c();
            }
        }
    }
    
    fb(final fm a) {
        super();
        this.a = a;
        this.b = "socket://160.30.112.16:14444";
    }
    
    private static void a() {
        (d = new int[20])[0] = ((0xE7 ^ 0xA1 ^ (0x85 ^ 0x8F)) & (166 + 169 - 98 + 6 ^ 41 + 30 + 79 + 41 ^ -" ".length()));
        fb.d[1] = " ".length();
        fb.d[2] = "  ".length();
        fb.d[3] = "   ".length();
        fb.d[4] = (0x5A ^ 0x52);
        fb.d[5] = (0x48 ^ 0x7);
        fb.d[6] = (0xF9 ^ 0xB4 ^ (0x46 ^ 0x7C));
        fb.d[7] = (85 + 99 - 152 + 118 ^ 162 + 28 - 84 + 83);
        fb.d[8] = (0x62 ^ 0x3A);
        fb.d[9] = (2 + 188 - 91 + 123 ^ 15 + 112 - 24 + 40);
        fb.d[10] = (167 + 62 - 217 + 165 ^ 71 + 185 - 122 + 59);
        fb.d[11] = (0x57 ^ 0x49 ^ (0x1F ^ 0x64));
        fb.d[12] = (0x45 ^ 0x0);
        fb.d[13] = (0xC0 ^ 0x88 ^ (0x81 ^ 0xBD));
        fb.d[14] = (0x3E ^ 0x76) + (0xBD ^ 0xC0) - (134 + 144 - 143 + 36) + (74 + 106 - 73 + 42);
        fb.d[15] = 12 + 33 + 6 + 81;
        fb.d[16] = 91 + 66 - 114 + 87;
        fb.d[17] = (0x6B ^ 0x47);
        fb.d[18] = (0x79 ^ 0x2F);
        fb.d[19] = (0x95 ^ 0xAF);
    }
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = fb.d[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x79 ^ 0x35) & ~(0x39 ^ 0x75)) != 0x0;
            }
        }
        else {
            n = fb.d[0];
        }
        return n != 0;
    }
    
    static {
        a();
        b();
    }
    
    private static void b() {
        (c = new int[fb.d[3]])[fb.d[0]] = " ".length();
        fb.c[fb.d[1]] = -(fb.d[4] ^ fb.d[5] ^ (fb.d[6] ^ fb.d[7]));
        fb.c[fb.d[2]] = ((fb.d[8] ^ fb.d[9] ^ (fb.d[10] ^ fb.d[11])) & (fb.d[12] + fb.d[13] - fb.d[14] + fb.d[15] ^ fb.d[16] + fb.d[17] - fb.d[18] + fb.d[19] ^ -" ".length()));
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static boolean b(final Object o) {
        return o != null;
    }
}
