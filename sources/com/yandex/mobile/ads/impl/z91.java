package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class z91 implements C12714ca<s91> {
    /* renamed from: b */
    public s91 mo65715a(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonValue");
        return new s91(jSONObject.getInt("x"), jSONObject.getInt("y"), jSONObject.getInt("w"), jSONObject.getInt("h"));
    }
}
