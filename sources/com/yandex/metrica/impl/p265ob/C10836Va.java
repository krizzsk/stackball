package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10622P3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Va */
public class C10836Va implements C10952Ya<C10622P3> {
    /* renamed from: a */
    public JSONObject mo62281a(Object obj) {
        C10622P3 p3 = (C10622P3) obj;
        JSONObject jSONObject = new JSONObject();
        if (p3 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (C10622P3.C10623a a : p3.mo61111a()) {
                    jSONArray.put(m27993a(a));
                }
                jSONObject.putOpt("chosen", m27993a(p3.mo61903c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m27993a(C10622P3.C10623a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", C11993ym.m30994e((Map) aVar.mo61907b())).putOpt("source", aVar.mo61253a().mo61214a());
    }
}
