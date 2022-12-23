package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class VastBeaconTrackerCreator {
    private final Function<VastBeacon, String> beaconToUrlMapper = $$Lambda$VastBeaconTrackerCreator$nfVDZ3Faovlz8149WDuimxbN2xE.INSTANCE;
    private final BeaconTracker beaconTracker;
    private final ExecutorService executorService;
    private final Logger logger;
    private final MacrosInjectorProviderFunction macrosInjectorProvider;

    public VastBeaconTrackerCreator(Logger logger2, BeaconTracker beaconTracker2, MacrosInjectorProviderFunction macrosInjectorProviderFunction, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macrosInjectorProvider = (MacrosInjectorProviderFunction) Objects.requireNonNull(macrosInjectorProviderFunction);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
    }

    public VastBeaconTracker createBeaconTracker(VastScenario vastScenario, SomaApiContext somaApiContext) {
        Logger logger2 = this.logger;
        BeaconTracker beaconTracker2 = this.beaconTracker;
        MacroInjector macroInjector = (MacroInjector) this.macrosInjectorProvider.apply(vastScenario);
        HashMap hashMap = new HashMap();
        fillForKey(hashMap, VastBeaconEvent.SMAATO_IMPRESSION, Iterables.map(vastScenario.impressions, this.beaconToUrlMapper));
        if (vastScenario.viewableImpression != null) {
            fillForKey(hashMap, VastBeaconEvent.SMAATO_VIEWABLE_IMPRESSION, vastScenario.viewableImpression.viewable);
        }
        VastMediaFileScenario vastMediaFileScenario = vastScenario.vastMediaFileScenario;
        if (vastMediaFileScenario.videoClicks != null) {
            fillForKey(hashMap, VastBeaconEvent.SMAATO_VIDEO_CLICK_TRACKING, Iterables.map(vastMediaFileScenario.videoClicks.clickTrackings, this.beaconToUrlMapper));
        }
        VastIconScenario vastIconScenario = vastMediaFileScenario.vastIconScenario;
        if (vastIconScenario != null) {
            if (vastIconScenario.iconClicks != null) {
                fillForKey(hashMap, VastBeaconEvent.SMAATO_ICON_CLICK_TRACKING, Iterables.map(vastIconScenario.iconClicks.iconClickTrackings, this.beaconToUrlMapper));
            }
            fillForKey(hashMap, VastBeaconEvent.SMAATO_ICON_VIEW_TRACKING, vastIconScenario.iconViewTrackings);
        }
        VastCompanionScenario vastCompanionScenario = vastScenario.vastCompanionScenario;
        if (vastCompanionScenario != null) {
            fillForKey(hashMap, VastBeaconEvent.SMAATO_COMPANION_CLICK_TRACKING, Iterables.map(vastCompanionScenario.companionClickTrackings, this.beaconToUrlMapper));
        }
        return new VastBeaconTracker(logger2, somaApiContext, beaconTracker2, macroInjector, new VastTrackingBeaconsManager(Collections.unmodifiableMap(hashMap)), this.executorService);
    }

    private static void fillForKey(Map<VastBeaconEvent, Set<String>> map, VastBeaconEvent vastBeaconEvent, Iterable<String> iterable) {
        if (!map.containsKey(vastBeaconEvent)) {
            map.put(vastBeaconEvent, Collections.unmodifiableSet(Sets.toSet(iterable)));
        } else {
            throw new IllegalArgumentException(String.format("beaconsEventsMap already contains %s event", new Object[]{vastBeaconEvent}));
        }
    }
}
