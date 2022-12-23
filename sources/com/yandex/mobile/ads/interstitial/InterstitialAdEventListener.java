package com.yandex.mobile.ads.interstitial;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;

public interface InterstitialAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded();

    void onAdShown();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
