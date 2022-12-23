package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class q50 implements b60<p50> {

    /* renamed from: a */
    private final Provider<b90> f39003a;

    /* renamed from: b */
    private final Provider<C12985en> f39004b;

    /* renamed from: c */
    private final Provider<q30> f39005c;

    public q50(Provider<b90> provider, Provider<C12985en> provider2, Provider<q30> provider3) {
        this.f39003a = provider;
        this.f39004b = provider2;
        this.f39005c = provider3;
    }

    public Object get() {
        return new p50(this.f39003a.get(), this.f39004b.get(), this.f39005c.get());
    }
}
