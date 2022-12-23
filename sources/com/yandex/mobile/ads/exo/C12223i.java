package com.yandex.mobile.ads.exo;

import com.yandex.mobile.ads.exo.source.C12280b;
import com.yandex.mobile.ads.exo.source.C12282c;
import com.yandex.mobile.ads.exo.source.C12285e;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12309l;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.exo.trackselection.C12333e;
import com.yandex.mobile.ads.exo.trackselection.C12334f;
import com.yandex.mobile.ads.impl.C13477j7;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.le1;

/* renamed from: com.yandex.mobile.ads.exo.i */
final class C12223i {

    /* renamed from: a */
    public final C12285e f29813a;

    /* renamed from: b */
    public final Object f29814b;

    /* renamed from: c */
    public final C12309l[] f29815c;

    /* renamed from: d */
    public boolean f29816d;

    /* renamed from: e */
    public boolean f29817e;

    /* renamed from: f */
    public C12224j f29818f;

    /* renamed from: g */
    private final boolean[] f29819g;

    /* renamed from: h */
    private final C12178d[] f29820h;

    /* renamed from: i */
    private final C12334f f29821i;

    /* renamed from: j */
    private final C12287f f29822j;

    /* renamed from: k */
    private C12223i f29823k;

    /* renamed from: l */
    private TrackGroupArray f29824l = TrackGroupArray.f30062e;

    /* renamed from: m */
    private le1 f29825m;

    /* renamed from: n */
    private long f29826n;

    public C12223i(C12178d[] dVarArr, long j, C12334f fVar, C13477j7 j7Var, C12287f fVar2, C12224j jVar, le1 le1) {
        this.f29820h = dVarArr;
        this.f29826n = j;
        this.f29821i = fVar;
        this.f29822j = fVar2;
        C12287f.C12288a aVar = jVar.f29827a;
        this.f29814b = aVar.f30085a;
        this.f29818f = jVar;
        this.f29825m = le1;
        this.f29815c = new C12309l[dVarArr.length];
        this.f29819g = new boolean[dVarArr.length];
        this.f29813a = m31965a(aVar, fVar2, j7Var, jVar.f29828b, jVar.f29830d);
    }

    /* renamed from: j */
    private boolean m31968j() {
        return this.f29823k == null;
    }

    /* renamed from: a */
    public void mo64944a(float f, C12270q qVar) throws k40 {
        this.f29816d = true;
        this.f29824l = this.f29813a.mo65261b();
        long a = mo64943a(mo64947b(f, qVar), this.f29818f.f29828b, false, new boolean[this.f29820h.length]);
        long j = this.f29826n;
        C12224j jVar = this.f29818f;
        long j2 = jVar.f29828b;
        this.f29826n = j + (j2 - a);
        if (a != j2) {
            jVar = new C12224j(jVar.f29827a, a, jVar.f29829c, jVar.f29830d, jVar.f29831e, jVar.f29832f, jVar.f29833g);
        }
        this.f29818f = jVar;
    }

    /* renamed from: b */
    public void mo64948b(long j) {
        C13479j9.m37708b(m31968j());
        if (this.f29816d) {
            this.f29813a.mo65263c(j - this.f29826n);
        }
    }

    /* renamed from: c */
    public void mo64950c(long j) {
        this.f29826n = j;
    }

    /* renamed from: d */
    public long mo64951d(long j) {
        return j - this.f29826n;
    }

    /* renamed from: e */
    public long mo64953e() {
        return this.f29826n;
    }

    /* renamed from: f */
    public long mo64955f() {
        return this.f29818f.f29828b + this.f29826n;
    }

    /* renamed from: g */
    public TrackGroupArray mo64956g() {
        return this.f29824l;
    }

    /* renamed from: h */
    public le1 mo64957h() {
        return this.f29825m;
    }

    /* renamed from: i */
    public boolean mo64958i() {
        return this.f29816d && (!this.f29817e || this.f29813a.mo65265e() == Long.MIN_VALUE);
    }

    /* renamed from: k */
    public void mo64959k() {
        m31966a();
        long j = this.f29818f.f29830d;
        C12287f fVar = this.f29822j;
        C12285e eVar = this.f29813a;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            fVar.mo65282a(eVar);
            return;
        }
        try {
            fVar.mo65282a(((C12280b) eVar).f30071b);
        } catch (RuntimeException e) {
            bk0.m34269a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: c */
    public long mo64949c() {
        if (!this.f29816d) {
            return this.f29818f.f29828b;
        }
        long e = this.f29817e ? this.f29813a.mo65265e() : Long.MIN_VALUE;
        return e == Long.MIN_VALUE ? this.f29818f.f29831e : e;
    }

    /* renamed from: d */
    public C12223i mo64952d() {
        return this.f29823k;
    }

    /* renamed from: e */
    public long mo64954e(long j) {
        return j + this.f29826n;
    }

    /* renamed from: b */
    public le1 mo64947b(float f, C12270q qVar) throws k40 {
        le1 a = this.f29821i.mo65396a(this.f29820h, this.f29824l, this.f29818f.f29827a, qVar);
        for (C12330d dVar : a.f36650c.mo65402a()) {
            if (dVar != null) {
                dVar.mo65381a(f);
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo64945a(long j) {
        C13479j9.m37708b(m31968j());
        this.f29813a.mo65262b(j - this.f29826n);
    }

    /* renamed from: b */
    private void m31967b() {
        if (m31968j()) {
            int i = 0;
            while (true) {
                le1 le1 = this.f29825m;
                if (i < le1.f36648a) {
                    boolean a = le1.mo68415a(i);
                    C12330d a2 = this.f29825m.f36650c.mo65401a(i);
                    if (a && a2 != null) {
                        a2.mo65384e();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public long mo64942a(le1 le1, long j, boolean z) {
        return mo64943a(le1, j, z, new boolean[this.f29820h.length]);
    }

    /* renamed from: a */
    public long mo64943a(le1 le1, long j, boolean z, boolean[] zArr) {
        le1 le12 = le1;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= le12.f36648a) {
                break;
            }
            boolean[] zArr2 = this.f29819g;
            if (z || !le12.mo68416a(this.f29825m, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        C12309l[] lVarArr = this.f29815c;
        int i2 = 0;
        while (true) {
            C12178d[] dVarArr = this.f29820h;
            if (i2 >= dVarArr.length) {
                break;
            }
            if (dVarArr[i2].mo64820o() == 6) {
                lVarArr[i2] = null;
            }
            i2++;
        }
        m31966a();
        this.f29825m = le12;
        m31967b();
        C12333e eVar = le12.f36650c;
        long a = this.f29813a.mo65257a(eVar.mo65402a(), this.f29819g, this.f29815c, zArr, j);
        C12309l[] lVarArr2 = this.f29815c;
        int i3 = 0;
        while (true) {
            C12178d[] dVarArr2 = this.f29820h;
            if (i3 >= dVarArr2.length) {
                break;
            }
            if (dVarArr2[i3].mo64820o() == 6 && this.f29825m.mo68415a(i3)) {
                lVarArr2[i3] = new C12282c();
            }
            i3++;
        }
        this.f29817e = false;
        int i4 = 0;
        while (true) {
            C12309l[] lVarArr3 = this.f29815c;
            if (i4 >= lVarArr3.length) {
                return a;
            }
            if (lVarArr3[i4] != null) {
                C13479j9.m37708b(le12.mo68415a(i4));
                if (this.f29820h[i4].mo64820o() != 6) {
                    this.f29817e = true;
                }
            } else {
                C13479j9.m37708b(eVar.mo65401a(i4) == null);
            }
            i4++;
        }
    }

    /* renamed from: a */
    public void mo64946a(C12223i iVar) {
        if (iVar != this.f29823k) {
            m31966a();
            this.f29823k = iVar;
            m31967b();
        }
    }

    /* renamed from: a */
    private void m31966a() {
        if (m31968j()) {
            int i = 0;
            while (true) {
                le1 le1 = this.f29825m;
                if (i < le1.f36648a) {
                    boolean a = le1.mo68415a(i);
                    C12330d a2 = this.f29825m.f36650c.mo65401a(i);
                    if (a && a2 != null) {
                        a2.mo65392f();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static C12285e m31965a(C12287f.C12288a aVar, C12287f fVar, C13477j7 j7Var, long j, long j2) {
        C12285e a = fVar.mo65280a(aVar, j7Var, j);
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? a : new C12280b(a, true, 0, j2);
    }
}
