package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.fw */
public final class C13141fw implements b60<C13012ew> {

    /* renamed from: a */
    private final Provider<C12660bw> f33760a;

    /* renamed from: b */
    private final Provider<C15257yl> f33761b;

    public C13141fw(Provider<C12660bw> provider, Provider<C15257yl> provider2) {
        this.f33760a = provider;
        this.f33761b = provider2;
    }

    public Object get() {
        return new C13012ew(this.f33760a.get(), this.f33761b);
    }
}
