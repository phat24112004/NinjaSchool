import javax.microedition.lcdui.*;

public final class cn
{
    private static final int[] c;
    public static int a;
    public Graphics b;
    private static final int[] d;
    
    public final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        n5 *= cn.a;
        n6 *= cn.a;
        this.b.fillRoundRect(n, n2, n3, n4, n5, n6);
    }
    
    private static void c() {
        (c = new int[11])[0] = ((0x51 ^ 0x5A ^ (0x4F ^ 0x41)) & (0x45 ^ 0x31 ^ (0xE9 ^ 0x98) ^ -" ".length()));
        cn.c[1] = " ".length();
        cn.c[2] = "   ".length();
        cn.c[3] = (95 + 222 - 110 + 37 ^ 4 + 69 - 7 + 116);
        cn.c[4] = (4 + 4 + 35 + 105 ^ 124 + 143 - 128 + 42);
        cn.c[5] = (0xF5 ^ 0xB5);
        cn.c[6] = (0x18 ^ 0x3B);
        cn.c[7] = -" ".length();
        cn.c[8] = -(0xFFFFFFDF & 0x7A28);
        cn.c[9] = (-(0xFFFFE791 & 0x1CEF) & (0xFFFFFFEF & 0x7FFF));
        cn.c[10] = "  ".length();
    }
    
    public final void a(int n, int n2, int n3, int n4) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        this.b.drawArc(n, n2, n3, n4, 0, 360);
    }
    
    public final void b(int n, int n2, int n3, int n4) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        this.b.drawLine(n, n2, n3, n4);
    }
    
    public final void a(final int color) {
        this.b.setColor(color);
    }
    
    public final void c(int n, int n2, int n3, int n4) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        this.b.fillRect(n, n2, n3, n4);
    }
    
    public cn(final Graphics b) {
        super();
        this.b = b;
    }
    
    public final int a() {
        return this.b.getTranslateY() / cn.a;
    }
    
    public cn() {
        super();
    }
    
    public final int b() {
        return this.b.getTranslateX() / cn.a;
    }
    
    static {
        c();
        d();
        cn.a = 1;
    }
    
    public final void a(int n, int n2) {
        n *= cn.a;
        n2 *= cn.a;
        this.b.translate(n, n2);
    }
    
    public final void b(int n, int n2, int n3, int n4, int n5, int n6) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        n5 *= cn.a;
        n6 *= cn.a;
        this.b.drawRoundRect(n, n2, n3, n4, n5, n6);
    }
    
    public final void a(final Image image, int n, int n2, final int n3) {
        n *= cn.a;
        n2 *= cn.a;
        this.b.drawImage(image, n, n2, n3);
    }
    
    public final void a(final Image image, int n, int n2, int n3, int n4, final int n5, int n6, int n7, final int n8) {
        n6 *= cn.a;
        n7 *= cn.a;
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        this.b.drawRegion(image, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public static int a(final Image image) {
        return image.getHeight() / cn.a;
    }
    
    public final void d(int n, int n2, int n3, int n4) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        this.b.setClip(n, n2, n3, n4);
    }
    
    private static void d() {
        (d = new int[cn.c[2]])[cn.c[0]] = ((cn.c[3] ^ cn.c[4]) & (cn.c[5] ^ cn.c[6] ^ cn.c[7]));
        cn.d[cn.c[1]] = (cn.c[8] & cn.c[9]);
        cn.d[cn.c[10]] = " ".length();
    }
    
    public static int b(final Image image) {
        return image.getWidth() / cn.a;
    }
    
    public final void e(int n, int n2, int n3, int n4) {
        n *= cn.a;
        n2 *= cn.a;
        n3 *= cn.a;
        n4 *= cn.a;
        this.b.drawRect(n, n2, n3, n4);
    }
}
