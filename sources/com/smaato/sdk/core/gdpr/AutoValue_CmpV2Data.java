package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.gdpr.CmpV2Data;

final class AutoValue_CmpV2Data extends CmpV2Data {
    private final boolean cmpPresent;
    private final String cmpSdkVersion;
    private final String consentString;
    private final String policyVersion;
    private final String publisherCC;
    private final String publisherConsent;
    private final String publisherCustomPurposesConsents;
    private final String publisherCustomPurposesLegitimateInterests;
    private final String publisherLegitimateInterests;
    private final String publisherRestrictions;
    private final String purposeLegitimateInterests;
    private final String purposeOneTreatment;
    private final String purposesString;
    private final String sdkId;
    private final String specialFeaturesOptIns;
    private final SubjectToGdpr subjectToGdpr;
    private final String useNonStandardStacks;
    private final String vendorLegitimateInterests;
    private final String vendorsString;

    /* synthetic */ AutoValue_CmpV2Data(boolean z, SubjectToGdpr subjectToGdpr2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, byte b) {
        this(z, subjectToGdpr2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    private AutoValue_CmpV2Data(boolean z, SubjectToGdpr subjectToGdpr2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.cmpPresent = z;
        this.subjectToGdpr = subjectToGdpr2;
        this.consentString = str;
        this.vendorsString = str2;
        this.purposesString = str3;
        this.sdkId = str4;
        this.cmpSdkVersion = str5;
        this.policyVersion = str6;
        this.publisherCC = str7;
        this.purposeOneTreatment = str8;
        this.useNonStandardStacks = str9;
        this.vendorLegitimateInterests = str10;
        this.purposeLegitimateInterests = str11;
        this.specialFeaturesOptIns = str12;
        this.publisherRestrictions = str13;
        this.publisherConsent = str14;
        this.publisherLegitimateInterests = str15;
        this.publisherCustomPurposesConsents = str16;
        this.publisherCustomPurposesLegitimateInterests = str17;
    }

    public final boolean isCmpPresent() {
        return this.cmpPresent;
    }

    public final SubjectToGdpr getSubjectToGdpr() {
        return this.subjectToGdpr;
    }

    public final String getConsentString() {
        return this.consentString;
    }

    public final String getVendorsString() {
        return this.vendorsString;
    }

    public final String getPurposesString() {
        return this.purposesString;
    }

    public final String getSdkId() {
        return this.sdkId;
    }

    public final String getCmpSdkVersion() {
        return this.cmpSdkVersion;
    }

    public final String getPolicyVersion() {
        return this.policyVersion;
    }

    public final String getPublisherCC() {
        return this.publisherCC;
    }

    public final String getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final String getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public final String getVendorLegitimateInterests() {
        return this.vendorLegitimateInterests;
    }

    public final String getPurposeLegitimateInterests() {
        return this.purposeLegitimateInterests;
    }

    public final String getSpecialFeaturesOptIns() {
        return this.specialFeaturesOptIns;
    }

    public final String getPublisherRestrictions() {
        return this.publisherRestrictions;
    }

    public final String getPublisherConsent() {
        return this.publisherConsent;
    }

    public final String getPublisherLegitimateInterests() {
        return this.publisherLegitimateInterests;
    }

    public final String getPublisherCustomPurposesConsents() {
        return this.publisherCustomPurposesConsents;
    }

    public final String getPublisherCustomPurposesLegitimateInterests() {
        return this.publisherCustomPurposesLegitimateInterests;
    }

    public final String toString() {
        return "CmpV2Data{cmpPresent=" + this.cmpPresent + ", subjectToGdpr=" + this.subjectToGdpr + ", consentString=" + this.consentString + ", vendorsString=" + this.vendorsString + ", purposesString=" + this.purposesString + ", sdkId=" + this.sdkId + ", cmpSdkVersion=" + this.cmpSdkVersion + ", policyVersion=" + this.policyVersion + ", publisherCC=" + this.publisherCC + ", purposeOneTreatment=" + this.purposeOneTreatment + ", useNonStandardStacks=" + this.useNonStandardStacks + ", vendorLegitimateInterests=" + this.vendorLegitimateInterests + ", purposeLegitimateInterests=" + this.purposeLegitimateInterests + ", specialFeaturesOptIns=" + this.specialFeaturesOptIns + ", publisherRestrictions=" + this.publisherRestrictions + ", publisherConsent=" + this.publisherConsent + ", publisherLegitimateInterests=" + this.publisherLegitimateInterests + ", publisherCustomPurposesConsents=" + this.publisherCustomPurposesConsents + ", publisherCustomPurposesLegitimateInterests=" + this.publisherCustomPurposesLegitimateInterests + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r1 = r4.publisherRestrictions;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.core.gdpr.CmpV2Data
            r2 = 0
            if (r1 == 0) goto L_0x00f5
            com.smaato.sdk.core.gdpr.CmpV2Data r5 = (com.smaato.sdk.core.gdpr.CmpV2Data) r5
            boolean r1 = r4.cmpPresent
            boolean r3 = r5.isCmpPresent()
            if (r1 != r3) goto L_0x00f5
            com.smaato.sdk.core.gdpr.SubjectToGdpr r1 = r4.subjectToGdpr
            com.smaato.sdk.core.gdpr.SubjectToGdpr r3 = r5.getSubjectToGdpr()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.consentString
            java.lang.String r3 = r5.getConsentString()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.vendorsString
            java.lang.String r3 = r5.getVendorsString()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.purposesString
            java.lang.String r3 = r5.getPurposesString()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.sdkId
            java.lang.String r3 = r5.getSdkId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.cmpSdkVersion
            java.lang.String r3 = r5.getCmpSdkVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.policyVersion
            java.lang.String r3 = r5.getPolicyVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.publisherCC
            java.lang.String r3 = r5.getPublisherCC()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.purposeOneTreatment
            java.lang.String r3 = r5.getPurposeOneTreatment()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.useNonStandardStacks
            java.lang.String r3 = r5.getUseNonStandardStacks()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.vendorLegitimateInterests
            java.lang.String r3 = r5.getVendorLegitimateInterests()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.purposeLegitimateInterests
            java.lang.String r3 = r5.getPurposeLegitimateInterests()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.specialFeaturesOptIns
            java.lang.String r3 = r5.getSpecialFeaturesOptIns()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.publisherRestrictions
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = r5.getPublisherRestrictions()
            if (r1 != 0) goto L_0x00f5
            goto L_0x00c4
        L_0x00ba:
            java.lang.String r3 = r5.getPublisherRestrictions()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
        L_0x00c4:
            java.lang.String r1 = r4.publisherConsent
            java.lang.String r3 = r5.getPublisherConsent()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.publisherLegitimateInterests
            java.lang.String r3 = r5.getPublisherLegitimateInterests()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.publisherCustomPurposesConsents
            java.lang.String r3 = r5.getPublisherCustomPurposesConsents()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r4.publisherCustomPurposesLegitimateInterests
            java.lang.String r5 = r5.getPublisherCustomPurposesLegitimateInterests()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00f5
            return r0
        L_0x00f5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.gdpr.AutoValue_CmpV2Data.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.cmpPresent ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.subjectToGdpr.hashCode()) * 1000003) ^ this.consentString.hashCode()) * 1000003) ^ this.vendorsString.hashCode()) * 1000003) ^ this.purposesString.hashCode()) * 1000003) ^ this.sdkId.hashCode()) * 1000003) ^ this.cmpSdkVersion.hashCode()) * 1000003) ^ this.policyVersion.hashCode()) * 1000003) ^ this.publisherCC.hashCode()) * 1000003) ^ this.purposeOneTreatment.hashCode()) * 1000003) ^ this.useNonStandardStacks.hashCode()) * 1000003) ^ this.vendorLegitimateInterests.hashCode()) * 1000003) ^ this.purposeLegitimateInterests.hashCode()) * 1000003) ^ this.specialFeaturesOptIns.hashCode()) * 1000003;
        String str = this.publisherRestrictions;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.publisherConsent.hashCode()) * 1000003) ^ this.publisherLegitimateInterests.hashCode()) * 1000003) ^ this.publisherCustomPurposesConsents.hashCode()) * 1000003) ^ this.publisherCustomPurposesLegitimateInterests.hashCode();
    }

    static final class Builder extends CmpV2Data.Builder {
        private Boolean cmpPresent;
        private String cmpSdkVersion;
        private String consentString;
        private String policyVersion;
        private String publisherCC;
        private String publisherConsent;
        private String publisherCustomPurposesConsents;
        private String publisherCustomPurposesLegitimateInterests;
        private String publisherLegitimateInterests;
        private String publisherRestrictions;
        private String purposeLegitimateInterests;
        private String purposeOneTreatment;
        private String purposesString;
        private String sdkId;
        private String specialFeaturesOptIns;
        private SubjectToGdpr subjectToGdpr;
        private String useNonStandardStacks;
        private String vendorLegitimateInterests;
        private String vendorsString;

        Builder() {
        }

        public final CmpV2Data.Builder setCmpPresent(boolean z) {
            this.cmpPresent = Boolean.valueOf(z);
            return this;
        }

        public final CmpV2Data.Builder setSubjectToGdpr(SubjectToGdpr subjectToGdpr2) {
            if (subjectToGdpr2 != null) {
                this.subjectToGdpr = subjectToGdpr2;
                return this;
            }
            throw new NullPointerException("Null subjectToGdpr");
        }

        public final CmpV2Data.Builder setConsentString(String str) {
            if (str != null) {
                this.consentString = str;
                return this;
            }
            throw new NullPointerException("Null consentString");
        }

        public final CmpV2Data.Builder setVendorsString(String str) {
            if (str != null) {
                this.vendorsString = str;
                return this;
            }
            throw new NullPointerException("Null vendorsString");
        }

        public final CmpV2Data.Builder setPurposesString(String str) {
            if (str != null) {
                this.purposesString = str;
                return this;
            }
            throw new NullPointerException("Null purposesString");
        }

        public final CmpV2Data.Builder setSdkId(String str) {
            if (str != null) {
                this.sdkId = str;
                return this;
            }
            throw new NullPointerException("Null sdkId");
        }

        public final CmpV2Data.Builder setCmpSdkVersion(String str) {
            if (str != null) {
                this.cmpSdkVersion = str;
                return this;
            }
            throw new NullPointerException("Null cmpSdkVersion");
        }

        public final CmpV2Data.Builder setPolicyVersion(String str) {
            if (str != null) {
                this.policyVersion = str;
                return this;
            }
            throw new NullPointerException("Null policyVersion");
        }

        public final CmpV2Data.Builder setPublisherCC(String str) {
            if (str != null) {
                this.publisherCC = str;
                return this;
            }
            throw new NullPointerException("Null publisherCC");
        }

        public final CmpV2Data.Builder setPurposeOneTreatment(String str) {
            if (str != null) {
                this.purposeOneTreatment = str;
                return this;
            }
            throw new NullPointerException("Null purposeOneTreatment");
        }

        public final CmpV2Data.Builder setUseNonStandardStacks(String str) {
            if (str != null) {
                this.useNonStandardStacks = str;
                return this;
            }
            throw new NullPointerException("Null useNonStandardStacks");
        }

        public final CmpV2Data.Builder setVendorLegitimateInterests(String str) {
            if (str != null) {
                this.vendorLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null vendorLegitimateInterests");
        }

        public final CmpV2Data.Builder setPurposeLegitimateInterests(String str) {
            if (str != null) {
                this.purposeLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null purposeLegitimateInterests");
        }

        public final CmpV2Data.Builder setSpecialFeaturesOptIns(String str) {
            if (str != null) {
                this.specialFeaturesOptIns = str;
                return this;
            }
            throw new NullPointerException("Null specialFeaturesOptIns");
        }

        public final CmpV2Data.Builder setPublisherRestrictions(String str) {
            this.publisherRestrictions = str;
            return this;
        }

        public final CmpV2Data.Builder setPublisherConsent(String str) {
            if (str != null) {
                this.publisherConsent = str;
                return this;
            }
            throw new NullPointerException("Null publisherConsent");
        }

        public final CmpV2Data.Builder setPublisherLegitimateInterests(String str) {
            if (str != null) {
                this.publisherLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null publisherLegitimateInterests");
        }

        public final CmpV2Data.Builder setPublisherCustomPurposesConsents(String str) {
            if (str != null) {
                this.publisherCustomPurposesConsents = str;
                return this;
            }
            throw new NullPointerException("Null publisherCustomPurposesConsents");
        }

        public final CmpV2Data.Builder setPublisherCustomPurposesLegitimateInterests(String str) {
            if (str != null) {
                this.publisherCustomPurposesLegitimateInterests = str;
                return this;
            }
            throw new NullPointerException("Null publisherCustomPurposesLegitimateInterests");
        }

        public final CmpV2Data build() {
            String str = "";
            if (this.cmpPresent == null) {
                str = str + " cmpPresent";
            }
            if (this.subjectToGdpr == null) {
                str = str + " subjectToGdpr";
            }
            if (this.consentString == null) {
                str = str + " consentString";
            }
            if (this.vendorsString == null) {
                str = str + " vendorsString";
            }
            if (this.purposesString == null) {
                str = str + " purposesString";
            }
            if (this.sdkId == null) {
                str = str + " sdkId";
            }
            if (this.cmpSdkVersion == null) {
                str = str + " cmpSdkVersion";
            }
            if (this.policyVersion == null) {
                str = str + " policyVersion";
            }
            if (this.publisherCC == null) {
                str = str + " publisherCC";
            }
            if (this.purposeOneTreatment == null) {
                str = str + " purposeOneTreatment";
            }
            if (this.useNonStandardStacks == null) {
                str = str + " useNonStandardStacks";
            }
            if (this.vendorLegitimateInterests == null) {
                str = str + " vendorLegitimateInterests";
            }
            if (this.purposeLegitimateInterests == null) {
                str = str + " purposeLegitimateInterests";
            }
            if (this.specialFeaturesOptIns == null) {
                str = str + " specialFeaturesOptIns";
            }
            if (this.publisherConsent == null) {
                str = str + " publisherConsent";
            }
            if (this.publisherLegitimateInterests == null) {
                str = str + " publisherLegitimateInterests";
            }
            if (this.publisherCustomPurposesConsents == null) {
                str = str + " publisherCustomPurposesConsents";
            }
            if (this.publisherCustomPurposesLegitimateInterests == null) {
                str = str + " publisherCustomPurposesLegitimateInterests";
            }
            if (str.isEmpty()) {
                return new AutoValue_CmpV2Data(this.cmpPresent.booleanValue(), this.subjectToGdpr, this.consentString, this.vendorsString, this.purposesString, this.sdkId, this.cmpSdkVersion, this.policyVersion, this.publisherCC, this.purposeOneTreatment, this.useNonStandardStacks, this.vendorLegitimateInterests, this.purposeLegitimateInterests, this.specialFeaturesOptIns, this.publisherRestrictions, this.publisherConsent, this.publisherLegitimateInterests, this.publisherCustomPurposesConsents, this.publisherCustomPurposesLegitimateInterests, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
