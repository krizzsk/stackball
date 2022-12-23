package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.rv */
public final class C14537rv implements b60<C14315pv> {

    /* renamed from: a */
    private final Provider<C14624so> f39725a;

    /* renamed from: b */
    private final Provider<a10> f39726b;

    /* renamed from: c */
    private final Provider<C14773uo> f39727c;

    /* renamed from: d */
    private final Provider<C12660bw> f39728d;

    /* renamed from: e */
    private final Provider<C15056wm> f39729e;

    public C14537rv(Provider<C14624so> provider, Provider<a10> provider2, Provider<C14773uo> provider3, Provider<C12660bw> provider4, Provider<C15056wm> provider5) {
        this.f39725a = provider;
        this.f39726b = provider2;
        this.f39727c = provider3;
        this.f39728d = provider4;
        this.f39729e = provider5;
    }

    public Object get() {
        return new C14315pv(this.f39725a.get(), this.f39726b.get(), this.f39727c, this.f39728d.get(), this.f39729e.get());
    }
}
