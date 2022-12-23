package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.rf */
public class C14458rf {
    /* renamed from: a */
    public C14381qf mo69759a(View view, AdResponse adResponse, boolean z) {
        Long r = adResponse.mo64438r();
        if (z && r == null) {
            return new xo0(view, new bh1());
        }
        return new C12591bk(view, new yo1(), r != null ? r.longValue() : 0);
    }
}
