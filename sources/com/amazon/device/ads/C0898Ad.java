package com.amazon.device.ads;

/* renamed from: com.amazon.device.ads.Ad */
public interface C0898Ad {
    int getTimeout();

    boolean isLoading();

    boolean loadAd();

    boolean loadAd(AdTargetingOptions adTargetingOptions);

    void setListener(AdListener adListener);

    void setTimeout(int i);
}
