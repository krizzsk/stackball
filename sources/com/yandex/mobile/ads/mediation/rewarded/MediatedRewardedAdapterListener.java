package com.yandex.mobile.ads.mediation.rewarded;

import com.yandex.mobile.ads.common.AdRequestError;

interface MediatedRewardedAdapterListener {
    void onAdImpression();

    void onRewarded(MediatedReward mediatedReward);

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToLoad(AdRequestError adRequestError);

    void onRewardedAdLeftApplication();

    void onRewardedAdLoaded();

    void onRewardedAdShown();
}
