import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.io.*;
import javax.microedition.io.*;

public class ed extends MIDlet
{
    private static final int[] l;
    public static int[] a;
    public static byte b;
    public static ed c;
    public static String d;
    public static int[] e;
    public static int f;
    private static final int[] m;
    public static byte g;
    public static String[] h;
    public static byte i;
    public static byte[] j;
    public static String k;
    
    protected void startApp() {
    }
    
    protected void pauseApp() {
    }
    
    protected void destroyApp(final boolean b) {
    }
    
    private static void c() {
        (m = new int[23])[0] = " ".length();
        ed.m[1] = ((0xF7 ^ 0xB6) & ~(0x24 ^ 0x65));
        ed.m[2] = "  ".length();
        ed.m[3] = "   ".length();
        ed.m[4] = (0x3F ^ 0x72 ^ (0xC7 ^ 0x8E));
        ed.m[5] = (0x54 ^ 0xC ^ (0xF7 ^ 0xAA));
        ed.m[6] = (0x31 ^ 0x37 ^ ((0x92 ^ 0xBB) & ~(0xB1 ^ 0x98)));
        ed.m[7] = (0xD0 ^ 0xA2 ^ (0xD0 ^ 0xA5));
        ed.m[8] = (0x9E ^ 0xC4 ^ (0x92 ^ 0xC0));
        ed.m[9] = (0x84 ^ 0xAA);
        ed.m[10] = (0x62 ^ 0x6D ^ (0x5C ^ 0x7A));
        ed.m[11] = (0x4B ^ 0x15);
        ed.m[12] = (0x2A ^ 0x59) + (131 + 159 - 141 + 34) - (0xD ^ 0x63) + (0xB4 ^ 0xB9);
        ed.m[13] = 121 + 96 - 134 + 64;
        ed.m[14] = -" ".length();
        ed.m[15] = 51 + 50 - 36 + 67;
        ed.m[16] = 9 + 8 + 72 + 39;
        ed.m[17] = (0xF9 ^ 0xC3 ^ (0x32 ^ 0x1C));
        ed.m[18] = (0x57 ^ 0x46);
        ed.m[19] = (0x5 ^ 0x79);
        ed.m[20] = (0xA4 ^ 0xBF ^ (0x3C ^ 0x6B));
        ed.m[21] = (0xE7 ^ 0x96);
        ed.m[22] = (0x34 ^ 0x73);
    }
    
    private static void d() {
        (l = new int[ed.m[8]])[ed.m[1]] = (ed.m[9] ^ ed.m[10]);
        ed.l[ed.m[0]] = ((ed.m[11] ^ ed.m[4]) & (ed.m[12] ^ ed.m[13] ^ ed.m[14]));
        ed.l[ed.m[2]] = " ".length();
        ed.l[ed.m[3]] = "  ".length();
        ed.l[ed.m[4]] = "   ".length();
        ed.l[ed.m[5]] = (ed.m[15] ^ ed.m[16]);
        ed.l[ed.m[6]] = (ed.m[17] ^ ed.m[18]);
        ed.l[ed.m[7]] = (ed.m[19] ^ ed.m[20] ^ (ed.m[21] ^ ed.m[22]));
    }
    
    public static void a() {
        ed.h = null;
        ed.a = null;
        ed.j = null;
        ed.e = null;
        ed.g = 0;
        ed.f = 0;
        ed.d = null;
        ed.i = 0;
        ed.k = null;
        ed.c = null;
        ed.b = 0;
    }
    
    private static boolean a(final int n) {
        return n == 0;
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    private static boolean c(final int n) {
        return n < 0;
    }
    
    public ed() {
        super();
        fm.d().h = cx.d();
        ed.c = this;
        ed.k = b("agent.txt");
        ed.i = Byte.parseByte(b("provider.txt"));
        System.out.println(new StringBuffer().append("AGENT: ").append(ed.k).append(", PROVIDER: ").append(ed.i).toString());
        eb.a = 0;
        ff.ae = new eb();
        ey.c().c = ff.q();
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)ey.c());
        final ey c = ey.c();
        if (b(d(ey.b ? 1 : 0) ? 1 : 0)) {
            new Thread(c).start();
        }
    }
    
    public static String b(String str) {
        final InputStream d = fh.d(new StringBuffer("/").append(str).toString());
        try {
            final byte[] array = new byte[d.available()];
            d.read(array);
            "".length();
            str = new String(array, "UTF-8");
            "".length();
            "".length();
            if (c(" ".length())) {
                return null;
            }
        }
        catch (final Exception ex) {
            "".length();
            str = "";
        }
        return str;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (a(n)) {
            n2 = ed.m[0];
            "".length();
            if ((0x8A ^ 0x8E) == 0x0) {
                return ((0xD4 ^ 0x8A) & ~(0xC9 ^ 0x97)) != 0x0;
            }
        }
        else {
            n2 = ed.m[1];
        }
        return n2 != 0;
    }
    
    static {
        c();
        d();
        b();
    }
    
    public static void a(final String s) {
        if (b(d(s.equals("") ? 1 : 0) ? 1 : 0)) {
            try {
                ed.c.platformRequest(s);
                "".length();
                ed.c.notifyDestroyed();
            }
            catch (final ConnectionNotFoundException ex) {
                final ConnectionNotFoundException ex2;
                ex2.printStackTrace();
            }
        }
    }
    
    public static void b() {
        ed.h = new String[] { ds.b, ds.b, ds.b, ds.b, ds.b, ds.b, ds.b };
        ed.a = new int[] { ds.a, ds.a, ds.a, ds.a, ds.a, ds.a, ds.a };
        ed.j = new byte[] { 0, 0, 0, 1, 0, 0, 0 };
        ed.e = new int[] { 0, 1, 2, 3, 4, 5, 0 };
        ed.g = 1;
        ed.f = ds.a;
        ed.d = "";
        ed.i = 0;
        ed.b = 0;
    }
}
