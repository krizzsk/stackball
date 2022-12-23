package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

final class PublisherInfoMacro {
    private final DataCollector dataCollector;

    PublisherInfoMacro(DataCollector dataCollector2) {
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> toMap() {
        return Maps.mapOf(Maps.entryOf("[DOMAIN]", "-1"), Maps.entryOf("[PAGEURL]", "-1"), Maps.entryOf("[APPBUNDLE]", getAppBundle()));
    }

    private String getAppBundle() {
        String packageName = this.dataCollector.getSystemInfo().getPackageName();
        return TextUtils.isEmpty(packageName) ? "-2" : packageName;
    }
}
