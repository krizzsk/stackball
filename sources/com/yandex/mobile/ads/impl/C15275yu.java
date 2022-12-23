package com.yandex.mobile.ads.impl;

import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.yu */
public final class C15275yu implements b60<C15276yv> {

    /* renamed from: a */
    private final Provider<aa0> f42959a;

    /* renamed from: b */
    private final Provider<da0> f42960b;

    /* renamed from: c */
    private final Provider<y90> f42961c;

    /* renamed from: d */
    private final Provider<ExecutorService> f42962d;

    public C15275yu(Provider<aa0> provider, Provider<da0> provider2, Provider<y90> provider3, Provider<ExecutorService> provider4) {
        this.f42959a = provider;
        this.f42960b = provider2;
        this.f42961c = provider3;
        this.f42962d = provider4;
    }

    public Object get() {
        Provider<da0> provider = this.f42960b;
        Provider<y90> provider2 = this.f42961c;
        Provider<ExecutorService> provider3 = this.f42962d;
        return (C15276yv) v01.m43011a(C15212xu.f42697a.mo70943a(this.f42959a.get(), provider, provider2, provider3));
    }
}
