package com.smaato.sdk.core.gdpr.tcfv2;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.DateEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.model.PurposeRestrictionVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.gvl.Purpose;
import java.util.Map;
import java.util.regex.Pattern;

public class TCModel {
    static final String TAG = TCModel.class.getName();

    /* renamed from: p */
    static Pattern f21793p = Pattern.compile("[A-Z]{2}", 2);
    int cmpId = 0;
    int cmpVersion = 0;
    String consentLanguage;
    int consentScreen = 0;
    private String created = DateEncoder.getInstance().decode((String) null);
    Map<String, Purpose> customPurposes;
    Boolean isServiceSpecific = Boolean.FALSE;
    String lastUpdated = DateEncoder.getInstance().decode((String) null);
    int policyVersion = 2;
    SortedVector publisherConsents = new SortedVector();
    String publisherCountryCode = "EN";
    SortedVector publisherCustomConsents = new SortedVector();
    SortedVector publisherCustomLegitimateInterest = new SortedVector();
    SortedVector publisherLegitimateInterest = new SortedVector();
    PurposeRestrictionVector publisherRestrictions = new PurposeRestrictionVector();
    SortedVector purposeConsents = new SortedVector();
    SortedVector purposeLegitimateInterest = new SortedVector();
    Boolean purposeOneTreatment = Boolean.FALSE;
    SortedVector specialFeatureOptIns = new SortedVector();
    Boolean supportOOB = Boolean.FALSE;
    Boolean useNonStandardStacks = Boolean.FALSE;
    SortedVector vendorConsents = new SortedVector();
    SortedVector vendorLegitimateInterest = new SortedVector();
    int vendorListVersion = 0;
    SortedVector vendorsAllowed = new SortedVector();
    SortedVector vendorsDisclosed = new SortedVector();
    private int version = 2;

    TCModel() {
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        if (i <= 0 || i > 2) {
            Log.e(TAG, "Incorrect Version: ".concat(String.valueOf(i)));
        } else {
            this.version = i;
        }
    }

    public int getPolicyVersion() {
        return this.policyVersion;
    }

    public Boolean getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public Boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public String getPublisherCountryCode() {
        return this.publisherCountryCode;
    }

    public int getCmpId() {
        return this.cmpId;
    }

    public int getCmpVersion() {
        return this.cmpVersion;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String str) {
        this.created = str;
    }

    public int getNumCustomPurposes() {
        Map<String, Purpose> map = this.customPurposes;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public SortedVector getSpecialFeatureOptIns() {
        return this.specialFeatureOptIns;
    }

    public SortedVector getPurposeConsents() {
        return this.purposeConsents;
    }

    public SortedVector getPurposeLegitimateInterest() {
        return this.purposeLegitimateInterest;
    }

    public SortedVector getVendorConsents() {
        return this.vendorConsents;
    }

    public SortedVector getVendorLegitimateInterest() {
        return this.vendorLegitimateInterest;
    }

    public SortedVector getPublisherConsents() {
        return this.publisherConsents;
    }

    public SortedVector getPublisherLegitimateInterest() {
        return this.publisherLegitimateInterest;
    }

    public SortedVector getPublisherCustomConsents() {
        return this.publisherCustomConsents;
    }

    public SortedVector getPublisherCustomLegitimateInterest() {
        return this.publisherCustomLegitimateInterest;
    }

    public Boolean isValid() {
        int i;
        int i2;
        boolean z = true;
        if (this.isServiceSpecific == null || this.useNonStandardStacks == null || this.cmpId == 0 || this.cmpVersion == 0 || this.consentLanguage == null || this.publisherCountryCode == null || this.purposeOneTreatment == null || this.consentScreen == 0 || this.created == null || this.lastUpdated == null || !(((i = this.policyVersion) == 1 || i == 2) && this.vendorListVersion != 0 && ((i2 = this.version) == 2 || i2 == 1))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
