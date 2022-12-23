package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

public class xv0 implements C14570s9<String> {

    /* renamed from: a */
    private final o51 f42702a = new o51();

    /* renamed from: a */
    public Object mo66845a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, "name");
        String a2 = ft0.m36302a(jSONObject, "value");
        return "review_count".equals(a) ? this.f42702a.mo69119a(a2) : a2;
    }
}
