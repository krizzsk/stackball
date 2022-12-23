package com.yandex.mobile.ads.impl;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.n */
public class C14048n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final vg1 f37613a = new vg1();

    /* renamed from: b */
    private Map<String, C13822l> f37614b;

    /* renamed from: a */
    public C13822l mo68874a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, "type");
        if (this.f37614b == null) {
            this.f37614b = new C13945m(this);
        }
        return this.f37614b.get(a);
    }
}
