package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdProperties;
import com.amazon.device.ads.Metrics;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterstitialAd implements C0898Ad {
    protected static final String ACTION_INTERSTITIAL_DISMISSED = "dismissed";
    protected static final String ACTION_INTERSTITIAL_FINISHED_LOADING = "finished";
    protected static final String BROADCAST_ACTION = "action";
    protected static final String BROADCAST_CREATIVE = "creative";
    protected static final String BROADCAST_INTENT = "amazon.mobile.ads.interstitial";
    protected static final String BROADCAST_UNIQUE_IDENTIFIER_KEY = "uniqueIdentifier";
    private static final String LOGTAG = InterstitialAd.class.getSimpleName();
    protected static final String MSG_PREPARE_AD_DESTROYED = "This interstitial ad has been destroyed and can no longer be used. Create a new InterstitialAd object to load a new ad.";
    protected static final String MSG_PREPARE_AD_LOADING = "An interstitial ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.";
    protected static final String MSG_PREPARE_AD_READY_TO_SHOW = "An interstitial ad is ready to show. Please call showAd() to show the ad before loading another ad.";
    protected static final String MSG_PREPARE_AD_SHOWING = "An interstitial ad is currently showing. Please wait for the user to dismiss the ad before loading an ad.";
    protected static final String MSG_SHOW_AD_ANOTHER_SHOWING = "Another interstitial ad is currently showing. Please wait for the InterstitialAdListener.onAdDismissed callback of the other ad.";
    protected static final String MSG_SHOW_AD_DESTROYED = "The interstitial ad cannot be shown because it has been destroyed. Create a new InterstitialAd object to load a new ad.";
    protected static final String MSG_SHOW_AD_DISMISSED = "The interstitial ad cannot be shown because it has already been displayed to the user. Please call loadAd(AdTargetingOptions) to load a new ad.";
    protected static final String MSG_SHOW_AD_EXPIRED = "This interstitial ad has expired. Please load another ad.";
    protected static final String MSG_SHOW_AD_LOADING = "The interstitial ad cannot be shown because it is still loading. Please wait for the AdListener.onAdLoaded() callback before showing the ad.";
    protected static final String MSG_SHOW_AD_READY_TO_LOAD = "The interstitial ad cannot be shown because it has not loaded successfully. Please call loadAd(AdTargetingOptions) to load an ad first.";
    protected static final String MSG_SHOW_AD_SHOWING = "The interstitial ad cannot be shown because it is already displayed on the screen. Please wait for the InterstitialAdListener.onAdDismissed() callback and then load a new ad.";
    private static final AtomicBoolean isAdShowing = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public AdController adController;
    private final AdControllerFactory adControllerFactory;
    private AdListenerExecutor adListenerExecutor;
    private final AdListenerExecutorFactory adListenerExecutorFactory;
    private final AdLoadStarter adLoadStarter;
    private final AdRegistrationExecutor adRegistration;
    private final Context context;
    private final IntentBuilderFactory intentBuilderFactory;
    private boolean isInitialized;
    private boolean isThisAdShowing;
    private final MobileAdsLogger logger;
    private final MobileAdsLoggerFactory loggerFactory;
    /* access modifiers changed from: private */
    public final AtomicBoolean previousAdExpired;
    private int timeout;

    public InterstitialAd(Context context2) {
        this(context2, new MobileAdsLoggerFactory(), new AdControllerFactory(), new IntentBuilderFactory(), AdRegistration.getAmazonAdRegistrationExecutor(), new AdLoadStarter());
    }

    InterstitialAd(Context context2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdControllerFactory adControllerFactory2, IntentBuilderFactory intentBuilderFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        this(context2, mobileAdsLoggerFactory, new AdListenerExecutorFactory(mobileAdsLoggerFactory), adControllerFactory2, intentBuilderFactory2, adRegistrationExecutor, adLoadStarter2);
    }

    InterstitialAd(Context context2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdListenerExecutorFactory adListenerExecutorFactory2, AdControllerFactory adControllerFactory2, IntentBuilderFactory intentBuilderFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        this.isThisAdShowing = false;
        this.timeout = 20000;
        this.isInitialized = false;
        this.previousAdExpired = new AtomicBoolean(false);
        if (context2 != null) {
            this.context = context2;
            this.loggerFactory = mobileAdsLoggerFactory;
            this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
            this.adListenerExecutorFactory = adListenerExecutorFactory2;
            this.adControllerFactory = adControllerFactory2;
            this.intentBuilderFactory = intentBuilderFactory2;
            this.adRegistration = adRegistrationExecutor;
            this.adLoadStarter = adLoadStarter2;
            if (ApplicationDefaultPreferences.getDefaultPreferences() == null) {
                ApplicationDefaultPreferences.initialize(context2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("InterstitialAd requires a non-null Context");
    }

    private void initializeIfNecessary() {
        if (!isInitialized()) {
            this.isInitialized = true;
            this.adRegistration.initializeAds(this.context.getApplicationContext());
            if (this.adListenerExecutor == null) {
                setListener((AdListener) null);
            }
            initializeAdController();
            setAdditionalMetrics();
        }
    }

    private void initializeAdController() {
        setAdController(createAdController(this.context));
    }

    private boolean isInitialized() {
        return this.isInitialized;
    }

    /* access modifiers changed from: private */
    public AdController getAdController() {
        initializeIfNecessary();
        if (this.adController == null) {
            initializeAdController();
        }
        return this.adController;
    }

    static void resetIsAdShowing() {
        isAdShowing.set(false);
    }

    public void setListener(AdListener adListener) {
        if (adListener == null) {
            adListener = new DefaultAdListener(LOGTAG);
        }
        this.adListenerExecutor = this.adListenerExecutorFactory.createAdListenerExecutor(adListener);
    }

    public boolean loadAd() {
        return loadAd((AdTargetingOptions) null);
    }

    public boolean loadAd(AdTargetingOptions adTargetingOptions) {
        didAdActivityFail();
        if (!isReadyToLoad()) {
            int i = C09525.$SwitchMap$com$amazon$device$ads$AdState[getAdController().getAdState().ordinal()];
            if (i == 1) {
                this.logger.mo10942w(MSG_PREPARE_AD_READY_TO_SHOW);
            } else if (i == 2) {
                this.logger.mo10942w(MSG_PREPARE_AD_SHOWING);
            } else if (i != 3) {
                if (i != 4) {
                    this.logger.mo10942w(MSG_PREPARE_AD_LOADING);
                } else {
                    this.logger.mo10939e("An interstitial ad could not be loaded because the view has been destroyed.");
                }
            } else if (getAdController().isExpired()) {
                getAdController().resetToReady();
                return loadAd(adTargetingOptions);
            } else {
                this.logger.mo10939e("An interstitial ad could not be loaded because of an unknown issue with the web views.");
            }
            return false;
        }
        this.previousAdExpired.set(false);
        this.adLoadStarter.loadAds(getTimeout(), adTargetingOptions, new AdSlot(getAdController(), adTargetingOptions));
        return getAdController().getAndResetIsPrepared();
    }

    /* renamed from: com.amazon.device.ads.InterstitialAd$5 */
    static /* synthetic */ class C09525 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdState;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.amazon.device.ads.AdState[] r0 = com.amazon.device.ads.AdState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdState = r0
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.RENDERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.SHOWING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.INVALID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.InterstitialAd.C09525.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public MetricsCollector getMetricsCollector() {
        return getAdController().getMetricsCollector();
    }

    public static boolean isAdShowing() {
        return isAdShowing.get();
    }

    public boolean isLoading() {
        return getAdController().getAdState().equals(AdState.LOADING) || getAdController().getAdState().equals(AdState.LOADED) || getAdController().getAdState().equals(AdState.RENDERING);
    }

    public boolean isShowing() {
        return getAdController().getAdState().equals(AdState.SHOWING);
    }

    /* access modifiers changed from: package-private */
    public boolean isReadyToLoad() {
        return getAdController().getAdState().equals(AdState.READY_TO_LOAD);
    }

    /* access modifiers changed from: package-private */
    public boolean isReadyToShow() {
        return getAdController().getAdState().equals(AdState.RENDERED);
    }

    public boolean isReady() {
        return isReadyToShow() && !getAdController().isExpired();
    }

    /* access modifiers changed from: package-private */
    public boolean didAdActivityFail() {
        boolean z = this.isThisAdShowing && !isAdShowing.get();
        if (z) {
            getMetricsCollector().incrementMetric(Metrics.MetricType.INTERSTITIAL_AD_ACTIVITY_FAILED);
            getAdController().closeAd();
        }
        return z;
    }

    public boolean showAd() {
        if (didAdActivityFail()) {
            this.logger.mo10939e("The ad could not be shown because it previously failed to show. Please load a new ad.");
            return false;
        } else if (this.previousAdExpired.get()) {
            this.logger.mo10942w(MSG_SHOW_AD_EXPIRED);
            return false;
        } else {
            long nanoTime = System.nanoTime();
            if (!isReadyToShow()) {
                if (isReadyToLoad()) {
                    this.logger.mo10942w(MSG_SHOW_AD_READY_TO_LOAD);
                } else if (isLoading()) {
                    this.logger.mo10942w(MSG_SHOW_AD_LOADING);
                } else if (isShowing()) {
                    this.logger.mo10942w(MSG_SHOW_AD_SHOWING);
                } else {
                    this.logger.mo10942w("An interstitial ad is not ready to show.");
                }
                return false;
            } else if (getAdController().isExpired()) {
                this.logger.mo10942w(MSG_SHOW_AD_EXPIRED);
                return false;
            } else if (isAdShowing.getAndSet(true)) {
                this.logger.mo10942w(MSG_SHOW_AD_ANOTHER_SHOWING);
                return false;
            } else if (getAdController().startAdDrawing()) {
                this.isThisAdShowing = true;
                getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME, nanoTime);
                getMetricsCollector().startMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_SHOW_DURATION, nanoTime);
                AdControllerFactory.cacheAdController(getAdController());
                getMetricsCollector().startMetric(Metrics.MetricType.AD_SHOW_LATENCY);
                boolean showAdInActivity = showAdInActivity();
                if (!showAdInActivity) {
                    clearCachedAdController();
                    getAdController().resetToReady();
                    isAdShowing.set(false);
                    this.isThisAdShowing = false;
                    getMetricsCollector().stopMetric(Metrics.MetricType.AD_LATENCY_RENDER_FAILED);
                }
                return showAdInActivity;
            } else {
                this.logger.mo10942w("Interstitial ad could not be shown.");
                return false;
            }
        }
    }

    private void clearCachedAdController() {
        AdControllerFactory.removeCachedAdController();
    }

    /* access modifiers changed from: package-private */
    public boolean showAdInActivity() {
        boolean fireIntent = this.intentBuilderFactory.createIntentBuilder().withClass(AdActivity.class).withContext(this.context.getApplicationContext()).withExtra("adapter", InterstitialAdActivityAdapter.class.getName()).fireIntent();
        if (!fireIntent) {
            this.logger.mo10939e("Failed to show the interstitial ad because AdActivity could not be found.");
        }
        return fireIntent;
    }

    /* access modifiers changed from: package-private */
    public AdController createAdController(Context context2) {
        return this.adControllerFactory.buildAdController(context2, AdSize.SIZE_INTERSTITIAL);
    }

    private void setAdController(AdController adController2) {
        this.adController = adController2;
        adController2.setCallback(constructAdControlCallback());
    }

    /* access modifiers changed from: package-private */
    public AdControlCallback constructAdControlCallback() {
        return new InterstitialAdControlCallback();
    }

    /* access modifiers changed from: package-private */
    public void handleDismissed() {
        getMetricsCollector().stopMetric(Metrics.MetricType.AD_SHOW_DURATION);
        AdControllerFactory.removeCachedAdController();
        isAdShowing.set(false);
        this.isThisAdShowing = false;
        callOnAdDismissedOnMainThread();
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    /* access modifiers changed from: private */
    public void callOnAdLoaded(AdProperties adProperties) {
        this.adListenerExecutor.onAdLoaded(this, adProperties);
    }

    /* access modifiers changed from: package-private */
    public void callOnAdLoadedOnMainThread(final AdProperties adProperties) {
        ThreadUtils.executeOnMainThread(new Runnable() {
            public void run() {
                InterstitialAd.this.callOnAdLoaded(adProperties);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdFailedToLoad(AdError adError) {
        this.adListenerExecutor.onAdFailedToLoad(this, adError);
    }

    /* access modifiers changed from: package-private */
    public void callOnAdFailedOnMainThread(final AdError adError) {
        ThreadUtils.executeOnMainThread(new Runnable() {
            public void run() {
                InterstitialAd.this.callOnAdFailedToLoad(adError);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdDismissed() {
        this.adListenerExecutor.onAdDismissed(this);
    }

    /* access modifiers changed from: package-private */
    public void callOnAdDismissedOnMainThread() {
        ThreadUtils.executeOnMainThread(new Runnable() {
            public void run() {
                InterstitialAd.this.callOnAdDismissed();
                InterstitialAd.this.submitAndResetMetrics();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdExpiredOnMainThread() {
        ThreadUtils.executeOnMainThread(new Runnable() {
            public void run() {
                InterstitialAd.this.callOnAdExpired();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdExpired() {
        this.adListenerExecutor.onAdExpired(this);
    }

    /* access modifiers changed from: package-private */
    public void submitAndResetMetrics() {
        if (getMetricsCollector() != null && !getMetricsCollector().isMetricsCollectorEmpty()) {
            setAdditionalMetrics();
            getAdController().submitAndResetMetricsIfNecessary(true);
        }
    }

    /* access modifiers changed from: private */
    public void setAdditionalMetrics() {
        getMetricsCollector().setAdTypeMetricTag(AdProperties.AdType.INTERSTITIAL.getAdTypeMetricTag());
        getMetricsCollector().incrementMetric(Metrics.MetricType.AD_IS_INTERSTITIAL);
    }

    class InterstitialAdControlCallback implements AdControlCallback {
        private AdProperties adProperties;

        public void onAdEvent(AdEvent adEvent) {
        }

        InterstitialAdControlCallback() {
        }

        public void onAdLoaded(AdProperties adProperties2) {
            this.adProperties = adProperties2;
            InterstitialAd.this.setAdditionalMetrics();
            InterstitialAd.this.getAdController().enableNativeCloseButton(true, RelativePosition.TOP_RIGHT);
            InterstitialAd.this.getAdController().render();
        }

        public void onAdRendered() {
            InterstitialAd.this.callOnAdLoadedOnMainThread(this.adProperties);
        }

        public void onAdFailed(AdError adError) {
            if (AdError.ErrorCode.NETWORK_TIMEOUT.equals(adError.getCode())) {
                AdController unused = InterstitialAd.this.adController = null;
            }
            InterstitialAd.this.callOnAdFailedOnMainThread(adError);
        }

        public boolean isAdReady(boolean z) {
            return InterstitialAd.this.isReadyToLoad();
        }

        public int adClosing() {
            InterstitialAd.this.handleDismissed();
            return 1;
        }

        public void postAdRendered() {
            InterstitialAd.this.getMetricsCollector().startMetric(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME);
        }

        public void onAdExpired() {
            InterstitialAd.this.getMetricsCollector().incrementMetric(Metrics.MetricType.AD_EXPIRED_BEFORE_SHOWING);
            InterstitialAd.this.previousAdExpired.set(true);
            AdController unused = InterstitialAd.this.adController = null;
            InterstitialAd.this.callOnAdExpiredOnMainThread();
        }
    }
}
