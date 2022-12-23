package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.h */
public final class C2790h {

    /* renamed from: a */
    public final Map<String, C2789g> f6583a = new HashMap();

    C2790h() {
    }

    C2790h(JSONObject jSONObject) {
        m6088a(jSONObject);
    }

    /* renamed from: a */
    private void m6088a(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null) {
            JSONArray names2 = jSONObject.names();
            for (int i = 0; i < names2.length(); i++) {
                String optString = names2.optString(i, (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                C2789g gVar = new C2789g();
                if (!(optJSONObject == null || (names = optJSONObject.names()) == null)) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString2 = names.optString(i2, (String) null);
                        String optString3 = optJSONObject.optString(optString2, (String) null);
                        if (!(optString2 == null || optString3 == null || optString2 == null || optString3 == null)) {
                            gVar.f6582a.put(optString2, optString3);
                        }
                    }
                }
                this.f6583a.put(optString, gVar);
            }
        }
    }
}
