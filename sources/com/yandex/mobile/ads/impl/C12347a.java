package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.a */
class C12347a {

    /* renamed from: a */
    private final yg1 f30395a = new yg1();

    C12347a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo65629a(String str) {
        List<String> list;
        this.f30395a.getClass();
        String str2 = null;
        try {
            list = Uri.parse(str).getPathSegments();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            str2 = list.get(0);
        }
        return "appcry".equals(str2);
    }
}
