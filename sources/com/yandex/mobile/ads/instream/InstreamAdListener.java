package com.yandex.mobile.ads.instream;

public interface InstreamAdListener {
    void onError(String str);

    void onInstreamAdCompleted();

    void onInstreamAdPrepared();
}
