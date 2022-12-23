package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class t10 implements b60<s10> {

    /* renamed from: a */
    private final Provider<mo1> f40211a;

    /* renamed from: b */
    private final Provider<o10> f40212b;

    public t10(Provider<mo1> provider, Provider<o10> provider2) {
        this.f40211a = provider;
        this.f40212b = provider2;
    }

    public Object get() {
        return new s10(this.f40211a.get(), this.f40212b.get());
    }
}
