package com.amazon.device.ads;

import android.view.ViewTreeObserver;

class MRAIDAdSDKEventListener implements SDKEventListener {
    private static final String LOGTAG = MRAIDAdSDKEventListener.class.getSimpleName();
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    /* access modifiers changed from: private */
    public MRAIDAdSDKBridge mraidAdSDKBridge;

    MRAIDAdSDKEventListener(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
        this.mraidAdSDKBridge = mRAIDAdSDKBridge;
    }

    public void onSDKEvent(SDKEvent sDKEvent, AdControlAccessor adControlAccessor) {
        this.logger.mo10938d(sDKEvent.getEventType().toString());
        switch (sDKEvent.getEventType()) {
            case PLACED:
                handleDefaultEvent(adControlAccessor);
                handleReadyEvent(adControlAccessor);
                return;
            case VISIBLE:
                handleShowingEvent(adControlAccessor);
                handleDefaultEvent(adControlAccessor);
                handleReadyEvent(adControlAccessor);
                return;
            case CLOSED:
                handleClosedEvent(adControlAccessor);
                return;
            case RESIZED:
                this.mraidAdSDKBridge.reportSizeChangeEvent();
                return;
            case HIDDEN:
            case DESTROYED:
                adControlAccessor.injectJavascript("mraidBridge.stateChange('hidden');");
                return;
            case BRIDGE_ADDED:
                handleBridgeAddedEvent(sDKEvent, adControlAccessor);
                return;
            case VIEWABLE:
                handleViewableEvent(sDKEvent, adControlAccessor);
                return;
            default:
                return;
        }
    }

    private void handleViewableEvent(SDKEvent sDKEvent, AdControlAccessor adControlAccessor) {
        String parameter = sDKEvent.getParameter(ViewabilityObserver.IS_VIEWABLE_KEY);
        adControlAccessor.injectJavascript("mraidBridge.viewableChange(" + parameter + ");");
    }

    private void handleBridgeAddedEvent(SDKEvent sDKEvent, AdControlAccessor adControlAccessor) {
        String parameter = sDKEvent.getParameter(SDKEvent.BRIDGE_NAME);
        if (parameter != null && parameter.equals(this.mraidAdSDKBridge.getName())) {
            int i = C09672.$SwitchMap$com$amazon$device$ads$AdState[adControlAccessor.getAdState().ordinal()];
            if (i == 1 || i == 2) {
                handleShowingEvent(adControlAccessor);
                handleDefaultEvent(adControlAccessor);
                handleReadyEvent(adControlAccessor);
            } else if (i == 3 && !adControlAccessor.isModal()) {
                handleDefaultEvent(adControlAccessor);
                handleReadyEvent(adControlAccessor);
            }
        }
    }

    /* renamed from: com.amazon.device.ads.MRAIDAdSDKEventListener$2 */
    static /* synthetic */ class C09672 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdState;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0085 */
        static {
            /*
                com.amazon.device.ads.AdState[] r0 = com.amazon.device.ads.AdState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdState = r0
                r1 = 1
                com.amazon.device.ads.AdState r2 = com.amazon.device.ads.AdState.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdState r3 = com.amazon.device.ads.AdState.SHOWING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$amazon$device$ads$AdState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdState r4 = com.amazon.device.ads.AdState.RENDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.amazon.device.ads.SDKEvent$SDKEventType[] r3 = com.amazon.device.ads.SDKEvent.SDKEventType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType = r3
                com.amazon.device.ads.SDKEvent$SDKEventType r4 = com.amazon.device.ads.SDKEvent.SDKEventType.RENDERED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.amazon.device.ads.SDKEvent$SDKEventType r3 = com.amazon.device.ads.SDKEvent.SDKEventType.PLACED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x004d }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.VISIBLE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.CLOSED     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.RESIZED     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x006e }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.HIDDEN     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x0085 }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.BRIDGE_ADDED     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SDKEvent$SDKEventType     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.amazon.device.ads.SDKEvent$SDKEventType r1 = com.amazon.device.ads.SDKEvent.SDKEventType.VIEWABLE     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MRAIDAdSDKEventListener.C09672.<clinit>():void");
        }
    }

    private void handleReadyEvent(AdControlAccessor adControlAccessor) {
        adControlAccessor.injectJavascript("mraidBridge.ready();");
    }

    private void handleShowingEvent(final AdControlAccessor adControlAccessor) {
        adControlAccessor.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                Position currentPosition = adControlAccessor.getCurrentPosition();
                if (currentPosition != null) {
                    adControlAccessor.removeOnGlobalLayoutListener(this);
                    MRAIDAdSDKEventListener.this.mraidAdSDKBridge.updateDefaultPosition(currentPosition.getSize().getWidth(), currentPosition.getSize().getHeight(), currentPosition.getX(), currentPosition.getY());
                    MRAIDAdSDKEventListener.this.mraidAdSDKBridge.orientationPropertyChange();
                }
            }
        });
    }

    private void handleDefaultEvent(AdControlAccessor adControlAccessor) {
        adControlAccessor.injectJavascript("mraidBridge.stateChange('default');");
    }

    private void handleClosedEvent(AdControlAccessor adControlAccessor) {
        if (adControlAccessor.getAdState().equals(AdState.EXPANDED)) {
            this.mraidAdSDKBridge.collapseExpandedAd(adControlAccessor);
        } else if (adControlAccessor.getAdState().equals(AdState.SHOWING)) {
            adControlAccessor.injectJavascript("mraidBridge.stateChange('hidden');");
            adControlAccessor.injectJavascript("mraidBridge.viewableChange('false');");
        }
    }
}
