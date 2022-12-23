package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

public class nr1 implements C13274h4 {

    /* renamed from: a */
    private final AdResponse f37902a;

    public nr1(AdResponse adResponse) {
        this.f37902a = adResponse;
    }

    /* renamed from: a */
    public Map<String, Object> mo67398a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("ad_source", this.f37902a.mo64431k());
        i41.mo67733b("ad_type_format", this.f37902a.mo64433m());
        i41.mo67733b("block_id", this.f37902a.mo64434n());
        i41.mo67733b("ad_unit_id", this.f37902a.mo64434n());
        i41.mo67733b("product_type", this.f37902a.mo64446y());
        i41.mo67731a("server_log_id", this.f37902a.mo64412C());
        return i41.mo67729a();
    }
}
