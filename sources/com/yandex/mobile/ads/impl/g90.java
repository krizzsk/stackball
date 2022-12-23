package com.yandex.mobile.ads.impl;

import android.content.Context;

public final class g90 {

    /* renamed from: a */
    private static final Object f33908a = new Object();

    /* renamed from: b */
    private static volatile x80 f33909b;

    /* renamed from: a */
    public static vj0 m36507a(Context context) {
        if (f33909b == null) {
            synchronized (f33908a) {
                if (f33909b == null) {
                    f33909b = new x80(context, "com.google.android.gms.location.LocationServices");
                }
            }
        }
        return f33909b;
    }
}
