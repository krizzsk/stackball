package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.i */
public final class C2791i {

    /* renamed from: a */
    final Map<String, C2790h> f6584a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f6585b = new HashMap();

    /* renamed from: a */
    public final String mo18048a(String str, String str2) {
        return this.f6585b.containsKey(str) ? this.f6585b.get(str) : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2791i iVar = (C2791i) obj;
            return this.f6585b.equals(iVar.f6585b) && this.f6584a.equals(iVar.f6584a);
        }
    }

    public final int hashCode() {
        return this.f6585b.hashCode();
    }

    /* renamed from: a */
    public static void m6089a(JSONObject jSONObject, C2791i iVar) {
        JSONArray names = jSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i, (String) null);
            String optString2 = jSONObject.optString(optString, (String) null);
            if (!(optString == null || optString2 == null)) {
                iVar.f6585b.put(optString, optString2);
            }
        }
    }

    /* renamed from: a */
    public final int mo18046a(String str, int i, int i2) {
        try {
            i = Integer.parseInt(mo18048a(str, Integer.toString(i)));
        } catch (Throwable unused) {
        }
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public final boolean mo18049a(String str, boolean z) {
        try {
            return Boolean.parseBoolean(mo18048a(str, Boolean.toString(z)));
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: b */
    public static void m6090b(JSONObject jSONObject, C2791i iVar) {
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String optString = names.optString(i, (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                if (!(optString == null || optJSONObject == null)) {
                    iVar.f6584a.put(optString, new C2790h(optJSONObject));
                }
            }
        }
    }

    /* renamed from: a */
    public final C2790h mo18047a(String str) {
        if (this.f6584a.containsKey(str)) {
            return this.f6584a.get(str);
        }
        return new C2790h();
    }

    /* renamed from: b */
    public final C2789g mo18050b(String str) {
        C2790h a = mo18047a(IAConfigManager.m5940k());
        return a.f6583a.containsKey(str) ? a.f6583a.get(str) : new C2789g();
    }
}
