package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.qs */
public final class C14413qs implements b60<C14011ms> {

    /* renamed from: a */
    private final Provider<C14624so> f39275a;

    /* renamed from: b */
    private final Provider<C14213ot> f39276b;

    /* renamed from: c */
    private final Provider<C13903lw> f39277c;

    public C14413qs(Provider<C14624so> provider, Provider<C14213ot> provider2, Provider<C13903lw> provider3) {
        this.f39275a = provider;
        this.f39276b = provider2;
        this.f39277c = provider3;
    }

    public Object get() {
        return new C14011ms(this.f39275a.get(), this.f39276b.get(), this.f39277c.get());
    }
}
