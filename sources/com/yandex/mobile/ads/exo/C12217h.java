package com.yandex.mobile.ads.exo;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.p243my.target.ads.Reward;
import com.yandex.mobile.ads.exo.C12191e;
import com.yandex.mobile.ads.exo.C12260n;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12285e;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12309l;
import com.yandex.mobile.ads.exo.source.C12310m;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.exo.trackselection.C12334f;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13493jf;
import com.yandex.mobile.ads.impl.C14190ok;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.l90;
import com.yandex.mobile.ads.impl.le1;
import com.yandex.mobile.ads.impl.sz0;
import com.yandex.mobile.ads.impl.t71;
import com.yandex.mobile.ads.impl.u31;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.mobile.ads.exo.h */
final class C12217h implements Handler.Callback, C12285e.C12286a, C12334f.C12335a, C12287f.C12289b, C12191e.C12192a, C12260n.C12261a {

    /* renamed from: A */
    private boolean f29766A;

    /* renamed from: B */
    private int f29767B;

    /* renamed from: C */
    private boolean f29768C;

    /* renamed from: D */
    private boolean f29769D;

    /* renamed from: E */
    private int f29770E;

    /* renamed from: F */
    private C12222e f29771F;

    /* renamed from: G */
    private long f29772G;

    /* renamed from: H */
    private int f29773H;

    /* renamed from: I */
    private boolean f29774I;

    /* renamed from: b */
    private final C12263o[] f29775b;

    /* renamed from: c */
    private final C12178d[] f29776c;

    /* renamed from: d */
    private final C12334f f29777d;

    /* renamed from: e */
    private final le1 f29778e;

    /* renamed from: f */
    private final C14190ok f29779f;

    /* renamed from: g */
    private final C12579bb f29780g;

    /* renamed from: h */
    private final l90 f29781h;

    /* renamed from: i */
    private final HandlerThread f29782i;

    /* renamed from: j */
    private final Handler f29783j;

    /* renamed from: k */
    private final C12270q.C12273c f29784k;

    /* renamed from: l */
    private final C12270q.C12272b f29785l;

    /* renamed from: m */
    private final long f29786m;

    /* renamed from: n */
    private final boolean f29787n;

    /* renamed from: o */
    private final C12191e f29788o;

    /* renamed from: p */
    private final C12221d f29789p;

    /* renamed from: q */
    private final ArrayList<C12220c> f29790q;

    /* renamed from: r */
    private final C13493jf f29791r;

    /* renamed from: s */
    private final C12225k f29792s = new C12225k();

    /* renamed from: t */
    private t71 f29793t;

    /* renamed from: u */
    private C12226l f29794u;

    /* renamed from: v */
    private C12287f f29795v;

    /* renamed from: w */
    private C12263o[] f29796w;

    /* renamed from: x */
    private boolean f29797x;

    /* renamed from: y */
    private boolean f29798y;

    /* renamed from: z */
    private boolean f29799z;

    /* renamed from: com.yandex.mobile.ads.exo.h$b */
    private static final class C12219b {

        /* renamed from: a */
        public final C12287f f29800a;

        /* renamed from: b */
        public final C12270q f29801b;

        public C12219b(C12287f fVar, C12270q qVar) {
            this.f29800a = fVar;
            this.f29801b = qVar;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.h$c */
    private static final class C12220c implements Comparable<C12220c> {

        /* renamed from: b */
        public final C12260n f29802b;

        /* renamed from: c */
        public int f29803c;

        /* renamed from: d */
        public long f29804d;

        /* renamed from: e */
        public Object f29805e;

        public int compareTo(Object obj) {
            C12220c cVar = (C12220c) obj;
            Object obj2 = this.f29805e;
            if ((obj2 == null) == (cVar.f29805e == null)) {
                if (obj2 != null) {
                    int i = this.f29803c - cVar.f29803c;
                    if (i != 0) {
                        return i;
                    }
                    long j = this.f29804d;
                    long j2 = cVar.f29804d;
                    int i2 = ih1.f34858a;
                    int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i3 >= 0) {
                        if (i3 == 0) {
                            return 0;
                        }
                        return 1;
                    }
                }
                return 0;
            } else if (obj2 != null) {
                return -1;
            } else {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.h$d */
    private static final class C12221d {

        /* renamed from: a */
        private C12226l f29806a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f29807b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f29808c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f29809d;

        private C12221d() {
        }

        /* renamed from: a */
        public boolean mo64939a(C12226l lVar) {
            return lVar != this.f29806a || this.f29807b > 0 || this.f29808c;
        }

        /* renamed from: b */
        public void mo64941b(C12226l lVar) {
            this.f29806a = lVar;
            this.f29807b = 0;
            this.f29808c = false;
        }

        /* renamed from: a */
        public void mo64938a(int i) {
            this.f29807b += i;
        }

        /* renamed from: b */
        public void mo64940b(int i) {
            boolean z = true;
            if (!this.f29808c || this.f29809d == 4) {
                this.f29808c = true;
                this.f29809d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C13479j9.m37705a(z);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.h$e */
    private static final class C12222e {

        /* renamed from: a */
        public final C12270q f29810a;

        /* renamed from: b */
        public final int f29811b;

        /* renamed from: c */
        public final long f29812c;

        public C12222e(C12270q qVar, int i, long j) {
            this.f29810a = qVar;
            this.f29811b = i;
            this.f29812c = j;
        }
    }

    public C12217h(C12263o[] oVarArr, C12334f fVar, le1 le1, C14190ok okVar, C12579bb bbVar, boolean z, int i, boolean z2, Handler handler, C13493jf jfVar) {
        this.f29775b = oVarArr;
        this.f29777d = fVar;
        this.f29778e = le1;
        this.f29779f = okVar;
        this.f29780g = bbVar;
        this.f29798y = z;
        this.f29767B = i;
        this.f29768C = z2;
        this.f29783j = handler;
        this.f29791r = jfVar;
        this.f29786m = okVar.mo69188b();
        this.f29787n = okVar.mo69192f();
        this.f29793t = t71.f40258d;
        this.f29794u = C12226l.m32012a(-9223372036854775807L, le1);
        this.f29789p = new C12221d();
        this.f29776c = new C12178d[oVarArr.length];
        for (int i2 = 0; i2 < oVarArr.length; i2++) {
            oVarArr[i2].mo64801a(i2);
            this.f29776c[i2] = oVarArr[i2].mo64821p();
        }
        this.f29788o = new C12191e(this, jfVar);
        this.f29790q = new ArrayList<>();
        this.f29796w = new C12263o[0];
        this.f29784k = new C12270q.C12273c();
        this.f29785l = new C12270q.C12272b();
        fVar.mo65406a(this, bbVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f29782i = handlerThread;
        handlerThread.start();
        this.f29781h = jfVar.mo67514a(handlerThread.getLooper(), this);
        this.f29774I = true;
    }

    /* renamed from: d */
    private void m31933d(boolean z) throws k40 {
        this.f29799z = false;
        this.f29798y = z;
        if (!z) {
            m31945o();
            m31947q();
            return;
        }
        int i = this.f29794u.f29851e;
        if (i == 3) {
            m31944n();
            this.f29781h.mo67972b(2);
        } else if (i == 2) {
            this.f29781h.mo67972b(2);
        }
    }

    /* renamed from: e */
    private void m31935e(boolean z) throws k40 {
        this.f29768C = z;
        if (!this.f29792s.mo64975b(z)) {
            m31928b(true);
        }
        m31915a(false);
    }

    /* renamed from: g */
    private boolean m31938g() {
        C12223i d = this.f29792s.mo64977d();
        long j = d.f29818f.f29831e;
        return d.f29816d && (j == -9223372036854775807L || this.f29794u.f29859m < j);
    }

    /* renamed from: h */
    private void m31939h() {
        boolean z;
        if (!m31937f()) {
            z = false;
        } else {
            C12223i c = this.f29792s.mo64976c();
            z = this.f29779f.mo69186a(m31901a(!c.f29816d ? 0 : c.f29813a.mo65267g()), this.f29788o.mo64869m().f40190a);
        }
        this.f29766A = z;
        if (z) {
            this.f29792s.mo64976c().mo64945a(this.f29772G);
        }
        m31946p();
    }

    /* renamed from: i */
    private void m31940i() {
        if (this.f29789p.mo64939a(this.f29794u)) {
            this.f29783j.obtainMessage(0, this.f29789p.f29807b, this.f29789p.f29808c ? this.f29789p.f29809d : -1, this.f29794u).sendToTarget();
            this.f29789p.mo64941b(this.f29794u);
        }
    }

    /* renamed from: k */
    private void m31941k() {
        m31918a(true, true, true, true, false);
        this.f29779f.mo69190d();
        m31922b(1);
        this.f29782i.quit();
        synchronized (this) {
            this.f29797x = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0050 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31942l() throws com.yandex.mobile.ads.impl.k40 {
        /*
            r16 = this;
            r6 = r16
            com.yandex.mobile.ads.exo.e r0 = r6.f29788o
            com.yandex.mobile.ads.impl.sz0 r0 = r0.mo64869m()
            float r0 = r0.f40190a
            com.yandex.mobile.ads.exo.k r1 = r6.f29792s
            com.yandex.mobile.ads.exo.i r1 = r1.mo64977d()
            com.yandex.mobile.ads.exo.k r2 = r6.f29792s
            com.yandex.mobile.ads.exo.i r2 = r2.mo64978e()
            r7 = 1
            r3 = 1
        L_0x0018:
            if (r1 == 0) goto L_0x011f
            boolean r4 = r1.f29816d
            if (r4 != 0) goto L_0x0020
            goto L_0x011f
        L_0x0020:
            com.yandex.mobile.ads.exo.l r4 = r6.f29794u
            com.yandex.mobile.ads.exo.q r4 = r4.f29847a
            com.yandex.mobile.ads.impl.le1 r9 = r1.mo64947b(r0, r4)
            com.yandex.mobile.ads.impl.le1 r4 = r1.mo64957h()
            r14 = 0
            if (r4 == 0) goto L_0x004d
            com.yandex.mobile.ads.exo.trackselection.e r5 = r4.f36650c
            int r5 = r5.f30307a
            com.yandex.mobile.ads.exo.trackselection.e r8 = r9.f36650c
            int r8 = r8.f30307a
            if (r5 == r8) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            r5 = 0
        L_0x003b:
            com.yandex.mobile.ads.exo.trackselection.e r8 = r9.f36650c
            int r8 = r8.f30307a
            if (r5 >= r8) goto L_0x004b
            boolean r8 = r9.mo68416a(r4, r5)
            if (r8 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x004b:
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 != 0) goto L_0x0116
            r15 = 4
            if (r3 == 0) goto L_0x00e6
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r4 = r0.mo64977d()
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            boolean r12 = r0.mo64972a((com.yandex.mobile.ads.exo.C12223i) r4)
            com.yandex.mobile.ads.exo.o[] r0 = r6.f29775b
            int r0 = r0.length
            boolean[] r5 = new boolean[r0]
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            long r10 = r0.f29859m
            r8 = r4
            r13 = r5
            long r8 = r8.mo64943a(r9, r10, r12, r13)
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r1 = r0.f29851e
            if (r1 == r15) goto L_0x0095
            long r0 = r0.f29859m
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0095
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            com.yandex.mobile.ads.exo.source.f$a r1 = r0.f29848b
            long r10 = r0.f29850d
            r0 = r16
            r2 = r8
            r12 = r4
            r13 = r5
            r4 = r10
            com.yandex.mobile.ads.exo.l r0 = r0.m31904a((com.yandex.mobile.ads.exo.source.C12287f.C12288a) r1, (long) r2, (long) r4)
            r6.f29794u = r0
            com.yandex.mobile.ads.exo.h$d r0 = r6.f29789p
            r0.mo64940b((int) r15)
            r6.m31923b((long) r8)
            goto L_0x0097
        L_0x0095:
            r12 = r4
            r13 = r5
        L_0x0097:
            com.yandex.mobile.ads.exo.o[] r0 = r6.f29775b
            int r0 = r0.length
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r2 = 0
        L_0x009e:
            com.yandex.mobile.ads.exo.o[] r3 = r6.f29775b
            int r4 = r3.length
            if (r1 >= r4) goto L_0x00d2
            r3 = r3[r1]
            int r4 = r3.mo64809b()
            if (r4 == 0) goto L_0x00ad
            r4 = 1
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            r0[r1] = r4
            com.yandex.mobile.ads.exo.source.l[] r4 = r12.f29815c
            r4 = r4[r1]
            if (r4 == 0) goto L_0x00b8
            int r2 = r2 + 1
        L_0x00b8:
            boolean r5 = r0[r1]
            if (r5 == 0) goto L_0x00cf
            com.yandex.mobile.ads.exo.source.l r5 = r3.mo64822q()
            if (r4 == r5) goto L_0x00c6
            r6.m31913a((com.yandex.mobile.ads.exo.C12263o) r3)
            goto L_0x00cf
        L_0x00c6:
            boolean r4 = r13[r1]
            if (r4 == 0) goto L_0x00cf
            long r4 = r6.f29772G
            r3.mo64803a((long) r4)
        L_0x00cf:
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00d2:
            com.yandex.mobile.ads.exo.l r1 = r6.f29794u
            com.yandex.mobile.ads.exo.source.TrackGroupArray r3 = r12.mo64956g()
            com.yandex.mobile.ads.impl.le1 r4 = r12.mo64957h()
            com.yandex.mobile.ads.exo.l r1 = r1.mo64980a((com.yandex.mobile.ads.exo.source.TrackGroupArray) r3, (com.yandex.mobile.ads.impl.le1) r4)
            r6.f29794u = r1
            r6.m31919a((boolean[]) r0, (int) r2)
            goto L_0x0100
        L_0x00e6:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            r0.mo64972a((com.yandex.mobile.ads.exo.C12223i) r1)
            boolean r0 = r1.f29816d
            if (r0 == 0) goto L_0x0100
            com.yandex.mobile.ads.exo.j r0 = r1.f29818f
            long r2 = r0.f29828b
            long r4 = r6.f29772G
            long r4 = r1.mo64951d(r4)
            long r2 = java.lang.Math.max(r2, r4)
            r1.mo64942a(r9, r2, r14)
        L_0x0100:
            r6.m31915a((boolean) r7)
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r0 = r0.f29851e
            if (r0 == r15) goto L_0x0115
            r16.m31939h()
            r16.m31947q()
            com.yandex.mobile.ads.impl.l90 r0 = r6.f29781h
            r1 = 2
            r0.mo67972b(r1)
        L_0x0115:
            return
        L_0x0116:
            if (r1 != r2) goto L_0x0119
            r3 = 0
        L_0x0119:
            com.yandex.mobile.ads.exo.i r1 = r1.mo64952d()
            goto L_0x0018
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31942l():void");
    }

    /* renamed from: m */
    private void m31943m() {
        for (C12263o oVar : this.f29775b) {
            if (oVar.mo64822q() != null) {
                oVar.mo64814h();
            }
        }
    }

    /* renamed from: n */
    private void m31944n() throws k40 {
        this.f29799z = false;
        this.f29788o.mo64863a();
        for (C12263o a : this.f29796w) {
            a.mo64799a();
        }
    }

    /* renamed from: o */
    private void m31945o() throws k40 {
        this.f29788o.mo64867b();
        for (C12263o oVar : this.f29796w) {
            if (oVar.mo64809b() == 2) {
                oVar.mo64811d();
            }
        }
    }

    /* renamed from: p */
    private void m31946p() {
        C12223i c = this.f29792s.mo64976c();
        boolean z = this.f29766A || (c != null && c.f29813a.mo65260a());
        C12226l lVar = this.f29794u;
        if (z != lVar.f29853g) {
            C12226l lVar2 = r2;
            C12226l lVar3 = new C12226l(lVar.f29847a, lVar.f29848b, lVar.f29849c, lVar.f29850d, lVar.f29851e, lVar.f29852f, z, lVar.f29854h, lVar.f29855i, lVar.f29856j, lVar.f29857k, lVar.f29858l, lVar.f29859m);
            this.f29794u = lVar2;
            return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0104 A[LOOP:1: B:45:0x00e8->B:55:0x0104, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d6 A[EDGE_INSN: B:80:0x00d6->B:41:0x00d6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00e7 A[EDGE_INSN: B:84:0x00e7->B:44:0x00e7 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31947q() throws com.yandex.mobile.ads.impl.k40 {
        /*
            r15 = this;
            com.yandex.mobile.ads.exo.k r0 = r15.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64977d()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f29816d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            com.yandex.mobile.ads.exo.source.e r1 = r0.f29813a
            long r4 = r1.mo65268h()
            r8 = r4
            goto L_0x001b
        L_0x001a:
            r8 = r2
        L_0x001b:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0040
            r15.m31923b((long) r8)
            com.yandex.mobile.ads.exo.l r0 = r15.f29794u
            long r0 = r0.f29859m
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x003d
            com.yandex.mobile.ads.exo.l r0 = r15.f29794u
            com.yandex.mobile.ads.exo.source.f$a r7 = r0.f29848b
            long r10 = r0.f29850d
            r6 = r15
            com.yandex.mobile.ads.exo.l r0 = r6.m31904a((com.yandex.mobile.ads.exo.source.C12287f.C12288a) r7, (long) r8, (long) r10)
            r15.f29794u = r0
            com.yandex.mobile.ads.exo.h$d r0 = r15.f29789p
            r1 = 4
            r0.mo64940b((int) r1)
        L_0x003d:
            r11 = r15
            goto L_0x0158
        L_0x0040:
            com.yandex.mobile.ads.exo.e r1 = r15.f29788o
            com.yandex.mobile.ads.exo.k r2 = r15.f29792s
            com.yandex.mobile.ads.exo.i r2 = r2.mo64978e()
            r3 = 0
            if (r0 == r2) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            long r1 = r1.mo64862a((boolean) r2)
            r15.f29772G = r1
            long r0 = r0.mo64951d(r1)
            com.yandex.mobile.ads.exo.l r2 = r15.f29794u
            long r4 = r2.f29859m
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r2 = r15.f29790q
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0153
            com.yandex.mobile.ads.exo.l r2 = r15.f29794u
            com.yandex.mobile.ads.exo.source.f$a r2 = r2.f29848b
            boolean r2 = r2.mo65283a()
            if (r2 == 0) goto L_0x0070
            goto L_0x0153
        L_0x0070:
            com.yandex.mobile.ads.exo.l r2 = r15.f29794u
            long r6 = r2.f29849c
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x007f
            boolean r6 = r15.f29774I
            if (r6 == 0) goto L_0x007f
            r6 = 1
            long r4 = r4 - r6
        L_0x007f:
            r15.f29774I = r3
            com.yandex.mobile.ads.exo.q r3 = r2.f29847a
            com.yandex.mobile.ads.exo.source.f$a r2 = r2.f29848b
            java.lang.Object r2 = r2.f30085a
            int r2 = r3.mo65186a((java.lang.Object) r2)
            int r3 = r15.f29773H
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r6 = r15.f29790q
            int r6 = r6.size()
            int r3 = java.lang.Math.min(r3, r6)
            r6 = 0
            if (r3 <= 0) goto L_0x00ab
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r15.f29790q
            int r8 = r3 + -1
            java.lang.Object r7 = r7.get(r8)
            com.yandex.mobile.ads.exo.h$c r7 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r7
            r10 = r15
            r11 = r10
            r8 = r4
            r4 = r2
            r5 = r3
            r2 = r0
            goto L_0x00b5
        L_0x00ab:
            r9 = r15
            r10 = r9
            r7 = r4
            r4 = r2
            r5 = r3
            r2 = r0
        L_0x00b1:
            r11 = r10
            r10 = r9
            r8 = r7
            r7 = r6
        L_0x00b5:
            if (r7 == 0) goto L_0x00d6
            int r12 = r7.f29803c
            if (r12 > r4) goto L_0x00c3
            if (r12 != r4) goto L_0x00d6
            long r12 = r7.f29804d
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d6
        L_0x00c3:
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x00d2
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            int r12 = r5 + -1
            java.lang.Object r7 = r7.get(r12)
            com.yandex.mobile.ads.exo.h$c r7 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r7
            goto L_0x00b5
        L_0x00d2:
            r7 = r8
            r9 = r10
            r10 = r11
            goto L_0x00b1
        L_0x00d6:
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x00e7
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            java.lang.Object r7 = r7.get(r5)
            com.yandex.mobile.ads.exo.h$c r7 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r7
            goto L_0x00e8
        L_0x00e7:
            r7 = r6
        L_0x00e8:
            if (r7 == 0) goto L_0x010d
            java.lang.Object r12 = r7.f29805e
            if (r12 == 0) goto L_0x010d
            int r12 = r7.f29803c
            if (r12 < r4) goto L_0x00fa
            if (r12 != r4) goto L_0x010d
            long r12 = r7.f29804d
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 > 0) goto L_0x010d
        L_0x00fa:
            int r5 = r5 + 1
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x00e7
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            java.lang.Object r7 = r7.get(r5)
            com.yandex.mobile.ads.exo.h$c r7 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r7
            goto L_0x00e8
        L_0x010d:
            if (r7 == 0) goto L_0x014f
            java.lang.Object r12 = r7.f29805e
            if (r12 == 0) goto L_0x014f
            int r12 = r7.f29803c
            if (r12 != r4) goto L_0x014f
            long r12 = r7.f29804d
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x014f
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x014f
            com.yandex.mobile.ads.exo.n r12 = r7.f29802b     // Catch:{ all -> 0x0143 }
            r10.m31932d((com.yandex.mobile.ads.exo.C12260n) r12)     // Catch:{ all -> 0x0143 }
            com.yandex.mobile.ads.exo.n r7 = r7.f29802b
            r7.getClass()
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            r7.remove(r5)
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0141
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r7 = r10.f29790q
            java.lang.Object r7 = r7.get(r5)
            com.yandex.mobile.ads.exo.h$c r7 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r7
            goto L_0x010d
        L_0x0141:
            r7 = r6
            goto L_0x010d
        L_0x0143:
            r0 = move-exception
            com.yandex.mobile.ads.exo.n r1 = r7.f29802b
            r1.getClass()
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r1 = r10.f29790q
            r1.remove(r5)
            throw r0
        L_0x014f:
            r10.f29773H = r5
            r0 = r2
            goto L_0x0154
        L_0x0153:
            r11 = r15
        L_0x0154:
            com.yandex.mobile.ads.exo.l r2 = r11.f29794u
            r2.f29859m = r0
        L_0x0158:
            com.yandex.mobile.ads.exo.k r0 = r11.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64976c()
            com.yandex.mobile.ads.exo.l r1 = r11.f29794u
            long r2 = r0.mo64949c()
            r1.f29857k = r2
            com.yandex.mobile.ads.exo.l r0 = r11.f29794u
            long r1 = r11.m31929c()
            r0.f29858l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31947q():void");
    }

    /* renamed from: a */
    public void mo64929a(C12310m mVar) {
        this.f29781h.mo67969a(10, (Object) (C12285e) mVar).sendToTarget();
    }

    /* renamed from: b */
    public Looper mo64931b() {
        return this.f29782i.getLooper();
    }

    /* renamed from: c */
    public void mo64933c(boolean z) {
        this.f29781h.mo67967a(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: f */
    public void mo64934f(boolean z) {
        this.f29781h.mo67967a(6, z ? 1 : 0, 0).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        k40 k40;
        try {
            switch (message.what) {
                case 0:
                    m31926b((C12287f) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    m31933d(message.arg1 != 0);
                    break;
                case 2:
                    m31906a();
                    break;
                case 3:
                    m31910a((C12222e) message.obj);
                    break;
                case 4:
                    m31927b((sz0) message.obj);
                    break;
                case 5:
                    this.f29793t = (t71) message.obj;
                    break;
                case 6:
                    m31917a(false, message.arg1 != 0, true);
                    break;
                case 7:
                    m31941k();
                    return true;
                case 8:
                    m31909a((C12219b) message.obj);
                    break;
                case 9:
                    m31930c((C12285e) message.obj);
                    break;
                case 10:
                    m31925b((C12285e) message.obj);
                    break;
                case 11:
                    m31942l();
                    break;
                case 12:
                    m31907a(message.arg1);
                    break;
                case 13:
                    m31935e(message.arg1 != 0);
                    break;
                case 14:
                    m31916a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    C12260n nVar = (C12260n) message.obj;
                    nVar.getClass();
                    m31932d(nVar);
                    break;
                case 16:
                    m31934e((C12260n) message.obj);
                    break;
                case 17:
                    m31914a((sz0) message.obj, message.arg1 != 0);
                    break;
                default:
                    return false;
            }
            m31940i();
        } catch (k40 e) {
            if (e.f35952b != 1) {
                str = "Playback error.";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Renderer error: index=");
                sb.append(e.f35953c);
                sb.append(", type=");
                int o = this.f29775b[e.f35953c].mo64820o();
                int i = ih1.f34858a;
                switch (o) {
                    case 0:
                        str2 = Reward.DEFAULT;
                        break;
                    case 1:
                        str2 = "audio";
                        break;
                    case 2:
                        str2 = "video";
                        break;
                    case 3:
                        str2 = "text";
                        break;
                    case 4:
                        str2 = "metadata";
                        break;
                    case 5:
                        str2 = "camera motion";
                        break;
                    case 6:
                        str2 = "none";
                        break;
                    default:
                        if (o < 10000) {
                            str2 = "?";
                            break;
                        } else {
                            str2 = "custom (" + o + ")";
                            break;
                        }
                }
                sb.append(str2);
                sb.append(", format=");
                sb.append(e.f35954d);
                sb.append(", rendererSupport=");
                int i2 = e.f35955e;
                if (i2 == 0) {
                    str3 = "NO";
                } else if (i2 == 1) {
                    str3 = "NO_UNSUPPORTED_TYPE";
                } else if (i2 == 2) {
                    str3 = "NO_UNSUPPORTED_DRM";
                } else if (i2 == 3) {
                    str3 = "NO_EXCEEDS_CAPABILITIES";
                } else if (i2 == 4) {
                    str3 = "YES";
                } else {
                    throw new IllegalStateException();
                }
                sb.append(str3);
                str = sb.toString();
            }
            bk0.m34269a("ExoPlayerImplInternal", str, e);
            m31917a(true, false, false);
            this.f29794u = this.f29794u.mo64982a(e);
            m31940i();
        } catch (IOException e2) {
            bk0.m34269a("ExoPlayerImplInternal", "Source error", e2);
            m31917a(false, false, false);
            this.f29794u = this.f29794u.mo64982a(k40.m38182a(e2));
            m31940i();
        } catch (OutOfMemoryError | RuntimeException e3) {
            bk0.m34269a("ExoPlayerImplInternal", "Internal runtime error", e3);
            if (e3 instanceof OutOfMemoryError) {
                k40 = k40.m38184a((OutOfMemoryError) e3);
            } else {
                k40 = k40.m38185a((RuntimeException) e3);
            }
            m31917a(true, false, false);
            this.f29794u = this.f29794u.mo64982a(k40);
            m31940i();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64936j() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f29797x     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x002a
            android.os.HandlerThread r0 = r2.f29782i     // Catch:{ all -> 0x002c }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x000e
            goto L_0x002a
        L_0x000e:
            com.yandex.mobile.ads.impl.l90 r0 = r2.f29781h     // Catch:{ all -> 0x002c }
            r1 = 7
            r0.mo67972b(r1)     // Catch:{ all -> 0x002c }
            r0 = 0
        L_0x0015:
            boolean r1 = r2.f29797x     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x001f
            r2.wait()     // Catch:{ InterruptedException -> 0x001d }
            goto L_0x0015
        L_0x001d:
            r0 = 1
            goto L_0x0015
        L_0x001f:
            if (r0 == 0) goto L_0x0028
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002c }
            r0.interrupt()     // Catch:{ all -> 0x002c }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.mo64936j():void");
    }

    /* renamed from: b */
    private void m31922b(int i) {
        C12226l lVar = this.f29794u;
        if (lVar.f29851e != i) {
            C12226l lVar2 = r3;
            C12226l lVar3 = new C12226l(lVar.f29847a, lVar.f29848b, lVar.f29849c, lVar.f29850d, i, lVar.f29852f, lVar.f29853g, lVar.f29854h, lVar.f29855i, lVar.f29856j, lVar.f29857k, lVar.f29858l, lVar.f29859m);
            this.f29794u = lVar2;
        }
    }

    /* renamed from: f */
    private boolean m31937f() {
        C12223i c = this.f29792s.mo64976c();
        if (c == null) {
            return false;
        }
        if ((!c.f29816d ? 0 : c.f29813a.mo65267g()) == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public synchronized void mo64932c(C12260n nVar) {
        if (!this.f29797x) {
            if (this.f29782i.isAlive()) {
                this.f29781h.mo67969a(15, (Object) nVar).sendToTarget();
                return;
            }
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        nVar.mo65124a(false);
    }

    /* renamed from: a */
    public void mo64928a(C12287f fVar, boolean z, boolean z2) {
        this.f29781h.mo67968a(0, z ? 1 : 0, z2 ? 1 : 0, fVar).sendToTarget();
    }

    /* renamed from: b */
    private void m31926b(C12287f fVar, boolean z, boolean z2) {
        this.f29770E++;
        m31918a(false, true, z, z2, true);
        this.f29779f.mo69189c();
        this.f29795v = fVar;
        m31922b(2);
        fVar.mo65251a(this, this.f29780g.mo65788a());
        this.f29781h.mo67972b(2);
    }

    /* renamed from: e */
    private void m31934e(C12260n nVar) {
        Handler b = nVar.mo65126b();
        if (!b.getLooper().getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            nVar.mo65124a(false);
            return;
        }
        b.post(new Runnable(nVar) {
            public final /* synthetic */ C12260n f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12217h.this.m31924b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo64927a(C12287f fVar, C12270q qVar) {
        this.f29781h.mo67969a(8, (Object) new C12219b(fVar, qVar)).sendToTarget();
    }

    /* renamed from: a */
    public void mo64926a(C12285e eVar) {
        this.f29781h.mo67969a(9, (Object) eVar).sendToTarget();
    }

    /* renamed from: a */
    private void m31907a(int i) throws k40 {
        this.f29767B = i;
        if (!this.f29792s.mo64970a(i)) {
            m31928b(true);
        }
        m31915a(false);
    }

    /* renamed from: c */
    private void m31930c(C12285e eVar) throws k40 {
        if (this.f29792s.mo64973a(eVar)) {
            C12223i c = this.f29792s.mo64976c();
            c.mo64944a(this.f29788o.mo64869m().f40190a, this.f29794u.f29847a);
            this.f29779f.mo69185a(this.f29775b, c.mo64957h().f36650c);
            if (c == this.f29792s.mo64977d()) {
                m31923b(c.f29818f.f29828b);
                m31911a((C12223i) null);
            }
            m31939h();
        }
    }

    /* renamed from: d */
    private void m31932d(C12260n nVar) throws k40 {
        if (nVar.mo65126b().getLooper() == this.f29781h.mo67966a()) {
            m31912a(nVar);
            int i = this.f29794u.f29851e;
            if (i == 3 || i == 2) {
                this.f29781h.mo67972b(2);
                return;
            }
            return;
        }
        this.f29781h.mo67969a(16, (Object) nVar).sendToTarget();
    }

    /* renamed from: e */
    private boolean m31936e() {
        C12223i e = this.f29792s.mo64978e();
        if (!e.f29816d) {
            return false;
        }
        int i = 0;
        while (true) {
            C12263o[] oVarArr = this.f29775b;
            if (i >= oVarArr.length) {
                return true;
            }
            C12263o oVar = oVarArr[i];
            C12309l lVar = e.f29815c[i];
            if (oVar.mo64822q() != lVar || (lVar != null && !oVar.mo64817k())) {
                return false;
            }
            i++;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02da, code lost:
        if (r6.f29779f.mo69187a(m31929c(), r6.f29788o.mo64869m().f40190a, r6.f29799z) == false) goto L_0x02dd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31906a() throws com.yandex.mobile.ads.impl.k40, java.io.IOException {
        /*
            r21 = this;
            r6 = r21
            com.yandex.mobile.ads.impl.jf r0 = r6.f29791r
            long r7 = r0.mo67513a()
            com.yandex.mobile.ads.exo.source.f r0 = r6.f29795v
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 1
            if (r0 != 0) goto L_0x0015
            goto L_0x01ce
        L_0x0015:
            int r1 = r6.f29770E
            if (r1 <= 0) goto L_0x001e
            r0.mo65281a()
            goto L_0x01ce
        L_0x001e:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            long r1 = r6.f29772G
            r0.mo64967a((long) r1)
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            boolean r0 = r0.mo64979f()
            if (r0 == 0) goto L_0x008e
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            long r1 = r6.f29772G
            com.yandex.mobile.ads.exo.l r3 = r6.f29794u
            com.yandex.mobile.ads.exo.j r0 = r0.mo64964a((long) r1, (com.yandex.mobile.ads.exo.C12226l) r3)
            if (r0 != 0) goto L_0x0059
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64976c()
            if (r0 == 0) goto L_0x0053
            com.yandex.mobile.ads.exo.o[] r0 = r6.f29796w
            int r1 = r0.length
            r2 = 0
        L_0x0045:
            if (r2 >= r1) goto L_0x0053
            r3 = r0[r2]
            boolean r3 = r3.mo64817k()
            if (r3 != 0) goto L_0x0050
            goto L_0x008e
        L_0x0050:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0053:
            com.yandex.mobile.ads.exo.source.f r0 = r6.f29795v
            r0.mo65281a()
            goto L_0x008e
        L_0x0059:
            com.yandex.mobile.ads.exo.k r14 = r6.f29792s
            com.yandex.mobile.ads.exo.d[] r15 = r6.f29776c
            com.yandex.mobile.ads.exo.trackselection.f r1 = r6.f29777d
            com.yandex.mobile.ads.impl.ok r2 = r6.f29779f
            com.yandex.mobile.ads.impl.j7 r17 = r2.mo69184a()
            com.yandex.mobile.ads.exo.source.f r2 = r6.f29795v
            com.yandex.mobile.ads.impl.le1 r3 = r6.f29778e
            r16 = r1
            r18 = r2
            r19 = r0
            r20 = r3
            com.yandex.mobile.ads.exo.i r1 = r14.mo64963a(r15, r16, r17, r18, r19, r20)
            com.yandex.mobile.ads.exo.source.e r2 = r1.f29813a
            long r3 = r0.f29828b
            r2.mo65259a((com.yandex.mobile.ads.exo.source.C12285e.C12286a) r6, (long) r3)
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64977d()
            if (r0 != r1) goto L_0x008b
            long r0 = r1.mo64955f()
            r6.m31923b((long) r0)
        L_0x008b:
            r6.m31915a((boolean) r12)
        L_0x008e:
            boolean r0 = r6.f29766A
            if (r0 == 0) goto L_0x009c
            boolean r0 = r21.m31937f()
            r6.f29766A = r0
            r21.m31946p()
            goto L_0x009f
        L_0x009c:
            r21.m31939h()
        L_0x009f:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64978e()
            if (r0 != 0) goto L_0x00a9
            goto L_0x0158
        L_0x00a9:
            com.yandex.mobile.ads.exo.i r1 = r0.mo64952d()
            if (r1 != 0) goto L_0x00d5
            com.yandex.mobile.ads.exo.j r1 = r0.f29818f
            boolean r1 = r1.f29833g
            if (r1 == 0) goto L_0x0158
            r1 = 0
        L_0x00b6:
            com.yandex.mobile.ads.exo.o[] r2 = r6.f29775b
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0158
            r2 = r2[r1]
            com.yandex.mobile.ads.exo.source.l[] r3 = r0.f29815c
            r3 = r3[r1]
            if (r3 == 0) goto L_0x00d2
            com.yandex.mobile.ads.exo.source.l r4 = r2.mo64822q()
            if (r4 != r3) goto L_0x00d2
            boolean r3 = r2.mo64817k()
            if (r3 == 0) goto L_0x00d2
            r2.mo64814h()
        L_0x00d2:
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00d5:
            boolean r1 = r21.m31936e()
            if (r1 != 0) goto L_0x00dd
            goto L_0x0158
        L_0x00dd:
            com.yandex.mobile.ads.exo.i r1 = r0.mo64952d()
            boolean r1 = r1.f29816d
            if (r1 != 0) goto L_0x00e7
            goto L_0x0158
        L_0x00e7:
            com.yandex.mobile.ads.impl.le1 r0 = r0.mo64957h()
            com.yandex.mobile.ads.exo.k r1 = r6.f29792s
            com.yandex.mobile.ads.exo.i r1 = r1.mo64974b()
            com.yandex.mobile.ads.impl.le1 r2 = r1.mo64957h()
            com.yandex.mobile.ads.exo.source.e r3 = r1.f29813a
            long r3 = r3.mo65268h()
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0103
            r21.m31943m()
            goto L_0x0158
        L_0x0103:
            r3 = 0
        L_0x0104:
            com.yandex.mobile.ads.exo.o[] r4 = r6.f29775b
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0158
            r4 = r4[r3]
            boolean r5 = r0.mo68415a(r3)
            if (r5 == 0) goto L_0x0154
            boolean r5 = r4.mo64818l()
            if (r5 != 0) goto L_0x0154
            com.yandex.mobile.ads.exo.trackselection.e r5 = r2.f36650c
            com.yandex.mobile.ads.exo.trackselection.d r5 = r5.mo65401a(r3)
            boolean r14 = r2.mo68415a(r3)
            com.yandex.mobile.ads.exo.d[] r15 = r6.f29776c
            r15 = r15[r3]
            int r15 = r15.mo64820o()
            r12 = 6
            if (r15 != r12) goto L_0x012e
            r12 = 1
            goto L_0x012f
        L_0x012e:
            r12 = 0
        L_0x012f:
            com.yandex.mobile.ads.impl.u31[] r15 = r0.f36649b
            r15 = r15[r3]
            com.yandex.mobile.ads.impl.u31[] r11 = r2.f36649b
            r11 = r11[r3]
            if (r14 == 0) goto L_0x0151
            boolean r11 = r11.equals(r15)
            if (r11 == 0) goto L_0x0151
            if (r12 != 0) goto L_0x0151
            com.yandex.mobile.ads.exo.Format[] r5 = m31921a((com.yandex.mobile.ads.exo.trackselection.C12330d) r5)
            com.yandex.mobile.ads.exo.source.l[] r11 = r1.f29815c
            r11 = r11[r3]
            long r14 = r1.mo64953e()
            r4.mo64808a(r5, r11, r14)
            goto L_0x0154
        L_0x0151:
            r4.mo64814h()
        L_0x0154:
            int r3 = r3 + 1
            r12 = 0
            goto L_0x0104
        L_0x0158:
            r0 = 0
        L_0x0159:
            boolean r1 = r6.f29798y
            if (r1 != 0) goto L_0x015e
            goto L_0x0189
        L_0x015e:
            com.yandex.mobile.ads.exo.k r1 = r6.f29792s
            com.yandex.mobile.ads.exo.i r1 = r1.mo64977d()
            if (r1 != 0) goto L_0x0167
            goto L_0x0189
        L_0x0167:
            com.yandex.mobile.ads.exo.i r2 = r1.mo64952d()
            if (r2 != 0) goto L_0x016e
            goto L_0x0189
        L_0x016e:
            com.yandex.mobile.ads.exo.k r3 = r6.f29792s
            com.yandex.mobile.ads.exo.i r3 = r3.mo64978e()
            if (r1 != r3) goto L_0x017d
            boolean r1 = r21.m31936e()
            if (r1 != 0) goto L_0x017d
            goto L_0x0189
        L_0x017d:
            long r3 = r6.f29772G
            long r1 = r2.mo64955f()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r1 == 0) goto L_0x01ce
            if (r0 == 0) goto L_0x0191
            r21.m31940i()
        L_0x0191:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r11 = r0.mo64977d()
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64978e()
            if (r11 != r0) goto L_0x01a2
            r21.m31943m()
        L_0x01a2:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64962a()
            r6.m31911a((com.yandex.mobile.ads.exo.C12223i) r11)
            com.yandex.mobile.ads.exo.j r0 = r0.f29818f
            com.yandex.mobile.ads.exo.source.f$a r1 = r0.f29827a
            long r2 = r0.f29828b
            long r4 = r0.f29829c
            r0 = r21
            com.yandex.mobile.ads.exo.l r0 = r0.m31904a((com.yandex.mobile.ads.exo.source.C12287f.C12288a) r1, (long) r2, (long) r4)
            r6.f29794u = r0
            com.yandex.mobile.ads.exo.j r0 = r11.f29818f
            boolean r0 = r0.f29832f
            if (r0 == 0) goto L_0x01c3
            r0 = 0
            goto L_0x01c4
        L_0x01c3:
            r0 = 3
        L_0x01c4:
            com.yandex.mobile.ads.exo.h$d r1 = r6.f29789p
            r1.mo64940b((int) r0)
            r21.m31947q()
            r0 = 1
            goto L_0x0159
        L_0x01ce:
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r0 = r0.f29851e
            r1 = 2
            if (r0 == r13) goto L_0x034e
            r2 = 4
            if (r0 != r2) goto L_0x01da
            goto L_0x034e
        L_0x01da:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64977d()
            r3 = 10
            if (r0 != 0) goto L_0x01e8
            r6.m31908a((long) r7, (long) r3)
            return
        L_0x01e8:
            java.lang.String r5 = "doSomeWork"
            com.yandex.mobile.ads.impl.he1.m36941a(r5)
            r21.m31947q()
            boolean r5 = r0.f29816d
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L_0x026c
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r14 = r14 * r11
            com.yandex.mobile.ads.exo.source.e r5 = r0.f29813a
            com.yandex.mobile.ads.exo.l r13 = r6.f29794u
            long r11 = r13.f29859m
            long r3 = r6.f29786m
            long r11 = r11 - r3
            boolean r3 = r6.f29787n
            r5.mo65258a((long) r11, (boolean) r3)
            r3 = 0
            r4 = 1
            r5 = 1
        L_0x020d:
            com.yandex.mobile.ads.exo.o[] r11 = r6.f29775b
            int r12 = r11.length
            if (r3 >= r12) goto L_0x0273
            r11 = r11[r3]
            int r12 = r11.mo64809b()
            if (r12 != 0) goto L_0x021b
            goto L_0x0269
        L_0x021b:
            long r12 = r6.f29772G
            r11.mo65005a(r12, r14)
            if (r4 == 0) goto L_0x022a
            boolean r4 = r11.mo65007e()
            if (r4 == 0) goto L_0x022a
            r4 = 1
            goto L_0x022b
        L_0x022a:
            r4 = 0
        L_0x022b:
            com.yandex.mobile.ads.exo.source.l[] r12 = r0.f29815c
            r12 = r12[r3]
            com.yandex.mobile.ads.exo.source.l r13 = r11.mo64822q()
            if (r12 == r13) goto L_0x0237
            r12 = 1
            goto L_0x0238
        L_0x0237:
            r12 = 0
        L_0x0238:
            if (r12 != 0) goto L_0x0248
            com.yandex.mobile.ads.exo.i r13 = r0.mo64952d()
            if (r13 == 0) goto L_0x0248
            boolean r13 = r11.mo64817k()
            if (r13 == 0) goto L_0x0248
            r13 = 1
            goto L_0x0249
        L_0x0248:
            r13 = 0
        L_0x0249:
            if (r12 != 0) goto L_0x025c
            if (r13 != 0) goto L_0x025c
            boolean r12 = r11.mo65006c()
            if (r12 != 0) goto L_0x025c
            boolean r12 = r11.mo65007e()
            if (r12 == 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r12 = 0
            goto L_0x025d
        L_0x025c:
            r12 = 1
        L_0x025d:
            if (r5 == 0) goto L_0x0263
            if (r12 == 0) goto L_0x0263
            r5 = 1
            goto L_0x0264
        L_0x0263:
            r5 = 0
        L_0x0264:
            if (r12 != 0) goto L_0x0269
            r11.mo64815i()
        L_0x0269:
            int r3 = r3 + 1
            goto L_0x020d
        L_0x026c:
            com.yandex.mobile.ads.exo.source.e r3 = r0.f29813a
            r3.mo65266f()
            r4 = 1
            r5 = 1
        L_0x0273:
            com.yandex.mobile.ads.exo.j r3 = r0.f29818f
            long r11 = r3.f29831e
            if (r4 == 0) goto L_0x0297
            boolean r3 = r0.f29816d
            if (r3 == 0) goto L_0x0297
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0289
            com.yandex.mobile.ads.exo.l r3 = r6.f29794u
            long r3 = r3.f29859m
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0297
        L_0x0289:
            com.yandex.mobile.ads.exo.j r0 = r0.f29818f
            boolean r0 = r0.f29833g
            if (r0 == 0) goto L_0x0297
            r6.m31922b((int) r2)
            r21.m31945o()
            goto L_0x030d
        L_0x0297:
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r3 = r0.f29851e
            if (r3 != r1) goto L_0x02ee
            com.yandex.mobile.ads.exo.o[] r3 = r6.f29796w
            int r3 = r3.length
            if (r3 != 0) goto L_0x02a7
            boolean r13 = r21.m31938g()
            goto L_0x02e0
        L_0x02a7:
            if (r5 != 0) goto L_0x02aa
            goto L_0x02dd
        L_0x02aa:
            boolean r0 = r0.f29853g
            if (r0 != 0) goto L_0x02af
            goto L_0x02df
        L_0x02af:
            com.yandex.mobile.ads.exo.k r0 = r6.f29792s
            com.yandex.mobile.ads.exo.i r0 = r0.mo64976c()
            boolean r3 = r0.mo64958i()
            if (r3 == 0) goto L_0x02c3
            com.yandex.mobile.ads.exo.j r0 = r0.f29818f
            boolean r0 = r0.f29833g
            if (r0 == 0) goto L_0x02c3
            r0 = 1
            goto L_0x02c4
        L_0x02c3:
            r0 = 0
        L_0x02c4:
            if (r0 != 0) goto L_0x02df
            com.yandex.mobile.ads.impl.ok r0 = r6.f29779f
            long r3 = r21.m31929c()
            com.yandex.mobile.ads.exo.e r9 = r6.f29788o
            com.yandex.mobile.ads.impl.sz0 r9 = r9.mo64869m()
            float r9 = r9.f40190a
            boolean r10 = r6.f29799z
            boolean r0 = r0.mo69187a(r3, r9, r10)
            if (r0 == 0) goto L_0x02dd
            goto L_0x02df
        L_0x02dd:
            r13 = 0
            goto L_0x02e0
        L_0x02df:
            r13 = 1
        L_0x02e0:
            if (r13 == 0) goto L_0x02ee
            r0 = 3
            r6.m31922b((int) r0)
            boolean r3 = r6.f29798y
            if (r3 == 0) goto L_0x030d
            r21.m31944n()
            goto L_0x030d
        L_0x02ee:
            r0 = 3
            com.yandex.mobile.ads.exo.l r3 = r6.f29794u
            int r3 = r3.f29851e
            if (r3 != r0) goto L_0x030d
            com.yandex.mobile.ads.exo.o[] r0 = r6.f29796w
            int r0 = r0.length
            if (r0 != 0) goto L_0x0301
            boolean r0 = r21.m31938g()
            if (r0 == 0) goto L_0x0303
            goto L_0x030d
        L_0x0301:
            if (r5 != 0) goto L_0x030d
        L_0x0303:
            boolean r0 = r6.f29798y
            r6.f29799z = r0
            r6.m31922b((int) r1)
            r21.m31945o()
        L_0x030d:
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r0 = r0.f29851e
            if (r0 != r1) goto L_0x0321
            com.yandex.mobile.ads.exo.o[] r0 = r6.f29796w
            int r3 = r0.length
            r12 = 0
        L_0x0317:
            if (r12 >= r3) goto L_0x0321
            r4 = r0[r12]
            r4.mo64815i()
            int r12 = r12 + 1
            goto L_0x0317
        L_0x0321:
            boolean r0 = r6.f29798y
            if (r0 == 0) goto L_0x032c
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r0 = r0.f29851e
            r3 = 3
            if (r0 == r3) goto L_0x0332
        L_0x032c:
            com.yandex.mobile.ads.exo.l r0 = r6.f29794u
            int r0 = r0.f29851e
            if (r0 != r1) goto L_0x0338
        L_0x0332:
            r0 = 10
            r6.m31908a((long) r7, (long) r0)
            goto L_0x034a
        L_0x0338:
            com.yandex.mobile.ads.exo.o[] r3 = r6.f29796w
            int r3 = r3.length
            if (r3 == 0) goto L_0x0345
            if (r0 == r2) goto L_0x0345
            r2 = 1000(0x3e8, double:4.94E-321)
            r6.m31908a((long) r7, (long) r2)
            goto L_0x034a
        L_0x0345:
            com.yandex.mobile.ads.impl.l90 r0 = r6.f29781h
            r0.mo67970a(r1)
        L_0x034a:
            com.yandex.mobile.ads.impl.he1.m36940a()
            return
        L_0x034e:
            com.yandex.mobile.ads.impl.l90 r0 = r6.f29781h
            r0.mo67970a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31906a():void");
    }

    /* renamed from: b */
    private void m31928b(boolean z) throws k40 {
        C12287f.C12288a aVar = this.f29792s.mo64977d().f29818f.f29827a;
        long a = m31902a(aVar, this.f29794u.f29859m, true);
        if (a != this.f29794u.f29859m) {
            this.f29794u = m31904a(aVar, a, this.f29794u.f29850d);
            if (z) {
                this.f29789p.mo64940b(4);
            }
        }
    }

    /* renamed from: d */
    private void m31931d() {
        if (this.f29794u.f29851e != 1) {
            m31922b(4);
        }
        m31918a(false, false, true, false, true);
    }

    /* renamed from: b */
    private void m31923b(long j) throws k40 {
        C12223i d = this.f29792s.mo64977d();
        if (d != null) {
            j = d.mo64954e(j);
        }
        this.f29772G = j;
        this.f29788o.mo64864a(j);
        for (C12263o a : this.f29796w) {
            a.mo64803a(this.f29772G);
        }
        for (C12223i d2 = this.f29792s.mo64977d(); d2 != null; d2 = d2.mo64952d()) {
            for (C12330d dVar : d2.mo64957h().f36650c.mo65402a()) {
                if (dVar != null) {
                    dVar.mo65393g();
                }
            }
        }
    }

    /* renamed from: c */
    private long m31929c() {
        return m31901a(this.f29794u.f29857k);
    }

    /* renamed from: b */
    private void m31927b(sz0 sz0) {
        this.f29788o.mo64866a(sz0);
        this.f29781h.mo67968a(17, 1, 0, this.f29788o.mo64869m()).sendToTarget();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31924b(C12260n nVar) {
        try {
            m31912a(nVar);
        } catch (k40 e) {
            bk0.m34269a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private void m31925b(C12285e eVar) {
        if (this.f29792s.mo64973a(eVar)) {
            this.f29792s.mo64967a(this.f29772G);
            m31939h();
        }
    }

    /* renamed from: a */
    private void m31908a(long j, long j2) {
        this.f29781h.mo67970a(2);
        this.f29781h.mo67971a(2, j + j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31910a(com.yandex.mobile.ads.exo.C12217h.C12222e r23) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r22 = this;
            r7 = r22
            r0 = r23
            com.yandex.mobile.ads.exo.h$d r1 = r7.f29789p
            r8 = 1
            r1.mo64938a((int) r8)
            android.util.Pair r1 = r7.m31903a((com.yandex.mobile.ads.exo.C12217h.C12222e) r0, (boolean) r8)
            r2 = 0
            r4 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x002a
            com.yandex.mobile.ads.exo.l r1 = r7.f29794u
            boolean r9 = r7.f29768C
            com.yandex.mobile.ads.exo.q$c r10 = r7.f29784k
            com.yandex.mobile.ads.exo.q$b r11 = r7.f29785l
            com.yandex.mobile.ads.exo.source.f$a r1 = r1.mo64983a(r9, r10, r11)
            r15 = r1
            r12 = r5
            r18 = r12
        L_0x0028:
            r9 = 1
            goto L_0x005a
        L_0x002a:
            java.lang.Object r9 = r1.first
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            com.yandex.mobile.ads.exo.k r12 = r7.f29792s
            com.yandex.mobile.ads.exo.source.f$a r9 = r12.mo64966a((java.lang.Object) r9, (long) r10)
            boolean r12 = r9.mo65283a()
            if (r12 == 0) goto L_0x0045
            r12 = r2
            r15 = r9
            r18 = r10
            goto L_0x0028
        L_0x0045:
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r12 = r1.longValue()
            long r14 = r0.f29812c
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            r15 = r9
            r18 = r10
            r9 = r1
        L_0x005a:
            r10 = 2
            com.yandex.mobile.ads.exo.source.f r1 = r7.f29795v     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x00e8
            int r1 = r7.f29770E     // Catch:{ all -> 0x0102 }
            if (r1 <= 0) goto L_0x0065
            goto L_0x00e8
        L_0x0065:
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0079
            r0 = 4
            r7.m31922b((int) r0)     // Catch:{ all -> 0x0102 }
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1
            r1 = r22
            r1.m31918a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0102 }
            goto L_0x00ea
        L_0x0079:
            com.yandex.mobile.ads.exo.l r0 = r7.f29794u     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.exo.source.f$a r0 = r0.f29848b     // Catch:{ all -> 0x0102 }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00c9
            com.yandex.mobile.ads.exo.k r0 = r7.f29792s     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.exo.i r0 = r0.mo64977d()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x009c
            boolean r1 = r0.f29816d     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x009c
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x009c
            com.yandex.mobile.ads.exo.source.e r0 = r0.f29813a     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.impl.t71 r1 = r7.f29793t     // Catch:{ all -> 0x0102 }
            long r0 = r0.mo65256a((long) r12, (com.yandex.mobile.ads.impl.t71) r1)     // Catch:{ all -> 0x0102 }
            goto L_0x009d
        L_0x009c:
            r0 = r12
        L_0x009d:
            long r2 = com.yandex.mobile.ads.impl.C12874dd.m35213b(r0)     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.exo.l r5 = r7.f29794u     // Catch:{ all -> 0x0102 }
            long r5 = r5.f29859m     // Catch:{ all -> 0x0102 }
            long r5 = com.yandex.mobile.ads.impl.C12874dd.m35213b(r5)     // Catch:{ all -> 0x0102 }
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x00ca
            com.yandex.mobile.ads.exo.l r0 = r7.f29794u     // Catch:{ all -> 0x0102 }
            long r0 = r0.f29859m     // Catch:{ all -> 0x0102 }
            r7.f29774I = r8
            com.yandex.mobile.ads.exo.l r14 = r7.f29794u
            long r20 = r22.m31929c()
            r16 = r0
            com.yandex.mobile.ads.exo.l r0 = r14.mo64981a(r15, r16, r18, r20)
            r7.f29794u = r0
            if (r9 == 0) goto L_0x00c8
            com.yandex.mobile.ads.exo.h$d r0 = r7.f29789p
            r0.mo64940b((int) r10)
        L_0x00c8:
            return
        L_0x00c9:
            r0 = r12
        L_0x00ca:
            com.yandex.mobile.ads.exo.k r2 = r7.f29792s     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.exo.i r2 = r2.mo64977d()     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.exo.k r3 = r7.f29792s     // Catch:{ all -> 0x0102 }
            com.yandex.mobile.ads.exo.i r3 = r3.mo64978e()     // Catch:{ all -> 0x0102 }
            if (r2 == r3) goto L_0x00da
            r2 = 1
            goto L_0x00db
        L_0x00da:
            r2 = 0
        L_0x00db:
            long r0 = r7.m31902a((com.yandex.mobile.ads.exo.source.C12287f.C12288a) r15, (long) r0, (boolean) r2)     // Catch:{ all -> 0x0102 }
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            r4 = 1
        L_0x00e4:
            r9 = r9 | r4
            r16 = r0
            goto L_0x00ec
        L_0x00e8:
            r7.f29771F = r0     // Catch:{ all -> 0x0102 }
        L_0x00ea:
            r16 = r12
        L_0x00ec:
            r7.f29774I = r8
            com.yandex.mobile.ads.exo.l r14 = r7.f29794u
            long r20 = r22.m31929c()
            com.yandex.mobile.ads.exo.l r0 = r14.mo64981a(r15, r16, r18, r20)
            r7.f29794u = r0
            if (r9 == 0) goto L_0x0101
            com.yandex.mobile.ads.exo.h$d r0 = r7.f29789p
            r0.mo64940b((int) r10)
        L_0x0101:
            return
        L_0x0102:
            r0 = move-exception
            r7.f29774I = r8
            com.yandex.mobile.ads.exo.l r14 = r7.f29794u
            long r20 = r22.m31929c()
            r16 = r12
            com.yandex.mobile.ads.exo.l r1 = r14.mo64981a(r15, r16, r18, r20)
            r7.f29794u = r1
            if (r9 == 0) goto L_0x011a
            com.yandex.mobile.ads.exo.h$d r1 = r7.f29789p
            r1.mo64940b((int) r10)
        L_0x011a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31910a(com.yandex.mobile.ads.exo.h$e):void");
    }

    /* renamed from: a */
    private long m31902a(C12287f.C12288a aVar, long j, boolean z) throws k40 {
        m31945o();
        this.f29799z = false;
        C12226l lVar = this.f29794u;
        if (lVar.f29851e != 1 && !lVar.f29847a.mo65194d()) {
            m31922b(2);
        }
        C12223i d = this.f29792s.mo64977d();
        C12223i iVar = d;
        while (true) {
            if (iVar != null) {
                if (aVar.equals(iVar.f29818f.f29827a) && iVar.f29816d) {
                    this.f29792s.mo64972a(iVar);
                    break;
                }
                iVar = this.f29792s.mo64962a();
            } else {
                break;
            }
        }
        if (z || d != iVar || (iVar != null && iVar.mo64954e(j) < 0)) {
            for (C12263o a : this.f29796w) {
                m31913a(a);
            }
            this.f29796w = new C12263o[0];
            d = null;
            if (iVar != null) {
                iVar.mo64950c(0);
            }
        }
        if (iVar != null) {
            m31911a(d);
            if (iVar.f29817e) {
                long a2 = iVar.f29813a.mo65255a(j);
                iVar.f29813a.mo65258a(a2 - this.f29786m, this.f29787n);
                j = a2;
            }
            m31923b(j);
            m31939h();
        } else {
            this.f29792s.mo64969a(true);
            this.f29794u = this.f29794u.mo64980a(TrackGroupArray.f30062e, this.f29778e);
            m31923b(j);
        }
        m31915a(false);
        this.f29781h.mo67972b(2);
        return j;
    }

    /* renamed from: a */
    private void m31916a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f29769D != z) {
            this.f29769D = z;
            if (!z) {
                for (C12263o oVar : this.f29775b) {
                    if (oVar.mo64809b() == 0) {
                        oVar.mo64813g();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: a */
    private void m31917a(boolean z, boolean z2, boolean z3) {
        m31918a(z || !this.f29769D, true, z2, z2, z2);
        this.f29789p.mo64938a(this.f29770E + (z3 ? 1 : 0));
        this.f29770E = 0;
        this.f29779f.mo69191e();
        m31922b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123 A[SYNTHETIC, Splitter:B:65:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31918a(boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r26 = this;
            r1 = r26
            com.yandex.mobile.ads.impl.l90 r0 = r1.f29781h
            r2 = 2
            r0.mo67970a(r2)
            r2 = 0
            r1.f29799z = r2
            com.yandex.mobile.ads.exo.e r0 = r1.f29788o
            r0.mo64867b()
            r3 = 0
            r1.f29772G = r3
            com.yandex.mobile.ads.exo.o[] r3 = r1.f29796w
            int r4 = r3.length
            r5 = 0
        L_0x0018:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002d
            r0 = r3[r5]
            r1.m31913a((com.yandex.mobile.ads.exo.C12263o) r0)     // Catch:{ k40 -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r7 = "Disable failed."
            com.yandex.mobile.ads.impl.bk0.m34269a(r6, r7, r0)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            if (r27 == 0) goto L_0x0045
            com.yandex.mobile.ads.exo.o[] r3 = r1.f29775b
            int r4 = r3.length
            r5 = 0
        L_0x0033:
            if (r5 >= r4) goto L_0x0045
            r0 = r3[r5]
            r0.mo64813g()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            com.yandex.mobile.ads.impl.bk0.m34269a(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0045:
            com.yandex.mobile.ads.exo.o[] r0 = new com.yandex.mobile.ads.exo.C12263o[r2]
            r1.f29796w = r0
            r3 = 0
            if (r29 == 0) goto L_0x004f
            r1.f29771F = r3
            goto L_0x0086
        L_0x004f:
            if (r30 == 0) goto L_0x0086
            com.yandex.mobile.ads.exo.h$e r0 = r1.f29771F
            if (r0 != 0) goto L_0x0084
            com.yandex.mobile.ads.exo.l r0 = r1.f29794u
            com.yandex.mobile.ads.exo.q r0 = r0.f29847a
            boolean r0 = r0.mo65194d()
            if (r0 != 0) goto L_0x0084
            com.yandex.mobile.ads.exo.l r0 = r1.f29794u
            com.yandex.mobile.ads.exo.q r4 = r0.f29847a
            com.yandex.mobile.ads.exo.source.f$a r0 = r0.f29848b
            java.lang.Object r0 = r0.f30085a
            com.yandex.mobile.ads.exo.q$b r5 = r1.f29785l
            r4.mo65189a(r0, r5)
            com.yandex.mobile.ads.exo.l r0 = r1.f29794u
            long r4 = r0.f29859m
            com.yandex.mobile.ads.exo.q$b r0 = r1.f29785l
            long r7 = r0.mo65207c()
            long r4 = r4 + r7
            com.yandex.mobile.ads.exo.h$e r0 = new com.yandex.mobile.ads.exo.h$e
            com.yandex.mobile.ads.exo.q r7 = com.yandex.mobile.ads.exo.C12270q.f30037a
            com.yandex.mobile.ads.exo.q$b r8 = r1.f29785l
            int r8 = r8.f30040c
            r0.<init>(r7, r8, r4)
            r1.f29771F = r0
        L_0x0084:
            r0 = 1
            goto L_0x0088
        L_0x0086:
            r0 = r29
        L_0x0088:
            com.yandex.mobile.ads.exo.k r4 = r1.f29792s
            r5 = r30 ^ 1
            r4.mo64969a((boolean) r5)
            r1.f29766A = r2
            if (r30 == 0) goto L_0x00b7
            com.yandex.mobile.ads.exo.k r4 = r1.f29792s
            com.yandex.mobile.ads.exo.q r5 = com.yandex.mobile.ads.exo.C12270q.f30037a
            r4.mo64968a((com.yandex.mobile.ads.exo.C12270q) r5)
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r4 = r1.f29790q
            java.util.Iterator r4 = r4.iterator()
        L_0x00a0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r4.next()
            com.yandex.mobile.ads.exo.h$c r5 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r5
            com.yandex.mobile.ads.exo.n r5 = r5.f29802b
            r5.mo65124a((boolean) r2)
            goto L_0x00a0
        L_0x00b2:
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r2 = r1.f29790q
            r2.clear()
        L_0x00b7:
            if (r0 == 0) goto L_0x00c6
            com.yandex.mobile.ads.exo.l r2 = r1.f29794u
            boolean r4 = r1.f29768C
            com.yandex.mobile.ads.exo.q$c r5 = r1.f29784k
            com.yandex.mobile.ads.exo.q$b r7 = r1.f29785l
            com.yandex.mobile.ads.exo.source.f$a r2 = r2.mo64983a(r4, r5, r7)
            goto L_0x00ca
        L_0x00c6:
            com.yandex.mobile.ads.exo.l r2 = r1.f29794u
            com.yandex.mobile.ads.exo.source.f$a r2 = r2.f29848b
        L_0x00ca:
            r19 = r2
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00d6
            r24 = r4
            goto L_0x00dc
        L_0x00d6:
            com.yandex.mobile.ads.exo.l r2 = r1.f29794u
            long r7 = r2.f29859m
            r24 = r7
        L_0x00dc:
            if (r0 == 0) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            com.yandex.mobile.ads.exo.l r0 = r1.f29794u
            long r4 = r0.f29850d
        L_0x00e3:
            r12 = r4
            com.yandex.mobile.ads.exo.l r0 = new com.yandex.mobile.ads.exo.l
            if (r30 == 0) goto L_0x00eb
            com.yandex.mobile.ads.exo.q r2 = com.yandex.mobile.ads.exo.C12270q.f30037a
            goto L_0x00ef
        L_0x00eb:
            com.yandex.mobile.ads.exo.l r2 = r1.f29794u
            com.yandex.mobile.ads.exo.q r2 = r2.f29847a
        L_0x00ef:
            r8 = r2
            com.yandex.mobile.ads.exo.l r2 = r1.f29794u
            int r14 = r2.f29851e
            if (r31 == 0) goto L_0x00f8
            r15 = r3
            goto L_0x00fb
        L_0x00f8:
            com.yandex.mobile.ads.impl.k40 r4 = r2.f29852f
            r15 = r4
        L_0x00fb:
            r16 = 0
            if (r30 == 0) goto L_0x0102
            com.yandex.mobile.ads.exo.source.TrackGroupArray r4 = com.yandex.mobile.ads.exo.source.TrackGroupArray.f30062e
            goto L_0x0104
        L_0x0102:
            com.yandex.mobile.ads.exo.source.TrackGroupArray r4 = r2.f29854h
        L_0x0104:
            r17 = r4
            if (r30 == 0) goto L_0x010b
            com.yandex.mobile.ads.impl.le1 r2 = r1.f29778e
            goto L_0x010d
        L_0x010b:
            com.yandex.mobile.ads.impl.le1 r2 = r2.f29855i
        L_0x010d:
            r18 = r2
            r22 = 0
            r7 = r0
            r9 = r19
            r10 = r24
            r20 = r24
            r7.<init>(r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r22, r24)
            r1.f29794u = r0
            if (r28 == 0) goto L_0x0130
            com.yandex.mobile.ads.exo.source.f r0 = r1.f29795v
            if (r0 == 0) goto L_0x0130
            r0.mo65250a((com.yandex.mobile.ads.exo.source.C12287f.C12289b) r1)     // Catch:{ RuntimeException -> 0x0127 }
            goto L_0x012e
        L_0x0127:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "Failed to release child source."
            com.yandex.mobile.ads.impl.bk0.m34269a(r6, r0, r2)
        L_0x012e:
            r1.f29795v = r3
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31918a(boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    private void m31912a(C12260n nVar) throws k40 {
        synchronized (nVar) {
        }
        try {
            nVar.mo65128d().mo64802a(nVar.mo65130f(), nVar.mo65127c());
        } finally {
            nVar.mo65124a(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r3.mo65186a(r4.first) != -1) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m31920a(com.yandex.mobile.ads.exo.C12217h.C12220c r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r13.f29805e
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x006b
            com.yandex.mobile.ads.exo.n r0 = r13.f29802b
            com.yandex.mobile.ads.exo.q r0 = r0.mo65129e()
            com.yandex.mobile.ads.exo.n r3 = r13.f29802b
            int r7 = r3.mo65131g()
            com.yandex.mobile.ads.exo.n r3 = r13.f29802b
            r3.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r8 = com.yandex.mobile.ads.impl.C12874dd.m35212a(r3)
            com.yandex.mobile.ads.exo.l r3 = r12.f29794u
            com.yandex.mobile.ads.exo.q r3 = r3.f29847a
            boolean r4 = r3.mo65194d()
            if (r4 == 0) goto L_0x002b
            goto L_0x004c
        L_0x002b:
            boolean r4 = r0.mo65194d()
            if (r4 == 0) goto L_0x0032
            r0 = r3
        L_0x0032:
            com.yandex.mobile.ads.exo.q$c r5 = r12.f29784k     // Catch:{ IndexOutOfBoundsException -> 0x004c }
            com.yandex.mobile.ads.exo.q$b r6 = r12.f29785l     // Catch:{ IndexOutOfBoundsException -> 0x004c }
            r10 = 0
            r4 = r0
            android.util.Pair r4 = r4.mo65187a((com.yandex.mobile.ads.exo.C12270q.C12273c) r5, (com.yandex.mobile.ads.exo.C12270q.C12272b) r6, (int) r7, (long) r8, (long) r10)     // Catch:{ IndexOutOfBoundsException -> 0x004c }
            r4.getClass()     // Catch:{ IndexOutOfBoundsException -> 0x004c }
            if (r3 != r0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            java.lang.Object r0 = r4.first
            int r0 = r3.mo65186a((java.lang.Object) r0)
            if (r0 == r2) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            if (r4 != 0) goto L_0x0050
            return r1
        L_0x0050:
            com.yandex.mobile.ads.exo.l r0 = r12.f29794u
            com.yandex.mobile.ads.exo.q r0 = r0.f29847a
            java.lang.Object r1 = r4.first
            int r0 = r0.mo65186a((java.lang.Object) r1)
            java.lang.Object r1 = r4.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.lang.Object r3 = r4.first
            r13.f29803c = r0
            r13.f29804d = r1
            r13.f29805e = r3
            goto L_0x0078
        L_0x006b:
            com.yandex.mobile.ads.exo.l r3 = r12.f29794u
            com.yandex.mobile.ads.exo.q r3 = r3.f29847a
            int r0 = r3.mo65186a((java.lang.Object) r0)
            if (r0 != r2) goto L_0x0076
            return r1
        L_0x0076:
            r13.f29803c = r0
        L_0x0078:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31920a(com.yandex.mobile.ads.exo.h$c):boolean");
    }

    /* renamed from: a */
    private void m31913a(C12263o oVar) throws k40 {
        this.f29788o.mo64865a(oVar);
        if (oVar.mo64809b() == 2) {
            oVar.mo64811d();
        }
        oVar.mo64812f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31909a(com.yandex.mobile.ads.exo.C12217h.C12219b r26) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            com.yandex.mobile.ads.exo.source.f r2 = r1.f29800a
            com.yandex.mobile.ads.exo.source.f r3 = r0.f29795v
            if (r2 == r3) goto L_0x000b
            return
        L_0x000b:
            com.yandex.mobile.ads.exo.h$d r2 = r0.f29789p
            int r3 = r0.f29770E
            r2.mo64938a((int) r3)
            r2 = 0
            r0.f29770E = r2
            com.yandex.mobile.ads.exo.l r3 = r0.f29794u
            com.yandex.mobile.ads.exo.q r3 = r3.f29847a
            com.yandex.mobile.ads.exo.q r1 = r1.f29801b
            r5 = r1
            com.yandex.mobile.ads.exo.k r4 = r0.f29792s
            r4.mo64968a((com.yandex.mobile.ads.exo.C12270q) r1)
            com.yandex.mobile.ads.exo.l r15 = r0.f29794u
            com.yandex.mobile.ads.exo.l r14 = new com.yandex.mobile.ads.exo.l
            r4 = r14
            com.yandex.mobile.ads.exo.source.f$a r6 = r15.f29848b
            long r7 = r15.f29849c
            long r9 = r15.f29850d
            int r11 = r15.f29851e
            com.yandex.mobile.ads.impl.k40 r12 = r15.f29852f
            boolean r13 = r15.f29853g
            com.yandex.mobile.ads.exo.source.TrackGroupArray r2 = r15.f29854h
            r23 = r3
            r3 = r14
            r14 = r2
            com.yandex.mobile.ads.impl.le1 r2 = r15.f29855i
            r26 = r1
            r1 = r15
            r15 = r2
            com.yandex.mobile.ads.exo.source.f$a r2 = r1.f29856j
            r16 = r2
            r24 = r3
            long r2 = r1.f29857k
            r17 = r2
            long r2 = r1.f29858l
            r19 = r2
            long r1 = r1.f29859m
            r21 = r1
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            r1 = r24
            r0.f29794u = r1
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r1 = r0.f29790q
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        L_0x005f:
            if (r1 < 0) goto L_0x0085
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r3 = r0.f29790q
            java.lang.Object r3 = r3.get(r1)
            com.yandex.mobile.ads.exo.h$c r3 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r3
            boolean r3 = r0.m31920a((com.yandex.mobile.ads.exo.C12217h.C12220c) r3)
            if (r3 != 0) goto L_0x0082
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r3 = r0.f29790q
            java.lang.Object r3 = r3.get(r1)
            com.yandex.mobile.ads.exo.h$c r3 = (com.yandex.mobile.ads.exo.C12217h.C12220c) r3
            com.yandex.mobile.ads.exo.n r3 = r3.f29802b
            r4 = 0
            r3.mo65124a((boolean) r4)
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r3 = r0.f29790q
            r3.remove(r1)
        L_0x0082:
            int r1 = r1 + -1
            goto L_0x005f
        L_0x0085:
            java.util.ArrayList<com.yandex.mobile.ads.exo.h$c> r1 = r0.f29790q
            java.util.Collections.sort(r1)
            com.yandex.mobile.ads.exo.l r1 = r0.f29794u
            com.yandex.mobile.ads.exo.source.f$a r1 = r1.f29848b
            boolean r3 = r1.mo65283a()
            if (r3 == 0) goto L_0x0099
            com.yandex.mobile.ads.exo.l r3 = r0.f29794u
            long r3 = r3.f29850d
            goto L_0x009d
        L_0x0099:
            com.yandex.mobile.ads.exo.l r3 = r0.f29794u
            long r3 = r3.f29859m
        L_0x009d:
            r12 = r3
            com.yandex.mobile.ads.exo.h$e r3 = r0.f29771F
            if (r3 == 0) goto L_0x00c3
            android.util.Pair r1 = r0.m31903a((com.yandex.mobile.ads.exo.C12217h.C12222e) r3, (boolean) r2)
            r3 = 0
            r0.f29771F = r3
            if (r1 != 0) goto L_0x00af
            r25.m31931d()
            return
        L_0x00af:
            java.lang.Object r3 = r1.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.yandex.mobile.ads.exo.k r5 = r0.f29792s
            java.lang.Object r1 = r1.first
            com.yandex.mobile.ads.exo.source.f$a r1 = r5.mo64966a((java.lang.Object) r1, (long) r3)
        L_0x00bf:
            r7 = r3
            r4 = r1
            goto L_0x0178
        L_0x00c3:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x010d
            boolean r3 = r26.mo65194d()
            if (r3 != 0) goto L_0x010d
            int r7 = r26.mo65184a()
            com.yandex.mobile.ads.exo.q$c r5 = r0.f29784k
            com.yandex.mobile.ads.exo.q$b r6 = r0.f29785l
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r4 = r26
            android.util.Pair r1 = r4.mo65187a((com.yandex.mobile.ads.exo.C12270q.C12273c) r5, (com.yandex.mobile.ads.exo.C12270q.C12272b) r6, (int) r7, (long) r8, (long) r10)
            r1.getClass()
            com.yandex.mobile.ads.exo.k r3 = r0.f29792s
            java.lang.Object r4 = r1.first
            java.lang.Object r5 = r1.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            com.yandex.mobile.ads.exo.source.f$a r3 = r3.mo64966a((java.lang.Object) r4, (long) r5)
            boolean r4 = r3.mo65283a()
            if (r4 != 0) goto L_0x0109
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            goto L_0x010a
        L_0x0109:
            r4 = r12
        L_0x010a:
            r7 = r4
            r4 = r3
            goto L_0x0178
        L_0x010d:
            java.lang.Object r3 = r1.f30085a
            r4 = r26
            int r3 = r4.mo65186a((java.lang.Object) r3)
            r5 = -1
            if (r3 != r5) goto L_0x0156
            java.lang.Object r1 = r1.f30085a
            r3 = r23
            java.lang.Object r1 = r0.m31905a((java.lang.Object) r1, (com.yandex.mobile.ads.exo.C12270q) r3, (com.yandex.mobile.ads.exo.C12270q) r4)
            if (r1 != 0) goto L_0x0126
            r25.m31931d()
            return
        L_0x0126:
            com.yandex.mobile.ads.exo.q$b r3 = r0.f29785l
            int r1 = r4.mo65186a((java.lang.Object) r1)
            com.yandex.mobile.ads.exo.q$b r1 = r4.mo65188a((int) r1, (com.yandex.mobile.ads.exo.C12270q.C12272b) r3, (boolean) r2)
            int r7 = r1.f30040c
            com.yandex.mobile.ads.exo.q$c r5 = r0.f29784k
            com.yandex.mobile.ads.exo.q$b r6 = r0.f29785l
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            android.util.Pair r1 = r4.mo65187a((com.yandex.mobile.ads.exo.C12270q.C12273c) r5, (com.yandex.mobile.ads.exo.C12270q.C12272b) r6, (int) r7, (long) r8, (long) r10)
            r1.getClass()
            java.lang.Object r3 = r1.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.yandex.mobile.ads.exo.k r5 = r0.f29792s
            java.lang.Object r1 = r1.first
            com.yandex.mobile.ads.exo.source.f$a r1 = r5.mo64966a((java.lang.Object) r1, (long) r3)
            goto L_0x00bf
        L_0x0156:
            com.yandex.mobile.ads.exo.k r1 = r0.f29792s
            com.yandex.mobile.ads.exo.l r3 = r0.f29794u
            com.yandex.mobile.ads.exo.source.f$a r3 = r3.f29848b
            java.lang.Object r3 = r3.f30085a
            com.yandex.mobile.ads.exo.source.f$a r1 = r1.mo64966a((java.lang.Object) r3, (long) r12)
            com.yandex.mobile.ads.exo.l r3 = r0.f29794u
            com.yandex.mobile.ads.exo.source.f$a r3 = r3.f29848b
            boolean r3 = r3.mo65283a()
            if (r3 != 0) goto L_0x0176
            boolean r3 = r1.mo65283a()
            if (r3 != 0) goto L_0x0176
            com.yandex.mobile.ads.exo.l r1 = r0.f29794u
            com.yandex.mobile.ads.exo.source.f$a r1 = r1.f29848b
        L_0x0176:
            r4 = r1
            r7 = r12
        L_0x0178:
            com.yandex.mobile.ads.exo.l r1 = r0.f29794u
            com.yandex.mobile.ads.exo.source.f$a r1 = r1.f29848b
            boolean r1 = r1.equals(r4)
            r5 = 0
            if (r1 == 0) goto L_0x01dd
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x01dd
            com.yandex.mobile.ads.exo.k r1 = r0.f29792s
            long r2 = r0.f29772G
            com.yandex.mobile.ads.exo.i r4 = r1.mo64978e()
            r7 = -9223372036854775808
            if (r4 != 0) goto L_0x0195
            goto L_0x01d0
        L_0x0195:
            long r5 = r4.mo64953e()
            boolean r9 = r4.f29816d
            if (r9 != 0) goto L_0x019e
            goto L_0x01d0
        L_0x019e:
            r9 = 0
        L_0x019f:
            com.yandex.mobile.ads.exo.o[] r10 = r0.f29775b
            int r11 = r10.length
            if (r9 >= r11) goto L_0x01d0
            r10 = r10[r9]
            int r10 = r10.mo64809b()
            if (r10 == 0) goto L_0x01cd
            com.yandex.mobile.ads.exo.o[] r10 = r0.f29775b
            r10 = r10[r9]
            com.yandex.mobile.ads.exo.source.l r10 = r10.mo64822q()
            com.yandex.mobile.ads.exo.source.l[] r11 = r4.f29815c
            r11 = r11[r9]
            if (r10 == r11) goto L_0x01bb
            goto L_0x01cd
        L_0x01bb:
            com.yandex.mobile.ads.exo.o[] r10 = r0.f29775b
            r10 = r10[r9]
            long r10 = r10.mo64816j()
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x01c9
            r5 = r7
            goto L_0x01d0
        L_0x01c9:
            long r5 = java.lang.Math.max(r10, r5)
        L_0x01cd:
            int r9 = r9 + 1
            goto L_0x019f
        L_0x01d0:
            boolean r1 = r1.mo64971a((long) r2, (long) r5)
            if (r1 != 0) goto L_0x01db
            r1 = 0
            r0.m31928b((boolean) r1)
            goto L_0x0230
        L_0x01db:
            r1 = 0
            goto L_0x0230
        L_0x01dd:
            com.yandex.mobile.ads.exo.k r1 = r0.f29792s
            com.yandex.mobile.ads.exo.i r1 = r1.mo64977d()
            if (r1 == 0) goto L_0x0204
        L_0x01e5:
            com.yandex.mobile.ads.exo.i r3 = r1.mo64952d()
            if (r3 == 0) goto L_0x0204
            com.yandex.mobile.ads.exo.i r1 = r1.mo64952d()
            com.yandex.mobile.ads.exo.j r3 = r1.f29818f
            com.yandex.mobile.ads.exo.source.f$a r3 = r3.f29827a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01e5
            com.yandex.mobile.ads.exo.k r3 = r0.f29792s
            com.yandex.mobile.ads.exo.j r9 = r1.f29818f
            com.yandex.mobile.ads.exo.j r3 = r3.mo64965a((com.yandex.mobile.ads.exo.C12224j) r9)
            r1.f29818f = r3
            goto L_0x01e5
        L_0x0204:
            boolean r1 = r4.mo65283a()
            if (r1 == 0) goto L_0x020b
            goto L_0x020c
        L_0x020b:
            r5 = r7
        L_0x020c:
            com.yandex.mobile.ads.exo.k r1 = r0.f29792s
            com.yandex.mobile.ads.exo.i r1 = r1.mo64977d()
            com.yandex.mobile.ads.exo.k r3 = r0.f29792s
            com.yandex.mobile.ads.exo.i r3 = r3.mo64978e()
            if (r1 == r3) goto L_0x021c
            r1 = 1
            goto L_0x021d
        L_0x021c:
            r1 = 0
        L_0x021d:
            long r5 = r0.m31902a((com.yandex.mobile.ads.exo.source.C12287f.C12288a) r4, (long) r5, (boolean) r1)
            r0.f29774I = r2
            com.yandex.mobile.ads.exo.l r3 = r0.f29794u
            long r9 = r25.m31929c()
            com.yandex.mobile.ads.exo.l r1 = r3.mo64981a(r4, r5, r7, r9)
            r0.f29794u = r1
            goto L_0x01db
        L_0x0230:
            r0.m31915a((boolean) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12217h.m31909a(com.yandex.mobile.ads.exo.h$b):void");
    }

    /* renamed from: a */
    private Object m31905a(Object obj, C12270q qVar, C12270q qVar2) {
        int a = qVar.mo65186a(obj);
        int b = qVar.mo65192b();
        int i = a;
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = qVar.mo65185a(i, this.f29785l, this.f29784k, this.f29767B, this.f29768C);
            if (i == -1) {
                break;
            }
            i2 = qVar2.mo65186a(qVar.mo65191a(i));
        }
        if (i2 == -1) {
            return null;
        }
        return qVar2.mo65191a(i2);
    }

    /* renamed from: a */
    private Pair<Object, Long> m31903a(C12222e eVar, boolean z) {
        Object a;
        C12270q qVar = this.f29794u.f29847a;
        C12270q qVar2 = eVar.f29810a;
        if (qVar.mo65194d()) {
            return null;
        }
        if (qVar2.mo65194d()) {
            qVar2 = qVar;
        }
        try {
            Pair<Object, Long> a2 = qVar2.mo65187a(this.f29784k, this.f29785l, eVar.f29811b, eVar.f29812c, 0);
            a2.getClass();
            if (qVar == qVar2 || qVar.mo65186a(a2.first) != -1) {
                return a2;
            }
            if (z && (a = m31905a(a2.first, qVar2, qVar)) != null) {
                Pair<Object, Long> a3 = qVar.mo65187a(this.f29784k, this.f29785l, qVar.mo65188a(qVar.mo65186a(a), this.f29785l, true).f30040c, -9223372036854775807L, 0);
                a3.getClass();
                return a3;
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: a */
    private void m31914a(sz0 sz0, boolean z) throws k40 {
        this.f29783j.obtainMessage(1, z ? 1 : 0, 0, sz0).sendToTarget();
        float f = sz0.f40190a;
        for (C12223i d = this.f29792s.mo64977d(); d != null; d = d.mo64952d()) {
            for (C12330d dVar : d.mo64957h().f36650c.mo65402a()) {
                if (dVar != null) {
                    dVar.mo65381a(f);
                }
            }
        }
        for (C12263o oVar : this.f29775b) {
            if (oVar != null) {
                oVar.mo64800a(sz0.f40190a);
            }
        }
    }

    /* renamed from: a */
    private C12226l m31904a(C12287f.C12288a aVar, long j, long j2) {
        this.f29774I = true;
        return this.f29794u.mo64981a(aVar, j, j2, m31929c());
    }

    /* renamed from: a */
    private void m31911a(C12223i iVar) throws k40 {
        C12223i d = this.f29792s.mo64977d();
        if (d != null && iVar != d) {
            boolean[] zArr = new boolean[this.f29775b.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C12263o[] oVarArr = this.f29775b;
                if (i < oVarArr.length) {
                    C12263o oVar = oVarArr[i];
                    zArr[i] = oVar.mo64809b() != 0;
                    if (d.mo64957h().mo68415a(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!d.mo64957h().mo68415a(i) || (oVar.mo64818l() && oVar.mo64822q() == iVar.f29815c[i]))) {
                        m31913a(oVar);
                    }
                    i++;
                } else {
                    this.f29794u = this.f29794u.mo64980a(d.mo64956g(), d.mo64957h());
                    m31919a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m31919a(boolean[] zArr, int i) throws k40 {
        this.f29796w = new C12263o[i];
        le1 h = this.f29792s.mo64977d().mo64957h();
        for (int i2 = 0; i2 < this.f29775b.length; i2++) {
            if (!h.mo68415a(i2)) {
                this.f29775b[i2].mo64813g();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f29775b.length; i4++) {
            if (h.mo68415a(i4)) {
                boolean z = zArr[i4];
                int i5 = i3 + 1;
                C12223i d = this.f29792s.mo64977d();
                C12263o oVar = this.f29775b[i4];
                this.f29796w[i3] = oVar;
                if (oVar.mo64809b() == 0) {
                    le1 h2 = d.mo64957h();
                    u31 u31 = h2.f36649b[i4];
                    Format[] a = m31921a(h2.f36650c.mo65401a(i4));
                    boolean z2 = this.f29798y && this.f29794u.f29851e == 3;
                    oVar.mo64805a(u31, a, d.f29815c[i4], this.f29772G, !z && z2, d.mo64953e());
                    this.f29788o.mo64868b(oVar);
                    if (z2) {
                        oVar.mo64799a();
                    }
                }
                i3 = i5;
            }
        }
    }

    /* renamed from: a */
    private void m31915a(boolean z) {
        C12223i iVar;
        boolean z2;
        long j;
        C12217h hVar = this;
        C12223i c = hVar.f29792s.mo64976c();
        C12287f.C12288a aVar = c == null ? hVar.f29794u.f29848b : c.f29818f.f29827a;
        boolean z3 = !hVar.f29794u.f29856j.equals(aVar);
        if (z3) {
            C12226l lVar = hVar.f29794u;
            z2 = z3;
            iVar = c;
            C12226l lVar2 = lVar;
            C12226l lVar3 = new C12226l(lVar.f29847a, lVar.f29848b, lVar.f29849c, lVar.f29850d, lVar.f29851e, lVar.f29852f, lVar.f29853g, lVar.f29854h, lVar.f29855i, aVar, lVar2.f29857k, lVar2.f29858l, lVar2.f29859m);
            hVar = this;
            hVar.f29794u = lVar3;
        } else {
            iVar = c;
            z2 = z3;
        }
        C12226l lVar4 = hVar.f29794u;
        if (iVar == null) {
            j = lVar4.f29859m;
        } else {
            j = iVar.mo64949c();
        }
        lVar4.f29857k = j;
        hVar.f29794u.f29858l = m31929c();
        if ((z2 || z) && iVar != null) {
            C12223i iVar2 = iVar;
            if (iVar2.f29816d) {
                hVar.f29779f.mo69185a(hVar.f29775b, iVar2.mo64957h().f36650c);
            }
        }
    }

    /* renamed from: a */
    private long m31901a(long j) {
        C12223i c = this.f29792s.mo64976c();
        if (c == null) {
            return 0;
        }
        return Math.max(0, j - c.mo64951d(this.f29772G));
    }

    /* renamed from: a */
    public void mo64930a(sz0 sz0) {
        this.f29781h.mo67968a(17, 0, 0, sz0).sendToTarget();
    }

    /* renamed from: a */
    private static Format[] m31921a(C12330d dVar) {
        int d = dVar != null ? dVar.mo65390d() : 0;
        Format[] formatArr = new Format[d];
        for (int i = 0; i < d; i++) {
            formatArr[i] = dVar.mo65386a(i);
        }
        return formatArr;
    }
}
