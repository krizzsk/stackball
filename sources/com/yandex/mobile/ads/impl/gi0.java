package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class gi0 {
    /* renamed from: a */
    public static Map<String, String> m36618a(JSONObject jSONObject, String str) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        return hashMap;
    }

    /* renamed from: b */
    public static String m36620b(JSONObject jSONObject, String str) throws JSONException {
        String string = jSONObject.getString(str);
        if (m36619a(string)) {
            return String.valueOf(Html.fromHtml(string));
        }
        throw new JSONException("Json value can not be null or empty");
    }

    /* renamed from: c */
    public static Integer m36621c(JSONObject jSONObject, String str) {
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static List<String> m36622d(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (m36619a(optJSONArray.optString(i))) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static Map<String, String> m36623e(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if (m36619a(optString)) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static boolean m36619a(String str) {
        return !TextUtils.isEmpty(str) && !"null".equals(str);
    }
}
