package com.flurry.sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.f */
public class C2638f {

    /* renamed from: a */
    private static final String f6197a = C2638f.class.getSimpleName();

    /* renamed from: a */
    public static List<C2656l> m5739a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("variants");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m5740b(optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static C2656l m5740b(JSONObject jSONObject) {
        String optString;
        C2656l lVar = new C2656l(C2653j.m5757a(jSONObject.optString("document", C2653j.f6229a.toString())));
        lVar.f6242b = jSONObject.optInt("id");
        lVar.f6243c = jSONObject.optInt("version");
        lVar.f6244d = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optString = optJSONObject.optString("name", (String) null)) == null)) {
                    lVar.f6245e.put(optString, new C2473c(optJSONObject));
                }
            }
        }
        return lVar;
    }
}
