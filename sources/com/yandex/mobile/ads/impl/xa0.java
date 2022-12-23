package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class xa0 implements h41.C13275a {

    /* renamed from: a */
    private AdResponse<String> f42482a;

    /* renamed from: a */
    public void mo70852a(AdResponse<String> adResponse) {
        this.f42482a = adResponse;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        i41 i41 = new i41(new HashMap());
        AdResponse<String> adResponse = this.f42482a;
        if (adResponse != null) {
            String d = adResponse.mo64423d();
            i41.mo67731a("ad_id", d != null ? Collections.singletonList(d) : null);
            i41.mo67733b("ad_source", this.f42482a.mo64431k());
            i41.mo67731a("server_log_id", this.f42482a.mo64412C());
            if (!this.f42482a.mo64414E()) {
                i41.mo67733b("ad_type_format", this.f42482a.mo64433m());
                i41.mo67733b("product_type", this.f42482a.mo64446y());
            }
        }
        return i41.mo67729a();
    }
}
