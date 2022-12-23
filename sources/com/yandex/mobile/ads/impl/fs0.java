package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fs0 implements h41.C13275a {

    /* renamed from: a */
    private final ds0 f33707a = new ds0();

    /* renamed from: b */
    private AdResponse<as0> f33708b;

    /* renamed from: a */
    public void mo67078a(AdResponse<as0> adResponse) {
        this.f33708b = adResponse;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        i41 i41 = new i41(new HashMap());
        AdResponse<as0> adResponse = this.f33708b;
        if (adResponse != null) {
            List<String> a = this.f33707a.mo66665a(adResponse);
            if (!((ArrayList) a).isEmpty()) {
                i41.mo67731a("image_sizes", a);
            }
            List<String> d = this.f33707a.mo66667d(this.f33708b);
            if (!((ArrayList) d).isEmpty()) {
                i41.mo67731a("native_ad_types", d);
            }
            List<String> b = this.f33707a.mo66666b(this.f33708b);
            if (!((ArrayList) b).isEmpty()) {
                i41.mo67731a("ad_id", b);
            }
            i41.mo67731a("server_log_id", this.f33708b.mo64412C());
            i41.mo67733b("ad_source", this.f33708b.mo64431k());
            if (!this.f33708b.mo64414E()) {
                i41.mo67733b("ad_type_format", this.f33708b.mo64433m());
                i41.mo67733b("product_type", this.f33708b.mo64446y());
            }
        }
        return i41.mo67729a();
    }
}
