package com.amazon.device.ads;

import com.amazon.device.ads.GooglePlayServices;

class AdvertisingIdentifier {
    private static final String GPS_ADVERTISING_IDENTIFIER_SETTING = "gpsAdId";
    private static final String LOGTAG = AdvertisingIdentifier.class.getSimpleName();
    private static final String TRANSITION_MIGRATE = "migrate";
    private static final String TRANSITION_RESET = "reset";
    private static final String TRANSITION_REVERT = "revert";
    private static final String TRANSITION_SETTING = "adIdTransistion";
    private static String lastKnownIdfa = null;
    private static boolean lastKnownIdfaDefined = false;
    private final DebugProperties debugProperties;
    private GooglePlayServices.AdvertisingInfo gpsAdvertisingInfo;
    private final MobileAdsInfoStore infoStore;
    private final MobileAdsLogger logger;
    private final Settings settings;
    private boolean shouldSetCurrentAdvertisingIdentifier;

    public static String getLastKnownIdfa() {
        return lastKnownIdfa;
    }

    public AdvertisingIdentifier() {
        this(Settings.getInstance(), MobileAdsInfoStore.getInstance(), new MobileAdsLoggerFactory(), DebugProperties.getInstance());
    }

    AdvertisingIdentifier(Settings settings2, MobileAdsInfoStore mobileAdsInfoStore, MobileAdsLoggerFactory mobileAdsLoggerFactory, DebugProperties debugProperties2) {
        this.shouldSetCurrentAdvertisingIdentifier = true;
        this.settings = settings2;
        this.infoStore = mobileAdsInfoStore;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.debugProperties = debugProperties2;
        if (!lastKnownIdfaDefined) {
            lastKnownIdfaDefined = true;
            lastKnownIdfa = getCurrentGPSAID();
        }
    }

    /* access modifiers changed from: package-private */
    public String getAndClearTransition() {
        String string = this.settings.getString(TRANSITION_SETTING, (String) null);
        this.settings.remove(TRANSITION_SETTING);
        return string;
    }

    /* access modifiers changed from: package-private */
    public AdvertisingIdentifier setShouldSetCurrentAdvertisingIdentifier(boolean z) {
        this.shouldSetCurrentAdvertisingIdentifier = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    public Info getAdvertisingIdentifierInfo() {
        String advertisingIdentifier;
        if (ThreadUtils.isOnMainThread()) {
            this.logger.mo10939e("You must obtain the advertising indentifier information on a background thread.");
            return new Info(this.debugProperties).setCanDo(false);
        }
        fetchGooglePlayServicesAdvertisingIdentifierInfo();
        if (this.shouldSetCurrentAdvertisingIdentifier) {
            determineTransition();
        }
        Info info = new Info(this.debugProperties);
        if (getGPSAdvertisingInfo().hasAdvertisingIdentifier()) {
            Info unused = info.setAdvertisingIdentifier(getGPSAdvertisingInfo().getAdvertisingIdentifier());
            Info unused2 = info.setLimitAdTrackingEnabled(getGPSAdvertisingInfo().isLimitAdTrackingEnabled());
            if (this.shouldSetCurrentAdvertisingIdentifier && (advertisingIdentifier = getGPSAdvertisingInfo().getAdvertisingIdentifier()) != null && !advertisingIdentifier.isEmpty()) {
                setCurrentGPSAID(advertisingIdentifier);
            }
        }
        RegistrationInfo registrationInfo = this.infoStore.getRegistrationInfo();
        if (registrationInfo.isAdIdCurrent(info)) {
            info.setSISDeviceIdentifier(registrationInfo.getAdId());
        } else {
            registrationInfo.requestNewSISDeviceIdentifier();
        }
        return info;
    }

    private void determineTransition() {
        String str;
        if (isTransitionMigrated()) {
            str = TRANSITION_MIGRATE;
        } else if (isTransitionReset()) {
            str = TRANSITION_RESET;
        } else {
            str = isTransitionReverted() ? TRANSITION_REVERT : null;
        }
        if (str != null) {
            setTransition(str);
        } else {
            this.logger.mo10938d("No transition detected.");
        }
    }

    private void setTransition(String str) {
        this.logger.mo11019d("Transition: %s", str);
        this.settings.putString(TRANSITION_SETTING, str);
    }

    /* access modifiers changed from: protected */
    public void fetchGooglePlayServicesAdvertisingIdentifierInfo() {
        this.gpsAdvertisingInfo = new GooglePlayServices().getAdvertisingIdentifierInfo();
    }

    /* access modifiers changed from: protected */
    public GooglePlayServices.AdvertisingInfo getGPSAdvertisingInfo() {
        if (this.gpsAdvertisingInfo == null) {
            fetchGooglePlayServicesAdvertisingIdentifierInfo();
        }
        return this.gpsAdvertisingInfo;
    }

    private boolean isTransitionMigrated() {
        return this.infoStore.getRegistrationInfo().hasAdId() && RegistrationInfo.isAdIdOriginatedFromNonAdvertisingIdentifier() && !hasCurrentGPSAID() && getGPSAdvertisingInfo().hasAdvertisingIdentifier();
    }

    private boolean isTransitionReset() {
        return hasCurrentGPSAID() && getGPSAdvertisingInfo().hasAdvertisingIdentifier() && !getCurrentGPSAID().equals(getGPSAdvertisingInfo().getAdvertisingIdentifier());
    }

    private boolean isTransitionReverted() {
        return hasCurrentGPSAID() && !getGPSAdvertisingInfo().hasAdvertisingIdentifier();
    }

    private void setCurrentGPSAID(String str) {
        lastKnownIdfa = str;
        this.settings.putString(GPS_ADVERTISING_IDENTIFIER_SETTING, str);
    }

    private String getCurrentGPSAID() {
        return this.settings.getString(GPS_ADVERTISING_IDENTIFIER_SETTING, "");
    }

    private boolean hasCurrentGPSAID() {
        return !StringUtils.isNullOrEmpty(getCurrentGPSAID());
    }

    static class Info {
        private String advertisingIdentifier;
        private boolean canDo;
        private final DebugProperties debugProperties;
        private boolean limitAdTrackingEnabled;
        private String sisDeviceIdentifier;

        private Info(DebugProperties debugProperties2) {
            this.debugProperties = debugProperties2;
            this.canDo = true;
        }

        /* access modifiers changed from: package-private */
        public boolean canDo() {
            return this.canDo;
        }

        /* access modifiers changed from: private */
        public Info setCanDo(boolean z) {
            this.canDo = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String getAdvertisingIdentifier() {
            return this.debugProperties.getDebugPropertyAsString(DebugProperties.DEBUG_IDFA, this.advertisingIdentifier);
        }

        /* access modifiers changed from: private */
        public Info setAdvertisingIdentifier(String str) {
            this.advertisingIdentifier = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAdvertisingIdentifier() {
            return !StringUtils.isNullOrEmpty(getAdvertisingIdentifier());
        }

        /* access modifiers changed from: package-private */
        public boolean isLimitAdTrackingEnabled() {
            return this.debugProperties.getDebugPropertyAsBoolean(DebugProperties.DEBUG_OPT_OUT, Boolean.valueOf(this.limitAdTrackingEnabled)).booleanValue();
        }

        /* access modifiers changed from: private */
        public Info setLimitAdTrackingEnabled(boolean z) {
            this.limitAdTrackingEnabled = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String getSISDeviceIdentifier() {
            return this.debugProperties.getDebugPropertyAsString(DebugProperties.DEBUG_ADID, this.sisDeviceIdentifier);
        }

        /* access modifiers changed from: package-private */
        public boolean hasSISDeviceIdentifier() {
            return getSISDeviceIdentifier() != null;
        }

        /* access modifiers changed from: package-private */
        public Info setSISDeviceIdentifier(String str) {
            this.sisDeviceIdentifier = str;
            return this;
        }
    }
}
