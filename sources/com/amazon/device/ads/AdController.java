package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.WebView;
import com.amazon.device.ads.AdContainer;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdSize;
import com.amazon.device.ads.AdWebViewClient;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.SDKEvent;
import com.amazon.device.ads.ThreadUtils;
import com.amazon.device.ads.WebRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

class AdController implements Metrics.MetricsSubmitter {
    private static final String LOGTAG = AdController.class.getSimpleName();
    protected static final String MSG_PREPARE_AD_LOADING = "An ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.";
    protected static final String MSG_PREPARE_AD_READY_TO_SHOW = "An ad is ready to show. Please call showAd() to show the ad before loading another ad.";
    protected static final String MSG_PREPARE_AD_SHOWING = "An ad is currently showing. Please wait for the user to dismiss the ad before loading an ad.";
    protected static final String MSG_SHOW_AD_ANOTHER_SHOWING = "Another ad is currently showing. Please wait for the AdListener.onAdDismissed callback of the other ad.";
    protected static final String MSG_SHOW_AD_DESTROYED = "The ad cannot be shown because it has been destroyed. Create a new Ad object to load a new ad.";
    protected static final String MSG_SHOW_AD_DISMISSED = "The ad cannot be shown because it has already been displayed to the user. Please call loadAd(AdTargetingOptions) to load a new ad.";
    protected static final String MSG_SHOW_AD_EXPIRED = "This ad has expired. Please load another ad.";
    protected static final String MSG_SHOW_AD_LOADING = "The ad cannot be shown because it is still loading. Please wait for the AdListener.onAdLoaded() callback before showing the ad.";
    protected static final String MSG_SHOW_AD_READY_TO_LOAD = "The ad cannot be shown because it has not loaded successfully. Please call loadAd(AdTargetingOptions) to load an ad first.";
    protected static final String MSG_SHOW_AD_SHOWING = "The ad cannot be shown because it is already displayed on the screen. Please wait for the AdListener.onAdDismissed() callback and then load a new ad.";
    private Activity adActivity;
    private final AdCloser adCloser;
    private AdContainer adContainer;
    private final AdContainer.AdContainerFactory adContainerFactory;
    private AdControlAccessor adControlAccessor;
    private AdControlCallback adControlCallback;
    private AdData adData;
    private final AdHtmlPreprocessor adHtmlPreprocessor;
    private final AdSDKBridgeList adSdkBridgeList;
    private final AdSize adSize;
    private AdState adState;
    private final AdTimer adTimer;
    private final AdUrlLoader adUrlLoader;
    private final AdUtils2 adUtils;
    private int adWindowHeight;
    private int adWindowWidth;
    private final AndroidBuildInfo androidBuildInfo;
    private boolean backButtonOverridden;
    private final BridgeSelector bridgeSelector;
    private final Configuration configuration;
    private ConnectionInfo connectionInfo;
    private final Context context;
    private final DebugProperties debugProperties;
    private ViewGroup defaultParent;
    private boolean disableHardwareAccelerationRequest;
    private boolean forceDisableHardwareAcceleration;
    private final AtomicBoolean hasFinishedLoading;
    private final MobileAdsInfoStore infoStore;
    private boolean isModallyExpanded;
    private boolean isPrepared;
    private final AtomicBoolean isRendering;
    /* access modifiers changed from: private */
    public final MobileAdsLogger logger;
    private MetricsCollector metricsCollector;
    private boolean orientationFailureMetricRecorded;
    private final PermissionChecker permissionChecker;
    private double scalingMultiplier;
    private final ArrayList<SDKEventListener> sdkEventListeners;
    private String slotID;
    private int timeout;
    private final ViewUtils viewUtils;
    private final ViewabilityObserver viewabilityObserver;
    protected final WebUtils2 webUtils;
    private boolean windowDimensionsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdController(android.content.Context r24, com.amazon.device.ads.AdSize r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            com.amazon.device.ads.WebUtils2 r4 = new com.amazon.device.ads.WebUtils2
            r3 = r4
            r4.<init>()
            com.amazon.device.ads.MetricsCollector r5 = new com.amazon.device.ads.MetricsCollector
            r4 = r5
            r5.<init>()
            com.amazon.device.ads.MobileAdsLoggerFactory r6 = new com.amazon.device.ads.MobileAdsLoggerFactory
            r5 = r6
            r6.<init>()
            com.amazon.device.ads.AdUtils2 r7 = new com.amazon.device.ads.AdUtils2
            r6 = r7
            r7.<init>()
            com.amazon.device.ads.AdContainer$AdContainerFactory r8 = new com.amazon.device.ads.AdContainer$AdContainerFactory
            r7 = r8
            r8.<init>()
            com.amazon.device.ads.MobileAdsInfoStore r8 = com.amazon.device.ads.MobileAdsInfoStore.getInstance()
            com.amazon.device.ads.PermissionChecker r10 = new com.amazon.device.ads.PermissionChecker
            r9 = r10
            r10.<init>()
            com.amazon.device.ads.AndroidBuildInfo r11 = new com.amazon.device.ads.AndroidBuildInfo
            r10 = r11
            r11.<init>()
            com.amazon.device.ads.BridgeSelector r11 = com.amazon.device.ads.BridgeSelector.getInstance()
            com.amazon.device.ads.AdSDKBridgeList r13 = new com.amazon.device.ads.AdSDKBridgeList
            r12 = r13
            r13.<init>()
            com.amazon.device.ads.ThreadUtils$ThreadRunner r13 = com.amazon.device.ads.ThreadUtils.getThreadRunner()
            com.amazon.device.ads.WebRequest$WebRequestFactory r15 = new com.amazon.device.ads.WebRequest$WebRequestFactory
            r14 = r15
            r15.<init>()
            com.amazon.device.ads.AdTimer r15 = new com.amazon.device.ads.AdTimer
            r18 = r15
            r15.<init>()
            com.amazon.device.ads.DebugProperties r19 = com.amazon.device.ads.DebugProperties.getInstance()
            com.amazon.device.ads.ViewabilityObserverFactory r15 = new com.amazon.device.ads.ViewabilityObserverFactory
            r20 = r15
            r15.<init>()
            com.amazon.device.ads.ViewUtils r15 = new com.amazon.device.ads.ViewUtils
            r21 = r15
            r15.<init>()
            com.amazon.device.ads.Configuration r22 = com.amazon.device.ads.Configuration.getInstance()
            r15 = 0
            r16 = 0
            r17 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdController.<init>(android.content.Context, com.amazon.device.ads.AdSize):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AdController(android.content.Context r24, com.amazon.device.ads.AdSize r25, com.amazon.device.ads.ViewabilityObserverFactory r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r20 = r26
            com.amazon.device.ads.WebUtils2 r4 = new com.amazon.device.ads.WebUtils2
            r3 = r4
            r4.<init>()
            com.amazon.device.ads.MetricsCollector r5 = new com.amazon.device.ads.MetricsCollector
            r4 = r5
            r5.<init>()
            com.amazon.device.ads.MobileAdsLoggerFactory r6 = new com.amazon.device.ads.MobileAdsLoggerFactory
            r5 = r6
            r6.<init>()
            com.amazon.device.ads.AdUtils2 r7 = new com.amazon.device.ads.AdUtils2
            r6 = r7
            r7.<init>()
            com.amazon.device.ads.AdContainer$AdContainerFactory r8 = new com.amazon.device.ads.AdContainer$AdContainerFactory
            r7 = r8
            r8.<init>()
            com.amazon.device.ads.MobileAdsInfoStore r8 = com.amazon.device.ads.MobileAdsInfoStore.getInstance()
            com.amazon.device.ads.PermissionChecker r10 = new com.amazon.device.ads.PermissionChecker
            r9 = r10
            r10.<init>()
            com.amazon.device.ads.AndroidBuildInfo r11 = new com.amazon.device.ads.AndroidBuildInfo
            r10 = r11
            r11.<init>()
            com.amazon.device.ads.BridgeSelector r11 = com.amazon.device.ads.BridgeSelector.getInstance()
            com.amazon.device.ads.AdSDKBridgeList r13 = new com.amazon.device.ads.AdSDKBridgeList
            r12 = r13
            r13.<init>()
            com.amazon.device.ads.ThreadUtils$ThreadRunner r13 = com.amazon.device.ads.ThreadUtils.getThreadRunner()
            com.amazon.device.ads.WebRequest$WebRequestFactory r15 = new com.amazon.device.ads.WebRequest$WebRequestFactory
            r14 = r15
            r15.<init>()
            com.amazon.device.ads.AdTimer r15 = new com.amazon.device.ads.AdTimer
            r18 = r15
            r15.<init>()
            com.amazon.device.ads.DebugProperties r19 = com.amazon.device.ads.DebugProperties.getInstance()
            com.amazon.device.ads.ViewUtils r15 = new com.amazon.device.ads.ViewUtils
            r21 = r15
            r15.<init>()
            com.amazon.device.ads.Configuration r22 = com.amazon.device.ads.Configuration.getInstance()
            r15 = 0
            r16 = 0
            r17 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdController.<init>(android.content.Context, com.amazon.device.ads.AdSize, com.amazon.device.ads.ViewabilityObserverFactory):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AdController(android.content.Context r27, com.amazon.device.ads.AdSize r28, com.amazon.device.ads.WebUtils2 r29, com.amazon.device.ads.MetricsCollector r30, com.amazon.device.ads.MobileAdsLoggerFactory r31, com.amazon.device.ads.AdUtils2 r32, com.amazon.device.ads.AdContainer.AdContainerFactory r33, com.amazon.device.ads.MobileAdsInfoStore r34, com.amazon.device.ads.PermissionChecker r35, com.amazon.device.ads.AndroidBuildInfo r36, com.amazon.device.ads.BridgeSelector r37, com.amazon.device.ads.AdSDKBridgeList r38, com.amazon.device.ads.ThreadUtils.ThreadRunner r39, com.amazon.device.ads.WebRequest.WebRequestFactory r40, com.amazon.device.ads.AdHtmlPreprocessor r41, com.amazon.device.ads.AdUrlLoader r42, com.amazon.device.ads.AdCloser r43, com.amazon.device.ads.AdTimer r44, com.amazon.device.ads.DebugProperties r45, com.amazon.device.ads.ViewabilityObserverFactory r46, com.amazon.device.ads.ViewUtils r47, com.amazon.device.ads.Configuration r48) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r22 = r47
            r23 = r48
            com.amazon.device.ads.AdWebViewClientFactory r14 = new com.amazon.device.ads.AdWebViewClientFactory
            r27 = r14
            r24 = r0
            r25 = r3
            r3 = r27
            r0 = r29
            r2 = r36
            r27 = r1
            r1 = r31
            r3.<init>(r0, r1, r2)
            r1 = r27
            r2 = r28
            r0 = r24
            r3 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdController.<init>(android.content.Context, com.amazon.device.ads.AdSize, com.amazon.device.ads.WebUtils2, com.amazon.device.ads.MetricsCollector, com.amazon.device.ads.MobileAdsLoggerFactory, com.amazon.device.ads.AdUtils2, com.amazon.device.ads.AdContainer$AdContainerFactory, com.amazon.device.ads.MobileAdsInfoStore, com.amazon.device.ads.PermissionChecker, com.amazon.device.ads.AndroidBuildInfo, com.amazon.device.ads.BridgeSelector, com.amazon.device.ads.AdSDKBridgeList, com.amazon.device.ads.ThreadUtils$ThreadRunner, com.amazon.device.ads.WebRequest$WebRequestFactory, com.amazon.device.ads.AdHtmlPreprocessor, com.amazon.device.ads.AdUrlLoader, com.amazon.device.ads.AdCloser, com.amazon.device.ads.AdTimer, com.amazon.device.ads.DebugProperties, com.amazon.device.ads.ViewabilityObserverFactory, com.amazon.device.ads.ViewUtils, com.amazon.device.ads.Configuration):void");
    }

    AdController(Context context2, AdSize adSize2, WebUtils2 webUtils2, MetricsCollector metricsCollector2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdUtils2 adUtils2, AdContainer.AdContainerFactory adContainerFactory2, MobileAdsInfoStore mobileAdsInfoStore, PermissionChecker permissionChecker2, AndroidBuildInfo androidBuildInfo2, BridgeSelector bridgeSelector2, AdSDKBridgeList adSDKBridgeList, ThreadUtils.ThreadRunner threadRunner, AdWebViewClientFactory adWebViewClientFactory, WebRequest.WebRequestFactory webRequestFactory, AdHtmlPreprocessor adHtmlPreprocessor2, AdUrlLoader adUrlLoader2, AdCloser adCloser2, AdTimer adTimer2, DebugProperties debugProperties2, ViewabilityObserverFactory viewabilityObserverFactory, ViewUtils viewUtils2, Configuration configuration2) {
        Context context3 = context2;
        AdHtmlPreprocessor adHtmlPreprocessor3 = adHtmlPreprocessor2;
        AdUrlLoader adUrlLoader3 = adUrlLoader2;
        AdCloser adCloser3 = adCloser2;
        this.timeout = 20000;
        this.sdkEventListeners = new ArrayList<>();
        this.adWindowHeight = 0;
        this.adWindowWidth = 0;
        this.windowDimensionsSet = false;
        this.adState = AdState.READY_TO_LOAD;
        this.scalingMultiplier = 1.0d;
        this.isPrepared = false;
        this.defaultParent = null;
        this.isRendering = new AtomicBoolean(false);
        this.hasFinishedLoading = new AtomicBoolean(false);
        this.disableHardwareAccelerationRequest = false;
        this.forceDisableHardwareAcceleration = false;
        this.backButtonOverridden = false;
        this.isModallyExpanded = false;
        this.orientationFailureMetricRecorded = false;
        this.context = context3;
        this.adSize = adSize2;
        this.webUtils = webUtils2;
        this.metricsCollector = metricsCollector2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.adUtils = adUtils2;
        this.adContainerFactory = adContainerFactory2;
        this.infoStore = mobileAdsInfoStore;
        this.permissionChecker = permissionChecker2;
        this.androidBuildInfo = androidBuildInfo2;
        this.bridgeSelector = bridgeSelector2;
        this.adTimer = adTimer2;
        this.debugProperties = debugProperties2;
        this.adSdkBridgeList = adSDKBridgeList;
        this.viewUtils = viewUtils2;
        if (adHtmlPreprocessor3 != null) {
            this.adHtmlPreprocessor = adHtmlPreprocessor3;
        } else {
            this.adHtmlPreprocessor = new AdHtmlPreprocessor(bridgeSelector2, this.adSdkBridgeList, getAdControlAccessor(), mobileAdsLoggerFactory, adUtils2);
        }
        if (adUrlLoader3 != null) {
            this.adUrlLoader = adUrlLoader3;
        } else {
            ThreadUtils.ThreadRunner threadRunner2 = threadRunner;
            WebRequest.WebRequestFactory webRequestFactory2 = webRequestFactory;
            this.adUrlLoader = new AdUrlLoader(threadRunner2, adWebViewClientFactory.createAdWebViewClient(context3, this.adSdkBridgeList, getAdControlAccessor()), webRequestFactory2, getAdControlAccessor(), webUtils2, mobileAdsLoggerFactory, mobileAdsInfoStore.getDeviceInfo());
        }
        this.adUrlLoader.setAdWebViewClientListener(new AdControllerAdWebViewClientListener());
        if (adCloser3 != null) {
            this.adCloser = adCloser3;
        } else {
            this.adCloser = new AdCloser(this);
        }
        this.viewabilityObserver = viewabilityObserverFactory.buildViewabilityObserver(this);
        this.configuration = configuration2;
        if (ApplicationDefaultPreferences.getDefaultPreferences() == null) {
            ApplicationDefaultPreferences.initialize(context2);
        }
    }

    /* access modifiers changed from: package-private */
    public AdContainer getAdContainer() {
        if (this.adContainer == null) {
            AdContainer createAdContainer = createAdContainer();
            this.adContainer = createAdContainer;
            createAdContainer.disableHardwareAcceleration(shouldDisableHardwareAcceleration());
            this.adContainer.setAdWebViewClient(this.adUrlLoader.getAdWebViewClient());
        }
        return this.adContainer;
    }

    /* access modifiers changed from: package-private */
    public AdContainer createAdContainer() {
        return this.adContainerFactory.createAdContainer(this.context, this.adCloser);
    }

    /* access modifiers changed from: package-private */
    public AdControlCallback getAdControlCallback() {
        if (this.adControlCallback == null) {
            this.adControlCallback = new DefaultAdControlCallback();
        }
        return this.adControlCallback;
    }

    /* access modifiers changed from: package-private */
    public void setAdActivity(Activity activity) {
        this.adActivity = activity;
    }

    public void requestDisableHardwareAcceleration(boolean z) {
        this.disableHardwareAccelerationRequest = z;
        AdContainer adContainer2 = this.adContainer;
        if (adContainer2 != null) {
            adContainer2.disableHardwareAcceleration(shouldDisableHardwareAcceleration());
        }
    }

    private boolean shouldDisableHardwareAcceleration() {
        return this.forceDisableHardwareAcceleration || this.disableHardwareAccelerationRequest;
    }

    public AdControlAccessor getAdControlAccessor() {
        if (this.adControlAccessor == null) {
            this.adControlAccessor = new AdControlAccessor(this);
        }
        return this.adControlAccessor;
    }

    public MetricsCollector getMetricsCollector() {
        return this.metricsCollector;
    }

    public void resetMetricsCollector() {
        this.metricsCollector = new MetricsCollector();
    }

    public String getInstrumentationPixelUrl() {
        AdData adData2 = this.adData;
        if (adData2 != null) {
            return adData2.getInstrumentationPixelUrl();
        }
        return null;
    }

    public void setAdState(AdState adState2) {
        this.logger.mo11019d("Changing AdState from %s to %s", this.adState, adState2);
        this.adState = adState2;
    }

    public AdState getAdState() {
        return this.adState;
    }

    public boolean isVisible() {
        return AdState.SHOWING.equals(getAdState()) || AdState.EXPANDED.equals(getAdState());
    }

    public boolean isModal() {
        return getAdSize().isModal() || (AdState.EXPANDED.equals(getAdState()) && this.isModallyExpanded);
    }

    public void orientationChangeAttemptedWhenNotAllowed() {
        if (!this.orientationFailureMetricRecorded) {
            this.orientationFailureMetricRecorded = true;
            getMetricsCollector().incrementMetric(Metrics.MetricType.SET_ORIENTATION_FAILURE);
        }
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        Activity activity = this.adActivity;
        return activity == null ? this.context : activity;
    }

    /* access modifiers changed from: protected */
    public Activity getAdActivity() {
        return this.adActivity;
    }

    public boolean getAndResetIsPrepared() {
        boolean z = this.isPrepared;
        this.isPrepared = false;
        return z;
    }

    public boolean isValid() {
        return !getAdState().equals(AdState.INVALID);
    }

    public AdData getAdData() {
        return this.adData;
    }

    public void setAdData(AdData adData2) {
        this.adData = adData2;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public AdSize getAdSize() {
        return this.adSize;
    }

    public int getWindowHeight() {
        return this.adWindowHeight;
    }

    public int getWindowWidth() {
        return this.adWindowWidth;
    }

    public void setWindowDimensions(int i, int i2) {
        this.adWindowWidth = i;
        this.adWindowHeight = i2;
        this.windowDimensionsSet = true;
    }

    /* access modifiers changed from: package-private */
    public void setViewDimensionsToAdDimensions() {
        AdData adData2 = this.adData;
        if (adData2 != null) {
            int height = (int) (((double) adData2.getHeight()) * getScalingMultiplier() * ((double) this.adUtils.getScalingFactorAsFloat()));
            if (height <= 0) {
                height = -1;
            }
            if (getAdSize().canUpscale()) {
                getAdContainer().setViewHeight(height);
                return;
            }
            getAdContainer().setViewLayoutParams((int) (((double) this.adData.getWidth()) * getScalingMultiplier() * ((double) this.adUtils.getScalingFactorAsFloat())), height, getAdSize().getGravity());
        }
    }

    public void setViewDimensionsToMatchParent() {
        getAdContainer().setViewLayoutParams(-1, -1, 17);
    }

    public boolean areWindowDimensionsSet() {
        return this.windowDimensionsSet;
    }

    public double getScalingMultiplier() {
        return this.scalingMultiplier;
    }

    public ConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }

    public void setConnectionInfo(ConnectionInfo connectionInfo2) {
        this.connectionInfo = connectionInfo2;
    }

    public View getView() {
        return getAdContainer();
    }

    public Destroyable getDestroyable() {
        return getAdContainer();
    }

    public void stashView() {
        getAdContainer().stashView();
    }

    public boolean popView() {
        return getAdContainer().popView();
    }

    public int getViewWidth() {
        return getAdContainer().getViewWidth();
    }

    public int getViewHeight() {
        return getAdContainer().getViewHeight();
    }

    public String getMaxSize() {
        if (!getAdSize().isAuto()) {
            return null;
        }
        return AdSize.getAsSizeString(getWindowWidth(), getWindowHeight());
    }

    public String getScalingMultiplierDescription() {
        if (getScalingMultiplier() > 1.0d) {
            return "u";
        }
        return (getScalingMultiplier() >= 1.0d || getScalingMultiplier() <= 0.0d) ? "n" : "d";
    }

    public void setCallback(AdControlCallback adControlCallback2) {
        this.adControlCallback = adControlCallback2;
    }

    public void addSDKEventListener(SDKEventListener sDKEventListener) {
        this.logger.mo11019d("Add SDKEventListener %s", sDKEventListener);
        this.sdkEventListeners.add(sDKEventListener);
    }

    public void clearSDKEventListeners() {
        this.sdkEventListeners.clear();
    }

    public void resetToReady() {
        if (canBeUsed()) {
            this.adActivity = null;
            this.isPrepared = false;
            this.adTimer.cancelTimer();
            resetMetricsCollector();
            this.orientationFailureMetricRecorded = false;
            getAdContainer().destroy();
            this.adSdkBridgeList.clear();
            this.adData = null;
            setAdState(AdState.READY_TO_LOAD);
        }
    }

    private void reset() {
        if (canBeUsed()) {
            this.isPrepared = false;
            this.adTimer.cancelTimer();
            resetMetricsCollector();
            this.orientationFailureMetricRecorded = false;
            AdContainer adContainer2 = this.adContainer;
            if (adContainer2 != null) {
                adContainer2.destroy();
                this.adSdkBridgeList.clear();
                this.adContainer = null;
            }
            this.adData = null;
        }
    }

    public boolean canShowViews() {
        return getAdContainer().canShowViews();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean prepareForAdLoad(long r4, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r3.canBeUsed()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r4 = "An ad could not be loaded because the view has been destroyed or was not created properly."
            r3.onRequestError(r4)
            return r1
        L_0x000d:
            boolean r0 = r3.checkDefinedActivities()
            if (r0 != 0) goto L_0x0019
            java.lang.String r4 = "Ads cannot load unless \"com.amazon.device.ads.AdActivity\" is correctly declared as an activity in AndroidManifest.xml. Consult the online documentation for more info."
            r3.onRequestError(r4)
            return r1
        L_0x0019:
            android.content.Context r0 = r3.context
            boolean r0 = r3.passesInternetPermissionCheck(r0)
            if (r0 != 0) goto L_0x0027
            java.lang.String r4 = "Ads cannot load because the INTERNET permission is missing from the app's manifest."
            r3.onRequestError(r4)
            return r1
        L_0x0027:
            boolean r0 = r3.isValidAppKey()
            if (r0 != 0) goto L_0x0033
            java.lang.String r4 = "Can't load an ad because Application Key has not been set. Did you forget to call AdRegistration.setAppKey( ... )?"
            r3.onRequestError(r4)
            return r1
        L_0x0033:
            com.amazon.device.ads.AdContainer r0 = r3.getAdContainer()
            boolean r0 = r0.canShowViews()
            if (r0 != 0) goto L_0x0050
            com.amazon.device.ads.Metrics r4 = com.amazon.device.ads.Metrics.getInstance()
            com.amazon.device.ads.MetricsCollector r4 = r4.getMetricsCollector()
            com.amazon.device.ads.Metrics$MetricType r5 = com.amazon.device.ads.Metrics.MetricType.AD_FAILED_UNKNOWN_WEBVIEW_ISSUE
            r4.incrementMetric(r5)
            java.lang.String r4 = "We will be unable to create a WebView for rendering an ad due to an unknown issue with the WebView."
            r3.onRequestError(r4)
            return r1
        L_0x0050:
            boolean r6 = r3.isReadyToLoad(r6)
            r0 = 1
            if (r6 != 0) goto L_0x0092
            com.amazon.device.ads.AdState r6 = r3.getAdState()
            com.amazon.device.ads.AdState r2 = com.amazon.device.ads.AdState.RENDERED
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0073
            boolean r6 = r3.isExpired()
            if (r6 == 0) goto L_0x006b
            r6 = 0
            goto L_0x008f
        L_0x006b:
            com.amazon.device.ads.MobileAdsLogger r6 = r3.logger
            java.lang.String r2 = "An ad is ready to show. Please call showAd() to show the ad before loading another ad."
            r6.mo10939e(r2)
            goto L_0x008e
        L_0x0073:
            com.amazon.device.ads.AdState r6 = r3.getAdState()
            com.amazon.device.ads.AdState r2 = com.amazon.device.ads.AdState.EXPANDED
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0087
            com.amazon.device.ads.MobileAdsLogger r6 = r3.logger
            java.lang.String r2 = "An ad could not be loaded because another ad is currently expanded."
            r6.mo10939e(r2)
            goto L_0x008e
        L_0x0087:
            com.amazon.device.ads.MobileAdsLogger r6 = r3.logger
            java.lang.String r2 = "An ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad."
            r6.mo10939e(r2)
        L_0x008e:
            r6 = 1
        L_0x008f:
            if (r6 == 0) goto L_0x0092
            return r1
        L_0x0092:
            r3.reset()
            com.amazon.device.ads.MetricsCollector r6 = r3.getMetricsCollector()
            com.amazon.device.ads.Metrics$MetricType r2 = com.amazon.device.ads.Metrics.MetricType.AD_LATENCY_TOTAL
            r6.startMetricInMillisecondsFromNanoseconds(r2, r4)
            com.amazon.device.ads.MetricsCollector r6 = r3.getMetricsCollector()
            com.amazon.device.ads.Metrics$MetricType r2 = com.amazon.device.ads.Metrics.MetricType.AD_LATENCY_TOTAL_FAILURE
            r6.startMetricInMillisecondsFromNanoseconds(r2, r4)
            com.amazon.device.ads.MetricsCollector r6 = r3.getMetricsCollector()
            com.amazon.device.ads.Metrics$MetricType r2 = com.amazon.device.ads.Metrics.MetricType.AD_LATENCY_TOTAL_SUCCESS
            r6.startMetricInMillisecondsFromNanoseconds(r2, r4)
            com.amazon.device.ads.MetricsCollector r6 = r3.getMetricsCollector()
            com.amazon.device.ads.Metrics$MetricType r2 = com.amazon.device.ads.Metrics.MetricType.AD_LOAD_LATENCY_LOADAD_TO_FETCH_THREAD_REQUEST_START
            r6.startMetricInMillisecondsFromNanoseconds(r2, r4)
            com.amazon.device.ads.AdState r4 = com.amazon.device.ads.AdState.LOADING
            r3.setAdState(r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.isRendering
            r4.set(r1)
            r3.setHasFinishedLoading(r1)
            com.amazon.device.ads.AdTimer r4 = r3.adTimer
            r4.restartTimer()
            com.amazon.device.ads.AdTimer r4 = r3.adTimer
            com.amazon.device.ads.AdController$1 r5 = new com.amazon.device.ads.AdController$1
            r5.<init>()
            int r6 = r3.getTimeout()
            long r1 = (long) r6
            r4.scheduleTask(r5, r1)
            com.amazon.device.ads.MobileAdsInfoStore r4 = r3.infoStore
            com.amazon.device.ads.DeviceInfo r4 = r4.getDeviceInfo()
            android.content.Context r5 = r3.context
            r4.populateUserAgentString(r5)
            r3.isPrepared = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdController.prepareForAdLoad(long, boolean):boolean");
    }

    public void initialize(String str) {
        if (canBeUsed()) {
            determineShouldForceDisableHardwareAcceleration();
            if (initializeAdContainer()) {
                calculateScalingMultiplier();
                Iterator<AAXCreative> it = this.adData.iterator();
                while (it.hasNext()) {
                    Set<AdSDKBridgeFactory> bridgeFactories = this.bridgeSelector.getBridgeFactories(it.next());
                    if (bridgeFactories != null) {
                        for (AdSDKBridgeFactory createAdSDKBridge : bridgeFactories) {
                            addAdSDKBridge(createAdSDKBridge.createAdSDKBridge(getAdControlAccessor()));
                        }
                    }
                }
                this.slotID = str;
                adLoaded();
            }
        }
    }

    private void addAdSDKBridge(AdSDKBridge adSDKBridge) {
        this.adSdkBridgeList.addBridge(adSDKBridge);
    }

    private void calculateScalingMultiplier() {
        if (!isInterstitial()) {
            float scalingFactorAsFloat = this.infoStore.getDeviceInfo().getScalingFactorAsFloat();
            int height = (int) (((float) this.adData.getHeight()) * scalingFactorAsFloat);
            this.scalingMultiplier = this.adUtils.calculateScalingMultiplier((int) (((float) this.adData.getWidth()) * scalingFactorAsFloat), height, getWindowWidth(), getWindowHeight());
            int maxWidth = getAdSize().getMaxWidth();
            if (maxWidth > 0) {
                double d = (double) maxWidth;
                if (((double) this.adData.getWidth()) * this.scalingMultiplier > d) {
                    this.scalingMultiplier = d / ((double) this.adData.getWidth());
                }
            }
            if (!getAdSize().canUpscale() && this.scalingMultiplier > 1.0d) {
                this.scalingMultiplier = 1.0d;
            }
            setViewDimensionsToAdDimensions();
            return;
        }
        this.scalingMultiplier = -1.0d;
    }

    private void determineShouldForceDisableHardwareAcceleration() {
        if ((AndroidTargetUtils.isAndroidAPI(this.androidBuildInfo, 14) || AndroidTargetUtils.isAndroidAPI(this.androidBuildInfo, 15)) && this.adData.getCreativeTypes().contains(AAXCreative.REQUIRES_TRANSPARENCY)) {
            this.forceDisableHardwareAcceleration = true;
        } else {
            this.forceDisableHardwareAcceleration = false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean initializeAdContainer() {
        try {
            getAdContainer().initialize();
            return true;
        } catch (IllegalStateException unused) {
            adFailed(new AdError(AdError.ErrorCode.INTERNAL_ERROR, "An unknown error occurred when attempting to create the web view."));
            setAdState(AdState.INVALID);
            this.logger.mo10939e("An unknown error occurred when attempting to create the web view.");
            return false;
        }
    }

    public void render() {
        if (canBeUsed()) {
            setAdState(AdState.RENDERING);
            long nanoTime = System.nanoTime();
            getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LOAD_LATENCY_FINALIZE_FETCH_START_TO_RENDER_START, nanoTime);
            getMetricsCollector().startMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_RENDER, nanoTime);
            this.isRendering.set(true);
            loadHtml(this.configuration.getStringWithDefault(Configuration.ConfigOption.BASE_URL, "http://mads.amazon-adsystem.com/"), this.adData.getCreative());
        }
    }

    public void preloadHtml(String str, String str2, PreloadCallback preloadCallback) {
        loadHtml(str, str2, true, preloadCallback);
    }

    public void loadHtml(String str, String str2) {
        loadHtml(str, str2, false, (PreloadCallback) null);
    }

    public void loadHtml(String str, String str2, boolean z, PreloadCallback preloadCallback) {
        getAdContainer().removePreviousInterfaces();
        clearSDKEventListeners();
        getAdContainer().loadHtml(str, this.adHtmlPreprocessor.preprocessHtml(str2, z), z, preloadCallback);
    }

    public void preloadUrl(String str, PreloadCallback preloadCallback) {
        this.adUrlLoader.loadUrl(str, true, preloadCallback);
    }

    public void loadUrl(String str) {
        this.adUrlLoader.loadUrl(str, false, (PreloadCallback) null);
    }

    public void openUrl(String str) {
        this.adUrlLoader.openUrl(str);
    }

    public void setExpanded(boolean z) {
        if (z) {
            setAdState(AdState.EXPANDED);
        } else {
            setAdState(AdState.SHOWING);
        }
    }

    public void injectJavascript(final String str, final boolean z) {
        ThreadUtils.executeOnMainThread(new Runnable() {
            public void run() {
                AdController.this.getAdContainer().injectJavascript(str, z);
            }
        });
    }

    public void destroy() {
        if (!canBeUsed()) {
            this.logger.mo10939e("The ad cannot be destroyed because it has already been destroyed.");
            return;
        }
        closeAd();
        this.adState = AdState.DESTROYED;
        if (this.adContainer != null) {
            getAdContainer().destroy();
            this.adSdkBridgeList.clear();
            this.adContainer = null;
        }
        this.isPrepared = false;
        this.metricsCollector = null;
        this.adData = null;
    }

    /* access modifiers changed from: protected */
    public boolean passesInternetPermissionCheck(Context context2) {
        return this.permissionChecker.hasInternetPermission(context2);
    }

    public void onRequestError(String str) {
        this.logger.mo10939e(str);
        adFailed(new AdError(AdError.ErrorCode.REQUEST_ERROR, str));
    }

    public boolean isExpired() {
        AdData adData2 = this.adData;
        return adData2 != null && adData2.isExpired();
    }

    public boolean canBeUsed() {
        return !AdState.DESTROYED.equals(getAdState()) && !AdState.INVALID.equals(getAdState());
    }

    private boolean isReadyToLoad(boolean z) {
        return getAdControlCallback().isAdReady(z);
    }

    public boolean startAdDrawing() {
        this.adTimer.cancelTimer();
        return AdState.RENDERED.equals(getAdState()) && canExpireOrDraw(AdState.DRAWING);
    }

    private synchronized boolean canExpireOrDraw(AdState adState2) {
        if (AdState.RENDERED.compareTo(getAdState()) < 0) {
            return false;
        }
        setAdState(adState2);
        return true;
    }

    public void adShown() {
        if (canBeUsed()) {
            getMetricsCollector().stopMetric(Metrics.MetricType.AD_SHOW_LATENCY);
            this.adTimer.cancelTimer();
            if (canFireImpressionPixel()) {
                this.webUtils.executeWebRequestInThread(getAdData().getImpressionPixelUrl(), false);
            }
            setAdState(AdState.SHOWING);
            if (!areWindowDimensionsSet()) {
                setWindowDimensions(getView().getWidth(), getView().getHeight());
            }
            fireSDKEvent(new SDKEvent(SDKEvent.SDKEventType.VISIBLE));
            this.viewabilityObserver.fireViewableEvent(false);
        }
    }

    private boolean canFireImpressionPixel() {
        return !getAdState().equals(AdState.HIDDEN);
    }

    public void adHidden() {
        setAdState(AdState.HIDDEN);
        fireSDKEvent(new SDKEvent(SDKEvent.SDKEventType.HIDDEN));
    }

    /* access modifiers changed from: package-private */
    public void onAdTimedOut() {
        if (this.debugProperties.getDebugPropertyAsBoolean(DebugProperties.DEBUG_CAN_TIMEOUT, true).booleanValue() && !getAndSetHasFinishedLoading(true)) {
            adFailedAfterTimerCheck(new AdError(AdError.ErrorCode.NETWORK_TIMEOUT, "Ad Load Timed Out"));
            setAdState(AdState.INVALID);
        }
    }

    /* access modifiers changed from: private */
    public void onAdExpired() {
        if (AdState.RENDERED.compareTo(getAdState()) >= 0 && canExpireOrDraw(AdState.INVALID)) {
            this.logger.mo10938d("Ad Has Expired");
            callOnAdExpired();
        }
    }

    private void callOnAdExpired() {
        ThreadUtils.scheduleOnMainThread(new Runnable() {
            public void run() {
                AdController.this.getAdControlCallback().onAdExpired();
                AdController.this.submitAndResetMetricsIfNecessary(true);
            }
        });
    }

    public void adFailed(AdError adError) {
        if (canBeUsed() && !getAndSetHasFinishedLoading(true)) {
            this.adTimer.cancelTimer();
            adFailedAfterTimerCheck(adError);
            setAdState(AdState.READY_TO_LOAD);
        }
    }

    private void adFailedAfterTimerCheck(AdError adError) {
        if (getMetricsCollector() == null || getMetricsCollector().isMetricsCollectorEmpty()) {
            adFailedBeforeAdMetricsStart(adError);
        } else {
            adFailedAfterAdMetricsStart(adError);
        }
    }

    private void adLoaded() {
        if (canBeUsed()) {
            setAdState(AdState.LOADED);
            callOnAdLoaded(this.adData.getProperties());
        }
    }

    /* access modifiers changed from: package-private */
    public void adFailedBeforeAdMetricsStart(AdError adError) {
        callOnAdFailedToLoad(adError, false);
    }

    /* access modifiers changed from: package-private */
    public void adFailedAfterAdMetricsStart(AdError adError) {
        accumulateAdFailureMetrics(adError);
        callOnAdFailedToLoad(adError, true);
    }

    /* access modifiers changed from: package-private */
    public void accumulateAdFailureMetrics(AdError adError) {
        long nanoTime = System.nanoTime();
        getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_TOTAL, nanoTime);
        getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LOAD_LATENCY_FINALIZE_FETCH_START_TO_FAILURE, nanoTime);
        getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_TOTAL_FAILURE, nanoTime);
        if (adError != null) {
            getMetricsCollector().incrementMetric(Metrics.MetricType.AD_LOAD_FAILED);
            int i = C090111.$SwitchMap$com$amazon$device$ads$AdError$ErrorCode[adError.getCode().ordinal()];
            if (i == 1) {
                getMetricsCollector().incrementMetric(Metrics.MetricType.AD_LOAD_FAILED_NO_FILL);
            } else if (i == 2) {
                getMetricsCollector().incrementMetric(Metrics.MetricType.AD_LOAD_FAILED_NETWORK_TIMEOUT);
                if (this.isRendering.get()) {
                    getMetricsCollector().incrementMetric(Metrics.MetricType.AD_LOAD_FAILED_ON_PRERENDERING_TIMEOUT);
                } else {
                    getMetricsCollector().incrementMetric(Metrics.MetricType.AD_LOAD_FAILED_ON_AAX_CALL_TIMEOUT);
                }
            } else if (i == 3) {
                getMetricsCollector().incrementMetric(Metrics.MetricType.AD_LOAD_FAILED_INTERNAL_ERROR);
            }
        }
        getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_RENDER_FAILED, nanoTime);
        if (getAdState().equals(AdState.RENDERING)) {
            getMetricsCollector().incrementMetric(Metrics.MetricType.AD_COUNTER_RENDERING_FATAL);
        }
        setAdditionalMetrics();
    }

    /* renamed from: com.amazon.device.ads.AdController$11 */
    static /* synthetic */ class C090111 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdError$ErrorCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.amazon.device.ads.AdError$ErrorCode[] r0 = com.amazon.device.ads.AdError.ErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode = r0
                com.amazon.device.ads.AdError$ErrorCode r1 = com.amazon.device.ads.AdError.ErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdError$ErrorCode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdError$ErrorCode r1 = com.amazon.device.ads.AdError.ErrorCode.NETWORK_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdError$ErrorCode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdError$ErrorCode r1 = com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdController.C090111.<clinit>():void");
        }
    }

    public void adRendered(String str) {
        if (canBeUsed()) {
            this.logger.mo10938d("Ad Rendered");
            if (!getAdState().equals(AdState.RENDERING)) {
                MobileAdsLogger mobileAdsLogger = this.logger;
                mobileAdsLogger.mo10938d("Ad State was not Rendering. It was " + getAdState());
            } else if (!getAndSetHasFinishedLoading(true)) {
                this.isRendering.set(false);
                this.adTimer.cancelTimer();
                startExpirationTimer();
                setAdState(AdState.RENDERED);
                callOnAdRendered();
                long nanoTime = System.nanoTime();
                if (getMetricsCollector() != null) {
                    getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_RENDER, nanoTime);
                    getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_TOTAL, nanoTime);
                    getMetricsCollector().stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LATENCY_TOTAL_SUCCESS, nanoTime);
                    setAdditionalMetrics();
                    submitAndResetMetricsIfNecessary(true);
                }
                callPostAdRendered();
            }
            fireSDKEvent(new SDKEvent(SDKEvent.SDKEventType.RENDERED).setParameter("url", str));
        }
    }

    private void startExpirationTimer() {
        long timeToExpire = getAdData().getTimeToExpire();
        if (timeToExpire > 0) {
            this.adTimer.restartTimer();
            this.adTimer.scheduleTask(new TimerTask() {
                public void run() {
                    AdController.this.onAdExpired();
                }
            }, timeToExpire);
        }
    }

    /* access modifiers changed from: package-private */
    public void callOnAdFailedToLoad(final AdError adError, final boolean z) {
        ThreadUtils.scheduleOnMainThread(new Runnable() {
            public void run() {
                AdController.this.getAdControlCallback().onAdFailed(adError);
                AdController.this.submitAndResetMetricsIfNecessary(z);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdLoaded(final AdProperties adProperties) {
        ThreadUtils.scheduleOnMainThread(new Runnable() {
            public void run() {
                if (AdController.this.canBeUsed()) {
                    AdController.this.getAdControlCallback().onAdLoaded(adProperties);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdRendered() {
        ThreadUtils.scheduleOnMainThread(new Runnable() {
            public void run() {
                if (AdController.this.canBeUsed()) {
                    AdController.this.getAdControlCallback().onAdRendered();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callPostAdRendered() {
        ThreadUtils.scheduleOnMainThread(new Runnable() {
            public void run() {
                if (AdController.this.canBeUsed()) {
                    AdController.this.getAdControlCallback().postAdRendered();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void callOnAdEvent(final AdEvent adEvent) {
        ThreadUtils.scheduleOnMainThread(new Runnable() {
            public void run() {
                if (AdController.this.canBeUsed()) {
                    AdController.this.getAdControlCallback().onAdEvent(adEvent);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void setHasFinishedLoading(boolean z) {
        this.hasFinishedLoading.set(z);
    }

    /* access modifiers changed from: package-private */
    public boolean getAndSetHasFinishedLoading(boolean z) {
        return this.hasFinishedLoading.getAndSet(z);
    }

    public void fireAdEvent(AdEvent adEvent) {
        this.logger.mo11019d("Firing AdEvent of type %s", adEvent.getAdEventType());
        callOnAdEvent(adEvent);
    }

    public void fireSDKEvent(SDKEvent sDKEvent) {
        this.logger.mo11019d("Firing SDK Event of type %s", sDKEvent.getEventType());
        Iterator<SDKEventListener> it = this.sdkEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onSDKEvent(sDKEvent, getAdControlAccessor());
        }
    }

    public void fireViewableEvent() {
        this.viewabilityObserver.fireViewableEvent(false);
    }

    public boolean closeAd() {
        return this.adCloser.closeAd();
    }

    public void enableNativeCloseButton(boolean z, RelativePosition relativePosition) {
        getAdContainer().enableNativeCloseButton(z, relativePosition);
    }

    public void removeNativeCloseButton() {
        getAdContainer().removeNativeCloseButton();
    }

    public void showNativeCloseButtonImage(boolean z) {
        getAdContainer().showNativeCloseButtonImage(z);
    }

    /* access modifiers changed from: protected */
    public void setAdditionalMetrics() {
        this.adUtils.setConnectionMetrics(getConnectionInfo(), getMetricsCollector());
        if (getWindowHeight() == 0) {
            getMetricsCollector().incrementMetric(Metrics.MetricType.ADLAYOUT_HEIGHT_ZERO);
        }
        getMetricsCollector().setMetricString(Metrics.MetricType.VIEWPORT_SCALE, getScalingMultiplierDescription());
    }

    public void submitAndResetMetrics() {
        Metrics.getInstance().submitAndResetMetrics(this);
    }

    public void submitAndResetMetricsIfNecessary(boolean z) {
        if (z) {
            submitAndResetMetrics();
        }
    }

    public void moveViewToViewGroup(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, boolean z) {
        ViewGroup viewParent = getViewParent();
        if (this.defaultParent == null) {
            this.defaultParent = viewParent;
        }
        if (viewParent != null) {
            viewParent.removeView(getView());
        }
        setViewDimensionsToMatchParent();
        viewGroup.addView(getView(), layoutParams);
        this.isModallyExpanded = z;
        setExpanded(true);
        if (this.isModallyExpanded) {
            captureBackButton();
        }
    }

    public void captureBackButton() {
        getAdContainer().listenForKey(new View.OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                AdController.this.onBackButtonPress();
                return true;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public boolean onBackButtonPress() {
        if (this.backButtonOverridden) {
            fireSDKEvent(new SDKEvent(SDKEvent.SDKEventType.BACK_BUTTON_PRESSED));
            return true;
        }
        closeAd();
        return false;
    }

    /* access modifiers changed from: package-private */
    public ViewGroup getViewParent() {
        return (ViewGroup) getView().getParent();
    }

    /* access modifiers changed from: package-private */
    public ViewGroup getViewParentIfExpanded() {
        ViewGroup viewGroup = this.defaultParent;
        if (viewGroup == null || viewGroup == getView().getParent()) {
            return null;
        }
        return getViewParent();
    }

    public void moveViewBackToParent(ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup = (ViewGroup) getView().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(getView());
        }
        setViewDimensionsToAdDimensions();
        ViewGroup viewGroup2 = this.defaultParent;
        if (viewGroup2 != null) {
            viewGroup2.addView(getView(), layoutParams);
        }
        getAdContainer().listenForKey((View.OnKeyListener) null);
        setExpanded(false);
    }

    /* access modifiers changed from: package-private */
    public boolean checkDefinedActivities() {
        return this.adUtils.checkDefinedActivities(getContext().getApplicationContext());
    }

    /* access modifiers changed from: package-private */
    public boolean isValidAppKey() {
        return this.infoStore.getRegistrationInfo().getAppKey() != null;
    }

    /* access modifiers changed from: package-private */
    public Position getAdPosition() {
        int viewWidth = getViewWidth();
        int viewHeight = getViewHeight();
        if (viewWidth == 0 && viewHeight == 0) {
            viewWidth = getWindowWidth();
            viewHeight = getWindowHeight();
        }
        int pixelToDeviceIndependentPixel = this.adUtils.pixelToDeviceIndependentPixel(viewWidth);
        int pixelToDeviceIndependentPixel2 = this.adUtils.pixelToDeviceIndependentPixel(viewHeight);
        int[] iArr = new int[2];
        getAdContainer().getViewLocationOnScreen(iArr);
        View rootView = getRootView();
        if (rootView == null) {
            this.logger.mo10942w("Could not find the activity's root view while determining ad position.");
            return null;
        }
        int[] iArr2 = new int[2];
        rootView.getLocationOnScreen(iArr2);
        return new Position(new Size(pixelToDeviceIndependentPixel, pixelToDeviceIndependentPixel2), this.adUtils.pixelToDeviceIndependentPixel(iArr[0]), this.adUtils.pixelToDeviceIndependentPixel(iArr[1] - iArr2[1]));
    }

    /* access modifiers changed from: package-private */
    public boolean isInterstitial() {
        return AdSize.SizeType.INTERSTITIAL.equals(this.adSize.getSizeType());
    }

    public Size getMaxExpandableSize() {
        View rootView = getRootView();
        if (rootView == null) {
            this.logger.mo10942w("Could not find the activity's root view while determining max expandable size.");
            return null;
        }
        return new Size(this.adUtils.pixelToDeviceIndependentPixel(rootView.getWidth()), this.adUtils.pixelToDeviceIndependentPixel(rootView.getHeight()));
    }

    /* access modifiers changed from: package-private */
    public Size getScreenSize() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getMetrics(displayMetrics);
        return new Size(this.adUtils.pixelToDeviceIndependentPixel(displayMetrics.widthPixels), this.adUtils.pixelToDeviceIndependentPixel(displayMetrics.heightPixels));
    }

    /* access modifiers changed from: package-private */
    public void getMetrics(DisplayMetrics displayMetrics) {
        ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    /* access modifiers changed from: package-private */
    public void addJavascriptInterface(Object obj, boolean z, String str) {
        getAdContainer().addJavascriptInterface(obj, z, str);
    }

    /* access modifiers changed from: package-private */
    public void reload() {
        getAdContainer().reload();
    }

    /* access modifiers changed from: package-private */
    public void putUrlExecutorInAdWebViewClient(String str, AdWebViewClient.UrlExecutor urlExecutor) {
        this.adUrlLoader.putUrlExecutorInAdWebViewClient(str, urlExecutor);
    }

    public void overrideBackButton(boolean z) {
        this.backButtonOverridden = z;
    }

    public void setAllowClicks(boolean z) {
        getAdContainer().setAllowClicks(z);
    }

    public void registerViewabilityInterest() {
        this.viewabilityObserver.registerViewabilityInterest();
    }

    public void deregisterViewabilityInterest() {
        this.viewabilityObserver.deregisterViewabilityInterest();
    }

    class DefaultAdControlCallback implements AdControlCallback {
        DefaultAdControlCallback() {
        }

        public boolean isAdReady(boolean z) {
            AdController.this.logger.mo10938d("DefaultAdControlCallback isAdReady called");
            return AdController.this.getAdState().equals(AdState.READY_TO_LOAD) || AdController.this.getAdState().equals(AdState.SHOWING);
        }

        public void onAdLoaded(AdProperties adProperties) {
            AdController.this.logger.mo10938d("DefaultAdControlCallback onAdLoaded called");
        }

        public void onAdRendered() {
            AdController.this.logger.mo10938d("DefaultAdControlCallback onAdRendered called");
        }

        public void postAdRendered() {
            AdController.this.logger.mo10938d("DefaultAdControlCallback postAdRendered called");
        }

        public void onAdFailed(AdError adError) {
            AdController.this.logger.mo10938d("DefaultAdControlCallback onAdFailed called");
        }

        public void onAdEvent(AdEvent adEvent) {
            AdController.this.logger.mo10938d("DefaultAdControlCallback onAdEvent called");
        }

        public int adClosing() {
            AdController.this.logger.mo10938d("DefaultAdControlCallback adClosing called");
            return 1;
        }

        public void onAdExpired() {
            AdController.this.logger.mo10938d("DefaultAdControlCallback onAdExpired called");
        }
    }

    private class AdControllerAdWebViewClientListener implements AdWebViewClient.AdWebViewClientListener {
        public void onLoadResource(WebView webView, String str) {
        }

        public void onPageStarted(WebView webView, String str) {
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        private AdControllerAdWebViewClientListener() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (AdController.this.getAdContainer().isCurrentView(webView)) {
                AdController.this.adRendered(str);
            }
        }
    }

    public boolean isViewable() {
        return this.viewabilityObserver.isViewable();
    }

    public void addOnGlobalLayoutListener(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.adContainer.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public void removeOnGlobalLayoutListener(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        AdContainer adContainer2 = this.adContainer;
        if (adContainer2 != null) {
            this.viewUtils.removeOnGlobalLayoutListener(adContainer2.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public View getRootView() {
        return getAdContainer().getRootView().findViewById(16908290);
    }

    public String getSlotID() {
        return this.slotID;
    }
}
