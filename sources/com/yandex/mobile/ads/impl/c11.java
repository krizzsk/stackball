package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class c11 {

    /* renamed from: a */
    private final b11 f31784a;

    c11(vg1 vg1) {
        this.f31784a = new b11(vg1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<z01> mo66187a(JSONArray jSONArray) throws JSONException, xr0 {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(this.f31784a.mo65938a(optJSONObject));
                }
            }
        }
        return arrayList;
    }
}
