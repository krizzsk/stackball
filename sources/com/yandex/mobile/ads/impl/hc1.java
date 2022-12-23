package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class hc1 implements C13493jf {
    protected hc1() {
    }

    /* renamed from: a */
    public long mo67513a() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public long mo67515b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public l90 mo67514a(Looper looper, Handler.Callback callback) {
        return new jc1(new Handler(looper, callback));
    }
}
