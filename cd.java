import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public final class cd implements CommandListener
{
    private static final int[] a;
    private cc b;
    private static final int[] c;
    private final TextBox d;
    
    private static boolean a(final int n) {
        int n2;
        if (b(n)) {
            n2 = cd.c[0];
            "".length();
            if (-(0xB8 ^ 0xBC) > 0) {
                return ((0x5E ^ 0x6C) & ~(0x1 ^ 0x33)) != 0x0;
            }
        }
        else {
            n2 = cd.c[1];
        }
        return n2 != 0;
    }
    
    cd(final cc b, final TextBox d) {
        super();
        this.b = b;
        this.d = d;
    }
    
    private static void a() {
        (a = new int[cd.c[0]])[cd.c[1]] = " ".length();
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    private static void b() {
        (c = new int[2])[0] = " ".length();
        cd.c[1] = ((0xF2 ^ 0xBD) & ~(0xE6 ^ 0xA9));
    }
    
    static {
        b();
        a();
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (b(a(command.getLabel().equals(co.ig) ? 1 : 0) ? 1 : 0)) {
            this.b.a(this.d.getString());
        }
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)ey.a);
        ey.a.setFullScreenMode(true);
        this.b.d = true;
    }
}
