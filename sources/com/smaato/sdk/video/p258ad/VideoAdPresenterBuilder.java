package com.smaato.sdk.video.p258ad;

import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.smaato.sdk.core.analytics.ViewabilityVerificationResource;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderErrorMapper;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderException;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.video.p258ad.MediaFileResourceLoaderListener;
import com.smaato.sdk.video.p258ad.VideoAdPresenterBuilder;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.build.VastConfigurationSettings;
import com.smaato.sdk.video.vast.build.VastResult;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastScenarioResult;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.model.Category;
import com.smaato.sdk.video.vast.model.Delivery;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VastVideoPlayerCreator;
import com.smaato.sdk.video.vast.player.VideoTimings;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.VideoAdPresenterBuilder */
abstract class VideoAdPresenterBuilder<Presenter extends AdPresenter> implements AdPresenterBuilder {
    private final VastErrorTrackerCreator errorTrackerCreator;
    private final Logger logger;
    private final Function<AdPresenterComponents, Presenter> presenterProviderFunction;
    private final MediaFileResourceLoaderListenerCreator resourceLoaderListenerCreator;
    private final VastScenarioPicker vastScenarioPicker;
    private final VastTreeBuilder vastTreeBuilder;
    private final VastVideoPlayerCreator vastVideoPlayerCreator;
    private final VerificationResourceMapper verificationResourceMapper;
    private final Function<VideoAdObject, VideoAdInteractor> videoAdInteractorProviderFunction;
    private final ResourceLoader<Uri, Uri> videoResourceLoader;
    private final Function<VastMediaFileScenario, VideoTimings> videoTimingsProvider;

    /* JADX WARNING: type inference failed for: r8v0, types: [com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.video.ad.VideoAdObject, com.smaato.sdk.video.ad.VideoAdInteractor>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.video.vast.model.VastMediaFileScenario, com.smaato.sdk.video.vast.player.VideoTimings>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.video.ad.VideoAdPresenterBuilder$AdPresenterComponents, Presenter>] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    VideoAdPresenterBuilder(com.smaato.sdk.core.log.Logger r1, com.smaato.sdk.video.vast.build.VastScenarioPicker r2, com.smaato.sdk.video.vast.build.VastTreeBuilder r3, com.smaato.sdk.video.vast.player.VastVideoPlayerCreator r4, com.smaato.sdk.core.resourceloader.ResourceLoader<android.net.Uri, android.net.Uri> r5, com.smaato.sdk.video.p258ad.VastErrorTrackerCreator r6, com.smaato.sdk.video.p258ad.MediaFileResourceLoaderListenerCreator r7, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.video.p258ad.VideoAdObject, com.smaato.sdk.video.p258ad.VideoAdInteractor> r8, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.video.vast.model.VastMediaFileScenario, com.smaato.sdk.video.vast.player.VideoTimings> r9, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.video.p258ad.VideoAdPresenterBuilder.AdPresenterComponents, Presenter> r10, com.smaato.sdk.video.p258ad.VerificationResourceMapper r11) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.log.Logger r1 = (com.smaato.sdk.core.log.Logger) r1
            r0.logger = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.video.vast.build.VastScenarioPicker r1 = (com.smaato.sdk.video.vast.build.VastScenarioPicker) r1
            r0.vastScenarioPicker = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.video.vast.build.VastTreeBuilder r1 = (com.smaato.sdk.video.vast.build.VastTreeBuilder) r1
            r0.vastTreeBuilder = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.video.vast.player.VastVideoPlayerCreator r1 = (com.smaato.sdk.video.vast.player.VastVideoPlayerCreator) r1
            r0.vastVideoPlayerCreator = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.resourceloader.ResourceLoader r1 = (com.smaato.sdk.core.resourceloader.ResourceLoader) r1
            r0.videoResourceLoader = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.video.ad.VastErrorTrackerCreator r1 = (com.smaato.sdk.video.p258ad.VastErrorTrackerCreator) r1
            r0.errorTrackerCreator = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r7)
            com.smaato.sdk.video.ad.MediaFileResourceLoaderListenerCreator r1 = (com.smaato.sdk.video.p258ad.MediaFileResourceLoaderListenerCreator) r1
            r0.resourceLoaderListenerCreator = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r8)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.videoAdInteractorProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r9)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.videoTimingsProvider = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r10)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.presenterProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r11)
            com.smaato.sdk.video.ad.VerificationResourceMapper r1 = (com.smaato.sdk.video.p258ad.VerificationResourceMapper) r1
            r0.verificationResourceMapper = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.p258ad.VideoAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.video.vast.build.VastScenarioPicker, com.smaato.sdk.video.vast.build.VastTreeBuilder, com.smaato.sdk.video.vast.player.VastVideoPlayerCreator, com.smaato.sdk.core.resourceloader.ResourceLoader, com.smaato.sdk.video.ad.VastErrorTrackerCreator, com.smaato.sdk.video.ad.MediaFileResourceLoaderListenerCreator, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.video.ad.VerificationResourceMapper):void");
    }

    public void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener) {
        Objects.requireNonNull(somaApiContext, "Parameter somaApiContext cannot be null for VideoAdPresenterBuilder::buildAdPresenter");
        ApiAdResponse apiAdResponse = somaApiContext.getApiAdResponse();
        this.vastTreeBuilder.buildVastTree(this.logger, somaApiContext, new ByteArrayInputStream(apiAdResponse.getBody()), apiAdResponse.getCharset(), new NonNullConsumer(somaApiContext, listener) {
            public final /* synthetic */ SomaApiContext f$1;
            public final /* synthetic */ AdPresenterBuilder.Listener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                VideoAdPresenterBuilder.this.lambda$buildAdPresenter$0$VideoAdPresenterBuilder(this.f$1, this.f$2, (VastResult) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: buildAdPresenter */
    public void lambda$onVastTreeBuilt$1$VideoAdPresenterBuilder(Either<VastVideoPlayer, Exception> either, SomaApiContext somaApiContext, VastScenario vastScenario, AdPresenterBuilder.Listener listener) {
        Exception right = either.right();
        if (right != null) {
            onBuildError(right.getMessage(), listener);
            return;
        }
        VastVideoPlayer vastVideoPlayer = (VastVideoPlayer) Objects.requireNonNull(either.left());
        listener.onAdPresenterBuildSuccess(this, (AdPresenter) this.presenterProviderFunction.apply(new AdPresenterComponents(vastVideoPlayer, this.videoAdInteractorProviderFunction.apply(new VideoAdObject(somaApiContext)), this.videoTimingsProvider.apply(vastScenario.vastMediaFileScenario), this.verificationResourceMapper.apply(vastScenario.adVerifications))));
        vastVideoPlayer.loaded();
    }

    /* access modifiers changed from: private */
    public void buildVastPlayer(VastScenario vastScenario, SomaApiContext somaApiContext, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VastVideoPlayer, Exception>> nonNullConsumer) {
        this.vastVideoPlayerCreator.createVastVideoPlayer(this.logger, somaApiContext, vastScenario, vastErrorTracker, nonNullConsumer, this.videoTimingsProvider.apply(vastScenario.vastMediaFileScenario));
    }

    private void onBuildError(String str, AdPresenterBuilder.Listener listener) {
        this.logger.error(LogDomain.VAST, str, new Object[0]);
        listener.onAdPresenterBuildError(this, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, new RuntimeException(str)));
    }

    /* renamed from: com.smaato.sdk.video.ad.VideoAdPresenterBuilder$AdPresenterComponents */
    static class AdPresenterComponents {
        final Map<String, List<ViewabilityVerificationResource>> resources;
        final VastVideoPlayer vastVideoPlayer;
        final VideoAdInteractor videoAdInteractor;
        final VideoTimings videoTimings;

        AdPresenterComponents(VastVideoPlayer vastVideoPlayer2, VideoAdInteractor videoAdInteractor2, VideoTimings videoTimings2, Map<String, List<ViewabilityVerificationResource>> map) {
            this.vastVideoPlayer = vastVideoPlayer2;
            this.videoAdInteractor = videoAdInteractor2;
            this.videoTimings = videoTimings2;
            this.resources = map;
        }
    }

    /* renamed from: com.smaato.sdk.video.ad.VideoAdPresenterBuilder$CachingListener */
    final class CachingListener implements MediaFileResourceLoaderListener.CachingListener {
        private final VastErrorTracker errorTracker;
        private final AdPresenterBuilder.Listener listener;
        private final SomaApiContext somaApiContext;

        /* synthetic */ CachingListener(VideoAdPresenterBuilder videoAdPresenterBuilder, SomaApiContext somaApiContext2, VastErrorTracker vastErrorTracker, AdPresenterBuilder.Listener listener2, byte b) {
            this(somaApiContext2, vastErrorTracker, listener2);
        }

        private CachingListener(SomaApiContext somaApiContext2, VastErrorTracker vastErrorTracker, AdPresenterBuilder.Listener listener2) {
            this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
            this.errorTracker = (VastErrorTracker) Objects.requireNonNull(vastErrorTracker);
            this.listener = (AdPresenterBuilder.Listener) Objects.requireNonNull(listener2);
        }

        public final void onSuccess(VastScenario vastScenario) {
            VideoAdPresenterBuilder.this.buildVastPlayer(vastScenario, this.somaApiContext, this.errorTracker, new NonNullConsumer(vastScenario) {
                public final /* synthetic */ VastScenario f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    VideoAdPresenterBuilder.CachingListener.this.lambda$onSuccess$0$VideoAdPresenterBuilder$CachingListener(this.f$1, (Either) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onSuccess$0$VideoAdPresenterBuilder$CachingListener(VastScenario vastScenario, Either either) {
            VideoAdPresenterBuilder.this.lambda$onVastTreeBuilt$1$VideoAdPresenterBuilder(either, this.somaApiContext, vastScenario, this.listener);
        }

        public final void onFailure(Exception exc) {
            AdPresenterBuilderException adPresenterBuilderException;
            this.errorTracker.track(new PlayerState.Builder().setErrorCode(ErrorCode.GENERAL_LINEAR_ERROR).build());
            if (exc instanceof ResourceLoaderException) {
                adPresenterBuilderException = AdPresenterBuilderErrorMapper.mapError((ResourceLoaderException) exc);
            } else {
                adPresenterBuilderException = new AdPresenterBuilderException(AdPresenterBuilder.Error.GENERIC, exc);
            }
            this.listener.onAdPresenterBuildError(VideoAdPresenterBuilder.this, adPresenterBuilderException);
        }
    }

    public /* synthetic */ void lambda$buildAdPresenter$0$VideoAdPresenterBuilder(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener, VastResult vastResult) {
        if (vastResult.value == null) {
            onBuildError("Failed to build RewardedVideoAdPresenter: VAST parse result is empty", listener);
            return;
        }
        HashSet<Integer> hashSet = new HashSet<>(vastResult.errors);
        Logger logger2 = this.logger;
        VastTree vastTree = (VastTree) vastResult.value;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        String connection = somaApiContext.getApiAdRequest().getConnection();
        Integer width = somaApiContext.getApiAdRequest().getWidth();
        Integer height = somaApiContext.getApiAdRequest().getHeight();
        if (width == null) {
            width = Integer.valueOf(displayMetrics.widthPixels);
        }
        if (height == null) {
            height = Integer.valueOf(displayMetrics.heightPixels);
        }
        VastScenarioResult pickVastScenario = this.vastScenarioPicker.pickVastScenario(logger2, vastTree, new VastConfigurationSettings(width.intValue(), height.intValue(), connection));
        hashSet.addAll(pickVastScenario.errors);
        VastErrorTrackerCreator vastErrorTrackerCreator = this.errorTrackerCreator;
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(pickVastScenario);
        VastErrorTracker vastErrorTracker = new VastErrorTracker(vastErrorTrackerCreator.logger, vastErrorTrackerCreator.beaconTracker, somaApiContext, (MacroInjector) vastErrorTrackerCreator.macroInjectorProvider.apply(pickVastScenario.vastScenario), pickVastScenario.errorUrls);
        for (Integer intValue : hashSet) {
            vastErrorTracker.track(new PlayerState.Builder().setErrorCode(intValue.intValue()).build());
        }
        VastScenario vastScenario = pickVastScenario.vastScenario;
        if (vastScenario == null) {
            onBuildError("Failed to build VastAdPresenter: Unable to pick proper VAST scenario to play", listener);
            return;
        }
        for (Category category : vastScenario.categories) {
            if (vastScenario.blockedAdCategories.contains(category.categoryCode)) {
                vastErrorTracker.track(new PlayerState.Builder().setErrorCode(ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR).build());
                onBuildError("Failed to build VastAdPresenter: Inline Category violates Wrapper BlockedAdCategories", listener);
                return;
            }
        }
        VastMediaFileScenario vastMediaFileScenario = vastScenario.vastMediaFileScenario;
        if (!vastMediaFileScenario.hasValidDuration()) {
            vastErrorTracker.track(new PlayerState.Builder().setErrorCode(ErrorCode.GENERAL_LINEAR_ERROR).build());
            onBuildError("Failed to build VastAdPresenter: Invalid value of expected duration", listener);
            return;
        }
        MediaFile mediaFile = vastMediaFileScenario.mediaFile;
        if (TextUtils.isEmpty(mediaFile.url)) {
            vastErrorTracker.track(new PlayerState.Builder().setErrorCode(ErrorCode.GENERAL_LINEAR_ERROR).build());
            onBuildError("Failed to build VastAdPresenter: Empty URL of MediaFile", listener);
            return;
        }
        Delivery delivery = mediaFile.delivery;
        if (delivery == Delivery.PROGRESSIVE) {
            this.videoResourceLoader.loadResource(mediaFile.url, somaApiContext, MediaFileResourceLoaderListenerCreator.create(vastScenario, new CachingListener(this, somaApiContext, vastErrorTracker, listener, (byte) 0)));
        } else if (delivery == Delivery.STREAMING) {
            buildVastPlayer(vastScenario, somaApiContext, vastErrorTracker, new NonNullConsumer(somaApiContext, vastScenario, listener) {
                public final /* synthetic */ SomaApiContext f$1;
                public final /* synthetic */ VastScenario f$2;
                public final /* synthetic */ AdPresenterBuilder.Listener f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void accept(Object obj) {
                    VideoAdPresenterBuilder.this.lambda$onVastTreeBuilt$1$VideoAdPresenterBuilder(this.f$1, this.f$2, this.f$3, (Either) obj);
                }
            });
        } else {
            vastErrorTracker.track(new PlayerState.Builder().setErrorCode(ErrorCode.COULD_NOT_DISPLAY_MEDIA_FILE_ERROR).build());
            onBuildError("Failed to build RewardedVideoAdPresenter: Unknown delivery method", listener);
        }
    }
}
