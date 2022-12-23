package com.p243my.target;

import android.content.Context;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.c4 */
public class C7344c4 {
    public C7344c4(C7617q1 q1Var, C7298a aVar, Context context) {
    }

    /* renamed from: a */
    public static C7344c4 m18857a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7344c4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public void mo49810a(JSONObject jSONObject, C7718w2 w2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            mo49811b(optJSONObject, w2Var);
        }
    }

    /* renamed from: b */
    public final void mo49811b(JSONObject jSONObject, C7718w2 w2Var) {
        w2Var.mo51785h(jSONObject.optString("title", w2Var.mo51789l()));
        w2Var.mo51779e(jSONObject.optString("icon_hd", w2Var.mo51780f()));
        w2Var.mo51775c(jSONObject.optString("bubble_icon_hd", w2Var.mo51776d()));
        w2Var.mo51783g(jSONObject.optString("label_icon_hd", w2Var.mo51784h()));
        w2Var.mo51777d(jSONObject.optString("goto_app_icon_hd", w2Var.mo51778e()));
        w2Var.mo51781f(jSONObject.optString("item_highlight_icon", w2Var.mo51782g()));
        JSONArray optJSONArray = jSONObject.optJSONArray("icon_status");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    w2Var.mo51788k().add(new Pair(optJSONObject.optString("value"), optJSONObject.optString("icon_hd")));
                }
            }
        }
    }
}
