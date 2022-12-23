package com.fyber.inneractive.sdk.player.p059c.p063d.p066c;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3272j;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3274k;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p072f.C3417a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.c.b */
public final class C3258b implements C3268f {

    /* renamed from: a */
    public static final C3271i f8313a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3258b()};
        }
    };

    /* renamed from: b */
    private static final int f8314b = C3560t.m8893e("Xing");

    /* renamed from: c */
    private static final int f8315c = C3560t.m8893e("Info");

    /* renamed from: d */
    private static final int f8316d = C3560t.m8893e("VBRI");

    /* renamed from: e */
    private final int f8317e;

    /* renamed from: f */
    private final long f8318f;

    /* renamed from: g */
    private final C3548k f8319g;

    /* renamed from: h */
    private final C3274k f8320h;

    /* renamed from: i */
    private final C3272j f8321i;

    /* renamed from: j */
    private C3270h f8322j;

    /* renamed from: k */
    private C3278n f8323k;

    /* renamed from: l */
    private int f8324l;

    /* renamed from: m */
    private C3417a f8325m;

    /* renamed from: n */
    private C3260a f8326n;

    /* renamed from: o */
    private long f8327o;

    /* renamed from: p */
    private long f8328p;

    /* renamed from: q */
    private int f8329q;

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.c.b$a */
    interface C3260a extends C3276m {
        /* renamed from: b */
        long mo19034b(long j);
    }

    /* renamed from: a */
    private static boolean m7966a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    public C3258b() {
        this(0);
    }

    public C3258b(int i) {
        this(i, (byte) 0);
    }

    private C3258b(int i, byte b) {
        this.f8317e = i;
        this.f8318f = -9223372036854775807L;
        this.f8319g = new C3548k(10);
        this.f8320h = new C3274k();
        this.f8321i = new C3272j();
        this.f8327o = -9223372036854775807L;
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        return m7967a(gVar, true);
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f8322j = hVar;
        this.f8323k = hVar.mo19056a(0);
        this.f8322j.mo19058b();
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f8324l = 0;
        this.f8327o = -9223372036854775807L;
        this.f8328p = 0;
        this.f8329q = 0;
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [com.fyber.inneractive.sdk.player.c.d.c.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r11 != f8315c) goto L_0x005c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0238  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18998a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r38, com.fyber.inneractive.sdk.player.p059c.p063d.C3275l r39) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = r0.f8324l
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m7967a((com.fyber.inneractive.sdk.player.p059c.p063d.C3269g) r1, (boolean) r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.fyber.inneractive.sdk.player.c.d.c.b$a r2 = r0.f8326n
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1
            if (r2 != 0) goto L_0x0251
            com.fyber.inneractive.sdk.player.c.k.k r2 = new com.fyber.inneractive.sdk.player.c.k.k
            com.fyber.inneractive.sdk.player.c.d.k r11 = r0.f8320h
            int r11 = r11.f8391c
            r2.<init>((int) r11)
            byte[] r11 = r2.f9625a
            com.fyber.inneractive.sdk.player.c.d.k r12 = r0.f8320h
            int r12 = r12.f8391c
            r1.mo19014c(r11, r4, r12)
            com.fyber.inneractive.sdk.player.c.d.k r11 = r0.f8320h
            int r11 = r11.f8389a
            r11 = r11 & r10
            r12 = 36
            r13 = 21
            if (r11 == 0) goto L_0x003d
            com.fyber.inneractive.sdk.player.c.d.k r11 = r0.f8320h
            int r11 = r11.f8393e
            if (r11 == r10) goto L_0x0046
            r13 = 36
            goto L_0x0046
        L_0x003d:
            com.fyber.inneractive.sdk.player.c.d.k r11 = r0.f8320h
            int r11 = r11.f8393e
            if (r11 == r10) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r13 = 13
        L_0x0046:
            int r11 = r2.f9627c
            int r14 = r13 + 4
            if (r11 < r14) goto L_0x005c
            r2.mo19386c(r13)
            int r11 = r2.mo19396j()
            int r14 = f8314b
            if (r11 == r14) goto L_0x0070
            int r14 = f8315c
            if (r11 != r14) goto L_0x005c
            goto L_0x0070
        L_0x005c:
            int r11 = r2.f9627c
            r14 = 40
            if (r11 < r14) goto L_0x006f
            r2.mo19386c(r12)
            int r11 = r2.mo19396j()
            int r12 = f8316d
            if (r11 != r12) goto L_0x006f
            r11 = r12
            goto L_0x0070
        L_0x006f:
            r11 = 0
        L_0x0070:
            int r12 = f8314b
            r15 = 2
            r16 = 0
            if (r11 == r12) goto L_0x0135
            int r12 = f8315c
            if (r11 != r12) goto L_0x007d
            goto L_0x0135
        L_0x007d:
            int r12 = f8316d
            if (r11 != r12) goto L_0x012d
            com.fyber.inneractive.sdk.player.c.d.k r11 = r0.f8320h
            long r12 = r38.mo19012c()
            long r9 = r38.mo19015d()
            r3 = 10
            r2.mo19388d(r3)
            int r3 = r2.mo19396j()
            if (r3 > 0) goto L_0x009a
        L_0x0096:
            r2 = r16
            goto L_0x0122
        L_0x009a:
            int r14 = r11.f8392d
            long r4 = (long) r3
            r3 = 32000(0x7d00, float:4.4842E-41)
            if (r14 < r3) goto L_0x00a4
            r3 = 1152(0x480, float:1.614E-42)
            goto L_0x00a6
        L_0x00a4:
            r3 = 576(0x240, float:8.07E-43)
        L_0x00a6:
            long r0 = (long) r3
            long r19 = r0 * r7
            long r0 = (long) r14
            r17 = r4
            r21 = r0
            long r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r17, (long) r19, (long) r21)
            int r3 = r2.mo19389e()
            int r4 = r2.mo19389e()
            int r5 = r2.mo19389e()
            r2.mo19388d(r15)
            int r6 = r11.f8391c
            long r7 = (long) r6
            long r12 = r12 + r7
            int r6 = r3 + 1
            long[] r7 = new long[r6]
            long[] r8 = new long[r6]
            r11 = 0
            r19 = 0
            r7[r11] = r19
            r8[r11] = r12
            r11 = 1
        L_0x00d3:
            if (r11 >= r6) goto L_0x011b
            r14 = 1
            if (r5 == r14) goto L_0x00f2
            if (r5 == r15) goto L_0x00ed
            r14 = 3
            if (r5 == r14) goto L_0x00e8
            r14 = 4
            if (r5 == r14) goto L_0x00e3
            r0 = r37
            goto L_0x0096
        L_0x00e3:
            int r14 = r2.mo19400n()
            goto L_0x00f6
        L_0x00e8:
            int r14 = r2.mo19393g()
            goto L_0x00f6
        L_0x00ed:
            int r14 = r2.mo19389e()
            goto L_0x00f6
        L_0x00f2:
            int r14 = r2.mo19387d()
        L_0x00f6:
            int r14 = r14 * r4
            r19 = r4
            r20 = r5
            long r4 = (long) r14
            long r12 = r12 + r4
            long r4 = (long) r11
            long r4 = r4 * r0
            long r14 = (long) r3
            long r4 = r4 / r14
            r7[r11] = r4
            r4 = -1
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x010d
            r4 = r12
            goto L_0x0111
        L_0x010d:
            long r4 = java.lang.Math.min(r9, r12)
        L_0x0111:
            r8[r11] = r4
            int r11 = r11 + 1
            r4 = r19
            r5 = r20
            r15 = 2
            goto L_0x00d3
        L_0x011b:
            com.fyber.inneractive.sdk.player.c.d.c.c r2 = new com.fyber.inneractive.sdk.player.c.d.c.c
            r2.<init>(r7, r8, r0)
            r0 = r37
        L_0x0122:
            com.fyber.inneractive.sdk.player.c.d.k r1 = r0.f8320h
            int r1 = r1.f8391c
            r3 = r38
            r3.mo19009b(r1)
            goto L_0x01ee
        L_0x012d:
            r3 = r1
            r38.mo19006a()
            r2 = r16
            goto L_0x01ee
        L_0x0135:
            r3 = r1
            com.fyber.inneractive.sdk.player.c.d.k r1 = r0.f8320h
            long r4 = r38.mo19012c()
            long r28 = r38.mo19015d()
            int r6 = r1.f8395g
            int r7 = r1.f8392d
            int r8 = r1.f8391c
            long r8 = (long) r8
            long r24 = r4 + r8
            int r4 = r2.mo19396j()
            r5 = r4 & 1
            r8 = 1
            if (r5 != r8) goto L_0x01a0
            int r5 = r2.mo19400n()
            if (r5 != 0) goto L_0x0159
            goto L_0x01a0
        L_0x0159:
            long r8 = (long) r5
            long r5 = (long) r6
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r32 = r5 * r14
            long r5 = (long) r7
            r30 = r8
            r34 = r5
            long r26 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r30, (long) r32, (long) r34)
            r5 = 6
            r4 = r4 & r5
            if (r4 == r5) goto L_0x0176
            com.fyber.inneractive.sdk.player.c.d.c.d r1 = new com.fyber.inneractive.sdk.player.c.d.c.d
            r23 = r1
            r23.<init>(r24, r26, r28)
            r2 = r1
            goto L_0x01a2
        L_0x0176:
            int r4 = r2.mo19400n()
            long r4 = (long) r4
            r6 = 1
            r2.mo19388d(r6)
            r6 = 99
            long[] r7 = new long[r6]
            r8 = 0
        L_0x0184:
            if (r8 >= r6) goto L_0x0190
            int r9 = r2.mo19387d()
            long r9 = (long) r9
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0184
        L_0x0190:
            com.fyber.inneractive.sdk.player.c.d.c.d r2 = new com.fyber.inneractive.sdk.player.c.d.c.d
            int r1 = r1.f8391c
            r23 = r2
            r30 = r7
            r31 = r4
            r33 = r1
            r23.<init>(r24, r26, r28, r30, r31, r33)
            goto L_0x01a2
        L_0x01a0:
            r2 = r16
        L_0x01a2:
            if (r2 == 0) goto L_0x01d6
            com.fyber.inneractive.sdk.player.c.d.j r1 = r0.f8321i
            boolean r1 = r1.mo19059a()
            if (r1 != 0) goto L_0x01d6
            r38.mo19006a()
            int r13 = r13 + 141
            r3.mo19013c(r13)
            com.fyber.inneractive.sdk.player.c.k.k r1 = r0.f8319g
            byte[] r1 = r1.f9625a
            r4 = 3
            r5 = 0
            r3.mo19014c(r1, r5, r4)
            com.fyber.inneractive.sdk.player.c.k.k r1 = r0.f8319g
            r1.mo19386c(r5)
            com.fyber.inneractive.sdk.player.c.d.j r1 = r0.f8321i
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8319g
            int r4 = r4.mo19393g()
            int r5 = r4 >> 12
            r4 = r4 & 4095(0xfff, float:5.738E-42)
            if (r5 > 0) goto L_0x01d2
            if (r4 <= 0) goto L_0x01d6
        L_0x01d2:
            r1.f8380b = r5
            r1.f8381c = r4
        L_0x01d6:
            com.fyber.inneractive.sdk.player.c.d.k r1 = r0.f8320h
            int r1 = r1.f8391c
            r3.mo19009b(r1)
            if (r2 == 0) goto L_0x01ee
            boolean r1 = r2.mo18995b_()
            if (r1 != 0) goto L_0x01ee
            int r1 = f8315c
            if (r11 != r1) goto L_0x01ee
            com.fyber.inneractive.sdk.player.c.d.c.b$a r1 = r37.m7968b(r38)
            goto L_0x01ef
        L_0x01ee:
            r1 = r2
        L_0x01ef:
            r0.f8326n = r1
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r1.mo18995b_()
            if (r1 != 0) goto L_0x0205
            int r1 = r0.f8317e
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0205
        L_0x01ff:
            com.fyber.inneractive.sdk.player.c.d.c.b$a r1 = r37.m7968b(r38)
            r0.f8326n = r1
        L_0x0205:
            com.fyber.inneractive.sdk.player.c.d.h r1 = r0.f8322j
            com.fyber.inneractive.sdk.player.c.d.c.b$a r2 = r0.f8326n
            r1.mo19057a((com.fyber.inneractive.sdk.player.p059c.p063d.C3276m) r2)
            com.fyber.inneractive.sdk.player.c.d.n r1 = r0.f8323k
            r23 = 0
            com.fyber.inneractive.sdk.player.c.d.k r2 = r0.f8320h
            java.lang.String r2 = r2.f8390b
            r25 = -1
            r26 = 4096(0x1000, float:5.74E-42)
            com.fyber.inneractive.sdk.player.c.d.k r4 = r0.f8320h
            int r4 = r4.f8393e
            com.fyber.inneractive.sdk.player.c.d.k r5 = r0.f8320h
            int r5 = r5.f8392d
            r29 = -1
            com.fyber.inneractive.sdk.player.c.d.j r6 = r0.f8321i
            int r6 = r6.f8380b
            com.fyber.inneractive.sdk.player.c.d.j r7 = r0.f8321i
            int r7 = r7.f8381c
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            int r8 = r0.f8317e
            r9 = 2
            r8 = r8 & r9
            if (r8 == 0) goto L_0x023b
            r36 = r16
            goto L_0x023f
        L_0x023b:
            com.fyber.inneractive.sdk.player.c.f.a r8 = r0.f8325m
            r36 = r8
        L_0x023f:
            r24 = r2
            r27 = r4
            r28 = r5
            r30 = r6
            r31 = r7
            com.fyber.inneractive.sdk.player.c.h r2 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8113a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1.mo19040a(r2)
            goto L_0x0252
        L_0x0251:
            r3 = r1
        L_0x0252:
            int r1 = r0.f8329q
            if (r1 != 0) goto L_0x02c5
            r38.mo19006a()
            com.fyber.inneractive.sdk.player.c.k.k r1 = r0.f8319g
            byte[] r1 = r1.f9625a
            r2 = 4
            r4 = 1
            r5 = 0
            boolean r1 = r3.mo19011b(r1, r5, r2, r4)
            if (r1 != 0) goto L_0x0268
            r1 = -1
            return r1
        L_0x0268:
            r1 = -1
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8319g
            r2.mo19386c(r5)
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8319g
            int r2 = r2.mo19396j()
            int r4 = r0.f8324l
            long r4 = (long) r4
            boolean r4 = m7966a((int) r2, (long) r4)
            if (r4 == 0) goto L_0x02bd
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.C3274k.m8037a(r2)
            if (r4 != r1) goto L_0x0284
            goto L_0x02bd
        L_0x0284:
            com.fyber.inneractive.sdk.player.c.d.k r1 = r0.f8320h
            com.fyber.inneractive.sdk.player.p059c.p063d.C3274k.m8038a(r2, r1)
            long r1 = r0.f8327o
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x02b6
            com.fyber.inneractive.sdk.player.c.d.c.b$a r1 = r0.f8326n
            long r6 = r38.mo19012c()
            long r1 = r1.mo19034b(r6)
            r0.f8327o = r1
            long r1 = r0.f8318f
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x02b6
            com.fyber.inneractive.sdk.player.c.d.c.b$a r1 = r0.f8326n
            r4 = 0
            long r1 = r1.mo19034b(r4)
            long r4 = r0.f8327o
            long r6 = r0.f8318f
            long r6 = r6 - r1
            long r4 = r4 + r6
            r0.f8327o = r4
        L_0x02b6:
            com.fyber.inneractive.sdk.player.c.d.k r1 = r0.f8320h
            int r1 = r1.f8391c
            r0.f8329q = r1
            goto L_0x02c5
        L_0x02bd:
            r1 = 1
            r3.mo19009b(r1)
            r2 = 0
            r0.f8324l = r2
            return r2
        L_0x02c5:
            r1 = 1
            r2 = 0
            com.fyber.inneractive.sdk.player.c.d.n r4 = r0.f8323k
            int r5 = r0.f8329q
            int r1 = r4.mo19035a(r3, r5, r1)
            r3 = -1
            if (r1 != r3) goto L_0x02d3
            return r3
        L_0x02d3:
            int r3 = r0.f8329q
            int r3 = r3 - r1
            r0.f8329q = r3
            if (r3 <= 0) goto L_0x02db
            return r2
        L_0x02db:
            long r1 = r0.f8327o
            long r3 = r0.f8328p
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            com.fyber.inneractive.sdk.player.c.d.k r5 = r0.f8320h
            int r5 = r5.f8392d
            long r5 = (long) r5
            long r3 = r3 / r5
            long r6 = r1 + r3
            com.fyber.inneractive.sdk.player.c.d.n r5 = r0.f8323k
            r8 = 1
            com.fyber.inneractive.sdk.player.c.d.k r1 = r0.f8320h
            int r9 = r1.f8391c
            r10 = 0
            r11 = 0
            r5.mo19038a(r6, r8, r9, r10, r11)
            long r1 = r0.f8328p
            com.fyber.inneractive.sdk.player.c.d.k r3 = r0.f8320h
            int r3 = r3.f8395g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f8328p = r1
            r1 = 0
            r0.f8329q = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p066c.C3258b.mo18998a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00de A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7967a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r17, boolean r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            if (r18 == 0) goto L_0x0009
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x000b
        L_0x0009:
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x000b:
            r17.mo19006a()
            long r3 = r17.mo19012c()
            r5 = 0
            r7 = 4
            r8 = 1
            r9 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 0
            if (r10 != 0) goto L_0x00f3
        L_0x001c:
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8319g
            byte[] r4 = r4.f9625a
            r5 = 10
            r1.mo19014c(r4, r9, r5)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8319g
            r4.mo19386c(r9)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8319g
            int r4 = r4.mo19393g()
            int r6 = com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.f9275a
            if (r4 != r6) goto L_0x00e1
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8319g
            r6 = 3
            r4.mo19388d(r6)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8319g
            int r4 = r4.mo19399m()
            int r6 = r4 + 10
            com.fyber.inneractive.sdk.player.c.f.a r10 = r0.f8325m
            if (r10 != 0) goto L_0x00db
            byte[] r10 = new byte[r6]
            com.fyber.inneractive.sdk.player.c.k.k r11 = r0.f8319g
            byte[] r11 = r11.f9625a
            java.lang.System.arraycopy(r11, r9, r10, r9, r5)
            r1.mo19014c(r10, r5, r4)
            int r4 = r0.f8317e
            r11 = 2
            r4 = r4 & r11
            if (r4 == 0) goto L_0x005b
            com.fyber.inneractive.sdk.player.c.f.a.g$a r4 = com.fyber.inneractive.sdk.player.p059c.p063d.C3272j.f8378a
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            com.fyber.inneractive.sdk.player.c.f.a.g r13 = new com.fyber.inneractive.sdk.player.c.f.a.g
            r13.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.fyber.inneractive.sdk.player.c.k.k r14 = new com.fyber.inneractive.sdk.player.c.k.k
            r14.<init>(r10, r6)
            com.fyber.inneractive.sdk.player.c.f.a.g$b r10 = com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8535a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r14)
            if (r10 != 0) goto L_0x0073
        L_0x0071:
            r12 = 0
            goto L_0x00d1
        L_0x0073:
            int r15 = r14.f9626b
            int r5 = r10.f9277a
            if (r5 != r11) goto L_0x007b
            r5 = 6
            goto L_0x007d
        L_0x007b:
            r5 = 10
        L_0x007d:
            int r11 = r10.f9279c
            boolean r12 = r10.f9278b
            if (r12 == 0) goto L_0x0089
            int r11 = r10.f9279c
            int r11 = com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8531a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r14, (int) r11)
        L_0x0089:
            int r15 = r15 + r11
            r14.mo19384b(r15)
            int r11 = r10.f9277a
            boolean r11 = com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8539a(r14, r11, r5, r9)
            if (r11 != 0) goto L_0x00b7
            int r11 = r10.f9277a
            if (r11 != r7) goto L_0x00a1
            boolean r11 = com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8539a(r14, r7, r5, r8)
            if (r11 == 0) goto L_0x00a1
            r11 = 1
            goto L_0x00b8
        L_0x00a1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to validate ID3 tag with majorVersion="
            r4.<init>(r5)
            int r5 = r10.f9277a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Id3Decoder"
            android.util.Log.w(r5, r4)
            goto L_0x0071
        L_0x00b7:
            r11 = 0
        L_0x00b8:
            int r12 = r14.mo19383b()
            if (r12 < r5) goto L_0x00cc
            int r12 = r10.f9277a
            com.fyber.inneractive.sdk.player.c.f.a.g$a r15 = r13.f9276b
            com.fyber.inneractive.sdk.player.c.f.a.h r12 = com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.m8536a((int) r12, (com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r14, (boolean) r11, (int) r5, (com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g.C3433a) r15)
            if (r12 == 0) goto L_0x00b8
            r4.add(r12)
            goto L_0x00b8
        L_0x00cc:
            com.fyber.inneractive.sdk.player.c.f.a r12 = new com.fyber.inneractive.sdk.player.c.f.a
            r12.<init>((java.util.List<? extends com.fyber.inneractive.sdk.player.p059c.p072f.C3417a.C3419a>) r4)
        L_0x00d1:
            r0.f8325m = r12
            if (r12 == 0) goto L_0x00de
            com.fyber.inneractive.sdk.player.c.d.j r4 = r0.f8321i
            r4.mo19060a(r12)
            goto L_0x00de
        L_0x00db:
            r1.mo19013c(r4)
        L_0x00de:
            int r3 = r3 + r6
            goto L_0x001c
        L_0x00e1:
            r17.mo19006a()
            r1.mo19013c(r3)
            long r3 = r17.mo19008b()
            int r4 = (int) r3
            if (r18 != 0) goto L_0x00f1
            r1.mo19009b(r4)
        L_0x00f1:
            r3 = 0
            goto L_0x00f4
        L_0x00f3:
            r4 = 0
        L_0x00f4:
            r5 = 0
            r6 = 0
        L_0x00f6:
            com.fyber.inneractive.sdk.player.c.k.k r10 = r0.f8319g
            byte[] r10 = r10.f9625a
            if (r3 <= 0) goto L_0x00fe
            r11 = 1
            goto L_0x00ff
        L_0x00fe:
            r11 = 0
        L_0x00ff:
            boolean r10 = r1.mo19011b(r10, r9, r7, r11)
            if (r10 == 0) goto L_0x0154
            com.fyber.inneractive.sdk.player.c.k.k r10 = r0.f8319g
            r10.mo19386c(r9)
            com.fyber.inneractive.sdk.player.c.k.k r10 = r0.f8319g
            int r10 = r10.mo19396j()
            if (r5 == 0) goto L_0x0119
            long r11 = (long) r5
            boolean r11 = m7966a((int) r10, (long) r11)
            if (r11 == 0) goto L_0x0120
        L_0x0119:
            int r11 = com.fyber.inneractive.sdk.player.p059c.p063d.C3274k.m8037a(r10)
            r12 = -1
            if (r11 != r12) goto L_0x0141
        L_0x0120:
            int r3 = r6 + 1
            if (r6 != r2) goto L_0x012f
            if (r18 == 0) goto L_0x0127
            return r9
        L_0x0127:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Searched too many bytes."
            r1.<init>(r2)
            throw r1
        L_0x012f:
            if (r18 == 0) goto L_0x013a
            r17.mo19006a()
            int r5 = r4 + r3
            r1.mo19013c(r5)
            goto L_0x013d
        L_0x013a:
            r1.mo19009b(r8)
        L_0x013d:
            r6 = r3
            r3 = 0
            r5 = 0
            goto L_0x00f6
        L_0x0141:
            int r3 = r3 + 1
            if (r3 != r8) goto L_0x014c
            com.fyber.inneractive.sdk.player.c.d.k r5 = r0.f8320h
            com.fyber.inneractive.sdk.player.p059c.p063d.C3274k.m8038a(r10, r5)
            r5 = r10
            goto L_0x014e
        L_0x014c:
            if (r3 == r7) goto L_0x0154
        L_0x014e:
            int r11 = r11 + -4
            r1.mo19013c(r11)
            goto L_0x00f6
        L_0x0154:
            if (r18 == 0) goto L_0x015b
            int r4 = r4 + r6
            r1.mo19009b(r4)
            goto L_0x015e
        L_0x015b:
            r17.mo19006a()
        L_0x015e:
            r0.f8324l = r5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p066c.C3258b.m7967a(com.fyber.inneractive.sdk.player.c.d.g, boolean):boolean");
    }

    /* renamed from: b */
    private C3260a m7968b(C3269g gVar) throws IOException, InterruptedException {
        gVar.mo19014c(this.f8319g.f9625a, 0, 4);
        this.f8319g.mo19386c(0);
        C3274k.m8038a(this.f8319g.mo19396j(), this.f8320h);
        return new C3257a(gVar.mo19012c(), this.f8320h.f8394f, gVar.mo19015d());
    }
}
