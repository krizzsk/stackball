package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.hs */
public final class C13343hs implements b60<C13232gs> {

    /* renamed from: a */
    private final Provider<C14624so> f34537a;

    /* renamed from: b */
    private final Provider<a10> f34538b;

    /* renamed from: c */
    private final Provider<C14773uo> f34539c;

    /* renamed from: d */
    private final Provider<C12660bw> f34540d;

    public C13343hs(Provider<C14624so> provider, Provider<a10> provider2, Provider<C14773uo> provider3, Provider<C12660bw> provider4) {
        this.f34537a = provider;
        this.f34538b = provider2;
        this.f34539c = provider3;
        this.f34540d = provider4;
    }

    public Object get() {
        return new C13232gs(this.f34537a.get(), this.f34538b.get(), this.f34539c, this.f34540d.get());
    }
}
