package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class sl0<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f40030a;

    /* renamed from: b */
    private final ar0 f40031b = new ar0();

    public sl0(NativeAdAssets nativeAdAssets) {
        this.f40030a = nativeAdAssets;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        ExtendedViewContainer a = this.f40031b.mo65848a(v);
        if (a != null && this.f40030a.getImage() == null && this.f40030a.getMedia() == null) {
            a.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
