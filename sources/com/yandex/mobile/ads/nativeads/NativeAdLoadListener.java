package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;

public interface NativeAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(NativeAd nativeAd);
}
