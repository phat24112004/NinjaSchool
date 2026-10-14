import javax.microedition.rms.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.io.*;

public final class dm implements CommandListener
{
    private static final int[] c;
    private Command d;
    private static RecordStore e;
    private static DataInputStream f;
    public static long a;
    private static DataOutputStream g;
    private final ChoiceGroup h;
    private Form i;
    private static ByteArrayOutputStream j;
    public static byte b;
    private static ByteArrayInputStream k;
    private TextField l;
    private static final int[] m;
    private Command n;
    
    private static boolean a(final int n) {
        int n2;
        if (c(n)) {
            n2 = dm.c[0];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x16 ^ 0x33) & ~(0x41 ^ 0x64)) != 0x0;
            }
        }
        else {
            n2 = dm.c[1];
        }
        return n2 != 0;
    }
    
    public dm() {
        super();
        this.i = new Form("Menu Mua B\u00e1n !");
        this.l = new TextField("Qu\u00e3ng ngh\u1ec9 (milisecond)", new StringBuffer().append(dm.a).toString(), 500, 2);
        this.n = new Command("L\u01b0u", 4, 1);
        this.d = new Command("H\u1ee7y", 7, 1);
        this.h = new ChoiceGroup("B\u1ea1n Mu\u1ed1n Gh\u00ec ?", 1, new String[] { "Kh\u00f4ng ch\u00e1t ", "Ch\u1ec9 ch\u00e1t c\u00f4ng c\u1ed9ng !", "Ch\u1ec9 ch\u00e1t KTG", "Ch\u00e1t c\u1ea3 hai" }, new Image[4]);
    }
    
    private static boolean b(final int n) {
        int n2;
        if (d(n)) {
            n2 = dm.c[0];
            "".length();
            if (null != null) {
                return ((0x6C ^ 0x62) & ~(0x21 ^ 0x2F)) != 0x0;
            }
        }
        else {
            n2 = dm.c[1];
        }
        return n2 != 0;
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (d(a(command, this.n) ? 1 : 0)) {
            dm.a = Long.parseLong(this.l.getString());
            dm.b = (byte)this.h.getSelectedIndex();
            try {
                dm.j = new ByteArrayOutputStream();
                (dm.g = new DataOutputStream(dm.j)).writeLong(dm.a);
                dm.g.flush();
                dm.g.close();
                dm.j.flush();
                dm.e = RecordStore.openRecordStore("AutoChat", true);
                dm.j.close();
                if (d(a(dm.e.getNumRecords()) ? 1 : 0)) {
                    dm.e.addRecord(dm.j.toByteArray(), 0, dm.j.toByteArray().length);
                    "".length();
                    "".length();
                    "".length();
                    if (a(" ".length(), (dm.c[21] ^ dm.c[22]) & (dm.c[23] ^ dm.c[24] ^ dm.c[19]))) {
                        return;
                    }
                }
                else {
                    dm.e.setRecord(1, dm.j.toByteArray(), 0, dm.j.toByteArray().length);
                }
                dm.e.closeRecordStore();
                "".length();
                "".length();
                if (b(-" ".length(), "  ".length())) {
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
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    private static boolean c(final int n) {
        return n == 0;
    }
    
    public final void a() {
        this.i.append((Item)this.h);
        "".length();
        this.i.append((Item)this.l);
        "".length();
        this.i.addCommand(this.n);
        this.i.addCommand(this.d);
        this.i.setCommandListener((CommandListener)this);
        this.h.setSelectedIndex((int)dm.b, true);
        a((Displayable)this.i);
    }
    
    private static boolean a(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean a(final Object o, final Object o2) {
        int n;
        if (b(o, o2)) {
            n = dm.c[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0x2E ^ 0x71) & ~(0x64 ^ 0x3B)) != 0x0;
            }
        }
        else {
            n = dm.c[1];
        }
        return n != 0;
    }
    
    static {
        c();
        b();
        dm.b = 1;
        dm.a = 62000L;
        try {
            if (d(b((dm.e = RecordStore.openRecordStore("AutoChat", true)).getNumRecords()) ? 1 : 0)) {
                dm.k = new ByteArrayInputStream(dm.e.getRecord(1));
                dm.a = (dm.f = new DataInputStream(dm.k)).readLong();
                dm.b = dm.f.readByte();
            }
            dm.e.closeRecordStore();
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    private static void b() {
        (m = new int[dm.c[2]])[dm.c[1]] = (-(dm.c[3] & dm.c[4]) & (dm.c[5] & dm.c[6]));
        dm.m[dm.c[0]] = "  ".length();
        dm.m[dm.c[7]] = (dm.c[8] ^ dm.c[9]);
        dm.m[dm.c[10]] = " ".length();
        dm.m[dm.c[11]] = (dm.c[12] ^ dm.c[13] ^ (dm.c[14] ^ dm.c[2]));
        dm.m[dm.c[15]] = ((dm.c[16] ^ dm.c[17]) & (dm.c[18] ^ dm.c[12] ^ dm.c[19]));
        dm.m[dm.c[20]] = "   ".length();
    }
    
    private static void c() {
        (c = new int[25])[0] = " ".length();
        dm.c[1] = ((0x7A ^ 0x34) & ~(0x62 ^ 0x2C));
        dm.c[2] = (0xE ^ 0x5F ^ (0x7D ^ 0x2B));
        dm.c[3] = -(-(0xFFFFFDB7 & 0x1E4B) & (0xFFFFDFF7 & 0x3D7F));
        dm.c[4] = (0xFFFFFFFE & 0x3F7F);
        dm.c[5] = -(0xFFFFD57F & 0x6A83);
        dm.c[6] = (-" ".length() & (-1 & 0x7FFF));
        dm.c[7] = "  ".length();
        dm.c[8] = (0x2B ^ 0x4);
        dm.c[9] = (0x73 ^ 0x58);
        dm.c[10] = "   ".length();
        dm.c[11] = ("   ".length() ^ (0x48 ^ 0x4F));
        dm.c[12] = (0xB ^ 0x47);
        dm.c[13] = (0x1A ^ 0x14 ^ (0x52 ^ 0x4D));
        dm.c[14] = (0x22 ^ 0x7F);
        dm.c[15] = (0x4E ^ 0x4B);
        dm.c[16] = 124 + 98 - 198 + 109;
        dm.c[17] = (0x2C ^ 0x49) + (0x68 ^ 0x47) - (0x8E ^ 0xAB) + (0x2B ^ 0x66);
        dm.c[18] = (5 + 177 - 36 + 63 ^ 38 + 80 - 68 + 114);
        dm.c[19] = -" ".length();
        dm.c[20] = (0x25 ^ 0x23);
        dm.c[21] = (0xEA ^ 0x9A);
        dm.c[22] = (4 + 47 + 11 + 119 ^ 18 + 126 - 18 + 9);
        dm.c[23] = 114 + 21 - 113 + 109 + (109 + 26 + 63 + 10) - (93 + 68 - 82 + 128) + (0xCD ^ 0xA2);
        dm.c[24] = 69 + 1 - 55 + 162;
    }
    
    private static boolean b(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean b(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean d(final int n) {
        return n != 0;
    }
}
