package com.ironsource.sdk.p151h;

import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.e */
public final class C6022e {

    /* renamed from: a */
    public JSONObject f14788a;

    public C6022e(JSONObject jSONObject) {
        this.f14788a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public final boolean mo42575a() {
        return this.f14788a.optBoolean("useCacheDir", false);
    }
}
