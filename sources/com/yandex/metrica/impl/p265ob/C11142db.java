package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10135Be;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.db */
public class C11142db implements C10952Ya<C10135Be> {
    /* renamed from: a */
    public JSONObject mo62281a(Object obj) {
        JSONObject jSONObject;
        C10135Be be = (C10135Be) obj;
        JSONObject jSONObject2 = new JSONObject();
        if (be != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (C10135Be.C10136a next : be.f24402b) {
                    if (next == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject().putOpt("tracking_id", next.f24403a).put("additional_parameters", next.f24404b).put("source", next.f24405c.mo61214a());
                    }
                    jSONArray.put(jSONObject);
                }
                JSONObject put = jSONObject2.put("candidates", jSONArray);
                C10459Le le = be.f24401a;
                put.put("chosen", new JSONObject().putOpt("tracking_id", le.f25109a).put("additional_parameters", le.f25110b).put("source", le.f25113e.mo61214a()).put("auto_tracking_enabled", le.f25112d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }
}
