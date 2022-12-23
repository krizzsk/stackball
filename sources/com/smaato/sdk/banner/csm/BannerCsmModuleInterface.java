package com.smaato.sdk.banner.csm;

import android.app.Application;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdInteractorProviderFunction;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import java.util.ServiceLoader;

public final class BannerCsmModuleInterface implements AdPresenterModuleInterface {
    public final String moduleDiName() {
        return "BANNER_CSM_DI_NAME";
    }

    public final String version() {
        return "21.5.7";
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new BannerCsmAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return BannerCsmModuleInterface.lambda$null$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public final ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$BannerCsmModuleInterface$mPVhqufUUuEW01LSlZxcdTTFy8.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(DiConstructor diConstructor, String str) {
        return (BannerCsmAdPresenterBuilderImpl) DiAdLayer.tryGetOrNull(diConstructor, str, BannerCsmAdPresenterBuilderImpl.class);
    }

    public final boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return adFormat == AdFormat.CSM && BannerAdPresenter.class.isAssignableFrom(cls);
    }

    public final DiRegistry moduleDiRegistry() {
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                BannerCsmModuleInterface.this.lambda$moduleDiRegistry$8$BannerCsmModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$8$BannerCsmModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), CsmAdInteractorProviderFunction.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerCsmModuleInterface.this.lambda$null$3$BannerCsmModuleInterface(diConstructor);
            }
        });
        diRegistry.registerFactory(moduleDiName(), ImpressionDetector.class, $$Lambda$BannerCsmModuleInterface$z1U7IMtpCyZ_EkK1AjSu0aGs9ro.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), StateMachine.class, $$Lambda$BannerCsmModuleInterface$mQCPJhiIIwVcoO4v3MgVtKd01Bs.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$BannerCsmModuleInterface$OKskNmyRfFqo41yXQZio32HPhU.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerCsmModuleInterface.this.lambda$null$7$BannerCsmModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ CsmAdInteractorProviderFunction lambda$null$3$BannerCsmModuleInterface(DiConstructor diConstructor) {
        return new CsmAdInteractorProviderFunction(diConstructor) {
            public final /* synthetic */ DiConstructor f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return BannerCsmModuleInterface.this.lambda$null$2$BannerCsmModuleInterface(this.f$1, (CsmAdObject) obj);
            }
        };
    }

    public /* synthetic */ CsmAdInteractor lambda$null$2$BannerCsmModuleInterface(DiConstructor diConstructor, CsmAdObject csmAdObject) {
        return new CsmAdInteractor(DiLogLayer.getLoggerFrom(diConstructor), csmAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(moduleDiName(), StateMachine.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get(moduleDiName(), ImpressionDetector.class));
    }

    static /* synthetic */ ImpressionDetector lambda$null$4(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.CREATED);
    }

    public /* synthetic */ VisibilityTrackerCreator lambda$null$7$BannerCsmModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), moduleDiName());
    }

    public final DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRegistry.m24065of(new Consumer(adPresenterNameShaper) {
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BannerCsmModuleInterface.this.lambda$moduleAdPresenterDiRegistry$10$BannerCsmModuleInterface(this.f$1, (DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleAdPresenterDiRegistry$10$BannerCsmModuleInterface(AdPresenterNameShaper adPresenterNameShaper, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.CSM, BannerAdPresenter.class), BannerCsmAdPresenterBuilderImpl.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerCsmModuleInterface.this.lambda$null$9$BannerCsmModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ BannerCsmAdPresenterBuilderImpl lambda$null$9$BannerCsmModuleInterface(DiConstructor diConstructor) {
        return new BannerCsmAdPresenterBuilderImpl((Function) diConstructor.get(moduleDiName(), CsmAdInteractorProviderFunction.class), (VisibilityTrackerCreator) diConstructor.get(moduleDiName(), VisibilityTrackerCreator.class), ServiceLoader.load(SMABannerNetworkEvent.class, ((Application) diConstructor.get(Application.class)).getClassLoader()), (CsmAdResponseParser) diConstructor.get(CsmAdResponseParser.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    public final ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public final String toString() {
        return "BannerCsmModuleInterface{supportedFormat: " + AdFormat.CSM + "}";
    }
}
