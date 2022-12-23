package com.amazon.device.ads;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdLoader;
import com.amazon.device.ads.AdRequest;
import com.amazon.device.ads.AdvertisingIdentifier;
import com.amazon.device.ads.ThreadUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class AdLoadStarter {
    private static final String LOGTAG = AdLoadStarter.class.getSimpleName();
    private final AdLoader.AdLoaderFactory adLoaderFactory;
    private final AdRequest.AdRequestBuilder adRequestBuilder;
    private final AdvertisingIdentifier advertisingIdentifier;
    private final Configuration configuration;
    /* access modifiers changed from: private */
    public final MobileAdsInfoStore infoStore;
    private final MobileAdsLogger logger;
    private final PermissionChecker permissionChecker;
    private final Settings settings;
    private final SystemTime systemTime;
    /* access modifiers changed from: private */
    public final ThreadUtils.ThreadRunner threadRunner;
    private final ViewabilityJavascriptFetcherListener viewabilityJavascriptFetcherListener;

    public AdLoadStarter() {
        this(new AdLoader.AdLoaderFactory(), new AdvertisingIdentifier(), ThreadUtils.getThreadRunner(), MobileAdsInfoStore.getInstance(), Settings.getInstance(), Configuration.getInstance(), new MobileAdsLoggerFactory(), new SystemTime(), new AdRequest.AdRequestBuilder(), new PermissionChecker(), new ViewabilityJavascriptFetcherListener());
    }

    AdLoadStarter(AdLoader.AdLoaderFactory adLoaderFactory2, AdvertisingIdentifier advertisingIdentifier2, ThreadUtils.ThreadRunner threadRunner2, MobileAdsInfoStore mobileAdsInfoStore, Settings settings2, Configuration configuration2, MobileAdsLoggerFactory mobileAdsLoggerFactory, SystemTime systemTime2, AdRequest.AdRequestBuilder adRequestBuilder2, PermissionChecker permissionChecker2, ViewabilityJavascriptFetcherListener viewabilityJavascriptFetcherListener2) {
        this.adLoaderFactory = adLoaderFactory2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.advertisingIdentifier = advertisingIdentifier2;
        this.infoStore = mobileAdsInfoStore;
        this.settings = settings2;
        this.configuration = configuration2;
        this.threadRunner = threadRunner2;
        this.systemTime = systemTime2;
        this.adRequestBuilder = adRequestBuilder2;
        this.permissionChecker = permissionChecker2;
        this.viewabilityJavascriptFetcherListener = viewabilityJavascriptFetcherListener2;
    }

    public void loadAds(int i, AdTargetingOptions adTargetingOptions, AdSlot... adSlotArr) {
        if (!isNoRetry(adSlotArr)) {
            if (adTargetingOptions != null && adTargetingOptions.isGeoLocationEnabled() && !this.permissionChecker.hasLocationPermission(this.infoStore.getApplicationContext())) {
                this.logger.mo10942w("Geolocation for ad targeting has been disabled. To enable geolocation, add at least one of the following permissions to the app manifest: 1. ACCESS_FINE_LOCATION; 2. ACCESS_COARSE_LOCATION.");
            }
            long nanoTime = this.systemTime.nanoTime();
            final ArrayList arrayList = new ArrayList();
            for (AdSlot adSlot : adSlotArr) {
                if (adSlot.prepareForAdLoad(nanoTime)) {
                    arrayList.add(adSlot);
                }
            }
            this.configuration.queueConfigurationListener(this.viewabilityJavascriptFetcherListener);
            final int i2 = i;
            final AdTargetingOptions adTargetingOptions2 = adTargetingOptions;
            new StartUpWaiter(this.settings, this.configuration) {
                /* access modifiers changed from: protected */
                public void startUpReady() {
                    AdLoadStarter.this.infoStore.register();
                    AdLoadStarter.this.beginFetchAds(i2, adTargetingOptions2, arrayList);
                }

                /* access modifiers changed from: protected */
                public void startUpFailed() {
                    AdLoadStarter.this.threadRunner.execute(new Runnable() {
                        public void run() {
                            AdLoadStarter.this.failAds(new AdError(AdError.ErrorCode.NETWORK_ERROR, "The configuration was unable to be loaded"), arrayList);
                        }
                    }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
                }
            }.start();
        }
    }

    /* access modifiers changed from: private */
    public void beginFetchAds(int i, AdTargetingOptions adTargetingOptions, List<AdSlot> list) {
        AdvertisingIdentifier.Info advertisingIdentifierInfo = this.advertisingIdentifier.getAdvertisingIdentifierInfo();
        if (!advertisingIdentifierInfo.canDo()) {
            failAds(new AdError(AdError.ErrorCode.INTERNAL_ERROR, "An internal request was not made on a background thread."), list);
            return;
        }
        if (adTargetingOptions == null) {
            adTargetingOptions = new AdTargetingOptions();
        }
        AdRequest build = this.adRequestBuilder.withAdTargetingOptions(adTargetingOptions).withAdvertisingIdentifierInfo(advertisingIdentifierInfo).build();
        HashMap hashMap = new HashMap();
        int i2 = 1;
        for (AdSlot next : list) {
            if (next.isValid()) {
                next.setSlotNumber(i2);
                hashMap.put(Integer.valueOf(i2), next);
                build.putSlot(next);
                i2++;
            }
        }
        if (hashMap.size() > 0) {
            AdLoader createAdLoader = this.adLoaderFactory.createAdLoader(build, hashMap);
            createAdLoader.setTimeout(i);
            createAdLoader.beginFetchAd();
        }
    }

    /* access modifiers changed from: private */
    public void failAds(AdError adError, List<AdSlot> list) {
        int i = 0;
        for (AdSlot next : list) {
            if (next.getSlotNumber() != -1) {
                next.adFailed(adError);
                i++;
            }
        }
        if (i > 0) {
            this.logger.mo11020e("%s; code: %s", adError.getMessage(), adError.getCode());
        }
    }

    private boolean isNoRetry(AdSlot[] adSlotArr) {
        AdError.ErrorCode errorCode;
        String str;
        int noRetryTtlRemainingMillis = this.infoStore.getNoRetryTtlRemainingMillis();
        if (noRetryTtlRemainingMillis <= 0) {
            return false;
        }
        int i = noRetryTtlRemainingMillis / 1000;
        if (this.infoStore.getIsAppDisabled()) {
            str = "SDK Message: " + AdLoader.DISABLED_APP_SERVER_MESSAGE;
            errorCode = AdError.ErrorCode.INTERNAL_ERROR;
        } else {
            str = "SDK Message: " + "no results. Try again in " + i + " seconds.";
            errorCode = AdError.ErrorCode.NO_FILL;
        }
        failAds(new AdError(errorCode, str), new ArrayList(Arrays.asList(adSlotArr)));
        return true;
    }
}
