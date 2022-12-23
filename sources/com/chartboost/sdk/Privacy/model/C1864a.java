package com.chartboost.sdk.Privacy.model;

import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Privacy.model.a */
abstract class C1864a implements DataUseConsent {

    /* renamed from: a */
    String f4607a;

    /* renamed from: b */
    String f4608b;

    C1864a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14369a(String str) {
        try {
            C1874e.m4311e(new C1868a("consent_creation_error", str, "", ""));
            throw new Exception(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getConsent() {
        return this.f4608b;
    }

    public String getPrivacyStandard() {
        return this.f4607a;
    }

    public abstract boolean isValidConsent(String str);

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", this.f4607a);
            jSONObject.put("consent", this.f4608b);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
