package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class t90<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f40269a;

    /* renamed from: b */
    private final tq0 f40270b = new tq0();

    public t90(NativeAdAssets nativeAdAssets) {
        this.f40269a = nativeAdAssets;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        TextView a;
        if (this.f40269a.getWarning() != null && (a = this.f40270b.mo65901a(v)) != null) {
            a.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
