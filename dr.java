import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public final class dr implements CommandListener
{
    public static String a;
    private TextField f;
    private TextField g;
    private final Form h;
    private final ChoiceGroup i;
    public static byte b;
    private TextField j;
    public static String c;
    private Command k;
    private TextField l;
    private static final int[] m;
    public static byte d;
    private TextField n;
    private final ChoiceGroup o;
    private TextField p;
    private ChoiceGroup q;
    private TextField r;
    private static final int[] s;
    public static byte e;
    
    private static boolean a(final int n) {
        return n > 0;
    }
    
    private static boolean a(final int n, final int n2) {
        return n == n2;
    }
    
    static {
        b();
        c();
        dr.e = 0;
        dr.b = 0;
        dr.d = 0;
        dr.a = "454,455,456,457";
        dr.c = "454,455,456,457";
    }
    
    private static boolean b(final int n) {
        return n <= 0;
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static void b() {
        (m = new int[50])[0] = " ".length();
        dr.m[1] = ((0x99 ^ 0xC5) & ~(0x18 ^ 0x44));
        dr.m[2] = (0x36 ^ 0x31);
        dr.m[3] = (0xD1 ^ 0x82 ^ (0xCD ^ 0x96));
        dr.m[4] = (0x3D ^ 0x7D);
        dr.m[5] = (0x24 ^ 0x12 ^ (0x1D ^ 0x3A));
        dr.m[6] = (0xCF ^ 0x8C ^ (0x53 ^ 0x1D));
        dr.m[7] = (194 + 198 - 251 + 59 ^ 108 + 99 - 91 + 53);
        dr.m[8] = (0x27 ^ 0x2);
        dr.m[9] = (0xCD ^ 0x90);
        dr.m[10] = (0x37 ^ 0x1D ^ (0x62 ^ 0x2A));
        dr.m[11] = (0x30 ^ 0x26);
        dr.m[12] = (44 + 59 + 38 + 83 ^ 94 + 99 - 171 + 120);
        dr.m[13] = (0x95 ^ 0x9F);
        dr.m[14] = (77 + 90 - 81 + 135 ^ 139 + 12 - 34 + 43);
        dr.m[15] = "  ".length();
        dr.m[16] = (0xFE ^ 0xC4);
        dr.m[17] = (0x79 ^ 0x16 ^ (0x47 ^ 0x76));
        dr.m[18] = "   ".length();
        dr.m[19] = (0x1D ^ 0x19);
        dr.m[20] = -(0xFFFFAEEB & 0x5BBE);
        dr.m[21] = (-(0x6 ^ 0x43) & (0xFFFFBEFF & 0x7FFF));
        dr.m[22] = -(0xFFFFFBFF & 0x4C05);
        dr.m[23] = (0xFFFFFFFD & 0x7FFF);
        dr.m[24] = (0x28 ^ 0x2D);
        dr.m[25] = (0x14 ^ 0xA ^ (0x67 ^ 0x4D));
        dr.m[26] = (0x35 ^ 0x30 ^ (0x8B ^ 0xBE));
        dr.m[27] = (0x12 ^ 0x14);
        dr.m[28] = (173 + 129 - 184 + 92 ^ 81 + 0 - 24 + 101);
        dr.m[29] = (0x57 ^ 0x1F);
        dr.m[30] = (38 + 90 - 56 + 108 ^ 45 + 91 - 58 + 90);
        dr.m[31] = (0x24 ^ 0x33 ^ (0x99 ^ 0x96));
        dr.m[32] = (0x73 ^ 0x4F);
        dr.m[33] = (0x23 ^ 0x59);
        dr.m[34] = 230 + 196 - 392 + 215;
        dr.m[35] = 119 + 4 - 5 + 56 + (0xA5 ^ 0xB7) - (56 + 58 - 13 + 84) + (86 + 150 - 100 + 48);
        dr.m[36] = -" ".length();
        dr.m[37] = (0x78 ^ 0x60 ^ (0x93 ^ 0xAF));
        dr.m[38] = (0x46 ^ 0x54);
        dr.m[39] = 122 + 109 - 128 + 48 + (0xB1 ^ 0x9C) - (0xC6 ^ 0x92) + (0xD9 ^ 0x8A);
        dr.m[40] = (0x52 ^ 0x28 ^ (0x22 ^ 0x33));
        dr.m[41] = (0x3E ^ 0x52);
        dr.m[42] = 76 + 54 + 25 + 27;
        dr.m[43] = 97 + 77 - 40 + 49;
        dr.m[44] = (102 + 55 + 5 + 9 ^ 104 + 56 - 98 + 86);
        dr.m[45] = (0xAB ^ 0xA2);
        dr.m[46] = (0x52 ^ 0x6B ^ (0x7E ^ 0x67));
        dr.m[47] = 65 + 21 + 56 + 11;
        dr.m[48] = (0x6B ^ 0xC ^ (0xE ^ 0x46));
        dr.m[49] = (0x86 ^ 0xB4);
    }
    
    private static boolean c(final int n) {
        int n2;
        if (e(n)) {
            n2 = dr.m[0];
            "".length();
            if (" ".length() >= (0xAE ^ 0x97 ^ (0x69 ^ 0x54))) {
                return ((126 + 137 - 245 + 157 ^ 21 + 81 - 21 + 65) & (35 + 187 - 220 + 188 ^ 8 + 60 + 52 + 11 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dr.m[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean c(final int n, final int n2) {
        return n <= n2;
    }
    
    public final void a() {
        this.h.append((Item)this.q);
        "".length();
        this.h.append((Item)this.o);
        "".length();
        this.h.append((Item)this.n);
        "".length();
        this.h.append((Item)this.f);
        "".length();
        this.h.append((Item)this.p);
        "".length();
        this.h.append((Item)this.r);
        "".length();
        this.h.append((Item)this.g);
        "".length();
        this.h.append((Item)this.l);
        "".length();
        this.h.append((Item)this.i);
        "".length();
        this.h.append((Item)this.j);
        "".length();
        this.h.addCommand(this.k);
        this.h.addCommand(new Command("Tho\u00e1t", 7, 0));
        this.i.setSelectedIndex((int)dr.e, true);
        this.o.setSelectedIndex((int)dr.d, true);
        this.q.setSelectedIndex((int)dr.b, true);
        this.h.setCommandListener((CommandListener)this);
        a((Displayable)this.h);
    }
    
    private static boolean d(final int n) {
        return n < 0;
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = dr.m[0];
            "".length();
            if (" ".length() < 0) {
                return ((4 + 76 - 27 + 95 ^ 103 + 37 - 17 + 13) & (0xD5 ^ 0xC5 ^ (0x27 ^ 0x2B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = dr.m[1];
        }
        return n != 0;
    }
    
    private static void c() {
        (s = new int[dr.m[3]])[dr.m[1]] = " ".length();
        dr.s[dr.m[0]] = ((dr.m[4] + dr.m[5] - dr.m[6] + dr.m[4] ^ dr.m[7] + dr.m[8] - dr.m[9] + dr.m[10]) & (dr.m[11] ^ dr.m[12] ^ (dr.m[13] ^ dr.m[14]) ^ -" ".length()));
        dr.s[dr.m[15]] = (dr.m[16] ^ dr.m[17]);
        dr.s[dr.m[18]] = "  ".length();
        dr.s[dr.m[19]] = (-(dr.m[20] & dr.m[21]) & (dr.m[22] & dr.m[23]));
        dr.s[dr.m[24]] = (dr.m[25] ^ dr.m[26]);
        dr.s[dr.m[27]] = "   ".length();
        dr.s[dr.m[2]] = ("   ".length() ^ (dr.m[28] ^ dr.m[29]));
    }
    
    public dr() {
        super();
        this.h = new Form("Setting Gom \u0110\u1ed3!");
        int n;
        if (e(b(dl.y) ? 1 : 0)) {
            n = 1;
            "".length();
            "".length();
            if (d("  ".length())) {
                throw null;
            }
        }
        else {
            n = 0;
        }
        final int n2 = n;
        final String s = "Name nh\u1eadn \u0111\u1ed3";
        String y;
        if (e(c(n2) ? 1 : 0)) {
            y = "";
            "".length();
            "".length();
            if (a(-"   ".length())) {
                throw null;
            }
        }
        else {
            y = dl.y;
        }
        this.n = new TextField(s, y, 100, 0);
        final String s2 = "Gi\u1edd nh\u1eadn \u0111\u1ed3";
        String value;
        if (e(c(n2) ? 1 : 0)) {
            value = "";
            "".length();
            "".length();
            if (b(-" ".length(), dr.m[30] ^ dr.m[31])) {
                throw null;
            }
        }
        else {
            value = String.valueOf(dl.z);
        }
        this.p = new TextField(s2, value, 2, 2);
        this.f = new TextField("Item GD <M\u1ed7i ID c\u00e1ch nhau b\u1eb1ng d\u1ea5u ph\u1ea3y > Nh\u1eadp id item", dr.a, 1000, 0);
        this.j = new TextField("Item C\u1ea5t <M\u1ed7i ID c\u00e1ch nhau b\u1eb1ng d\u1ea5u ph\u1ea3y > Nh\u1eadp id item", dr.c, 1000, 0);
        this.i = new ChoiceGroup("Auto C\u1ea5t \u0111\u1ed3 v\u00e0o r\u01b0\u01a1ng khi up !", 1, new String[] { "B\u1eadt", "T\u1eaft" }, new Image[2]);
        this.o = new ChoiceGroup("Gom \u0110\u1ed3 Khi H\u00e0nh Trang \u0110\u1ea7y !", 1, new String[] { "B\u1eadt", "T\u1eaft" }, new Image[2]);
        this.q = new ChoiceGroup("Auto Gom \u0110\u1ed3 !", 1, new String[] { "B\u1eadt", "T\u1eaft" }, new Image[2]);
        final String s3 = "Ph\u00fat nh\u1eadn \u0111\u1ed3";
        String value2;
        if (e(c(n2) ? 1 : 0)) {
            value2 = "";
            "".length();
            "".length();
            if (a((dr.m[32] ^ dr.m[33]) & (dr.m[34] ^ dr.m[35] ^ dr.m[36]))) {
                throw null;
            }
        }
        else {
            value2 = String.valueOf(dl.x);
        }
        this.r = new TextField(s3, value2, 2, 2);
        final String s4 = "Map nh\u1eadn \u0111\u1ed3";
        String value3;
        if (e(c(n2) ? 1 : 0)) {
            value3 = "";
            "".length();
            "".length();
            if (a(-" ".length(), "   ".length())) {
                throw null;
            }
        }
        else {
            value3 = String.valueOf(dl.w);
        }
        this.g = new TextField(s4, value3, 4, 2);
        final String s5 = "Khu V\u1ef1c nh\u1eadn";
        String value4;
        if (e(c(n2) ? 1 : 0)) {
            value4 = "";
            "".length();
            "".length();
            if (c((dr.m[37] + dr.m[38] - dr.m[5] + dr.m[39] ^ dr.m[19] + dr.m[40] - dr.m[41] + dr.m[42]) & (dr.m[43] + dr.m[44] - dr.m[45] + dr.m[1] ^ dr.m[46] + dr.m[47] - dr.m[48] + dr.m[49] ^ -" ".length()), -" ".length())) {
                throw null;
            }
        }
        else {
            value4 = String.valueOf(dl.aa);
        }
        this.l = new TextField(s5, value4, 3, 2);
        this.k = new Command("L\u01b0u", 4, 0);
    }
    
    private static boolean e(final int n) {
        return n != 0;
    }
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (e(b(command, this.k) ? 1 : 0)) {
            dl.y = this.n.getString();
            dl.z = (byte)Integer.parseInt(this.p.getString());
            dl.x = (byte)Integer.parseInt(this.r.getString());
            dr.a = this.f.getString();
            dr.c = this.j.getString();
            dr.e = (byte)this.i.getSelectedIndex();
            dr.d = (byte)this.o.getSelectedIndex();
            dr.b = (byte)this.q.getSelectedIndex();
            try {
                dl.z = Byte.parseByte(this.p.getString());
                dl.x = Byte.parseByte(this.r.getString());
                dl.w = Integer.parseInt(this.g.getString());
                dl.aa = Byte.parseByte(this.l.getString());
                dr.e = (byte)this.i.getSelectedIndex();
                dr.d = (byte)this.o.getSelectedIndex();
                dr.b = (byte)this.q.getSelectedIndex();
                "".length();
                "".length();
                if (b("  ".length())) {
                    return;
                }
            }
            catch (final Exception ex) {
                "".length();
            }
            ff.b("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
            dl.o();
        }
        a((Displayable)ey.c());
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = dr.m[0];
            "".length();
            if (-" ".length() > 0) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = dr.m[1];
        }
        return n != 0;
    }
}
