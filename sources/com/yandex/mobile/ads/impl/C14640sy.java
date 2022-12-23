package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.sy */
public final class C14640sy implements b60<C14546ry> {

    /* renamed from: a */
    private final Provider<C14237oy> f40176a;

    /* renamed from: b */
    private final Provider<hd1> f40177b;

    public C14640sy(Provider<C14237oy> provider, Provider<hd1> provider2) {
        this.f40176a = provider;
        this.f40177b = provider2;
    }

    public Object get() {
        return new C14546ry(this.f40176a.get(), this.f40177b.get());
    }
}
