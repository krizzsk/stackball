package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class zl0 implements C12714ca<fl0> {

    /* renamed from: a */
    private final C13298hb f43226a = new C13298hb();

    /* renamed from: a */
    public Object mo65715a(JSONObject jSONObject) throws JSONException, xr0 {
        String a = this.f43226a.mo67507a(jSONObject, TJAdUnitConstants.String.HTML);
        float f = (float) jSONObject.getDouble("aspectRatio");
        if (f == 0.0f) {
            f = 1.7777778f;
        }
        return new fl0(a, f);
    }
}
