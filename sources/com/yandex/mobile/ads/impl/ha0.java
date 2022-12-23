package com.yandex.mobile.ads.impl;

import android.content.Context;

public final class ha0 {

    /* renamed from: a */
    private static final Object f34338a = new Object();

    /* renamed from: b */
    private static volatile x80 f34339b;

    /* renamed from: a */
    public static vj0 m36892a(Context context) {
        if (f34339b == null) {
            synchronized (f34338a) {
                if (f34339b == null) {
                    f34339b = new x80(context, "com.huawei.hms.location.LocationServices");
                }
            }
        }
        return f34339b;
    }
}
