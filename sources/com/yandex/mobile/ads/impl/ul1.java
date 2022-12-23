package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class ul1 {

    /* renamed from: d */
    private static final Object f40790d = new Object();

    /* renamed from: e */
    private static volatile ul1 f40791e;

    /* renamed from: a */
    private final List<Executor> f40792a = new ArrayList();

    /* renamed from: b */
    private final oq0 f40793b = new oq0("YandexMobileAds.NativeVideoCacheManager");

    /* renamed from: c */
    private volatile int f40794c = 0;

    private ul1() {
    }

    /* renamed from: a */
    public static ul1 m42746a() {
        if (f40791e == null) {
            synchronized (f40790d) {
                if (f40791e == null) {
                    f40791e = new ul1();
                }
            }
        }
        return f40791e;
    }

    /* renamed from: b */
    public Executor mo70371b() {
        Executor executor;
        synchronized (f40790d) {
            if (this.f40792a.size() < 4) {
                executor = Executors.newSingleThreadExecutor(this.f40793b);
                this.f40792a.add(executor);
            } else {
                executor = this.f40792a.get(this.f40794c);
                this.f40794c++;
                if (this.f40794c == 4) {
                    this.f40794c = 0;
                }
            }
        }
        return executor;
    }
}
