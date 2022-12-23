package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tf1;
import java.util.Arrays;

public final class i90 implements a30 {

    /* renamed from: q */
    private static final double[] f34768q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f34769a;

    /* renamed from: b */
    private ke1 f34770b;

    /* renamed from: c */
    private boolean f34771c;

    /* renamed from: d */
    private long f34772d;

    /* renamed from: e */
    private final hh1 f34773e;

    /* renamed from: f */
    private final fy0 f34774f;

    /* renamed from: g */
    private final boolean[] f34775g = new boolean[4];

    /* renamed from: h */
    private final C13387a f34776h = new C13387a(128);

    /* renamed from: i */
    private final mq0 f34777i;

    /* renamed from: j */
    private long f34778j;

    /* renamed from: k */
    private boolean f34779k;

    /* renamed from: l */
    private long f34780l;

    /* renamed from: m */
    private long f34781m;

    /* renamed from: n */
    private long f34782n;

    /* renamed from: o */
    private boolean f34783o;

    /* renamed from: p */
    private boolean f34784p;

    i90(hh1 hh1) {
        this.f34773e = hh1;
        if (hh1 != null) {
            this.f34777i = new mq0(178, 128);
            this.f34774f = new fy0();
            return;
        }
        this.f34777i = null;
        this.f34774f = null;
    }

    /* renamed from: a */
    public void mo65661a() {
        nq0.m40148a(this.f34775g);
        this.f34776h.mo67754a();
        if (this.f34773e != null) {
            this.f34777i.mo68850b();
        }
        this.f34778j = 0;
        this.f34779k = false;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.i90$a */
    private static final class C13387a {

        /* renamed from: e */
        private static final byte[] f34785e = {0, 0, 1};

        /* renamed from: a */
        private boolean f34786a;

        /* renamed from: b */
        public int f34787b;

        /* renamed from: c */
        public int f34788c;

        /* renamed from: d */
        public byte[] f34789d;

        public C13387a(int i) {
            this.f34789d = new byte[i];
        }

        /* renamed from: a */
        public void mo67754a() {
            this.f34786a = false;
            this.f34787b = 0;
            this.f34788c = 0;
        }

        /* renamed from: a */
        public boolean mo67756a(int i, int i2) {
            if (this.f34786a) {
                int i3 = this.f34787b - i2;
                this.f34787b = i3;
                if (this.f34788c == 0 && i == 181) {
                    this.f34788c = i3;
                } else {
                    this.f34786a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f34786a = true;
            }
            byte[] bArr = f34785e;
            mo67755a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: a */
        public void mo67755a(byte[] bArr, int i, int i2) {
            if (this.f34786a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f34789d;
                int length = bArr2.length;
                int i4 = this.f34787b + i3;
                if (length < i4) {
                    this.f34789d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.f34789d, this.f34787b, i3);
                this.f34787b += i3;
            }
        }
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f34769a = dVar.mo70178b();
        this.f34770b = x50.mo65304a(dVar.mo70179c(), 2);
        hh1 hh1 = this.f34773e;
        if (hh1 != null) {
            hh1.mo67557a(x50, dVar);
        }
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f34780l = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            int r2 = r28.mo67105b()
            int r3 = r28.mo67107c()
            byte[] r4 = r1.f33778a
            long r5 = r0.f34778j
            int r7 = r28.mo67098a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f34778j = r5
            com.yandex.mobile.ads.impl.ke1 r5 = r0.f34770b
            int r6 = r28.mo67098a()
            r5.mo65341a(r1, r6)
        L_0x0021:
            boolean[] r5 = r0.f34775g
            int r5 = com.yandex.mobile.ads.impl.nq0.m40146a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x003c
            boolean r1 = r0.f34771c
            if (r1 != 0) goto L_0x0032
            com.yandex.mobile.ads.impl.i90$a r1 = r0.f34776h
            r1.mo67755a(r4, r2, r3)
        L_0x0032:
            com.yandex.mobile.ads.impl.hh1 r1 = r0.f34773e
            if (r1 == 0) goto L_0x003b
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f34777i
            r1.mo68847a(r4, r2, r3)
        L_0x003b:
            return
        L_0x003c:
            byte[] r6 = r1.f33778a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f34771c
            if (r9 != 0) goto L_0x0114
            if (r8 <= 0) goto L_0x0051
            com.yandex.mobile.ads.impl.i90$a r9 = r0.f34776h
            r9.mo67755a(r4, r2, r5)
        L_0x0051:
            if (r8 >= 0) goto L_0x0055
            int r9 = -r8
            goto L_0x0056
        L_0x0055:
            r9 = 0
        L_0x0056:
            com.yandex.mobile.ads.impl.i90$a r14 = r0.f34776h
            boolean r9 = r14.mo67756a(r6, r9)
            if (r9 == 0) goto L_0x0114
            com.yandex.mobile.ads.impl.i90$a r9 = r0.f34776h
            java.lang.String r14 = r0.f34769a
            byte[] r15 = r9.f34789d
            int r10 = r9.f34787b
            byte[] r10 = java.util.Arrays.copyOf(r15, r10)
            r11 = 4
            byte r15 = r10[r11]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r26 = 5
            byte r12 = r10[r26]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r16 = 6
            byte r13 = r10[r16]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r11
            int r16 = r12 >> 4
            r19 = r15 | r16
            r12 = r12 & 15
            int r12 = r12 << 8
            r20 = r12 | r13
            r13 = 7
            byte r15 = r10[r13]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r11
            r12 = 2
            if (r15 == r12) goto L_0x00a3
            r12 = 3
            if (r15 == r12) goto L_0x009d
            if (r15 == r11) goto L_0x0097
            r24 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ac
        L_0x0097:
            int r11 = r20 * 121
            float r11 = (float) r11
            int r12 = r19 * 100
            goto L_0x00a8
        L_0x009d:
            int r11 = r20 * 16
            float r11 = (float) r11
            int r12 = r19 * 9
            goto L_0x00a8
        L_0x00a3:
            int r11 = r20 * 4
            float r11 = (float) r11
            int r12 = r19 * 3
        L_0x00a8:
            float r12 = (float) r12
            float r11 = r11 / r12
            r24 = r11
        L_0x00ac:
            java.util.List r22 = java.util.Collections.singletonList(r10)
            r16 = 0
            r17 = -1
            r18 = -1
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            r23 = -1
            r25 = 0
            java.lang.String r15 = "video/mpeg2"
            com.yandex.mobile.ads.exo.Format r11 = com.yandex.mobile.ads.exo.Format.m31680a((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (int) r18, (int) r19, (int) r20, (float) r21, (java.util.List<byte[]>) r22, (int) r23, (float) r24, (com.yandex.mobile.ads.exo.drm.DrmInitData) r25)
            byte r12 = r10[r13]
            r12 = r12 & 15
            r13 = 1
            int r12 = r12 - r13
            if (r12 < 0) goto L_0x00f4
            double[] r13 = f34768q
            int r14 = r13.length
            if (r12 >= r14) goto L_0x00f4
            r12 = r13[r12]
            int r9 = r9.f34788c
            int r9 = r9 + 9
            byte r14 = r10[r9]
            r14 = r14 & 96
            int r14 = r14 >> 5
            byte r9 = r10[r9]
            r9 = r9 & 31
            if (r14 == r9) goto L_0x00ec
            double r14 = (double) r14
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 + r16
            int r9 = r9 + 1
            double r9 = (double) r9
            double r14 = r14 / r9
            double r12 = r12 * r14
        L_0x00ec:
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r9 = r9 / r12
            long r9 = (long) r9
            goto L_0x00f6
        L_0x00f4:
            r9 = 0
        L_0x00f6:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r11, r9)
            com.yandex.mobile.ads.impl.ke1 r10 = r0.f34770b
            java.lang.Object r11 = r9.first
            com.yandex.mobile.ads.exo.Format r11 = (com.yandex.mobile.ads.exo.Format) r11
            r10.mo65339a(r11)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r0.f34772d = r9
            r9 = 1
            r0.f34771c = r9
        L_0x0114:
            com.yandex.mobile.ads.impl.hh1 r9 = r0.f34773e
            if (r9 == 0) goto L_0x0158
            if (r8 <= 0) goto L_0x0121
            com.yandex.mobile.ads.impl.mq0 r8 = r0.f34777i
            r8.mo68847a(r4, r2, r5)
            r2 = 0
            goto L_0x0122
        L_0x0121:
            int r2 = -r8
        L_0x0122:
            com.yandex.mobile.ads.impl.mq0 r8 = r0.f34777i
            boolean r2 = r8.mo68849a(r2)
            if (r2 == 0) goto L_0x0146
            com.yandex.mobile.ads.impl.mq0 r2 = r0.f34777i
            byte[] r8 = r2.f37485d
            int r2 = r2.f37486e
            int r2 = com.yandex.mobile.ads.impl.nq0.m40145a(r8, r2)
            com.yandex.mobile.ads.impl.fy0 r8 = r0.f34774f
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f34777i
            byte[] r9 = r9.f37485d
            r8.mo67103a((byte[]) r9, (int) r2)
            com.yandex.mobile.ads.impl.hh1 r2 = r0.f34773e
            long r8 = r0.f34782n
            com.yandex.mobile.ads.impl.fy0 r10 = r0.f34774f
            r2.mo67556a((long) r8, (com.yandex.mobile.ads.impl.fy0) r10)
        L_0x0146:
            r2 = 178(0xb2, float:2.5E-43)
            if (r6 != r2) goto L_0x0158
            byte[] r2 = r1.f33778a
            int r8 = r5 + 2
            byte r2 = r2[r8]
            r8 = 1
            if (r2 != r8) goto L_0x0158
            com.yandex.mobile.ads.impl.mq0 r2 = r0.f34777i
            r2.mo68851b(r6)
        L_0x0158:
            if (r6 == 0) goto L_0x0167
            r2 = 179(0xb3, float:2.51E-43)
            if (r6 != r2) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            r2 = 184(0xb8, float:2.58E-43)
            if (r6 != r2) goto L_0x01c1
            r2 = 1
            r0.f34783o = r2
            goto L_0x01c1
        L_0x0167:
            int r2 = r3 - r5
            boolean r5 = r0.f34779k
            if (r5 == 0) goto L_0x0188
            boolean r5 = r0.f34784p
            if (r5 == 0) goto L_0x0188
            boolean r5 = r0.f34771c
            if (r5 == 0) goto L_0x0188
            boolean r11 = r0.f34783o
            long r8 = r0.f34778j
            long r12 = r0.f34781m
            long r8 = r8 - r12
            int r5 = (int) r8
            int r12 = r5 - r2
            com.yandex.mobile.ads.impl.ke1 r8 = r0.f34770b
            long r9 = r0.f34782n
            r14 = 0
            r13 = r2
            r8.mo65337a(r9, r11, r12, r13, r14)
        L_0x0188:
            boolean r5 = r0.f34779k
            if (r5 == 0) goto L_0x0194
            boolean r8 = r0.f34784p
            if (r8 == 0) goto L_0x0191
            goto L_0x0194
        L_0x0191:
            r2 = 0
            r5 = 1
            goto L_0x01ba
        L_0x0194:
            long r8 = r0.f34778j
            long r10 = (long) r2
            long r8 = r8 - r10
            r0.f34781m = r8
            long r8 = r0.f34780l
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x01a6
            goto L_0x01b0
        L_0x01a6:
            if (r5 == 0) goto L_0x01ae
            long r8 = r0.f34782n
            long r12 = r0.f34772d
            long r8 = r8 + r12
            goto L_0x01b0
        L_0x01ae:
            r8 = 0
        L_0x01b0:
            r0.f34782n = r8
            r2 = 0
            r0.f34783o = r2
            r0.f34780l = r10
            r5 = 1
            r0.f34779k = r5
        L_0x01ba:
            if (r6 != 0) goto L_0x01be
            r12 = 1
            goto L_0x01bf
        L_0x01be:
            r12 = 0
        L_0x01bf:
            r0.f34784p = r12
        L_0x01c1:
            r2 = r7
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.i90.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }
}
