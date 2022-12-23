package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C13045fd;
import com.yandex.mobile.ads.impl.C14662tb;
import java.util.List;

public class si1 extends ne1<lj1, List<lj1>> {

    /* renamed from: v */
    private final fi1 f40007v;

    public si1(Context context, String str, C14662tb.C14663a<List<lj1>> aVar, lj1 lj1, w41<lj1, List<lj1>> w41) {
        super(context, 0, str, aVar, lj1, w41);
        this.f40007v = new fi1(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<List<lj1>> mo67765a(fv0 fv0, int i) {
        ci1 a = this.f40007v.mo67021a(fv0);
        if (a == null) {
            return c51.m34588a(new hy0("Can't parse VAST response."));
        }
        List<lj1> b = a.mo66309b().mo70898b();
        if (b.isEmpty()) {
            return c51.m34588a(new e30());
        }
        return c51.m34589a(b, (C13045fd.C13046a) null);
    }
}
