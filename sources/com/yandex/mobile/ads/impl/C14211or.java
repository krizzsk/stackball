package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.or */
public final class C14211or implements b60<C14128nr> {

    /* renamed from: a */
    private final Provider<List<? extends C14307pr>> f38307a;

    public C14211or(Provider<List<? extends C14307pr>> provider) {
        this.f38307a = provider;
    }

    public Object get() {
        return new C14128nr(this.f38307a.get());
    }
}
