package com.smaato.sdk.video.framework;

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
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.resourceloader.DiResourceLoaderLayer;
import com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoadingNetworkTaskCreator;
import com.smaato.sdk.core.resourceloader.ResourceTransformer;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import com.smaato.sdk.core.webview.BaseWebChromeClient;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.video.network.StaticWrapperLoaderExecutioner;
import com.smaato.sdk.video.network.VastParsingConsumerFactory;
import com.smaato.sdk.video.p258ad.DiVideoAdLayer;
import com.smaato.sdk.video.p258ad.MediaFileResourceLoaderListenerCreator;
import com.smaato.sdk.video.p258ad.VastErrorTrackerCreator;
import com.smaato.sdk.video.p258ad.VideoAdLoaderPlugin;
import com.smaato.sdk.video.p258ad.VideoStateMachineFactory;
import com.smaato.sdk.video.resourceloader.VideoNetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.video.resourceloader.VideoPersistingStrategy;
import com.smaato.sdk.video.resourceloader.VideoResourceTransformer;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.build.InLineAdContainerPicker;
import com.smaato.sdk.video.vast.build.InLineChecker;
import com.smaato.sdk.video.vast.build.VastCompanionPicker;
import com.smaato.sdk.video.vast.build.VastCompanionScenarioMapper;
import com.smaato.sdk.video.vast.build.VastCompanionScenarioMerger;
import com.smaato.sdk.video.vast.build.VastIconScenarioMapper;
import com.smaato.sdk.video.vast.build.VastIconScenarioPicker;
import com.smaato.sdk.video.vast.build.VastLinearMediaFilePicker;
import com.smaato.sdk.video.vast.build.VastMediaFileScenarioMapper;
import com.smaato.sdk.video.vast.build.VastMediaFileScenarioMerger;
import com.smaato.sdk.video.vast.build.VastMediaFileScenarioWrapperMapper;
import com.smaato.sdk.video.vast.build.VastScenarioCreativeDataMapper;
import com.smaato.sdk.video.vast.build.VastScenarioMapper;
import com.smaato.sdk.video.vast.build.VastScenarioPicker;
import com.smaato.sdk.video.vast.build.VastScenarioWrapperMapper;
import com.smaato.sdk.video.vast.build.VastScenarioWrapperMerger;
import com.smaato.sdk.video.vast.build.VastTreeBuilder;
import com.smaato.sdk.video.vast.build.VastWrapperCompanionScenarioPicker;
import com.smaato.sdk.video.vast.build.VideoClicksMerger;
import com.smaato.sdk.video.vast.build.ViewableImpressionMerger;
import com.smaato.sdk.video.vast.build.WrapperAdContainerPicker;
import com.smaato.sdk.video.vast.build.WrapperLoader;
import com.smaato.sdk.video.vast.build.WrapperLoaderErrorMapper;
import com.smaato.sdk.video.vast.build.WrapperResolver;
import com.smaato.sdk.video.vast.config.DefaultWrapperResolverConfig;
import com.smaato.sdk.video.vast.config.WrapperResolverConfig;
import com.smaato.sdk.video.vast.parser.RegistryXmlParser;
import com.smaato.sdk.video.vast.parser.RegistryXmlParserFactory;
import com.smaato.sdk.video.vast.parser.VastResponseParser;
import com.smaato.sdk.video.vast.player.DiPlayerLayer;
import com.smaato.sdk.video.vast.tracking.macro.DiMacros;
import com.smaato.sdk.video.vast.tracking.macro.MacrosInjectorProviderFunction;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

public class VideoModuleInterface implements AdPresenterModuleInterface {
    public String moduleDiName() {
        return VideoDiNames.MODULE_DI_NAME;
    }

    public String version() {
        return "21.5.7";
    }

    static /* synthetic */ WrapperResolverConfig lambda$null$0(DiConstructor diConstructor) {
        return new DefaultWrapperResolverConfig();
    }

    static /* synthetic */ void lambda$buildNewStaticWrapperLoaderExecutionerRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(StaticWrapperLoaderExecutioner.class, $$Lambda$VideoModuleInterface$3x3fMFuYHki5WZv7m1jIIGdyryo.INSTANCE);
        diRegistry.registerFactory(VastParsingConsumerFactory.class, $$Lambda$VideoModuleInterface$rMScoFZCOTMC9jcujXLXvL5AiIs.INSTANCE);
    }

    static /* synthetic */ StaticWrapperLoaderExecutioner lambda$null$2(DiConstructor diConstructor) {
        return new StaticWrapperLoaderExecutioner(DiNetworkLayer.getNetworkActionsFrom(diConstructor), (VastParsingConsumerFactory) diConstructor.get(VastParsingConsumerFactory.class), Executors.newSingleThreadExecutor());
    }

    static /* synthetic */ VastParsingConsumerFactory lambda$null$3(DiConstructor diConstructor) {
        return new VastParsingConsumerFactory((Logger) diConstructor.get(Logger.class), (VastResponseParser) diConstructor.get(VastResponseParser.class), ErrorMapper.STANDARD);
    }

    public /* synthetic */ void lambda$buildVastWebComponentRegistry$9$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastWebComponentSecurityPolicy.class, $$Lambda$VideoModuleInterface$X95hKAx00gE0f8AHHiaLdqS8.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), BaseWebViewClient.class, $$Lambda$VideoModuleInterface$6dHZ_G_hfQRWmeX7Cu75WRYhpB8.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), BaseWebChromeClient.class, $$Lambda$VideoModuleInterface$kxfGGgHSYUBfjcx5BCXbAiUPcE.INSTANCE);
    }

    static /* synthetic */ VastWebComponentSecurityPolicy lambda$null$6(DiConstructor diConstructor) {
        return new VastWebComponentSecurityPolicy((Logger) diConstructor.get(Logger.class), CoreDiNames.SOMA_API_URL, DiNetworkLayer.getUrlCreatorFrom(diConstructor));
    }

    static /* synthetic */ BaseWebViewClient lambda$null$7(DiConstructor diConstructor) {
        return new BaseWebViewClient();
    }

    static /* synthetic */ BaseWebChromeClient lambda$null$8(DiConstructor diConstructor) {
        return new BaseWebChromeClient();
    }

    /* renamed from: lambda$buildVisibilityConfigBuilderRegistry$12$VideoModuleInterface */
    public /* synthetic */ void mo56447x623dcb24(DiRegistry diRegistry) {
        diRegistry.registerFactory(moduleDiName(), VisibilityPrivateConfig.class, $$Lambda$VideoModuleInterface$2jarCsNdeHMDzpnMdT6Zxsizlg.INSTANCE);
        diRegistry.registerFactory(moduleDiName(), VisibilityTrackerCreator.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return VideoModuleInterface.this.lambda$null$11$VideoModuleInterface(diConstructor);
            }
        });
    }

    public /* synthetic */ VisibilityTrackerCreator lambda$null$11$VideoModuleInterface(DiConstructor diConstructor) {
        VisibilityPrivateConfig visibilityPrivateConfig = (VisibilityPrivateConfig) diConstructor.get(moduleDiName(), VisibilityPrivateConfig.class);
        return new VisibilityTrackerCreator(DiLogLayer.getLoggerFrom(diConstructor), visibilityPrivateConfig.getVisibilityRatio(), visibilityPrivateConfig.getVisibilityTimeMillis(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class), moduleDiName());
    }

    static /* synthetic */ void lambda$buildVastMediaFilesMapperRegistry$29(DiRegistry diRegistry) {
        diRegistry.registerFactory(VideoClicksMerger.class, $$Lambda$VideoModuleInterface$DiFtb0IGawSX5wzp41D9dV85ww.INSTANCE);
        diRegistry.registerFactory(VastMediaFileScenarioMerger.class, $$Lambda$VideoModuleInterface$LEGFIJMsqWm84QgAnAKFTPAGYF4.INSTANCE);
        diRegistry.registerFactory(VastWrapperCompanionScenarioPicker.class, $$Lambda$VideoModuleInterface$_BkpnapaDvEM6AsPKq1_BzzqmHM.INSTANCE);
        diRegistry.registerFactory(ViewableImpressionMerger.class, $$Lambda$VideoModuleInterface$fkbq7jNZgFi5yrPuF5ZGFWn0Ms.INSTANCE);
        diRegistry.registerFactory(VastCompanionScenarioMerger.class, $$Lambda$VideoModuleInterface$WQMsrGjppzc2rVls23J9YEYycBs.INSTANCE);
        diRegistry.registerFactory(VastScenarioWrapperMerger.class, $$Lambda$VideoModuleInterface$Hhrs01gFErTgBM1J7ECyvIah2M.INSTANCE);
        diRegistry.registerFactory(VastLinearMediaFilePicker.class, $$Lambda$VideoModuleInterface$o4IOciyhkOSgFG7l0jpMRjCRBY.INSTANCE);
        diRegistry.registerFactory(VastCompanionPicker.class, $$Lambda$VideoModuleInterface$USeizNPc9EiFmtGcqZcGHGmEe5I.INSTANCE);
        diRegistry.registerFactory(VastCompanionScenarioMapper.class, $$Lambda$VideoModuleInterface$kIjiyx8WMztj7z893I1Ov9gbhi8.INSTANCE);
        diRegistry.registerFactory(VastIconScenarioMapper.class, $$Lambda$VideoModuleInterface$luguCA7kmas8SKiwA9ZXrvGk9Y.INSTANCE);
        diRegistry.registerFactory(VastIconScenarioPicker.class, $$Lambda$VideoModuleInterface$1UghjI08HBhEYaF1TDPxTsSTy7U.INSTANCE);
        diRegistry.registerFactory(VastMediaFileScenarioMapper.class, $$Lambda$VideoModuleInterface$UE_wPGY11ijOZQq41T9FCa1qiOA.INSTANCE);
        diRegistry.registerFactory(VastScenarioCreativeDataMapper.class, $$Lambda$VideoModuleInterface$Ro9WolgxRWknocSRSGbYG9QaFuI.INSTANCE);
        diRegistry.registerFactory(VastScenarioMapper.class, $$Lambda$VideoModuleInterface$juwOpxRiaxxPvZgolSkeb4APhag.INSTANCE);
        diRegistry.registerFactory(VastMediaFileScenarioWrapperMapper.class, $$Lambda$VideoModuleInterface$4697lUDVtYGR1Y3jIHtzci6TiRo.INSTANCE);
        diRegistry.registerFactory(VastScenarioWrapperMapper.class, $$Lambda$VideoModuleInterface$zUCrOmf_V_SamardIJAgCJ_4sV8.INSTANCE);
    }

    static /* synthetic */ VideoClicksMerger lambda$null$13(DiConstructor diConstructor) {
        return new VideoClicksMerger();
    }

    static /* synthetic */ VastMediaFileScenarioMerger lambda$null$14(DiConstructor diConstructor) {
        return new VastMediaFileScenarioMerger((VideoClicksMerger) diConstructor.get(VideoClicksMerger.class));
    }

    static /* synthetic */ VastWrapperCompanionScenarioPicker lambda$null$15(DiConstructor diConstructor) {
        return new VastWrapperCompanionScenarioPicker();
    }

    static /* synthetic */ ViewableImpressionMerger lambda$null$16(DiConstructor diConstructor) {
        return new ViewableImpressionMerger();
    }

    static /* synthetic */ VastCompanionScenarioMerger lambda$null$17(DiConstructor diConstructor) {
        return new VastCompanionScenarioMerger();
    }

    static /* synthetic */ VastScenarioWrapperMerger lambda$null$18(DiConstructor diConstructor) {
        return new VastScenarioWrapperMerger((VastMediaFileScenarioMerger) diConstructor.get(VastMediaFileScenarioMerger.class), (VastWrapperCompanionScenarioPicker) diConstructor.get(VastWrapperCompanionScenarioPicker.class), (VastCompanionScenarioMerger) diConstructor.get(VastCompanionScenarioMerger.class), (ViewableImpressionMerger) diConstructor.get(ViewableImpressionMerger.class));
    }

    static /* synthetic */ VastLinearMediaFilePicker lambda$null$19(DiConstructor diConstructor) {
        return new VastLinearMediaFilePicker();
    }

    static /* synthetic */ VastCompanionPicker lambda$null$20(DiConstructor diConstructor) {
        return new VastCompanionPicker();
    }

    static /* synthetic */ VastCompanionScenarioMapper lambda$null$21(DiConstructor diConstructor) {
        return new VastCompanionScenarioMapper();
    }

    static /* synthetic */ VastIconScenarioMapper lambda$null$22(DiConstructor diConstructor) {
        return new VastIconScenarioMapper();
    }

    static /* synthetic */ VastIconScenarioPicker lambda$null$23(DiConstructor diConstructor) {
        return new VastIconScenarioPicker((VastIconScenarioMapper) diConstructor.get(VastIconScenarioMapper.class));
    }

    static /* synthetic */ VastMediaFileScenarioMapper lambda$null$24(DiConstructor diConstructor) {
        return new VastMediaFileScenarioMapper((VastIconScenarioPicker) diConstructor.get(VastIconScenarioPicker.class));
    }

    static /* synthetic */ VastScenarioCreativeDataMapper lambda$null$25(DiConstructor diConstructor) {
        return new VastScenarioCreativeDataMapper();
    }

    static /* synthetic */ VastScenarioMapper lambda$null$26(DiConstructor diConstructor) {
        return new VastScenarioMapper((VastLinearMediaFilePicker) diConstructor.get(VastLinearMediaFilePicker.class), (VastCompanionPicker) diConstructor.get(VastCompanionPicker.class), (VastCompanionScenarioMapper) diConstructor.get(VastCompanionScenarioMapper.class), (VastMediaFileScenarioMapper) diConstructor.get(VastMediaFileScenarioMapper.class), (VastScenarioCreativeDataMapper) diConstructor.get(VastScenarioCreativeDataMapper.class));
    }

    static /* synthetic */ VastMediaFileScenarioWrapperMapper lambda$null$27(DiConstructor diConstructor) {
        return new VastMediaFileScenarioWrapperMapper((VastIconScenarioPicker) diConstructor.get(VastIconScenarioPicker.class));
    }

    static /* synthetic */ VastScenarioWrapperMapper lambda$null$28(DiConstructor diConstructor) {
        return new VastScenarioWrapperMapper((VastCompanionPicker) diConstructor.get(VastCompanionPicker.class), (VastCompanionScenarioMapper) diConstructor.get(VastCompanionScenarioMapper.class), (VastMediaFileScenarioWrapperMapper) diConstructor.get(VastMediaFileScenarioWrapperMapper.class), (VastScenarioCreativeDataMapper) diConstructor.get(VastScenarioCreativeDataMapper.class));
    }

    static /* synthetic */ void lambda$buildVastScenarioPickerRegistry$33(DiRegistry diRegistry) {
        diRegistry.registerFactory(InLineAdContainerPicker.class, $$Lambda$VideoModuleInterface$B1aoSH_obc0K4fOivoBCB7WCEqg.INSTANCE);
        diRegistry.registerFactory(WrapperAdContainerPicker.class, $$Lambda$VideoModuleInterface$SR_1NL4ehxW1pB2JmZ03YJVWKOA.INSTANCE);
        diRegistry.registerFactory(VastScenarioPicker.class, $$Lambda$VideoModuleInterface$tAmJFHOK6iXHLCRklvo_N0W8S1Q.INSTANCE);
    }

    static /* synthetic */ InLineAdContainerPicker lambda$null$30(DiConstructor diConstructor) {
        return new InLineAdContainerPicker();
    }

    static /* synthetic */ WrapperAdContainerPicker lambda$null$31(DiConstructor diConstructor) {
        return new WrapperAdContainerPicker();
    }

    static /* synthetic */ VastScenarioPicker lambda$null$32(DiConstructor diConstructor) {
        return new VastScenarioPicker((InLineAdContainerPicker) diConstructor.get(InLineAdContainerPicker.class), (WrapperAdContainerPicker) diConstructor.get(WrapperAdContainerPicker.class), (VastScenarioWrapperMerger) diConstructor.get(VastScenarioWrapperMerger.class), (VastScenarioMapper) diConstructor.get(VastScenarioMapper.class), (VastScenarioWrapperMapper) diConstructor.get(VastScenarioWrapperMapper.class));
    }

    /* renamed from: lambda$buildVastTreeResultBuilderRegistry$36$VideoModuleInterface */
    public /* synthetic */ void mo56445xdf3bd8af(DiRegistry diRegistry) {
        diRegistry.registerFactory(VastTreeBuilder.class, $$Lambda$VideoModuleInterface$Z95CCdC2H9rSelVXecgYJQ4O6Xs.INSTANCE);
        diRegistry.registerFactory(VastResponseParser.class, $$Lambda$VideoModuleInterface$1HBjNmJgUEg41APwyQZ_WFwtqKk.INSTANCE);
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$VideoModuleInterface$3cuajqjTe3H181VOaWRrVZnPAEY.INSTANCE));
    }

    static /* synthetic */ VastTreeBuilder lambda$null$34(DiConstructor diConstructor) {
        return new VastTreeBuilder((VastResponseParser) diConstructor.get(VastResponseParser.class), (WrapperResolver) diConstructor.get(WrapperResolver.class));
    }

    static /* synthetic */ VastResponseParser lambda$null$35(DiConstructor diConstructor) {
        return new VastResponseParser((RegistryXmlParser) diConstructor.get(RegistryXmlParser.class));
    }

    static /* synthetic */ void lambda$buildWrapperResolverRegistry$41(DiRegistry diRegistry) {
        diRegistry.registerFactory(WrapperResolver.class, $$Lambda$VideoModuleInterface$7AxfwU4dQ3tj68KBHdiNpL2H4XM.INSTANCE);
        diRegistry.registerFactory(WrapperLoader.class, $$Lambda$VideoModuleInterface$dzsg3b4hiOhCahLLZiaSTQgxBkU.INSTANCE);
        diRegistry.registerFactory(WrapperLoaderErrorMapper.class, $$Lambda$VideoModuleInterface$H2pi5o58oGxgiDgpLSAxbDmms.INSTANCE);
        diRegistry.registerFactory(InLineChecker.class, $$Lambda$VideoModuleInterface$vubsmZUnxdzxhUJGAX5KAjBJJM.INSTANCE);
    }

    static /* synthetic */ WrapperResolver lambda$null$37(DiConstructor diConstructor) {
        return new WrapperResolver(((WrapperResolverConfig) diConstructor.get("WRAPPER_RESOLVER_CONFIG", WrapperResolverConfig.class)).getMaxDepth(), (WrapperLoader) diConstructor.get(WrapperLoader.class), (InLineChecker) diConstructor.get(InLineChecker.class), (WrapperAdContainerPicker) diConstructor.get(WrapperAdContainerPicker.class));
    }

    static /* synthetic */ WrapperLoader lambda$null$38(DiConstructor diConstructor) {
        return new WrapperLoader((WrapperLoaderErrorMapper) diConstructor.get(WrapperLoaderErrorMapper.class), (StaticWrapperLoaderExecutioner) diConstructor.get(StaticWrapperLoaderExecutioner.class));
    }

    static /* synthetic */ WrapperLoaderErrorMapper lambda$null$39(DiConstructor diConstructor) {
        return new WrapperLoaderErrorMapper();
    }

    static /* synthetic */ InLineChecker lambda$null$40(DiConstructor diConstructor) {
        return new InLineChecker();
    }

    public /* synthetic */ void lambda$buildResourceLoaderRegistry$49$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(VideoDiNames.VIDEO_RESOURCE_LOADER_DI_NAME, ResourceLoader.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return VideoModuleInterface.this.lambda$null$42$VideoModuleInterface(diConstructor);
            }
        });
        diRegistry.registerSingletonFactory("VideoModuleInterfaceVIDEO_RESOURCE_LOADING_DEVICE_LOCAL_EXECUTOR", ExecutorService.class, $$Lambda$VideoModuleInterface$_7rbTqYei7xVVU6IqxgEqOdYAMc.INSTANCE);
        diRegistry.registerFactory(VideoDiNames.VIDEO_RESOURCE_LOADER_DI_NAME, ResourceLoadingNetworkTaskCreator.class, $$Lambda$VideoModuleInterface$r1pZHyiLAIfaqxxlmxEek1BauZY.INSTANCE);
        diRegistry.registerSingletonFactory("VideoModuleInterfaceVIDEO_RESOURCE_LOADING_NETWORK_EXECUTOR", ExecutorService.class, $$Lambda$VideoModuleInterface$zRabeOceqiPXP3uOUGD1lWAeZ8.INSTANCE);
        diRegistry.registerFactory(VideoNetworkResourceStreamPreparationStrategy.class, $$Lambda$VideoModuleInterface$xykZs5h01UzTX8_l45cE76zgGDk.INSTANCE);
        diRegistry.registerFactory(VideoPersistingStrategy.class, $$Lambda$VideoModuleInterface$WYvVCPdLgIMRrOuHwUyXOrRxEA.INSTANCE);
        diRegistry.registerFactory(VideoResourceTransformer.class, $$Lambda$VideoModuleInterface$OzbVCR9Fg7dUsRvv8nA0EZni00.INSTANCE);
    }

    public /* synthetic */ ResourceLoader lambda$null$42$VideoModuleInterface(DiConstructor diConstructor) {
        return new ResourceLoader(DiLogLayer.getLoggerFrom(diConstructor), (ResourceLoadingNetworkTaskCreator) diConstructor.get(VideoDiNames.VIDEO_RESOURCE_LOADER_DI_NAME, ResourceLoadingNetworkTaskCreator.class), (ExecutorService) diConstructor.get("VideoModuleInterfaceVIDEO_RESOURCE_LOADING_DEVICE_LOCAL_EXECUTOR", ExecutorService.class), (PersistingStrategy) diConstructor.get(VideoPersistingStrategy.class), (ResourceTransformer) diConstructor.get(VideoResourceTransformer.class));
    }

    static /* synthetic */ ResourceLoadingNetworkTaskCreator lambda$null$44(DiConstructor diConstructor) {
        return new ResourceLoadingNetworkTaskCreator(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getNetworkActionsFrom(diConstructor), ErrorMapper.NETWORK_LAYER_EXCEPTION, (ExecutorService) diConstructor.get("VideoModuleInterfaceVIDEO_RESOURCE_LOADING_NETWORK_EXECUTOR", ExecutorService.class), (NetworkResourceStreamPreparationStrategy) diConstructor.get(VideoNetworkResourceStreamPreparationStrategy.class));
    }

    static /* synthetic */ VideoNetworkResourceStreamPreparationStrategy lambda$null$46(DiConstructor diConstructor) {
        return new VideoNetworkResourceStreamPreparationStrategy();
    }

    static /* synthetic */ VideoPersistingStrategy lambda$null$47(DiConstructor diConstructor) {
        return new VideoPersistingStrategy(DiLogLayer.getLoggerFrom(diConstructor), "video/vast", DiResourceLoaderLayer.getBaseStoragePersistingStrategyFileUtils(diConstructor), DiResourceLoaderLayer.getMd5Digester(diConstructor));
    }

    static /* synthetic */ VideoResourceTransformer lambda$null$48(DiConstructor diConstructor) {
        return new VideoResourceTransformer();
    }

    public boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        if (adFormat == AdFormat.VIDEO) {
            return cls.isAssignableFrom(RewardedAdPresenter.class) || cls.isAssignableFrom(InterstitialAdPresenter.class);
        }
        return false;
    }

    static /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$52(DiConstructor diConstructor) {
        return new VideoAdLoaderPlugin((AdPresenterNameShaper) diConstructor.get(AdPresenterNameShaper.class), new NullableFunction() {
            public final Object apply(Object obj) {
                return VideoModuleInterface.lambda$null$51(DiConstructor.this, (String) obj);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return $$Lambda$VideoModuleInterface$UbCKlz_od9_W5bZKZmTAkidAw4.INSTANCE;
    }

    static /* synthetic */ AdPresenterBuilder lambda$null$51(DiConstructor diConstructor, String str) {
        return (AdPresenterBuilder) DiAdLayer.tryGetOrNull(diConstructor, str, AdPresenterBuilder.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$moduleDiRegistry$54$VideoModuleInterface((DiRegistry) obj);
            }
        });
    }

    public DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper) {
        return DiRegistry.m24065of(new Consumer(adPresenterNameShaper) {
            public final /* synthetic */ AdPresenterNameShaper f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$moduleAdPresenterDiRegistry$57$VideoModuleInterface(this.f$1, (DiRegistry) obj);
            }
        });
    }

    public /* synthetic */ void lambda$moduleAdPresenterDiRegistry$57$VideoModuleInterface(AdPresenterNameShaper adPresenterNameShaper, DiRegistry diRegistry) {
        diRegistry.registerFactory(VastErrorTrackerCreator.class, $$Lambda$VideoModuleInterface$g2mPwTXFlfk2cIcvZxT6UXpTog.INSTANCE);
        diRegistry.registerFactory(MediaFileResourceLoaderListenerCreator.class, $$Lambda$VideoModuleInterface$iSmk88yO6Xekwec2ZxZd3s8Lne4.INSTANCE);
        diRegistry.addFrom(DiVideoAdLayer.createRegistry(adPresenterNameShaper, moduleDiName()));
    }

    static /* synthetic */ VastErrorTrackerCreator lambda$null$55(DiConstructor diConstructor) {
        return new VastErrorTrackerCreator((Logger) diConstructor.get(Logger.class), DiNetworkLayer.getBeaconTrackerFrom(diConstructor), (MacrosInjectorProviderFunction) diConstructor.get(MacrosInjectorProviderFunction.class));
    }

    static /* synthetic */ MediaFileResourceLoaderListenerCreator lambda$null$56(DiConstructor diConstructor) {
        return new MediaFileResourceLoaderListenerCreator();
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "VideoModuleInterface{supportedFormat: " + AdFormat.VIDEO + "}";
    }

    public /* synthetic */ void lambda$moduleDiRegistry$54$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$VideoModuleInterface$mH2WFDgHk7VKY8A587xvJdaIzMU.INSTANCE));
        diRegistry.registerFactory(moduleDiName(), XmlPullParser.class, $$Lambda$VideoModuleInterface$pAyT7PcR5KCc2FiXwo8vGvK15I.INSTANCE);
        diRegistry.registerSingletonFactory(RegistryXmlParser.class, new RegistryXmlParserFactory());
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildUtilityRegistry$5$VideoModuleInterface((DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildVastDiRegistry$50$VideoModuleInterface((DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiPlayerLayer.createRegistry());
        diRegistry.addFrom(DiMacros.createRegistry());
    }

    public /* synthetic */ void lambda$buildVastDiRegistry$50$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildVastWebComponentRegistry$9$VideoModuleInterface((DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$VideoModuleInterface$YbCbfBnu9SPCz28nXbycp1th3MY.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$VideoModuleInterface$JZq1oJl8KBPWgPEcTszodQ_ZxkA.INSTANCE));
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.mo56445xdf3bd8af((DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$VideoModuleInterface$pSUNzqNxQZuyrr_VdufC4M0OYs.INSTANCE));
    }

    public /* synthetic */ void lambda$buildUtilityRegistry$5$VideoModuleInterface(DiRegistry diRegistry) {
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.mo56447x623dcb24((DiRegistry) obj);
            }
        }));
        diRegistry.addFrom(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                VideoModuleInterface.this.lambda$buildResourceLoaderRegistry$49$VideoModuleInterface((DiRegistry) obj);
            }
        }));
        diRegistry.registerFactory(moduleDiName(), StateMachine.class, new VideoStateMachineFactory(AdStateMachine.State.INIT));
    }
}
