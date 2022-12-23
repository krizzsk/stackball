package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.zl */
public final class C15329zl implements b60<C15257yl> {

    /* renamed from: a */
    private final Provider<a10> f43224a;

    /* renamed from: b */
    private final Provider<C14773uo> f43225b;

    public C15329zl(Provider<a10> provider, Provider<C14773uo> provider2) {
        this.f43224a = provider;
        this.f43225b = provider2;
    }

    public Object get() {
        return new C15257yl(this.f43224a.get(), this.f43225b.get());
    }
}
