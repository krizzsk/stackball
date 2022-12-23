package com.yandex.mobile.ads.mediation.base;

public interface MediatedBidderTokenLoadListener {
    void onBidderTokenFailedToLoad(String str);

    void onBidderTokenLoaded(String str);
}
