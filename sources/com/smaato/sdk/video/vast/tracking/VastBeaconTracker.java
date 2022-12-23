package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class VastBeaconTracker {
    private final BeaconTracker beaconTracker;
    private final ExecutorService executorService;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MacroInjector macroInjector;
    private final SomaApiContext somaApiContext;
    private final VastTrackingBeaconsManager vastTrackingBeaconsManager;

    VastBeaconTracker(Logger logger2, SomaApiContext somaApiContext2, BeaconTracker beaconTracker2, MacroInjector macroInjector2, VastTrackingBeaconsManager vastTrackingBeaconsManager2, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjector = (MacroInjector) Objects.requireNonNull(macroInjector2);
        this.vastTrackingBeaconsManager = (VastTrackingBeaconsManager) Objects.requireNonNull(vastTrackingBeaconsManager2);
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
    }

    public void trigger(VastBeaconEvent vastBeaconEvent, PlayerState playerState) {
        if (!this.vastTrackingBeaconsManager.trackedBeaconEvents.contains(vastBeaconEvent)) {
            if (this.executorService.isShutdown()) {
                this.logger.error(LogDomain.VAST, "Attempt to trigger event: %s on a already shutdown beacon tracker", vastBeaconEvent);
                return;
            }
            this.executorService.execute(new Runnable(vastBeaconEvent, playerState) {
                public final /* synthetic */ VastBeaconEvent f$1;
                public final /* synthetic */ PlayerState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    VastBeaconTracker.this.lambda$trigger$0$VastBeaconTracker(this.f$1, this.f$2);
                }
            });
        }
    }

    public /* synthetic */ void lambda$trigger$0$VastBeaconTracker(final VastBeaconEvent vastBeaconEvent, PlayerState playerState) {
        Set set;
        Set<T> set2;
        Collection collection;
        VastTrackingBeaconsManager vastTrackingBeaconsManager2 = this.vastTrackingBeaconsManager;
        if (vastTrackingBeaconsManager2.trackedBeaconEvents.contains(vastBeaconEvent) || !vastTrackingBeaconsManager2.trackingBeaconEvents.containsKey(vastBeaconEvent) || (collection = vastTrackingBeaconsManager2.trackingBeaconEvents.get(vastBeaconEvent)) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.unmodifiableSet(new HashSet(collection));
        }
        if (!set.isEmpty()) {
            set2 = Collections.unmodifiableSet(this.macroInjector.injectMacros((Collection<String>) set, playerState));
        } else {
            set2 = Collections.emptySet();
        }
        if (!set2.isEmpty()) {
            this.vastTrackingBeaconsManager.trackedBeaconEvents.add(vastBeaconEvent);
            this.beaconTracker.trackBeaconUrls(set2, this.somaApiContext, new Task.Listener<Whatever, Exception>() {
                public final /* bridge */ /* synthetic */ void onFailure(Task task, Object obj) {
                    VastBeaconTracker.this.logger.error(LogDomain.VAST, (Exception) obj, "Tracking Vast beacon failed with exception: %s", vastBeaconEvent);
                }

                public final /* bridge */ /* synthetic */ void onSuccess(Task task, Object obj) {
                    VastBeaconTracker.this.logger.info(LogDomain.VAST, "Vast beacon was tracked successfully %s", vastBeaconEvent);
                }
            });
        }
    }
}
