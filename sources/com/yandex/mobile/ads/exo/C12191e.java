package com.yandex.mobile.ads.exo;

import com.yandex.mobile.ads.impl.C13493jf;
import com.yandex.mobile.ads.impl.eb1;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.sz0;

/* renamed from: com.yandex.mobile.ads.exo.e */
final class C12191e implements ml0 {

    /* renamed from: b */
    private final eb1 f29590b;

    /* renamed from: c */
    private final C12192a f29591c;

    /* renamed from: d */
    private C12263o f29592d;

    /* renamed from: e */
    private ml0 f29593e;

    /* renamed from: f */
    private boolean f29594f = true;

    /* renamed from: g */
    private boolean f29595g;

    /* renamed from: com.yandex.mobile.ads.exo.e$a */
    public interface C12192a {
    }

    public C12191e(C12192a aVar, C13493jf jfVar) {
        this.f29591c = aVar;
        this.f29590b = new eb1(jfVar);
    }

    /* renamed from: a */
    public void mo64863a() {
        this.f29595g = true;
        this.f29590b.mo66794a();
    }

    /* renamed from: b */
    public void mo64867b() {
        this.f29595g = false;
        this.f29590b.mo66796b();
    }

    /* renamed from: m */
    public sz0 mo64869m() {
        ml0 ml0 = this.f29593e;
        if (ml0 != null) {
            return ml0.mo64869m();
        }
        return this.f29590b.mo64869m();
    }

    /* renamed from: r */
    public long mo64870r() {
        return this.f29594f ? this.f29590b.mo64870r() : this.f29593e.mo64870r();
    }

    /* renamed from: a */
    public void mo64864a(long j) {
        this.f29590b.mo66795a(j);
    }

    /* renamed from: b */
    public void mo64868b(C12263o oVar) throws k40 {
        ml0 ml0;
        ml0 n = oVar.mo64819n();
        if (n != null && n != (ml0 = this.f29593e)) {
            if (ml0 == null) {
                this.f29593e = n;
                this.f29592d = oVar;
                n.mo64866a(this.f29590b.mo64869m());
                return;
            }
            throw k40.m38185a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: a */
    public void mo64865a(C12263o oVar) {
        if (oVar == this.f29592d) {
            this.f29593e = null;
            this.f29592d = null;
            this.f29594f = true;
        }
    }

    /* renamed from: a */
    public void mo64866a(sz0 sz0) {
        ml0 ml0 = this.f29593e;
        if (ml0 != null) {
            ml0.mo64866a(sz0);
            sz0 = this.f29593e.mo64869m();
        }
        this.f29590b.mo64866a(sz0);
    }

    /* renamed from: a */
    public long mo64862a(boolean z) {
        C12263o oVar = this.f29592d;
        if (oVar == null || oVar.mo65007e() || (!this.f29592d.mo65006c() && (z || this.f29592d.mo64817k()))) {
            this.f29594f = true;
            if (this.f29595g) {
                this.f29590b.mo66794a();
            }
        } else {
            long r = this.f29593e.mo64870r();
            if (this.f29594f) {
                if (r < this.f29590b.mo64870r()) {
                    this.f29590b.mo66796b();
                } else {
                    this.f29594f = false;
                    if (this.f29595g) {
                        this.f29590b.mo66794a();
                    }
                }
            }
            this.f29590b.mo66795a(r);
            sz0 m = this.f29593e.mo64869m();
            if (!m.equals(this.f29590b.mo64869m())) {
                this.f29590b.mo64866a(m);
                ((C12217h) this.f29591c).mo64930a(m);
            }
        }
        return mo64870r();
    }
}
