package com.yandex.metrica.impl.p265ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pl */
public class C10648Pl implements C11471kl {
    /* renamed from: a */
    public void mo61803a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.getJSONArray("ssh").getJSONObject(0).put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
