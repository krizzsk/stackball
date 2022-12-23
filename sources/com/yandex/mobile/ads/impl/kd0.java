package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class kd0 implements C14570s9<hd0> {

    /* renamed from: a */
    private final vg1 f36100a = new vg1();

    /* renamed from: b */
    public hd0 mo66845a(JSONObject jSONObject) throws JSONException, xr0 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new xr0("Native Ad json has not required attributes");
        }
        hd0 hd0 = new hd0();
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        hd0.mo67522b(this.f36100a.mo70490a(jSONObject2, "url"));
        hd0.mo67521b(jSONObject2.getInt("w"));
        hd0.mo67517a(jSONObject2.getInt("h"));
        String optString = jSONObject2.optString("sizeType");
        if (!TextUtils.isEmpty(optString)) {
            hd0.mo67519a(optString);
        }
        return hd0;
    }
}
