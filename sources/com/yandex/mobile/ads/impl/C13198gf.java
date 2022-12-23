package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.gf */
public class C13198gf implements k41 {

    /* renamed from: a */
    private final C15232y3 f33977a = new C15232y3();

    /* renamed from: b */
    private final sn0 f33978b;

    /* renamed from: c */
    private final AdResponse f33979c;

    /* renamed from: d */
    private final C14645t1 f33980d;

    /* renamed from: e */
    private final h41.C13275a f33981e;

    public C13198gf(Context context, AdResponse adResponse, C14645t1 t1Var, h41.C13275a aVar) {
        this.f33979c = adResponse;
        this.f33980d = t1Var;
        this.f33981e = aVar;
        this.f33978b = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo67276a(h41.C13276b bVar) {
        this.f33978b.mo70035a(m36576a(bVar, new HashMap()));
    }

    /* renamed from: b */
    public void mo67277b(h41.C13276b bVar, Map<String, Object> map) {
        this.f33978b.mo70035a(m36576a(bVar, map));
    }

    /* renamed from: a */
    private h41 m36576a(h41.C13276b bVar, Map<String, Object> map) {
        i41 i41 = new i41(map);
        C12115n l = this.f33979c.mo64432l();
        if (l != null) {
            i41.mo67733b("ad_type", l.mo64574a());
        } else {
            i41.mo67730a("ad_type");
        }
        i41.mo67733b("block_id", this.f33979c.mo64434n());
        i41.mo67733b("ad_unit_id", this.f33979c.mo64434n());
        i41.mo67733b("adapter", "Yandex");
        i41.mo67733b("ad_type_format", this.f33979c.mo64433m());
        i41.mo67733b("product_type", this.f33979c.mo64446y());
        i41.mo67733b("ad_source", this.f33979c.mo64431k());
        C14645t1 t1Var = this.f33980d;
        if (t1Var != null) {
            map.putAll(this.f33977a.mo70991a(t1Var.mo70080a()));
        }
        h41.C13275a aVar = this.f33981e;
        if (aVar != null) {
            map.putAll(aVar.mo66063a());
        }
        return new h41(bVar, i41.mo67729a());
    }
}
