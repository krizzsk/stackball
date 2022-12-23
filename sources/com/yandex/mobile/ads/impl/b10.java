package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.inject.Provider;

public final class b10 implements b60<a10> {

    /* renamed from: a */
    private final Provider<Context> f31195a;

    /* renamed from: b */
    private final Provider<eo1> f31196b;

    /* renamed from: c */
    private final Provider<u00> f31197c;

    public b10(Provider<Context> provider, Provider<eo1> provider2, Provider<u00> provider3) {
        this.f31195a = provider;
        this.f31196b = provider2;
        this.f31197c = provider3;
    }

    public Object get() {
        return new a10(this.f31195a.get(), this.f31196b.get(), this.f31197c.get());
    }
}
