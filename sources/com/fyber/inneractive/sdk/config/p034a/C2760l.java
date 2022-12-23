package com.fyber.inneractive.sdk.config.p034a;

import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.l */
public final class C2760l {

    /* renamed from: a */
    final Map<String, C2765q> f6504a = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6504a.equals(((C2760l) obj).f6504a);
    }

    public final int hashCode() {
        return this.f6504a.hashCode();
    }

    /* renamed from: a */
    public static C2760l m5995a(JSONObject jSONObject) throws Exception {
        C2760l lVar = new C2760l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            C2765q qVar = new C2765q();
            qVar.f6507a = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            if (optJSONObject != null) {
                qVar.mo18008a(optJSONObject);
            } else {
                IAlog.m9034b("RemoteFeature fromJson. feature %s has no params!", qVar.f6507a);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    C2750b a = C2750b.m5981a(optJSONArray2.getJSONObject(i2));
                    qVar.f6508b.put(a.f6484a, a);
                }
            }
            lVar.f6504a.put(qVar.f6507a, qVar);
        }
        return lVar;
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", new Object[]{this.f6504a.values()});
    }
}
