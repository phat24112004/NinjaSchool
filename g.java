import javax.microedition.lcdui.*;

public final class g extends k
{
    private static Image a;
    private static bf b;
    private static Image g;
    private int h;
    private static final int[] i;
    private static bf j;
    private fa k;
    private static final int[] l;
    private byte m;
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    private static boolean b(final int n) {
        int n2;
        if (d(n)) {
            n2 = g.l[0];
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((205 + 67 - 173 + 147 ^ 86 + 1 - 49 + 133) & (0xB3 ^ 0xBF ^ (0x2F ^ 0x7E) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = g.l[1];
        }
        return n2 != 0;
    }
    
    @Override
    public final void a(final cn cn) {
    }
    
    private static boolean c(final int n) {
        return n >= 0;
    }
    
    public g(final byte m, int h) {
        super();
        this.m = 0;
        this.h = 0;
        this.k = new fa();
        this.m = m;
        this.h = h;
        Label_0158: {
            switch (m) {
                case 1: {
                    h = 10;
                    if (a(b(g.b) ? 1 : 0)) {
                        g.b = new bf(g.a, 16, 10);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (a(b(g.j) ? 1 : 0)) {
                        g.j = new bf(g.g, 5, 5);
                    }
                    break Label_0158;
                }
            }
            "".length();
            "".length();
            if (c(g.l[4] ^ g.l[0], " ".length())) {
                throw null;
            }
        }
        int n = 0;
        while (a(d(n, h) ? 1 : 0)) {
            final bu bu = new bu((ee.bj - 20 + fj.d((ff.w + 40) / 5) * 5) * 10, (ee.bm - 20 + fj.d(ff.au / 5) * 5) * 10);
            if (a(g(m, 3) ? 1 : 0)) {
                bu.c = fj.d(3);
                "".length();
                "".length();
                if (e(g.l[29] ^ g.l[30])) {
                    throw null;
                }
            }
            else {
                bu.c = fj.d(4);
            }
            bu.f = 16 + (fj.d(3) << 2);
            bu.e = fj.b(-1, 1);
            bu.d = fj.d(bu.f);
            this.k.addElement(bu);
            ++n;
            "".length();
            "".length();
            if (a((g.l[32] ^ g.l[33]) & (g.l[28] ^ g.l[34] ^ g.l[35]))) {
                throw null;
            }
        }
    }
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static boolean d(final int n) {
        return n > 0;
    }
    
    private static boolean a(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean e(final int n) {
        return n <= 0;
    }
    
    private static boolean b(final int n, final int n2) {
        int n3;
        if (j(n, n2)) {
            n3 = g.l[0];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x60 ^ 0x6F) & ~(0x2D ^ 0x22)) != 0x0;
            }
        }
        else {
            n3 = g.l[1];
        }
        return n3 != 0;
    }
    
    @Override
    public final void a() {
        switch (this.m) {
            case 1: {
                int n = 0;
                while (a(d(n, this.h) ? 1 : 0)) {
                    final bu bu2;
                    final bu bu = bu2 = (bu)this.k.elementAt(n);
                    bu.a += 10;
                    final bu bu3 = bu2;
                    bu3.b += bu2.e * 10;
                    if (a(i(++bu2.d, bu2.f) ? 1 : 0)) {
                        bu2.d = 0;
                    }
                    if (!a(e(bu2.a / 10, ee.bm + ff.au - (3 - bu2.c) * 40) ? 1 : 0) || !a(i(bu2.b / 10, ee.bj - ff.aw) ? 1 : 0) || a(b(bu2.b / 10, ee.bj + ff.w + ff.aw) ? 1 : 0)) {
                        this.a(bu2);
                    }
                    ++n;
                    "".length();
                    "".length();
                    if (c((g.l[5] ^ g.l[6] ^ (g.l[7] ^ g.l[8])) & (g.l[9] ^ g.l[10] ^ (g.l[11] ^ g.l[12]) ^ -" ".length()), " ".length())) {
                        return;
                    }
                }
                return;
            }
            default: {
                return;
            }
            case 3: {
                int n2 = 0;
                while (a(d(n2, this.h) ? 1 : 0)) {
                    final bu bu5;
                    final bu bu4 = bu5 = (bu)this.k.elementAt(n2);
                    bu4.a += (bu5.c + 1) * 5;
                    final bu bu6 = bu5;
                    bu6.b += bu5.c + 1 << 1;
                    if (a(b(bu5.a / 10, ee.bm + ff.au - (3 - bu5.c) * 30) ? 1 : 0)) {
                        this.a(bu5);
                    }
                    final int n3 = ee.bj * (2 - bu5.c) * 20 / 120;
                    if (a(d(bu5.b / 10 + n3, ee.bj - 10) ? 1 : 0)) {
                        final bu bu7 = bu5;
                        bu7.b += (ff.w + 20) * 10;
                    }
                    if (a(b(bu5.b / 10 + n3, ee.bj + ff.w + 10) ? 1 : 0)) {
                        final bu bu8 = bu5;
                        bu8.b -= (ff.w + 20) * 10;
                    }
                    ++n2;
                    "".length();
                    "".length();
                    if (h((g.l[18] ^ g.l[19] ^ (g.l[15] ^ g.l[20])) & (g.l[21] + g.l[22] - g.l[23] + g.l[10] ^ g.l[24] + g.l[25] - g.l[26] + g.l[27] ^ -" ".length()), "  ".length())) {
                        return;
                    }
                }
            }
        }
    }
    
    private static void b() {
        (i = new int[g.l[36]])[g.l[1]] = ("   ".length() & ("   ".length() ^ g.l[35]));
        g.i[g.l[0]] = (g.l[37] ^ g.l[38]);
        g.i[g.l[25]] = (g.l[39] ^ g.l[40]);
        g.i[g.l[13]] = (g.l[41] ^ g.l[20]);
        g.i[g.l[16]] = (g.l[42] ^ g.l[43] ^ (g.l[18] ^ g.l[44]));
        g.i[g.l[4]] = (g.l[45] ^ g.l[28]);
        g.i[g.l[3]] = "   ".length();
        g.i[g.l[28]] = (g.l[46] + g.l[47] - g.l[48] + g.l[10] ^ g.l[49] + g.l[50] - g.l[51] + g.l[52]);
        g.i[g.l[15]] = "  ".length();
        g.i[g.l[31]] = -" ".length();
        g.i[g.l[2]] = " ".length();
        g.i[g.l[34]] = -(g.l[53] + g.l[54] - g.l[42] + g.l[55]);
        g.i[g.l[56]] = g.l[57] + g.l[58] - g.l[59] + g.l[60];
        g.i[g.l[17]] = (g.l[61] + g.l[62] - g.l[63] + g.l[64] ^ g.l[65] + g.l[59] - g.l[33] + g.l[66]);
        g.i[g.l[14]] = (g.l[67] ^ g.l[18]);
    }
    
    private static boolean c(final int n, final int n2) {
        return n == n2;
    }
    
    private static boolean d(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = g.l[0];
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((0x14 ^ 0x24) & ~(0xA3 ^ 0x93)) != 0x0;
            }
        }
        else {
            n3 = g.l[1];
        }
        return n3 != 0;
    }
    
    private static boolean e(final int n, final int n2) {
        int n3;
        if (a(n, n2)) {
            n3 = g.l[0];
            "".length();
            if (((0x79 ^ 0x5A ^ (0xFE ^ 0x86)) & (0x78 ^ 0x6E ^ (0x1C ^ 0x51) ^ -" ".length())) > 0) {
                return ((0x59 ^ 0x6B ^ (0x46 ^ 0x4B)) & (0xDB ^ 0x89 ^ (0xE3 ^ 0x8E) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = g.l[1];
        }
        return n3 != 0;
    }
    
    static {
        c();
        b();
        g.g = ff.a("/u/tuyet.png");
        g.a = ff.a("/u/cobay.png");
    }
    
    private static boolean f(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (c(n, n2)) {
            n3 = g.l[0];
            "".length();
            if (-"   ".length() > 0) {
                return ((3 + 67 + 9 + 59 ^ 113 + 88 - 155 + 114) & (116 + 117 - 81 + 19 ^ 70 + 26 - 34 + 67 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = g.l[1];
        }
        return n3 != 0;
    }
    
    private static void c() {
        (l = new int[76])[0] = " ".length();
        g.l[1] = ((0xAF ^ 0x80) & ~(0xEF ^ 0xC0));
        g.l[2] = (165 + 141 - 235 + 108 ^ 24 + 4 + 70 + 87);
        g.l[3] = (0x9E ^ 0x9B ^ "   ".length());
        g.l[4] = (0x38 ^ 0x3D);
        g.l[5] = (0x4E ^ 0x70 ^ (0x57 ^ 0x78));
        g.l[6] = (0x59 ^ 0x1A);
        g.l[7] = (0x49 ^ 0xA ^ (0xA ^ 0x25));
        g.l[8] = (0x61 ^ 0x13 ^ (0x9 ^ 0x52));
        g.l[9] = (0xB ^ 0x49);
        g.l[10] = (0x8 ^ 0x2B);
        g.l[11] = (0x8B ^ 0xC0 ^ (0xA3 ^ 0xBA));
        g.l[12] = (0x6E ^ 0x4A);
        g.l[13] = "   ".length();
        g.l[14] = (0x44 ^ 0x4A);
        g.l[15] = (0x6 ^ 0xE);
        g.l[16] = (0x95 ^ 0x91);
        g.l[17] = (0xCC ^ 0xC1);
        g.l[18] = (0x1F ^ 0x28 ^ (0x83 ^ 0x99));
        g.l[19] = (0xD3 ^ 0xA6);
        g.l[20] = (0x40 ^ 0x13 ^ (0x5D ^ 0x46));
        g.l[21] = (0xA7 ^ 0xC1);
        g.l[22] = (0x22 ^ 0x77) + (21 + 16 + 20 + 82) - (179 + 123 - 144 + 40) + (0xFD ^ 0x85);
        g.l[23] = (0x55 ^ 0x19 ^ (0x7C ^ 0x58));
        g.l[24] = (188 + 88 - 245 + 192 ^ 2 + 162 - 76 + 76);
        g.l[25] = "  ".length();
        g.l[26] = (0x79 ^ 0x16 ^ (0xF8 ^ 0xB9));
        g.l[27] = (0xF7 ^ 0xAB);
        g.l[28] = (0xAE ^ 0xA9);
        g.l[29] = (0xB7 ^ 0xA3);
        g.l[30] = (0xA3 ^ 0xB3 ^ ((0x1F ^ 0x5) & ~(0x87 ^ 0x9D)));
        g.l[31] = (0x68 ^ 0x61);
        g.l[32] = (0x5 ^ 0x56);
        g.l[33] = (76 + 220 - 261 + 200 ^ 41 + 103 - 5 + 41);
        g.l[34] = (0x1D ^ 0x16);
        g.l[35] = -" ".length();
        g.l[36] = (72 + 2 + 100 + 9 ^ 127 + 168 - 269 + 158);
        g.l[37] = 80 + 34 - 43 + 96;
        g.l[38] = 121 + 139 - 98 + 11;
        g.l[39] = 3 + 114 - 69 + 87;
        g.l[40] = (0x1A ^ 0x28) + (0x11 ^ 0x7E) - (0xDA ^ 0x95) + (0xE8 ^ 0xAD);
        g.l[41] = (0xC ^ 0x41);
        g.l[42] = (0xD7 ^ 0xC3 ^ (0x6E ^ 0x23));
        g.l[43] = (0x7B ^ 0x47 ^ (0xA0 ^ 0x8F));
        g.l[44] = (0xEE ^ 0x9D);
        g.l[45] = (41 + 12 + 63 + 15 ^ 94 + 149 - 127 + 56);
        g.l[46] = (123 + 57 - 44 + 21 ^ 129 + 156 - 174 + 87);
        g.l[47] = 78 + 5 - 57 + 118;
        g.l[48] = (0xA0 ^ 0x82 ^ (0x32 ^ 0x45));
        g.l[49] = 12 + 74 - 36 + 87 + (34 + 95 + 5 + 26) - (82 + 87 - 140 + 132) + (0x48 ^ 0x62);
        g.l[50] = (0x7B ^ 0x18 ^ (0x20 ^ 0x24));
        g.l[51] = (0xF1 ^ 0x97) + (128 + 168 - 294 + 204) - (0x24 ^ 0x78) + (0x9B ^ 0x97);
        g.l[52] = (0x5E ^ 0x1F) + (0xE7 ^ 0xC0) - (0x8D ^ 0xB0) + (0x3E ^ 0x63);
        g.l[53] = (0x2A ^ 0x3D);
        g.l[54] = 103 + 98 - 64 + 49;
        g.l[55] = (0x7F ^ 0x2F);
        g.l[56] = (0x5A ^ 0x56);
        g.l[57] = (0x41 ^ 0x5E);
        g.l[58] = (0x72 ^ 0x34);
        g.l[59] = (36 + 55 + 42 + 0 ^ 166 + 116 - 141 + 38);
        g.l[60] = (0x6C ^ 0x4D) + (0x7F ^ 0x1A) - (0xB9 ^ 0x98) + (0x3E ^ 0xA);
        g.l[61] = 10 + 135 - 113 + 111 + (0x95 ^ 0xA5) - (84 + 111 - 73 + 20) + (0xEA ^ 0x94);
        g.l[62] = 106 + 4 - 21 + 73;
        g.l[63] = (0xFFFF959F & 0x6B7F);
        g.l[64] = 190 + 116 - 170 + 58 + (20 + 11 + 83 + 77) - (0xFFFF8BFF & 0x7557) + (39 + 114 - 45 + 52);
        g.l[65] = (0x6C ^ 0x58 ^ (0x38 ^ 0x7C));
        g.l[66] = (0x39 ^ 0x14 ^ (0x5A ^ 0x4A));
        g.l[67] = (0xA1 ^ 0x92);
        g.l[68] = (0x6C ^ 0x8);
        g.l[69] = (0xD9 ^ 0xC1);
        g.l[70] = 12 + 33 + 59 + 39;
        g.l[71] = (0x2A ^ 0x1D);
        g.l[72] = (0xA7 ^ 0xA8 ^ (0x3 ^ 0x2E));
        g.l[73] = (0xDB ^ 0x9F) + (0x35 ^ 0x59) - (0x44 ^ 0x33) + (117 + 55 - 122 + 140);
        g.l[74] = 3 + 155 - 70 + 130 + (28 + 126 - 17 + 0) - (72 + 137 - 104 + 69) + (0x71 ^ 0x56);
        g.l[75] = (0xE4 ^ 0x8F) + (0x47 ^ 0x64) - (0x30 ^ 0x38) + (0x4F ^ 0x40);
    }
    
    private void a(final bu bu) {
        bu.b = (ee.bj - 20 + fj.d((ff.w + 40) / 5) * 5) * 10;
        bu.a = (ee.bm - ff.v + fj.d(ff.au / 5) * 5) * 10;
        if (a(g(this.m, 3) ? 1 : 0)) {
            bu.c = fj.d(3);
            return;
        }
        bu.c = fj.d(4);
    }
    
    private static boolean h(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean i(final int n, final int n2) {
        int n3;
        if (h(n, n2)) {
            n3 = g.l[0];
            "".length();
            if ("   ".length() < 0) {
                return ((116 + 88 - 138 + 65 ^ 127 + 37 - 143 + 149) & (8 + 83 - 66 + 113 ^ 139 + 65 - 154 + 113 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = g.l[1];
        }
        return n3 != 0;
    }
    
    private static boolean j(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = g.l[0];
            "".length();
            if (" ".length() < 0) {
                return ((0x92 ^ 0xBE) & ~(0xEC ^ 0xC0)) != 0x0;
            }
        }
        else {
            n = g.l[1];
        }
        return n != 0;
    }
}
