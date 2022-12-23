package com.smaato.sdk.image.p252ad;

import android.graphics.Bitmap;
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
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import java.io.InputStream;

/* renamed from: com.smaato.sdk.image.ad.DiImageAdLayer */
public final class DiImageAdLayer {

    /* renamed from: com.smaato.sdk.image.ad.DiImageAdLayer$ImageAdInteractorProviderFunction */
    interface ImageAdInteractorProviderFunction extends Function<ImageAdObject, ImageAdInteractor> {
    }

    private DiImageAdLayer() {
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
                DiImageAdLayer.lambda$createRegistry$9(AdPresenterNameShaper.this, this.f$1, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$9(AdPresenterNameShaper adPresenterNameShaper, String str, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.STATIC_IMAGE, InterstitialAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str, adPresenterNameShaper) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$null$0(this.f$0, this.f$1, diConstructor);
            }
        });
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.STATIC_IMAGE, BannerAdPresenter.class), AdPresenterBuilder.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$null$1(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory("ImageModuleInterfacebannerImage", ImageAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$null$3(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory("ImageModuleInterfaceinterstitialImage", ImageAdInteractorProviderFunction.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiImageAdLayer.lambda$null$5(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(str, StateMachine.class, $$Lambda$DiImageAdLayer$m99tclsOQiT3XWTypgDKS8rCrY8.INSTANCE);
        diRegistry.registerFactory("ImageModuleInterfacebannerImage", ImpressionDetector.class, $$Lambda$DiImageAdLayer$dKNCJ8DvD4Y0ELATfFV_nSnIa64.INSTANCE);
        diRegistry.registerFactory("ImageModuleInterfaceinterstitialImage", ImpressionDetector.class, $$Lambda$DiImageAdLayer$CEkckPcCQJatA2rc41J3BCieTw.INSTANCE);
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(String str, AdPresenterNameShaper adPresenterNameShaper, DiConstructor diConstructor) {
        return new InterstitialImageAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (Function) diConstructor.get("ImageModuleInterfaceinterstitialImage", ImageAdInteractorProviderFunction.class), (ImageAdResponseParser) diConstructor.get(str, ImageAdResponseParser.class), (VisibilityTrackerCreator) diConstructor.get(str, VisibilityTrackerCreator.class), (Timer) diConstructor.get(adPresenterNameShaper.shapeName(AdFormat.INTERSTITIAL, InterstitialAdPresenter.class), Timer.class), getImageResourceLoader(str, diConstructor), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (ImageAdPresenterBuilderAdQualityViolationUtils) diConstructor.get(ImageAdPresenterBuilderAdQualityViolationUtils.class));
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$1(String str, DiConstructor diConstructor) {
        return new BannerImageAdPresenterBuilder(DiLogLayer.getLoggerFrom(diConstructor), (Function) diConstructor.get("ImageModuleInterfacebannerImage", ImageAdInteractorProviderFunction.class), (ImageAdResponseParser) diConstructor.get(str, ImageAdResponseParser.class), (VisibilityTrackerCreator) diConstructor.get(str, VisibilityTrackerCreator.class), getImageResourceLoader(str, diConstructor), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), (ImageAdPresenterBuilderAdQualityViolationUtils) diConstructor.get(ImageAdPresenterBuilderAdQualityViolationUtils.class));
    }

    static /* synthetic */ ImageAdInteractorProviderFunction lambda$null$3(String str, DiConstructor diConstructor) {
        return new ImageAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiImageAdLayer.lambda$null$2(DiConstructor.this, this.f$1, (ImageAdObject) obj);
            }
        };
    }

    static /* synthetic */ ImageAdInteractor lambda$null$2(DiConstructor diConstructor, String str, ImageAdObject imageAdObject) {
        return new ImageAdInteractor((Logger) diConstructor.get(Logger.class), imageAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkResolver) diConstructor.get(LinkResolver.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("ImageModuleInterfacebannerImage", ImpressionDetector.class));
    }

    static /* synthetic */ ImageAdInteractorProviderFunction lambda$null$5(String str, DiConstructor diConstructor) {
        return new ImageAdInteractorProviderFunction(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiImageAdLayer.lambda$null$4(DiConstructor.this, this.f$1, (ImageAdObject) obj);
            }
        };
    }

    static /* synthetic */ ImageAdInteractor lambda$null$4(DiConstructor diConstructor, String str, ImageAdObject imageAdObject) {
        return new ImageAdInteractor((Logger) diConstructor.get(Logger.class), imageAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(str, StateMachine.class), (LinkResolver) diConstructor.get(LinkResolver.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get("ImageModuleInterfaceinterstitialImage", ImpressionDetector.class));
    }

    static /* synthetic */ ImpressionDetector lambda$null$7(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.CREATED);
    }

    static /* synthetic */ ImpressionDetector lambda$null$8(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.IMPRESSED);
    }

    private static ResourceLoader<InputStream, Bitmap> getImageResourceLoader(String str, DiConstructor diConstructor) {
        Objects.requireNonNull(diConstructor);
        return (ResourceLoader) diConstructor.get(str, ResourceLoader.class);
    }
}
