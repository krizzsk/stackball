package com.ogury.p245ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.hw */
public final class C8312hw {

    /* renamed from: a */
    public static final C8312hw f21474a = new C8312hw();

    private C8312hw() {
    }

    /* renamed from: a */
    public static C8310hv m23430a(String str) {
        C8467mq.m23881b(str, "zoneJson");
        try {
            return m23431a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C8310hv m23431a(JSONObject jSONObject) {
        C8467mq.m23881b(jSONObject, "zoneJson");
        C8310hv hvVar = new C8310hv();
        String optString = jSONObject.optString("url", "");
        C8467mq.m23878a((Object) optString, "zoneJson.optString(\"url\", \"\")");
        hvVar.mo53695a(optString);
        String optString2 = jSONObject.optString("content", "");
        C8467mq.m23878a((Object) optString2, "zoneJson.optString(\"content\", \"\")");
        hvVar.mo53699b(optString2);
        String optString3 = jSONObject.optString("webViewId", jSONObject.optString("id", ""));
        C8467mq.m23878a((Object) optString3, "zoneJson.optString(\"webViewId\", id)");
        hvVar.mo53703c(optString3);
        JSONObject optJSONObject = jSONObject.optJSONObject("size");
        int i = -1;
        hvVar.mo53698b(optJSONObject == null ? -1 : optJSONObject.optInt("width", -1));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("size");
        hvVar.mo53694a(optJSONObject2 == null ? -1 : optJSONObject2.optInt("height", -1));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("position");
        hvVar.mo53706d(optJSONObject3 == null ? -1 : optJSONObject3.optInt("x", -1));
        JSONObject optJSONObject4 = jSONObject.optJSONObject("position");
        if (optJSONObject4 != null) {
            i = optJSONObject4.optInt("y", -1);
        }
        hvVar.mo53702c(i);
        hvVar.mo53696a(jSONObject.optBoolean("enableTracking", false));
        hvVar.mo53700b(jSONObject.optBoolean("keepAlive", false));
        hvVar.mo53704c(jSONObject.optBoolean("isLandingPage", false));
        return hvVar;
    }
}
