package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class p10 implements b60<o10> {

    /* renamed from: a */
    private final Provider<C12903dm> f38437a;

    /* renamed from: b */
    private final Provider<u10> f38438b;

    /* renamed from: c */
    private final Provider<C12985en> f38439c;

    /* renamed from: d */
    private final Provider<C14769um> f38440d;

    public p10(Provider<C12903dm> provider, Provider<u10> provider2, Provider<C12985en> provider3, Provider<C14769um> provider4) {
        this.f38437a = provider;
        this.f38438b = provider2;
        this.f38439c = provider3;
        this.f38440d = provider4;
    }

    public Object get() {
        return new o10(this.f38437a.get(), this.f38438b.get(), this.f38439c.get(), this.f38440d.get());
    }
}
