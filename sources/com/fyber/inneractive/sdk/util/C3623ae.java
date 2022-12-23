package com.fyber.inneractive.sdk.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.ae */
public final class C3623ae {

    /* renamed from: com.fyber.inneractive.sdk.util.ae$a */
    public interface C3624a {
        /* renamed from: c */
        JSONObject mo18060c();
    }

    /* renamed from: a */
    public static void m9046a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof C3624a) {
                    jSONObject.putOpt(str, ((C3624a) obj).mo18060c());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m9045a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static JSONArray m9044a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }
}
