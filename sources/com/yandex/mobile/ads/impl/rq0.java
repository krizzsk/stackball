package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class rq0 {

    /* renamed from: a */
    private final sn0 f39536a;

    /* renamed from: b */
    private final C15036w9 f39537b;

    public rq0(Context context, C14646t2 t2Var, C12115n nVar, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(t2Var, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(nVar, C8937Ad.AD_TYPE);
        sn0 b = sn0.m42091b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance(context)");
        this.f39536a = b;
        this.f39537b = new C15036w9(t2Var, nVar, str);
    }

    /* renamed from: a */
    public final void mo69804a(h41.C13275a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "reportParameterManager");
        this.f39537b.mo70665a(aVar);
    }

    /* renamed from: a */
    public final void mo69805a(List<String> list, h41.C13276b bVar) {
        Intrinsics.checkNotNullParameter(list, "assetNames");
        Intrinsics.checkNotNullParameter(bVar, "reportType");
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("assets", list);
        Map<String, Object> a = this.f39537b.mo70664a();
        Intrinsics.checkNotNullExpressionValue(a, "reportParametersProvider.commonReportParameters");
        i41.mo67732a(a);
        this.f39536a.mo70035a(new h41(bVar, i41.mo67729a()));
    }
}
