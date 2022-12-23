package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fo1;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.hm */
public final class C13331hm implements b60<fo1> {

    /* renamed from: a */
    private final Provider<z40> f34458a;

    /* renamed from: b */
    private final Provider<fo1.C13084b> f34459b;

    public C13331hm(Provider<z40> provider, Provider<fo1.C13084b> provider2) {
        this.f34458a = provider;
        this.f34459b = provider2;
    }

    public Object get() {
        fo1.C13084b bVar = this.f34459b.get();
        if (this.f34458a.get().mo71153a(C12416as.f30667b)) {
            return new fo1(bVar);
        }
        return null;
    }
}
