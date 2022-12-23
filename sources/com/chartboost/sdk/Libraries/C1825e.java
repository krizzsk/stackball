package com.chartboost.sdk.Libraries;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Libraries.e */
public class C1825e {

    /* renamed from: com.chartboost.sdk.Libraries.e$a */
    public static class C1826a {

        /* renamed from: a */
        final String f4388a;

        /* renamed from: b */
        final Object f4389b;

        public C1826a(String str, Object obj) {
            this.f4388a = str;
            this.f4389b = obj;
        }
    }

    /* renamed from: a */
    public static JSONObject m4024a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m4026a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            CBLogging.m3993b("CBJSON", "put (" + str + ")" + e.toString());
        }
    }

    /* renamed from: a */
    public static JSONObject m4025a(C1826a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (C1826a aVar : aVarArr) {
            m4026a(jSONObject, aVar.f4388a, aVar.f4389b);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C1826a m4023a(String str, Object obj) {
        return new C1826a(str, obj);
    }
}
