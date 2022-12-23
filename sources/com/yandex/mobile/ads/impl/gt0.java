package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

public final class gt0 {
    /* renamed from: a */
    public static boolean m36700a(JSONObject jSONObject, String... strArr) {
        for (String has : strArr) {
            if (!jSONObject.has(has)) {
                return false;
            }
        }
        return true;
    }
}
