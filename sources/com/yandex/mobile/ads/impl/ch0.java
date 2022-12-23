package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ch0 implements h41.C13275a {

    /* renamed from: a */
    private final jp1 f31926a;

    public ch0(jp1 jp1) {
        Intrinsics.checkNotNullParameter(jp1, "requestConfig");
        this.f31926a = jp1;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        return MapsKt.mapOf(TuplesKt.m45515to("ad_type", C12115n.INSTREAM.mo64574a()), TuplesKt.m45515to("page_id", this.f31926a.mo68078c()), TuplesKt.m45515to("category_id", this.f31926a.mo68077b()));
    }
}
