package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.uu */
public class C14835uu {

    /* renamed from: a */
    private final C13040fb f41064a = new C13040fb();

    /* renamed from: a */
    public C14535ru mo70407a(C12902dl dlVar) {
        if ("divkit".equals(dlVar.mo66617d())) {
            try {
                String c = dlVar.mo66616c();
                JSONObject jSONObject = new JSONObject(this.f41064a.mo66949a(dlVar.mo66615b()));
                return new C14535ru(c, jSONObject.getJSONObject("card"), jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null, dlVar.mo66614a());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
