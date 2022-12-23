package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.k */
public final class C3379k implements C3373h {

    /* renamed from: a */
    private final C3390s f9052a;

    /* renamed from: b */
    private String f9053b;

    /* renamed from: c */
    private C3278n f9054c;

    /* renamed from: d */
    private C3380a f9055d;

    /* renamed from: e */
    private boolean f9056e;

    /* renamed from: f */
    private final boolean[] f9057f = new boolean[3];

    /* renamed from: g */
    private final C3383n f9058g = new C3383n(32);

    /* renamed from: h */
    private final C3383n f9059h = new C3383n(33);

    /* renamed from: i */
    private final C3383n f9060i = new C3383n(34);

    /* renamed from: j */
    private final C3383n f9061j = new C3383n(39);

    /* renamed from: k */
    private final C3383n f9062k = new C3383n(40);

    /* renamed from: l */
    private long f9063l;

    /* renamed from: m */
    private long f9064m;

    /* renamed from: n */
    private final C3548k f9065n = new C3548k();

    /* renamed from: b */
    public final void mo19160b() {
    }

    public C3379k(C3390s sVar) {
        this.f9052a = sVar;
    }

    /* renamed from: a */
    public final void mo19156a() {
        C3544i.m8807a(this.f9057f);
        this.f9058g.mo19170a();
        this.f9059h.mo19170a();
        this.f9060i.mo19170a();
        this.f9061j.mo19170a();
        this.f9062k.mo19170a();
        C3380a aVar = this.f9055d;
        aVar.f9070e = false;
        aVar.f9071f = false;
        aVar.f9072g = false;
        aVar.f9073h = false;
        aVar.f9074i = false;
        this.f9063l = 0;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f9053b = dVar.mo19183c();
        C3278n a = hVar.mo19056a(dVar.mo19182b());
        this.f9054c = a;
        this.f9055d = new C3380a(a);
        this.f9052a.mo19180a(hVar, dVar);
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        this.f9064m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0391  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19159a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r29) {
        /*
            r28 = this;
            r0 = r28
        L_0x0002:
            r1 = r29
            int r2 = r29.mo19383b()
            if (r2 <= 0) goto L_0x03b4
            int r2 = r1.f9626b
            int r3 = r1.f9627c
            byte[] r4 = r1.f9625a
            long r5 = r0.f9063l
            int r7 = r29.mo19383b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f9063l = r5
            com.fyber.inneractive.sdk.player.c.d.n r5 = r0.f9054c
            int r6 = r29.mo19383b()
            r5.mo19041a(r1, r6)
        L_0x0023:
            if (r2 >= r3) goto L_0x0002
            boolean[] r5 = r0.f9057f
            int r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8804a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0031
            r0.m8389a(r4, r2, r3)
            return
        L_0x0031:
            int r6 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8810c(r4, r5)
            int r7 = r5 - r2
            if (r7 <= 0) goto L_0x003c
            r0.m8389a(r4, r2, r5)
        L_0x003c:
            int r2 = r3 - r5
            long r8 = r0.f9063l
            long r10 = (long) r2
            long r8 = r8 - r10
            r10 = 0
            if (r7 >= 0) goto L_0x0047
            int r7 = -r7
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            long r11 = r0.f9064m
            boolean r13 = r0.f9056e
            r15 = 1
            if (r13 == 0) goto L_0x0095
            com.fyber.inneractive.sdk.player.c.d.f.k$a r13 = r0.f9055d
            boolean r14 = r13.f9074i
            if (r14 == 0) goto L_0x0069
            boolean r14 = r13.f9071f
            if (r14 == 0) goto L_0x0069
            boolean r14 = r13.f9067b
            r13.f9077l = r14
            r13.f9074i = r10
            r24 = r3
            r25 = r4
            r26 = r5
            r16 = r11
            goto L_0x02eb
        L_0x0069:
            boolean r14 = r13.f9072g
            if (r14 != 0) goto L_0x0076
            boolean r14 = r13.f9071f
            if (r14 == 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r16 = r11
            goto L_0x02e5
        L_0x0076:
            boolean r14 = r13.f9073h
            r16 = r11
            if (r14 == 0) goto L_0x0085
            long r10 = r13.f9066a
            long r10 = r8 - r10
            int r11 = (int) r10
            int r11 = r11 + r2
            r13.mo19169a(r11)
        L_0x0085:
            long r10 = r13.f9066a
            r13.f9075j = r10
            long r10 = r13.f9069d
            r13.f9076k = r10
            r13.f9073h = r15
            boolean r10 = r13.f9067b
            r13.f9077l = r10
            goto L_0x02e5
        L_0x0095:
            r16 = r11
            com.fyber.inneractive.sdk.player.c.d.f.n r10 = r0.f9058g
            r10.mo19173b(r7)
            com.fyber.inneractive.sdk.player.c.d.f.n r10 = r0.f9059h
            r10.mo19173b(r7)
            com.fyber.inneractive.sdk.player.c.d.f.n r10 = r0.f9060i
            r10.mo19173b(r7)
            com.fyber.inneractive.sdk.player.c.d.f.n r10 = r0.f9058g
            boolean r10 = r10.f9097a
            if (r10 == 0) goto L_0x02e5
            com.fyber.inneractive.sdk.player.c.d.f.n r10 = r0.f9059h
            boolean r10 = r10.f9097a
            if (r10 == 0) goto L_0x02e5
            com.fyber.inneractive.sdk.player.c.d.f.n r10 = r0.f9060i
            boolean r10 = r10.f9097a
            if (r10 == 0) goto L_0x02e5
            com.fyber.inneractive.sdk.player.c.d.n r10 = r0.f9054c
            java.lang.String r11 = r0.f9053b
            com.fyber.inneractive.sdk.player.c.d.f.n r12 = r0.f9058g
            com.fyber.inneractive.sdk.player.c.d.f.n r13 = r0.f9059h
            com.fyber.inneractive.sdk.player.c.d.f.n r14 = r0.f9060i
            int r15 = r12.f9099c
            int r1 = r13.f9099c
            int r15 = r15 + r1
            int r1 = r14.f9099c
            int r15 = r15 + r1
            byte[] r1 = new byte[r15]
            byte[] r15 = r12.f9098b
            r24 = r3
            int r3 = r12.f9099c
            r25 = r4
            r4 = 0
            java.lang.System.arraycopy(r15, r4, r1, r4, r3)
            byte[] r3 = r13.f9098b
            int r15 = r12.f9099c
            r26 = r5
            int r5 = r13.f9099c
            java.lang.System.arraycopy(r3, r4, r1, r15, r5)
            byte[] r3 = r14.f9098b
            int r5 = r12.f9099c
            int r12 = r13.f9099c
            int r5 = r5 + r12
            int r12 = r14.f9099c
            java.lang.System.arraycopy(r3, r4, r1, r5, r12)
            com.fyber.inneractive.sdk.player.c.k.l r3 = new com.fyber.inneractive.sdk.player.c.k.l
            byte[] r5 = r13.f9098b
            int r12 = r13.f9099c
            r3.<init>(r5, r4, r12)
            r4 = 44
            r3.mo19405a(r4)
            r4 = 3
            int r5 = r3.mo19409c(r4)
            r3.mo19404a()
            r12 = 88
            r3.mo19405a(r12)
            r12 = 8
            r3.mo19405a(r12)
            r13 = 0
            r15 = 0
        L_0x0111:
            if (r13 >= r5) goto L_0x0126
            boolean r18 = r3.mo19407b()
            if (r18 == 0) goto L_0x011b
            int r15 = r15 + 89
        L_0x011b:
            boolean r18 = r3.mo19407b()
            if (r18 == 0) goto L_0x0123
            int r15 = r15 + 8
        L_0x0123:
            int r13 = r13 + 1
            goto L_0x0111
        L_0x0126:
            r3.mo19405a(r15)
            r13 = 2
            if (r5 <= 0) goto L_0x0133
            int r15 = 8 - r5
            int r15 = r15 * 2
            r3.mo19405a(r15)
        L_0x0133:
            r3.mo19412e()
            int r15 = r3.mo19412e()
            if (r15 != r4) goto L_0x013f
            r3.mo19404a()
        L_0x013f:
            int r18 = r3.mo19412e()
            int r19 = r3.mo19412e()
            boolean r20 = r3.mo19407b()
            if (r20 == 0) goto L_0x0179
            int r20 = r3.mo19412e()
            int r21 = r3.mo19412e()
            int r22 = r3.mo19412e()
            int r23 = r3.mo19412e()
            r14 = 1
            if (r15 == r14) goto L_0x0166
            if (r15 != r13) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            r27 = 1
            goto L_0x0168
        L_0x0166:
            r27 = 2
        L_0x0168:
            if (r15 != r14) goto L_0x016c
            r14 = 2
            goto L_0x016d
        L_0x016c:
            r14 = 1
        L_0x016d:
            int r20 = r20 + r21
            int r27 = r27 * r20
            int r18 = r18 - r27
            int r22 = r22 + r23
            int r14 = r14 * r22
            int r19 = r19 - r14
        L_0x0179:
            r20 = r18
            r21 = r19
            r3.mo19412e()
            r3.mo19412e()
            int r14 = r3.mo19412e()
            boolean r15 = r3.mo19407b()
            if (r15 == 0) goto L_0x0190
            r18 = 0
            goto L_0x0192
        L_0x0190:
            r18 = r5
        L_0x0192:
            r15 = r18
        L_0x0194:
            if (r15 > r5) goto L_0x01a2
            r3.mo19412e()
            r3.mo19412e()
            r3.mo19412e()
            int r15 = r15 + 1
            goto L_0x0194
        L_0x01a2:
            r3.mo19412e()
            r3.mo19412e()
            r3.mo19412e()
            r3.mo19412e()
            r3.mo19412e()
            r3.mo19412e()
            boolean r5 = r3.mo19407b()
            r15 = 4
            if (r5 == 0) goto L_0x01fd
            boolean r5 = r3.mo19407b()
            if (r5 == 0) goto L_0x01fd
            r5 = 0
        L_0x01c2:
            if (r5 >= r15) goto L_0x01fd
            r12 = 0
        L_0x01c5:
            r13 = 6
            if (r12 >= r13) goto L_0x01f6
            boolean r13 = r3.mo19407b()
            if (r13 != 0) goto L_0x01d2
            r3.mo19412e()
            goto L_0x01ee
        L_0x01d2:
            r13 = 64
            int r22 = r5 << 1
            int r22 = r22 + 4
            r15 = 1
            int r4 = r15 << r22
            int r4 = java.lang.Math.min(r13, r4)
            if (r5 <= r15) goto L_0x01e4
            r3.mo19411d()
        L_0x01e4:
            r13 = 0
        L_0x01e5:
            if (r13 >= r4) goto L_0x01ed
            r3.mo19411d()
            int r13 = r13 + 1
            goto L_0x01e5
        L_0x01ed:
            r4 = 3
        L_0x01ee:
            if (r5 != r4) goto L_0x01f2
            r13 = 3
            goto L_0x01f3
        L_0x01f2:
            r13 = 1
        L_0x01f3:
            int r12 = r12 + r13
            r15 = 4
            goto L_0x01c5
        L_0x01f6:
            int r5 = r5 + 1
            r12 = 8
            r13 = 2
            r15 = 4
            goto L_0x01c2
        L_0x01fd:
            r4 = 2
            r3.mo19405a(r4)
            boolean r4 = r3.mo19407b()
            if (r4 == 0) goto L_0x0215
            r4 = 8
            r3.mo19405a(r4)
            r3.mo19412e()
            r3.mo19412e()
            r3.mo19404a()
        L_0x0215:
            int r4 = r3.mo19412e()
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x021c:
            if (r5 >= r4) goto L_0x0269
            if (r5 == 0) goto L_0x0224
            boolean r12 = r3.mo19407b()
        L_0x0224:
            if (r12 == 0) goto L_0x023e
            r3.mo19404a()
            r3.mo19412e()
            r15 = 0
        L_0x022d:
            if (r15 > r13) goto L_0x023b
            boolean r22 = r3.mo19407b()
            if (r22 == 0) goto L_0x0238
            r3.mo19404a()
        L_0x0238:
            int r15 = r15 + 1
            goto L_0x022d
        L_0x023b:
            r27 = r4
            goto L_0x0264
        L_0x023e:
            int r13 = r3.mo19412e()
            int r15 = r3.mo19412e()
            int r22 = r13 + r15
            r27 = r4
            r4 = 0
        L_0x024b:
            if (r4 >= r13) goto L_0x0256
            r3.mo19412e()
            r3.mo19404a()
            int r4 = r4 + 1
            goto L_0x024b
        L_0x0256:
            r4 = 0
        L_0x0257:
            if (r4 >= r15) goto L_0x0262
            r3.mo19412e()
            r3.mo19404a()
            int r4 = r4 + 1
            goto L_0x0257
        L_0x0262:
            r13 = r22
        L_0x0264:
            int r5 = r5 + 1
            r4 = r27
            goto L_0x021c
        L_0x0269:
            boolean r4 = r3.mo19407b()
            if (r4 == 0) goto L_0x0281
            r4 = 0
        L_0x0270:
            int r5 = r3.mo19412e()
            if (r4 >= r5) goto L_0x0281
            r5 = 4
            int r15 = r14 + 4
            r12 = 1
            int r15 = r15 + r12
            r3.mo19405a(r15)
            int r4 = r4 + 1
            goto L_0x0270
        L_0x0281:
            r4 = 2
            r3.mo19405a(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            boolean r5 = r3.mo19407b()
            if (r5 == 0) goto L_0x02d0
            boolean r5 = r3.mo19407b()
            if (r5 == 0) goto L_0x02d0
            r5 = 8
            int r5 = r3.mo19409c(r5)
            r12 = 255(0xff, float:3.57E-43)
            if (r5 != r12) goto L_0x02b1
            r12 = 16
            int r5 = r3.mo19409c(r12)
            int r3 = r3.mo19409c(r12)
            if (r5 == 0) goto L_0x02ae
            if (r3 == 0) goto L_0x02ae
            float r4 = (float) r5
            float r3 = (float) r3
            float r4 = r4 / r3
        L_0x02ae:
            r23 = r4
            goto L_0x02d2
        L_0x02b1:
            float[] r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.f9605b
            int r3 = r3.length
            if (r5 >= r3) goto L_0x02bd
            float[] r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.f9605b
            r3 = r3[r5]
            r23 = r3
            goto L_0x02d2
        L_0x02bd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r12 = "Unexpected aspect_ratio_idc value: "
            r3.<init>(r12)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "H265Reader"
            android.util.Log.w(r5, r3)
        L_0x02d0:
            r23 = 1065353216(0x3f800000, float:1.0)
        L_0x02d2:
            java.util.List r22 = java.util.Collections.singletonList(r1)
            java.lang.String r19 = "video/hevc"
            r18 = r11
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8117a(r18, r19, r20, r21, r22, r23)
            r10.mo19040a(r1)
            r1 = 1
            r0.f9056e = r1
            goto L_0x02eb
        L_0x02e5:
            r24 = r3
            r25 = r4
            r26 = r5
        L_0x02eb:
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9061j
            boolean r1 = r1.mo19173b(r7)
            r3 = 5
            if (r1 == 0) goto L_0x0318
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9061j
            byte[] r1 = r1.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r4 = r0.f9061j
            int r4 = r4.f9099c
            int r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8803a((byte[]) r1, (int) r4)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f9065n
            com.fyber.inneractive.sdk.player.c.d.f.n r5 = r0.f9061j
            byte[] r5 = r5.f9098b
            r4.mo19381a((byte[]) r5, (int) r1)
            com.fyber.inneractive.sdk.player.c.k.k r1 = r0.f9065n
            r1.mo19388d(r3)
            com.fyber.inneractive.sdk.player.c.d.f.s r1 = r0.f9052a
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f9065n
            r10 = r16
            r1.mo19179a((long) r10, (com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r4)
            goto L_0x031a
        L_0x0318:
            r10 = r16
        L_0x031a:
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9062k
            boolean r1 = r1.mo19173b(r7)
            if (r1 == 0) goto L_0x0343
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9062k
            byte[] r1 = r1.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r4 = r0.f9062k
            int r4 = r4.f9099c
            int r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8803a((byte[]) r1, (int) r4)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f9065n
            com.fyber.inneractive.sdk.player.c.d.f.n r5 = r0.f9062k
            byte[] r5 = r5.f9098b
            r4.mo19381a((byte[]) r5, (int) r1)
            com.fyber.inneractive.sdk.player.c.k.k r1 = r0.f9065n
            r1.mo19388d(r3)
            com.fyber.inneractive.sdk.player.c.d.f.s r1 = r0.f9052a
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f9065n
            r1.mo19179a((long) r10, (com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r3)
        L_0x0343:
            long r3 = r0.f9064m
            boolean r1 = r0.f9056e
            if (r1 == 0) goto L_0x0391
            com.fyber.inneractive.sdk.player.c.d.f.k$a r1 = r0.f9055d
            r5 = 0
            r1.f9071f = r5
            r1.f9072g = r5
            r1.f9069d = r3
            r1.f9068c = r5
            r1.f9066a = r8
            r3 = 32
            if (r6 < r3) goto L_0x0374
            boolean r3 = r1.f9074i
            if (r3 != 0) goto L_0x0367
            boolean r3 = r1.f9073h
            if (r3 == 0) goto L_0x0367
            r1.mo19169a(r2)
            r1.f9073h = r5
        L_0x0367:
            r2 = 34
            if (r6 > r2) goto L_0x0374
            boolean r2 = r1.f9074i
            r3 = 1
            r2 = r2 ^ r3
            r1.f9072g = r2
            r1.f9074i = r3
            goto L_0x0375
        L_0x0374:
            r3 = 1
        L_0x0375:
            r2 = 16
            if (r6 < r2) goto L_0x037f
            r2 = 21
            if (r6 > r2) goto L_0x037f
            r2 = 1
            goto L_0x0380
        L_0x037f:
            r2 = 0
        L_0x0380:
            r1.f9067b = r2
            boolean r2 = r1.f9067b
            if (r2 != 0) goto L_0x038d
            r2 = 9
            if (r6 > r2) goto L_0x038b
            goto L_0x038d
        L_0x038b:
            r10 = 0
            goto L_0x038e
        L_0x038d:
            r10 = 1
        L_0x038e:
            r1.f9070e = r10
            goto L_0x03a0
        L_0x0391:
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9058g
            r1.mo19171a(r6)
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9059h
            r1.mo19171a(r6)
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9060i
            r1.mo19171a(r6)
        L_0x03a0:
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9061j
            r1.mo19171a(r6)
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9062k
            r1.mo19171a(r6)
            int r2 = r26 + 3
            r1 = r29
            r3 = r24
            r4 = r25
            goto L_0x0023
        L_0x03b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3379k.mo19159a(com.fyber.inneractive.sdk.player.c.k.k):void");
    }

    /* renamed from: a */
    private void m8389a(byte[] bArr, int i, int i2) {
        if (this.f9056e) {
            C3380a aVar = this.f9055d;
            if (aVar.f9070e) {
                int i3 = (i + 2) - aVar.f9068c;
                if (i3 < i2) {
                    aVar.f9071f = (bArr[i3] & 128) != 0;
                    aVar.f9070e = false;
                } else {
                    aVar.f9068c += i2 - i;
                }
            }
        } else {
            this.f9058g.mo19172a(bArr, i, i2);
            this.f9059h.mo19172a(bArr, i, i2);
            this.f9060i.mo19172a(bArr, i, i2);
        }
        this.f9061j.mo19172a(bArr, i, i2);
        this.f9062k.mo19172a(bArr, i, i2);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.k$a */
    private static final class C3380a {

        /* renamed from: a */
        long f9066a;

        /* renamed from: b */
        boolean f9067b;

        /* renamed from: c */
        int f9068c;

        /* renamed from: d */
        long f9069d;

        /* renamed from: e */
        boolean f9070e;

        /* renamed from: f */
        boolean f9071f;

        /* renamed from: g */
        boolean f9072g;

        /* renamed from: h */
        boolean f9073h;

        /* renamed from: i */
        boolean f9074i;

        /* renamed from: j */
        long f9075j;

        /* renamed from: k */
        long f9076k;

        /* renamed from: l */
        boolean f9077l;

        /* renamed from: m */
        private final C3278n f9078m;

        public C3380a(C3278n nVar) {
            this.f9078m = nVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo19169a(int i) {
            boolean z = this.f9077l;
            int i2 = (int) (this.f9066a - this.f9075j);
            this.f9078m.mo19038a(this.f9076k, z ? 1 : 0, i2, i, (byte[]) null);
        }
    }
}
