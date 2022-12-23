package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.tf1;

public final class k90 implements a30 {

    /* renamed from: a */
    private final w71 f36030a;

    /* renamed from: b */
    private String f36031b;

    /* renamed from: c */
    private ke1 f36032c;

    /* renamed from: d */
    private C13691a f36033d;

    /* renamed from: e */
    private boolean f36034e;

    /* renamed from: f */
    private final boolean[] f36035f = new boolean[3];

    /* renamed from: g */
    private final mq0 f36036g = new mq0(32, 128);

    /* renamed from: h */
    private final mq0 f36037h = new mq0(33, 128);

    /* renamed from: i */
    private final mq0 f36038i = new mq0(34, 128);

    /* renamed from: j */
    private final mq0 f36039j = new mq0(39, 128);

    /* renamed from: k */
    private final mq0 f36040k = new mq0(40, 128);

    /* renamed from: l */
    private long f36041l;

    /* renamed from: m */
    private long f36042m;

    /* renamed from: n */
    private final fy0 f36043n = new fy0();

    public k90(w71 w71) {
        this.f36030a = w71;
    }

    /* renamed from: a */
    public void mo65661a() {
        nq0.m40148a(this.f36035f);
        this.f36036g.mo68850b();
        this.f36037h.mo68850b();
        this.f36038i.mo68850b();
        this.f36039j.mo68850b();
        this.f36040k.mo68850b();
        this.f36033d.mo68174a();
        this.f36041l = 0;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.k90$a */
    private static final class C13691a {

        /* renamed from: a */
        private final ke1 f36044a;

        /* renamed from: b */
        private long f36045b;

        /* renamed from: c */
        private boolean f36046c;

        /* renamed from: d */
        private int f36047d;

        /* renamed from: e */
        private long f36048e;

        /* renamed from: f */
        private boolean f36049f;

        /* renamed from: g */
        private boolean f36050g;

        /* renamed from: h */
        private boolean f36051h;

        /* renamed from: i */
        private boolean f36052i;

        /* renamed from: j */
        private boolean f36053j;

        /* renamed from: k */
        private long f36054k;

        /* renamed from: l */
        private long f36055l;

        /* renamed from: m */
        private boolean f36056m;

        public C13691a(ke1 ke1) {
            this.f36044a = ke1;
        }

        /* renamed from: a */
        public void mo68174a() {
            this.f36049f = false;
            this.f36050g = false;
            this.f36051h = false;
            this.f36052i = false;
            this.f36053j = false;
        }

        /* renamed from: a */
        public void mo68175a(long j, int i, int i2, long j2, boolean z) {
            long j3 = j;
            int i3 = i2;
            boolean z2 = false;
            this.f36050g = false;
            this.f36051h = false;
            this.f36048e = j2;
            this.f36047d = 0;
            this.f36045b = j3;
            if (!(i3 < 32 || i3 == 40)) {
                if (this.f36052i && !this.f36053j) {
                    if (z) {
                        this.f36044a.mo65337a(this.f36055l, this.f36056m ? 1 : 0, (int) (j3 - this.f36054k), i, (ke1.C13702a) null);
                    }
                    this.f36052i = false;
                }
                if ((32 <= i3 && i3 <= 35) || i3 == 39) {
                    this.f36051h = !this.f36053j;
                    this.f36053j = true;
                }
            }
            boolean z3 = i3 >= 16 && i3 <= 21;
            this.f36046c = z3;
            if (z3 || i3 <= 9) {
                z2 = true;
            }
            this.f36049f = z2;
        }

        /* renamed from: a */
        public void mo68177a(byte[] bArr, int i, int i2) {
            if (this.f36049f) {
                int i3 = this.f36047d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.f36050g = (bArr[i4] & 128) != 0;
                    this.f36049f = false;
                    return;
                }
                this.f36047d = i3 + (i2 - i);
            }
        }

        /* renamed from: a */
        public void mo68176a(long j, int i, boolean z) {
            if (this.f36053j && this.f36050g) {
                this.f36056m = this.f36046c;
                this.f36053j = false;
            } else if (this.f36051h || this.f36050g) {
                if (z && this.f36052i) {
                    long j2 = this.f36045b;
                    boolean z2 = this.f36056m;
                    int i2 = (int) (j2 - this.f36054k);
                    this.f36044a.mo65337a(this.f36055l, z2 ? 1 : 0, i2, i + ((int) (j - j2)), (ke1.C13702a) null);
                }
                this.f36054k = this.f36045b;
                this.f36055l = this.f36048e;
                this.f36056m = this.f36046c;
                this.f36052i = true;
            }
        }
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f36031b = dVar.mo70178b();
        ke1 a = x50.mo65304a(dVar.mo70179c(), 2);
        this.f36032c = a;
        this.f36033d = new C13691a(a);
        this.f36030a.mo70658a(x50, dVar);
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f36042m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0336  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r33) {
        /*
            r32 = this;
            r0 = r32
        L_0x0002:
            r1 = r33
            int r2 = r33.mo67098a()
            if (r2 <= 0) goto L_0x034c
            int r2 = r33.mo67105b()
            int r3 = r33.mo67107c()
            byte[] r4 = r1.f33778a
            long r5 = r0.f36041l
            int r7 = r33.mo67098a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f36041l = r5
            com.yandex.mobile.ads.impl.ke1 r5 = r0.f36032c
            int r6 = r33.mo67098a()
            r5.mo65341a(r1, r6)
        L_0x0027:
            if (r2 >= r3) goto L_0x0002
            boolean[] r5 = r0.f36035f
            int r5 = com.yandex.mobile.ads.impl.nq0.m40146a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0035
            r0.m38249a(r4, r2, r3)
            return
        L_0x0035:
            int r6 = r5 + 3
            byte r7 = r4[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r5 - r2
            if (r9 <= 0) goto L_0x0044
            r0.m38249a(r4, r2, r5)
        L_0x0044:
            int r12 = r3 - r5
            long r10 = r0.f36041l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x004e
            int r5 = -r9
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            long r13 = r0.f36042m
            com.yandex.mobile.ads.impl.k90$a r9 = r0.f36033d
            boolean r15 = r0.f36034e
            r9.mo68176a((long) r10, (int) r12, (boolean) r15)
            boolean r9 = r0.f36034e
            if (r9 != 0) goto L_0x02b8
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f36036g
            r9.mo68849a(r5)
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f36037h
            r9.mo68849a(r5)
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f36038i
            r9.mo68849a(r5)
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f36036g
            boolean r9 = r9.mo68848a()
            if (r9 == 0) goto L_0x02b8
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f36037h
            boolean r9 = r9.mo68848a()
            if (r9 == 0) goto L_0x02b8
            com.yandex.mobile.ads.impl.mq0 r9 = r0.f36038i
            boolean r9 = r9.mo68848a()
            if (r9 == 0) goto L_0x02b8
            com.yandex.mobile.ads.impl.ke1 r9 = r0.f36032c
            java.lang.String r15 = r0.f36031b
            com.yandex.mobile.ads.impl.mq0 r8 = r0.f36036g
            com.yandex.mobile.ads.impl.mq0 r2 = r0.f36037h
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36038i
            r27 = r3
            int r3 = r8.f37486e
            r28 = r4
            int r4 = r2.f37486e
            int r4 = r4 + r3
            r29 = r6
            int r6 = r1.f37486e
            int r4 = r4 + r6
            byte[] r4 = new byte[r4]
            byte[] r6 = r8.f37485d
            r30 = r7
            r7 = 0
            java.lang.System.arraycopy(r6, r7, r4, r7, r3)
            byte[] r3 = r2.f37485d
            int r6 = r8.f37486e
            r31 = r12
            int r12 = r2.f37486e
            java.lang.System.arraycopy(r3, r7, r4, r6, r12)
            byte[] r3 = r1.f37485d
            int r6 = r8.f37486e
            int r8 = r2.f37486e
            int r6 = r6 + r8
            int r1 = r1.f37486e
            java.lang.System.arraycopy(r3, r7, r4, r6, r1)
            com.yandex.mobile.ads.impl.gy0 r1 = new com.yandex.mobile.ads.impl.gy0
            byte[] r3 = r2.f37485d
            int r2 = r2.f37486e
            r1.<init>(r3, r7, r2)
            r2 = 44
            r1.mo67370d(r2)
            r2 = 3
            int r3 = r1.mo67367b(r2)
            r1.mo67373g()
            r6 = 88
            r1.mo67370d(r6)
            r6 = 8
            r1.mo67370d(r6)
            r8 = 0
            r12 = 0
        L_0x00de:
            if (r8 >= r3) goto L_0x00f3
            boolean r16 = r1.mo67369c()
            if (r16 == 0) goto L_0x00e8
            int r12 = r12 + 89
        L_0x00e8:
            boolean r16 = r1.mo67369c()
            if (r16 == 0) goto L_0x00f0
            int r12 = r12 + 8
        L_0x00f0:
            int r8 = r8 + 1
            goto L_0x00de
        L_0x00f3:
            r1.mo67370d(r12)
            r8 = 2
            if (r3 <= 0) goto L_0x0100
            int r12 = 8 - r3
            int r12 = r12 * 2
            r1.mo67370d(r12)
        L_0x0100:
            r1.mo67372f()
            int r12 = r1.mo67372f()
            if (r12 != r2) goto L_0x010c
            r1.mo67373g()
        L_0x010c:
            int r16 = r1.mo67372f()
            int r17 = r1.mo67372f()
            boolean r18 = r1.mo67369c()
            if (r18 == 0) goto L_0x0146
            int r18 = r1.mo67372f()
            int r19 = r1.mo67372f()
            int r20 = r1.mo67372f()
            int r21 = r1.mo67372f()
            r7 = 1
            if (r12 == r7) goto L_0x0133
            if (r12 != r8) goto L_0x0130
            goto L_0x0133
        L_0x0130:
            r23 = 1
            goto L_0x0135
        L_0x0133:
            r23 = 2
        L_0x0135:
            if (r12 != r7) goto L_0x0139
            r7 = 2
            goto L_0x013a
        L_0x0139:
            r7 = 1
        L_0x013a:
            int r18 = r18 + r19
            int r23 = r23 * r18
            int r16 = r16 - r23
            int r20 = r20 + r21
            int r7 = r7 * r20
            int r17 = r17 - r7
        L_0x0146:
            r20 = r16
            r21 = r17
            r1.mo67372f()
            r1.mo67372f()
            int r7 = r1.mo67372f()
            boolean r12 = r1.mo67369c()
            if (r12 == 0) goto L_0x015c
            r12 = 0
            goto L_0x015d
        L_0x015c:
            r12 = r3
        L_0x015d:
            if (r12 > r3) goto L_0x016b
            r1.mo67372f()
            r1.mo67372f()
            r1.mo67372f()
            int r12 = r12 + 1
            goto L_0x015d
        L_0x016b:
            r1.mo67372f()
            r1.mo67372f()
            r1.mo67372f()
            r1.mo67372f()
            r1.mo67372f()
            r1.mo67372f()
            boolean r3 = r1.mo67369c()
            r12 = 4
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r1.mo67369c()
            if (r3 == 0) goto L_0x01c5
            r3 = 0
        L_0x018b:
            if (r3 >= r12) goto L_0x01c5
            r6 = 0
        L_0x018e:
            r8 = 6
            if (r6 >= r8) goto L_0x01be
            boolean r8 = r1.mo67369c()
            if (r8 != 0) goto L_0x019b
            r1.mo67372f()
            goto L_0x01b6
        L_0x019b:
            int r8 = r3 << 1
            int r8 = r8 + r12
            r12 = 1
            int r8 = r12 << r8
            r2 = 64
            int r2 = java.lang.Math.min(r2, r8)
            if (r3 <= r12) goto L_0x01ac
            r1.mo67371e()
        L_0x01ac:
            r8 = 0
        L_0x01ad:
            if (r8 >= r2) goto L_0x01b5
            r1.mo67371e()
            int r8 = r8 + 1
            goto L_0x01ad
        L_0x01b5:
            r2 = 3
        L_0x01b6:
            if (r3 != r2) goto L_0x01ba
            r8 = 3
            goto L_0x01bb
        L_0x01ba:
            r8 = 1
        L_0x01bb:
            int r6 = r6 + r8
            r12 = 4
            goto L_0x018e
        L_0x01be:
            int r3 = r3 + 1
            r6 = 8
            r8 = 2
            r12 = 4
            goto L_0x018b
        L_0x01c5:
            r2 = 2
            r1.mo67370d(r2)
            boolean r2 = r1.mo67369c()
            if (r2 == 0) goto L_0x01dd
            r2 = 8
            r1.mo67370d(r2)
            r1.mo67372f()
            r1.mo67372f()
            r1.mo67373g()
        L_0x01dd:
            int r2 = r1.mo67372f()
            r3 = 0
            r6 = 0
            r8 = 0
        L_0x01e4:
            if (r3 >= r2) goto L_0x0231
            if (r3 == 0) goto L_0x01ec
            boolean r6 = r1.mo67369c()
        L_0x01ec:
            if (r6 == 0) goto L_0x0206
            r1.mo67373g()
            r1.mo67372f()
            r12 = 0
        L_0x01f5:
            if (r12 > r8) goto L_0x0203
            boolean r19 = r1.mo67369c()
            if (r19 == 0) goto L_0x0200
            r1.mo67373g()
        L_0x0200:
            int r12 = r12 + 1
            goto L_0x01f5
        L_0x0203:
            r23 = r2
            goto L_0x022c
        L_0x0206:
            int r8 = r1.mo67372f()
            int r12 = r1.mo67372f()
            int r19 = r8 + r12
            r23 = r2
            r2 = 0
        L_0x0213:
            if (r2 >= r8) goto L_0x021e
            r1.mo67372f()
            r1.mo67373g()
            int r2 = r2 + 1
            goto L_0x0213
        L_0x021e:
            r2 = 0
        L_0x021f:
            if (r2 >= r12) goto L_0x022a
            r1.mo67372f()
            r1.mo67373g()
            int r2 = r2 + 1
            goto L_0x021f
        L_0x022a:
            r8 = r19
        L_0x022c:
            int r3 = r3 + 1
            r2 = r23
            goto L_0x01e4
        L_0x0231:
            boolean r2 = r1.mo67369c()
            if (r2 == 0) goto L_0x0249
            r2 = 0
        L_0x0238:
            int r3 = r1.mo67372f()
            if (r2 >= r3) goto L_0x0249
            r3 = 4
            int r12 = r7 + 4
            r6 = 1
            int r12 = r12 + r6
            r1.mo67370d(r12)
            int r2 = r2 + 1
            goto L_0x0238
        L_0x0249:
            r2 = 2
            r1.mo67370d(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r1.mo67369c()
            if (r3 == 0) goto L_0x0299
            boolean r3 = r1.mo67369c()
            if (r3 == 0) goto L_0x0299
            r3 = 8
            int r3 = r1.mo67367b(r3)
            r6 = 255(0xff, float:3.57E-43)
            if (r3 != r6) goto L_0x0279
            r3 = 16
            int r6 = r1.mo67367b(r3)
            int r1 = r1.mo67367b(r3)
            if (r6 == 0) goto L_0x0299
            if (r1 == 0) goto L_0x0299
            float r2 = (float) r6
            float r1 = (float) r1
            float r2 = r2 / r1
            r25 = r2
            goto L_0x029b
        L_0x0279:
            float[] r1 = com.yandex.mobile.ads.impl.nq0.f37880b
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0283
            r1 = r1[r3]
            r25 = r1
            goto L_0x029b
        L_0x0283:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unexpected aspect_ratio_idc value: "
            r1.append(r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "H265Reader"
            android.util.Log.w(r3, r1)
        L_0x0299:
            r25 = 1065353216(0x3f800000, float:1.0)
        L_0x029b:
            java.util.List r23 = java.util.Collections.singletonList(r4)
            r17 = 0
            r18 = -1
            r19 = -1
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r26 = 0
            java.lang.String r16 = "video/hevc"
            com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31680a((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (int) r19, (int) r20, (int) r21, (float) r22, (java.util.List<byte[]>) r23, (int) r24, (float) r25, (com.yandex.mobile.ads.exo.drm.DrmInitData) r26)
            r9.mo65339a(r1)
            r1 = 1
            r0.f36034e = r1
            goto L_0x02c2
        L_0x02b8:
            r27 = r3
            r28 = r4
            r29 = r6
            r30 = r7
            r31 = r12
        L_0x02c2:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36039j
            boolean r1 = r1.mo68849a(r5)
            r2 = 5
            if (r1 == 0) goto L_0x02ea
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36039j
            byte[] r3 = r1.f37485d
            int r1 = r1.f37486e
            int r1 = com.yandex.mobile.ads.impl.nq0.m40145a(r3, r1)
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f36043n
            com.yandex.mobile.ads.impl.mq0 r4 = r0.f36039j
            byte[] r4 = r4.f37485d
            r3.mo67103a((byte[]) r4, (int) r1)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f36043n
            r1.mo67114f(r2)
            com.yandex.mobile.ads.impl.w71 r1 = r0.f36030a
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f36043n
            r1.mo70657a((long) r13, (com.yandex.mobile.ads.impl.fy0) r3)
        L_0x02ea:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36040k
            boolean r1 = r1.mo68849a(r5)
            if (r1 == 0) goto L_0x0311
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36040k
            byte[] r3 = r1.f37485d
            int r1 = r1.f37486e
            int r1 = com.yandex.mobile.ads.impl.nq0.m40145a(r3, r1)
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f36043n
            com.yandex.mobile.ads.impl.mq0 r4 = r0.f36040k
            byte[] r4 = r4.f37485d
            r3.mo67103a((byte[]) r4, (int) r1)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f36043n
            r1.mo67114f(r2)
            com.yandex.mobile.ads.impl.w71 r1 = r0.f36030a
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f36043n
            r1.mo70657a((long) r13, (com.yandex.mobile.ads.impl.fy0) r2)
        L_0x0311:
            long r14 = r0.f36042m
            com.yandex.mobile.ads.impl.k90$a r9 = r0.f36033d
            boolean r1 = r0.f36034e
            r12 = r31
            r13 = r30
            r16 = r1
            r9.mo68175a(r10, r12, r13, r14, r16)
            boolean r1 = r0.f36034e
            if (r1 != 0) goto L_0x0336
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36036g
            r2 = r30
            r1.mo68851b(r2)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36037h
            r1.mo68851b(r2)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36038i
            r1.mo68851b(r2)
            goto L_0x0338
        L_0x0336:
            r2 = r30
        L_0x0338:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36039j
            r1.mo68851b(r2)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f36040k
            r1.mo68851b(r2)
            r1 = r33
            r3 = r27
            r4 = r28
            r2 = r29
            goto L_0x0027
        L_0x034c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k90.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }

    /* renamed from: a */
    private void m38249a(byte[] bArr, int i, int i2) {
        this.f36033d.mo68177a(bArr, i, i2);
        if (!this.f36034e) {
            this.f36036g.mo68847a(bArr, i, i2);
            this.f36037h.mo68847a(bArr, i, i2);
            this.f36038i.mo68847a(bArr, i, i2);
        }
        this.f36039j.mo68847a(bArr, i, i2);
        this.f36040k.mo68847a(bArr, i, i2);
    }
}
