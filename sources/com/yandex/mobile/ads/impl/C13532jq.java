package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.jq */
public final class C13532jq implements b60<C13224gq> {

    /* renamed from: a */
    private final Provider<C14624so> f35433a;

    /* renamed from: b */
    private final Provider<a10> f35434b;

    /* renamed from: c */
    private final Provider<C13012ew> f35435c;

    /* renamed from: d */
    private final Provider<C12660bw> f35436d;

    /* renamed from: e */
    private final Provider<C14773uo> f35437e;

    public C13532jq(Provider<C14624so> provider, Provider<a10> provider2, Provider<C13012ew> provider3, Provider<C12660bw> provider4, Provider<C14773uo> provider5) {
        this.f35433a = provider;
        this.f35434b = provider2;
        this.f35435c = provider3;
        this.f35436d = provider4;
        this.f35437e = provider5;
    }

    public Object get() {
        return new C13224gq(this.f35433a.get(), this.f35434b, this.f35435c.get(), this.f35436d.get(), this.f35437e);
    }
}
