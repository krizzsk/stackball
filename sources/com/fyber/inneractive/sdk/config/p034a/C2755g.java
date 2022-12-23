package com.fyber.inneractive.sdk.config.p034a;

import com.fyber.inneractive.sdk.config.p034a.p035a.C2744d;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.g */
public final class C2755g {
    /* renamed from: a */
    public static JSONArray m5988a(Map<Class, C2744d> map, boolean z) {
        C2752d a;
        JSONArray jSONArray = new JSONArray();
        try {
            for (C2744d next : map.values()) {
                List<C2750b> list = next.f6470b;
                Map<String, C2759k> map2 = next.f6471d;
                for (C2750b next2 : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", next2.f6484a);
                    if (map2.containsKey(next2.f6484a)) {
                        jSONObject.put("v", map2.get(next2.f6484a).f6502a);
                    } else {
                        jSONObject.put("v", "control");
                    }
                    if (z && (a = next2.mo17990a(C2751c.class)) != null && ((C2751c) a).f6489b) {
                        Set<Long> set = ((C2751c) a).f6488a;
                        JSONArray jSONArray2 = new JSONArray();
                        for (Long put : set) {
                            jSONArray2.put(put);
                        }
                        if (jSONArray2.length() > 0) {
                            jSONObject.put("d", jSONArray2);
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.m9034b("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f9870a > 3) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
