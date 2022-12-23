package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;

interface MediatedNativeAd {
    void bindNativeAd(NativeAdViewBinder nativeAdViewBinder);

    void destroy();

    MediatedNativeAdAssets getMediatedNativeAdAssets();

    void unbindNativeAd(NativeAdViewBinder nativeAdViewBinder);
}
