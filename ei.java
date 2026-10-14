import java.util.*;
import javax.microedition.rms.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public final class ei implements CommandListener
{
    private static final int[] a;
    private Command b;
    private Image c;
    private Command d;
    private static final int[] e;
    private static ei f;
    private Command g;
    private Form h;
    private List i;
    private static Vector j;
    private Command k;
    private TextField l;
    private Command m;
    private Form n;
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static boolean a(final int n) {
        return n <= 0;
    }
    
    private static void c() {
        (e = new int[ei.a[0]])[ei.a[1]] = (ei.a[2] ^ ei.a[3] ^ "  ".length());
        ei.e[ei.a[4]] = " ".length();
        ei.e[ei.a[5]] = "  ".length();
        ei.e[ei.a[6]] = (ei.a[7] + ei.a[8] - ei.a[9] + ei.a[10] ^ (ei.a[11] ^ ei.a[12]));
        ei.e[ei.a[13]] = "   ".length();
        ei.e[ei.a[14]] = ((ei.a[15] + ei.a[16] - ei.a[17] + ei.a[18] ^ ei.a[19] + ei.a[20] - ei.a[21] + ei.a[14]) & (ei.a[22] + ei.a[23] - ei.a[24] + ei.a[25] ^ ei.a[26] + ei.a[27] - ei.a[28] + ei.a[29] ^ -" ".length()));
        ei.e[ei.a[30]] = (-(ei.a[31] & ei.a[32]) & (ei.a[33] & ei.a[34]));
        ei.e[ei.a[7]] = -" ".length();
    }
    
    private static void b(final String s) {
        try {
            final RecordStore openRecordStore;
            final int numRecords;
            if (c(b(numRecords = (openRecordStore = RecordStore.openRecordStore("pkList", (boolean)(1 != 0))).getNumRecords()) ? 1 : 0)) {
                final byte[] array = new byte[0];
                int n = 0;
                while (c(e(n, 1 - numRecords) ? 1 : 0)) {
                    openRecordStore.addRecord(array, 0, 0);
                    "".length();
                    ++n;
                    "".length();
                    "".length();
                    if (d(" ".length())) {
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
    
    private static boolean b(final int n) {
        int n2;
        if (a(n)) {
            n2 = ei.a[4];
            "".length();
            if ("  ".length() == 0) {
                return ((0xC ^ 0x27 ^ (0x72 ^ 0x64)) & (0x64 ^ 0x17 ^ (0x8F ^ 0xC1) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ei.a[1];
        }
        return n2 != 0;
    }
    
    static {
        d();
        c();
        ei.j = new Vector();
        ei.f = new ei();
    }
    
    private static boolean a(final int n, final int n2) {
        return n >= n2;
    }
    
    public static ei a() {
        if (c(b(ei.f) ? 1 : 0)) {
            ei.f = new ei();
        }
        return ei.f;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (d(o, o2)) {
            n = ei.a[4];
            "".length();
            if (" ".length() <= -" ".length()) {
                return (("  ".length() ^ (0x6B ^ 0x7A)) & (0xCA ^ 0xBE ^ (0x2A ^ 0x4D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ei.a[1];
        }
        return n != 0;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = ei.a[4];
            "".length();
            if ((0xC3 ^ 0xC7) == "  ".length()) {
                return ((0x6 ^ 0x55) & ~(0xE7 ^ 0xB4)) != 0x0;
            }
        }
        else {
            n = ei.a[1];
        }
        return n != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean c(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = ei.a[4];
            "".length();
            if ((0x3E ^ 0x3A) == 0x0) {
                return ((0x18 ^ 0x5D) & ~(0x8 ^ 0x4D)) != 0x0;
            }
        }
        else {
            n = ei.a[1];
        }
        return n != 0;
    }
    
    private static boolean c(final int n, final int n2) {
        return n == n2;
    }
    
    public static boolean a(final String o) {
        return ei.j.contains(o);
    }
    
    private static boolean d(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean c(final int n) {
        return n != 0;
    }
    
    private static boolean d(final int n) {
        return n < 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = ei.a[4];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xAE ^ 0xA8 ^ (0x82 ^ 0xBC)) & (0xB1 ^ 0xB9 ^ (0x3F ^ 0xF) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = ei.a[1];
        }
        return n3 != 0;
    }
    
    private static boolean d(final Object o, final Object o2) {
        return o != o2;
    }
    
    public final void b() {
        if (c(b(ei.j.size()) ? 1 : 0)) {
            (this.n = new Form("Danh s\u00e1ch pk")).append("H\u00e3y th\u00eam \u0111\u1ed1i t\u01b0\u1ee3ng pk");
            "".length();
            this.n.addCommand(this.g);
            this.n.addCommand(this.k);
            this.n.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.n);
            return;
        }
        try {
            this.c = Image.createImage("/x1/kt.png");
            "".length();
            "".length();
            if (a(" ".length(), ei.a[15] ^ ei.a[71])) {
                return;
            }
        }
        catch (final Exception ex) {
            "".length();
        }
        this.i = new List("Danh s\u00e1ch pk", 3);
        int index = 0;
        while (c(e(index, ei.j.size()) ? 1 : 0)) {
            this.i.append((String)ei.j.elementAt(index), this.c);
            "".length();
            ++index;
            "".length();
            "".length();
            if (c(-" ".length(), " ".length())) {
                return;
            }
        }
        this.i.addCommand(this.g);
        this.i.addCommand(this.k);
        this.i.addCommand(this.d);
        this.i.setCommandListener((CommandListener)this);
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.i);
    }
    
    private static boolean e(final int n) {
        int n2;
        if (g(n)) {
            n2 = ei.a[4];
            "".length();
            if (-"   ".length() > 0) {
                return ((0xC8 ^ 0x93) & ~(0x71 ^ 0x2A)) != 0x0;
            }
        }
        else {
            n2 = ei.a[1];
        }
        return n2 != 0;
    }
    
    private static void d() {
        (a = new int[72])[0] = (29 + 13 - 35 + 160 ^ 68 + 96 - 59 + 70);
        ei.a[1] = ((0x7F ^ 0x31 ^ (0x7E ^ 0x17)) & (30 + 114 - 96 + 97 ^ 20 + 95 - 36 + 103 ^ -" ".length()));
        ei.a[2] = (0x4 ^ 0x11);
        ei.a[3] = (0x44 ^ 0x39 ^ (0x26 ^ 0x4B));
        ei.a[4] = " ".length();
        ei.a[5] = "  ".length();
        ei.a[6] = "   ".length();
        ei.a[7] = (0xD0 ^ 0x9C ^ (0x20 ^ 0x6B));
        ei.a[8] = (0x7B ^ 0x74);
        ei.a[9] = -(117 + 116 - 91 + 12 ^ 11 + 8 + 79 + 34);
        ei.a[10] = (201 + 12 - 111 + 131 ^ 48 + 104 + 3 + 7);
        ei.a[11] = (202 + 222 - 370 + 194 ^ 3 + 134 - 127 + 135);
        ei.a[12] = (0xBF ^ 0xAD);
        ei.a[13] = (0x36 ^ 0x62 ^ (0x5F ^ 0xF));
        ei.a[14] = (0x22 ^ 0x27);
        ei.a[15] = (0x79 ^ 0x38 ^ (0x44 ^ 0x60));
        ei.a[16] = 69 + 175 - 226 + 164;
        ei.a[17] = (-(0xFFFFFFD1 & 0xABF) & (0xFFFF9BFF & 0x6F9B));
        ei.a[18] = (0xB7 ^ 0x85) + (0x7 ^ 0x66) - (0x6B ^ 0xF) + (0x45 ^ 0x3C);
        ei.a[19] = (0xBE ^ 0xA2 ^ (0xD ^ 0x5B));
        ei.a[20] = (0xEA ^ 0x85) + (0x9 ^ 0x14) - (0x12 ^ 0x1) + (0x65 ^ 0x7F);
        ei.a[21] = (0x27 ^ 0x3);
        ei.a[22] = (50 + 127 - 99 + 103 ^ 22 + 58 - 10 + 114);
        ei.a[23] = (0x22 ^ 0x5E ^ (0xB ^ 0x47));
        ei.a[24] = -(109 + 11 - 75 + 188 ^ 83 + 12 + 18 + 29);
        ei.a[25] = (0x64 ^ 0x45);
        ei.a[26] = (0x30 ^ 0x52) + (46 + 111 - 50 + 29) - (114 + 0 - 34 + 89) + (0x22 ^ 0x6B);
        ei.a[27] = 77 + 133 - 185 + 116;
        ei.a[28] = (0x77 ^ 0x2A);
        ei.a[29] = (0x98 ^ 0x91);
        ei.a[30] = (164 + 28 - 15 + 9 ^ 135 + 55 - 32 + 30);
        ei.a[31] = -(-(0xFFFFDA3F & 0x6FF5) & (0xFFFFDFFF & 0x7EBE));
        ei.a[32] = (0xFFFFFEFF & 0x75FF);
        ei.a[33] = -(0xFFFFDE0B & 0x29F5);
        ei.a[34] = (-1 & 0x7BFD);
        ei.a[35] = (0xEC ^ 0x9A ^ (0xA3 ^ 0x9B));
        ei.a[36] = (0xDE ^ 0xB3);
        ei.a[37] = (0xC2 ^ 0x9B ^ (0x52 ^ 0x6C));
        ei.a[38] = (0xA6 ^ 0x95 ^ (0x66 ^ 0x11));
        ei.a[39] = (0x4 ^ 0x67 ^ (0x14 ^ 0x38));
        ei.a[40] = (0x2A ^ 0xB ^ (0x7B ^ 0x1));
        ei.a[41] = (0x71 ^ 0x5B);
        ei.a[42] = -(0x87 ^ 0x91);
        ei.a[43] = (28 + 16 - 16 + 125 ^ 32 + 62 - 6 + 46);
        ei.a[44] = (0x58 ^ 0xA ^ "  ".length());
        ei.a[45] = (0x3A ^ 0x31);
        ei.a[46] = (0xAB ^ 0xB7);
        ei.a[47] = 138 + 84 - 73 + 4;
        ei.a[48] = (0x39 ^ 0x51);
        ei.a[49] = (0x25 ^ 0x7) + (0x5A ^ 0x67) - (0xB1 ^ 0x88) + (105 + 92 - 92 + 100);
        ei.a[50] = 131 + 77 - 133 + 70;
        ei.a[51] = (0x76 ^ 0x5E);
        ei.a[52] = (0x79 ^ 0x0);
        ei.a[53] = (66 + 2 + 37 + 43 ^ 66 + 18 + 4 + 54);
        ei.a[54] = (0x7F ^ 0x17 ^ (0xCE ^ 0x89));
        ei.a[55] = (0x63 ^ 0x5);
        ei.a[56] = (0xBE ^ 0xC0 ^ (0x29 ^ 0x35));
        ei.a[57] = (73 + 112 - 141 + 171 ^ 62 + 83 - 29 + 63);
        ei.a[58] = 53 + 202 - 254 + 237;
        ei.a[59] = (0x3A ^ 0x75) + (0xD ^ 0x4B) - (0x15 ^ 0x42) + (0x9C ^ 0xC1);
        ei.a[60] = (0xE9 ^ 0xBA ^ (0x40 ^ 0x6B));
        ei.a[61] = (0x2 ^ 0x5D ^ (0x4C ^ 0x1D));
        ei.a[62] = (6 + 121 - 5 + 23 ^ 61 + 94 - 130 + 158);
        ei.a[63] = (0x13 ^ 0x20);
        ei.a[64] = (148 + 46 - 5 + 17 ^ 63 + 8 - 6 + 71);
        ei.a[65] = (0x65 ^ 0x24);
        ei.a[66] = (0x9C ^ 0xB3 ^ (0x8F ^ 0xBE));
        ei.a[67] = (0x5B ^ 0x12);
        ei.a[68] = (0x58 ^ 0x2B ^ (0x7E ^ 0x30));
        ei.a[69] = (95 + 53 + 29 + 39 ^ 72 + 36 + 43 + 22);
        ei.a[70] = -" ".length();
        ei.a[71] = (0x2B ^ 0x52 ^ (0x91 ^ 0x89));
    }
    
    private static boolean f(final int n) {
        int n2;
        if (c(n)) {
            n2 = ei.a[4];
            "".length();
            if (-" ".length() == "  ".length()) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            n2 = ei.a[1];
        }
        return n2 != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = ei.a[4];
            "".length();
            if ((87 + 59 - 112 + 138 ^ 37 + 53 - 54 + 133) == 0x0) {
                return ((204 + 88 - 250 + 205 ^ 131 + 57 - 146 + 127) & (95 + 44 + 5 + 58 ^ 52 + 120 - 159 + 135 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = ei.a[1];
        }
        return n3 != 0;
    }
    
    private static boolean g(final int n) {
        return n == 0;
    }
    
    private static boolean c(final Object o) {
        return o != null;
    }
    
    private static String c(final String s) {
        try {
            return new String(RecordStore.openRecordStore("pkList", true).getRecord(1), "UTF-8");
        }
        catch (final Exception ex) {
            "".length();
            return s;
        }
    }
    
    private static boolean h(final int n) {
        return n >= 0;
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (c(c(command, this.g) ? 1 : 0)) {
            final String s = "pkList";
            try {
                RecordStore.deleteRecordStore(s);
                "".length();
                "".length();
                if (h(-"  ".length())) {
                    return;
                }
            }
            catch (final Exception ex) {
                "".length();
            }
            if (c(b(ei.j.size()) ? 1 : 0)) {
                b("");
                "".length();
                "".length();
                if (g("   ".length())) {
                    return;
                }
            }
            else {
                final StringBuffer sb = new StringBuffer();
                int index = 0;
                while (c(e(index, ei.j.size()) ? 1 : 0)) {
                    sb.append(new StringBuffer().append((String)ei.j.elementAt(index)).append("-").toString());
                    "".length();
                    ++index;
                    "".length();
                    "".length();
                    if (d((ei.a[47] + ei.a[48] - ei.a[49] + ei.a[50] ^ ei.a[51] + ei.a[52] - ei.a[14] + ei.a[53]) & (ei.a[54] ^ ei.a[55] ^ (ei.a[5] ^ ei.a[56]) ^ -" ".length()), (ei.a[57] ^ ei.a[7] ^ (ei.a[58] ^ ei.a[59])) & (ei.a[60] + ei.a[61] - ei.a[62] + ei.a[63] ^ ei.a[64] + ei.a[65] - ei.a[66] + ei.a[46] ^ -" ".length()))) {
                        return;
                    }
                }
                b(sb.toString());
            }
            Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)ey.a);
            ee.b("\u0110\u00e3 l\u01b0u th\u00e0nh c\u00f4ng!");
        }
        if (c(c(command, this.k) ? 1 : 0)) {
            (this.h = new Form("Th\u00eam k\u1ebb pk")).append((Item)(this.l = new TextField("T\u00ean:", (String)null, 5000, 0)));
            "".length();
            this.h.addCommand(this.b);
            this.h.addCommand(this.m);
            this.h.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.h);
        }
        if (c(b(command, this.d) ? 1 : 0)) {
            if (c(c(command, this.m) ? 1 : 0)) {
                this.b();
            }
            if (c(c(command, this.b) ? 1 : 0)) {
                final String string;
                if (c(e((string = this.l.getString()).equals("") ? 1 : 0) ? 1 : 0)) {
                    ei.j.addElement(string);
                }
                this.b();
            }
        }
        else {
            final int selectedIndex = this.i.getSelectedIndex();
            final String string2 = this.i.getString(selectedIndex);
            this.i.delete(selectedIndex);
            int n = 0;
            while (c(e(n, ei.j.size()) ? 1 : 0)) {
                if (c(f(string2.equals(ei.j.elementAt(n)) ? 1 : 0) ? 1 : 0)) {
                    ei.j.removeElementAt(n);
                    return;
                }
                ++n;
                "".length();
                "".length();
                if (c((ei.a[4] ^ ei.a[67]) & (ei.a[68] ^ ei.a[69] ^ ei.a[70]))) {
                    return;
                }
            }
        }
    }
    
    public ei() {
        super();
        e();
        this.g = new Command("Xong", 7, 1);
        this.k = new Command("Th\u00eam", 1, 1);
        this.d = new Command("X\u00f3a", 1, 2);
        this.b = new Command("OK", 4, 1);
        this.m = new Command("H\u1ee7y", 7, 1);
    }
    
    private static void e() {
        String str;
        if (c(e((str = c("null")).equals("null") ? 1 : 0) ? 1 : 0)) {
            final String str2 = "-";
            final Vector vector = new Vector();
            final String str3 = str2;
            if (c(e(str.endsWith(str2) ? 1 : 0) ? 1 : 0)) {
                str = new StringBuffer().append(str).append(str2).toString();
            }
            int n = 0;
            int endIndex = str.indexOf(str2);
            while (c(f(endIndex, -1) ? 1 : 0)) {
                vector.addElement(str.substring(n, endIndex));
                n = endIndex + str3.length();
                endIndex = str.indexOf(str3, n);
                "".length();
                "".length();
                if (d((ei.a[35] + ei.a[36] - ei.a[37] + ei.a[38] ^ ei.a[39] + ei.a[1] - ei.a[1] + ei.a[11]) & (ei.a[40] + ei.a[41] - ei.a[42] + ei.a[14] ^ ei.a[43] + ei.a[44] - ei.a[45] + ei.a[46] ^ -" ".length()))) {
                    return;
                }
            }
            final String[] anArray = new String[vector.size()];
            vector.copyInto(anArray);
            int n2 = 0;
            while (c(e(n2, anArray.length) ? 1 : 0)) {
                ei.j.addElement(anArray[n2]);
                ++n2;
                "".length();
                "".length();
                if (c((Object)null)) {
                    return;
                }
            }
        }
    }
}
