package com.amazon.device.ads;

import com.amazon.device.ads.SDKEvent;

class AmazonAdSDKViewableEventListener implements SDKEventListener {
    private static final String LOGTAG = AmazonAdSDKViewableEventListener.class.getSimpleName();
    private final MobileAdsLogger logger;

    public AmazonAdSDKViewableEventListener() {
        this(new MobileAdsLoggerFactory());
    }

    AmazonAdSDKViewableEventListener(MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
    }

    public void onSDKEvent(SDKEvent sDKEvent, AdControlAccessor adControlAccessor) {
        this.logger.mo10938d(sDKEvent.getEventType().toString());
        if (C09351.$SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType[sDKEvent.getEventType().ordinal()] == 1) {
            handleViewableEvent(adControlAccessor, sDKEvent);
        }
    }

    /* renamed from: com.amazon.device.ads.AmazonAdSDKViewableEventListener$1 */
    static /* synthetic */ class C09351 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType;

        static {
            int[] iArr = new int[SDKEvent.SDKEventType.values().length];
            $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType = iArr;
            try {
                iArr[SDKEvent.SDKEventType.VIEWABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public void handleViewableEvent(AdControlAccessor adControlAccessor, SDKEvent sDKEvent) {
        String parameter = sDKEvent.getParameter(ViewabilityObserver.VIEWABLE_PARAMS_KEY);
        adControlAccessor.injectJavascript("viewableBridge.viewabilityChange('" + parameter + "');");
    }
}
