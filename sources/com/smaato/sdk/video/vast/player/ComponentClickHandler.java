package com.smaato.sdk.video.vast.player;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.deeplink.LinkResolver;
import com.smaato.sdk.core.deeplink.UrlResolveListener;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.concurrent.atomic.AtomicReference;

final class ComponentClickHandler {
    final AtomicReference<Task> handleUrlTaskRef = new AtomicReference<>();
    private final LinkResolver linkResolver;
    final Logger logger;
    private final SomaApiContext somaApiContext;
    private final VideoClicks videoClicks;

    public interface ClickCallback {
        void onUrlResolved(Consumer<Context> consumer);
    }

    ComponentClickHandler(Logger logger2, SomaApiContext somaApiContext2, LinkResolver linkResolver2, VideoClicks videoClicks2) {
        this.linkResolver = (LinkResolver) Objects.requireNonNull(linkResolver2);
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.videoClicks = videoClicks2;
    }

    /* access modifiers changed from: package-private */
    public final void handleClick(final String str, final ClickCallback clickCallback) {
        if (TextUtils.isEmpty(str)) {
            VideoClicks videoClicks2 = this.videoClicks;
            VastBeacon vastBeacon = videoClicks2 == null ? null : videoClicks2.clickThrough;
            if (vastBeacon == null) {
                str = null;
            } else {
                str = vastBeacon.uri;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.logger.error(LogDomain.VAST, "Cannot handle click due to a missing URL", new Object[0]);
        } else if (this.handleUrlTaskRef.get() == null) {
            Task handleClickThroughUrl = this.linkResolver.handleClickThroughUrl(this.somaApiContext, str, new UrlResolveListener() {
                public final void onSuccess(Consumer<Context> consumer) {
                    clickCallback.onUrlResolved(consumer);
                    ComponentClickHandler.this.handleUrlTaskRef.set((Object) null);
                }

                public final void onError() {
                    Logger logger = ComponentClickHandler.this.logger;
                    LogDomain logDomain = LogDomain.VAST;
                    logger.error(logDomain, "Seems to be an invalid URL: " + str, new Object[0]);
                    ComponentClickHandler.this.handleUrlTaskRef.set((Object) null);
                }
            });
            this.handleUrlTaskRef.set(handleClickThroughUrl);
            handleClickThroughUrl.start();
        }
    }
}
