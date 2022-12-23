package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.i */
public final class C3374i implements C3373h {

    /* renamed from: c */
    private static final double[] f8986c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f8987a;

    /* renamed from: b */
    private C3278n f8988b;

    /* renamed from: d */
    private boolean f8989d;

    /* renamed from: e */
    private long f8990e;

    /* renamed from: f */
    private final boolean[] f8991f = new boolean[4];

    /* renamed from: g */
    private final C3375a f8992g = new C3375a();

    /* renamed from: h */
    private boolean f8993h;

    /* renamed from: i */
    private long f8994i;

    /* renamed from: j */
    private long f8995j;

    /* renamed from: k */
    private boolean f8996k;

    /* renamed from: l */
    private boolean f8997l;

    /* renamed from: m */
    private long f8998m;

    /* renamed from: n */
    private long f8999n;

    /* renamed from: b */
    public final void mo19160b() {
    }

    /* renamed from: a */
    public final void mo19156a() {
        C3544i.m8807a(this.f8991f);
        C3375a aVar = this.f8992g;
        aVar.f9000a = false;
        aVar.f9001b = 0;
        aVar.f9002c = 0;
        this.f8996k = false;
        this.f8993h = false;
        this.f8994i = 0;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f8987a = dVar.mo19183c();
        this.f8988b = hVar.mo19056a(dVar.mo19182b());
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        boolean z2 = j != -9223372036854775807L;
        this.f8996k = z2;
        if (z2) {
            this.f8995j = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.i$a */
    private static final class C3375a {

        /* renamed from: a */
        boolean f9000a;

        /* renamed from: b */
        public int f9001b;

        /* renamed from: c */
        public int f9002c;

        /* renamed from: d */
        public byte[] f9003d = new byte[128];

        /* renamed from: a */
        public final void mo19164a(byte[] bArr, int i, int i2) {
            if (this.f9000a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f9003d;
                int length = bArr2.length;
                int i4 = this.f9001b;
                if (length < i4 + i3) {
                    this.f9003d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f9003d, this.f9001b, i3);
                this.f9001b += i3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19159a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r1.f9626b
            int r3 = r1.f9627c
            byte[] r4 = r1.f9625a
            long r5 = r0.f8994i
            int r7 = r20.mo19383b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f8994i = r5
            com.fyber.inneractive.sdk.player.c.d.n r5 = r0.f8988b
            int r6 = r20.mo19383b()
            r5.mo19041a(r1, r6)
            r5 = r2
        L_0x001e:
            boolean[] r6 = r0.f8991f
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8804a(r4, r2, r3, r6)
            if (r2 != r3) goto L_0x0030
            boolean r1 = r0.f8989d
            if (r1 != 0) goto L_0x002f
            com.fyber.inneractive.sdk.player.c.d.f.i$a r1 = r0.f8992g
            r1.mo19164a(r4, r5, r3)
        L_0x002f:
            return
        L_0x0030:
            byte[] r6 = r1.f9625a
            int r7 = r2 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            boolean r8 = r0.f8989d
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x011c
            int r8 = r2 - r5
            if (r8 <= 0) goto L_0x0047
            com.fyber.inneractive.sdk.player.c.d.f.i$a r11 = r0.f8992g
            r11.mo19164a(r4, r5, r2)
        L_0x0047:
            if (r8 >= 0) goto L_0x004b
            int r5 = -r8
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            com.fyber.inneractive.sdk.player.c.d.f.i$a r8 = r0.f8992g
            boolean r11 = r8.f9000a
            if (r11 == 0) goto L_0x0068
            int r11 = r8.f9002c
            if (r11 != 0) goto L_0x005f
            r11 = 181(0xb5, float:2.54E-43)
            if (r6 != r11) goto L_0x005f
            int r5 = r8.f9001b
            r8.f9002c = r5
            goto L_0x006e
        L_0x005f:
            int r11 = r8.f9001b
            int r11 = r11 - r5
            r8.f9001b = r11
            r8.f9000a = r9
            r5 = 1
            goto L_0x006f
        L_0x0068:
            r5 = 179(0xb3, float:2.51E-43)
            if (r6 != r5) goto L_0x006e
            r8.f9000a = r10
        L_0x006e:
            r5 = 0
        L_0x006f:
            if (r5 == 0) goto L_0x011c
            com.fyber.inneractive.sdk.player.c.d.f.i$a r5 = r0.f8992g
            java.lang.String r11 = r0.f8987a
            byte[] r8 = r5.f9003d
            int r12 = r5.f9001b
            byte[] r8 = java.util.Arrays.copyOf(r8, r12)
            r12 = 4
            byte r13 = r8[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r17 = 5
            byte r14 = r8[r17]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 6
            byte r15 = r8[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r12
            int r16 = r14 >> 4
            r13 = r13 | r16
            r14 = r14 & 15
            int r14 = r14 << 8
            r14 = r14 | r15
            r18 = 7
            byte r15 = r8[r18]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r12
            r9 = 2
            if (r15 == r9) goto L_0x00b5
            r9 = 3
            if (r15 == r9) goto L_0x00af
            if (r15 == r12) goto L_0x00a9
            r16 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00be
        L_0x00a9:
            int r9 = r14 * 121
            float r9 = (float) r9
            int r12 = r13 * 100
            goto L_0x00ba
        L_0x00af:
            int r9 = r14 * 16
            float r9 = (float) r9
            int r12 = r13 * 9
            goto L_0x00ba
        L_0x00b5:
            int r9 = r14 * 4
            float r9 = (float) r9
            int r12 = r13 * 3
        L_0x00ba:
            float r12 = (float) r12
            float r9 = r9 / r12
            r16 = r9
        L_0x00be:
            java.util.List r15 = java.util.Collections.singletonList(r8)
            java.lang.String r12 = "video/mpeg2"
            com.fyber.inneractive.sdk.player.c.h r9 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8117a(r11, r12, r13, r14, r15, r16)
            r11 = 0
            byte r13 = r8[r18]
            r13 = r13 & 15
            int r13 = r13 - r10
            if (r13 < 0) goto L_0x00fd
            double[] r14 = f8986c
            int r15 = r14.length
            if (r13 >= r15) goto L_0x00fd
            r11 = r14[r13]
            int r5 = r5.f9002c
            int r5 = r5 + 9
            byte r13 = r8[r5]
            r13 = r13 & 96
            int r13 = r13 >> 5
            byte r5 = r8[r5]
            r5 = r5 & 31
            if (r13 == r5) goto L_0x00f4
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r15
            int r5 = r5 + 1
            r8 = r4
            double r4 = (double) r5
            double r13 = r13 / r4
            double r11 = r11 * r13
            goto L_0x00f5
        L_0x00f4:
            r8 = r4
        L_0x00f5:
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r11
            long r11 = (long) r4
            goto L_0x00fe
        L_0x00fd:
            r8 = r4
        L_0x00fe:
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            android.util.Pair r4 = android.util.Pair.create(r9, r4)
            com.fyber.inneractive.sdk.player.c.d.n r5 = r0.f8988b
            java.lang.Object r9 = r4.first
            com.fyber.inneractive.sdk.player.c.h r9 = (com.fyber.inneractive.sdk.player.p059c.C3290h) r9
            r5.mo19040a(r9)
            java.lang.Object r4 = r4.second
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.f8990e = r4
            r0.f8989d = r10
            goto L_0x011d
        L_0x011c:
            r8 = r4
        L_0x011d:
            boolean r4 = r0.f8989d
            if (r4 == 0) goto L_0x016f
            r4 = 184(0xb8, float:2.58E-43)
            if (r6 == r4) goto L_0x0127
            if (r6 != 0) goto L_0x016f
        L_0x0127:
            int r5 = r3 - r2
            boolean r9 = r0.f8993h
            if (r9 == 0) goto L_0x0148
            boolean r14 = r0.f8997l
            long r11 = r0.f8994i
            r18 = r5
            long r4 = r0.f8998m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r15 = r4 - r18
            com.fyber.inneractive.sdk.player.c.d.n r11 = r0.f8988b
            long r12 = r0.f8999n
            r17 = 0
            r16 = r18
            r11.mo19038a(r12, r14, r15, r16, r17)
            r4 = 0
            r0.f8997l = r4
            goto L_0x014b
        L_0x0148:
            r18 = r5
            r4 = 0
        L_0x014b:
            r5 = 184(0xb8, float:2.58E-43)
            if (r6 != r5) goto L_0x0154
            r0.f8993h = r4
            r0.f8997l = r10
            goto L_0x016f
        L_0x0154:
            boolean r4 = r0.f8996k
            if (r4 == 0) goto L_0x015b
            long r4 = r0.f8995j
            goto L_0x0160
        L_0x015b:
            long r4 = r0.f8999n
            long r11 = r0.f8990e
            long r4 = r4 + r11
        L_0x0160:
            r0.f8999n = r4
            long r4 = r0.f8994i
            r6 = r18
            long r11 = (long) r6
            long r4 = r4 - r11
            r0.f8998m = r4
            r4 = 0
            r0.f8996k = r4
            r0.f8993h = r10
        L_0x016f:
            r5 = r2
            r2 = r7
            r4 = r8
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3374i.mo19159a(com.fyber.inneractive.sdk.player.c.k.k):void");
    }
}
