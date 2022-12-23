package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bi0 {

    /* renamed from: a */
    private final int f31334a;

    public bi0(int i, int i2) {
        this.f31334a = i;
    }

    /* renamed from: a */
    public final String mo66074a(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        JSONObject a = m34254a(jSONObject, 1);
        int i = this.f31334a;
        if (i == 0) {
            str = a.toString();
            str2 = "copy.toString()";
        } else {
            str = a.toString(i);
            str2 = "copy.toString(indentSpaces)";
        }
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return str;
    }

    /* renamed from: a */
    public final String mo66073a(JSONArray jSONArray) throws JSONException {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(jSONArray, "json");
        JSONArray a = m34253a(jSONArray, 1);
        int i = this.f31334a;
        if (i == 0) {
            str = a.toString();
            str2 = "copy.toString()";
        } else {
            str = a.toString(i);
            str2 = "copy.toString(indentSpaces)";
        }
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return str;
    }

    /* renamed from: a */
    private final JSONObject m34254a(JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Intrinsics.checkNotNullExpressionValue(next, SDKConstants.PARAM_KEY);
            if (!(opt instanceof JSONObject)) {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = m34253a((JSONArray) opt, i - 1);
                    }
                }
                jSONObject2.put(next, opt);
            } else if (i != 0) {
                opt = m34254a((JSONObject) opt, i - 1);
                jSONObject2.put(next, opt);
            }
            opt = "...";
            jSONObject2.put(next, opt);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private final JSONArray m34253a(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            Object opt = jSONArray.opt(i2);
            if (!(opt instanceof JSONObject)) {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = m34253a((JSONArray) opt, i - 1);
                    }
                }
                jSONArray2.put(opt);
                i2 = i3;
            } else if (i != 0) {
                opt = m34254a((JSONObject) opt, i - 1);
                jSONArray2.put(opt);
                i2 = i3;
            }
            opt = "...";
            jSONArray2.put(opt);
            i2 = i3;
        }
        return jSONArray2;
    }
}
