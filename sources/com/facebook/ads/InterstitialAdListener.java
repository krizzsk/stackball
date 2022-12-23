package com.facebook.ads;

public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(C2043Ad ad);

    void onInterstitialDisplayed(C2043Ad ad);
}
