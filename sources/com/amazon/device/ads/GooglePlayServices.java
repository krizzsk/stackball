package com.amazon.device.ads;

class GooglePlayServices {
    private static final String GPS_AVAILABLE_SETTING = "gps-available";
    private static final String LOGTAG = GooglePlayServices.class.getSimpleName();
    private final MobileAdsLogger logger;
    private final ReflectionUtils reflectionUtils;

    public GooglePlayServices() {
        this(new MobileAdsLoggerFactory(), new ReflectionUtils());
    }

    GooglePlayServices(MobileAdsLoggerFactory mobileAdsLoggerFactory, ReflectionUtils reflectionUtils2) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.reflectionUtils = reflectionUtils2;
    }

    public AdvertisingInfo getAdvertisingIdentifierInfo() {
        AdvertisingInfo advertisingIdentifierInfo;
        GooglePlayServicesAdapter createGooglePlayServicesAdapter;
        if (!isGPSAvailable()) {
            this.logger.mo10941v("The Google Play Services Advertising Identifier feature is not available.");
            return AdvertisingInfo.createNotAvailable();
        } else if (isGPSAvailableSet() || isGoogleAdvertisingClassAvailable()) {
            AdvertisingInfo advertisingInfo = null;
            if (!isGoogleAdvertisingClassAvailable() || (createGooglePlayServicesAdapter = createGooglePlayServicesAdapter()) == null || (advertisingInfo = createGooglePlayServicesAdapter.getAdvertisingIdentifierInfo()) == null || advertisingInfo.getAdvertisingIdentifier() == null || advertisingInfo.getAdvertisingIdentifier().isEmpty()) {
                AmazonFireServicesAdapter createAmazonFireServiceAdapter = createAmazonFireServiceAdapter();
                if (createAmazonFireServiceAdapter == null || (advertisingIdentifierInfo = createAmazonFireServiceAdapter.getAdvertisingIdentifierInfo()) == null || advertisingIdentifierInfo.getAdvertisingIdentifier() == null || advertisingIdentifierInfo.getAdvertisingIdentifier().isEmpty()) {
                    this.logger.mo10941v("Advertising Identifier feature is not available.");
                    if (advertisingInfo == null || !advertisingInfo.gpsAvailable) {
                        setGooglePlayServicesAvailable(false);
                    }
                    return advertisingInfo;
                }
                setGooglePlayServicesAvailable(advertisingIdentifierInfo.isGPSAvailable());
                return advertisingIdentifierInfo;
            }
            setGooglePlayServicesAvailable(advertisingInfo.isGPSAvailable());
            return advertisingInfo;
        } else {
            this.logger.mo10941v("The Google Play Services Advertising Identifier feature is not available.");
            setGooglePlayServicesAvailable(false);
            return AdvertisingInfo.createNotAvailable();
        }
    }

    /* access modifiers changed from: protected */
    public GooglePlayServicesAdapter createGooglePlayServicesAdapter() {
        return new GooglePlayServicesAdapter();
    }

    /* access modifiers changed from: protected */
    public AmazonFireServicesAdapter createAmazonFireServiceAdapter() {
        return AmazonFireServicesAdapter.newAdapter();
    }

    private boolean isGoogleAdvertisingClassAvailable() {
        return this.reflectionUtils.isClassAvailable("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private boolean isGPSAvailable() {
        return Settings.getInstance().getBoolean(GPS_AVAILABLE_SETTING, true);
    }

    private boolean isGPSAvailableSet() {
        return Settings.getInstance().containsKey(GPS_AVAILABLE_SETTING);
    }

    private void setGooglePlayServicesAvailable(boolean z) {
        Settings.getInstance().putTransientBoolean(GPS_AVAILABLE_SETTING, z);
    }

    static class AdvertisingInfo {
        private String advertisingIdentifier;
        /* access modifiers changed from: private */
        public boolean gpsAvailable = true;
        private boolean limitAdTrackingEnabled;

        protected AdvertisingInfo() {
        }

        static AdvertisingInfo createNotAvailable() {
            return new AdvertisingInfo().setGPSAvailable(false);
        }

        /* access modifiers changed from: package-private */
        public boolean isGPSAvailable() {
            return this.gpsAvailable;
        }

        private AdvertisingInfo setGPSAvailable(boolean z) {
            this.gpsAvailable = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String getAdvertisingIdentifier() {
            return this.advertisingIdentifier;
        }

        /* access modifiers changed from: package-private */
        public AdvertisingInfo setAdvertisingIdentifier(String str) {
            this.advertisingIdentifier = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAdvertisingIdentifier() {
            return getAdvertisingIdentifier() != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        /* access modifiers changed from: package-private */
        public AdvertisingInfo setLimitAdTrackingEnabled(boolean z) {
            this.limitAdTrackingEnabled = z;
            return this;
        }
    }
}
