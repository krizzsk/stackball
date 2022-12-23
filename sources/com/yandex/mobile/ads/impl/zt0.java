package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

class zt0 implements y70, eu0 {

    /* renamed from: a */
    private au0 f43333a;

    /* renamed from: b */
    private final C15170xf f43334b;

    /* renamed from: c */
    private final Long f43335c;

    zt0(AdResponse adResponse, au0 au0, C15170xf xfVar) {
        this.f43333a = au0;
        this.f43334b = xfVar;
        this.f43335c = adResponse.mo64438r();
    }

    /* renamed from: d */
    private void m44784d() {
        this.f43334b.mo65689a();
        this.f43333a.mo65888b(this);
    }

    /* renamed from: a */
    public void mo65885a(long j, long j2) {
        Long l = this.f43335c;
        if (l != null && j2 >= l.longValue()) {
            m44784d();
        }
    }

    /* renamed from: b */
    public void mo65887b() {
        m44784d();
    }

    /* renamed from: c */
    public void mo65889c() {
        m44784d();
    }

    public void invalidate() {
        this.f43333a.mo65888b(this);
    }

    public void pause() {
    }

    public void resume() {
    }

    /* renamed from: a */
    public void mo65894a() {
        this.f43333a.mo65886a(this);
    }
}
