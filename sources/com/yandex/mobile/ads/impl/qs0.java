package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

class qs0 implements y70 {

    /* renamed from: a */
    private final C15170xf f39278a;

    /* renamed from: b */
    private final wy0 f39279b = new wy0(false);

    /* renamed from: c */
    private final C14415b f39280c = new C14415b();

    /* renamed from: d */
    private final long f39281d;

    /* renamed from: com.yandex.mobile.ads.impl.qs0$b */
    private class C14415b implements xy0 {
        private C14415b() {
        }

        /* renamed from: a */
        public void mo65511a() {
            qs0.m41404a(qs0.this);
        }
    }

    public qs0(AdResponse adResponse, C15170xf xfVar) {
        this.f39278a = xfVar;
        this.f39281d = new rs0().mo69809a(adResponse);
    }

    /* renamed from: a */
    public void mo65894a() {
        this.f39279b.mo70771a(this.f39281d, this.f39280c);
    }

    public void invalidate() {
        this.f39279b.mo70770a();
    }

    public void pause() {
        this.f39279b.mo70773b();
    }

    public void resume() {
        this.f39279b.mo70774d();
    }

    /* renamed from: a */
    static void m41404a(qs0 qs0) {
        qs0.f39278a.mo65689a();
    }
}
