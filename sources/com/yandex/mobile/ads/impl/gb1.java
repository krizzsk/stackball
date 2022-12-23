package com.yandex.mobile.ads.impl;

import android.view.View;

public class gb1<T extends View> implements Runnable {

    /* renamed from: b */
    private final C15236y7<T> f33927b;

    /* renamed from: c */
    private final T f33928c;

    gb1(T t, C15236y7<T> y7Var) {
        this.f33928c = t;
        this.f33927b = y7Var;
    }

    public void run() {
        this.f33927b.mo66393a(this.f33928c);
    }
}
