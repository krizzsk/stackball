package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.rr */
public final class C14488rr implements b60<C14412qr> {

    /* renamed from: a */
    private final Provider<C13513jm> f39544a;

    /* renamed from: b */
    private final Provider<C14128nr> f39545b;

    public C14488rr(Provider<C13513jm> provider, Provider<C14128nr> provider2) {
        this.f39544a = provider;
        this.f39545b = provider2;
    }

    public Object get() {
        return new C14412qr(this.f39544a.get(), this.f39545b.get());
    }
}
