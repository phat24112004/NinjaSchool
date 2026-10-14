import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public final class f extends Form implements CommandListener
{
    private static final int[] a;
    private TextField b;
    private static final int[] c;
    private Command d;
    private TextField e;
    private static f f;
    private TextField g;
    
    public final void a() {
        final long n = cv.p / 60000L;
        this.e.setString(String.valueOf(n % 60L));
        final long n2 = n / 60L;
        this.g.setString(String.valueOf(n2 % 60L));
        this.b.setString(String.valueOf(n2 / 60L));
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this);
    }
    
    private static void c() {
        (a = new int[f.c[7]])[f.c[3]] = "   ".length();
        f.a[f.c[4]] = "  ".length();
        f.a[f.c[5]] = (f.c[8] ^ f.c[9]);
        f.a[f.c[0]] = ((f.c[10] ^ f.c[11]) & (f.c[12] ^ f.c[13] ^ f.c[14]));
        f.a[f.c[6]] = (f.c[15] ^ f.c[16] ^ (f.c[17] ^ f.c[18]));
        f.a[f.c[1]] = (f.c[19] + f.c[20] - f.c[21] + f.c[22] ^ f.c[23] + f.c[24] - f.c[25] + f.c[26]);
        f.a[f.c[2]] = " ".length();
    }
    
    public static f b() {
        if (a(b(f.f) ? 1 : 0)) {
            f.f = new f();
        }
        return f.f;
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = f.c[4];
            "".length();
            if ((16 + 142 - 88 + 77 ^ 133 + 48 - 120 + 90) == 0x0) {
                return ((0xCF ^ 0x98 ^ (0x43 ^ 0x77)) & (0xF ^ 0x7E ^ (0x1A ^ 0x8) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = f.c[3];
        }
        return n != 0;
    }
    
    public f() {
        super("C\u00e0i up time - C\u00e0i all 0 \u0111\u1ec3 up full time");
        this.append((Item)(this.b = new TextField("Ng\u00e0y up", "", 3, 2)));
        "".length();
        this.append((Item)(this.g = new TextField("Gi\u1edd up", "", 3, 2)));
        "".length();
        this.append((Item)(this.e = new TextField("Ph\u00fat up", "", 3, 2)));
        "".length();
        this.addCommand(this.d = new Command("L\u01b0u", 4, 0));
        this.addCommand(new Command("Tho\u00e1t", 7, 0));
        this.setCommandListener((CommandListener)this);
    }
    
    static {
        d();
        c();
    }
    
    public final void commandAction(Command int1, Displayable int2) {
        if (a(b(command, this.d) ? 1 : 0)) {
            int1 = (Command)0;
            int2 = (Displayable)0;
            int int3 = 0;
            try {
                int1 = (Command)Integer.parseInt(this.b.getString());
                int2 = (Displayable)Integer.parseInt(this.g.getString());
                int3 = Integer.parseInt(this.e.getString());
                "".length();
                "".length();
                if (a(" ".length(), " ".length())) {
                    return;
                }
            }
            catch (final Exception ex) {
                "".length();
            }
            cv.p = ((long)(int1 * 24 + int2) * 60L + int3) * 60L * 1000L;
        }
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)ey.a);
        ey.a.setFullScreenMode(true);
    }
    
    private static boolean a(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = f.c[4];
            "".length();
            if ((0x8 ^ 0x72 ^ (0x1C ^ 0x62)) <= -" ".length()) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = f.c[3];
        }
        return n != 0;
    }
    
    private static void d() {
        (c = new int[27])[0] = "   ".length();
        f.c[1] = (61 + 102 - 135 + 140 ^ 72 + 71 - 101 + 131);
        f.c[2] = (0x50 ^ 0x70 ^ (0xE6 ^ 0xC0));
        f.c[3] = ((0x6A ^ 0x29) & ~(0x4B ^ 0x8));
        f.c[4] = " ".length();
        f.c[5] = "  ".length();
        f.c[6] = (0xAA ^ 0xAE);
        f.c[7] = (0x40 ^ 0x68 ^ (0xBE ^ 0x91));
        f.c[8] = (0x33 ^ 0x10 ^ (0x37 ^ 0xD));
        f.c[9] = (0xA9 ^ 0xB4);
        f.c[10] = (0xA5 ^ 0x82 ^ (0xC1 ^ 0x88));
        f.c[11] = (0x2E ^ 0x5D);
        f.c[12] = (0x51 ^ 0xD);
        f.c[13] = (0xE9 ^ 0xA8);
        f.c[14] = -" ".length();
        f.c[15] = (0x39 ^ 0x72) + (0x63 ^ 0x67) - (0x9A ^ 0x8B) + (0xFA ^ 0xA4);
        f.c[16] = (0x62 ^ 0x2E) + (0x56 ^ 0x4C) - -(0x5F ^ 0x7E) + (0x18 ^ 0x1C);
        f.c[17] = (0xB5 ^ 0x88);
        f.c[18] = (102 + 91 - 98 + 33 ^ 172 + 33 - 41 + 9);
        f.c[19] = (0x3 ^ 0x2E ^ (0x44 ^ 0x61));
        f.c[20] = 41 + 100 - 67 + 55;
        f.c[21] = (123 + 28 - 23 + 86 ^ 58 + 122 - 163 + 171);
        f.c[22] = (0x3C ^ 0x1E) + (0xDA ^ 0xB5) - (0x4 ^ 0x77) + (0x22 ^ 0x46);
        f.c[23] = (0x7F ^ 0x43) + (0x6C ^ 0xB) - (0xF6 ^ 0x8D) + (40 + 24 - 21 + 98);
        f.c[24] = (0x3 ^ 0x3A);
        f.c[25] = (0x60 ^ 0x33 ^ "  ".length());
        f.c[26] = (0x9E ^ 0x82);
    }
}
