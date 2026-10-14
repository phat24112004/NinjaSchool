import javax.microedition.rms.*;
import java.io.*;

public final class fh
{
    public int a;
    public int b;
    public ep c;
    public String d;
    public static int e;
    public int f;
    public static long g;
    private static final int[] l;
    public int h;
    private static final int[] m;
    public int i;
    public int j;
    public static boolean k;
    
    public static void a(final String str, final byte[] array) {
        try {
            final RecordStore openRecordStore;
            if (b(a((openRecordStore = RecordStore.openRecordStore(new StringBuffer("vj").append(str).toString(), true)).getNumRecords()) ? 1 : 0)) {
                openRecordStore.setRecord(1, array, 0, array.length);
                "".length();
                "".length();
                if (e((fh.l[35] ^ fh.l[36]) & (fh.l[37] ^ fh.l[20] ^ fh.l[7]), (fh.l[38] ^ fh.l[39]) & (fh.l[40] ^ fh.l[41] ^ fh.l[7]))) {
                    return;
                }
            }
            else {
                openRecordStore.addRecord(array, 0, array.length);
                "".length();
            }
            openRecordStore.closeRecordStore();
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    private static void e(final String str) {
        try {
            RecordStore.deleteRecordStore(new StringBuffer("vj").append(str).toString());
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    public final int a() {
        if (b(a(this.h) ? 1 : 0) && b(a(aa.c(this.c.d), this.i) ? 1 : 0)) {
            return aa.c(this.c.d) - this.i;
        }
        return 0;
    }
    
    public final boolean b() {
        return b(a(this.a) ? 1 : 0) && b(c(aa.c(this.c.d), this.b) ? 1 : 0);
    }
    
    public final int c() {
        if (b(a(this.a) ? 1 : 0) && b(c(aa.c(this.c.d), this.b) ? 1 : 0)) {
            return this.b - aa.c(this.c.d);
        }
        return 0;
    }
    
    public final boolean d() {
        return b(a(this.h) ? 1 : 0) && b(a(aa.c(this.c.d), this.i) ? 1 : 0);
    }
    
    private static boolean a(final int n) {
        int n2;
        if (e(n)) {
            n2 = fh.l[1];
            "".length();
            if (((0x19 ^ 0x23) & ~(0xBB ^ 0x81)) != 0x0) {
                return ((0x44 ^ 0x4D) & ~(0x3 ^ 0xA)) != 0x0;
            }
        }
        else {
            n2 = fh.l[0];
        }
        return n2 != 0;
    }
    
    private static boolean a(final int n, final int n2) {
        int n3;
        if (f(n, n2)) {
            n3 = fh.l[1];
            "".length();
            if (" ".length() < 0) {
                return ((0xE ^ 0x49 ^ (0xC6 ^ 0x98)) & (0xDE ^ 0x83 ^ (0x82 ^ 0xC6) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fh.l[0];
        }
        return n3 != 0;
    }
    
    private static void g() {
        (m = new int[fh.l[2]])[fh.l[0]] = " ".length();
        fh.m[fh.l[1]] = ((fh.l[3] ^ fh.l[4]) & (fh.l[5] ^ fh.l[6] ^ fh.l[7]));
        fh.m[fh.l[8]] = -" ".length();
        fh.m[fh.l[9]] = "  ".length();
        fh.m[fh.l[10]] = "   ".length();
        fh.m[fh.l[11]] = (fh.l[12] + fh.l[13] - fh.l[14] + fh.l[15] ^ fh.l[16] + fh.l[17] - fh.l[18] + fh.l[19]);
        fh.m[fh.l[19]] = (fh.l[20] + fh.l[16] - fh.l[21] + fh.l[22] ^ fh.l[23] + fh.l[24] - fh.l[25] + fh.l[26]);
        fh.m[fh.l[27]] = (fh.l[28] + fh.l[29] - fh.l[30] + fh.l[31] ^ fh.l[32] + fh.l[26] - fh.l[33] + fh.l[34]);
    }
    
    private static boolean b(final int n) {
        return n != 0;
    }
    
    private static boolean b(final int n, final int n2) {
        return n < n2;
    }
    
    private static boolean c(final int n, final int n2) {
        int n3;
        if (b(n, n2)) {
            n3 = fh.l[1];
            "".length();
            if (null != null) {
                return ((23 + 29 - 38 + 128 ^ 30 + 150 - 173 + 185) & (45 + 6 - 48 + 218 ^ 136 + 57 - 170 + 124 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n3 = fh.l[0];
        }
        return n3 != 0;
    }
    
    public static void a(final String s, final String s2) {
        try {
            a(s, s2.getBytes("UTF-8"));
        }
        catch (final Exception ex) {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static boolean c(final int n) {
        return n == 0;
    }
    
    private static void h() {
        (l = new int[47])[0] = ((0x50 ^ 0xA) & ~(0xF4 ^ 0xAE));
        fh.l[1] = " ".length();
        fh.l[2] = (0x38 ^ 0x30);
        fh.l[3] = 6 + 0 + 147 + 26;
        fh.l[4] = 119 + 136 - 210 + 116 + (0x36 ^ 0x4B) - (0x51 ^ 0x2C) + (0x6C ^ 0x76);
        fh.l[5] = (0xCE ^ 0xC5) + (0x48 ^ 0x63) - -(0x10 ^ 0x59) + (0x4 ^ 0x4F);
        fh.l[6] = 87 + 62 + 41 + 4;
        fh.l[7] = -" ".length();
        fh.l[8] = "  ".length();
        fh.l[9] = "   ".length();
        fh.l[10] = (0x4D ^ 0x49);
        fh.l[11] = (157 + 42 - 13 + 0 ^ 158 + 148 - 296 + 181);
        fh.l[12] = (0xE0 ^ 0x95);
        fh.l[13] = (0x1E ^ 0x62);
        fh.l[14] = (0x14 ^ 0x33) + (0x6F ^ 0x44) - -(0x52 ^ 0x67) + ((0x61 ^ 0x5A) & ~(0x76 ^ 0x4D));
        fh.l[15] = (0x45 ^ 0x6C ^ (0xAF ^ 0xB9));
        fh.l[16] = (0x5 ^ 0x60);
        fh.l[17] = (0x8D ^ 0xA7);
        fh.l[18] = -(0xDC ^ 0xC4);
        fh.l[19] = (18 + 101 - 72 + 138 ^ 144 + 127 - 141 + 61);
        fh.l[20] = (0x64 ^ 0x24);
        fh.l[21] = (0xDD ^ 0x80);
        fh.l[22] = (0x4 ^ 0x47);
        fh.l[23] = (0xF2 ^ 0xB9);
        fh.l[24] = (104 + 117 - 211 + 196 ^ 122 + 79 - 146 + 74);
        fh.l[25] = (0x64 ^ 0x31 ^ (0xF6 ^ 0x86));
        fh.l[26] = (0x7F ^ 0x41 ^ (0x58 ^ 0x7F));
        fh.l[27] = (0x91 ^ 0x96);
        fh.l[28] = 89 + 52 - 43 + 33;
        fh.l[29] = (0xB1 ^ 0x93);
        fh.l[30] = (0xE3 ^ 0xB8);
        fh.l[31] = (0x71 ^ 0x68 ^ (0x30 ^ 0x43));
        fh.l[32] = (0x17 ^ 0x1 ^ (0x6C ^ 0x57));
        fh.l[33] = -(0x70 ^ 0x42);
        fh.l[34] = (0x5E ^ 0x64);
        fh.l[35] = (0x9B ^ 0x8A) + " ".length() - -(0xE3 ^ 0x8D) + (0x47 ^ 0x2D);
        fh.l[36] = 61 + 11 + 24 + 61 + "   ".length() - (0x50 ^ 0x43) + (0x4F ^ 0x7B);
        fh.l[37] = (0xD4 ^ 0xBF);
        fh.l[38] = 21 + 122 - 97 + 103;
        fh.l[39] = 157 + 10 - 126 + 154;
        fh.l[40] = 97 + 141 - 117 + 26;
        fh.l[41] = 152 + 159 - 147 + 33;
        fh.l[42] = (0x3B ^ 0xA ^ (0xC6 ^ 0xA8));
        fh.l[43] = (0x42 ^ 0x26 ^ (0x49 ^ 0x38));
        fh.l[44] = (0x29 ^ 0x49) + (0x17 ^ 0x74) - (90 + 121 - 160 + 88) + (0x2C ^ 0x7D);
        fh.l[45] = (0xF8 ^ 0x9F);
        fh.l[46] = (0x41 ^ 0x23);
    }
    
    private static boolean d(final int n, final int n2) {
        return n >= n2;
    }
    
    private static boolean e(final int n, final int n2) {
        return n != n2;
    }
    
    public static fh a(final ep p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   fh.<init>:()V
        //     7: dup            
        //     8: astore_2       
        //     9: aload_0        
        //    10: putfield        fh.c:Lep;
        //    13: aload_1        
        //    14: ldc             " "
        //    16: invokestatic    cv.a:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //    19: astore_0       
        //    20: aload_2        
        //    21: aload_0        
        //    22: iconst_0       
        //    23: aaload         
        //    24: putfield        fh.d:Ljava/lang/String;
        //    27: aload_2        
        //    28: aload_0        
        //    29: iconst_1       
        //    30: aaload         
        //    31: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    34: putfield        fh.f:I
        //    37: aload_2        
        //    38: aload_0        
        //    39: iconst_2       
        //    40: aaload         
        //    41: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    44: putfield        fh.h:I
        //    47: aload_2        
        //    48: aload_0        
        //    49: iconst_3       
        //    50: aaload         
        //    51: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    54: putfield        fh.i:I
        //    57: ldc             ""
        //    59: invokevirtual   java/lang/String.length:()I
        //    62: ldc             ""
        //    64: invokevirtual   java/lang/String.length:()I
        //    67: pop2           
        //    68: ldc             " "
        //    70: invokevirtual   java/lang/String.length:()I
        //    73: ineg           
        //    74: getstatic       fh.l:[I
        //    77: bipush          42
        //    79: iaload         
        //    80: getstatic       fh.l:[I
        //    83: bipush          43
        //    85: iaload         
        //    86: ixor           
        //    87: getstatic       fh.l:[I
        //    90: bipush          44
        //    92: iaload         
        //    93: getstatic       fh.l:[I
        //    96: bipush          39
        //    98: iaload         
        //    99: ixor           
        //   100: getstatic       fh.l:[I
        //   103: bipush          7
        //   105: iaload         
        //   106: ixor           
        //   107: iand           
        //   108: invokestatic    fh.d:(II)Z
        //   111: ifeq            132
        //   114: aconst_null    
        //   115: areturn        
        //   116: ldc             ""
        //   118: invokevirtual   java/lang/String.length:()I
        //   121: pop2           
        //   122: aload_2        
        //   123: iconst_0       
        //   124: putfield        fh.j:I
        //   127: aload_2        
        //   128: iconst_0       
        //   129: putfield        fh.a:I
        //   132: aload_2        
        //   133: aload_0        
        //   134: iconst_4       
        //   135: aaload         
        //   136: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   139: putfield        fh.j:I
        //   142: aload_2        
        //   143: aload_0        
        //   144: iconst_5       
        //   145: aaload         
        //   146: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   149: putfield        fh.a:I
        //   152: aload_2        
        //   153: aload_0        
        //   154: bipush          6
        //   156: aaload         
        //   157: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   160: putfield        fh.b:I
        //   163: ldc             ""
        //   165: invokevirtual   java/lang/String.length:()I
        //   168: ldc             ""
        //   170: invokevirtual   java/lang/String.length:()I
        //   173: pop2           
        //   174: getstatic       fh.l:[I
        //   177: bipush          45
        //   179: iaload         
        //   180: getstatic       fh.l:[I
        //   183: bipush          46
        //   185: iaload         
        //   186: ixor           
        //   187: invokestatic    fh.c:(I)Z
        //   190: ifeq            211
        //   193: aconst_null    
        //   194: areturn        
        //   195: ldc             ""
        //   197: invokevirtual   java/lang/String.length:()I
        //   200: pop2           
        //   201: aload_2        
        //   202: iconst_0       
        //   203: putfield        fh.j:I
        //   206: aload_2        
        //   207: iconst_0       
        //   208: putfield        fh.a:I
        //   211: aload_2        
        //   212: getfield        fh.h:I
        //   215: invokestatic    fh.d:(I)Z
        //   218: invokestatic    fh.b:(I)Z
        //   221: ifeq            239
        //   224: aload_2        
        //   225: getfield        fh.a:I
        //   228: invokestatic    fh.d:(I)Z
        //   231: invokestatic    fh.b:(I)Z
        //   234: ifeq            239
        //   237: aconst_null    
        //   238: areturn        
        //   239: aload_2        
        //   240: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  27     57     116    132    Ljava/lang/Exception;
        //  132    163    195    211    Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean a(final Object o) {
        int n;
        if (b(o)) {
            n = fh.l[1];
            "".length();
            if (((0x4E ^ 0x6A ^ (0x10 ^ 0x21)) & (82 + 57 - 25 + 16 ^ 34 + 132 - 121 + 106 ^ -" ".length())) > " ".length()) {
                return ((1 + 153 - 11 + 36 ^ 34 + 22 - 45 + 161) & (33 + 41 - 34 + 132 ^ 159 + 48 - 97 + 69 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = fh.l[0];
        }
        return n != 0;
    }
    
    public fh() {
        super();
    }
    
    public static void e() {
        e("nj_arrow");
        e("nj_effect");
        e("nj_image");
        e("nj_part");
        e("nj_skill");
        e("data");
        e("dataVersion");
        e("map");
        e("mapVersion");
        e("skill");
        e("killVersion");
        e("item");
        e("itemVersion");
    }
    
    public static byte[] a(final String str) {
        try {
            final RecordStore openRecordStore;
            final byte[] record = (openRecordStore = RecordStore.openRecordStore(new StringBuffer("vj").append(str).toString(), (boolean)(0 != 0))).getRecord(1);
            openRecordStore.closeRecordStore();
            return record;
        }
        catch (final Exception ex) {
            "".length();
            return null;
        }
    }
    
    public static void a(final String s, final int n) {
        try {
            a(s, new byte[] { (byte)n });
        }
        catch (final Exception ex) {
            "".length();
        }
    }
    
    public static int b(final String s) {
        final byte[] a;
        if (b(a(a = a(s)) ? 1 : 0)) {
            return -1;
        }
        return a[0];
    }
    
    private static boolean d(final int n) {
        int n2;
        if (c(n)) {
            n2 = fh.l[1];
            "".length();
            if (((0xAD ^ 0xA2 ^ (0x8 ^ 0x24)) & (0x7D ^ 0x6A ^ (0xB3 ^ 0x87) ^ -" ".length())) > "   ".length()) {
                return ((0x4F ^ 0x35 ^ (0x5 ^ 0x70)) & (31 + 132 - 79 + 85 ^ 49 + 8 + 63 + 46 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = fh.l[0];
        }
        return n2 != 0;
    }
    
    private static boolean f(final int n, final int n2) {
        return n > n2;
    }
    
    public static String c(String a) {
        if (b(a((Object)(a = (String)(Object)a(a))) ? 1 : 0)) {
            return null;
        }
        try {
            return new String((byte[])(Object)a, "UTF-8");
        }
        catch (final Exception ex) {
            "".length();
            return new String((byte[])(Object)a);
        }
    }
    
    static {
        h();
        g();
    }
    
    private static boolean b(final Object o) {
        return o == null;
    }
    
    public final String f() {
        return new StringBuffer().append(this.d).append(" ").append(this.f).append(" ").append(this.h).append(" ").append(this.i).append(" ").append(this.j).append(" ").append(this.a).append(" ").append(this.b).toString();
    }
    
    public static InputStream d(final String name) {
        return "".getClass().getResourceAsStream(name);
    }
    
    private static boolean e(final int n) {
        return n > 0;
    }
}
