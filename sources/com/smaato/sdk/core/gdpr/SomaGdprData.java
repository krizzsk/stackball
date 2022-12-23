package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.sys.LocationAware;
import java.util.EnumMap;
import java.util.Map;

public class SomaGdprData {
    private final String consentString;
    private final int gdprVersion = 2;
    private final LocationAware locationAware;
    private final EnumMap<PiiParam, Boolean> piiParamToConsentMap;
    private final SubjectToGdpr subjectToGdpr;

    SomaGdprData(SubjectToGdpr subjectToGdpr2, String str, EnumMap<PiiParam, Boolean> enumMap, LocationAware locationAware2) {
        this.subjectToGdpr = (SubjectToGdpr) Objects.requireNonNull(subjectToGdpr2, "subjectToGdpr must not be null for SomaGdprData::new");
        this.consentString = (String) Objects.requireNonNull(str, "consentString must not be null for SomaGdprData::new");
        EnumMap<PiiParam, Boolean> enumMap2 = new EnumMap<>((EnumMap) Objects.requireNonNull(enumMap, "piiParamToConsentMap must not be null for SomaGdprData::new"));
        this.piiParamToConsentMap = enumMap2;
        this.locationAware = locationAware2;
        for (Map.Entry<PiiParam, Boolean> value : enumMap2.entrySet()) {
            if (value.getValue() == null) {
                throw new IllegalArgumentException("piiParamToConsentMap must not contain null value for SomaGdprData::new");
            }
        }
    }

    public SubjectToGdpr getSubjectToGdpr() {
        return this.subjectToGdpr;
    }

    public Boolean isGdprEnabled() {
        if (this.locationAware.isApplicable() && this.locationAware.isGdprCountry()) {
            return Boolean.TRUE;
        }
        if (this.subjectToGdpr == SubjectToGdpr.CMP_GDPR_UNKNOWN) {
            return null;
        }
        return Boolean.valueOf(this.subjectToGdpr == SubjectToGdpr.CMP_GDPR_ENABLED);
    }

    public String getConsentString() {
        return this.consentString;
    }

    public boolean isUsageAllowedFor(PiiParam piiParam) {
        return Objects.equals(this.piiParamToConsentMap.get(piiParam), Boolean.TRUE);
    }

    public int getGdprVersion() {
        return this.gdprVersion;
    }

    public String toString() {
        return "SomaGdprData{subjectToGdpr=" + this.subjectToGdpr + ", consentString='" + this.consentString + '\'' + ", piiParamToConsentMap=" + this.piiParamToConsentMap + '}';
    }
}
