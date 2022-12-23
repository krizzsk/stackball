package com.p243my.target;

import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.target.y3 */
public class C7748y3 {
    /* renamed from: a */
    public static int m20871a(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            return i;
        }
        try {
            return Color.parseColor(optString);
        } catch (Throwable unused) {
            C7374e0.m18990b("error parsing color " + optString);
            return i;
        }
    }
}
