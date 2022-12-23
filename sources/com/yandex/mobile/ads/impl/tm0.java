package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

public class tm0 implements C13274h4 {

    /* renamed from: a */
    private final AdResponse f40381a;

    public tm0(AdResponse adResponse) {
        this.f40381a = adResponse;
    }

    /* renamed from: a */
    public Map<String, Object> mo67398a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("ad_source", this.f40381a.mo64431k());
        i41.mo67733b("block_id", this.f40381a.mo64434n());
        i41.mo67733b("ad_unit_id", this.f40381a.mo64434n());
        i41.mo67731a("server_log_id", this.f40381a.mo64412C());
        return i41.mo67729a();
    }
}
