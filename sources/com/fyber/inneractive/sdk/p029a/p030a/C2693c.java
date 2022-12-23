package com.fyber.inneractive.sdk.p029a.p030a;

import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.vungle.warren.model.SessionDataDBAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.a.a.c */
final class C2693c {

    /* renamed from: a */
    HashMap<C2689b, C2691b> f6357a = new HashMap<C2689b, C2691b>() {
        {
            for (C2689b bVar : C2689b.values()) {
                if (bVar != C2689b.NONE) {
                    put(bVar, new C2691b());
                }
            }
        }
    };

    C2693c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo17900a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f6357a.entrySet()) {
                C2689b bVar = (C2689b) next.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", bVar.f6349h.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject2.put("subType", str);
                    jSONObject2.put(SessionDataDBAdapter.SessionDataColumns.TABLE_NAME, ((C2691b) next.getValue()).mo17899a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
