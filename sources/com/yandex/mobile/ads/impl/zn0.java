package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class zn0<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f43237a;

    /* renamed from: b */
    private final qq0 f43238b = new qq0();

    /* renamed from: c */
    private final int f43239c;

    public zn0(NativeAdAssets nativeAdAssets, int i) {
        this.f43237a = nativeAdAssets;
        this.f43239c = i;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        if (this.f43237a.getImage() == null && this.f43237a.getMedia() == null) {
            this.f43238b.getClass();
            View findViewById = v.findViewById(C12066R.C12068id.close_appearance);
            if (findViewById != null) {
                findViewById.setBackground(findViewById.getContext().getResources().getDrawable(this.f43239c));
            }
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
