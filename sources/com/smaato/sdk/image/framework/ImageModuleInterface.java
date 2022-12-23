package com.smaato.sdk.image.framework;

import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.VisibilityPrivateConfig;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoadingNetworkTaskCreator;
import com.smaato.sdk.core.resourceloader.ResourceTransformer;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import com.smaato.sdk.image.p252ad.DiImageAdLayer;
import com.smaato.sdk.image.p252ad.ImageAdLoaderPlugin;
import com.smaato.sdk.image.p252ad.ImageAdPresenterBuilderAdQualityViolationUtils;
import com.smaato.sdk.image.p252ad.ImageAdResponseParser;
import com.smaato.sdk.image.resourceloader.ImageNetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.image.resourceloader.ImagePersistingStrategy;
import com.smaato.sdk.image.resourceloader.ImageResourceTransformer;
import java.util.concurrent.ExecutorService;

public class ImageModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return ImageDiNames.MODULE_DI_NAME;
    }

    public String version() {
        return "21.5.7";
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        if (adFormat == AdFormat.STATIC_IMAGE) {
            return cls.isAssignableFrom(InterstitialAdPresenter.class) || cls.isAssignableFrom(BannerAdPresenter.class);
        }
        return false;
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$1(DiConstructor diConstructor) {
        return new ImageAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return ImageModuleInterface.lambda$null$0(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$ImageModuleInterface$PKIZx8XbPMtvUJosV6bl5RKEUL4.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$0(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, AdPresenterBuilder.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                ImageModuleInterface.this.lambda$moduleDiRegistry$6$ImageModuleInterface((DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ ImageAdPresenterBuilderAdQualityViolationUtils lambda$null$2(DiConstructor diConstructor) {
        return new ImageAdPresenterBuilderAdQualityViolationUtils();
    }

    static /* synthetic */ ImageAdResponseParser lambda$null$3(DiConstructor diConstructor) {
        return new ImageAdResponseParser(DiLogLayer.getLoggerFrom(diConstructor));
    }

    public /* synthetic */ VisibilityTrackerCreator lambda$null$5$ImageModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), moduleDiName());
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiImageAdLayer.createRegistry(adPresenterNameShaper, moduleDiName());
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public /* synthetic */ ResourceLoader lambda$setupResourceLoaderDiRegistry$7$ImageModuleInterface(DiConstructor diConstructor) {
        Logger loggerFrom = DiLogLayer.getLoggerFrom(diConstructor);
        Objects.requireNonNull(diConstructor);
        return new ResourceLoader(loggerFrom, (ResourceLoadingNetworkTaskCreator) diConstructor.get(moduleDiName(), ResourceLoadingNetworkTaskCreator.class), (ExecutorService) diConstructor.get("ImageModuleInterfaceRESOURCE_LOADING_DEVICE_LOCAL_EXECUTOR", ExecutorService.class), (PersistingStrategy) diConstructor.get(ImagePersistingStrategy.class), (ResourceTransformer) diConstructor.get(ImageResourceTransformer.class));
    }

    static /* synthetic */ ResourceLoadingNetworkTaskCreator lambda$setupResourceLoaderDiRegistry$9(DiConstructor diConstructor) {
        return new ResourceLoadingNetworkTaskCreator(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getNetworkActionsFrom(diConstructor), ErrorMapper.NETWORK_LAYER_EXCEPTION, (ExecutorService) diConstructor.get("ImageModuleInterfaceRESOURCE_LOADING_NETWORK_EXECUTOR", ExecutorService.class), (NetworkResourceStreamPreparationStrategy) diConstructor.get(ImageNetworkResourceStreamPreparationStrategy.class));
    }

    static /* synthetic */ ImageNetworkResourceStreamPreparationStrategy lambda$setupResourceLoaderDiRegistry$11(DiConstructor diConstructor) {
        return new ImageNetworkResourceStreamPreparationStrategy((HeaderUtils) diConstructor.get(HeaderUtils.class));
    }

    static /* synthetic */ ImagePersistingStrategy lambda$setupResourceLoaderDiRegistry$12(DiConstructor diConstructor) {
        return new ImagePersistingStrategy();
    }

    static /* synthetic */ ImageResourceTransformer lambda$setupResourceLoaderDiRegistry$13(DiConstructor diConstructor) {
        return new ImageResourceTransformer();
    }

    public String toString() {
        return "ImageModuleInterface{supportedFormat: " + AdFormat.STATIC_IMAGE + "}";
    }

    public /* synthetic */ void lambda$moduleDiRegistry$6$ImageModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(moduleDiName(), ResourceLoader.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return ImageModuleInterface.this.lambda$setupResourceLoaderDiRegistry$7$ImageModuleInterface(diConstructor);
            }
        });
        diRegistry.registerSingletonFactory("ImageModuleInterfaceRESOURCE_LOADING_DEVICE_LOCAL_EXECUTOR", ExecutorService.class, $$Lambda$ImageModuleInterface$hudHLNrDI2QS_FmYA1W7_9tQ1gM.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), ResourceLoadingNetworkTaskCreator.class, $$Lambda$ImageModuleInterface$Nfl7KL1WRGbW0YUFbZyCBzKeMGI.INSTANCE);
        diRegistry.registerSingletonFactory("ImageModuleInterfaceRESOURCE_LOADING_NETWORK_EXECUTOR", ExecutorService.class, $$Lambda$ImageModuleInterface$HDUrxe7iV5pvPs3E1_ILOqPog.INSTANCE);
        diRegistry.registerFactory(ImageNetworkResourceStreamPreparationStrategy.class, $$Lambda$ImageModuleInterface$KGBTDcrs3DHs3NxVK2n6V6u5lIU.INSTANCE);
        diRegistry.registerFactory(ImagePersistingStrategy.class, $$Lambda$ImageModuleInterface$LthG0EfXab9SBls3NFIdICwt3U.INSTANCE);
        diRegistry.registerFactory(ImageResourceTransformer.class, $$Lambda$ImageModuleInterface$Q9NTtdLJ4kjdnq1oUWBNJ6eNr6g.INSTANCE);
        diRegistry.registerSingletonFactory(ImageAdPresenterBuilderAdQualityViolationUtils.class, $$Lambda$ImageModuleInterface$f_neynVAixE51uMOhBcSRYWg3vo.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), ImageAdResponseParser.class, $$Lambda$ImageModuleInterface$jlACv0uOw5C5owuPImgDANQbCo.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$ImageModuleInterface$MkSUD14gOhel2G__1cuU9EQqR4.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return ImageModuleInterface.this.lambda$null$5$ImageModuleInterface(diConstructor);
            }
        });
    }
}
