package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class la1 implements C13822l<ea1> {

    /* renamed from: a */
    private final ia1 f36598a;

    public la1(vg1 vg1) {
        this.f36598a = new ia1(new fj0(), vg1);
    }

    /* renamed from: a */
    public C13370i mo65683a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, "type");
        JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(this.f36598a.mo67764a(jSONArray.getJSONObject(i)));
        }
        if (!arrayList.isEmpty()) {
            return new ea1(a, arrayList);
        }
        throw new xr0("Native Ad json has not required attributes");
    }
}
