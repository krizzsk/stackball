package com.smaato.sdk.video.p258ad;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;

/* renamed from: com.smaato.sdk.video.ad.VastErrorTrackerCreator */
public class VastErrorTrackerCreator {
    final BeaconTracker beaconTracker;
    final Logger logger;
    final MacrosInjectorProviderFunction macroInjectorProvider;

    public VastErrorTrackerCreator(Logger logger2, BeaconTracker beaconTracker2, MacrosInjectorProviderFunction macrosInjectorProviderFunction) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjectorProvider = (MacrosInjectorProviderFunction) Objects.requireNonNull(macrosInjectorProviderFunction);
    }
}
