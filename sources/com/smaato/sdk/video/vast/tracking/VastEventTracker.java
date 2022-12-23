package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Predicate;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class VastEventTracker {
    private final BeaconTracker beaconTracker;
    private final ExecutorService executorService;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MacroInjector macroInjector;
    private final OffsetEventsManager offsetEventsManager;
    private final SomaApiContext somaApiContext;
    private final Set<VastEvent> trackedEvents = Collections.synchronizedSet(new HashSet());
    private final Map<VastEvent, List<C8938Tracking>> trackingEvents;

    VastEventTracker(Logger logger2, BeaconTracker beaconTracker2, Map<VastEvent, List<C8938Tracking>> map, OffsetEventsManager offsetEventsManager2, MacroInjector macroInjector2, SomaApiContext somaApiContext2, ExecutorService executorService2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.macroInjector = (MacroInjector) Objects.requireNonNull(macroInjector2);
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.trackingEvents = (Map) Objects.requireNonNull(map);
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2);
        this.offsetEventsManager = (OffsetEventsManager) Objects.requireNonNull(offsetEventsManager2);
    }

    public void triggerProgressDependentEvent(PlayerState playerState, long j) {
        Long l = playerState.offsetMillis;
        if (l != null) {
            lambda$triggerEventByName$0$VastEventTracker(this.offsetEventsManager.getOffsettedTrackingsToTrackNow(this.logger, l.longValue(), j), playerState);
        }
    }

    public void triggerEventByName(VastEvent vastEvent, PlayerState playerState) {
        Objects.onNotNull(this.trackingEvents.get(vastEvent), new Consumer(playerState) {
            public final /* synthetic */ PlayerState f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                VastEventTracker.this.lambda$triggerEventByName$0$VastEventTracker(this.f$1, (List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: trackIfNotSent */
    public void lambda$triggerEventByName$0$VastEventTracker(Collection<C8938Tracking> collection, PlayerState playerState) {
        Set<T> retainToSet = Sets.retainToSet(collection, new Predicate() {
            public final boolean test(Object obj) {
                return VastEventTracker.this.lambda$trackIfNotSent$1$VastEventTracker((C8938Tracking) obj);
            }
        });
        if (!retainToSet.isEmpty()) {
            markAsTracked((Set<C8938Tracking>) retainToSet);
            this.executorService.execute(new Runnable(retainToSet, playerState) {
                public final /* synthetic */ Set f$1;
                public final /* synthetic */ PlayerState f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    VastEventTracker.this.lambda$trackIfNotSent$2$VastEventTracker(this.f$1, this.f$2);
                }
            });
        }
    }

    public /* synthetic */ boolean lambda$trackIfNotSent$1$VastEventTracker(C8938Tracking tracking) {
        return !tracking.vastEvent.oneTime || !this.trackedEvents.contains(tracking.vastEvent);
    }

    private void markAsTracked(C8938Tracking tracking) {
        this.offsetEventsManager.trackedTrackings.add(tracking);
        this.trackedEvents.add(tracking.vastEvent);
    }

    private void markAsTracked(Set<C8938Tracking> set) {
        for (C8938Tracking markAsTracked : set) {
            markAsTracked(markAsTracked);
        }
    }

    public /* synthetic */ void lambda$trackIfNotSent$2$VastEventTracker(Set set, PlayerState playerState) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final C8938Tracking tracking = (C8938Tracking) it.next();
            Threads.ensureNotMainThread();
            this.beaconTracker.trackBeaconUrl(this.macroInjector.injectMacros(tracking.url, playerState), this.somaApiContext, new Task.Listener<Whatever, Exception>() {
                public final /* bridge */ /* synthetic */ void onFailure(Task task, Object obj) {
                    VastEventTracker.this.logger.error(LogDomain.VAST, (Exception) obj, "Tracking Vast event failed with exception: %s", tracking.vastEvent);
                }

                public final /* bridge */ /* synthetic */ void onSuccess(Task task, Object obj) {
                    VastEventTracker.this.logger.info(LogDomain.VAST, "Vast event was tracked successfully %s", tracking.vastEvent);
                }
            });
        }
    }
}
