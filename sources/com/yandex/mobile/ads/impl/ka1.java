package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

public class ka1 implements C14570s9<ja1> {

    /* renamed from: a */
    private final dd0 f36078a;

    public ka1(vg1 vg1) {
        this.f36078a = new dd0(vg1);
    }

    /* renamed from: a */
    public Object mo66845a(JSONObject jSONObject) throws JSONException, xr0 {
        return new ja1(this.f36078a.mo65715a(jSONObject.getJSONObject("image")), ft0.m36302a(jSONObject, "title"));
    }

    /* renamed from: b */
    public ja1 mo68190b(JSONObject jSONObject) throws JSONException, xr0 {
        return new ja1(this.f36078a.mo65715a(jSONObject.getJSONObject("image")), ft0.m36302a(jSONObject, "title"));
    }
}
