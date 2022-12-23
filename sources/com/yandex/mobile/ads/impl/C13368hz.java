package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.hz */
public final class C13368hz implements b60<C12932dz> {

    /* renamed from: a */
    private final Provider<C14624so> f34708a;

    /* renamed from: b */
    private final Provider<a10> f34709b;

    /* renamed from: c */
    private final Provider<eo1> f34710c;

    /* renamed from: d */
    private final Provider<rc1> f34711d;

    /* renamed from: e */
    private final Provider<C15056wm> f34712e;

    /* renamed from: f */
    private final Provider<C12903dm> f34713f;

    /* renamed from: g */
    private final Provider<s10> f34714g;

    /* renamed from: h */
    private final Provider<C12660bw> f34715h;

    /* renamed from: i */
    private final Provider<Context> f34716i;

    public C13368hz(Provider<C14624so> provider, Provider<a10> provider2, Provider<eo1> provider3, Provider<rc1> provider4, Provider<C15056wm> provider5, Provider<C12903dm> provider6, Provider<s10> provider7, Provider<C12660bw> provider8, Provider<Context> provider9) {
        this.f34708a = provider;
        this.f34709b = provider2;
        this.f34710c = provider3;
        this.f34711d = provider4;
        this.f34712e = provider5;
        this.f34713f = provider6;
        this.f34714g = provider7;
        this.f34715h = provider8;
        this.f34716i = provider9;
    }

    public Object get() {
        return new C12932dz(this.f34708a.get(), this.f34709b.get(), this.f34710c.get(), this.f34711d.get(), this.f34712e.get(), this.f34713f.get(), this.f34714g.get(), this.f34715h.get(), this.f34716i.get());
    }
}
