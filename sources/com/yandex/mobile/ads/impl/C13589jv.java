package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.jv */
public final class C13589jv implements b60<C13450iv> {

    /* renamed from: a */
    private final Provider<C13513jm> f35647a;

    /* renamed from: b */
    private final Provider<C14773uo> f35648b;

    /* renamed from: c */
    private final Provider<C15219xy> f35649c;

    /* renamed from: d */
    private final Provider<C14327py> f35650d;

    public C13589jv(Provider<C13513jm> provider, Provider<C14773uo> provider2, Provider<C15219xy> provider3, Provider<C14327py> provider4) {
        this.f35647a = provider;
        this.f35648b = provider2;
        this.f35649c = provider3;
        this.f35650d = provider4;
    }

    public Object get() {
        return new C13450iv(this.f35647a.get(), this.f35648b.get(), this.f35649c.get(), this.f35650d.get());
    }
}
