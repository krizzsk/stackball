package com.amazon.device.ads;

import com.amazon.device.ads.AdvertisingIdentifier;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.WebRequest;
import com.facebook.appevents.AppEventsConstants;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: SISRequests */
abstract class SISDeviceRequest extends SISRequest {
    private AdvertisingIdentifier advertisingIdentifier;
    private AdvertisingIdentifier.Info advertisingIdentifierInfo;

    private static String convertOptOutBooleanToStringInt(boolean z) {
        return z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    public HashMap<String, String> getPostParameters() {
        return null;
    }

    SISDeviceRequest(MobileAdsLoggerFactory mobileAdsLoggerFactory, String str, Metrics.MetricType metricType, String str2, AdvertisingIdentifier advertisingIdentifier2, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration) {
        super(mobileAdsLoggerFactory, str, metricType, str2, mobileAdsInfoStore, configuration);
        this.advertisingIdentifier = advertisingIdentifier2;
        this.advertisingIdentifierInfo = advertisingIdentifier2.getAdvertisingIdentifierInfo();
    }

    public WebRequest.QueryStringParameters getQueryParameters() {
        WebRequest.QueryStringParameters queryParameters = super.getQueryParameters();
        DeviceInfo deviceInfo = this.mobileAdsInfoStore.getDeviceInfo();
        queryParameters.putUnencoded("ua", deviceInfo.getUserAgentString());
        queryParameters.putUnencoded("dinfo", deviceInfo.getDInfoProperty().toString());
        if (this.advertisingIdentifierInfo.hasAdvertisingIdentifier()) {
            queryParameters.putUrlEncoded("idfa", this.advertisingIdentifierInfo.getAdvertisingIdentifier());
            queryParameters.putUrlEncoded("oo", convertOptOutBooleanToStringInt(this.advertisingIdentifierInfo.isLimitAdTrackingEnabled()));
        } else {
            queryParameters.putUrlEncoded("sha1_mac", deviceInfo.getMacSha1());
            queryParameters.putUrlEncoded("sha1_serial", deviceInfo.getSerialSha1());
            queryParameters.putUrlEncoded("sha1_udid", deviceInfo.getUdidSha1());
            queryParameters.putUrlEncodedIfTrue("badMac", "true", deviceInfo.isMacBad());
            queryParameters.putUrlEncodedIfTrue("badSerial", "true", deviceInfo.isSerialBad());
            queryParameters.putUrlEncodedIfTrue("badUdid", "true", deviceInfo.isUdidBad());
        }
        String andClearTransition = this.advertisingIdentifier.getAndClearTransition();
        queryParameters.putUrlEncodedIfTrue("aidts", andClearTransition, andClearTransition != null);
        return queryParameters;
    }

    /* access modifiers changed from: protected */
    public AdvertisingIdentifier.Info getAdvertisingIdentifierInfo() {
        return this.advertisingIdentifierInfo;
    }

    public void onResponseReceived(JSONObject jSONObject) {
        int integerFromJSON = JSONUtils.getIntegerFromJSON(jSONObject, "rcode", 0);
        this.mobileAdsInfoStore.getRegistrationInfo().setSISRegistrationStatus();
        if (integerFromJSON == 1) {
            String stringFromJSON = JSONUtils.getStringFromJSON(jSONObject, Creative.AD_ID, "");
            if (stringFromJSON.length() > 0) {
                this.mobileAdsInfoStore.getRegistrationInfo().putAdId(stringFromJSON, getAdvertisingIdentifierInfo());
                return;
            }
            return;
        }
        this.mobileAdsInfoStore.getRegistrationInfo().removeAdId(getAdvertisingIdentifierInfo());
        this.logger.mo10938d("No ad-id returned,gdpr consent not granted");
    }
}
