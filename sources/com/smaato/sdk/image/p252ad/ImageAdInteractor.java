package com.smaato.sdk.image.p252ad;

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
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.image.ad.ImageAdInteractor */
public class ImageAdInteractor extends AdInteractor<ImageAdObject> {
    private final BeaconTracker beaconTracker;
    private Callback callback;
    /* access modifiers changed from: private */
    public AtomicReference<Task> handleUrlTaskRef = new AtomicReference<>();
    private final LinkResolver linkResolver;
    private final Logger logger;

    /* renamed from: com.smaato.sdk.image.ad.ImageAdInteractor$Callback */
    public interface Callback {
        void onImpressionTriggered();
    }

    public ImageAdInteractor(Logger logger2, ImageAdObject imageAdObject, BeaconTracker beaconTracker2, StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine, LinkResolver linkResolver2, OneTimeActionFactory oneTimeActionFactory, ImpressionDetector impressionDetector) {
        super(imageAdObject, stateMachine, oneTimeActionFactory);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.linkResolver = (LinkResolver) Objects.requireNonNull(linkResolver2);
        stateMachine.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                ImageAdInteractor.this.stateChanged((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        });
        stateMachine.addListener(impressionDetector.stateListener);
        impressionDetector.setOnImpressionStateDetectedCallback(new ImpressionDetector.Callback(impressionDetector, logger2, beaconTracker2, imageAdObject) {
            public final /* synthetic */ ImpressionDetector f$1;
            public final /* synthetic */ Logger f$2;
            public final /* synthetic */ BeaconTracker f$3;
            public final /* synthetic */ ImageAdObject f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onImpressionStateDetected() {
                ImageAdInteractor.this.lambda$new$0$ImageAdInteractor(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$ImageAdInteractor(ImpressionDetector impressionDetector, Logger logger2, BeaconTracker beaconTracker2, ImageAdObject imageAdObject) {
        impressionDetector.setOnImpressionStateDetectedCallback((ImpressionDetector.Callback) null);
        logger2.debug(LogDomain.AD, "Going to send impression beacons", new Object[0]);
        beaconTracker2.trackBeaconUrls(imageAdObject.getImpressionTrackingUrls(), imageAdObject.getSomaApiContext());
        Objects.onNotNull(this.callback, $$Lambda$FMBsgakutzeMHIcP8_PRhy0NyeI.INSTANCE);
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdInteractor$2 */
    static /* synthetic */ class C87412 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p252ad.ImageAdInteractor.C87412.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void stateChanged(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C87412.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                this.logger.debug(LogDomain.AD, "event %s: going to send impression beacons", state2);
                ImageAdObject imageAdObject = (ImageAdObject) getAdObject();
                this.beaconTracker.trackBeaconUrls(imageAdObject.getClickTrackingUrls(), imageAdObject.getSomaApiContext());
                return;
            case 5:
            case 6:
                return;
            default:
                this.logger.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public void resolveClickUrl(final UrlResolveListener urlResolveListener) {
        Objects.requireNonNull(urlResolveListener, "Parameter urlResolveListener cannot be null for ImageAdInteractor::resolveClickUrl");
        if (this.handleUrlTaskRef.get() == null) {
            ImageAdObject imageAdObject = (ImageAdObject) getAdObject();
            Task handleClickThroughUrl = this.linkResolver.handleClickThroughUrl(imageAdObject.getSomaApiContext(), imageAdObject.getClickUrl(), new UrlResolveListener() {
                public final void onError() {
                    ImageAdInteractor.this.handleUrlTaskRef.set((Object) null);
                    urlResolveListener.onError();
                }

                public final void onSuccess(Consumer<Context> consumer) {
                    ImageAdInteractor.this.handleUrlTaskRef.set((Object) null);
                    urlResolveListener.onSuccess(consumer);
                }
            });
            this.handleUrlTaskRef.set(handleClickThroughUrl);
            handleClickThroughUrl.start();
        }
    }

    public void stopUrlResolving() {
        Objects.onNotNull(this.handleUrlTaskRef.get(), $$Lambda$yaUpY0DGpVsMZlshO_jwvMPRY4g.INSTANCE);
        this.handleUrlTaskRef.set((Object) null);
    }

    public void setOnImpressionTriggered(Callback callback2) {
        this.callback = callback2;
    }
}
