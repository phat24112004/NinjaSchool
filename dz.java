public final class dz implements Runnable
{
    private static final int[] a;
    private static final int[] b;
    private fm c;
    private fa d;
    
    private static boolean a(final int n) {
        int n2;
        if (f(n)) {
            n2 = dz.a[0];
            "".length();
            if (null != null) {
                return ((0x1C ^ 0x3D) & ~(0x51 ^ 0x70)) != 0x0;
            }
        }
        else {
            n2 = dz.a[1];
        }
        return n2 != 0;
    }
    
    private static void b() {
        (a = new int[22])[0] = " ".length();
        dz.a[1] = ((0x17 ^ 0x4E ^ ((0x8F ^ 0xA0) & ~(0xA1 ^ 0x8E))) & (0x64 ^ 0x5D ^ (0x4F ^ 0x2F) ^ -" ".length()));
        dz.a[2] = (0x73 ^ 0x7D);
        dz.a[3] = (0x2E ^ 0x53 ^ (0x62 ^ 0x48));
        dz.a[4] = (0xBC ^ 0x90);
        dz.a[5] = (209 + 127 - 328 + 203 ^ 152 + 125 - 192 + 68);
        dz.a[6] = (0x3 ^ 0x71);
        dz.a[7] = (160 + 151 - 134 + 31 ^ 40 + 69 + 38 + 2);
        dz.a[8] = (0x49 ^ 0x5E) + (0xA ^ 0x3C) - (0xED ^ 0xC4) + (0xB ^ 0x66);
        dz.a[9] = (90 + 104 - 41 + 75 ^ 67 + 25 - 38 + 78);
        dz.a[10] = (0x9F ^ 0x9B);
        dz.a[11] = "   ".length();
        dz.a[12] = (0x97 ^ 0xA2 ^ (0xD9 ^ 0x85));
        dz.a[13] = (0x17 ^ 0x39);
        dz.a[14] = (0x24 ^ 0x5A ^ (0x24 ^ 0x4B));
        dz.a[15] = (0x96 ^ 0xA2 ^ (0x5C ^ 0x4D));
        dz.a[16] = (0xF5 ^ 0x92) + (0xD0 ^ 0x81) - (35 + 38 - 6 + 75) + (121 + 126 - 166 + 48);
        dz.a[17] = (0x26 ^ 0x7B);
        dz.a[18] = (0x1 ^ 0x26 ^ (0x50 ^ 0x30));
        dz.a[19] = (0xD7 ^ 0x9E ^ (0x28 ^ 0x45));
        dz.a[20] = (0x6C ^ 0xF ^ (0x21 ^ 0x7C));
        dz.a[21] = -" ".length();
    }
    
    public final void a(final eu eu) {
        this.d.addElement(eu);
    }
    
    private static void c() {
        (b = new int[dz.a[0]])[dz.a[1]] = ((dz.a[17] ^ dz.a[18]) & (dz.a[19] ^ dz.a[20] ^ dz.a[21]));
    }
    
    public final void a() {
        this.d.removeAllElements();
    }
    
    public dz(final fm c) {
        super();
        this.c = c;
        this.d = new fa();
    }
    
    private static boolean b(final int n) {
        return n == 0;
    }
    
    private static boolean c(final int n) {
        return n <= 0;
    }
    
    private static boolean d(final int n) {
        return n != 0;
    }
    
    static {
        b();
        c();
    }
    
    private static boolean e(final int n) {
        int n2;
        if (d(n)) {
            n2 = dz.a[0];
            "".length();
            if (null != null) {
                return ((0x73 ^ 0x38) & ~(0x12 ^ 0x59)) != 0x0;
            }
        }
        else {
            n2 = dz.a[1];
        }
        return n2 != 0;
    }
    
    public final void run() {
        try {
            while (d(e(this.c.n ? 1 : 0) ? 1 : 0)) {
                if (d(e(fm.e(this.c) ? 1 : 0) ? 1 : 0)) {
                    while (d(a(this.d.size()) ? 1 : 0)) {
                        final eu eu = (eu)this.d.elementAt(0);
                        this.d.removeElementAt(0);
                        fm.a(this.c, eu);
                        "".length();
                        "".length();
                        if (b(dz.a[2] + dz.a[3] - dz.a[4] + dz.a[5] ^ dz.a[6] + dz.a[7] - dz.a[8] + dz.a[9])) {
                            return;
                        }
                    }
                }
                Thread.sleep(10L);
                "".length();
                "".length();
                if (c(dz.a[10] + dz.a[3] - dz.a[11] + dz.a[12] ^ dz.a[13] + dz.a[14] - dz.a[15] + dz.a[16])) {
                    return;
                }
            }
        }
        catch (final InterruptedException ex) {
            "".length();
        }
    }
    
    private static boolean f(final int n) {
        return n > 0;
    }
}
