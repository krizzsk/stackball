package com.amazon.device.ads;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.WebRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class SISRequestor {
    protected static final String API_LEVEL_ENDPOINT = "/api3";
    private final Configuration configuration;
    private final SISRequestorCallback sisRequestorCallback;
    private final SISRequest[] sisRequests;
    private final WebRequest.WebRequestFactory webRequestFactory;

    public SISRequestor(SISRequestorCallback sISRequestorCallback, SISRequest... sISRequestArr) {
        this(new WebRequest.WebRequestFactory(), sISRequestorCallback, Configuration.getInstance(), sISRequestArr);
    }

    SISRequestor(WebRequest.WebRequestFactory webRequestFactory2, SISRequestorCallback sISRequestorCallback, Configuration configuration2, SISRequest... sISRequestArr) {
        this.webRequestFactory = webRequestFactory2;
        this.sisRequestorCallback = sISRequestorCallback;
        this.configuration = configuration2;
        this.sisRequests = sISRequestArr;
    }

    private String getSISEndPoint() {
        String string = this.configuration.getString(Configuration.ConfigOption.SIS_URL);
        return (string == null || string.isEmpty()) ? "s.amazon-adsystem.com" : string;
    }

    public void startCallSIS() {
        for (SISRequest callSIS : this.sisRequests) {
            callSIS(callSIS);
        }
        SISRequestorCallback sisRequestorCallback2 = getSisRequestorCallback();
        if (sisRequestorCallback2 != null) {
            sisRequestorCallback2.onSISCallComplete();
        }
    }

    private void callSIS(SISRequest sISRequest) {
        try {
            JSONObject readAsJSON = getWebRequest(sISRequest).makeCall().getResponseReader().readAsJSON();
            if (readAsJSON != null) {
                int integerFromJSON = JSONUtils.getIntegerFromJSON(readAsJSON, "rcode", 0);
                String stringFromJSON = JSONUtils.getStringFromJSON(readAsJSON, NotificationCompat.CATEGORY_MESSAGE, "");
                if (integerFromJSON == 1 || integerFromJSON == 103 || (integerFromJSON == 101 && stringFromJSON.equals("103"))) {
                    sISRequest.getLogger().mo11024i("Result - code: %d, msg: %s", Integer.valueOf(integerFromJSON), stringFromJSON);
                    sISRequest.onResponseReceived(readAsJSON);
                    return;
                }
                sISRequest.getLogger().mo11028w("Result - code: %d, msg: %s", Integer.valueOf(integerFromJSON), stringFromJSON);
            }
        } catch (WebRequest.WebRequestException unused) {
        }
    }

    private WebRequest getWebRequest(SISRequest sISRequest) {
        WebRequest createWebRequest = this.webRequestFactory.createWebRequest();
        createWebRequest.setExternalLogTag(sISRequest.getLogTag());
        createWebRequest.setHttpMethod(WebRequest.HttpMethod.POST);
        createWebRequest.setHost(getHostname());
        createWebRequest.setPath(getEndpoint(sISRequest));
        createWebRequest.enableLog(true);
        HashMap<String, String> postParameters = sISRequest.getPostParameters();
        if (postParameters != null) {
            for (Map.Entry next : postParameters.entrySet()) {
                createWebRequest.putPostParameter((String) next.getKey(), (String) next.getValue());
            }
        }
        createWebRequest.setQueryStringParameters(sISRequest.getQueryParameters());
        createWebRequest.setMetricsCollector(Metrics.getInstance().getMetricsCollector());
        createWebRequest.setServiceCallLatencyMetric(sISRequest.getCallMetricType());
        return createWebRequest;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r0.indexOf("/");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getHostname() {
        /*
            r3 = this;
            java.lang.String r0 = r3.getSISEndPoint()
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "/"
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 <= r2) goto L_0x0014
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.SISRequestor.getHostname():java.lang.String");
    }

    private String getEndpoint(SISRequest sISRequest) {
        String sISEndPoint = getSISEndPoint();
        if (sISEndPoint != null) {
            int indexOf = sISEndPoint.indexOf("/");
            sISEndPoint = indexOf > -1 ? sISEndPoint.substring(indexOf) : "";
        }
        return sISEndPoint + API_LEVEL_ENDPOINT + sISRequest.getPath();
    }

    private SISRequestorCallback getSisRequestorCallback() {
        return this.sisRequestorCallback;
    }

    static class SISRequestorFactory {
        SISRequestorFactory() {
        }

        public SISRequestor createSISRequestor(SISRequest... sISRequestArr) {
            return createSISRequestor((SISRequestorCallback) null, sISRequestArr);
        }

        public SISRequestor createSISRequestor(SISRequestorCallback sISRequestorCallback, SISRequest... sISRequestArr) {
            return new SISRequestor(sISRequestorCallback, sISRequestArr);
        }
    }
}
