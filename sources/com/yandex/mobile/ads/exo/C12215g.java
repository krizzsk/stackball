package com.yandex.mobile.ads.exo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.yandex.mobile.ads.exo.C12175c;
import com.yandex.mobile.ads.exo.C12215g;
import com.yandex.mobile.ads.exo.C12227m;
import com.yandex.mobile.ads.exo.C12260n;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.exo.trackselection.C12334f;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.C12874dd;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13493jf;
import com.yandex.mobile.ads.impl.C14190ok;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.le1;
import com.yandex.mobile.ads.impl.n40;
import com.yandex.mobile.ads.impl.sz0;
import com.yandex.mobile.ads.impl.t71;
import com.yandex.mobile.ads.impl.u31;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.exo.g */
final class C12215g extends C12175c {

    /* renamed from: b */
    final le1 f29732b;

    /* renamed from: c */
    private final C12263o[] f29733c;

    /* renamed from: d */
    private final C12334f f29734d;

    /* renamed from: e */
    private final Handler f29735e;

    /* renamed from: f */
    private final C12217h f29736f;

    /* renamed from: g */
    private final Handler f29737g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C12175c.C12176a> f29738h;

    /* renamed from: i */
    private final C12270q.C12272b f29739i;

    /* renamed from: j */
    private final ArrayDeque<Runnable> f29740j;

    /* renamed from: k */
    private C12287f f29741k;

    /* renamed from: l */
    private boolean f29742l;

    /* renamed from: m */
    private int f29743m;

    /* renamed from: n */
    private int f29744n;

    /* renamed from: o */
    private boolean f29745o;

    /* renamed from: p */
    private int f29746p;

    /* renamed from: q */
    private sz0 f29747q;

    /* renamed from: r */
    private C12226l f29748r;

    /* renamed from: s */
    private int f29749s;

    /* renamed from: t */
    private int f29750t;

    /* renamed from: u */
    private long f29751u;

    /* renamed from: com.yandex.mobile.ads.exo.g$a */
    private static final class C12216a implements Runnable {

        /* renamed from: b */
        private final C12226l f29752b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C12175c.C12176a> f29753c;

        /* renamed from: d */
        private final C12334f f29754d;

        /* renamed from: e */
        private final boolean f29755e;

        /* renamed from: f */
        private final int f29756f;

        /* renamed from: g */
        private final int f29757g;

        /* renamed from: h */
        private final boolean f29758h;

        /* renamed from: i */
        private final boolean f29759i;

        /* renamed from: j */
        private final boolean f29760j;

        /* renamed from: k */
        private final boolean f29761k;

        /* renamed from: l */
        private final boolean f29762l;

        /* renamed from: m */
        private final boolean f29763m;

        /* renamed from: n */
        private final boolean f29764n;

        /* renamed from: o */
        private final boolean f29765o;

        public C12216a(C12226l lVar, C12226l lVar2, CopyOnWriteArrayList<C12175c.C12176a> copyOnWriteArrayList, C12334f fVar, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.f29752b = lVar;
            this.f29753c = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.f29754d = fVar;
            this.f29755e = z;
            this.f29756f = i;
            this.f29757g = i2;
            this.f29758h = z2;
            this.f29764n = z3;
            this.f29765o = z4;
            boolean z5 = true;
            this.f29759i = lVar2.f29851e != lVar.f29851e;
            k40 k40 = lVar2.f29852f;
            k40 k402 = lVar.f29852f;
            this.f29760j = (k40 == k402 || k402 == null) ? false : true;
            this.f29761k = lVar2.f29847a != lVar.f29847a;
            this.f29762l = lVar2.f29853g != lVar.f29853g;
            this.f29763m = lVar2.f29855i == lVar.f29855i ? false : z5;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m31894a(C12227m.C12228a aVar) {
            aVar.mo64984a(this.f29752b.f29847a, this.f29757g);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m31895b(C12227m.C12228a aVar) {
            aVar.onPositionDiscontinuity(this.f29756f);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m31896c(C12227m.C12228a aVar) {
            aVar.mo64986a(this.f29752b.f29852f);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m31897d(C12227m.C12228a aVar) {
            C12226l lVar = this.f29752b;
            aVar.mo64985a(lVar.f29854h, lVar.f29855i.f36650c);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m31898e(C12227m.C12228a aVar) {
            aVar.onLoadingChanged(this.f29752b.f29853g);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m31899f(C12227m.C12228a aVar) {
            aVar.onPlayerStateChanged(this.f29764n, this.f29752b.f29851e);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m31900g(C12227m.C12228a aVar) {
            aVar.onIsPlayingChanged(this.f29752b.f29851e == 3);
        }

        public void run() {
            if (this.f29761k || this.f29757g == 0) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31894a(aVar);
                    }
                });
            }
            if (this.f29755e) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31895b(aVar);
                    }
                });
            }
            if (this.f29760j) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31896c(aVar);
                    }
                });
            }
            if (this.f29763m) {
                this.f29754d.mo65397a(this.f29752b.f29855i.f36651d);
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31897d(aVar);
                    }
                });
            }
            if (this.f29762l) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31898e(aVar);
                    }
                });
            }
            if (this.f29759i) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31899f(aVar);
                    }
                });
            }
            if (this.f29765o) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) new C12175c.C12177b() {
                    /* renamed from: a */
                    public final void mo64762a(C12227m.C12228a aVar) {
                        C12215g.C12216a.this.m31900g(aVar);
                    }
                });
            }
            if (this.f29758h) {
                C12215g.m31869a((CopyOnWriteArrayList) this.f29753c, (C12175c.C12177b) $$Lambda$aF4_mr_BLvaiJyTkWkgfcJSYGnY.INSTANCE);
            }
        }
    }

    public C12215g(C12263o[] oVarArr, C12334f fVar, C14190ok okVar, C12579bb bbVar, C13493jf jfVar, Looper looper) {
        C12263o[] oVarArr2 = oVarArr;
        bk0.m34268a("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.11.7" + "] [" + ih1.f34862e + "]");
        C13479j9.m37708b(oVarArr2.length > 0);
        this.f29733c = (C12263o[]) C13479j9.m37703a(oVarArr);
        this.f29734d = (C12334f) C13479j9.m37703a(fVar);
        this.f29742l = false;
        this.f29738h = new CopyOnWriteArrayList<>();
        le1 le1 = new le1(new u31[oVarArr2.length], new C12330d[oVarArr2.length], (Object) null);
        this.f29732b = le1;
        this.f29739i = new C12270q.C12272b();
        this.f29747q = sz0.f40189e;
        t71 t71 = t71.f40258d;
        this.f29743m = 0;
        C12214f fVar2 = new C12214f(this, looper);
        this.f29735e = fVar2;
        this.f29748r = C12226l.m32012a(0, le1);
        this.f29740j = new ArrayDeque<>();
        C12217h hVar = new C12217h(oVarArr, fVar, le1, okVar, bbVar, this.f29742l, 0, false, fVar2, jfVar);
        this.f29736f = hVar;
        this.f29737g = new Handler(hVar.mo64931b());
    }

    /* renamed from: p */
    private boolean m31872p() {
        return this.f29748r.f29847a.mo65194d() || this.f29744n > 0;
    }

    /* renamed from: a */
    public void mo64907a(C12227m.C12228a aVar) {
        this.f29738h.addIfAbsent(new C12175c.C12176a(aVar));
    }

    /* renamed from: b */
    public void mo64912b(C12227m.C12228a aVar) {
        Iterator<C12175c.C12176a> it = this.f29738h.iterator();
        while (it.hasNext()) {
            C12175c.C12176a next = it.next();
            if (next.f29561a.equals(aVar)) {
                next.mo64790a();
                this.f29738h.remove(next);
            }
        }
    }

    /* renamed from: c */
    public long mo64913c() {
        return C12874dd.m35213b(this.f29748r.f29858l);
    }

    /* renamed from: d */
    public int mo64914d() {
        return this.f29743m;
    }

    /* renamed from: e */
    public boolean mo64915e() {
        return this.f29742l;
    }

    /* renamed from: f */
    public C12270q mo64916f() {
        return this.f29748r.f29847a;
    }

    /* renamed from: g */
    public int mo64917g() {
        return this.f29748r.f29851e;
    }

    /* renamed from: h */
    public int mo64918h() {
        if (m31872p()) {
            return this.f29749s;
        }
        C12226l lVar = this.f29748r;
        return lVar.f29847a.mo65189a(lVar.f29848b.f30085a, this.f29739i).f30040c;
    }

    /* renamed from: i */
    public long mo64919i() {
        if (m31872p()) {
            return this.f29751u;
        }
        if (this.f29748r.f29848b.mo65283a()) {
            return C12874dd.m35213b(this.f29748r.f29859m);
        }
        C12226l lVar = this.f29748r;
        C12287f.C12288a aVar = lVar.f29848b;
        long b = C12874dd.m35213b(lVar.f29859m);
        this.f29748r.f29847a.mo65189a(aVar.f30085a, this.f29739i);
        return b + this.f29739i.mo65204b();
    }

    /* renamed from: j */
    public int mo64920j() {
        if (mo64923n()) {
            return this.f29748r.f29848b.f30086b;
        }
        return -1;
    }

    /* renamed from: l */
    public Looper mo64921l() {
        return this.f29735e.getLooper();
    }

    /* renamed from: m */
    public long mo64922m() {
        if (mo64923n()) {
            C12226l lVar = this.f29748r;
            C12287f.C12288a aVar = lVar.f29848b;
            lVar.f29847a.mo65189a(aVar.f30085a, this.f29739i);
            return C12874dd.m35213b(this.f29739i.mo65200a(aVar.f30086b, aVar.f30087c));
        }
        C12270q f = mo64916f();
        if (f.mo65194d()) {
            return -9223372036854775807L;
        }
        return C12874dd.m35213b(f.mo65190a(mo64918h(), this.f29560a, 0).f30056l);
    }

    /* renamed from: n */
    public boolean mo64923n() {
        return !m31872p() && this.f29748r.f29848b.mo65283a();
    }

    /* renamed from: o */
    public void mo64924o() {
        Log.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.11.7" + "] [" + ih1.f34862e + "] [" + n40.m39811a() + "]");
        this.f29736f.mo64936j();
        this.f29735e.removeCallbacksAndMessages((Object) null);
        this.f29748r = m31863a(false, false, false, 1);
    }

    /* renamed from: a */
    public void mo64908a(C12287f fVar, boolean z, boolean z2) {
        this.f29741k = fVar;
        C12226l a = m31863a(z, z2, true, 2);
        this.f29745o = true;
        this.f29744n++;
        this.f29736f.mo64928a(fVar, z, z2);
        m31865a(a, false, 4, 1, false);
    }

    /* renamed from: b */
    public long mo64911b() {
        if (!mo64923n()) {
            return mo64919i();
        }
        C12226l lVar = this.f29748r;
        lVar.f29847a.mo65189a(lVar.f29848b.f30085a, this.f29739i);
        C12226l lVar2 = this.f29748r;
        if (lVar2.f29850d == -9223372036854775807L) {
            return C12874dd.m35213b(lVar2.f29847a.mo65190a(mo64918h(), this.f29560a, 0).f30055k);
        }
        return this.f29739i.mo65204b() + C12874dd.m35213b(this.f29748r.f29850d);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31871b(CopyOnWriteArrayList copyOnWriteArrayList, C12175c.C12177b bVar) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((C12175c.C12176a) it.next()).mo64791a(bVar);
        }
    }

    /* renamed from: a */
    public void mo64910a(boolean z, int i) {
        boolean k = mo64789k();
        boolean z2 = this.f29742l && this.f29743m == 0;
        boolean z3 = z && i == 0;
        if (z2 != z3) {
            this.f29736f.mo64933c(z3);
        }
        boolean z4 = this.f29742l != z;
        boolean z5 = this.f29743m != i;
        this.f29742l = z;
        this.f29743m = i;
        boolean k2 = mo64789k();
        boolean z6 = k != k2;
        if (z4 || z5 || z6) {
            m31864a((C12175c.C12177b) new C12175c.C12177b(z4, z, this.f29748r.f29851e, z5, i, z6, k2) {
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ boolean f$5;
                public final /* synthetic */ boolean f$6;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                }

                /* renamed from: a */
                public final void mo64762a(C12227m.C12228a aVar) {
                    C12215g.m31870a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, aVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31870a(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, C12227m.C12228a aVar) {
        if (z) {
            aVar.onPlayerStateChanged(z2, i);
        }
        if (z3) {
            aVar.onPlaybackSuppressionReasonChanged(i2);
        }
        if (z4) {
            aVar.onIsPlayingChanged(z5);
        }
    }

    /* renamed from: a */
    public void mo64909a(boolean z) {
        C12226l a = m31863a(z, z, z, 1);
        this.f29744n++;
        this.f29736f.mo64934f(z);
        m31865a(a, false, 4, 1, false);
    }

    /* renamed from: a */
    public C12260n mo64905a(C12260n.C12262b bVar) {
        return new C12260n(this.f29736f, bVar, this.f29748r.f29847a, mo64918h(), this.f29737g);
    }

    /* renamed from: a */
    public int mo64904a() {
        if (mo64923n()) {
            return this.f29748r.f29848b.f30087c;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64906a(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 0) {
            C12226l lVar = (C12226l) message.obj;
            int i2 = message.arg1;
            int i3 = message.arg2;
            if (i3 == -1) {
                z = false;
            }
            int i4 = this.f29744n - i2;
            this.f29744n = i4;
            if (i4 == 0) {
                if (lVar.f29849c == -9223372036854775807L) {
                    lVar = lVar.mo64981a(lVar.f29848b, 0, lVar.f29850d, lVar.f29858l);
                }
                C12226l lVar2 = lVar;
                if (!this.f29748r.f29847a.mo65194d() && lVar2.f29847a.mo65194d()) {
                    this.f29750t = 0;
                    this.f29749s = 0;
                    this.f29751u = 0;
                }
                int i5 = this.f29745o ? 0 : 2;
                this.f29745o = false;
                m31865a(lVar2, z, i3, i5, false);
            }
        } else if (i == 1) {
            sz0 sz0 = (sz0) message.obj;
            if (message.arg1 == 0) {
                z = false;
            }
            m31867a(sz0, z);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private void m31867a(sz0 sz0, boolean z) {
        if (z) {
            this.f29746p--;
        }
        if (this.f29746p == 0 && !this.f29747q.equals(sz0)) {
            this.f29747q = sz0;
            m31864a((C12175c.C12177b) new C12175c.C12177b() {
                /* renamed from: a */
                public final void mo64762a(C12227m.C12228a aVar) {
                    aVar.mo64987a(sz0.this);
                }
            });
        }
    }

    /* renamed from: a */
    private C12226l m31863a(boolean z, boolean z2, boolean z3, int i) {
        C12287f.C12288a aVar;
        long j;
        k40 k40;
        int i2;
        long j2 = 0;
        if (z) {
            this.f29749s = 0;
            this.f29750t = 0;
            this.f29751u = 0;
        } else {
            this.f29749s = mo64918h();
            if (m31872p()) {
                i2 = this.f29750t;
            } else {
                C12226l lVar = this.f29748r;
                i2 = lVar.f29847a.mo65186a(lVar.f29848b.f30085a);
            }
            this.f29750t = i2;
            this.f29751u = mo64919i();
        }
        boolean z4 = z || z2;
        if (z4) {
            aVar = this.f29748r.mo64983a(false, this.f29560a, this.f29739i);
        } else {
            aVar = this.f29748r.f29848b;
        }
        C12287f.C12288a aVar2 = aVar;
        if (!z4) {
            j2 = this.f29748r.f29859m;
        }
        long j3 = j2;
        if (z4) {
            j = -9223372036854775807L;
        } else {
            j = this.f29748r.f29850d;
        }
        long j4 = j;
        C12270q qVar = z2 ? C12270q.f30037a : this.f29748r.f29847a;
        if (z3) {
            k40 = null;
        } else {
            k40 = this.f29748r.f29852f;
        }
        return new C12226l(qVar, aVar2, j3, j4, i, k40, false, z2 ? TrackGroupArray.f30062e : this.f29748r.f29854h, z2 ? this.f29732b : this.f29748r.f29855i, aVar2, j3, 0, j3);
    }

    /* renamed from: a */
    private void m31865a(C12226l lVar, boolean z, int i, int i2, boolean z2) {
        boolean k = mo64789k();
        C12226l lVar2 = this.f29748r;
        this.f29748r = lVar;
        m31868a((Runnable) new C12216a(lVar, lVar2, this.f29738h, this.f29734d, z, i, i2, z2, this.f29742l, k != mo64789k()));
    }

    /* renamed from: a */
    private void m31864a(C12175c.C12177b bVar) {
        m31868a((Runnable) new Runnable(new CopyOnWriteArrayList(this.f29738h), bVar) {
            public final /* synthetic */ CopyOnWriteArrayList f$0;
            public final /* synthetic */ C12175c.C12177b f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C12215g.m31871b(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m31868a(Runnable runnable) {
        boolean z = !this.f29740j.isEmpty();
        this.f29740j.addLast(runnable);
        if (!z) {
            while (!this.f29740j.isEmpty()) {
                this.f29740j.peekFirst().run();
                this.f29740j.removeFirst();
            }
        }
    }

    /* renamed from: a */
    static void m31869a(CopyOnWriteArrayList copyOnWriteArrayList, C12175c.C12177b bVar) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((C12175c.C12176a) it.next()).mo64791a(bVar);
        }
    }
}
