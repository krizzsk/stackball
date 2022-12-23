package com.chartboost.sdk;

import com.chartboost.sdk.Model.CBError;

/* renamed from: com.chartboost.sdk.a */
public interface C1880a {
    void didCacheInPlay(String str);

    void didCacheInterstitial(String str);

    void didCacheRewardedVideo(String str);

    void didClickInterstitial(String str);

    void didClickRewardedVideo(String str);

    void didCloseInterstitial(String str);

    void didCloseRewardedVideo(String str);

    void didCompleteInterstitial(String str);

    void didCompleteRewardedVideo(String str, int i);

    void didDismissInterstitial(String str);

    void didDismissRewardedVideo(String str);

    void didDisplayInterstitial(String str);

    void didDisplayRewardedVideo(String str);

    void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError);

    void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError);

    void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError);

    void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError);

    void didFailToRecordClick(String str, CBError.CBClickError cBClickError);

    void didInitialize();

    boolean shouldDisplayInterstitial(String str);

    boolean shouldDisplayRewardedVideo(String str);

    boolean shouldRequestInterstitial(String str);

    void willDisplayInterstitial(String str);

    void willDisplayVideo(String str);
}
