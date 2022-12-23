package com.amazon.device.ads;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.MetricsCollector;
import com.amazon.device.ads.ThreadUtils;
import com.amazon.device.ads.WebRequest;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

class AdLoader {
    public static final int AD_FAILED = -1;
    public static final int AD_LOAD_DEFERRED = 1;
    public static final int AD_READY_TO_LOAD = 0;
    public static final String DISABLED_APP_SERVER_MESSAGE = "DISABLED_APP";
    private static final String LOGTAG = AdLoader.class.getSimpleName();
    private final AdRequest adRequest;
    private final Assets assets;
    private MetricsCollector.CompositeMetricsCollector compositeMetricsCollector;
    private final DebugProperties debugProperties;
    private AdError error;
    private final MobileAdsInfoStore infoStore;
    private final MobileAdsLogger logger;
    private final Map<Integer, AdSlot> slots;
    private final SystemTime systemTime;
    private final ThreadUtils.ThreadRunner threadRunner;
    private int timeout;

    public AdLoader(AdRequest adRequest2, Map<Integer, AdSlot> map) {
        this(adRequest2, map, ThreadUtils.getThreadRunner(), new SystemTime(), Assets.getInstance(), MobileAdsInfoStore.getInstance(), new MobileAdsLoggerFactory(), DebugProperties.getInstance());
    }

    AdLoader(AdRequest adRequest2, Map<Integer, AdSlot> map, ThreadUtils.ThreadRunner threadRunner2, SystemTime systemTime2, Assets assets2, MobileAdsInfoStore mobileAdsInfoStore, MobileAdsLoggerFactory mobileAdsLoggerFactory, DebugProperties debugProperties2) {
        this.timeout = 20000;
        this.error = null;
        this.compositeMetricsCollector = null;
        this.adRequest = adRequest2;
        this.slots = map;
        this.threadRunner = threadRunner2;
        this.systemTime = systemTime2;
        this.assets = assets2;
        this.infoStore = mobileAdsInfoStore;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.debugProperties = debugProperties2;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void beginFetchAd() {
        getCompositeMetricsCollector().stopMetric(Metrics.MetricType.AD_LOAD_LATENCY_LOADAD_TO_FETCH_THREAD_REQUEST_START);
        getCompositeMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_FETCH_THREAD_SPIN_UP);
        startFetchAdThread();
    }

    /* access modifiers changed from: protected */
    public void startFetchAdThread() {
        this.threadRunner.execute(new Runnable() {
            public void run() {
                AdLoader.this.fetchAd();
                AdLoader.this.beginFinalizeFetchAd();
            }
        }, ThreadUtils.ExecutionStyle.SCHEDULE, ThreadUtils.ExecutionThread.BACKGROUND_THREAD);
    }

    /* access modifiers changed from: private */
    public void beginFinalizeFetchAd() {
        this.threadRunner.execute(new Runnable() {
            public void run() {
                AdLoader.this.finalizeFetchAd();
            }
        }, ThreadUtils.ExecutionStyle.SCHEDULE, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }

    /* access modifiers changed from: protected */
    public void fetchAd() {
        getCompositeMetricsCollector().stopMetric(Metrics.MetricType.AD_LOAD_LATENCY_FETCH_THREAD_SPIN_UP);
        getCompositeMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_FETCH_THREAD_START_TO_AAX_GET_AD_START);
        if (!this.assets.ensureAssetsCreated()) {
            this.error = new AdError(AdError.ErrorCode.REQUEST_ERROR, "Unable to create the assets needed to display ads");
            this.logger.mo10939e("Unable to create the assets needed to display ads");
            setErrorForAllSlots(this.error);
            return;
        }
        try {
            WebRequest.WebResponse fetchResponseFromNetwork = fetchResponseFromNetwork();
            if (!fetchResponseFromNetwork.isHttpStatusCodeOK()) {
                String str = fetchResponseFromNetwork.getHttpStatusCode() + " - " + fetchResponseFromNetwork.getHttpStatus();
                this.error = new AdError(AdError.ErrorCode.NETWORK_ERROR, str);
                this.logger.mo10939e(str);
                setErrorForAllSlots(this.error);
                return;
            }
            JSONObject readAsJSON = fetchResponseFromNetwork.getResponseReader().readAsJSON();
            if (readAsJSON == null) {
                this.error = new AdError(AdError.ErrorCode.INTERNAL_ERROR, "Unable to parse response");
                this.logger.mo10939e("Unable to parse response");
                setErrorForAllSlots(this.error);
                return;
            }
            parseResponse(readAsJSON);
            getCompositeMetricsCollector().stopMetric(Metrics.MetricType.AD_LOAD_LATENCY_AAX_GET_AD_END_TO_FETCH_THREAD_END);
            getCompositeMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_FINALIZE_FETCH_SPIN_UP);
        } catch (AdFetchException e) {
            this.error = e.getAdError();
            this.logger.mo10939e(e.getAdError().getMessage());
            setErrorForAllSlots(this.error);
        }
    }

    private WebRequest getAdRequest() throws AdFetchException {
        getCompositeMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_CREATE_AAX_GET_AD_URL);
        WebRequest webRequest = this.adRequest.getWebRequest();
        getCompositeMetricsCollector().stopMetric(Metrics.MetricType.AD_LOAD_LATENCY_CREATE_AAX_GET_AD_URL);
        return webRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseResponse(org.json.JSONObject r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            com.amazon.device.ads.SystemTime r2 = r0.systemTime
            long r2 = r2.currentTimeMillis()
            java.lang.String r4 = "status"
            r5 = 0
            java.lang.String r4 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r1, r4, r5)
            java.util.HashSet r6 = new java.util.HashSet
            java.util.Map<java.lang.Integer, com.amazon.device.ads.AdSlot> r7 = r0.slots
            java.util.Set r7 = r7.keySet()
            r6.<init>(r7)
            com.amazon.device.ads.AdError r7 = r22.getAdError(r23)
            java.lang.String r8 = "errorCode"
            java.lang.String r9 = "No Ad Received"
            java.lang.String r8 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r1, r8, r9)
            com.amazon.device.ads.AdRequest r9 = r0.adRequest
            java.lang.String r10 = "instrPixelURL"
            java.lang.String r11 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r1, r10, r5)
            r9.setInstrumentationPixelURL(r11)
            if (r4 == 0) goto L_0x01c3
            java.lang.String r13 = "ok"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x01c3
            java.lang.String r4 = "ads"
            org.json.JSONArray r1 = com.amazon.device.ads.JSONUtils.getJSONArrayFromJSON(r1, r4)
            r4 = 0
        L_0x0044:
            int r13 = r1.length()
            if (r4 >= r13) goto L_0x01c3
            org.json.JSONObject r13 = com.amazon.device.ads.JSONUtils.getJSONObjectFromJSONArray(r1, r4)
            if (r13 != 0) goto L_0x0052
            goto L_0x01ae
        L_0x0052:
            r14 = -1
            java.lang.String r15 = "slotId"
            int r14 = com.amazon.device.ads.JSONUtils.getIntegerFromJSON(r13, r15, r14)
            java.util.Map<java.lang.Integer, com.amazon.device.ads.AdSlot> r15 = r0.slots
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            java.lang.Object r9 = r15.get(r9)
            com.amazon.device.ads.AdSlot r9 = (com.amazon.device.ads.AdSlot) r9
            if (r9 == 0) goto L_0x01ae
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r6.remove(r14)
            com.amazon.device.ads.AdRequest r14 = r0.adRequest
            java.lang.String r14 = r14.getInstrumentationPixelURL()
            java.lang.String r14 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r13, r10, r14)
            com.amazon.device.ads.AdData r15 = new com.amazon.device.ads.AdData
            r15.<init>()
            r15.setInstrumentationPixelUrl(r14)
            java.lang.String r14 = "impPixelURL"
            java.lang.String r14 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r13, r14, r5)
            r15.setImpressionPixelUrl(r14)
            com.amazon.device.ads.AdSize r14 = r9.getRequestedAdSize()
            boolean r14 = r14.isAuto()
            if (r14 == 0) goto L_0x009c
            com.amazon.device.ads.MetricsCollector r14 = r9.getMetricsCollector()
            com.amazon.device.ads.Metrics$MetricType r5 = com.amazon.device.ads.Metrics.MetricType.AD_COUNTER_AUTO_AD_SIZE
            r14.incrementMetric(r5)
        L_0x009c:
            java.lang.String r5 = "html"
            java.lang.String r14 = ""
            java.lang.String r5 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r13, r5, r14)
            java.lang.String r11 = "creativeTypes"
            org.json.JSONArray r11 = com.amazon.device.ads.JSONUtils.getJSONArrayFromJSON(r13, r11)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r23 = r1
            if (r11 == 0) goto L_0x00f1
            r17 = r10
            r1 = 0
        L_0x00b6:
            int r10 = r11.length()
            if (r1 >= r10) goto L_0x00ec
            r10 = 0
            int r16 = com.amazon.device.ads.JSONUtils.getIntegerFromJSONArray(r11, r1, r10)
            com.amazon.device.ads.AAXCreative r10 = com.amazon.device.ads.AAXCreative.getCreativeType(r16)
            if (r10 == 0) goto L_0x00cf
            r12.add(r10)
            r19 = r7
            r18 = r8
            goto L_0x00e5
        L_0x00cf:
            com.amazon.device.ads.MobileAdsLogger r10 = r0.logger
            r19 = r7
            r18 = r8
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r16 = 0
            r7[r16] = r8
            java.lang.String r8 = "%d is not a recognized creative type."
            r10.mo11028w(r8, r7)
        L_0x00e5:
            int r1 = r1 + 1
            r8 = r18
            r7 = r19
            goto L_0x00b6
        L_0x00ec:
            r19 = r7
            r18 = r8
            goto L_0x00f7
        L_0x00f1:
            r19 = r7
            r18 = r8
            r17 = r10
        L_0x00f7:
            boolean r1 = com.amazon.device.ads.AAXCreative.containsPrimaryCreativeType(r12)
            if (r1 != 0) goto L_0x0110
            com.amazon.device.ads.AdError r1 = new com.amazon.device.ads.AdError
            com.amazon.device.ads.AdError$ErrorCode r5 = com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR
            java.lang.String r7 = "No valid creative types found"
            r1.<init>(r5, r7)
            r9.setAdError(r1)
            com.amazon.device.ads.MobileAdsLogger r1 = r0.logger
            r1.mo10939e(r7)
            goto L_0x01b6
        L_0x0110:
            java.lang.String r1 = "size"
            java.lang.String r1 = com.amazon.device.ads.JSONUtils.getStringFromJSON(r13, r1, r14)
            if (r1 == 0) goto L_0x0135
            java.lang.String r7 = "9999x9999"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x0128
            java.lang.String r7 = "interstitial"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x0135
        L_0x0128:
            com.amazon.device.ads.AAXCreative r7 = com.amazon.device.ads.AAXCreative.INTERSTITIAL
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0135
            com.amazon.device.ads.AAXCreative r7 = com.amazon.device.ads.AAXCreative.INTERSTITIAL
            r12.add(r7)
        L_0x0135:
            com.amazon.device.ads.AAXCreative r7 = com.amazon.device.ads.AAXCreative.INTERSTITIAL
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0179
            if (r1 == 0) goto L_0x0146
            java.lang.String r7 = "x"
            java.lang.String[] r1 = r1.split(r7)
            goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            if (r1 == 0) goto L_0x0162
            int r7 = r1.length
            r8 = 2
            if (r7 == r8) goto L_0x014e
            goto L_0x0162
        L_0x014e:
            r7 = 0
            r8 = r1[r7]     // Catch:{ NumberFormatException -> 0x015e }
            int r10 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x015e }
            r7 = 1
            r1 = r1[r7]     // Catch:{ NumberFormatException -> 0x015f }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x015f }
            r7 = 0
            goto L_0x0165
        L_0x015e:
            r10 = 0
        L_0x015f:
            r1 = 0
            r7 = 1
            goto L_0x0165
        L_0x0162:
            r1 = 0
            r7 = 1
            r10 = 0
        L_0x0165:
            if (r7 == 0) goto L_0x017b
            com.amazon.device.ads.AdError r1 = new com.amazon.device.ads.AdError
            com.amazon.device.ads.AdError$ErrorCode r5 = com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR
            java.lang.String r7 = "Server returned an invalid ad size"
            r1.<init>(r5, r7)
            r9.setAdError(r1)
            com.amazon.device.ads.MobileAdsLogger r1 = r0.logger
            r1.mo10939e(r7)
            goto L_0x01b6
        L_0x0179:
            r1 = 0
            r10 = 0
        L_0x017b:
            java.lang.String r7 = "cacheTTL"
            r14 = r9
            r8 = -1
            long r20 = com.amazon.device.ads.JSONUtils.getLongFromJSON(r13, r7, r8)
            int r7 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0191
            r7 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r7
            long r7 = r2 + r20
            r15.setExpirationTimeMillis(r7)
        L_0x0191:
            com.amazon.device.ads.AdProperties r7 = new com.amazon.device.ads.AdProperties
            r7.<init>(r11)
            r15.setHeight(r1)
            r15.setWidth(r10)
            r15.setCreative(r5)
            r15.setCreativeTypes(r12)
            r15.setProperties(r7)
            r1 = 1
            r15.setFetched(r1)
            r9 = r14
            r9.setAdData(r15)
            goto L_0x01b6
        L_0x01ae:
            r23 = r1
            r19 = r7
            r18 = r8
            r17 = r10
        L_0x01b6:
            int r4 = r4 + 1
            r1 = r23
            r10 = r17
            r8 = r18
            r7 = r19
            r5 = 0
            goto L_0x0044
        L_0x01c3:
            r19 = r7
            r18 = r8
            java.util.Iterator r1 = r6.iterator()
        L_0x01cb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0212
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map<java.lang.Integer, com.amazon.device.ads.AdSlot> r3 = r0.slots
            java.lang.Object r3 = r3.get(r2)
            com.amazon.device.ads.AdSlot r3 = (com.amazon.device.ads.AdSlot) r3
            r4 = r19
            r3.setAdError(r4)
            com.amazon.device.ads.AdData r3 = new com.amazon.device.ads.AdData
            r3.<init>()
            com.amazon.device.ads.AdRequest r5 = r0.adRequest
            java.lang.String r5 = r5.getInstrumentationPixelURL()
            r3.setInstrumentationPixelUrl(r5)
            java.util.Map<java.lang.Integer, com.amazon.device.ads.AdSlot> r5 = r0.slots
            java.lang.Object r2 = r5.get(r2)
            com.amazon.device.ads.AdSlot r2 = (com.amazon.device.ads.AdSlot) r2
            r2.setAdData(r3)
            com.amazon.device.ads.MobileAdsLogger r2 = r0.logger
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r4.getMessage()
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r18
            java.lang.String r8 = "%s; code: %s"
            r2.mo11028w(r8, r5)
            goto L_0x01cb
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdLoader.parseResponse(org.json.JSONObject):void");
    }

    /* access modifiers changed from: protected */
    public AdError getAdError(JSONObject jSONObject) {
        int retrieveNoRetryTtlSeconds = retrieveNoRetryTtlSeconds(jSONObject);
        this.infoStore.setNoRetryTtl(retrieveNoRetryTtlSeconds);
        String stringFromJSON = JSONUtils.getStringFromJSON(jSONObject, "errorMessage", "No Ad Received");
        this.infoStore.setIsAppDisabled(stringFromJSON.equalsIgnoreCase(DISABLED_APP_SERVER_MESSAGE));
        String str = "Server Message: " + stringFromJSON;
        if (retrieveNoRetryTtlSeconds > 0) {
            getCompositeMetricsCollector().publishMetricInMilliseconds(Metrics.MetricType.AD_NO_RETRY_TTL_RECEIVED, (long) (retrieveNoRetryTtlSeconds * 1000));
        }
        if (retrieveNoRetryTtlSeconds > 0 && !this.infoStore.getIsAppDisabled()) {
            return new AdError(AdError.ErrorCode.NO_FILL, str + ". Try again in " + retrieveNoRetryTtlSeconds + " seconds");
        } else if (stringFromJSON.equals("no results")) {
            return new AdError(AdError.ErrorCode.NO_FILL, str);
        } else {
            return new AdError(AdError.ErrorCode.INTERNAL_ERROR, str);
        }
    }

    private void setErrorForAllSlots(AdError adError) {
        for (AdSlot adError2 : this.slots.values()) {
            adError2.setAdError(adError);
        }
    }

    /* access modifiers changed from: protected */
    public int retrieveNoRetryTtlSeconds(JSONObject jSONObject) {
        return this.debugProperties.getDebugPropertyAsInteger(DebugProperties.DEBUG_NORETRYTTL, Integer.valueOf(JSONUtils.getIntegerFromJSON(jSONObject, "noretryTTL", 0))).intValue();
    }

    /* access modifiers changed from: protected */
    public void finalizeFetchAd() {
        for (Map.Entry<Integer, AdSlot> value : this.slots.entrySet()) {
            AdSlot adSlot = (AdSlot) value.getValue();
            if (!adSlot.canBeUsed()) {
                this.logger.mo10942w("Ad object was destroyed before ad fetching could be finalized. Ad fetching has been aborted.");
            } else {
                adSlot.getMetricsCollector().stopMetric(Metrics.MetricType.AD_LOAD_LATENCY_FINALIZE_FETCH_SPIN_UP);
                if (!adSlot.isFetched()) {
                    adSlot.getMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_FINALIZE_FETCH_START_TO_FAILURE);
                    if (adSlot.getAdError() != null) {
                        adSlot.adFailed(adSlot.getAdError());
                    } else {
                        adSlot.adFailed(new AdError(AdError.ErrorCode.INTERNAL_ERROR, "Unknown error occurred."));
                    }
                } else {
                    adSlot.getMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_FINALIZE_FETCH_START_TO_RENDER_START);
                    adSlot.initializeAd();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public WebRequest.WebResponse fetchResponseFromNetwork() throws AdFetchException {
        AdError adError;
        WebRequest adRequest2 = getAdRequest();
        adRequest2.setMetricsCollector(getCompositeMetricsCollector());
        adRequest2.setServiceCallLatencyMetric(Metrics.MetricType.AAX_LATENCY_GET_AD);
        adRequest2.setTimeout(this.timeout);
        adRequest2.setDisconnectEnabled(false);
        getCompositeMetricsCollector().stopMetric(Metrics.MetricType.AD_LOAD_LATENCY_FETCH_THREAD_START_TO_AAX_GET_AD_START);
        getCompositeMetricsCollector().incrementMetric(Metrics.MetricType.TLS_ENABLED);
        try {
            WebRequest.WebResponse makeCall = adRequest2.makeCall();
            getCompositeMetricsCollector().startMetric(Metrics.MetricType.AD_LOAD_LATENCY_AAX_GET_AD_END_TO_FETCH_THREAD_END);
            return makeCall;
        } catch (WebRequest.WebRequestException e) {
            if (e.getStatus() != WebRequest.WebRequestStatus.NETWORK_FAILURE) {
                adError = e.getStatus() == WebRequest.WebRequestStatus.NETWORK_TIMEOUT ? new AdError(AdError.ErrorCode.NETWORK_TIMEOUT, "Connection to Ad Server timed out") : new AdError(AdError.ErrorCode.INTERNAL_ERROR, e.getMessage());
            } else {
                adError = new AdError(AdError.ErrorCode.NETWORK_ERROR, "Could not contact Ad Server");
            }
            throw new AdFetchException(adError);
        }
    }

    private MetricsCollector getCompositeMetricsCollector() {
        if (this.compositeMetricsCollector == null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, AdSlot> value : this.slots.entrySet()) {
                arrayList.add(((AdSlot) value.getValue()).getMetricsCollector());
            }
            this.compositeMetricsCollector = new MetricsCollector.CompositeMetricsCollector(arrayList);
        }
        return this.compositeMetricsCollector;
    }

    protected class AdFetchException extends Exception {
        private static final long serialVersionUID = 1;
        private final AdError adError;

        public AdFetchException(AdError adError2) {
            this.adError = adError2;
        }

        public AdFetchException(AdError adError2, Throwable th) {
            super(th);
            this.adError = adError2;
        }

        public AdError getAdError() {
            return this.adError;
        }
    }

    protected static class AdLoaderFactory {
        protected AdLoaderFactory() {
        }

        public AdLoader createAdLoader(AdRequest adRequest, Map<Integer, AdSlot> map) {
            return new AdLoader(adRequest, map);
        }
    }
}
