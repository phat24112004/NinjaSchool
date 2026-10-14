import java.util.*;
import java.io.*;

public final class CharPartInfo
{
    public static final int NONE = Integer.MIN_VALUE;
    public static Hashtable tHeadA;
    public static Hashtable tHeadB;
    public static Hashtable tHeadC;
    public static Hashtable tBodyD;
    public static Hashtable tBodyE;
    public static Hashtable tBodyF;
    public static Hashtable tFrames;
    public Hashtable kids;
    public int img;
    public int dx;
    public int dy;
    
    public CharPartInfo() {
        super();
        this.kids = new Hashtable();
    }
    
    private static Integer k(final int value) {
        return new Integer(value);
    }
    
    private static void readTable(final DataInputStream dataInputStream, final int n, final Hashtable hashtable) throws Exception {
        for (int i = 0; i < n; ++i) {
            final byte byte1 = dataInputStream.readByte();
            final short short1 = dataInputStream.readShort();
            final short short2 = dataInputStream.readShort();
            final CharPartInfo value = new CharPartInfo();
            value.img = short2;
            for (int j = 0; j < byte1 - 2; j += 3) {
                final short short3 = dataInputStream.readShort();
                final short short4 = dataInputStream.readShort();
                final short short5 = dataInputStream.readShort();
                final CharPartInfo value2 = new CharPartInfo();
                value2.dx = short4;
                value2.dy = short5;
                value.kids.put(k(short3), value2);
            }
            hashtable.put(k(short1), value);
        }
    }
    
    public static void read(final eu eu) {
        try {
            final DataInputStream b = eu.b();
            CharPartInfo.tHeadA.clear();
            CharPartInfo.tHeadB.clear();
            CharPartInfo.tHeadC.clear();
            CharPartInfo.tBodyD.clear();
            CharPartInfo.tBodyE.clear();
            CharPartInfo.tBodyF.clear();
            CharPartInfo.tFrames.clear();
            final int unsignedByte = b.readUnsignedByte();
            readTable(b, unsignedByte, CharPartInfo.tHeadA);
            readTable(b, unsignedByte, CharPartInfo.tHeadB);
            readTable(b, unsignedByte, CharPartInfo.tHeadC);
            for (int unsignedByte2 = b.readUnsignedByte(), i = 0; i < unsignedByte2; i += 2) {
                b.readShort();
                b.readShort();
            }
            final int unsignedByte3 = b.readUnsignedByte();
            readTable(b, unsignedByte3, CharPartInfo.tBodyD);
            readTable(b, unsignedByte3, CharPartInfo.tBodyE);
            readTable(b, unsignedByte3, CharPartInfo.tBodyF);
            for (byte byte1 = b.readByte(), b2 = 0; b2 < byte1; ++b2) {
                final short short1 = b.readShort();
                final int[][] value = new int[6][];
                for (int j = 0; j < 6; ++j) {
                    final byte byte2 = b.readByte();
                    value[j] = new int[byte2];
                    for (byte b3 = 0; b3 < byte2; ++b3) {
                        value[j][b3] = b.readShort();
                    }
                }
                CharPartInfo.tFrames.put(k(short1), value);
            }
        }
        catch (final Throwable t) {}
    }
    
    public static int leg(final int n) {
        try {
            final CharPartInfo charPartInfo = CharPartInfo.tHeadA.get(k(n));
            return (charPartInfo != null) ? charPartInfo.img : Integer.MIN_VALUE;
        }
        catch (final Throwable t) {
            return Integer.MIN_VALUE;
        }
    }
    
    private static int partImg(final int n, final CharPartInfo charPartInfo) {
        cb cb = null;
        if (ee.bg != null && n >= 0 && n < ee.bg.length) {
            cb = ee.bg[n];
        }
        if (cb != null && cb.a != null && cb.a.length > 2 && cb.a[2] != null) {
            return cb.a[2].b;
        }
        return charPartInfo.img;
    }
    
    public static int body(final aa aa) {
        try {
            if (aa.fw == null || aa.fw[4] == null || aa.fw[4].j == null) {
                return Integer.MIN_VALUE;
            }
            final CharPartInfo charPartInfo = ((aa.dw == 3) ? CharPartInfo.tBodyD : (aa.gt ? CharPartInfo.tBodyF : CharPartInfo.tBodyE)).get(k(aa.bm));
            if (charPartInfo == null) {
                return Integer.MIN_VALUE;
            }
            final CharPartInfo charPartInfo2 = charPartInfo.kids.get(k(aa.fw[4].j.d));
            if (charPartInfo2 == null) {
                return Integer.MIN_VALUE;
            }
            aa.ih = charPartInfo2.dx;
            aa.hd = charPartInfo2.dy;
            return partImg(aa.bm, charPartInfo);
        }
        catch (final Throwable t) {
            return Integer.MIN_VALUE;
        }
    }
    
    public static int head(final aa aa) {
        try {
            if (aa.fw == null || aa.fw[4] == null || aa.fw[4].j == null) {
                return Integer.MIN_VALUE;
            }
            final CharPartInfo charPartInfo = ((aa.dw == 3) ? CharPartInfo.tHeadA : (aa.gt ? CharPartInfo.tHeadC : CharPartInfo.tHeadB)).get(k(aa.bp));
            if (charPartInfo == null) {
                return Integer.MIN_VALUE;
            }
            final CharPartInfo charPartInfo2 = charPartInfo.kids.get(k(aa.fw[4].j.d));
            if (charPartInfo2 == null) {
                return Integer.MIN_VALUE;
            }
            aa.gp = charPartInfo2.dx;
            aa.gq = charPartInfo2.dy;
            return partImg(aa.bp, charPartInfo);
        }
        catch (final Throwable t) {
            return Integer.MIN_VALUE;
        }
    }
    
    static {
        CharPartInfo.tHeadA = new Hashtable();
        CharPartInfo.tHeadB = new Hashtable();
        CharPartInfo.tHeadC = new Hashtable();
        CharPartInfo.tBodyD = new Hashtable();
        CharPartInfo.tBodyE = new Hashtable();
        CharPartInfo.tBodyF = new Hashtable();
        CharPartInfo.tFrames = new Hashtable();
    }
}
