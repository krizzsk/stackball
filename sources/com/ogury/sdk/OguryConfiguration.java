package com.ogury.sdk;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.sdk.internal.C8567m;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: OguryConfiguration.kt */
public final class OguryConfiguration {
    private final String assetKey;
    private final Context context;
    private final Map<String, String> monitoringInfoList;

    private OguryConfiguration(Builder builder) {
        this.context = builder.getContext();
        this.assetKey = builder.getAssetKey();
        this.monitoringInfoList = builder.getMonitoringInfoList();
    }

    public /* synthetic */ OguryConfiguration(Builder builder, C8566l lVar) {
        this(builder);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getAssetKey() {
        return this.assetKey;
    }

    public final Map<String, String> getMonitoringInfoList() {
        return this.monitoringInfoList;
    }

    /* compiled from: OguryConfiguration.kt */
    public static final class Builder {
        private final String assetKey;
        private final Context context;
        private final Map<String, String> monitoringInfoList = new LinkedHashMap();

        public Builder(Context context2, String str) {
            C8567m.m24059b(context2, "context");
            C8567m.m24059b(str, "assetKey");
            this.context = context2;
            this.assetKey = str;
        }

        public final String getAssetKey() {
            return this.assetKey;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Map<String, String> getMonitoringInfoList() {
            return this.monitoringInfoList;
        }

        public final Builder putMonitoringInfo(String str, String str2) {
            C8567m.m24059b(str, SDKConstants.PARAM_KEY);
            C8567m.m24059b(str2, "value");
            this.monitoringInfoList.put(str, str2);
            return this;
        }

        public final OguryConfiguration build() {
            return new OguryConfiguration(this, (C8566l) null);
        }
    }
}
