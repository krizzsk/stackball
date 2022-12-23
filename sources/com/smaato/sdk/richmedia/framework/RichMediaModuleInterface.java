package com.smaato.sdk.richmedia.framework;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p248ad.RequestInfoMapper;
import com.smaato.sdk.core.p248ad.RequestInfoProvider;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeContentObserver;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidSupportsProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume;
import com.smaato.sdk.richmedia.p255ad.DiRichMediaAdLayer;
import com.smaato.sdk.richmedia.p255ad.LoadedWebViewCache;
import com.smaato.sdk.richmedia.p255ad.RichMediaAdLoaderPlugin;
import com.smaato.sdk.richmedia.p255ad.RichMediaAdResponseParser;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.p256di.DiNames;
import com.smaato.sdk.richmedia.util.RichMediaHtmlUtils;

public class RichMediaModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return DiNames.MODULE_DI_NAME;
    }

    public String version() {
        return "21.5.7";
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        if (adFormat == AdFormat.RICH_MEDIA) {
            return cls.isAssignableFrom(InterstitialAdPresenter.class) || cls.isAssignableFrom(BannerAdPresenter.class);
        }
        return false;
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new RichMediaAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return RichMediaModuleInterface.lambda$null$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$RichMediaModuleInterface$QNLl3GIgP8DouiOrBZ_gmg4JEk.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, AdPresenterBuilder.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                RichMediaModuleInterface.this.lambda$moduleDiRegistry$8$RichMediaModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$8$RichMediaModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), RichMediaHtmlUtils.class, $$Lambda$RichMediaModuleInterface$LnlGX0e6Tft9ZhZ6WOYzWY8WPc.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), MraidConfigurator.class, $$Lambda$RichMediaModuleInterface$Zgk7BUbdRPOqPO9CDMHHSQL3XI.INSTANCE);
        diRegistry.registerFactory(MraidStateMachineFactory.class, $$Lambda$RichMediaModuleInterface$yb_wehTdQ33crVS2UJwCcXOimmo.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), RichMediaAdResponseParser.class, $$Lambda$RichMediaModuleInterface$L3vzA0dteV5jxT7AEVK9KEvtcQ.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$RichMediaModuleInterface$PZNzEkRgMkWDvBwQi6yHyfcTDUc.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), RichMediaVisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RichMediaModuleInterface.this.lambda$null$7$RichMediaModuleInterface(diConstructor);
            }
        });
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$RichMediaModuleInterface$7e3a4qQDNux03NGv6RFLRQ9ptJA.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                RichMediaModuleInterface.this.mo56032x20b89d34((DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$RichMediaModuleInterface$Z5SK5vrJStgUJVK420RfIRwPs.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$RichMediaModuleInterface$fxqjUICLDrie0GVQvt_g5qNLlyg.INSTANCE));
    }

    static /* synthetic */ RichMediaHtmlUtils lambda$null$2(DiConstructor diConstructor) {
        return new RichMediaHtmlUtils((Boolean) diConstructor.get(CoreDiNames.NAME_IS_LOGGING_ENABLED, Boolean.class));
    }

    static /* synthetic */ MraidConfigurator lambda$null$3(DiConstructor diConstructor) {
        return new MraidConfigurator((AppBackgroundAwareHandler) diConstructor.get(AppBackgroundAwareHandler.class), (OrientationChangeWatcher) diConstructor.get(OrientationChangeWatcher.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), DiLogLayer.getLoggerFrom(diConstructor), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (MraidStateMachineFactory) diConstructor.get(MraidStateMachineFactory.class), (RichMediaWebViewFactory) diConstructor.get(RichMediaWebViewFactory.class), (RequestInfoMapper) diConstructor.get(RequestInfoMapper.class), (MraidSupportsProperties) diConstructor.get(MraidSupportsProperties.class), (AudioVolumeObserver) diConstructor.get(AudioVolumeObserver.class), (MusicPlaybackVolume) diConstructor.get(MusicPlaybackVolume.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class));
    }

    static /* synthetic */ MraidStateMachineFactory lambda$null$4(DiConstructor diConstructor) {
        return new MraidStateMachineFactory(MraidStateMachineFactory.State.LOADING);
    }

    static /* synthetic */ RichMediaAdResponseParser lambda$null$5(DiConstructor diConstructor) {
        return new RichMediaAdResponseParser(DiLogLayer.getLoggerFrom(diConstructor));
    }

    public /* synthetic */ RichMediaVisibilityTrackerCreator lambda$null$7$RichMediaModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new RichMediaVisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class));
    }

    static /* synthetic */ void lambda$provideAudioVolumeObserver$12(DiRegistry diRegistry) {
        diRegistry.registerFactory(AudioVolumeContentObserver.class, $$Lambda$RichMediaModuleInterface$P2gqH16dVh62qfwFKjkFxv_ucbo.INSTANCE);
        diRegistry.registerSingletonFactory(AudioVolumeObserver.class, $$Lambda$RichMediaModuleInterface$CMdhwXdSTqywchombywolTIOvJU.INSTANCE);
        diRegistry.registerSingletonFactory(MusicPlaybackVolume.class, $$Lambda$RichMediaModuleInterface$o82ySSAI64QjvUHQLabIsJCPDvQ.INSTANCE);
    }

    static /* synthetic */ AudioVolumeContentObserver lambda$null$9(DiConstructor diConstructor) {
        MusicPlaybackVolume musicPlaybackVolume = (MusicPlaybackVolume) diConstructor.get(MusicPlaybackVolume.class);
        return new AudioVolumeContentObserver((Context) diConstructor.get(Application.class), musicPlaybackVolume, ChangeSenderUtils.createUniqueValueChangeSender(Integer.valueOf(musicPlaybackVolume.getCurrentVolume())));
    }

    static /* synthetic */ AudioVolumeObserver lambda$null$10(DiConstructor diConstructor) {
        return new AudioVolumeObserver((AudioVolumeContentObserver) diConstructor.get(AudioVolumeContentObserver.class), ((MusicPlaybackVolume) diConstructor.get(MusicPlaybackVolume.class)).getMaxVolume());
    }

    static /* synthetic */ MusicPlaybackVolume lambda$null$11(DiConstructor diConstructor) {
        return new MusicPlaybackVolume((AudioManager) ((Application) diConstructor.get(Application.class)).getSystemService("audio"));
    }

    static /* synthetic */ void lambda$provideOrientationChangeWatcher$15(DiRegistry diRegistry) {
        diRegistry.registerFactory(OrientationBroadcastReceiver.class, $$Lambda$RichMediaModuleInterface$IfwPvjPyfT377KRK4YFlIo4eAg.INSTANCE);
        diRegistry.registerSingletonFactory(OrientationChangeWatcher.class, $$Lambda$RichMediaModuleInterface$8tqG4Klj7ExiAc6TwLyklhJqV5U.INSTANCE);
    }

    static /* synthetic */ OrientationBroadcastReceiver lambda$null$13(DiConstructor diConstructor) {
        return new OrientationBroadcastReceiver((Context) diConstructor.get(Application.class), ChangeSenderUtils.createChangeSender(Whatever.INSTANCE));
    }

    static /* synthetic */ OrientationChangeWatcher lambda$null$14(DiConstructor diConstructor) {
        return new OrientationChangeWatcher((OrientationBroadcastReceiver) diConstructor.get(OrientationBroadcastReceiver.class));
    }

    /* renamed from: lambda$provideRichMediaWebViewFactory$17$RichMediaModuleInterface */
    public /* synthetic */ void mo56032x20b89d34(DiRegistry diRegistry) {
        diRegistry.registerFactory(RichMediaWebViewFactory.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RichMediaModuleInterface.this.lambda$null$16$RichMediaModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ RichMediaWebViewFactory lambda$null$16$RichMediaModuleInterface(DiConstructor diConstructor) {
        return new RichMediaWebViewFactory(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaHtmlUtils) diConstructor.get(moduleDiName(), RichMediaHtmlUtils.class));
    }

    static /* synthetic */ MraidSupportsProperties lambda$null$18(DiConstructor diConstructor) {
        return new MraidSupportsProperties((AppMetaData) diConstructor.get(AppMetaData.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class));
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRichMediaAdLayer.createRegistry(adPresenterNameShaper, moduleDiName());
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "RichMediaModuleInterface{supportedFormat: " + AdFormat.RICH_MEDIA + "}";
    }
}
