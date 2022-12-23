package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.util.Objects;

public final class MraidEnvironmentProperties {
    public static final String SDK = "SmaatoSDK Android";
    public static final String VERSION = "3.0";
    public final String appId;
    public final Integer coppa;
    public final String googleAdId;
    public final Boolean googleDnt;
    public final String sdkVersion;

    /* synthetic */ MraidEnvironmentProperties(String str, String str2, String str3, Boolean bool, Integer num, byte b) {
        this(str, str2, str3, bool, num);
    }

    private MraidEnvironmentProperties(String str, String str2, String str3, Boolean bool, Integer num) {
        this.sdkVersion = str;
        this.appId = str2;
        this.googleAdId = str3;
        this.googleDnt = bool;
        this.coppa = num;
    }

    public static final class Builder {
        private final String appId;
        private final Integer coppa;
        private final String googleAdId;
        private final Boolean googleDnt;
        private final String sdkVersion = SmaatoSdk.getVersion();

        public Builder(String str, ApiAdRequest apiAdRequest) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(apiAdRequest);
            this.appId = str;
            this.googleAdId = apiAdRequest.getGoogleAdId();
            this.googleDnt = apiAdRequest.getGoogleDnt();
            this.coppa = apiAdRequest.getCoppa();
        }

        public final MraidEnvironmentProperties build() {
            Objects.requireNonNull(this.sdkVersion);
            Objects.requireNonNull(this.appId);
            return new MraidEnvironmentProperties(this.sdkVersion, this.appId, this.googleAdId, this.googleDnt, this.coppa, (byte) 0);
        }
    }
}
