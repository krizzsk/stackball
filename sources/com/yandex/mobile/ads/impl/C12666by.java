package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.by */
public final class C12666by implements b60<C14233ox> {

    /* renamed from: a */
    private final Provider<C14624so> f31623a;

    /* renamed from: b */
    private final Provider<C15056wm> f31624b;

    /* renamed from: c */
    private final Provider<eg1> f31625c;

    public C12666by(Provider<C14624so> provider, Provider<C15056wm> provider2, Provider<eg1> provider3) {
        this.f31623a = provider;
        this.f31624b = provider2;
        this.f31625c = provider3;
    }

    public Object get() {
        return new C14233ox(this.f31623a.get(), this.f31624b.get(), this.f31625c.get());
    }
}
