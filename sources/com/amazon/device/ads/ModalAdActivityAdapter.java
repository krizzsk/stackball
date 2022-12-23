package com.amazon.device.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.AdEvent;
import com.amazon.device.ads.JSONUtils;
import com.amazon.device.ads.LayoutFactory;
import com.amazon.device.ads.SDKEvent;

class ModalAdActivityAdapter implements AdActivity.AdActivityAdapter {
    private static final String CONTENT_DESCRIPTION_AD_CONTAINER_VIEW = "adContainerView";
    private static final String CONTENT_DESCRIPTION_EXPANSION_VIEW = "expansionView";
    private static final String LOGTAG = ModalAdActivityAdapter.class.getSimpleName();
    private Activity activity;
    private ViewGroup adContainerView;
    /* access modifiers changed from: private */
    public AdControlAccessor adControlAccessor;
    private final AdUtils2 adUtils;
    private final AndroidBuildInfo buildInfo;
    private final ExpandProperties expandProperties;
    /* access modifiers changed from: private */
    public ViewGroup expansionView;
    private final JSONUtils.JSONUtilities jsonUtils;
    /* access modifiers changed from: private */
    public Size lastReportedSize;
    private final LayoutFactory layoutFactory;
    private final MobileAdsLogger logger;
    private final OrientationProperties orientationProperties;
    private String url;
    /* access modifiers changed from: private */
    public final ViewUtils viewUtils;

    public void onPause() {
    }

    public void onResume() {
    }

    public void onWindowFocusChanged() {
    }

    public ModalAdActivityAdapter() {
        this(new MobileAdsLoggerFactory(), new AdUtils2(), new JSONUtils.JSONUtilities(), new ExpandProperties(), new OrientationProperties(), new AndroidBuildInfo(), new LayoutFactory(), new ViewUtils());
    }

    ModalAdActivityAdapter(MobileAdsLoggerFactory mobileAdsLoggerFactory, AdUtils2 adUtils2, JSONUtils.JSONUtilities jSONUtilities, ExpandProperties expandProperties2, OrientationProperties orientationProperties2, AndroidBuildInfo androidBuildInfo, LayoutFactory layoutFactory2, ViewUtils viewUtils2) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.adUtils = adUtils2;
        this.jsonUtils = jSONUtilities;
        this.expandProperties = expandProperties2;
        this.orientationProperties = orientationProperties2;
        this.buildInfo = androidBuildInfo;
        this.layoutFactory = layoutFactory2;
        this.viewUtils = viewUtils2;
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    public void preOnCreate() {
        this.activity.requestWindowFeature(1);
        this.activity.getWindow().setFlags(1024, 1024);
        AndroidTargetUtils.hideActionAndStatusBars(this.buildInfo, this.activity);
    }

    public void onCreate() {
        Intent intent = this.activity.getIntent();
        String stringExtra = intent.getStringExtra("url");
        if (!StringUtils.isNullOrWhiteSpace(stringExtra)) {
            this.url = stringExtra;
        }
        this.expandProperties.fromJSONObject(this.jsonUtils.getJSONObjectFromString(intent.getStringExtra("expandProperties")));
        if (this.url != null) {
            this.expandProperties.setWidth(-1);
            this.expandProperties.setHeight(-1);
        }
        this.orientationProperties.fromJSONObject(this.jsonUtils.getJSONObjectFromString(intent.getStringExtra("orientationProperties")));
        AndroidTargetUtils.enableHardwareAcceleration(this.buildInfo, this.activity.getWindow());
        AdControlAccessor cachedAdControlAccessor = AdControllerFactory.getCachedAdControlAccessor();
        this.adControlAccessor = cachedAdControlAccessor;
        if (cachedAdControlAccessor == null) {
            this.logger.mo10939e("Failed to show expanded ad due to an error in the Activity.");
            this.activity.finish();
            return;
        }
        cachedAdControlAccessor.setAdActivity(this.activity);
        this.adControlAccessor.addSDKEventListener(new ModalAdSDKEventListener());
        expandAd();
        orientationPropertyChange();
        this.adControlAccessor.fireAdEvent(new AdEvent(AdEvent.AdEventType.EXPANDED));
        this.adControlAccessor.injectJavascript("mraidBridge.stateChange('expanded');");
        reportSizeChangeEvent();
    }

    private void reportSizeChangeEvent() {
        this.expansionView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                Size size;
                ModalAdActivityAdapter.this.viewUtils.removeOnGlobalLayoutListener(ModalAdActivityAdapter.this.expansionView.getViewTreeObserver(), this);
                Position currentPosition = ModalAdActivityAdapter.this.adControlAccessor.getCurrentPosition();
                if (currentPosition != null && (size = currentPosition.getSize()) != null && !size.equals(ModalAdActivityAdapter.this.lastReportedSize)) {
                    Size unused = ModalAdActivityAdapter.this.lastReportedSize = size;
                    AdControlAccessor access$300 = ModalAdActivityAdapter.this.adControlAccessor;
                    access$300.injectJavascript("mraidBridge.sizeChange(" + size.getWidth() + "," + size.getHeight() + ");");
                }
            }
        });
    }

    private void orientationPropertyChange() {
        if (this.adControlAccessor.isVisible() && this.adControlAccessor.isModal()) {
            Activity activity2 = this.activity;
            if (activity2 == null) {
                this.logger.mo10939e("unable to handle orientation property change because the context did not contain an activity");
                return;
            }
            int requestedOrientation = activity2.getRequestedOrientation();
            MobileAdsLogger mobileAdsLogger = this.logger;
            mobileAdsLogger.mo10938d("Current Orientation: " + requestedOrientation);
            int i = C09722.$SwitchMap$com$amazon$device$ads$ForceOrientation[this.orientationProperties.getForceOrientation().ordinal()];
            if (i == 1) {
                this.activity.setRequestedOrientation(7);
            } else if (i == 2) {
                this.activity.setRequestedOrientation(6);
            }
            if (ForceOrientation.NONE.equals(this.orientationProperties.getForceOrientation())) {
                if (this.orientationProperties.isAllowOrientationChange().booleanValue()) {
                    this.activity.setRequestedOrientation(-1);
                } else {
                    Activity activity3 = this.activity;
                    activity3.setRequestedOrientation(DisplayUtils.determineCanonicalScreenOrientation(activity3, this.buildInfo));
                }
            }
            int requestedOrientation2 = this.activity.getRequestedOrientation();
            MobileAdsLogger mobileAdsLogger2 = this.logger;
            mobileAdsLogger2.mo10938d("New Orientation: " + requestedOrientation2);
            if (requestedOrientation2 != requestedOrientation) {
                reportSizeChangeEvent();
            }
        }
    }

    /* renamed from: com.amazon.device.ads.ModalAdActivityAdapter$2 */
    static /* synthetic */ class C09722 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$ForceOrientation;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.amazon.device.ads.ForceOrientation[] r0 = com.amazon.device.ads.ForceOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$ForceOrientation = r0
                com.amazon.device.ads.ForceOrientation r1 = com.amazon.device.ads.ForceOrientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$ForceOrientation     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.ForceOrientation r1 = com.amazon.device.ads.ForceOrientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$ForceOrientation     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.ForceOrientation r1 = com.amazon.device.ads.ForceOrientation.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.ModalAdActivityAdapter.C09722.<clinit>():void");
        }
    }

    public void onStop() {
        AdControlAccessor adControlAccessor2;
        if (this.activity.isFinishing() && (adControlAccessor2 = this.adControlAccessor) != null) {
            adControlAccessor2.closeAd();
        }
    }

    public void onDestroy() {
        AdControlAccessor adControlAccessor2 = this.adControlAccessor;
        if (adControlAccessor2 != null) {
            adControlAccessor2.closeAd();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        reportSizeChangeEvent();
    }

    public boolean onBackPressed() {
        AdControlAccessor adControlAccessor2 = this.adControlAccessor;
        if (adControlAccessor2 != null) {
            return adControlAccessor2.onBackButtonPress();
        }
        return false;
    }

    private void expandAd() {
        if (this.url != null) {
            this.adControlAccessor.stashView();
        }
        Size computeExpandedSizeInPixels = computeExpandedSizeInPixels(this.expandProperties);
        createExpandedView();
        this.adControlAccessor.moveViewToViewGroup(this.adContainerView, new RelativeLayout.LayoutParams(-1, -1), true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(computeExpandedSizeInPixels.getWidth(), computeExpandedSizeInPixels.getHeight());
        layoutParams.addRule(13);
        this.expansionView.addView(this.adContainerView, layoutParams);
        this.activity.setContentView(this.expansionView, new RelativeLayout.LayoutParams(-1, -1));
        this.adControlAccessor.enableCloseButton(!this.expandProperties.getUseCustomClose().booleanValue());
    }

    private void createExpandedView() {
        this.expansionView = this.layoutFactory.createLayout(this.activity, LayoutFactory.LayoutType.RELATIVE_LAYOUT, CONTENT_DESCRIPTION_EXPANSION_VIEW);
        this.adContainerView = this.layoutFactory.createLayout(this.activity, LayoutFactory.LayoutType.FRAME_LAYOUT, CONTENT_DESCRIPTION_AD_CONTAINER_VIEW);
    }

    private Size computeExpandedSizeInPixels(ExpandProperties expandProperties2) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("Expanding Ad to " + expandProperties2.getWidth() + "x" + expandProperties2.getHeight());
        return new Size(this.adUtils.deviceIndependentPixelToPixel(expandProperties2.getWidth()), this.adUtils.deviceIndependentPixelToPixel(expandProperties2.getHeight()));
    }

    /* access modifiers changed from: private */
    public void finishActivity() {
        if (!this.activity.isFinishing()) {
            this.adControlAccessor = null;
            this.activity.finish();
        }
    }

    private class ModalAdSDKEventListener implements SDKEventListener {
        private ModalAdSDKEventListener() {
        }

        public void onSDKEvent(SDKEvent sDKEvent, AdControlAccessor adControlAccessor) {
            if (sDKEvent.getEventType().equals(SDKEvent.SDKEventType.CLOSED)) {
                ModalAdActivityAdapter.this.finishActivity();
            }
        }
    }
}
