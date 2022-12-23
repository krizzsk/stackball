package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class s21 {

    /* renamed from: a */
    private final C13040fb f39807a = new C13040fb();

    /* renamed from: a */
    public r21 mo69852a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f39807a.mo66949a(str));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        return new r21(hashMap, string);
    }
}
