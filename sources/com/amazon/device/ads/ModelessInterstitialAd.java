package com.amazon.device.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdProperties;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.SDKEvent;
import java.util.concurrent.atomic.AtomicBoolean;

public class ModelessInterstitialAd implements C0898Ad {
    private static final String LOGTAG = ModelessInterstitialAd.class.getSimpleName();
    private static final int MIN_PIXELS = 380;
    private static final double MIN_SCREEN_COVERAGE_PERCENTAGE = 0.75d;
    private static final String PUBLISHER_KEYWORD = "modeless-interstitial";
    private AdController adController;
    private final AdControllerFactory adControllerFactory;
    private AdListenerExecutor adListenerExecutor;
    private final AdListenerExecutorFactory adListenerExecutorFactory;
    private final AdLoadStarter adLoadStarter;
    private AdProperties adProperties;
    private final AdRegistrationExecutor amazonAdRegistration;
    private final Context context;
    private final ViewGroup hostedViewGroup;
    private final MobileAdsLogger logger;
    private final MobileAdsLoggerFactory loggerFactory;
    private MetricsCollector metricsCollector;
    private final AtomicBoolean previousAdExpired;
    private int timeout;

    public ModelessInterstitialAd(ViewGroup viewGroup) {
        this(viewGroup, AdRegistration.getAmazonAdRegistrationExecutor(), new AdControllerFactory(), new MobileAdsLoggerFactory(), new AdLoadStarter());
    }

    ModelessInterstitialAd(ViewGroup viewGroup, AdRegistrationExecutor adRegistrationExecutor, AdControllerFactory adControllerFactory2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdLoadStarter adLoadStarter2) {
        this(viewGroup, adRegistrationExecutor, adControllerFactory2, mobileAdsLoggerFactory, new AdListenerExecutorFactory(mobileAdsLoggerFactory), adLoadStarter2);
    }

    ModelessInterstitialAd(ViewGroup viewGroup, AdRegistrationExecutor adRegistrationExecutor, AdControllerFactory adControllerFactory2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdListenerExecutorFactory adListenerExecutorFactory2, AdLoadStarter adLoadStarter2) {
        this.previousAdExpired = new AtomicBoolean(false);
        if (viewGroup != null) {
            this.hostedViewGroup = viewGroup;
            this.context = viewGroup.getContext();
            this.amazonAdRegistration = adRegistrationExecutor;
            this.adControllerFactory = adControllerFactory2;
            this.loggerFactory = mobileAdsLoggerFactory;
            this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
            this.adListenerExecutorFactory = adListenerExecutorFactory2;
            this.adLoadStarter = adLoadStarter2;
            if (ApplicationDefaultPreferences.getDefaultPreferences() == null) {
                ApplicationDefaultPreferences.initialize(this.context);
            }
            initialize();
            return;
        }
        throw new IllegalArgumentException("The hostedViewGroup must not be null.");
    }

    public void setListener(AdListener adListener) {
        if (adListener == null) {
            adListener = new DefaultAdListener(LOGTAG);
        }
        this.adListenerExecutor = this.adListenerExecutorFactory.createAdListenerExecutor(adListener);
    }

    public boolean loadAd(AdTargetingOptions adTargetingOptions) {
        if (!isReadyToLoad()) {
            switch (C09731.$SwitchMap$com$amazon$device$ads$AdState[this.adController.getAdState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    this.logger.mo10942w("The modeless interstitial ad is already loading. Please wait for the loading operation to complete.");
                    break;
                case 4:
                    this.logger.mo10942w("The modeless interstitial ad has already been loaded. Please call adShown once the ad is shown.");
                    break;
                case 5:
                    if (!this.adController.isExpired()) {
                        this.logger.mo10939e("The modeless interstitial ad could not be loaded because of an unknown issue with the web views.");
                        break;
                    } else {
                        this.adController.resetToReady();
                        return loadAd(adTargetingOptions);
                    }
                case 6:
                    this.logger.mo10939e("The modeless interstitial ad has been destroyed. Please create a new ModelessInterstitialAd.");
                    break;
            }
            this.metricsCollector.incrementMetric(Metrics.MetricType.AD_LOAD_FAILED);
            return false;
        }
        this.previousAdExpired.set(false);
        AdTargetingOptions adTargetingOptions2 = adTargetingOptions == null ? new AdTargetingOptions() : adTargetingOptions.copy();
        adTargetingOptions2.addInternalPublisherKeyword(PUBLISHER_KEYWORD);
        submitMetrics();
        this.adLoadStarter.loadAds(this.timeout, adTargetingOptions2, new AdSlot(this.adController, adTargetingOptions2));
        return this.adController.getAndResetIsPrepared();
    }

    /* renamed from: com.amazon.device.ads.ModelessInterstitialAd$1 */
    static /* synthetic */ class C09731 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdState;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.amazon.device.ads.AdState[] r0 = com.amazon.device.ads.AdState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdState = r0
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.LOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.LOADED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.RENDERING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.RENDERED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x003e }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.INVALID     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.ModelessInterstitialAd.C09731.<clinit>():void");
        }
    }

    public boolean loadAd() {
        return loadAd((AdTargetingOptions) null);
    }

    public boolean isLoading() {
        AdState adState = this.adController.getAdState();
        return adState.equals(AdState.LOADING) || adState.equals(AdState.LOADED) || adState.equals(AdState.RENDERING);
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public boolean adShown() {
        AdState adState = this.adController.getAdState();
        if (this.previousAdExpired.get() || (!adState.equals(AdState.HIDDEN) && this.adController.isExpired())) {
            this.logger.mo10939e("The ad is unable to be shown because it has expired.");
            this.metricsCollector.stopMetric(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME);
            this.metricsCollector.incrementMetric(Metrics.MetricType.EXPIRED_AD_CALL);
        } else if (adState.equals(AdState.LOADING)) {
            this.logger.mo10942w("The adShown call failed because the ad cannot be shown until it has completed loading.");
        } else if (adState.equals(AdState.SHOWING)) {
            this.logger.mo10942w("The adShown call failed because adShown was previously called on this ad.");
        } else if (adState.equals(AdState.RENDERED) || adState.equals(AdState.HIDDEN)) {
            if (adState.equals(AdState.RENDERED)) {
                this.metricsCollector.stopMetric(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME);
            }
            Position adPosition = this.adController.getAdPosition();
            if (adPosition != null) {
                Size size = adPosition.getSize();
                Size screenSize = this.adController.getScreenSize();
                if (!doesAdSizeHaveOneSideWithAtLeastMinPixels(size) || !isAdOnScreen(adPosition, screenSize) || !doesAdSizeMeetRequiredScreenPercentage(size, screenSize)) {
                    this.metricsCollector.incrementMetric(Metrics.MetricType.RENDER_REQUIREMENT_CHECK_FAILURE);
                } else {
                    checkIfAdAspectRatioLessThanScreenAspectRatio(size, screenSize);
                    if (this.adController.getAdState().equals(AdState.HIDDEN)) {
                        this.metricsCollector.incrementMetric(Metrics.MetricType.AD_COUNTER_RESHOWN);
                    }
                    setRenderedViewClickable(true);
                    this.adController.adShown();
                    this.metricsCollector.startMetric(Metrics.MetricType.AD_SHOW_DURATION);
                    return true;
                }
            }
        } else {
            this.logger.mo11028w("The adShown call failed because the ad is not in a state to be shown. The ad is currently in the %s state.", adState);
        }
        return false;
    }

    public void adHidden() {
        AdState adState = this.adController.getAdState();
        if (adState.equals(AdState.HIDDEN)) {
            this.logger.mo10938d("The ad is already hidden from view.");
        } else if (adState.equals(AdState.SHOWING)) {
            this.adController.getMetricsCollector().stopMetric(Metrics.MetricType.AD_SHOW_DURATION);
            setRenderedViewClickable(false);
            this.adController.adHidden();
        } else {
            this.logger.mo10942w("The ad must be shown before it can be hidden.");
        }
    }

    public void destroy() {
        this.logger.mo10938d("Destroying the Modeless Interstitial Ad");
        if (this.adController.getAdState().equals(AdState.SHOWING)) {
            adHidden();
        }
        submitMetrics();
        this.adController.destroy();
    }

    public boolean isReady() {
        return this.adController.getAdState().equals(AdState.RENDERED) && !this.adController.isExpired();
    }

    private void initialize() {
        this.amazonAdRegistration.initializeAds(this.context.getApplicationContext());
        setListener((AdListener) null);
        buildAdController();
    }

    private void buildAdController() {
        AdController buildAdController = this.adControllerFactory.buildAdController(this.context, AdSize.SIZE_MODELESS_INTERSTITIAL);
        this.adController = buildAdController;
        buildAdController.setCallback(new ModelessInterstitialAdControlCallback(this, (C09731) null));
        MetricsCollector metricsCollector2 = this.adController.getMetricsCollector();
        this.metricsCollector = metricsCollector2;
        metricsCollector2.setAdTypeMetricTag(AdProperties.AdType.MODELESS_INTERSTITIAL.getAdTypeMetricTag());
        this.metricsCollector.incrementMetric(Metrics.MetricType.AD_IS_INTERSTITIAL);
    }

    /* access modifiers changed from: private */
    public void onAdFailedToLoadOrRender(AdError adError) {
        if (adError.getCode().equals(AdError.ErrorCode.NETWORK_TIMEOUT)) {
            submitMetrics();
            buildAdController();
        }
        this.adListenerExecutor.onAdFailedToLoad(this, adError);
    }

    /* access modifiers changed from: private */
    public void onAdFetched(AdProperties adProperties2) {
        this.adProperties = adProperties2;
        this.adController.render();
    }

    /* access modifiers changed from: private */
    public void onAdRendered() {
        this.hostedViewGroup.addView(this.adController.getView());
        setRenderedViewClickable(false);
        this.adListenerExecutor.onAdLoaded(this, this.adProperties);
    }

    /* access modifiers changed from: private */
    public boolean isReadyToLoad() {
        AdState adState = this.adController.getAdState();
        return this.adController.isExpired() || adState.equals(AdState.READY_TO_LOAD) || adState.equals(AdState.HIDDEN);
    }

    /* access modifiers changed from: private */
    public void onAdRenderMetricsRecorded() {
        this.metricsCollector.startMetric(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME);
        this.adController.fireSDKEvent(new SDKEvent(SDKEvent.SDKEventType.PLACED));
    }

    private void setRenderedViewClickable(boolean z) {
        this.adController.setAllowClicks(z);
    }

    /* access modifiers changed from: private */
    public void onAdExpired() {
        this.metricsCollector.incrementMetric(Metrics.MetricType.AD_EXPIRED_BEFORE_SHOWING);
        this.previousAdExpired.set(true);
        buildAdController();
        this.adListenerExecutor.onAdExpired(this);
    }

    private void submitMetrics() {
        if (!this.adController.getMetricsCollector().isMetricsCollectorEmpty()) {
            this.adController.submitAndResetMetrics();
        }
    }

    private boolean doesAdSizeHaveOneSideWithAtLeastMinPixels(Size size) {
        if (size.getHeight() >= MIN_PIXELS || size.getWidth() >= MIN_PIXELS) {
            return true;
        }
        this.logger.mo11020e("This ModelessInterstitialAd cannot fire impression pixels or receive clicks because the height %d and width %d does not meet the requirement of one side being at least %d device independent pixels.", Integer.valueOf(size.getHeight()), Integer.valueOf(size.getWidth()), Integer.valueOf(MIN_PIXELS));
        return false;
    }

    private boolean isAdOnScreen(Position position, Size size) {
        if (position.getX() >= 0 && position.getX() + position.getSize().getWidth() <= size.getWidth() && position.getY() >= 0 && position.getY() + position.getSize().getHeight() <= size.getHeight()) {
            return true;
        }
        this.logger.mo10939e("This ModelessInterstitialAd cannot fire impression pixels or receive clicks because it does not meet the requirement of being fully on screen.");
        return false;
    }

    private boolean doesAdSizeMeetRequiredScreenPercentage(Size size, Size size2) {
        double height = (((double) size.getHeight()) * ((double) size.getWidth())) / (((double) size2.getHeight()) * ((double) size2.getWidth()));
        if (height >= MIN_SCREEN_COVERAGE_PERCENTAGE) {
            return true;
        }
        this.logger.mo11020e("This ModelessInterstitialAd cannot fire impression pixels or receive clicks because it has a screen coverage percentage of %f which does not meet the requirement of covering at least %d percent.", Double.valueOf(height * 100.0d), 75);
        return false;
    }

    private void checkIfAdAspectRatioLessThanScreenAspectRatio(Size size, Size size2) {
        float width = (float) size.getWidth();
        float height = (float) size.getHeight();
        float width2 = (float) size2.getWidth();
        float height2 = (float) size2.getHeight();
        boolean z = true;
        if (width > height ? height / width >= height2 / width2 : width / height >= width2 / height2) {
            z = false;
        }
        if (z) {
            this.metricsCollector.incrementMetric(Metrics.MetricType.AD_ASPECT_RATIO_LESS_THAN_SCREEN_ASPECT_RATIO);
            this.logger.mo10942w("For an optimal ad experience, the aspect ratio of the ModelessInterstitialAd should be greater than or equal to the aspect ratio of the screen.");
        }
    }

    private class ModelessInterstitialAdControlCallback implements AdControlCallback {
        public int adClosing() {
            return 2;
        }

        public void onAdEvent(AdEvent adEvent) {
        }

        private ModelessInterstitialAdControlCallback() {
        }

        /* synthetic */ ModelessInterstitialAdControlCallback(ModelessInterstitialAd modelessInterstitialAd, C09731 r2) {
            this();
        }

        public boolean isAdReady(boolean z) {
            return ModelessInterstitialAd.this.isReadyToLoad();
        }

        public void onAdLoaded(AdProperties adProperties) {
            ModelessInterstitialAd.this.onAdFetched(adProperties);
        }

        public void onAdRendered() {
            ModelessInterstitialAd.this.onAdRendered();
        }

        public void postAdRendered() {
            ModelessInterstitialAd.this.onAdRenderMetricsRecorded();
        }

        public void onAdFailed(AdError adError) {
            ModelessInterstitialAd.this.onAdFailedToLoadOrRender(adError);
        }

        public void onAdExpired() {
            ModelessInterstitialAd.this.onAdExpired();
        }
    }
}
