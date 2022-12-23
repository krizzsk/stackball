package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Privacy.model.Custom;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.Privacy.model.GDPR;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.x0 */
public class C2015x0 {

    /* renamed from: a */
    private HashMap<String, DataUseConsent> f5198a = new HashMap<>();

    /* renamed from: b */
    private SharedPreferences f5199b;

    public C2015x0(SharedPreferences sharedPreferences) {
        this.f5199b = sharedPreferences;
        m4919c();
    }

    /* renamed from: c */
    private void m4919c() {
        String string;
        SharedPreferences sharedPreferences = this.f5199b;
        if (sharedPreferences != null && (string = sharedPreferences.getString("privacy_standards", "")) != null && !string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string2 = jSONObject.getString("privacyStandard");
                    String string3 = jSONObject.getString("consent");
                    DataUseConsent dataUseConsent = null;
                    if (!"gdpr".equals(string2)) {
                        dataUseConsent = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString("consent"));
                    } else if (GDPR.GDPR_CONSENT.BEHAVIORAL.getValue().equals(string3)) {
                        dataUseConsent = new GDPR(GDPR.GDPR_CONSENT.BEHAVIORAL);
                    } else if (GDPR.GDPR_CONSENT.NON_BEHAVIORAL.getValue().equals(string3)) {
                        dataUseConsent = new GDPR(GDPR.GDPR_CONSENT.NON_BEHAVIORAL);
                    }
                    if (dataUseConsent != null) {
                        this.f5198a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
                    } else {
                        C1874e.m4311e(new C1868a("consent_persisted_data_reading_error", string2, "", ""));
                        CBLogging.m3991a("Chartboost", "Failed to load consent: " + string2);
                    }
                }
            } catch (JSONException e) {
                C1874e.m4311e(new C1868a("consent_decoding_error", e.getMessage(), "", ""));
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private void m4920d() {
        if (this.f5199b != null) {
            JSONArray jSONArray = new JSONArray();
            for (DataUseConsent json : this.f5198a.values()) {
                jSONArray.put(json.toJson());
            }
            m4918a(this.f5199b, jSONArray);
        }
    }

    /* renamed from: a */
    public DataUseConsent mo14886a() {
        return this.f5198a.get("gdpr");
    }

    /* renamed from: b */
    public HashMap<String, DataUseConsent> mo14889b() {
        return this.f5198a;
    }

    /* renamed from: a */
    public void mo14888a(DataUseConsent dataUseConsent) {
        CBLogging.m3991a("Chartboost", "Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent());
        this.f5198a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        m4920d();
    }

    /* renamed from: a */
    public DataUseConsent mo14887a(String str) {
        DataUseConsent remove = this.f5198a.remove(str);
        m4920d();
        return remove;
    }

    /* renamed from: a */
    private void m4918a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences != null && jSONArray != null) {
            sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
        }
    }
}
