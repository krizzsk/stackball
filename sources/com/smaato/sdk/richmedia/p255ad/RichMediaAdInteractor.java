package com.smaato.sdk.richmedia.p255ad;

import android.content.Context;
import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.deeplink.LinkResolver;
import com.smaato.sdk.core.deeplink.UrlResolveListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.p248ad.AdInteractor;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdInteractor */
final class RichMediaAdInteractor extends AdInteractor<RichMediaAdObject> {
    private final AdQualityViolationReporter adQualityViolationReporter;
    private final BeaconTracker beaconTracker;
    Callback callback;
    /* access modifiers changed from: private */
    public AtomicReference<Task> handleUrlTaskRef = new AtomicReference<>();
    private final LinkResolver linkResolver;
    private final Logger logger;

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdInteractor$Callback */
    public interface Callback {
        void onImpressionTriggered();
    }

    RichMediaAdInteractor(Logger logger2, RichMediaAdObject richMediaAdObject, BeaconTracker beaconTracker2, StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine, LinkResolver linkResolver2, AdQualityViolationReporter adQualityViolationReporter2, OneTimeActionFactory oneTimeActionFactory, ImpressionDetector impressionDetector) {
        super(richMediaAdObject, stateMachine, oneTimeActionFactory);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.linkResolver = (LinkResolver) Objects.requireNonNull(linkResolver2);
        this.adQualityViolationReporter = (AdQualityViolationReporter) Objects.requireNonNull(adQualityViolationReporter2);
        stateMachine.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                RichMediaAdInteractor.this.stateChanged((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        });
        stateMachine.addListener(impressionDetector.stateListener);
        impressionDetector.setOnImpressionStateDetectedCallback(new ImpressionDetector.Callback(impressionDetector, logger2, beaconTracker2, richMediaAdObject) {
            public final /* synthetic */ ImpressionDetector f$1;
            public final /* synthetic */ Logger f$2;
            public final /* synthetic */ BeaconTracker f$3;
            public final /* synthetic */ RichMediaAdObject f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onImpressionStateDetected() {
                RichMediaAdInteractor.this.lambda$new$0$RichMediaAdInteractor(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$RichMediaAdInteractor(ImpressionDetector impressionDetector, Logger logger2, BeaconTracker beaconTracker2, RichMediaAdObject richMediaAdObject) {
        impressionDetector.setOnImpressionStateDetectedCallback((ImpressionDetector.Callback) null);
        logger2.debug(LogDomain.AD, "Going to send impression beacons", new Object[0]);
        beaconTracker2.trackBeaconUrls(richMediaAdObject.getImpressionTrackingUrls(), richMediaAdObject.getSomaApiContext());
        Objects.onNotNull(this.callback, $$Lambda$m3Ktp1gi43if_DIEgrk6mpt0tc.INSTANCE);
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdInteractor$2 */
    static /* synthetic */ class C89012 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdStateMachine$State[] r0 = com.smaato.sdk.core.p248ad.AdStateMachine.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State = r0
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.INIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.RichMediaAdInteractor.C89012.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void stateChanged(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C89012.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                this.logger.debug(LogDomain.AD, "event %s: going to send click beacons", state2);
                RichMediaAdObject richMediaAdObject = (RichMediaAdObject) getAdObject();
                this.beaconTracker.trackBeaconUrls(richMediaAdObject.getClickTrackingUrls(), richMediaAdObject.getSomaApiContext());
                return;
            case 6:
            case 7:
                return;
            default:
                this.logger.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public final void resolveClickUrl(String str, final UrlResolveListener urlResolveListener) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(urlResolveListener);
        if (this.handleUrlTaskRef.get() == null) {
            Task handleClickThroughUrl = this.linkResolver.handleClickThroughUrl(((RichMediaAdObject) getAdObject()).getSomaApiContext(), str, new UrlResolveListener() {
                public final void onError() {
                    RichMediaAdInteractor.this.handleUrlTaskRef.set((Object) null);
                    urlResolveListener.onError();
                }

                public final void onSuccess(Consumer<Context> consumer) {
                    RichMediaAdInteractor.this.handleUrlTaskRef.set((Object) null);
                    urlResolveListener.onSuccess(consumer);
                }
            });
            this.handleUrlTaskRef.set(handleClickThroughUrl);
            handleClickThroughUrl.start();
        }
    }

    public final void stopUrlResolving() {
        Objects.onNotNull(this.handleUrlTaskRef.get(), $$Lambda$yaUpY0DGpVsMZlshO_jwvMPRY4g.INSTANCE);
        this.handleUrlTaskRef.set((Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void reportAdViolation(String str, String str2) {
        this.adQualityViolationReporter.reportAdViolation(str, ((RichMediaAdObject) getAdObject()).getSomaApiContext(), str2);
    }
}
