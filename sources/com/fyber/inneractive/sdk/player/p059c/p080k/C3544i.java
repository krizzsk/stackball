package com.fyber.inneractive.sdk.player.p059c.p080k;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.i */
public final class C3544i {

    /* renamed from: a */
    public static final byte[] f9604a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f9605b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f9606c = new Object();

    /* renamed from: d */
    private static int[] f9607d = new int[10];

    /* renamed from: com.fyber.inneractive.sdk.player.c.k.i$b */
    public static final class C3546b {

        /* renamed from: a */
        public final int f9611a;

        /* renamed from: b */
        public final int f9612b;

        /* renamed from: c */
        public final int f9613c;

        /* renamed from: d */
        public final float f9614d;

        /* renamed from: e */
        public final boolean f9615e;

        /* renamed from: f */
        public final boolean f9616f;

        /* renamed from: g */
        public final int f9617g;

        /* renamed from: h */
        public final int f9618h;

        /* renamed from: i */
        public final int f9619i;

        /* renamed from: j */
        public final boolean f9620j;

        public C3546b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f9611a = i;
            this.f9612b = i2;
            this.f9613c = i3;
            this.f9614d = f;
            this.f9615e = z;
            this.f9616f = z2;
            this.f9617g = i4;
            this.f9618h = i5;
            this.f9619i = i6;
            this.f9620j = z3;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.k.i$a */
    public static final class C3545a {

        /* renamed from: a */
        public final int f9608a;

        /* renamed from: b */
        public final int f9609b;

        /* renamed from: c */
        public final boolean f9610c;

        public C3545a(int i, int i2, boolean z) {
            this.f9608a = i;
            this.f9609b = i2;
            this.f9610c = z;
        }
    }

    /* renamed from: a */
    public static int m8803a(byte[] bArr, int i) {
        int i2;
        synchronized (f9606c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    if (f9607d.length <= i4) {
                        f9607d = Arrays.copyOf(f9607d, f9607d.length * 2);
                    }
                    f9607d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f9607d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* renamed from: a */
    public static void m8806a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & Ascii.f10112US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m8808a(String str, byte b) {
        if ((!"video/avc".equals(str) || (b & Ascii.f10112US) != 6) && (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m8809b(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.f10112US;
    }

    /* renamed from: c */
    public static int m8810c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3546b m8805a(byte[] r18, int r19, int r20) {
        /*
            com.fyber.inneractive.sdk.player.c.k.l r0 = new com.fyber.inneractive.sdk.player.c.k.l
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo19405a(r1)
            int r2 = r0.mo19409c(r1)
            r3 = 16
            r0.mo19405a(r3)
            int r5 = r0.mo19412e()
            r4 = 3
            r6 = 0
            r7 = 1
            r8 = 100
            if (r2 == r8) goto L_0x004c
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 122(0x7a, float:1.71E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 244(0xf4, float:3.42E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 44
            if (r2 == r8) goto L_0x004c
            r8 = 83
            if (r2 == r8) goto L_0x004c
            r8 = 86
            if (r2 == r8) goto L_0x004c
            r8 = 118(0x76, float:1.65E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 128(0x80, float:1.794E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 138(0x8a, float:1.93E-43)
            if (r2 != r8) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x009c
        L_0x004c:
            int r2 = r0.mo19412e()
            if (r2 != r4) goto L_0x0057
            boolean r8 = r0.mo19407b()
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            r0.mo19412e()
            r0.mo19412e()
            r0.mo19404a()
            boolean r9 = r0.mo19407b()
            if (r9 == 0) goto L_0x009b
            if (r2 == r4) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x009b
            boolean r11 = r0.mo19407b()
            if (r11 == 0) goto L_0x0098
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            r12 = 0
            r13 = 8
            r14 = 8
        L_0x0084:
            if (r12 >= r11) goto L_0x0098
            if (r13 == 0) goto L_0x0091
            int r13 = r0.mo19411d()
            int r13 = r13 + r14
            int r13 = r13 + 256
            int r13 = r13 % 256
        L_0x0091:
            if (r13 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r14 = r13
        L_0x0095:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x009b:
            r9 = r8
        L_0x009c:
            int r8 = r0.mo19412e()
            int r11 = r8 + 4
            int r12 = r0.mo19412e()
            if (r12 != 0) goto L_0x00b2
            int r8 = r0.mo19412e()
            int r8 = r8 + 4
            r18 = r5
            r13 = r8
            goto L_0x00d7
        L_0x00b2:
            if (r12 != r7) goto L_0x00d4
            boolean r8 = r0.mo19407b()
            r0.mo19411d()
            r0.mo19411d()
            int r10 = r0.mo19412e()
            long r13 = (long) r10
            r18 = r5
            r10 = 0
        L_0x00c6:
            long r4 = (long) r10
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00d1
            r0.mo19412e()
            int r10 = r10 + 1
            goto L_0x00c6
        L_0x00d1:
            r14 = r8
            r13 = 0
            goto L_0x00d8
        L_0x00d4:
            r18 = r5
            r13 = 0
        L_0x00d7:
            r14 = 0
        L_0x00d8:
            r0.mo19412e()
            r0.mo19404a()
            int r4 = r0.mo19412e()
            int r4 = r4 + r7
            int r5 = r0.mo19412e()
            int r5 = r5 + r7
            boolean r10 = r0.mo19407b()
            int r6 = 2 - r10
            int r6 = r6 * r5
            if (r10 != 0) goto L_0x00f5
            r0.mo19404a()
        L_0x00f5:
            r0.mo19404a()
            int r4 = r4 * 16
            int r6 = r6 * 16
            boolean r5 = r0.mo19407b()
            if (r5 == 0) goto L_0x0130
            int r5 = r0.mo19412e()
            int r8 = r0.mo19412e()
            int r15 = r0.mo19412e()
            int r16 = r0.mo19412e()
            if (r2 != 0) goto L_0x0117
            int r2 = 2 - r10
            goto L_0x0127
        L_0x0117:
            r17 = 2
            r3 = 3
            if (r2 != r3) goto L_0x011e
            r3 = 1
            goto L_0x011f
        L_0x011e:
            r3 = 2
        L_0x011f:
            if (r2 != r7) goto L_0x0122
            r7 = 2
        L_0x0122:
            int r2 = 2 - r10
            int r2 = r2 * r7
            r7 = r3
        L_0x0127:
            int r5 = r5 + r8
            int r5 = r5 * r7
            int r4 = r4 - r5
            int r15 = r15 + r16
            int r15 = r15 * r2
            int r6 = r6 - r15
        L_0x0130:
            r7 = r6
            r6 = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.mo19407b()
            if (r3 == 0) goto L_0x0178
            boolean r3 = r0.mo19407b()
            if (r3 == 0) goto L_0x0178
            int r1 = r0.mo19409c(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x015c
            r3 = 16
            int r1 = r0.mo19409c(r3)
            int r0 = r0.mo19409c(r3)
            if (r1 == 0) goto L_0x015a
            if (r0 == 0) goto L_0x015a
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x015a:
            r8 = r2
            goto L_0x017a
        L_0x015c:
            float[] r0 = f9605b
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0165
            r0 = r0[r1]
            r8 = r0
            goto L_0x017a
        L_0x0165:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected aspect_ratio_idc value: "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NalUnitUtil"
            android.util.Log.w(r1, r0)
        L_0x0178:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x017a:
            com.fyber.inneractive.sdk.player.c.k.i$b r0 = new com.fyber.inneractive.sdk.player.c.k.i$b
            r4 = r0
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8805a(byte[], int, int):com.fyber.inneractive.sdk.player.c.k.i$b");
    }

    /* renamed from: d */
    public static C3545a m8811d(byte[] bArr, int i) {
        C3549l lVar = new C3549l(bArr, 3, i);
        lVar.mo19405a(8);
        int e = lVar.mo19412e();
        int e2 = lVar.mo19412e();
        lVar.mo19404a();
        return new C3545a(e, e2, lVar.mo19407b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0096, code lost:
        r8 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8804a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m8807a((boolean[]) r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m8807a((boolean[]) r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            m8807a((boolean[]) r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0066
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 != 0) goto L_0x0063
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0061
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0061
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0061
            if (r10 == 0) goto L_0x0060
            m8807a((boolean[]) r10)
        L_0x0060:
            return r5
        L_0x0061:
            int r8 = r8 + -2
        L_0x0063:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0066:
            if (r10 == 0) goto L_0x00ba
            if (r0 <= r3) goto L_0x007d
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007b
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007b
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007b
            goto L_0x0096
        L_0x007b:
            r8 = 0
            goto L_0x0097
        L_0x007d:
            if (r0 != r3) goto L_0x008e
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007b
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007b
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007b
            goto L_0x0096
        L_0x008e:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007b
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007b
        L_0x0096:
            r8 = 1
        L_0x0097:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a6
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b0
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b0
            goto L_0x00ae
        L_0x00a6:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b0
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b0
        L_0x00ae:
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b8
            r1 = 1
        L_0x00b8:
            r10[r3] = r1
        L_0x00ba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8804a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: a */
    public static void m8807a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
