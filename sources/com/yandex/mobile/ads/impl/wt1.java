package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

public class wt1 {
    /* renamed from: a */
    public static void m43866a(ts1 ts1) {
        if (ts1.mo70229j()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public static void m43867a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m43868a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m43869b(ts1 ts1) {
        if (!ts1.mo70226g()) {
            throw new IllegalStateException("AdSession is not started");
        } else if (ts1.mo70229j()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
