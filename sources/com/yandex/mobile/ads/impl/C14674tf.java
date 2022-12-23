package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15497h0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.tf */
public class C14674tf implements C14570s9<C14589sf> {
    /* renamed from: a */
    public Object mo66845a(JSONObject jSONObject) throws JSONException, xr0 {
        if (!jSONObject.has("value") || !jSONObject.isNull("value")) {
            return new C14589sf(C15497h0.C15498a.TEXT, ft0.m36302a(jSONObject, "value"));
        }
        return new C14589sf(C15497h0.C15498a.f43852c, (String) null);
    }
}
