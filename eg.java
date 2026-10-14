import java.util.*;
import javax.microedition.rms.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public final class eg implements CommandListener
{
    private Command a;
    private static final int[] b;
    private Command c;
    private static final int[] d;
    private static eg e;
    private Command f;
    private Command g;
    private TextField h;
    private Form i;
    private Form j;
    private Command k;
    private List l;
    private static Vector m;
    private Image n;
    
    private static boolean a(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o != o2;
    }
    
    public eg() {
        super();
        c();
        this.c = new Command("Xong", 7, 1);
        this.k = new Command("Th\u00eam", 1, 1);
        this.g = new Command("X\u00f3a", 1, 2);
        this.a = new Command("OK", 4, 1);
        this.f = new Command("H\u1ee7y", 7, 1);
    }
    
    private static void c() {
        String str;
        if (a(b((str = b("null")).equals("null") ? 1 : 0) ? 1 : 0)) {
            final String str2 = "-";
            final Vector vector = new Vector();
            final String str3 = str2;
            if (a(b(str.endsWith(str2) ? 1 : 0) ? 1 : 0)) {
                str = new StringBuffer().append(str).append(str2).toString();
            }
            int n = 0;
            int endIndex = str.indexOf(str2);
            while (a(e(endIndex, -1) ? 1 : 0)) {
                vector.addElement(str.substring(n, endIndex));
                n = endIndex + str3.length();
                endIndex = str.indexOf(str3, n);
                "".length();
                "".length();
                if (h(-"  ".length())) {
                    return;
                }
            }
            final String[] anArray = new String[vector.size()];
            vector.copyInto(anArray);
            int n2 = 0;
            while (a(d(n2, anArray.length) ? 1 : 0)) {
                eg.m.addElement(anArray[n2]);
                ++n2;
                "".length();
                "".length();
                if (c((eg.b[39] ^ eg.b[40]) & (eg.b[41] ^ eg.b[42] ^ eg.b[43]), " ".length())) {
                    return;
                }
            }
        }
    }
    
    private static boolean b(final int n) {
        int n2;
        if (e(n)) {
            n2 = eg.b[0];
            "".length();
            if (((0x89 ^ 0xA3 ^ (0x5E ^ 0x70)) & (0x40 ^ 0x71 ^ (0x6D ^ 0x58) ^ -" ".length())) == "   ".length()) {
                return ((128 + 178 - 148 + 90 ^ 116 + 26 + 14 + 30) & (172 + 98 - 220 + 144 ^ 14 + 94 - 105 + 125 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = eg.b[1];
        }
        return n2 != 0;
    }
    
    private static boolean c(final int n) {
        int n2;
        if (a(n)) {
            n2 = eg.b[0];
            "".length();
            if (null != null) {
                return ((0x84 ^ 0xAF ^ (0xE6 ^ 0x8A)) & (0x8D ^ 0xB4 ^ (0x6F ^ 0x11) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = eg.b[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (d(o, o2)) {
            n = eg.b[0];
            "".length();
            if (((0x9D ^ 0x9B) & ~(0x4A ^ 0x4C)) > 0) {
                return ((0xE3 ^ 0xBD) & ~(0xD2 ^ 0x8C)) != 0x0;
            }
        }
        else {
            n = eg.b[1];
        }
        return n != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        return n >= n2;
    }
    
    private static String b(final String s) {
        try {
            return new String(RecordStore.openRecordStore("iuList", true).getRecord(1), "UTF-8");
        }
        catch (final Exception ex) {
            "".length();
            return s;
        }
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static void d() {
        (b = new int[53])[0] = " ".length();
        eg.b[1] = ((0x6 ^ 0x27) & ~(0x2F ^ 0xE));
        eg.b[2] = (0x7A ^ 0x64 ^ (0xD4 ^ 0x8B));
        eg.b[3] = (0x87 ^ 0xC6 ^ (0x63 ^ 0x68));
        eg.b[4] = (0x1C ^ 0x0 ^ (0x83 ^ 0xB5));
        eg.b[5] = (0xEB ^ 0xB1);
        eg.b[6] = (103 + 116 - 173 + 88 ^ 120 + 168 - 158 + 65);
        eg.b[7] = (0xC8 ^ 0x84 ^ (0x8E ^ 0xA0));
        eg.b[8] = (71 + 178 - 232 + 174 ^ 19 + 145 - 132 + 127);
        eg.b[9] = (0x96 ^ 0xA3 ^ (0xBF ^ 0xB2));
        eg.b[10] = (0x81 ^ 0x84);
        eg.b[11] = 0 + 77 - 14 + 133;
        eg.b[12] = 145 + 187 - 285 + 145;
        eg.b[13] = (0xAE ^ 0xA8);
        eg.b[14] = "  ".length();
        eg.b[15] = "   ".length();
        eg.b[16] = (0x1E ^ 0x33 ^ (0xB0 ^ 0x95));
        eg.b[17] = (144 + 85 - 145 + 77 ^ 56 + 156 - 103 + 57);
        eg.b[18] = (0x1B ^ 0x76);
        eg.b[19] = (0x2A ^ 0x76);
        eg.b[20] = (0x51 ^ 0x1D) + (0x31 ^ 0x42) - (0xC ^ 0x72) + (0x58 ^ 0x1F);
        eg.b[21] = (60 + 2 - 15 + 81 ^ 72 + 10 + 18 + 72);
        eg.b[22] = -(0xB3 ^ 0xC5 ^ (0x68 ^ 0xB));
        eg.b[23] = (0x3A ^ 0x5F);
        eg.b[24] = 56 + 9 - 57 + 140;
        eg.b[25] = 66 + 44 + 21 + 13;
        eg.b[26] = (0xE2 ^ 0xB8 ^ (0x61 ^ 0x3F));
        eg.b[27] = (0x16 ^ 0x24);
        eg.b[28] = (0x49 ^ 0x17 ^ (0x2D ^ 0xE));
        eg.b[29] = (0x3 ^ 0x5B ^ (0x50 ^ 0x69));
        eg.b[30] = (146 + 147 - 131 + 17 ^ 39 + 183 - 86 + 55);
        eg.b[31] = (0xFD ^ 0x8F);
        eg.b[32] = (0x1F ^ 0x9);
        eg.b[33] = 83 + 124 - 80 + 0;
        eg.b[34] = (0xAD ^ 0x94);
        eg.b[35] = -(0xFFFFF355 & 0x5DEF);
        eg.b[36] = (0xFFFFF777 & 0x79FD);
        eg.b[37] = -(-(0xFFFFBA23 & 0x47FF) & (0xFFFFD76F & 0x6EF7));
        eg.b[38] = (-(0xFFFFC89A & 0x3F67) & (-1 & 0x7FFD));
        eg.b[39] = (128 + 132 - 120 + 12 ^ 155 + 74 - 79 + 17);
        eg.b[40] = (0x49 ^ 0x44);
        eg.b[41] = "   ".length() + (0x72 ^ 0x6B) - -(0xFA ^ 0x91) + (0x19 ^ 0x1D);
        eg.b[42] = 174 + 73 - 130 + 68;
        eg.b[43] = -" ".length();
        eg.b[44] = (0x34 ^ 0xB ^ (0x74 ^ 0x20));
        eg.b[45] = (0xCE ^ 0x96 ^ (0x5E ^ 0x68));
        eg.b[46] = (136 + 173 - 155 + 23 ^ 164 + 138 - 260 + 157);
        eg.b[47] = (0x50 ^ 0x16) + (138 + 111 - 173 + 78) - (85 + 144 - 87 + 33) + (10 + 146 + 7 + 28);
        eg.b[48] = 161 + 61 - 39 + 8;
        eg.b[49] = 75 + 101 - 90 + 54;
        eg.b[50] = 72 + 146 - 57 + 24 + (22 + 45 - 22 + 103) - (61 + 60 - 77 + 167) + (0x6B ^ 0x26);
        eg.b[51] = 104 + 99 - 115 + 91;
        eg.b[52] = (0x35 ^ 0x4F) + (0x4 ^ 0x1F) - -(0x7A ^ 0x6F) + (0x8C ^ 0x81);
    }
    
    static {
        d();
        e();
        eg.m = new Vector();
        eg.e = new eg();
    }
    
    private static boolean c(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (g(n, n2)) {
            n3 = eg.b[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0xF8 ^ 0xA5) & ~(0xDC ^ 0x81)) != 0x0;
            }
        }
        else {
            n3 = eg.b[1];
        }
        return n3 != 0;
    }
    
    private static boolean d(final int n) {
        return n <= 0;
    }
    
    private static boolean c(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = eg.b[0];
            "".length();
            if ((0x42 ^ 0x5F ^ (0x35 ^ 0x2C)) <= 0) {
                return ((82 + 29 + 22 + 3 ^ 93 + 160 - 117 + 55) & (0x0 ^ 0x57 ^ (0x59 ^ 0x39) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = eg.b[1];
        }
        return n != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = eg.b[0];
            "".length();
            if (((0x9B ^ 0x93) & ~(0x83 ^ 0x8B)) > ((0x84 ^ 0x91) & ~(0x8A ^ 0x9F))) {
                return ((0x16 ^ 0x48) & ~(0x30 ^ 0x6E)) != 0x0;
            }
        }
        else {
            n3 = eg.b[1];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n) {
        return n == 0;
    }
    
    private static void c(final String s) {
        try {
            final RecordStore openRecordStore;
            final int numRecords;
            if (a(g(numRecords = (openRecordStore = RecordStore.openRecordStore("iuList", (boolean)(1 != 0))).getNumRecords()) ? 1 : 0)) {
                final byte[] array = new byte[0];
                int n = 0;
                while (a(d(n, 1 - numRecords) ? 1 : 0)) {
                    openRecordStore.addRecord(array, 0, 0);
                    "".length();
                    ++n;
                    "".length();
                    "".length();
                    if (f(-(eg.b[44] ^ eg.b[45]))) {
                        return;
                    }
                }
            }
            final byte[] bytes = s.getBytes("UTF-8");
            openRecordStore.setRecord(1, bytes, 0, bytes.length);
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    private static boolean f(final int n, final int n2) {
        return n != n2;
    }
    
    public static eg a() {
        if (a(b(eg.e) ? 1 : 0)) {
            eg.e = new eg();
        }
        return eg.e;
    }
    
    public static boolean a(final String o) {
        return eg.m.contains(o);
    }
    
    private static void e() {
        (d = new int[eg.b[16]])[eg.b[1]] = (eg.b[17] + eg.b[18] - eg.b[19] + eg.b[20] ^ eg.b[0] + eg.b[21] - eg.b[22] + eg.b[23]);
        eg.d[eg.b[0]] = " ".length();
        eg.d[eg.b[14]] = "  ".length();
        eg.d[eg.b[15]] = (eg.b[24] ^ eg.b[25]);
        eg.d[eg.b[26]] = "   ".length();
        eg.d[eg.b[10]] = ((eg.b[27] ^ eg.b[28] ^ (eg.b[29] ^ eg.b[30])) & (eg.b[31] ^ eg.b[32] ^ (eg.b[33] ^ eg.b[34]) ^ -" ".length()));
        eg.d[eg.b[13]] = (-(eg.b[35] & eg.b[36]) & (eg.b[37] & eg.b[38]));
        eg.d[eg.b[17]] = -" ".length();
    }
    
    private static boolean f(final int n) {
        return n >= 0;
    }
    
    public final void b() {
        if (a(g(eg.m.size()) ? 1 : 0)) {
            (this.j = new Form("Danh s\u00e1ch ko pk")).append("H\u00e3y th\u00eam \u0111\u1ed1i t\u01b0\u1ee3ng ko pk ");
            "".length();
            this.j.addCommand(this.c);
            this.j.addCommand(this.k);
            this.j.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.j);
            return;
        }
        try {
            this.n = Image.createImage("/x1/kt.png");
            "".length();
            "".length();
            if (f(eg.b[0] ^ eg.b[3] ^ (eg.b[34] ^ eg.b[46]), eg.b[47] ^ eg.b[48] ^ (eg.b[49] ^ eg.b[50]))) {
                return;
            }
        }
        catch (final Exception ex) {
            "".length();
        }
        this.l = new List("Danh s\u00e1ch ko pk", 3);
        int index = 0;
        while (a(d(index, eg.m.size()) ? 1 : 0)) {
            this.l.append((String)eg.m.elementAt(index), this.n);
            "".length();
            ++index;
            "".length();
            "".length();
            if (a(-" ".length(), eg.b[51] ^ eg.b[52])) {
                return;
            }
        }
        this.l.addCommand(this.c);
        this.l.addCommand(this.k);
        this.l.addCommand(this.g);
        this.l.setCommandListener((CommandListener)this);
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.l);
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = eg.b[0];
            "".length();
            if ("   ".length() == -" ".length()) {
                return ((0x1 ^ 0xC) & ~(0xB9 ^ 0xB4)) != 0x0;
            }
        }
        else {
            n = eg.b[1];
        }
        return n != 0;
    }
    
    private static boolean g(final int n) {
        int n2;
        if (d(n)) {
            n2 = eg.b[0];
            "".length();
            if ("  ".length() < 0) {
                return ((106 + 14 - 116 + 209 ^ 140 + 62 - 53 + 5) & (0xEA ^ 0xBD ^ (0x13 ^ 0xB) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = eg.b[1];
        }
        return n2 != 0;
    }
    
    private static boolean h(final int n) {
        return n > 0;
    }
    
    private static boolean d(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean g(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean h(final int n, final int n2) {
        return n <= n2;
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (a(b(command, this.c) ? 1 : 0)) {
            final String s = "iuList";
            try {
                RecordStore.deleteRecordStore(s);
                "".length();
                "".length();
                if (h(eg.b[2] + eg.b[3] - eg.b[4] + eg.b[5] ^ eg.b[6] + eg.b[7] - eg.b[8] + eg.b[9], " ".length())) {
                    return;
                }
            }
            catch (final Exception ex) {
                "".length();
            }
            if (a(g(eg.m.size()) ? 1 : 0)) {
                c("");
                "".length();
                "".length();
                if (f("  ".length(), "  ".length())) {
                    return;
                }
            }
            else {
                final StringBuffer sb = new StringBuffer();
                int index = 0;
                while (a(d(index, eg.m.size()) ? 1 : 0)) {
                    sb.append(new StringBuffer().append((String)eg.m.elementAt(index)).append("-").toString());
                    "".length();
                    ++index;
                    "".length();
                    "".length();
                    if (b(" ".length(), eg.b[11] ^ eg.b[12])) {
                        return;
                    }
                }
                c(sb.toString());
            }
            Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)ey.a);
            ee.b("\u0110\u00e3 l\u01b0u th\u00e0nh c\u00f4ng!");
        }
        if (a(b(command, this.k) ? 1 : 0)) {
            (this.i = new Form("Th\u00eam k\u1ebb ko pk")).append((Item)(this.h = new TextField("T\u00ean:", (String)null, 5000, 0)));
            "".length();
            this.i.addCommand(this.a);
            this.i.addCommand(this.f);
            this.i.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.i);
        }
        if (a(c(command, this.g) ? 1 : 0)) {
            if (a(b(command, this.f) ? 1 : 0)) {
                this.b();
            }
            if (a(b(command, this.a) ? 1 : 0)) {
                final String string;
                if (a(b((string = this.h.getString()).equals("") ? 1 : 0) ? 1 : 0)) {
                    eg.m.addElement(string);
                }
                this.b();
            }
        }
        else {
            final int selectedIndex = this.l.getSelectedIndex();
            final String string2 = this.l.getString(selectedIndex);
            this.l.delete(selectedIndex);
            int n = 0;
            while (a(d(n, eg.m.size()) ? 1 : 0)) {
                if (a(c(string2.equals(eg.m.elementAt(n)) ? 1 : 0) ? 1 : 0)) {
                    eg.m.removeElementAt(n);
                    return;
                }
                ++n;
                "".length();
                "".length();
                if (f(-" ".length())) {
                    return;
                }
            }
        }
    }
}
