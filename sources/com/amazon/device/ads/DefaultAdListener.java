package com.amazon.device.ads;

import android.graphics.Rect;

public class DefaultAdListener implements ExtendedAdListener {
    private static final String LOGTAG = DefaultAdListener.class.getSimpleName();
    private final MobileAdsLogger logger;

    public DefaultAdListener() {
        this(LOGTAG);
    }

    DefaultAdListener(String str) {
        this(new MobileAdsLoggerFactory(), str);
    }

    DefaultAdListener(MobileAdsLoggerFactory mobileAdsLoggerFactory, String str) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(str);
    }

    /* access modifiers changed from: package-private */
    public MobileAdsLogger getLogger() {
        return this.logger;
    }

    public void onAdLoaded(C0898Ad ad, AdProperties adProperties) {
        this.logger.mo10938d("Default ad listener called - AdLoaded.");
    }

    public void onAdFailedToLoad(C0898Ad ad, AdError adError) {
        this.logger.mo11019d("Default ad listener called - Ad Failed to Load. Error code: %s, Error Message: %s", adError.getCode(), adError.getMessage());
    }

    public void onAdExpanded(C0898Ad ad) {
        this.logger.mo10938d("Default ad listener called - Ad Will Expand.");
    }

    public void onAdCollapsed(C0898Ad ad) {
        this.logger.mo10938d("Default ad listener called - Ad Collapsed.");
    }

    public void onAdDismissed(C0898Ad ad) {
        this.logger.mo10938d("Default ad listener called - Ad Dismissed.");
    }

    public void onAdResized(C0898Ad ad, Rect rect) {
        this.logger.mo10938d("Default ad listener called - Ad Resized.");
    }

    public void onAdExpired(C0898Ad ad) {
        this.logger.mo10938d("Default ad listener called - Ad Expired.");
    }
}
