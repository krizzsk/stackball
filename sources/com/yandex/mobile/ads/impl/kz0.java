package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

public class kz0<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f36480a;

    /* renamed from: b */
    private final qq0 f36481b = new qq0();

    /* renamed from: c */
    private final tq0 f36482c = new tq0();

    public kz0(NativeAdAssets nativeAdAssets) {
        this.f36480a = nativeAdAssets;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        this.f36481b.getClass();
        ImageView imageView = (ImageView) v.findViewById(C12066R.C12068id.icon_placeholder);
        NativeAdImage icon = this.f36480a.getIcon();
        NativeAdImage favicon = this.f36480a.getFavicon();
        if (imageView != null && icon == null && favicon == null) {
            go1 go1 = new go1(this.f36482c.mo65907g(v));
            imageView.setVisibility(0);
            imageView.setOnClickListener(go1);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
