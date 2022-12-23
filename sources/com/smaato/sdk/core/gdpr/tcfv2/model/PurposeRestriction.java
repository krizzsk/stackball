package com.smaato.sdk.core.gdpr.tcfv2.model;

import com.smaato.sdk.core.util.Objects;

public class PurposeRestriction {
    private static String hashSeparator = "-";
    private int purposeId;
    private final RestrictionType restrictionType;

    public PurposeRestriction(int i, RestrictionType restrictionType2) {
        this.purposeId = i;
        this.restrictionType = (RestrictionType) Objects.requireNonNull(restrictionType2);
    }

    public String getHash() {
        return this.purposeId + hashSeparator + this.restrictionType.getType();
    }

    public void setPurposeId(int i) {
        this.purposeId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof PurposeRestriction)) {
            return false;
        }
        PurposeRestriction purposeRestriction = (PurposeRestriction) obj;
        return this.purposeId == purposeRestriction.purposeId && this.restrictionType == purposeRestriction.restrictionType;
    }

    public int hashCode() {
        return (this.purposeId * 31) + this.restrictionType.hashCode();
    }
}
