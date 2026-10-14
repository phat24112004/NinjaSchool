public final class bu
{
    public int a;
    public int b;
    public int c;
    private static final int[] g;
    private static final int[] h;
    public int d;
    public int e;
    public int f;
    
    static {
        a();
        b();
    }
    
    public bu(final int b, final int a) {
        super();
        this.d = 0;
        this.b = b;
        this.a = a;
    }
    
    public bu() {
        super();
        this.d = 0;
        this.b = 0;
        this.a = 0;
    }
    
    private static void a() {
        (h = new int[7])[0] = ((0x15 ^ 0x9) & ~(0xAE ^ 0xB2));
        bu.h[1] = " ".length();
        bu.h[2] = (161 + 102 - 195 + 175 ^ 162 + 178 - 194 + 37);
        bu.h[3] = (0xC4 ^ 0x86 ^ (0x74 ^ 0x20));
        bu.h[4] = 31 + 117 - 28 + 97;
        bu.h[5] = 118 + 107 - 151 + 65;
        bu.h[6] = -" ".length();
    }
    
    private static void b() {
        (g = new int[bu.h[1]])[bu.h[0]] = ((bu.h[2] ^ bu.h[3]) & (bu.h[4] ^ bu.h[5] ^ bu.h[6]) & (("   ".length() & ("   ".length() ^ bu.h[6])) ^ bu.h[6]));
    }
}
