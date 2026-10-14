public final class ad
{
    public int a;
    public short b;
    private static final int[] g;
    public String[] c;
    public short[] d;
    public String[] e;
    public String[] f;
    private static final int[] h;
    
    private static void a() {
        (g = new int[ad.h[1]])[ad.h[0]] = ad.h[2] + ad.h[3] - ad.h[4] + ad.h[5];
    }
    
    private static void b() {
        (h = new int[6])[0] = ((0x74 ^ 0x72) & ~(0x30 ^ 0x36));
        ad.h[1] = " ".length();
        ad.h[2] = 39 + 34 + 37 + 35;
        ad.h[3] = (0x45 ^ 0x14) + (0xD ^ 0x10) - (0xA1 ^ 0x9C) + (0x74 ^ 0x1D);
        ad.h[4] = (0xFFFFB58B & 0x4B7E);
        ad.h[5] = (0x41 ^ 0x6A ^ (0xFB ^ 0xAA));
    }
    
    public ad(final byte a, final String s, final String s2, final String[] c, final short[] d, final short b) {
        super();
        this.a = a;
        this.e = cl.h.b(s, 155);
        this.f = cl.m.b(s2, 155);
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    static {
        b();
        a();
    }
}
