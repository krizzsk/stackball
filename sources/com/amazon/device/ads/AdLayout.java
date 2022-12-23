package com.amazon.device.ads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.MobileAdsLogger;
import com.appsflyer.internal.referrer.Payload;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class AdLayout extends FrameLayout implements C0898Ad {
    private static final String CONTENT_DESCRIPTION_AD_LAYOUT = "adLayoutObject";
    public static final int DEFAULT_TIMEOUT = 20000;
    static final String LAYOUT_NOT_RUN_ERR_MSG = "Can't load an ad because the view size cannot be determined.";
    static final String LAYOUT_PARAMS_NULL_ERR_MSG = "Can't load an ad because layout parameters are blank. Use setLayoutParams() to specify dimensions for this AdLayout.";
    static final String LOADING_IN_PROGRESS_LOG_MSG = "Can't load an ad because an ad is currently loading. Please wait for the ad to finish loading and showing before loading another ad.";
    static final String LOADING_OR_LOADED_LOG_MSG = "Can't load an ad because an ad is currently loading or already loaded. Please wait for the ad to finish loading or showing before loading another ad.";
    private static final String LOGTAG = AdLayout.class.getSimpleName();
    private static ScheduledThreadPoolExecutor threadPool;
    /* access modifiers changed from: private */
    public View activityRootView;
    /* access modifiers changed from: private */
    public AdController adController;
    private final AdControllerFactory adControllerFactory;
    private AdListenerExecutor adListenerExecutor;
    private final AdListenerExecutorFactory adListenerExecutorFactory;
    private final AdLoadStarter adLoadStarter;
    private final AdRegistrationExecutor adRegistration;
    private AdSize adSize;
    private AdTargetingOptions adTargetingOptions;
    private boolean attached;
    /* access modifiers changed from: private */
    public boolean autoShow;
    private final Context context;
    private Destroyable currentDestroyable;
    private View currentView;
    private boolean hasRegisterBroadcastReciever;
    private boolean isDestroyed;
    /* access modifiers changed from: private */
    public boolean isInForeground;
    private boolean isInitialized;
    private boolean isParentViewMissingAtLoadTime;
    private int lastVisibility;
    /* access modifiers changed from: private */
    public final MobileAdsLogger logger;
    private final MobileAdsLoggerFactory loggerFactory;
    private AtomicBoolean needsToLoadAdOnLayout;
    /* access modifiers changed from: private */
    public final AtomicBoolean previousAdExpired;
    /* access modifiers changed from: private */
    public AdProperties properties;
    private BroadcastReceiver screenStateReceiver;
    private boolean shouldDisableWebViewHardwareAcceleration;

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        threadPool = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
    }

    public AdLayout(Context context2) {
        this(context2, AdSize.SIZE_AUTO);
    }

    public AdLayout(Context context2, AdSize adSize2) {
        this(context2, adSize2, new MobileAdsLoggerFactory(), new AdControllerFactory(), AdRegistration.getAmazonAdRegistrationExecutor(), new AdLoadStarter());
    }

    AdLayout(Context context2, AdSize adSize2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdControllerFactory adControllerFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        this(context2, adSize2, mobileAdsLoggerFactory, new AdListenerExecutorFactory(mobileAdsLoggerFactory), adControllerFactory2, adRegistrationExecutor, adLoadStarter2);
    }

    AdLayout(Context context2, AdSize adSize2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdListenerExecutorFactory adListenerExecutorFactory2, AdControllerFactory adControllerFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        super(context2);
        this.hasRegisterBroadcastReciever = false;
        this.attached = false;
        this.lastVisibility = 8;
        this.needsToLoadAdOnLayout = new AtomicBoolean(false);
        this.isParentViewMissingAtLoadTime = false;
        this.activityRootView = null;
        this.adTargetingOptions = null;
        this.isDestroyed = false;
        this.isInitialized = false;
        this.autoShow = true;
        this.previousAdExpired = new AtomicBoolean(false);
        this.context = context2;
        this.adSize = adSize2;
        this.loggerFactory = mobileAdsLoggerFactory;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.adListenerExecutorFactory = adListenerExecutorFactory2;
        this.adControllerFactory = adControllerFactory2;
        this.adRegistration = adRegistrationExecutor;
        this.adLoadStarter = adLoadStarter2;
        if (ApplicationDefaultPreferences.getDefaultPreferences() == null) {
            ApplicationDefaultPreferences.initialize(context2);
        }
    }

    public AdLayout(Context context2, AttributeSet attributeSet) {
        this(context2, attributeSet, new MobileAdsLoggerFactory(), new AdControllerFactory(), AdRegistration.getAmazonAdRegistrationExecutor(), new AdLoadStarter());
    }

    AdLayout(Context context2, AttributeSet attributeSet, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdControllerFactory adControllerFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        this(context2, attributeSet, mobileAdsLoggerFactory, new AdListenerExecutorFactory(mobileAdsLoggerFactory), adControllerFactory2, adRegistrationExecutor, adLoadStarter2);
    }

    AdLayout(Context context2, AttributeSet attributeSet, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdListenerExecutorFactory adListenerExecutorFactory2, AdControllerFactory adControllerFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        super(context2, attributeSet);
        this.hasRegisterBroadcastReciever = false;
        this.attached = false;
        this.lastVisibility = 8;
        this.needsToLoadAdOnLayout = new AtomicBoolean(false);
        this.isParentViewMissingAtLoadTime = false;
        this.activityRootView = null;
        this.adTargetingOptions = null;
        this.isDestroyed = false;
        this.isInitialized = false;
        this.autoShow = true;
        this.previousAdExpired = new AtomicBoolean(false);
        this.context = context2;
        this.adSize = determineAdSize(attributeSet);
        this.loggerFactory = mobileAdsLoggerFactory;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.adListenerExecutorFactory = adListenerExecutorFactory2;
        this.adControllerFactory = adControllerFactory2;
        this.adRegistration = adRegistrationExecutor;
        this.adLoadStarter = adLoadStarter2;
    }

    public AdLayout(Context context2, AttributeSet attributeSet, int i) {
        this(context2, attributeSet, i, new MobileAdsLoggerFactory(), new AdControllerFactory(), AdRegistration.getAmazonAdRegistrationExecutor(), new AdLoadStarter());
    }

    AdLayout(Context context2, AttributeSet attributeSet, int i, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdControllerFactory adControllerFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        this(context2, attributeSet, i, mobileAdsLoggerFactory, new AdListenerExecutorFactory(mobileAdsLoggerFactory), adControllerFactory2, adRegistrationExecutor, adLoadStarter2);
    }

    AdLayout(Context context2, AttributeSet attributeSet, int i, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdListenerExecutorFactory adListenerExecutorFactory2, AdControllerFactory adControllerFactory2, AdRegistrationExecutor adRegistrationExecutor, AdLoadStarter adLoadStarter2) {
        super(context2, attributeSet, i);
        this.hasRegisterBroadcastReciever = false;
        this.attached = false;
        this.lastVisibility = 8;
        this.needsToLoadAdOnLayout = new AtomicBoolean(false);
        this.isParentViewMissingAtLoadTime = false;
        this.activityRootView = null;
        this.adTargetingOptions = null;
        this.isDestroyed = false;
        this.isInitialized = false;
        this.autoShow = true;
        this.previousAdExpired = new AtomicBoolean(false);
        this.context = context2;
        this.adSize = determineAdSize(attributeSet);
        this.loggerFactory = mobileAdsLoggerFactory;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.adListenerExecutorFactory = adListenerExecutorFactory2;
        this.adControllerFactory = adControllerFactory2;
        this.adRegistration = adRegistrationExecutor;
        this.adLoadStarter = adLoadStarter2;
    }

    public void setX(float f) {
        super.setX(f);
        fireViewableEvent();
    }

    public void setY(float f) {
        super.setY(f);
        fireViewableEvent();
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        fireViewableEvent();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        fireViewableEvent();
    }

    private void fireViewableEvent() {
        AdController adController2 = this.adController;
        if (adController2 != null) {
            adController2.fireViewableEvent();
        }
    }

    private AdSize determineAdSize(AttributeSet attributeSet) {
        String attributeValue = getAttributeValue(attributeSet, "http://schemas.android.com/apk/lib/com.amazon.device.ads", "adSize");
        if (attributeValue == null) {
            attributeValue = getAttributeValue(attributeSet, "http://schemas.android.com/apk/res/" + this.context.getPackageName(), "adSize");
            if (attributeValue != null) {
                this.logger.forceLog(MobileAdsLogger.Level.WARN, "DEPRECATED - Please use the XML namespace \"http://schemas.android.com/apk/lib/com.amazon.device.ads\" for specifying AdLayout properties.", new Object[0]);
                if (attributeValue.toLowerCase(Locale.US).equals(Payload.CUSTOM)) {
                    this.logger.forceLog(MobileAdsLogger.Level.ERROR, "Using \"custom\" or \"CUSTOM\" for the \"adSize\" property is no longer supported. Please specifiy a size or remove the property to use Auto Ad Size.", new Object[0]);
                    throw new IllegalArgumentException("Using \"custom\" or \"CUSTOM\" for the \"adSize\" property is no longer supported. Please specifiy a size or remove the property to use Auto Ad Size.");
                }
            }
        }
        return parseAdSize(attributeValue);
    }

    /* access modifiers changed from: package-private */
    public MobileAdsLogger getLogger() {
        return this.logger;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisableWebViewHardwareAcceleration() {
        return this.shouldDisableWebViewHardwareAcceleration;
    }

    /* access modifiers changed from: package-private */
    public void setShouldDisableWebViewHardwareAcceleration(boolean z) {
        this.shouldDisableWebViewHardwareAcceleration = z;
        AdController adController2 = this.adController;
        if (adController2 != null) {
            adController2.requestDisableHardwareAcceleration(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void initializeIfNecessary() {
        if (!isInitialized()) {
            long nanoTime = System.nanoTime();
            this.logger.mo10938d("Initializing AdLayout.");
            this.adRegistration.initializeAds(this.context);
            setContentDescription(CONTENT_DESCRIPTION_AD_LAYOUT);
            if (isInEditMode()) {
                TextView textView = new TextView(this.context);
                textView.setText("AdLayout");
                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView.setGravity(17);
                addView(textView);
                this.isInitialized = true;
                return;
            }
            this.isInForeground = getVisibility() == 0;
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
            this.isInitialized = true;
            if (this.adListenerExecutor == null) {
                setListener((AdListener) null);
            }
            initializeAdController();
            if (isWebViewDatabaseNull()) {
                this.logger.forceLog(MobileAdsLogger.Level.ERROR, "Disabling ads. Local cache file is inaccessible so ads will fail if we try to create a WebView. Details of this Android bug found at: http://code.google.com/p/android/issues/detail?id=10789", new Object[0]);
                this.isInitialized = false;
                return;
            }
            this.adController.getMetricsCollector().startMetricInMillisecondsFromNanoseconds(Metrics.MetricType.AD_LAYOUT_INITIALIZATION, nanoTime);
            this.adController.getMetricsCollector().stopMetric(Metrics.MetricType.AD_LAYOUT_INITIALIZATION);
        }
    }

    private void initializeAdController() {
        if (this.adController == null) {
            AdSize adSize2 = this.adSize;
            if (adSize2 == null) {
                adSize2 = AdSize.SIZE_AUTO;
            }
            setAdController(createAdController(adSize2, this.context));
            this.adController.requestDisableHardwareAcceleration(this.shouldDisableWebViewHardwareAcceleration);
        }
    }

    private void setAdController(AdController adController2) {
        this.adController = adController2;
        adController2.setCallback(createAdControlCallback());
    }

    /* access modifiers changed from: private */
    public AdController getAdController() {
        initializeIfNecessary();
        if (this.adController == null) {
            initializeAdController();
        }
        return this.adController;
    }

    private static String getAttributeValue(AttributeSet attributeSet, String str, String str2) {
        return attributeSet.getAttributeValue(str, str2);
    }

    private static AdSize parseAdSize(String str) {
        int i;
        AdSize adSize2 = AdSize.SIZE_AUTO;
        if (str == null) {
            return adSize2;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.equals("autonoscale")) {
            return AdSize.SIZE_AUTO_NO_SCALE;
        }
        if (lowerCase.equals(TtmlNode.TEXT_EMPHASIS_AUTO)) {
            return adSize2;
        }
        String[] split = lowerCase.split("x");
        int i2 = 0;
        if (split.length == 2) {
            int parseInt = NumberUtils.parseInt(split[0], 0);
            i = NumberUtils.parseInt(split[1], 0);
            i2 = parseInt;
        } else {
            i = 0;
        }
        return new AdSize(i2, i);
    }

    private AdController createAdController(AdSize adSize2, Context context2) {
        return this.adControllerFactory.buildAdController(context2, adSize2);
    }

    /* access modifiers changed from: package-private */
    public AdControlCallback createAdControlCallback() {
        return new AdLayoutAdControlCallback();
    }

    /* access modifiers changed from: package-private */
    public boolean isWebViewDatabaseNull() {
        return !getAdController().canShowViews();
    }

    /* access modifiers changed from: package-private */
    public AdData getAdData() {
        return getAdController().getAdData();
    }

    /* access modifiers changed from: package-private */
    public boolean isInitialized() {
        return this.isInitialized;
    }

    private void registerScreenStateBroadcastReceiver() {
        if (!this.hasRegisterBroadcastReciever) {
            this.hasRegisterBroadcastReciever = true;
            this.screenStateReceiver = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && AdLayout.this.isInForeground) {
                        AdLayout.this.getAdController().closeAd();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.context.getApplicationContext().registerReceiver(this.screenStateReceiver, intentFilter);
        }
    }

    private void unregisterScreenStateBroadcastReceiver() {
        if (this.hasRegisterBroadcastReciever) {
            this.hasRegisterBroadcastReciever = false;
            this.context.getApplicationContext().unregisterReceiver(this.screenStateReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.attached = true;
            registerScreenStateBroadcastReceiver();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        unregisterScreenStateBroadcastReceiver();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.attached && this.lastVisibility != i) {
            if (i != 0) {
                this.isInForeground = false;
                collapseAd();
                unregisterScreenStateBroadcastReceiver();
            } else if (i == 0) {
                this.isInForeground = true;
            }
        }
    }

    private void collapseAd() {
        if (getAdController().getAdState().equals(AdState.EXPANDED)) {
            ThreadUtils.scheduleOnMainThread(new Runnable() {
                public void run() {
                    if (AdLayout.this.getAdController().getAdState().equals(AdState.EXPANDED)) {
                        AdLayout.this.getAdController().closeAd();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.isDestroyed) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            super.onLayout(z, i, i2, i3, i4);
            if (!isInEditMode()) {
                getAdController().setWindowDimensions(i5, i6);
                if (getAndSetNeedsToLoadAdOnLayout(false)) {
                    startAdLoadUponLayout();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void startAdLoadUponLayout() {
        AdTargetingOptions adTargetingOptions2 = this.adTargetingOptions;
        AdSlot deferredLoad = new AdSlot(getAdController(), adTargetingOptions2).setDeferredLoad(true);
        this.adLoadStarter.loadAds(getAdController().getTimeout(), adTargetingOptions2, deferredLoad);
        if (!getAndResetIsPrepared()) {
            onRequestError("Could not load ad on layout.");
        }
    }

    public int getTimeout() {
        if (getAdController() == null) {
            return -1;
        }
        return getAdController().getTimeout();
    }

    public void setTimeout(int i) {
        AdController adController2 = getAdController();
        if (adController2 != null) {
            adController2.setTimeout(i);
        }
    }

    public AdSize getAdSize() {
        AdController adController2 = getAdController();
        if (adController2 == null) {
            return null;
        }
        return adController2.getAdSize();
    }

    /* access modifiers changed from: package-private */
    public void setMaxWidth(int i) {
        if (this.adController != null) {
            this.logger.mo10942w("The maximum width cannot be changed because this ad has already been initialized. Max width should be set immediately after construction of the Ad object.");
        } else {
            this.adSize = this.adSize.newMaxWidth(i);
        }
    }

    public boolean loadAd() {
        return loadAd(new AdTargetingOptions());
    }

    public boolean loadAd(AdTargetingOptions adTargetingOptions2) {
        if (adTargetingOptions2 == null) {
            adTargetingOptions2 = new AdTargetingOptions();
        }
        this.adTargetingOptions = adTargetingOptions2;
        if (getNeedsToLoadAdOnLayout()) {
            this.logger.mo10939e(LOADING_IN_PROGRESS_LOG_MSG);
            return false;
        }
        initializeIfNecessary();
        if (!isInitialized()) {
            this.logger.mo10939e("The ad could not be initialized properly.");
            return false;
        } else if (!isReadyToLoad()) {
            int i = C09134.$SwitchMap$com$amazon$device$ads$AdState[getAdController().getAdState().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.logger.mo10939e("An ad could not be loaded because the AdLayout has been destroyed.");
                } else if (i != 3) {
                    this.logger.mo10939e(LOADING_OR_LOADED_LOG_MSG);
                } else {
                    this.logger.mo10939e("An ad could not be loaded because another ad is currently expanded.");
                }
            } else if (getAdController().isExpired()) {
                getAdController().setAdState(AdState.READY_TO_LOAD);
                getAdController().resetToReady();
                return loadAd(adTargetingOptions2);
            } else {
                this.logger.mo10939e("An ad could not be loaded because of an unknown issue with the web views.");
            }
            return false;
        } else {
            if (getAdController().getAdState().equals(AdState.SHOWING)) {
                getAdController().getMetricsCollector().stopMetric(Metrics.MetricType.AD_SHOW_DURATION);
            }
            this.previousAdExpired.set(false);
            this.adLoadStarter.loadAds(getAdController().getTimeout(), adTargetingOptions2, new AdSlot(getAdController(), adTargetingOptions2));
            if (getNeedsToLoadAdOnLayout()) {
                return true;
            }
            return getAndResetIsPrepared();
        }
    }

    private boolean isReadyToLoad() {
        return AdState.READY_TO_LOAD.equals(getAdController().getAdState()) || AdState.SHOWING.equals(getAdController().getAdState());
    }

    private boolean isReadyToShow() {
        return getAdController().getAdState().equals(AdState.RENDERED);
    }

    public boolean isShowing() {
        return getAdController().getAdState().equals(AdState.SHOWING);
    }

    /* access modifiers changed from: package-private */
    public boolean prepareAd(boolean z) {
        if (z) {
            this.logger.mo10938d("Skipping ad layout preparation steps because the layout is already prepared.");
            return true;
        } else if (!isReadyToLoad()) {
            return false;
        } else {
            if (getNeedsToLoadAdOnLayout()) {
                this.logger.mo10939e(LOADING_IN_PROGRESS_LOG_MSG);
                return false;
            }
            if (getAdSize().isAuto()) {
                this.logger.mo10938d("Ad size to be determined automatically.");
            }
            setIsParentViewMissingAtLoadTime();
            if (getAdSize().isAuto() && getAdController().areWindowDimensionsSet()) {
                return true;
            }
            if (isLayoutRequested() && getAdSize().isAuto() && !isParentViewMissingAtLoadTime()) {
                deferAdLoadToLayoutEvent();
                return false;
            } else if (isParentViewMissingAtLoadTime()) {
                this.logger.mo10938d("The ad's parent view is missing at load time.");
                return loadAdWhenParentViewMissing();
            } else {
                setWindowDimensions();
                return true;
            }
        }
    }

    private boolean loadAdWhenParentViewMissing() {
        if (getLayoutParams() == null) {
            Metrics.getInstance().getMetricsCollector().incrementMetric(Metrics.MetricType.AD_FAILED_NULL_LAYOUT_PARAMS);
            onRequestError(LAYOUT_PARAMS_NULL_ERR_MSG);
            return false;
        } else if (AndroidTargetUtils.isAtLeastAndroidAPI(11)) {
            setActivityRootView();
            if (isActivityRootViewNull()) {
                onRequestError("Ad load failed because root view could not be obtained from the activity.");
                return false;
            } else if (isActivityRootViewLayoutRequested()) {
                this.logger.mo10938d("Activity root view layout is requested.");
                deferAdLoadToLayoutEvent();
                setOnLayoutChangeListenerForRoot();
                return false;
            } else {
                setFloatingWindowDimensions();
                return true;
            }
        } else {
            setFloatingWindowDimensions();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void adFailed(AdError adError) {
        getAdController().adFailed(adError);
    }

    /* access modifiers changed from: package-private */
    public void bypassAdRenderingProcess() {
        getAdController().setAdState(AdState.RENDERING);
        getAdController().adRendered("custom-render");
    }

    /* access modifiers changed from: package-private */
    public void adShown() {
        getAdController().adShown();
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListenerForRoot() {
        OnLayoutChangeListenerUtil.setOnLayoutChangeListenerForRoot(this);
    }

    private static class OnLayoutChangeListenerUtil {
        private OnLayoutChangeListenerUtil() {
        }

        protected static void setOnLayoutChangeListenerForRoot(final AdLayout adLayout) {
            adLayout.activityRootView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (adLayout.getAndSetNeedsToLoadAdOnLayout(false)) {
                        adLayout.setFloatingWindowDimensions();
                        adLayout.startAdLoadUponLayout();
                        adLayout.activityRootView.removeOnLayoutChangeListener(this);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void setFloatingWindowDimensions() {
        if (getLayoutParams().width == -1 || getLayoutParams().height == -1) {
            this.logger.mo10938d("The requested ad will scale based on the screen's dimensions because at least one AdLayout dimension is set to MATCH_PARENT but the AdLayout is currently missing a fixed-size parent view.");
        }
        setWindowDimensions();
    }

    private void setWindowDimensions() {
        int resolveLayoutParam = resolveLayoutParam(true);
        int resolveLayoutParam2 = resolveLayoutParam(false);
        if (resolveLayoutParam > 0 || resolveLayoutParam2 > 0) {
            getAdController().setWindowDimensions(resolveLayoutParam, resolveLayoutParam2);
        }
    }

    /* access modifiers changed from: package-private */
    public int resolveLayoutParam(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = z ? layoutParams.width : layoutParams.height;
        if (i == -1) {
            if (isActivityRootViewNull()) {
                return getRawScreenDimension(z);
            }
            return getActivityRootViewDimension(z);
        } else if (i == -2) {
            return 0;
        } else {
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    public int getRawScreenDimension(boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }

    /* access modifiers changed from: package-private */
    public void deferAdLoadToLayoutEvent() {
        setNeedsToLoadAdOnLayout(true);
        scheduleTaskForCheckingIfLayoutHasRun();
    }

    /* access modifiers changed from: package-private */
    public void scheduleTaskForCheckingIfLayoutHasRun() {
        threadPool.schedule(new Runnable() {
            public void run() {
                AdLayout.this.failLoadIfLayoutHasNotRun();
            }
        }, (long) getTimeout(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public void failLoadIfLayoutHasNotRun() {
        if (getAndSetNeedsToLoadAdOnLayout(false)) {
            Metrics.getInstance().getMetricsCollector().incrementMetric(Metrics.MetricType.AD_FAILED_LAYOUT_NOT_RUN);
            onRequestError(LAYOUT_NOT_RUN_ERR_MSG);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean getNeedsToLoadAdOnLayout() {
        return this.needsToLoadAdOnLayout.get();
    }

    /* access modifiers changed from: package-private */
    public void setNeedsToLoadAdOnLayout(boolean z) {
        this.needsToLoadAdOnLayout.set(z);
    }

    /* access modifiers changed from: package-private */
    public boolean getAndSetNeedsToLoadAdOnLayout(boolean z) {
        return this.needsToLoadAdOnLayout.getAndSet(z);
    }

    /* access modifiers changed from: package-private */
    public boolean getAndResetIsPrepared() {
        return getAdController().getAndResetIsPrepared();
    }

    private void onRequestError(String str) {
        getAdController().onRequestError(str);
    }

    /* access modifiers changed from: package-private */
    public boolean isParentViewMissingAtLoadTime() {
        return this.isParentViewMissingAtLoadTime;
    }

    /* access modifiers changed from: package-private */
    public void setIsParentViewMissingAtLoadTime() {
        this.isParentViewMissingAtLoadTime = getParent() == null;
    }

    /* access modifiers changed from: package-private */
    public void setIsParentViewMissingAtLoadTime(boolean z) {
        this.isParentViewMissingAtLoadTime = z;
    }

    /* access modifiers changed from: package-private */
    public void setActivityRootView() {
        Activity contextAsActivity = ContextUtils.getContextAsActivity(this.context);
        if (contextAsActivity == null) {
            this.logger.mo10939e("unable to set activity root view because the context did not contain an activity");
        } else {
            this.activityRootView = contextAsActivity.getWindow().getDecorView().findViewById(16908290).getRootView();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isActivityRootViewLayoutRequested() {
        return this.activityRootView.isLayoutRequested();
    }

    /* access modifiers changed from: package-private */
    public boolean isActivityRootViewNull() {
        return this.activityRootView == null;
    }

    /* access modifiers changed from: package-private */
    public int getActivityRootViewDimension(boolean z) {
        return z ? this.activityRootView.getWidth() : this.activityRootView.getHeight();
    }

    public void setListener(AdListener adListener) {
        if (adListener == null) {
            adListener = new DefaultAdListener(LOGTAG);
        }
        this.adListenerExecutor = this.adListenerExecutorFactory.createAdListenerExecutor(adListener);
    }

    /* access modifiers changed from: package-private */
    public AdListenerExecutor getAdListenerExecutor() {
        return this.adListenerExecutor;
    }

    public boolean isLoading() {
        if (getAdController() == null) {
            return false;
        }
        return getAdController().getAdState().equals(AdState.LOADING);
    }

    public boolean isAdLoading() {
        return isLoading();
    }

    public void destroy() {
        if (isInitialized()) {
            this.logger.mo10938d("Destroying the AdLayout");
            this.isDestroyed = true;
            unregisterScreenStateBroadcastReceiver();
            getAdController().destroy();
        }
    }

    public boolean showAd() {
        if (this.previousAdExpired.get()) {
            this.logger.mo10942w("This banner ad has expired. Please load another ad.");
            return false;
        } else if (!isReadyToShow()) {
            if (isLoading()) {
                this.logger.mo10942w("The banner ad cannot be shown because it is still loading.");
            } else if (isShowing()) {
                this.logger.mo10942w("The banner ad cannot be shown because it is already showing.");
            } else if (isReadyToLoad()) {
                this.logger.mo10942w("The banner ad cannot be shown because it has not loaded successfully.");
            } else {
                this.logger.mo10942w("A banner ad is not ready to show.");
            }
            return false;
        } else if (getAdController().isExpired()) {
            this.logger.mo10942w("This banner ad has expired. Please load another ad.");
            return false;
        } else if (getAdController().startAdDrawing()) {
            if (!this.autoShow) {
                getAdController().getMetricsCollector().stopMetric(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME);
            }
            getAdController().getMetricsCollector().startMetric(Metrics.MetricType.AD_SHOW_LATENCY);
            View view = this.currentView;
            if (view != null) {
                removeView(view);
            }
            Destroyable destroyable = this.currentDestroyable;
            if (destroyable != null) {
                destroyable.destroy();
            }
            this.currentView = getAdController().getView();
            this.currentDestroyable = getAdController().getDestroyable();
            addView(this.currentView, new FrameLayout.LayoutParams(-1, -1, 17));
            getAdController().getMetricsCollector().startMetric(Metrics.MetricType.AD_SHOW_DURATION);
            adShown();
            return true;
        } else {
            this.logger.mo10942w("Banner ad could not be shown.");
            return false;
        }
    }

    public void enableAutoShow() {
        this.autoShow = true;
    }

    public void disableAutoShow() {
        this.autoShow = false;
    }

    class AdLayoutAdControlCallback implements AdControlCallback {
        public void postAdRendered() {
        }

        AdLayoutAdControlCallback() {
        }

        public boolean isAdReady(boolean z) {
            return AdLayout.this.prepareAd(z);
        }

        public void onAdLoaded(AdProperties adProperties) {
            AdProperties unused = AdLayout.this.properties = adProperties;
            AdLayout.this.getAdController().render();
        }

        public void onAdRendered() {
            if (!AdLayout.this.autoShow) {
                AdLayout.this.getAdController().getMetricsCollector().startMetric(Metrics.MetricType.AD_LOADED_TO_AD_SHOW_TIME);
                AdLayout.this.logger.mo10938d("Ad is ready to show. Please call showAd to display it.");
                AdListenerExecutor adListenerExecutor = AdLayout.this.getAdListenerExecutor();
                AdLayout adLayout = AdLayout.this;
                adListenerExecutor.onAdLoaded(adLayout, adLayout.properties);
            } else if (AdLayout.this.showAd()) {
                AdListenerExecutor adListenerExecutor2 = AdLayout.this.getAdListenerExecutor();
                AdLayout adLayout2 = AdLayout.this;
                adListenerExecutor2.onAdLoaded(adLayout2, adLayout2.properties);
            }
        }

        public void onAdFailed(AdError adError) {
            if (AdError.ErrorCode.NETWORK_TIMEOUT.equals(adError.getCode())) {
                AdController unused = AdLayout.this.adController = null;
            }
            AdLayout.this.getAdListenerExecutor().onAdFailedToLoad(AdLayout.this, adError);
        }

        public void onAdEvent(AdEvent adEvent) {
            handleAdEvent(adEvent);
        }

        /* access modifiers changed from: package-private */
        public boolean handleAdEvent(AdEvent adEvent) {
            int i = C09134.$SwitchMap$com$amazon$device$ads$AdEvent$AdEventType[adEvent.getAdEventType().ordinal()];
            if (i == 1) {
                AdLayout.this.getAdListenerExecutor().onAdExpanded(AdLayout.this);
                return true;
            } else if (i == 2) {
                AdLayout.this.getAdListenerExecutor().onAdCollapsed(AdLayout.this);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                AdLayout.this.getAdListenerExecutor().onAdResized(AdLayout.this, (Rect) adEvent.getParameters().getParameter(AdEvent.POSITION_ON_SCREEN));
                return true;
            }
        }

        public int adClosing() {
            return AdLayout.this.getAdController().getAdState().equals(AdState.EXPANDED) ? 0 : 2;
        }

        public void onAdExpired() {
            AdLayout.this.getAdController().getMetricsCollector().incrementMetric(Metrics.MetricType.AD_EXPIRED_BEFORE_SHOWING);
            AdLayout.this.previousAdExpired.set(true);
            AdController unused = AdLayout.this.adController = null;
            AdLayout.this.getAdListenerExecutor().onAdExpired(AdLayout.this);
        }
    }

    /* renamed from: com.amazon.device.ads.AdLayout$4 */
    static /* synthetic */ class C09134 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdEvent$AdEventType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdState;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.amazon.device.ads.AdEvent$AdEventType[] r0 = com.amazon.device.ads.AdEvent.AdEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdEvent$AdEventType = r0
                r1 = 1
                com.amazon.device.ads.AdEvent$AdEventType r2 = com.amazon.device.ads.AdEvent.AdEventType.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$amazon$device$ads$AdEvent$AdEventType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdEvent$AdEventType r3 = com.amazon.device.ads.AdEvent.AdEventType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$amazon$device$ads$AdEvent$AdEventType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdEvent$AdEventType r4 = com.amazon.device.ads.AdEvent.AdEventType.RESIZED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.amazon.device.ads.AdState[] r3 = com.amazon.device.ads.AdState.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$amazon$device$ads$AdState = r3
                com.amazon.device.ads.AdState r4 = com.amazon.device.ads.AdState.INVALID     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.amazon.device.ads.AdState r3 = com.amazon.device.ads.AdState.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x004d }
                com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.EXPANDED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdLayout.C09134.<clinit>():void");
        }
    }
}
