package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.C7770z3;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.t */
public class C7660t extends C7337c<C7699v2> implements C7770z3.C7771a {
    /* renamed from: a */
    public static C7337c<C7699v2> m20383a() {
        return new C7660t();
    }

    /* renamed from: a */
    public C7618q2 mo49777a(JSONObject jSONObject, C7617q1 q1Var, C7298a aVar, Context context) {
        C7699v2 f = C7699v2.m20661f();
        C7304a4 a = C7304a4.m18698a(q1Var, aVar, context);
        C7435h2 newBanner = C7435h2.newBanner();
        a.mo49578a(jSONObject, newBanner);
        f.mo51726a(newBanner);
        return f;
    }

    /* renamed from: a */
    public C7699v2 mo49776a(String str, C7617q1 q1Var, C7699v2 v2Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context) {
        JSONObject optJSONObject;
        C7541m2 b;
        JSONObject a = C7337c.m18819a(str, aVar2, l3Var);
        if (a == null) {
            return null;
        }
        if (v2Var == null) {
            v2Var = C7699v2.m20661f();
        }
        JSONObject optJSONObject2 = a.optJSONObject(aVar.getFormat());
        if (optJSONObject2 != null) {
            JSONArray optJSONArray = optJSONObject2.optJSONArray("banners");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                C7304a4 a2 = C7304a4.m18698a(q1Var, aVar, context);
                int bannersCount = aVar.getBannersCount();
                if (bannersCount > 0) {
                    int length = optJSONArray.length();
                    if (bannersCount > length) {
                        bannersCount = length;
                    }
                } else {
                    bannersCount = 1;
                }
                for (int i = 0; i < bannersCount; i++) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                    if (optJSONObject3 != null) {
                        C7435h2 newBanner = C7435h2.newBanner();
                        a2.mo49578a(optJSONObject3, newBanner);
                        v2Var.mo51726a(newBanner);
                    }
                }
                if (v2Var.mo51416a() > 0) {
                    return v2Var;
                }
            }
            return null;
        } else if (!aVar.isMediationEnabled() || (optJSONObject = a.optJSONObject("mediation")) == null || (b = C7770z3.m20982a(this, q1Var, aVar, context).mo51987b(optJSONObject)) == null) {
            return null;
        } else {
            v2Var.mo51417a(b);
            return v2Var;
        }
    }
}
