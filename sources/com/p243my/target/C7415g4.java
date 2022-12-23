package com.p243my.target;

import org.json.JSONObject;

/* renamed from: com.my.target.g4 */
public class C7415g4 {
    /* renamed from: a */
    public static C7415g4 m19175a() {
        return new C7415g4();
    }

    /* renamed from: a */
    public void mo50218a(JSONObject jSONObject, C7731x2 x2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            mo50219b(optJSONObject, x2Var);
        }
    }

    /* renamed from: b */
    public final void mo50219b(JSONObject jSONObject, C7731x2 x2Var) {
        x2Var.mo51822a(jSONObject.optBoolean("hasAdditionalAds", x2Var.mo51824d()));
    }
}
