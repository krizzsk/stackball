package com.ironsource.sdk.p143a;

import com.ironsource.mediationsdk.C5710l;
import com.ironsource.sdk.p150g.C6007c;
import com.ironsource.sdk.p150g.C6008d;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.a.e */
public class C5826e {

    /* renamed from: a */
    private C5710l f14159a = new C5710l();

    /* renamed from: a */
    public static C6008d.C6013e m14395a(C6007c cVar, C6008d.C6013e eVar) {
        return (cVar == null || cVar.f14739d == null || cVar.f14739d.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f14739d.get("rewarded")) ? C6008d.C6013e.RewardedVideo : C6008d.C6013e.Interstitial;
    }

    /* renamed from: a */
    public static boolean m14396a(C6007c cVar) {
        if (cVar == null || cVar.f14739d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f14739d.get("inAppBidding"));
    }

    /* renamed from: a */
    public void mo42155a(Boolean bool) {
        C5710l.m14087a("fs", (Object) bool);
    }

    /* renamed from: a */
    public void mo42156a(String str) {
        C5710l.m14087a("usid", (Object) str);
    }

    /* renamed from: a */
    public void mo42157a(JSONObject jSONObject) {
        C5710l.m14087a("tkgp", (Object) jSONObject);
    }

    /* renamed from: b */
    public void mo42158b(String str) {
        C5710l.m14087a("audt", (Object) str);
    }
}
