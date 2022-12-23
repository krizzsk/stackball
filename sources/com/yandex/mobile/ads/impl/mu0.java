package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

class mu0 implements y70, eu0 {

    /* renamed from: a */
    private final au0 f37521a;

    /* renamed from: b */
    private final r11 f37522b;

    /* renamed from: c */
    private final Long f37523c;

    mu0(AdResponse adResponse, au0 au0, r11 r11) {
        this.f37521a = au0;
        this.f37522b = r11;
        this.f37523c = adResponse.mo64411B();
    }

    /* renamed from: a */
    public void mo65894a() {
        this.f37521a.mo65886a(this);
    }

    /* renamed from: b */
    public void mo65887b() {
        this.f37522b.mo68508a();
        this.f37521a.mo65888b(this);
    }

    /* renamed from: c */
    public void mo65889c() {
        this.f37522b.mo68508a();
        this.f37521a.mo65888b(this);
    }

    public void invalidate() {
        this.f37521a.mo65888b(this);
    }

    public void pause() {
    }

    public void resume() {
    }

    /* renamed from: a */
    public void mo65885a(long j, long j2) {
        Long l = this.f37523c;
        if (l != null) {
            j = Math.min(j, l.longValue());
        }
        if (j2 >= j) {
            this.f37521a.mo65888b(this);
            this.f37522b.mo68508a();
            return;
        }
        this.f37522b.mo68509a(j, j2);
    }
}
