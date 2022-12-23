package com.yandex.mobile.ads.impl;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.cv */
public final class C12779cv implements b60<zn1> {

    /* renamed from: a */
    private final Provider<C13323hi> f32084a;

    public C12779cv(Provider<C13323hi> provider) {
        this.f32084a = provider;
    }

    public Object get() {
        C13323hi hiVar = this.f32084a.get();
        Intrinsics.checkNotNullParameter(hiVar, "cpuUsageHistogramReporter");
        return new zn1(hiVar);
    }
}
