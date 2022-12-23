package com.yandex.mobile.ads.impl;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ma0 {
    /* renamed from: a */
    public Future<na0> mo68632a(String str) {
        FutureTask futureTask = new FutureTask(new oa0(str));
        new Thread(futureTask).start();
        return futureTask;
    }
}
