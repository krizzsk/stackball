package com.amazon.device.ads;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.AdvertisingIdentifier;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.WebRequest;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SISRequests */
class SISRegisterEventRequest extends SISRequest {
    private static final Metrics.MetricType CALL_METRIC_TYPE = Metrics.MetricType.SIS_LATENCY_REGISTER_EVENT;
    private static final String LOGTAG = "SISRegisterEventRequest";
    private static final String PATH = "/register_event";
    private final AdvertisingIdentifier.Info advertisingIdentifierInfo;
    private final AppEventRegistrationHandler appEventRegistrationHandler;
    private final JSONArray appEvents;

    public SISRegisterEventRequest(AdvertisingIdentifier.Info info, JSONArray jSONArray) {
        this(info, jSONArray, AppEventRegistrationHandler.getInstance(), new MobileAdsLoggerFactory(), MobileAdsInfoStore.getInstance(), Configuration.getInstance());
    }

    SISRegisterEventRequest(AdvertisingIdentifier.Info info, JSONArray jSONArray, AppEventRegistrationHandler appEventRegistrationHandler2, MobileAdsLoggerFactory mobileAdsLoggerFactory, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration) {
        super(mobileAdsLoggerFactory, LOGTAG, CALL_METRIC_TYPE, PATH, mobileAdsInfoStore, configuration);
        this.advertisingIdentifierInfo = info;
        this.appEvents = jSONArray;
        this.appEventRegistrationHandler = appEventRegistrationHandler2;
    }

    public WebRequest.QueryStringParameters getQueryParameters() {
        WebRequest.QueryStringParameters queryParameters = super.getQueryParameters();
        queryParameters.putUrlEncoded(Creative.AD_ID, this.advertisingIdentifierInfo.getSISDeviceIdentifier());
        return queryParameters;
    }

    public HashMap<String, String> getPostParameters() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("events", this.appEvents.toString());
        return hashMap;
    }

    public void onResponseReceived(JSONObject jSONObject) {
        int integerFromJSON = JSONUtils.getIntegerFromJSON(jSONObject, "rcode", 0);
        String stringFromJSON = JSONUtils.getStringFromJSON(jSONObject, NotificationCompat.CATEGORY_MESSAGE, "");
        if (integerFromJSON == 1 || integerFromJSON == 103 || (integerFromJSON == 101 && stringFromJSON.equals("103"))) {
            this.logger.mo10938d("Application events registered successfully.");
            this.appEventRegistrationHandler.onAppEventsRegistered();
            if (integerFromJSON == 103 || integerFromJSON == 101) {
                this.logger.mo10938d("gdpr consent not granted");
                return;
            }
            return;
        }
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("Application events not registered. rcode:" + integerFromJSON);
    }
}
