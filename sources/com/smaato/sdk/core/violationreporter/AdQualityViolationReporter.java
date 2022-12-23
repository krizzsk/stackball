package com.smaato.sdk.core.violationreporter;

import com.facebook.appevents.AppEventsConstants;
import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.NetworkHttpRequest;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.NetworkResponse;
import com.smaato.sdk.core.network.execution.NetworkLayerException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.violationreporter.Report;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AdQualityViolationReporter {
    private final AdQualityViolationReportMapper adQualityViolationReportMapper;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final NetworkClient networkClient;
    private final NetworkClient.Listener networkClientListener = new NetworkClient.Listener() {
        public void onRequestSuccess(NetworkClient networkClient, Task task, NetworkResponse networkResponse) {
            int responseCode = networkResponse.getResponseCode();
            if (responseCode == 200) {
                AdQualityViolationReporter.this.logger.debug(LogDomain.CORE, "ad quality violation report request has been accepted by server", new Object[0]);
                return;
            }
            AdQualityViolationReporter.this.logger.error(LogDomain.CORE, "ad quality violation report request has not been accepted, response code: %d", Integer.valueOf(responseCode));
        }

        public void onRequestError(NetworkClient networkClient, Task task, NetworkLayerException networkLayerException) {
            AdQualityViolationReporter.this.logger.error(LogDomain.CORE, "ad quality violation report request failed: %s", networkLayerException);
        }
    };
    private final String reportingApiUrl;
    private final String userAgent;

    public AdQualityViolationReporter(Logger logger2, NetworkClient networkClient2, AdQualityViolationReportMapper adQualityViolationReportMapper2, String str, String str2) {
        this.logger = logger2;
        this.networkClient = (NetworkClient) Objects.requireNonNull(networkClient2);
        this.adQualityViolationReportMapper = (AdQualityViolationReportMapper) Objects.requireNonNull(adQualityViolationReportMapper2);
        this.reportingApiUrl = (String) Objects.requireNonNull(str);
        this.userAgent = (String) Objects.requireNonNull(str2);
        this.networkClient.setListener(this.networkClientListener);
    }

    public final void reportAdViolation(String str, SomaApiContext somaApiContext, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        reportAdViolation(str, somaApiContext, str2, "");
    }

    public final void reportAdViolation(String str, SomaApiContext somaApiContext, String str2, String str3) {
        try {
            AdQualityViolationReportMapper adQualityViolationReportMapper2 = this.adQualityViolationReportMapper;
            long currentTimeMillis = System.currentTimeMillis();
            ApiAdRequest apiAdRequest = somaApiContext.getApiAdRequest();
            Map<String, List<String>> responseHeaders = somaApiContext.getApiAdResponse().getResponseHeaders();
            String extractHeaderMultiValue = adQualityViolationReportMapper2.headerUtils.extractHeaderMultiValue(responseHeaders, "X-SMT-SessionId");
            if (extractHeaderMultiValue == null) {
                adQualityViolationReportMapper2.logger.warning(LogDomain.CORE, "header %s is not found in SOMA response", "X-SMT-SessionId");
            }
            String extractHeaderMultiValue2 = adQualityViolationReportMapper2.headerUtils.extractHeaderMultiValue(responseHeaders, "SCI");
            if (extractHeaderMultiValue2 == null) {
                adQualityViolationReportMapper2.logger.warning(LogDomain.CORE, "header %s is not found in SOMA response", "SCI");
            }
            Report.Builder timestamp = new Report.Builder().setType(str).setSessionId(extractHeaderMultiValue).setOriginalUrl(str3).setViolatedUrl(str2).setTimestamp(String.valueOf(currentTimeMillis));
            if (extractHeaderMultiValue2 == null) {
                extractHeaderMultiValue2 = "";
            }
            String jSONObject = timestamp.setSci(extractHeaderMultiValue2).setPublisher(apiAdRequest.getPublisherId()).setAdSpace(apiAdRequest.getAdSpaceId()).setApiVersion("").setBundleId(apiAdRequest.getBundle()).setError("").setPlatform("android").setSdkVersion(apiAdRequest.getClient()).setApiKey("").setCreativeId("").setAsnId(AppEventsConstants.EVENT_PARAM_VALUE_NO).build().toJson().toString();
            this.logger.debug(LogDomain.CORE, "going to send: %s", jSONObject);
            try {
                byte[] bytes = jSONObject.getBytes("UTF-8");
                NetworkHttpRequest.Builder readTimeout = new NetworkHttpRequest.Builder().setUrl(this.reportingApiUrl).setMethod(NetworkRequest.Method.POST).setConnectionTimeout(15000).setReadTimeout(15000);
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", Collections.singletonList("application/json; charset=utf-8"));
                hashMap.put("User-Agent", Collections.singletonList(this.userAgent));
                this.networkClient.performNetworkRequest(readTimeout.setHeaders(hashMap).setBody(bytes).build(), (SomaApiContext) null).start();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            this.logger.error(LogDomain.CORE, "failed to create ad quality violation report", e2);
        }
    }
}
