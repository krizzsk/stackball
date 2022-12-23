package com.smaato.sdk.core.gdpr;

import android.content.SharedPreferences;
import com.amazon.device.ads.AdConstants;
import com.facebook.appevents.AppEventsConstants;
import com.smaato.sdk.core.gdpr.tcfv2.TCModel;
import com.smaato.sdk.core.gdpr.tcfv2.TCString;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;

public class IabCmpV2DataStorage implements IabCmpDataStorage {
    private final SharedPreferences defaultSharedPreferences;

    public int getConsentVersion() {
        return 2;
    }

    public IabCmpV2DataStorage(SharedPreferences sharedPreferences) {
        this.defaultSharedPreferences = (SharedPreferences) Objects.requireNonNull(sharedPreferences, "defaultSharedPreferences must not be null for IabCmpV2DataStorage::new");
    }

    public CmpData getCmpData() {
        String consentString = getConsentString();
        if (TextUtils.isEmpty(consentString)) {
            return CmpV2Data.buildEmpty(isCmpPresent(), getSubjectToGdpr(), "").build();
        }
        TCModel decode = TCString.getInstance().decode(consentString);
        if (!decode.isValid().booleanValue()) {
            return CmpV2Data.buildEmpty(isCmpPresent(), getSubjectToGdpr(), consentString).build();
        }
        return CmpV2Data.builder().setCmpPresent(isCmpPresent()).setSubjectToGdpr(getSubjectToGdpr()).setConsentString(consentString).setVendorsString(decode.getVendorConsents().toString()).setPurposesString(decode.getPurposeConsents().toString()).setSdkId(String.valueOf(decode.getCmpId())).setCmpSdkVersion(String.valueOf(decode.getCmpVersion())).setPolicyVersion(String.valueOf(decode.getPolicyVersion())).setPublisherCC((String) Objects.notNull(decode.getPublisherCountryCode(), "")).setPurposeOneTreatment(decode.getPurposeOneTreatment().toString()).setUseNonStandardStacks(decode.getUseNonStandardStacks().toString()).setVendorLegitimateInterests(decode.getVendorLegitimateInterest().toString()).setPurposeLegitimateInterests(decode.getPurposeLegitimateInterest().toString()).setSpecialFeaturesOptIns(decode.getSpecialFeatureOptIns().toString()).setPublisherConsent(decode.getPublisherConsents().toString()).setPublisherLegitimateInterests(decode.getPublisherLegitimateInterest().toString()).setPublisherCustomPurposesConsents(decode.getPublisherCustomConsents().toString()).setPublisherCustomPurposesLegitimateInterests(decode.getPublisherCustomLegitimateInterest().toString()).build();
    }

    public SubjectToGdpr getSubjectToGdpr() {
        String asString = getAsString(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, (String) null);
        for (SubjectToGdpr subjectToGdpr : SubjectToGdpr.values()) {
            if (subjectToGdpr.f21792id.equals(asString)) {
                return subjectToGdpr;
            }
        }
        return SubjectToGdpr.CMP_GDPR_UNKNOWN;
    }

    public String getConsentString() {
        return getAsString(AdConstants.IABCONSENT_CONSENT_STRING_TCF2, "");
    }

    public boolean isCmpPresent() {
        return this.defaultSharedPreferences.contains(AdConstants.IABCONSENT_CONSENT_STRING_TCF2);
    }

    public String getVendorsString() {
        return getAsString("IABTCF_VendorConsents", "");
    }

    public String getPurposesString() {
        return getAsString("IABTCF_PurposeConsents", "");
    }

    public String getSdkId() {
        return getAsString("IABTCF_CmpSdkID", "");
    }

    public String getCmpSdkVersion() {
        return getAsString("IABTCF_CmpSdkVersion", "");
    }

    public String getPolicyVersion() {
        return getAsString("IABTCF_PolicyVersion", "");
    }

    public String getPublisherCC() {
        return getAsString("IABTCF_PublisherCC", "AA");
    }

    public String getPurposeOneTreatment() {
        return getAsString("IABTCF_PurposeOneTreatment", "");
    }

    public String getUseNonStandardStacks() {
        return getAsString("IABTCF_UseNonStandardStacks", "");
    }

    public String getVendorLegitimateInterests() {
        return getAsString("IABTCF_VendorLegitimateInterests", "");
    }

    public String getPurposeLegitimateInterests() {
        return getAsString("IABTCF_PurposeLegitimateInterests", "");
    }

    public String getSpecialFeaturesOptIns() {
        return getAsString("IABTCF_SpecialFeaturesOptIns", "");
    }

    public String getPublisherRestrictions() {
        return getAsString("IABTCF_PublisherRestrictions", "");
    }

    public String getPublisherConsent() {
        return getAsString("IABTCF_PublisherConsent", "");
    }

    public String getPublisherLegitimateInterests() {
        return getAsString("IABTCF_PublisherLegitimateInterests", "");
    }

    public String getPublisherCustomPurposesConsents() {
        return getAsString("IABTCF_PublisherCustomPurposesConsents", "");
    }

    public String getPublisherCustomPurposesLegitimateInterests() {
        return getAsString("IABTCF_PublisherCustomPurposesLegitimateInterests", "");
    }

    public boolean isVendorConsentGivenForVendorId(int i) {
        String vendorsString = getVendorsString();
        if (i <= 0 || vendorsString.length() < i || vendorsString.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    public boolean isVendorLegitimateInterestsGivenForVendorId(int i) {
        String vendorLegitimateInterests = getVendorLegitimateInterests();
        if (i <= 0 || vendorLegitimateInterests.length() < i || vendorLegitimateInterests.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    public boolean isPurposeLegitimateInterestsGivenForVendorId(int i) {
        String purposeLegitimateInterests = getPurposeLegitimateInterests();
        if (i <= 0 || purposeLegitimateInterests.length() < i || purposeLegitimateInterests.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    public boolean isPurposeConsentGivenForPurposeId(int i) {
        String purposesString = getPurposesString();
        if (i <= 0 || purposesString.length() < i || purposesString.charAt(i - 1) != '1') {
            return false;
        }
        return true;
    }

    private String getAsString(String str, String str2) {
        Object obj = this.defaultSharedPreferences.getAll().get(str);
        if (obj == null) {
            return str2;
        }
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        String str3 = (String) obj;
        if ("true".equals(str3)) {
            return "1";
        }
        return "false".equals(str3) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : str3;
    }
}
