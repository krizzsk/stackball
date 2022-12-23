package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.ArrayList;

/* renamed from: com.smaato.sdk.core.ad.AdSettings */
public final class AdSettings {
    private final AdDimension adDimension;
    private final AdFormat adFormat;
    private final String adSpaceId;
    private final Integer height;
    private final String mediationAdapterVersion;
    private final String mediationNetworkName;
    private final String mediationNetworkSDKVersion;
    private final String publisherId;
    private final Integer width;

    /* synthetic */ AdSettings(String str, String str2, AdFormat adFormat2, AdDimension adDimension2, Integer num, Integer num2, String str3, String str4, String str5, byte b) {
        this(str, str2, adFormat2, adDimension2, num, num2, str3, str4, str5);
    }

    private AdSettings(String str, String str2, AdFormat adFormat2, AdDimension adDimension2, Integer num, Integer num2, String str3, String str4, String str5) {
        this.publisherId = (String) Objects.requireNonNull(str);
        this.adSpaceId = (String) Objects.requireNonNull(str2);
        this.adFormat = (AdFormat) Objects.requireNonNull(adFormat2);
        this.adDimension = adDimension2;
        this.width = num;
        this.height = num2;
        this.mediationNetworkName = str3;
        this.mediationNetworkSDKVersion = str4;
        this.mediationAdapterVersion = str5;
    }

    public final String getPublisherId() {
        return this.publisherId;
    }

    public final String getAdSpaceId() {
        return this.adSpaceId;
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final AdDimension getAdDimension() {
        return this.adDimension;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMediationNetworkName() {
        return this.mediationNetworkName;
    }

    public final String getMediationNetworkSDKVersion() {
        return this.mediationNetworkSDKVersion;
    }

    public final String getMediationAdapterVersion() {
        return this.mediationAdapterVersion;
    }

    public final String toString() {
        return "AdSettings{publisherId='" + this.publisherId + '\'' + ", adSpaceId='" + this.adSpaceId + '\'' + ", adFormat=" + this.adFormat + ", adDimension=" + this.adDimension + ", width=" + this.width + ", height=" + this.height + ", mediationNetworkName='" + this.mediationNetworkName + '\'' + ", mediationNetworkSDKVersion='" + this.mediationNetworkSDKVersion + '\'' + ", mediationAdapterVersion='" + this.mediationAdapterVersion + '\'' + '}';
    }

    /* renamed from: com.smaato.sdk.core.ad.AdSettings$Builder */
    public static final class Builder {
        private AdDimension adDimension;
        private AdFormat adFormat;
        private String adSpaceId;
        private Integer height;
        private String mediationAdapterVersion;
        private String mediationNetworkName;
        private String mediationNetworkSDKVersion;
        private String publisherId;
        private Integer width;

        public final Builder setPublisherId(String str) {
            this.publisherId = str;
            return this;
        }

        public final Builder setAdSpaceId(String str) {
            this.adSpaceId = str;
            return this;
        }

        public final Builder setAdFormat(AdFormat adFormat2) {
            this.adFormat = adFormat2;
            return this;
        }

        public final Builder setAdDimension(AdDimension adDimension2) {
            this.adDimension = adDimension2;
            return this;
        }

        public final Builder setMediationNetworkName(String str) {
            this.mediationNetworkName = str;
            return this;
        }

        public final Builder setMediationNetworkSDKVersion(String str) {
            this.mediationNetworkSDKVersion = str;
            return this;
        }

        public final Builder setMediationAdapterVersion(String str) {
            this.mediationAdapterVersion = str;
            return this;
        }

        public final Builder setWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }

        public final Builder setHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public final AdSettings build() {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(this.publisherId)) {
                arrayList.add("publisherId");
            }
            if (TextUtils.isEmpty(this.adSpaceId)) {
                arrayList.add("adSpaceId");
            }
            if (this.adFormat == null) {
                arrayList.add("adFormat");
            }
            if (arrayList.isEmpty()) {
                return new AdSettings(this.publisherId, this.adSpaceId, this.adFormat, this.adDimension, this.width, this.height, this.mediationNetworkName, this.mediationNetworkSDKVersion, this.mediationAdapterVersion, (byte) 0);
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
