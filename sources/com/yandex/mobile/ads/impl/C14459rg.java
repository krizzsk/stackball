package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.rg */
public class C14459rg implements C13058fl {

    /* renamed from: a */
    private final C13058fl[] f39450a;

    public C14459rg(C13058fl... flVarArr) {
        this.f39450a = flVarArr;
    }

    /* renamed from: a */
    public boolean mo67026a(Context context) {
        for (C13058fl a : this.f39450a) {
            if (!a.mo67026a(context)) {
                return false;
            }
        }
        return true;
    }
}
