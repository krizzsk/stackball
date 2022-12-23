package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.ny */
public final class C14154ny implements b60<C13458iy> {

    /* renamed from: a */
    private final Provider<C14624so> f38014a;

    /* renamed from: b */
    private final Provider<a10> f38015b;

    /* renamed from: c */
    private final Provider<C14773uo> f38016c;

    /* renamed from: d */
    private final Provider<C14237oy> f38017d;

    /* renamed from: e */
    private final Provider<hd1> f38018e;

    /* renamed from: f */
    private final Provider<C15056wm> f38019f;

    /* renamed from: g */
    private final Provider<C12903dm> f38020g;

    /* renamed from: h */
    private final Provider<s10> f38021h;

    public C14154ny(Provider<C14624so> provider, Provider<a10> provider2, Provider<C14773uo> provider3, Provider<C14237oy> provider4, Provider<hd1> provider5, Provider<C15056wm> provider6, Provider<C12903dm> provider7, Provider<s10> provider8) {
        this.f38014a = provider;
        this.f38015b = provider2;
        this.f38016c = provider3;
        this.f38017d = provider4;
        this.f38018e = provider5;
        this.f38019f = provider6;
        this.f38020g = provider7;
        this.f38021h = provider8;
    }

    public Object get() {
        return new C13458iy(this.f38014a.get(), this.f38015b.get(), this.f38016c, this.f38017d.get(), this.f38018e.get(), this.f38019f.get(), this.f38020g.get(), this.f38021h.get());
    }
}
