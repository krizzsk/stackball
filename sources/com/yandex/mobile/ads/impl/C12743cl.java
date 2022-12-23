package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.cl */
public final class C12743cl<T> implements b60<T> {

    /* renamed from: a */
    private Provider<T> f31968a;

    /* renamed from: a */
    public static <T> void m34765a(Provider<T> provider, Provider<T> provider2) {
        C12743cl clVar = (C12743cl) provider;
        if (clVar.f31968a == null) {
            clVar.f31968a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    public T get() {
        Provider<T> provider = this.f31968a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
