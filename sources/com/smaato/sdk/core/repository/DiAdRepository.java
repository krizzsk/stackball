package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p249di.AdLoaderProviderFunction;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.util.Schedulers;
import java.util.HashMap;

public final class DiAdRepository {
    public static final String CORE_DEFAULT_CONFIGURATION_REPOSITORY = "default_configuration_provider";
    private static final Configuration DEFAULT_CORE_CONFIGURATION = new Configuration(20, AdStateMachine.State.IMPRESSED);

    public interface Provider extends Function<String, AdRepository> {
    }

    private DiAdRepository() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiAdRepository$_SUGDTsWgAN1iTKgGKRyMIBAmE.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(Provider.class, $$Lambda$DiAdRepository$stRAjzXv0_LS0jFpFl_uDPnzZpo.INSTANCE);
        diRegistry.registerSingletonFactory(CORE_DEFAULT_CONFIGURATION_REPOSITORY, ConfigurationRepository.class, $$Lambda$DiAdRepository$RxmXMEdByh2sqq1XhF1c75fACq8.INSTANCE);
    }

    static /* synthetic */ AdRepository lambda$null$1(DiConstructor diConstructor, String str) {
        return new AdRepositoryImpl(DiLogLayer.getLoggerFrom(diConstructor), (UbCache) diConstructor.get(UbCache.class), (AdLoadersRegistry) diConstructor.get(str, AdLoadersRegistry.class), new Supplier(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return DiAdRepository.lambda$null$0(DiConstructor.this, this.f$1);
            }
        }, (Schedulers) diConstructor.get(Schedulers.class), (SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (UbErrorReporting) diConstructor.getOrNull(UbErrorReporting.class), (ExpirationTimestampFactory) diConstructor.get(ExpirationTimestampFactory.class));
    }

    static /* synthetic */ Provider lambda$null$2(DiConstructor diConstructor) {
        return new Provider() {
            public final Object apply(Object obj) {
                return DiAdRepository.lambda$null$1(DiConstructor.this, (String) obj);
            }
        };
    }

    static /* synthetic */ AdLoader lambda$null$0(DiConstructor diConstructor, String str) {
        return (AdLoader) ((AdLoaderProviderFunction) diConstructor.get(AdLoaderProviderFunction.class)).apply(diConstructor.get(str, AdLoaderPlugin.class));
    }

    static /* synthetic */ ConfigurationRepository lambda$null$3(DiConstructor diConstructor) {
        return new ConfigurationRepository(new HashMap(), DEFAULT_CORE_CONFIGURATION);
    }
}
