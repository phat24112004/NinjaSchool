import javax.microedition.midlet.*;
import javax.microedition.rms.*;
import java.io.*;
import javax.microedition.lcdui.*;

public class InputNpc implements CommandListener
{
    public static int indexNpc;
    public static boolean danhCum;
    public static int soQuaiDanhCum;
    private Form form;
    private TextField txtIndex;
    private ChoiceGroup cgDanhCum;
    private TextField txtSoQuai;
    private Command cmdSave;
    private Command cmdCancel;
    public static int cumAnchorW;
    public static int cumAnchorK;
    public static boolean dangKhoaCum;
    public static boolean cumDaDanh;
    public static boolean boQuaViTaTl;
    public static int cumSoLuongGoc;
    public static int indexNpcTT;
    public static int indexNpcNVDV;
    private TextField txtIndexTT;
    private TextField txtIndexNVDV;
    public static int diemDanhTheoOThuTu;
    public static int cl;
    public static int muaCL;
    public static int ltt;
    public static int muaLTT;
    private final TextField txtDiemDanhOThuTu;
    private final TextField txtCL;
    private final TextField txtMuaCL;
    private final TextField txtLTT;
    private final TextField txtMuaLTT;
    
    public final void show() {
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)this.form);
    }
    
    private static int loadIntRms(final String s, final int n) {
        try {
            final RecordStore openRecordStore = RecordStore.openRecordStore(s, true);
            if (openRecordStore.getNumRecords() > 0) {
                final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(openRecordStore.getRecord(1)));
                final int int1 = dataInputStream.readInt();
                dataInputStream.close();
                openRecordStore.closeRecordStore();
                return int1;
            }
            openRecordStore.closeRecordStore();
            return n;
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    private static void saveIntRms(final String s, final int v) {
        try {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            dataOutputStream.writeInt(v);
            dataOutputStream.flush();
            dataOutputStream.close();
            final RecordStore openRecordStore = RecordStore.openRecordStore(s, true);
            final byte[] byteArray = out.toByteArray();
            if (openRecordStore.getNumRecords() == 0) {
                openRecordStore.addRecord(byteArray, 0, byteArray.length);
            }
            else {
                openRecordStore.setRecord(1, byteArray, 0, byteArray.length);
            }
            openRecordStore.closeRecordStore();
        }
        catch (final Exception ex) {}
    }
    
    public InputNpc() {
        super();
        this.form = new Form("C\u00e0i \u0111\u1eb7t NPC");
        this.cgDanhCum = new ChoiceGroup("\u0110\u00e1nh c\u1ee5m", 1, new String[] { "T\u1eaft", "B\u1eadt" }, (Image[])null);
        this.txtIndex = new TextField("Ch\u1ecdn index npc nvhn", "" + InputNpc.indexNpc, 10, 2);
        this.txtIndexTT = new TextField("Ch\u1ecdn index npc tt", "" + InputNpc.indexNpcTT, 10, 2);
        this.txtIndexNVDV = new TextField("Ch\u1ecdn index npc nvdv", "" + InputNpc.indexNpcNVDV, 10, 2);
        this.txtSoQuai = new TextField("S\u1ed1 qu\u00e1i \u0111\u00e1nh c\u1ee5m", "" + InputNpc.soQuaiDanhCum, 3, 2);
        this.txtDiemDanhOThuTu = new TextField("\u0110i\u1ec3m danh theo \u00f4 th\u1ee9 t\u1ef1 <b\u1eaft \u0111\u1ea7u = 0>!", "" + InputNpc.diemDanhTheoOThuTu, 10, 2);
        this.txtCL = new TextField("CL:", "" + InputNpc.cl, 10, 2);
        this.txtMuaCL = new TextField("Mua CL:", "" + InputNpc.muaCL, 10, 2);
        this.txtLTT = new TextField("LTT:", "" + InputNpc.ltt, 10, 2);
        this.txtMuaLTT = new TextField("Mua LTT:", "" + InputNpc.muaLTT, 10, 2);
        this.cgDanhCum.setSelectedIndex((int)(InputNpc.danhCum ? 1 : 0), true);
        this.form.append((Item)this.cgDanhCum);
        this.form.append((Item)this.txtSoQuai);
        this.form.append((Item)this.txtDiemDanhOThuTu);
        this.form.append((Item)this.txtIndex);
        this.form.append((Item)this.txtIndexTT);
        this.form.append((Item)this.txtIndexNVDV);
        this.form.append((Item)this.txtCL);
        this.form.append((Item)this.txtMuaCL);
        this.form.append((Item)this.txtLTT);
        this.form.append((Item)this.txtMuaLTT);
        this.cmdSave = new Command("L\u01b0u", 4, 1);
        this.cmdCancel = new Command("H\u1ee7y", 7, 1);
        this.form.addCommand(this.cmdSave);
        this.form.addCommand(this.cmdCancel);
        this.form.setCommandListener((CommandListener)this);
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (command == this.cmdSave) {
            try {
                InputNpc.indexNpc = Integer.parseInt(this.txtIndex.getString());
                InputNpc.indexNpcTT = Integer.parseInt(this.txtIndexTT.getString());
                InputNpc.indexNpcNVDV = Integer.parseInt(this.txtIndexNVDV.getString());
                InputNpc.danhCum = (this.cgDanhCum.getSelectedIndex() == 1);
                InputNpc.soQuaiDanhCum = Integer.parseInt(this.txtSoQuai.getString());
                if (InputNpc.soQuaiDanhCum < 1) {
                    InputNpc.soQuaiDanhCum = 1;
                }
                InputNpc.diemDanhTheoOThuTu = Integer.parseInt(this.txtDiemDanhOThuTu.getString());
                dp.j = InputNpc.diemDanhTheoOThuTu;
                InputNpc.cl = Integer.parseInt(this.txtCL.getString());
                dp.c = InputNpc.cl;
                InputNpc.muaCL = Integer.parseInt(this.txtMuaCL.getString());
                dp.i = InputNpc.muaCL;
                InputNpc.ltt = Integer.parseInt(this.txtLTT.getString());
                dp.f = InputNpc.ltt;
                InputNpc.muaLTT = Integer.parseInt(this.txtMuaLTT.getString());
                dp.e = InputNpc.muaLTT;
                saveRMS();
                ff.b("L\u01b0u th\u00e0nh c\u00f4ng");
            }
            catch (final Exception ex) {
                ff.b("D\u1eef li\u1ec7u kh\u00f4ng h\u1ee3p l\u1ec7");
            }
        }
        Display.getDisplay((MIDlet)ed.c).setCurrent((Displayable)ey.c());
    }
    
    public static void saveRMS() {
        saveIntRms("InputNpcDiemDanhO", InputNpc.diemDanhTheoOThuTu);
        saveIntRms("InputNpcCL", InputNpc.cl);
        saveIntRms("InputNpcMuaCL", InputNpc.muaCL);
        saveIntRms("InputNpcLTT", InputNpc.ltt);
        saveIntRms("InputNpcMuaLTT", InputNpc.muaLTT);
        saveIntRms("AutoNpc", InputNpc.indexNpc);
        saveIntRms("AutoNpcTT", InputNpc.indexNpcTT);
        saveIntRms("AutoNpcNVDV", InputNpc.indexNpcNVDV);
        try {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            dataOutputStream.writeBoolean(InputNpc.danhCum);
            dataOutputStream.writeInt(InputNpc.soQuaiDanhCum);
            dataOutputStream.flush();
            dataOutputStream.close();
            final RecordStore openRecordStore = RecordStore.openRecordStore("AutoCum", true);
            final byte[] byteArray = out.toByteArray();
            if (openRecordStore.getNumRecords() == 0) {
                openRecordStore.addRecord(byteArray, 0, byteArray.length);
            }
            else {
                openRecordStore.setRecord(1, byteArray, 0, byteArray.length);
            }
            openRecordStore.closeRecordStore();
        }
        catch (final Exception ex) {}
    }
    
    static {
        InputNpc.indexNpc = 1;
        InputNpc.indexNpcTT = 2;
        InputNpc.indexNpcNVDV = 6;
        InputNpc.diemDanhTheoOThuTu = 0;
        InputNpc.cl = 490;
        InputNpc.muaCL = 28;
        InputNpc.ltt = 833;
        InputNpc.muaLTT = 37;
        InputNpc.danhCum = false;
        InputNpc.soQuaiDanhCum = 3;
        InputNpc.diemDanhTheoOThuTu = loadIntRms("InputNpcDiemDanhO", 0);
        dp.j = InputNpc.diemDanhTheoOThuTu;
        InputNpc.cl = loadIntRms("InputNpcCL", 490);
        dp.c = InputNpc.cl;
        InputNpc.muaCL = loadIntRms("InputNpcMuaCL", 28);
        dp.i = InputNpc.muaCL;
        InputNpc.ltt = loadIntRms("InputNpcLTT", 833);
        dp.f = InputNpc.ltt;
        InputNpc.muaLTT = loadIntRms("InputNpcMuaLTT", 37);
        dp.e = InputNpc.muaLTT;
        InputNpc.indexNpc = loadIntRms("AutoNpc", 1);
        InputNpc.indexNpcTT = loadIntRms("AutoNpcTT", 2);
        InputNpc.indexNpcNVDV = loadIntRms("AutoNpcNVDV", 6);
        dp.j = InputNpc.diemDanhTheoOThuTu;
        dp.c = InputNpc.cl;
        dp.i = InputNpc.muaCL;
        dp.f = InputNpc.ltt;
        dp.e = InputNpc.muaLTT;
        try {
            final RecordStore openRecordStore = RecordStore.openRecordStore("AutoCum", true);
            if (openRecordStore.getNumRecords() > 0) {
                final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(openRecordStore.getRecord(1)));
                InputNpc.danhCum = dataInputStream.readBoolean();
                InputNpc.soQuaiDanhCum = dataInputStream.readInt();
                if (InputNpc.soQuaiDanhCum < 1) {
                    InputNpc.soQuaiDanhCum = 4;
                }
                dataInputStream.close();
            }
            openRecordStore.closeRecordStore();
        }
        catch (final Exception ex) {}
    }
}
