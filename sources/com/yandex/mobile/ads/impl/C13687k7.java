package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.k7 */
public final class C13687k7 implements w50 {

    /* renamed from: o */
    private static final int[] f35980o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p */
    private static final int[] f35981p;

    /* renamed from: q */
    private static final byte[] f35982q = ih1.m37390b("#!AMR\n");

    /* renamed from: r */
    private static final byte[] f35983r = ih1.m37390b("#!AMR-WB\n");

    /* renamed from: s */
    private static final int f35984s;

    /* renamed from: a */
    private final byte[] f35985a = new byte[1];

    /* renamed from: b */
    private boolean f35986b;

    /* renamed from: c */
    private long f35987c;

    /* renamed from: d */
    private int f35988d;

    /* renamed from: e */
    private int f35989e;

    /* renamed from: f */
    private boolean f35990f;

    /* renamed from: g */
    private long f35991g;

    /* renamed from: h */
    private int f35992h = -1;

    /* renamed from: i */
    private int f35993i;

    /* renamed from: j */
    private long f35994j;

    /* renamed from: k */
    private x50 f35995k;

    /* renamed from: l */
    private ke1 f35996l;

    /* renamed from: m */
    private s71 f35997m;

    /* renamed from: n */
    private boolean f35998n;

    static {
        $$Lambda$k7$Sp8l3G21liAT6C9Uei_zmMjek4 r0 = $$Lambda$k7$Sp8l3G21liAT6C9Uei_zmMjek4.INSTANCE;
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f35981p = iArr;
        f35984s = iArr[8];
    }

    public C13687k7(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static w50[] m38214a() {
        return new w50[]{new C13687k7(0)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if ((!r0 && (r5 < 12 || r5 > 14)) != false) goto L_0x003b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m38215b(com.yandex.mobile.ads.impl.C13416ik r5) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r4 = this;
            r5.mo67812d()
            byte[] r0 = r4.f35985a
            r1 = 0
            r2 = 1
            r5.mo67806a(r0, r1, r2, r1)
            byte[] r5 = r4.f35985a
            byte r5 = r5[r1]
            r0 = r5 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L_0x0074
            int r5 = r5 >> 3
            r0 = 15
            r5 = r5 & r0
            if (r5 < 0) goto L_0x003c
            if (r5 > r0) goto L_0x003c
            boolean r0 = r4.f35986b
            if (r0 == 0) goto L_0x0029
            r3 = 10
            if (r5 < r3) goto L_0x0027
            r3 = 13
            if (r5 <= r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 != 0) goto L_0x003b
            if (r0 != 0) goto L_0x0038
            r0 = 12
            if (r5 < r0) goto L_0x0036
            r0 = 14
            if (r5 <= r0) goto L_0x0038
        L_0x0036:
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r1 != 0) goto L_0x0066
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal AMR "
            r1.append(r2)
            boolean r2 = r4.f35986b
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = "WB"
            goto L_0x0053
        L_0x0051:
            java.lang.String r2 = "NB"
        L_0x0053:
            r1.append(r2)
            java.lang.String r2 = " frame type "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0066:
            boolean r0 = r4.f35986b
            if (r0 == 0) goto L_0x006f
            int[] r0 = f35981p
            r5 = r0[r5]
            goto L_0x0073
        L_0x006f:
            int[] r0 = f35980o
            r5 = r0[r5]
        L_0x0073:
            return r5
        L_0x0074:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid padding bits for frame header "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13687k7.m38215b(com.yandex.mobile.ads.impl.ik):int");
    }

    /* renamed from: c */
    private boolean m38216c(C13416ik ikVar) throws IOException, InterruptedException {
        byte[] bArr = f35982q;
        ikVar.mo67812d();
        byte[] bArr2 = new byte[bArr.length];
        ikVar.mo67806a(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f35986b = false;
            ikVar.mo67813d(bArr.length);
            return true;
        }
        byte[] bArr3 = f35983r;
        ikVar.mo67812d();
        byte[] bArr4 = new byte[bArr3.length];
        ikVar.mo67806a(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f35986b = true;
        ikVar.mo67813d(bArr3.length);
        return true;
    }

    public void release() {
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        return m38216c(ikVar);
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f35995k = x50;
        this.f35996l = x50.mo65304a(0, 1);
        x50.mo65311c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64888a(com.yandex.mobile.ads.impl.C13416ik r19, com.yandex.mobile.ads.impl.r01 r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            long r1 = r19.mo67811c()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x001b
            boolean r1 = r18.m38216c(r19)
            if (r1 == 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Could not find AMR header."
            r1.<init>(r2)
            throw r1
        L_0x001b:
            boolean r1 = r0.f35998n
            r2 = 1
            if (r1 != 0) goto L_0x004d
            r0.f35998n = r2
            boolean r1 = r0.f35986b
            if (r1 == 0) goto L_0x0029
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x002b
        L_0x0029:
            java.lang.String r5 = "audio/3gpp"
        L_0x002b:
            r7 = r5
            if (r1 == 0) goto L_0x0033
            r1 = 16000(0x3e80, float:2.2421E-41)
            r12 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x0037
        L_0x0033:
            r1 = 8000(0x1f40, float:1.121E-41)
            r12 = 8000(0x1f40, float:1.121E-41)
        L_0x0037:
            com.yandex.mobile.ads.impl.ke1 r1 = r0.f35996l
            int r10 = f35984s
            r6 = 0
            r8 = 0
            r9 = -1
            r11 = 1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.yandex.mobile.ads.exo.Format r5 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (int) r9, (int) r10, (int) r11, (int) r12, (int) r13, (java.util.List<byte[]>) r14, (com.yandex.mobile.ads.exo.drm.DrmInitData) r15, (int) r16, (java.lang.String) r17)
            r1.mo65339a(r5)
        L_0x004d:
            int r1 = r0.f35989e
            r5 = 0
            r6 = -1
            if (r1 != 0) goto L_0x0074
            int r1 = r18.m38215b(r19)     // Catch:{ EOFException -> 0x0080 }
            r0.f35988d = r1     // Catch:{ EOFException -> 0x0080 }
            r0.f35989e = r1
            int r1 = r0.f35992h
            if (r1 != r6) goto L_0x0069
            long r7 = r19.mo67811c()
            r0.f35991g = r7
            int r1 = r0.f35988d
            r0.f35992h = r1
        L_0x0069:
            int r1 = r0.f35992h
            int r7 = r0.f35988d
            if (r1 != r7) goto L_0x0074
            int r1 = r0.f35993i
            int r1 = r1 + r2
            r0.f35993i = r1
        L_0x0074:
            com.yandex.mobile.ads.impl.ke1 r1 = r0.f35996l
            int r7 = r0.f35989e
            r8 = r19
            int r1 = r1.mo65335a(r8, r7, r2)
            if (r1 != r6) goto L_0x0082
        L_0x0080:
            r5 = -1
            goto L_0x00a0
        L_0x0082:
            int r6 = r0.f35989e
            int r6 = r6 - r1
            r0.f35989e = r6
            if (r6 <= 0) goto L_0x008a
            goto L_0x00a0
        L_0x008a:
            com.yandex.mobile.ads.impl.ke1 r7 = r0.f35996l
            long r8 = r0.f35994j
            long r10 = r0.f35987c
            long r8 = r8 + r10
            int r11 = r0.f35988d
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo65337a(r8, r10, r11, r12, r13)
            long r6 = r0.f35987c
            r8 = 20000(0x4e20, double:9.8813E-320)
            long r6 = r6 + r8
            r0.f35987c = r6
        L_0x00a0:
            boolean r1 = r0.f35990f
            if (r1 == 0) goto L_0x00a5
            goto L_0x00b8
        L_0x00a5:
            com.yandex.mobile.ads.impl.s71$b r1 = new com.yandex.mobile.ads.impl.s71$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r6, r3)
            r0.f35997m = r1
            com.yandex.mobile.ads.impl.x50 r3 = r0.f35995k
            r3.mo65309a(r1)
            r0.f35990f = r2
        L_0x00b8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13687k7.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f35987c = 0;
        this.f35988d = 0;
        this.f35989e = 0;
        if (j != 0) {
            s71 s71 = this.f35997m;
            if (s71 instanceof C13978mh) {
                this.f35994j = ((C13978mh) s71).mo68689c(j);
                return;
            }
        }
        this.f35994j = 0;
    }
}
