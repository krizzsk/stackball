package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;

class oa0 implements Callable<na0> {

    /* renamed from: a */
    private final String f38131a;

    /* renamed from: b */
    private final qa0 f38132b = new qa0();

    oa0(String str) {
        this.f38131a = str;
    }

    public Object call() throws Exception {
        return new na0(this.f38132b.mo69564a().mo68246a(this.f38131a));
    }
}
