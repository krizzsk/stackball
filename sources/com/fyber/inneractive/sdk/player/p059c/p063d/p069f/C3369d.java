package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3267e;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.d */
public final class C3369d implements C3373h {

    /* renamed from: b */
    private static final byte[] f8949b = {73, 68, 51};

    /* renamed from: a */
    long f8950a;

    /* renamed from: c */
    private final boolean f8951c;

    /* renamed from: d */
    private final C3547j f8952d;

    /* renamed from: e */
    private final C3548k f8953e;

    /* renamed from: f */
    private final String f8954f;

    /* renamed from: g */
    private String f8955g;

    /* renamed from: h */
    private C3278n f8956h;

    /* renamed from: i */
    private C3278n f8957i;

    /* renamed from: j */
    private int f8958j;

    /* renamed from: k */
    private int f8959k;

    /* renamed from: l */
    private int f8960l;

    /* renamed from: m */
    private boolean f8961m;

    /* renamed from: n */
    private boolean f8962n;

    /* renamed from: o */
    private long f8963o;

    /* renamed from: p */
    private int f8964p;

    /* renamed from: q */
    private C3278n f8965q;

    /* renamed from: r */
    private long f8966r;

    /* renamed from: b */
    public final void mo19160b() {
    }

    public C3369d() {
        this(true, (String) null);
    }

    public C3369d(boolean z, String str) {
        this.f8952d = new C3547j(new byte[7]);
        this.f8953e = new C3548k(Arrays.copyOf(f8949b, 10));
        mo19161c();
        this.f8951c = z;
        this.f8954f = str;
    }

    /* renamed from: a */
    public final void mo19156a() {
        mo19161c();
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f8955g = dVar.mo19183c();
        this.f8956h = hVar.mo19056a(dVar.mo19182b());
        if (this.f8951c) {
            dVar.mo19181a();
            C3278n a = hVar.mo19056a(dVar.mo19182b());
            this.f8957i = a;
            a.mo19040a(C3290h.m8121a(dVar.mo19183c(), "application/id3", (C3227a) null));
            return;
        }
        this.f8957i = new C3267e();
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        this.f8950a = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017e, code lost:
        r4 = r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19159a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
        L_0x0004:
            int r0 = r19.mo19383b()
            if (r0 <= 0) goto L_0x0193
            int r0 = r6.f8958j
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x012c
            r4 = 10
            if (r0 == r3) goto L_0x00fe
            r5 = 3
            if (r0 == r2) goto L_0x004b
            if (r0 == r5) goto L_0x001b
            goto L_0x0004
        L_0x001b:
            int r0 = r19.mo19383b()
            int r1 = r6.f8964p
            int r2 = r6.f8959k
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.fyber.inneractive.sdk.player.c.d.n r1 = r6.f8965q
            r1.mo19041a(r7, r0)
            int r1 = r6.f8959k
            int r1 = r1 + r0
            r6.f8959k = r1
            int r12 = r6.f8964p
            if (r1 != r12) goto L_0x0004
            com.fyber.inneractive.sdk.player.c.d.n r8 = r6.f8965q
            long r9 = r6.f8950a
            r11 = 1
            r13 = 0
            r14 = 0
            r8.mo19038a(r9, r11, r12, r13, r14)
            long r0 = r6.f8950a
            long r2 = r6.f8966r
            long r0 = r0 + r2
            r6.f8950a = r0
            r18.mo19161c()
            goto L_0x0004
        L_0x004b:
            boolean r0 = r6.f8961m
            r8 = 5
            if (r0 == 0) goto L_0x0052
            r0 = 7
            goto L_0x0053
        L_0x0052:
            r0 = 5
        L_0x0053:
            com.fyber.inneractive.sdk.player.c.k.j r9 = r6.f8952d
            byte[] r9 = r9.f9621a
            boolean r0 = r6.m8346a(r7, r9, r0)
            if (r0 == 0) goto L_0x0004
            com.fyber.inneractive.sdk.player.c.k.j r0 = r6.f8952d
            r0.mo19374a(r1)
            boolean r0 = r6.f8962n
            r1 = 4
            if (r0 != 0) goto L_0x00d7
            com.fyber.inneractive.sdk.player.c.k.j r0 = r6.f8952d
            int r0 = r0.mo19377c(r2)
            int r0 = r0 + r3
            if (r0 == r2) goto L_0x0089
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Detected audio object type: "
            r4.<init>(r9)
            r4.append(r0)
            java.lang.String r0 = ", but assuming AAC LC."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "AdtsReader"
            android.util.Log.w(r4, r0)
            r0 = 2
        L_0x0089:
            com.fyber.inneractive.sdk.player.c.k.j r4 = r6.f8952d
            int r4 = r4.mo19377c(r1)
            com.fyber.inneractive.sdk.player.c.k.j r9 = r6.f8952d
            r9.mo19376b(r3)
            com.fyber.inneractive.sdk.player.c.k.j r9 = r6.f8952d
            int r5 = r9.mo19377c(r5)
            byte[] r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3538c.m8789a((int) r0, (int) r4, (int) r5)
            android.util.Pair r4 = com.fyber.inneractive.sdk.player.p059c.p080k.C3538c.m8788a((byte[]) r0)
            java.lang.String r9 = r6.f8955g
            r11 = -1
            r12 = -1
            java.lang.Object r5 = r4.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r13 = r5.intValue()
            java.lang.Object r4 = r4.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r14 = r4.intValue()
            java.util.List r15 = java.util.Collections.singletonList(r0)
            r16 = 0
            java.lang.String r0 = r6.f8954f
            java.lang.String r10 = "audio/mp4a-latm"
            r17 = r0
            com.fyber.inneractive.sdk.player.c.h r0 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8115a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r9 = r0.f8506s
            long r9 = (long) r9
            long r4 = r4 / r9
            r6.f8963o = r4
            com.fyber.inneractive.sdk.player.c.d.n r4 = r6.f8956h
            r4.mo19040a(r0)
            r6.f8962n = r3
            goto L_0x00dc
        L_0x00d7:
            com.fyber.inneractive.sdk.player.c.k.j r0 = r6.f8952d
            r0.mo19376b(r4)
        L_0x00dc:
            com.fyber.inneractive.sdk.player.c.k.j r0 = r6.f8952d
            r0.mo19376b(r1)
            com.fyber.inneractive.sdk.player.c.k.j r0 = r6.f8952d
            r1 = 13
            int r0 = r0.mo19377c(r1)
            int r0 = r0 - r2
            int r0 = r0 - r8
            boolean r1 = r6.f8961m
            if (r1 == 0) goto L_0x00f1
            int r0 = r0 + -2
        L_0x00f1:
            r5 = r0
            com.fyber.inneractive.sdk.player.c.d.n r1 = r6.f8956h
            long r2 = r6.f8963o
            r4 = 0
            r0 = r18
            r0.m8345a(r1, r2, r4, r5)
            goto L_0x0004
        L_0x00fe:
            com.fyber.inneractive.sdk.player.c.k.k r0 = r6.f8953e
            byte[] r0 = r0.f9625a
            boolean r0 = r6.m8346a(r7, r0, r4)
            if (r0 == 0) goto L_0x0004
            com.fyber.inneractive.sdk.player.c.d.n r0 = r6.f8957i
            com.fyber.inneractive.sdk.player.c.k.k r1 = r6.f8953e
            r0.mo19041a(r1, r4)
            com.fyber.inneractive.sdk.player.c.k.k r0 = r6.f8953e
            r1 = 6
            r0.mo19386c(r1)
            com.fyber.inneractive.sdk.player.c.d.n r1 = r6.f8957i
            r2 = 0
            r5 = 10
            com.fyber.inneractive.sdk.player.c.k.k r0 = r6.f8953e
            int r0 = r0.mo19399m()
            int r8 = r0 + 10
            r0 = r18
            r4 = r5
            r5 = r8
            r0.m8345a(r1, r2, r4, r5)
            goto L_0x0004
        L_0x012c:
            byte[] r0 = r7.f9625a
            int r4 = r7.f9626b
            int r5 = r7.f9627c
        L_0x0132:
            if (r4 >= r5) goto L_0x018e
            int r8 = r4 + 1
            byte r4 = r0[r4]
            r9 = 255(0xff, float:3.57E-43)
            r4 = r4 & r9
            int r10 = r6.f8960l
            r11 = 512(0x200, float:7.175E-43)
            if (r10 != r11) goto L_0x0154
            r10 = 240(0xf0, float:3.36E-43)
            if (r4 < r10) goto L_0x0154
            if (r4 == r9) goto L_0x0154
            r0 = r4 & 1
            if (r0 != 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r3 = 0
        L_0x014d:
            r6.f8961m = r3
            r6.f8958j = r2
            r6.f8959k = r1
            goto L_0x017e
        L_0x0154:
            int r9 = r6.f8960l
            r4 = r4 | r9
            r10 = 329(0x149, float:4.61E-43)
            if (r4 == r10) goto L_0x0188
            r10 = 511(0x1ff, float:7.16E-43)
            if (r4 == r10) goto L_0x0185
            r10 = 836(0x344, float:1.171E-42)
            if (r4 == r10) goto L_0x0180
            r10 = 1075(0x433, float:1.506E-42)
            if (r4 == r10) goto L_0x0170
            r4 = 256(0x100, float:3.59E-43)
            if (r9 == r4) goto L_0x018c
            r6.f8960l = r4
            int r8 = r8 + -1
            goto L_0x018c
        L_0x0170:
            r6.f8958j = r3
            byte[] r0 = f8949b
            int r0 = r0.length
            r6.f8959k = r0
            r6.f8964p = r1
            com.fyber.inneractive.sdk.player.c.k.k r0 = r6.f8953e
            r0.mo19386c(r1)
        L_0x017e:
            r4 = r8
            goto L_0x018e
        L_0x0180:
            r4 = 1024(0x400, float:1.435E-42)
            r6.f8960l = r4
            goto L_0x018c
        L_0x0185:
            r6.f8960l = r11
            goto L_0x018c
        L_0x0188:
            r4 = 768(0x300, float:1.076E-42)
            r6.f8960l = r4
        L_0x018c:
            r4 = r8
            goto L_0x0132
        L_0x018e:
            r7.mo19386c(r4)
            goto L_0x0004
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3369d.mo19159a(com.fyber.inneractive.sdk.player.c.k.k):void");
    }

    /* renamed from: a */
    private boolean m8346a(C3548k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo19383b(), i - this.f8959k);
        kVar.mo19382a(bArr, this.f8959k, min);
        int i2 = this.f8959k + min;
        this.f8959k = i2;
        return i2 == i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo19161c() {
        this.f8958j = 0;
        this.f8959k = 0;
        this.f8960l = 256;
    }

    /* renamed from: a */
    private void m8345a(C3278n nVar, long j, int i, int i2) {
        this.f8958j = 3;
        this.f8959k = i;
        this.f8965q = nVar;
        this.f8966r = j;
        this.f8964p = i2;
    }
}
