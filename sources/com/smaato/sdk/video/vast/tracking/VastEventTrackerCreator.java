package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class VastEventTrackerCreator {
    private final BeaconTracker beaconTracker;
    private final ExecutorService executorService;
    private final Logger logger;
    private final MacrosInjectorProviderFunction macroInjectorProvider;

    public VastEventTrackerCreator(Logger logger2, BeaconTracker beaconTracker2, MacrosInjectorProviderFunction macrosInjectorProviderFunction, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjectorProvider = (MacrosInjectorProviderFunction) Objects.requireNonNull(macrosInjectorProviderFunction);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
    }

    private static void extractTrackingsToMap(Map<VastEvent, LinkedList<C8938Tracking>> map, List<C8938Tracking> list) {
        for (C8938Tracking next : list) {
            if (!map.containsKey(next.vastEvent)) {
                map.put(next.vastEvent, new LinkedList());
            }
            Objects.onNotNull(map.get(next.vastEvent), new Consumer() {
                public final void accept(Object obj) {
                    ((LinkedList) obj).add(C8938Tracking.this);
                }
            });
        }
    }

    public VastEventTracker createEventTracker(VastScenario vastScenario, SomaApiContext somaApiContext) {
        HashMap hashMap = new HashMap();
        extractTrackingsToMap(hashMap, vastScenario.vastMediaFileScenario.trackingEvents);
        VastCompanionScenario vastCompanionScenario = vastScenario.vastCompanionScenario;
        if (vastCompanionScenario != null) {
            extractTrackingsToMap(hashMap, vastCompanionScenario.trackingEvents);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        return new VastEventTracker(this.logger, this.beaconTracker, unmodifiableMap, OffsetEventsManager.fromTrackingsMap(unmodifiableMap, vastScenario.vastMediaFileScenario.duration, this.logger), (MacroInjector) this.macroInjectorProvider.apply(vastScenario), somaApiContext, this.executorService);
    }
}
