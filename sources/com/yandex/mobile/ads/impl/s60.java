package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

public class s60 implements C14570s9<r60> {

    /* renamed from: a */
    private final kd0 f39862a;

    public s60(kd0 kd0) {
        this.f39862a = kd0;
    }

    /* renamed from: a */
    public Object mo66845a(JSONObject jSONObject) throws JSONException, xr0 {
        if (jSONObject.has("value")) {
            hd0 hd0 = null;
            if (!jSONObject.isNull("value")) {
                hd0 = this.f39862a.mo66845a(jSONObject);
            }
            return new r60(hd0);
        }
        throw new xr0("Native Ad json has not required attributes");
    }
}
