package com.smaato.sdk.video.p258ad;

import android.net.Uri;
import com.smaato.sdk.core.analytics.VideoViewabilityTracker;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.video.p258ad.VideoAdPresenterBuilder;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.VastVideoPlayerCreator;
import com.smaato.sdk.video.vast.player.VideoTimings;

/* renamed from: com.smaato.sdk.video.ad.RewardedVideoAdPresenterBuilder */
public class RewardedVideoAdPresenterBuilder extends VideoAdPresenterBuilder<RewardedVideoAdPresenter> {
    public /* bridge */ /* synthetic */ void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener) {
        super.buildAdPresenter(somaApiContext, listener);
    }

    public RewardedVideoAdPresenterBuilder(Logger logger, Function<VideoAdObject, VideoAdInteractor> function, VastScenarioPicker vastScenarioPicker, VastTreeBuilder vastTreeBuilder, VastVideoPlayerCreator vastVideoPlayerCreator, ResourceLoader<Uri, Uri> resourceLoader, VastErrorTrackerCreator vastErrorTrackerCreator, MediaFileResourceLoaderListenerCreator mediaFileResourceLoaderListenerCreator, VideoViewabilityTracker videoViewabilityTracker, Function<VastMediaFileScenario, VideoTimings> function2, VerificationResourceMapper verificationResourceMapper) {
        super(logger, vastScenarioPicker, vastTreeBuilder, vastVideoPlayerCreator, resourceLoader, vastErrorTrackerCreator, mediaFileResourceLoaderListenerCreator, function, function2, new Function() {
            public final Object apply(Object obj) {
                return RewardedVideoAdPresenterBuilder.lambda$new$0(VideoViewabilityTracker.this, (VideoAdPresenterBuilder.AdPresenterComponents) obj);
            }
        }, verificationResourceMapper);
    }

    static /* synthetic */ RewardedVideoAdPresenter lambda$new$0(VideoViewabilityTracker videoViewabilityTracker, VideoAdPresenterBuilder.AdPresenterComponents adPresenterComponents) {
        return new RewardedVideoAdPresenter(adPresenterComponents.vastVideoPlayer, adPresenterComponents.videoAdInteractor, videoViewabilityTracker, adPresenterComponents.videoTimings, adPresenterComponents.resources);
    }
}
