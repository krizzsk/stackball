package com.amazon.device.ads;

import com.amazon.device.ads.WebRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;

class HttpURLConnectionWebRequest extends WebRequest {
    private static final String LOGTAG = HttpURLConnectionWebRequest.class.getSimpleName();
    private HttpURLConnection connection;

    HttpURLConnectionWebRequest() {
    }

    /* access modifiers changed from: protected */
    public WebRequest.WebResponse doHttpNetworkCall(URL url) throws WebRequest.WebRequestException {
        if (this.connection != null) {
            closeConnection();
        }
        try {
            HttpURLConnection openConnection = openConnection(url);
            this.connection = openConnection;
            setupRequestProperties(openConnection);
            try {
                this.connection.connect();
                return prepareResponse(this.connection);
            } catch (SocketTimeoutException e) {
                getLogger().mo11020e("Socket timed out while connecting to URL: %s", e.getMessage());
                throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.NETWORK_TIMEOUT, "Socket timed out while connecting to URL", e);
            } catch (Exception e2) {
                getLogger().mo11020e("Problem while connecting to URL: %s", e2.getMessage());
                throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.NETWORK_FAILURE, "Probem while connecting to URL", e2);
            }
        } catch (IOException e3) {
            getLogger().mo11020e("Problem while opening the URL connection: %s", e3.getMessage());
            throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.NETWORK_FAILURE, "Problem while opening the URL connection", e3);
        }
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* access modifiers changed from: protected */
    public void closeConnection() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.connection = null;
        }
    }

    /* access modifiers changed from: protected */
    public void setupRequestProperties(HttpURLConnection httpURLConnection) throws WebRequest.WebRequestException {
        try {
            httpURLConnection.setRequestMethod(getHttpMethod().name());
            for (Map.Entry entry : this.headers.entrySet()) {
                if (entry.getValue() != null && !((String) entry.getValue()).equals("")) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.setConnectTimeout(getTimeout());
            httpURLConnection.setReadTimeout(getTimeout());
            logUrl(httpURLConnection.getURL().toString());
            int i = C09401.$SwitchMap$com$amazon$device$ads$WebRequest$HttpMethod[getHttpMethod().ordinal()];
            if (i == 1) {
                httpURLConnection.setDoOutput(false);
            } else if (i == 2) {
                httpURLConnection.setDoOutput(true);
                writePostBody(httpURLConnection);
            }
        } catch (ProtocolException e) {
            getLogger().mo11020e("Invalid client protocol: %s", e.getMessage());
            throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.INVALID_CLIENT_PROTOCOL, "Invalid client protocol", e);
        }
    }

    /* renamed from: com.amazon.device.ads.HttpURLConnectionWebRequest$1 */
    static /* synthetic */ class C09401 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$WebRequest$HttpMethod;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.amazon.device.ads.WebRequest$HttpMethod[] r0 = com.amazon.device.ads.WebRequest.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$WebRequest$HttpMethod = r0
                com.amazon.device.ads.WebRequest$HttpMethod r1 = com.amazon.device.ads.WebRequest.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$WebRequest$HttpMethod     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.WebRequest$HttpMethod r1 = com.amazon.device.ads.WebRequest.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.HttpURLConnectionWebRequest.C09401.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0 A[SYNTHETIC, Splitter:B:42:0x00e0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writePostBody(java.net.HttpURLConnection r10) throws com.amazon.device.ads.WebRequest.WebRequestException {
        /*
            r9 = this;
            java.lang.String r0 = "Problem while closing output stream writer for request body"
            java.lang.String r1 = "Problem while closing output stream writer for request body: %s"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.requestBody
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r9.requestBody
            r2.append(r3)
            goto L_0x005d
        L_0x0013:
            java.util.HashMap r3 = r9.postParameters
            if (r3 == 0) goto L_0x005d
            java.util.HashMap r3 = r9.postParameters
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x005d
            java.util.HashMap r3 = r9.postParameters
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0029:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "&"
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r2.append(r6)
            java.lang.String r6 = "="
            r2.append(r6)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.amazon.device.ads.WebUtils.getURLEncodedString(r4)
            r2.append(r4)
            r2.append(r5)
            goto L_0x0029
        L_0x0056:
            int r3 = r2.lastIndexOf(r5)
            r2.deleteCharAt(r3)
        L_0x005d:
            boolean r3 = r9.logRequestBodyEnabled
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x008b
            java.lang.String r3 = r9.getRequestBody()
            if (r3 == 0) goto L_0x008b
            boolean r3 = r9.logSessionIdEnabled
            if (r3 != 0) goto L_0x007a
            java.lang.String r3 = r9.getRequestBody()
            java.lang.String r6 = ",\\s*\"\\s*sessionId\\s*\"\\s*:\\s*\".*?\"|\\s*\"\\s*sessionId\\s*\"\\s*:\\s*\".*?\"\\s*,*"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.replaceAll(r6, r7)
            goto L_0x007e
        L_0x007a:
            java.lang.String r3 = r9.getRequestBody()
        L_0x007e:
            com.amazon.device.ads.MobileAdsLogger r6 = r9.getLogger()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r4] = r3
            java.lang.String r3 = "Request Body: %s"
            r6.mo11019d(r3, r7)
        L_0x008b:
            r3 = 0
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00c2 }
            java.io.OutputStream r10 = r10.getOutputStream()     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r10, r7)     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r6.write(r10)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r6.close()     // Catch:{ IOException -> 0x00a2 }
            return
        L_0x00a2:
            r10 = move-exception
            com.amazon.device.ads.MobileAdsLogger r2 = r9.getLogger()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r5 = r10.getMessage()
            r3[r4] = r5
            r2.mo11020e(r1, r3)
            com.amazon.device.ads.WebRequest$WebRequestException r1 = new com.amazon.device.ads.WebRequest$WebRequestException
            com.amazon.device.ads.WebRequest$WebRequestStatus r2 = com.amazon.device.ads.WebRequest.WebRequestStatus.NETWORK_FAILURE
            r1.<init>(r2, r0, r10)
            throw r1
        L_0x00ba:
            r10 = move-exception
            r3 = r6
            goto L_0x00de
        L_0x00bd:
            r10 = move-exception
            r3 = r6
            goto L_0x00c3
        L_0x00c0:
            r10 = move-exception
            goto L_0x00de
        L_0x00c2:
            r10 = move-exception
        L_0x00c3:
            com.amazon.device.ads.MobileAdsLogger r2 = r9.getLogger()     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = "Problem while creating output steam for request body: %s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c0 }
            java.lang.String r8 = r10.getMessage()     // Catch:{ all -> 0x00c0 }
            r7[r4] = r8     // Catch:{ all -> 0x00c0 }
            r2.mo11020e(r6, r7)     // Catch:{ all -> 0x00c0 }
            com.amazon.device.ads.WebRequest$WebRequestException r2 = new com.amazon.device.ads.WebRequest$WebRequestException     // Catch:{ all -> 0x00c0 }
            com.amazon.device.ads.WebRequest$WebRequestStatus r6 = com.amazon.device.ads.WebRequest.WebRequestStatus.NETWORK_FAILURE     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = "Problem while creating output steam for request body"
            r2.<init>(r6, r7, r10)     // Catch:{ all -> 0x00c0 }
            throw r2     // Catch:{ all -> 0x00c0 }
        L_0x00de:
            if (r3 == 0) goto L_0x00fc
            r3.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00fc
        L_0x00e4:
            r10 = move-exception
            com.amazon.device.ads.MobileAdsLogger r2 = r9.getLogger()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r5 = r10.getMessage()
            r3[r4] = r5
            r2.mo11020e(r1, r3)
            com.amazon.device.ads.WebRequest$WebRequestException r1 = new com.amazon.device.ads.WebRequest$WebRequestException
            com.amazon.device.ads.WebRequest$WebRequestStatus r2 = com.amazon.device.ads.WebRequest.WebRequestStatus.NETWORK_FAILURE
            r1.<init>(r2, r0, r10)
            throw r1
        L_0x00fc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.HttpURLConnectionWebRequest.writePostBody(java.net.HttpURLConnection):void");
    }

    /* access modifiers changed from: protected */
    public WebRequest.WebResponse prepareResponse(HttpURLConnection httpURLConnection) throws WebRequest.WebRequestException {
        WebRequest.WebResponse webResponse = new WebRequest.WebResponse();
        try {
            webResponse.setHttpStatusCode(httpURLConnection.getResponseCode());
            webResponse.setHttpStatus(httpURLConnection.getResponseMessage());
            if (webResponse.getHttpStatusCode() == 200) {
                try {
                    webResponse.setInputStream(httpURLConnection.getInputStream());
                } catch (IOException e) {
                    getLogger().mo11020e("IOException while reading the input stream from response: %s", e.getMessage());
                    throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.NETWORK_FAILURE, "IOException while reading the input stream from response", e);
                }
            }
            return webResponse;
        } catch (SocketTimeoutException e2) {
            getLogger().mo11020e("Socket Timeout while getting the response status code: %s", e2.getMessage());
            throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.NETWORK_TIMEOUT, "Socket Timeout while getting the response status code", e2);
        } catch (IOException e3) {
            getLogger().mo11020e("IOException while getting the response status code: %s", e3.getMessage());
            throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.NETWORK_FAILURE, "IOException while getting the response status code", e3);
        } catch (IndexOutOfBoundsException e4) {
            getLogger().mo11020e("IndexOutOfBoundsException while getting the response status code: %s", e4.getMessage());
            throw new WebRequest.WebRequestException(WebRequest.WebRequestStatus.MALFORMED_URL, "IndexOutOfBoundsException while getting the response status code", e4);
        }
    }

    /* access modifiers changed from: protected */
    public String getSubLogTag() {
        return LOGTAG;
    }
}
