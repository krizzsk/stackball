package com.ironsource.mediationsdk.p137a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.f */
final class C5644f extends C5633a {

    /* renamed from: d */
    private final String f13349d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    C5644f(int i) {
        this.f13278b = i;
    }

    /* renamed from: a */
    public final String mo41672a(ArrayList<C5641c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f13277a = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C5641c> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject a = m13748a(it.next());
                if (a != null) {
                    jSONArray.put(a);
                }
            }
        }
        return mo41673a(jSONArray);
    }

    /* renamed from: b */
    public final String mo41674b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    /* renamed from: c */
    public final String mo41675c() {
        return "outcome";
    }
}
