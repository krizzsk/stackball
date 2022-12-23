package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;

final class x80 implements vj0 {

    /* renamed from: a */
    private final Object f42471a = new Object();

    /* renamed from: b */
    private final ak0 f42472b;

    x80(Context context, String str) {
        this.f42472b = new ak0(context, str);
    }

    /* renamed from: a */
    public Location mo69369a() {
        Location location;
        synchronized (this.f42471a) {
            zj0 b = this.f42472b.mo65794b();
            if (b == null || !b.mo71249b()) {
                location = null;
            } else {
                location = b.mo71248a();
                this.f42472b.mo65795c();
            }
        }
        return location;
    }
}
