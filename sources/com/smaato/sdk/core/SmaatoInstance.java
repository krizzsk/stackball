package com.smaato.sdk.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import com.smaato.sdk.SdkBase;
import com.smaato.sdk.SdkModule;
import com.smaato.sdk.SmaatoSdkBase;
import com.smaato.sdk.core.analytics.DiAnalyticsLayer;
import com.smaato.sdk.core.api.DiApiLayer;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.browser.DiBrowserLayer;
import com.smaato.sdk.core.ccpa.CcpaDataStorage;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.configcheck.AppConfigChecker;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.datacollector.DiDataCollectorLayer;
import com.smaato.sdk.core.deeplink.DiDeepLinkLayer;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.core.resourceloader.DiResourceLoaderLayer;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkConfigHintBuilder;
import com.smaato.sdk.core.util.memory.DiLeakProtection;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.violationreporter.DiAdQualityViolationReporterLayer;
import com.smaato.sdk.core.webview.DiWebViewLayer;
import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.inject.Providers;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.sys.LocationAware;
import com.smaato.sdk.util.Schedulers;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

class SmaatoInstance {
    AdContentRating adContentRating;
    Integer age;
    final CcpaDataStorage ccpaDataStorage;
    boolean coppa = false;
    DiConstructor diConstructor;
    Gender gender;
    boolean isCompanionAdSkippable = false;
    boolean isGPSEnabled = false;
    boolean isWatermarkEnabled = false;
    String keywords;
    String language;
    LatLng latLng;
    final String publisherId;
    String region;
    private final Provider<? extends Schedulers> schedulers = Providers.doubleCheck($$Lambda$SX205xHCM6SdPOSpe00dMvT04.INSTANCE);
    private final ServiceLoader<SdkModule> sdkModules;
    /* access modifiers changed from: package-private */
    public String searchQuery;
    String zip;

    static /* synthetic */ Application lambda$null$8(Application application, DiConstructor diConstructor2) {
        return application;
    }

    SmaatoInstance(Application application, Config config, List<DiRegistry> list, ExpectedManifestEntries expectedManifestEntries, String str) {
        this.publisherId = (String) Objects.requireNonNull(str, "Parameter PublisherId cannot be null for SmaatoInstance::new");
        this.adContentRating = ((Config) Objects.requireNonNull(config, "Parameter config cannot be null for SmaatoInstance::new")).getAdContentRating();
        Application application2 = (Application) Objects.requireNonNull(application, "Parameter application cannot be null for SmaatoInstance::new");
        ExpectedManifestEntries expectedManifestEntries2 = (ExpectedManifestEntries) Objects.requireNonNull(expectedManifestEntries, "Parameter expectedManifestEntries cannot be null for SmaatoInstance::new");
        HashSet hashSet = new HashSet((List) Objects.requireNonNull(list, "Parameter diRegistriesOfModules cannot be null for SmaatoInstance::new"));
        boolean isHttpsOnly = config.isHttpsOnly();
        if (!isHttpsOnly) {
            if (!(Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true)) {
                Log.w(LogDomain.CORE.name(), "`httpsOnly` value overridden to TRUE, due to Network Security Configuration settings.");
                isHttpsOnly = true;
            }
        }
        Collections.addAll(hashSet, new DiRegistry[]{DiRegistry.m24065of(new Consumer(isHttpsOnly, config.loggingEnabled(), application2, expectedManifestEntries2) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ Application f$3;
            public final /* synthetic */ ExpectedManifestEntries f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void accept(Object obj) {
                SmaatoInstance.this.lambda$createCoreOfCoreRegistry$17$SmaatoInstance(this.f$1, this.f$2, this.f$3, this.f$4, (DiRegistry) obj);
            }
        }), DiLogLayer.createRegistry(config.loggingEnabled(), config.getConsoleLogLevel()), DiAdLayer.createRegistry(isHttpsOnly), DiApiLayer.createRegistry(), DiNetworkLayer.createRegistry(), DiDeepLinkLayer.createRegistry(), DiBrowserLayer.createRegistry(), DiWebViewLayer.createRegistry(), DiDataCollectorLayer.createRegistry(), DiAdQualityViolationReporterLayer.createRegistry(), DiResourceLoaderLayer.createRegistry(), DiLeakProtection.createRegistry(), DiAdRepository.createRegistry(), DiConfiguration.createRegistry(), DiAnalyticsLayer.createRegistry(application2)});
        DiConstructor create = DiConstructor.create((Set<DiRegistry>) hashSet);
        this.diConstructor = create;
        this.ccpaDataStorage = (CcpaDataStorage) create.get(CcpaDataStorage.class);
        SmaatoSdkBase build = SmaatoSdkBase.builder().context(Providers.wrap(application)).schedulers(this.schedulers).somaUrl($$Lambda$SmaatoInstance$RPoetfr3LSp31DXzIRd4M6HExE.INSTANCE).smaatoBridge(Providers.doubleCheck(new Provider(config) {
            public final /* synthetic */ Config f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return SmaatoInstance.this.lambda$new$2$SmaatoInstance(this.f$1);
            }
        })).build();
        this.diConstructor = this.diConstructor.addRegistry(DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                SmaatoInstance.lambda$new$5(SdkBase.this, (DiRegistry) obj);
            }
        }));
        ServiceLoader<S> load = ServiceLoader.load(SdkModule.class);
        this.sdkModules = load;
        Iterator<S> it = load.iterator();
        while (it.hasNext()) {
            ((SdkModule) it.next()).init(build);
        }
    }

    public /* synthetic */ SmaatoBridgeImpl lambda$new$2$SmaatoInstance(Config config) {
        return new SmaatoBridgeImpl(Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoInstance.this.lambda$null$1$SmaatoInstance();
            }
        }), config);
    }

    public /* synthetic */ DiConstructor lambda$null$1$SmaatoInstance() {
        return this.diConstructor;
    }

    static /* synthetic */ void lambda$new$5(SdkBase sdkBase, DiRegistry diRegistry) {
        diRegistry.registerFactory(LocationAware.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return SdkBase.this.locationAware();
            }
        });
        diRegistry.registerFactory(UbCache.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return SdkBase.this.ubCache();
            }
        });
    }

    public /* synthetic */ void lambda$createCoreOfCoreRegistry$17$SmaatoInstance(boolean z, boolean z2, Application application, ExpectedManifestEntries expectedManifestEntries, DiRegistry diRegistry) {
        diRegistry.registerFactory(CoreDiNames.NAME_HTTPS_ONLY, Boolean.class, new ClassFactory(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return Boolean.valueOf(this.f$0);
            }
        });
        diRegistry.registerFactory(CoreDiNames.NAME_IS_LOGGING_ENABLED, Boolean.class, new ClassFactory(z2) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return Boolean.valueOf(this.f$0);
            }
        });
        diRegistry.registerFactory(Application.class, new ClassFactory(application) {
            public final /* synthetic */ Application f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return SmaatoInstance.lambda$null$8(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(CoreDiNames.SOMA_API_URL, String.class, $$Lambda$SmaatoInstance$p3e9mB5D09tTpL6ORK57cn8Kik.INSTANCE);
        diRegistry.registerSingletonFactory(AppMetaData.class, $$Lambda$SmaatoInstance$PmudQub4ZSOZpD7WKsFEtHqlAM.INSTANCE);
        diRegistry.registerSingletonFactory(SdkConfigHintBuilder.class, $$Lambda$SmaatoInstance$umdayuX_DnMMOUp5b5E_saOUYVY.INSTANCE);
        diRegistry.registerSingletonFactory(AppConfigChecker.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return SmaatoInstance.lambda$null$12(ExpectedManifestEntries.this, diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(AppBackgroundDetector.class, $$Lambda$SmaatoInstance$3faOw12yrAxBOAqEVWQJg7XZRgE.INSTANCE);
        diRegistry.registerSingletonFactory(HeaderUtils.class, $$Lambda$SmaatoInstance$8UkmUyNsDXbxWLRwpbFH89AA8zk.INSTANCE);
        diRegistry.registerSingletonFactory(Schedulers.class, new ClassFactory() {
            public final Object get(DiConstructor diConstructor) {
                return SmaatoInstance.this.lambda$null$15$SmaatoInstance(diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(SdkConfiguration.class, $$Lambda$SmaatoInstance$yymcaRkuMoOSaVqx8rSzKpw9bJc.INSTANCE);
    }

    static /* synthetic */ AppMetaData lambda$null$10(DiConstructor diConstructor2) {
        return new AppMetaData((Context) diConstructor2.get(Application.class));
    }

    static /* synthetic */ SdkConfigHintBuilder lambda$null$11(DiConstructor diConstructor2) {
        return new SdkConfigHintBuilder();
    }

    static /* synthetic */ AppConfigChecker lambda$null$12(ExpectedManifestEntries expectedManifestEntries, DiConstructor diConstructor2) {
        return new AppConfigChecker(DiLogLayer.getLoggerFrom(diConstructor2), expectedManifestEntries, (AppMetaData) diConstructor2.get(AppMetaData.class));
    }

    static /* synthetic */ AppBackgroundDetector lambda$null$13(DiConstructor diConstructor2) {
        return new AppBackgroundDetector(DiLogLayer.getLoggerFrom(diConstructor2));
    }

    static /* synthetic */ HeaderUtils lambda$null$14(DiConstructor diConstructor2) {
        return new HeaderUtils();
    }

    public /* synthetic */ Schedulers lambda$null$15$SmaatoInstance(DiConstructor diConstructor2) {
        return (Schedulers) this.schedulers.get();
    }

    static /* synthetic */ SdkConfiguration lambda$null$16(DiConstructor diConstructor2) {
        return new SdkConfiguration();
    }

    /* access modifiers changed from: package-private */
    public String getSearchQuery() {
        return this.searchQuery;
    }
}
