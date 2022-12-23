package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.ej */
public class C12980ej {

    /* renamed from: a */
    private final Context f32986a;

    public C12980ej(Context context) {
        this.f32986a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean mo66833a() {
        return (this.f32986a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
