package com.facebook.ads;

public interface AdListener {
    void onAdClicked(C2043Ad ad);

    void onAdLoaded(C2043Ad ad);

    void onError(C2043Ad ad, AdError adError);

    void onLoggingImpression(C2043Ad ad);
}
