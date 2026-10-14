import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.rms.*;
import java.io.*;

public class autoh implements CommandListener
{
    public static boolean isTimerActive;
    public static int hOff;
    public static int mOff;
    public static int hOn;
    public static int mOn;
    private Form form;
    private ChoiceGroup cgStatus;
    private TextField txtHourOff;
    private TextField txtMinOff;
    private TextField txtHourOn;
    private TextField txtMinOn;
    private Command cmdSave;
    private Command cmdCancel;
    public static boolean isSleeping;
    
    public autoh() {
        super();
        this.form = new Form("C\u00e0i \u0111\u1eb7t h\u1eb9n gi\u00f2");
        this.cgStatus = new ChoiceGroup("Tr\u1ea1ng th\u00e1i", 1, new String[] { "T\u1eaft", "B\u1eadt" }, (Image[])null);
        this.txtHourOff = new TextField("Gi\u1edd OFF (0-23)", "" + autoh.hOff, 2, 2);
        this.txtMinOff = new TextField("Ph\u00fat OFF (0-59)", "" + autoh.mOff, 2, 2);
        this.txtHourOn = new TextField("Gi\u1edd ON (0-23)", "" + autoh.hOn, 2, 2);
        this.txtMinOn = new TextField("Ph\u00fat ON (0-59)", "" + autoh.mOn, 2, 2);
        this.form.append((Item)this.cgStatus);
        this.form.append((Item)this.txtHourOff);
        this.form.append((Item)this.txtMinOff);
        this.form.append((Item)this.txtHourOn);
        this.form.append((Item)this.txtMinOn);
        this.cgStatus.setSelectedIndex((int)(autoh.isTimerActive ? 1 : 0), true);
        this.cmdSave = new Command("L\u01b0u", 4, 1);
        this.cmdCancel = new Command("H\u1ee7y", 7, 1);
        this.form.addCommand(this.cmdSave);
        this.form.addCommand(this.cmdCancel);
        this.form.setCommandListener((CommandListener)this);
    }
    
    public final void show() {
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.form);
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (command == this.cmdSave) {
            try {
                autoh.isTimerActive = (this.cgStatus.getSelectedIndex() == 1);
                autoh.hOff = Integer.parseInt(this.txtHourOff.getString());
                autoh.mOff = Integer.parseInt(this.txtMinOff.getString());
                autoh.hOn = Integer.parseInt(this.txtHourOn.getString());
                autoh.mOn = Integer.parseInt(this.txtMinOn.getString());
                saveRMS();
                ff.b("L\u01b0u th\u00e0nh c\u00f4ng");
            }
            catch (final Exception ex) {}
        }
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)ey.c());
    }
    
    public static void saveRMS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeBoolean(autoh.isTimerActive);
            dataOutputStream.writeInt(autoh.hOff);
            dataOutputStream.writeInt(autoh.mOff);
            dataOutputStream.writeInt(autoh.hOn);
            dataOutputStream.writeInt(autoh.mOn);
            dataOutputStream.flush();
            dataOutputStream.close();
            final RecordStore recordStore = RecordStore.openRecordStore("AutoTimer", true);
            final byte[] byArray = byteArrayOutputStream.toByteArray();
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(byArray, 0, byArray.length);
            }
            else {
                recordStore.setRecord(1, byArray, 0, byArray.length);
            }
            recordStore.closeRecordStore();
        }
        catch (final Exception ex) {}
    }
    
    static {
        autoh.isTimerActive = false;
        autoh.hOff = 0;
        autoh.mOff = 1;
        autoh.hOn = 0;
        autoh.mOn = 2;
        try {
            final RecordStore recordStore = RecordStore.openRecordStore("AutoTimer", true);
            if (recordStore.getNumRecords() > 0) {
                final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(recordStore.getRecord(1));
                final DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                autoh.isTimerActive = dataInputStream.readBoolean();
                autoh.hOff = dataInputStream.readInt();
                autoh.mOff = dataInputStream.readInt();
                autoh.hOn = dataInputStream.readInt();
                autoh.mOn = dataInputStream.readInt();
                dataInputStream.close();
            }
            recordStore.closeRecordStore();
        }
        catch (final Exception ex) {}
    }
}
