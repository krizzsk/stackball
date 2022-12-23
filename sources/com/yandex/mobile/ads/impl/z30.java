package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class z30 implements b60<y30> {

    /* renamed from: a */
    private final Provider<q30> f43009a;

    /* renamed from: b */
    private final Provider<Boolean> f43010b;

    public z30(Provider<q30> provider, Provider<Boolean> provider2) {
        this.f43009a = provider;
        this.f43010b = provider2;
    }

    public Object get() {
        return new y30(this.f43009a.get(), this.f43010b.get().booleanValue());
    }
}
