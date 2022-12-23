package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class kt0 implements h41.C13275a {

    /* renamed from: a */
    private final h41.C13275a f36414a;

    /* renamed from: b */
    private final AdResponse<?> f36415b;

    /* renamed from: c */
    private C12366aa f36416c;

    public kt0(h41.C13275a aVar, AdResponse<?> adResponse, C12366aa aaVar) {
        Intrinsics.checkNotNullParameter(aVar, "reportManager");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(aaVar, "assetsRenderedReportParameterProvider");
        this.f36414a = aVar;
        this.f36415b = adResponse;
        this.f36416c = aaVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        Map<String, Object> a = this.f36414a.mo66063a();
        Intrinsics.checkNotNullExpressionValue(a, "reportManager.reportParameters");
        String t = this.f36415b.mo64440t();
        if (t == null) {
            t = "undefined";
        }
        a.put("design", t);
        a.put("assets", MapsKt.hashMapOf(TuplesKt.m45515to(TJAdUnitConstants.String.VIDEO_RENDERED, this.f36416c.mo65698a())));
        return a;
    }
}
