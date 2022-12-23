package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.it1;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ot1 implements it1.C13447a {

    /* renamed from: a */
    private final ThreadPoolExecutor f38315a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    private final ArrayDeque<it1> f38316b = new ArrayDeque<>();

    /* renamed from: c */
    private it1 f38317c = null;

    /* renamed from: a */
    public void mo69267a(it1 it1) {
        this.f38317c = null;
        it1 poll = this.f38316b.poll();
        this.f38317c = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f38315a, new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo69268b(it1 it1) {
        it1.mo67893a((it1.C13447a) this);
        this.f38316b.add(it1);
        if (this.f38317c == null) {
            it1 poll = this.f38316b.poll();
            this.f38317c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f38315a, new Object[0]);
            }
        }
    }
}
