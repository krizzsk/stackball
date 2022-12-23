package com.amazon.device.ads;

class WebRequestUserId {
    private final AdvertisingIdParameter adIdParam;
    private final Settings settings;
    private UserIdParameter userIdParam;

    public WebRequestUserId() {
        this(Settings.getInstance(), new AdvertisingIdParameter());
    }

    WebRequestUserId(Settings settings2, AdvertisingIdParameter advertisingIdParameter) {
        this.settings = settings2;
        this.adIdParam = advertisingIdParameter;
    }

    private void setupUserIdParam() {
        if (this.userIdParam == null) {
            this.userIdParam = (UserIdParameter) this.settings.getObject(UserIdParameter.SETTINGS_KEY, this.adIdParam, UserIdParameter.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r3.userIdParam;
        r2 = r3.adIdParam;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean populateWebRequestUserId(com.amazon.device.ads.WebRequest r4) {
        /*
            r3 = this;
            r3.setupUserIdParam()
            com.amazon.device.ads.UserIdParameter r0 = r3.userIdParam
            boolean r0 = r0.evaluate(r4)
            if (r0 != 0) goto L_0x0015
            com.amazon.device.ads.UserIdParameter r1 = r3.userIdParam
            com.amazon.device.ads.AdvertisingIdParameter r2 = r3.adIdParam
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2.evaluate(r4)
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.WebRequestUserId.populateWebRequestUserId(com.amazon.device.ads.WebRequest):boolean");
    }
}
