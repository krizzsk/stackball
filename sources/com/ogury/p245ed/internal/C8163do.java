package com.ogury.p245ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.do */
public final class C8163do {
    /* renamed from: a */
    public static void m22748a(JSONObject jSONObject) throws C8201eq {
        C8467mq.m23881b(jSONObject, "rootJsonResponse");
        if (jSONObject.has("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            C8201eq eqVar = new C8201eq();
            String optString = jSONObject2.optString("type", "");
            C8467mq.m23878a((Object) optString, "error.optString(\"type\", \"\")");
            eqVar.mo53427a(optString);
            String optString2 = jSONObject2.optString("message", "");
            C8467mq.m23878a((Object) optString2, "error.optString(\"message\", \"\")");
            eqVar.mo53428b(optString2);
            throw eqVar;
        }
    }
}
