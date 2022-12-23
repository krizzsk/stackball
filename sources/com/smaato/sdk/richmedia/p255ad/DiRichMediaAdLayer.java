package com.smaato.sdk.richmedia.p255ad;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.analytics.Analytics;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.deeplink.LinkResolver;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.util.SdkSchedulers;

/* renamed from: com.smaato.sdk.richmedia.ad.DiRichMediaAdLayer */
public final class DiRichMediaAdLayer {

    /* renamed from: com.smaato.sdk.richmedia.ad.DiRichMediaAdLayer$RichMediaAdInteractorProviderFunction */
    interface RichMediaAdInteractorProviderFunction extends Function<RichMediaAdObject, RichMediaAdInteractor> {
    }

    private DiRichMediaAdLayer() {
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
                DiRichMediaAdLayer.lambda$createRegistry$11(AdPresenterNameShaper.this, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$11(AdPresenterNameShaper adPresenterNameShaper, String str, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.RICH_MEDIA, InterstitialAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str, adPresenterNameShaper) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$null$0(this.f$0, this.f$1, diConstructor);
            }
        });
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.RICH_MEDIA, BannerAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$null$1(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(WebViewRendererImpl.class, $$Lambda$DiRichMediaAdLayer$1jKnQJHB7XSUlY1NPwOhNmWvP9c.INSTANCE);
        diRegistry.registerSingletonFactory(LoadedWebViewCache.class, $$Lambda$DiRichMediaAdLayer$yBWpPCw8XXYlbKVg7Ncys5V2rcI.INSTANCE);
        diRegistry.registerFactory("RichMediaModuleInterfacebannerRichMedia", RichMediaAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$null$5(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory("RichMediaModuleInterfaceinterstitialRichMedia", RichMediaAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiRichMediaAdLayer.lambda$null$7(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(str, StateMachine.class, $$Lambda$DiRichMediaAdLayer$AUz8Dk3EU_rF4TJql7LicOonfE8.INSTANCE);
        diRegistry.registerFactory("RichMediaModuleInterfacebannerRichMedia", ImpressionDetector.class, $$Lambda$DiRichMediaAdLayer$TnIAPWuiQz0vqhN_9sYDdMsDX0.INSTANCE);
        diRegistry.registerFactory("RichMediaModuleInterfaceinterstitialRichMedia", ImpressionDetector.class, $$Lambda$DiRichMediaAdLayer$FeD3QhZ0tOd_AAug2xZ4nZoKpCo.INSTANCE);
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(String str, AdPresenterNameShaper adPresenterNameShaper, DiConstructor diConstructor) {
        return new InterstitialRichMediaAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaAdResponseParser) diConstructor.get(str, RichMediaAdResponseParser.class), (RichMediaVisibilityTrackerCreator) diConstructor.get(str, RichMediaVisibilityTrackerCreator.class), (Timer) diConstructor.get(adPresenterNameShaper.shapeName(AdFormat.INTERSTITIAL, InterstitialAdPresenter.class), Timer.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (MraidConfigurator) diConstructor.get(str, MraidConfigurator.class), (Function) diConstructor.get("RichMediaModuleInterfaceinterstitialRichMedia", RichMediaAdInteractorProviderFunction.class), ((Analytics) diConstructor.get(Analytics.class)).getWebViewTracker(), (WebViewRenderer) diConstructor.get(WebViewRendererImpl.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$1(String str, DiConstructor diConstructor) {
        return new BannerRichMediaAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (RichMediaAdResponseParser) diConstructor.get(str, RichMediaAdResponseParser.class), (RichMediaVisibilityTrackerCreator) diConstructor.get(str, RichMediaVisibilityTrackerCreator.class), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (MraidConfigurator) diConstructor.get(str, MraidConfigurator.class), (Function) diConstructor.get("RichMediaModuleInterfacebannerRichMedia", RichMediaAdInteractorProviderFunction.class), ((Analytics) diConstructor.get(Analytics.class)).getWebViewTracker(), (WebViewRenderer) diConstructor.get(WebViewRendererImpl.class), (LoadedWebViewCache) diConstructor.get(LoadedWebViewCache.class));
    }

    static /* synthetic */ WebViewRendererImpl lambda$null$2(DiConstructor diConstructor) {
        return new WebViewRendererImpl((Context) diConstructor.get(Application.class), new SdkSchedulers(), (RichMediaWebViewFactory) diConstructor.get(RichMediaWebViewFactory.class));
    }

    static /* synthetic */ LoadedWebViewCache lambda$null$3(DiConstructor diConstructor) {
        return new LoadedWebViewCache();
    }

    static /* synthetic */ RichMediaAdInteractorProviderFunction lambda$null$5(String str, DiConstructor diConstructor) {
        return new RichMediaAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiRichMediaAdLayer.lambda$null$4(DiConstructor.this, this.f$1, (RichMediaAdObject) obj);
            }
        };
    }

    static /* synthetic */ RichMediaAdInteractor lambda$null$4(DiConstructor diConstructor, String str, RichMediaAdObject richMediaAdObject) {
        return new RichMediaAdInteractor((Logger) diConstructor.get(Logger.class), richMediaAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkResolver) diConstructor.get(LinkResolver.class), (AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("RichMediaModuleInterfacebannerRichMedia", ImpressionDetector.class));
    }

    static /* synthetic */ RichMediaAdInteractorProviderFunction lambda$null$7(String str, DiConstructor diConstructor) {
        return new RichMediaAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiRichMediaAdLayer.lambda$null$6(DiConstructor.this, this.f$1, (RichMediaAdObject) obj);
            }
        };
    }

    static /* synthetic */ RichMediaAdInteractor lambda$null$6(DiConstructor diConstructor, String str, RichMediaAdObject richMediaAdObject) {
        return new RichMediaAdInteractor((Logger) diConstructor.get(Logger.class), richMediaAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkResolver) diConstructor.get(LinkResolver.class), (AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("RichMediaModuleInterfaceinterstitialRichMedia", ImpressionDetector.class));
    }

    static /* synthetic */ ImpressionDetector lambda$null$9(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.CREATED);
    }

    static /* synthetic */ ImpressionDetector lambda$null$10(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.IMPRESSED);
    }
}
