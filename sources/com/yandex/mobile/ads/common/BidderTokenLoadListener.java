package com.yandex.mobile.ads.common;

public interface BidderTokenLoadListener {
    void onBidderTokenFailedToLoad(String str);

    void onBidderTokenLoaded(String str);
}
