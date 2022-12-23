package com.smaato.sdk.video.p258ad;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.p248ad.AdObject;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.video.ad.VideoAdObject */
final class VideoAdObject implements AdObject {
    private final SomaApiContext somaApiContext;

    VideoAdObject(SomaApiContext somaApiContext2) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
    }

    public final SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }
}
