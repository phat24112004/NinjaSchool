import java.io.*;

public final class eu
{
    private DataOutputStream b;
    private static final int[] c;
    public byte a;
    private DataInputStream d;
    private ByteArrayInputStream e;
    private ByteArrayOutputStream f;
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = eu.c[0];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x86 ^ 0x9B) & ~(0x7D ^ 0x60)) != 0x0;
            }
        }
        else {
            n = eu.c[1];
        }
        return n != 0;
    }
    
    public eu() {
        super();
        this.f = null;
        this.b = null;
        this.e = null;
        this.d = null;
    }
    
    private static void e() {
        (c = new int[2])[0] = " ".length();
        eu.c[1] = ((0xAA ^ 0xB6) & ~(0x46 ^ 0x5A));
    }
    
    private static boolean a(final int n) {
        return n != 0;
    }
    
    public final void a() {
        try {
            if (a(a(this.d) ? 1 : 0)) {
                this.d.close();
            }
            if (a(a(this.b) ? 1 : 0)) {
                this.b.close();
            }
        }
        catch (final IOException ex) {
            "".length();
        }
    }
    
    public eu(final byte a, final byte[] buf) {
        super();
        this.f = null;
        this.b = null;
        this.e = null;
        this.d = null;
        this.a = a;
        this.e = new ByteArrayInputStream(buf);
        this.d = new DataInputStream(this.e);
    }
    
    static {
        e();
    }
    
    public final DataInputStream b() {
        return this.d;
    }
    
    public final DataOutputStream c() {
        return this.b;
    }
    
    public final byte[] d() {
        return this.f.toByteArray();
    }
    
    public eu(final byte a) {
        super();
        this.f = null;
        this.b = null;
        this.e = null;
        this.d = null;
        this.a = a;
        this.f = new ByteArrayOutputStream();
        this.b = new DataOutputStream(this.f);
    }
    
    private static boolean b(final Object o) {
        return o != null;
    }
}
