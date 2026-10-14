import javax.microedition.rms.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.io.*;

public final class ek implements CommandListener
{
    private static DataOutputStream d;
    private static ByteArrayOutputStream e;
    private final Form f;
    private final Command g;
    private static DataInputStream h;
    private TextField i;
    public static int a;
    private static RecordStore j;
    private static ByteArrayInputStream k;
    private final Command l;
    public static int b;
    private static final int[] m;
    public static int c;
    private TextField n;
    private TextField o;
    private static final int[] p;
    public static boolean kkk;
    private final ChoiceGroup kkkk;
    public static boolean atb;
    public static boolean aq;
    public static boolean fb;
    public static boolean xdh;
    public static boolean pkn;
    private TextField cao;
    private TextField ngang;
    public static int ngang;
    public static int cao;
    public static boolean locdo;
    public static boolean map;
    public static boolean tansat;
    public static boolean danhnhanh;
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean a(final int n) {
        return n == 0;
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    private static boolean c(final int n) {
        return n < 0;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = ek.p[0];
            "".length();
            if (((0x9A ^ 0xC2) & ~(0x3B ^ 0x63)) >= "  ".length()) {
                return ((0x42 ^ 0x68) & ~(0x46 ^ 0x6C)) != 0x0;
            }
        }
        else {
            n = ek.p[1];
        }
        return n != 0;
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    public final void a() {
        this.f.append((Item)this.kkkk);
        "".length();
        this.f.append((Item)this.ngang);
        "".length();
        this.f.append((Item)this.cao);
        "".length();
        this.f.append((Item)this.n);
        "".length();
        this.f.append((Item)this.i);
        "".length();
        this.f.append((Item)this.o);
        "".length();
        this.f.addCommand(this.l);
        this.f.addCommand(this.g);
        this.f.setCommandListener((CommandListener)this);
        a((Displayable)this.f);
    }
    
    private static boolean d(final int n) {
        int n2;
        if (b(n)) {
            n2 = ek.p[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return (("  ".length() ^ (0x39 ^ 0x71)) & (0xE2 ^ 0x94 ^ (0x57 ^ 0x6B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ek.p[1];
        }
        return n2 != 0;
    }
    
    static {
        b();
        c();
        ek.ngang = 20;
        ek.cao = 1;
        ek.a = 39;
        ek.c = 0;
        ek.b = 0;
        ek.fb = true;
        ek.atb = true;
        if (b(d((ek.j = RecordStore.openRecordStore("npc_config", true)).getNumRecords()) ? 1 : 0)) {
            ek.k = new ByteArrayInputStream(ek.j.getRecord(1));
            ek.ngang = (ek.h = new DataInputStream(ek.k)).readInt();
            ek.cao = ek.h.readInt();
            ek.a = ek.h.readInt();
            ek.c = ek.h.readInt();
            ek.b = ek.h.readInt();
            if (ek.h.available() > 0) {
                ek.kkk = ek.h.readBoolean();
                ek.xdh = ek.h.readBoolean();
                ek.atb = ek.h.readBoolean();
                ek.fb = ek.h.readBoolean();
                ek.aq = ek.h.readBoolean();
                ek.pkn = ek.h.readBoolean();
                ek.locdo = ek.h.readBoolean();
                ek.map = ek.h.readBoolean();
                ek.danhnhanh = ek.h.readBoolean();
                if (ek.h.available() > 0) {
                    cv.nextMap = ek.h.readInt();
                }
            }
        }
        if (cv.nextMap == 0) {
            cv.nextMap = 10;
        }
        ek.j.closeRecordStore();
    }
    
    private static void b() {
        (p = new int[27])[0] = " ".length();
        ek.p[1] = ((0x2F ^ 0x3C) & ~(0x31 ^ 0x22));
        ek.p[2] = (0x8D ^ 0x8B);
        ek.p[3] = (55 + 73 + 37 + 49 ^ 116 + 122 - 201 + 95);
        ek.p[4] = (0xE7 ^ 0xB1);
        ek.p[5] = "  ".length();
        ek.p[6] = "   ".length();
        ek.p[7] = (0x6C ^ 0x5C ^ (0xA ^ 0x3E));
        ek.p[8] = (10 + 159 - 20 + 14 ^ 162 + 42 - 190 + 158);
        ek.p[9] = (158 + 67 - 118 + 83 ^ 56 + 45 - 39 + 99);
        ek.p[10] = (0x67 ^ 0x4D) + (0xAF ^ 0xBD) - (0xBF ^ 0x85) + (126 + 142 - 106 + 18);
        ek.p[11] = 84 + 34 - 55 + 103;
        ek.p[12] = -" ".length();
        ek.p[13] = (0x4A ^ 0x4F);
        ek.p[14] = (0x6 ^ 0x19 ^ (0xF2 ^ 0xB3));
        ek.p[15] = (0xA7 ^ 0x8A);
        ek.p[16] = (0x31 ^ 0x22) + (60 + 0 - 54 + 200) - (41 + 78 - 95 + 144) + (28 + 176 - 103 + 85);
        ek.p[17] = 122 + 63 - 181 + 131 + (0xB6 ^ 0x81) - (16 + 95 - 16 + 86) + (102 + 122 - 132 + 66);
        ek.p[18] = (0x64 ^ 0x2D ^ (0xEF ^ 0xBF));
        ek.p[19] = (0xF4 ^ 0x8D);
        ek.p[20] = (0x23 ^ 0x70);
        ek.p[21] = (92 + 23 - 62 + 99 ^ 86 + 112 - 65 + 6);
        ek.p[22] = (0x0 ^ 0x2B ^ (0x1E ^ 0x5C));
        ek.p[23] = 3 + 15 + 20 + 157;
        ek.p[24] = 23 + 3 + 45 + 62 + (0x30 ^ 0x35) - (0x48 ^ 0x9) + (0xDA ^ 0x96);
        ek.p[25] = (0xF5 ^ 0xC1) + (157 + 88 - 123 + 88) - (0xCB ^ 0x9B) + (0xBF ^ 0xA0);
        ek.p[26] = (0x55 ^ 0x66) + (0xD5 ^ 0xC6) - -(0x13 ^ 0x1D) + (0x7C ^ 0x4B);
    }
    
    private static boolean a(final int n, final int n2) {
        return n >= n2;
    }
    
    private static void c() {
        (m = new int[ek.p[2]])[ek.p[1]] = (ek.p[3] ^ ek.p[4]);
        ek.m[ek.p[0]] = " ".length();
        ek.m[ek.p[5]] = "   ".length();
        ek.m[ek.p[6]] = "  ".length();
        ek.m[ek.p[7]] = ((ek.p[8] ^ ek.p[9]) & (ek.p[10] ^ ek.p[11] ^ ek.p[12]));
        ek.m[ek.p[13]] = (ek.p[14] ^ ek.p[15] ^ (ek.p[16] ^ ek.p[17]));
    }
    
    private static boolean e(final int n) {
        int n2;
        if (a(n)) {
            n2 = ek.p[0];
            "".length();
            if ((110 + 79 - 166 + 111 ^ 4 + 46 + 71 + 9) < (0x22 ^ 0x4D ^ (0x49 ^ 0x22))) {
                return ((0x65 ^ 0x63 ^ (0x69 ^ 0x25)) & (0x78 ^ 0x6D ^ (0xD4 ^ 0x8B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ek.p[1];
        }
        return n2 != 0;
    }
    
    public ek() {
        super();
        this.f = new Form("C\u00e0i \u0111\u1eb7t Chung");
        this.l = new Command("L\u01b0u", 4, 1);
        this.g = new Command("H\u1ee7y", 3, 1);
        (this.kkkk = new ChoiceGroup("C\u00e0i \u0110\u1eb7t", 2, new String[] { "5 skill", "X\u00f3a \u0110\u1ecba H\u00ecnh", "\u1ea8n Th\u00f4ng B\u00e1o", "B\u0103ng Qu\u00e1i", "\u1ea8n Qu\u00e1i", "pk ng\u01b0\u1eddi 5 skill", "l\u1ecdc \u0111\u1ed3 \u0111\u1eb9p ch\u1ec9 s\u1ed1", "nextmap nhanh", "\u0111\u00e1nh nhanh" }, (Image[])null)).setSelectedIndex(0, ek.kkk);
        this.kkkk.setSelectedIndex(1, ek.xdh);
        this.kkkk.setSelectedIndex(2, ek.atb);
        this.kkkk.setSelectedIndex(3, ek.fb);
        this.kkkk.setSelectedIndex(4, ek.aq);
        this.kkkk.setSelectedIndex(5, ek.pkn);
        this.kkkk.setSelectedIndex(6, ek.locdo);
        this.kkkk.setSelectedIndex(7, ek.map);
        this.kkkk.setSelectedIndex(8, ek.danhnhanh);
        this.ngang = new TextField("Fake t\u1ea7m ngang:", new StringBuffer().append(ek.ngang).toString(), 4, 2);
        this.cao = new TextField("Fake t\u1ea7m cao:", new StringBuffer().append(ek.cao).toString(), 4, 2);
        this.n = new TextField("NPC ID:", new StringBuffer().append(ek.a).toString(), 2, 2);
        this.i = new TextField("Menu Index:", new StringBuffer().append(ek.c).toString(), 2, 2);
        this.o = new TextField("Sub Index:", new StringBuffer().append(ek.b).toString(), 2, 2);
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (b(b(command, this.l) ? 1 : 0)) {
            try {
                ek.ngang = Integer.parseInt(this.ngang.getString());
                ek.cao = Integer.parseInt(this.cao.getString());
                ek.a = Integer.parseInt(this.n.getString());
                ek.c = Integer.parseInt(this.i.getString());
                ek.b = Integer.parseInt(this.o.getString());
                ek.e = new ByteArrayOutputStream();
                ek.d = new DataOutputStream(ek.e);
                try {
                    ek.d.writeInt(ek.ngang);
                    ek.d.writeInt(ek.cao);
                    ek.d.writeInt(ek.a);
                    ek.d.writeInt(ek.c);
                    ek.d.writeInt(ek.b);
                    ek.kkk = this.kkkk.isSelected(0);
                    ek.xdh = this.kkkk.isSelected(1);
                    ek.atb = this.kkkk.isSelected(2);
                    ek.fb = this.kkkk.isSelected(3);
                    ek.aq = this.kkkk.isSelected(4);
                    ek.pkn = this.kkkk.isSelected(5);
                    ek.locdo = this.kkkk.isSelected(6);
                    ek.map = this.kkkk.isSelected(7);
                    ek.danhnhanh = this.kkkk.isSelected(8);
                    ek.d.writeBoolean(ek.kkk);
                    ek.d.writeBoolean(ek.xdh);
                    ek.d.writeBoolean(ek.atb);
                    ek.d.writeBoolean(ek.fb);
                    ek.d.writeBoolean(ek.aq);
                    ek.d.writeBoolean(ek.pkn);
                    ek.d.writeBoolean(ek.locdo);
                    ek.d.writeBoolean(ek.map);
                    ek.d.writeBoolean(ek.danhnhanh);
                    ek.d.writeInt(cv.nextMap);
                    ek.d.flush();
                    ek.d.close();
                    ek.e.flush();
                    ek.j = RecordStore.openRecordStore("npc_config", true);
                    final byte[] byteArray = ek.e.toByteArray();
                    ek.e.close();
                    if (b(e(ek.j.getNumRecords()) ? 1 : 0)) {
                        ek.j.addRecord(byteArray, 0, byteArray.length);
                        "".length();
                        "".length();
                        "".length();
                        if (c((ek.p[18] ^ ek.p[19] ^ (ek.p[20] ^ ek.p[21])) & (ek.p[22] ^ ek.p[9] ^ (ek.p[23] ^ ek.p[24]) ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        ek.j.setRecord(1, byteArray, 0, byteArray.length);
                    }
                    ek.j.closeRecordStore();
                    "".length();
                    "".length();
                    if (a((Object)null)) {
                        return;
                    }
                }
                catch (final Exception ex) {
                    "".length();
                }
                ff.b("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
                "".length();
                "".length();
                if (a("   ".length(), ek.p[25] ^ ek.p[26] ^ (ek.p[7] ^ ek.p[14]))) {
                    return;
                }
            }
            catch (final NumberFormatException ex2) {
                "".length();
            }
        }
        a((Displayable)ey.a);
    }
}
