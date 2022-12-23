package com.smaato.sdk.core.analytics;

import com.smaato.sdk.core.util.Objects;

public final class ViewabilityVerificationResource {
    private final String apiFramework;
    private final String jsScriptUrl;
    private final boolean noBrowser;
    private final String parameters;
    private final String vendor;

    public ViewabilityVerificationResource(String str, String str2, String str3, String str4, boolean z) {
        this.vendor = (String) Objects.requireNonNull(str);
        this.jsScriptUrl = (String) Objects.requireNonNull(str2);
        this.apiFramework = (String) Objects.requireNonNull(str3);
        this.parameters = str4;
        this.noBrowser = z;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final String getParameters() {
        return this.parameters;
    }

    public final String getJsScriptUrl() {
        return this.jsScriptUrl;
    }

    public final String getApiFramework() {
        return this.apiFramework;
    }

    public final boolean isNoBrowser() {
        return this.noBrowser;
    }
}
