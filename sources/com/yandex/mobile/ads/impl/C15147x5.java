package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.tf1;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.x5 */
public final class C15147x5 implements a30 {

    /* renamed from: v */
    private static final byte[] f42411v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f42412a;

    /* renamed from: b */
    private final ey0 f42413b;

    /* renamed from: c */
    private final fy0 f42414c;

    /* renamed from: d */
    private final String f42415d;

    /* renamed from: e */
    private String f42416e;

    /* renamed from: f */
    private ke1 f42417f;

    /* renamed from: g */
    private ke1 f42418g;

    /* renamed from: h */
    private int f42419h;

    /* renamed from: i */
    private int f42420i;

    /* renamed from: j */
    private int f42421j;

    /* renamed from: k */
    private boolean f42422k;

    /* renamed from: l */
    private boolean f42423l;

    /* renamed from: m */
    private int f42424m;

    /* renamed from: n */
    private int f42425n;

    /* renamed from: o */
    private int f42426o;

    /* renamed from: p */
    private boolean f42427p;

    /* renamed from: q */
    private long f42428q;

    /* renamed from: r */
    private int f42429r;

    /* renamed from: s */
    private long f42430s;

    /* renamed from: t */
    private ke1 f42431t;

    /* renamed from: u */
    private long f42432u;

    public C15147x5(boolean z) {
        this(z, (String) null);
    }

    /* renamed from: a */
    public static boolean m43952a(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: b */
    private boolean m43954b(fy0 fy0, byte[] bArr, int i) {
        if (fy0.mo67098a() < i) {
            return false;
        }
        fy0.mo67104a(bArr, 0, i);
        return true;
    }

    /* renamed from: c */
    private void m43955c() {
        this.f42419h = 0;
        this.f42420i = 0;
        this.f42421j = 256;
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f42416e = dVar.mo70178b();
        this.f42417f = x50.mo65304a(dVar.mo70179c(), 1);
        if (this.f42412a) {
            dVar.mo70177a();
            ke1 a = x50.mo65304a(dVar.mo70179c(), 4);
            this.f42418g = a;
            a.mo65339a(Format.m31686a(dVar.mo70178b(), "application/id3", (String) null, -1, (DrmInitData) null));
            return;
        }
        this.f42418g = new l20();
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    public C15147x5(boolean z, String str) {
        this.f42413b = new ey0(new byte[7]);
        this.f42414c = new fy0(Arrays.copyOf(f42411v, 10));
        m43955c();
        this.f42424m = -1;
        this.f42425n = -1;
        this.f42428q = -9223372036854775807L;
        this.f42412a = z;
        this.f42415d = str;
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f42430s = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0273 A[EDGE_INSN: B:139:0x0273->B:92:0x0273 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r27) throws com.yandex.mobile.ads.impl.jy0 {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
        L_0x0004:
            int r2 = r27.mo67098a()
            if (r2 <= 0) goto L_0x02ec
            int r2 = r0.f42419h
            r3 = 13
            r4 = 7
            r5 = -1
            r6 = 4
            r7 = 3
            r8 = 0
            r9 = 2
            r10 = 1
            if (r2 == 0) goto L_0x0198
            if (r2 == r10) goto L_0x0158
            r5 = 10
            if (r2 == r9) goto L_0x012a
            if (r2 == r7) goto L_0x0057
            if (r2 != r6) goto L_0x0051
            int r2 = r27.mo67098a()
            int r3 = r0.f42429r
            int r4 = r0.f42420i
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.yandex.mobile.ads.impl.ke1 r3 = r0.f42431t
            r3.mo65341a(r1, r2)
            int r3 = r0.f42420i
            int r3 = r3 + r2
            r0.f42420i = r3
            int r8 = r0.f42429r
            if (r3 != r8) goto L_0x0004
            com.yandex.mobile.ads.impl.ke1 r4 = r0.f42431t
            long r5 = r0.f42430s
            r7 = 1
            r9 = 0
            r10 = 0
            r4.mo65337a(r5, r7, r8, r9, r10)
            long r2 = r0.f42430s
            long r4 = r0.f42432u
            long r2 = r2 + r4
            r0.f42430s = r2
            r26.m43955c()
            goto L_0x0004
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0057:
            boolean r2 = r0.f42422k
            r11 = 5
            if (r2 == 0) goto L_0x005e
            r2 = 7
            goto L_0x005f
        L_0x005e:
            r2 = 5
        L_0x005f:
            com.yandex.mobile.ads.impl.ey0 r12 = r0.f42413b
            byte[] r12 = r12.f33187a
            boolean r2 = r0.m43953a(r1, r12, r2)
            if (r2 == 0) goto L_0x0004
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            r2.mo66895c(r8)
            boolean r2 = r0.f42427p
            if (r2 != 0) goto L_0x0102
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            int r2 = r2.mo66886a((int) r9)
            int r2 = r2 + r10
            if (r2 == r9) goto L_0x0097
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "Detected audio object type: "
            r5.append(r12)
            r5.append(r2)
            java.lang.String r2 = ", but assuming AAC LC."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "AdtsReader"
            android.util.Log.w(r5, r2)
            r2 = 2
        L_0x0097:
            com.yandex.mobile.ads.impl.ey0 r5 = r0.f42413b
            r5.mo66897d(r11)
            com.yandex.mobile.ads.impl.ey0 r5 = r0.f42413b
            int r5 = r5.mo66886a((int) r7)
            int r12 = r0.f42425n
            byte[] r13 = new byte[r9]
            int r2 = r2 << r7
            r2 = r2 & 248(0xf8, float:3.48E-43)
            int r14 = r12 >> 1
            r14 = r14 & r4
            r2 = r2 | r14
            byte r2 = (byte) r2
            r13[r8] = r2
            int r2 = r12 << 7
            r2 = r2 & 128(0x80, float:1.794E-43)
            int r4 = r5 << 3
            r4 = r4 & 120(0x78, float:1.68E-43)
            r2 = r2 | r4
            byte r2 = (byte) r2
            r13[r10] = r2
            com.yandex.mobile.ads.impl.ey0 r2 = new com.yandex.mobile.ads.impl.ey0
            r2.<init>(r13, r9)
            android.util.Pair r2 = com.yandex.mobile.ads.impl.C12972eg.m35651a(r2, r8)
            java.lang.String r14 = r0.f42416e
            java.lang.Object r4 = r2.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r19 = r4.intValue()
            java.lang.Object r2 = r2.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r20 = r2.intValue()
            java.util.List r22 = java.util.Collections.singletonList(r13)
            java.lang.String r2 = r0.f42415d
            r16 = 0
            r17 = -1
            r18 = -1
            r21 = -1
            r23 = 0
            r24 = 0
            java.lang.String r15 = "audio/mp4a-latm"
            r25 = r2
            com.yandex.mobile.ads.exo.Format r2 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (java.util.List<byte[]>) r22, (com.yandex.mobile.ads.exo.drm.DrmInitData) r23, (int) r24, (java.lang.String) r25)
            int r4 = r2.f29544x
            long r4 = (long) r4
            r12 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r12 = r12 / r4
            r0.f42428q = r12
            com.yandex.mobile.ads.impl.ke1 r4 = r0.f42417f
            r4.mo65339a(r2)
            r0.f42427p = r10
            goto L_0x0107
        L_0x0102:
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            r2.mo66897d(r5)
        L_0x0107:
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            r2.mo66897d(r6)
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            int r2 = r2.mo66886a((int) r3)
            int r2 = r2 - r9
            int r2 = r2 - r11
            boolean r3 = r0.f42422k
            if (r3 == 0) goto L_0x011a
            int r2 = r2 + -2
        L_0x011a:
            com.yandex.mobile.ads.impl.ke1 r3 = r0.f42417f
            long r4 = r0.f42428q
            r0.f42419h = r6
            r0.f42420i = r8
            r0.f42431t = r3
            r0.f42432u = r4
            r0.f42429r = r2
            goto L_0x0004
        L_0x012a:
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f42414c
            byte[] r2 = r2.f33778a
            boolean r2 = r0.m43953a(r1, r2, r5)
            if (r2 == 0) goto L_0x0004
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f42418g
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f42414c
            r2.mo65341a(r3, r5)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f42414c
            r3 = 6
            r2.mo67112e(r3)
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f42418g
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f42414c
            int r3 = r3.mo67125q()
            int r3 = r3 + r5
            r0.f42419h = r6
            r0.f42420i = r5
            r0.f42431t = r2
            r4 = 0
            r0.f42432u = r4
            r0.f42429r = r3
            goto L_0x0004
        L_0x0158:
            int r2 = r27.mo67098a()
            if (r2 != 0) goto L_0x0160
            goto L_0x0004
        L_0x0160:
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            byte[] r2 = r2.f33187a
            byte[] r3 = r1.f33778a
            int r4 = r27.mo67105b()
            byte r3 = r3[r4]
            r2[r8] = r3
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            r2.mo66895c(r9)
            com.yandex.mobile.ads.impl.ey0 r2 = r0.f42413b
            int r2 = r2.mo66886a((int) r6)
            int r3 = r0.f42425n
            if (r3 == r5) goto L_0x0186
            if (r2 == r3) goto L_0x0186
            r0.f42423l = r8
            r26.m43955c()
            goto L_0x0004
        L_0x0186:
            boolean r3 = r0.f42423l
            if (r3 != 0) goto L_0x0192
            r0.f42423l = r10
            int r3 = r0.f42426o
            r0.f42424m = r3
            r0.f42425n = r2
        L_0x0192:
            r0.f42419h = r7
            r0.f42420i = r8
            goto L_0x0004
        L_0x0198:
            byte[] r2 = r1.f33778a
            int r11 = r27.mo67105b()
            int r12 = r27.mo67107c()
        L_0x01a2:
            if (r11 >= r12) goto L_0x02e7
            int r13 = r11 + 1
            byte r11 = r2[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r14 = r0.f42421j
            r15 = 512(0x200, float:7.175E-43)
            if (r14 != r15) goto L_0x0295
            byte r14 = (byte) r11
            r14 = r14 & 255(0xff, float:3.57E-43)
            r16 = 65280(0xff00, float:9.1477E-41)
            r14 = r14 | r16
            boolean r14 = m43952a((int) r14)
            if (r14 == 0) goto L_0x0295
            boolean r14 = r0.f42423l
            if (r14 != 0) goto L_0x0273
            int r14 = r13 + -2
            int r15 = r14 + 1
            r1.mo67112e(r15)
            com.yandex.mobile.ads.impl.ey0 r15 = r0.f42413b
            byte[] r15 = r15.f33187a
            boolean r15 = r0.m43954b(r1, r15, r10)
            if (r15 != 0) goto L_0x01d5
            goto L_0x0270
        L_0x01d5:
            com.yandex.mobile.ads.impl.ey0 r15 = r0.f42413b
            r15.mo66895c(r6)
            com.yandex.mobile.ads.impl.ey0 r15 = r0.f42413b
            int r15 = r15.mo66886a((int) r10)
            int r8 = r0.f42424m
            if (r8 == r5) goto L_0x01e8
            if (r15 == r8) goto L_0x01e8
            goto L_0x0270
        L_0x01e8:
            int r8 = r0.f42425n
            if (r8 == r5) goto L_0x020e
            com.yandex.mobile.ads.impl.ey0 r8 = r0.f42413b
            byte[] r8 = r8.f33187a
            boolean r8 = r0.m43954b(r1, r8, r10)
            if (r8 != 0) goto L_0x01f8
            goto L_0x026e
        L_0x01f8:
            com.yandex.mobile.ads.impl.ey0 r8 = r0.f42413b
            r8.mo66895c(r9)
            com.yandex.mobile.ads.impl.ey0 r8 = r0.f42413b
            int r8 = r8.mo66886a((int) r6)
            int r9 = r0.f42425n
            if (r8 == r9) goto L_0x0209
            goto L_0x0270
        L_0x0209:
            int r8 = r14 + 2
            r1.mo67112e(r8)
        L_0x020e:
            com.yandex.mobile.ads.impl.ey0 r8 = r0.f42413b
            byte[] r8 = r8.f33187a
            boolean r8 = r0.m43954b(r1, r8, r6)
            if (r8 != 0) goto L_0x0219
            goto L_0x026e
        L_0x0219:
            com.yandex.mobile.ads.impl.ey0 r8 = r0.f42413b
            r9 = 14
            r8.mo66895c(r9)
            com.yandex.mobile.ads.impl.ey0 r8 = r0.f42413b
            int r8 = r8.mo66886a((int) r3)
            if (r8 >= r4) goto L_0x0229
            goto L_0x0270
        L_0x0229:
            byte[] r9 = r1.f33778a
            int r3 = r27.mo67107c()
            int r14 = r14 + r8
            if (r14 < r3) goto L_0x0233
            goto L_0x026e
        L_0x0233:
            byte r8 = r9[r14]
            if (r8 != r5) goto L_0x0250
            int r14 = r14 + 1
            if (r14 != r3) goto L_0x023c
            goto L_0x026e
        L_0x023c:
            byte r3 = r9[r14]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r16
            boolean r3 = m43952a((int) r3)
            if (r3 == 0) goto L_0x0270
            byte r3 = r9[r14]
            r3 = r3 & 8
            int r3 = r3 >> r7
            if (r3 != r15) goto L_0x0270
            goto L_0x026e
        L_0x0250:
            byte r8 = r9[r14]
            r15 = 73
            if (r8 == r15) goto L_0x0257
            goto L_0x0270
        L_0x0257:
            int r8 = r14 + 1
            if (r8 != r3) goto L_0x025c
            goto L_0x026e
        L_0x025c:
            byte r8 = r9[r8]
            r15 = 68
            if (r8 == r15) goto L_0x0263
            goto L_0x0270
        L_0x0263:
            int r14 = r14 + 2
            if (r14 != r3) goto L_0x0268
            goto L_0x026e
        L_0x0268:
            byte r3 = r9[r14]
            r8 = 51
            if (r3 != r8) goto L_0x0270
        L_0x026e:
            r3 = 1
            goto L_0x0271
        L_0x0270:
            r3 = 0
        L_0x0271:
            if (r3 == 0) goto L_0x0295
        L_0x0273:
            r2 = r11 & 8
            int r2 = r2 >> r7
            r0.f42426o = r2
            r2 = r11 & 1
            if (r2 != 0) goto L_0x027e
            r2 = 1
            goto L_0x027f
        L_0x027e:
            r2 = 0
        L_0x027f:
            r0.f42422k = r2
            boolean r2 = r0.f42423l
            if (r2 != 0) goto L_0x028b
            r0.f42419h = r10
            r2 = 0
            r0.f42420i = r2
            goto L_0x0290
        L_0x028b:
            r2 = 0
            r0.f42419h = r7
            r0.f42420i = r2
        L_0x0290:
            r1.mo67112e(r13)
            goto L_0x0004
        L_0x0295:
            int r3 = r0.f42421j
            r8 = r3 | r11
            r9 = 329(0x149, float:4.61E-43)
            if (r8 == r9) goto L_0x02db
            r9 = 511(0x1ff, float:7.16E-43)
            if (r8 == r9) goto L_0x02d4
            r9 = 836(0x344, float:1.171E-42)
            if (r8 == r9) goto L_0x02cd
            r9 = 1075(0x433, float:1.506E-42)
            if (r8 == r9) goto L_0x02b8
            r8 = 256(0x100, float:3.59E-43)
            if (r3 == r8) goto L_0x02b5
            r0.f42421j = r8
            int r11 = r13 + -1
            r3 = 13
            r8 = 0
            goto L_0x02e4
        L_0x02b5:
            r3 = 2
            r8 = 0
            goto L_0x02e1
        L_0x02b8:
            r3 = 2
            r0.f42419h = r3
            byte[] r2 = f42411v
            int r2 = r2.length
            r0.f42420i = r2
            r8 = 0
            r0.f42429r = r8
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f42414c
            r2.mo67112e(r8)
            r1.mo67112e(r13)
            goto L_0x0004
        L_0x02cd:
            r3 = 2
            r8 = 0
            r9 = 1024(0x400, float:1.435E-42)
            r0.f42421j = r9
            goto L_0x02e1
        L_0x02d4:
            r3 = 2
            r8 = 0
            r9 = 512(0x200, float:7.175E-43)
            r0.f42421j = r9
            goto L_0x02e1
        L_0x02db:
            r3 = 2
            r8 = 0
            r9 = 768(0x300, float:1.076E-42)
            r0.f42421j = r9
        L_0x02e1:
            r11 = r13
            r3 = 13
        L_0x02e4:
            r9 = 2
            goto L_0x01a2
        L_0x02e7:
            r1.mo67112e(r11)
            goto L_0x0004
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15147x5.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f42423l = false;
        m43955c();
    }

    /* renamed from: a */
    private boolean m43953a(fy0 fy0, byte[] bArr, int i) {
        int min = Math.min(fy0.mo67098a(), i - this.f42420i);
        fy0.mo67104a(bArr, this.f42420i, min);
        int i2 = this.f42420i + min;
        this.f42420i = i2;
        return i2 == i;
    }
}
