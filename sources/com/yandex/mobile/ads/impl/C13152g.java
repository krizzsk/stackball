package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.tf1;

/* renamed from: com.yandex.mobile.ads.impl.g */
public final class C13152g implements a30 {

    /* renamed from: a */
    private final ey0 f33785a;

    /* renamed from: b */
    private final fy0 f33786b;

    /* renamed from: c */
    private final String f33787c;

    /* renamed from: d */
    private String f33788d;

    /* renamed from: e */
    private ke1 f33789e;

    /* renamed from: f */
    private int f33790f;

    /* renamed from: g */
    private int f33791g;

    /* renamed from: h */
    private boolean f33792h;

    /* renamed from: i */
    private boolean f33793i;

    /* renamed from: j */
    private long f33794j;

    /* renamed from: k */
    private Format f33795k;

    /* renamed from: l */
    private int f33796l;

    /* renamed from: m */
    private long f33797m;

    public C13152g() {
        this((String) null);
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f33790f = 0;
        this.f33791g = 0;
        this.f33792h = false;
        this.f33793i = false;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    public C13152g(String str) {
        ey0 ey0 = new ey0(new byte[16]);
        this.f33785a = ey0;
        this.f33786b = new fy0(ey0.f33187a);
        this.f33790f = 0;
        this.f33791g = 0;
        this.f33792h = false;
        this.f33793i = false;
        this.f33787c = str;
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f33788d = dVar.mo70178b();
        this.f33789e = x50.mo65304a(dVar.mo70179c(), 1);
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f33797m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
        L_0x0004:
            int r2 = r22.mo67098a()
            if (r2 <= 0) goto L_0x011d
            int r2 = r0.f33790f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00cf
            if (r2 == r4) goto L_0x0045
            if (r2 == r3) goto L_0x0016
            goto L_0x0004
        L_0x0016:
            int r2 = r22.mo67098a()
            int r3 = r0.f33796l
            int r4 = r0.f33791g
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.yandex.mobile.ads.impl.ke1 r3 = r0.f33789e
            r3.mo65341a(r1, r2)
            int r3 = r0.f33791g
            int r3 = r3 + r2
            r0.f33791g = r3
            int r10 = r0.f33796l
            if (r3 != r10) goto L_0x0004
            com.yandex.mobile.ads.impl.ke1 r6 = r0.f33789e
            long r7 = r0.f33797m
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo65337a(r7, r9, r10, r11, r12)
            long r2 = r0.f33797m
            long r6 = r0.f33794j
            long r2 = r2 + r6
            r0.f33797m = r2
            r0.f33790f = r5
            goto L_0x0004
        L_0x0045:
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f33786b
            byte[] r2 = r2.f33778a
            int r6 = r22.mo67098a()
            int r7 = r0.f33791g
            r8 = 16
            int r7 = 16 - r7
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r0.f33791g
            r1.mo67104a(r2, r7, r6)
            int r2 = r0.f33791g
            int r2 = r2 + r6
            r0.f33791g = r2
            if (r2 != r8) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r4 == 0) goto L_0x0004
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f33785a
            r2.mo66895c(r5)
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f33785a
            com.yandex.mobile.ads.impl.h$b r2 = com.yandex.mobile.ads.impl.C13266h.m36737a(r2)
            com.yandex.mobile.ads.exo.Format r4 = r0.f33795k
            if (r4 == 0) goto L_0x008a
            int r6 = r4.f29543w
            if (r3 != r6) goto L_0x008a
            int r6 = r2.f34186a
            int r7 = r4.f29544x
            if (r6 != r7) goto L_0x008a
            java.lang.String r4 = r4.f29530j
            java.lang.String r6 = "audio/ac4"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x00ab
        L_0x008a:
            java.lang.String r9 = r0.f33788d
            int r15 = r2.f34186a
            java.lang.String r4 = r0.f33787c
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 2
            r16 = -1
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r10 = "audio/ac4"
            r20 = r4
            com.yandex.mobile.ads.exo.Format r4 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12, (int) r13, (int) r14, (int) r15, (int) r16, (java.util.List<byte[]>) r17, (com.yandex.mobile.ads.exo.drm.DrmInitData) r18, (int) r19, (java.lang.String) r20)
            r0.f33795k = r4
            com.yandex.mobile.ads.impl.ke1 r6 = r0.f33789e
            r6.mo65339a(r4)
        L_0x00ab:
            int r4 = r2.f34187b
            r0.f33796l = r4
            int r2 = r2.f34188c
            long r6 = (long) r2
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r9
            com.yandex.mobile.ads.exo.Format r2 = r0.f33795k
            int r2 = r2.f29544x
            long r9 = (long) r2
            long r6 = r6 / r9
            r0.f33794j = r6
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f33786b
            r2.mo67112e(r5)
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f33789e
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f33786b
            r2.mo65341a(r4, r8)
            r0.f33790f = r3
            goto L_0x0004
        L_0x00cf:
            int r2 = r22.mo67098a()
            r6 = 64
            r7 = 65
            if (r2 <= 0) goto L_0x0103
            boolean r2 = r0.f33792h
            r8 = 172(0xac, float:2.41E-43)
            if (r2 != 0) goto L_0x00eb
            int r2 = r22.mo67126r()
            if (r2 != r8) goto L_0x00e7
            r2 = 1
            goto L_0x00e8
        L_0x00e7:
            r2 = 0
        L_0x00e8:
            r0.f33792h = r2
            goto L_0x00cf
        L_0x00eb:
            int r2 = r22.mo67126r()
            if (r2 != r8) goto L_0x00f3
            r8 = 1
            goto L_0x00f4
        L_0x00f3:
            r8 = 0
        L_0x00f4:
            r0.f33792h = r8
            if (r2 == r6) goto L_0x00fa
            if (r2 != r7) goto L_0x00cf
        L_0x00fa:
            if (r2 != r7) goto L_0x00fe
            r2 = 1
            goto L_0x00ff
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            r0.f33793i = r2
            r2 = 1
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            if (r2 == 0) goto L_0x0004
            r0.f33790f = r4
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f33786b
            byte[] r2 = r2.f33778a
            r8 = -84
            r2[r5] = r8
            boolean r5 = r0.f33793i
            if (r5 == 0) goto L_0x0116
            r6 = 65
        L_0x0116:
            byte r5 = (byte) r6
            r2[r4] = r5
            r0.f33791g = r3
            goto L_0x0004
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13152g.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }
}
