package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;

public class q31 {

    /* renamed from: a */
    private final AdResponse f38978a;

    /* renamed from: b */
    private final sn0 f38979b;

    /* renamed from: c */
    private final C14645t1 f38980c;

    /* renamed from: d */
    private final C15232y3 f38981d = new C15232y3();

    /* renamed from: e */
    private h41.C13275a f38982e;

    public q31(Context context, C14645t1 t1Var, AdResponse adResponse) {
        this.f38978a = adResponse;
        this.f38980c = t1Var;
        this.f38979b = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo69476a(h41.C13275a aVar) {
        this.f38982e = aVar;
    }

    /* renamed from: a */
    public void mo69475a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("adapter", "Yandex");
        i41.mo67733b("block_id", this.f38978a.mo64434n());
        i41.mo67733b("ad_unit_id", this.f38978a.mo64434n());
        i41.mo67733b("ad_type_format", this.f38978a.mo64433m());
        i41.mo67733b("product_type", this.f38978a.mo64446y());
        i41.mo67733b("ad_source", this.f38978a.mo64431k());
        C12115n l = this.f38978a.mo64432l();
        i41.mo67733b("ad_type", l != null ? l.mo64574a() : null);
        h41.C13275a aVar = this.f38982e;
        if (aVar != null) {
            i41.mo67732a(aVar.mo66063a());
        }
        i41.mo67732a(this.f38981d.mo70991a(this.f38980c.mo70080a()));
        this.f38979b.mo70035a(new h41(h41.C13276b.RENDERING_START, i41.mo67729a()));
    }
}
