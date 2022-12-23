package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.inject.Provider;

public final class n00 implements b60<m00> {

    /* renamed from: a */
    private final Provider<Context> f37617a;

    /* renamed from: b */
    private final Provider<e10> f37618b;

    public n00(Provider<Context> provider, Provider<e10> provider2) {
        this.f37617a = provider;
        this.f37618b = provider2;
    }

    public Object get() {
        return new m00(this.f37617a.get(), this.f37618b.get());
    }
}
