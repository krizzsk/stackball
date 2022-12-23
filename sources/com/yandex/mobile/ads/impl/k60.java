package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.i60;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class k60 implements C13822l<i60> {

    /* renamed from: a */
    private final vg1 f35976a;

    public k60(vg1 vg1) {
        this.f35976a = vg1;
    }

    /* renamed from: a */
    public C13370i mo65683a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, "type");
        JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new i60.C13382a(ft0.m36302a(jSONObject2, "title"), this.f35976a.mo70490a(jSONObject2, "url")));
        }
        if (!arrayList.isEmpty()) {
            return new i60(a, arrayList);
        }
        throw new xr0("Native Ad json has not required attributes");
    }
}
