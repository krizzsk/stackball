package com.smaato.sdk.rewarded.csm;

import android.app.Application;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdInteractorProviderFunction;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import java.util.ServiceLoader;

public final class RewardedCsmModuleInterface implements AdPresenterModuleInterface {
    public final String moduleDiName() {
        return "REWARDED_CSM_DI_NAME";
    }

    public final String version() {
        return "21.5.7";
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new RewardedCsmAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return RewardedCsmModuleInterface.lambda$null$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public final ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$RewardedCsmModuleInterface$2RltwbP3EIK_JI1EuyfcBpjek.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(DiConstructor diConstructor, String str) {
        return (RewardedCsmAdPresenterBuilderImpl) DiAdLayer.tryGetOrNull(diConstructor, str, RewardedCsmAdPresenterBuilderImpl.class);
    }

    public final boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return adFormat == AdFormat.CSM && RewardedAdPresenter.class.isAssignableFrom(cls);
    }

    public final DiRegistry moduleDiRegistry() {
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                RewardedCsmModuleInterface.this.lambda$moduleDiRegistry$6$RewardedCsmModuleInterface((DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleDiRegistry$6$RewardedCsmModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), CsmAdInteractorProviderFunction.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RewardedCsmModuleInterface.this.lambda$null$3$RewardedCsmModuleInterface(diConstructor);
            }
        });
        diRegistry.registerFactory(moduleDiName(), ImpressionDetector.class, $$Lambda$RewardedCsmModuleInterface$99Pe7Amovp4OZg7QyKohsDTnm8c.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), StateMachine.class, $$Lambda$RewardedCsmModuleInterface$2W9o99T3ieOZYfj4zjzlIUguYgY.INSTANCE);
    }

    public /* synthetic */ CsmAdInteractorProviderFunction lambda$null$3$RewardedCsmModuleInterface(DiConstructor diConstructor) {
        return new CsmAdInteractorProviderFunction(diConstructor) {
            public final /* synthetic */ DiConstructor f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return RewardedCsmModuleInterface.this.lambda$null$2$RewardedCsmModuleInterface(this.f$1, (CsmAdObject) obj);
            }
        };
    }

    public /* synthetic */ CsmAdInteractor lambda$null$2$RewardedCsmModuleInterface(DiConstructor diConstructor, CsmAdObject csmAdObject) {
        return new CsmAdInteractor(DiLogLayer.getLoggerFrom(diConstructor), csmAdObject, DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (StateMachine) diConstructor.get(moduleDiName(), StateMachine.class), (OneTimeActionFactory) diConstructor.get(OneTimeActionFactory.class), (ImpressionDetector) diConstructor.get(moduleDiName(), ImpressionDetector.class));
    }

    static /* synthetic */ ImpressionDetector lambda$null$4(DiConstructor diConstructor) {
        return new ImpressionDetector(AdStateMachine.State.IMPRESSED);
    }

    public final DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRegistry.m24065of(new Consumer(adPresenterNameShaper) {
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                RewardedCsmModuleInterface.this.lambda$moduleAdPresenterDiRegistry$8$RewardedCsmModuleInterface(this.f$1, (DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleAdPresenterDiRegistry$8$RewardedCsmModuleInterface(AdPresenterNameShaper adPresenterNameShaper, DiRegistry diRegistry) {
        diRegistry.registerFactory(adPresenterNameShaper.shapeName(AdFormat.CSM, RewardedAdPresenter.class), RewardedCsmAdPresenterBuilderImpl.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return RewardedCsmModuleInterface.this.lambda$null$7$RewardedCsmModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ RewardedCsmAdPresenterBuilderImpl lambda$null$7$RewardedCsmModuleInterface(DiConstructor diConstructor) {
        return new RewardedCsmAdPresenterBuilderImpl((Function) diConstructor.get(moduleDiName(), CsmAdInteractorProviderFunction.class), ServiceLoader.load(SMARewardedNetworkEvent.class, ((Application) diConstructor.get(Application.class)).getClassLoader()), (CsmAdResponseParser) diConstructor.get(CsmAdResponseParser.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    public final ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public final String toString() {
        return "RewardedCsmModuleInterface{supportedFormat: " + AdFormat.CSM + "}";
    }
}
