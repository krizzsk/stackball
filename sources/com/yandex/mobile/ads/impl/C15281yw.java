package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.yw */
public final class C15281yw implements b60<C15217xw> {

    /* renamed from: a */
    private final Provider<C14624so> f42973a;

    public C15281yw(Provider<C14624so> provider) {
        this.f42973a = provider;
    }

    public Object get() {
        return new C15217xw(this.f42973a.get());
    }
}
