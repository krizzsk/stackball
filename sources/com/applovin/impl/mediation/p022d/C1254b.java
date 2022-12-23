package com.applovin.impl.mediation.p022d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.b */
public class C1254b extends C1520h {

    /* renamed from: a */
    private static final String[] f2429a = {CampaignUnit.JSON_KEY_ADS, "settings", "mcode", "bcode", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b */
    private static final String[] f2430b = {CampaignUnit.JSON_KEY_ADS, "settings", "mcode", "bcode", "signal_providers"};

    /* renamed from: a */
    public static String m2213a(C1469j jVar) {
        return C1520h.m3439a((String) jVar.mo13088a(C1368b.f2824c), "1.0/mediate", jVar);
    }

    /* renamed from: a */
    public static void m2214a(JSONObject jSONObject, C1469j jVar) {
        if (C1521i.m3484a(jSONObject, "signal_providers")) {
            JSONObject d = C1521i.m3496d(jSONObject);
            C1521i.m3482a(d, f2429a);
            jVar.mo13095a(C1371e.f3172x, d.toString());
        }
    }

    /* renamed from: b */
    public static String m2215b(C1469j jVar) {
        return C1520h.m3439a((String) jVar.mo13088a(C1368b.f2825d), "1.0/mediate", jVar);
    }

    /* renamed from: b */
    public static void m2216b(JSONObject jSONObject, C1469j jVar) {
        if (C1521i.m3484a(jSONObject, "auto_init_adapters")) {
            JSONObject d = C1521i.m3496d(jSONObject);
            C1521i.m3482a(d, f2430b);
            jVar.mo13095a(C1371e.f3173y, d.toString());
        }
    }

    /* renamed from: c */
    public static String m2217c(C1469j jVar) {
        return C1520h.m3439a((String) jVar.mo13088a(C1368b.f2824c), "1.0/mediate_debug", jVar);
    }

    /* renamed from: d */
    public static String m2218d(C1469j jVar) {
        return C1520h.m3439a((String) jVar.mo13088a(C1368b.f2825d), "1.0/mediate_debug", jVar);
    }
}
