package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;

/* compiled from: AAXParameterGroupParameter */
class AdvertisingIdentifierAAXParameter extends AAXParameterGroupParameter {
    AdvertisingIdentifierAAXParameter() {
        this(DebugProperties.getInstance(), new MobileAdsLoggerFactory());
    }

    AdvertisingIdentifierAAXParameter(DebugProperties debugProperties, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        super(debugProperties, "idfa", DebugProperties.DEBUG_IDFA, mobileAdsLoggerFactory);
    }

    /* access modifiers changed from: protected */
    public String getDerivedValue(AAXParameter.ParameterData parameterData) {
        return parameterData.getAdRequest().getAdvertisingIdentifierInfo().getAdvertisingIdentifier();
    }
}
