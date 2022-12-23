package com.amazon.device.ads;

import com.amazon.device.ads.Configuration;

class ViewabilityJavascriptFetcherListener implements Configuration.ConfigurationListener {
    private static final String LOGTAG = ViewabilityJavascriptFetcherListener.class.getSimpleName();
    private final MobileAdsLogger logger;
    private ViewabilityJavascriptFetcher viewabilityJavascriptFetcher;

    ViewabilityJavascriptFetcherListener() {
        this(new ViewabilityJavascriptFetcher(), new MobileAdsLoggerFactory());
    }

    ViewabilityJavascriptFetcherListener(ViewabilityJavascriptFetcher viewabilityJavascriptFetcher2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.viewabilityJavascriptFetcher = viewabilityJavascriptFetcher2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
    }

    public void onConfigurationReady() {
        this.viewabilityJavascriptFetcher.fetchJavascript();
    }

    public void onConfigurationFailure() {
        this.logger.mo10942w("Configuration fetching failed so Viewability Javascript fetch will not proceed.");
    }
}
