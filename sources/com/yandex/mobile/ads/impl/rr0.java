package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C14662tb;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;

public class rr0 {

    /* renamed from: a */
    private final Context f39546a;

    /* renamed from: b */
    private final t21 f39547b = new t21();

    /* renamed from: c */
    private final C14662tb.C14663a<AdResponse<as0>> f39548c;

    public rr0(Context context, C14662tb.C14663a<AdResponse<as0>> aVar) {
        this.f39546a = context;
        this.f39548c = aVar;
        u21.m42589a();
    }

    /* renamed from: a */
    public qr0 mo69807a(t41<as0> t41, C14645t1 t1Var, NativeAdRequestConfiguration nativeAdRequestConfiguration, String str, String str2) {
        this.f39547b.getClass();
        nativeAdRequestConfiguration.getClass();
        return new qr0(this.f39546a, t41, t1Var, str, str2, this.f39548c);
    }
}
