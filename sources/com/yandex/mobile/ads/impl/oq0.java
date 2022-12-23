package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;

public class oq0 implements ThreadFactory {

    /* renamed from: a */
    private final String f38302a;

    public oq0(String str) {
        this.f38302a = str;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f38302a);
    }
}
