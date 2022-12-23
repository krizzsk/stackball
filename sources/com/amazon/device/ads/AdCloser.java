package com.amazon.device.ads;

import java.util.concurrent.atomic.AtomicBoolean;

class AdCloser {
    private static final String LOGTAG = AdCloser.class.getSimpleName();
    private final AdController adController;
    private final AtomicBoolean isClosing;
    private final MobileAdsLogger logger;

    public AdCloser(AdController adController2) {
        this(adController2, new MobileAdsLoggerFactory());
    }

    AdCloser(AdController adController2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.isClosing = new AtomicBoolean(false);
        this.adController = adController2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean closeAd() {
        /*
            r6 = this;
            com.amazon.device.ads.MobileAdsLogger r0 = r6.logger
            java.lang.String r1 = "Ad is attempting to close."
            r0.mo10938d(r1)
            com.amazon.device.ads.AdController r0 = r6.adController
            com.amazon.device.ads.AdState r0 = r0.getAdState()
            com.amazon.device.ads.AdState r1 = com.amazon.device.ads.AdState.READY_TO_LOAD
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.isClosing
            r2 = 1
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L_0x0052
            com.amazon.device.ads.AdController r0 = r6.adController
            com.amazon.device.ads.AdControlCallback r0 = r0.getAdControlCallback()
            int r0 = r0.adClosing()
            if (r0 == 0) goto L_0x0033
            if (r0 == r2) goto L_0x0030
            r0 = 0
        L_0x002e:
            r3 = 0
            goto L_0x0035
        L_0x0030:
            r0 = 1
            r3 = 1
            goto L_0x0035
        L_0x0033:
            r0 = 1
            goto L_0x002e
        L_0x0035:
            if (r0 == 0) goto L_0x0044
            com.amazon.device.ads.AdController r0 = r6.adController
            com.amazon.device.ads.SDKEvent r4 = new com.amazon.device.ads.SDKEvent
            com.amazon.device.ads.SDKEvent$SDKEventType r5 = com.amazon.device.ads.SDKEvent.SDKEventType.CLOSED
            r4.<init>(r5)
            r0.fireSDKEvent(r4)
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x004c
            com.amazon.device.ads.AdController r0 = r6.adController
            r0.resetToReady()
        L_0x004c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.isClosing
            r0.set(r1)
            r1 = r2
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdCloser.closeAd():boolean");
    }
}
