package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;

public class yq0 {

    /* renamed from: a */
    private final Context f42905a;

    /* renamed from: b */
    private final C14645t1 f42906b;

    /* renamed from: c */
    private final AdResponse f42907c;

    /* renamed from: d */
    private h41.C13275a f42908d;

    public yq0(Context context, C14645t1 t1Var, AdResponse adResponse) {
        this.f42905a = context.getApplicationContext();
        this.f42906b = t1Var;
        this.f42907c = adResponse;
    }

    /* renamed from: a */
    public void mo71107a(h41.C13275a aVar) {
        this.f42908d = aVar;
    }

    /* renamed from: a */
    public C13198gf mo71106a(String str, String str2) {
        return new C13198gf(this.f42905a, this.f42907c, this.f42906b, new zq0(str, str2, this.f42908d));
    }
}
