package com.ogury.sdk.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.sdk.internal.g */
/* compiled from: MonitoringInfoJsonSerializer.kt */
public final class C8559g {

    /* renamed from: a */
    private C8551a f21781a;

    public C8559g(C8551a aVar) {
        C8567m.m24059b(aVar, "jsonObjectCreator");
        this.f21781a = aVar;
    }

    /* renamed from: a */
    public final String mo54042a(C8552b bVar) throws JSONException {
        C8567m.m24059b(bVar, "monitoringInfo");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : bVar.mo54030b()) {
            jSONObject.put((String) next.getKey(), (String) next.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        C8567m.m24057a((Object) jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
