package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class we0 implements h41.C13275a {

    /* renamed from: a */
    private final C15028w3 f41973a;

    public we0(og0 og0) {
        Intrinsics.checkNotNullParameter(og0, "instreamVideoAdBreak");
        this.f41973a = new C15028w3(og0.mo69155a());
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        i41 i41 = new i41(MapsKt.mutableMapOf(TuplesKt.m45515to("ad_type", C12115n.INSTREAM.mo64574a())));
        i41.mo67733b("page_id", this.f41973a.mo70630d());
        i41.mo67733b("category_id", this.f41973a.mo70628b());
        i41.mo67733b("imp_id", this.f41973a.mo70629c());
        Map<String, Object> a = i41.mo67729a();
        Intrinsics.checkNotNullExpressionValue(a, "reportDataWrapper.reportData");
        return a;
    }
}
