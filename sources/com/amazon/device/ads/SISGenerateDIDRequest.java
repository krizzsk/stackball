package com.amazon.device.ads;

import com.amazon.device.ads.Metrics;

/* compiled from: SISRequests */
class SISGenerateDIDRequest extends SISDeviceRequest {
    private static final Metrics.MetricType CALL_METRIC_TYPE = Metrics.MetricType.SIS_LATENCY_REGISTER;
    private static final String LOGTAG = SISGenerateDIDRequest.class.getSimpleName();
    private static final String PATH = "/generate_did";

    public SISGenerateDIDRequest(AdvertisingIdentifier advertisingIdentifier) {
        this(advertisingIdentifier, MobileAdsInfoStore.getInstance(), Configuration.getInstance());
    }

    SISGenerateDIDRequest(AdvertisingIdentifier advertisingIdentifier, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration) {
        super(new MobileAdsLoggerFactory(), LOGTAG, CALL_METRIC_TYPE, PATH, advertisingIdentifier, mobileAdsInfoStore, configuration);
    }
}
