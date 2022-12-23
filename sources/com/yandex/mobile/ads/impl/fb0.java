package com.yandex.mobile.ads.impl;

public class fb0 {

    /* renamed from: a */
    private static final Object f33290a = new Object();

    /* renamed from: b */
    private static volatile fb0 f33291b;

    private fb0() {
    }

    /* renamed from: a */
    public static fb0 m35946a() {
        if (f33291b == null) {
            synchronized (f33290a) {
                if (f33291b == null) {
                    f33291b = new fb0();
                }
            }
        }
        return f33291b;
    }

    /* renamed from: a */
    public eb0 mo66950a(boolean z) {
        if (z) {
            return new dp0();
        }
        return new C14448rb();
    }
}
