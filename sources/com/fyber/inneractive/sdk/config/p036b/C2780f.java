package com.fyber.inneractive.sdk.config.p036b;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.f */
public final class C2780f {

    /* renamed from: a */
    public UnitDisplayType f6543a;

    /* renamed from: a */
    public static C2780f m6051a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2780f fVar = new C2780f();
        UnitDisplayType fromValue = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (fromValue == null) {
            return null;
        }
        fVar.f6543a = fromValue;
        return fVar;
    }
}
