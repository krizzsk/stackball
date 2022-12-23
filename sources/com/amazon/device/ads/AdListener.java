package com.amazon.device.ads;

public interface AdListener {
    void onAdCollapsed(C0898Ad ad);

    void onAdDismissed(C0898Ad ad);

    void onAdExpanded(C0898Ad ad);

    void onAdFailedToLoad(C0898Ad ad, AdError adError);

    void onAdLoaded(C0898Ad ad, AdProperties adProperties);
}
