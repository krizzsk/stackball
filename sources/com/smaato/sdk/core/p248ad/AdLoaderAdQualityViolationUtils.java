package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;

/* renamed from: com.smaato.sdk.core.ad.AdLoaderAdQualityViolationUtils */
public final class AdLoaderAdQualityViolationUtils {
    final AdQualityViolationReporter adQualityViolationReporter;

    public AdLoaderAdQualityViolationUtils(AdQualityViolationReporter adQualityViolationReporter2) {
        this.adQualityViolationReporter = (AdQualityViolationReporter) Objects.requireNonNull(adQualityViolationReporter2);
    }
}
