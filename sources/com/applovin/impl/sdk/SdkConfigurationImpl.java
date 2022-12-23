package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.sdk.AppLovinSdkConfiguration;

public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a */
    private final C1469j f2612a;

    public SdkConfigurationImpl(C1469j jVar) {
        this.f2612a = jVar;
    }

    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = (String) this.f2612a.mo13088a(C1369c.f3126fh);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    public String toString() {
        return "AppLovinSdkConfiguration{consentDialogState=" + getConsentDialogState() + '}';
    }
}
