package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.hc */
public class C13309hc {

    /* renamed from: a */
    private final C15036w9 f34361a;

    /* renamed from: b */
    private final sn0 f34362b;

    public C13309hc(Context context, C14646t2 t2Var, C12115n nVar, String str) {
        this.f34361a = new C15036w9(t2Var, nVar, str);
        this.f34362b = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo67509a(h41.C13275a aVar) {
        this.f34361a.mo70665a(aVar);
    }

    /* renamed from: a */
    public void mo67510a(String str) {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("asset_name", str);
        i41 i412 = new i41(this.f34361a.mo70664a());
        i412.mo67733b(IronSourceConstants.EVENTS_ERROR_REASON, "no_view_for_asset");
        i41.mo67732a(i412.mo67729a());
        this.f34362b.mo70035a(new h41(h41.C13276b.BINDING_FAILURE, i41.mo67729a()));
    }
}
