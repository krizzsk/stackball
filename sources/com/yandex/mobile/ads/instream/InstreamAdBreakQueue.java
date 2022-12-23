package com.yandex.mobile.ads.instream;

public interface InstreamAdBreakQueue<T> {
    int getCount();

    T poll();
}
