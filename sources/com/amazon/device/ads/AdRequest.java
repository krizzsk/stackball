package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;
import com.amazon.device.ads.AdvertisingIdentifier;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.JSONUtils;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.WebRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class AdRequest {
    private static final String LOGTAG = AdRequest.class.getSimpleName();
    private static final AAXParameter<?>[] PARAMETERS = {AAXParameter.APP_KEY, AAXParameter.CHANNEL, AAXParameter.PUBLISHER_KEYWORDS, AAXParameter.PUBLISHER_ASINS, AAXParameter.USER_AGENT, AAXParameter.SDK_VERSION, AAXParameter.GEOLOCATION, AAXParameter.DEVICE_INFO, AAXParameter.GDPR, AAXParameter.PACKAGE_INFO, AAXParameter.TEST, AAXParameter.OPT_OUT};
    private static final AAXParameterGroup[] PARAMETER_GROUPS = {AAXParameterGroup.USER_ID, AAXParameterGroup.PUBLISHER_EXTRA_PARAMETERS};
    private AdvertisingIdentifier.Info advertisingIdentifierInfo;
    private final Configuration configuration;
    private final ConnectionInfo connectionInfo;
    private final DebugProperties debugProperties;
    private String instrPixelUrl;
    private final JSONObjectBuilder jsonObjectBuilder;
    private final JSONUtils.JSONUtilities jsonUtilities;
    private final MobileAdsLogger logger;
    private final AdTargetingOptions opt;
    private final String orientation;
    protected final Map<Integer, LOISlot> slots;
    private final WebRequest.WebRequestFactory webRequestFactory;

    public AdRequest(AdTargetingOptions adTargetingOptions) {
        this(adTargetingOptions, new WebRequest.WebRequestFactory(), MobileAdsInfoStore.getInstance(), Configuration.getInstance(), DebugProperties.getInstance(), new MobileAdsLoggerFactory(), new JSONUtils.JSONUtilities(), new ConnectionInfo(MobileAdsInfoStore.getInstance()));
    }

    AdRequest(AdTargetingOptions adTargetingOptions, WebRequest.WebRequestFactory webRequestFactory2, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration2, DebugProperties debugProperties2, MobileAdsLoggerFactory mobileAdsLoggerFactory, JSONUtils.JSONUtilities jSONUtilities, ConnectionInfo connectionInfo2) {
        JSONObject debugPropertyAsJSONObject;
        this.opt = adTargetingOptions;
        this.webRequestFactory = webRequestFactory2;
        this.jsonUtilities = jSONUtilities;
        this.slots = new HashMap();
        this.orientation = mobileAdsInfoStore.getDeviceInfo().getOrientation();
        this.connectionInfo = connectionInfo2;
        this.configuration = configuration2;
        this.debugProperties = debugProperties2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        HashMap<String, String> copyOfAdvancedOptions = this.opt.getCopyOfAdvancedOptions();
        if (this.debugProperties.containsDebugProperty(DebugProperties.DEBUG_ADVTARGETING) && (debugPropertyAsJSONObject = this.debugProperties.getDebugPropertyAsJSONObject(DebugProperties.DEBUG_ADVTARGETING, (JSONObject) null)) != null) {
            copyOfAdvancedOptions.putAll(this.jsonUtilities.createMapFromJSON(debugPropertyAsJSONObject));
        }
        this.jsonObjectBuilder = new JSONObjectBuilder(this.logger).setAAXParameters(PARAMETERS).setAAXParameterGroups(PARAMETER_GROUPS).setAdvancedOptions(copyOfAdvancedOptions).setParameterData(new AAXParameter.ParameterData().setAdTargetingOptions(this.opt).setAdvancedOptions(copyOfAdvancedOptions).setAdRequest(this));
    }

    public void setInstrumentationPixelURL(String str) {
        this.instrPixelUrl = str;
    }

    public String getInstrumentationPixelURL() {
        String str = this.instrPixelUrl;
        return str != null ? str : "https://fls-na.amazon.com/1/action-impressions/1/OE/mobile-ads-sas/action";
    }

    /* access modifiers changed from: package-private */
    public AdTargetingOptions getAdTargetingOptions() {
        return this.opt;
    }

    /* access modifiers changed from: package-private */
    public String getOrientation() {
        return this.orientation;
    }

    /* access modifiers changed from: package-private */
    public AdvertisingIdentifier.Info getAdvertisingIdentifierInfo() {
        return this.advertisingIdentifierInfo;
    }

    /* access modifiers changed from: package-private */
    public AdRequest setAdvertisingIdentifierInfo(AdvertisingIdentifier.Info info) {
        this.advertisingIdentifierInfo = info;
        return this;
    }

    public void putSlot(AdSlot adSlot) {
        if (getAdvertisingIdentifierInfo().hasSISDeviceIdentifier()) {
            adSlot.getMetricsCollector().incrementMetric(Metrics.MetricType.AD_COUNTER_IDENTIFIED_DEVICE);
        }
        adSlot.setConnectionInfo(this.connectionInfo);
        this.slots.put(Integer.valueOf(adSlot.getSlotNumber()), new LOISlot(adSlot, this, this.logger));
    }

    /* access modifiers changed from: protected */
    public JSONArray getSlots() {
        JSONArray jSONArray = new JSONArray();
        for (LOISlot json : this.slots.values()) {
            jSONArray.put(json.getJSON());
        }
        return jSONArray;
    }

    public WebRequest getWebRequest() {
        WebRequest createWebRequest = this.webRequestFactory.createWebRequest();
        createWebRequest.setUseSecure(isSSLRequired() || createWebRequest.getUseSecure());
        createWebRequest.setExternalLogTag(LOGTAG);
        createWebRequest.setHttpMethod(WebRequest.HttpMethod.POST);
        createWebRequest.setHost(this.configuration.getString(Configuration.ConfigOption.AAX_HOSTNAME));
        createWebRequest.setPath(this.configuration.getString(Configuration.ConfigOption.AD_RESOURCE_PATH));
        createWebRequest.enableLog(true);
        createWebRequest.setContentType(WebRequest.CONTENT_TYPE_JSON);
        createWebRequest.setDisconnectEnabled(false);
        setParametersInWebRequest(createWebRequest);
        return createWebRequest;
    }

    private boolean isSSLRequired() {
        return !Configuration.getInstance().getBoolean(Configuration.ConfigOption.TRUNCATE_LAT_LON) && Configuration.getInstance().getBoolean(Configuration.ConfigOption.SEND_GEO) && getAdTargetingOptions().isGeoLocationEnabled();
    }

    /* access modifiers changed from: protected */
    public void setParametersInWebRequest(WebRequest webRequest) {
        this.jsonObjectBuilder.build();
        JSONArray value = AAXParameter.SLOTS.getValue(this.jsonObjectBuilder.getParameterData());
        if (value == null) {
            value = getSlots();
        }
        this.jsonObjectBuilder.putIntoJSON((AAXParameter<?>) AAXParameter.SLOTS, (Object) value);
        JSONObject json = this.jsonObjectBuilder.getJSON();
        String debugPropertyAsString = this.debugProperties.getDebugPropertyAsString(DebugProperties.DEBUG_AAX_AD_PARAMS, (String) null);
        if (!StringUtils.isNullOrEmpty(debugPropertyAsString)) {
            webRequest.setAdditionalQueryParamsString(debugPropertyAsString);
        }
        setRequestBodyString(webRequest, json);
    }

    /* access modifiers changed from: protected */
    public void setRequestBodyString(WebRequest webRequest, JSONObject jSONObject) {
        webRequest.setRequestBodyString(jSONObject.toString());
    }

    static class LOISlot {
        static final AAXParameter<?>[] PARAMETERS = {AAXParameter.SIZE, AAXParameter.PAGE_TYPE, AAXParameter.SLOT, AAXParameter.SLOT_POSITION, AAXParameter.MAX_SIZE, AAXParameter.SLOT_ID, AAXParameter.FLOOR_PRICE, AAXParameter.SUPPORTED_MEDIA_TYPES, AAXParameter.VIDEO_OPTIONS};
        private final AdSlot adSlot;
        private final DebugProperties debugProperties;
        private final JSONObjectBuilder jsonObjectBuilder;
        private final JSONUtils.JSONUtilities jsonUtilities;
        private final AdTargetingOptions opt;

        LOISlot(AdSlot adSlot2, AdRequest adRequest, MobileAdsLogger mobileAdsLogger) {
            this(adSlot2, adRequest, mobileAdsLogger, new JSONObjectBuilder(mobileAdsLogger), DebugProperties.getInstance(), new JSONUtils.JSONUtilities());
        }

        LOISlot(AdSlot adSlot2, AdRequest adRequest, MobileAdsLogger mobileAdsLogger, JSONObjectBuilder jSONObjectBuilder, DebugProperties debugProperties2, JSONUtils.JSONUtilities jSONUtilities) {
            JSONObject debugPropertyAsJSONObject;
            AdTargetingOptions adTargetingOptions = adSlot2.getAdTargetingOptions();
            this.opt = adTargetingOptions;
            this.adSlot = adSlot2;
            this.debugProperties = debugProperties2;
            this.jsonUtilities = jSONUtilities;
            HashMap<String, String> copyOfAdvancedOptions = adTargetingOptions.getCopyOfAdvancedOptions();
            if (this.debugProperties.containsDebugProperty(DebugProperties.DEBUG_ADVTARGETING) && (debugPropertyAsJSONObject = this.debugProperties.getDebugPropertyAsJSONObject(DebugProperties.DEBUG_ADVTARGETING, (JSONObject) null)) != null) {
                copyOfAdvancedOptions.putAll(this.jsonUtilities.createMapFromJSON(debugPropertyAsJSONObject));
            }
            this.jsonObjectBuilder = jSONObjectBuilder.setAAXParameters(PARAMETERS).setAdvancedOptions(copyOfAdvancedOptions).setParameterData(new AAXParameter.ParameterData().setAdTargetingOptions(this.opt).setAdvancedOptions(copyOfAdvancedOptions).setLOISlot(this).setAdRequest(adRequest));
        }

        /* access modifiers changed from: package-private */
        public AdTargetingOptions getAdTargetingOptions() {
            return this.opt;
        }

        /* access modifiers changed from: package-private */
        public JSONObject getJSON() {
            this.jsonObjectBuilder.build();
            return this.jsonObjectBuilder.getJSON();
        }

        /* access modifiers changed from: package-private */
        public AdSlot getAdSlot() {
            return this.adSlot;
        }
    }

    static class JSONObjectBuilder {
        private AAXParameterGroup[] aaxParameterGroups;
        private AAXParameter<?>[] aaxParameters;
        private Map<String, String> advancedOptions;
        private final JSONObject json;
        private final MobileAdsLogger logger;
        private AAXParameter.ParameterData parameterData;

        JSONObjectBuilder(MobileAdsLogger mobileAdsLogger) {
            this(mobileAdsLogger, new JSONObject());
        }

        JSONObjectBuilder(MobileAdsLogger mobileAdsLogger, JSONObject jSONObject) {
            this.logger = mobileAdsLogger;
            this.json = jSONObject;
        }

        /* access modifiers changed from: package-private */
        public JSONObjectBuilder setAAXParameters(AAXParameter<?>[] aAXParameterArr) {
            this.aaxParameters = aAXParameterArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public JSONObjectBuilder setAAXParameterGroups(AAXParameterGroup[] aAXParameterGroupArr) {
            this.aaxParameterGroups = aAXParameterGroupArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public JSONObjectBuilder setAdvancedOptions(Map<String, String> map) {
            this.advancedOptions = map;
            return this;
        }

        /* access modifiers changed from: package-private */
        public JSONObjectBuilder setParameterData(AAXParameter.ParameterData parameterData2) {
            this.parameterData = parameterData2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public AAXParameter.ParameterData getParameterData() {
            return this.parameterData;
        }

        /* access modifiers changed from: package-private */
        public JSONObject getJSON() {
            return this.json;
        }

        /* access modifiers changed from: package-private */
        public void build() {
            AAXParameterGroup[] aAXParameterGroupArr = this.aaxParameterGroups;
            if (aAXParameterGroupArr != null) {
                for (AAXParameterGroup evaluate : aAXParameterGroupArr) {
                    evaluate.evaluate(this.parameterData, this.json);
                }
            }
            for (AAXParameter<?> aAXParameter : this.aaxParameters) {
                putIntoJSON(aAXParameter, (Object) aAXParameter.getValue(this.parameterData));
            }
            Map<String, String> map = this.advancedOptions;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (!StringUtils.isNullOrWhiteSpace((String) next.getValue())) {
                        putIntoJSON((String) next.getKey(), next.getValue());
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void putIntoJSON(AAXParameter<?> aAXParameter, Object obj) {
            putIntoJSON(aAXParameter.getName(), obj);
        }

        /* access modifiers changed from: package-private */
        public void putIntoJSON(String str, Object obj) {
            if (obj != null) {
                try {
                    this.json.put(str, obj);
                } catch (JSONException unused) {
                    this.logger.mo11019d("Could not add parameter to JSON %s: %s", str, obj);
                }
            }
        }
    }

    static class AdRequestBuilder {
        private AdTargetingOptions adTargetingOptions;
        private AdvertisingIdentifier.Info advertisingIdentifierInfo;

        AdRequestBuilder() {
        }

        public AdRequestBuilder withAdTargetingOptions(AdTargetingOptions adTargetingOptions2) {
            this.adTargetingOptions = adTargetingOptions2;
            return this;
        }

        public AdRequestBuilder withAdvertisingIdentifierInfo(AdvertisingIdentifier.Info info) {
            this.advertisingIdentifierInfo = info;
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this.adTargetingOptions).setAdvertisingIdentifierInfo(this.advertisingIdentifierInfo);
        }
    }
}
