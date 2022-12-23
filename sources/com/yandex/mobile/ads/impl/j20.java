package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.tf1;

public final class j20 implements a30 {

    /* renamed from: a */
    private final fy0 f35110a = new fy0(new byte[18]);

    /* renamed from: b */
    private final String f35111b;

    /* renamed from: c */
    private String f35112c;

    /* renamed from: d */
    private ke1 f35113d;

    /* renamed from: e */
    private int f35114e = 0;

    /* renamed from: f */
    private int f35115f;

    /* renamed from: g */
    private int f35116g;

    /* renamed from: h */
    private long f35117h;

    /* renamed from: i */
    private Format f35118i;

    /* renamed from: j */
    private int f35119j;

    /* renamed from: k */
    private long f35120k;

    public j20(String str) {
        this.f35111b = str;
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f35114e = 0;
        this.f35115f = 0;
        this.f35116g = 0;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f35112c = dVar.mo70178b();
        this.f35113d = x50.mo65304a(dVar.mo70179c(), 1);
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f35120k = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L_0x0004:
            int r2 = r18.mo67098a()
            if (r2 <= 0) goto L_0x0193
            int r2 = r0.f35114e
            r3 = 8
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L_0x013e
            if (r2 == r8) goto L_0x004e
            if (r2 != r5) goto L_0x0048
            int r2 = r18.mo67098a()
            int r3 = r0.f35119j
            int r4 = r0.f35115f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.yandex.mobile.ads.impl.ke1 r3 = r0.f35113d
            r3.mo65341a(r1, r2)
            int r3 = r0.f35115f
            int r3 = r3 + r2
            r0.f35115f = r3
            int r11 = r0.f35119j
            if (r3 != r11) goto L_0x0004
            com.yandex.mobile.ads.impl.ke1 r7 = r0.f35113d
            long r8 = r0.f35120k
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo65337a(r8, r10, r11, r12, r13)
            long r2 = r0.f35120k
            long r4 = r0.f35117h
            long r2 = r2 + r4
            r0.f35120k = r2
            r0.f35114e = r6
            goto L_0x0004
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x004e:
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f35110a
            byte[] r2 = r2.f33778a
            int r9 = r18.mo67098a()
            int r10 = r0.f35115f
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.f35115f
            r1.mo67104a(r2, r10, r9)
            int r2 = r0.f35115f
            int r2 = r2 + r9
            r0.f35115f = r2
            if (r2 != r11) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            if (r2 == 0) goto L_0x0004
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f35110a
            byte[] r2 = r2.f33778a
            com.yandex.mobile.ads.exo.Format r9 = r0.f35118i
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = r0.f35112c
            java.lang.String r10 = r0.f35111b
            r12 = 0
            com.yandex.mobile.ads.exo.Format r9 = com.yandex.mobile.ads.impl.k20.m38148a(r2, r9, r10, r12)
            r0.f35118i = r9
            com.yandex.mobile.ads.impl.ke1 r10 = r0.f35113d
            r10.mo65339a(r9)
        L_0x0089:
            byte r9 = r2[r6]
            r10 = 31
            r12 = -1
            r13 = -2
            r14 = 5
            r15 = 6
            r16 = 7
            if (r9 == r13) goto L_0x00cf
            if (r9 == r12) goto L_0x00b9
            if (r9 == r10) goto L_0x00a7
            byte r3 = r2[r14]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r3 = r3 | r4
            byte r4 = r2[r16]
            goto L_0x00dc
        L_0x00a7:
            byte r9 = r2[r15]
            r4 = r4 & r9
            int r4 = r4 << 12
            byte r9 = r2[r16]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r7
            r4 = r4 | r9
            byte r3 = r2[r3]
            r3 = r3 & 60
            int r3 = r3 >> r5
            r3 = r3 | r4
            goto L_0x00cc
        L_0x00b9:
            byte r3 = r2[r16]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r3 = r3 | r4
            r4 = 9
            byte r4 = r2[r4]
            r4 = r4 & 60
            int r4 = r4 >> r5
            r3 = r3 | r4
        L_0x00cc:
            int r3 = r3 + r8
            r4 = 1
            goto L_0x00e2
        L_0x00cf:
            byte r3 = r2[r7]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r3 = r3 | r4
            byte r4 = r2[r15]
        L_0x00dc:
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> r7
            r3 = r3 | r4
            int r3 = r3 + r8
            r4 = 0
        L_0x00e2:
            if (r4 == 0) goto L_0x00e8
            int r3 = r3 * 16
            int r3 = r3 / 14
        L_0x00e8:
            r0.f35119j = r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            byte r9 = r2[r6]
            if (r9 == r13) goto L_0x0114
            if (r9 == r12) goto L_0x0107
            if (r9 == r10) goto L_0x00fe
            byte r7 = r2[r7]
            r7 = r7 & r8
            int r7 = r7 << r15
            byte r2 = r2[r14]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            goto L_0x0111
        L_0x00fe:
            byte r9 = r2[r14]
            r9 = r9 & 7
            int r7 = r9 << 4
            byte r2 = r2[r15]
            goto L_0x010f
        L_0x0107:
            byte r9 = r2[r7]
            r9 = r9 & 7
            int r7 = r9 << 4
            byte r2 = r2[r16]
        L_0x010f:
            r2 = r2 & 60
        L_0x0111:
            int r2 = r2 >> r5
            r2 = r2 | r7
            goto L_0x011e
        L_0x0114:
            byte r9 = r2[r14]
            r9 = r9 & r8
            int r9 = r9 << r15
            byte r2 = r2[r7]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            int r2 = r2 >> r5
            r2 = r2 | r9
        L_0x011e:
            int r2 = r2 + r8
            int r2 = r2 * 32
            long r7 = (long) r2
            long r7 = r7 * r3
            com.yandex.mobile.ads.exo.Format r2 = r0.f35118i
            int r2 = r2.f29544x
            long r2 = (long) r2
            long r7 = r7 / r2
            int r2 = (int) r7
            long r2 = (long) r2
            r0.f35117h = r2
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f35110a
            r2.mo67112e(r6)
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f35113d
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f35110a
            r2.mo65341a(r3, r11)
            r0.f35114e = r5
            goto L_0x0004
        L_0x013e:
            int r2 = r18.mo67098a()
            if (r2 <= 0) goto L_0x018d
            int r2 = r0.f35116g
            int r2 = r2 << r3
            r0.f35116g = r2
            int r9 = r18.mo67126r()
            r2 = r2 | r9
            r0.f35116g = r2
            r9 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r9) goto L_0x0167
            r9 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r9) goto L_0x0167
            r9 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r9) goto L_0x0167
            r9 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r9) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r9 = 0
            goto L_0x0168
        L_0x0167:
            r9 = 1
        L_0x0168:
            if (r9 == 0) goto L_0x013e
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f35110a
            byte[] r3 = r3.f33778a
            int r9 = r2 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r3[r6] = r9
            int r9 = r2 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r3[r8] = r9
            int r9 = r2 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r3[r5] = r9
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r0.f35115f = r7
            r0.f35116g = r6
            r6 = 1
        L_0x018d:
            if (r6 == 0) goto L_0x0004
            r0.f35114e = r8
            goto L_0x0004
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j20.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }
}
