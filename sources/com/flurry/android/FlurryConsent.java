package com.flurry.android;

import java.util.Map;

public final class FlurryConsent extends Consent {
    public FlurryConsent(boolean z, Map<String, String> map) throws IllegalArgumentException {
        if (!z || (map != null && !map.isEmpty())) {
            this.isGdprScope = z;
            this.consentStrings = map;
            return;
        }
        throw new IllegalArgumentException("Consent strings can not be null or empty when in scope of GDPR");
    }
}
