package com.tapjoy.internal;

import android.text.TextUtils;

/* renamed from: com.tapjoy.internal.do */
public final class C9166do {
    /* renamed from: a */
    public static void m24543a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m24544a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m24542a(C9145cz czVar) {
        if (czVar.f22482e) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: b */
    public static void m24545b(C9145cz czVar) {
        if (czVar.f22481d) {
            m24542a(czVar);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }
}
