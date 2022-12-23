package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.to */
public final class C14698to implements b60<C14624so> {

    /* renamed from: a */
    private final Provider<C14213ot> f40388a;

    /* renamed from: b */
    private final Provider<g00> f40389b;

    /* renamed from: c */
    private final Provider<C14128nr> f40390c;

    /* renamed from: d */
    private final Provider<C15056wm> f40391d;

    /* renamed from: e */
    private final Provider<C14395qm> f40392e;

    public C14698to(Provider<C14213ot> provider, Provider<g00> provider2, Provider<C14128nr> provider3, Provider<C15056wm> provider4, Provider<C14395qm> provider5) {
        this.f40388a = provider;
        this.f40389b = provider2;
        this.f40390c = provider3;
        this.f40391d = provider4;
        this.f40392e = provider5;
    }

    public Object get() {
        return new C14624so(this.f40388a.get(), this.f40389b.get(), this.f40390c.get(), this.f40391d.get(), this.f40392e.get());
    }
}
