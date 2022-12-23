package com.yandex.mobile.ads.impl;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

public final class i00 implements b60<g00> {

    /* renamed from: a */
    private final Provider<C15257yl> f34719a;

    /* renamed from: b */
    private final Provider<j00> f34720b;

    /* renamed from: c */
    private final Provider<s10> f34721c;

    /* renamed from: d */
    private final Provider<C14416qt> f34722d;

    public i00(Provider<C15257yl> provider, Provider<j00> provider2, Provider<s10> provider3, Provider<C14416qt> provider4) {
        this.f34719a = provider;
        this.f34720b = provider2;
        this.f34721c = provider3;
        this.f34722d = provider4;
    }

    public Object get() {
        Provider<C15257yl> provider = this.f34719a;
        j00 j00 = this.f34720b.get();
        s10 s10 = this.f34721c.get();
        C14416qt qtVar = this.f34722d.get();
        Intrinsics.checkNotNullParameter(provider, "div2Builder");
        Intrinsics.checkNotNullParameter(j00, "tooltipRestrictor");
        Intrinsics.checkNotNullParameter(s10, "divVisibilityActionTracker");
        Intrinsics.checkNotNullParameter(qtVar, "divImagePreloader");
        return new g00(provider, j00, s10, qtVar, e00.f32870b);
    }
}
