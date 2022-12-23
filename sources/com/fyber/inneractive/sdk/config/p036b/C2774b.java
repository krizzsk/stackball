package com.fyber.inneractive.sdk.config.p036b;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.b */
public final class C2774b {

    /* renamed from: a */
    public UnitDisplayType f6534a;

    /* renamed from: b */
    public Boolean f6535b;

    /* renamed from: c */
    public Integer f6536c;

    /* renamed from: d */
    public Integer f6537d;

    /* renamed from: a */
    public static C2774b m6046a(JSONObject jSONObject) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C2774b bVar = new C2774b();
        Integer valueOf = Integer.valueOf(jSONObject.optInt(MessengerShareContentUtility.SHARE_BUTTON_HIDE, Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("refresh", Integer.MIN_VALUE));
        bVar.f6534a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f6535b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.f6537d = valueOf;
        if (valueOf2.intValue() != Integer.MIN_VALUE) {
            num = valueOf2;
        }
        bVar.f6536c = num;
        return bVar;
    }
}
