public final class bg
{
    private static final int[] b;
    private static final int[] c;
    public static boolean a;
    
    static {
        b();
        a();
        bg.a = true;
    }
    
    private static void a() {
        (c = new int[bg.b[0]])[bg.b[1]] = " ".length();
    }
    
    private static void b() {
        (b = new int[2])[0] = " ".length();
        bg.b[1] = ("   ".length() & ("   ".length() ^ -" ".length()));
    }
}
