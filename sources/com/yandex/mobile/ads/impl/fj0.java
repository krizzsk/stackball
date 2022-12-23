package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class fj0 {

    /* renamed from: a */
    private final C14048n f33379a = new C14048n();

    /* renamed from: a */
    public ej0 mo67022a(JSONObject jSONObject) throws JSONException, xr0 {
        ArrayList arrayList;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        String str = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C13822l a = this.f33379a.mo68874a(jSONObject2);
                if (a != null) {
                    arrayList.add(a.mo65683a(jSONObject2));
                }
            }
        } else {
            arrayList = null;
        }
        String a2 = jSONObject.has("falseClickUrl") ? ft0.m36302a(jSONObject, "falseClickUrl") : null;
        Long valueOf = Long.valueOf(jSONObject.optLong("falseClickInterval", 0));
        FalseClick falseClick = (a2 == null || valueOf == null) ? null : new FalseClick(a2, valueOf.longValue());
        String a3 = jSONObject.has("trackingUrl") ? ft0.m36302a(jSONObject, "trackingUrl") : null;
        if (jSONObject.has("url")) {
            str = ft0.m36302a(jSONObject, "url");
        }
        return new ej0(arrayList, falseClick, a3, str);
    }
}
