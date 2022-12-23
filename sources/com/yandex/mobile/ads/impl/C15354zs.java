package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.zs */
public final class C15354zs implements b60<C15208xs> {

    /* renamed from: a */
    private final Provider<C14624so> f43324a;

    /* renamed from: b */
    private final Provider<C13012ew> f43325b;

    /* renamed from: c */
    private final Provider<C12660bw> f43326c;

    /* renamed from: d */
    private final Provider<C14773uo> f43327d;

    public C15354zs(Provider<C14624so> provider, Provider<C13012ew> provider2, Provider<C12660bw> provider3, Provider<C14773uo> provider4) {
        this.f43324a = provider;
        this.f43325b = provider2;
        this.f43326c = provider3;
        this.f43327d = provider4;
    }

    public Object get() {
        return new C15208xs(this.f43324a.get(), this.f43325b.get(), this.f43326c.get(), this.f43327d);
    }
}
