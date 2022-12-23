package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class AAXParameterGroup {
    public static final PublisherExtraParametersAAXParameterGroup PUBLISHER_EXTRA_PARAMETERS = new PublisherExtraParametersAAXParameterGroup();
    public static final UserIdAAXParameterGroup USER_ID = new UserIdAAXParameterGroup();

    public abstract void evaluate(AAXParameter.ParameterData parameterData, JSONObject jSONObject);

    AAXParameterGroup() {
    }

    static final class UserIdAAXParameterGroup extends AAXParameterGroup {
        private final SISDeviceIdentifierAAXParameter adIdParameter;
        private final DirectedIdAAXParameter directedIdParameter;
        private final AdvertisingIdentifierAAXParameter idfaParameter;
        private final SHA1UDIDAAXParameter sha1udidParameter;

        UserIdAAXParameterGroup() {
            this(AAXParameterGroupParameter.DIRECTED_ID, AAXParameterGroupParameter.ADVERTISING_IDENTIFIER, AAXParameterGroupParameter.SIS_DEVICE_IDENTIFIER, AAXParameterGroupParameter.SHA1_UDID);
        }

        UserIdAAXParameterGroup(DirectedIdAAXParameter directedIdAAXParameter, AdvertisingIdentifierAAXParameter advertisingIdentifierAAXParameter, SISDeviceIdentifierAAXParameter sISDeviceIdentifierAAXParameter, SHA1UDIDAAXParameter sHA1UDIDAAXParameter) {
            this.directedIdParameter = directedIdAAXParameter;
            this.idfaParameter = advertisingIdentifierAAXParameter;
            this.adIdParameter = sISDeviceIdentifierAAXParameter;
            this.sha1udidParameter = sHA1UDIDAAXParameter;
        }

        public void evaluate(AAXParameter.ParameterData parameterData, JSONObject jSONObject) {
            if (!this.directedIdParameter.evaluate(parameterData, jSONObject)) {
                if (!this.idfaParameter.evaluate(parameterData, jSONObject)) {
                    this.sha1udidParameter.evaluate(parameterData, jSONObject);
                }
                this.adIdParameter.evaluate(parameterData, jSONObject);
            }
        }
    }

    static final class PublisherExtraParametersAAXParameterGroup extends AAXParameterGroup {
        private static final String LOGTAG = PublisherExtraParametersAAXParameterGroup.class.getSimpleName();
        private final DebugProperties debugProperties;
        private final MobileAdsLogger logger;

        public PublisherExtraParametersAAXParameterGroup() {
            this(new MobileAdsLogger(new LogcatLogger()).withLogTag(LOGTAG), DebugProperties.getInstance());
        }

        PublisherExtraParametersAAXParameterGroup(MobileAdsLogger mobileAdsLogger, DebugProperties debugProperties2) {
            this.logger = mobileAdsLogger;
            this.debugProperties = debugProperties2;
        }

        public void evaluate(AAXParameter.ParameterData parameterData, JSONObject jSONObject) {
            JSONObject processPJInputOrDebugParameterIfPresent = processPJInputOrDebugParameterIfPresent(parameterData);
            if (processPJInputOrDebugParameterIfPresent == null) {
                processPJInputOrDebugParameterIfPresent = new JSONObject();
                JSONArray valueDoNotRemove = AAXParameter.PUBLISHER_ASINS.getValueDoNotRemove(parameterData);
                if (valueDoNotRemove != null && valueDoNotRemove.length() > 0) {
                    try {
                        processPJInputOrDebugParameterIfPresent.put("asins", valueDoNotRemove.join(",").replaceAll("\"", ""));
                    } catch (JSONException e) {
                        this.logger.mo11020e("Error putting asins into pj, continuing but not including asins with pj", e);
                    }
                }
                JSONArray jSONArray = (JSONArray) AAXParameter.PUBLISHER_KEYWORDS.getValueDoNotRemove(parameterData);
                if (jSONArray != null && jSONArray.length() > 0) {
                    try {
                        processPJInputOrDebugParameterIfPresent.put("tk", jSONArray);
                        processPJInputOrDebugParameterIfPresent.put(CampaignEx.JSON_KEY_AD_Q, jSONArray.join(" ").replaceAll("\"", ""));
                    } catch (JSONException e2) {
                        this.logger.mo11020e("Error putting either tk or q into pj, continuing but not including keywords with pj", e2);
                    }
                }
            }
            if (processPJInputOrDebugParameterIfPresent.length() > 0) {
                try {
                    jSONObject.put("pj", processPJInputOrDebugParameterIfPresent);
                } catch (JSONException e3) {
                    this.logger.mo11020e("Error storing pj created from asins and keywords, not including pj in request", e3);
                }
            }
        }

        private JSONObject processPJInputOrDebugParameterIfPresent(AAXParameter.ParameterData parameterData) {
            JSONObject jSONObject;
            Map<String, String> internalAdvancedOptions = parameterData.getInternalAdvancedOptions();
            if (internalAdvancedOptions != null && internalAdvancedOptions.containsKey("pj")) {
                String remove = internalAdvancedOptions.remove("pj");
                if (!StringUtils.isNullOrEmpty(remove)) {
                    try {
                        jSONObject = new JSONObject(remove);
                    } catch (JSONException e) {
                        this.logger.mo11020e("Error creating JSON object for pj from advanced option. Ignoring advanced option.", e);
                    }
                    return this.debugProperties.getDebugPropertyAsJSONObject(DebugProperties.DEBUG_PJ, jSONObject);
                }
            }
            jSONObject = null;
            return this.debugProperties.getDebugPropertyAsJSONObject(DebugProperties.DEBUG_PJ, jSONObject);
        }
    }
}
