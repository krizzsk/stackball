package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BeaconNetworkRequest implements NetworkRequest {
    private final String url;

    public byte[] getBody() {
        return null;
    }

    public int getConnectTimeout() {
        return 30000;
    }

    public int getReadTimeout() {
        return 30000;
    }

    public BeaconNetworkRequest(String str) {
        this.url = (String) Objects.requireNonNull(str, "Parameter url cannot be null for BeaconNetworkRequest::BeaconNetworkRequest");
    }

    public String getUrl() {
        return this.url;
    }

    public Map<String, String> getQueryItems() {
        return Collections.emptyMap();
    }

    public NetworkRequest.Method getMethod() {
        return NetworkRequest.Method.GET;
    }

    public Map<String, List<String>> getHeaders() {
        return Collections.EMPTY_MAP;
    }
}
