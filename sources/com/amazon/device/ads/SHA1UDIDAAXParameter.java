package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;

/* compiled from: AAXParameterGroupParameter */
class SHA1UDIDAAXParameter extends AAXParameterGroupParameter {
    private MobileAdsInfoStore mobileAdsInfoStore;

    SHA1UDIDAAXParameter() {
        this(DebugProperties.getInstance(), new MobileAdsLoggerFactory(), MobileAdsInfoStore.getInstance());
    }

    SHA1UDIDAAXParameter(DebugProperties debugProperties, MobileAdsLoggerFactory mobileAdsLoggerFactory, MobileAdsInfoStore mobileAdsInfoStore2) {
        super(debugProperties, "sha1_udid", DebugProperties.DEBUG_SHA1UDID, mobileAdsLoggerFactory);
        this.mobileAdsInfoStore = mobileAdsInfoStore2;
    }

    /* access modifiers changed from: protected */
    public String getDerivedValue(AAXParameter.ParameterData parameterData) {
        return this.mobileAdsInfoStore.getDeviceInfo().getUdidSha1();
    }
}
