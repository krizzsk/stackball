package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;

/* compiled from: SdkInfo.kt */
public final class SdkInfo {
    private final String aaid;
    private final String apiKey;
    private final String sdkVersion;

    public SdkInfo(String str, String str2, String str3) {
        C7921ai.m22144b(str, "sdkVersion");
        C7921ai.m22144b(str2, "apiKey");
        C7921ai.m22144b(str3, "aaid");
        this.sdkVersion = str;
        this.apiKey = str2;
        this.aaid = str3;
    }

    public final String getAaid() {
        return this.aaid;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }
}
