package com.flurry.sdk;

import com.flurry.android.Consent;
import java.util.Map;

/* renamed from: com.flurry.sdk.ez */
public abstract class C2637ez extends Consent {

    /* renamed from: a */
    private boolean f6196a;

    public C2637ez(boolean z, boolean z2, Map<String, String> map) throws IllegalArgumentException {
        if (z || !z2 || (map != null && !map.isEmpty())) {
            this.f6196a = z;
            this.isGdprScope = z2;
            this.consentStrings = map;
            return;
        }
        throw new IllegalArgumentException("Consent strings can not be null or empty when in scope of GDPR");
    }

    public boolean isLICNEnabled() {
        return this.f6196a;
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && this.f6196a == ((C2637ez) obj).isLICNEnabled();
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.f6196a ? 1 : 0);
    }
}
