package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class ao0<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f30612a;

    /* renamed from: b */
    private final tq0 f30613b = new tq0();

    /* renamed from: c */
    private final int f30614c;

    public ao0(NativeAdAssets nativeAdAssets, int i) {
        this.f30612a = nativeAdAssets;
        this.f30614c = i;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        if (this.f30612a.getImage() == null && this.f30612a.getMedia() == null) {
            this.f30613b.getClass();
            ImageView imageView = (ImageView) v.findViewById(C12066R.C12068id.feedback);
            if (imageView != null) {
                imageView.setBackground(imageView.getContext().getResources().getDrawable(this.f30614c));
            }
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
