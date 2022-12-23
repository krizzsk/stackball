package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.n */
public final class C5899n {

    /* renamed from: a */
    String f14410a;

    /* renamed from: b */
    JSONObject f14411b;

    /* renamed from: c */
    String f14412c;

    /* renamed from: d */
    String f14413d;

    public C5899n(JSONObject jSONObject) {
        this.f14410a = jSONObject.optString("functionName");
        this.f14411b = jSONObject.optJSONObject("functionParams");
        this.f14412c = jSONObject.optString("success");
        this.f14413d = jSONObject.optString("fail");
    }

    /* renamed from: a */
    public final JSONObject mo42316a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f14410a);
            jSONObject.put("functionParams", this.f14411b);
            jSONObject.put("success", this.f14412c);
            jSONObject.put("fail", this.f14413d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
