import javax.microedition.rms.*;
import java.io.*;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public final class db implements CommandListener
{
    public static int a;
    public static boolean b;
    private final ChoiceGroup q;
    private static ByteArrayInputStream r;
    public static boolean c;
    public static byte d;
    private static RecordStore s;
    private static final int[] t;
    private final Command u;
    public static boolean e;
    public static int f;
    private TextField v;
    public static int g;
    private TextField w;
    private final Form x;
    private static DataInputStream y;
    private final ChoiceGroup z;
    private static ByteArrayOutputStream aa;
    public static int h;
    public static String i;
    public static boolean j;
    public static int k;
    public static boolean l;
    private TextField ab;
    private TextField ac;
    private TextField ad;
    public static int m;
    private TextField ae;
    private static final int[] af;
    private TextField ag;
    public static boolean n;
    private final ChoiceGroup ah;
    private final Command ai;
    private static DataOutputStream aj;
    public static boolean o;
    public static boolean p;
    private final ChoiceGroup autoDvpChoice;
    public static int indexDvp;
    public static int isAutoDvp;
    private TextField indexDvpField;
    public static int bhcsIndex;
    private final TextField bhcsField;
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean a(final int n) {
        return n == 0;
    }
    
    private static void b() {
        (t = new int[38])[0] = (0x6 ^ 0x74 ^ (0x25 ^ 0x53));
        db.t[1] = " ".length();
        db.t[2] = (0x21 ^ 0x29);
        db.t[3] = (0x46 ^ 0x8 ^ (0xF7 ^ 0xB0));
        db.t[4] = (155 + 140 - 215 + 105 ^ 54 + 82 - 112 + 164);
        db.t[5] = ((0xA1 ^ 0xA6) & ~(0x8F ^ 0x88));
        db.t[6] = "  ".length();
        db.t[7] = "   ".length();
        db.t[8] = (0x66 ^ 0x60);
        db.t[9] = (0x38 ^ 0xF ^ (0x7B ^ 0x4B));
        db.t[10] = (0x84 ^ 0xB9 ^ (0x2A ^ 0x1D));
        db.t[11] = (79 + 5 - 9 + 56 ^ 50 + 140 - 84 + 81);
        db.t[12] = (0x6E ^ 0x9 ^ (0xD ^ 0x45));
        db.t[13] = (0x66 ^ 0x34);
        db.t[14] = 10 + 104 - 33 + 93;
        db.t[15] = 41 + 8 + 77 + 10;
        db.t[16] = 5 + 97 + 9 + 21 + (0xD1 ^ 0x94) - (151 + 104 - 197 + 102) + (0xFA ^ 0x8C);
        db.t[17] = -(0xFFFFFE7A & 0x7BEF);
        db.t[18] = (0xFFFFFEF9 & 0x7F6F);
        db.t[19] = 6 + 118 + 6 + 112;
        db.t[20] = (0x17 ^ 0x7B) + (88 + 12 - 90 + 152) - (180 + 121 - 275 + 188) + (59 + 101 - 122 + 93);
        db.t[21] = (0x5 ^ 0x5E ^ (0x11 ^ 0x5C));
        db.t[22] = (0x45 ^ 0xB ^ (0x8 ^ 0x19));
        db.t[23] = -" ".length();
        db.t[24] = (0x2F ^ 0x47);
        db.t[25] = (0xE9 ^ 0xAE ^ (0x2A ^ 0x62));
        db.t[26] = (0x82 ^ 0xB9 ^ (0x46 ^ 0x32));
        db.t[27] = (0x36 ^ 0x18);
        db.t[28] = 23 + 81 - 31 + 116;
        db.t[29] = (0xDD ^ 0xA0) + (0x3A ^ 0x54) - (0x40 ^ 0x3D) + (0x2E ^ 0x3B);
        db.t[30] = (0x17 ^ 0x30);
        db.t[31] = (0xB4 ^ 0xA8);
        db.t[32] = (0xFD ^ 0xAB ^ (0x57 ^ 0x25));
        db.t[33] = (0xA5 ^ 0xC4 ^ (0xFE ^ 0xC7));
        db.t[34] = -(0xAF ^ 0x8A);
        db.t[35] = (0x65 ^ 0x26);
        db.t[36] = (0x67 ^ 0x78);
        db.t[37] = (0x4F ^ 0x71);
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = db.t[1];
            "".length();
            if ((0xC2 ^ 0x9C ^ (0xC1 ^ 0x9B)) < 0) {
                return ((0x19 ^ 0x52 ^ (0x3C ^ 0x39)) & (0xBA ^ 0xC7 ^ (0x30 ^ 0x3) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = db.t[5];
        }
        return n != 0;
    }
    
    public final void a() {
        this.x.append((Item)this.bhcsField);
        this.x.append((Item)this.autoDvpChoice);
        "".length();
        this.x.append((Item)this.indexDvpField);
        "".length();
        this.x.append((Item)this.ah);
        "".length();
        this.x.append((Item)this.w);
        "".length();
        this.x.append((Item)this.ag);
        "".length();
        this.x.append((Item)this.v);
        "".length();
        this.x.append((Item)this.ae);
        "".length();
        this.x.append((Item)this.ac);
        "".length();
        this.x.append((Item)this.ad);
        "".length();
        this.x.append((Item)this.ab);
        "".length();
        this.x.append((Item)this.z);
        "".length();
        this.x.append((Item)this.q);
        "".length();
        this.x.addCommand(this.ai);
        this.x.addCommand(this.u);
        this.x.setCommandListener((CommandListener)this);
        this.ah.setSelectedIndex((int)db.d, (boolean)(db.t[1] != 0));
        this.z.setSelectedIndex(0, db.o);
        this.z.setSelectedIndex(1, db.l);
        this.z.setSelectedIndex(2, db.j);
        this.z.setSelectedIndex(3, db.c);
        this.z.setSelectedIndex(4, db.n);
        this.z.setSelectedIndex(5, db.e);
        this.q.setSelectedIndex(0, db.b);
        this.q.setSelectedIndex(1, db.p);
        this.autoDvpChoice.setSelectedIndex(db.isAutoDvp, true);
        a((Displayable)this.x);
    }
    
    static {
        b();
        c();
        db.bhcsIndex = dp.d;
        db.i = "tenclone";
        db.o = false;
        db.l = false;
        db.j = false;
        db.c = false;
        db.n = false;
        db.e = false;
        db.b = false;
        db.p = false;
        db.k = 1;
        db.f = 20;
        db.a = -1;
        db.g = -1;
        db.m = 2;
        db.h = 0;
        db.indexDvp = 33;
        db.isAutoDvp = 0;
        try {
            if (c(d((db.s = RecordStore.openRecordStore("dvnsoz", true)).getNumRecords()) ? 1 : 0)) {
                db.r = new ByteArrayInputStream(db.s.getRecord(1));
                final DataInputStream dataInputStream = db.y = new DataInputStream(db.r);
                db.d = db.y.readByte();
                db.i = dataInputStream.readUTF();
                db.k = db.y.readInt();
                db.f = db.y.readInt();
                db.a = db.y.readInt();
                db.g = db.y.readInt();
                db.m = db.y.readInt();
                db.h = db.y.readInt();
                db.o = db.y.readBoolean();
                db.l = db.y.readBoolean();
                db.j = db.y.readBoolean();
                db.c = db.y.readBoolean();
                db.n = db.y.readBoolean();
                db.e = db.y.readBoolean();
                db.b = db.y.readBoolean();
                db.p = db.y.readBoolean();
                db.indexDvp = db.y.readInt();
                db.isAutoDvp = db.y.readInt();
                if (db.y.available() >= 4) {
                    db.bhcsIndex = db.y.readInt();
                    dp.d = db.bhcsIndex;
                }
            }
            db.s.closeRecordStore();
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        final boolean c = c(b(command, this.ai) ? 1 : 0);
        db.bhcsIndex = Integer.parseInt(this.bhcsField.getString());
        dp.d = db.bhcsIndex;
        if (c) {
            try {
                db.d = (byte)this.ah.getSelectedIndex();
                db.i = this.w.getString();
                db.k = Integer.parseInt(this.ag.getString());
                db.f = Integer.parseInt(this.v.getString());
                db.a = Integer.parseInt(this.ae.getString());
                db.g = Integer.parseInt(this.ac.getString());
                db.m = Integer.parseInt(this.ad.getString());
                db.h = Integer.parseInt(this.ab.getString());
                db.o = this.z.isSelected(0);
                db.l = this.z.isSelected(1);
                db.j = this.z.isSelected(2);
                db.c = this.z.isSelected(3);
                db.n = this.z.isSelected(4);
                db.e = this.z.isSelected(5);
                db.b = this.q.isSelected(0);
                db.p = this.q.isSelected(1);
                db.indexDvp = Integer.parseInt(this.indexDvpField.getString());
                db.isAutoDvp = this.autoDvpChoice.getSelectedIndex();
                db.aa = new ByteArrayOutputStream();
                db.aj = new DataOutputStream(db.aa);
                try {
                    db.aj.writeByte(db.d);
                    db.aj.writeUTF(db.i);
                    db.aj.writeInt(db.k);
                    db.aj.writeInt(db.f);
                    db.aj.writeInt(db.a);
                    db.aj.writeInt(db.g);
                    db.aj.writeInt(db.m);
                    db.aj.writeInt(db.h);
                    db.aj.writeBoolean(db.o);
                    db.aj.writeBoolean(db.l);
                    db.aj.writeBoolean(db.j);
                    db.aj.writeBoolean(db.c);
                    db.aj.writeBoolean(db.n);
                    db.aj.writeBoolean(db.e);
                    db.aj.writeBoolean(db.b);
                    db.aj.writeBoolean(db.p);
                    db.aj.writeInt(db.indexDvp);
                    db.aj.writeInt(db.isAutoDvp);
                    db.aj.writeInt(db.bhcsIndex);
                    db.aj.flush();
                    db.aj.close();
                    db.aa.flush();
                    db.s = RecordStore.openRecordStore("dvnsoz", true);
                    final byte[] byteArray = db.aa.toByteArray();
                    db.aa.close();
                    if (c(b(db.s.getNumRecords()) ? 1 : 0)) {
                        db.s.addRecord(byteArray, 0, byteArray.length);
                        "".length();
                        "".length();
                        "".length();
                        if (a((Object)null)) {
                            return;
                        }
                    }
                    else {
                        db.s.setRecord(1, byteArray, 0, byteArray.length);
                    }
                    db.s.closeRecordStore();
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
                if (a(" ".length(), "  ".length())) {
                    return;
                }
            }
            catch (final NumberFormatException ex2) {
                "".length();
            }
        }
        a((Displayable)ey.c());
    }
    
    private static boolean b(final int n) {
        int n2;
        if (a(n)) {
            n2 = db.t[1];
            "".length();
            if (null != null) {
                return ((0x6F ^ 0x18 ^ (0x35 ^ 0x7B)) & (0xF ^ 0x23 ^ (0x49 ^ 0x5C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = db.t[5];
        }
        return n2 != 0;
    }
    
    private static boolean a(final int n, final int n2) {
        return n == n2;
    }
    
    public db() {
        super();
        this.x = new Form("menu dv");
        this.bhcsField = new TextField("mua bhcs theo indexUI <nvdv>!", new StringBuffer().append(db.bhcsIndex).toString(), 4, 2);
        this.ai = new Command("L\u01b0u", 4, 1);
        this.u = new Command("H\u1ee7y", 3, 1);
        final String s = "Auto mua + d\u00f9ng DVP";
        final int n = db.t[1];
        final String[] array = new String[db.t[6]];
        array[db.t[1]] = "B\u1eadt";
        array[db.t[5]] = "T\u1eaft";
        this.autoDvpChoice = new ChoiceGroup(s, n, array, new Image[db.t[6]]);
        this.indexDvpField = new TextField("Index Shop mua DVP", new StringBuffer().append(db.indexDvp).toString(), 4, 2);
        final String s2 = "\u0111\u1eadp \u0111\u1ed3 c\u1ea9n th\u1eadn <nv n\u00e2ng c\u1ea5p v\u1eadt ph\u1ea9m>";
        final int n2 = db.t[1];
        final String[] array2 = new String[db.t[6]];
        array2[db.t[1]] = "B\u1eadt";
        array2[db.t[5]] = "T\u1eaft";
        this.ah = new ChoiceGroup(s2, n2, array2, new Image[db.t[6]]);
        this.w = new TextField("T\u00ean \u0110\u1ed1i Th\u1ee7 + ',': <C\u00e1ch nhau b\u1eb1ng d\u1ea5u ph\u1ea3y ','> ;", db.i, 1024, 0);
        this.ag = new TextField("Map l\u00f4i \u0111\u00e0i", new StringBuffer().append(db.k).toString(), 3, 2);
        this.v = new TextField("Khu l\u00f4i \u0111\u00e0i", new StringBuffer().append(db.f).toString(), 3, 2);
        this.ae = new TextField("Map \u0110\u00e1nh Qu\u00e1i (Ki\u1ebfm Y\u00ean + Nh\u1eb7t \u0110\u00e1)", new StringBuffer().append(db.a).toString(), 3, 1);
        this.ac = new TextField("Khu \u0110\u00e1nh Qu\u00e1i (Ki\u1ebfm Y\u00ean + Nh\u1eb7t \u0110\u00e1)", new StringBuffer().append(db.g).toString(), 3, 1);
        this.ad = new TextField("Map C\u1eebu S\u00e1t", new StringBuffer().append(db.m).toString(), 3, 3);
        this.ab = new TextField("Khu C\u1eebu S\u00e1t", new StringBuffer().append(db.h).toString(), 3, 3);
        this.z = new ChoiceGroup("H\u1ee7y NVDV!!", 2, new String[] { "\u0110\u00e1nh Tinh Anh", "\u0110\u00e1nh Th\u1ee7 L\u0129nh", "N\u00e2ng C\u1ea5p Trang B\u1ecb", "L\u00f4i \u0110\u00e0i", "Ki\u1ebfm Y\u00ean", "C\u1eebu S\u00e1t" }, (Image[])null);
        this.q = new ChoiceGroup("C\u00e0i D\u00f9ng B\u1ea3o Hi\u1ec3m NVDV N\u00e2ng C\u1ea5p!!", 2, new String[] { "D\u00f9ng B\u00e0o Hi\u1ec3m N\u00e2ng L\u00ean 7", "D\u00f9ng B\u00e0o Hi\u1ec3m N\u00e2ng L\u00ean 8" }, (Image[])null);
    }
    
    private static boolean c(final int n) {
        return n != 0;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (c(n)) {
            n2 = db.t[1];
            "".length();
            if (-(0x5 ^ 0x0) >= 0) {
                return ((0x12 ^ 0x8) & ~(0x5C ^ 0x46)) != 0x0;
            }
        }
        else {
            n2 = db.t[5];
        }
        return n2 != 0;
    }
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    private static void c() {
        (af = new int[db.t[10]])[db.t[5]] = (db.t[11] + db.t[12] - db.t[13] + db.t[14] ^ db.t[6] + db.t[14] - db.t[15] + db.t[16]);
        db.af[db.t[1]] = " ".length();
        db.af[db.t[6]] = "   ".length();
        db.af[db.t[7]] = (db.t[17] & db.t[18]);
        db.af[db.t[0]] = ((db.t[19] ^ db.t[20]) & (db.t[21] ^ db.t[22] ^ db.t[23]));
        db.af[db.t[4]] = "  ".length();
        db.af[db.t[8]] = (db.t[24] ^ db.t[25] ^ (db.t[26] ^ db.t[27]));
        db.af[db.t[9]] = (db.t[28] ^ db.t[29] ^ (db.t[30] ^ db.t[31]));
        db.af[db.t[2]] = (db.t[32] + db.t[33] - db.t[34] + db.t[0] ^ db.t[26] + db.t[35] - db.t[36] + db.t[37]);
        db.af[db.t[3]] = -" ".length();
    }
}
