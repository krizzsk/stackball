package com.smaato.sdk.core.network;

import com.smaato.sdk.core.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NetworkHttpResponse implements NetworkResponse {
    private byte[] body;
    private Map<String, List<String>> headers;
    private final String requestUrl;
    private int responseCode;

    public NetworkHttpResponse(int i, Map<String, List<String>> map, byte[] bArr, String str) {
        this.responseCode = i;
        this.headers = (Map) Objects.requireNonNull(map);
        this.body = bArr;
        this.requestUrl = (String) Objects.requireNonNull(str);
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public byte[] getBody() {
        return this.body;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NetworkHttpResponse{responseCode=");
        sb.append(this.responseCode);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", body");
        if (this.body == null) {
            str = "=null";
        } else {
            str = ".length=" + this.body.length + " bytes";
        }
        sb.append(str);
        sb.append(", requestUrl=");
        sb.append(this.requestUrl);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NetworkHttpResponse networkHttpResponse = (NetworkHttpResponse) obj;
            return this.responseCode == networkHttpResponse.responseCode && Objects.equals(this.headers, networkHttpResponse.headers) && Arrays.equals(this.body, networkHttpResponse.body) && Objects.equals(this.requestUrl, networkHttpResponse.requestUrl);
        }
    }

    public int hashCode() {
        return (Objects.hash(Integer.valueOf(this.responseCode), this.headers, this.requestUrl) * 31) + Arrays.hashCode(this.body);
    }
}
