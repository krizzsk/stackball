package com.smaato.sdk.video.vast.tracking.macro;

import com.facebook.appevents.AppEventsConstants;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.gdpr.SubjectToGdpr;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.vungle.warren.model.Cookie;
import java.util.ArrayList;
import java.util.Map;

final class RegulationInfoMacros {
    private final CoppaProvider coppaProvider;
    private final DataCollector dataCollector;
    private final SomaGdprDataSource somaGdprDataSource;

    interface CoppaProvider extends Supplier<Boolean> {
    }

    RegulationInfoMacros(SomaGdprDataSource somaGdprDataSource2, DataCollector dataCollector2, CoppaProvider coppaProvider2) {
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
        this.coppaProvider = (CoppaProvider) Objects.requireNonNull(coppaProvider2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> toMap() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        return Maps.mapOf(Maps.entryOf("[LIMITADTRACKING]", getGoogleLimitAdTrackingEnabled()), Maps.entryOf("[REGULATIONS]", getRegulations(somaGdprData)), Maps.entryOf("[GDPRCONSENT]", getConsent(somaGdprData)));
    }

    private String getGoogleLimitAdTrackingEnabled() {
        Boolean isGoogleLimitAdTrackingEnabled = this.dataCollector.getSystemInfo().isGoogleLimitAdTrackingEnabled();
        if (isGoogleLimitAdTrackingEnabled == null) {
            return "-2";
        }
        return isGoogleLimitAdTrackingEnabled.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    private String getRegulations(SomaGdprData somaGdprData) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) this.coppaProvider.get()).booleanValue()) {
            arrayList.add(Cookie.COPPA_KEY);
        }
        if (!somaGdprData.getConsentString().isEmpty()) {
            arrayList.add("gdpr");
        } else if (somaGdprData.getSubjectToGdpr() != SubjectToGdpr.CMP_GDPR_UNKNOWN && somaGdprData.getSubjectToGdpr() == SubjectToGdpr.CMP_GDPR_ENABLED) {
            arrayList.add("gdpr");
        }
        return arrayList.isEmpty() ? "-2" : Joiner.join((CharSequence) ",", (Iterable) arrayList);
    }

    private static String getConsent(SomaGdprData somaGdprData) {
        String consentString = somaGdprData.getConsentString();
        return TextUtils.isEmpty(consentString) ? "-2" : consentString;
    }
}
