package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.a6 */
public class C12358a6 implements C13822l {

    /* renamed from: a */
    private final vg1 f30450a;

    public C12358a6(vg1 vg1) {
        this.f30450a = vg1;
    }

    /* renamed from: a */
    public C13370i mo65683a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, "type");
        String a2 = this.f30450a.mo70490a(jSONObject, "url");
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return new C15234y5(a, a2, arrayList);
    }
}
