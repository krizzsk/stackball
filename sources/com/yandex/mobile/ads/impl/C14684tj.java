package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.tj */
public class C14684tj implements C13822l<C14466rj> {

    /* renamed from: a */
    private final c11 f40344a;

    /* renamed from: b */
    private final vg1 f40345b;

    public C14684tj(vg1 vg1) {
        this.f40345b = vg1;
        this.f40344a = new c11(vg1);
    }

    /* renamed from: a */
    public C13370i mo65683a(JSONObject jSONObject) throws JSONException, xr0 {
        return new C14466rj(ft0.m36302a(jSONObject, "type"), this.f40345b.mo70490a(jSONObject, "fallbackUrl"), this.f40344a.mo66187a(jSONObject.optJSONArray("preferredPackages")));
    }
}
