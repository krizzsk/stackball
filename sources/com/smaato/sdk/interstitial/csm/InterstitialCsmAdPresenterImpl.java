package com.smaato.sdk.interstitial.csm;

import android.content.Context;
import com.smaato.sdk.core.csm.CsmAdContentView;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdInteractor;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.BaseAdPresenter;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenter;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenterImpl;
import java.util.Map;

public final class InterstitialCsmAdPresenterImpl extends BaseAdPresenter implements InterstitialCsmAdPresenter {
    /* access modifiers changed from: private */
    public final CsmAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public CsmAdPresenter.Listener adLoadedListener;
    /* access modifiers changed from: private */
    public InterstitialCsmAdPresenter.Listener interstitialAdListener;
    private final SMAInterstitialNetworkEvent interstitialNetworkEvent;
    private final SMAInterstitialNetworkEventListener interstitialNetworkEventListener = new SMAInterstitialNetworkEventListener() {
        public final void onAdLoaded() {
            Objects.onNotNull(InterstitialCsmAdPresenterImpl.this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialCsmAdPresenterImpl.C87881.this.lambda$onAdLoaded$0$InterstitialCsmAdPresenterImpl$1((CsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdLoaded$0$InterstitialCsmAdPresenterImpl$1(CsmAdPresenter.Listener listener) {
            listener.onAdLoaded(InterstitialCsmAdPresenterImpl.this);
        }

        public final void onAdFailedToLoad() {
            Objects.onNotNull(InterstitialCsmAdPresenterImpl.this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialCsmAdPresenterImpl.C87881.this.lambda$onAdFailedToLoad$1$InterstitialCsmAdPresenterImpl$1((CsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdFailedToLoad$1$InterstitialCsmAdPresenterImpl$1(CsmAdPresenter.Listener listener) {
            listener.onAdFailedToLoad(InterstitialCsmAdPresenterImpl.this);
        }

        public final void onAdClicked() {
            InterstitialCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
        }

        public final void onAdOpened() {
            InterstitialCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            InterstitialCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
            Objects.onNotNull(InterstitialCsmAdPresenterImpl.this.interstitialAdListener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialCsmAdPresenterImpl.C87881.this.lambda$onAdOpened$2$InterstitialCsmAdPresenterImpl$1((InterstitialCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdOpened$2$InterstitialCsmAdPresenterImpl$1(InterstitialCsmAdPresenter.Listener listener) {
            listener.onAdOpened(InterstitialCsmAdPresenterImpl.this);
        }

        public final void onAdClosed() {
            InterstitialCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.CLOSE);
            Objects.onNotNull(InterstitialCsmAdPresenterImpl.this.interstitialAdListener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialCsmAdPresenterImpl.C87881.this.lambda$onAdClosed$3$InterstitialCsmAdPresenterImpl$1((InterstitialCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdClosed$3$InterstitialCsmAdPresenterImpl$1(InterstitialCsmAdPresenter.Listener listener) {
            listener.onAdClosed(InterstitialCsmAdPresenterImpl.this);
        }

        public final void onAdTTLExpired() {
            InterstitialCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.EXPIRE_TTL);
            Objects.onNotNull(InterstitialCsmAdPresenterImpl.this.interstitialAdListener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialCsmAdPresenterImpl.C87881.this.lambda$onAdTTLExpired$4$InterstitialCsmAdPresenterImpl$1((InterstitialCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdTTLExpired$4$InterstitialCsmAdPresenterImpl$1(InterstitialCsmAdPresenter.Listener listener) {
            listener.onTTLExpired(InterstitialCsmAdPresenterImpl.this);
        }
    };
    private final Logger logger;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            InterstitialCsmAdPresenterImpl.this.lambda$new$1$InterstitialCsmAdPresenterImpl(adInteractor);
        }
    };

    public /* synthetic */ void lambda$new$1$InterstitialCsmAdPresenterImpl(AdInteractor adInteractor2) {
        Objects.onNotNull(this.interstitialAdListener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialCsmAdPresenterImpl.this.lambda$null$0$InterstitialCsmAdPresenterImpl((InterstitialCsmAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$InterstitialCsmAdPresenterImpl(InterstitialCsmAdPresenter.Listener listener) {
        listener.onTTLExpired(this);
    }

    InterstitialCsmAdPresenterImpl(CsmAdInteractor csmAdInteractor, Logger logger2, SMAInterstitialNetworkEvent sMAInterstitialNetworkEvent) {
        super(csmAdInteractor);
        this.adInteractor = (CsmAdInteractor) Objects.requireNonNull(csmAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.interstitialNetworkEvent = sMAInterstitialNetworkEvent;
        this.stateListener = new StateMachine.Listener(csmAdInteractor, logger2) {
            public final /* synthetic */ CsmAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                InterstitialCsmAdPresenterImpl.this.lambda$new$3$InterstitialCsmAdPresenterImpl(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        csmAdInteractor.addTtlListener(this.ttlListener);
        csmAdInteractor.addStateListener(this.stateListener);
        csmAdInteractor.setOnImpressionTriggered(new CsmAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                InterstitialCsmAdPresenterImpl.this.lambda$new$5$InterstitialCsmAdPresenterImpl();
            }
        });
        csmAdInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenterImpl$2 */
    static /* synthetic */ class C87892 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x0049 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenterImpl.C87892.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$3$InterstitialCsmAdPresenterImpl(CsmAdInteractor csmAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C87892.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.interstitialAdListener, new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialCsmAdPresenterImpl.this.lambda$null$2$InterstitialCsmAdPresenterImpl((InterstitialCsmAdPresenter.Listener) obj);
                    }
                });
                return;
            case 7:
                csmAdInteractor.removeStateListener(this.stateListener);
                return;
            default:
                logger2.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public /* synthetic */ void lambda$null$2$InterstitialCsmAdPresenterImpl(InterstitialCsmAdPresenter.Listener listener) {
        listener.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$5$InterstitialCsmAdPresenterImpl() {
        Objects.onNotNull(this.interstitialAdListener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialCsmAdPresenterImpl.this.lambda$null$4$InterstitialCsmAdPresenterImpl((InterstitialCsmAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$4$InterstitialCsmAdPresenterImpl(InterstitialCsmAdPresenter.Listener listener) {
        listener.onAdImpressed(this);
    }

    public final void requestAd(Context context, Map<String, String> map, Map<String, Object> map2) {
        if (this.interstitialNetworkEvent == null) {
            this.logger.error(LogDomain.AD, String.format("Could not find CustomEvent class with networkName: %s", new Object[]{((CsmAdObject) this.adInteractor.getAdObject()).getNetwork().getName()}), new Object[0]);
            Objects.onNotNull(this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialCsmAdPresenterImpl.this.lambda$requestAd$6$InterstitialCsmAdPresenterImpl((CsmAdPresenter.Listener) obj);
                }
            });
            return;
        }
        Threads.runOnUi(new Runnable(context, map, map2) {
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ Map f$2;
            public final /* synthetic */ Map f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                InterstitialCsmAdPresenterImpl.this.lambda$requestAd$7$InterstitialCsmAdPresenterImpl(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$requestAd$6$InterstitialCsmAdPresenterImpl(CsmAdPresenter.Listener listener) {
        listener.onAdFailedToLoad(this);
    }

    public /* synthetic */ void lambda$requestAd$7$InterstitialCsmAdPresenterImpl(Context context, Map map, Map map2) {
        this.interstitialNetworkEvent.requestInterstitial(context, this.interstitialNetworkEventListener, map, map2);
    }

    public final void setAdLoadedListener(CsmAdPresenter.Listener listener) {
        this.adLoadedListener = listener;
    }

    public final void setInterstitialAdListener(InterstitialCsmAdPresenter.Listener listener) {
        this.interstitialAdListener = listener;
    }

    public final void showAd() {
        Objects.onNotNull(this.interstitialNetworkEvent, $$Lambda$7em73v5sSpWmHA4eFsVq59bMw4.INSTANCE);
    }

    public final AdContentView getAdContentView(Context context) {
        return new CsmAdContentView(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.interstitialNetworkEvent;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isValid() {
        /*
            r1 = this;
            com.smaato.sdk.core.csm.CsmAdInteractor r0 = r1.adInteractor
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0014
            com.smaato.sdk.interstitial.csm.SMAInterstitialNetworkEvent r0 = r1.interstitialNetworkEvent
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            return r0
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenterImpl.isValid():boolean");
    }

    public final void onDestroy() {
        Threads.ensureMainThread();
        if (!isValid()) {
            this.adInteractor.removeStateListener(this.stateListener);
        }
        this.adLoadedListener = null;
        this.interstitialAdListener = null;
        Objects.onNotNull(this.interstitialNetworkEvent, $$Lambda$LYTOrFBYlBnoT5osEe5BDDbB_7U.INSTANCE);
    }
}
