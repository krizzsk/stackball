package com.smaato.sdk.banner.framework;

import com.smaato.sdk.banner.p247ad.BannerAdLoaderPlugin;
import com.smaato.sdk.banner.p247ad.BannerAutoReloadConfig;
import com.smaato.sdk.banner.widget.BannerViewLoader;
import com.smaato.sdk.banner.widget.BlockingUtils;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.AutoReloadConfig;
import com.smaato.sdk.core.p248ad.AutoReloadPolicy;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.repository.AdLoadersRegistry;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.core.repository.MultipleAdLoadersRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.memory.LeakProtection;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import com.smaato.sdk.core.util.p251fi.Predicate;
import com.smaato.sdk.util.Schedulers;
import java.util.List;
import java.util.ServiceLoader;

public class BannerModuleInterface implements ModuleInterface {
    private static final AdStateMachine.State DEFAULT_IMPRESSION_STATE = AdStateMachine.State.IMPRESSED;
    private static final List<AdFormat> POSSIBLE_BANNER_MODULE_AD_FORMATS = Lists.m24071of((T[]) new AdFormat[]{AdFormat.STATIC_IMAGE, AdFormat.RICH_MEDIA, AdFormat.CSM});
    private boolean atLeastOneBannerModuleIsPresent;
    private volatile List<AdPresenterModuleInterface> foundInterfaces;
    private String missingBannerSubModulesMessage;

    public String moduleDiName() {
        return "BannerModuleInterface";
    }

    public String version() {
        return "21.5.7";
    }

    public synchronized void init(ClassLoader classLoader) {
        init((Iterable<AdPresenterModuleInterface>) ServiceLoader.load(AdPresenterModuleInterface.class, classLoader));
    }

    public boolean isInitialised() {
        return this.atLeastOneBannerModuleIsPresent;
    }

    public Class<? extends AdPresenter> getSupportedAdPresenterInterface() {
        return BannerAdPresenter.class;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private synchronized void init(java.lang.Iterable<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r4.foundInterfaces     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0053
            monitor-enter(r4)     // Catch:{ all -> 0x0055 }
            java.util.List<com.smaato.sdk.core.framework.AdPresenterModuleInterface> r0 = r4.foundInterfaces     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "21.5.7"
            java.util.List r5 = com.smaato.sdk.core.init.AdPresenterModuleInterfaceUtils.getValidModuleInterfaces(r0, r5)     // Catch:{ all -> 0x0050 }
            r4.foundInterfaces = r5     // Catch:{ all -> 0x0050 }
            java.util.List<com.smaato.sdk.core.ad.AdFormat> r5 = POSSIBLE_BANNER_MODULE_AD_FORMATS     // Catch:{ all -> 0x0050 }
            com.smaato.sdk.core.util.fi.Function r0 = com.smaato.sdk.core.util.p251fi.FunctionUtils.identity()     // Catch:{ all -> 0x0050 }
            com.smaato.sdk.banner.framework.-$$Lambda$BannerModuleInterface$a8nWEvht1hg8mxBx9aSS9NGwBQ0 r1 = new com.smaato.sdk.banner.framework.-$$Lambda$BannerModuleInterface$a8nWEvht1hg8mxBx9aSS9NGwBQ0     // Catch:{ all -> 0x0050 }
            r1.<init>(r4)     // Catch:{ all -> 0x0050 }
            java.util.Map r5 = com.smaato.sdk.core.util.collections.Maps.toMapWithOrder(r5, r0, r1)     // Catch:{ all -> 0x0050 }
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x0050 }
            com.smaato.sdk.banner.framework.-$$Lambda$orGLThciAnXWGWqy4r8Z91E5vck r1 = com.smaato.sdk.banner.framework.$$Lambda$orGLThciAnXWGWqy4r8Z91E5vck.INSTANCE     // Catch:{ all -> 0x0050 }
            boolean r0 = com.smaato.sdk.core.util.collections.Lists.any(r0, r1)     // Catch:{ all -> 0x0050 }
            r4.atLeastOneBannerModuleIsPresent = r0     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x004d
            com.smaato.sdk.banner.framework.-$$Lambda$BannerModuleInterface$57AUj9qxHZnbKOhBWKbw2nznev4 r0 = com.smaato.sdk.banner.framework.$$Lambda$BannerModuleInterface$57AUj9qxHZnbKOhBWKbw2nznev4.INSTANCE     // Catch:{ all -> 0x0050 }
            java.util.List r5 = com.smaato.sdk.core.util.collections.Maps.filteredKeys(r5, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "In order to show ads of %s format at least one of %s modules should be added to your project configuration. Missing module(s): %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0050 }
            r2 = 0
            com.smaato.sdk.core.ad.AdFormat r3 = com.smaato.sdk.core.p248ad.AdFormat.DISPLAY     // Catch:{ all -> 0x0050 }
            r1[r2] = r3     // Catch:{ all -> 0x0050 }
            r2 = 1
            java.util.List<com.smaato.sdk.core.ad.AdFormat> r3 = POSSIBLE_BANNER_MODULE_AD_FORMATS     // Catch:{ all -> 0x0050 }
            r1[r2] = r3     // Catch:{ all -> 0x0050 }
            r2 = 2
            r1[r2] = r5     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0050 }
            r4.missingBannerSubModulesMessage = r5     // Catch:{ all -> 0x0050 }
        L_0x004d:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)
            return
        L_0x0050:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r5     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r4)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.banner.framework.BannerModuleInterface.init(java.lang.Iterable):void");
    }

    static /* synthetic */ boolean lambda$buildMissingBannerSubModulesMessage$0(Boolean bool) {
        return !bool.booleanValue();
    }

    private List<AdPresenterModuleInterface> foundInterfaces() {
        List<AdPresenterModuleInterface> list = this.foundInterfaces;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("init() method should have been called first for this module: smaato-sdk-banner");
    }

    public boolean isFormatSupported(AdFormat adFormat, Logger logger) {
        if (adFormat != AdFormat.DISPLAY) {
            return isFormatSupportedByAdPresenterModules(adFormat);
        }
        if (!this.atLeastOneBannerModuleIsPresent) {
            logger.error(LogDomain.FRAMEWORK, this.missingBannerSubModulesMessage, new Object[0]);
        }
        return this.atLeastOneBannerModuleIsPresent;
    }

    /* access modifiers changed from: private */
    public boolean isFormatSupportedByAdPresenterModules(AdFormat adFormat) {
        return Lists.any(foundInterfaces(), new Predicate() {
            public final boolean test(Object obj) {
                return ((AdPresenterModuleInterface) obj).isFormatSupported(AdFormat.this, BannerAdPresenter.class);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return BannerModuleInterface.this.lambda$getAdLoaderPluginFactory$3$BannerModuleInterface(diConstructor);
            }
        };
    }

    public /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$3$BannerModuleInterface(DiConstructor diConstructor) {
        return new BannerAdLoaderPlugin(foundInterfaces(), new NullableFunction() {
            public final Object apply(Object obj) {
                return BannerModuleInterface.lambda$null$2(DiConstructor.this, (AdPresenterModuleInterface) obj);
            }
        }, POSSIBLE_BANNER_MODULE_AD_FORMATS, this.missingBannerSubModulesMessage);
    }

    static /* synthetic */ AdLoaderPlugin lambda$null$2(DiConstructor diConstructor, AdPresenterModuleInterface adPresenterModuleInterface) {
        return (AdLoaderPlugin) DiAdLayer.tryGetOrNull(diConstructor, adPresenterModuleInterface.moduleDiName(), AdLoaderPlugin.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiRegistry.m24065of($$Lambda$BannerModuleInterface$zIH2vDtwWLhvLJGtnICntf7zZIk.INSTANCE);
    }

    static /* synthetic */ void lambda$moduleDiRegistry$11(DiRegistry diRegistry) {
        diRegistry.registerFactory("AUTO_RELOAD_CONFIG_NAME", AutoReloadConfig.class, $$Lambda$BannerModuleInterface$fjpCZo4zAwdifdbUlDpOII_R6g.INSTANCE);
        diRegistry.registerFactory(BannerViewLoader.class, $$Lambda$BannerModuleInterface$orTkSYELzV_0XjmK3eKdwizcKvE.INSTANCE);
        diRegistry.registerFactory(BlockingUtils.class, $$Lambda$BannerModuleInterface$BoUMh0E3JgswcxIyQ5JmtEeW9xs.INSTANCE);
        diRegistry.registerSingletonFactory("BannerModuleInterface", SharedKeyValuePairsHolder.class, $$Lambda$BannerModuleInterface$6V2RMKZKawAJpzkCpKxWtLctnP0.INSTANCE);
        diRegistry.registerFactory("BANNER_AUTO_RELOAD_CONFIG", AutoReloadPolicy.class, $$Lambda$BannerModuleInterface$k_rKiloIvjKS9JyxjgoBxNn_M.INSTANCE);
        diRegistry.registerSingletonFactory("BannerModuleInterface", AdLoadersRegistry.class, $$Lambda$BannerModuleInterface$LN6lGWHt6oWaT9HFXXa7gftuK9g.INSTANCE);
        diRegistry.registerSingletonFactory("BannerModuleInterface", ConfigurationRepository.class, $$Lambda$BannerModuleInterface$7xtjzV0_Pl3quOHqmKGNf8U0L_M.INSTANCE);
    }

    static /* synthetic */ AutoReloadConfig lambda$null$4(DiConstructor diConstructor) {
        return new BannerAutoReloadConfig();
    }

    static /* synthetic */ BannerViewLoader lambda$null$5(DiConstructor diConstructor) {
        return new BannerViewLoader(DiLogLayer.getLoggerFrom(diConstructor), (AutoReloadPolicy) diConstructor.get("BANNER_AUTO_RELOAD_CONFIG", AutoReloadPolicy.class), (AppBackgroundAwareHandler) diConstructor.get(AppBackgroundAwareHandler.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), DiNetworkLayer.getNetworkStateMonitorFrom(diConstructor), (LeakProtection) diConstructor.get(LeakProtection.class), (AdRepository) ((DiAdRepository.Provider) diConstructor.get(DiAdRepository.Provider.class)).apply("BannerModuleInterface"), (SharedKeyValuePairsHolder) diConstructor.get("BannerModuleInterface", SharedKeyValuePairsHolder.class), (Schedulers) diConstructor.get(Schedulers.class), (BlockingUtils) diConstructor.get(BlockingUtils.class));
    }

    static /* synthetic */ BlockingUtils lambda$null$6(DiConstructor diConstructor) {
        return new BlockingUtils(((Schedulers) diConstructor.get(Schedulers.class)).main());
    }

    static /* synthetic */ SharedKeyValuePairsHolder lambda$null$7(DiConstructor diConstructor) {
        return new SharedKeyValuePairsHolder();
    }

    static /* synthetic */ AutoReloadPolicy lambda$null$8(DiConstructor diConstructor) {
        return new AutoReloadPolicy(DiLogLayer.getLoggerFrom(diConstructor), (AutoReloadConfig) diConstructor.get("AUTO_RELOAD_CONFIG_NAME", AutoReloadConfig.class), (AppBackgroundAwareHandler) diConstructor.get(AppBackgroundAwareHandler.class));
    }

    static /* synthetic */ AdLoadersRegistry lambda$null$9(DiConstructor diConstructor) {
        return new MultipleAdLoadersRegistry((ConfigurationRepository) diConstructor.get("BannerModuleInterface", ConfigurationRepository.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ ConfigurationRepository lambda$null$10(DiConstructor diConstructor) {
        return (ConfigurationRepository) ((DiConfiguration.Provider) diConstructor.get(DiConfiguration.Provider.class)).apply(new Configuration(20, DEFAULT_IMPRESSION_STATE));
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return ExpectedManifestEntries.EMPTY;
    }

    public String toString() {
        return "BannerModuleInterface{supportedFormat: " + AdFormat.DISPLAY + "}";
    }
}
