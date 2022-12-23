package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;

public interface SliderAdLoadListener {
    void onSliderAdFailedToLoad(AdRequestError adRequestError);

    void onSliderAdLoaded(SliderAd sliderAd);
}
