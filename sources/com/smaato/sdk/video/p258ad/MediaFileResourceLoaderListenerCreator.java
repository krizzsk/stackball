package com.smaato.sdk.video.p258ad;

import com.smaato.sdk.video.p258ad.MediaFileResourceLoaderListener;
import com.smaato.sdk.video.vast.model.VastScenario;

/* renamed from: com.smaato.sdk.video.ad.MediaFileResourceLoaderListenerCreator */
public final class MediaFileResourceLoaderListenerCreator {
    static MediaFileResourceLoaderListener create(VastScenario vastScenario, MediaFileResourceLoaderListener.CachingListener cachingListener) {
        return new MediaFileResourceLoaderListener(vastScenario, cachingListener);
    }
}
