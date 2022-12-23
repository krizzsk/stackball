package com.smaato.sdk.video.p258ad;

import android.net.Uri;
import com.smaato.sdk.core.analytics.Analytics;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.video.framework.VideoDiNames;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.VastVideoPlayerCreator;
import com.smaato.sdk.video.vast.player.VideoTimings;

/* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer */
public final class DiVideoAdLayer {

    /* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer$VideoAdInteractorProviderFunction */
    interface VideoAdInteractorProviderFunction extends Function<VideoAdObject, VideoAdInteractor> {
    }

    private DiVideoAdLayer() {
    }

    public static DiRegistry createRegistry(AdPresenterNameShaper adPresenterNameShaper, String str) {
        Objects.requireNonNull(adPresenterNameShaper);
        Objects.requireNonNull(str);
        return DiRegistry.m24065of(new Consumer(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                DiVideoAdLayer.lambda$createRegistry$7(AdPresenterNameShaper.this, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$7(AdPresenterNameShaper adPresenterNameShaper, String str, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.VIDEO, RewardedAdPresenter.class), AdPresenterBuilder.class, $$Lambda$DiVideoAdLayer$a4kM3ODvucTvdGph85hF2pfAlkA.INSTANCE);
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.VIDEO, InterstitialAdPresenter.class), AdPresenterBuilder.class, $$Lambda$DiVideoAdLayer$ZWGZ0xJRLPIDCUOXCWP_dKSXFY8.INSTANCE);
        diRegistry.registerFactory(VideoAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiVideoAdLayer.lambda$null$3(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(InterstitialVideoProperties.class, $$Lambda$DiVideoAdLayer$JffGdhrn4kmzTXTyIGP7VXvQMZg.INSTANCE);
        diRegistry.registerFactory(RewardedVideoProperties.class, $$Lambda$DiVideoAdLayer$rEYQg6dH38VThpDoICb6gIfZxNg.INSTANCE);
        diRegistry.registerFactory(VerificationResourceMapper.class, $$Lambda$DiVideoAdLayer$s52K5rdnCwuxTORxYJ6YzjkOVo.INSTANCE);
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(DiConstructor diConstructor) {
        return new RewardedVideoAdPresenterBuilder((Logger) diConstructor.get(Logger.class), (Function) diConstructor.get(VideoAdInteractorProviderFunction.class), (VastScenarioPicker) diConstructor.get(VastScenarioPicker.class), (VastTreeBuilder) diConstructor.get(VastTreeBuilder.class), (VastVideoPlayerCreator) diConstructor.get(VastVideoPlayerCreator.class), getVideoResourceLoader(diConstructor), (VastErrorTrackerCreator) diConstructor.get(VastErrorTrackerCreator.class), (MediaFileResourceLoaderListenerCreator) diConstructor.get(MediaFileResourceLoaderListenerCreator.class), ((Analytics) diConstructor.get(Analytics.class)).getVideoTracker(), (Function) diConstructor.get(RewardedVideoProperties.class), (VerificationResourceMapper) diConstructor.get(VerificationResourceMapper.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$1(DiConstructor diConstructor) {
        return new InterstitialVideoAdPresenterBuilder((Logger) diConstructor.get(Logger.class), (Function) diConstructor.get(VideoAdInteractorProviderFunction.class), (VastScenarioPicker) diConstructor.get(VastScenarioPicker.class), (VastTreeBuilder) diConstructor.get(VastTreeBuilder.class), (VastVideoPlayerCreator) diConstructor.get(VastVideoPlayerCreator.class), getVideoResourceLoader(diConstructor), (VastErrorTrackerCreator) diConstructor.get(VastErrorTrackerCreator.class), (MediaFileResourceLoaderListenerCreator) diConstructor.get(MediaFileResourceLoaderListenerCreator.class), ((Analytics) diConstructor.get(Analytics.class)).getVideoTracker(), (Function) diConstructor.get(InterstitialVideoProperties.class), (VerificationResourceMapper) diConstructor.get(VerificationResourceMapper.class));
    }

    static /* synthetic */ VideoAdInteractorProviderFunction lambda$null$3(String str, DiConstructor diConstructor) {
        return new VideoAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiVideoAdLayer.lambda$null$2(DiConstructor.this, this.f$1, (VideoAdObject) obj);
            }
        };
    }

    static /* synthetic */ VideoAdInteractor lambda$null$2(DiConstructor diConstructor, String str, VideoAdObject videoAdObject) {
        return new VideoAdInteractor((Logger) diConstructor.get(Logger.class), videoAdObject, (StateMachine) diConstructor.get(str, StateMachine.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class));
    }

    static /* synthetic */ InterstitialVideoProperties lambda$null$4(DiConstructor diConstructor) {
        return new InterstitialVideoProperties((byte) 0);
    }

    static /* synthetic */ RewardedVideoProperties lambda$null$5(DiConstructor diConstructor) {
        return new RewardedVideoProperties((byte) 0);
    }

    static /* synthetic */ VerificationResourceMapper lambda$null$6(DiConstructor diConstructor) {
        return new VerificationResourceMapper();
    }

    private static ResourceLoader<Uri, Uri> getVideoResourceLoader(DiConstructor diConstructor) {
        return (ResourceLoader) diConstructor.get(VideoDiNames.VIDEO_RESOURCE_LOADER_DI_NAME, ResourceLoader.class);
    }

    /* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer$InterstitialVideoProperties */
    static class InterstitialVideoProperties implements Function<VastMediaFileScenario, VideoTimings> {
        private InterstitialVideoProperties() {
        }

        /* synthetic */ InterstitialVideoProperties(byte b) {
            this();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return VideoTimings.create((VastMediaFileScenario) obj, 5000, true, true);
        }
    }

    /* renamed from: com.smaato.sdk.video.ad.DiVideoAdLayer$RewardedVideoProperties */
    static class RewardedVideoProperties implements Function<VastMediaFileScenario, VideoTimings> {
        private RewardedVideoProperties() {
        }

        /* synthetic */ RewardedVideoProperties(byte b) {
            this();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return VideoTimings.create((VastMediaFileScenario) obj, 5000, false, false);
        }
    }
}
