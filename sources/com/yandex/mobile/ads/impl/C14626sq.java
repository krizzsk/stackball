package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.sq */
public final class C14626sq implements b60<C14487rq> {

    /* renamed from: a */
    private final Provider<C14624so> f40109a;

    /* renamed from: b */
    private final Provider<C15262yq> f40110b;

    /* renamed from: c */
    private final Provider<C15202xq> f40111c;

    public C14626sq(Provider<C14624so> provider, Provider<C15262yq> provider2, Provider<C15202xq> provider3) {
        this.f40109a = provider;
        this.f40110b = provider2;
        this.f40111c = provider3;
    }

    public Object get() {
        return new C14487rq(this.f40109a.get(), this.f40110b.get(), this.f40111c.get());
    }
}
