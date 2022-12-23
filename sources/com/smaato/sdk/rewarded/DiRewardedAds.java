package com.smaato.sdk.rewarded;

import android.app.Application;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.api.VideoTypeAdRequestExtrasProvider;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p248ad.DiAdLayer;
import com.smaato.sdk.core.p248ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.rewarded.framework.RewardedAdModuleInterface;
import com.smaato.sdk.rewarded.repository.DiRewardedAdRepositoryLayer;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;

public final class DiRewardedAds {
    private DiRewardedAds() {
    }

    public static DiRegistry createRewardedAdsRegistry() {
        return DiRegistry.m24065of($$Lambda$DiRewardedAds$NXb5HZ9Cm1maZaEccRwhdrICd_c.INSTANCE);
    }

    static /* synthetic */ void lambda$createRewardedAdsRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerFactory(RewardedInterstitialInstance.class, $$Lambda$DiRewardedAds$QqO6cXhGWyOVw3rqQADoPffy6GA.INSTANCE);
        diRegistry.registerSingletonFactory(RewardedAdModuleInterface.MODULE_DI_NAME, SharedKeyValuePairsHolder.class, $$Lambda$DiRewardedAds$PrxojftR3GrfZ9wWW6J0AnPuQoc.INSTANCE);
        diRegistry.registerFactory(RewardedAdErrorMapper.class, $$Lambda$DiRewardedAds$IlD4TSagY4crCGZEAFu4saTyB4.INSTANCE);
        diRegistry.registerFactory(RewardedFactory.class, $$Lambda$DiRewardedAds$HfinrRA1mEfZd01eeO1Fj0naU4.INSTANCE);
        diRegistry.registerFactory(RewardedAdModuleInterface.MODULE_DI_NAME, AdRequestExtrasProvider.class, $$Lambda$DiRewardedAds$76ah3QYui4djUi2aE7aSodiI_E8.INSTANCE);
        diRegistry.addFrom(DiRewardedAdRepositoryLayer.createRegistry());
    }

    static /* synthetic */ RewardedInterstitialInstance lambda$null$0(DiConstructor diConstructor) {
        return new RewardedInterstitialInstance((RewardedFactory) diConstructor.get(RewardedFactory.class), (AdRepository) ((DiAdRepository.Provider) diConstructor.get(DiAdRepository.Provider.class)).apply(RewardedAdModuleInterface.MODULE_DI_NAME), (RewardedAdErrorMapper) diConstructor.get(RewardedAdErrorMapper.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (SharedKeyValuePairsHolder) diConstructor.get(RewardedAdModuleInterface.MODULE_DI_NAME, SharedKeyValuePairsHolder.class), DiAdLayer.getFullscreenAdDimensionMapperFrom(diConstructor), (Application) diConstructor.get(Application.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ SharedKeyValuePairsHolder lambda$null$1(DiConstructor diConstructor) {
        return new SharedKeyValuePairsHolder();
    }

    static /* synthetic */ RewardedAdErrorMapper lambda$null$2(DiConstructor diConstructor) {
        return new RewardedAdErrorMapper();
    }

    static /* synthetic */ RewardedFactory lambda$null$4(DiConstructor diConstructor) {
        return new RewardedFactory((RetainedAdPresenterRepository) diConstructor.get(RetainedAdPresenterRepository.class), $$Lambda$DiRewardedAds$LROSqY87aJVp1dRhJWpqW2AnX44.INSTANCE);
    }

    static /* synthetic */ AdRequestExtrasProvider lambda$null$5(DiConstructor diConstructor) {
        return new VideoTypeAdRequestExtrasProvider("rewarded");
    }
}
