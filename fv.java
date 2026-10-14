public final class fv extends a
{
    public static boolean w;
    private int x;
    private int y;
    private fa z;
    private fa aa;
    private boolean ab;
    private long ac;
    private boolean ad;
    private String ae;
    private static final int[] af;
    private boolean ag;
    private static final int[] ah;
    
    private static boolean a(final Object o) {
        return o == null;
    }
    
    private static boolean d(final int n) {
        int n2;
        if (i(n)) {
            n2 = fv.af[0];
            "".length();
            if (" ".length() == 0) {
                return ((68 + 124 - 162 + 97 ^ (0x73 ^ 0x3)) & (0xA9 ^ 0x8F ^ (0x75 ^ 0x5C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fv.af[1];
        }
        return n2 != 0;
    }
    
    static {
        o();
        p();
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (h(n, n2)) {
            n3 = fv.af[0];
            "".length();
            if (-(115 + 31 - 27 + 72 ^ 74 + 116 - 21 + 17) >= 0) {
                return ((76 + 30 + 90 + 35 ^ 45 + 100 - 78 + 117) & (0x2D ^ 0x6E ^ (0x39 ^ 0x25) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fv.af[1];
        }
        return n3 != 0;
    }
    
    private static boolean d(final int n, final int n2) {
        return n <= n2;
    }
    
    private static boolean e(final int n) {
        return n != 0;
    }
    
    private void e(final aa aa) {
        final el[] array = new el[12];
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (e(c(this.aa) ? 1 : 0)) {
            int n4 = 0;
            while (e(c(n4, this.aa.size()) ? 1 : 0)) {
                final fh fh = (fh)this.aa.elementAt(n4);
                final int intValue = (int)this.z.elementAt(n4);
                if (e(k(fh.c.i ? 1 : 0) ? 1 : 0)) {
                    final el d;
                    if (e(b(d = aa.d(fh.c.d)) ? 1 : 0)) {
                        cv.b(this.ae, "<Xin l\u1ed7i, c\u00f3 l\u1ed7i ch\u1ecdn item>");
                        return;
                    }
                    fl.u().l(d.p, intValue);
                    es.ai();
                    "".length();
                    final el d2;
                    if (e(b(d2 = aa.d(fh.c.d, intValue)) ? 1 : 0)) {
                        cv.b(this.ae, "<Xin l\u1ed7i, c\u00f3 l\u1ed7i ch\u1ecdn item>");
                        return;
                    }
                    array[n++] = d2;
                    n3 = 1;
                    "".length();
                    "".length();
                    if (i(fv.af[22] ^ fv.af[31])) {
                        return;
                    }
                }
                else {
                    final aa z = aa.z();
                    int n5 = 0;
                    int n6 = 0;
                Label_0239:
                    while (e(c(n5, intValue) ? 1 : 0)) {
                        while (e(c(n6, z.fg.length) ? 1 : 0)) {
                            final el el;
                            if (e(c(el = z.fg[n6]) ? 1 : 0) && e(f(el.j.d, fh.c.d) ? 1 : 0)) {
                                array[n++] = el;
                                ++n6;
                                "".length();
                                "".length();
                                if (e("  ".length(), "  ".length())) {
                                    return;
                                }
                                ++n5;
                                "".length();
                                "".length();
                                if (g(-" ".length())) {
                                    return;
                                }
                                continue Label_0239;
                            }
                            else {
                                ++n6;
                                "".length();
                                "".length();
                                if (m(fv.af[32] + fv.af[33] - fv.af[34] + fv.af[35] ^ fv.af[36] + fv.af[37] - fv.af[38] + fv.af[11], fv.af[39] + fv.af[40] - fv.af[41] + fv.af[42] ^ fv.af[43] + fv.af[10] - fv.af[44] + fv.af[45])) {
                                    return;
                                }
                                continue;
                            }
                        }
                        cv.b(this.ae, "<Xin l\u1ed7i, c\u00f3 l\u1ed7i ch\u1ecdn item>");
                        return;
                    }
                }
                n2 += intValue * fh.f * 1000 / fh.h;
                ++n4;
                "".length();
                "".length();
                if (g(-" ".length())) {
                    return;
                }
            }
            if (e(j(n2) ? 1 : 0)) {
                n2 = 1;
            }
        }
        fv.w = false;
        if (e(j(aa.b(aa.ai, aa.eu) ? 1 : 0) ? 1 : 0)) {
            cv.b(this.ae, "<H\u00e3y \u0111\u1ee9ng \u1edf n\u01a1i d\u1ec5 GD>");
            if (e(k(n3) ? 1 : 0)) {
                fl.u().j();
                es.ai();
                "".length();
            }
        }
        else {
            fl.u().b(aa.ay);
            if (e(j(es.a(20000L) ? 1 : 0) ? 1 : 0)) {
                if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                    fl.u().g();
                    a.b(1000L);
                }
                if (e(k(n3) ? 1 : 0)) {
                    fl.u().j();
                    es.ai();
                    "".length();
                }
                cv.b(this.ae, "<H\u00e3y \u0111\u1ed3ng \u00fd giao d\u1ecbch>");
                return;
            }
            ee.w().df = 0;
            ee.ca = new el[12];
            int n7 = 0;
            while (e(c(n7, 12) ? 1 : 0)) {
                ee.ca[n7] = array[n7];
                if (e(c(array[n7]) ? 1 : 0) && e(h(array[n7].p) ? 1 : 0) && e(c(array[n7].p, aa.z().fg.length) ? 1 : 0)) {
                    aa.z().fg[array[n7].p] = null;
                }
                ++n7;
                "".length();
                "".length();
                if (f("  ".length())) {
                    return;
                }
            }
            fl.u().a(0, array);
            ee.w().ea = 1;
            final long currentTimeMillis = System.currentTimeMillis();
            while (e(l(ee.w().et, 1) ? 1 : 0)) {
                if (!e(j(fv.w ? 1 : 0) ? 1 : 0) || e(h(b(System.currentTimeMillis() - currentTimeMillis, 20000L)) ? 1 : 0)) {
                    if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                        fl.u().g();
                        a.b(1000L);
                    }
                    if (e(k(n3) ? 1 : 0)) {
                        fl.u().j();
                        es.ai();
                        "".length();
                    }
                    cv.b(this.ae, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                    return;
                }
                a.b(200L);
                "".length();
                "".length();
                if (e(-" ".length(), (fv.af[46] ^ fv.af[47] ^ (fv.af[48] ^ fv.af[49])) & (fv.af[50] ^ fv.af[51] ^ (fv.af[52] ^ fv.af[53]) ^ -" ".length()))) {
                    return;
                }
            }
            final long currentTimeMillis2 = System.currentTimeMillis();
            if (e(c(ee.w().dn, n2) ? 1 : 0)) {
                if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                    fl.u().g();
                    a.b(1000L);
                }
                if (e(k(n3) ? 1 : 0)) {
                    fl.u().j();
                    es.ai();
                    "".length();
                }
                cv.b(this.ae, "<Kh\u00f4ng \u0111\u1ee7 xu>");
                return;
            }
            int n8 = 0;
            while (e(c(n8, ee.av.length) ? 1 : 0)) {
                if (e(c(ee.av[n8]) ? 1 : 0) && e(b(fw.a(ee.av[n8].j.d)) ? 1 : 0)) {
                    if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                        fl.u().g();
                        a.b(1000L);
                    }
                    if (e(k(n3) ? 1 : 0)) {
                        fl.u().j();
                        es.ai();
                        "".length();
                    }
                    cv.b(this.ae, "<Ch\u1ec9 GD xu>");
                    return;
                }
                ++n8;
                "".length();
                "".length();
                if (d(" ".length(), -" ".length())) {
                    return;
                }
            }
            while (e(d(b(System.currentTimeMillis() - currentTimeMillis2, 6000L)) ? 1 : 0)) {
                if (e(k(fv.w ? 1 : 0) ? 1 : 0)) {
                    if (e(k(n3) ? 1 : 0)) {
                        fl.u().j();
                        es.ai();
                        "".length();
                    }
                    cv.b(this.ae, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                    return;
                }
                a.b(200L);
                "".length();
                "".length();
                if (i(" ".length())) {
                    return;
                }
            }
            fl.u().f();
            ee.w().ea = 2;
            while (e(c(ee.w().et, 2) ? 1 : 0)) {
                if (!e(j(fv.w ? 1 : 0) ? 1 : 0) || e(h(b(System.currentTimeMillis() - currentTimeMillis2, 20000L)) ? 1 : 0)) {
                    if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                        fl.u().g();
                        a.b(1000L);
                    }
                    if (e(k(n3) ? 1 : 0)) {
                        fl.u().j();
                        es.ai();
                        "".length();
                    }
                    cv.b(this.ae, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                    return;
                }
                a.b(200L);
                "".length();
                "".length();
                if (d((Object)null)) {
                    return;
                }
            }
        }
    }
    
    private static int a(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean f(final int n) {
        return n == 0;
    }
    
    private static boolean e(final int n, final int n2) {
        return n > n2;
    }
    
    private static boolean f(final int n, final int n2) {
        int n3;
        if (n(n, n2)) {
            n3 = fv.af[0];
            "".length();
            if (((0x6E ^ 0x3F) & ~(0x78 ^ 0x29)) != 0x0) {
                return ((0x2B ^ 0x6A) & ~(0xD ^ 0x4C)) != 0x0;
            }
        }
        else {
            n3 = fv.af[1];
        }
        return n3 != 0;
    }
    
    private static boolean g(final int n, final int n2) {
        int n3;
        if (j(n, n2)) {
            n3 = fv.af[0];
            "".length();
            if (-(0x57 ^ 0x53) > 0) {
                return ((0xB3 ^ 0x94) & ~(0x5D ^ 0x7A)) != 0x0;
            }
        }
        else {
            n3 = fv.af[1];
        }
        return n3 != 0;
    }
    
    private static int b(final long n, final long n2) {
        return e(n, n2);
    }
    
    private static boolean g(final int n) {
        return n >= 0;
    }
    
    private static boolean h(final int n, final int n2) {
        return n < n2;
    }
    
    @Override
    public final String toString() {
        return "Auto Sell";
    }
    
    private static boolean i(final int n, final int n2) {
        int n3;
        if (e(n, n2)) {
            n3 = fv.af[0];
            "".length();
            if (((28 + 22 + 13 + 120 ^ 56 + 141 - 127 + 121) & (0x26 ^ 0x2D ^ "   ".length() ^ -" ".length()) & (((6 + 131 - 32 + 67 ^ 71 + 1 + 19 + 70) & (0x2C ^ 0x12 ^ (0x46 ^ 0x75) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return ((0xD1 ^ 0x87 ^ (0xD3 ^ 0xB6)) & (0x18 ^ 0x40 ^ (0x59 ^ 0x32) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fv.af[1];
        }
        return n3 != 0;
    }
    
    private static boolean b(final Object o) {
        int n;
        if (a(o)) {
            n = fv.af[0];
            "".length();
            if (-" ".length() >= 0) {
                return ((117 + 35 - 83 + 106 ^ 150 + 177 - 197 + 49) & (0x1E ^ 0x39 ^ (0xB6 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = fv.af[1];
        }
        return n != 0;
    }
    
    private static boolean h(final int n) {
        int n2;
        if (g(n)) {
            n2 = fv.af[0];
            "".length();
            if (((173 + 150 - 299 + 152 ^ 97 + 146 - 104 + 10) & (0xC1 ^ 0xA0 ^ (0x5C ^ 0x18) ^ -" ".length())) == -" ".length()) {
                return ((0x98 ^ 0x90 ^ (0x20 ^ 0x6F)) & (0xB0 ^ 0x9F ^ (0x49 ^ 0x21) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fv.af[1];
        }
        return n2 != 0;
    }
    
    private static int c(final long n, final long n2) {
        return f(n, n2);
    }
    
    private static boolean i(final int n) {
        return n < 0;
    }
    
    private static int d(final long n, final long n2) {
        return a(n, n2);
    }
    
    private static int e(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean j(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean c(final Object o) {
        int n;
        if (d(o)) {
            n = fv.af[0];
            "".length();
            if (((0x4D ^ 0x65) & ~(0x82 ^ 0xAA)) != 0x0) {
                return ((0x33 ^ 0x66) & ~(0xF8 ^ 0xAD)) != 0x0;
            }
        }
        else {
            n = fv.af[1];
        }
        return n != 0;
    }
    
    @Override
    public final void b() {
        super.b();
        super.k = fr.s;
        super.b = fr.g;
        this.x = aa.z().ai;
        this.y = aa.z().eu;
        this.ac = 0L;
        this.ad = false;
        fw.a = -1;
        new Thread(new doa()).start();
    }
    
    private static boolean d(final Object o) {
        return o != null;
    }
    
    private static boolean k(final int n, final int n2) {
        int n3;
        if (d(n, n2)) {
            n3 = fv.af[0];
            "".length();
            if (" ".length() < ((0xBD ^ 0x84 ^ (0xE3 ^ 0x8D)) & (0xE5 ^ 0xA1 ^ (0x45 ^ 0x56) ^ -" ".length()))) {
                return ((0xF5 ^ 0x91 ^ (0x6F ^ 0x45)) & (73 + 2 + 148 + 16 ^ 44 + 138 - 116 + 95 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fv.af[1];
        }
        return n3 != 0;
    }
    
    private static boolean j(final int n) {
        int n2;
        if (f(n)) {
            n2 = fv.af[0];
            "".length();
            if ("  ".length() > (0x51 ^ 0x55)) {
                return ((0x5C ^ 0x50) & ~(0x59 ^ 0x55)) != 0x0;
            }
        }
        else {
            n2 = fv.af[1];
        }
        return n2 != 0;
    }
    
    private void f(final aa aa) {
        final el[] ca = new el[12];
        fv.w = false;
        if (e(j(this.ag ? 1 : 0) ? 1 : 0)) {
            if (e(j(aa.b(aa.ai, aa.eu) ? 1 : 0) ? 1 : 0)) {
                cv.b(this.ae, "<H\u00e3y \u0111\u1ee9ng \u1edf n\u01a1i d\u1ec5 GD>");
                return;
            }
            fl.u().b(aa.ay);
            if (e(j(es.a(20000L) ? 1 : 0) ? 1 : 0)) {
                if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                    fl.u().g();
                    a.b(1000L);
                }
                cv.b(this.ae, "<H\u00e3y \u0111\u1ed3ng \u00fd giao d\u1ecbch>");
                return;
            }
        }
        else {
            final long currentTimeMillis = System.currentTimeMillis();
            while (!e(k(ee.db ? 1 : 0) ? 1 : 0) || e(h(c(System.currentTimeMillis() - currentTimeMillis, 10000L)) ? 1 : 0)) {
                a.b(1000L);
                "".length();
                "".length();
                if (e((fv.af[19] ^ fv.af[20] ^ (fv.af[21] ^ fv.af[22])) & ("  ".length() ^ (fv.af[23] ^ fv.af[24]) ^ -" ".length()))) {
                    return;
                }
            }
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        while (e(l(ee.w().et, 1) ? 1 : 0)) {
            if (!e(j(fv.w ? 1 : 0) ? 1 : 0) || e(h(c(System.currentTimeMillis() - currentTimeMillis2, 20000L)) ? 1 : 0)) {
                if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                    fl.u().g();
                    a.b(1000L);
                }
                cv.b(this.ae, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            a.b(200L);
            "".length();
            "".length();
            if (i(" ".length())) {
                return;
            }
        }
        final fa fa = new fa();
        final fa fa2 = new fa();
        int i = 0;
        while (e(c(i, ee.av.length) ? 1 : 0)) {
            if (e(c(ee.av[i]) ? 1 : 0)) {
                final fh a;
                if (!e(c(a = fw.a(ee.av[i].j.d)) ? 1 : 0) || e(j(a.b() ? 1 : 0) ? 1 : 0)) {
                    if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                        fl.u().g();
                        a.b(1000L);
                    }
                    cv.b(this.ae, new StringBuffer().append("<Item ").append(i).append(": b\u1ea1n \u0111\u00e3 GD vp mk ko mua>").toString());
                    return;
                }
                int p;
                if (e(k(ee.av[i].j.i ? 1 : 0) ? 1 : 0)) {
                    p = ee.av[i].p;
                    "".length();
                    "".length();
                    if (l(" ".length())) {
                        return;
                    }
                }
                else {
                    p = 1;
                }
                final int value = p;
                if (e(k(fa.contains(a) ? 1 : 0) ? 1 : 0)) {
                    final int index = fa.indexOf(a);
                    fa2.setElementAt(new Integer((int)fa2.elementAt(index) + value), index);
                    "".length();
                    "".length();
                    if (d((Object)null)) {
                        return;
                    }
                }
                else {
                    fa.addElement(a);
                    fa2.addElement(new Integer(value));
                }
            }
            ++i;
            "".length();
            "".length();
            if (d((Object)null)) {
                return;
            }
        }
        if (e(j(fa.size()) ? 1 : 0)) {
            if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                fl.u().g();
                a.b(1000L);
            }
            cv.b(this.ae, "<Giao d\u1ecbch tr\u1ed1ng>");
            return;
        }
        int df = 0;
        int n = 0;
        while (e(c(n, fa.size()) ? 1 : 0)) {
            final fh fh = (fh)fa.elementAt(n);
            final int intValue = (int)fa2.elementAt(n);
            if (e(i(aa.c(fh.c.d) + intValue, fh.b) ? 1 : 0)) {
                if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                    fl.u().g();
                    a.b(1000L);
                }
                cv.b(this.ae, new StringBuffer("<").append(fh.c.a).append(" b\u1ea1n \u0111\u00e1 b\u00e1n qu\u00e1 s\u1ed1 mk c\u1ea7n mua>").toString());
                return;
            }
            df += intValue * fh.j * 1000 / fh.a;
            ++n;
            "".length();
            "".length();
            if (m("   ".length(), "   ".length())) {
                return;
            }
        }
        if (e(i(df, aa.z().du) ? 1 : 0)) {
            if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                fl.u().g();
            }
            cv.b(this.ae, "<Hi\u1ec7n mk ko \u0111\u1ee7 xu, xin b\u1ea1n quay l\u1ea1i sau>");
            return;
        }
        ee.w().df = df;
        ee.ca = ca;
        fl.u().a(df, ca);
        ee.w().ea = 1;
        final long currentTimeMillis3 = System.currentTimeMillis();
        while (e(d(c(System.currentTimeMillis() - currentTimeMillis3, 5000L)) ? 1 : 0)) {
            if (e(k(fv.w ? 1 : 0) ? 1 : 0)) {
                cv.b(this.ae, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            a.b(200L);
            "".length();
            "".length();
            if (h(fv.af[25] ^ fv.af[13], "   ".length())) {
                return;
            }
        }
        fl.u().f();
        ee.w().ea = 2;
        while (e(c(ee.w().df, 2) ? 1 : 0)) {
            if (!e(j(fv.w ? 1 : 0) ? 1 : 0) || e(h(c(System.currentTimeMillis() - currentTimeMillis3, 20000L)) ? 1 : 0)) {
                if (e(k(ee.db ? 1 : 0) ? 1 : 0)) {
                    fl.u().g();
                    a.b(1000L);
                }
                cv.b(this.ae, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            a.b(200L);
            "".length();
            "".length();
            if (n(" ".length(), (fv.af[26] ^ fv.af[27]) & (fv.af[28] ^ fv.af[29] ^ fv.af[30]))) {
                return;
            }
        }
    }
    
    private static boolean k(final int n) {
        int n2;
        if (e(n)) {
            n2 = fv.af[0];
            "".length();
            if ("  ".length() < 0) {
                return ((0x76 ^ 0x1 ^ (0x5 ^ 0x7B)) & (0x25 ^ 0x19 ^ (0x1 ^ 0x34) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fv.af[1];
        }
        return n2 != 0;
    }
    
    private static boolean l(final int n, final int n2) {
        int n3;
        if (m(n, n2)) {
            n3 = fv.af[0];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x71 ^ 0x78 ^ (0x60 ^ 0x39)) & (0x3F ^ 0x60 ^ (0x95 ^ 0x9A) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fv.af[1];
        }
        return n3 != 0;
    }
    
    private static boolean l(final int n) {
        return n <= 0;
    }
    
    public final void a(final String ae, final int n) {
        if (e(k(fw.c() ? 1 : 0) ? 1 : 0)) {
            fl.u().a(n);
            this.ae = ae;
            this.ab = true;
            this.ag = true;
            this.aa = null;
            this.z = null;
            this.ad = true;
            return;
        }
        fl.u().i();
        cv.b(ae, "<Hi\u1ec7n mk ko mua vp n\u00e0o>");
    }
    
    private static void o() {
        (af = new int[68])[0] = " ".length();
        fv.af[1] = (" ".length() & ~" ".length());
        fv.af[2] = (0x2A ^ 0x2D);
        fv.af[3] = 19 + 0 + 124 + 83;
        fv.af[4] = 74 + 146 - 98 + 34;
        fv.af[5] = (0x74 ^ 0x6E);
        fv.af[6] = (0xA2 ^ 0xC2);
        fv.af[7] = (0xEE ^ 0x88);
        fv.af[8] = (0x46 ^ 0x2B ^ (0x71 ^ 0x7D));
        fv.af[9] = "  ".length();
        fv.af[10] = (0x3E ^ 0x43 ^ (0x39 ^ 0x42));
        fv.af[11] = (0x61 ^ 0x3F);
        fv.af[12] = (106 + 2 - 34 + 111 ^ 85 + 105 - 187 + 128);
        fv.af[13] = (0xC1 ^ 0xAF);
        fv.af[14] = "   ".length();
        fv.af[15] = (0x7C ^ 0x60 ^ (0x3E ^ 0x26));
        fv.af[16] = -(0xFFFFFEBB & 0x4145);
        fv.af[17] = (0xFFFFCFFA & 0x73ED);
        fv.af[18] = (0x68 ^ 0x6D);
        fv.af[19] = (0x71 ^ 0x3B) + (0x3 ^ 0x17) - (0xDE ^ 0x91) + (171 + 8 + 35 + 5);
        fv.af[20] = 130 + 7 - 46 + 107;
        fv.af[21] = (0x8 ^ 0x66 ^ (0x5F ^ 0x12));
        fv.af[22] = (0x76 ^ 0x1F ^ (0xC2 ^ 0xA2));
        fv.af[23] = (0x77 ^ 0x47);
        fv.af[24] = (0x66 ^ 0x52);
        fv.af[25] = (0x71 ^ 0x6C ^ (0x7A ^ 0xD));
        fv.af[26] = (0x16 ^ 0x3E);
        fv.af[27] = (0xE ^ 0x7D);
        fv.af[28] = (0x28 ^ 0x6D);
        fv.af[29] = (0x4C ^ 0x52);
        fv.af[30] = -" ".length();
        fv.af[31] = (0x35 ^ 0x61 ^ (0x74 ^ 0x2D));
        fv.af[32] = 115 + 1 - 75 + 87;
        fv.af[33] = (0xD5 ^ 0x91);
        fv.af[34] = 108 + 146 - 118 + 32;
        fv.af[35] = (97 + 211 - 227 + 132 ^ 144 + 82 - 213 + 171);
        fv.af[36] = (0x23 ^ 0x56);
        fv.af[37] = (0xD5 ^ 0x91 ^ (0x7C ^ 0x5D));
        fv.af[38] = 137 + 149 - 145 + 17 + (0x91 ^ 0x86) - (0x6A ^ 0x4F) + (0x28 ^ 0x33);
        fv.af[39] = (0xDF ^ 0xBB);
        fv.af[40] = (93 + 112 - 144 + 82 ^ 109 + 127 - 184 + 106);
        fv.af[41] = (135 + 131 - 215 + 85 ^ 136 + 177 - 191 + 75);
        fv.af[42] = (0xD6 ^ 0xB7) + (0x5C ^ 0x64) - (0xB0 ^ 0x8F) + (0x64 ^ 0x53);
        fv.af[43] = 23 + 141 - 65 + 76;
        fv.af[44] = (0x11 ^ 0x50);
        fv.af[45] = (84 + 25 - 0 + 31 ^ 158 + 139 - 159 + 59);
        fv.af[46] = (104 + 128 - 127 + 135 ^ 127 + 165 - 278 + 179);
        fv.af[47] = (0x37 ^ 0x19 ^ (0xA3 ^ 0xA4));
        fv.af[48] = (0xC ^ 0x2) + (0x10 ^ 0x2C) - -(0x64 ^ 0x28) + (0x3 ^ 0x19);
        fv.af[49] = (0xEE ^ 0x96) + (0x43 ^ 0x13) - (0xF3 ^ 0x82) + (0xDD ^ 0x9E);
        fv.af[50] = 158 + 95 - 138 + 94;
        fv.af[51] = 47 + 24 + 1 + 100 + (0x3E ^ 0x79) - (49 + 95 - 99 + 145) + (106 + 119 - 174 + 87);
        fv.af[52] = 118 + 187 - 265 + 184;
        fv.af[53] = 38 + 60 - 88 + 178;
        fv.af[54] = (0xD3 ^ 0xA5);
        fv.af[55] = (0x48 ^ 0x66 ^ (0x8 ^ 0x29));
        fv.af[56] = (1 + 53 - 21 + 101 ^ 63 + 90 + 24 + 8);
        fv.af[57] = 123 + 125 - 192 + 185;
        fv.af[58] = (0xA4 ^ 0xB2) + (0xA4 ^ 0x89) - -(0x9D ^ 0x83) + (0x5D ^ 0x7D);
        fv.af[59] = (22 + 48 + 19 + 54 ^ 95 + 50 - 7 + 9);
        fv.af[60] = 130 + 44 - 129 + 172;
        fv.af[61] = 23 + 171 - 152 + 141;
        fv.af[62] = (0x3E ^ 0x18);
        fv.af[63] = (219 + 235 - 326 + 121 ^ 52 + 96 - 25 + 48);
        fv.af[64] = (0x92 ^ 0xB6);
        fv.af[65] = (0x32 ^ 0xD) + (128 + 4 - 78 + 84) - (46 + 129 - 13 + 38) + (62 + 19 - 44 + 140);
        fv.af[66] = 98 + 76 - 119 + 72;
        fv.af[67] = (0x32 ^ 0x6A);
    }
    
    private static boolean m(final int n, final int n2) {
        return n != n2;
    }
    
    private static int f(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean m(final int n) {
        return n > 0;
    }
    
    private static void p() {
        (ah = new int[fv.af[2]])[fv.af[1]] = " ".length();
        fv.ah[fv.af[0]] = ((fv.af[3] ^ fv.af[4] ^ (fv.af[5] ^ fv.af[6])) & (fv.af[7] ^ fv.af[8] ^ "   ".length() ^ -" ".length()));
        fv.ah[fv.af[9]] = (fv.af[10] ^ fv.af[11] ^ (fv.af[12] ^ fv.af[13]));
        fv.ah[fv.af[14]] = -" ".length();
        fv.ah[fv.af[15]] = (fv.af[16] & fv.af[17]);
        fv.ah[fv.af[18]] = "  ".length();
        fv.ah[fv.af[10]] = "   ".length();
    }
    
    public final void a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             " "
        //     3: invokestatic    cv.a:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //     6: astore_2       
        //     7: aload_0        
        //     8: getfield        fv.ad:Z
        //    11: invokestatic    fv.k:(I)Z
        //    14: invokestatic    fv.e:(I)Z
        //    17: ifeq            40
        //    20: getstatic       ee.db:Z
        //    23: invokestatic    fv.j:(I)Z
        //    26: invokestatic    fv.e:(I)Z
        //    29: ifeq            1629
        //    32: aload_1        
        //    33: ldc_w           "<\u0110ang giao d\u1ecbch v\u1edbi ng\u01b0\u1eddi kh\u00e1c. Mong b\u1ea1n ch\u1edd gi\u00e2y l\u00e1t>"
        //    36: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //    39: return         
        //    40: aload_2        
        //    41: iconst_0       
        //    42: aaload         
        //    43: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    46: ldc_w           "buy"
        //    49: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    52: invokestatic    fv.k:(I)Z
        //    55: invokestatic    fv.e:(I)Z
        //    58: ifeq            856
        //    61: new             Lfa;
        //    64: dup            
        //    65: invokespecial   fa.<init>:()V
        //    68: astore_3       
        //    69: new             Lfa;
        //    72: dup            
        //    73: invokespecial   fa.<init>:()V
        //    76: astore          4
        //    78: iconst_0       
        //    79: istore          5
        //    81: iconst_1       
        //    82: istore          6
        //    84: aload_2        
        //    85: arraylength    
        //    86: iconst_1       
        //    87: isub           
        //    88: istore          7
        //    90: iload           6
        //    92: iload           7
        //    94: invokestatic    fv.k:(II)Z
        //    97: invokestatic    fv.e:(I)Z
        //   100: ifeq            808
        //   103: aload_2        
        //   104: iload           6
        //   106: aaload         
        //   107: astore          8
        //   109: aload_2        
        //   110: iload           6
        //   112: iconst_1       
        //   113: iadd           
        //   114: aaload         
        //   115: astore          9
        //   117: aload           8
        //   119: invokestatic    fw.b:(Ljava/lang/String;)Lfh;
        //   122: dup            
        //   123: astore          10
        //   125: invokestatic    fv.c:(Ljava/lang/Object;)Z
        //   128: invokestatic    fv.e:(I)Z
        //   131: ifeq            754
        //   134: aload           10
        //   136: getfield        fh.h:I
        //   139: invokestatic    fv.n:(I)Z
        //   142: invokestatic    fv.e:(I)Z
        //   145: ifeq            754
        //   148: aload           10
        //   150: getfield        fh.h:I
        //   153: invokestatic    fv.n:(I)Z
        //   156: invokestatic    fv.e:(I)Z
        //   159: ifeq            238
        //   162: aload           10
        //   164: getfield        fh.c:Lep;
        //   167: getfield        ep.d:S
        //   170: invokestatic    aa.c:(I)I
        //   173: aload           10
        //   175: getfield        fh.i:I
        //   178: invokestatic    fv.k:(II)Z
        //   181: invokestatic    fv.e:(I)Z
        //   184: ifeq            238
        //   187: aload_1        
        //   188: new             Ljava/lang/StringBuffer;
        //   191: dup            
        //   192: ldc_w           "<"
        //   195: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   198: aload           8
        //   200: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   203: ldc_w           " h\u1ebft h\u00e0ng>"
        //   206: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   209: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   212: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   215: ldc             ""
        //   217: invokevirtual   java/lang/String.length:()I
        //   220: ldc             ""
        //   222: invokevirtual   java/lang/String.length:()I
        //   225: pop2           
        //   226: ldc             "  "
        //   228: invokevirtual   java/lang/String.length:()I
        //   231: invokestatic    fv.f:(I)Z
        //   234: ifeq            782
        //   237: return         
        //   238: aload           9
        //   240: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   243: istore          11
        //   245: ldc             ""
        //   247: invokevirtual   java/lang/String.length:()I
        //   250: ldc             ""
        //   252: invokevirtual   java/lang/String.length:()I
        //   255: pop2           
        //   256: ldc_w           "   "
        //   259: invokevirtual   java/lang/String.length:()I
        //   262: ldc_w           "   "
        //   265: invokevirtual   java/lang/String.length:()I
        //   268: ldc_w           "   "
        //   271: invokevirtual   java/lang/String.length:()I
        //   274: ldc             " "
        //   276: invokevirtual   java/lang/String.length:()I
        //   279: ineg           
        //   280: ixor           
        //   281: iand           
        //   282: invokestatic    fv.d:(II)Z
        //   285: ifeq            342
        //   288: return         
        //   289: ldc             ""
        //   291: invokevirtual   java/lang/String.length:()I
        //   294: pop2           
        //   295: aload_1        
        //   296: new             Ljava/lang/StringBuffer;
        //   299: dup            
        //   300: ldc_w           "<"
        //   303: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   306: aload           8
        //   308: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   311: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng l\u1ed7i>"
        //   314: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   317: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   320: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   323: ldc             ""
        //   325: invokevirtual   java/lang/String.length:()I
        //   328: ldc             ""
        //   330: invokevirtual   java/lang/String.length:()I
        //   333: pop2           
        //   334: aconst_null    
        //   335: invokestatic    fv.d:(Ljava/lang/Object;)Z
        //   338: ifeq            782
        //   341: return         
        //   342: aload           10
        //   344: invokevirtual   fh.a:()I
        //   347: iload           11
        //   349: invokestatic    fv.c:(II)Z
        //   352: invokestatic    fv.e:(I)Z
        //   355: ifeq            443
        //   358: aload_1        
        //   359: new             Ljava/lang/StringBuffer;
        //   362: dup            
        //   363: ldc_w           "<"
        //   366: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   369: aload           8
        //   371: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   374: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng Item n\u00e0y hi\u1ec7n kh\u00f4ng \u0111\u1ee7>"
        //   377: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   380: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   383: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   386: ldc             ""
        //   388: invokevirtual   java/lang/String.length:()I
        //   391: ldc             ""
        //   393: invokevirtual   java/lang/String.length:()I
        //   396: pop2           
        //   397: ldc             " "
        //   399: invokevirtual   java/lang/String.length:()I
        //   402: getstatic       fv.af:[I
        //   405: bipush          54
        //   407: iaload         
        //   408: getstatic       fv.af:[I
        //   411: bipush          23
        //   413: iaload         
        //   414: ixor           
        //   415: getstatic       fv.af:[I
        //   418: bipush          45
        //   420: iaload         
        //   421: getstatic       fv.af:[I
        //   424: bipush          55
        //   426: iaload         
        //   427: ixor           
        //   428: getstatic       fv.af:[I
        //   431: bipush          30
        //   433: iaload         
        //   434: ixor           
        //   435: iand           
        //   436: invokestatic    fv.d:(II)Z
        //   439: ifeq            782
        //   442: return         
        //   443: aload           10
        //   445: getfield        fh.c:Lep;
        //   448: getfield        ep.i:Z
        //   451: invokestatic    fv.k:(I)Z
        //   454: invokestatic    fv.e:(I)Z
        //   457: ifeq            490
        //   460: iconst_1       
        //   461: ldc             ""
        //   463: invokevirtual   java/lang/String.length:()I
        //   466: ldc             ""
        //   468: invokevirtual   java/lang/String.length:()I
        //   471: pop2           
        //   472: ldc             "  "
        //   474: invokevirtual   java/lang/String.length:()I
        //   477: ldc             " "
        //   479: invokevirtual   java/lang/String.length:()I
        //   482: ineg           
        //   483: invokestatic    fv.h:(II)Z
        //   486: ifeq            492
        //   489: return         
        //   490: iload           11
        //   492: istore          12
        //   494: iload           5
        //   496: iload           12
        //   498: iadd           
        //   499: bipush          12
        //   501: invokestatic    fv.i:(II)Z
        //   504: invokestatic    fv.e:(I)Z
        //   507: ifeq            557
        //   510: aload_1        
        //   511: new             Ljava/lang/StringBuffer;
        //   514: dup            
        //   515: ldc_w           "<"
        //   518: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   521: aload           8
        //   523: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   526: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng \u0111\u1ea7y. VP sau s\u1ebd k dc t\u00ednh>"
        //   529: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   532: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   535: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   538: ldc             ""
        //   540: invokevirtual   java/lang/String.length:()I
        //   543: ldc             ""
        //   545: invokevirtual   java/lang/String.length:()I
        //   548: pop2           
        //   549: aconst_null    
        //   550: invokestatic    fv.d:(Ljava/lang/Object;)Z
        //   553: ifeq            808
        //   556: return         
        //   557: iload           5
        //   559: iload           12
        //   561: iadd           
        //   562: istore          5
        //   564: aload_3        
        //   565: aload           10
        //   567: invokevirtual   fa.addElement:(Ljava/lang/Object;)V
        //   570: aload           4
        //   572: new             Ljava/lang/Integer;
        //   575: dup            
        //   576: iload           11
        //   578: invokespecial   java/lang/Integer.<init>:(I)V
        //   581: invokevirtual   fa.addElement:(Ljava/lang/Object;)V
        //   584: ldc             ""
        //   586: invokevirtual   java/lang/String.length:()I
        //   589: ldc             ""
        //   591: invokevirtual   java/lang/String.length:()I
        //   594: pop2           
        //   595: getstatic       fv.af:[I
        //   598: bipush          36
        //   600: iaload         
        //   601: getstatic       fv.af:[I
        //   604: bipush          35
        //   606: iaload         
        //   607: ixor           
        //   608: getstatic       fv.af:[I
        //   611: bipush          9
        //   613: iaload         
        //   614: getstatic       fv.af:[I
        //   617: bipush          56
        //   619: iaload         
        //   620: ixor           
        //   621: ixor           
        //   622: getstatic       fv.af:[I
        //   625: bipush          57
        //   627: iaload         
        //   628: getstatic       fv.af:[I
        //   631: bipush          58
        //   633: iaload         
        //   634: ixor           
        //   635: getstatic       fv.af:[I
        //   638: bipush          59
        //   640: iaload         
        //   641: getstatic       fv.af:[I
        //   644: bipush          45
        //   646: iaload         
        //   647: ixor           
        //   648: ixor           
        //   649: ldc             " "
        //   651: invokevirtual   java/lang/String.length:()I
        //   654: ineg           
        //   655: ixor           
        //   656: iand           
        //   657: getstatic       fv.af:[I
        //   660: bipush          60
        //   662: iaload         
        //   663: getstatic       fv.af:[I
        //   666: bipush          61
        //   668: iaload         
        //   669: ixor           
        //   670: getstatic       fv.af:[I
        //   673: bipush          36
        //   675: iaload         
        //   676: getstatic       fv.af:[I
        //   679: bipush          62
        //   681: iaload         
        //   682: ixor           
        //   683: ixor           
        //   684: getstatic       fv.af:[I
        //   687: bipush          63
        //   689: iaload         
        //   690: getstatic       fv.af:[I
        //   693: bipush          64
        //   695: iaload         
        //   696: iadd           
        //   697: getstatic       fv.af:[I
        //   700: bipush          40
        //   702: iaload         
        //   703: isub           
        //   704: getstatic       fv.af:[I
        //   707: bipush          64
        //   709: iaload         
        //   710: iadd           
        //   711: getstatic       fv.af:[I
        //   714: bipush          47
        //   716: iaload         
        //   717: getstatic       fv.af:[I
        //   720: bipush          65
        //   722: iaload         
        //   723: iadd           
        //   724: getstatic       fv.af:[I
        //   727: bipush          66
        //   729: iaload         
        //   730: isub           
        //   731: getstatic       fv.af:[I
        //   734: bipush          67
        //   736: iaload         
        //   737: iadd           
        //   738: ixor           
        //   739: ldc             " "
        //   741: invokevirtual   java/lang/String.length:()I
        //   744: ineg           
        //   745: ixor           
        //   746: iand           
        //   747: invokestatic    fv.m:(II)Z
        //   750: ifeq            782
        //   753: return         
        //   754: aload_1        
        //   755: new             Ljava/lang/StringBuffer;
        //   758: dup            
        //   759: ldc_w           "<"
        //   762: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   765: aload           8
        //   767: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   770: ldc_w           " ko t\u1ed3n t\u1ea1i ho\u1eb7c mk ko b\u00e1n vp n\u00e0y>"
        //   773: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   776: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   779: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   782: iinc            6, 2
        //   785: ldc             ""
        //   787: invokevirtual   java/lang/String.length:()I
        //   790: ldc             ""
        //   792: invokevirtual   java/lang/String.length:()I
        //   795: pop2           
        //   796: ldc             "  "
        //   798: invokevirtual   java/lang/String.length:()I
        //   801: invokestatic    fv.i:(I)Z
        //   804: ifeq            90
        //   807: return         
        //   808: aload_3        
        //   809: invokevirtual   fa.size:()I
        //   812: invokestatic    fv.j:(I)Z
        //   815: invokestatic    fv.e:(I)Z
        //   818: ifeq            829
        //   821: aload_1        
        //   822: ldc_w           "<Giao d\u1ecbch r\u1ed7ng>"
        //   825: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   828: return         
        //   829: aload_0        
        //   830: aload_1        
        //   831: putfield        fv.ae:Ljava/lang/String;
        //   834: aload_0        
        //   835: iconst_0       
        //   836: putfield        fv.ab:Z
        //   839: aload_0        
        //   840: aload_3        
        //   841: putfield        fv.aa:Lfa;
        //   844: aload_0        
        //   845: aload           4
        //   847: putfield        fv.z:Lfa;
        //   850: aload_0        
        //   851: iconst_1       
        //   852: putfield        fv.ad:Z
        //   855: return         
        //   856: aload_2        
        //   857: iconst_0       
        //   858: aaload         
        //   859: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   862: ldc_w           "mua"
        //   865: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   868: invokestatic    fv.j:(I)Z
        //   871: invokestatic    fv.e:(I)Z
        //   874: ifeq            1033
        //   877: aload_2        
        //   878: iconst_0       
        //   879: aaload         
        //   880: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   883: ldc_w           "donate"
        //   886: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   889: invokestatic    fv.k:(I)Z
        //   892: invokestatic    fv.e:(I)Z
        //   895: ifeq            924
        //   898: aload_0        
        //   899: aload_1        
        //   900: putfield        fv.ae:Ljava/lang/String;
        //   903: aload_0        
        //   904: iconst_0       
        //   905: putfield        fv.ab:Z
        //   908: aload_0        
        //   909: aconst_null    
        //   910: putfield        fv.aa:Lfa;
        //   913: aload_0        
        //   914: aconst_null    
        //   915: putfield        fv.z:Lfa;
        //   918: aload_0        
        //   919: iconst_1       
        //   920: putfield        fv.ad:Z
        //   923: return         
        //   924: aload_2        
        //   925: iconst_0       
        //   926: aaload         
        //   927: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   930: ldc_w           "sell"
        //   933: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   936: invokestatic    fv.k:(I)Z
        //   939: invokestatic    fv.e:(I)Z
        //   942: ifeq            996
        //   945: invokestatic    fw.c:()Z
        //   948: invokestatic    fv.k:(I)Z
        //   951: invokestatic    fv.e:(I)Z
        //   954: ifeq            988
        //   957: aload_0        
        //   958: aload_1        
        //   959: putfield        fv.ae:Ljava/lang/String;
        //   962: aload_0        
        //   963: iconst_1       
        //   964: putfield        fv.ab:Z
        //   967: aload_0        
        //   968: iconst_0       
        //   969: putfield        fv.ag:Z
        //   972: aload_0        
        //   973: aconst_null    
        //   974: putfield        fv.aa:Lfa;
        //   977: aload_0        
        //   978: aconst_null    
        //   979: putfield        fv.z:Lfa;
        //   982: aload_0        
        //   983: iconst_1       
        //   984: putfield        fv.ad:Z
        //   987: return         
        //   988: aload_1        
        //   989: ldc_w           "<Hi\u1ec7n mk ko mua vp n\u00e0o>"
        //   992: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   995: return         
        //   996: aload_1        
        //   997: ldc_w           "<B\u00e1n h\u00e0ng t\u1ef1 \u0111\u1ed9ng v4 By Leo>"
        //  1000: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1003: aload_1        
        //  1004: ldc_w           "<Danh s\u00e1ch h\u00e0ng>"
        //  1007: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1010: aload_1        
        //  1011: invokestatic    fw.c:(Ljava/lang/String;)V
        //  1014: aload_1        
        //  1015: ldc_w           "<-------------------------->"
        //  1018: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1021: aload_1        
        //  1022: invokestatic    fw.a:(Ljava/lang/String;)V
        //  1025: aload_1        
        //  1026: ldc_w           "<-------------------------->"
        //  1029: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1032: return         
        //  1033: new             Lfa;
        //  1036: dup            
        //  1037: invokespecial   fa.<init>:()V
        //  1040: astore_3       
        //  1041: new             Lfa;
        //  1044: dup            
        //  1045: invokespecial   fa.<init>:()V
        //  1048: astore          4
        //  1050: iconst_0       
        //  1051: istore          5
        //  1053: iconst_1       
        //  1054: istore          6
        //  1056: aload_2        
        //  1057: arraylength    
        //  1058: iconst_1       
        //  1059: isub           
        //  1060: istore          7
        //  1062: iload           6
        //  1064: iload           7
        //  1066: invokestatic    fv.k:(II)Z
        //  1069: invokestatic    fv.e:(I)Z
        //  1072: ifeq            1582
        //  1075: aload_2        
        //  1076: iload           6
        //  1078: aaload         
        //  1079: astore          8
        //  1081: aload_2        
        //  1082: iload           6
        //  1084: iconst_1       
        //  1085: iadd           
        //  1086: aaload         
        //  1087: dup            
        //  1088: astore          9
        //  1090: invokestatic    fw.b:(Ljava/lang/String;)Lfh;
        //  1093: dup            
        //  1094: astore          10
        //  1096: invokestatic    fv.c:(Ljava/lang/Object;)Z
        //  1099: invokestatic    fv.e:(I)Z
        //  1102: ifeq            1523
        //  1105: aload           10
        //  1107: getfield        fh.h:I
        //  1110: invokestatic    fv.n:(I)Z
        //  1113: invokestatic    fv.e:(I)Z
        //  1116: ifeq            1523
        //  1119: aload           10
        //  1121: getfield        fh.h:I
        //  1124: invokestatic    fv.n:(I)Z
        //  1127: invokestatic    fv.e:(I)Z
        //  1130: ifeq            1205
        //  1133: aload           10
        //  1135: getfield        fh.c:Lep;
        //  1138: getfield        ep.d:S
        //  1141: invokestatic    aa.c:(I)I
        //  1144: aload           10
        //  1146: getfield        fh.i:I
        //  1149: invokestatic    fv.k:(II)Z
        //  1152: invokestatic    fv.e:(I)Z
        //  1155: ifeq            1205
        //  1158: aload_1        
        //  1159: new             Ljava/lang/StringBuffer;
        //  1162: dup            
        //  1163: ldc_w           "<"
        //  1166: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //  1169: aload           9
        //  1171: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1174: ldc_w           " h\u1ebft h\u00e0ng>"
        //  1177: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1180: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //  1183: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1186: ldc             ""
        //  1188: invokevirtual   java/lang/String.length:()I
        //  1191: ldc             ""
        //  1193: invokevirtual   java/lang/String.length:()I
        //  1196: pop2           
        //  1197: aconst_null    
        //  1198: invokestatic    fv.d:(Ljava/lang/Object;)Z
        //  1201: ifeq            1551
        //  1204: return         
        //  1205: aload           8
        //  1207: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1210: istore          11
        //  1212: ldc             ""
        //  1214: invokevirtual   java/lang/String.length:()I
        //  1217: ldc             ""
        //  1219: invokevirtual   java/lang/String.length:()I
        //  1222: pop2           
        //  1223: aconst_null    
        //  1224: invokestatic    fv.d:(Ljava/lang/Object;)Z
        //  1227: ifeq            1295
        //  1230: return         
        //  1231: ldc             ""
        //  1233: invokevirtual   java/lang/String.length:()I
        //  1236: pop2           
        //  1237: aload_1        
        //  1238: new             Ljava/lang/StringBuffer;
        //  1241: dup            
        //  1242: ldc_w           "<"
        //  1245: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //  1248: aload           9
        //  1250: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1253: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng l\u1ed7i>"
        //  1256: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1259: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //  1262: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1265: ldc             ""
        //  1267: invokevirtual   java/lang/String.length:()I
        //  1270: ldc             ""
        //  1272: invokevirtual   java/lang/String.length:()I
        //  1275: pop2           
        //  1276: ldc             " "
        //  1278: invokevirtual   java/lang/String.length:()I
        //  1281: ineg           
        //  1282: ldc             " "
        //  1284: invokevirtual   java/lang/String.length:()I
        //  1287: ineg           
        //  1288: invokestatic    fv.e:(II)Z
        //  1291: ifeq            1551
        //  1294: return         
        //  1295: aload           10
        //  1297: invokevirtual   fh.a:()I
        //  1300: iload           11
        //  1302: invokestatic    fv.c:(II)Z
        //  1305: invokestatic    fv.e:(I)Z
        //  1308: ifeq            1364
        //  1311: aload_1        
        //  1312: new             Ljava/lang/StringBuffer;
        //  1315: dup            
        //  1316: ldc_w           "<"
        //  1319: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //  1322: aload           9
        //  1324: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1327: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng Item n\u00e0y hi\u1ec7n kh\u00f4ng \u0111\u1ee7>"
        //  1330: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1333: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //  1336: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1339: ldc             ""
        //  1341: invokevirtual   java/lang/String.length:()I
        //  1344: ldc             ""
        //  1346: invokevirtual   java/lang/String.length:()I
        //  1349: pop2           
        //  1350: ldc_w           "   "
        //  1353: invokevirtual   java/lang/String.length:()I
        //  1356: ineg           
        //  1357: invokestatic    fv.m:(I)Z
        //  1360: ifeq            1551
        //  1363: return         
        //  1364: aload           10
        //  1366: getfield        fh.c:Lep;
        //  1369: getfield        ep.i:Z
        //  1372: invokestatic    fv.k:(I)Z
        //  1375: invokestatic    fv.e:(I)Z
        //  1378: ifeq            1401
        //  1381: iconst_1       
        //  1382: ldc             ""
        //  1384: invokevirtual   java/lang/String.length:()I
        //  1387: ldc             ""
        //  1389: invokevirtual   java/lang/String.length:()I
        //  1392: pop2           
        //  1393: aconst_null    
        //  1394: invokestatic    fv.d:(Ljava/lang/Object;)Z
        //  1397: ifeq            1403
        //  1400: return         
        //  1401: iload           11
        //  1403: istore          12
        //  1405: iload           5
        //  1407: iload           12
        //  1409: iadd           
        //  1410: bipush          12
        //  1412: invokestatic    fv.i:(II)Z
        //  1415: invokestatic    fv.e:(I)Z
        //  1418: ifeq            1477
        //  1421: aload_1        
        //  1422: new             Ljava/lang/StringBuffer;
        //  1425: dup            
        //  1426: ldc_w           "<"
        //  1429: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //  1432: aload           9
        //  1434: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1437: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng \u0111\u1ea7y. VP sau s\u1ebd k dc t\u00ednh>"
        //  1440: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1443: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //  1446: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1449: ldc             ""
        //  1451: invokevirtual   java/lang/String.length:()I
        //  1454: ldc             ""
        //  1456: invokevirtual   java/lang/String.length:()I
        //  1459: pop2           
        //  1460: ldc             "  "
        //  1462: invokevirtual   java/lang/String.length:()I
        //  1465: ldc             "  "
        //  1467: invokevirtual   java/lang/String.length:()I
        //  1470: invokestatic    fv.m:(II)Z
        //  1473: ifeq            1582
        //  1476: return         
        //  1477: iload           5
        //  1479: iload           12
        //  1481: iadd           
        //  1482: istore          5
        //  1484: aload_3        
        //  1485: aload           10
        //  1487: invokevirtual   fa.addElement:(Ljava/lang/Object;)V
        //  1490: aload           4
        //  1492: new             Ljava/lang/Integer;
        //  1495: dup            
        //  1496: iload           11
        //  1498: invokespecial   java/lang/Integer.<init>:(I)V
        //  1501: invokevirtual   fa.addElement:(Ljava/lang/Object;)V
        //  1504: ldc             ""
        //  1506: invokevirtual   java/lang/String.length:()I
        //  1509: ldc             ""
        //  1511: invokevirtual   java/lang/String.length:()I
        //  1514: pop2           
        //  1515: aconst_null    
        //  1516: invokestatic    fv.d:(Ljava/lang/Object;)Z
        //  1519: ifeq            1551
        //  1522: return         
        //  1523: aload_1        
        //  1524: new             Ljava/lang/StringBuffer;
        //  1527: dup            
        //  1528: ldc_w           "<"
        //  1531: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //  1534: aload           9
        //  1536: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1539: ldc_w           " ko t\u1ed3n t\u1ea1i ho\u1eb7c mk ko b\u00e1n vp n\u00e0y>"
        //  1542: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //  1545: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //  1548: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1551: iinc            6, 2
        //  1554: ldc             ""
        //  1556: invokevirtual   java/lang/String.length:()I
        //  1559: ldc             ""
        //  1561: invokevirtual   java/lang/String.length:()I
        //  1564: pop2           
        //  1565: ldc             " "
        //  1567: invokevirtual   java/lang/String.length:()I
        //  1570: ldc             "  "
        //  1572: invokevirtual   java/lang/String.length:()I
        //  1575: invokestatic    fv.j:(II)Z
        //  1578: ifeq            1062
        //  1581: return         
        //  1582: aload_3        
        //  1583: invokevirtual   fa.size:()I
        //  1586: invokestatic    fv.j:(I)Z
        //  1589: invokestatic    fv.e:(I)Z
        //  1592: ifeq            1603
        //  1595: aload_1        
        //  1596: ldc_w           "<Giao d\u1ecbch r\u1ed7ng>"
        //  1599: invokestatic    cv.b:(Ljava/lang/String;Ljava/lang/String;)V
        //  1602: return         
        //  1603: aload_0        
        //  1604: aload_1        
        //  1605: putfield        fv.ae:Ljava/lang/String;
        //  1608: aload_0        
        //  1609: iconst_0       
        //  1610: putfield        fv.ab:Z
        //  1613: aload_0        
        //  1614: aload_3        
        //  1615: putfield        fv.aa:Lfa;
        //  1618: aload_0        
        //  1619: aload           4
        //  1621: putfield        fv.z:Lfa;
        //  1624: aload_0        
        //  1625: iconst_1       
        //  1626: putfield        fv.ad:Z
        //  1629: return         
        //    StackMap: 00 1F 00 28 00 03 07 00 02 07 00 24 07 01 9E 00 00 00 5A 00 08 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 00 00 00 EE 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 00 01 21 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 01 07 01 97 01 56 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 00 01 BB 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 00 01 EA 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 00 01 EC 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 01 01 02 2D 00 0D 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 01 00 00 02 F2 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 00 03 0E 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 00 03 28 00 08 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 00 00 03 3D 00 08 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 00 00 03 58 00 03 07 00 02 07 00 24 07 01 9E 00 00 03 9C 00 03 07 00 02 07 00 24 07 01 9E 00 00 03 DC 00 03 07 00 02 07 00 24 07 01 9E 00 00 03 E4 00 03 07 00 02 07 00 24 07 01 9E 00 00 04 09 00 03 07 00 02 07 00 24 07 01 9E 00 00 04 26 00 08 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 00 00 04 B5 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 00 04 CF 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 01 07 01 97 05 0F 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 00 05 54 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 00 05 79 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 00 05 7B 00 0C 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 00 01 01 05 C5 00 0D 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 01 01 00 00 05 F3 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 00 06 0F 00 0B 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 07 00 24 07 00 24 07 00 51 00 00 06 2E 00 08 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 00 00 06 43 00 08 07 00 02 07 00 24 07 01 9E 07 00 46 07 00 46 01 01 01 00 00 06 5D 00 03 07 00 02 07 00 24 07 01 9E 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  238    245    289    342    Ljava/lang/Exception;
        //  1205   1212   1231   1295   Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean n(final int n) {
        int n2;
        if (m(n)) {
            n2 = fv.af[0];
            "".length();
            if (-"   ".length() > 0) {
                return ((0xDF ^ 0x8C ^ (0x1C ^ 0x49)) & (0x32 ^ 0x79 ^ (0x72 ^ 0x3F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fv.af[1];
        }
        return n2 != 0;
    }
    
    private static boolean n(final int n, final int n2) {
        return n == n2;
    }
    
    public final void e() {
        if (e(k(a.h() ? 1 : 0) ? 1 : 0)) {
            a.a(true);
            return;
        }
        if (e(f(super.k, fr.s) ? 1 : 0) && e(f(super.b, fr.g) ? 1 : 0)) {
            if (e(k(this.ad ? 1 : 0) ? 1 : 0)) {
                final String ae = this.ae;
                int n = 0;
                while (true) {
                    while (!e(g(n, ee.de.size()) ? 1 : 0)) {
                        final aa aa;
                        if (e(k((aa = (aa)ee.de.elementAt(n)).ei.equals(ae) ? 1 : 0) ? 1 : 0)) {
                            final aa aa2 = aa;
                            "".length();
                            "".length();
                            if (g(-"   ".length())) {
                                return;
                            }
                            final aa aa3 = aa2;
                            if (!e(b((Object)aa2) ? 1 : 0)) {
                                if (e(k(this.ab ? 1 : 0) ? 1 : 0)) {
                                    this.f(aa3);
                                    "".length();
                                    "".length();
                                    if (m("   ".length(), "   ".length())) {
                                        return;
                                    }
                                }
                                else {
                                    this.e(aa3);
                                }
                                a.b(500L);
                                this.ad = false;
                                return;
                            }
                            if (e(c(this.ae) ? 1 : 0)) {
                                cv.b(this.ae, new StringBuffer().append("<H\u00e3y \u0111\u1ebfn ").append(fr.ah[fr.s]).append(" khu ").append(fr.g).append(" \u0111\u1ec3 giao d\u1ecbch>").toString());
                            }
                            this.ad = false;
                            "".length();
                            "".length();
                            if (h("   ".length(), "   ".length())) {
                                return;
                            }
                            return;
                        }
                        else {
                            ++n;
                            "".length();
                            "".length();
                            if (d((Object)null)) {
                                return;
                            }
                            continue;
                        }
                    }
                    final aa aa2 = null;
                    "".length();
                    "".length();
                    if (d((Object)null)) {
                        return;
                    }
                    continue;
                }
            }
            else {
                if (!e(f(aa.z().ai, this.x) ? 1 : 0) || e(l(aa.z().eu, this.y) ? 1 : 0)) {
                    aa.a(this.x, this.y);
                    "".length();
                    a.b(500L);
                }
                if ((!e(l(dm.b, 1) ? 1 : 0) || e(f(dm.b, 3) ? 1 : 0)) && e(h(d(System.currentTimeMillis() - this.ac, 5000L)) ? 1 : 0) && e(j(fw.b().equals("") ? 1 : 0) ? 1 : 0)) {
                    fl.u().d(fw.b());
                    this.ac = System.currentTimeMillis();
                }
            }
        }
        else {
            this.a(super.k, super.b, -1, -1);
        }
    }
    
    public fv() {
        super();
    }
}
