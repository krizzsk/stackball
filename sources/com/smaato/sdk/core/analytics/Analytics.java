package com.smaato.sdk.core.analytics;

import com.smaato.sdk.core.analytics.DiAnalyticsLayer;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Function;
import java.util.List;

public final class Analytics {
    private final List<ViewabilityPlugin> connectedPlugins;
    private final DiAnalyticsLayer.VideoTrackerProvider videoTrackerProvider;
    private final DiAnalyticsLayer.WebViewTrackerProvider webViewTrackerProvider;

    Analytics(Iterable<ViewabilityPlugin> iterable, DiAnalyticsLayer.WebViewTrackerProvider webViewTrackerProvider2, DiAnalyticsLayer.VideoTrackerProvider videoTrackerProvider2) {
        this.connectedPlugins = Lists.toImmutableList(iterable);
        this.webViewTrackerProvider = (DiAnalyticsLayer.WebViewTrackerProvider) Objects.requireNonNull(webViewTrackerProvider2);
        this.videoTrackerProvider = (DiAnalyticsLayer.VideoTrackerProvider) Objects.requireNonNull(videoTrackerProvider2);
    }

    public final List<String> getConnectedPluginNames() {
        return Lists.map(this.connectedPlugins, $$Lambda$q3CjFSc9xS7GM0ITl1kJY2SfieA.INSTANCE);
    }

    public final WebViewViewabilityTracker getWebViewTracker() {
        return new WebViewViewabilityTrackerComposite(Lists.map(this.connectedPlugins, new Function() {
            public final Object apply(Object obj) {
                return Analytics.this.lambda$getWebViewTracker$0$Analytics((ViewabilityPlugin) obj);
            }
        }));
    }

    public /* synthetic */ WebViewViewabilityTracker lambda$getWebViewTracker$0$Analytics(ViewabilityPlugin viewabilityPlugin) {
        return (WebViewViewabilityTracker) this.webViewTrackerProvider.apply(viewabilityPlugin.getName());
    }

    public final VideoViewabilityTracker getVideoTracker() {
        return new VideoViewabilityTrackerComposite(Lists.map(this.connectedPlugins, new Function() {
            public final Object apply(Object obj) {
                return Analytics.this.lambda$getVideoTracker$1$Analytics((ViewabilityPlugin) obj);
            }
        }));
    }

    public /* synthetic */ VideoViewabilityTracker lambda$getVideoTracker$1$Analytics(ViewabilityPlugin viewabilityPlugin) {
        return (VideoViewabilityTracker) this.videoTrackerProvider.apply(viewabilityPlugin.getName());
    }
}
