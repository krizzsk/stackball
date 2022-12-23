package com.ironsource.sdk;

import com.ironsource.sdk.p150g.C6008d;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d */
public final class C5978d {

    /* renamed from: a */
    private static String f14637a = "ManRewInst_";

    /* renamed from: a */
    public static String m14740a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static String m14741a(C5829b bVar) {
        return (bVar.mo42159a() ? C6008d.C6013e.Banner : bVar.f14184a ? C6008d.C6013e.RewardedVideo : C6008d.C6013e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m14742a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f14637a + jSONObject.optString("name");
    }
}
