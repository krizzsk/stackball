package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.List;

public class x40 {

    /* renamed from: a */
    private final C15036w9 f42407a;

    /* renamed from: b */
    private final sn0 f42408b;

    public x40(Context context, C14646t2 t2Var, C12115n nVar, String str) {
        this.f42407a = new C15036w9(t2Var, nVar, str);
        this.f42408b = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo70828a(h41.C13275a aVar) {
        this.f42407a.mo70665a(aVar);
    }

    /* renamed from: a */
    public void mo70829a(List<String> list) {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("assets", list);
        i41 i412 = new i41(this.f42407a.mo70664a());
        i412.mo67733b(IronSourceConstants.EVENTS_ERROR_REASON, "no_view_for_asset");
        i41.mo67732a(i412.mo67729a());
        this.f42408b.mo70035a(new h41(h41.C13276b.EXPECTED_VIEW_MISSING, i41.mo67729a()));
    }
}
