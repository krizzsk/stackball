package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

public class ia1 {

    /* renamed from: a */
    private final fj0 f34810a;

    /* renamed from: b */
    private final ka1 f34811b;

    public ia1(fj0 fj0, vg1 vg1) {
        this.f34810a = fj0;
        this.f34811b = new ka1(vg1);
    }

    /* renamed from: a */
    public ha1 mo67764a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, "name");
        return new ha1(this.f34810a.mo67022a(jSONObject.getJSONObject("link")), a, this.f34811b.mo68190b(jSONObject.getJSONObject("value")));
    }
}
