package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;

public class hl0 {

    /* renamed from: a */
    private final NativeAdAssets f34455a;

    public hl0(NativeAdAssets nativeAdAssets) {
        this.f34455a = nativeAdAssets;
    }

    /* renamed from: a */
    public Float mo67565a() {
        NativeAdMedia media = this.f34455a.getMedia();
        NativeAdImage image = this.f34455a.getImage();
        if (media != null) {
            return Float.valueOf(media.getAspectRatio());
        }
        if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
            return null;
        }
        return Float.valueOf(((float) image.getWidth()) / ((float) image.getHeight()));
    }
}
