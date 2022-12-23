package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3623ae;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.r */
public final class C2806r implements C3623ae.C3624a {

    /* renamed from: a */
    UnitDisplayType f6639a;

    /* renamed from: c */
    public final JSONObject mo18060c() {
        JSONObject jSONObject = new JSONObject();
        C3623ae.m9046a(jSONObject, "unitDisplayType", this.f6639a);
        return jSONObject;
    }
}
