package com.amazon.device.ads;

import com.amazon.device.ads.AdvertisingIdentifier;

class AdvertisingIdParameter implements UserIdParameter {
    private static final String DEVICE_ID_KEY = "deviceId";
    private final AdvertisingIdentifier advertisingIdentifier;
    private AdvertisingIdentifier.Info advertisingIndentifierInfo;
    private final DebugProperties debugProperties;
    private DeviceInfo deviceInfo;
    private final Settings settings;

    public AdvertisingIdParameter() {
        this(new AdvertisingIdentifier(), Settings.getInstance(), DebugProperties.getInstance(), MobileAdsInfoStore.getInstance().getDeviceInfo());
    }

    AdvertisingIdParameter(AdvertisingIdentifier advertisingIdentifier2, Settings settings2, DebugProperties debugProperties2, DeviceInfo deviceInfo2) {
        this.advertisingIdentifier = advertisingIdentifier2;
        this.settings = settings2;
        this.debugProperties = debugProperties2;
        this.deviceInfo = deviceInfo2;
    }

    private boolean canIdentify() {
        if (this.advertisingIndentifierInfo == null) {
            AdvertisingIdentifier advertisingIdentifier2 = this.advertisingIdentifier;
            boolean z = false;
            if (this.settings.getInt("configVersion", 0) != 0) {
                z = true;
            }
            advertisingIdentifier2.setShouldSetCurrentAdvertisingIdentifier(z);
            this.advertisingIndentifierInfo = this.advertisingIdentifier.getAdvertisingIdentifierInfo();
        }
        if (this.deviceInfo == null) {
            this.deviceInfo = MobileAdsInfoStore.getInstance().getDeviceInfo();
        }
        return this.advertisingIndentifierInfo.canDo();
    }

    public boolean evaluate(WebRequest webRequest) {
        String debugPropertyAsString;
        if (!canIdentify() || (debugPropertyAsString = this.debugProperties.getDebugPropertyAsString(DebugProperties.DEBUG_IDFA, this.advertisingIndentifierInfo.getAdvertisingIdentifier())) == null) {
            webRequest.putUnencodedQueryParameter(DEVICE_ID_KEY, this.debugProperties.getDebugPropertyAsString(DebugProperties.DEBUG_SHA1UDID, this.settings.getString(DEVICE_ID_KEY, this.deviceInfo.getUdidSha1())));
            return true;
        }
        webRequest.putUnencodedQueryParameter("idfa", debugPropertyAsString);
        return true;
    }
}
