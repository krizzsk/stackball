package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;

/* compiled from: AAXParameterGroupParameter */
class SISDeviceIdentifierAAXParameter extends AAXParameterGroupParameter {
    SISDeviceIdentifierAAXParameter() {
        this(DebugProperties.getInstance(), new MobileAdsLoggerFactory());
    }

    SISDeviceIdentifierAAXParameter(DebugProperties debugProperties, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        super(debugProperties, "ad-id", DebugProperties.DEBUG_ADID, mobileAdsLoggerFactory);
    }

    /* access modifiers changed from: protected */
    public String getDerivedValue(AAXParameter.ParameterData parameterData) {
        return parameterData.getAdRequest().getAdvertisingIdentifierInfo().getSISDeviceIdentifier();
    }
}
