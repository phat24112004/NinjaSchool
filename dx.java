import java.io.*;

public final class dx implements Runnable
{
    private fm a;
    private static final int[] b;
    private static final int[] c;
    
    private static boolean a(final Object o) {
        return o != null;
    }
    
    private static boolean a(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = dx.c[10];
            "".length();
            if ((93 + 136 - 228 + 159 ^ 69 + 130 - 144 + 109) != (0x5A ^ 0x11 ^ (0xDE ^ 0x91))) {
                return ((0x5A ^ 0x4D ^ (0x77 ^ 0x7A)) & (0x1 ^ 0x70 ^ (0x6C ^ 0x7) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = dx.c[1];
        }
        return n3 != 0;
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    public final void run() {
        try {
            while (a(d(this.a.n ? 1 : 0) ? 1 : 0)) {
                byte b = this.a.l.readByte();
                if (a(d(fm.e(this.a) ? 1 : 0) ? 1 : 0)) {
                    b = fm.a(this.a, b);
                }
                int unsignedShort;
                if (a(a(b, -32) ? 1 : 0)) {
                    b = this.a.l.readByte();
                    if (a(d(fm.e(this.a) ? 1 : 0) ? 1 : 0)) {
                        b = fm.a(this.a, b);
                    }
                    unsignedShort = ((fm.a(this.a, this.a.l.readByte()) & 0xFF) << 24 | (fm.a(this.a, this.a.l.readByte()) & 0xFF) << 16 | (fm.a(this.a, this.a.l.readByte()) & 0xFF) << 8 | (fm.a(this.a, this.a.l.readByte()) & 0xFF));
                    "".length();
                    "".length();
                    if (b(" ".length(), -" ".length())) {
                        return;
                    }
                }
                else if (a(d(fm.e(this.a) ? 1 : 0) ? 1 : 0)) {
                    unsignedShort = ((fm.a(this.a, this.a.l.readByte()) & 0xFF) << 8 | (fm.a(this.a, this.a.l.readByte()) & 0xFF));
                    "".length();
                    "".length();
                    if (g((dx.c[51] ^ dx.c[52]) & (dx.c[53] ^ dx.c[54] ^ dx.c[34]), (dx.c[55] ^ dx.c[56]) & (dx.c[50] ^ dx.c[31] ^ dx.c[34]))) {
                        return;
                    }
                }
                else {
                    unsignedShort = this.a.l.readUnsignedShort();
                }
                final byte[] b2 = new byte[unsignedShort];
                int off = 0;
                int read = 0;
                while (a(d(read, -1) ? 1 : 0) && a(c(off, unsignedShort) ? 1 : 0)) {
                    if (a(c(read = this.a.l.read(b2, off, unsignedShort - off)) ? 1 : 0)) {
                        off += read;
                        final fm a = this.a;
                        a.b += off + 5;
                        final int n = this.a.b + this.a.d;
                        this.a.j = new StringBuffer().append(n / 1024).append(".").append(n % 1024 / 102).append("Kb").toString();
                        "".length();
                        "".length();
                        if (e("   ".length(), " ".length())) {
                            return;
                        }
                        continue;
                    }
                }
                if (a(d(fm.e(this.a) ? 1 : 0) ? 1 : 0)) {
                    int n2 = 0;
                    while (a(c(n2, b2.length) ? 1 : 0)) {
                        b2[n2] = fm.a(this.a, b2[n2]);
                        ++n2;
                        "".length();
                        "".length();
                        if (a((Object)null)) {
                            return;
                        }
                    }
                }
                this.a.m = System.currentTimeMillis();
                final eu eu;
                if (a(a((eu = new eu(b, b2)).a, -27) ? 1 : 0)) {
                    this.a(eu);
                    "".length();
                    "".length();
                    if (a((Object)null)) {
                        return;
                    }
                    continue;
                }
                else {
                    this.a.h.a(eu);
                    "".length();
                    "".length();
                    if (a((dx.c[57] ^ dx.c[58] ^ (dx.c[59] ^ dx.c[60])) & (dx.c[32] ^ dx.c[61] ^ (dx.c[62] ^ dx.c[63]) ^ -" ".length()))) {
                        return;
                    }
                    continue;
                }
            }
        }
        catch (final Exception ex) {
            "".length();
            if (a(d(this.a.n ? 1 : 0) ? 1 : 0)) {
                if (a(b(this.a.a) ? 1 : 0)) {
                    this.a.a();
                }
                if (a(b(this.a.h) ? 1 : 0)) {
                    if (a(c(b(System.currentTimeMillis() - fm.b(this.a), 500L)) ? 1 : 0)) {
                        this.a.h.b();
                        return;
                    }
                    this.a.h.c();
                }
            }
        }
    }
    
    private static boolean b(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean b(final int n) {
        return n > 0;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = dx.c[10];
            "".length();
            if (" ".length() > " ".length()) {
                return ((0x41 ^ 0x22 ^ (0x63 ^ 0x3F)) & (0x13 ^ 0x23 ^ (0x78 ^ 0x77) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = dx.c[1];
        }
        return n3 != 0;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (g(n, n2)) {
            n3 = dx.c[10];
            "".length();
            if ("   ".length() <= 0) {
                return ((118 + 114 - 134 + 29 ^ (0x81 ^ 0xB6)) & (0x7C ^ 0x11 ^ (0xE1 ^ 0xC4) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = dx.c[1];
        }
        return n3 != 0;
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean e(final int n, final int n2) {
        return n == n2;
    }
    
    private static void a() {
        (b = new int[dx.c[0]])[dx.c[1]] = -(dx.c[2] + dx.c[3] - dx.c[4] + dx.c[5] ^ dx.c[6] + dx.c[7] - dx.c[8] + dx.c[9]);
        dx.b[dx.c[10]] = dx.c[11] + dx.c[12] - dx.c[13] + dx.c[14];
        dx.b[dx.c[15]] = (dx.c[16] + dx.c[17] - dx.c[18] + dx.c[19] ^ dx.c[20] + dx.c[21] - dx.c[22] + dx.c[17]);
        dx.b[dx.c[23]] = (dx.c[24] + dx.c[25] - dx.c[26] + dx.c[12] ^ dx.c[27] + dx.c[8] - dx.c[27] + dx.c[19]);
        dx.b[dx.c[28]] = (dx.c[29] ^ dx.c[7]);
        dx.b[dx.c[30]] = ((dx.c[12] ^ dx.c[31]) & (dx.c[32] ^ dx.c[33] ^ dx.c[34]));
        dx.b[dx.c[35]] = -" ".length();
        dx.b[dx.c[36]] = (dx.c[37] ^ dx.c[38]);
        dx.b[dx.c[39]] = (dx.c[40] & dx.c[41]);
        dx.b[dx.c[42]] = (dx.c[43] ^ dx.c[44] ^ (dx.c[45] ^ dx.c[46]));
        dx.b[dx.c[47]] = -(dx.c[48] ^ dx.c[49]);
        dx.b[dx.c[50]] = " ".length();
    }
    
    private static int b(final long n, final long n2) {
        return a(n, n2);
    }
    
    dx(final fm a) {
        super();
        this.a = a;
    }
    
    private static void b() {
        (c = new int[68])[0] = (4 + 119 - 95 + 107 ^ 113 + 97 - 185 + 114);
        dx.c[1] = ((0x43 ^ 0x1C) & ~(0x32 ^ 0x6D));
        dx.c[2] = (0xF9 ^ 0x8C) + (0x7A ^ 0x56) - (0xC ^ 0x10) + (0xB1 ^ 0x94);
        dx.c[3] = (0x3F ^ 0x0 ^ (0x38 ^ 0x74));
        dx.c[4] = 219 + 92 - 272 + 196 + (0x58 ^ 0x60) - (15 + 98 + 37 + 12) + (0x10 ^ 0x7F);
        dx.c[5] = 21 + 31 + 15 + 65;
        dx.c[6] = (0xF ^ 0x6C ^ (0xEC ^ 0xA0));
        dx.c[7] = (0x3C ^ 0x4C);
        dx.c[8] = (0x87 ^ 0xA6);
        dx.c[9] = (0x1F ^ 0xC);
        dx.c[10] = " ".length();
        dx.c[11] = (129 + 115 - 218 + 167 ^ 40 + 88 - 84 + 92);
        dx.c[12] = ("   ".length() ^ (0x81 ^ 0xB7));
        dx.c[13] = (0xF4 ^ 0xA2);
        dx.c[14] = 40 + 47 - 10 + 62 + (175 + 153 - 195 + 69) - (181 + 4 - 21 + 77) + (0x1 ^ 0x72);
        dx.c[15] = "  ".length();
        dx.c[16] = (0x3 ^ 0x3C) + (0xBE ^ 0xC3) - (86 + 151 - 177 + 103) + (120 + 40 - 57 + 25);
        dx.c[17] = (0xC8 ^ 0xC5);
        dx.c[18] = 92 + 26 - 65 + 88;
        dx.c[19] = 108 + 45 - 99 + 84 + (103 + 40 - 116 + 119) - (24 + 147 - 65 + 49) + (0x35 ^ 0x10);
        dx.c[20] = (0x58 ^ 0x6A);
        dx.c[21] = (0xF5 ^ 0x8F);
        dx.c[22] = (0x23 ^ 0x31);
        dx.c[23] = "   ".length();
        dx.c[24] = (0x1E ^ 0x4A);
        dx.c[25] = (0x0 ^ 0x64) + (0x63 ^ 0x12) - (102 + 133 - 170 + 120) + (90 + 39 + 50 + 5);
        dx.c[26] = 124 + 36 - 156 + 130;
        dx.c[27] = (0xD0 ^ 0xB8);
        dx.c[28] = (18 + 4 + 19 + 87 ^ 42 + 22 - 50 + 118);
        dx.c[29] = (0xEF ^ 0xC7 ^ (0x7D ^ 0x2D));
        dx.c[30] = (0x5F ^ 0x5A);
        dx.c[31] = (9 + 2 + 210 + 4 ^ 119 + 28 - 32 + 24);
        dx.c[32] = (0x4F ^ 0x21);
        dx.c[33] = (29 + 64 - 78 + 171 ^ 60 + 77 - 48 + 50);
        dx.c[34] = -" ".length();
        dx.c[35] = (0xC1 ^ 0xAE ^ (0xAB ^ 0xC2));
        dx.c[36] = (0x53 ^ 0x46 ^ (0x67 ^ 0x75));
        dx.c[37] = (0x5A ^ 0x76);
        dx.c[38] = (0x2B ^ 0x2);
        dx.c[39] = (0x7D ^ 0x75);
        dx.c[40] = -(0xFFFFEF09 & 0x73FF);
        dx.c[41] = (-(0xFFFFCF7F & 0x38F6) & (0xFFFFFFFD & 0x6F7F));
        dx.c[42] = (0x3B ^ 0x32);
        dx.c[43] = 9 + 135 + 8 + 28 + (112 + 41 - 78 + 81) - (0xFFFFB7DF & 0x496E) + (7 + 0 + 57 + 122);
        dx.c[44] = 55 + 65 - 57 + 68 + (0x56 ^ 0x58) - (1 + 98 - 83 + 117) + (142 + 43 - 161 + 132);
        dx.c[45] = (0x82 ^ 0xB1) + (0x42 ^ 0x2D) - (0x4E ^ 0x6B) + (0xEE ^ 0x84);
        dx.c[46] = (0x19 ^ 0x51) + (0x1B ^ 0x42) - (0x16 ^ 0x9) + (0x2F ^ 0x3C);
        dx.c[47] = (60 + 94 - 68 + 53 ^ 128 + 119 - 202 + 84);
        dx.c[48] = 175 + 110 - 170 + 67;
        dx.c[49] = (0x1F ^ 0x15) + (0x53 ^ 0x6E) - -(0xE0 ^ 0xA8) + (0x3 ^ 0x1D);
        dx.c[50] = (0x65 ^ 0x15 ^ (0x48 ^ 0x33));
        dx.c[51] = 87 + 62 - 76 + 57;
        dx.c[52] = 113 + 27 - 14 + 68;
        dx.c[53] = (0x4D ^ 0x60) + (0x2 ^ 0x4B) - (0x50 ^ 0x65) + (32 + 143 - 41 + 24);
        dx.c[54] = (0xC6 ^ 0xAA) + (0x18 ^ 0x73) - (74 + 14 + 4 + 106) + (116 + 101 - 176 + 101);
        dx.c[55] = 204 + 52 - 129 + 108;
        dx.c[56] = 89 + 43 - 126 + 132;
        dx.c[57] = (0xDB ^ 0x9E);
        dx.c[58] = (41 + 123 - 53 + 129 ^ 76 + 101 - 142 + 128);
        dx.c[59] = 18 + 94 - 90 + 115;
        dx.c[60] = (0xD ^ 0x57) + (131 + 144 - 157 + 54) - (0x76 ^ 0xD) + (0x40 ^ 0x73);
        dx.c[61] = (0x6A ^ 0x2C ^ "  ".length());
        dx.c[62] = (0x56 ^ 0x4B) + (124 + 43 - 74 + 45) - (0x68 ^ 0x25) + (0x43 ^ 0x75);
        dx.c[63] = (0xAA ^ 0x8C) + (0x96 ^ 0x81) - -(0x4C ^ 0xB) + (0x27 ^ 0x30);
        dx.c[64] = (51 + 185 - 182 + 143 ^ 161 + 92 - 232 + 146);
        dx.c[65] = (0xC4 ^ 0xB9 ^ (0xFC ^ 0xA4));
        dx.c[66] = (0xD5 ^ 0xAC);
        dx.c[67] = (0x3B ^ 0x3 ^ (0xA8 ^ 0xAE));
    }
    
    private static boolean c(final int n) {
        int n2;
        if (b(n)) {
            n2 = dx.c[10];
            "".length();
            if (null != null) {
                return ((0x92 ^ 0x8D ^ (0xDE ^ 0x92)) & (0x35 ^ 0x62 ^ (0xA9 ^ 0xAD) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dx.c[1];
        }
        return n2 != 0;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = dx.c[10];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x8E ^ 0xBB) & ~(0x6A ^ 0x5F)) != 0x0;
            }
        }
        else {
            n = dx.c[1];
        }
        return n != 0;
    }
    
    private void a(final eu eu) {
        try {
            final byte byte1 = eu.b().readByte();
            this.a.k = new byte[byte1];
            int n = 0;
            while (a(c(n, byte1) ? 1 : 0)) {
                this.a.k[n] = eu.b().readByte();
                ++n;
                "".length();
                "".length();
                if (b((dx.c[64] ^ dx.c[65]) & (dx.c[66] ^ dx.c[67] ^ dx.c[34]), -" ".length())) {
                    return;
                }
            }
            int n2 = 0;
            while (a(c(n2, this.a.k.length - 1) ? 1 : 0)) {
                final byte[] k = this.a.k;
                final int n3 = n2 + 1;
                k[n3] ^= this.a.k[n2];
                ++n2;
                "".length();
                "".length();
                if (g(" ".length(), " ".length())) {
                    return;
                }
            }
            fm.d(this.a);
        }
        catch (final IOException ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static boolean f(final int n, final int n2) {
        return n < n2;
    }
    
    static {
        b();
        a();
    }
    
    private static boolean g(final int n, final int n2) {
        return n != n2;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (a(n)) {
            n2 = dx.c[10];
            "".length();
            if ((0xCA ^ 0xA8 ^ (0x75 ^ 0x12)) <= 0) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = dx.c[1];
        }
        return n2 != 0;
    }
}
