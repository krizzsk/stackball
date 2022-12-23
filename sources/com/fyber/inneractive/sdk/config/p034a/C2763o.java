package com.fyber.inneractive.sdk.config.p034a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.o */
public final class C2763o implements C2762n {

    /* renamed from: a */
    JSONObject f6505a;

    C2763o(JSONObject jSONObject) {
        this.f6505a = jSONObject;
    }

    /* renamed from: b */
    public final String mo17985b(String str) {
        if (this.f6505a.has(str)) {
            try {
                return this.f6505a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final Integer mo17986c(String str) {
        if (this.f6505a.has(str)) {
            try {
                return Integer.valueOf(this.f6505a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public final Boolean mo17987d(String str) {
        if (this.f6505a.has(str)) {
            try {
                return Boolean.valueOf(this.f6505a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public final Double mo17988e(String str) {
        return Double.valueOf(this.f6505a.optDouble(str, 0.0d));
    }

    /* renamed from: a */
    public final String mo17982a(String str, String str2) {
        return this.f6505a.optString(str, str2);
    }

    /* renamed from: a */
    public final int mo17981a(String str, int i) {
        return this.f6505a.optInt(str, i);
    }

    /* renamed from: a */
    public final boolean mo17984a(String str, boolean z) {
        return this.f6505a.optBoolean(str, z);
    }

    /* renamed from: a */
    public final double mo17980a(String str, double d) {
        return this.f6505a.optDouble(str, d);
    }

    /* renamed from: a */
    public final Map<String, Object> mo18004a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f6505a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f6505a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public final String toString() {
        JSONObject jSONObject = this.f6505a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }
}
