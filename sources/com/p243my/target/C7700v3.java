package com.p243my.target;

import com.p243my.target.common.models.AudioData;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.my.target.v3 */
public class C7700v3 {
    /* renamed from: a */
    public static C7700v3 m20666a() {
        return new C7700v3();
    }

    /* renamed from: a */
    public void mo51729a(JSONObject jSONObject, C7647s2 s2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            Iterator<C7686u2<AudioData>> it = s2Var.mo51480c().iterator();
            while (it.hasNext()) {
                C7686u2 next = it.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next.mo51662h());
                if (optJSONObject2 != null) {
                    mo51730a(optJSONObject2, next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51730a(JSONObject jSONObject, C7686u2 u2Var) {
        u2Var.mo51651a(jSONObject.optInt("connectionTimeout", u2Var.mo51659e()));
        int optInt = jSONObject.optInt("maxBannersShow", u2Var.mo51660f());
        if (optInt == 0) {
            optInt = -1;
        }
        u2Var.mo51656b(optInt);
    }
}
