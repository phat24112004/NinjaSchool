import javax.microedition.io.*;
import java.io.*;

public final class fm implements ak
{
    public SocketConnection a;
    public int b;
    private long q;
    private boolean r;
    private static Object s;
    public static boolean c;
    public int d;
    public static fm e;
    private Thread t;
    private static final int[] u;
    private dx v;
    private Thread w;
    private Thread x;
    public DataOutputStream f;
    private dz y;
    public static String g;
    public aj h;
    private byte z;
    public static int i;
    public String j;
    private Thread aa;
    public byte[] k;
    private byte ab;
    public DataInputStream l;
    private static final int[] ac;
    public long m;
    public boolean n;
    public static byte o;
    public boolean p;
    
    private static boolean a(final int n, final int n2) {
        return n != n2;
    }
    
    static Thread a(final fm fm) {
        return fm.x;
    }
    
    static long b(final fm fm) {
        return fm.q;
    }
    
    private static boolean a(final int n) {
        int n2;
        if (c(n)) {
            n2 = fm.u[1];
            "".length();
            if ("  ".length() == " ".length()) {
                return ((0x1 ^ 0x35) & ~(0x5F ^ 0x6B)) != 0x0;
            }
        }
        else {
            n2 = fm.u[2];
        }
        return n2 != 0;
    }
    
    static byte a(fm fm, final byte b) {
        final byte[] k = (fm = fm).k;
        final byte z = fm.z;
        fm.z = (byte)(z + 1);
        final byte b2 = (byte)((k[z] & 0xFF) ^ (b & 0xFF));
        if (b(e(fm.z, fm.k.length) ? 1 : 0)) {
            fm.z %= (byte)fm.k.length;
        }
        return b2;
    }
    
    static Thread c(final fm fm) {
        return fm.aa;
    }
    
    public final void a() {
        this.r = false;
        this.n = false;
        this.p = false;
        this.k = null;
        this.z = 0;
        this.ab = 0;
        this.y.a();
        try {
            if (b(a(this.a) ? 1 : 0)) {
                this.a.close();
                this.a = null;
            }
            if (b(a(this.f) ? 1 : 0)) {
                this.f.close();
                this.f = null;
            }
            if (b(a(this.l) ? 1 : 0)) {
                this.l.close();
                this.l = null;
            }
            if (b(a(this.w) ? 1 : 0)) {
                if (b(d(this.w.isAlive() ? 1 : 0) ? 1 : 0)) {
                    this.w.interrupt();
                }
                this.w = null;
            }
            if (b(a(this.t) ? 1 : 0)) {
                if (b(d(this.t.isAlive() ? 1 : 0) ? 1 : 0)) {
                    this.t.interrupt();
                }
                this.t = null;
            }
            if (b(a(this.aa) ? 1 : 0)) {
                if (b(d(this.aa.isAlive() ? 1 : 0) ? 1 : 0)) {
                    this.aa.interrupt();
                }
                this.aa = null;
            }
            if (b(a(this.x) ? 1 : 0)) {
                if (b(d(this.x.isAlive() ? 1 : 0) ? 1 : 0)) {
                    this.x.interrupt();
                }
                this.x = null;
            }
            System.gc();
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    public static void b() {
        synchronized (fm.s) {
            fm.s.notifyAll();
        }
    }
    
    static void a(final fm fm, final Thread w) {
        fm.w = w;
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    private byte a(final byte b) {
        final byte[] k = this.k;
        final byte ab = this.ab;
        this.ab = (byte)(ab + 1);
        final byte b2 = (byte)((k[ab] & 0xFF) ^ (b & 0xFF));
        if (b(e(this.ab, this.k.length) ? 1 : 0)) {
            this.ab %= (byte)this.k.length;
        }
        return b2;
    }
    
    private static boolean b(final int n, final int n2) {
        return n >= n2;
    }
    
    public final void a(final String s, final int n) {
        final String string = new StringBuffer().append("socket://").append(s).append(":").append(n).toString();
        if (b(d(ff.d ? 1 : 0) ? 1 : 0)) {
            if (b(a(ff.y ? 1 : 0) ? 1 : 0)) {
                new StringBuffer().append(string).append(";interface=wifi");
                "".length();
                "".length();
                "".length();
                if (c((fm.u[3] ^ fm.u[4] ^ (fm.u[5] ^ fm.u[6])) & (fm.u[7] ^ fm.u[8] ^ (fm.u[9] ^ fm.u[10]) ^ -" ".length()), fm.u[11] ^ fm.u[12] ^ (fm.u[13] ^ fm.u[14]))) {
                    return;
                }
            }
            else {
                new StringBuffer().append(string).append(";deviceside=true");
                "".length();
            }
        }
        final PrintStream out = System.out;
        "".length();
        new StringBuffer("connect to ");
        if (b(a(this.n ? 1 : 0) ? 1 : 0) && b(a(this.p ? 1 : 0) ? 1 : 0)) {
            this.r = false;
            this.a = null;
            (this.t = new Thread(new fb(this))).start();
            fm.g = s;
            fm.i = n;
            fm.o = ed.b;
        }
    }
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = fm.u[1];
            "".length();
            if (" ".length() < 0) {
                return ((0xE ^ 0x1D ^ ((0x1C ^ 0x8) & ~(0x38 ^ 0x2C))) & (108 + 116 - 113 + 16 ^ (0x2C ^ 0x40) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = fm.u[2];
        }
        return n != 0;
    }
    
    private static void f() {
        (u = new int[60])[0] = (0xB7 ^ 0xC4 ^ (0x4A ^ 0x3D));
        fm.u[1] = " ".length();
        fm.u[2] = ((69 + 136 - 107 + 60 ^ 36 + 24 + 116 + 12) & (0x3F ^ 0x2 ^ (0x55 ^ 0x4A) ^ -" ".length()));
        fm.u[3] = (106 + 67 - 56 + 19 ^ 2 + 134 - 18 + 77);
        fm.u[4] = (15 + 77 + 104 + 14 ^ 107 + 120 - 163 + 131);
        fm.u[5] = " ".length() + (0x8 ^ 0x13) - -(163 + 168 - 325 + 163) + (0x84 ^ 0x9D);
        fm.u[6] = (0x5B ^ 0x30) + (0x57 ^ 0x46) - (0x55 ^ 0xA) + (0xDA ^ 0xB9);
        fm.u[7] = (88 + 133 - 126 + 53 ^ 10 + 96 - 92 + 126);
        fm.u[8] = (0x8F ^ 0xA8);
        fm.u[9] = (0x5 ^ 0x71) + (0x42 ^ 0x8) - (24 + 110 - 97 + 116) + (143 + 173 - 233 + 132);
        fm.u[10] = 22 + 78 - 72 + 127 + (0xC5 ^ 0x89) - (0xC7 ^ 0x86) + (0x5D ^ 0x7C);
        fm.u[11] = (0x4E ^ 0x24 ^ (0x72 ^ 0x2B));
        fm.u[12] = (0x15 ^ 0x7D);
        fm.u[13] = (0x26 ^ 0x3A);
        fm.u[14] = (0x11 ^ 0x52);
        fm.u[15] = (0x3D ^ 0x21 ^ (0x93 ^ 0x8A));
        fm.u[16] = 163 + 154 - 175 + 42;
        fm.u[17] = (150 + 33 - 182 + 189 ^ 145 + 26 - 69 + 83);
        fm.u[18] = (40 + 26 + 14 + 68 ^ 90 + 29 - 7 + 85);
        fm.u[19] = (0x74 ^ 0x12);
        fm.u[20] = (80 + 85 - 137 + 118 ^ 100 + 13 - 108 + 179);
        fm.u[21] = (0x10 ^ 0x16);
        fm.u[22] = -(0x6C ^ 0x57 ^ (0xDC ^ 0xB3));
        fm.u[23] = "  ".length();
        fm.u[24] = 111 + 107 - 116 + 41 + (93 + 61 - 89 + 73) - (127 + 57 - 171 + 118) + (0x78 ^ 0x6D);
        fm.u[25] = 31 + 12 - 30 + 133;
        fm.u[26] = 106 + 174 - 232 + 177;
        fm.u[27] = (0x6F ^ 0xA) + (0xCF ^ 0xA9) - (0x20 ^ 0x50) + (0x71 ^ 0x5E);
        fm.u[28] = "   ".length();
        fm.u[29] = (0x62 ^ 0x27);
        fm.u[30] = (0x5E ^ 0x5);
        fm.u[31] = (0x1A ^ 0x67 ^ (0x10 ^ 0x79));
        fm.u[32] = (0x5D ^ 0x44);
        fm.u[33] = -(74 + 79 - 39 + 23);
        fm.u[34] = (179 + 90 - 111 + 22 ^ 131 + 178 - 143 + 19);
        fm.u[35] = (133 + 36 - 110 + 138 ^ 122 + 59 - 113 + 100);
        fm.u[36] = (0xF8 ^ 0xB6 ^ (0x61 ^ 0x57));
        fm.u[37] = 29 + 76 - 73 + 144;
        fm.u[38] = (0x5B ^ 0x54) + (0x77 ^ 0x4B) - -(0x98 ^ 0xB7) + (0xBE ^ 0xB5);
        fm.u[39] = (0xD5 ^ 0x87) + (0xBB ^ 0xB3) - (0x9C ^ 0x9B) + (0x6D ^ 0x7);
        fm.u[40] = 20 + 4 + 43 + 64;
        fm.u[41] = 175 + 21 - 111 + 102;
        fm.u[42] = -" ".length();
        fm.u[43] = 150 + 1 - 122 + 140 + (0x3B ^ 0x46) - (0xFFFFEDFF & 0x1305) + (21 + 22 + 135 + 1);
        fm.u[44] = (0x25 ^ 0x7F);
        fm.u[45] = (0x55 ^ 0x2E);
        fm.u[46] = (75 + 96 - 141 + 162 ^ 84 + 114 - 106 + 67);
        fm.u[47] = (0x1E ^ 0x48) + (0x16 ^ 0x28) - (0xF0 ^ 0xC7) + (0x1D ^ 0x27);
        fm.u[48] = (0x22 ^ 0x6A);
        fm.u[49] = (0x79 ^ 0x65 ^ (0x3F ^ 0x6D));
        fm.u[50] = (0x8F ^ 0x9B ^ (0x1B ^ 0x29));
        fm.u[51] = (0x1F ^ 0x6E ^ (0x60 ^ 0x4C));
        fm.u[52] = (0x31 ^ 0x51 ^ (0xA4 ^ 0x82));
        fm.u[53] = (0xCC ^ 0x99 ^ (0x38 ^ 0x19));
        fm.u[54] = (0xF5 ^ 0xAD);
        fm.u[55] = (0x10 ^ 0x7F);
        fm.u[56] = (0x6F ^ 0x8);
        fm.u[57] = (0x82 ^ 0xBA);
        fm.u[58] = (0x69 ^ 0x2B);
        fm.u[59] = 60 + 91 - 126 + 137;
    }
    
    static void d(final fm fm) {
        fm.r = true;
    }
    
    private static boolean c(final int n, final int n2) {
        return n > n2;
    }
    
    public fm() {
        super();
        this.y = new dz(this);
        this.v = new dx(this);
        this.k = null;
        this.j = "";
    }
    
    static boolean e(final fm fm) {
        return fm.r;
    }
    
    private static boolean c(final int n) {
        return n == 0;
    }
    
    private static boolean b(final Object o) {
        return o != null;
    }
    
    public final void c() {
        if (b(a(ff.ae, ff.p) ? 1 : 0)) {
            ff.ah.o();
        }
        if (b(d(fm.c ? 1 : 0) ? 1 : 0)) {
            b();
            return;
        }
        fm.c = true;
        new Thread(new dw(this)).start();
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = fm.u[1];
            "".length();
            if (((118 + 35 - 26 + 31 ^ 16 + 125 - 20 + 47) & (157 + 173 - 274 + 122 ^ 50 + 5 + 71 + 6 ^ -" ".length())) < 0) {
                return ((0x7C ^ 0x64 ^ (0x95 ^ 0xB5)) & (87 + 89 - 40 + 44 ^ 86 + 99 - 135 + 90 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fm.u[2];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = fm.u[1];
            "".length();
            if (-" ".length() == (0xC3 ^ 0xC7)) {
                return ((0x6C ^ 0x27) & ~(0x54 ^ 0x1F)) != 0x0;
            }
        }
        else {
            n3 = fm.u[2];
        }
        return n3 != 0;
    }
    
    private static boolean a(final Object o, final Object o2) {
        int n;
        if (b(o, o2)) {
            n = fm.u[1];
            "".length();
            if (null != null) {
                return ((0x2A ^ 0x75) & ~(0x22 ^ 0x7D)) != 0x0;
            }
        }
        else {
            n = fm.u[2];
        }
        return n != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (g(n, n2)) {
            n3 = fm.u[1];
            "".length();
            if ((0x71 ^ 0x75) == "  ".length()) {
                return ((0x58 ^ 0x15) & ~(0x30 ^ 0x7D)) != 0x0;
            }
        }
        else {
            n3 = fm.u[2];
        }
        return n3 != 0;
    }
    
    static {
        f();
        g();
        fm.e = new fm();
        fm.s = new Object();
    }
    
    public final void a(final eu eu) {
        this.y.a(eu);
    }
    
    static void a(final long timeoutMillis) {
        synchronized (fm.s) {
            try {
                fm.s.wait(timeoutMillis);
                "".length();
                "".length();
                if (b((Object)null)) {
                    return;
                }
            }
            catch (final Exception ex) {
                "".length();
            }
        }
    }
    
    private static boolean b(final Object o, final Object o2) {
        return o != o2;
    }
    
    static dz f(final fm fm) {
        return fm.y;
    }
    
    public static fm d() {
        return fm.e;
    }
    
    private synchronized void b(final eu eu) {
        final byte[] d = eu.d();
        try {
            if (b(d(this.r ? 1 : 0) ? 1 : 0)) {
                this.f.writeByte(this.a(eu.a));
                "".length();
                "".length();
                if (b((fm.u[16] + fm.u[17] - fm.u[18] + fm.u[19] ^ fm.u[20] + fm.u[21] - fm.u[22] + fm.u[23]) & (fm.u[24] ^ fm.u[25] ^ (fm.u[26] ^ fm.u[27]) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                this.f.writeByte(eu.a);
            }
            if (b(a(d) ? 1 : 0)) {
                final int length = d.length;
                if (b(d(eu.a, -31) ? 1 : 0) && b(d(this.r ? 1 : 0) ? 1 : 0)) {
                    this.f.writeByte(this.a((byte)(length >> 8)));
                    this.f.writeByte(this.a((byte)length));
                    "".length();
                    "".length();
                    if (b((Object)null)) {
                        return;
                    }
                }
                else {
                    this.f.writeShort(length);
                }
                if (b(d(this.r ? 1 : 0) ? 1 : 0)) {
                    int n = 0;
                    while (b(f(n, d.length) ? 1 : 0)) {
                        d[n] = this.a(d[n]);
                        ++n;
                        "".length();
                        "".length();
                        if (b((Object)null)) {
                            return;
                        }
                    }
                }
                this.f.write(d);
                this.d += 5 + d.length;
                "".length();
                "".length();
                if (b((fm.u[29] ^ fm.u[13] ^ (fm.u[30] ^ fm.u[31])) & (fm.u[1] + fm.u[32] - fm.u[33] + fm.u[1] ^ fm.u[34] + fm.u[35] - fm.u[36] + fm.u[37] ^ -" ".length()))) {
                    return;
                }
            }
            else {
                this.f.writeShort(0);
                this.d += 5;
            }
            this.f.flush();
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    static dx g(final fm fm) {
        return fm.v;
    }
    
    static Thread h(final fm fm) {
        return fm.w;
    }
    
    static Thread i(final fm fm) {
        return fm.t;
    }
    
    private static void g() {
        (ac = new int[fm.u[21]])[fm.u[2]] = ((fm.u[38] ^ fm.u[39]) & (fm.u[40] ^ fm.u[41] ^ fm.u[42]));
        fm.ac[fm.u[1]] = -(fm.u[43] ^ fm.u[38] ^ (fm.u[31] ^ fm.u[44]));
        fm.ac[fm.u[23]] = (fm.u[45] + fm.u[46] - fm.u[47] + fm.u[48] ^ fm.u[49] + fm.u[50] - fm.u[49] + fm.u[51]);
        fm.ac[fm.u[28]] = (fm.u[52] ^ fm.u[53] ^ (fm.u[54] ^ fm.u[55]));
        fm.ac[fm.u[0]] = " ".length();
        fm.ac[fm.u[15]] = fm.u[56] + fm.u[57] - fm.u[58] + fm.u[59];
    }
    
    static void b(final fm fm, final Thread x) {
        fm.x = x;
    }
    
    private static boolean g(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (b(n)) {
            n2 = fm.u[1];
            "".length();
            if (((0x68 ^ 0x61) & ~(0xAE ^ 0xA7)) != 0x0) {
                return ((0x80 ^ 0x9A) & ~(0x95 ^ 0x8F)) != 0x0;
            }
        }
        else {
            n2 = fm.u[2];
        }
        return n2 != 0;
    }
    
    static void c(final fm fm, final Thread aa) {
        fm.aa = aa;
    }
    
    static void a(final fm fm, final long q) {
        fm.q = q;
    }
    
    static void a(final fm fm, final eu eu) {
        fm.b(eu);
    }
    
    public final void e() {
        final cv i = cv.i;
        "".length();
        cv.g();
        this.a();
    }
}
