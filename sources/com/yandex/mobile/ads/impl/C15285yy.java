package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.yy */
public final class C15285yy implements b60<C15219xy> {

    /* renamed from: a */
    private final Provider<C13513jm> f42982a;

    public C15285yy(Provider<C13513jm> provider) {
        this.f42982a = provider;
    }

    public Object get() {
        return new C15219xy(this.f42982a.get());
    }
}
