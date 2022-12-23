package com.yandex.mobile.ads.impl;

class xu0 implements y70, zu0 {

    /* renamed from: a */
    private final yu0 f42698a;

    /* renamed from: b */
    private final C15170xf f42699b;

    xu0(yu0 yu0, C15170xf xfVar) {
        this.f42698a = yu0;
        this.f42699b = xfVar;
    }

    /* renamed from: a */
    public void mo65894a() {
        this.f42698a.mo71128a((zu0) this);
    }

    /* renamed from: b */
    public void mo65896b() {
    }

    public void invalidate() {
        this.f42698a.mo71129b(this);
    }

    public void pause() {
    }

    public void resume() {
    }

    /* renamed from: a */
    public void mo65895a(boolean z) {
        if (!z) {
            this.f42699b.mo65689a();
            this.f42698a.mo71129b(this);
        }
    }
}
