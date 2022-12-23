package com.yandex.mobile.ads.nativeads;

import java.util.List;

public interface SliderAd {
    void bindSliderAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    List<NativeAd> getNativeAds();
}
