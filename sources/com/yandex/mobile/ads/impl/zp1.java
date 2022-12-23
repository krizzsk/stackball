package com.yandex.mobile.ads.impl;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import java.io.IOException;
import java.util.List;

public final class zp1 implements w50 {

    /* renamed from: a */
    private x50 f43251a;

    /* renamed from: b */
    private ke1 f43252b;

    /* renamed from: c */
    private C15338b f43253c;

    /* renamed from: d */
    private int f43254d = -1;

    /* renamed from: e */
    private long f43255e = -1;

    /* renamed from: com.yandex.mobile.ads.impl.zp1$b */
    private interface C15338b {
        /* renamed from: a */
        void mo71271a(int i, long j) throws jy0;

        /* renamed from: a */
        void mo71272a(long j);

        /* renamed from: a */
        boolean mo71273a(C13416ik ikVar, long j) throws IOException, InterruptedException;
    }

    static {
        $$Lambda$zp1$OMN9ti_9Xa4bEVXkU1TDdrfP_Q r0 = $$Lambda$zp1$OMN9ti_9Xa4bEVXkU1TDdrfP_Q.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ w50[] m44738a() {
        return new w50[]{new zp1()};
    }

    public void release() {
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        return bq1.m34307a(ikVar) != null;
    }

    /* renamed from: com.yandex.mobile.ads.impl.zp1$c */
    private static final class C15339c implements C15338b {

        /* renamed from: a */
        private final x50 f43270a;

        /* renamed from: b */
        private final ke1 f43271b;

        /* renamed from: c */
        private final aq1 f43272c;

        /* renamed from: d */
        private final Format f43273d;

        /* renamed from: e */
        private final int f43274e;

        /* renamed from: f */
        private long f43275f;

        /* renamed from: g */
        private int f43276g;

        /* renamed from: h */
        private long f43277h;

        public C15339c(x50 x50, ke1 ke1, aq1 aq1, String str, int i) throws jy0 {
            aq1 aq12 = aq1;
            this.f43270a = x50;
            this.f43271b = ke1;
            this.f43272c = aq12;
            int i2 = (aq12.f30660b * aq12.f30663e) / 8;
            if (aq12.f30662d == i2) {
                int max = Math.max(i2, (aq12.f30661c * i2) / 10);
                this.f43274e = max;
                int i3 = aq12.f30661c;
                this.f43273d = Format.m31683a((String) null, str, (String) null, i2 * i3 * 8, max, aq12.f30660b, i3, i, (List<byte[]>) null, (DrmInitData) null, 0, (String) null);
                return;
            }
            throw new jy0("Expected block size: " + i2 + "; got: " + aq12.f30662d);
        }

        /* renamed from: a */
        public void mo71272a(long j) {
            this.f43275f = j;
            this.f43276g = 0;
            this.f43277h = 0;
        }

        /* renamed from: a */
        public void mo71271a(int i, long j) {
            this.f43270a.mo65309a(new cq1(this.f43272c, 1, (long) i, j));
            this.f43271b.mo65339a(this.f43273d);
        }

        /* renamed from: a */
        public boolean mo71273a(C13416ik ikVar, long j) throws IOException, InterruptedException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f43276g) >= (i3 = this.f43274e)) {
                    aq1 aq1 = this.f43272c;
                    int i4 = aq1.f30662d;
                    int i5 = this.f43276g / i4;
                } else {
                    int a = this.f43271b.mo65335a(ikVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (a == -1) {
                        j2 = 0;
                    } else {
                        this.f43276g += a;
                        j2 -= (long) a;
                    }
                }
            }
            aq1 aq12 = this.f43272c;
            int i42 = aq12.f30662d;
            int i52 = this.f43276g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f43276g - i6;
                this.f43271b.mo65337a(this.f43275f + ih1.m37369a(this.f43277h, 1000000, (long) aq12.f30661c), 1, i6, i7, (ke1.C13702a) null);
                this.f43277h += (long) i52;
                this.f43276g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f43251a = x50;
        this.f43252b = x50.mo65304a(0, 1);
        x50.mo65311c();
    }

    /* renamed from: com.yandex.mobile.ads.impl.zp1$a */
    private static final class C15337a implements C15338b {

        /* renamed from: m */
        private static final int[] f43256m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f43257n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, ErrorCode.CONDITIONAL_AD_REJECTED_ERROR, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final x50 f43258a;

        /* renamed from: b */
        private final ke1 f43259b;

        /* renamed from: c */
        private final aq1 f43260c;

        /* renamed from: d */
        private final int f43261d;

        /* renamed from: e */
        private final byte[] f43262e;

        /* renamed from: f */
        private final fy0 f43263f;

        /* renamed from: g */
        private final int f43264g;

        /* renamed from: h */
        private final Format f43265h;

        /* renamed from: i */
        private int f43266i;

        /* renamed from: j */
        private long f43267j;

        /* renamed from: k */
        private int f43268k;

        /* renamed from: l */
        private long f43269l;

        public C15337a(x50 x50, ke1 ke1, aq1 aq1) throws jy0 {
            aq1 aq12 = aq1;
            this.f43258a = x50;
            this.f43259b = ke1;
            this.f43260c = aq12;
            int max = Math.max(1, aq12.f30661c / 10);
            this.f43264g = max;
            fy0 fy0 = new fy0(aq12.f30664f);
            fy0.mo67121m();
            int m = fy0.mo67121m();
            this.f43261d = m;
            int i = aq12.f30660b;
            int i2 = (((aq12.f30662d - (i * 4)) * 8) / (aq12.f30663e * i)) + 1;
            if (m == i2) {
                int a = ih1.m37366a(max, m);
                this.f43262e = new byte[(aq12.f30662d * a)];
                this.f43263f = new fy0(a * m44744a(m, i));
                this.f43265h = Format.m31683a((String) null, "audio/raw", (String) null, ((aq12.f30661c * aq12.f30662d) * 8) / m, m44744a(max, i), aq12.f30660b, aq12.f30661c, 2, (List<byte[]>) null, (DrmInitData) null, 0, (String) null);
                return;
            }
            throw new jy0("Expected frames per block: " + i2 + "; got: " + m);
        }

        /* renamed from: a */
        private static int m44744a(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: b */
        private void m44745b(int i) {
            long a = this.f43267j + ih1.m37369a(this.f43269l, 1000000, (long) this.f43260c.f30661c);
            int a2 = m44744a(i, this.f43260c.f30660b);
            this.f43259b.mo65337a(a, 1, a2, this.f43268k - a2, (ke1.C13702a) null);
            this.f43269l += (long) i;
            this.f43268k -= a2;
        }

        /* renamed from: a */
        public void mo71272a(long j) {
            this.f43266i = 0;
            this.f43267j = j;
            this.f43268k = 0;
            this.f43269l = 0;
        }

        /* renamed from: a */
        public void mo71271a(int i, long j) {
            this.f43258a.mo65309a(new cq1(this.f43260c, this.f43261d, (long) i, j));
            this.f43259b.mo65339a(this.f43265h);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0049 A[EDGE_INSN: B:40:0x0049->B:11:0x0049 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x002a  */
        /* renamed from: a */
        public boolean mo71273a(com.yandex.mobile.ads.impl.C13416ik r19, long r20) throws java.io.IOException, java.lang.InterruptedException {
            /*
                r18 = this;
                r0 = r18
                int r1 = r0.f43264g
                int r2 = r0.f43268k
                int r2 = r0.m44743a((int) r2)
                int r1 = r1 - r2
                int r2 = r0.f43261d
                int r1 = com.yandex.mobile.ads.impl.ih1.m37366a((int) r1, (int) r2)
                com.yandex.mobile.ads.impl.aq1 r2 = r0.f43260c
                int r2 = r2.f30662d
                int r1 = r1 * r2
                r4 = 0
                int r6 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
                r4 = r20
                r8 = r0
                if (r6 != 0) goto L_0x0024
                r6 = r1
                r1 = r19
                goto L_0x0041
            L_0x0024:
                r6 = r1
                r7 = 0
                r1 = r19
            L_0x0028:
                if (r7 != 0) goto L_0x0049
                int r9 = r8.f43266i
                if (r9 >= r6) goto L_0x0049
                int r9 = r6 - r9
                long r9 = (long) r9
                long r9 = java.lang.Math.min(r9, r4)
                int r10 = (int) r9
                byte[] r9 = r8.f43262e
                int r11 = r8.f43266i
                int r9 = r1.mo67807b(r9, r11, r10)
                r10 = -1
                if (r9 != r10) goto L_0x0043
            L_0x0041:
                r7 = 1
                goto L_0x0028
            L_0x0043:
                int r10 = r8.f43266i
                int r10 = r10 + r9
                r8.f43266i = r10
                goto L_0x0028
            L_0x0049:
                int r1 = r8.f43266i
                com.yandex.mobile.ads.impl.aq1 r4 = r8.f43260c
                int r4 = r4.f30662d
                int r1 = r1 / r4
                if (r1 <= 0) goto L_0x0162
                byte[] r4 = r8.f43262e
                com.yandex.mobile.ads.impl.fy0 r5 = r8.f43263f
                r6 = 0
            L_0x0057:
                if (r6 >= r1) goto L_0x0128
                r9 = 0
            L_0x005a:
                com.yandex.mobile.ads.impl.aq1 r10 = r8.f43260c
                int r11 = r10.f30660b
                if (r9 >= r11) goto L_0x011e
                byte[] r12 = r5.f33778a
                int r10 = r10.f30662d
                int r13 = r6 * r10
                int r14 = r9 * 4
                int r13 = r13 + r14
                int r14 = r11 * 4
                int r14 = r14 + r13
                int r10 = r10 / r11
                int r10 = r10 + -4
                int r15 = r13 + 1
                byte r15 = r4[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 8
                byte r2 = r4[r13]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r2 = r2 | r15
                short r2 = (short) r2
                int r13 = r13 + 2
                byte r13 = r4[r13]
                r13 = r13 & 255(0xff, float:3.57E-43)
                r15 = 88
                int r13 = java.lang.Math.min(r13, r15)
                int[] r15 = f43257n
                r15 = r15[r13]
                int r3 = r8.f43261d
                int r3 = r3 * r6
                int r3 = r3 * r11
                int r3 = r3 + r9
                int r3 = r3 * 2
                r0 = r2 & 255(0xff, float:3.57E-43)
                byte r0 = (byte) r0
                r12[r3] = r0
                int r0 = r3 + 1
                r19 = r3
                int r3 = r2 >> 8
                byte r3 = (byte) r3
                r12[r0] = r3
                r3 = r19
                r19 = r7
                r0 = 0
            L_0x00a9:
                int r7 = r10 * 2
                if (r0 >= r7) goto L_0x0114
                int r7 = r0 / 8
                int r17 = r0 / 2
                int r17 = r17 % 4
                int r7 = r7 * r11
                int r7 = r7 * 4
                int r7 = r7 + r14
                int r7 = r7 + r17
                byte r7 = r4[r7]
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r17 = r0 % 2
                if (r17 != 0) goto L_0x00c5
                r7 = r7 & 15
                goto L_0x00c7
            L_0x00c5:
                int r7 = r7 >> 4
            L_0x00c7:
                r17 = r7 & 7
                int r17 = r17 * 2
                r16 = 1
                int r17 = r17 + 1
                int r17 = r17 * r15
                int r15 = r17 >> 3
                r17 = r7 & 8
                if (r17 == 0) goto L_0x00d8
                int r15 = -r15
            L_0x00d8:
                int r2 = r2 + r15
                int r15 = com.yandex.mobile.ads.impl.ih1.f34858a
                r15 = 32767(0x7fff, float:4.5916E-41)
                int r2 = java.lang.Math.min(r2, r15)
                r15 = -32768(0xffffffffffff8000, float:NaN)
                int r2 = java.lang.Math.max(r15, r2)
                int r15 = r11 * 2
                int r3 = r3 + r15
                r15 = r2 & 255(0xff, float:3.57E-43)
                byte r15 = (byte) r15
                r12[r3] = r15
                int r15 = r3 + 1
                r20 = r3
                int r3 = r2 >> 8
                byte r3 = (byte) r3
                r12[r15] = r3
                int[] r3 = f43256m
                r3 = r3[r7]
                int r13 = r13 + r3
                int[] r3 = f43257n
                int r7 = r3.length
                r15 = 1
                int r7 = r7 - r15
                int r7 = java.lang.Math.min(r13, r7)
                r13 = 0
                int r7 = java.lang.Math.max(r13, r7)
                r3 = r3[r7]
                int r0 = r0 + 1
                r15 = r3
                r13 = r7
                r3 = r20
                goto L_0x00a9
            L_0x0114:
                r13 = 0
                r15 = 1
                int r9 = r9 + 1
                r0 = r18
                r7 = r19
                goto L_0x005a
            L_0x011e:
                r19 = r7
                r13 = 0
                r15 = 1
                int r6 = r6 + 1
                r0 = r18
                goto L_0x0057
            L_0x0128:
                r19 = r7
                int r0 = r8.f43261d
                int r0 = r0 * r1
                com.yandex.mobile.ads.impl.aq1 r2 = r8.f43260c
                int r2 = r2.f30660b
                int r0 = m44744a((int) r0, (int) r2)
                r5.mo67108c(r0)
                int r0 = r8.f43266i
                com.yandex.mobile.ads.impl.aq1 r2 = r8.f43260c
                int r2 = r2.f30662d
                int r1 = r1 * r2
                int r0 = r0 - r1
                r8.f43266i = r0
                com.yandex.mobile.ads.impl.fy0 r0 = r8.f43263f
                int r0 = r0.mo67107c()
                com.yandex.mobile.ads.impl.ke1 r1 = r8.f43259b
                com.yandex.mobile.ads.impl.fy0 r2 = r8.f43263f
                r1.mo65341a(r2, r0)
                int r1 = r8.f43268k
                int r1 = r1 + r0
                r8.f43268k = r1
                int r0 = r8.m44743a((int) r1)
                int r1 = r8.f43264g
                if (r0 < r1) goto L_0x0164
                r8.m44745b(r1)
                goto L_0x0164
            L_0x0162:
                r19 = r7
            L_0x0164:
                if (r19 == 0) goto L_0x0171
                int r0 = r8.f43268k
                int r0 = r8.m44743a((int) r0)
                if (r0 <= 0) goto L_0x0171
                r8.m44745b(r0)
            L_0x0171:
                return r19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zp1.C15337a.mo71273a(com.yandex.mobile.ads.impl.ik, long):boolean");
        }

        /* renamed from: a */
        private int m44743a(int i) {
            return i / (this.f43260c.f30660b * 2);
        }
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        C15338b bVar = this.f43253c;
        if (bVar != null) {
            bVar.mo71272a(j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r15 != 65534) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64888a(com.yandex.mobile.ads.impl.C13416ik r14, com.yandex.mobile.ads.impl.r01 r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            com.yandex.mobile.ads.impl.ke1 r15 = r13.f43252b
            com.yandex.mobile.ads.impl.C13479j9.m37707b(r15)
            int r15 = com.yandex.mobile.ads.impl.ih1.f34858a
            com.yandex.mobile.ads.impl.zp1$b r15 = r13.f43253c
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x0099
            com.yandex.mobile.ads.impl.aq1 r5 = com.yandex.mobile.ads.impl.bq1.m34307a(r14)
            if (r5 == 0) goto L_0x0091
            int r15 = r5.f30659a
            r2 = 17
            if (r15 != r2) goto L_0x0026
            com.yandex.mobile.ads.impl.zp1$a r15 = new com.yandex.mobile.ads.impl.zp1$a
            com.yandex.mobile.ads.impl.x50 r2 = r13.f43251a
            com.yandex.mobile.ads.impl.ke1 r3 = r13.f43252b
            r15.<init>(r2, r3, r5)
            r13.f43253c = r15
            goto L_0x0099
        L_0x0026:
            r2 = 6
            if (r15 != r2) goto L_0x0039
            com.yandex.mobile.ads.impl.zp1$c r15 = new com.yandex.mobile.ads.impl.zp1$c
            com.yandex.mobile.ads.impl.x50 r3 = r13.f43251a
            com.yandex.mobile.ads.impl.ke1 r4 = r13.f43252b
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f43253c = r15
            goto L_0x0099
        L_0x0039:
            r2 = 7
            if (r15 != r2) goto L_0x004c
            com.yandex.mobile.ads.impl.zp1$c r15 = new com.yandex.mobile.ads.impl.zp1$c
            com.yandex.mobile.ads.impl.x50 r3 = r13.f43251a
            com.yandex.mobile.ads.impl.ke1 r4 = r13.f43252b
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f43253c = r15
            goto L_0x0099
        L_0x004c:
            int r2 = r5.f30663e
            if (r15 == r0) goto L_0x0062
            r3 = 3
            if (r15 == r3) goto L_0x0059
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r15 == r3) goto L_0x0062
            goto L_0x0060
        L_0x0059:
            r15 = 32
            if (r2 != r15) goto L_0x0060
            r15 = 4
            r7 = 4
            goto L_0x0067
        L_0x0060:
            r7 = 0
            goto L_0x0067
        L_0x0062:
            int r15 = com.yandex.mobile.ads.impl.ih1.m37365a((int) r2)
            r7 = r15
        L_0x0067:
            if (r7 == 0) goto L_0x0078
            com.yandex.mobile.ads.impl.zp1$c r15 = new com.yandex.mobile.ads.impl.zp1$c
            com.yandex.mobile.ads.impl.x50 r3 = r13.f43251a
            com.yandex.mobile.ads.impl.ke1 r4 = r13.f43252b
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f43253c = r15
            goto L_0x0099
        L_0x0078:
            com.yandex.mobile.ads.impl.jy0 r14 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Unsupported WAV format type: "
            r15.append(r0)
            int r0 = r5.f30659a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x0091:
            com.yandex.mobile.ads.impl.jy0 r14 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            r14.<init>(r15)
            throw r14
        L_0x0099:
            int r15 = r13.f43254d
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x0169
            r14.getClass()
            r14.mo67812d()
            com.yandex.mobile.ads.impl.fy0 r15 = new com.yandex.mobile.ads.impl.fy0
            r5 = 8
            r15.<init>((int) r5)
            com.yandex.mobile.ads.impl.bq1$a r6 = com.yandex.mobile.ads.impl.bq1.C12605a.m34308a(r14, r15)
        L_0x00b1:
            int r7 = r6.f31399a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r8) goto L_0x010e
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r8) goto L_0x00da
            r10 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r10) goto L_0x00da
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Ignoring unknown WAV chunk: "
            r7.append(r10)
            int r10 = r6.f31399a
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r9, r7)
        L_0x00da:
            long r9 = r6.f31400b
            r11 = 8
            long r9 = r9 + r11
            int r7 = r6.f31399a
            if (r7 != r8) goto L_0x00e5
            r9 = 12
        L_0x00e5:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00f5
            int r6 = (int) r9
            r14.mo67813d(r6)
            com.yandex.mobile.ads.impl.bq1$a r6 = com.yandex.mobile.ads.impl.bq1.C12605a.m34308a(r14, r15)
            goto L_0x00b1
        L_0x00f5:
            com.yandex.mobile.ads.impl.jy0 r14 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Chunk is too large (~2GB+) to skip; id: "
            r15.append(r0)
            int r0 = r6.f31399a
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x010e:
            r14.mo67813d(r5)
            long r7 = r14.mo67811c()
            long r5 = r6.f31400b
            long r5 = r5 + r7
            long r10 = r14.mo67804a()
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0141
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0141
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "Data exceeds input length: "
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = ", "
            r15.append(r5)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r9, r15)
            r5 = r10
        L_0x0141:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            android.util.Pair r15 = android.util.Pair.create(r15, r5)
            java.lang.Object r5 = r15.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r13.f43254d = r5
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r5 = r15.longValue()
            r13.f43255e = r5
            com.yandex.mobile.ads.impl.zp1$b r15 = r13.f43253c
            int r7 = r13.f43254d
            r15.mo71271a((int) r7, (long) r5)
            goto L_0x0178
        L_0x0169:
            long r5 = r14.mo67811c()
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x0178
            int r15 = r13.f43254d
            r14.mo67813d(r15)
        L_0x0178:
            long r5 = r13.f43255e
            int r15 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r0 = 0
        L_0x0180:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            long r2 = r13.f43255e
            long r5 = r14.mo67811c()
            long r2 = r2 - r5
            com.yandex.mobile.ads.impl.zp1$b r15 = r13.f43253c
            boolean r14 = r15.mo71273a((com.yandex.mobile.ads.impl.C13416ik) r14, (long) r2)
            if (r14 == 0) goto L_0x0193
            r1 = -1
        L_0x0193:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zp1.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }
}
