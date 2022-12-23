package com.yandex.mobile.ads.impl;

public class h01 implements s11 {

    /* renamed from: a */
    private final wm1 f34189a;

    /* renamed from: b */
    private final w21 f34190b;

    /* renamed from: c */
    private final v21 f34191c;

    /* renamed from: d */
    private final j01 f34192d;

    /* renamed from: e */
    private boolean f34193e;

    h01(wm1 wm1, w21 w21, v21 v21, j01 j01) {
        this.f34189a = wm1;
        this.f34190b = w21;
        this.f34191c = v21;
        this.f34192d = j01;
    }

    /* renamed from: a */
    public void mo67374a() {
        if (!this.f34193e) {
            this.f34193e = true;
            this.f34189a.mo70731a((s11) this);
            this.f34189a.mo70730a();
        }
    }

    /* renamed from: b */
    public void mo67376b() {
        if (this.f34193e) {
            this.f34189a.mo70731a((s11) null);
            this.f34189a.mo70732b();
            this.f34193e = false;
        }
    }

    /* renamed from: a */
    public void mo67375a(long j) {
        og0 a = this.f34190b.mo70626a(j);
        if (a != null) {
            ((vn0) this.f34192d).mo70503b(a);
            return;
        }
        og0 a2 = this.f34191c.mo70442a(j);
        if (a2 != null) {
            ((vn0) this.f34192d).mo70502a(a2);
        }
    }
}
