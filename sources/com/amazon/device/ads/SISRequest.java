package com.amazon.device.ads;

import android.content.SharedPreferences;
import com.amazon.device.ads.AdvertisingIdentifier;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.WebRequest;
import com.inmobi.sdk.InMobiSdk;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SISRequests */
abstract class SISRequest {
    private final Metrics.MetricType callMetricType;
    private final Configuration configuration;
    private final String logTag;
    protected final MobileAdsLogger logger;
    protected MobileAdsInfoStore mobileAdsInfoStore;
    private final String path;

    /* compiled from: SISRequests */
    enum SISDeviceRequestType {
        GENERATE_DID,
        UPDATE_DEVICE_INFO
    }

    /* access modifiers changed from: package-private */
    public abstract HashMap<String, String> getPostParameters();

    /* access modifiers changed from: package-private */
    public abstract void onResponseReceived(JSONObject jSONObject);

    SISRequest(MobileAdsLoggerFactory mobileAdsLoggerFactory, String str, Metrics.MetricType metricType, String str2, MobileAdsInfoStore mobileAdsInfoStore2, Configuration configuration2) {
        this.logTag = str;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(str);
        this.callMetricType = metricType;
        this.path = str2;
        this.mobileAdsInfoStore = mobileAdsInfoStore2;
        this.configuration = configuration2;
    }

    /* access modifiers changed from: package-private */
    public MobileAdsLogger getLogger() {
        return this.logger;
    }

    /* access modifiers changed from: package-private */
    public String getLogTag() {
        return this.logTag;
    }

    /* access modifiers changed from: package-private */
    public Metrics.MetricType getCallMetricType() {
        return this.callMetricType;
    }

    /* access modifiers changed from: package-private */
    public String getPath() {
        return this.path;
    }

    /* access modifiers changed from: package-private */
    public WebRequest.QueryStringParameters getQueryParameters() {
        WebRequest.QueryStringParameters queryStringParameters = new WebRequest.QueryStringParameters();
        queryStringParameters.putUrlEncoded("dt", this.mobileAdsInfoStore.getDeviceInfo().getDeviceType());
        queryStringParameters.putUrlEncoded(TapjoyConstants.TJC_APP_PLACEMENT, this.mobileAdsInfoStore.getRegistrationInfo().getAppName());
        queryStringParameters.putUrlEncoded("appId", this.mobileAdsInfoStore.getRegistrationInfo().getAppKey());
        queryStringParameters.putUrlEncoded("sdkVer", Version.getSDKVersion());
        queryStringParameters.putUrlEncoded("aud", this.configuration.getString(Configuration.ConfigOption.SIS_DOMAIN));
        queryStringParameters.putUnencoded("pkg", this.mobileAdsInfoStore.getAppInfo().getPackageInfoJSONString());
        if (this.mobileAdsInfoStore.isContextReceived()) {
            ApplicationDefaultPreferences.initialize(this.mobileAdsInfoStore.getApplicationContext());
        }
        SharedPreferences defaultPreferences = ApplicationDefaultPreferences.getDefaultPreferences();
        if (defaultPreferences != null) {
            GDPRInfo gDPRInfo = new GDPRInfo(defaultPreferences);
            queryStringParameters.putUrlEncoded("gdpr", gDPRInfo.getGdprSubjectTcf2());
            queryStringParameters.putUrlEncoded(InMobiSdk.IM_GDPR_CONSENT_IAB, gDPRInfo.getGdprConsent_Tcf2());
        }
        return queryStringParameters;
    }

    /* compiled from: SISRequests */
    static class SISRequestFactory {
        SISRequestFactory() {
        }

        public SISDeviceRequest createDeviceRequest(SISDeviceRequestType sISDeviceRequestType, AdvertisingIdentifier advertisingIdentifier) {
            int i = C09821.$SwitchMap$com$amazon$device$ads$SISRequest$SISDeviceRequestType[sISDeviceRequestType.ordinal()];
            if (i == 1) {
                return new SISGenerateDIDRequest(advertisingIdentifier);
            }
            if (i == 2) {
                return new SISUpdateDeviceInfoRequest(advertisingIdentifier);
            }
            throw new IllegalArgumentException("SISRequestType " + sISDeviceRequestType + " is not a SISDeviceRequest");
        }

        public SISRegisterEventRequest createRegisterEventRequest(AdvertisingIdentifier.Info info, JSONArray jSONArray) {
            return new SISRegisterEventRequest(info, jSONArray);
        }
    }

    /* renamed from: com.amazon.device.ads.SISRequest$1 */
    /* compiled from: SISRequests */
    static /* synthetic */ class C09821 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$SISRequest$SISDeviceRequestType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.amazon.device.ads.SISRequest$SISDeviceRequestType[] r0 = com.amazon.device.ads.SISRequest.SISDeviceRequestType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$SISRequest$SISDeviceRequestType = r0
                com.amazon.device.ads.SISRequest$SISDeviceRequestType r1 = com.amazon.device.ads.SISRequest.SISDeviceRequestType.GENERATE_DID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$SISRequest$SISDeviceRequestType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.SISRequest$SISDeviceRequestType r1 = com.amazon.device.ads.SISRequest.SISDeviceRequestType.UPDATE_DEVICE_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.SISRequest.C09821.<clinit>():void");
        }
    }
}
