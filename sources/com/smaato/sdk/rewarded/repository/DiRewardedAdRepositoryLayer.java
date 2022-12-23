package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.repository.AdLoadersRegistry;
import com.smaato.sdk.core.repository.MultipleAdLoadersRegistry;
import com.smaato.sdk.rewarded.framework.RewardedAdModuleInterface;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public final class DiRewardedAdRepositoryLayer {
    private static final AdStateMachine.State DEFAULT_IMPRESSION_STATE = AdStateMachine.State.IMPRESSED;

    private DiRewardedAdRepositoryLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of(C8838xae2ea466.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(RetainedAdPresenterRepository.class, C8839xc4d8e639.INSTANCE);
        diRegistry.registerFactory("RewardedAdModuleInterface.RewardedAdLoadExecutioner", ExecutorService.class, C8841x7d0bae6e.INSTANCE);
        diRegistry.registerSingletonFactory(RewardedAdModuleInterface.MODULE_DI_NAME, AdLoadersRegistry.class, C8840x93499801.INSTANCE);
        diRegistry.registerSingletonFactory(RewardedAdModuleInterface.MODULE_DI_NAME, ConfigurationRepository.class, C8842x223d1a63.INSTANCE);
    }

    static /* synthetic */ RetainedAdPresenterRepository lambda$null$0(DiConstructor diConstructor) {
        return new RetainedAdPresenterRepository(new HashMap());
    }

    static /* synthetic */ AdLoadersRegistry lambda$null$2(DiConstructor diConstructor) {
        return new MultipleAdLoadersRegistry((ConfigurationRepository) diConstructor.get(RewardedAdModuleInterface.MODULE_DI_NAME, ConfigurationRepository.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ ConfigurationRepository lambda$null$3(DiConstructor diConstructor) {
        return (ConfigurationRepository) ((DiConfiguration.Provider) diConstructor.get(DiConfiguration.Provider.class)).apply(new Configuration(20, DEFAULT_IMPRESSION_STATE));
    }
}
