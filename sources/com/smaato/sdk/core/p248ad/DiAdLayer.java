package com.smaato.sdk.core.p248ad;

import android.content.SharedPreferences;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.analytics.Analytics;
import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.ccpa.CcpaDataStorage;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.IabCmpV2DataStorage;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p249di.AdLoaderProviderFunction;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.SdkConfigHintBuilder;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import com.smaato.sdk.sys.LocationAware;

/* renamed from: com.smaato.sdk.core.ad.DiAdLayer */
public final class DiAdLayer {

    /* renamed from: com.smaato.sdk.core.ad.DiAdLayer$AdRequestMapperProviderFunction */
    interface AdRequestMapperProviderFunction extends Function<AdLoaderPlugin, AdRequestMapper> {
    }

    private DiAdLayer() {
    }

    public static DiRegistry createRegistry(boolean z) {
        return DiRegistry.m24065of(new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                DiAdLayer.lambda$createRegistry$16(this.f$0, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$16(boolean z, DiRegistry diRegistry) {
        diRegistry.registerFactory(AdLoaderProviderFunction.class, $$Lambda$DiAdLayer$r6vDZTxWBXUbf0jaBAsi_7jC4I.INSTANCE);
        diRegistry.registerSingletonFactory(Threading.class, $$Lambda$DiAdLayer$9lZ1qj_PqXIIJdnUw48HU0zv1o0.INSTANCE);
        diRegistry.registerFactory(AdRequestMapperProviderFunction.class, new ClassFactory(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiAdLayer.lambda$null$4(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(CsmAdResponseParser.class, $$Lambda$DiAdLayer$8Keh9WYV72PAFH2slUZt24KFc0.INSTANCE);
        diRegistry.registerSingletonFactory(AdLoaderAdQualityViolationUtils.class, $$Lambda$DiAdLayer$6VqUFAFIja4ATmYtQCuuNAM22xg.INSTANCE);
        diRegistry.registerFactory(CoreDiNames.NAME_DEFAULT_SHARED_PREFERENCES, SharedPreferences.class, $$Lambda$DiAdLayer$8Vf2z3uTB0V_Drtyh4qeDZYrLbA.INSTANCE);
        diRegistry.registerSingletonFactory(IabCmpV2DataStorage.class, $$Lambda$DiAdLayer$wjcqoNNJnezVI8GNjOEj5Aa0wc.INSTANCE);
        diRegistry.registerSingletonFactory(SomaGdprDataSource.class, $$Lambda$DiAdLayer$r5B7gztIBLHvBS4G6j2poF87X4g.INSTANCE);
        diRegistry.registerSingletonFactory(CcpaDataStorage.class, $$Lambda$DiAdLayer$sk67qaEBDjNZiUzHlqFq7MsTXF8.INSTANCE);
        diRegistry.registerFactory(FullscreenAdDimensionMapper.class, $$Lambda$DiAdLayer$TIR1YEwxoH6DxpEErNLpt9nVdg.INSTANCE);
        diRegistry.registerFactory(RequestInfoMapper.class, $$Lambda$DiAdLayer$iAwZ69RHjSoqwwBVYkZ_ns78F_k.INSTANCE);
        diRegistry.registerFactory(RequestInfoProvider.class, $$Lambda$DiAdLayer$J5cR_rox7vCp1vpGblHuaft32I.INSTANCE);
        diRegistry.registerFactory(AppBackgroundAwareHandler.class, $$Lambda$DiAdLayer$AfPIUcIk8ietrKgWdcv6Rz1Isso.INSTANCE);
        diRegistry.registerFactory(OneTimeActionFactory.class, $$Lambda$DiAdLayer$3nje0lcMAnf9lP298RvvU8_LY1Q.INSTANCE);
    }

    static /* synthetic */ AdLoader lambda$null$0(DiConstructor diConstructor, AdLoaderPlugin adLoaderPlugin) {
        return new AdLoader((Logger) diConstructor.get(Logger.class), (AdRequestMapper) ((AdRequestMapperProviderFunction) diConstructor.get(AdRequestMapperProviderFunction.class)).apply(adLoaderPlugin), adLoaderPlugin, (ApiConnector) diConstructor.get(ApiConnector.class), (SdkConfigHintBuilder) diConstructor.get(SdkConfigHintBuilder.class), (AdLoaderAdQualityViolationUtils) diConstructor.get(AdLoaderAdQualityViolationUtils.class));
    }

    static /* synthetic */ AdLoaderProviderFunction lambda$null$1(DiConstructor diConstructor) {
        return new AdLoaderProviderFunction() {
            public final Object apply(Object obj) {
                return DiAdLayer.lambda$null$0(DiConstructor.this, (AdLoaderPlugin) obj);
            }
        };
    }

    static /* synthetic */ Threading lambda$null$2(DiConstructor diConstructor) {
        return new DefaultThreading((byte) 0);
    }

    static /* synthetic */ AdRequestMapper lambda$null$3(DiConstructor diConstructor, boolean z, AdLoaderPlugin adLoaderPlugin) {
        return new AdRequestMapper((Logger) diConstructor.get(Logger.class), (DataCollector) diConstructor.get(DataCollector.class), z, adLoaderPlugin, (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (RequestInfoMapper) diConstructor.get(RequestInfoMapper.class), (Analytics) diConstructor.get(Analytics.class), (CcpaDataStorage) diConstructor.get(CcpaDataStorage.class), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class));
    }

    static /* synthetic */ AdRequestMapperProviderFunction lambda$null$4(boolean z, DiConstructor diConstructor) {
        return new AdRequestMapperProviderFunction(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return DiAdLayer.lambda$null$3(DiConstructor.this, this.f$1, (AdLoaderPlugin) obj);
            }
        };
    }

    static /* synthetic */ CsmAdResponseParser lambda$null$5(DiConstructor diConstructor) {
        return new CsmAdResponseParser(DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ AdLoaderAdQualityViolationUtils lambda$null$6(DiConstructor diConstructor) {
        return new AdLoaderAdQualityViolationUtils((AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class));
    }

    static /* synthetic */ IabCmpV2DataStorage lambda$null$8(DiConstructor diConstructor) {
        return new IabCmpV2DataStorage((SharedPreferences) diConstructor.get(CoreDiNames.NAME_DEFAULT_SHARED_PREFERENCES, SharedPreferences.class));
    }

    static /* synthetic */ SomaGdprDataSource lambda$null$9(DiConstructor diConstructor) {
        return new SomaGdprDataSource((IabCmpV2DataStorage) diConstructor.get(IabCmpV2DataStorage.class), (LocationAware) diConstructor.get(LocationAware.class));
    }

    static /* synthetic */ CcpaDataStorage lambda$null$10(DiConstructor diConstructor) {
        return new CcpaDataStorage((SharedPreferences) diConstructor.get(CoreDiNames.NAME_DEFAULT_SHARED_PREFERENCES, SharedPreferences.class));
    }

    static /* synthetic */ FullscreenAdDimensionMapper lambda$null$11(DiConstructor diConstructor) {
        return new FullscreenAdDimensionMapper();
    }

    static /* synthetic */ RequestInfoMapper lambda$null$12(DiConstructor diConstructor) {
        return new RequestInfoMapper();
    }

    static /* synthetic */ RequestInfoProvider lambda$null$13(DiConstructor diConstructor) {
        return new RequestInfoProvider((DataCollector) diConstructor.get(DataCollector.class), (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), ((DataCollector) diConstructor.get(DataCollector.class)).getSystemInfo());
    }

    static /* synthetic */ AppBackgroundAwareHandler lambda$null$14(DiConstructor diConstructor) {
        return new AppBackgroundAwareHandler(DiLogLayer.getLoggerFrom(diConstructor), Threads.newUiHandler(), (AppBackgroundDetector) diConstructor.get(AppBackgroundDetector.class));
    }

    static /* synthetic */ OneTimeActionFactory lambda$null$15(DiConstructor diConstructor) {
        return new OneTimeActionFactory(Threads.newUiHandler());
    }

    public static <T> T tryGetOrNull(DiConstructor diConstructor, String str, Class<T> cls) {
        Objects.requireNonNull(diConstructor);
        Objects.requireNonNull(cls);
        try {
            return diConstructor.get(str, cls);
        } catch (Exception e) {
            ((Logger) diConstructor.get(Logger.class)).error(LogDomain.CORE, e, "Probably configuration troubles", new Object[0]);
            return null;
        }
    }

    public static FullscreenAdDimensionMapper getFullscreenAdDimensionMapperFrom(DiConstructor diConstructor) {
        return (FullscreenAdDimensionMapper) diConstructor.get(FullscreenAdDimensionMapper.class);
    }

    /* renamed from: com.smaato.sdk.core.ad.DiAdLayer$DefaultThreading */
    static class DefaultThreading implements Threading {
        private DefaultThreading() {
        }

        /* synthetic */ DefaultThreading(byte b) {
            this();
        }

        public void runOnBackgroundThread(Runnable runnable) {
            Threads.runOnBackgroundThread(runnable);
        }
    }
}
