package com.amazon.device.ads;

import android.view.ViewTreeObserver;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.SDKEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

class ViewabilityObserver {
    public static final String IS_VIEWABLE_KEY = "IS_VIEWABLE";
    private static final String LOGTAG = ViewabilityObserver.class.getSimpleName();
    private static long VIEWABLE_INTERVAL = 200;
    public static final String VIEWABLE_PARAMS_KEY = "VIEWABLE_PARAMS";
    private final AdController adController;
    private final Configuration configuration;
    private final DebugProperties debugProperties;
    private boolean firedOnlyOnce;
    private final AtomicBoolean isScrollListenerAdded;
    private long lastTimeViewableEventFired;
    private final MobileAdsLogger logger;
    private boolean observersAdded;
    private final ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;
    private ViewTreeObserver viewTreeObserver;
    private final ViewUtils viewUtils;
    private final ViewabilityChecker viewabilityChecker;
    private final AtomicInteger viewabilityInterestCount;

    public ViewabilityObserver(AdController adController2) {
        this(adController2, new ViewabilityCheckerFactory(), new MobileAdsLoggerFactory(), new AmazonOnGlobalFocusChangeListenerFactory(), new AmazonOnGlobalLayoutListenerFactory(), new AmazonOnScrollChangedListenerFactory(), new AmazonOnWindowFocusChangeListenerFactory(), new AtomicInteger(0), new AtomicBoolean(false), new ViewUtils(), DebugProperties.getInstance(), Configuration.getInstance());
    }

    ViewabilityObserver(AdController adController2, ViewabilityCheckerFactory viewabilityCheckerFactory, MobileAdsLoggerFactory mobileAdsLoggerFactory, AmazonOnGlobalFocusChangeListenerFactory amazonOnGlobalFocusChangeListenerFactory, AmazonOnGlobalLayoutListenerFactory amazonOnGlobalLayoutListenerFactory, AmazonOnScrollChangedListenerFactory amazonOnScrollChangedListenerFactory, AmazonOnWindowFocusChangeListenerFactory amazonOnWindowFocusChangeListenerFactory, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, ViewUtils viewUtils2, DebugProperties debugProperties2, Configuration configuration2) {
        this.firedOnlyOnce = false;
        this.observersAdded = false;
        this.lastTimeViewableEventFired = 0;
        this.adController = adController2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.viewabilityChecker = viewabilityCheckerFactory.buildViewabilityChecker(this.adController);
        this.onGlobalFocusChangeListener = amazonOnGlobalFocusChangeListenerFactory.buildAmazonOnGlobalFocusChangedListener(this);
        this.onGlobalLayoutListener = amazonOnGlobalLayoutListenerFactory.buildAmazonOnGlobalLayoutListener(this);
        this.onScrollChangedListener = amazonOnScrollChangedListenerFactory.buildAmazonOnScrollChangedListenerFactory(this);
        if (AndroidTargetUtils.isAtLeastAndroidAPI(18)) {
            this.onWindowFocusChangeListener = amazonOnWindowFocusChangeListenerFactory.buildOnWindowFocusChangeListener(this);
        }
        this.viewabilityInterestCount = atomicInteger;
        this.isScrollListenerAdded = atomicBoolean;
        this.viewUtils = viewUtils2;
        this.debugProperties = debugProperties2;
        this.configuration = configuration2;
        long longValue = debugProperties2.getDebugPropertyAsLong(DebugProperties.DEBUG_VIEWABLE_INTERVAL, Long.valueOf(configuration2.getLongWithDefault(Configuration.ConfigOption.VIEWABLE_INTERVAL, 200))).longValue();
        VIEWABLE_INTERVAL = longValue;
        this.logger.mo11019d("Viewable Interval is: %d", Long.valueOf(longValue));
    }

    public void registerViewabilityInterest() {
        int incrementAndGet = this.viewabilityInterestCount.incrementAndGet();
        this.logger.mo11019d("Viewability Interest Registered. Current number of objects interested in viewability: %d", Integer.valueOf(incrementAndGet));
        synchronized (this) {
            addObserversIfNeeded();
        }
    }

    private void addObserversIfNeeded() {
        if (this.viewTreeObserver == null || !isViewTreeObserverAlive() || hasViewTreeObserverChanged()) {
            this.viewTreeObserver = this.adController.getAdContainer().getViewTreeObserver();
            this.observersAdded = false;
            this.isScrollListenerAdded.set(false);
            this.firedOnlyOnce = false;
            this.lastTimeViewableEventFired = 0;
        }
        if (this.viewTreeObserver != null && isViewTreeObserverAlive() && !this.observersAdded) {
            this.viewTreeObserver.addOnGlobalLayoutListener(this.onGlobalLayoutListener);
            this.viewTreeObserver.addOnGlobalFocusChangeListener(this.onGlobalFocusChangeListener);
            if (AndroidTargetUtils.isAtLeastAndroidAPI(18)) {
                this.viewTreeObserver.addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
            }
            if (AndroidTargetUtils.isAtLeastAndroidAPI(16)) {
                addOnScrollChangedListenerIfNeeded();
            }
            this.observersAdded = true;
            fireViewableEvent(false);
        }
    }

    /* access modifiers changed from: protected */
    public void addOnScrollChangedListenerIfNeeded() {
        if (!this.isScrollListenerAdded.get()) {
            ViewTreeObserver viewTreeObserver2 = this.viewTreeObserver;
            if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive() || hasViewTreeObserverChanged()) {
                this.viewTreeObserver = this.adController.getAdContainer().getViewTreeObserver();
            }
            this.viewTreeObserver.addOnScrollChangedListener(this.onScrollChangedListener);
            this.isScrollListenerAdded.set(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deregisterViewabilityInterest() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicInteger r0 = r6.viewabilityInterestCount     // Catch:{ all -> 0x002f }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x002f }
            if (r0 >= 0) goto L_0x0017
            com.amazon.device.ads.MobileAdsLogger r0 = r6.logger     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "No Viewability Interest was previously registered. Ignoring request to deregister."
            r0.mo10942w(r1)     // Catch:{ all -> 0x002f }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.viewabilityInterestCount     // Catch:{ all -> 0x002f }
            r0.incrementAndGet()     // Catch:{ all -> 0x002f }
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return
        L_0x0017:
            com.amazon.device.ads.MobileAdsLogger r1 = r6.logger     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "Viewability Interest Deregistered. Current number of objects interested in viewability: %d"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x002f }
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x002f }
            r3[r4] = r5     // Catch:{ all -> 0x002f }
            r1.mo11019d(r2, r3)     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            r6.removeObservers()     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.ViewabilityObserver.deregisterViewabilityInterest():void");
    }

    private void removeObservers() {
        ViewTreeObserver viewTreeObserver2 = this.viewTreeObserver;
        if (viewTreeObserver2 == null) {
            this.logger.mo10942w("Root view tree observer is null");
        } else if (!this.viewUtils.removeOnGlobalLayoutListener(viewTreeObserver2, this.onGlobalLayoutListener)) {
            this.logger.mo10942w("Root view tree observer is not alive");
        } else {
            this.viewTreeObserver.removeOnScrollChangedListener(this.onScrollChangedListener);
            this.viewTreeObserver.removeOnGlobalFocusChangeListener(this.onGlobalFocusChangeListener);
            if (AndroidTargetUtils.isAtLeastAndroidAPI(18)) {
                this.viewTreeObserver.removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
            }
            this.observersAdded = false;
            this.isScrollListenerAdded.set(false);
        }
    }

    public void fireViewableEvent(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!z || currentTimeMillis - this.lastTimeViewableEventFired >= VIEWABLE_INTERVAL) {
            this.lastTimeViewableEventFired = currentTimeMillis;
            ViewabilityInfo viewabilityInfo = this.viewabilityChecker.getViewabilityInfo();
            if (viewabilityInfo == null) {
                this.logger.mo10942w("Viewable info is null");
                return;
            }
            JSONObject jsonObject = viewabilityInfo.getJsonObject();
            boolean isAdOnScreen = viewabilityInfo.isAdOnScreen();
            SDKEvent sDKEvent = new SDKEvent(SDKEvent.SDKEventType.VIEWABLE);
            sDKEvent.setParameter(VIEWABLE_PARAMS_KEY, jsonObject.toString());
            sDKEvent.setParameter(IS_VIEWABLE_KEY, isAdOnScreen ? "true" : " false");
            if (isAdOnScreen) {
                this.adController.fireSDKEvent(sDKEvent);
                this.firedOnlyOnce = false;
            } else if (!this.firedOnlyOnce) {
                this.adController.fireSDKEvent(sDKEvent);
                this.firedOnlyOnce = true;
            }
        }
    }

    private boolean isViewTreeObserverAlive() {
        if (this.viewTreeObserver.isAlive()) {
            return true;
        }
        this.logger.mo10942w("Root view tree observer is not alive");
        return false;
    }

    private boolean hasViewTreeObserverChanged() {
        return this.viewTreeObserver != this.adController.getAdContainer().getViewTreeObserver();
    }

    public boolean isViewable() {
        ViewabilityInfo viewabilityInfo = this.viewabilityChecker.getViewabilityInfo();
        if (viewabilityInfo != null) {
            return viewabilityInfo.isAdOnScreen();
        }
        this.logger.mo10942w("Viewable info is null");
        return false;
    }
}
