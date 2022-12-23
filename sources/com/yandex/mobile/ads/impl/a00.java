package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class a00 implements b60<C14036mz> {

    /* renamed from: a */
    private final Provider<C14624so> f30396a;

    /* renamed from: b */
    private final Provider<eg1> f30397b;

    /* renamed from: c */
    private final Provider<eg1> f30398c;

    /* renamed from: d */
    private final Provider<C14213ot> f30399d;

    /* renamed from: e */
    private final Provider<Boolean> f30400e;

    public a00(Provider<C14624so> provider, Provider<eg1> provider2, Provider<eg1> provider3, Provider<C14213ot> provider4, Provider<Boolean> provider5) {
        this.f30396a = provider;
        this.f30397b = provider2;
        this.f30398c = provider3;
        this.f30399d = provider4;
        this.f30400e = provider5;
    }

    public Object get() {
        return new C14036mz(this.f30396a.get(), this.f30397b.get(), this.f30398c.get(), this.f30399d.get(), this.f30400e.get().booleanValue());
    }
}
