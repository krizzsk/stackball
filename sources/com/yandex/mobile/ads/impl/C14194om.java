package com.yandex.mobile.ads.impl;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.om */
public final class C14194om implements b60<C14855uy> {

    /* renamed from: a */
    private final Provider<z40> f38268a;

    /* renamed from: b */
    private final Provider<C13139fu> f38269b;

    /* renamed from: c */
    private final Provider<C13450iv> f38270c;

    public C14194om(Provider<z40> provider, Provider<C13139fu> provider2, Provider<C13450iv> provider3) {
        this.f38268a = provider;
        this.f38269b = provider2;
        this.f38270c = provider3;
    }

    public Object get() {
        String str;
        Object obj;
        z40 z40 = this.f38268a.get();
        Provider provider = this.f38269b;
        Provider provider2 = this.f38270c;
        Intrinsics.checkNotNullParameter(z40, "experimentConfig");
        Intrinsics.checkNotNullParameter(provider, "joinedStateSwitcher");
        Intrinsics.checkNotNullParameter(provider2, "multipleStateSwitcher");
        if (z40.mo71153a(C12416as.f30668c)) {
            obj = provider2.get();
            str = "multipleStateSwitcher.get()";
        } else {
            obj = provider.get();
            str = "joinedStateSwitcher.get()";
        }
        Intrinsics.checkNotNullExpressionValue(obj, str);
        return (C14855uy) v01.m43011a((C14855uy) obj);
    }
}
