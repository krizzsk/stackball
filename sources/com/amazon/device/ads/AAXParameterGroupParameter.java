package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;
import org.json.JSONException;
import org.json.JSONObject;

abstract class AAXParameterGroupParameter {
    static final AdvertisingIdentifierAAXParameter ADVERTISING_IDENTIFIER = new AdvertisingIdentifierAAXParameter();
    static final DirectedIdAAXParameter DIRECTED_ID = new DirectedIdAAXParameter();
    private static final String LOG_TAG = AAXParameterGroupParameter.class.getSimpleName();
    static final SHA1UDIDAAXParameter SHA1_UDID = new SHA1UDIDAAXParameter();
    static final SISDeviceIdentifierAAXParameter SIS_DEVICE_IDENTIFIER = new SISDeviceIdentifierAAXParameter();
    private final String debugName;
    protected final DebugProperties debugProperties;
    private final String key;
    private final MobileAdsLogger logger;

    /* access modifiers changed from: protected */
    public abstract String getDerivedValue(AAXParameter.ParameterData parameterData);

    AAXParameterGroupParameter(DebugProperties debugProperties2, String str, String str2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.debugProperties = debugProperties2;
        this.key = str;
        this.debugName = str2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOG_TAG);
    }

    /* access modifiers changed from: package-private */
    public boolean evaluate(AAXParameter.ParameterData parameterData, JSONObject jSONObject) {
        return putIntoJSON(jSONObject, this.key, this.debugProperties.getDebugPropertyAsString(this.debugName, getDerivedValue(parameterData)));
    }

    /* access modifiers changed from: protected */
    public boolean putIntoJSON(JSONObject jSONObject, String str, String str2) {
        if (!StringUtils.isNullOrEmpty(str2)) {
            try {
                jSONObject.put(str, str2);
                return true;
            } catch (JSONException unused) {
                this.logger.mo11019d("Could not add parameter to JSON %s: %s", str, str2);
            }
        }
        return false;
    }
}
