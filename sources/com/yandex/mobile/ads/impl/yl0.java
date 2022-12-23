package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class yl0<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final ar0 f42888a = new ar0();

    /* renamed from: b */
    private final hl0 f42889b;

    public yl0(NativeAdAssets nativeAdAssets) {
        this.f42889b = new hl0(nativeAdAssets);
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        ExtendedViewContainer a = this.f42888a.mo65848a(v);
        Float a2 = this.f42889b.mo67565a();
        if (a != null && a2 != null) {
            a.setMeasureSpecProvider(new C15171xg(new u11(Math.min(Math.max(a2.floatValue(), 1.0f), 1.7777778f)), new al0(v, 0.5f)));
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
