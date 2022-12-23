package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.p3 */
public class C14252p3 {

    /* renamed from: a */
    private final AdResponse f38503a;

    /* renamed from: b */
    private final C15232y3 f38504b = new C15232y3();

    /* renamed from: c */
    private final sn0 f38505c;

    /* renamed from: d */
    private final C14645t1 f38506d;

    /* renamed from: e */
    private final C15290z2 f38507e;

    /* renamed from: f */
    private h41.C13275a f38508f;

    public C14252p3(Context context, AdResponse adResponse, C14645t1 t1Var, C15230y2 y2Var, h41.C13275a aVar) {
        this.f38503a = adResponse;
        this.f38506d = t1Var;
        this.f38508f = aVar;
        this.f38507e = new C15290z2(y2Var);
        this.f38505c = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo69302a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("block_id", this.f38503a.mo64434n());
        i41.mo67733b("ad_unit_id", this.f38503a.mo64434n());
        i41.mo67733b("adapter", "Yandex");
        i41.mo67733b("product_type", this.f38503a.mo64446y());
        i41.mo67733b("ad_type_format", this.f38503a.mo64433m());
        i41.mo67733b("ad_source", this.f38503a.mo64431k());
        i41.mo67732a(this.f38508f.mo66063a());
        i41.mo67732a(this.f38507e.mo71150b());
        C12115n l = this.f38503a.mo64432l();
        i41.mo67733b("ad_type", l != null ? l.mo64574a() : null);
        i41.mo67732a(this.f38504b.mo70991a(this.f38506d.mo70080a()));
        this.f38505c.mo70035a(new h41(h41.C13276b.AD_RENDERING_RESULT, i41.mo67729a()));
    }
}
