package com.amazon.device.ads;

import com.amazon.device.ads.Metrics;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

abstract class WebRequest {
    private static final String CHARSET_KEY = "charset";
    public static final String CHARSET_UTF_16 = "UTF-16";
    public static final String CHARSET_UTF_8 = "UTF-8";
    public static final String CONTENT_TYPE_CSS = "text/css";
    public static final String CONTENT_TYPE_HTML = "text/html";
    public static final String CONTENT_TYPE_JAVASCRIPT = "application/javascript";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_PLAIN_TEXT = "text/plain";
    public static final int DEFAULT_PORT = -1;
    public static final int DEFAULT_TIMEOUT = 20000;
    private static final String HEADER_ACCEPT_KEY = "Accept";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String LOGTAG = WebRequest.class.getSimpleName();
    String acceptContentType;
    String charset;
    String contentType;
    /* access modifiers changed from: private */
    public boolean disconnectEnabled;
    protected final HashMap<String, String> headers;
    private HttpMethod httpMethod;
    boolean logRequestBodyEnabled;
    boolean logResponseEnabled;
    boolean logSessionIdEnabled;
    private String logTag;
    protected boolean logUrlEnabled;
    private final MobileAdsLogger logger;
    private MetricsCollector metricsCollector;
    private String nonSecureHost;
    private String path;
    private int port;
    protected HashMap<String, String> postParameters;
    protected QueryStringParameters queryStringParameters;
    String requestBody;
    protected boolean secure;
    private String secureHost;
    protected Metrics.MetricType serviceCallLatencyMetric;
    private int timeout;
    private String urlString;

    public enum WebRequestStatus {
        NETWORK_FAILURE,
        NETWORK_TIMEOUT,
        MALFORMED_URL,
        INVALID_CLIENT_PROTOCOL,
        UNSUPPORTED_ENCODING
    }

    /* access modifiers changed from: protected */
    public abstract void closeConnection();

    /* access modifiers changed from: protected */
    public abstract WebResponse doHttpNetworkCall(URL url) throws WebRequestException;

    /* access modifiers changed from: protected */
    public abstract String getSubLogTag();

    WebRequest() {
        this.requestBody = null;
        this.acceptContentType = null;
        this.contentType = null;
        this.charset = null;
        this.urlString = null;
        this.secureHost = null;
        this.nonSecureHost = null;
        this.path = null;
        this.port = -1;
        this.httpMethod = HttpMethod.GET;
        this.timeout = 20000;
        this.logRequestBodyEnabled = false;
        this.logResponseEnabled = false;
        this.logUrlEnabled = false;
        this.logSessionIdEnabled = false;
        this.secure = false;
        this.logTag = LOGTAG;
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(this.logTag);
        this.queryStringParameters = new QueryStringParameters();
        this.headers = new HashMap<>();
        this.postParameters = new HashMap<>();
        this.secure = Settings.getInstance().getBoolean("tlsEnabled", true);
        this.disconnectEnabled = true;
    }

    public void convertToJSONPostRequest() {
        setHttpMethod(HttpMethod.POST);
        putHeader("Accept", CONTENT_TYPE_JSON);
        putHeader("Content-Type", "application/json; charset=UTF-8");
    }

    public WebResponse makeCall() throws WebRequestException {
        if (ThreadUtils.isOnMainThread()) {
            this.logger.mo10939e("The network request should not be performed on the main thread.");
        }
        setContentTypeHeaders();
        String url = getUrl();
        try {
            URL createURL = createURL(url);
            writeMetricStart(this.serviceCallLatencyMetric);
            try {
                WebResponse doHttpNetworkCall = doHttpNetworkCall(createURL);
                writeMetricStop(this.serviceCallLatencyMetric);
                if (this.logResponseEnabled) {
                    this.logger.mo11019d("Response: %s %s", Integer.valueOf(doHttpNetworkCall.getHttpStatusCode()), doHttpNetworkCall.getHttpStatus());
                }
                return doHttpNetworkCall;
            } catch (WebRequestException e) {
                throw e;
            } catch (Throwable th) {
                writeMetricStop(this.serviceCallLatencyMetric);
                throw th;
            }
        } catch (MalformedURLException e2) {
            this.logger.mo11020e("Problem with URI syntax: %s", e2.getMessage());
            WebRequestStatus webRequestStatus = WebRequestStatus.MALFORMED_URL;
            throw new WebRequestException(webRequestStatus, "Could not construct URL from String " + url, e2);
        }
    }

    public void enableLogUrl(boolean z) {
        this.logUrlEnabled = z;
    }

    public void enableLogRequestBody(boolean z) {
        this.logRequestBodyEnabled = z;
    }

    public void enableLogResponse(boolean z) {
        this.logResponseEnabled = z;
    }

    public void enableLogSessionID(boolean z) {
        this.logSessionIdEnabled = z;
    }

    public void enableLog(boolean z) {
        enableLogUrl(z);
        enableLogRequestBody(z);
        enableLogResponse(z);
    }

    /* access modifiers changed from: protected */
    public void logUrl(String str) {
        if (this.logUrlEnabled) {
            this.logger.mo11019d("%s %s", getHttpMethod(), str);
        }
    }

    public String getQueryParameter(String str) {
        return this.queryStringParameters.get(str);
    }

    public void putUrlEncodedQueryParameter(String str, String str2) {
        this.queryStringParameters.putUrlEncoded(str, str2);
    }

    public String putUnencodedQueryParameter(String str, String str2) {
        return this.queryStringParameters.putUnencoded(str, str2);
    }

    public void setQueryStringParameters(QueryStringParameters queryStringParameters2) {
        this.queryStringParameters = queryStringParameters2;
    }

    public String getPostParameter(String str) {
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            return this.postParameters.get(str);
        }
        throw new IllegalArgumentException("The name must not be null or empty string.");
    }

    public void putPostParameter(String str, String str2) {
        if (StringUtils.isNullOrWhiteSpace(str)) {
            throw new IllegalArgumentException("The name must not be null or empty string.");
        } else if (str2 == null) {
            this.postParameters.remove(str);
        } else {
            this.postParameters.put(str, str2);
        }
    }

    public String getHeader(String str) {
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            return this.headers.get(str);
        }
        throw new IllegalArgumentException("The name must not be null or empty string.");
    }

    public void putHeader(String str, String str2) {
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            this.headers.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("The name must not be null or empty string.");
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod2) {
        if (httpMethod2 != null) {
            this.httpMethod = httpMethod2;
            return;
        }
        throw new IllegalArgumentException("The httpMethod must not be null.");
    }

    public String getHost() {
        return getUseSecure() ? this.secureHost : this.nonSecureHost;
    }

    public void setHost(String str) {
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            this.secureHost = str;
            this.nonSecureHost = str;
            return;
        }
        throw new IllegalArgumentException("The host must not be null.");
    }

    public void setSecureHost(String str) {
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            this.secureHost = str;
            return;
        }
        throw new IllegalArgumentException("The host must not be null.");
    }

    public void setNonSecureHost(String str) {
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            this.nonSecureHost = str;
            return;
        }
        throw new IllegalArgumentException("The host must not be null.");
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        if (str.charAt(0) != '/') {
            this.path = '/' + str;
            return;
        }
        this.path = str;
    }

    public boolean getUseSecure() {
        return DebugProperties.getInstance().getDebugPropertyAsBoolean(DebugProperties.DEBUG_USESECURE, Boolean.valueOf(this.secure)).booleanValue();
    }

    public void setUseSecure(boolean z) {
        this.secure = z;
    }

    public void setUrlString(String str) {
        if (str != null && getUseSecure() && str.startsWith("http:")) {
            str = str.replaceFirst("http", "https");
        }
        this.urlString = str;
    }

    public String getUrlString() {
        return this.urlString;
    }

    public void setRequestBodyString(String str) {
        this.requestBody = str;
    }

    public String getRequestBodyString() {
        return this.requestBody;
    }

    public String getRequestBody() {
        if (getRequestBodyString() != null) {
            return getRequestBodyString();
        }
        if (this.postParameters.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : this.postParameters.entrySet()) {
            sb.append((String) next.getKey());
            sb.append('=');
            sb.append((String) next.getValue());
            sb.append(";\n");
        }
        return sb.toString();
    }

    public void setAcceptContentType(String str) {
        this.acceptContentType = this.contentType;
    }

    public String getAcceptContentType() {
        return this.acceptContentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setCharset(String str) {
        this.charset = str;
    }

    public String getCharset() {
        return this.charset;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void setMetricsCollector(MetricsCollector metricsCollector2) {
        this.metricsCollector = metricsCollector2;
    }

    public void setServiceCallLatencyMetric(Metrics.MetricType metricType) {
        this.serviceCallLatencyMetric = metricType;
    }

    public void setAdditionalQueryParamsString(String str) {
        this.queryStringParameters.setRawAppendage(str);
    }

    public void setExternalLogTag(String str) {
        if (str == null) {
            this.logTag = LOGTAG + " " + getSubLogTag();
        } else {
            this.logTag = str + " " + LOGTAG + " " + getSubLogTag();
        }
        this.logger.withLogTag(this.logTag);
    }

    public boolean getDisconnectEnabled() {
        return this.disconnectEnabled;
    }

    public void setDisconnectEnabled(boolean z) {
        this.disconnectEnabled = z;
    }

    /* access modifiers changed from: protected */
    public MobileAdsLogger getLogger() {
        return this.logger;
    }

    /* access modifiers changed from: private */
    public String getLogTag() {
        return this.logTag;
    }

    /* access modifiers changed from: protected */
    public void setContentTypeHeaders() {
        if (this.acceptContentType != null) {
            putHeader("Accept", this.contentType);
        }
        String str = this.contentType;
        if (str != null) {
            if (this.charset != null) {
                str = str + "; charset=" + this.charset;
            }
            putHeader("Content-Type", str);
        }
    }

    /* access modifiers changed from: protected */
    public void writeMetricStart(Metrics.MetricType metricType) {
        MetricsCollector metricsCollector2;
        if (metricType != null && (metricsCollector2 = this.metricsCollector) != null) {
            metricsCollector2.startMetric(metricType);
        }
    }

    /* access modifiers changed from: protected */
    public void writeMetricStop(Metrics.MetricType metricType) {
        MetricsCollector metricsCollector2;
        if (metricType != null && (metricsCollector2 = this.metricsCollector) != null) {
            metricsCollector2.stopMetric(metricType);
        }
    }

    /* access modifiers changed from: protected */
    public URI createUri() throws URISyntaxException, MalformedURLException {
        return new URL(getUrlString()).toURI();
    }

    /* access modifiers changed from: protected */
    public URI createURI(String str) throws MalformedURLException, URISyntaxException {
        return createURI(createURL(str));
    }

    /* access modifiers changed from: protected */
    public URI createURI(URL url) throws URISyntaxException {
        return url.toURI();
    }

    /* access modifiers changed from: protected */
    public URL createURL(String str) throws MalformedURLException {
        return new URL(str);
    }

    /* access modifiers changed from: protected */
    public void appendQuery(StringBuilder sb) {
        this.queryStringParameters.append(sb);
    }

    /* access modifiers changed from: protected */
    public String getScheme() {
        return getUseSecure() ? "https" : "http";
    }

    public String toString() {
        return getUrl();
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        String str = this.urlString;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(getScheme());
        sb.append("://");
        sb.append(getHost());
        if (getPort() != -1) {
            sb.append(CertificateUtil.DELIMITER);
            sb.append(getPort());
        }
        sb.append(getPath());
        appendQuery(sb);
        return sb.toString();
    }

    public enum HttpMethod {
        GET("GET"),
        POST("POST");
        
        private final String methodString;

        private HttpMethod(String str) {
            this.methodString = str;
        }

        public String toString() {
            return this.methodString;
        }
    }

    public class WebResponse {
        private String httpStatus;
        private int httpStatusCode;
        private WebRequestInputStream inputStream;

        protected WebResponse() {
        }

        /* access modifiers changed from: protected */
        public void setInputStream(InputStream inputStream2) {
            this.inputStream = new WebRequestInputStream(inputStream2);
        }

        public ResponseReader getResponseReader() {
            ResponseReader responseReader = new ResponseReader(this.inputStream);
            responseReader.enableLog(WebRequest.this.logResponseEnabled);
            responseReader.setExternalLogTag(WebRequest.this.getLogTag());
            return responseReader;
        }

        public int getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /* access modifiers changed from: protected */
        public void setHttpStatusCode(int i) {
            this.httpStatusCode = i;
        }

        public boolean isHttpStatusCodeOK() {
            return getHttpStatusCode() == 200;
        }

        public String getHttpStatus() {
            return this.httpStatus;
        }

        /* access modifiers changed from: protected */
        public void setHttpStatus(String str) {
            this.httpStatus = str;
        }
    }

    public class WebRequestException extends Exception {
        private static final long serialVersionUID = -4980265484926465548L;
        private final WebRequestStatus status;

        protected WebRequestException(WebRequestStatus webRequestStatus, String str, Throwable th) {
            super(str, th);
            this.status = webRequestStatus;
        }

        protected WebRequestException(WebRequest webRequest, WebRequestStatus webRequestStatus, String str) {
            this(webRequestStatus, str, (Throwable) null);
        }

        public WebRequestStatus getStatus() {
            return this.status;
        }
    }

    public static class WebRequestFactory {
        public WebRequest createWebRequest() {
            return new HttpURLConnectionWebRequest();
        }

        public WebRequest createJSONGetWebRequest() {
            WebRequest createWebRequest = createWebRequest();
            createWebRequest.setHttpMethod(HttpMethod.GET);
            createWebRequest.putHeader("Accept", WebRequest.CONTENT_TYPE_JSON);
            return createWebRequest;
        }

        public WebRequest createJSONPostWebRequest() {
            WebRequest createWebRequest = createWebRequest();
            createWebRequest.convertToJSONPostRequest();
            return createWebRequest;
        }
    }

    static class QueryStringParameters {
        private final HashMap<String, String> params = new HashMap<>();
        private String rawAppendage;

        QueryStringParameters() {
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.params.size();
        }

        /* access modifiers changed from: package-private */
        public void setRawAppendage(String str) {
            this.rawAppendage = str;
        }

        /* access modifiers changed from: package-private */
        public void putUrlEncoded(String str, boolean z) {
            putUrlEncoded(str, Boolean.toString(z));
        }

        /* access modifiers changed from: package-private */
        public void putUrlEncodedIfNotNullOrEmpty(String str, String str2) {
            putUrlEncodedIfTrue(str, str2, !StringUtils.isNullOrEmpty(str2));
        }

        /* access modifiers changed from: package-private */
        public void putUrlEncodedIfTrue(String str, String str2, boolean z) {
            if (z) {
                putUrlEncoded(str, str2);
            }
        }

        /* access modifiers changed from: package-private */
        public String get(String str) {
            if (!StringUtils.isNullOrWhiteSpace(str)) {
                return this.params.get(str);
            }
            throw new IllegalArgumentException("The name must not be null or empty string.");
        }

        /* access modifiers changed from: package-private */
        public void putUrlEncoded(String str, String str2) {
            if (StringUtils.isNullOrWhiteSpace(str)) {
                throw new IllegalArgumentException("The name must not be null or empty string.");
            } else if (str2 == null) {
                this.params.remove(str);
            } else {
                this.params.put(str, str2);
            }
        }

        /* access modifiers changed from: package-private */
        public String putUnencoded(String str, String str2) {
            WebUtils2 webUtils2 = new WebUtils2();
            String uRLEncodedString = webUtils2.getURLEncodedString(str);
            putUrlEncoded(uRLEncodedString, webUtils2.getURLEncodedString(str2));
            return uRLEncodedString;
        }

        /* access modifiers changed from: package-private */
        public void append(StringBuilder sb) {
            if (size() != 0 || !StringUtils.isNullOrEmpty(this.rawAppendage)) {
                sb.append("?");
                boolean z = true;
                for (Map.Entry next : this.params.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append((String) next.getKey());
                    sb.append("=");
                    sb.append((String) next.getValue());
                }
                String str = this.rawAppendage;
                if (str != null && !str.equals("")) {
                    if (size() != 0) {
                        sb.append("&");
                    }
                    sb.append(this.rawAppendage);
                }
            }
        }
    }

    class WebRequestInputStream extends InputStream {
        private final InputStream decoratedStream;

        public WebRequestInputStream(InputStream inputStream) {
            this.decoratedStream = inputStream;
        }

        public int read() throws IOException {
            return this.decoratedStream.read();
        }

        public void close() throws IOException {
            this.decoratedStream.close();
            if (WebRequest.this.disconnectEnabled) {
                WebRequest.this.closeConnection();
            }
        }
    }
}
