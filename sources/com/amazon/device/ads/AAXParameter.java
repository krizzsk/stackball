package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.amazon.device.ads.AdRequest;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.Parsers;
import com.appsflyer.share.Constants;
import com.facebook.share.internal.ShareConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class AAXParameter<T> {
    static final AAXParameter<String> APP_KEY = new AppKeyParameter();
    static final AAXParameter<String> CHANNEL = new StringParameter(Constants.URL_CAMPAIGN, DebugProperties.DEBUG_CHANNEL);
    static final AAXParameter<JSONObject> DEVICE_INFO = new DeviceInfoParameter();
    static final AAXParameter<Long> FLOOR_PRICE = new FloorPriceParameter();
    static final AAXParameter<JSONObject> GDPR = new GDPRParameter();
    static final AAXParameter<String> GEOLOCATION = new GeoLocationParameter();
    /* access modifiers changed from: private */
    public static final String LOGTAG = AAXParameter.class.getSimpleName();
    static final AAXParameter<String> MAX_SIZE = new MaxSizeParameter();
    static final AAXParameter<Boolean> OPT_OUT = new OptOutParameter();
    static final AAXParameter<JSONObject> PACKAGE_INFO = new PackageInfoParameter();
    static final AAXParameter<String> PAGE_TYPE = new StringParameter("pt", DebugProperties.DEBUG_PT);
    static final AAXParameter<JSONArray> PUBLISHER_ASINS = new JSONArrayParameter("pa", DebugProperties.DEBUG_PA);
    static final PublisherKeywordsParameter PUBLISHER_KEYWORDS = new PublisherKeywordsParameter();
    static final AAXParameter<String> SDK_VERSION = new SDKVersionParameter();
    static final AAXParameter<String> SIZE = new SizeParameter();
    static final AAXParameter<String> SLOT = new SlotParameter();
    static final AAXParameter<JSONArray> SLOTS = new JSONArrayParameter("slots", DebugProperties.DEBUG_SLOTS);
    static final AAXParameter<Integer> SLOT_ID = new SlotIdParameter();
    static final AAXParameter<String> SLOT_POSITION = new StringParameter("sp", DebugProperties.DEBUG_SP);
    static final AAXParameter<JSONArray> SUPPORTED_MEDIA_TYPES = new SupportedMediaTypesParameter();
    static final AAXParameter<Boolean> TEST = new TestParameter();
    static final AAXParameter<String> USER_AGENT = new UserAgentParameter();
    static final AAXParameter<JSONObject> VIDEO_OPTIONS = new VideoOptionsParameter();
    private final String debugName;
    private final String name;

    /* access modifiers changed from: protected */
    public T applyPostParameterProcessing(T t, ParameterData parameterData) {
        return t;
    }

    /* access modifiers changed from: protected */
    public T getDerivedValue(ParameterData parameterData) {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract T getFromDebugProperties();

    /* access modifiers changed from: protected */
    public abstract T parseFromString(String str);

    AAXParameter(String str, String str2) {
        this.name = str;
        this.debugName = str2;
    }

    /* access modifiers changed from: package-private */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public String getDebugName() {
        return this.debugName;
    }

    /* access modifiers changed from: protected */
    public boolean hasDebugPropertiesValue() {
        return DebugProperties.getInstance().containsDebugProperty(this.debugName);
    }

    /* access modifiers changed from: package-private */
    public T getValueDoNotRemove(ParameterData parameterData) {
        return getValueHelper(parameterData, false);
    }

    /* access modifiers changed from: package-private */
    public T getValue(ParameterData parameterData) {
        return getValueHelper(parameterData, true);
    }

    private T getValueHelper(ParameterData parameterData, boolean z) {
        String str;
        Object fromDebugProperties = hasDebugPropertiesValue() ? getFromDebugProperties() : null;
        if (parameterData.advancedOptions != null) {
            if (z) {
                str = (String) parameterData.advancedOptions.remove(this.name);
            } else {
                str = (String) parameterData.advancedOptions.get(this.name);
            }
            if (fromDebugProperties == null && !StringUtils.isNullOrEmpty(str)) {
                fromDebugProperties = parseFromString(str);
            }
        }
        if (fromDebugProperties == null) {
            fromDebugProperties = getDerivedValue(parameterData);
        }
        T applyPostParameterProcessing = applyPostParameterProcessing(fromDebugProperties, parameterData);
        if (!(applyPostParameterProcessing instanceof String) || !StringUtils.isNullOrWhiteSpace((String) applyPostParameterProcessing)) {
            return applyPostParameterProcessing;
        }
        return null;
    }

    static class ParameterData {
        /* access modifiers changed from: private */
        public AdRequest adRequest;
        /* access modifiers changed from: private */
        public AdTargetingOptions adTargetingOptions;
        /* access modifiers changed from: private */
        public Map<String, String> advancedOptions;
        /* access modifiers changed from: private */
        public AdRequest.LOISlot loiSlot;
        /* access modifiers changed from: private */
        public Map<String, String> temporaryOptions = new HashMap();

        /* access modifiers changed from: package-private */
        public ParameterData setAdRequest(AdRequest adRequest2) {
            this.adRequest = adRequest2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public ParameterData setAdvancedOptions(Map<String, String> map) {
            this.advancedOptions = map;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Map<String, String> getInternalAdvancedOptions() {
            return this.advancedOptions;
        }

        /* access modifiers changed from: package-private */
        public ParameterData setLOISlot(AdRequest.LOISlot lOISlot) {
            this.loiSlot = lOISlot;
            return this;
        }

        /* access modifiers changed from: package-private */
        public AdRequest getAdRequest() {
            return this.adRequest;
        }

        /* access modifiers changed from: package-private */
        public ParameterData setAdTargetingOptions(AdTargetingOptions adTargetingOptions2) {
            this.adTargetingOptions = adTargetingOptions2;
            return this;
        }
    }

    static class StringParameter extends AAXParameter<String> {
        /* access modifiers changed from: protected */
        public String parseFromString(String str) {
            return str;
        }

        StringParameter(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: protected */
        public String getFromDebugProperties() {
            return DebugProperties.getInstance().getDebugPropertyAsString(getDebugName(), (String) null);
        }
    }

    static class BooleanParameter extends AAXParameter<Boolean> {
        BooleanParameter(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: protected */
        public Boolean parseFromString(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }

        /* access modifiers changed from: protected */
        public Boolean getFromDebugProperties() {
            return DebugProperties.getInstance().getDebugPropertyAsBoolean(getDebugName(), (Boolean) null);
        }
    }

    static class IntegerParameter extends AAXParameter<Integer> {
        IntegerParameter(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: protected */
        public Integer parseFromString(String str) {
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* access modifiers changed from: protected */
        public Integer getFromDebugProperties() {
            return DebugProperties.getInstance().getDebugPropertyAsInteger(getDebugName(), (Integer) null);
        }
    }

    static class LongParameter extends AAXParameter<Long> {
        LongParameter(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: protected */
        public Long parseFromString(String str) {
            return Long.valueOf(Long.parseLong(str));
        }

        /* access modifiers changed from: protected */
        public Long getFromDebugProperties() {
            return DebugProperties.getInstance().getDebugPropertyAsLong(getDebugName(), (Long) null);
        }
    }

    static class JSONArrayParameter extends AAXParameter<JSONArray> {
        private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(AAXParameter.LOGTAG);

        JSONArrayParameter(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: protected */
        public JSONArray parseFromString(String str) {
            try {
                return new JSONArray(str);
            } catch (JSONException unused) {
                this.logger.mo11020e("Unable to parse the following value into a JSONArray: %s", getName());
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public JSONArray getFromDebugProperties() {
            return parseFromString(DebugProperties.getInstance().getDebugPropertyAsString(getDebugName(), (String) null));
        }
    }

    static class JSONObjectParameter extends AAXParameter<JSONObject> {
        private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(AAXParameter.LOGTAG);

        JSONObjectParameter(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: protected */
        public JSONObject parseFromString(String str) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
                this.logger.mo11020e("Unable to parse the following value into a JSONObject: %s", getName());
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public JSONObject getFromDebugProperties() {
            return parseFromString(DebugProperties.getInstance().getDebugPropertyAsString(getDebugName(), (String) null));
        }
    }

    static class AppKeyParameter extends StringParameter {
        AppKeyParameter() {
            super("appId", DebugProperties.DEBUG_APPID);
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            return MobileAdsInfoStore.getInstance().getRegistrationInfo().getAppKey();
        }
    }

    static class PublisherKeywordsParameter extends JSONArrayParameter {
        PublisherKeywordsParameter() {
            super("pk", DebugProperties.DEBUG_PK);
        }

        /* access modifiers changed from: protected */
        public JSONArray applyPostParameterProcessing(JSONArray jSONArray, ParameterData parameterData) {
            HashSet<String> internalPublisherKeywords;
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            if (!(parameterData.adTargetingOptions == null || (internalPublisherKeywords = parameterData.adTargetingOptions.getInternalPublisherKeywords()) == null)) {
                Iterator<String> it = internalPublisherKeywords.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            return jSONArray;
        }
    }

    static class UserAgentParameter extends StringParameter {
        UserAgentParameter() {
            super("ua", DebugProperties.DEBUG_UA);
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            return MobileAdsInfoStore.getInstance().getDeviceInfo().getUserAgentString();
        }
    }

    static class SDKVersionParameter extends StringParameter {
        SDKVersionParameter() {
            super("adsdk", DebugProperties.DEBUG_VER);
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            return Version.getSDKVersion();
        }
    }

    static class GeoLocationParameter extends StringParameter {
        private final Configuration configuration;
        private final Context context;

        GeoLocationParameter() {
            this(Configuration.getInstance(), MobileAdsInfoStore.getInstance().getApplicationContext());
        }

        GeoLocationParameter(Configuration configuration2, Context context2) {
            super("geoloc", DebugProperties.DEBUG_GEOLOC);
            this.configuration = configuration2;
            this.context = context2;
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            Location location;
            if (!this.configuration.getBoolean(Configuration.ConfigOption.SEND_GEO) || !parameterData.getAdRequest().getAdTargetingOptions().isGeoLocationEnabled() || (location = new AdLocation(this.context).getLocation()) == null) {
                return null;
            }
            return location.getLatitude() + "," + location.getLongitude();
        }
    }

    static class DeviceInfoParameter extends JSONObjectParameter {
        DeviceInfoParameter() {
            super("dinfo", DebugProperties.DEBUG_DINFO);
        }

        /* access modifiers changed from: protected */
        public JSONObject getDerivedValue(ParameterData parameterData) {
            return MobileAdsInfoStore.getInstance().getDeviceInfo().toJsonObject(parameterData.adRequest.getOrientation());
        }
    }

    static class GDPRParameter extends JSONObjectParameter {
        static Context context;

        GDPRParameter() {
            super("gdpr", DebugProperties.DEBUG_GDPR);
        }

        /* access modifiers changed from: protected */
        public JSONObject getDerivedValue(ParameterData parameterData) {
            SharedPreferences defaultPreferences = ApplicationDefaultPreferences.getDefaultPreferences();
            if (defaultPreferences != null) {
                return new GDPRInfo(defaultPreferences).toJsonObject();
            }
            MobileAdsLoggerFactory.getLogger(getClass().getSimpleName()).mo10939e("Shared preferences were not set");
            return null;
        }
    }

    static class PackageInfoParameter extends JSONObjectParameter {
        PackageInfoParameter() {
            super("pkg", DebugProperties.DEBUG_PKG);
        }

        /* access modifiers changed from: protected */
        public JSONObject getDerivedValue(ParameterData parameterData) {
            return MobileAdsInfoStore.getInstance().getAppInfo().getPackageInfoJSON();
        }
    }

    static class TestParameter extends BooleanParameter {
        TestParameter() {
            super("isTest", DebugProperties.DEBUG_TEST);
        }

        /* access modifiers changed from: protected */
        public Boolean getDerivedValue(ParameterData parameterData) {
            return Settings.getInstance().getBoolean("testingEnabled", (Boolean) null);
        }
    }

    static class OptOutParameter extends BooleanParameter {
        OptOutParameter() {
            super("oo", DebugProperties.DEBUG_OPT_OUT);
        }

        /* access modifiers changed from: protected */
        public Boolean getDerivedValue(ParameterData parameterData) {
            if (parameterData.adRequest.getAdvertisingIdentifierInfo().hasAdvertisingIdentifier()) {
                return Boolean.valueOf(parameterData.adRequest.getAdvertisingIdentifierInfo().isLimitAdTrackingEnabled());
            }
            return null;
        }
    }

    static class SizeParameter extends StringParameter {
        SizeParameter() {
            super("sz", DebugProperties.DEBUG_SIZE);
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            return parameterData.loiSlot.getAdSlot().getRequestedAdSize().toString();
        }
    }

    static class SlotParameter extends StringParameter {
        SlotParameter() {
            super("slot", DebugProperties.DEBUG_SLOT);
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            return parameterData.adRequest.getOrientation();
        }
    }

    static class MaxSizeParameter extends StringParameter {
        MaxSizeParameter() {
            super("mxsz", DebugProperties.DEBUG_MXSZ);
        }

        /* access modifiers changed from: protected */
        public String getDerivedValue(ParameterData parameterData) {
            return parameterData.loiSlot.getAdSlot().getMaxSize();
        }
    }

    static class SlotIdParameter extends IntegerParameter {
        SlotIdParameter() {
            super("slotId", DebugProperties.DEBUG_SLOT_ID);
        }

        /* access modifiers changed from: protected */
        public Integer getDerivedValue(ParameterData parameterData) {
            return Integer.valueOf(parameterData.loiSlot.getAdSlot().getSlotNumber());
        }
    }

    static class FloorPriceParameter extends LongParameter {
        FloorPriceParameter() {
            super("ec", DebugProperties.DEBUG_ECPM);
        }

        /* access modifiers changed from: protected */
        public Long getDerivedValue(ParameterData parameterData) {
            if (parameterData.loiSlot.getAdTargetingOptions().hasFloorPrice()) {
                return Long.valueOf(parameterData.loiSlot.getAdTargetingOptions().getFloorPrice());
            }
            return null;
        }
    }

    static class SupportedMediaTypesParameter extends JSONArrayParameter {
        public SupportedMediaTypesParameter() {
            super("supportedMediaTypes", DebugProperties.DEBUG_SUPPORTED_MEDIA_TYPES);
        }

        /* access modifiers changed from: protected */
        public JSONArray getDerivedValue(ParameterData parameterData) {
            JSONArray jSONArray = new JSONArray();
            addDisplay(parameterData, jSONArray);
            addVideo(parameterData, jSONArray);
            return jSONArray;
        }

        private void addDisplay(ParameterData parameterData, JSONArray jSONArray) {
            boolean isDisplayAdsEnabled = parameterData.loiSlot.getAdTargetingOptions().isDisplayAdsEnabled();
            if (parameterData.advancedOptions.containsKey("enableDisplayAds")) {
                isDisplayAdsEnabled = Boolean.parseBoolean((String) parameterData.advancedOptions.remove("enableDisplayAds"));
            }
            if (isDisplayAdsEnabled) {
                jSONArray.put("DISPLAY");
            }
        }

        private void addVideo(ParameterData parameterData, JSONArray jSONArray) {
            if (new VideoAdsEnabledChecker(parameterData).isVideoAdsEnabled()) {
                jSONArray.put(ShareConstants.VIDEO_URL);
            }
        }
    }

    static class VideoOptionsParameter extends JSONObjectParameter {
        private static final int MAXIMUM_DURATION_DEFAULT = 30000;
        private static final int MINIMUM_DURATION_DEFAULT = 0;

        public VideoOptionsParameter() {
            super("video", DebugProperties.DEBUG_VIDEO_OPTIONS);
        }

        /* access modifiers changed from: protected */
        public JSONObject getDerivedValue(ParameterData parameterData) {
            if (!new VideoAdsEnabledChecker(parameterData).isVideoAdsEnabled()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (parameterData.advancedOptions.containsKey("minVideoAdDuration")) {
                i = new Parsers.IntegerParser().setDefaultValue(0).setParseErrorLogTag(AAXParameter.LOGTAG).setParseErrorLogMessage("The minVideoAdDuration advanced option could not be parsed properly.").parse((String) parameterData.advancedOptions.remove("minVideoAdDuration"));
            }
            JSONUtils.put(jSONObject, "minAdDuration", i);
            int i2 = 30000;
            if (parameterData.advancedOptions.containsKey("maxVideoAdDuration")) {
                i2 = new Parsers.IntegerParser().setDefaultValue(30000).setParseErrorLogTag(AAXParameter.LOGTAG).setParseErrorLogMessage("The maxVideoAdDuration advanced option could not be parsed properly.").parse((String) parameterData.advancedOptions.remove("maxVideoAdDuration"));
            }
            JSONUtils.put(jSONObject, "maxAdDuration", i2);
            return jSONObject;
        }
    }

    private static class VideoAdsEnabledChecker {
        private final ParameterData parameterData;

        public VideoAdsEnabledChecker(ParameterData parameterData2) {
            this.parameterData = parameterData2;
        }

        public boolean isVideoAdsEnabled() {
            if (!this.parameterData.loiSlot.getAdTargetingOptions().isVideoEnabledSettable()) {
                return false;
            }
            if (this.parameterData.advancedOptions.containsKey("enableVideoAds")) {
                String str = (String) this.parameterData.advancedOptions.remove("enableVideoAds");
                this.parameterData.temporaryOptions.put("enableVideoAds", str);
                return Boolean.parseBoolean(str);
            } else if (this.parameterData.temporaryOptions.containsKey("enableVideoAds")) {
                return Boolean.parseBoolean((String) this.parameterData.temporaryOptions.get("enableVideoAds"));
            } else {
                return this.parameterData.loiSlot.getAdTargetingOptions().isVideoAdsEnabled();
            }
        }
    }
}
