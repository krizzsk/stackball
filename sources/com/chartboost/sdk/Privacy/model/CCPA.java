package com.chartboost.sdk.Privacy.model;

import org.json.JSONObject;

public class CCPA extends C1864a {
    public static final String CCPA_STANDARD = "us_privacy";

    public enum CCPA_CONSENT {
        OPT_OUT_SALE("1NY-"),
        OPT_IN_SALE("1NN-");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f4605a;

        private CCPA_CONSENT(String str) {
            this.f4605a = str;
        }

        public static CCPA_CONSENT fromValue(String str) {
            if (OPT_OUT_SALE.getValue().equals(str)) {
                return OPT_OUT_SALE;
            }
            if (OPT_IN_SALE.getValue().equals(str)) {
                return OPT_IN_SALE;
            }
            return null;
        }

        public String getValue() {
            return this.f4605a;
        }
    }

    public CCPA(CCPA_CONSENT ccpa_consent) {
        if (ccpa_consent == null || !isValidConsent(ccpa_consent.getValue())) {
            mo14369a("Invalid CCPA consent values. Use provided values or Custom class. Value: " + ccpa_consent);
            return;
        }
        this.f4607a = CCPA_STANDARD;
        this.f4608b = ccpa_consent.getValue();
    }

    public /* bridge */ /* synthetic */ String getConsent() {
        return super.getConsent();
    }

    public /* bridge */ /* synthetic */ String getPrivacyStandard() {
        return super.getPrivacyStandard();
    }

    public boolean isValidConsent(String str) {
        return CCPA_CONSENT.OPT_OUT_SALE.f4605a.equals(str) || CCPA_CONSENT.OPT_IN_SALE.f4605a.equals(str);
    }

    public /* bridge */ /* synthetic */ JSONObject toJson() {
        return super.toJson();
    }
}
