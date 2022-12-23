package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ic */
public class C9406ic {

    /* renamed from: d */
    private static final String f23326d = C9406ic.class.getSimpleName();

    /* renamed from: a */
    int f23327a;

    /* renamed from: b */
    int f23328b;

    /* renamed from: c */
    C9409ie f23329c;

    /* renamed from: e */
    private int[] f23330e;

    /* renamed from: f */
    private final int[] f23331f;

    /* renamed from: g */
    private ByteBuffer f23332g;

    /* renamed from: h */
    private byte[] f23333h;
    @Nullable

    /* renamed from: i */
    private byte[] f23334i;

    /* renamed from: j */
    private int f23335j;

    /* renamed from: k */
    private int f23336k;

    /* renamed from: l */
    private C9410if f23337l;

    /* renamed from: m */
    private short[] f23338m;

    /* renamed from: n */
    private byte[] f23339n;

    /* renamed from: o */
    private byte[] f23340o;

    /* renamed from: p */
    private byte[] f23341p;

    /* renamed from: q */
    private int[] f23342q;

    /* renamed from: r */
    private C9407a f23343r;

    /* renamed from: s */
    private Bitmap f23344s;

    /* renamed from: t */
    private boolean f23345t;

    /* renamed from: u */
    private int f23346u;

    /* renamed from: v */
    private int f23347v;

    /* renamed from: w */
    private int f23348w;

    /* renamed from: x */
    private int f23349x;

    /* renamed from: y */
    private boolean f23350y;

    /* renamed from: com.tapjoy.internal.ic$a */
    interface C9407a {
        @Nonnull
        /* renamed from: a */
        Bitmap mo58337a(int i, int i2, Bitmap.Config config);

        /* renamed from: a */
        byte[] mo58338a(int i);

        /* renamed from: b */
        int[] mo58339b(int i);
    }

    C9406ic(C9407a aVar, C9409ie ieVar, ByteBuffer byteBuffer) {
        this(aVar, ieVar, byteBuffer, (byte) 0);
    }

    private C9406ic(C9407a aVar, C9409ie ieVar, ByteBuffer byteBuffer, byte b) {
        this(aVar);
        m25249b(ieVar, byteBuffer);
    }

    private C9406ic(C9407a aVar) {
        this.f23331f = new int[256];
        this.f23335j = 0;
        this.f23336k = 0;
        this.f23343r = aVar;
        this.f23329c = new C9409ie();
    }

    C9406ic() {
        this(new C9416ih());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r4v29, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0214 A[LOOP:4: B:115:0x0212->B:116:0x0214, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo58336a() {
        /*
            r29 = this;
            r1 = r29
            monitor-enter(r29)
            com.tapjoy.internal.ie r0 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int r0 = r0.f23364c     // Catch:{ all -> 0x03ec }
            r2 = 1
            if (r0 <= 0) goto L_0x000e
            int r0 = r1.f23327a     // Catch:{ all -> 0x03ec }
            if (r0 >= 0) goto L_0x001c
        L_0x000e:
            com.tapjoy.internal.ie r0 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int r0 = r0.f23364c     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            int r0 = r1.f23327a     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            r1.f23346u = r2     // Catch:{ all -> 0x03ec }
        L_0x001c:
            int r0 = r1.f23346u     // Catch:{ all -> 0x03ec }
            r3 = 0
            if (r0 == r2) goto L_0x03e5
            int r0 = r1.f23346u     // Catch:{ all -> 0x03ec }
            r4 = 2
            if (r0 != r4) goto L_0x0028
            goto L_0x03e5
        L_0x0028:
            r0 = 0
            r1.f23346u = r0     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.ie r5 = r1.f23329c     // Catch:{ all -> 0x03ec }
            java.util.List r5 = r5.f23366e     // Catch:{ all -> 0x03ec }
            int r6 = r1.f23327a     // Catch:{ all -> 0x03ec }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.id r5 = (com.tapjoy.internal.C9408id) r5     // Catch:{ all -> 0x03ec }
            int r6 = r1.f23327a     // Catch:{ all -> 0x03ec }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0047
            com.tapjoy.internal.ie r7 = r1.f23329c     // Catch:{ all -> 0x03ec }
            java.util.List r7 = r7.f23366e     // Catch:{ all -> 0x03ec }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.id r6 = (com.tapjoy.internal.C9408id) r6     // Catch:{ all -> 0x03ec }
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            int[] r7 = r5.f23361k     // Catch:{ all -> 0x03ec }
            if (r7 == 0) goto L_0x004f
            int[] r7 = r5.f23361k     // Catch:{ all -> 0x03ec }
            goto L_0x0053
        L_0x004f:
            com.tapjoy.internal.ie r7 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int[] r7 = r7.f23362a     // Catch:{ all -> 0x03ec }
        L_0x0053:
            r1.f23330e = r7     // Catch:{ all -> 0x03ec }
            if (r7 != 0) goto L_0x0060
            int r0 = r1.f23327a     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            r1.f23346u = r2     // Catch:{ all -> 0x03ec }
            monitor-exit(r29)
            return r3
        L_0x0060:
            boolean r3 = r5.f23356f     // Catch:{ all -> 0x03ec }
            if (r3 == 0) goto L_0x0076
            int[] r3 = r1.f23330e     // Catch:{ all -> 0x03ec }
            int[] r7 = r1.f23331f     // Catch:{ all -> 0x03ec }
            int[] r8 = r1.f23330e     // Catch:{ all -> 0x03ec }
            int r8 = r8.length     // Catch:{ all -> 0x03ec }
            java.lang.System.arraycopy(r3, r0, r7, r0, r8)     // Catch:{ all -> 0x03ec }
            int[] r3 = r1.f23331f     // Catch:{ all -> 0x03ec }
            r1.f23330e = r3     // Catch:{ all -> 0x03ec }
            int r7 = r5.f23358h     // Catch:{ all -> 0x03ec }
            r3[r7] = r0     // Catch:{ all -> 0x03ec }
        L_0x0076:
            int[] r3 = r1.f23342q     // Catch:{ all -> 0x03ec }
            if (r6 != 0) goto L_0x007d
            java.util.Arrays.fill(r3, r0)     // Catch:{ all -> 0x03ec }
        L_0x007d:
            r7 = 3
            if (r6 == 0) goto L_0x00da
            int r8 = r6.f23357g     // Catch:{ all -> 0x03ec }
            if (r8 <= 0) goto L_0x00da
            int r8 = r6.f23357g     // Catch:{ all -> 0x03ec }
            if (r8 != r4) goto L_0x00a8
            boolean r8 = r5.f23356f     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x009d
            com.tapjoy.internal.ie r8 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int r8 = r8.f23373l     // Catch:{ all -> 0x03ec }
            int[] r9 = r5.f23361k     // Catch:{ all -> 0x03ec }
            if (r9 == 0) goto L_0x00a4
            com.tapjoy.internal.ie r9 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int r9 = r9.f23371j     // Catch:{ all -> 0x03ec }
            int r10 = r5.f23358h     // Catch:{ all -> 0x03ec }
            if (r9 != r10) goto L_0x00a4
            goto L_0x00a3
        L_0x009d:
            int r8 = r1.f23327a     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x00a3
            r1.f23350y = r2     // Catch:{ all -> 0x03ec }
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            r1.m25247a(r3, r6, r8)     // Catch:{ all -> 0x03ec }
            goto L_0x00da
        L_0x00a8:
            int r8 = r6.f23357g     // Catch:{ all -> 0x03ec }
            if (r8 != r7) goto L_0x00da
            android.graphics.Bitmap r8 = r1.f23344s     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x00b4
            r1.m25247a(r3, r6, r0)     // Catch:{ all -> 0x03ec }
            goto L_0x00da
        L_0x00b4:
            int r8 = r6.f23354d     // Catch:{ all -> 0x03ec }
            int r9 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r15 = r8 / r9
            int r8 = r6.f23352b     // Catch:{ all -> 0x03ec }
            int r9 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r13 = r8 / r9
            int r8 = r6.f23353c     // Catch:{ all -> 0x03ec }
            int r9 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r14 = r8 / r9
            int r6 = r6.f23351a     // Catch:{ all -> 0x03ec }
            int r8 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r12 = r6 / r8
            int r6 = r1.f23349x     // Catch:{ all -> 0x03ec }
            int r6 = r6 * r13
            int r10 = r6 + r12
            android.graphics.Bitmap r8 = r1.f23344s     // Catch:{ all -> 0x03ec }
            int r11 = r1.f23349x     // Catch:{ all -> 0x03ec }
            r9 = r3
            r8.getPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ec }
        L_0x00da:
            r1.f23335j = r0     // Catch:{ all -> 0x03ec }
            r1.f23336k = r0     // Catch:{ all -> 0x03ec }
            if (r5 == 0) goto L_0x00e7
            java.nio.ByteBuffer r6 = r1.f23332g     // Catch:{ all -> 0x03ec }
            int r8 = r5.f23360j     // Catch:{ all -> 0x03ec }
            r6.position(r8)     // Catch:{ all -> 0x03ec }
        L_0x00e7:
            if (r5 != 0) goto L_0x00f4
            com.tapjoy.internal.ie r6 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int r6 = r6.f23367f     // Catch:{ all -> 0x03ec }
            com.tapjoy.internal.ie r8 = r1.f23329c     // Catch:{ all -> 0x03ec }
            int r8 = r8.f23368g     // Catch:{ all -> 0x03ec }
        L_0x00f1:
            int r6 = r6 * r8
            goto L_0x00f9
        L_0x00f4:
            int r6 = r5.f23353c     // Catch:{ all -> 0x03ec }
            int r8 = r5.f23354d     // Catch:{ all -> 0x03ec }
            goto L_0x00f1
        L_0x00f9:
            byte[] r8 = r1.f23341p     // Catch:{ all -> 0x03ec }
            if (r8 == 0) goto L_0x0102
            byte[] r8 = r1.f23341p     // Catch:{ all -> 0x03ec }
            int r8 = r8.length     // Catch:{ all -> 0x03ec }
            if (r8 >= r6) goto L_0x010a
        L_0x0102:
            com.tapjoy.internal.ic$a r8 = r1.f23343r     // Catch:{ all -> 0x03ec }
            byte[] r8 = r8.mo58338a(r6)     // Catch:{ all -> 0x03ec }
            r1.f23341p = r8     // Catch:{ all -> 0x03ec }
        L_0x010a:
            short[] r8 = r1.f23338m     // Catch:{ all -> 0x03ec }
            r9 = 4096(0x1000, float:5.74E-42)
            if (r8 != 0) goto L_0x0114
            short[] r8 = new short[r9]     // Catch:{ all -> 0x03ec }
            r1.f23338m = r8     // Catch:{ all -> 0x03ec }
        L_0x0114:
            byte[] r8 = r1.f23339n     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x011c
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x03ec }
            r1.f23339n = r8     // Catch:{ all -> 0x03ec }
        L_0x011c:
            byte[] r8 = r1.f23340o     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x0126
            r8 = 4097(0x1001, float:5.741E-42)
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x03ec }
            r1.f23340o = r8     // Catch:{ all -> 0x03ec }
        L_0x0126:
            int r8 = r29.m25250c()     // Catch:{ all -> 0x03ec }
            int r10 = r2 << r8
            int r11 = r10 + 1
            int r12 = r10 + 2
            int r8 = r8 + r2
            int r13 = r2 << r8
            int r13 = r13 - r2
            r14 = 0
        L_0x0135:
            if (r14 >= r10) goto L_0x0144
            short[] r15 = r1.f23338m     // Catch:{ all -> 0x03ec }
            r15[r14] = r0     // Catch:{ all -> 0x03ec }
            byte[] r15 = r1.f23339n     // Catch:{ all -> 0x03ec }
            byte r2 = (byte) r14     // Catch:{ all -> 0x03ec }
            r15[r14] = r2     // Catch:{ all -> 0x03ec }
            int r14 = r14 + 1
            r2 = 1
            goto L_0x0135
        L_0x0144:
            r2 = -1
            r25 = r8
            r23 = r12
            r24 = r13
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = -1
            r21 = 0
            r22 = 0
        L_0x015b:
            r26 = 8
            if (r14 >= r6) goto L_0x0255
            if (r15 != 0) goto L_0x016d
            int r15 = r29.m25251d()     // Catch:{ all -> 0x03ec }
            if (r15 > 0) goto L_0x016b
            r1.f23346u = r7     // Catch:{ all -> 0x03ec }
            goto L_0x0255
        L_0x016b:
            r18 = 0
        L_0x016d:
            byte[] r4 = r1.f23333h     // Catch:{ all -> 0x03ec }
            byte r4 = r4[r18]     // Catch:{ all -> 0x03ec }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r16
            int r17 = r17 + r4
            int r16 = r16 + 8
            int r18 = r18 + 1
            int r15 = r15 + r2
            r4 = r16
            r0 = r20
            r9 = r21
            r2 = r23
            r7 = r25
        L_0x0186:
            if (r4 < r7) goto L_0x0243
            r25 = r8
            r8 = r17 & r24
            int r17 = r17 >> r7
            int r4 = r4 - r7
            if (r8 != r10) goto L_0x0199
            r2 = r12
            r24 = r13
            r7 = r25
            r8 = r7
            r0 = -1
            goto L_0x0186
        L_0x0199:
            if (r8 <= r2) goto L_0x01a2
            r26 = r4
            r4 = 3
            r1.f23346u = r4     // Catch:{ all -> 0x03ec }
            goto L_0x022f
        L_0x01a2:
            r26 = r4
            if (r8 == r11) goto L_0x022f
            r4 = -1
            if (r0 != r4) goto L_0x01bc
            byte[] r0 = r1.f23340o     // Catch:{ all -> 0x03ec }
            int r9 = r22 + 1
            byte[] r4 = r1.f23339n     // Catch:{ all -> 0x03ec }
            byte r4 = r4[r8]     // Catch:{ all -> 0x03ec }
            r0[r22] = r4     // Catch:{ all -> 0x03ec }
            r0 = r8
            r22 = r9
            r4 = r26
            r9 = r0
            r8 = r25
            goto L_0x0186
        L_0x01bc:
            if (r8 < r2) goto L_0x01c9
            byte[] r4 = r1.f23340o     // Catch:{ all -> 0x03ec }
            int r27 = r22 + 1
            byte r9 = (byte) r9     // Catch:{ all -> 0x03ec }
            r4[r22] = r9     // Catch:{ all -> 0x03ec }
            r4 = r0
            r22 = r27
            goto L_0x01ca
        L_0x01c9:
            r4 = r8
        L_0x01ca:
            if (r4 < r10) goto L_0x01e1
            byte[] r9 = r1.f23340o     // Catch:{ all -> 0x03ec }
            int r27 = r22 + 1
            r28 = r8
            byte[] r8 = r1.f23339n     // Catch:{ all -> 0x03ec }
            byte r8 = r8[r4]     // Catch:{ all -> 0x03ec }
            r9[r22] = r8     // Catch:{ all -> 0x03ec }
            short[] r8 = r1.f23338m     // Catch:{ all -> 0x03ec }
            short r4 = r8[r4]     // Catch:{ all -> 0x03ec }
            r22 = r27
            r8 = r28
            goto L_0x01ca
        L_0x01e1:
            r28 = r8
            byte[] r8 = r1.f23339n     // Catch:{ all -> 0x03ec }
            byte r4 = r8[r4]     // Catch:{ all -> 0x03ec }
            r9 = r4 & 255(0xff, float:3.57E-43)
            byte[] r4 = r1.f23340o     // Catch:{ all -> 0x03ec }
            int r8 = r22 + 1
            r27 = r8
            byte r8 = (byte) r9     // Catch:{ all -> 0x03ec }
            r4[r22] = r8     // Catch:{ all -> 0x03ec }
            r4 = 4096(0x1000, float:5.74E-42)
            if (r2 >= r4) goto L_0x020e
            short[] r4 = r1.f23338m     // Catch:{ all -> 0x03ec }
            short r0 = (short) r0     // Catch:{ all -> 0x03ec }
            r4[r2] = r0     // Catch:{ all -> 0x03ec }
            byte[] r0 = r1.f23339n     // Catch:{ all -> 0x03ec }
            r0[r2] = r8     // Catch:{ all -> 0x03ec }
            int r2 = r2 + 1
            r0 = r2 & r24
            if (r0 != 0) goto L_0x020e
            r8 = 4096(0x1000, float:5.74E-42)
            if (r2 >= r8) goto L_0x0210
            int r7 = r7 + 1
            int r24 = r24 + r2
            goto L_0x0210
        L_0x020e:
            r8 = 4096(0x1000, float:5.74E-42)
        L_0x0210:
            r22 = r27
        L_0x0212:
            if (r22 <= 0) goto L_0x0227
            byte[] r0 = r1.f23341p     // Catch:{ all -> 0x03ec }
            int r4 = r19 + 1
            byte[] r8 = r1.f23340o     // Catch:{ all -> 0x03ec }
            int r22 = r22 + -1
            byte r8 = r8[r22]     // Catch:{ all -> 0x03ec }
            r0[r19] = r8     // Catch:{ all -> 0x03ec }
            int r14 = r14 + 1
            r19 = r4
            r8 = 4096(0x1000, float:5.74E-42)
            goto L_0x0212
        L_0x0227:
            r8 = r25
            r4 = r26
            r0 = r28
            goto L_0x0186
        L_0x022f:
            r20 = r0
            r23 = r2
            r21 = r9
            r8 = r25
            r16 = r26
            r0 = 0
            r2 = -1
            r4 = 2
            r9 = 4096(0x1000, float:5.74E-42)
            r25 = r7
            r7 = 3
            goto L_0x015b
        L_0x0243:
            r20 = r0
            r23 = r2
            r16 = r4
            r25 = r7
            r21 = r9
            r0 = 0
            r2 = -1
            r4 = 2
            r7 = 3
            r9 = 4096(0x1000, float:5.74E-42)
            goto L_0x015b
        L_0x0255:
            r0 = r19
        L_0x0257:
            if (r0 >= r6) goto L_0x0261
            byte[] r2 = r1.f23341p     // Catch:{ all -> 0x03ec }
            r4 = 0
            r2[r0] = r4     // Catch:{ all -> 0x03ec }
            int r0 = r0 + 1
            goto L_0x0257
        L_0x0261:
            r4 = 0
            int r0 = r5.f23354d     // Catch:{ all -> 0x03ec }
            int r2 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r0 = r0 / r2
            int r2 = r5.f23352b     // Catch:{ all -> 0x03ec }
            int r6 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r2 = r2 / r6
            int r6 = r5.f23353c     // Catch:{ all -> 0x03ec }
            int r7 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r6 = r6 / r7
            int r7 = r5.f23351a     // Catch:{ all -> 0x03ec }
            int r8 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r7 = r7 / r8
            int r8 = r1.f23327a     // Catch:{ all -> 0x03ec }
            if (r8 != 0) goto L_0x027c
            r8 = 1
            goto L_0x027d
        L_0x027c:
            r8 = 0
        L_0x027d:
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 8
        L_0x0282:
            if (r11 >= r0) goto L_0x03ab
            boolean r13 = r5.f23355e     // Catch:{ all -> 0x03ec }
            if (r13 == 0) goto L_0x02a4
            r13 = 4
            if (r9 < r0) goto L_0x029f
            int r10 = r10 + 1
            r14 = 2
            if (r10 == r14) goto L_0x029c
            r15 = 3
            if (r10 == r15) goto L_0x0299
            if (r10 == r13) goto L_0x0296
            goto L_0x02a1
        L_0x0296:
            r9 = 1
            r12 = 2
            goto L_0x02a1
        L_0x0299:
            r9 = 2
            r12 = 4
            goto L_0x02a1
        L_0x029c:
            r15 = 3
            r9 = 4
            goto L_0x02a1
        L_0x029f:
            r14 = 2
            r15 = 3
        L_0x02a1:
            int r13 = r9 + r12
            goto L_0x02a8
        L_0x02a4:
            r14 = 2
            r15 = 3
            r13 = r9
            r9 = r11
        L_0x02a8:
            int r9 = r9 + r2
            int r4 = r1.f23348w     // Catch:{ all -> 0x03ec }
            if (r9 >= r4) goto L_0x0395
            int r4 = r1.f23349x     // Catch:{ all -> 0x03ec }
            int r9 = r9 * r4
            int r4 = r9 + r7
            int r14 = r4 + r6
            int r15 = r1.f23349x     // Catch:{ all -> 0x03ec }
            int r15 = r15 + r9
            if (r15 >= r14) goto L_0x02bd
            int r14 = r1.f23349x     // Catch:{ all -> 0x03ec }
            int r14 = r14 + r9
        L_0x02bd:
            int r9 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r9 = r9 * r11
            int r15 = r5.f23353c     // Catch:{ all -> 0x03ec }
            int r9 = r9 * r15
            int r15 = r14 - r4
            r17 = r0
            int r0 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r15 = r15 * r0
            int r15 = r15 + r9
        L_0x02ce:
            if (r4 >= r14) goto L_0x0397
            int r0 = r1.f23347v     // Catch:{ all -> 0x03ec }
            r18 = r2
            r2 = 1
            if (r0 != r2) goto L_0x02e7
            byte[] r0 = r1.f23341p     // Catch:{ all -> 0x03ec }
            byte r0 = r0[r9]     // Catch:{ all -> 0x03ec }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int[] r2 = r1.f23330e     // Catch:{ all -> 0x03ec }
            r0 = r2[r0]     // Catch:{ all -> 0x03ec }
            r25 = r6
            r27 = r7
            goto L_0x037a
        L_0x02e7:
            int r0 = r5.f23353c     // Catch:{ all -> 0x03ec }
            r25 = r6
            r2 = r9
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
        L_0x02f6:
            int r6 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r6 = r6 + r9
            if (r2 >= r6) goto L_0x032d
            byte[] r6 = r1.f23341p     // Catch:{ all -> 0x03ec }
            int r6 = r6.length     // Catch:{ all -> 0x03ec }
            if (r2 >= r6) goto L_0x032d
            if (r2 >= r15) goto L_0x032d
            byte[] r6 = r1.f23341p     // Catch:{ all -> 0x03ec }
            byte r6 = r6[r2]     // Catch:{ all -> 0x03ec }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r27 = r7
            int[] r7 = r1.f23330e     // Catch:{ all -> 0x03ec }
            r6 = r7[r6]     // Catch:{ all -> 0x03ec }
            if (r6 == 0) goto L_0x0328
            int r7 = r6 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r7
            int r7 = r6 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r7
            int r7 = r6 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r7
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r6
            int r24 = r24 + 1
        L_0x0328:
            int r2 = r2 + 1
            r7 = r27
            goto L_0x02f6
        L_0x032d:
            r27 = r7
            int r0 = r0 + r9
            r2 = r0
        L_0x0331:
            int r6 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r6 = r6 + r0
            if (r2 >= r6) goto L_0x0364
            byte[] r6 = r1.f23341p     // Catch:{ all -> 0x03ec }
            int r6 = r6.length     // Catch:{ all -> 0x03ec }
            if (r2 >= r6) goto L_0x0364
            if (r2 >= r15) goto L_0x0364
            byte[] r6 = r1.f23341p     // Catch:{ all -> 0x03ec }
            byte r6 = r6[r2]     // Catch:{ all -> 0x03ec }
            r6 = r6 & 255(0xff, float:3.57E-43)
            int[] r7 = r1.f23330e     // Catch:{ all -> 0x03ec }
            r6 = r7[r6]     // Catch:{ all -> 0x03ec }
            if (r6 == 0) goto L_0x0361
            int r7 = r6 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r7
            int r7 = r6 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r7
            int r7 = r6 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r7
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r6
            int r24 = r24 + 1
        L_0x0361:
            int r2 = r2 + 1
            goto L_0x0331
        L_0x0364:
            if (r24 != 0) goto L_0x0368
            r0 = 0
            goto L_0x037a
        L_0x0368:
            int r19 = r19 / r24
            int r0 = r19 << 24
            int r20 = r20 / r24
            int r2 = r20 << 16
            r0 = r0 | r2
            int r21 = r21 / r24
            int r2 = r21 << 8
            r0 = r0 | r2
            int r22 = r22 / r24
            r0 = r0 | r22
        L_0x037a:
            if (r0 == 0) goto L_0x037f
            r3[r4] = r0     // Catch:{ all -> 0x03ec }
            goto L_0x0388
        L_0x037f:
            boolean r0 = r1.f23350y     // Catch:{ all -> 0x03ec }
            if (r0 != 0) goto L_0x0388
            if (r8 == 0) goto L_0x0388
            r0 = 1
            r1.f23350y = r0     // Catch:{ all -> 0x03ec }
        L_0x0388:
            int r0 = r1.f23347v     // Catch:{ all -> 0x03ec }
            int r9 = r9 + r0
            int r4 = r4 + 1
            r2 = r18
            r6 = r25
            r7 = r27
            goto L_0x02ce
        L_0x0395:
            r17 = r0
        L_0x0397:
            r18 = r2
            r25 = r6
            r27 = r7
            int r11 = r11 + 1
            r9 = r13
            r0 = r17
            r2 = r18
            r6 = r25
            r7 = r27
            r4 = 0
            goto L_0x0282
        L_0x03ab:
            boolean r0 = r1.f23345t     // Catch:{ all -> 0x03ec }
            if (r0 == 0) goto L_0x03d1
            int r0 = r5.f23357g     // Catch:{ all -> 0x03ec }
            if (r0 == 0) goto L_0x03b8
            int r0 = r5.f23357g     // Catch:{ all -> 0x03ec }
            r2 = 1
            if (r0 != r2) goto L_0x03d1
        L_0x03b8:
            android.graphics.Bitmap r0 = r1.f23344s     // Catch:{ all -> 0x03ec }
            if (r0 != 0) goto L_0x03c2
            android.graphics.Bitmap r0 = r29.m25252e()     // Catch:{ all -> 0x03ec }
            r1.f23344s = r0     // Catch:{ all -> 0x03ec }
        L_0x03c2:
            android.graphics.Bitmap r8 = r1.f23344s     // Catch:{ all -> 0x03ec }
            r10 = 0
            int r11 = r1.f23349x     // Catch:{ all -> 0x03ec }
            r12 = 0
            r13 = 0
            int r14 = r1.f23349x     // Catch:{ all -> 0x03ec }
            int r15 = r1.f23348w     // Catch:{ all -> 0x03ec }
            r9 = r3
            r8.setPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ec }
        L_0x03d1:
            android.graphics.Bitmap r0 = r29.m25252e()     // Catch:{ all -> 0x03ec }
            r10 = 0
            int r11 = r1.f23349x     // Catch:{ all -> 0x03ec }
            r12 = 0
            r13 = 0
            int r14 = r1.f23349x     // Catch:{ all -> 0x03ec }
            int r15 = r1.f23348w     // Catch:{ all -> 0x03ec }
            r8 = r0
            r9 = r3
            r8.setPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ec }
            monitor-exit(r29)
            return r0
        L_0x03e5:
            int r0 = r1.f23346u     // Catch:{ all -> 0x03ec }
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ec }
            monitor-exit(r29)
            return r3
        L_0x03ec:
            r0 = move-exception
            monitor-exit(r29)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9406ic.mo58336a():android.graphics.Bitmap");
    }

    /* renamed from: a */
    private synchronized void m25246a(C9409ie ieVar, byte[] bArr) {
        m25245a(ieVar, ByteBuffer.wrap(bArr));
    }

    /* renamed from: a */
    private synchronized void m25245a(C9409ie ieVar, ByteBuffer byteBuffer) {
        m25249b(ieVar, byteBuffer);
    }

    /* renamed from: b */
    private synchronized void m25249b(C9409ie ieVar, ByteBuffer byteBuffer) {
        int highestOneBit = Integer.highestOneBit(1);
        this.f23346u = 0;
        this.f23329c = ieVar;
        this.f23350y = false;
        this.f23327a = -1;
        this.f23328b = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f23332g = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f23332g.order(ByteOrder.LITTLE_ENDIAN);
        this.f23345t = false;
        Iterator it = ieVar.f23366e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C9408id) it.next()).f23357g == 3) {
                    this.f23345t = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f23347v = highestOneBit;
        this.f23349x = ieVar.f23367f / highestOneBit;
        this.f23348w = ieVar.f23368g / highestOneBit;
        this.f23341p = this.f23343r.mo58338a(ieVar.f23367f * ieVar.f23368g);
        this.f23342q = this.f23343r.mo58339b(this.f23349x * this.f23348w);
    }

    /* renamed from: a */
    private void m25247a(int[] iArr, C9408id idVar, int i) {
        int i2 = idVar.f23354d / this.f23347v;
        int i3 = idVar.f23352b / this.f23347v;
        int i4 = idVar.f23353c / this.f23347v;
        int i5 = idVar.f23351a / this.f23347v;
        int i6 = this.f23349x;
        int i7 = (i3 * i6) + i5;
        int i8 = (i2 * i6) + i7;
        while (i7 < i8) {
            int i9 = i7 + i4;
            for (int i10 = i7; i10 < i9; i10++) {
                iArr[i10] = i;
            }
            i7 += this.f23349x;
        }
    }

    /* renamed from: b */
    private void m25248b() {
        if (this.f23335j <= this.f23336k) {
            if (this.f23334i == null) {
                this.f23334i = this.f23343r.mo58338a(16384);
            }
            this.f23336k = 0;
            int min = Math.min(this.f23332g.remaining(), 16384);
            this.f23335j = min;
            this.f23332g.get(this.f23334i, 0, min);
        }
    }

    /* renamed from: c */
    private int m25250c() {
        try {
            m25248b();
            byte[] bArr = this.f23334i;
            int i = this.f23336k;
            this.f23336k = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f23346u = 1;
            return 0;
        }
    }

    /* renamed from: d */
    private int m25251d() {
        int c = m25250c();
        if (c > 0) {
            try {
                if (this.f23333h == null) {
                    this.f23333h = this.f23343r.mo58338a(255);
                }
                int i = this.f23335j - this.f23336k;
                if (i >= c) {
                    System.arraycopy(this.f23334i, this.f23336k, this.f23333h, 0, c);
                    this.f23336k += c;
                } else if (this.f23332g.remaining() + i >= c) {
                    System.arraycopy(this.f23334i, this.f23336k, this.f23333h, 0, i);
                    this.f23336k = this.f23335j;
                    m25248b();
                    int i2 = c - i;
                    System.arraycopy(this.f23334i, 0, this.f23333h, i, i2);
                    this.f23336k += i2;
                } else {
                    this.f23346u = 1;
                }
            } catch (Exception unused) {
                this.f23346u = 1;
            }
        }
        return c;
    }

    /* renamed from: e */
    private Bitmap m25252e() {
        Bitmap a = this.f23343r.mo58337a(this.f23349x, this.f23348w, this.f23350y ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        if (Build.VERSION.SDK_INT >= 12) {
            a.setHasAlpha(true);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo58335a(byte[] bArr) {
        if (this.f23337l == null) {
            this.f23337l = new C9410if();
        }
        C9409ie a = this.f23337l.mo58341a(bArr).mo58340a();
        this.f23329c = a;
        if (bArr != null) {
            m25246a(a, bArr);
        }
        return this.f23346u;
    }
}
