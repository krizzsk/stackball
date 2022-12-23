package com.flurry.sdk;

import com.flurry.android.Consent;
import java.util.Map;

/* renamed from: com.flurry.sdk.cj */
public final class C2493cj {
    /* renamed from: a */
    public static boolean m5370a(Consent consent) {
        boolean isGdprScope = consent.isGdprScope();
        Map<String, String> consentStrings = consent.getConsentStrings();
        return consent instanceof C2637ez ? ((C2637ez) consent).isLICNEnabled() || !isGdprScope || (consentStrings != null && !consentStrings.isEmpty()) : !isGdprScope || (consentStrings != null && !consentStrings.isEmpty());
    }
}
