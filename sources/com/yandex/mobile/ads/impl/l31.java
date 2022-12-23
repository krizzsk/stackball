package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class l31 implements b60<k31> {

    /* renamed from: a */
    private final Provider<C13513jm> f36508a;

    /* renamed from: b */
    private final Provider<C15202xq> f36509b;

    /* renamed from: c */
    private final Provider<C14128nr> f36510c;

    public l31(Provider<C13513jm> provider, Provider<C15202xq> provider2, Provider<C14128nr> provider3) {
        this.f36508a = provider;
        this.f36509b = provider2;
        this.f36510c = provider3;
    }

    public Object get() {
        return new k31(this.f36508a.get(), this.f36509b.get(), this.f36510c.get());
    }
}
