package com.smaato.sdk.interstitial;

import android.app.Application;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.api.VideoTypeAdRequestExtrasProvider;
import com.smaato.sdk.core.config.Configuration;
import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.config.DiConfiguration;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.FullscreenAdDimensionMapper;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p248ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.repository.AdLoadersRegistry;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.DiAdRepository;
import com.smaato.sdk.core.repository.MultipleAdLoadersRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.HashMap;

public final class DiInterstitial {
    private static final AdStateMachine.State DEFAULT_IMPRESSION_STATE = AdStateMachine.State.IMPRESSED;

    private DiInterstitial() {
    }

    public static DiRegistry createRegistry(String str) {
        Objects.requireNonNull(str);
        return DiRegistry.m24065of(new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                DiInterstitial.lambda$createRegistry$8(this.f$0, (DiRegistry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createRegistry$8(String str, DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(InterstitialLoader.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiInterstitial.lambda$null$0(this.f$0, diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(str, SharedKeyValuePairsHolder.class, $$Lambda$DiInterstitial$XyPI125nq8giwOsWNELX_4eSaE.INSTANCE);
        diRegistry.registerSingletonFactory(InterstitialEventsCache.class, $$Lambda$DiInterstitial$AueNwrInYed03KdOuxDt1lHGMtY.INSTANCE);
        diRegistry.registerSingletonFactory(InterstitialAdPresenterStorage.class, $$Lambda$DiInterstitial$DqTCgtxwFSyKtCpNisIa3JO7GM.INSTANCE);
        diRegistry.registerFactory(str, AdRequestExtrasProvider.class, $$Lambda$DiInterstitial$h0VhAWXnVqTaO69MRokH9dzjteY.INSTANCE);
        diRegistry.registerSingletonFactory(str, AdLoadersRegistry.class, new ClassFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiInterstitial.lambda$null$5(this.f$0, diConstructor);
            }
        });
        diRegistry.registerSingletonFactory(str, ConfigurationRepository.class, $$Lambda$DiInterstitial$u5ZtphadxPEVlf8lfKtz1u8Mqyc.INSTANCE);
        diRegistry.registerFactory(new AdPresenterNameShaper().shapeName(AdFormat.INTERSTITIAL, InterstitialAdPresenter.class), Timer.class, $$Lambda$DiInterstitial$hSiBtzzv_FIHHjw6YPfa01dM.INSTANCE);
    }

    static /* synthetic */ InterstitialLoader lambda$null$0(String str, DiConstructor diConstructor) {
        return new InterstitialLoader((AdRepository) ((DiAdRepository.Provider) diConstructor.get(DiAdRepository.Provider.class)).apply(str), (InterstitialEventsCache) diConstructor.get(InterstitialEventsCache.class), (Application) diConstructor.get(Application.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class), (SharedKeyValuePairsHolder) diConstructor.get(str, SharedKeyValuePairsHolder.class), (FullscreenAdDimensionMapper) diConstructor.get(FullscreenAdDimensionMapper.class));
    }

    static /* synthetic */ SharedKeyValuePairsHolder lambda$null$1(DiConstructor diConstructor) {
        return new SharedKeyValuePairsHolder();
    }

    static /* synthetic */ InterstitialEventsCache lambda$null$2(DiConstructor diConstructor) {
        return new InterstitialEventsCache(new HashMap(), new HashMap(), (InterstitialAdPresenterStorage) diConstructor.get(InterstitialAdPresenterStorage.class), $$Lambda$Wd7bUiJ6rzarh6euqzITU7sSM.INSTANCE);
    }

    static /* synthetic */ InterstitialAdPresenterStorage lambda$null$3(DiConstructor diConstructor) {
        return new InterstitialAdPresenterStorage();
    }

    static /* synthetic */ AdRequestExtrasProvider lambda$null$4(DiConstructor diConstructor) {
        return new VideoTypeAdRequestExtrasProvider("interstitial");
    }

    static /* synthetic */ AdLoadersRegistry lambda$null$5(String str, DiConstructor diConstructor) {
        return new MultipleAdLoadersRegistry((ConfigurationRepository) diConstructor.get(str, ConfigurationRepository.class), DiLogLayer.getLoggerFrom(diConstructor));
    }

    static /* synthetic */ ConfigurationRepository lambda$null$6(DiConstructor diConstructor) {
        return (ConfigurationRepository) ((DiConfiguration.Provider) diConstructor.get(DiConfiguration.Provider.class)).apply(new Configuration(20, DEFAULT_IMPRESSION_STATE));
    }
}
