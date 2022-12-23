package com.chartboost.sdk.impl;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* renamed from: com.chartboost.sdk.impl.v0 */
public class C1988v0 {

    /* renamed from: a */
    public static Chartboost.CBPIDataUseConsent f5103a = Chartboost.CBPIDataUseConsent.UNKNOWN;

    /* renamed from: a */
    public static int m4825a() {
        return Math.max(0, f5103a.getValue());
    }

    /* renamed from: b */
    public static int m4829b() {
        return f5103a == Chartboost.CBPIDataUseConsent.UNKNOWN ? 0 : 1;
    }

    /* renamed from: a */
    public static void m4827a(DataUseConsent dataUseConsent) {
        if ("gdpr".equals(dataUseConsent.getPrivacyStandard())) {
            try {
                m4826a(Integer.parseInt(dataUseConsent.getConsent()));
            } catch (NumberFormatException unused) {
                CBLogging.m3993b("PrivacyManager", "Cannot parse consent while setting GDPR");
            }
        }
    }

    /* renamed from: a */
    public static void m4828a(String str) {
        if ("gdpr".equals(str)) {
            m4826a(Chartboost.CBPIDataUseConsent.UNKNOWN.getValue());
        }
    }

    /* renamed from: a */
    public static void m4826a(int i) {
        Chartboost.CBPIDataUseConsent valueOf = Chartboost.CBPIDataUseConsent.valueOf(i);
        f5103a = valueOf;
        if (valueOf == Chartboost.CBPIDataUseConsent.UNKNOWN) {
            CBLogging.m3997e("PrivacyManager", "setPersonalInformationDataUseConsent set consent to UNKNOWN");
        }
    }
}
