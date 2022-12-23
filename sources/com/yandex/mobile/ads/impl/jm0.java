package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.MediaView;

public class jm0 {

    /* renamed from: a */
    private final gd0 f35395a = new gd0();

    /* renamed from: a */
    public gm0 mo68063a(MediaView mediaView, ed0 ed0) {
        ImageView imageView = new ImageView(mediaView.getContext());
        this.f35395a.getClass();
        mediaView.removeAllViews();
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new as1(mediaView, new od0(imageView, ed0));
    }
}
