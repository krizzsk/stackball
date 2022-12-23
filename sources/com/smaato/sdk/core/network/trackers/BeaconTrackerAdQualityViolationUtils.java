package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;

public class BeaconTrackerAdQualityViolationUtils {
    final AdQualityViolationReporter adQualityViolationReporter;

    public BeaconTrackerAdQualityViolationUtils(AdQualityViolationReporter adQualityViolationReporter2) {
        this.adQualityViolationReporter = (AdQualityViolationReporter) Objects.requireNonNull(adQualityViolationReporter2);
    }
}
