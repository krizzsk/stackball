package com.yandex.mobile.ads.impl;

import java.util.Arrays;

public final class nq0 {

    /* renamed from: a */
    public static final byte[] f37879a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f37880b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f37881c = new Object();

    /* renamed from: d */
    private static int[] f37882d = new int[10];

    /* renamed from: com.yandex.mobile.ads.impl.nq0$a */
    public static final class C14126a {

        /* renamed from: a */
        public final int f37883a;

        /* renamed from: b */
        public final int f37884b;

        /* renamed from: c */
        public final boolean f37885c;

        public C14126a(int i, int i2, boolean z) {
            this.f37883a = i;
            this.f37884b = i2;
            this.f37885c = z;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nq0$b */
    public static final class C14127b {

        /* renamed from: a */
        public final int f37886a;

        /* renamed from: b */
        public final int f37887b;

        /* renamed from: c */
        public final int f37888c;

        /* renamed from: d */
        public final int f37889d;

        /* renamed from: e */
        public final int f37890e;

        /* renamed from: f */
        public final int f37891f;

        /* renamed from: g */
        public final float f37892g;

        /* renamed from: h */
        public final boolean f37893h;

        /* renamed from: i */
        public final boolean f37894i;

        /* renamed from: j */
        public final int f37895j;

        /* renamed from: k */
        public final int f37896k;

        /* renamed from: l */
        public final int f37897l;

        /* renamed from: m */
        public final boolean f37898m;

        public C14127b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f37886a = i;
            this.f37887b = i2;
            this.f37888c = i3;
            this.f37889d = i4;
            this.f37890e = i5;
            this.f37891f = i6;
            this.f37892g = f;
            this.f37893h = z;
            this.f37894i = z2;
            this.f37895j = i7;
            this.f37896k = i8;
            this.f37897l = i9;
            this.f37898m = z3;
        }
    }

    /* renamed from: a */
    public static int m40145a(byte[] bArr, int i) {
        int i2;
        synchronized (f37881c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f37882d;
                    if (iArr.length <= i4) {
                        f37882d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f37882d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f37882d[i7] - i6;
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

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0162  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.impl.nq0.C14127b m40149b(byte[] r22, int r23, int r24) {
        /*
            com.yandex.mobile.ads.impl.gy0 r0 = new com.yandex.mobile.ads.impl.gy0
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo67370d(r1)
            int r3 = r0.mo67367b(r1)
            int r4 = r0.mo67367b(r1)
            int r5 = r0.mo67367b(r1)
            int r6 = r0.mo67372f()
            r2 = 3
            r7 = 16
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x0050
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x0050
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x0050
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x0050
            r10 = 44
            if (r3 == r10) goto L_0x0050
            r10 = 83
            if (r3 == r10) goto L_0x0050
            r10 = 86
            if (r3 == r10) goto L_0x0050
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x0050
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x0050
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            r10 = 1
            r11 = 0
            goto L_0x00a3
        L_0x0050:
            int r10 = r0.mo67372f()
            if (r10 != r2) goto L_0x005b
            boolean r11 = r0.mo67369c()
            goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            r0.mo67372f()
            r0.mo67372f()
            r0.mo67373g()
            boolean r12 = r0.mo67369c()
            if (r12 == 0) goto L_0x00a3
            if (r10 == r2) goto L_0x0070
            r12 = 8
            goto L_0x0072
        L_0x0070:
            r12 = 12
        L_0x0072:
            r13 = 0
        L_0x0073:
            if (r13 >= r12) goto L_0x00a3
            boolean r14 = r0.mo67369c()
            if (r14 == 0) goto L_0x00a0
            r14 = 6
            if (r13 >= r14) goto L_0x0081
            r14 = 16
            goto L_0x0083
        L_0x0081:
            r14 = 64
        L_0x0083:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x0088:
            if (r15 >= r14) goto L_0x00a0
            if (r16 == 0) goto L_0x0098
            int r16 = r0.mo67371e()
            int r8 = r17 + r16
            int r8 = r8 + 256
            int r8 = r8 % 256
            r16 = r8
        L_0x0098:
            if (r16 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r17 = r16
        L_0x009d:
            int r15 = r15 + 1
            goto L_0x0088
        L_0x00a0:
            int r13 = r13 + 1
            goto L_0x0073
        L_0x00a3:
            int r8 = r0.mo67372f()
            int r12 = r8 + 4
            int r13 = r0.mo67372f()
            if (r13 != 0) goto L_0x00b9
            int r8 = r0.mo67372f()
            int r8 = r8 + 4
            r24 = r3
            r14 = r8
            goto L_0x00de
        L_0x00b9:
            if (r13 != r9) goto L_0x00db
            boolean r8 = r0.mo67369c()
            r0.mo67371e()
            r0.mo67371e()
            int r14 = r0.mo67372f()
            long r14 = (long) r14
            r24 = r3
            r1 = 0
        L_0x00cd:
            long r2 = (long) r1
            int r17 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x00d8
            r0.mo67372f()
            int r1 = r1 + 1
            goto L_0x00cd
        L_0x00d8:
            r15 = r8
            r14 = 0
            goto L_0x00df
        L_0x00db:
            r24 = r3
            r14 = 0
        L_0x00de:
            r15 = 0
        L_0x00df:
            r0.mo67372f()
            r0.mo67373g()
            int r1 = r0.mo67372f()
            int r1 = r1 + r9
            int r2 = r0.mo67372f()
            int r2 = r2 + r9
            boolean r17 = r0.mo67369c()
            int r3 = 2 - r17
            int r2 = r2 * r3
            if (r17 != 0) goto L_0x00fc
            r0.mo67373g()
        L_0x00fc:
            r0.mo67373g()
            int r1 = r1 * 16
            int r2 = r2 * 16
            boolean r8 = r0.mo67369c()
            if (r8 == 0) goto L_0x0135
            int r8 = r0.mo67372f()
            int r18 = r0.mo67372f()
            int r19 = r0.mo67372f()
            int r20 = r0.mo67372f()
            if (r10 != 0) goto L_0x011c
            goto L_0x012a
        L_0x011c:
            r21 = 2
            r7 = 3
            if (r10 != r7) goto L_0x0123
            r7 = 1
            goto L_0x0124
        L_0x0123:
            r7 = 2
        L_0x0124:
            if (r10 != r9) goto L_0x0127
            r9 = 2
        L_0x0127:
            int r3 = r3 * r9
            r9 = r7
        L_0x012a:
            int r8 = r8 + r18
            int r8 = r8 * r9
            int r1 = r1 - r8
            int r19 = r19 + r20
            int r19 = r19 * r3
            int r2 = r2 - r19
        L_0x0135:
            r7 = r1
            r8 = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo67369c()
            if (r2 == 0) goto L_0x0181
            boolean r2 = r0.mo67369c()
            if (r2 == 0) goto L_0x0181
            r2 = 8
            int r2 = r0.mo67367b(r2)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 != r3) goto L_0x0162
            r3 = 16
            int r2 = r0.mo67367b(r3)
            int r0 = r0.mo67367b(r3)
            if (r2 == 0) goto L_0x0181
            if (r0 == 0) goto L_0x0181
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            r9 = r1
            goto L_0x0183
        L_0x0162:
            float[] r0 = f37880b
            int r3 = r0.length
            if (r2 >= r3) goto L_0x016b
            r0 = r0[r2]
            r9 = r0
            goto L_0x0183
        L_0x016b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected aspect_ratio_idc value: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            android.util.Log.w(r2, r0)
        L_0x0181:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0183:
            com.yandex.mobile.ads.impl.nq0$b r0 = new com.yandex.mobile.ads.impl.nq0$b
            r2 = r0
            r3 = r24
            r10 = r11
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nq0.m40149b(byte[], int, int):com.yandex.mobile.ads.impl.nq0$b");
    }

    /* renamed from: a */
    public static C14126a m40147a(byte[] bArr, int i, int i2) {
        gy0 gy0 = new gy0(bArr, i, i2);
        gy0.mo67370d(8);
        int f = gy0.mo67372f();
        int f2 = gy0.mo67372f();
        gy0.mo67373g();
        return new C14126a(f, f2, gy0.mo67369c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m40146a(byte[] r7, int r8, int r9, boolean[] r10) {
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
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m40148a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m40148a(r10)
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
            m40148a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            m40148a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bb
            if (r0 <= r3) goto L_0x007c
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x0097
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x0097
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x0097
            goto L_0x0095
        L_0x007c:
            if (r0 != r3) goto L_0x008d
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x0097
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x0097
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x0097
            goto L_0x0095
        L_0x008d:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x0097
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x0097
        L_0x0095:
            r8 = 1
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a7
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
            goto L_0x00af
        L_0x00a7:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = 1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b9
            r1 = 1
        L_0x00b9:
            r10[r3] = r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nq0.m40146a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: a */
    public static void m40148a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
