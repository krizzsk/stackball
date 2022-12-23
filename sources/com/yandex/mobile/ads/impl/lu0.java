package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

class lu0 implements y70, eu0 {

    /* renamed from: a */
    private au0 f36922a;

    /* renamed from: b */
    private u51 f36923b;

    /* renamed from: c */
    private final Long f36924c;

    lu0(AdResponse adResponse, au0 au0, u51 u51) {
        this.f36922a = au0;
        this.f36923b = u51;
        this.f36924c = adResponse.mo64411B();
    }

    /* renamed from: a */
    public void mo65894a() {
        this.f36922a.mo65886a(this);
    }

    /* renamed from: b */
    public void mo65887b() {
    }

    /* renamed from: c */
    public void mo65889c() {
        this.f36922a.mo65888b(this);
        this.f36923b.mo69496b();
    }

    public void invalidate() {
        this.f36922a.mo65888b(this);
    }

    public void pause() {
    }

    public void resume() {
    }

    /* renamed from: a */
    public void mo65885a(long j, long j2) {
        Long l = this.f36924c;
        if (l != null && j2 > l.longValue()) {
            this.f36922a.mo65888b(this);
            this.f36923b.mo69496b();
        }
    }
}
