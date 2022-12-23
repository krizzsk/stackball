package com.chartboost.sdk.Privacy.model;

import com.facebook.appevents.AppEventsConstants;
import org.json.JSONObject;

public class GDPR extends C1864a {
    public static final String GDPR_STANDARD = "gdpr";

    public enum GDPR_CONSENT {
        NON_BEHAVIORAL(AppEventsConstants.EVENT_PARAM_VALUE_NO),
        BEHAVIORAL("1");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f4606a;

        private GDPR_CONSENT(String str) {
            this.f4606a = str;
        }

        public static GDPR_CONSENT fromValue(String str) {
            if (NON_BEHAVIORAL.getValue().equals(str)) {
                return NON_BEHAVIORAL;
            }
            if (BEHAVIORAL.getValue().equals(str)) {
                return BEHAVIORAL;
            }
            return null;
        }

        public String getValue() {
            return this.f4606a;
        }
    }

    public GDPR(GDPR_CONSENT gdpr_consent) {
        if (gdpr_consent == null || !isValidConsent(gdpr_consent.getValue())) {
            mo14369a("Invalid GDPR consent values. Use provided values or Custom class. Value: " + gdpr_consent);
            return;
        }
        this.f4607a = "gdpr";
        this.f4608b = gdpr_consent.getValue();
    }

    public /* bridge */ /* synthetic */ String getConsent() {
        return super.getConsent();
    }

    public /* bridge */ /* synthetic */ String getPrivacyStandard() {
        return super.getPrivacyStandard();
    }

    public boolean isValidConsent(String str) {
        return GDPR_CONSENT.NON_BEHAVIORAL.f4606a.equals(str) || GDPR_CONSENT.BEHAVIORAL.f4606a.equals(str);
    }

    public /* bridge */ /* synthetic */ JSONObject toJson() {
        return super.toJson();
    }
}
