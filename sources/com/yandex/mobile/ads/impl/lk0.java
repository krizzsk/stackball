package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import java.util.Queue;

public class lk0<T> implements InstreamAdBreakQueue<T> {

    /* renamed from: a */
    private final Queue<T> f36727a;

    public lk0(Queue<T> queue) {
        this.f36727a = queue;
    }

    public int getCount() {
        return this.f36727a.size();
    }

    public T poll() {
        return this.f36727a.poll();
    }
}
