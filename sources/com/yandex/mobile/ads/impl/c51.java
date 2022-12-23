package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13045fd;

public class c51<T> {

    /* renamed from: a */
    public final T f31810a;

    /* renamed from: b */
    public final C13045fd.C13046a f31811b;

    /* renamed from: c */
    public final op1 f31812c;

    /* renamed from: d */
    public boolean f31813d;

    /* renamed from: com.yandex.mobile.ads.impl.c51$a */
    public interface C12699a {
        /* renamed from: a */
        void mo64579a(op1 op1);
    }

    /* renamed from: com.yandex.mobile.ads.impl.c51$b */
    public interface C12700b<T> {
        /* renamed from: a */
        void mo64360a(T t);
    }

    private c51(T t, C13045fd.C13046a aVar) {
        this.f31813d = false;
        this.f31810a = t;
        this.f31811b = aVar;
        this.f31812c = null;
    }

    /* renamed from: a */
    public static <T> c51<T> m34589a(T t, C13045fd.C13046a aVar) {
        return new c51<>(t, aVar);
    }

    /* renamed from: a */
    public static <T> c51<T> m34588a(op1 op1) {
        return new c51<>(op1);
    }

    private c51(op1 op1) {
        this.f31813d = false;
        this.f31810a = null;
        this.f31811b = null;
        this.f31812c = op1;
    }
}
