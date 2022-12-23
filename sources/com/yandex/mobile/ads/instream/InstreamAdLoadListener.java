package com.yandex.mobile.ads.instream;

public interface InstreamAdLoadListener {
    void onInstreamAdFailedToLoad(String str);

    void onInstreamAdLoaded(InstreamAd instreamAd);
}
