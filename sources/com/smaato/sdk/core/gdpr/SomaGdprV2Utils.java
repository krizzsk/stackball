package com.smaato.sdk.core.gdpr;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.sys.LocationAware;
import java.util.EnumMap;

public final class SomaGdprV2Utils implements SomaGdprUtils {
    private final LocationAware locationAware;

    SomaGdprV2Utils(LocationAware locationAware2) {
        this.locationAware = locationAware2;
    }

    public final SomaGdprData createSomaGdprData(CmpData cmpData) {
        Objects.requireNonNull(cmpData, "cmpData must not be null for SomaGdprData::from");
        CmpV2Data cmpV2Data = (CmpV2Data) cmpData;
        SubjectToGdpr subjectToGdpr = cmpV2Data.getSubjectToGdpr();
        String consentString = cmpV2Data.getConsentString();
        EnumMap enumMap = new EnumMap(PiiParam.class);
        for (PiiParam piiParam : PiiParam.values()) {
            int i = C86441.$SwitchMap$com$smaato$sdk$core$gdpr$SubjectToGdpr[cmpV2Data.getSubjectToGdpr().ordinal()];
            boolean z = true;
            if (i == 1) {
                if (!TextUtils.isEmpty(cmpV2Data.getConsentString())) {
                    if (piiParam != PiiParam.LOAD_ADS) {
                        z = canAccessPrivateDataWhenConsentStringValid(cmpV2Data, piiParam);
                    } else if (!isBitString(cmpV2Data.getPurposesString())) {
                        if (!isConsentGiven(cmpV2Data.getPurposesString(), CmpV2Purpose.INFORMATION_STORAGE_AND_ACCESS.f21791id)) {
                            if (isConsentGiven(cmpV2Data.getPurposesString(), CmpV2Purpose.SELECT_BASIS_ADS.f21791id)) {
                            }
                        }
                    }
                }
                z = false;
            } else if (i != 2) {
                String consentString2 = cmpV2Data.getConsentString();
                String vendorsString = cmpV2Data.getVendorsString();
                String purposesString = cmpV2Data.getPurposesString();
                if (!TextUtils.isEmpty(consentString2) && isBitString(vendorsString) && isBitString(purposesString) && piiParam != PiiParam.LOAD_ADS) {
                    z = canAccessPrivateDataWhenConsentStringValid(cmpV2Data, piiParam);
                }
            }
            enumMap.put(piiParam, Boolean.valueOf(z));
        }
        return new SomaGdprData(subjectToGdpr, consentString, enumMap, this.locationAware);
    }

    /* renamed from: com.smaato.sdk.core.gdpr.SomaGdprV2Utils$1 */
    static /* synthetic */ class C86441 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$gdpr$SubjectToGdpr;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.smaato.sdk.core.gdpr.SubjectToGdpr[] r0 = com.smaato.sdk.core.gdpr.SubjectToGdpr.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$gdpr$SubjectToGdpr = r0
                com.smaato.sdk.core.gdpr.SubjectToGdpr r1 = com.smaato.sdk.core.gdpr.SubjectToGdpr.CMP_GDPR_ENABLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$gdpr$SubjectToGdpr     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.gdpr.SubjectToGdpr r1 = com.smaato.sdk.core.gdpr.SubjectToGdpr.CMP_GDPR_DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$gdpr$SubjectToGdpr     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.gdpr.SubjectToGdpr r1 = com.smaato.sdk.core.gdpr.SubjectToGdpr.CMP_GDPR_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.gdpr.SomaGdprV2Utils.C86441.<clinit>():void");
        }
    }

    private static boolean canAccessPrivateDataWhenConsentStringValid(CmpV2Data cmpV2Data, PiiParam piiParam) {
        String purposesString = cmpV2Data.getPurposesString();
        String vendorsString = cmpV2Data.getVendorsString();
        String purposeLegitimateInterests = cmpV2Data.getPurposeLegitimateInterests();
        String vendorLegitimateInterests = cmpV2Data.getVendorLegitimateInterests();
        String specialFeaturesOptIns = cmpV2Data.getSpecialFeaturesOptIns();
        boolean isConsentGiven = isConsentGiven(purposesString, CmpV2Purpose.INFORMATION_STORAGE_AND_ACCESS.f21791id);
        boolean isConsentGiven2 = isConsentGiven(purposesString, CmpV2Purpose.SELECT_BASIS_ADS.f21791id);
        boolean isConsentGiven3 = isConsentGiven(purposeLegitimateInterests, CmpV2Purpose.SELECT_BASIS_ADS.f21791id);
        boolean isConsentGiven4 = isConsentGiven(vendorsString, 82);
        boolean isConsentGiven5 = isConsentGiven(vendorLegitimateInterests, 82);
        boolean isConsentGiven6 = isConsentGiven(specialFeaturesOptIns, 1);
        boolean z = isConsentGiven && isConsentGiven4 && (isConsentGiven2 || (isConsentGiven3 && isConsentGiven5));
        if (z && isConsentGiven6) {
            return true;
        }
        if (!z || piiParam == PiiParam.GPS) {
            return false;
        }
        return true;
    }

    private static boolean isBitString(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private static boolean isConsentGiven(String str, int i) {
        if (isBitString(str) && i <= str.length() && i > 0 && '1' == str.charAt(i - 1)) {
            return true;
        }
        return false;
    }
}
