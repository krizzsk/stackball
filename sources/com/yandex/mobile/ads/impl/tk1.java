package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

public class tk1 implements h41.C13275a {

    /* renamed from: a */
    private final C14645t1 f40348a;

    /* renamed from: b */
    private final AdResponse<?> f40349b;

    /* renamed from: c */
    private final C15232y3 f40350c = new C15232y3();

    public tk1(C14645t1 t1Var, AdResponse<?> adResponse) {
        this.f40348a = t1Var;
        this.f40349b = adResponse;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("adapter", "Yandex");
        i41.mo67733b("block_id", this.f40349b.mo64434n());
        i41.mo67733b("ad_unit_id", this.f40349b.mo64434n());
        i41.mo67733b("ad_type_format", this.f40349b.mo64433m());
        i41.mo67733b("product_type", this.f40349b.mo64446y());
        i41.mo67733b("ad_source", this.f40349b.mo64431k());
        C12115n l = this.f40349b.mo64432l();
        if (l != null) {
            i41.mo67733b("ad_type", l.mo64574a());
        } else {
            i41.mo67730a("ad_type");
        }
        i41.mo67732a(this.f40350c.mo70991a(this.f40348a.mo70080a()));
        return i41.mo67729a();
    }
}
