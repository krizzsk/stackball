package com.amazon.device.ads;

import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.WebRequest;
import com.smaato.sdk.video.vast.model.Creative;
import org.json.JSONObject;

/* compiled from: SISRequests */
class SISUpdateDeviceInfoRequest extends SISDeviceRequest {
    private static final Metrics.MetricType CALL_METRIC_TYPE = Metrics.MetricType.SIS_LATENCY_UPDATE_DEVICE_INFO;
    private static final String LOGTAG = "SISUpdateDeviceInfoRequest";
    private static final String PATH = "/update_dev_info";
    private final DebugProperties debugPropertes;
    private final Metrics metrics;

    public SISUpdateDeviceInfoRequest(AdvertisingIdentifier advertisingIdentifier) {
        this(advertisingIdentifier, MobileAdsInfoStore.getInstance(), Configuration.getInstance(), DebugProperties.getInstance(), Metrics.getInstance());
    }

    SISUpdateDeviceInfoRequest(AdvertisingIdentifier advertisingIdentifier, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration, DebugProperties debugProperties, Metrics metrics2) {
        super(new MobileAdsLoggerFactory(), LOGTAG, CALL_METRIC_TYPE, PATH, advertisingIdentifier, mobileAdsInfoStore, configuration);
        this.debugPropertes = debugProperties;
        this.metrics = metrics2;
    }

    public WebRequest.QueryStringParameters getQueryParameters() {
        String debugPropertyAsString = this.debugPropertes.getDebugPropertyAsString(DebugProperties.DEBUG_ADID, getAdvertisingIdentifierInfo().getSISDeviceIdentifier());
        WebRequest.QueryStringParameters queryParameters = super.getQueryParameters();
        if (!StringUtils.isNullOrEmpty(debugPropertyAsString)) {
            queryParameters.putUrlEncoded(Creative.AD_ID, debugPropertyAsString);
        }
        return queryParameters;
    }

    public void onResponseReceived(JSONObject jSONObject) {
        super.onResponseReceived(jSONObject);
        if (JSONUtils.getBooleanFromJSON(jSONObject, "idChanged", false)) {
            this.metrics.getMetricsCollector().incrementMetric(Metrics.MetricType.SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED);
        }
    }
}
