package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class gl0<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final ar0 f34019a = new ar0();

    /* renamed from: b */
    private final hl0 f34020b;

    public gl0(NativeAdAssets nativeAdAssets) {
        this.f34020b = new hl0(nativeAdAssets);
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        ExtendedViewContainer a = this.f34019a.mo65848a(v);
        Float a2 = this.f34020b.mo67565a();
        if (a != null && a2 != null) {
            a.setMeasureSpecProvider(new u11(a2.floatValue()));
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
