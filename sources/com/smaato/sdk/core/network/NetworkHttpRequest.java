package com.smaato.sdk.core.network;

import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.util.Joiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class NetworkHttpRequest implements NetworkRequest {
    /* access modifiers changed from: private */
    public byte[] body;
    /* access modifiers changed from: private */
    public int connectionTimeout;
    /* access modifiers changed from: private */
    public Map<String, List<String>> headers;
    /* access modifiers changed from: private */
    public NetworkRequest.Method method;
    /* access modifiers changed from: private */
    public final Map<String, String> queryItems;
    /* access modifiers changed from: private */
    public int readTimeout;
    /* access modifiers changed from: private */
    public String url;

    public static class Headers {
        public static final String KEY_CONTENT_TYPE = "Content-Type";
        public static final String KEY_USER_AGENT = "User-Agent";
    }

    /* synthetic */ NetworkHttpRequest(String str, Map map, NetworkRequest.Method method2, byte[] bArr, int i, int i2, Map map2, byte b) {
        this(str, map, method2, bArr, i, i2, map2);
    }

    private NetworkHttpRequest(String str, Map<String, String> map, NetworkRequest.Method method2, byte[] bArr, int i, int i2, Map<String, List<String>> map2) {
        this.url = str;
        this.queryItems = map;
        this.method = method2;
        this.body = bArr;
        this.connectionTimeout = i;
        this.readTimeout = i2;
        this.headers = map2;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> getQueryItems() {
        return this.queryItems;
    }

    public final NetworkRequest.Method getMethod() {
        return this.method;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final int getConnectTimeout() {
        int i = this.connectionTimeout;
        if (i > 0) {
            return i;
        }
        return 30000;
    }

    public final int getReadTimeout() {
        int i = this.readTimeout;
        if (i > 0) {
            return i;
        }
        return 30000;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkHttpRequest networkHttpRequest = (NetworkHttpRequest) obj;
        if (this.connectionTimeout == networkHttpRequest.connectionTimeout && this.readTimeout == networkHttpRequest.readTimeout && this.url.equals(networkHttpRequest.url) && this.queryItems.equals(networkHttpRequest.queryItems) && this.method == networkHttpRequest.method && Arrays.equals(this.body, networkHttpRequest.body)) {
            return this.headers.equals(networkHttpRequest.headers);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.url.hashCode() * 31) + this.queryItems.hashCode()) * 31) + this.method.hashCode()) * 31) + Arrays.hashCode(this.body)) * 31) + this.connectionTimeout) * 31) + this.readTimeout) * 31) + this.headers.hashCode();
    }

    public static final class Builder {
        private byte[] body;
        private int connectionTimeout;
        private Map<String, List<String>> headers = new LinkedHashMap();
        private NetworkRequest.Method method;
        private Map<String, String> queryItems = new LinkedHashMap();
        private int readTimeout;
        private String url;

        public Builder() {
        }

        public Builder(NetworkHttpRequest networkHttpRequest) {
            this.url = networkHttpRequest.url;
            this.queryItems = networkHttpRequest.queryItems;
            this.method = networkHttpRequest.method;
            this.connectionTimeout = networkHttpRequest.connectionTimeout;
            this.readTimeout = networkHttpRequest.readTimeout;
            this.headers = networkHttpRequest.headers;
            this.body = networkHttpRequest.body;
        }

        public final Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        public final Builder setMethod(NetworkRequest.Method method2) {
            this.method = method2;
            return this;
        }

        public final Builder setBody(byte[] bArr) {
            this.body = bArr;
            return this;
        }

        public final Builder setConnectionTimeout(int i) {
            this.connectionTimeout = i;
            return this;
        }

        public final Builder setReadTimeout(int i) {
            this.readTimeout = i;
            return this;
        }

        public final Builder setHeaders(Map<String, List<String>> map) {
            this.headers = new LinkedHashMap(map);
            return this;
        }

        public final Builder setQueryItems(Map<String, String> map) {
            this.queryItems = new LinkedHashMap(map);
            return this;
        }

        public final NetworkHttpRequest build() {
            ArrayList arrayList = new ArrayList();
            if (this.url == null) {
                arrayList.add("url");
            }
            if (this.method == null) {
                arrayList.add("method");
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalStateException("Missing required properties: " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
            } else if (this.method.validateBody(this.body)) {
                return new NetworkHttpRequest(this.url, this.queryItems, this.method, this.body, this.connectionTimeout, this.readTimeout, this.headers, (byte) 0);
            } else {
                StringBuilder sb = new StringBuilder("Method ");
                sb.append(this.method);
                sb.append(" has invalid body. Body exists: ");
                sb.append(this.body != null);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
