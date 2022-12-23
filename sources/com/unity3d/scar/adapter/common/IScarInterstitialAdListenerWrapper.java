package com.unity3d.scar.adapter.common;

public interface IScarInterstitialAdListenerWrapper {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i, String str);

    void onAdFailedToShow(int i, String str);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdLoaded();

    void onAdOpened();
}
