import javax.microedition.io.*;
import javax.wireless.messaging.*;

public final class l implements Runnable
{
    private final String a;
    private final fe b;
    private final fe c;
    private final String d;
    private final String e;
    
    public static void a(final String s, final String s2, final fe fe, final fe fe2) {
        new Thread(new l(s2, s, s2, fe, fe2)).start();
    }
    
    public final void run() {
        try {
            final MessageConnection messageConnection;
            final TextMessage textMessage;
            (textMessage = (TextMessage)(messageConnection = (MessageConnection)Connector.open(this.a)).newMessage("text")).setAddress(this.a);
            textMessage.setPayloadText(this.e);
            messageConnection.send((Message)textMessage);
            System.out.println(new StringBuffer().append("SMS data: ").append(this.e).append(", to: ").append(this.d).toString());
            this.b.b();
        }
        catch (final Exception ex) {
            "".length();
            this.c.b();
        }
    }
    
    private l(final String a, final String e, final String d, final fe b, final fe c) {
        super();
        this.a = a;
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
    }
}
