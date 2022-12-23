package com.smaato.sdk.core.api;

import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.ApiAdRequestExtras;
import com.smaato.sdk.core.util.Objects;

public final class VideoTypeAdRequestExtrasProvider implements AdRequestExtrasProvider {
    private final String videoType;

    public VideoTypeAdRequestExtrasProvider(String str) {
        this.videoType = (String) Objects.requireNonNull(str);
    }

    public final void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras) {
        AdFormat adFormat = apiAdRequestExtras.adFormat();
        if (adFormat == AdFormat.VIDEO || adFormat == AdFormat.INTERSTITIAL) {
            apiAdRequestExtras.addApiParamExtra("videotype", this.videoType);
        }
    }
}
