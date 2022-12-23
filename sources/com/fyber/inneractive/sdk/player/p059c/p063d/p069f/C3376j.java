package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3549l;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.j */
public final class C3376j implements C3373h {

    /* renamed from: a */
    private final C3390s f9004a;

    /* renamed from: b */
    private final boolean f9005b;

    /* renamed from: c */
    private final boolean f9006c;

    /* renamed from: d */
    private final C3383n f9007d = new C3383n(7);

    /* renamed from: e */
    private final C3383n f9008e = new C3383n(8);

    /* renamed from: f */
    private final C3383n f9009f = new C3383n(6);

    /* renamed from: g */
    private long f9010g;

    /* renamed from: h */
    private final boolean[] f9011h = new boolean[3];

    /* renamed from: i */
    private String f9012i;

    /* renamed from: j */
    private C3278n f9013j;

    /* renamed from: k */
    private C3377a f9014k;

    /* renamed from: l */
    private boolean f9015l;

    /* renamed from: m */
    private long f9016m;

    /* renamed from: n */
    private final C3548k f9017n = new C3548k();

    /* renamed from: b */
    public final void mo19160b() {
    }

    public C3376j(C3390s sVar, boolean z, boolean z2) {
        this.f9004a = sVar;
        this.f9005b = z;
        this.f9006c = z2;
    }

    /* renamed from: a */
    public final void mo19156a() {
        C3544i.m8807a(this.f9011h);
        this.f9007d.mo19170a();
        this.f9008e.mo19170a();
        this.f9009f.mo19170a();
        this.f9014k.mo19165a();
        this.f9010g = 0;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        this.f9012i = dVar.mo19183c();
        C3278n a = hVar.mo19056a(dVar.mo19182b());
        this.f9013j = a;
        this.f9014k = new C3377a(a, this.f9005b, this.f9006c);
        this.f9004a.mo19180a(hVar, dVar);
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        this.f9016m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8379a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f9015l
            if (r4 == 0) goto L_0x0012
            com.fyber.inneractive.sdk.player.c.d.f.j$a r4 = r0.f9014k
            boolean r4 = r4.f9020c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            com.fyber.inneractive.sdk.player.c.d.f.n r4 = r0.f9007d
            r4.mo19172a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.c.d.f.n r4 = r0.f9008e
            r4.mo19172a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.player.c.d.f.n r4 = r0.f9009f
            r4.mo19172a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.c.d.f.j$a r4 = r0.f9014k
            boolean r5 = r4.f9028k
            if (r5 == 0) goto L_0x01b1
            int r3 = r3 - r2
            byte[] r5 = r4.f9024g
            int r5 = r5.length
            int r6 = r4.f9025h
            int r6 = r6 + r3
            r7 = 2
            if (r5 >= r6) goto L_0x003e
            byte[] r5 = r4.f9024g
            int r6 = r4.f9025h
            int r6 = r6 + r3
            int r6 = r6 * 2
            byte[] r5 = java.util.Arrays.copyOf(r5, r6)
            r4.f9024g = r5
        L_0x003e:
            byte[] r5 = r4.f9024g
            int r6 = r4.f9025h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f9025h
            int r1 = r1 + r3
            r4.f9025h = r1
            com.fyber.inneractive.sdk.player.c.k.l r1 = r4.f9023f
            byte[] r2 = r4.f9024g
            int r3 = r4.f9025h
            r5 = 0
            r1.mo19406a(r2, r5, r3)
            com.fyber.inneractive.sdk.player.c.k.l r1 = r4.f9023f
            r2 = 8
            boolean r1 = r1.mo19408b(r2)
            if (r1 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r1 = r4.f9023f
            r1.mo19404a()
            com.fyber.inneractive.sdk.player.c.k.l r1 = r4.f9023f
            int r1 = r1.mo19409c(r7)
            com.fyber.inneractive.sdk.player.c.k.l r2 = r4.f9023f
            r3 = 5
            r2.mo19405a(r3)
            com.fyber.inneractive.sdk.player.c.k.l r2 = r4.f9023f
            boolean r2 = r2.mo19410c()
            if (r2 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r2 = r4.f9023f
            r2.mo19412e()
            com.fyber.inneractive.sdk.player.c.k.l r2 = r4.f9023f
            boolean r2 = r2.mo19410c()
            if (r2 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r2 = r4.f9023f
            int r2 = r2.mo19412e()
            boolean r6 = r4.f9020c
            r8 = 1
            if (r6 != 0) goto L_0x0098
            r4.f9028k = r5
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r1 = r4.f9031n
            r1.f9040e = r2
            r1.f9037b = r8
            return
        L_0x0098:
            com.fyber.inneractive.sdk.player.c.k.l r6 = r4.f9023f
            boolean r6 = r6.mo19410c()
            if (r6 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r6 = r4.f9023f
            int r6 = r6.mo19412e()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.k.i$a> r9 = r4.f9022e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00b1
            r4.f9028k = r5
            return
        L_0x00b1:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.k.i$a> r9 = r4.f9022e
            java.lang.Object r9 = r9.get(r6)
            com.fyber.inneractive.sdk.player.c.k.i$a r9 = (com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3545a) r9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.k.i$b> r10 = r4.f9021d
            int r11 = r9.f9609b
            java.lang.Object r10 = r10.get(r11)
            com.fyber.inneractive.sdk.player.c.k.i$b r10 = (com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3546b) r10
            boolean r11 = r10.f9615e
            if (r11 == 0) goto L_0x00d4
            com.fyber.inneractive.sdk.player.c.k.l r11 = r4.f9023f
            boolean r11 = r11.mo19408b(r7)
            if (r11 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r11 = r4.f9023f
            r11.mo19405a(r7)
        L_0x00d4:
            com.fyber.inneractive.sdk.player.c.k.l r7 = r4.f9023f
            int r11 = r10.f9617g
            boolean r7 = r7.mo19408b(r11)
            if (r7 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r7 = r4.f9023f
            int r11 = r10.f9617g
            int r7 = r7.mo19409c(r11)
            boolean r11 = r10.f9616f
            if (r11 != 0) goto L_0x010a
            com.fyber.inneractive.sdk.player.c.k.l r11 = r4.f9023f
            boolean r11 = r11.mo19408b(r8)
            if (r11 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r11 = r4.f9023f
            boolean r11 = r11.mo19407b()
            if (r11 == 0) goto L_0x010b
            com.fyber.inneractive.sdk.player.c.k.l r12 = r4.f9023f
            boolean r12 = r12.mo19408b(r8)
            if (r12 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r12 = r4.f9023f
            boolean r12 = r12.mo19407b()
            r13 = 1
            goto L_0x010d
        L_0x010a:
            r11 = 0
        L_0x010b:
            r12 = 0
            r13 = 0
        L_0x010d:
            int r14 = r4.f9026i
            if (r14 != r3) goto L_0x0113
            r3 = 1
            goto L_0x0114
        L_0x0113:
            r3 = 0
        L_0x0114:
            if (r3 == 0) goto L_0x0125
            com.fyber.inneractive.sdk.player.c.k.l r14 = r4.f9023f
            boolean r14 = r14.mo19410c()
            if (r14 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r14 = r4.f9023f
            int r14 = r14.mo19412e()
            goto L_0x0126
        L_0x0125:
            r14 = 0
        L_0x0126:
            int r15 = r10.f9618h
            if (r15 != 0) goto L_0x0154
            com.fyber.inneractive.sdk.player.c.k.l r15 = r4.f9023f
            int r5 = r10.f9619i
            boolean r5 = r15.mo19408b(r5)
            if (r5 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r5 = r4.f9023f
            int r15 = r10.f9619i
            int r5 = r5.mo19409c(r15)
            boolean r9 = r9.f9610c
            if (r9 == 0) goto L_0x0188
            if (r11 != 0) goto L_0x0188
            com.fyber.inneractive.sdk.player.c.k.l r9 = r4.f9023f
            boolean r9 = r9.mo19410c()
            if (r9 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r9 = r4.f9023f
            int r9 = r9.mo19411d()
            r15 = r9
            r8 = 0
            r9 = 0
            goto L_0x018b
        L_0x0154:
            int r5 = r10.f9618h
            if (r5 != r8) goto L_0x0187
            boolean r5 = r10.f9620j
            if (r5 != 0) goto L_0x0187
            com.fyber.inneractive.sdk.player.c.k.l r5 = r4.f9023f
            boolean r5 = r5.mo19410c()
            if (r5 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r5 = r4.f9023f
            int r5 = r5.mo19411d()
            boolean r9 = r9.f9610c
            if (r9 == 0) goto L_0x0183
            if (r11 != 0) goto L_0x0183
            com.fyber.inneractive.sdk.player.c.k.l r9 = r4.f9023f
            boolean r9 = r9.mo19410c()
            if (r9 == 0) goto L_0x01b1
            com.fyber.inneractive.sdk.player.c.k.l r9 = r4.f9023f
            int r9 = r9.mo19411d()
            r8 = r9
            r15 = 0
            r9 = r5
            r5 = 0
            goto L_0x018b
        L_0x0183:
            r9 = r5
            r5 = 0
            r8 = 0
            goto L_0x018a
        L_0x0187:
            r5 = 0
        L_0x0188:
            r8 = 0
            r9 = 0
        L_0x018a:
            r15 = 0
        L_0x018b:
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r0 = r4.f9031n
            r0.f9038c = r10
            r0.f9039d = r1
            r0.f9040e = r2
            r0.f9041f = r7
            r0.f9042g = r6
            r0.f9043h = r11
            r0.f9044i = r13
            r0.f9045j = r12
            r0.f9046k = r3
            r0.f9047l = r14
            r0.f9048m = r5
            r0.f9049n = r15
            r0.f9050o = r9
            r0.f9051p = r8
            r1 = 1
            r0.f9036a = r1
            r0.f9037b = r1
            r0 = 0
            r4.f9028k = r0
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3376j.m8379a(byte[], int, int):void");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.j$a */
    private static final class C3377a {

        /* renamed from: a */
        final C3278n f9018a;

        /* renamed from: b */
        final boolean f9019b;

        /* renamed from: c */
        final boolean f9020c;

        /* renamed from: d */
        final SparseArray<C3544i.C3546b> f9021d = new SparseArray<>();

        /* renamed from: e */
        final SparseArray<C3544i.C3545a> f9022e = new SparseArray<>();

        /* renamed from: f */
        final C3549l f9023f;

        /* renamed from: g */
        byte[] f9024g;

        /* renamed from: h */
        int f9025h;

        /* renamed from: i */
        int f9026i;

        /* renamed from: j */
        long f9027j;

        /* renamed from: k */
        boolean f9028k;

        /* renamed from: l */
        long f9029l;

        /* renamed from: m */
        C3378a f9030m = new C3378a((byte) 0);

        /* renamed from: n */
        C3378a f9031n = new C3378a((byte) 0);

        /* renamed from: o */
        boolean f9032o;

        /* renamed from: p */
        long f9033p;

        /* renamed from: q */
        long f9034q;

        /* renamed from: r */
        boolean f9035r;

        public C3377a(C3278n nVar, boolean z, boolean z2) {
            this.f9018a = nVar;
            this.f9019b = z;
            this.f9020c = z2;
            byte[] bArr = new byte[128];
            this.f9024g = bArr;
            this.f9023f = new C3549l(bArr, 0, 0);
            mo19165a();
        }

        /* renamed from: a */
        public final void mo19167a(C3544i.C3546b bVar) {
            this.f9021d.append(bVar.f9611a, bVar);
        }

        /* renamed from: a */
        public final void mo19166a(C3544i.C3545a aVar) {
            this.f9022e.append(aVar.f9608a, aVar);
        }

        /* renamed from: a */
        public final void mo19165a() {
            this.f9028k = false;
            this.f9032o = false;
            this.f9031n.mo19168a();
        }

        /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.j$a$a */
        private static final class C3378a {

            /* renamed from: a */
            boolean f9036a;

            /* renamed from: b */
            boolean f9037b;

            /* renamed from: c */
            C3544i.C3546b f9038c;

            /* renamed from: d */
            int f9039d;

            /* renamed from: e */
            int f9040e;

            /* renamed from: f */
            int f9041f;

            /* renamed from: g */
            int f9042g;

            /* renamed from: h */
            boolean f9043h;

            /* renamed from: i */
            boolean f9044i;

            /* renamed from: j */
            boolean f9045j;

            /* renamed from: k */
            boolean f9046k;

            /* renamed from: l */
            int f9047l;

            /* renamed from: m */
            int f9048m;

            /* renamed from: n */
            int f9049n;

            /* renamed from: o */
            int f9050o;

            /* renamed from: p */
            int f9051p;

            private C3378a() {
            }

            /* synthetic */ C3378a(byte b) {
                this();
            }

            /* renamed from: a */
            public final void mo19168a() {
                this.f9037b = false;
                this.f9036a = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0232, code lost:
        if ((r2.f9037b && (r2.f9040e == 7 || r2.f9040e == 2)) != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026b, code lost:
        if (r3.f9026i != 1) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e2, code lost:
        if ((r3.f9036a && !(r4.f9036a && r3.f9041f == r4.f9041f && r3.f9042g == r4.f9042g && r3.f9043h == r4.f9043h && ((!r3.f9044i || !r4.f9044i || r3.f9045j == r4.f9045j) && ((r3.f9039d == r4.f9039d || (r3.f9039d != 0 && r4.f9039d != 0)) && ((r3.f9038c.f9618h != 0 || r4.f9038c.f9618h != 0 || (r3.f9048m == r4.f9048m && r3.f9049n == r4.f9049n)) && ((r3.f9038c.f9618h != 1 || r4.f9038c.f9618h != 1 || (r3.f9050o == r4.f9050o && r3.f9051p == r4.f9051p)) && r3.f9046k == r4.f9046k && (!r3.f9046k || !r4.f9046k || r3.f9047l == r4.f9047l))))))) != false) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0292 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0218  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19159a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.f9626b
            int r3 = r1.f9627c
            byte[] r4 = r1.f9625a
            long r5 = r0.f9010g
            int r7 = r26.mo19383b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f9010g = r5
            com.fyber.inneractive.sdk.player.c.d.n r5 = r0.f9013j
            int r6 = r26.mo19383b()
            r5.mo19041a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.f9011h
            int r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8804a(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0029
            r0.m8379a(r4, r2, r3)
            return
        L_0x0029:
            int r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8809b(r4, r1)
            int r6 = r1 - r2
            if (r6 <= 0) goto L_0x0034
            r0.m8379a(r4, r2, r1)
        L_0x0034:
            int r2 = r3 - r1
            long r7 = r0.f9010g
            long r9 = (long) r2
            long r7 = r7 - r9
            if (r6 >= 0) goto L_0x003e
            int r6 = -r6
            goto L_0x003f
        L_0x003e:
            r6 = 0
        L_0x003f:
            long r10 = r0.f9016m
            boolean r12 = r0.f9015l
            if (r12 == 0) goto L_0x0056
            com.fyber.inneractive.sdk.player.c.d.f.j$a r12 = r0.f9014k
            boolean r12 = r12.f9020c
            if (r12 == 0) goto L_0x004c
            goto L_0x0056
        L_0x004c:
            r23 = r1
            r21 = r3
            r22 = r4
            r24 = r5
            goto L_0x012a
        L_0x0056:
            com.fyber.inneractive.sdk.player.c.d.f.n r12 = r0.f9007d
            r12.mo19173b(r6)
            com.fyber.inneractive.sdk.player.c.d.f.n r12 = r0.f9008e
            r12.mo19173b(r6)
            boolean r12 = r0.f9015l
            r14 = 3
            if (r12 != 0) goto L_0x00e9
            com.fyber.inneractive.sdk.player.c.d.f.n r12 = r0.f9007d
            boolean r12 = r12.f9097a
            if (r12 == 0) goto L_0x004c
            com.fyber.inneractive.sdk.player.c.d.f.n r12 = r0.f9008e
            boolean r12 = r12.f9097a
            if (r12 == 0) goto L_0x004c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.fyber.inneractive.sdk.player.c.d.f.n r15 = r0.f9007d
            byte[] r15 = r15.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r9 = r0.f9007d
            int r9 = r9.f9099c
            byte[] r9 = java.util.Arrays.copyOf(r15, r9)
            r12.add(r9)
            com.fyber.inneractive.sdk.player.c.d.f.n r9 = r0.f9008e
            byte[] r9 = r9.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r15 = r0.f9008e
            int r15 = r15.f9099c
            byte[] r9 = java.util.Arrays.copyOf(r9, r15)
            r12.add(r9)
            com.fyber.inneractive.sdk.player.c.d.f.n r9 = r0.f9007d
            byte[] r9 = r9.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r15 = r0.f9007d
            int r15 = r15.f9099c
            com.fyber.inneractive.sdk.player.c.k.i$b r9 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8805a(r9, r14, r15)
            com.fyber.inneractive.sdk.player.c.d.f.n r14 = r0.f9008e
            byte[] r14 = r14.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r15 = r0.f9008e
            int r15 = r15.f9099c
            com.fyber.inneractive.sdk.player.c.k.i$a r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8811d(r14, r15)
            com.fyber.inneractive.sdk.player.c.d.n r15 = r0.f9013j
            java.lang.String r13 = r0.f9012i
            r21 = r3
            int r3 = r9.f9612b
            r22 = r4
            int r4 = r9.f9613c
            r23 = r1
            float r1 = r9.f9614d
            java.lang.String r16 = "video/avc"
            r24 = r5
            r5 = r15
            r15 = r13
            r17 = r3
            r18 = r4
            r19 = r12
            r20 = r1
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8117a(r15, r16, r17, r18, r19, r20)
            r5.mo19040a(r1)
            r1 = 1
            r0.f9015l = r1
            com.fyber.inneractive.sdk.player.c.d.f.j$a r1 = r0.f9014k
            r1.mo19167a((com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3546b) r9)
            com.fyber.inneractive.sdk.player.c.d.f.j$a r1 = r0.f9014k
            r1.mo19166a((com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3545a) r14)
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9007d
            r1.mo19170a()
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9008e
            r1.mo19170a()
            goto L_0x012a
        L_0x00e9:
            r23 = r1
            r21 = r3
            r22 = r4
            r24 = r5
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9007d
            boolean r1 = r1.f9097a
            if (r1 == 0) goto L_0x010e
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9007d
            byte[] r1 = r1.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r3 = r0.f9007d
            int r3 = r3.f9099c
            com.fyber.inneractive.sdk.player.c.k.i$b r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8805a(r1, r14, r3)
            com.fyber.inneractive.sdk.player.c.d.f.j$a r3 = r0.f9014k
            r3.mo19167a((com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3546b) r1)
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9007d
            r1.mo19170a()
            goto L_0x012a
        L_0x010e:
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9008e
            boolean r1 = r1.f9097a
            if (r1 == 0) goto L_0x012a
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9008e
            byte[] r1 = r1.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r3 = r0.f9008e
            int r3 = r3.f9099c
            com.fyber.inneractive.sdk.player.c.k.i$a r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8811d(r1, r3)
            com.fyber.inneractive.sdk.player.c.d.f.j$a r3 = r0.f9014k
            r3.mo19166a((com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.C3545a) r1)
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9008e
            r1.mo19170a()
        L_0x012a:
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9009f
            boolean r1 = r1.mo19173b(r6)
            if (r1 == 0) goto L_0x0154
            com.fyber.inneractive.sdk.player.c.d.f.n r1 = r0.f9009f
            byte[] r1 = r1.f9098b
            com.fyber.inneractive.sdk.player.c.d.f.n r3 = r0.f9009f
            int r3 = r3.f9099c
            int r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8803a((byte[]) r1, (int) r3)
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f9017n
            com.fyber.inneractive.sdk.player.c.d.f.n r4 = r0.f9009f
            byte[] r4 = r4.f9098b
            r3.mo19381a((byte[]) r4, (int) r1)
            com.fyber.inneractive.sdk.player.c.k.k r1 = r0.f9017n
            r3 = 4
            r1.mo19386c(r3)
            com.fyber.inneractive.sdk.player.c.d.f.s r1 = r0.f9004a
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f9017n
            r1.mo19179a((long) r10, (com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r3)
        L_0x0154:
            com.fyber.inneractive.sdk.player.c.d.f.j$a r1 = r0.f9014k
            int r3 = r1.f9026i
            r4 = 9
            if (r3 == r4) goto L_0x01e7
            boolean r3 = r1.f9020c
            if (r3 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r3 = r1.f9031n
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r4 = r1.f9030m
            boolean r5 = r3.f9036a
            if (r5 == 0) goto L_0x01e1
            boolean r5 = r4.f9036a
            if (r5 == 0) goto L_0x01df
            int r5 = r3.f9041f
            int r6 = r4.f9041f
            if (r5 != r6) goto L_0x01df
            int r5 = r3.f9042g
            int r6 = r4.f9042g
            if (r5 != r6) goto L_0x01df
            boolean r5 = r3.f9043h
            boolean r6 = r4.f9043h
            if (r5 != r6) goto L_0x01df
            boolean r5 = r3.f9044i
            if (r5 == 0) goto L_0x018c
            boolean r5 = r4.f9044i
            if (r5 == 0) goto L_0x018c
            boolean r5 = r3.f9045j
            boolean r6 = r4.f9045j
            if (r5 != r6) goto L_0x01df
        L_0x018c:
            int r5 = r3.f9039d
            int r6 = r4.f9039d
            if (r5 == r6) goto L_0x019a
            int r5 = r3.f9039d
            if (r5 == 0) goto L_0x01df
            int r5 = r4.f9039d
            if (r5 == 0) goto L_0x01df
        L_0x019a:
            com.fyber.inneractive.sdk.player.c.k.i$b r5 = r3.f9038c
            int r5 = r5.f9618h
            if (r5 != 0) goto L_0x01b2
            com.fyber.inneractive.sdk.player.c.k.i$b r5 = r4.f9038c
            int r5 = r5.f9618h
            if (r5 != 0) goto L_0x01b2
            int r5 = r3.f9048m
            int r6 = r4.f9048m
            if (r5 != r6) goto L_0x01df
            int r5 = r3.f9049n
            int r6 = r4.f9049n
            if (r5 != r6) goto L_0x01df
        L_0x01b2:
            com.fyber.inneractive.sdk.player.c.k.i$b r5 = r3.f9038c
            int r5 = r5.f9618h
            r6 = 1
            if (r5 != r6) goto L_0x01cb
            com.fyber.inneractive.sdk.player.c.k.i$b r5 = r4.f9038c
            int r5 = r5.f9618h
            if (r5 != r6) goto L_0x01cb
            int r5 = r3.f9050o
            int r6 = r4.f9050o
            if (r5 != r6) goto L_0x01df
            int r5 = r3.f9051p
            int r6 = r4.f9051p
            if (r5 != r6) goto L_0x01df
        L_0x01cb:
            boolean r5 = r3.f9046k
            boolean r6 = r4.f9046k
            if (r5 != r6) goto L_0x01df
            boolean r5 = r3.f9046k
            if (r5 == 0) goto L_0x01e1
            boolean r5 = r4.f9046k
            if (r5 == 0) goto L_0x01e1
            int r3 = r3.f9047l
            int r4 = r4.f9047l
            if (r3 == r4) goto L_0x01e1
        L_0x01df:
            r3 = 1
            goto L_0x01e2
        L_0x01e1:
            r3 = 0
        L_0x01e2:
            if (r3 == 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r2 = 1
            goto L_0x0210
        L_0x01e7:
            boolean r3 = r1.f9032o
            if (r3 == 0) goto L_0x0202
            long r3 = r1.f9027j
            long r3 = r7 - r3
            int r4 = (int) r3
            int r14 = r2 + r4
            boolean r12 = r1.f9035r
            long r2 = r1.f9027j
            long r4 = r1.f9033p
            long r2 = r2 - r4
            int r13 = (int) r2
            com.fyber.inneractive.sdk.player.c.d.n r9 = r1.f9018a
            long r10 = r1.f9034q
            r15 = 0
            r9.mo19038a(r10, r12, r13, r14, r15)
        L_0x0202:
            long r2 = r1.f9027j
            r1.f9033p = r2
            long r2 = r1.f9029l
            r1.f9034q = r2
            r2 = 0
            r1.f9035r = r2
            r2 = 1
            r1.f9032o = r2
        L_0x0210:
            boolean r3 = r1.f9035r
            int r4 = r1.f9026i
            r5 = 2
            r6 = 5
            if (r4 == r6) goto L_0x0237
            boolean r4 = r1.f9019b
            if (r4 == 0) goto L_0x0235
            int r4 = r1.f9026i
            if (r4 != r2) goto L_0x0235
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r2 = r1.f9031n
            boolean r4 = r2.f9037b
            if (r4 == 0) goto L_0x0231
            int r4 = r2.f9040e
            r9 = 7
            if (r4 == r9) goto L_0x022f
            int r2 = r2.f9040e
            if (r2 != r5) goto L_0x0231
        L_0x022f:
            r2 = 1
            goto L_0x0232
        L_0x0231:
            r2 = 0
        L_0x0232:
            if (r2 == 0) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r2 = 0
            goto L_0x0238
        L_0x0237:
            r2 = 1
        L_0x0238:
            r2 = r2 | r3
            r1.f9035r = r2
            long r1 = r0.f9016m
            boolean r3 = r0.f9015l
            if (r3 == 0) goto L_0x024b
            com.fyber.inneractive.sdk.player.c.d.f.j$a r3 = r0.f9014k
            boolean r3 = r3.f9020c
            if (r3 == 0) goto L_0x0248
            goto L_0x024b
        L_0x0248:
            r4 = r24
            goto L_0x0257
        L_0x024b:
            com.fyber.inneractive.sdk.player.c.d.f.n r3 = r0.f9007d
            r4 = r24
            r3.mo19171a(r4)
            com.fyber.inneractive.sdk.player.c.d.f.n r3 = r0.f9008e
            r3.mo19171a(r4)
        L_0x0257:
            com.fyber.inneractive.sdk.player.c.d.f.n r3 = r0.f9009f
            r3.mo19171a(r4)
            com.fyber.inneractive.sdk.player.c.d.f.j$a r3 = r0.f9014k
            r3.f9026i = r4
            r3.f9029l = r1
            r3.f9027j = r7
            boolean r1 = r3.f9019b
            if (r1 == 0) goto L_0x026e
            int r1 = r3.f9026i
            r2 = 1
            if (r1 == r2) goto L_0x027f
            goto L_0x026f
        L_0x026e:
            r2 = 1
        L_0x026f:
            boolean r1 = r3.f9020c
            if (r1 == 0) goto L_0x0292
            int r1 = r3.f9026i
            if (r1 == r6) goto L_0x027f
            int r1 = r3.f9026i
            if (r1 == r2) goto L_0x027f
            int r1 = r3.f9026i
            if (r1 != r5) goto L_0x0292
        L_0x027f:
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r1 = r3.f9030m
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r2 = r3.f9031n
            r3.f9030m = r2
            r3.f9031n = r1
            com.fyber.inneractive.sdk.player.c.d.f.j$a$a r1 = r3.f9031n
            r1.mo19168a()
            r1 = 0
            r3.f9025h = r1
            r1 = 1
            r3.f9028k = r1
        L_0x0292:
            int r2 = r23 + 3
            r3 = r21
            r4 = r22
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3376j.mo19159a(com.fyber.inneractive.sdk.player.c.k.k):void");
    }
}
