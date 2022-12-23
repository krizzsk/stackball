package com.smaato.sdk.video.vast.player;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.deeplink.LinkResolver;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.framework.VideoDiNames;
import com.smaato.sdk.video.utils.AnimationHelper;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerActionValidatorFactory;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerCreator;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerStateMachineFactory;
import com.smaato.sdk.video.vast.player.system.SystemMediaPlayerTransitionValidatorFactory;
import com.smaato.sdk.video.vast.tracking.VastBeaconTrackerCreator;
import com.smaato.sdk.video.vast.tracking.VastEventTrackerCreator;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceDataConverter;
import com.smaato.sdk.video.vast.widget.SurfaceViewVideoPlayerViewFactory;
import com.smaato.sdk.video.vast.widget.VideoPlayerViewFactory;
import com.smaato.sdk.video.vast.widget.companion.CompanionErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.companion.CompanionPresenterFactory;
import com.smaato.sdk.video.vast.widget.icon.IconErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.icon.IconPresenterFactory;

public final class DiPlayerLayer {
    private DiPlayerLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiPlayerLayer$EdC70s5nmZyl2PUy6LrpEPAfyh4.INSTANCE);
    }

    static /* synthetic */ void lambda$buildVastTrackersCreatorRegistry$3(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastEventTrackerCreator.class, $$Lambda$DiPlayerLayer$Kgs20SQDYHEyC4_bFCXYpxgi5Q4.INSTANCE);
        diRegistry.registerFactory(VastBeaconTrackerCreator.class, $$Lambda$DiPlayerLayer$ZW7rhzL8O41pmPQlI5lwbv_77iU.INSTANCE);
    }

    static /* synthetic */ VastEventTrackerCreator lambda$null$1(DiConstructor diConstructor) {
        return new VastEventTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (MacrosInjectorProviderFunction) diConstructor.get(MacrosInjectorProviderFunction.class), DiNetworkLayer.getNetworkingExecutorServiceFrom(diConstructor));
    }

    static /* synthetic */ VastBeaconTrackerCreator lambda$null$2(DiConstructor diConstructor) {
        return new VastBeaconTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (MacrosInjectorProviderFunction) diConstructor.get(MacrosInjectorProviderFunction.class), DiNetworkLayer.getNetworkingExecutorServiceFrom(diConstructor));
    }

    static /* synthetic */ void lambda$buildVastVideoPlayerCreatorRegistry$13(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastVideoPlayerCreator.class, $$Lambda$DiPlayerLayer$wLRiP9NELMEzHfCrGIVSBxRVP84.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerViewFactory.class, $$Lambda$DiPlayerLayer$lfnb0i7HZ6vRyJo2E4QTmt0wqEU.INSTANCE);
        diRegistry.registerFactory(VideoPlayerViewFactory.class, $$Lambda$DiPlayerLayer$yD1VO5NegjhAzqDQoN6ipeY0lO0.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerModelFactory.class, $$Lambda$DiPlayerLayer$lb8DsZHUhTj0_gnGfg4FIQhck.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerPresenterFactory.class, $$Lambda$DiPlayerLayer$VhArUraOyseffhHmnTWn8ZZcmX0.INSTANCE);
        diRegistry.registerFactory(VastVideoPlayerStateMachineFactory.class, $$Lambda$DiPlayerLayer$wSIWH4cuI_uZnn3w2qyosaN18sA.INSTANCE);
        diRegistry.registerFactory(VideoPlayerPresenterFactory.class, $$Lambda$DiPlayerLayer$_gx5Zh0bR_oQXzmL3B7jiLEYNU.INSTANCE);
        diRegistry.registerFactory(VideoPlayerPreparer.class, $$Lambda$DiPlayerLayer$2Hz5xTIpiIM2gzRwLlhde6dolYs.INSTANCE);
        diRegistry.registerFactory(VastScenarioResourceDataConverter.class, $$Lambda$DiPlayerLayer$xp0R6i7F0ukFZKVYbXpG7dx5sU.INSTANCE);
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiPlayerLayer$1c1Z8cjdiTsjOcCVhwj4XV8kAbY.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiPlayerLayer$thBxBAa92W_63zsdXDpcwPUX8E.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiPlayerLayer$b2Lv5f049guPQijVj_132MAZKKM.INSTANCE));
    }

    static /* synthetic */ VastVideoPlayerCreator lambda$null$4(DiConstructor diConstructor) {
        return new VastVideoPlayerCreator((VastVideoPlayerViewFactory) diConstructor.get(VastVideoPlayerViewFactory.class), (VastVideoPlayerModelFactory) diConstructor.get(VastVideoPlayerModelFactory.class), (VastVideoPlayerPresenterFactory) diConstructor.get(VastVideoPlayerPresenterFactory.class));
    }

    static /* synthetic */ VastVideoPlayerViewFactory lambda$null$5(DiConstructor diConstructor) {
        return new VastVideoPlayerViewFactory();
    }

    static /* synthetic */ VideoPlayerViewFactory lambda$null$6(DiConstructor diConstructor) {
        return new SurfaceViewVideoPlayerViewFactory();
    }

    static /* synthetic */ VastVideoPlayerModelFactory lambda$null$7(DiConstructor diConstructor) {
        return new VastVideoPlayerModelFactory((LinkResolver) diConstructor.get(LinkResolver.class), (VastEventTrackerCreator) diConstructor.get(VastEventTrackerCreator.class), (VastBeaconTrackerCreator) diConstructor.get(VastBeaconTrackerCreator.class));
    }

    static /* synthetic */ VastVideoPlayerPresenterFactory lambda$null$8(DiConstructor diConstructor) {
        return new VastVideoPlayerPresenterFactory((VideoPlayerPresenterFactory) diConstructor.get(VideoPlayerPresenterFactory.class), (CompanionPresenterFactory) diConstructor.get(CompanionPresenterFactory.class), (IconPresenterFactory) diConstructor.get(IconPresenterFactory.class), (VisibilityTrackerCreator) diConstructor.get(VideoDiNames.MODULE_DI_NAME, VisibilityTrackerCreator.class), (VastVideoPlayerStateMachineFactory) diConstructor.get(VastVideoPlayerStateMachineFactory.class));
    }

    static /* synthetic */ VastVideoPlayerStateMachineFactory lambda$null$9(DiConstructor diConstructor) {
        return new VastVideoPlayerStateMachineFactory(VastPlayerState.SHOW_VIDEO);
    }

    static /* synthetic */ VideoPlayerPresenterFactory lambda$null$10(DiConstructor diConstructor) {
        return new VideoPlayerPresenterFactory((VideoPlayerPreparer) diConstructor.get(VideoPlayerPreparer.class), (VisibilityTrackerCreator) diConstructor.get(VideoDiNames.MODULE_DI_NAME, VisibilityTrackerCreator.class), (RepeatableActionFactory) diConstructor.get(RepeatableActionFactory.class));
    }

    static /* synthetic */ VideoPlayerPreparer lambda$null$11(DiConstructor diConstructor) {
        return new VideoPlayerPreparer((VideoPlayerCreator) diConstructor.get(VideoPlayerCreator.class));
    }

    static /* synthetic */ VastScenarioResourceDataConverter lambda$null$12(DiConstructor diConstructor) {
        return new VastScenarioResourceDataConverter();
    }

    static /* synthetic */ void lambda$buildCompanionPresenterFactoryRegistry$16(DiRegistry diRegistry) {
        diRegistry.registerFactory(CompanionErrorCodeStrategy.class, $$Lambda$DiPlayerLayer$yLarcW_iYaf7Do2429kDCa284Yk.INSTANCE);
        diRegistry.registerFactory(CompanionPresenterFactory.class, $$Lambda$DiPlayerLayer$crElRLK3_eEC5urx3CQEv0EWJaA.INSTANCE);
    }

    static /* synthetic */ CompanionErrorCodeStrategy lambda$null$14(DiConstructor diConstructor) {
        return new CompanionErrorCodeStrategy();
    }

    static /* synthetic */ CompanionPresenterFactory lambda$null$15(DiConstructor diConstructor) {
        return new CompanionPresenterFactory((VastScenarioResourceDataConverter) diConstructor.get(VastScenarioResourceDataConverter.class), (VisibilityTrackerCreator) diConstructor.get("VAST_ELEMENT_VISIBILITY", VisibilityTrackerCreator.class), (VastWebComponentSecurityPolicy) diConstructor.get(VastWebComponentSecurityPolicy.class), (CompanionErrorCodeStrategy) diConstructor.get(CompanionErrorCodeStrategy.class));
    }

    static /* synthetic */ void lambda$buildIconPresenterFactoryRegistry$20(DiRegistry diRegistry) {
        diRegistry.registerFactory(IconErrorCodeStrategy.class, $$Lambda$DiPlayerLayer$ORT4c4CkNFmsg0Ief_F0C2xyjtc.INSTANCE);
        diRegistry.registerFactory(IconPresenterFactory.class, $$Lambda$DiPlayerLayer$07oogcP51kGRTq0u9Pdl4B7dR8.INSTANCE);
        diRegistry.registerFactory("ICON_ANIMATION_HELPER", AnimationHelper.class, $$Lambda$DiPlayerLayer$Jb7iJx29lDUc4Nbe8jGLIO76P3E.INSTANCE);
    }

    static /* synthetic */ IconErrorCodeStrategy lambda$null$17(DiConstructor diConstructor) {
        return new IconErrorCodeStrategy();
    }

    static /* synthetic */ IconPresenterFactory lambda$null$18(DiConstructor diConstructor) {
        return new IconPresenterFactory((VastScenarioResourceDataConverter) diConstructor.get(VastScenarioResourceDataConverter.class), (VisibilityTrackerCreator) diConstructor.get("VAST_ELEMENT_VISIBILITY", VisibilityTrackerCreator.class), (VastWebComponentSecurityPolicy) diConstructor.get(VastWebComponentSecurityPolicy.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (AnimationHelper) diConstructor.get("ICON_ANIMATION_HELPER", AnimationHelper.class), (IconErrorCodeStrategy) diConstructor.get(IconErrorCodeStrategy.class));
    }

    static /* synthetic */ AnimationHelper lambda$null$19(DiConstructor diConstructor) {
        return new AnimationHelper(300);
    }

    static /* synthetic */ RepeatableActionFactory lambda$null$21(DiConstructor diConstructor) {
        return new RepeatableActionFactory(Threads.newUiHandler());
    }

    static /* synthetic */ void lambda$buildVastElementVisibilityConfigBuilderRegistry$25(DiRegistry diRegistry) {
        diRegistry.registerFactory("VAST_ELEMENT_VISIBILITY", VisibilityPrivateConfig.class, $$Lambda$DiPlayerLayer$31EiEb5I2SgqQBnE5rzSZYLXPFg.INSTANCE);
        diRegistry.registerFactory("VAST_ELEMENT_VISIBILITY", VisibilityTrackerCreator.class, $$Lambda$DiPlayerLayer$ji1f0vX4eCdwr1cUw1hIUfJUM4Y.INSTANCE);
    }

    static /* synthetic */ VisibilityTrackerCreator lambda$null$24(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get("VAST_ELEMENT_VISIBILITY", VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), "VAST_ELEMENT_VISIBILITY");
    }

    static /* synthetic */ void lambda$buildSystemMediaPlayerRegistry$28(String str, String str2, DiRegistry diRegistry) {
        diRegistry.registerFactory(VideoPlayerCreator.class, new ClassFactory(str, str2) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiPlayerLayer.lambda$null$26(this.f$0, this.f$1, diConstructor);
            }
        });
        diRegistry.registerFactory(SystemMediaPlayerStateMachineFactory.class, $$Lambda$DiPlayerLayer$QchZXLsTpK9ZdSj4IYcCsoB2dos.INSTANCE);
        diRegistry.registerFactory(str, EventValidator.class, new SystemMediaPlayerActionValidatorFactory());
        diRegistry.registerFactory(str2, EventValidator.class, new SystemMediaPlayerTransitionValidatorFactory());
    }

    static /* synthetic */ VideoPlayerCreator lambda$null$26(String str, String str2, DiConstructor diConstructor) {
        return new SystemMediaPlayerCreator((Context) diConstructor.get(Application.class), (SystemMediaPlayerStateMachineFactory) diConstructor.get(SystemMediaPlayerStateMachineFactory.class), (EventValidator) diConstructor.get(str, EventValidator.class), (EventValidator) diConstructor.get(str2, EventValidator.class));
    }

    static /* synthetic */ SystemMediaPlayerStateMachineFactory lambda$null$27(DiConstructor diConstructor) {
        return new SystemMediaPlayerStateMachineFactory(MediaPlayerState.IDLE);
    }

    static /* synthetic */ void lambda$createRegistry$0(DiRegistry diRegistry) {
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiPlayerLayer$58WOhhaP1tIdQidY3WwKMdMxMiM.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiPlayerLayer$wDyYG1nGxz3h3bIl8dXrSrSQTI.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer("VideoModuleInterfaceSystemMediaPlayerActionValidator", "VideoModuleInterfaceSystemMediaPlayerTransitionValidator") {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                DiPlayerLayer.lambda$buildSystemMediaPlayerRegistry$28(this.f$0, this.f$1, (DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiPlayerLayer$qzoyBy5Fqw3OS3HsY3now0IgWks.INSTANCE));
    }
}
