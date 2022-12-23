package com.amazon.device.ads;

import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.MetricsCollector;
import com.amazon.device.ads.WebRequest;
import com.appsflyer.share.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class AdMetrics {
    public static final String LOGTAG = AdMetrics.class.getSimpleName();
    private MetricsCollector globalMetrics;
    private final MobileAdsLogger logger;
    private final MobileAdsInfoStore mobileAdsInfoStore;
    private final Metrics.MetricsSubmitter submitter;
    private final WebRequest.WebRequestFactory webRequestFactory;

    public AdMetrics(Metrics.MetricsSubmitter metricsSubmitter) {
        this(metricsSubmitter, MobileAdsInfoStore.getInstance());
    }

    AdMetrics(Metrics.MetricsSubmitter metricsSubmitter, MobileAdsInfoStore mobileAdsInfoStore2) {
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
        this.webRequestFactory = new WebRequest.WebRequestFactory();
        this.submitter = metricsSubmitter;
        this.mobileAdsInfoStore = mobileAdsInfoStore2;
    }

    private String getAaxUrlAndResetAdMetrics() {
        String str = this.submitter.getInstrumentationPixelUrl() + WebUtils.getURLEncodedString(getAaxJson());
        this.submitter.resetMetricsCollector();
        return str;
    }

    public WebRequest getAaxWebRequestAndResetAdMetrics() {
        WebRequest createWebRequest = this.webRequestFactory.createWebRequest();
        createWebRequest.setUrlString(getAaxUrlAndResetAdMetrics());
        return createWebRequest;
    }

    public boolean canSubmit() {
        String instrumentationPixelUrl = this.submitter.getInstrumentationPixelUrl();
        if (instrumentationPixelUrl == null || instrumentationPixelUrl.equals("")) {
            return false;
        }
        if (this.mobileAdsInfoStore.getRegistrationInfo().getAppKey() != null) {
            return true;
        }
        this.logger.mo10938d("Not submitting metrics because the AppKey is not set.");
        return false;
    }

    public void addGlobalMetrics(MetricsCollector metricsCollector) {
        this.globalMetrics = metricsCollector;
    }

    /* access modifiers changed from: protected */
    public String getAaxJson() {
        JSONObject jSONObject = new JSONObject();
        JSONUtils.put(jSONObject, Constants.URL_CAMPAIGN, "msdk");
        JSONUtils.put(jSONObject, "v", Version.getRawSDKVersion());
        addMetricsToJSON(jSONObject, this.submitter.getMetricsCollector());
        addMetricsToJSON(jSONObject, this.globalMetrics);
        String jSONObject2 = jSONObject.toString();
        return jSONObject2.substring(1, jSONObject2.length() - 1);
    }

    protected static void addMetricsToJSON(JSONObject jSONObject, MetricsCollector metricsCollector) {
        int i;
        if (metricsCollector != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String adTypeMetricTag = metricsCollector.getAdTypeMetricTag();
            if (adTypeMetricTag != null) {
                adTypeMetricTag = adTypeMetricTag + "_";
            }
            for (MetricsCollector.MetricHit metricHit : (MetricsCollector.MetricHit[]) metricsCollector.getMetricHits().toArray(new MetricsCollector.MetricHit[metricsCollector.getMetricHits().size()])) {
                String aaxName = metricHit.metric.getAaxName();
                if (adTypeMetricTag != null && metricHit.metric.isAdTypeSpecific()) {
                    aaxName = adTypeMetricTag + aaxName;
                }
                if (metricHit instanceof MetricsCollector.MetricHitStartTime) {
                    hashMap.put(metricHit.metric, Long.valueOf(((MetricsCollector.MetricHitStartTime) metricHit).startTime));
                } else if (metricHit instanceof MetricsCollector.MetricHitStopTime) {
                    MetricsCollector.MetricHitStopTime metricHitStopTime = (MetricsCollector.MetricHitStopTime) metricHit;
                    Long l = (Long) hashMap.remove(metricHit.metric);
                    if (l != null) {
                        JSONUtils.put(jSONObject, aaxName, (JSONUtils.getLongFromJSON(jSONObject, aaxName, 0) + metricHitStopTime.stopTime) - l.longValue());
                    }
                } else if (metricHit instanceof MetricsCollector.MetricHitTotalTime) {
                    JSONUtils.put(jSONObject, aaxName, ((MetricsCollector.MetricHitTotalTime) metricHit).totalTime);
                } else if (metricHit instanceof MetricsCollector.MetricHitIncrement) {
                    MetricsCollector.MetricHitIncrement metricHitIncrement = (MetricsCollector.MetricHitIncrement) metricHit;
                    Integer num = (Integer) hashMap2.get(metricHit.metric);
                    if (num == null) {
                        i = metricHitIncrement.increment;
                    } else {
                        i = metricHitIncrement.increment + num.intValue();
                    }
                    hashMap2.put(metricHit.metric, Integer.valueOf(i));
                } else if (metricHit instanceof MetricsCollector.MetricHitString) {
                    JSONUtils.put(jSONObject, aaxName, ((MetricsCollector.MetricHitString) metricHit).text);
                }
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                String aaxName2 = ((Metrics.MetricType) entry.getKey()).getAaxName();
                if (adTypeMetricTag != null && ((Metrics.MetricType) entry.getKey()).isAdTypeSpecific()) {
                    aaxName2 = adTypeMetricTag + aaxName2;
                }
                JSONUtils.put(jSONObject, aaxName2, ((Integer) entry.getValue()).intValue());
            }
        }
    }
}
