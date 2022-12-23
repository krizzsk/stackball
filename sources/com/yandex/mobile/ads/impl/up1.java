package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vp1;

final class up1 extends mb1 {

    /* renamed from: n */
    private C14775a f40836n;

    /* renamed from: o */
    private int f40837o;

    /* renamed from: p */
    private boolean f40838p;

    /* renamed from: q */
    private vp1.C14905c f40839q;

    /* renamed from: r */
    private vp1.C14903a f40840r;

    /* renamed from: com.yandex.mobile.ads.impl.up1$a */
    static final class C14775a {

        /* renamed from: a */
        public final vp1.C14905c f40841a;

        /* renamed from: b */
        public final byte[] f40842b;

        /* renamed from: c */
        public final vp1.C14904b[] f40843c;

        /* renamed from: d */
        public final int f40844d;

        public C14775a(vp1.C14905c cVar, vp1.C14903a aVar, byte[] bArr, vp1.C14904b[] bVarArr, int i) {
            this.f40841a = cVar;
            this.f40842b = bArr;
            this.f40843c = bVarArr;
            this.f40844d = i;
        }
    }

    up1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67362a(boolean z) {
        super.mo67362a(z);
        if (z) {
            this.f40836n = null;
            this.f40839q = null;
            this.f40840r = null;
        }
        this.f40837o = 0;
        this.f40838p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo68645c(long j) {
        super.mo68645c(j);
        int i = 0;
        this.f40838p = j != 0;
        vp1.C14905c cVar = this.f40839q;
        if (cVar != null) {
            i = cVar.f41368d;
        }
        this.f40837o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo67361a(fy0 fy0) {
        int i;
        byte[] bArr = fy0.f33778a;
        int i2 = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        byte b = bArr[0];
        C14775a aVar = this.f40836n;
        if (!aVar.f40843c[(b >> 1) & (255 >>> (8 - aVar.f40844d))].f41364a) {
            i = aVar.f40841a.f41368d;
        } else {
            i = aVar.f40841a.f41369e;
        }
        if (this.f40838p) {
            i2 = (this.f40837o + i) / 4;
        }
        long j = (long) i2;
        fy0.mo67110d(fy0.mo67107c() + 4);
        fy0.f33778a[fy0.mo67107c() - 4] = (byte) ((int) (j & 255));
        fy0.f33778a[fy0.mo67107c() - 3] = (byte) ((int) ((j >>> 8) & 255));
        fy0.f33778a[fy0.mo67107c() - 2] = (byte) ((int) ((j >>> 16) & 255));
        fy0.f33778a[fy0.mo67107c() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f40838p = true;
        this.f40837o = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67363a(com.yandex.mobile.ads.impl.fy0 r22, long r23, com.yandex.mobile.ads.impl.mb1.C13968b r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.yandex.mobile.ads.impl.up1$a r2 = r0.f40836n
            r3 = 0
            if (r2 == 0) goto L_0x000a
            return r3
        L_0x000a:
            com.yandex.mobile.ads.impl.vp1$c r2 = r0.f40839q
            r5 = 4
            r6 = 1
            if (r2 != 0) goto L_0x0066
            com.yandex.mobile.ads.impl.vp1.m43184a((int) r6, (com.yandex.mobile.ads.impl.fy0) r1, (boolean) r3)
            long r8 = r22.mo67119k()
            int r10 = r22.mo67126r()
            long r11 = r22.mo67119k()
            int r13 = r22.mo67117i()
            int r14 = r22.mo67117i()
            int r15 = r22.mo67117i()
            int r2 = r22.mo67126r()
            r7 = r2 & 15
            double r3 = (double) r7
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r6, r3)
            int r3 = (int) r3
            r2 = r2 & 240(0xf0, float:3.36E-43)
            int r2 = r2 >> r5
            double r4 = (double) r2
            double r4 = java.lang.Math.pow(r6, r4)
            int r2 = (int) r4
            int r4 = r22.mo67126r()
            r5 = 1
            r4 = r4 & r5
            if (r4 <= 0) goto L_0x004d
            r18 = 1
            goto L_0x004f
        L_0x004d:
            r18 = 0
        L_0x004f:
            byte[] r4 = r1.f33778a
            int r1 = r22.mo67107c()
            byte[] r19 = java.util.Arrays.copyOf(r4, r1)
            com.yandex.mobile.ads.impl.vp1$c r1 = new com.yandex.mobile.ads.impl.vp1$c
            r7 = r1
            r16 = r3
            r17 = r2
            r7.<init>(r8, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r0.f40839q = r1
            goto L_0x0071
        L_0x0066:
            com.yandex.mobile.ads.impl.vp1$a r2 = r0.f40840r
            if (r2 != 0) goto L_0x0074
            r2 = 1
            com.yandex.mobile.ads.impl.vp1$a r1 = com.yandex.mobile.ads.impl.vp1.m43183a((com.yandex.mobile.ads.impl.fy0) r1, (boolean) r2, (boolean) r2)
            r0.f40840r = r1
        L_0x0071:
            r4 = 0
            goto L_0x03cd
        L_0x0074:
            int r2 = r22.mo67107c()
            byte[] r9 = new byte[r2]
            byte[] r2 = r1.f33778a
            int r3 = r22.mo67107c()
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r9, r4, r3)
            com.yandex.mobile.ads.impl.vp1$c r2 = r0.f40839q
            int r2 = r2.f41365a
            r3 = 5
            com.yandex.mobile.ads.impl.vp1.m43184a((int) r3, (com.yandex.mobile.ads.impl.fy0) r1, (boolean) r4)
            int r6 = r22.mo67126r()
            r7 = 1
            int r6 = r6 + r7
            com.yandex.mobile.ads.impl.tp1 r7 = new com.yandex.mobile.ads.impl.tp1
            byte[] r8 = r1.f33778a
            r7.<init>(r8)
            int r1 = r22.mo67105b()
            r8 = 8
            int r1 = r1 * 8
            r7.mo70213b(r1)
            r1 = 0
        L_0x00a5:
            r10 = 24
            r12 = 16
            if (r1 >= r6) goto L_0x01b1
            int r13 = r7.mo70212a(r10)
            r14 = 5653314(0x564342, float:7.92198E-39)
            if (r13 != r14) goto L_0x0196
            int r12 = r7.mo70212a(r12)
            int r10 = r7.mo70212a(r10)
            long[] r13 = new long[r10]
            boolean r14 = r7.mo70214b()
            r15 = 0
            if (r14 != 0) goto L_0x0100
            boolean r14 = r7.mo70214b()
        L_0x00ca:
            if (r4 >= r10) goto L_0x00fd
            if (r14 == 0) goto L_0x00e9
            boolean r17 = r7.mo70214b()
            if (r17 == 0) goto L_0x00e2
            int r17 = r7.mo70212a(r3)
            r18 = 1
            int r8 = r17 + 1
            r17 = r12
            long r11 = (long) r8
            r13[r4] = r11
            goto L_0x00f6
        L_0x00e2:
            r17 = r12
            r18 = 1
            r13[r4] = r15
            goto L_0x00f6
        L_0x00e9:
            r17 = r12
            r18 = 1
            int r8 = r7.mo70212a(r3)
            int r8 = r8 + 1
            long r11 = (long) r8
            r13[r4] = r11
        L_0x00f6:
            int r4 = r4 + 1
            r12 = r17
            r8 = 8
            goto L_0x00ca
        L_0x00fd:
            r17 = r12
            goto L_0x0131
        L_0x0100:
            r17 = r12
            r18 = 1
            int r4 = r7.mo70212a(r3)
            int r4 = r4 + 1
            r8 = 0
        L_0x010b:
            if (r8 >= r10) goto L_0x0131
            int r11 = r10 - r8
            int r11 = com.yandex.mobile.ads.impl.vp1.m43182a(r11)
            int r11 = r7.mo70212a(r11)
            r12 = 0
        L_0x0118:
            if (r12 >= r11) goto L_0x0129
            if (r8 >= r10) goto L_0x0129
            r18 = r6
            long r5 = (long) r4
            r13[r8] = r5
            int r8 = r8 + 1
            int r12 = r12 + 1
            r6 = r18
            r5 = 4
            goto L_0x0118
        L_0x0129:
            r18 = r6
            int r4 = r4 + 1
            r6 = r18
            r5 = 4
            goto L_0x010b
        L_0x0131:
            r18 = r6
            r4 = 4
            int r5 = r7.mo70212a(r4)
            r6 = 2
            if (r5 > r6) goto L_0x017f
            r8 = 1
            if (r5 == r8) goto L_0x0140
            if (r5 != r6) goto L_0x0175
        L_0x0140:
            r6 = 32
            r7.mo70213b(r6)
            r7.mo70213b(r6)
            int r6 = r7.mo70212a(r4)
            int r6 = r6 + r8
            r7.mo70213b(r8)
            if (r5 != r8) goto L_0x0168
            if (r17 == 0) goto L_0x016e
            long r4 = (long) r10
            r8 = r17
            long r10 = (long) r8
            double r4 = (double) r4
            double r10 = (double) r10
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 / r10
            double r4 = java.lang.Math.pow(r4, r12)
            double r4 = java.lang.Math.floor(r4)
            long r4 = (long) r4
            r15 = r4
            goto L_0x016e
        L_0x0168:
            r8 = r17
            long r4 = (long) r10
            long r10 = (long) r8
            long r15 = r4 * r10
        L_0x016e:
            long r4 = (long) r6
            long r4 = r4 * r15
            int r5 = (int) r4
            r7.mo70213b(r5)
        L_0x0175:
            int r1 = r1 + 1
            r6 = r18
            r4 = 0
            r5 = 4
            r8 = 8
            goto L_0x00a5
        L_0x017f:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lookup type greater than 2 not decodable: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0196:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r2.append(r3)
            int r3 = r7.mo70211a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b1:
            r1 = 6
            int r4 = r7.mo70212a(r1)
            r5 = 1
            int r4 = r4 + r5
            r5 = 0
        L_0x01b9:
            if (r5 >= r4) goto L_0x01cc
            int r6 = r7.mo70212a(r12)
            if (r6 != 0) goto L_0x01c4
            int r5 = r5 + 1
            goto L_0x01b9
        L_0x01c4:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>(r2)
            throw r1
        L_0x01cc:
            int r4 = r7.mo70212a(r1)
            r5 = 1
            int r4 = r4 + r5
            r6 = 0
        L_0x01d3:
            r8 = 3
            if (r6 >= r4) goto L_0x028c
            int r11 = r7.mo70212a(r12)
            if (r11 == 0) goto L_0x0261
            if (r11 != r5) goto L_0x024a
            int r5 = r7.mo70212a(r3)
            r11 = -1
            int[] r13 = new int[r5]
            r15 = 0
        L_0x01e6:
            if (r15 >= r5) goto L_0x01f8
            r14 = 4
            int r16 = r7.mo70212a(r14)
            r13[r15] = r16
            r14 = r13[r15]
            if (r14 <= r11) goto L_0x01f5
            r11 = r13[r15]
        L_0x01f5:
            int r15 = r15 + 1
            goto L_0x01e6
        L_0x01f8:
            int r11 = r11 + 1
            int[] r15 = new int[r11]
            r14 = 0
        L_0x01fd:
            if (r14 >= r11) goto L_0x022b
            int r17 = r7.mo70212a(r8)
            r18 = 1
            int r17 = r17 + 1
            r15[r14] = r17
            r3 = 2
            int r19 = r7.mo70212a(r3)
            r3 = 8
            if (r19 <= 0) goto L_0x0215
            r7.mo70213b(r3)
        L_0x0215:
            r8 = 0
        L_0x0216:
            int r10 = r18 << r19
            if (r8 >= r10) goto L_0x0224
            r7.mo70213b(r3)
            int r8 = r8 + 1
            r3 = 8
            r18 = 1
            goto L_0x0216
        L_0x0224:
            int r14 = r14 + 1
            r3 = 5
            r8 = 3
            r10 = 24
            goto L_0x01fd
        L_0x022b:
            r3 = 2
            r7.mo70213b(r3)
            r3 = 4
            int r8 = r7.mo70212a(r3)
            r3 = 0
            r10 = 0
            r11 = 0
        L_0x0237:
            if (r3 >= r5) goto L_0x0284
            r16 = r13[r3]
            r16 = r15[r16]
            int r10 = r10 + r16
        L_0x023f:
            if (r11 >= r10) goto L_0x0247
            r7.mo70213b(r8)
            int r11 = r11 + 1
            goto L_0x023f
        L_0x0247:
            int r3 = r3 + 1
            goto L_0x0237
        L_0x024a:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "floor type greater than 1 not decodable: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0261:
            r3 = 8
            r7.mo70213b(r3)
            r7.mo70213b(r12)
            r7.mo70213b(r12)
            r7.mo70213b(r1)
            r7.mo70213b(r3)
            r5 = 4
            int r8 = r7.mo70212a(r5)
            r5 = 1
            int r8 = r8 + r5
            r5 = 0
        L_0x027a:
            if (r5 >= r8) goto L_0x0284
            r7.mo70213b(r3)
            int r5 = r5 + 1
            r3 = 8
            goto L_0x027a
        L_0x0284:
            int r6 = r6 + 1
            r3 = 5
            r5 = 1
            r10 = 24
            goto L_0x01d3
        L_0x028c:
            int r3 = r7.mo70212a(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x0293:
            if (r5 >= r3) goto L_0x02ff
            int r6 = r7.mo70212a(r12)
            r8 = 2
            if (r6 > r8) goto L_0x02f7
            r6 = 24
            r7.mo70213b(r6)
            r7.mo70213b(r6)
            r7.mo70213b(r6)
            int r8 = r7.mo70212a(r1)
            int r8 = r8 + r4
            r4 = 8
            r7.mo70213b(r4)
            int[] r10 = new int[r8]
            r11 = 0
        L_0x02b4:
            if (r11 >= r8) goto L_0x02d4
            r13 = 3
            int r15 = r7.mo70212a(r13)
            boolean r16 = r7.mo70214b()
            r6 = 5
            if (r16 == 0) goto L_0x02c7
            int r16 = r7.mo70212a(r6)
            goto L_0x02c9
        L_0x02c7:
            r16 = 0
        L_0x02c9:
            int r16 = r16 * 8
            int r16 = r16 + r15
            r10[r11] = r16
            int r11 = r11 + 1
            r6 = 24
            goto L_0x02b4
        L_0x02d4:
            r6 = 5
            r13 = 3
            r11 = 0
        L_0x02d7:
            if (r11 >= r8) goto L_0x02f3
            r15 = 0
        L_0x02da:
            if (r15 >= r4) goto L_0x02ee
            r16 = r10[r11]
            r17 = 1
            int r18 = r17 << r15
            r16 = r16 & r18
            if (r16 == 0) goto L_0x02e9
            r7.mo70213b(r4)
        L_0x02e9:
            int r15 = r15 + 1
            r4 = 8
            goto L_0x02da
        L_0x02ee:
            int r11 = r11 + 1
            r4 = 8
            goto L_0x02d7
        L_0x02f3:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x0293
        L_0x02f7:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>(r2)
            throw r1
        L_0x02ff:
            int r3 = r7.mo70212a(r1)
            r4 = 1
            int r3 = r3 + r4
            r4 = 0
        L_0x0306:
            if (r4 >= r3) goto L_0x0390
            int r5 = r7.mo70212a(r12)
            if (r5 == 0) goto L_0x0327
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "VorbisUtil"
            android.util.Log.e(r6, r5)
            r6 = 2
            r10 = 4
            goto L_0x0384
        L_0x0327:
            boolean r5 = r7.mo70214b()
            if (r5 == 0) goto L_0x0337
            r5 = 4
            int r6 = r7.mo70212a(r5)
            r20 = 1
            int r5 = r6 + 1
            goto L_0x033a
        L_0x0337:
            r20 = 1
            r5 = 1
        L_0x033a:
            boolean r6 = r7.mo70214b()
            if (r6 == 0) goto L_0x035e
            r6 = 8
            int r8 = r7.mo70212a(r6)
            int r8 = r8 + 1
            r6 = 0
        L_0x0349:
            if (r6 >= r8) goto L_0x035e
            int r10 = r2 + -1
            int r11 = com.yandex.mobile.ads.impl.vp1.m43182a(r10)
            r7.mo70213b(r11)
            int r10 = com.yandex.mobile.ads.impl.vp1.m43182a(r10)
            r7.mo70213b(r10)
            int r6 = r6 + 1
            goto L_0x0349
        L_0x035e:
            r6 = 2
            int r8 = r7.mo70212a(r6)
            if (r8 != 0) goto L_0x0388
            r8 = 1
            if (r5 <= r8) goto L_0x0372
            r8 = 0
        L_0x0369:
            if (r8 >= r2) goto L_0x0372
            r10 = 4
            r7.mo70213b(r10)
            int r8 = r8 + 1
            goto L_0x0369
        L_0x0372:
            r10 = 4
            r8 = 0
        L_0x0374:
            if (r8 >= r5) goto L_0x0384
            r11 = 8
            r7.mo70213b(r11)
            r7.mo70213b(r11)
            r7.mo70213b(r11)
            int r8 = r8 + 1
            goto L_0x0374
        L_0x0384:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x0388:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>(r2)
            throw r1
        L_0x0390:
            int r1 = r7.mo70212a(r1)
            r2 = 1
            int r1 = r1 + r2
            com.yandex.mobile.ads.impl.vp1$b[] r10 = new com.yandex.mobile.ads.impl.vp1.C14904b[r1]
            r3 = 0
        L_0x0399:
            if (r3 >= r1) goto L_0x03b7
            boolean r2 = r7.mo70214b()
            int r4 = r7.mo70212a(r12)
            int r5 = r7.mo70212a(r12)
            r6 = 8
            int r8 = r7.mo70212a(r6)
            com.yandex.mobile.ads.impl.vp1$b r11 = new com.yandex.mobile.ads.impl.vp1$b
            r11.<init>(r2, r4, r5, r8)
            r10[r3] = r11
            int r3 = r3 + 1
            goto L_0x0399
        L_0x03b7:
            boolean r2 = r7.mo70214b()
            if (r2 == 0) goto L_0x0406
            r2 = 1
            int r1 = r1 - r2
            int r11 = com.yandex.mobile.ads.impl.vp1.m43182a(r1)
            com.yandex.mobile.ads.impl.up1$a r4 = new com.yandex.mobile.ads.impl.up1$a
            com.yandex.mobile.ads.impl.vp1$c r7 = r0.f40839q
            com.yandex.mobile.ads.impl.vp1$a r8 = r0.f40840r
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x03cd:
            r0.f40836n = r4
            if (r4 != 0) goto L_0x03d3
            r1 = 1
            return r1
        L_0x03d3:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.yandex.mobile.ads.impl.up1$a r1 = r0.f40836n
            com.yandex.mobile.ads.impl.vp1$c r1 = r1.f40841a
            byte[] r1 = r1.f41370f
            r10.add(r1)
            com.yandex.mobile.ads.impl.up1$a r1 = r0.f40836n
            byte[] r1 = r1.f40842b
            r10.add(r1)
            r2 = 0
            r4 = 0
            com.yandex.mobile.ads.impl.up1$a r1 = r0.f40836n
            com.yandex.mobile.ads.impl.vp1$c r1 = r1.f40841a
            int r5 = r1.f41367c
            r6 = -1
            int r7 = r1.f41365a
            long r8 = r1.f41366b
            int r8 = (int) r8
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = -1
            java.lang.String r3 = "audio/vorbis"
            com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (java.util.List<byte[]>) r10, (com.yandex.mobile.ads.exo.drm.DrmInitData) r11, (int) r12, (java.lang.String) r13)
            r2 = r25
            r2.f37301a = r1
            r1 = 1
            return r1
        L_0x0406:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.up1.mo67363a(com.yandex.mobile.ads.impl.fy0, long, com.yandex.mobile.ads.impl.mb1$b):boolean");
    }
}
