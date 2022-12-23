package com.ironsource.mediationsdk.p137a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.e */
final class C5643e extends C5633a {

    /* renamed from: d */
    private final String f13345d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: e */
    private final String f13346e = "super.dwh.mediation_events";

    /* renamed from: f */
    private final String f13347f = "table";

    /* renamed from: g */
    private final String f13348g = "data";

    C5643e(int i) {
        this.f13278b = i;
    }

    /* renamed from: a */
    public final String mo41672a(ArrayList<C5641c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f13277a = jSONObject;
        try {
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
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", mo41673a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public final String mo41674b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    /* renamed from: c */
    public final String mo41675c() {
        return "ironbeast";
    }
}
