package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.C8937Ad;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.u3 */
public final class C14736u3 implements h41.C13275a {

    /* renamed from: a */
    private final C12115n f40551a;

    /* renamed from: b */
    private final C14645t1 f40552b;

    /* renamed from: c */
    private final C15232y3 f40553c = new C15232y3();

    public C14736u3(C12115n nVar, C14645t1 t1Var) {
        Intrinsics.checkNotNullParameter(nVar, C8937Ad.AD_TYPE);
        Intrinsics.checkNotNullParameter(t1Var, "adConfiguration");
        this.f40551a = nVar;
        this.f40552b = t1Var;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.m45515to("ad_type", this.f40551a.mo64574a()));
        String c = this.f40552b.mo70096c();
        if (c != null) {
            mutableMapOf.put("block_id", c);
            mutableMapOf.put("ad_unit_id", c);
        }
        Map<String, Object> a = this.f40553c.mo70991a(this.f40552b.mo70080a());
        Intrinsics.checkNotNullExpressionValue(a, "adRequestReportDataProvider.getAdRequestReportData(adConfiguration.adRequest)");
        mutableMapOf.putAll(a);
        return mutableMapOf;
    }
}
