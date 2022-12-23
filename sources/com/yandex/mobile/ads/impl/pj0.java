package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class pj0 {

    /* renamed from: d */
    private static final Object f38630d = new Object();

    /* renamed from: e */
    private static volatile pj0 f38631e;

    /* renamed from: a */
    private final List<Executor> f38632a = new ArrayList();

    /* renamed from: b */
    private final oq0 f38633b = new oq0("YandexMobileAds.BaseController");

    /* renamed from: c */
    private int f38634c = 0;

    private pj0() {
    }

    /* renamed from: a */
    public static pj0 m40784a() {
        if (f38631e == null) {
            synchronized (f38630d) {
                if (f38631e == null) {
                    f38631e = new pj0();
                }
            }
        }
        return f38631e;
    }

    /* renamed from: b */
    public Executor mo69371b() {
        Executor executor;
        synchronized (f38630d) {
            if (this.f38632a.size() < 4) {
                executor = Executors.newSingleThreadExecutor(this.f38633b);
                this.f38632a.add(executor);
            } else {
                executor = this.f38632a.get(this.f38634c);
                int i = this.f38634c + 1;
                this.f38634c = i;
                if (i == 4) {
                    this.f38634c = 0;
                }
            }
        }
        return executor;
    }
}
