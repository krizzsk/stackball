package com.yandex.mobile.ads.impl;

import android.content.Context;

public final class lv0 {

    /* renamed from: a */
    private static final Object f36930a = new Object();

    /* renamed from: b */
    private static volatile u41 f36931b;

    /* renamed from: a */
    public static u41 m39021a(Context context) {
        if (f36931b == null) {
            synchronized (f36930a) {
                if (f36931b == null) {
                    f36931b = v41.m43030a(context, 1);
                    f36931b.mo70285a();
                }
            }
        }
        return f36931b;
    }
}
