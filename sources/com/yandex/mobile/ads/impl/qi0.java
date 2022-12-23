package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.tf1;

public final class qi0 implements a30 {

    /* renamed from: a */
    private final String f39120a;

    /* renamed from: b */
    private final fy0 f39121b;

    /* renamed from: c */
    private final ey0 f39122c;

    /* renamed from: d */
    private ke1 f39123d;

    /* renamed from: e */
    private Format f39124e;

    /* renamed from: f */
    private String f39125f;

    /* renamed from: g */
    private int f39126g;

    /* renamed from: h */
    private int f39127h;

    /* renamed from: i */
    private int f39128i;

    /* renamed from: j */
    private int f39129j;

    /* renamed from: k */
    private long f39130k;

    /* renamed from: l */
    private boolean f39131l;

    /* renamed from: m */
    private int f39132m;

    /* renamed from: n */
    private int f39133n;

    /* renamed from: o */
    private int f39134o;

    /* renamed from: p */
    private boolean f39135p;

    /* renamed from: q */
    private long f39136q;

    /* renamed from: r */
    private int f39137r;

    /* renamed from: s */
    private long f39138s;

    /* renamed from: t */
    private int f39139t;

    public qi0(String str) {
        this.f39120a = str;
        fy0 fy0 = new fy0(1024);
        this.f39121b = fy0;
        this.f39122c = new ey0(fy0.f33778a);
    }

    /* renamed from: b */
    private int m41235b(ey0 ey0) throws jy0 {
        int b = ey0.mo66891b();
        Pair<Integer, Integer> a = C12972eg.m35651a(ey0, true);
        this.f39137r = ((Integer) a.first).intValue();
        this.f39139t = ((Integer) a.second).intValue();
        return b - ey0.mo66891b();
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f39126g = 0;
        this.f39131l = false;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f39123d = x50.mo65304a(dVar.mo70179c(), 1);
        this.f39125f = dVar.mo70178b();
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f39130k = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014d, code lost:
        if (r0.f39131l == false) goto L_0x01a7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r25) throws com.yandex.mobile.ads.impl.jy0 {
        /*
            r24 = this;
            r0 = r24
        L_0x0002:
            int r1 = r25.mo67098a()
            if (r1 <= 0) goto L_0x0215
            int r1 = r0.f39126g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x0209
            r4 = 2
            r5 = 0
            if (r1 == r3) goto L_0x01f1
            r2 = 3
            r6 = 8
            if (r1 == r4) goto L_0x01c5
            if (r1 != r2) goto L_0x01bf
            int r1 = r25.mo67098a()
            int r4 = r0.f39128i
            int r7 = r0.f39127h
            int r4 = r4 - r7
            int r1 = java.lang.Math.min(r1, r4)
            com.yandex.mobile.ads.impl.ey0 r4 = r0.f39122c
            byte[] r4 = r4.f33187a
            int r7 = r0.f39127h
            r8 = r25
            r8.mo67104a(r4, r7, r1)
            int r4 = r0.f39127h
            int r4 = r4 + r1
            r0.f39127h = r4
            int r1 = r0.f39128i
            if (r4 != r1) goto L_0x0002
            com.yandex.mobile.ads.impl.ey0 r1 = r0.f39122c
            r1.mo66895c(r5)
            com.yandex.mobile.ads.impl.ey0 r1 = r0.f39122c
            boolean r4 = r1.mo66900f()
            if (r4 != 0) goto L_0x014b
            r0.f39131l = r3
            int r4 = r1.mo66886a((int) r3)
            if (r4 != r3) goto L_0x0055
            int r7 = r1.mo66886a((int) r3)
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            r0.f39132m = r7
            if (r7 != 0) goto L_0x0145
            if (r4 != r3) goto L_0x005f
            m41234a((com.yandex.mobile.ads.impl.ey0) r1)
        L_0x005f:
            boolean r7 = r1.mo66900f()
            if (r7 == 0) goto L_0x013f
            r7 = 6
            int r9 = r1.mo66886a((int) r7)
            r0.f39133n = r9
            r9 = 4
            int r10 = r1.mo66886a((int) r9)
            int r11 = r1.mo66886a((int) r2)
            if (r10 != 0) goto L_0x0139
            if (r11 != 0) goto L_0x0139
            if (r4 != 0) goto L_0x00ce
            int r10 = r1.mo66898e()
            int r11 = r0.m41235b(r1)
            r1.mo66895c(r10)
            int r10 = r11 + 7
            int r10 = r10 / r6
            byte[] r10 = new byte[r10]
            r1.mo66890a(r10, r5, r11)
            java.lang.String r12 = r0.f39125f
            int r11 = r0.f39139t
            int r15 = r0.f39137r
            java.util.List r20 = java.util.Collections.singletonList(r10)
            java.lang.String r10 = r0.f39120a
            r14 = 0
            r16 = -1
            r17 = -1
            r19 = -1
            r21 = 0
            r22 = 0
            java.lang.String r13 = "audio/mp4a-latm"
            r18 = r15
            r15 = r16
            r16 = r17
            r17 = r11
            r23 = r10
            com.yandex.mobile.ads.exo.Format r10 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (java.util.List<byte[]>) r20, (com.yandex.mobile.ads.exo.drm.DrmInitData) r21, (int) r22, (java.lang.String) r23)
            com.yandex.mobile.ads.exo.Format r11 = r0.f39124e
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00db
            r0.f39124e = r10
            int r11 = r10.f29544x
            long r11 = (long) r11
            r13 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r13 = r13 / r11
            r0.f39138s = r13
            com.yandex.mobile.ads.impl.ke1 r11 = r0.f39123d
            r11.mo65339a(r10)
            goto L_0x00db
        L_0x00ce:
            long r10 = m41234a((com.yandex.mobile.ads.impl.ey0) r1)
            int r11 = (int) r10
            int r10 = r0.m41235b(r1)
            int r11 = r11 - r10
            r1.mo66897d(r11)
        L_0x00db:
            int r10 = r1.mo66886a((int) r2)
            r0.f39134o = r10
            if (r10 == 0) goto L_0x0106
            if (r10 == r3) goto L_0x0100
            if (r10 == r2) goto L_0x00fc
            if (r10 == r9) goto L_0x00fc
            r2 = 5
            if (r10 == r2) goto L_0x00fc
            if (r10 == r7) goto L_0x00f8
            r2 = 7
            if (r10 != r2) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00f8:
            r1.mo66897d(r3)
            goto L_0x0109
        L_0x00fc:
            r1.mo66897d(r7)
            goto L_0x0109
        L_0x0100:
            r2 = 9
            r1.mo66897d(r2)
            goto L_0x0109
        L_0x0106:
            r1.mo66897d(r6)
        L_0x0109:
            boolean r2 = r1.mo66900f()
            r0.f39135p = r2
            r9 = 0
            r0.f39136q = r9
            if (r2 == 0) goto L_0x012f
            if (r4 != r3) goto L_0x011e
            long r2 = m41234a((com.yandex.mobile.ads.impl.ey0) r1)
            r0.f39136q = r2
            goto L_0x012f
        L_0x011e:
            boolean r2 = r1.mo66900f()
            long r3 = r0.f39136q
            long r3 = r3 << r6
            int r7 = r1.mo66886a((int) r6)
            long r9 = (long) r7
            long r3 = r3 + r9
            r0.f39136q = r3
            if (r2 != 0) goto L_0x011e
        L_0x012f:
            boolean r2 = r1.mo66900f()
            if (r2 == 0) goto L_0x0150
            r1.mo66897d(r6)
            goto L_0x0150
        L_0x0139:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            r1.<init>()
            throw r1
        L_0x013f:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            r1.<init>()
            throw r1
        L_0x0145:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            r1.<init>()
            throw r1
        L_0x014b:
            boolean r2 = r0.f39131l
            if (r2 != 0) goto L_0x0150
            goto L_0x01a7
        L_0x0150:
            int r2 = r0.f39132m
            if (r2 != 0) goto L_0x01b9
            int r2 = r0.f39133n
            if (r2 != 0) goto L_0x01b3
            int r2 = r0.f39134o
            if (r2 != 0) goto L_0x01ad
            r2 = 0
        L_0x015d:
            int r3 = r1.mo66886a((int) r6)
            int r13 = r2 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x01ab
            int r2 = r1.mo66898e()
            r3 = r2 & 7
            if (r3 != 0) goto L_0x0177
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f39121b
            int r2 = r2 >> 3
            r3.mo67112e(r2)
            goto L_0x0185
        L_0x0177:
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f39121b
            byte[] r2 = r2.f33778a
            int r3 = r13 * 8
            r1.mo66890a(r2, r5, r3)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f39121b
            r2.mo67112e(r5)
        L_0x0185:
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f39123d
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f39121b
            r2.mo65341a(r3, r13)
            com.yandex.mobile.ads.impl.ke1 r9 = r0.f39123d
            long r10 = r0.f39130k
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo65337a(r10, r12, r13, r14, r15)
            long r2 = r0.f39130k
            long r6 = r0.f39138s
            long r2 = r2 + r6
            r0.f39130k = r2
            boolean r2 = r0.f39135p
            if (r2 == 0) goto L_0x01a7
            long r2 = r0.f39136q
            int r3 = (int) r2
            r1.mo66897d(r3)
        L_0x01a7:
            r0.f39126g = r5
            goto L_0x0002
        L_0x01ab:
            r2 = r13
            goto L_0x015d
        L_0x01ad:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            r1.<init>()
            throw r1
        L_0x01b3:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            r1.<init>()
            throw r1
        L_0x01b9:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            r1.<init>()
            throw r1
        L_0x01bf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x01c5:
            r8 = r25
            int r1 = r0.f39129j
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r6
            int r3 = r25.mo67126r()
            r1 = r1 | r3
            r0.f39128i = r1
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f39121b
            byte[] r4 = r3.f33778a
            int r6 = r4.length
            if (r1 <= r6) goto L_0x01eb
            int r6 = r4.length
            if (r6 >= r1) goto L_0x01df
            byte[] r4 = new byte[r1]
        L_0x01df:
            r3.mo67103a((byte[]) r4, (int) r1)
            com.yandex.mobile.ads.impl.ey0 r1 = r0.f39122c
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f39121b
            byte[] r3 = r3.f33778a
            r1.mo66888a((byte[]) r3)
        L_0x01eb:
            r0.f39127h = r5
            r0.f39126g = r2
            goto L_0x0002
        L_0x01f1:
            r8 = r25
            int r1 = r25.mo67126r()
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r3 != r6) goto L_0x0203
            r0.f39129j = r1
            r0.f39126g = r4
            goto L_0x0002
        L_0x0203:
            if (r1 == r2) goto L_0x0002
            r0.f39126g = r5
            goto L_0x0002
        L_0x0209:
            r8 = r25
            int r1 = r25.mo67126r()
            if (r1 != r2) goto L_0x0002
            r0.f39126g = r3
            goto L_0x0002
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qi0.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }

    /* renamed from: a */
    private static long m41234a(ey0 ey0) {
        return (long) ey0.mo66886a((ey0.mo66886a(2) + 1) * 8);
    }
}
