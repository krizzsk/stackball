package com.yandex.mobile.ads.impl;

import com.tapjoy.TapjoyConstants;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.y3 */
public class C15232y3 {

    /* renamed from: a */
    private final C14254p5 f42765a = new C14254p5();

    /* renamed from: b */
    private final k01 f42766b = new k01();

    /* renamed from: a */
    public Map<String, Object> mo70991a(AdRequest adRequest) {
        i41 i41 = new i41(new HashMap());
        if (adRequest != null) {
            Map<String, String> parameters = adRequest.getParameters();
            this.f42765a.getClass();
            i41 i412 = new i41(new HashMap());
            if (parameters != null) {
                i412.mo67731a("adapter_network_name", parameters.get("adapter_network_name"));
                i412.mo67731a(TapjoyConstants.TJC_ADAPTER_VERSION, parameters.get(TapjoyConstants.TJC_ADAPTER_VERSION));
                i412.mo67731a("adapter_network_sdk_version", parameters.get("adapter_network_sdk_version"));
            }
            Map<String, Object> a = i412.mo67729a();
            this.f42766b.getClass();
            i41 i413 = new i41(new HashMap());
            if (parameters != null) {
                i413.mo67731a("plugin_type", parameters.get("plugin_type"));
                i413.mo67731a("plugin_version", parameters.get("plugin_version"));
            }
            Map<String, Object> a2 = i413.mo67729a();
            i41.mo67732a(a);
            i41.mo67732a(a2);
        }
        return i41.mo67729a();
    }
}
