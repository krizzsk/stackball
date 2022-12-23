package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

class ss0 implements y70 {

    /* renamed from: a */
    private final u51 f40124a;

    /* renamed from: b */
    private final wy0 f40125b = new wy0(false);

    /* renamed from: c */
    private final long f40126c;

    /* renamed from: com.yandex.mobile.ads.impl.ss0$b */
    private class C14630b implements xy0 {
        private C14630b() {
        }

        /* renamed from: a */
        public void mo65511a() {
            ss0.m42140a(ss0.this);
        }
    }

    public ss0(AdResponse adResponse, u51 u51) {
        this.f40124a = u51;
        this.f40126c = m42139a(adResponse);
    }

    /* renamed from: a */
    public void mo65894a() {
        this.f40125b.mo70771a(this.f40126c, new C14630b());
    }

    public void invalidate() {
        this.f40125b.mo70770a();
    }

    public void pause() {
        this.f40125b.mo70773b();
    }

    public void resume() {
        this.f40125b.mo70774d();
    }

    /* renamed from: a */
    private long m42139a(AdResponse adResponse) {
        Long B = adResponse.mo64411B();
        if (B == null) {
            B = 5000L;
        }
        return B.longValue();
    }

    /* renamed from: a */
    static void m42140a(ss0 ss0) {
        ss0.f40124a.mo69496b();
    }
}
