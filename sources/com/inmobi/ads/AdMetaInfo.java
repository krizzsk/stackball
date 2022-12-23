package com.inmobi.ads;

import org.json.JSONObject;

public final class AdMetaInfo {

    /* renamed from: a */
    private String f11034a;

    /* renamed from: b */
    private JSONObject f11035b;

    public AdMetaInfo(String str, JSONObject jSONObject) {
        this.f11034a = str;
        this.f11035b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f11035b;
        if (jSONObject == null) {
            return 0.0d;
        }
        return jSONObject.optDouble("buyerPrice");
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f11035b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getCreativeID() {
        return this.f11034a;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f11035b;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("bidKeyword");
    }
}
