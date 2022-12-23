package com.amazon.device.ads;

import android.content.Context;

class AdRegistrationExecutor {
    private final MobileAdsInfoStore infoStore;
    private volatile boolean isInitialized;
    private final MobileAdsLogger logger;
    private final MobileAdsLoggerFactory loggerFactory;
    private final PermissionChecker permissionChecker;
    private final Settings settings;

    public AdRegistrationExecutor(String str) {
        this(str, MobileAdsInfoStore.getInstance(), Settings.getInstance(), new MobileAdsLoggerFactory(), new PermissionChecker());
    }

    AdRegistrationExecutor(String str, MobileAdsInfoStore mobileAdsInfoStore, Settings settings2, MobileAdsLoggerFactory mobileAdsLoggerFactory, PermissionChecker permissionChecker2) {
        this.isInitialized = false;
        this.infoStore = mobileAdsInfoStore;
        this.settings = settings2;
        this.loggerFactory = mobileAdsLoggerFactory;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(str);
        this.permissionChecker = permissionChecker2;
    }

    public void setAppKey(String str) throws IllegalArgumentException {
        this.infoStore.getRegistrationInfo().putAppKey(str);
    }

    public void enableLogging(boolean z) {
        this.logger.enableLoggingWithSetterNotification(z);
    }

    public void enableTesting(boolean z) {
        this.settings.putTransientBoolean("testingEnabled", z);
        this.logger.logSetterNotification("Test mode", Boolean.valueOf(z));
    }

    public String getVersion() {
        return Version.getSDKVersion();
    }

    public void registerApp(Context context) {
        if (!this.permissionChecker.hasInternetPermission(context)) {
            this.logger.mo10939e("Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
            return;
        }
        initializeAds(context);
        this.infoStore.register();
    }

    public void initializeAds(Context context) {
        if (!this.isInitialized) {
            this.infoStore.contextReceived(context);
            this.infoStore.getDeviceInfo().setUserAgentManager(new UserAgentManager());
            this.isInitialized = true;
        }
    }

    /* access modifiers changed from: package-private */
    public MobileAdsInfoStore getMobileAdsInfoStore() {
        return this.infoStore;
    }

    /* access modifiers changed from: package-private */
    public Settings getSettings() {
        return this.settings;
    }

    /* access modifiers changed from: package-private */
    public PermissionChecker getPermissionChecker() {
        return this.permissionChecker;
    }

    /* access modifiers changed from: package-private */
    public MobileAdsLogger getLogger() {
        return this.logger;
    }

    /* access modifiers changed from: package-private */
    public MobileAdsLoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }
}
