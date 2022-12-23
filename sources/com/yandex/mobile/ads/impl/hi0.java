package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hi0 {
    /* renamed from: a */
    public static String m36983a(JSONArray jSONArray, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return new bi0(i, 1).mo66073a(jSONArray);
    }

    /* renamed from: a */
    public static String m36984a(JSONObject jSONObject, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return new bi0(i, 1).mo66074a(jSONObject);
    }
}
