package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;

/* renamed from: com.smaato.sdk.core.ad.AdRequest */
public final class AdRequest {
    private final AdSettings adSettings;
    private final boolean isSplash;
    private final KeyValuePairs keyValuePairs;
    private final String ubUniqueId;
    private final UserInfo userInfo;

    /* synthetic */ AdRequest(AdSettings adSettings2, UserInfo userInfo2, KeyValuePairs keyValuePairs2, String str, boolean z, byte b) {
        this(adSettings2, userInfo2, keyValuePairs2, str, z);
    }

    private AdRequest(AdSettings adSettings2, UserInfo userInfo2, KeyValuePairs keyValuePairs2, String str, boolean z) {
        this.adSettings = (AdSettings) Objects.requireNonNull(adSettings2);
        this.userInfo = (UserInfo) Objects.requireNonNull(userInfo2);
        this.keyValuePairs = keyValuePairs2;
        this.ubUniqueId = str;
        this.isSplash = z;
    }

    public final String getUbUniqueId() {
        return this.ubUniqueId;
    }

    public final AdSettings getAdSettings() {
        return this.adSettings;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final KeyValuePairs getKeyValuePairs() {
        return this.keyValuePairs;
    }

    public final boolean getIsSplash() {
        return this.isSplash;
    }

    public final String toString() {
        return "AdRequest{adSettings=" + this.adSettings + ", userInfo=" + this.userInfo + ", keyValuePairs=" + this.keyValuePairs + ", isSplash=" + this.isSplash + '}';
    }

    /* renamed from: com.smaato.sdk.core.ad.AdRequest$Builder */
    public static final class Builder {
        private AdSettings adSettings;
        private boolean isSplash;
        private KeyValuePairs keyValuePairs;
        private String ubUniqueId;
        private UserInfo userInfo;

        public final Builder setAdSettings(AdSettings adSettings2) {
            this.adSettings = adSettings2;
            return this;
        }

        public final Builder setUserInfo(UserInfo userInfo2) {
            this.userInfo = userInfo2;
            return this;
        }

        public final Builder setKeyValuePairs(KeyValuePairs keyValuePairs2) {
            this.keyValuePairs = keyValuePairs2;
            return this;
        }

        public final Builder setUbUniqueId(String str) {
            this.ubUniqueId = str;
            return this;
        }

        public final Builder setIsSplash(Boolean bool) {
            this.isSplash = bool.booleanValue();
            return this;
        }

        public final AdRequest build() {
            ArrayList arrayList = new ArrayList();
            if (this.adSettings == null) {
                arrayList.add("adSettings");
            }
            if (this.userInfo == null) {
                arrayList.add("userInfo");
            }
            if (arrayList.isEmpty()) {
                return new AdRequest(this.adSettings, this.userInfo, this.keyValuePairs, this.ubUniqueId, this.isSplash, (byte) 0);
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
