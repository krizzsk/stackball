package com.amazon.device.ads;

import android.content.SharedPreferences;
import com.appsflyer.share.Constants;
import org.json.JSONException;
import org.json.JSONObject;

public class GDPRInfo {
    private static final String LOGTAG = GDPRInfo.class.getSimpleName();
    private MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    private SharedPreferences prefs;

    public GDPRInfo(SharedPreferences sharedPreferences) {
        this.prefs = sharedPreferences;
    }

    public JSONObject toJsonObject() {
        return toJsonObject(this.prefs);
    }

    public JSONObject toJsonObject(SharedPreferences sharedPreferences) {
        JSONObject jSONObject;
        String string = sharedPreferences.getString(AdConstants.IABCONSENT_SUBJECT_TO_GDPR, (String) null);
        String string2 = sharedPreferences.getString(AdConstants.APS_GDPR_PUB_PREF_LI, (String) null);
        String string3 = sharedPreferences.getString(AdConstants.IABCONSENT_CONSENT_STRING, (String) null);
        String string4 = sharedPreferences.getString(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, (String) null);
        String string5 = sharedPreferences.getString(AdConstants.IABCONSENT_CONSENT_STRING_TCF2, (String) null);
        if (string4 == null && string5 == null) {
            if (string3 != null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(Constants.URL_CAMPAIGN, string3);
                } catch (JSONException unused) {
                    this.logger.mo10942w("INVALID JSON formed for GDPR clause");
                    return null;
                }
            } else {
                jSONObject = null;
            }
            if (string != null) {
                String trim = string.trim();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("e", trim);
            }
            if (string2 != null) {
                String trim2 = string2.trim();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("i", trim2);
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (string4 != null) {
            jSONObject2.put("e", string4);
        }
        if (string5 != null) {
            jSONObject2.put(Constants.URL_CAMPAIGN, string5);
        }
        return jSONObject2;
    }

    public String getGdprSubjectTcf2() {
        return this.prefs.getString(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, (String) null);
    }

    public String getGdprConsent_Tcf2() {
        return this.prefs.getString(AdConstants.IABCONSENT_CONSENT_STRING_TCF2, (String) null);
    }
}
