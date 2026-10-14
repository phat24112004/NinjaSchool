public final class ag
{
    private static final int[] k;
    public short a;
    public String b;
    public long c;
    public int d;
    public short e;
    public fa f;
    public byte g;
    private static final int[] l;
    public int h;
    public int i;
    public String j;
    
    private static void a() {
        (l = new int[2])[0] = " ".length();
        ag.l[1] = ((0x5C ^ 0x74) & ~(0xE9 ^ 0xC1));
    }
    
    static {
        a();
        b();
    }
    
    public ag(final String j, final byte g, final short e, final short a, final int d, final String b, final fa f, final int i, final int h) {
        super();
        this.j = "";
        this.d = -1;
        this.b = "";
        this.f = new fa();
        this.i = -1;
        this.h = -1;
        this.j = j;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.f = f;
        this.i = i;
        this.h = h;
        this.c = System.currentTimeMillis();
        this.g = g;
    }
    
    private static void b() {
        (k = new int[ag.l[0]])[ag.l[1]] = -" ".length();
    }
}
