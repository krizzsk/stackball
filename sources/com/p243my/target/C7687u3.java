package com.p243my.target;

import com.p243my.target.common.models.VideoData;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.my.target.u3 */
public class C7687u3 {
    /* renamed from: a */
    public static C7687u3 m20568a() {
        return new C7687u3();
    }

    /* renamed from: a */
    public void mo51665a(JSONObject jSONObject, C7632r2 r2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            Iterator<C7686u2<VideoData>> it = r2Var.mo51446c().iterator();
            while (it.hasNext()) {
                C7686u2 next = it.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next.mo51662h());
                if (optJSONObject2 != null) {
                    mo51666a(optJSONObject2, next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51666a(JSONObject jSONObject, C7686u2 u2Var) {
        u2Var.mo51651a(jSONObject.optInt("connectionTimeout", u2Var.mo51659e()));
        int optInt = jSONObject.optInt("maxBannersShow", u2Var.mo51660f());
        if (optInt == 0) {
            optInt = -1;
        }
        u2Var.mo51656b(optInt);
    }
}
