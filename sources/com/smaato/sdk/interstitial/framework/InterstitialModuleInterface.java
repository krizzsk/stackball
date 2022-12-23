package com.smaato.sdk.interstitial.framework;

import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import com.smaato.sdk.core.util.p251fi.Predicate;
import com.smaato.sdk.interstitial.DiInterstitial;
import com.smaato.sdk.interstitial.InterstitialAdActivity;
import com.smaato.sdk.interstitial.InterstitialServerAdFormatResolvingFunction;
import com.smaato.sdk.interstitial.p254ad.InterstitialAdLoaderPlugin;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;

public class InterstitialModuleInterface implements ModuleInterface {
    private static final List<AdFormat> POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS = Lists.toImmutableListOf(AdFormat.VIDEO, AdFormat.STATIC_IMAGE, AdFormat.RICH_MEDIA, AdFormat.CSM);
    private boolean atLeastOneInterstitialAdPresenterModuleIsPresent;
    private volatile List<AdPresenterModuleInterface> foundInterfaces;
    private String missingInterstitialAdPresenterModulesMessage;

    public String moduleDiName() {
        return "InterstitialModuleInterface";
    }

    public String version() {
        return "21.5.7";
    }

    public synchronized void init(ClassLoader classLoader) {
        init((Iterable<AdPresenterModuleInterface>) ServiceLoader.load(AdPresenterModuleInterface.class, classLoader));
    }

    public boolean isInitialised() {
        return this.atLeastOneInterstitialAdPresenterModuleIsPresent;
    }

    public Class<? extends AdPresenter> getSupportedAdPresenterInterface() {
        return InterstitialAdPresenter.class;
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
            java.util.List<com.smaato.sdk.core.ad.AdFormat> r5 = POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS     // Catch:{ all -> 0x0050 }
            com.smaato.sdk.core.util.fi.Function r0 = com.smaato.sdk.core.util.p251fi.FunctionUtils.identity()     // Catch:{ all -> 0x0050 }
            com.smaato.sdk.interstitial.framework.-$$Lambda$InterstitialModuleInterface$aJBll3ZHhO81xNSTA4mh-0O2ZN8 r1 = new com.smaato.sdk.interstitial.framework.-$$Lambda$InterstitialModuleInterface$aJBll3ZHhO81xNSTA4mh-0O2ZN8     // Catch:{ all -> 0x0050 }
            r1.<init>(r4)     // Catch:{ all -> 0x0050 }
            java.util.Map r5 = com.smaato.sdk.core.util.collections.Maps.toMapWithOrder(r5, r0, r1)     // Catch:{ all -> 0x0050 }
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x0050 }
            com.smaato.sdk.interstitial.framework.-$$Lambda$orGLThciAnXWGWqy4r8Z91E5vck r1 = com.smaato.sdk.interstitial.framework.$$Lambda$orGLThciAnXWGWqy4r8Z91E5vck.INSTANCE     // Catch:{ all -> 0x0050 }
            boolean r0 = com.smaato.sdk.core.util.collections.Lists.any(r0, r1)     // Catch:{ all -> 0x0050 }
            r4.atLeastOneInterstitialAdPresenterModuleIsPresent = r0     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x004d
            com.smaato.sdk.interstitial.framework.-$$Lambda$InterstitialModuleInterface$cVXJdJJ3cpMnTCMZWyPTyVsAC8E r0 = com.smaato.sdk.interstitial.framework.C8794xb57e6a6e.INSTANCE     // Catch:{ all -> 0x0050 }
            java.util.List r5 = com.smaato.sdk.core.util.collections.Maps.filteredKeys(r5, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "In order to show ads of %s format at least one of %s modules should be added to your project configuration. Missing module(s): %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0050 }
            r2 = 0
            com.smaato.sdk.core.ad.AdFormat r3 = com.smaato.sdk.core.p248ad.AdFormat.INTERSTITIAL     // Catch:{ all -> 0x0050 }
            r1[r2] = r3     // Catch:{ all -> 0x0050 }
            r2 = 1
            java.util.List<com.smaato.sdk.core.ad.AdFormat> r3 = POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS     // Catch:{ all -> 0x0050 }
            r1[r2] = r3     // Catch:{ all -> 0x0050 }
            r2 = 2
            r1[r2] = r5     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0050 }
            r4.missingInterstitialAdPresenterModulesMessage = r5     // Catch:{ all -> 0x0050 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.framework.InterstitialModuleInterface.init(java.lang.Iterable):void");
    }

    static /* synthetic */ boolean lambda$buildMissingInterstitialModulesMessage$0(Boolean bool) {
        return !bool.booleanValue();
    }

    private List<AdPresenterModuleInterface> foundInterfaces() {
        List<AdPresenterModuleInterface> list = this.foundInterfaces;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("init() method should have been called first for this module: smaato-sdk-interstitial");
    }

    public boolean isFormatSupported(AdFormat adFormat, Logger logger) {
        if (adFormat != AdFormat.INTERSTITIAL) {
            return isFormatSupportedByAdPresenterModuleInterfaces(adFormat);
        }
        if (!this.atLeastOneInterstitialAdPresenterModuleIsPresent) {
            logger.error(LogDomain.FRAMEWORK, this.missingInterstitialAdPresenterModulesMessage, new Object[0]);
        }
        return this.atLeastOneInterstitialAdPresenterModuleIsPresent;
    }

    /* access modifiers changed from: private */
    public boolean isFormatSupportedByAdPresenterModuleInterfaces(AdFormat adFormat) {
        return Lists.any(foundInterfaces(), new Predicate() {
            public final boolean test(Object obj) {
                return ((AdPresenterModuleInterface) obj).isFormatSupported(AdFormat.this, InterstitialAdPresenter.class);
            }
        });
    }

    public ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory() {
        return new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return InterstitialModuleInterface.this.lambda$getAdLoaderPluginFactory$3$InterstitialModuleInterface(diConstructor);
            }
        };
    }

    public /* synthetic */ AdLoaderPlugin lambda$getAdLoaderPluginFactory$3$InterstitialModuleInterface(DiConstructor diConstructor) {
        return new InterstitialAdLoaderPlugin(foundInterfaces(), new NullableFunction() {
            public final Object apply(Object obj) {
                return InterstitialModuleInterface.lambda$null$2(DiConstructor.this, (AdPresenterModuleInterface) obj);
            }
        }, new InterstitialServerAdFormatResolvingFunction(POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS), (AdRequestExtrasProvider) diConstructor.get(moduleDiName(), AdRequestExtrasProvider.class), POSSIBLE_INTERSTITIAL_MODULE_AD_FORMATS, this.missingInterstitialAdPresenterModulesMessage);
    }

    static /* synthetic */ AdLoaderPlugin lambda$null$2(DiConstructor diConstructor, AdPresenterModuleInterface adPresenterModuleInterface) {
        return (AdLoaderPlugin) DiAdLayer.tryGetOrNull(diConstructor, adPresenterModuleInterface.moduleDiName(), AdLoaderPlugin.class);
    }

    public DiRegistry moduleDiRegistry() {
        return DiInterstitial.createRegistry(moduleDiName());
    }

    public ExpectedManifestEntries getExpectedManifestEntries() {
        return new ExpectedManifestEntries(Collections.emptySet(), Sets.toImmutableSetOf(InterstitialAdActivity.class));
    }

    public String toString() {
        return "InterstitialModuleInterface{supportedFormat: " + AdFormat.INTERSTITIAL + "}";
    }
}
