import javax.microedition.rms.*;
import java.io.*;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public final class ej implements CommandListener
{
    private TextField d;
    private static final int[] e;
    private static ByteArrayOutputStream f;
    private static final int[] g;
    private ChoiceGroup h;
    private static DataOutputStream i;
    private static RecordStore j;
    public static int a;
    private ChoiceGroup k;
    private static ByteArrayInputStream l;
    private final Command m;
    private final Command n;
    public static boolean b;
    public static boolean c;
    private final Form o;
    private static DataInputStream p;
    private ChoiceGroup Hlct;
    public static boolean isAutoHlct;
    private TextField pkTextField;
    public static int pkLimit;
    
    static {
        c();
        b();
        ej.c = false;
        ej.b = true;
        ej.a = 30;
        ej.pkLimit = 5;
        ej.isAutoHlct = false;
        try {
            if (d(g((ej.j = RecordStore.openRecordStore("nepk_config", true)).getNumRecords()) ? 1 : 0)) {
                ej.l = new ByteArrayInputStream(ej.j.getRecord(1));
                ej.c = (ej.p = new DataInputStream(ej.l)).readBoolean();
                ej.b = ej.p.readBoolean();
                ej.a = ej.p.readInt();
                ej.isAutoHlct = ej.p.readBoolean();
                ej.pkLimit = ej.p.readInt();
                ej.p.close();
                ej.l.close();
            }
            ej.j.closeRecordStore();
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    private static boolean a(final int n) {
        int n2;
        if (h(n)) {
            n2 = ej.e[0];
            "".length();
            if ("   ".length() == 0) {
                return ((0xB ^ 0x15 ^ (0xAB ^ 0x90)) & (0x42 ^ 0x1D ^ (0xC ^ 0x76) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ej.e[1];
        }
        return n2 != 0;
    }
    
    private static boolean a(final Object o, final Object o2) {
        return o == o2;
    }
    
    private static boolean a(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = ej.e[0];
            "".length();
            if (" ".length() < 0) {
                return ((53 + 115 - 59 + 24 ^ 72 + 121 - 186 + 129) & (87 + 2 + 11 + 48 ^ 12 + 83 + 33 + 25 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = ej.e[1];
        }
        return n3 != 0;
    }
    
    private static boolean b(final int n) {
        return n == 0;
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    public final void a() {
        this.o.append((Item)this.k);
        this.o.append((Item)this.h);
        this.o.append((Item)this.d);
        this.o.append((Item)this.Hlct);
        this.o.append((Item)this.pkTextField);
        this.o.addCommand(this.m);
        this.o.addCommand(this.n);
        this.o.setCommandListener((CommandListener)this);
        a((Displayable)this.o);
    }
    
    private static boolean c(final int n) {
        int n2;
        if (b(n)) {
            n2 = ej.e[0];
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((43 + 72 - 45 + 74 ^ 103 + 3 + 12 + 47) & (11 + 103 - 33 + 92 ^ 37 + 26 + 6 + 83 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ej.e[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final Object o, final Object o2) {
        int n;
        if (a(o, o2)) {
            n = ej.e[0];
            "".length();
            if (-" ".length() > -" ".length()) {
                return ((0x13 ^ 0x4 ^ (0x6F ^ 0x60)) & (5 + 28 + 61 + 57 ^ 111 + 57 - 34 + 9 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ej.e[1];
        }
        return n != 0;
    }
    
    private static boolean c(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean d(final int n) {
        return n != 0;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = ej.e[0];
            "".length();
            if (((190 + 73 - 233 + 194 ^ 22 + 35 + 49 + 59) & (0x67 ^ 0x37 ^ (0x68 ^ 0x7D) ^ -" ".length())) != 0x0) {
                return ((0xCF ^ 0x86 ^ (0xF7 ^ 0x8C)) & (90 + 151 - 107 + 37 ^ 120 + 125 - 152 + 60 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = ej.e[1];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n) {
        return n >= 0;
    }
    
    public ej() {
        super();
        this.o = new Form("C\u00e0i \u0111\u1eb7t n\u00e9 PK");
        this.m = new Command("L\u01b0u", 4, 1);
        this.n = new Command("H\u1ee7y", 3, 1);
        (this.k = new ChoiceGroup("N\u00e9 PK:", 1)).append("T\u1eaft", (Image)null);
        this.k.append("B\u1eadt", (Image)null);
        this.k.setSelectedIndex((int)(ej.c ? 1 : 0), true);
        (this.h = new ChoiceGroup("H\u00e0nh \u0111\u1ed9ng:", 1)).append("Chuy\u1ec3n khu", (Image)null);
        this.h.append("T\u1ef1 s\u00e1t", (Image)null);
        this.h.setSelectedIndex((int)(ej.b ? 1 : 0), true);
        this.d = new TextField("%HP n\u00e9 PK:", new StringBuffer().append(ej.a).toString(), 3, 2);
        (this.Hlct = new ChoiceGroup("Auto d\u00f9ng hlct:", 1)).append("T\u1eaft", (Image)null);
        this.Hlct.append("B\u1eadt", (Image)null);
        this.Hlct.setSelectedIndex((int)(ej.isAutoHlct ? 1 : 0), true);
        this.pkTextField = new TextField("D\u00f9ng n\u1ebfu hi\u1ebfu chi\u1ebfn >= ", new StringBuffer().append(ej.pkLimit).toString(), 4, 2);
    }
    
    private static void b() {
        (g = new int[ej.e[5]])[ej.e[1]] = (ej.e[6] ^ ej.e[7]);
        ej.g[ej.e[0]] = " ".length();
        ej.g[ej.e[2]] = "   ".length();
        ej.g[ej.e[3]] = ((ej.e[8] ^ ej.e[7]) & (ej.e[9] ^ ej.e[10] ^ ej.e[11]));
        ej.g[ej.e[4]] = "  ".length();
        ej.g[ej.e[12]] = (ej.e[13] ^ ej.e[14]);
        ej.g[ej.e[15]] = (ej.e[16] ^ ej.e[17]);
    }
    
    private static boolean f(final int n) {
        return n < 0;
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (d(b(command, this.m) ? 1 : 0)) {
            try {
                boolean c;
                if (d(b(this.k.getSelectedIndex(), 1) ? 1 : 0)) {
                    c = true;
                    "".length();
                    "".length();
                    if (f((ej.e[18] ^ ej.e[19]) & (ej.e[20] ^ ej.e[21] ^ ej.e[11]))) {
                        return;
                    }
                }
                else {
                    c = false;
                }
                ej.c = c;
                boolean b;
                if (d(c(this.h.getSelectedIndex()) ? 1 : 0)) {
                    b = true;
                    "".length();
                    "".length();
                    if (f("  ".length())) {
                        return;
                    }
                }
                else {
                    b = false;
                }
                ej.b = b;
                ej.isAutoHlct = (this.Hlct.getSelectedIndex() == 1);
                try {
                    int int1;
                    if (d(a(int1 = Integer.parseInt(this.d.getString())) ? 1 : 0)) {
                        int1 = 1;
                    }
                    if (d(d(int1, 100) ? 1 : 0)) {
                        int1 = 100;
                    }
                    ej.a = int1;
                    ej.pkLimit = Integer.parseInt(this.pkTextField.getString());
                    "".length();
                    "".length();
                    if (f("  ".length(), "   ".length())) {
                        return;
                    }
                }
                catch (final Exception ex) {
                    "".length();
                }
                ej.f = new ByteArrayOutputStream();
                (ej.i = new DataOutputStream(ej.f)).writeBoolean(ej.c);
                ej.i.writeBoolean(ej.b);
                ej.i.writeInt(ej.a);
                ej.i.flush();
                ej.i.writeBoolean(ej.isAutoHlct);
                ej.i.writeInt(ej.pkLimit);
                ej.j = RecordStore.openRecordStore("nepk_config", true);
                final byte[] byteArray = ej.f.toByteArray();
                if (d(c(ej.j.getNumRecords()) ? 1 : 0)) {
                    ej.j.addRecord(byteArray, 0, byteArray.length);
                    "".length();
                    "".length();
                    "".length();
                    if (a((Object)null)) {
                        return;
                    }
                }
                else {
                    ej.j.setRecord(1, byteArray, 0, byteArray.length);
                }
                ej.j.closeRecordStore();
                ej.i.close();
                ej.f.close();
                ff.b("L\u01b0u n\u00e9 PK th\u00e0nh c\u00f4ng");
                "".length();
                "".length();
                if (a((Object)null)) {
                    return;
                }
            }
            catch (final Exception ex2) {
                "".length();
            }
        }
        a((Displayable)ey.a);
    }
    
    private static boolean g(final int n) {
        int n2;
        if (d(n)) {
            n2 = ej.e[0];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((116 + 39 - 101 + 145 ^ 31 + 88 - 21 + 33) & (" ".length() ^ (0xC0 ^ 0x85) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = ej.e[1];
        }
        return n2 != 0;
    }
    
    private static void a(final Displayable current) {
        Display.getDisplay((MIDlet)ed.c).setCurrent(current);
    }
    
    private static void c() {
        (e = new int[22])[0] = " ".length();
        ej.e[1] = ((0x58 ^ 0x0) & ~(0x98 ^ 0xC0));
        ej.e[2] = "  ".length();
        ej.e[3] = "   ".length();
        ej.e[4] = (0x75 ^ 0x71);
        ej.e[5] = (0x99 ^ 0x9E);
        ej.e[6] = (0x9F ^ 0xB7 ^ (0xA ^ 0x7E));
        ej.e[7] = (0xDE ^ 0xB4 ^ (0xF6 ^ 0xC4));
        ej.e[8] = (0x36 ^ 0x7C ^ (0x60 ^ 0x7E));
        ej.e[9] = (0x55 ^ 0x19);
        ej.e[10] = (0xFC ^ 0xBC);
        ej.e[11] = -" ".length();
        ej.e[12] = (0x62 ^ 0x41 ^ (0x51 ^ 0x77));
        ej.e[13] = 69 + 29 + 77 + 60;
        ej.e[14] = (0x89 ^ 0x95) + (0xF7 ^ 0x92) - (0x77 ^ 0x3A) + (0x68 ^ 0x33);
        ej.e[15] = (0x65 ^ 0x63);
        ej.e[16] = (0x42 ^ 0xA);
        ej.e[17] = (0xF1 ^ 0xA2 ^ (0xC4 ^ 0xC1));
        ej.e[18] = (0xDE ^ 0xAC) + (0xD0 ^ 0x86) - (25 + 93 + 13 + 1) + (0x1B ^ 0x5A);
        ej.e[19] = 170 + 134 - 293 + 168;
        ej.e[20] = (0x96 ^ 0xB8);
        ej.e[21] = (0x9A ^ 0xC1 ^ (0x82 ^ 0xC1));
    }
    
    private static boolean e(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean f(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean h(final int n) {
        return n <= 0;
    }
}
