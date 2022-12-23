package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.nq0;
import com.yandex.mobile.ads.impl.tf1;

public final class j90 implements a30 {

    /* renamed from: a */
    private final w71 f35154a;

    /* renamed from: b */
    private final boolean f35155b;

    /* renamed from: c */
    private final boolean f35156c;

    /* renamed from: d */
    private final mq0 f35157d = new mq0(7, 128);

    /* renamed from: e */
    private final mq0 f35158e = new mq0(8, 128);

    /* renamed from: f */
    private final mq0 f35159f = new mq0(6, 128);

    /* renamed from: g */
    private long f35160g;

    /* renamed from: h */
    private final boolean[] f35161h = new boolean[3];

    /* renamed from: i */
    private String f35162i;

    /* renamed from: j */
    private ke1 f35163j;

    /* renamed from: k */
    private C13481b f35164k;

    /* renamed from: l */
    private boolean f35165l;

    /* renamed from: m */
    private long f35166m;

    /* renamed from: n */
    private boolean f35167n;

    /* renamed from: o */
    private final fy0 f35168o = new fy0();

    /* renamed from: com.yandex.mobile.ads.impl.j90$b */
    private static final class C13481b {

        /* renamed from: a */
        private final ke1 f35169a;

        /* renamed from: b */
        private final boolean f35170b;

        /* renamed from: c */
        private final boolean f35171c;

        /* renamed from: d */
        private final SparseArray<nq0.C14127b> f35172d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<nq0.C14126a> f35173e = new SparseArray<>();

        /* renamed from: f */
        private final gy0 f35174f;

        /* renamed from: g */
        private byte[] f35175g;

        /* renamed from: h */
        private int f35176h;

        /* renamed from: i */
        private int f35177i;

        /* renamed from: j */
        private long f35178j;

        /* renamed from: k */
        private boolean f35179k;

        /* renamed from: l */
        private long f35180l;

        /* renamed from: m */
        private C13482a f35181m = new C13482a();

        /* renamed from: n */
        private C13482a f35182n = new C13482a();

        /* renamed from: o */
        private boolean f35183o;

        /* renamed from: p */
        private long f35184p;

        /* renamed from: q */
        private long f35185q;

        /* renamed from: r */
        private boolean f35186r;

        public C13481b(ke1 ke1, boolean z, boolean z2) {
            this.f35169a = ke1;
            this.f35170b = z;
            this.f35171c = z2;
            byte[] bArr = new byte[128];
            this.f35175g = bArr;
            this.f35174f = new gy0(bArr, 0, 0);
            mo67951b();
        }

        /* renamed from: a */
        public boolean mo67949a() {
            return this.f35171c;
        }

        /* renamed from: b */
        public void mo67951b() {
            this.f35179k = false;
            this.f35183o = false;
            this.f35182n.mo67952a();
        }

        /* renamed from: com.yandex.mobile.ads.impl.j90$b$a */
        private static final class C13482a {

            /* renamed from: a */
            private boolean f35187a;

            /* renamed from: b */
            private boolean f35188b;

            /* renamed from: c */
            private nq0.C14127b f35189c;

            /* renamed from: d */
            private int f35190d;

            /* renamed from: e */
            private int f35191e;

            /* renamed from: f */
            private int f35192f;

            /* renamed from: g */
            private int f35193g;

            /* renamed from: h */
            private boolean f35194h;

            /* renamed from: i */
            private boolean f35195i;

            /* renamed from: j */
            private boolean f35196j;

            /* renamed from: k */
            private boolean f35197k;

            /* renamed from: l */
            private int f35198l;

            /* renamed from: m */
            private int f35199m;

            /* renamed from: n */
            private int f35200n;

            /* renamed from: o */
            private int f35201o;

            /* renamed from: p */
            private int f35202p;

            private C13482a() {
            }

            /* renamed from: a */
            public void mo67952a() {
                this.f35188b = false;
                this.f35187a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f35191e;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo67955b() {
                /*
                    r2 = this;
                    boolean r0 = r2.f35188b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f35191e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j90.C13481b.C13482a.mo67955b():boolean");
            }

            /* renamed from: a */
            public void mo67953a(int i) {
                this.f35191e = i;
                this.f35188b = true;
            }

            /* renamed from: a */
            public void mo67954a(nq0.C14127b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f35189c = bVar;
                this.f35190d = i;
                this.f35191e = i2;
                this.f35192f = i3;
                this.f35193g = i4;
                this.f35194h = z;
                this.f35195i = z2;
                this.f35196j = z3;
                this.f35197k = z4;
                this.f35198l = i5;
                this.f35199m = i6;
                this.f35200n = i7;
                this.f35201o = i8;
                this.f35202p = i9;
                this.f35187a = true;
                this.f35188b = true;
            }

            /* renamed from: a */
            static boolean m37723a(C13482a aVar, C13482a aVar2) {
                boolean z;
                boolean z2;
                if (aVar.f35187a) {
                    if (!aVar2.f35187a || aVar.f35192f != aVar2.f35192f || aVar.f35193g != aVar2.f35193g || aVar.f35194h != aVar2.f35194h) {
                        return true;
                    }
                    if (aVar.f35195i && aVar2.f35195i && aVar.f35196j != aVar2.f35196j) {
                        return true;
                    }
                    int i = aVar.f35190d;
                    int i2 = aVar2.f35190d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = aVar.f35189c.f37896k;
                    if (i3 == 0 && aVar2.f35189c.f37896k == 0 && (aVar.f35199m != aVar2.f35199m || aVar.f35200n != aVar2.f35200n)) {
                        return true;
                    }
                    if ((i3 != 1 || aVar2.f35189c.f37896k != 1 || (aVar.f35201o == aVar2.f35201o && aVar.f35202p == aVar2.f35202p)) && (z = aVar.f35197k) == (z2 = aVar2.f35197k)) {
                        return z && z2 && aVar.f35198l != aVar2.f35198l;
                    }
                    return true;
                }
            }
        }

        /* renamed from: a */
        public void mo67947a(nq0.C14127b bVar) {
            this.f35172d.append(bVar.f37889d, bVar);
        }

        /* renamed from: a */
        public void mo67946a(nq0.C14126a aVar) {
            this.f35173e.append(aVar.f37883a, aVar);
        }

        /* renamed from: a */
        public void mo67945a(long j, int i, long j2) {
            this.f35177i = i;
            this.f35180l = j2;
            this.f35178j = j;
            if (!this.f35170b || i != 1) {
                if (!this.f35171c) {
                    return;
                }
                if (!(i == 5 || i == 1 || i == 2)) {
                    return;
                }
            }
            C13482a aVar = this.f35181m;
            this.f35181m = this.f35182n;
            this.f35182n = aVar;
            aVar.mo67952a();
            this.f35176h = 0;
            this.f35179k = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67948a(byte[] r23, int r24, int r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r24
                boolean r2 = r0.f35179k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r25 - r1
                byte[] r3 = r0.f35175g
                int r4 = r3.length
                int r5 = r0.f35176h
                int r5 = r5 + r2
                r6 = 2
                if (r4 >= r5) goto L_0x001c
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f35175g = r3
            L_0x001c:
                byte[] r3 = r0.f35175g
                int r4 = r0.f35176h
                r5 = r23
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f35176h
                int r1 = r1 + r2
                r0.f35176h = r1
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                byte[] r3 = r0.f35175g
                r4 = 0
                r2.mo67365a(r3, r4, r1)
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                r2 = 8
                boolean r1 = r1.mo67366a(r2)
                if (r1 != 0) goto L_0x003d
                return
            L_0x003d:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                r1.mo67373g()
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                int r9 = r1.mo67367b(r6)
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                r2 = 5
                r1.mo67370d(r2)
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                boolean r1 = r1.mo67368b()
                if (r1 != 0) goto L_0x0057
                return
            L_0x0057:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                r1.mo67372f()
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                boolean r1 = r1.mo67368b()
                if (r1 != 0) goto L_0x0065
                return
            L_0x0065:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                int r10 = r1.mo67372f()
                boolean r1 = r0.f35171c
                if (r1 != 0) goto L_0x0077
                r0.f35179k = r4
                com.yandex.mobile.ads.impl.j90$b$a r1 = r0.f35182n
                r1.mo67953a(r10)
                return
            L_0x0077:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                boolean r1 = r1.mo67368b()
                if (r1 != 0) goto L_0x0080
                return
            L_0x0080:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                int r12 = r1.mo67372f()
                android.util.SparseArray<com.yandex.mobile.ads.impl.nq0$a> r1 = r0.f35173e
                int r1 = r1.indexOfKey(r12)
                if (r1 >= 0) goto L_0x0091
                r0.f35179k = r4
                return
            L_0x0091:
                android.util.SparseArray<com.yandex.mobile.ads.impl.nq0$a> r1 = r0.f35173e
                java.lang.Object r1 = r1.get(r12)
                com.yandex.mobile.ads.impl.nq0$a r1 = (com.yandex.mobile.ads.impl.nq0.C14126a) r1
                android.util.SparseArray<com.yandex.mobile.ads.impl.nq0$b> r3 = r0.f35172d
                int r5 = r1.f37884b
                java.lang.Object r3 = r3.get(r5)
                r8 = r3
                com.yandex.mobile.ads.impl.nq0$b r8 = (com.yandex.mobile.ads.impl.nq0.C14127b) r8
                boolean r3 = r8.f37893h
                if (r3 == 0) goto L_0x00b6
                com.yandex.mobile.ads.impl.gy0 r3 = r0.f35174f
                boolean r3 = r3.mo67366a(r6)
                if (r3 != 0) goto L_0x00b1
                return
            L_0x00b1:
                com.yandex.mobile.ads.impl.gy0 r3 = r0.f35174f
                r3.mo67370d(r6)
            L_0x00b6:
                com.yandex.mobile.ads.impl.gy0 r3 = r0.f35174f
                int r5 = r8.f37895j
                boolean r3 = r3.mo67366a(r5)
                if (r3 != 0) goto L_0x00c1
                return
            L_0x00c1:
                com.yandex.mobile.ads.impl.gy0 r3 = r0.f35174f
                int r5 = r8.f37895j
                int r11 = r3.mo67367b(r5)
                boolean r3 = r8.f37894i
                r5 = 1
                if (r3 != 0) goto L_0x00f4
                com.yandex.mobile.ads.impl.gy0 r3 = r0.f35174f
                boolean r3 = r3.mo67366a(r5)
                if (r3 != 0) goto L_0x00d7
                return
            L_0x00d7:
                com.yandex.mobile.ads.impl.gy0 r3 = r0.f35174f
                boolean r3 = r3.mo67369c()
                if (r3 == 0) goto L_0x00f2
                com.yandex.mobile.ads.impl.gy0 r6 = r0.f35174f
                boolean r6 = r6.mo67366a(r5)
                if (r6 != 0) goto L_0x00e8
                return
            L_0x00e8:
                com.yandex.mobile.ads.impl.gy0 r6 = r0.f35174f
                boolean r6 = r6.mo67369c()
                r13 = r3
                r15 = r6
                r14 = 1
                goto L_0x00f7
            L_0x00f2:
                r13 = r3
                goto L_0x00f5
            L_0x00f4:
                r13 = 0
            L_0x00f5:
                r14 = 0
                r15 = 0
            L_0x00f7:
                int r3 = r0.f35177i
                if (r3 != r2) goto L_0x00fe
                r16 = 1
                goto L_0x0100
            L_0x00fe:
                r16 = 0
            L_0x0100:
                if (r16 == 0) goto L_0x0114
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                boolean r2 = r2.mo67368b()
                if (r2 != 0) goto L_0x010b
                return
            L_0x010b:
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                int r2 = r2.mo67372f()
                r17 = r2
                goto L_0x0116
            L_0x0114:
                r17 = 0
            L_0x0116:
                int r2 = r8.f37896k
                if (r2 != 0) goto L_0x014a
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                int r3 = r8.f37897l
                boolean r2 = r2.mo67366a(r3)
                if (r2 != 0) goto L_0x0125
                return
            L_0x0125:
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                int r3 = r8.f37897l
                int r2 = r2.mo67367b(r3)
                boolean r1 = r1.f37885c
                if (r1 == 0) goto L_0x0147
                if (r13 != 0) goto L_0x0147
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                boolean r1 = r1.mo67368b()
                if (r1 != 0) goto L_0x013c
                return
            L_0x013c:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                int r1 = r1.mo67371e()
                r19 = r1
                r18 = r2
                goto L_0x0188
            L_0x0147:
                r18 = r2
                goto L_0x0186
            L_0x014a:
                if (r2 != r5) goto L_0x0184
                boolean r2 = r8.f37898m
                if (r2 != 0) goto L_0x0184
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                boolean r2 = r2.mo67368b()
                if (r2 != 0) goto L_0x0159
                return
            L_0x0159:
                com.yandex.mobile.ads.impl.gy0 r2 = r0.f35174f
                int r2 = r2.mo67371e()
                boolean r1 = r1.f37885c
                if (r1 == 0) goto L_0x017d
                if (r13 != 0) goto L_0x017d
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                boolean r1 = r1.mo67368b()
                if (r1 != 0) goto L_0x016e
                return
            L_0x016e:
                com.yandex.mobile.ads.impl.gy0 r1 = r0.f35174f
                int r1 = r1.mo67371e()
                r21 = r1
                r20 = r2
                r18 = 0
                r19 = 0
                goto L_0x018c
            L_0x017d:
                r20 = r2
                r18 = 0
                r19 = 0
                goto L_0x018a
            L_0x0184:
                r18 = 0
            L_0x0186:
                r19 = 0
            L_0x0188:
                r20 = 0
            L_0x018a:
                r21 = 0
            L_0x018c:
                com.yandex.mobile.ads.impl.j90$b$a r7 = r0.f35182n
                r7.mo67954a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                r0.f35179k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j90.C13481b.mo67948a(byte[], int, int):void");
        }

        /* renamed from: a */
        public boolean mo67950a(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f35177i == 9 || (this.f35171c && C13482a.m37723a(this.f35182n, this.f35181m))) {
                if (z && this.f35183o) {
                    long j2 = this.f35178j;
                    boolean z4 = this.f35186r;
                    this.f35169a.mo65337a(this.f35185q, z4 ? 1 : 0, (int) (j2 - this.f35184p), i + ((int) (j - j2)), (ke1.C13702a) null);
                }
                this.f35184p = this.f35178j;
                this.f35185q = this.f35180l;
                this.f35186r = false;
                this.f35183o = true;
            }
            boolean b = this.f35170b ? this.f35182n.mo67955b() : z2;
            boolean z5 = this.f35186r;
            int i2 = this.f35177i;
            if (i2 == 5 || (b && i2 == 1)) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            this.f35186r = z6;
            return z6;
        }
    }

    public j90(w71 w71, boolean z, boolean z2) {
        this.f35154a = w71;
        this.f35155b = z;
        this.f35156c = z2;
    }

    /* renamed from: a */
    public void mo65661a() {
        nq0.m40148a(this.f35161h);
        this.f35157d.mo68850b();
        this.f35158e.mo68850b();
        this.f35159f.mo68850b();
        this.f35164k.mo67951b();
        this.f35160g = 0;
        this.f35167n = false;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f35162i = dVar.mo70178b();
        ke1 a = x50.mo65304a(dVar.mo70179c(), 2);
        this.f35163j = a;
        this.f35164k = new C13481b(a, this.f35155b, this.f35156c);
        this.f35154a.mo70658a(x50, dVar);
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f35166m = j;
        this.f35167n |= (i & 2) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65663a(com.yandex.mobile.ads.impl.fy0 r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            int r2 = r32.mo67105b()
            int r3 = r32.mo67107c()
            byte[] r4 = r1.f33778a
            long r5 = r0.f35160g
            int r7 = r32.mo67098a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f35160g = r5
            com.yandex.mobile.ads.impl.ke1 r5 = r0.f35163j
            int r6 = r32.mo67098a()
            r5.mo65341a(r1, r6)
        L_0x0021:
            boolean[] r1 = r0.f35161h
            int r1 = com.yandex.mobile.ads.impl.nq0.m40146a(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x002d
            r0.m37710a(r4, r2, r3)
            return
        L_0x002d:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r10 = r6 & 31
            int r6 = r1 - r2
            if (r6 <= 0) goto L_0x003a
            r0.m37710a(r4, r2, r1)
        L_0x003a:
            int r14 = r3 - r1
            long r1 = r0.f35160g
            long r7 = (long) r14
            long r8 = r1 - r7
            if (r6 >= 0) goto L_0x0045
            int r2 = -r6
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            long r6 = r0.f35166m
            boolean r11 = r0.f35165l
            if (r11 == 0) goto L_0x005f
            com.yandex.mobile.ads.impl.j90$b r11 = r0.f35164k
            boolean r11 = r11.mo67949a()
            if (r11 == 0) goto L_0x0055
            goto L_0x005f
        L_0x0055:
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r10
            goto L_0x0165
        L_0x005f:
            com.yandex.mobile.ads.impl.mq0 r11 = r0.f35157d
            r11.mo68849a(r2)
            com.yandex.mobile.ads.impl.mq0 r11 = r0.f35158e
            r11.mo68849a(r2)
            boolean r11 = r0.f35165l
            r12 = 3
            if (r11 != 0) goto L_0x0122
            com.yandex.mobile.ads.impl.mq0 r11 = r0.f35157d
            boolean r11 = r11.mo68848a()
            if (r11 == 0) goto L_0x0055
            com.yandex.mobile.ads.impl.mq0 r11 = r0.f35158e
            boolean r11 = r11.mo68848a()
            if (r11 == 0) goto L_0x0055
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.yandex.mobile.ads.impl.mq0 r13 = r0.f35157d
            byte[] r15 = r13.f37485d
            int r13 = r13.f37486e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.yandex.mobile.ads.impl.mq0 r13 = r0.f35158e
            byte[] r15 = r13.f37485d
            int r13 = r13.f37486e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.yandex.mobile.ads.impl.mq0 r13 = r0.f35157d
            byte[] r15 = r13.f37485d
            int r13 = r13.f37486e
            com.yandex.mobile.ads.impl.nq0$b r13 = com.yandex.mobile.ads.impl.nq0.m40149b(r15, r12, r13)
            com.yandex.mobile.ads.impl.mq0 r15 = r0.f35158e
            byte[] r1 = r15.f37485d
            int r15 = r15.f37486e
            com.yandex.mobile.ads.impl.nq0$a r1 = com.yandex.mobile.ads.impl.nq0.m40147a(r1, r12, r15)
            com.yandex.mobile.ads.impl.ke1 r15 = r0.f35163j
            java.lang.String r12 = r0.f35162i
            r27 = r3
            int r3 = r13.f37886a
            r28 = r4
            int r4 = r13.f37887b
            r29 = r5
            int r5 = r13.f37888c
            r17 = r15
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r16 = 0
            r15[r16] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 1
            r15[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r5 = 2
            r15[r5] = r3
            java.lang.String r3 = "avc1.%02X%02X%02X"
            java.lang.String r3 = java.lang.String.format(r3, r15)
            int r5 = r13.f37890e
            int r15 = r13.f37891f
            float r4 = r13.f37892g
            r18 = -1
            r19 = -1
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r26 = 0
            java.lang.String r16 = "video/avc"
            r30 = r10
            r21 = r15
            r10 = r17
            r15 = r12
            r17 = r3
            r20 = r5
            r23 = r11
            r25 = r4
            com.yandex.mobile.ads.exo.Format r3 = com.yandex.mobile.ads.exo.Format.m31680a((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (int) r19, (int) r20, (int) r21, (float) r22, (java.util.List<byte[]>) r23, (int) r24, (float) r25, (com.yandex.mobile.ads.exo.drm.DrmInitData) r26)
            r10.mo65339a(r3)
            r3 = 1
            r0.f35165l = r3
            com.yandex.mobile.ads.impl.j90$b r3 = r0.f35164k
            r3.mo67947a((com.yandex.mobile.ads.impl.nq0.C14127b) r13)
            com.yandex.mobile.ads.impl.j90$b r3 = r0.f35164k
            r3.mo67946a((com.yandex.mobile.ads.impl.nq0.C14126a) r1)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35157d
            r1.mo68850b()
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35158e
            r1.mo68850b()
            goto L_0x0165
        L_0x0122:
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r10
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35157d
            boolean r1 = r1.mo68848a()
            if (r1 == 0) goto L_0x0148
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35157d
            byte[] r3 = r1.f37485d
            int r1 = r1.f37486e
            r4 = 3
            com.yandex.mobile.ads.impl.nq0$b r1 = com.yandex.mobile.ads.impl.nq0.m40149b(r3, r4, r1)
            com.yandex.mobile.ads.impl.j90$b r3 = r0.f35164k
            r3.mo67947a((com.yandex.mobile.ads.impl.nq0.C14127b) r1)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35157d
            r1.mo68850b()
            goto L_0x0165
        L_0x0148:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35158e
            boolean r1 = r1.mo68848a()
            if (r1 == 0) goto L_0x0165
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35158e
            byte[] r3 = r1.f37485d
            int r1 = r1.f37486e
            r4 = 3
            com.yandex.mobile.ads.impl.nq0$a r1 = com.yandex.mobile.ads.impl.nq0.m40147a(r3, r4, r1)
            com.yandex.mobile.ads.impl.j90$b r3 = r0.f35164k
            r3.mo67946a((com.yandex.mobile.ads.impl.nq0.C14126a) r1)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35158e
            r1.mo68850b()
        L_0x0165:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35159f
            boolean r1 = r1.mo68849a(r2)
            if (r1 == 0) goto L_0x018d
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35159f
            byte[] r2 = r1.f37485d
            int r1 = r1.f37486e
            int r1 = com.yandex.mobile.ads.impl.nq0.m40145a(r2, r1)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f35168o
            com.yandex.mobile.ads.impl.mq0 r3 = r0.f35159f
            byte[] r3 = r3.f37485d
            r2.mo67103a((byte[]) r3, (int) r1)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f35168o
            r2 = 4
            r1.mo67112e(r2)
            com.yandex.mobile.ads.impl.w71 r1 = r0.f35154a
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f35168o
            r1.mo70657a((long) r6, (com.yandex.mobile.ads.impl.fy0) r2)
        L_0x018d:
            com.yandex.mobile.ads.impl.j90$b r11 = r0.f35164k
            boolean r15 = r0.f35165l
            boolean r1 = r0.f35167n
            r12 = r8
            r16 = r1
            boolean r1 = r11.mo67950a(r12, r14, r15, r16)
            if (r1 == 0) goto L_0x019f
            r1 = 0
            r0.f35167n = r1
        L_0x019f:
            long r11 = r0.f35166m
            boolean r1 = r0.f35165l
            if (r1 == 0) goto L_0x01b1
            com.yandex.mobile.ads.impl.j90$b r1 = r0.f35164k
            boolean r1 = r1.mo67949a()
            if (r1 == 0) goto L_0x01ae
            goto L_0x01b1
        L_0x01ae:
            r2 = r30
            goto L_0x01bd
        L_0x01b1:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35157d
            r2 = r30
            r1.mo68851b(r2)
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35158e
            r1.mo68851b(r2)
        L_0x01bd:
            com.yandex.mobile.ads.impl.mq0 r1 = r0.f35159f
            r1.mo68851b(r2)
            com.yandex.mobile.ads.impl.j90$b r7 = r0.f35164k
            r10 = r2
            r7.mo67945a((long) r8, (int) r10, (long) r11)
            r3 = r27
            r4 = r28
            r2 = r29
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j90.mo65663a(com.yandex.mobile.ads.impl.fy0):void");
    }

    /* renamed from: a */
    private void m37710a(byte[] bArr, int i, int i2) {
        if (!this.f35165l || this.f35164k.mo67949a()) {
            this.f35157d.mo68847a(bArr, i, i2);
            this.f35158e.mo68847a(bArr, i, i2);
        }
        this.f35159f.mo68847a(bArr, i, i2);
        this.f35164k.mo67948a(bArr, i, i2);
    }
}
