package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ii1 implements gz0 {

    /* renamed from: a */
    private final String f34889a;

    /* renamed from: b */
    private final wj1 f34890b;

    public ii1(String str, wj1 wj1) {
        Intrinsics.checkNotNullParameter(str, "responseStatus");
        this.f34889a = str;
        this.f34890b = wj1;
    }

    /* renamed from: a */
    public Map<String, Object> mo67135a(long j) {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.m45515to("duration", Long.valueOf(j)), TuplesKt.m45515to("status", this.f34889a));
        wj1 wj1 = this.f34890b;
        if (wj1 != null) {
            String b = wj1.mo70710b();
            Intrinsics.checkNotNullExpressionValue(b, "videoAdError.description");
            mutableMapOf.put("failure_reason", b);
        }
        return mutableMapOf;
    }
}
