import java.io.*;
import javax.microedition.lcdui.*;

public final class o
{
    public short a;
    private long l;
    private boolean m;
    public fa b;
    private static final int[] n;
    private byte o;
    public int c;
    public fo[] d;
    public int e;
    private byte p;
    public long f;
    public byte[][] g;
    private static final int[] q;
    public byte[] h;
    private byte r;
    public byte[] i;
    private boolean s;
    public boolean j;
    public int k;
    
    public final void a(final byte[] buf) {
        if (c(d(buf) ? 1 : 0)) {
            DataInputStream dataInputStream = null;
            try {
                this.b.removeAllElements();
                this.d = null;
                final byte byte1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(buf))).readByte();
                this.d = new fo[byte1];
                int n = 0;
                while (c(c(n, byte1) ? 1 : 0)) {
                    final fo[] d = this.d;
                    dataInputStream.readUnsignedByte();
                    "".length();
                    d[n] = new fo(dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedByte());
                    ++n;
                    "".length();
                    "".length();
                    if (a((o.n[13] ^ o.n[32] ^ (o.n[31] ^ o.n[33])) & (o.n[34] ^ o.n[2] ^ (o.n[35] ^ o.n[6]) ^ -" ".length()))) {
                        return;
                    }
                }
                int a = 0;
                final short short1 = dataInputStream.readShort();
                int n2 = 0;
                while (c(c(n2, short1) ? 1 : 0)) {
                    final byte byte2 = dataInputStream.readByte();
                    final fa fa = new fa();
                    final fa fa2 = new fa();
                    int n3 = 0;
                    while (c(c(n3, byte2) ? 1 : 0)) {
                        final p p;
                        (p = new p(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte())).b = dataInputStream.readByte();
                        p.c = dataInputStream.readByte();
                        if (c(j(p.c) ? 1 : 0)) {
                            fa.addElement(p);
                            "".length();
                            "".length();
                            if (b(-" ".length(), -" ".length())) {
                                return;
                            }
                        }
                        else {
                            fa2.addElement(p);
                        }
                        if (c(c(a, fj.a(p.a)) ? 1 : 0)) {
                            a = fj.a(p.a);
                        }
                        ++n3;
                        "".length();
                        "".length();
                        if (g(-(o.n[36] ^ o.n[37] ^ (o.n[38] ^ o.n[39])))) {
                            return;
                        }
                    }
                    this.b.addElement(new r(fa, fa2));
                    ++n2;
                    "".length();
                    "".length();
                    if (h(o.n[40] ^ o.n[41], o.n[42] ^ o.n[43])) {
                        return;
                    }
                }
                this.c = this.d[0].f;
                this.k = (short)a;
                final short n4 = (short)dataInputStream.readUnsignedByte();
                this.h = new byte[n4];
                int n5 = 0;
                while (c(c(n5, n4) ? 1 : 0)) {
                    this.h[n5] = (byte)dataInputStream.readShort();
                    ++n5;
                    "".length();
                    "".length();
                    if (d("  ".length(), (o.n[44] + o.n[45] - o.n[18] + o.n[46] ^ o.n[47] + o.n[48] - o.n[49] + o.n[32]) & (o.n[50] ^ o.n[40] ^ (o.n[51] ^ o.n[52]) ^ -" ".length()))) {
                        return;
                    }
                }
                dataInputStream.readByte();
                "".length();
                final byte byte3 = dataInputStream.readByte();
                this.g[0] = new byte[byte3];
                int n6 = 0;
                while (c(c(n6, byte3) ? 1 : 0)) {
                    this.g[0][n6] = dataInputStream.readByte();
                    ++n6;
                    "".length();
                    "".length();
                    if (a((Object)null)) {
                        return;
                    }
                }
                final byte byte4 = dataInputStream.readByte();
                this.g[1] = new byte[byte4];
                int n7 = 0;
                while (c(c(n7, byte4) ? 1 : 0)) {
                    this.g[1][n7] = dataInputStream.readByte();
                    ++n7;
                    "".length();
                    "".length();
                    if (f((o.n[53] ^ o.n[54] ^ (o.n[55] ^ o.n[56])) & (o.n[57] ^ o.n[58] ^ (o.n[59] ^ o.n[60]) ^ -" ".length()), -" ".length())) {
                        return;
                    }
                }
                final byte byte5 = dataInputStream.readByte();
                this.g[3] = new byte[byte5];
                int n8 = 0;
                while (c(c(n8, byte5) ? 1 : 0)) {
                    this.g[3][n8] = dataInputStream.readByte();
                    ++n8;
                    "".length();
                    "".length();
                    if (b("   ".length(), (o.n[61] ^ o.n[62]) & (o.n[63] ^ o.n[22] ^ o.n[9]))) {
                        return;
                    }
                }
                this.s = true;
                try {
                    this.i[0] = (byte)(this.g[0].length - 7);
                    this.i[1] = (byte)(this.g[1].length - 7);
                    this.i[2] = (byte)(this.g[3].length - 7);
                    this.i[3] = (byte)(this.g[3].length - 7);
                    "".length();
                    "".length();
                    if (c((o.n[27] ^ o.n[64]) & (o.n[55] ^ o.n[65] ^ o.n[9]))) {
                        return;
                    }
                }
                catch (final Exception ex) {
                    "".length();
                }
                this.i[0] = dataInputStream.readByte();
                this.i[1] = dataInputStream.readByte();
                this.i[2] = dataInputStream.readByte();
                this.i[3] = this.i[2];
                try {
                    dataInputStream.close();
                }
                catch (final Exception ex2) {
                    "".length();
                }
            }
            catch (final Exception ex3) {
                "".length();
                try {
                    dataInputStream.close();
                }
                catch (final Exception ex4) {
                    "".length();
                }
            }
            finally {
                try {
                    dataInputStream.close();
                    "".length();
                    "".length();
                    if (g(-(o.n[66] + o.n[67] - o.n[68] + o.n[69] ^ o.n[70] + o.n[55] - o.n[71] + o.n[72]))) {
                        return;
                    }
                }
                catch (final Exception ex5) {
                    "".length();
                }
            }
        }
    }
    
    public final void a() {
        if (c(e(this.b.size()) ? 1 : 0)) {
            try {
                if (c(j(this.m ? 1 : 0) ? 1 : 0)) {
                    switch (this.r) {
                        case 0: {
                            ++this.o;
                            if (c(g(this.o, this.h.length) ? 1 : 0)) {
                                this.j = true;
                                this.o = 0;
                            }
                            this.p = this.h[this.o];
                            return;
                        }
                        case 1: {
                            ++this.o;
                            if (c(g(this.o, this.h.length) ? 1 : 0)) {
                                this.o = 0;
                                this.j = true;
                            }
                            this.p = this.h[this.o];
                            return;
                        }
                        case 2: {
                            ++this.o;
                            if (c(e(this.o, (byte)(this.h.length - 1)) ? 1 : 0) && c(d(d(this.f - System.currentTimeMillis(), -1L)) ? 1 : 0)) {
                                this.j = true;
                            }
                            if (c(g(this.o, this.h.length) ? 1 : 0)) {
                                this.o = 0;
                                this.a(true);
                            }
                            this.p = this.h[this.o];
                            return;
                        }
                        case 3: {
                            ++this.o;
                            if (c(g(this.o, this.h.length) ? 1 : 0)) {
                                this.o = 0;
                                this.a(true);
                            }
                            this.p = this.h[this.o];
                        }
                        default: {}
                    }
                }
                else if (c(d(d(this.l - System.currentTimeMillis(), -1L)) ? 1 : 0)) {
                    this.a(false);
                }
            }
            catch (final Exception ex) {
                "".length();
            }
        }
    }
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    public boolean b() {
        if (c(i(this.s ? 1 : 0) ? 1 : 0)) {
            return true;
        }
        this.e();
        return false;
    }
    
    private static boolean a(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean a(final int n) {
        return n < 0;
    }
    
    public final void a(final cn cn, final int n, final int n2) {
        try {
            if (c(j(this.b() ? 1 : 0) ? 1 : 0)) {
                return;
            }
            if (c(i(this.m ? 1 : 0) ? 1 : 0)) {
                return;
            }
            if (c(c(this.p, this.b.size()) ? 1 : 0)) {
                final fa b = ((r)this.b.elementAt(this.p)).b;
                int n3 = 0;
                while (c(c(n3, b.size()) ? 1 : 0)) {
                    final p p3 = (p)b.elementAt(n3);
                    final fo fo = this.d[p3.e];
                    final n b2;
                    if (c(d(b2 = q.b(this.a)) ? 1 : 0) && c(d(b2.b) ? 1 : 0)) {
                        final short d = p3.d;
                        int f = fo.f;
                        int d2 = fo.d;
                        int c = fo.c;
                        int a = fo.a;
                        if (c(g(c, b2.b.getWidth()) ? 1 : 0)) {
                            c = 0;
                        }
                        if (c(g(a, b2.b.getHeight()) ? 1 : 0)) {
                            a = 0;
                        }
                        if (c(g(c + f, b2.b.getWidth()) ? 1 : 0)) {
                            f = b2.b.getWidth() - c;
                        }
                        if (c(g(a + d2, b2.b.getHeight()) ? 1 : 0)) {
                            d2 = b2.b.getHeight() - a;
                        }
                        final Image b3 = b2.b;
                        final int n4 = c;
                        final int n5 = a;
                        final int n6 = f;
                        final int n7 = d2;
                        int n8;
                        if (c(e(p3.b, 1) ? 1 : 0)) {
                            n8 = 2;
                            "".length();
                            "".length();
                            if (b(o.n[24] ^ o.n[25])) {
                                return;
                            }
                        }
                        else {
                            n8 = 0;
                        }
                        cn.a(b3, n4, n5, n6, n7, n8, n + d, n2 + p3.a, 0);
                    }
                    ++n3;
                    "".length();
                    "".length();
                    if (f(((o.n[26] ^ o.n[27]) & (o.n[28] ^ o.n[29] ^ o.n[9])) ^ (o.n[30] ^ o.n[31]), "   ".length())) {
                        return;
                    }
                }
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
            System.err.println(new StringBuffer().append("Err DataSkillEff  paintBottomEff:").append(this.a).toString());
        }
    }
    
    private static boolean b(final int n) {
        return n <= 0;
    }
    
    private static void c() {
        (n = new int[73])[0] = " ".length();
        o.n[1] = ((180 + 2 - 18 + 33 ^ 45 + 101 - 57 + 41) & (135 + 164 - 238 + 138 ^ 56 + 47 - 72 + 97 ^ -" ".length()));
        o.n[2] = (71 + 57 - 7 + 17 ^ 3 + 87 + 13 + 37);
        o.n[3] = 140 + 108 - 120 + 16 + (0x41 ^ 0x56) - (0x17 ^ 0x36) + (0xDD ^ 0x9D);
        o.n[4] = 179 + 33 - 203 + 185;
        o.n[5] = (0x25 ^ 0x6F) + (0xEB ^ 0xB3) - (0x51 ^ 0x66) + (0x34 ^ 0x7B);
        o.n[6] = 102 + 121 - 97 + 42;
        o.n[7] = (0x4E ^ 0x41) + (0x4B ^ 0x68) - -(0x20 ^ 0x7) + (0x19 ^ 0x5A);
        o.n[8] = "  ".length() + (0xD5 ^ 0xBA) - (0x53 ^ 0x3D) + (17 + 73 + 37 + 12);
        o.n[9] = -" ".length();
        o.n[10] = "  ".length();
        o.n[11] = "   ".length();
        o.n[12] = (0x94 ^ 0x81 ^ (0xB6 ^ 0xA7));
        o.n[13] = (94 + 96 - 147 + 84 ^ (0x20 ^ 0x16));
        o.n[14] = (0x37 ^ 0x79);
        o.n[15] = (0x5A ^ 0x53 ^ (0x7A ^ 0x76));
        o.n[16] = (0xCD ^ 0x87);
        o.n[17] = (0x23 ^ 0x56);
        o.n[18] = (0x8B ^ 0xB5) + ((0xC6 ^ 0x86) & ~(0xD ^ 0x4D)) - -(0xA3 ^ 0xB1) + (0x9C ^ 0xAA);
        o.n[19] = (0xB1 ^ 0xC2);
        o.n[20] = (0x61 ^ 0xD ^ (0xE0 ^ 0xBF));
        o.n[21] = (0x47 ^ 0x2E ^ (0xB9 ^ 0xB1));
        o.n[22] = (0xD ^ 0x1E);
        o.n[23] = (6 + 22 + 73 + 60 ^ 40 + 70 - 44 + 68);
        o.n[24] = (0x4 ^ 0x11) + (0xA1 ^ 0xB4) - -(0x26 ^ 0x46) + (0x9E ^ 0xAC);
        o.n[25] = 175 + 112 - 148 + 46;
        o.n[26] = (44 + 15 - 42 + 215 ^ 87 + 141 - 113 + 35);
        o.n[27] = (0x43 ^ 0x7A);
        o.n[28] = (0x74 ^ 0x3C) + (0x68 ^ 0x18) - (142 + 177 - 148 + 9) + (115 + 138 - 145 + 99);
        o.n[29] = 128 + 122 - 131 + 29;
        o.n[30] = (5 + 160 + 11 + 12 ^ 18 + 6 + 103 + 37);
        o.n[31] = (124 + 52 - 147 + 123 ^ 36 + 92 - 112 + 116);
        o.n[32] = (0x15 ^ 0x4E ^ (0xC5 ^ 0xAA));
        o.n[33] = (46 + 102 - 39 + 56 ^ 2 + 49 + 76 + 4);
        o.n[34] = (152 + 100 - 99 + 102 ^ 101 + 50 + 4 + 7);
        o.n[35] = 46 + 8 + 17 + 109;
        o.n[36] = 83 + 121 - 53 + 9;
        o.n[37] = 186 + 179 - 198 + 28;
        o.n[38] = (0x5F ^ 0x6A);
        o.n[39] = (0x67 ^ 0x2C ^ (0x9 ^ 0x10));
        o.n[40] = (14 + 134 - 142 + 130 ^ 106 + 95 - 138 + 71);
        o.n[41] = (0x63 ^ 0x4 ^ (0xF6 ^ 0x9B));
        o.n[42] = (0x49 ^ 0x40 ^ (0x4D ^ 0x7));
        o.n[43] = (0x3E ^ 0x79);
        o.n[44] = (0x2 ^ 0x4F);
        o.n[45] = (0xB0 ^ 0xAC ^ (0xED ^ 0xB1));
        o.n[46] = (0xB5 ^ 0xB0) + (0x7 ^ 0x35) - (0xE ^ 0x4) + (0x6A ^ 0x35);
        o.n[47] = 68 + 112 - 159 + 126;
        o.n[48] = 38 + 60 + 48 + 17;
        o.n[49] = (0x71 ^ 0x59) + (87 + 114 - 70 + 6) - (0x61 ^ 0x25) + (0xF ^ 0x46);
        o.n[50] = (0x78 ^ 0x15);
        o.n[51] = (0xE5 ^ 0xBF);
        o.n[52] = (0x53 ^ 0x4D);
        o.n[53] = (17 + 32 - 16 + 168 ^ 30 + 145 - 96 + 108);
        o.n[54] = (0x90 ^ 0x9E ^ (0x72 ^ 0x1A));
        o.n[55] = (0xC3 ^ 0x9B);
        o.n[56] = (0x8 ^ 0x3);
        o.n[57] = (0x75 ^ 0x2B) + (0x34 ^ 0x27) - (0xF7 ^ 0xA0) + (0x1E ^ 0x6F);
        o.n[58] = 52 + 111 - 149 + 176;
        o.n[59] = (13 + 70 + 121 + 15 ^ 172 + 187 - 289 + 121);
        o.n[60] = (0x59 ^ 0x4F);
        o.n[61] = 79 + 27 + 68 + 0;
        o.n[62] = 58 + 16 + 42 + 12;
        o.n[63] = (0xBF ^ 0x82);
        o.n[64] = (105 + 142 - 139 + 69 ^ 143 + 127 - 200 + 86);
        o.n[65] = (0xC7 ^ 0x8B);
        o.n[66] = (0xF0 ^ 0xBF ^ (0x7D ^ 0x58));
        o.n[67] = (0xCC ^ 0xBA);
        o.n[68] = (0xD3 ^ 0x9C ^ (0xB9 ^ 0x8E));
        o.n[69] = (0xF6 ^ 0xC4);
        o.n[70] = (0xD5 ^ 0xC0) + (45 + 47 - 66 + 110) - (0x99 ^ 0x89) + "   ".length();
        o.n[71] = (61 + 68 + 33 + 86 ^ 146 + 75 - 118 + 65);
        o.n[72] = (0xB8 ^ 0xBF);
    }
    
    private static boolean b(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = o.n[0];
            "".length();
            if ((0x5A ^ 0x5E) <= "  ".length()) {
                return ((0x7D ^ 0x71) & ~(0xAF ^ 0xA3)) != 0x0;
            }
        }
        else {
            n3 = o.n[1];
        }
        return n3 != 0;
    }
    
    public o(final short a, final long f, final int e) {
        super();
        this.b = new fa();
        new fa();
        this.g = new byte[4][];
        new fa();
        this.a = 0;
        this.r = 0;
        this.i = new byte[4];
        new fa();
        this.a = a;
        this.f = f;
        this.e = e;
        this.e();
        if (c(j(b(f, -1L)) ? 1 : 0)) {
            this.r = 3;
            return;
        }
        if (c(j(b(f, -1L)) ? 1 : 0)) {
            this.r = 1;
            return;
        }
        this.r = 2;
    }
    
    private static boolean c(final int n) {
        return n != 0;
    }
    
    private static boolean d(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (a(n)) {
            n2 = o.n[0];
            "".length();
            if (null != null) {
                return ((0x18 ^ 0x8 ^ (0x7F ^ 0x29)) & (0x56 ^ 0x23 ^ (0x1 ^ 0x32) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = o.n[1];
        }
        return n2 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = o.n[0];
            "".length();
            if (((0xB4 ^ 0x9B) & ~(0xAF ^ 0x80)) != 0x0) {
                return ((0x6B ^ 0x6D) & ~(0x9C ^ 0x9A)) != 0x0;
            }
        }
        else {
            n3 = o.n[1];
        }
        return n3 != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean e(final int n) {
        int n2;
        if (f(n)) {
            n2 = o.n[0];
            "".length();
            if ((117 + 68 - 158 + 142 ^ 43 + 7 + 79 + 44) <= " ".length()) {
                return ((0xD ^ 0xA ^ (0xCC ^ 0x83)) & (195 + 63 - 12 + 3 ^ 156 + 83 - 235 + 173 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = o.n[1];
        }
        return n2 != 0;
    }
    
    public o() {
        super();
        this.b = new fa();
        new fa();
        this.g = new byte[4][];
        new fa();
        this.a = 0;
        this.r = 0;
        this.i = new byte[4];
        new fa();
    }
    
    private static boolean f(final int n) {
        return n > 0;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (c(o)) {
            n = o.n[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xD8 ^ 0x8D ^ (0xBC ^ 0xC0)) & (0x64 ^ 0x11 ^ (0x69 ^ 0x35) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = o.n[1];
        }
        return n != 0;
    }
    
    private void a(final boolean m) {
        if (c(e(this.e) ? 1 : 0)) {
            this.m = m;
            if (c(i(this.m ? 1 : 0) ? 1 : 0)) {
                this.l = System.currentTimeMillis() + this.e;
            }
        }
        else {
            this.m = false;
        }
    }
    
    public final void b(final cn cn, final int n, final int n2) {
        try {
            if (c(j(this.b() ? 1 : 0) ? 1 : 0)) {
                return;
            }
            if (c(i(this.m ? 1 : 0) ? 1 : 0)) {
                return;
            }
            if (c(c(this.p, this.b.size()) ? 1 : 0)) {
                final fa a = ((r)this.b.elementAt(this.p)).a;
                int n3 = 0;
                while (c(c(n3, a.size()) ? 1 : 0)) {
                    final p p3 = (p)a.elementAt(n3);
                    final fo fo = this.d[p3.e];
                    final n b;
                    if (c(d(b = q.b(this.a)) ? 1 : 0) && c(d(b.b) ? 1 : 0)) {
                        final short d = p3.d;
                        int f = fo.f;
                        int d2 = fo.d;
                        int c = fo.c;
                        int a2 = fo.a;
                        if (c(g(c, b.b.getWidth()) ? 1 : 0)) {
                            c = 0;
                        }
                        if (c(g(a2, b.b.getHeight()) ? 1 : 0)) {
                            a2 = 0;
                        }
                        if (c(g(c + f, b.b.getWidth()) ? 1 : 0)) {
                            f = b.b.getWidth() - c;
                        }
                        if (c(g(a2 + d2, b.b.getHeight()) ? 1 : 0)) {
                            d2 = b.b.getHeight() - a2;
                        }
                        final Image b2 = b.b;
                        final int n4 = c;
                        final int n5 = a2;
                        final int n6 = f;
                        final int n7 = d2;
                        int n8;
                        if (c(e(p3.b, 1) ? 1 : 0)) {
                            n8 = 2;
                            "".length();
                            "".length();
                            if (d(" ".length(), o.n[16] + o.n[17] - o.n[18] + o.n[19] ^ o.n[20] + o.n[21] - o.n[22] + o.n[23])) {
                                return;
                            }
                        }
                        else {
                            n8 = 0;
                        }
                        cn.a(b2, n4, n5, n6, n7, n8, n + d, n2 + p3.a, 0);
                    }
                    ++n3;
                    "".length();
                    "".length();
                    if (b(" ".length())) {
                        return;
                    }
                }
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
            System.err.println(new StringBuffer().append("Err DataSkillEff  paintBottomEff:").append(this.a).toString());
        }
    }
    
    private static boolean c(final Object o) {
        return o == null;
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean d(final Object o) {
        int n;
        if (a(o)) {
            n = o.n[0];
            "".length();
            if (((0xF0 ^ 0x8B ^ (0x60 ^ 0x2A)) & (136 + 47 - 97 + 158 ^ 22 + 192 - 96 + 79 ^ -" ".length())) > 0) {
                return ((111 + 46 - 46 + 51 ^ 87 + 125 - 80 + 13) & (0x1B ^ 0x40 ^ (0xAD ^ 0xC5) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = o.n[1];
        }
        return n != 0;
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = o.n[0];
            "".length();
            if ((0x2C ^ 0x28) < 0) {
                return ((0xCC ^ 0xAF) & ~(0x50 ^ 0x33)) != 0x0;
            }
        }
        else {
            n3 = o.n[1];
        }
        return n3 != 0;
    }
    
    private static void d() {
        (q = new int[o.n[2]])[o.n[1]] = (o.n[3] ^ o.n[4]);
        o.q[o.n[0]] = ((o.n[5] ^ o.n[6]) & (o.n[7] ^ o.n[8] ^ o.n[9]));
        o.q[o.n[10]] = " ".length();
        o.q[o.n[11]] = "   ".length();
        o.q[o.n[12]] = (o.n[13] ^ o.n[14]);
        o.q[o.n[15]] = "  ".length();
    }
    
    private static int b(final long n, final long n2) {
        return a(n, n2);
    }
    
    private static boolean g(final int n) {
        return n >= 0;
    }
    
    private static boolean h(final int n) {
        return n == 0;
    }
    
    private static boolean i(final int n) {
        int n2;
        if (c(n)) {
            n2 = o.n[0];
            "".length();
            if (" ".length() == -" ".length()) {
                return ((0x6E ^ 0x33 ^ (0xEC ^ 0x9B)) & (88 + 147 - 106 + 25 ^ 11 + 83 + 45 + 37 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = o.n[1];
        }
        return n2 != 0;
    }
    
    private static boolean h(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean j(final int n) {
        int n2;
        if (h(n)) {
            n2 = o.n[0];
            "".length();
            if (((0x53 ^ 0x70) & ~(0x4E ^ 0x6D)) > "  ".length()) {
                return ((0x3A ^ 0x1D) & ~(0x34 ^ 0x13)) != 0x0;
            }
        }
        else {
            n2 = o.n[1];
        }
        return n2 != 0;
    }
    
    private static int c(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int d(final long n, final long n2) {
        return c(n, n2);
    }
    
    static {
        c();
        d();
    }
    
    private void e() {
        try {
            final i i;
            if (c(b(i = (i)q.d.get(new StringBuffer().append(this.a).toString())) ? 1 : 0)) {
                final DataInputStream a;
                if (c(d(a = fj.a(new StringBuffer().append("/effdata/").append(this.a).toString())) ? 1 : 0)) {
                    final byte[] b = new byte[(short)a.available()];
                    a.read(b, 0, b.length);
                    "".length();
                    this.a(b);
                    return;
                }
                q.a(this.a);
                "".length();
            }
            else {
                System.currentTimeMillis();
                if (c(d(i) ? 1 : 0) && c(i(i.d ? 1 : 0) ? 1 : 0)) {
                    this.b = i.f;
                    this.d = i.h;
                    this.c = i.b;
                    this.k = i.e;
                    this.h = i.a;
                    this.i = i.g;
                    this.g = i.c;
                    this.s = i.d;
                }
            }
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
            q.a(this.a);
            "".length();
        }
    }
}
