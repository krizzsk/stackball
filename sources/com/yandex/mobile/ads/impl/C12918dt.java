package com.yandex.mobile.ads.impl;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.dt */
public final class C12918dt implements b60<ea0> {

    /* renamed from: a */
    private final Provider<aa0> f32760a;

    /* renamed from: b */
    private final Provider<da0> f32761b;

    /* renamed from: c */
    private final Provider<y90> f32762c;

    public C12918dt(Provider<aa0> provider, Provider<da0> provider2, Provider<y90> provider3) {
        this.f32760a = provider;
        this.f32761b = provider2;
        this.f32762c = provider3;
    }

    public Object get() {
        aa0 aa0 = this.f32760a.get();
        Provider<da0> provider = this.f32761b;
        Provider<y90> provider2 = this.f32762c;
        Intrinsics.checkNotNullParameter(aa0, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(provider, "histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(provider2, "histogramColdTypeChecker");
        return C12774ct.m34851a(aa0, provider, provider2);
    }
}
