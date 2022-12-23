package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class dd0 implements C12714ca<hd0> {

    /* renamed from: a */
    private final vg1 f32540a;

    public dd0(vg1 vg1) {
        this.f32540a = vg1;
    }

    /* renamed from: b */
    public hd0 mo65715a(JSONObject jSONObject) throws JSONException, xr0 {
        hd0 hd0 = new hd0();
        hd0.mo67522b(this.f32540a.mo70490a(jSONObject, "url"));
        hd0.mo67521b(jSONObject.getInt("w"));
        hd0.mo67517a(jSONObject.getInt("h"));
        if (jSONObject.has("smartCenterSettings")) {
            hd0.mo67518a(new ba1().mo65715a(jSONObject.getJSONObject("smartCenterSettings")));
        }
        String optString = jSONObject.optString("sizeType");
        if (!TextUtils.isEmpty(optString)) {
            hd0.mo67519a(optString);
        }
        return hd0;
    }
}
