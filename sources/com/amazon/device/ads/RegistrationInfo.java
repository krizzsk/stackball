package com.amazon.device.ads;

import com.amazon.device.ads.AdvertisingIdentifier;

class RegistrationInfo {
    private static final String ADID_ORIGIN_PREF_NAME = "amzn-ad-id-origin";
    private static final String ADID_PREF_NAME = "amzn-ad-id";
    private static final String NEW_SIS_DID_REQUESTED_SETTING = "newSISDIDRequested";
    private static final String NON_ADVERTISING_IDENTIFIER_ORIGIN = "non-advertising-identifier";
    private static final String SIS_REGISTRATION_STATUS = "sis_registration_status";
    private static final String THIRD_PARTY_APP_NAME = "app";
    private String appKey;
    private String appName = "app";

    public String getAppName() {
        return this.appName;
    }

    public void putAppName(String str) {
        this.appName = WebUtils.getURLEncodedString(str);
    }

    public String getAdId() {
        return DebugProperties.getInstance().getDebugPropertyAsString(DebugProperties.DEBUG_ADID, Settings.getInstance().getString(ADID_PREF_NAME, (String) null));
    }

    public boolean isAdIdCurrent(AdvertisingIdentifier.Info info) {
        boolean isAdIdOriginatedFromNonAdvertisingIdentifier = isAdIdOriginatedFromNonAdvertisingIdentifier();
        if (!info.hasAdvertisingIdentifier()) {
            return isAdIdOriginatedFromNonAdvertisingIdentifier;
        }
        if (isAdIdOriginatedFromNonAdvertisingIdentifier) {
            return false;
        }
        return info.getAdvertisingIdentifier().equals(Settings.getInstance().getString(ADID_ORIGIN_PREF_NAME, (String) null));
    }

    public boolean hasAdId() {
        return !StringUtils.isNullOrEmpty(getAdId());
    }

    public void putAdId(String str, AdvertisingIdentifier.Info info) {
        Settings instance = Settings.getInstance();
        instance.putStringWithNoFlush(ADID_PREF_NAME, str);
        setOrigin(info);
        instance.putBooleanWithNoFlush(NEW_SIS_DID_REQUESTED_SETTING, false);
        instance.flush();
    }

    /* access modifiers changed from: protected */
    public void setSISRegistrationStatus() {
        Settings.getInstance().putBoolean(SIS_REGISTRATION_STATUS, true);
    }

    /* access modifiers changed from: protected */
    public void removeAdId(AdvertisingIdentifier.Info info) {
        Settings instance = Settings.getInstance();
        instance.remove(ADID_PREF_NAME);
        setOrigin(info);
        instance.putBooleanWithNoFlush(NEW_SIS_DID_REQUESTED_SETTING, false);
        instance.flush();
    }

    protected static void setOrigin(AdvertisingIdentifier.Info info) {
        if (info.hasAdvertisingIdentifier()) {
            Settings.getInstance().putStringWithNoFlush(ADID_ORIGIN_PREF_NAME, info.getAdvertisingIdentifier());
        } else {
            Settings.getInstance().putStringWithNoFlush(ADID_ORIGIN_PREF_NAME, NON_ADVERTISING_IDENTIFIER_ORIGIN);
        }
    }

    public static boolean isAdIdOriginatedFromNonAdvertisingIdentifier() {
        String string = Settings.getInstance().getString(ADID_ORIGIN_PREF_NAME, (String) null);
        return string == null || NON_ADVERTISING_IDENTIFIER_ORIGIN.equals(string);
    }

    public String getAppKey() {
        return DebugProperties.getInstance().getDebugPropertyAsString(DebugProperties.DEBUG_APPID, this.appKey);
    }

    public void putAppKey(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Application Key must not be null or empty.");
        }
        this.appKey = WebUtils.getURLEncodedString(str);
    }

    public void requestNewSISDeviceIdentifier() {
        Settings.getInstance().putBoolean(NEW_SIS_DID_REQUESTED_SETTING, true);
    }

    public boolean shouldGetNewSISDeviceIdentifer() {
        return Settings.getInstance().getBoolean(NEW_SIS_DID_REQUESTED_SETTING, false);
    }

    public boolean isRegisteredWithSIS() {
        return hasAdId();
    }

    public boolean shouldGetNewSISRegistration() {
        return !Settings.getInstance().getBoolean(SIS_REGISTRATION_STATUS, false);
    }
}
