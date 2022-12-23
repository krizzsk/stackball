package com.yandex.mobile.ads.impl;

public class ms0 {

    /* renamed from: a */
    private static final Object f37509a = new Object();

    /* renamed from: b */
    private static volatile ms0 f37510b;

    private ms0() {
    }

    /* renamed from: a */
    public static ms0 m39724a() {
        if (f37510b == null) {
            synchronized (f37509a) {
                if (f37510b == null) {
                    f37510b = new ms0();
                }
            }
        }
        return f37510b;
    }
}
