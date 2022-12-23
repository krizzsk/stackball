package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.zt */
public final class C15355zt implements b60<C15210xt> {

    /* renamed from: a */
    private final Provider<C14624so> f43332a;

    public C15355zt(Provider<C14624so> provider) {
        this.f43332a = provider;
    }

    public Object get() {
        return new C15210xt(this.f43332a.get());
    }
}
