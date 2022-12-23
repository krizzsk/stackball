package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.gm */
public final class C13213gm implements b60<eo1> {

    /* renamed from: a */
    private final Provider<z40> f34035a;

    /* renamed from: b */
    private final Provider<fo1> f34036b;

    /* renamed from: c */
    private final Provider<zn1> f34037c;

    public C13213gm(Provider<z40> provider, Provider<fo1> provider2, Provider<zn1> provider3) {
        this.f34035a = provider;
        this.f34036b = provider2;
        this.f34037c = provider3;
    }

    public Object get() {
        return this.f34035a.get().mo71153a(C12416as.f30666a) ? new C14168o6(this.f34036b.get(), this.f34037c.get()) : new b21();
    }
}
