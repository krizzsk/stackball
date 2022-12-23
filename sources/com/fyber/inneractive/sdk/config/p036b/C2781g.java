package com.fyber.inneractive.sdk.config.p036b;

import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.p036b.C2775c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.g */
public final class C2781g implements C2775c.C2776a, C2775c.C2777b {

    /* renamed from: a */
    public String f6544a;

    /* renamed from: b */
    String f6545b;

    /* renamed from: c */
    public C2774b f6546c;

    /* renamed from: d */
    public C2779e f6547d;

    /* renamed from: e */
    C2780f f6548e;

    /* renamed from: f */
    public C2783i f6549f;

    /* renamed from: g */
    public C2784j f6550g;

    /* renamed from: h */
    public List<C2782h> f6551h = null;

    /* renamed from: a */
    public final C2783i mo18024a() {
        return this.f6549f;
    }

    /* renamed from: b */
    public final String mo18025b() {
        return this.f6545b;
    }

    /* renamed from: a */
    static List<C2782h> m6052a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                C2782h hVar = null;
                if (optJSONObject != null) {
                    C2782h hVar2 = new C2782h();
                    hVar2.f6552a = optJSONObject.optString("id", (String) null);
                    hVar2.f6553b = optJSONObject.optString(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, (String) null);
                    hVar2.f6554c = C2774b.m6046a(optJSONObject.optJSONObject("display"));
                    hVar2.f6555d = C2779e.m6050a(optJSONObject.optJSONObject("monitor"));
                    hVar2.f6556e = C2780f.m6051a(optJSONObject.optJSONObject("native"));
                    hVar2.f6557f = C2783i.m6056a(optJSONObject.optJSONObject("video"));
                    hVar2.f6558g = C2784j.m6057a(optJSONObject.optJSONObject("viewability"));
                    hVar = hVar2;
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }
}
