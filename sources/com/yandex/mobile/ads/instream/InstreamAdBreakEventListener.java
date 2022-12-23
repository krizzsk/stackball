package com.yandex.mobile.ads.instream;

public interface InstreamAdBreakEventListener {
    void onInstreamAdBreakCompleted();

    void onInstreamAdBreakError(String str);

    void onInstreamAdBreakPrepared();

    void onInstreamAdBreakStarted();
}
