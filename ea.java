import javax.microedition.rms.*;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public final class ea implements CommandListener
{
    private TextField d;
    private static final int[] e;
    private TextField f;
    private static RecordStore g;
    private static DataOutputStream h;
    private Command i;
    private Form j;
    public static String a;
    private static ByteArrayOutputStream k;
    public static long b;
    private Command l;
    private static ByteArrayInputStream m;
    public static String c;
    private static DataInputStream n;
    private static final int[] o;
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (a(a(command, this.i) ? 1 : 0)) {
            ea.b = Long.parseLong(this.d.getString());
            ea.a = this.f.getString();
            try {
                ea.k = new ByteArrayOutputStream();
                (ea.h = new DataOutputStream(ea.k)).writeLong(ea.b);
                ea.h.writeUTF(ea.a);
                ea.h.flush();
                ea.h.close();
                ea.k.flush();
                ea.g = RecordStore.openRecordStore("ktg", true);
                ea.k.close();
                if (a(e(ea.g.getNumRecords()) ? 1 : 0)) {
                    ea.g.addRecord(ea.k.toByteArray(), 0, ea.k.toByteArray().length);
                    "".length();
                    "".length();
                    "".length();
                    if (d(-"   ".length())) {
                        return;
                    }
                }
                else {
                    ea.g.setRecord(1, ea.k.toByteArray(), 0, ea.k.toByteArray().length);
                }
                ea.g.closeRecordStore();
                "".length();
                "".length();
                if (a(" ".length(), (ea.e[2] ^ ea.e[19]) & (ea.e[20] ^ ea.e[21] ^ ea.e[22]))) {
                    return;
                }
            }
            catch (final Exception ex) {
                "".length();
            }
            ff.b("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
        }
        a((Displayable)ey.c());
    }
    
    public final void a() {
        this.j.append((Item)this.d);
        "".length();
        this.j.append((Item)this.f);
        "".length();
        this.j.addCommand(this.i);
        this.j.addCommand(this.l);
        this.j.setCommandListener((CommandListener)this);
        a((Displayable)this.j);
    }
    
    private static boolean a(final Object o, final Object o2) {
        int n;
        if (b(o, o2)) {
            n = ea.e[1];
            "".length();
            if ((0x68 ^ 0x1C ^ (0x39 ^ 0x48)) == 0x0) {
                return ((0x6 ^ 0x1D ^ (0x58 ^ 0x60)) & (0xA1 ^ 0x91 ^ (0x12 ^ 0x1) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ea.e[0];
        }
        return n != 0;
    }
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    static {
        c();
        b();
        ea.b = 62000L;
        try {
            if (a(b((ea.g = RecordStore.openRecordStore("ktg", true)).getNumRecords()) ? 1 : 0)) {
                ea.m = new ByteArrayInputStream(ea.g.getRecord(1));
                ea.b = (ea.n = new DataInputStream(ea.m)).readLong();
                ea.a = ea.n.readUTF();
            }
            ea.g.closeRecordStore();
            "".length();
            "".length();
            if (f("  ".length())) {
                return;
            }
        }
        catch (final Exception ex) {
            "".length();
        }
        ea.c = new String(new char[] { 'C', 'h', '\u1edd', ' ', 'L', 'o', 'a', 'd' });
    }
    
    private static boolean b(final int n) {
        int n2;
        if (a(n)) {
            n2 = ea.e[1];
            "".length();
            if ("   ".length() == " ".length()) {
                return ((0xE4 ^ 0xA1 ^ (0x3D ^ 0x37)) & (0x4F ^ 0x43 ^ (0x1 ^ 0x42) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ea.e[0];
        }
        return n2 != 0;
    }
    
    private static boolean c(final int n) {
        return n == 0;
    }
    
    public ea() {
        super();
        this.j = new Form("Auto Ch\u00e1t KTG !");
        this.d = new TextField("Qu\u00e3ng ngh\u1ec9 (milisecond)", new StringBuffer().append(ea.b).toString(), 500, 2);
        this.f = new TextField("N\u1ed9i Dung Ch\u00e1t KTG", ea.a, 10000, 1);
        this.i = new Command("L\u01b0u", 4, 1);
        this.l = new Command("H\u1ee7y", 7, 1);
    }
    
    private static boolean d(final int n) {
        return n > 0;
    }
    
    private static void b() {
        (o = new int[ea.e[23]])[ea.e[0]] = (-(ea.e[24] & ea.e[25]) & (ea.e[26] & ea.e[27]));
        ea.o[ea.e[1]] = "  ".length();
        ea.o[ea.e[2]] = (ea.e[28] & ea.e[29]);
        ea.o[ea.e[3]] = " ".length();
        ea.o[ea.e[4]] = (ea.e[30] ^ ea.e[31]);
        ea.o[ea.e[5]] = (ea.e[32] ^ ea.e[33] ^ (ea.e[34] ^ ea.e[35]));
        ea.o[ea.e[7]] = ((ea.e[36] ^ ea.e[37]) & (ea.e[38] ^ ea.e[39] ^ ea.e[22]));
        ea.o[ea.e[6]] = (ea.e[40] ^ ea.e[41]);
        ea.o[ea.e[8]] = (ea.e[42] ^ ea.e[43]);
        ea.o[ea.e[9]] = (ea.e[44] ^ ea.e[12] ^ (ea.e[45] ^ ea.e[46]));
        ea.o[ea.e[10]] = (-(ea.e[47] ^ ea.e[48]) & (ea.e[49] & ea.e[50]));
        ea.o[ea.e[11]] = "   ".length();
        ea.o[ea.e[12]] = (ea.e[51] + ea.e[44] - ea.e[52] + ea.e[53] ^ ea.e[54] + ea.e[19] - ea.e[6] + ea.e[13]);
        ea.o[ea.e[13]] = (ea.e[55] ^ ea.e[56]);
        ea.o[ea.e[14]] = (ea.e[57] ^ ea.e[58] ^ (ea.e[3] ^ ea.e[59]));
        ea.o[ea.e[15]] = (ea.e[60] ^ ea.e[61] ^ (ea.e[62] ^ ea.e[12]));
        ea.o[ea.e[16]] = (ea.e[63] ^ ea.e[64]);
        ea.o[ea.e[17]] = (ea.e[65] ^ ea.e[66] ^ (ea.e[67] ^ ea.e[68]));
        ea.o[ea.e[18]] = (ea.e[32] ^ ea.e[69] ^ (ea.e[70] ^ ea.e[71]));
    }
    
    private static boolean a(final int n, final int n2) {
        return n < n2;
    }
    
    private static void c() {
        (e = new int[72])[0] = ((120 + 109 - 81 + 8 ^ 150 + 170 - 290 + 156) & (0x22 ^ 0x3D ^ (0xBD ^ 0x84) ^ -" ".length()));
        ea.e[1] = " ".length();
        ea.e[2] = "  ".length();
        ea.e[3] = "   ".length();
        ea.e[4] = (0x67 ^ 0x26 ^ (0xCF ^ 0x8A));
        ea.e[5] = (139 + 150 - 239 + 132 ^ 120 + 91 - 172 + 140);
        ea.e[6] = (0x40 ^ 0x47);
        ea.e[7] = (0xE0 ^ 0xB1 ^ (0x42 ^ 0x15));
        ea.e[8] = (128 + 76 - 177 + 106 ^ 87 + 19 - 20 + 55);
        ea.e[9] = (0x2F ^ 0x56 ^ (0x6 ^ 0x76));
        ea.e[10] = (0x92 ^ 0xA9 ^ (0x37 ^ 0x6));
        ea.e[11] = (61 + 55 + 34 + 25 ^ 118 + 93 - 200 + 153);
        ea.e[12] = (0x5D ^ 0x51);
        ea.e[13] = (1 + 19 + 93 + 41 ^ 134 + 117 - 216 + 116);
        ea.e[14] = (0x42 ^ 0x4C);
        ea.e[15] = (111 + 94 - 95 + 32 ^ 101 + 18 - 42 + 52);
        ea.e[16] = (0x4F ^ 0x20 ^ 28 + 110 - 51 + 40);
        ea.e[17] = (0xE4 ^ 0xC7 ^ (0x7D ^ 0x4F));
        ea.e[18] = (0x48 ^ 0x54 ^ (0xBE ^ 0xB0));
        ea.e[19] = (0x2F ^ 0x78 ^ (0x20 ^ 0x53));
        ea.e[20] = (0x3 ^ 0x70);
        ea.e[21] = (0xE5 ^ 0xB0);
        ea.e[22] = -" ".length();
        ea.e[23] = (0x7D ^ 0x4 ^ (0x5A ^ 0x30));
        ea.e[24] = -(-(0xFFFFAFC7 & 0x75BB) & (0xFFFFBDBB & 0x77FF));
        ea.e[25] = (-(0xFFFF97E7 & 0x69DD) & (0xFFFFFFFD & 0x3FFF));
        ea.e[26] = -(-(142 + 163 - 287 + 176) & (0xFFFFB9D7 & 0x56ED));
        ea.e[27] = (0xFFFFBFFF & 0x7FF7);
        ea.e[28] = -(0xFFFFFEDD & 0x11E6);
        ea.e[29] = (0xFFFFBFD7 & 0x77FB);
        ea.e[30] = 49 + 86 - 1 + 1;
        ea.e[31] = 0 + 99 - 10 + 42;
        ea.e[32] = (84 + 37 - 23 + 34 ^ 122 + 0 + 56 + 13);
        ea.e[33] = (0x9 ^ 0x3B);
        ea.e[34] = (0x63 ^ 0x45);
        ea.e[35] = (0x5F ^ 0x77);
        ea.e[36] = (0x2F ^ 0x7A ^ (0xA5 ^ 0x8D));
        ea.e[37] = (21 + 57 + 112 + 49 ^ 106 + 58 - 78 + 107);
        ea.e[38] = (0xF1 ^ 0xBF) + "   ".length() - -(0xD1 ^ 0xA4) + (0x33 ^ 0x16);
        ea.e[39] = (0x60 ^ 0x35) + (0x25 ^ 0x4B) - (67 + 61 + 35 + 21) + (139 + 61 - 139 + 112);
        ea.e[40] = (0xE0 ^ 0x82);
        ea.e[41] = (0xEE ^ 0xA7 ^ (0x10 ^ 0x33));
        ea.e[42] = 29 + 225 - 29 + 1;
        ea.e[43] = (0x98 ^ 0xC1) + (0x52 ^ 0x15) - (18 + 26 + 48 + 58) + (27 + 76 + 39 + 9);
        ea.e[44] = (0xAF ^ 0x91);
        ea.e[45] = 198 + 117 - 126 + 12 + (41 + 100 - 0 + 69) - (0xFFFFCF7B & 0x31E6) + (96 + 65 - 127 + 151);
        ea.e[46] = 57 + 91 - 69 + 50 + (0x39 ^ 0x55) - (22 + 47 + 80 + 16) + (0x51 ^ 0x31);
        ea.e[47] = (0x64 ^ 0x33);
        ea.e[48] = (0x2D ^ 0x5B);
        ea.e[49] = -(-(0xFFFFB77D & 0x49F3) & (0xFFFFFF7F & 0x61F1));
        ea.e[50] = (-1 & 0x7EFD);
        ea.e[51] = (42 + 61 - 72 + 112 ^ 150 + 39 - 43 + 9);
        ea.e[52] = (0x2E ^ 0xC);
        ea.e[53] = 152 + 21 - 35 + 38;
        ea.e[54] = 42 + 47 - 10 + 71;
        ea.e[55] = (102 + 83 - 83 + 31 ^ 130 + 10 - 12 + 19);
        ea.e[56] = (0x95 ^ 0xAD ^ (0x49 ^ 0x2B));
        ea.e[57] = (0xD4 ^ 0xB0 ^ (0xB5 ^ 0x9A));
        ea.e[58] = (0x7C ^ 0x9);
        ea.e[59] = (0x1C ^ 0x24);
        ea.e[60] = (0x6B ^ 0x2) + (107 + 38 - 102 + 103) - (43 + 63 + 40 + 42) + (61 + 115 - 151 + 152);
        ea.e[61] = 10 + 120 - 74 + 106;
        ea.e[62] = (0xBF ^ 0x8E);
        ea.e[63] = 67 + 118 - 154 + 112;
        ea.e[64] = (0x64 ^ 0x1F) + (0xD7 ^ 0x9F) - (44 + 71 - 4 + 31) + (0xF ^ 0x5B);
        ea.e[65] = (0x92 ^ 0xAE ^ (0xCB ^ 0x92));
        ea.e[66] = (0xAE ^ 0x98);
        ea.e[67] = 182 + 134 - 156 + 30;
        ea.e[68] = 46 + 62 - 0 + 32;
        ea.e[69] = (0x59 ^ 0x3F);
        ea.e[70] = (0x2 ^ 0x7A);
        ea.e[71] = (0x18 ^ 0x14 ^ (0x53 ^ 0x1E));
    }
    
    private static boolean b(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean e(final int n) {
        int n2;
        if (c(n)) {
            n2 = ea.e[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x78 ^ 0x30) & ~(0x19 ^ 0x51)) != 0x0;
            }
        }
        else {
            n2 = ea.e[0];
        }
        return n2 != 0;
    }
    
    private static boolean f(final int n) {
        return n < 0;
    }
}
