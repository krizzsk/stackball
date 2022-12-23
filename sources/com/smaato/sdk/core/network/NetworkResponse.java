package com.smaato.sdk.core.network;

import java.util.List;
import java.util.Map;

public interface NetworkResponse {
    byte[] getBody();

    Map<String, List<String>> getHeaders();

    String getRequestUrl();

    int getResponseCode();
}
