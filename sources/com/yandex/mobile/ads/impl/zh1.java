package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C13045fd;
import com.yandex.mobile.ads.impl.C14662tb;

public class zh1 extends ne1<ki1, ci1> {

    /* renamed from: v */
    private final fi1 f43129v;

    public zh1(Context context, String str, C14662tb.C14663a<ci1> aVar, ki1 ki1, w41<ki1, ci1> w41) {
        super(context, 0, str, aVar, ki1, w41);
        this.f43129v = new fi1(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<ci1> mo67765a(fv0 fv0, int i) {
        ci1 a = this.f43129v.mo67021a(fv0);
        if (a == null) {
            return c51.m34588a(new hy0("Can't parse VAST response."));
        }
        if (!a.mo66309b().mo70898b().isEmpty()) {
            return c51.m34589a(a, (C13045fd.C13046a) null);
        }
        return c51.m34588a(new e30());
    }
}
