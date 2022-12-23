package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.gu */
public final class C13249gu implements b60<C13139fu> {

    /* renamed from: a */
    private final Provider<C13513jm> f34151a;

    /* renamed from: b */
    private final Provider<C14773uo> f34152b;

    /* renamed from: c */
    private final Provider<C15219xy> f34153c;

    /* renamed from: d */
    private final Provider<C14327py> f34154d;

    public C13249gu(Provider<C13513jm> provider, Provider<C14773uo> provider2, Provider<C15219xy> provider3, Provider<C14327py> provider4) {
        this.f34151a = provider;
        this.f34152b = provider2;
        this.f34153c = provider3;
        this.f34154d = provider4;
    }

    public Object get() {
        return new C13139fu(this.f34151a.get(), this.f34152b.get(), this.f34153c.get(), this.f34154d.get());
    }
}
