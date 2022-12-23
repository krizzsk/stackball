package com.fyber.inneractive.sdk.config.p036b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.d */
public final class C2778d {

    /* renamed from: a */
    public C2773a f6538a;

    /* renamed from: b */
    public List<C2781g> f6539b = null;

    /* renamed from: c */
    public String f6540c;

    /* renamed from: d */
    public String f6541d;

    /* renamed from: a */
    public static List<C2781g> m6049a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("spots");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C2781g gVar = null;
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("id", (String) null);
                    if (!TextUtils.isEmpty(optString)) {
                        C2781g gVar2 = new C2781g();
                        gVar2.f6544a = optString;
                        gVar2.f6545b = optJSONObject.optString("isActive", (String) null);
                        gVar2.f6546c = C2774b.m6046a(optJSONObject.optJSONObject("display"));
                        gVar2.f6547d = C2779e.m6050a(optJSONObject.optJSONObject("monitor"));
                        gVar2.f6548e = C2780f.m6051a(optJSONObject.optJSONObject("native"));
                        gVar2.f6549f = C2783i.m6056a(optJSONObject.optJSONObject("video"));
                        gVar2.f6550g = C2784j.m6057a(optJSONObject.optJSONObject("viewability"));
                        gVar2.f6551h = C2781g.m6052a(optJSONObject.optJSONArray("units"));
                        gVar = gVar2;
                    }
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }
}
