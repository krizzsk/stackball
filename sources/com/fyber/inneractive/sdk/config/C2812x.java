package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.C3623ae;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.x */
public final class C2812x implements C3623ae.C3624a {

    /* renamed from: a */
    Integer f6661a = 50;

    /* renamed from: b */
    public Integer f6662b = 50;

    /* renamed from: c */
    public Set<Vendor> f6663c = null;

    /* renamed from: c */
    public final JSONObject mo18060c() {
        JSONObject jSONObject = new JSONObject();
        C3623ae.m9046a(jSONObject, "pausePct", this.f6661a);
        C3623ae.m9046a(jSONObject, "playPct", this.f6662b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f6663c;
        if (set != null) {
            for (Vendor next : set) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C3623ae.m9046a(jSONObject, Verification.VENDOR, jSONArray);
        return jSONObject;
    }
}
