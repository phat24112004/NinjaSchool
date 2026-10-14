import javax.microedition.rms.*;
import javax.microedition.midlet.*;
import java.io.*;
import javax.microedition.lcdui.*;

public final class dp implements CommandListener
{
    public static int a;
    private TextField n;
    public static int b;
    public static int c;
    public static int d;
    private final Command o;
    public static int e;
    public static int f;
    public static byte g;
    private static final int[] p;
    public static int h;
    public static int i;
    private final ChoiceGroup q;
    private static ByteArrayOutputStream r;
    private TextField s;
    private static ByteArrayInputStream u;
    private TextField v;
    public static int j;
    private static DataOutputStream w;
    private static DataInputStream x;
    public static byte k;
    private TextField z;
    private final Command ab;
    private static RecordStore ac;
    private final ChoiceGroup ad;
    private final Form ae;
    private static final int[] ag;
    public static int l;
    public static int nvdv_st_h;
    public static int nvdv_st_m;
    private final ChoiceGroup nvdv_cg;
    private TextField nvdv_m;
    private TextField nvdv_h;
    public static byte nvdv_g;
    private final ChoiceGroup tatu_cg;
    private TextField tatu_h;
    private TextField tatu_m;
    public static int tatu_st_h;
    public static int tatu_st_m;
    public static byte tatu_g;
    public static boolean isWaiting60s;
    public static long timeLB;
    public static int tatuCount;
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (a(a(command, this.ab) ? 1 : 0)) {
            try {
                dp.tatu_g = (byte)this.tatu_cg.getSelectedIndex();
                dp.tatu_st_h = Integer.parseInt(this.tatu_h.getString());
                dp.tatu_st_m = Integer.parseInt(this.tatu_m.getString());
                dp.nvdv_g = (byte)this.nvdv_cg.getSelectedIndex();
                dp.nvdv_st_h = Integer.parseInt(this.nvdv_h.getString());
                dp.nvdv_st_m = Integer.parseInt(this.nvdv_m.getString());
                dp.g = (byte)this.ad.getSelectedIndex();
                dp.k = (byte)this.q.getSelectedIndex();
                dp.a = Integer.parseInt(this.z.getString());
                dp.b = Integer.parseInt(this.v.getString());
                dp.l = Integer.parseInt(this.s.getString());
                dp.h = Integer.parseInt(this.n.getString());
                dp.r = new ByteArrayOutputStream();
                dp.w = new DataOutputStream(dp.r);
                try {
                    dp.w.writeByte(dp.g);
                    dp.w.writeInt(dp.a);
                    dp.w.writeInt(dp.b);
                    dp.w.writeByte(dp.k);
                    dp.w.writeInt(dp.l);
                    dp.w.writeInt(dp.h);
                    dp.w.writeInt(dp.c);
                    dp.w.writeInt(dp.f);
                    dp.w.writeInt(dp.i);
                    dp.w.writeInt(dp.e);
                    dp.w.writeInt(dp.d);
                    dp.w.writeInt(dp.j);
                    dp.w.writeByte(dp.nvdv_g);
                    dp.w.writeInt(dp.nvdv_st_h);
                    dp.w.writeInt(dp.nvdv_st_m);
                    dp.w.writeByte(dp.tatu_g);
                    dp.w.writeInt(dp.tatu_st_h);
                    dp.w.writeInt(dp.tatu_st_m);
                    dp.w.flush();
                    dp.w.close();
                    dp.r.flush();
                    dp.ac = RecordStore.openRecordStore("nvhn", true);
                    final byte[] byteArray = dp.r.toByteArray();
                    dp.r.close();
                    if (a(c(dp.ac.getNumRecords()) ? 1 : 0)) {
                        dp.ac.addRecord(byteArray, 0, byteArray.length);
                        "".length();
                        "".length();
                        "".length();
                        if (f(dp.ag[34] ^ dp.ag[35] ^ (dp.ag[36] ^ dp.ag[37]))) {
                            return;
                        }
                    }
                    else {
                        dp.ac.setRecord(1, byteArray, 0, byteArray.length);
                    }
                    dp.ac.closeRecordStore();
                    "".length();
                    "".length();
                    if (a("   ".length(), dp.ag[38] ^ dp.ag[39])) {
                        return;
                    }
                }
                catch (final Exception ex) {
                    "".length();
                }
                ff.b("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
                "".length();
                "".length();
                if (e(-" ".length())) {
                    return;
                }
            }
            catch (final NumberFormatException ex2) {
                "".length();
            }
        }
        a((Displayable)ey.c());
    }
    
    private static boolean a(final int n, final int n2) {
        return n > n2;
    }
    
    static {
        b();
        c();
        dp.c = 490;
        dp.f = 833;
        dp.i = 28;
        dp.e = 37;
        dp.a = 0;
        dp.b = 0;
        dp.l = 0;
        dp.h = 50;
        dp.d = dp.ag[6];
        dp.g = 1;
        dp.k = 1;
        dp.nvdv_g = 0;
        dp.nvdv_st_h = 0;
        dp.nvdv_st_m = 0;
        dp.tatu_g = 0;
        dp.tatu_st_h = 0;
        dp.tatu_st_m = 0;
        try {
            if (a(b((dp.ac = RecordStore.openRecordStore("nvhn", true)).getNumRecords()) ? 1 : 0)) {
                dp.u = new ByteArrayInputStream(dp.ac.getRecord(1));
                dp.g = (dp.x = new DataInputStream(dp.u)).readByte();
                dp.a = dp.x.readInt();
                dp.b = dp.x.readInt();
                dp.k = dp.x.readByte();
                dp.l = dp.x.readInt();
                dp.h = dp.x.readInt();
                dp.c = dp.x.readInt();
                dp.f = dp.x.readInt();
                dp.i = dp.x.readInt();
                dp.e = dp.x.readInt();
                dp.d = dp.x.readInt();
                dp.j = dp.x.readInt();
                dp.nvdv_g = dp.x.readByte();
                dp.nvdv_st_h = dp.x.readInt();
                dp.nvdv_st_m = dp.x.readInt();
                dp.tatu_g = dp.x.readByte();
                dp.tatu_st_h = dp.x.readInt();
                dp.tatu_st_m = dp.x.readInt();
            }
            dp.ac.closeRecordStore();
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static void b() {
        (ag = new int[40])[0] = (0xC6 ^ 0xB8 ^ (0x28 ^ 0x53));
        dp.ag[1] = (0x44 ^ 0x42);
        dp.ag[2] = (113 + 84 - 75 + 64 ^ 65 + 116 - 47 + 55);
        dp.ag[3] = (18 + 127 - 88 + 89 ^ 46 + 142 - 65 + 31);
        dp.ag[4] = (0xAC ^ 0xA8);
        dp.ag[5] = (0x48 ^ 0x41);
        dp.ag[6] = (-(0xFFFFD6D4 & 0x7D3F) & (-1 & 0x57FB));
        dp.ag[7] = " ".length();
        dp.ag[8] = ((0x7C ^ 0x59) & ~(0x76 ^ 0x53));
        dp.ag[9] = (0x6F ^ 0x65);
        dp.ag[10] = (0xFE ^ 0xBF);
        dp.ag[11] = (0x12 ^ 0x19 ^ (0x8A ^ 0xC4));
        dp.ag[12] = "  ".length();
        dp.ag[13] = "   ".length();
        dp.ag[14] = 130 + 93 - 217 + 125;
        dp.ag[15] = 34 + 136 - 131 + 148;
        dp.ag[16] = 25 + 47 + 11 + 63;
        dp.ag[17] = 34 + 61 - 59 + 123 + (51 + 15 - 30 + 99) - (0xFFFF9958 & 0x67B7) + (70 + 113 - 99 + 64);
        dp.ag[18] = -" ".length();
        dp.ag[19] = -(0xFFFFA5F9 & 0x5B2F);
        dp.ag[20] = (-(0xF3 ^ 0xB6) & (0xFFFFFF6D & 0x7FFF));
        dp.ag[21] = -"  ".length();
        dp.ag[22] = (0xFFFFFFEB & 0x7FFF);
        dp.ag[23] = -(0xFFFFAFD7 & 0x7C2B);
        dp.ag[24] = (-(0xFFFFD7F5 & 0x789F) & (0xFFFFFFF7 & 0x7FDF));
        dp.ag[25] = (0x32 ^ 0x43 ^ (0xA2 ^ 0xA5));
        dp.ag[26] = (0x8E ^ 0xBC);
        dp.ag[27] = (0xEE ^ 0x9A);
        dp.ag[28] = (0xF ^ 0x1C ^ (0x9 ^ 0x36));
        dp.ag[29] = (0x51 ^ 0x58) + (0x22 ^ 0x1E) - -(0x80 ^ 0xC5) + (0x5 ^ 0x13);
        dp.ag[30] = 131 + 79 - 200 + 164;
        dp.ag[31] = (0xF3 ^ 0x8D ^ (0xE1 ^ 0x86));
        dp.ag[32] = 68 + 48 - 16 + 64;
        dp.ag[33] = 27 + 107 - 50 + 65 + (0xDF ^ 0xC6) - (0xF ^ 0x16) + " ".length();
        dp.ag[34] = (2 + 145 - 35 + 57 ^ 42 + 137 - 115 + 88);
        dp.ag[35] = (0x92 ^ 0xB3);
        dp.ag[36] = (0x26 ^ 0x5B);
        dp.ag[37] = (103 + 64 - 80 + 112 ^ 121 + 4 - 69 + 118);
        dp.ag[38] = (0x90 ^ 0xA3 ^ (0xF4 ^ 0x94));
        dp.ag[39] = (0x0 ^ 0x57);
    }
    
    public final void a() {
        this.ae.append((Item)this.tatu_cg);
        "".length();
        this.ae.append((Item)this.tatu_h);
        "".length();
        this.ae.append((Item)this.tatu_m);
        "".length();
        this.ae.append((Item)this.nvdv_cg);
        "".length();
        this.ae.append((Item)this.nvdv_h);
        "".length();
        this.ae.append((Item)this.nvdv_m);
        "".length();
        this.ae.append((Item)this.ad);
        "".length();
        this.ae.append((Item)this.z);
        "".length();
        this.ae.append((Item)this.v);
        "".length();
        this.ae.append((Item)this.q);
        "".length();
        this.ae.append((Item)this.s);
        "".length();
        this.ae.append((Item)this.n);
        this.ae.addCommand(this.ab);
        this.ae.addCommand(this.o);
        this.ae.setCommandListener((CommandListener)this);
        this.tatu_cg.setSelectedIndex((int)dp.tatu_g, true);
        this.ad.setSelectedIndex((int)dp.g, true);
        this.q.setSelectedIndex((int)dp.k, true);
        this.nvdv_cg.setSelectedIndex((int)dp.nvdv_g, true);
        a((Displayable)this.ae);
    }
    
    private static boolean b(final int n) {
        int n2;
        if (a(n)) {
            n2 = dp.ag[7];
            "".length();
            if (-" ".length() > 0) {
                return ((0x3F ^ 0x3A) & ~(0x20 ^ 0x25)) != 0x0;
            }
        }
        else {
            n2 = dp.ag[8];
        }
        return n2 != 0;
    }
    
    public dp() {
        super();
        this.ae = new Form("C\u00e0i \u0111\u1eb7t NVHN <Ki\u00ean Phan>");
        this.ab = new Command("L\u01b0u", 4, 1);
        this.o = new Command("H\u1ee7y", 3, 1);
        this.tatu_cg = new ChoiceGroup("T\u1ef1 L\u00e0m T\u00e0 Th\u00fa!", 1, new String[] { "T\u1eaft", "B\u1eadt" }, (Image[])null);
        this.tatu_h = new TextField("H\u1eb9n Gi\u1edd L\u00e0m T\u00e0 Th\u00fa!", new StringBuffer().append(dp.tatu_st_h).toString(), 2, 2);
        this.tatu_m = new TextField("H\u1eb9n Ph\u00fat L\u00e0m T\u00e0 Th\u00fa!", new StringBuffer().append(dp.tatu_st_m).toString(), 2, 2);
        this.nvdv_cg = new ChoiceGroup("T\u1ef1 L\u00e0m NVDV!", 1, new String[] { "T\u1eaft", "B\u1eadt" }, (Image[])null);
        this.nvdv_h = new TextField("H\u1eb9n Gi\u1edd L\u00e0m NVDV!", new StringBuffer().append(dp.nvdv_st_h).toString(), 2, 2);
        this.nvdv_m = new TextField("H\u1eb9n Ph\u00fat L\u00e0m NVDV!", new StringBuffer().append(dp.nvdv_st_m).toString(), 2, 2);
        this.ad = new ChoiceGroup("L\u00e0m NVHN!", 1, new String[] { "B\u1eadt", "T\u1eaft" }, (Image[])null);
        this.z = new TextField("H\u1eb9n Gi\u1edd L\u00e0m!", new StringBuffer().append(dp.a).toString(), 2, 2);
        this.v = new TextField("H\u1eb9n Ph\u00fat L\u00e0m!", new StringBuffer().append(dp.b).toString(), 2, 2);
        this.q = new ChoiceGroup("T\u1ef1 \u0110i\u1ec3m Danh!", 1, new String[] { "B\u1eadt", "T\u1eaft" }, (Image[])null);
        this.s = new TextField("H\u1eb9n Gi\u1edd \u0110i\u1ec3m Danh!", new StringBuffer().append(dp.l).toString(), 2, 2);
        this.n = new TextField("H\u1eb9n Ph\u00fat \u0110i\u1ec3m Danh!", new StringBuffer().append(dp.h).toString(), 2, 2);
    }
    
    private static boolean c(final int n) {
        int n2;
        if (d(n)) {
            n2 = dp.ag[7];
            "".length();
            if ((0x61 ^ 0x23 ^ (0xDE ^ 0x98)) <= ((0x14 ^ 0x5C ^ (0x1F ^ 0x36)) & (0x66 ^ 0x6C ^ (0x4D ^ 0x26) ^ -" ".length()))) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dp.ag[8];
        }
        return n2 != 0;
    }
    
    private static boolean d(final int n) {
        return n == 0;
    }
    
    private static boolean e(final int n) {
        return n > 0;
    }
    
    private static boolean a(final Object o, final Object o2) {
        int n;
        if (b(o, o2)) {
            n = dp.ag[7];
            "".length();
            if (null != null) {
                return ((0x16 ^ 0x41 ^ (0xD9 ^ 0x99)) & (0x7B ^ 0x1D ^ (0x11 ^ 0x60) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = dp.ag[8];
        }
        return n != 0;
    }
    
    private static boolean f(final int n) {
        return n <= 0;
    }
    
    private static void c() {
        (p = new int[dp.ag[9]])[dp.ag[8]] = (dp.ag[10] ^ dp.ag[11]);
        dp.p[dp.ag[7]] = " ".length();
        dp.p[dp.ag[12]] = "   ".length();
        dp.p[dp.ag[13]] = "  ".length();
        dp.p[dp.ag[4]] = ((dp.ag[14] ^ dp.ag[15]) & (dp.ag[16] ^ dp.ag[17] ^ dp.ag[18]));
        dp.p[dp.ag[0]] = (-(dp.ag[19] & dp.ag[20]) & (dp.ag[21] & dp.ag[22]));
        dp.p[dp.ag[1]] = (dp.ag[23] & dp.ag[24]);
        dp.p[dp.ag[2]] = (dp.ag[25] ^ dp.ag[26] ^ (dp.ag[27] ^ dp.ag[28]));
        dp.p[dp.ag[3]] = (dp.ag[29] ^ dp.ag[30] ^ (dp.ag[31] ^ dp.ag[26]));
        dp.p[dp.ag[5]] = (dp.ag[32] ^ dp.ag[33]);
    }
    
    private static boolean b(final Object o, final Object o2) {
        return o == o2;
    }
}
