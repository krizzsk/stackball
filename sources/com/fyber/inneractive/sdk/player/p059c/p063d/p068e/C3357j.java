package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.j */
final class C3357j extends C3353h {

    /* renamed from: a */
    private C3358a f8893a;

    /* renamed from: d */
    private int f8894d;

    /* renamed from: e */
    private boolean f8895e;

    /* renamed from: f */
    private C3359k.C3363d f8896f;

    /* renamed from: g */
    private C3359k.C3361b f8897g;

    C3357j() {
    }

    /* renamed from: b */
    public static boolean m8319b(C3548k kVar) {
        try {
            return C3359k.m8326a(1, kVar, true);
        } catch (C3295l unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19141a(boolean z) {
        super.mo19141a(z);
        if (z) {
            this.f8893a = null;
            this.f8896f = null;
            this.f8897g = null;
        }
        this.f8894d = 0;
        this.f8895e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo19152c(long j) {
        super.mo19152c(j);
        int i = 0;
        this.f8895e = j != 0;
        C3359k.C3363d dVar = this.f8896f;
        if (dVar != null) {
            i = dVar.f8921g;
        }
        this.f8894d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo19140a(C3548k kVar) {
        int i;
        int i2 = 0;
        if ((kVar.f9625a[0] & 1) == 1) {
            return -1;
        }
        byte b = kVar.f9625a[0];
        C3358a aVar = this.f8893a;
        if (!aVar.f8901d[(b >> 1) & (255 >>> (8 - aVar.f8902e))].f8911a) {
            i = aVar.f8898a.f8921g;
        } else {
            i = aVar.f8898a.f8922h;
        }
        if (this.f8895e) {
            i2 = (this.f8894d + i) / 4;
        }
        long j = (long) i2;
        kVar.mo19384b(kVar.f9627c + 4);
        kVar.f9625a[kVar.f9627c - 4] = (byte) ((int) (j & 255));
        kVar.f9625a[kVar.f9627c - 3] = (byte) ((int) ((j >>> 8) & 255));
        kVar.f9625a[kVar.f9627c - 2] = (byte) ((int) ((j >>> 16) & 255));
        kVar.f9625a[kVar.f9627c - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f8895e = true;
        this.f8894d = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0223 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0225  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19142a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r21, long r22, com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3353h.C3354a r24) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.fyber.inneractive.sdk.player.c.d.e.j$a r2 = r0.f8893a
            r3 = 0
            if (r2 == 0) goto L_0x000a
            return r3
        L_0x000a:
            com.fyber.inneractive.sdk.player.c.d.e.k$d r2 = r0.f8896f
            r5 = 4
            r6 = 1
            if (r2 != 0) goto L_0x0066
            com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8326a(r6, r1, r3)
            long r8 = r21.mo19395i()
            int r10 = r21.mo19387d()
            long r11 = r21.mo19395i()
            int r13 = r21.mo19397k()
            int r14 = r21.mo19397k()
            int r15 = r21.mo19397k()
            int r2 = r21.mo19387d()
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
            int r4 = r21.mo19387d()
            r5 = 1
            r4 = r4 & r5
            if (r4 <= 0) goto L_0x004d
            r18 = 1
            goto L_0x004f
        L_0x004d:
            r18 = 0
        L_0x004f:
            byte[] r4 = r1.f9625a
            int r1 = r1.f9627c
            byte[] r19 = java.util.Arrays.copyOf(r4, r1)
            com.fyber.inneractive.sdk.player.c.d.e.k$d r1 = new com.fyber.inneractive.sdk.player.c.d.e.k$d
            r7 = r1
            r16 = r3
            r17 = r2
            r7.<init>(r8, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r0.f8896f = r1
        L_0x0063:
            r4 = 0
            goto L_0x021f
        L_0x0066:
            com.fyber.inneractive.sdk.player.c.d.e.k$b r2 = r0.f8897g
            if (r2 != 0) goto L_0x00bd
            r2 = 3
            r3 = 0
            com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8326a(r2, r1, r3)
            long r2 = r21.mo19395i()
            int r3 = (int) r2
            java.lang.String r2 = r1.mo19390e(r3)
            int r3 = r2.length()
            int r3 = r3 + 11
            long r6 = r21.mo19395i()
            int r4 = (int) r6
            java.lang.String[] r4 = new java.lang.String[r4]
            int r3 = r3 + r5
            r5 = r3
            r3 = 0
        L_0x0088:
            long r8 = (long) r3
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a4
            long r8 = r21.mo19395i()
            int r9 = (int) r8
            int r5 = r5 + 4
            java.lang.String r8 = r1.mo19390e(r9)
            r4[r3] = r8
            r8 = r4[r3]
            int r8 = r8.length()
            int r5 = r5 + r8
            int r3 = r3 + 1
            goto L_0x0088
        L_0x00a4:
            int r1 = r21.mo19387d()
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00b5
            int r5 = r5 + r3
            com.fyber.inneractive.sdk.player.c.d.e.k$b r1 = new com.fyber.inneractive.sdk.player.c.d.e.k$b
            r1.<init>(r2, r4, r5)
            r0.f8897g = r1
            goto L_0x0063
        L_0x00b5:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "framing bit expected to be set"
            r1.<init>(r2)
            throw r1
        L_0x00bd:
            int r2 = r1.f9627c
            byte[] r9 = new byte[r2]
            byte[] r2 = r1.f9625a
            int r3 = r1.f9627c
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r9, r4, r3)
            com.fyber.inneractive.sdk.player.c.d.e.k$d r2 = r0.f8896f
            int r2 = r2.f8916b
            r3 = 5
            com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8326a(r3, r1, r4)
            int r6 = r21.mo19387d()
            r7 = 1
            int r6 = r6 + r7
            com.fyber.inneractive.sdk.player.c.d.e.i r7 = new com.fyber.inneractive.sdk.player.c.d.e.i
            byte[] r8 = r1.f9625a
            r7.<init>(r8)
            int r1 = r1.f9626b
            int r1 = r1 * 8
            r7.mo19155b(r1)
            r1 = 0
        L_0x00e6:
            r8 = 16
            if (r1 >= r6) goto L_0x01e0
            r10 = 24
            int r11 = r7.mo19153a(r10)
            r12 = 5653314(0x564342, float:7.92198E-39)
            if (r11 != r12) goto L_0x01c5
            int r14 = r7.mo19153a(r8)
            int r15 = r7.mo19153a(r10)
            long[] r8 = new long[r15]
            boolean r18 = r7.mo19154a()
            r10 = 0
            if (r18 != 0) goto L_0x012c
            boolean r12 = r7.mo19154a()
            r13 = 0
        L_0x010c:
            if (r13 >= r15) goto L_0x015e
            if (r12 == 0) goto L_0x011b
            boolean r16 = r7.mo19154a()
            if (r16 != 0) goto L_0x011b
            r8[r13] = r10
            r17 = 1
            goto L_0x0126
        L_0x011b:
            int r16 = r7.mo19153a(r3)
            r17 = 1
            int r4 = r16 + 1
            long r10 = (long) r4
            r8[r13] = r10
        L_0x0126:
            int r13 = r13 + 1
            r4 = 0
            r10 = 0
            goto L_0x010c
        L_0x012c:
            r17 = 1
            int r4 = r7.mo19153a(r3)
            int r4 = r4 + 1
            r10 = r4
            r4 = 0
        L_0x0136:
            if (r4 >= r15) goto L_0x015e
            int r11 = r15 - r4
            int r11 = com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8324a((int) r11)
            int r11 = r7.mo19153a(r11)
            r12 = r4
            r4 = 0
        L_0x0144:
            if (r4 >= r11) goto L_0x0155
            if (r12 >= r15) goto L_0x0155
            r19 = r6
            long r5 = (long) r10
            r8[r12] = r5
            int r12 = r12 + 1
            int r4 = r4 + 1
            r6 = r19
            r5 = 4
            goto L_0x0144
        L_0x0155:
            r19 = r6
            int r10 = r10 + 1
            r4 = r12
            r6 = r19
            r5 = 4
            goto L_0x0136
        L_0x015e:
            r19 = r6
            r4 = 4
            int r5 = r7.mo19153a(r4)
            r6 = 2
            if (r5 > r6) goto L_0x01b1
            r10 = 1
            if (r5 == r10) goto L_0x016d
            if (r5 != r6) goto L_0x01a0
        L_0x016d:
            r6 = 32
            r7.mo19155b(r6)
            r7.mo19155b(r6)
            int r6 = r7.mo19153a(r4)
            int r6 = r6 + r10
            r7.mo19155b(r10)
            if (r5 != r10) goto L_0x0196
            if (r14 == 0) goto L_0x0193
            long r10 = (long) r15
            long r12 = (long) r14
            double r10 = (double) r10
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = (double) r12
            double r12 = r16 / r12
            double r10 = java.lang.Math.pow(r10, r12)
            double r10 = java.lang.Math.floor(r10)
            long r10 = (long) r10
            goto L_0x0199
        L_0x0193:
            r10 = 0
            goto L_0x0199
        L_0x0196:
            int r10 = r15 * r14
            long r10 = (long) r10
        L_0x0199:
            long r12 = (long) r6
            long r10 = r10 * r12
            int r6 = (int) r10
            r7.mo19155b(r6)
        L_0x01a0:
            com.fyber.inneractive.sdk.player.c.d.e.k$a r13 = new com.fyber.inneractive.sdk.player.c.d.e.k$a
            r16 = r8
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            int r1 = r1 + 1
            r6 = r19
            r4 = 0
            r5 = 4
            goto L_0x00e6
        L_0x01b1:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "lookup type greater than 2 not decodable: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c5:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r2.<init>(r3)
            int r3 = r7.f8889a
            int r3 = r3 * 8
            int r4 = r7.f8890b
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01e0:
            r1 = 6
            int r1 = r7.mo19153a(r1)
            r3 = 1
            int r1 = r1 + r3
            r3 = 0
        L_0x01e8:
            if (r3 >= r1) goto L_0x01fb
            int r4 = r7.mo19153a(r8)
            if (r4 != 0) goto L_0x01f3
            int r3 = r3 + 1
            goto L_0x01e8
        L_0x01f3:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>(r2)
            throw r1
        L_0x01fb:
            com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8329c(r7)
            com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8328b(r7)
            com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8325a(r2, r7)
            com.fyber.inneractive.sdk.player.c.d.e.k$c[] r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8327a((com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3356i) r7)
            boolean r1 = r7.mo19154a()
            if (r1 == 0) goto L_0x025d
            int r1 = r10.length
            r2 = 1
            int r1 = r1 - r2
            int r11 = com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3359k.m8324a((int) r1)
            com.fyber.inneractive.sdk.player.c.d.e.j$a r4 = new com.fyber.inneractive.sdk.player.c.d.e.j$a
            com.fyber.inneractive.sdk.player.c.d.e.k$d r7 = r0.f8896f
            com.fyber.inneractive.sdk.player.c.d.e.k$b r8 = r0.f8897g
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x021f:
            r0.f8893a = r4
            if (r4 != 0) goto L_0x0225
            r1 = 1
            return r1
        L_0x0225:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.fyber.inneractive.sdk.player.c.d.e.j$a r1 = r0.f8893a
            com.fyber.inneractive.sdk.player.c.d.e.k$d r1 = r1.f8898a
            byte[] r1 = r1.f8924j
            r8.add(r1)
            com.fyber.inneractive.sdk.player.c.d.e.j$a r1 = r0.f8893a
            byte[] r1 = r1.f8900c
            r8.add(r1)
            r2 = 0
            com.fyber.inneractive.sdk.player.c.d.e.j$a r1 = r0.f8893a
            com.fyber.inneractive.sdk.player.c.d.e.k$d r1 = r1.f8898a
            int r4 = r1.f8919e
            r5 = -1
            com.fyber.inneractive.sdk.player.c.d.e.j$a r1 = r0.f8893a
            com.fyber.inneractive.sdk.player.c.d.e.k$d r1 = r1.f8898a
            int r6 = r1.f8916b
            com.fyber.inneractive.sdk.player.c.d.e.j$a r1 = r0.f8893a
            com.fyber.inneractive.sdk.player.c.d.e.k$d r1 = r1.f8898a
            long r9 = r1.f8917c
            int r7 = (int) r9
            r9 = 0
            r10 = 0
            java.lang.String r3 = "audio/vorbis"
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8115a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r24
            r2.f8887a = r1
            r1 = 1
            return r1
        L_0x025d:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3357j.mo19142a(com.fyber.inneractive.sdk.player.c.k.k, long, com.fyber.inneractive.sdk.player.c.d.e.h$a):boolean");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.j$a */
    static final class C3358a {

        /* renamed from: a */
        public final C3359k.C3363d f8898a;

        /* renamed from: b */
        public final C3359k.C3361b f8899b;

        /* renamed from: c */
        public final byte[] f8900c;

        /* renamed from: d */
        public final C3359k.C3362c[] f8901d;

        /* renamed from: e */
        public final int f8902e;

        public C3358a(C3359k.C3363d dVar, C3359k.C3361b bVar, byte[] bArr, C3359k.C3362c[] cVarArr, int i) {
            this.f8898a = dVar;
            this.f8899b = bVar;
            this.f8900c = bArr;
            this.f8901d = cVarArr;
            this.f8902e = i;
        }
    }
}
