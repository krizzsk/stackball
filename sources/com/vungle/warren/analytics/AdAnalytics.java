package com.vungle.warren.analytics;

import com.google.gson.JsonObject;

public interface AdAnalytics {
    String[] ping(String[] strArr);

    String[] retryUnsent();

    /* renamed from: ri */
    void mo60010ri(JsonObject jsonObject);

    void saveVungleUrls(String[] strArr);
}
