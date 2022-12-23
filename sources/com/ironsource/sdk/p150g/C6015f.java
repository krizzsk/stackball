package com.ironsource.sdk.p150g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.g.f */
public class C6015f {

    /* renamed from: d */
    public JSONObject f14778d;

    public C6015f() {
        this.f14778d = new JSONObject();
    }

    public C6015f(String str) {
        try {
            this.f14778d = new JSONObject(str);
        } catch (Exception unused) {
            this.f14778d = new JSONObject();
        }
    }

    /* renamed from: a */
    private Object m14848a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m14849a((JSONObject) obj) : obj instanceof JSONArray ? mo42558a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private Map<String, Object> m14849a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m14848a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final List mo42558a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m14848a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo42559a(String str, String str2) {
        try {
            this.f14778d.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo42560a(String str, JSONObject jSONObject) {
        try {
            this.f14778d.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo42561a(String str) {
        return this.f14778d.has(str);
    }

    /* renamed from: b */
    public final boolean mo42562b(String str) {
        return this.f14778d.isNull(str);
    }

    /* renamed from: c */
    public final Object mo42563c(String str) {
        try {
            return this.f14778d.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo42564d(String str) {
        try {
            return this.f14778d.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo42565e(String str) {
        try {
            return this.f14778d.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String toString() {
        JSONObject jSONObject = this.f14778d;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
