package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.mt */
public final class C14015mt implements b60<C13444it> {

    /* renamed from: a */
    private final Provider<C14624so> f37515a;

    /* renamed from: b */
    private final Provider<C14213ot> f37516b;

    /* renamed from: c */
    private final Provider<C13903lw> f37517c;

    public C14015mt(Provider<C14624so> provider, Provider<C14213ot> provider2, Provider<C13903lw> provider3) {
        this.f37515a = provider;
        this.f37516b = provider2;
        this.f37517c = provider3;
    }

    public Object get() {
        return new C13444it(this.f37515a.get(), this.f37516b.get(), this.f37517c.get());
    }
}
