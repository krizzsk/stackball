package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;

class xs0 {

    /* renamed from: a */
    private final es0 f42688a;

    xs0(Context context) {
        this.f42688a = new es0(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public as0 mo70938a(AdResponse<String> adResponse) {
        String z = adResponse.mo64447z();
        if (!TextUtils.isEmpty(z)) {
            return this.f42688a.mo66869a(z);
        }
        return null;
    }
}
