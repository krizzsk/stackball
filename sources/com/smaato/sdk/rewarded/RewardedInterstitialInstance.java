package com.smaato.sdk.rewarded;

import android.app.Application;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdLoaderException;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdRequest;
import com.smaato.sdk.core.p248ad.AdSettings;
import com.smaato.sdk.core.p248ad.FullscreenAdDimensionMapper;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.p248ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.rewarded.RewardedInterstitialInstance;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenter;
import com.smaato.sdk.rewarded.repository.RewardedAdTypeStrategy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class RewardedInterstitialInstance {
    /* access modifiers changed from: private */
    public final Application applicationContext;
    private final FullscreenAdDimensionMapper fullscreenAdDimensionMapper;
    /* access modifiers changed from: private */
    public final Logger logger;
    Map<String, Object> objectExtras = new HashMap();
    private final AdRepository repository;
    /* access modifiers changed from: private */
    public final RewardedAdErrorMapper rewardedAdErrorMapper;
    /* access modifiers changed from: private */
    public final RewardedFactory rewardedFactory;
    private final SdkConfiguration sdkConfiguration;
    final SharedKeyValuePairsHolder sharedKeyValuePairsHolder;

    RewardedInterstitialInstance(RewardedFactory rewardedFactory2, AdRepository adRepository, RewardedAdErrorMapper rewardedAdErrorMapper2, SdkConfiguration sdkConfiguration2, SharedKeyValuePairsHolder sharedKeyValuePairsHolder2, FullscreenAdDimensionMapper fullscreenAdDimensionMapper2, Application application, Logger logger2) {
        this.rewardedFactory = (RewardedFactory) Objects.requireNonNull(rewardedFactory2);
        this.repository = (AdRepository) Objects.requireNonNull(adRepository);
        this.rewardedAdErrorMapper = (RewardedAdErrorMapper) Objects.requireNonNull(rewardedAdErrorMapper2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.sharedKeyValuePairsHolder = (SharedKeyValuePairsHolder) Objects.requireNonNull(sharedKeyValuePairsHolder2);
        this.fullscreenAdDimensionMapper = (FullscreenAdDimensionMapper) Objects.requireNonNull(fullscreenAdDimensionMapper2);
        this.applicationContext = (Application) Objects.requireNonNull(application);
        this.logger = (Logger) Objects.requireNonNull(logger2);
    }

    private AdRequest buildAdRequest(String str, String str2, String str3, String str4, String str5, AdRequestParams adRequestParams) {
        String str6;
        try {
            AdRequest.Builder keyValuePairs = new AdRequest.Builder().setAdSettings(new AdSettings.Builder().setPublisherId(str).setAdSpaceId(str2).setAdFormat(AdFormat.VIDEO).setAdDimension(this.fullscreenAdDimensionMapper.getDimension(this.applicationContext.getString(C8820R.string.smaato_sdk_core_fullscreen_dimension))).setWidth(UIUtils.getDisplayWidthInDp()).setHeight(UIUtils.getDisplayHeightInDp()).setMediationNetworkName(str3).setMediationNetworkSDKVersion(str4).setMediationAdapterVersion(str5).build()).setUserInfo(this.sdkConfiguration.getUserInfo()).setKeyValuePairs(this.sharedKeyValuePairsHolder.getKeyValuePairs());
            if (adRequestParams == null) {
                str6 = null;
            } else {
                str6 = adRequestParams.getUBUniqueId();
            }
            return keyValuePairs.setUbUniqueId(str6).build();
        } catch (Exception e) {
            this.logger.error(LogDomain.REWARDED, "Failed to proceed with RewardedInterstitial::loadAd. %s", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void loadAd(final String str, final String str2, EventListener eventListener, String str3, String str4, String str5, AdRequestParams adRequestParams) {
        boolean z = true;
        if (eventListener == null) {
            this.logger.error(LogDomain.REWARDED, "Failed to proceed with RewardedInterstitial::loadAd. Missing required parameter: %s", "eventListener");
        } else {
            z = false;
        }
        if (!z) {
            AdRequest buildAdRequest = buildAdRequest(str, str2, str3, str4, str5, adRequestParams);
            if (buildAdRequest == null) {
                Threads.runOnUi(new Runnable(str, str2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        EventListener.this.onAdFailedToLoad(new RewardedRequestError(RewardedError.INVALID_REQUEST, this.f$1, this.f$2));
                    }
                });
                return;
            }
            RewardedAdTypeStrategy rewardedAdTypeStrategy = new RewardedAdTypeStrategy(str, str2);
            final WeakReference weakReference = new WeakReference(eventListener);
            this.repository.loadAd(rewardedAdTypeStrategy, buildAdRequest, new AdRepository.Listener() {
                public final void onAdLoadSuccess(AdTypeStrategy adTypeStrategy, AdPresenter adPresenter) {
                    if (adPresenter instanceof RewardedAdPresenter) {
                        Objects.onNotNull(weakReference.get(), new Consumer(adPresenter) {
                            public final /* synthetic */ AdPresenter f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void accept(Object obj) {
                                RewardedInterstitialInstance.C88251.this.lambda$onAdLoadSuccess$1$RewardedInterstitialInstance$1(this.f$1, (EventListener) obj);
                            }
                        });
                    } else if (adPresenter instanceof RewardedCsmAdPresenter) {
                        Objects.onNotNull(weakReference.get(), new Consumer(adPresenter) {
                            public final /* synthetic */ AdPresenter f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void accept(Object obj) {
                                RewardedInterstitialInstance.C88251.this.lambda$onAdLoadSuccess$3$RewardedInterstitialInstance$1(this.f$1, (EventListener) obj);
                            }
                        });
                    } else {
                        onAdLoadError(adTypeStrategy, new AdLoaderException(AdLoader.Error.INVALID_RESPONSE, new Exception("Bad response type for Rewarded Interstitial")));
                    }
                }

                public /* synthetic */ void lambda$onAdLoadSuccess$1$RewardedInterstitialInstance$1(AdPresenter adPresenter, EventListener eventListener) {
                    Threads.runOnUi(new Runnable(eventListener, adPresenter) {
                        public final /* synthetic */ EventListener f$1;
                        public final /* synthetic */ AdPresenter f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            RewardedInterstitialInstance.C88251.this.lambda$null$0$RewardedInterstitialInstance$1(this.f$1, this.f$2);
                        }
                    });
                }

                public /* synthetic */ void lambda$null$0$RewardedInterstitialInstance$1(EventListener eventListener, AdPresenter adPresenter) {
                    RewardedFactory access$200 = RewardedInterstitialInstance.this.rewardedFactory;
                    eventListener.onAdLoaded(new RewardedInterstitialAdImpl(RewardedInterstitialInstance.this.applicationContext, Threads.newUiHandler(), RewardedInterstitialInstance.this.logger, (RewardedAdPresenter) adPresenter, eventListener, access$200.retainedAdPresenterRepository, access$200.uniqueKeySupplier));
                }

                public /* synthetic */ void lambda$onAdLoadSuccess$3$RewardedInterstitialInstance$1(AdPresenter adPresenter, EventListener eventListener) {
                    Threads.runOnUi(new Runnable(eventListener, adPresenter) {
                        public final /* synthetic */ EventListener f$1;
                        public final /* synthetic */ AdPresenter f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            RewardedInterstitialInstance.C88251.this.lambda$null$2$RewardedInterstitialInstance$1(this.f$1, this.f$2);
                        }
                    });
                }

                public /* synthetic */ void lambda$null$2$RewardedInterstitialInstance$1(EventListener eventListener, AdPresenter adPresenter) {
                    RewardedFactory unused = RewardedInterstitialInstance.this.rewardedFactory;
                    eventListener.onAdLoaded(RewardedFactory.buildRewardedCsmAd(Threads.newUiHandler(), RewardedInterstitialInstance.this.logger, (RewardedCsmAdPresenter) adPresenter, eventListener));
                }

                public final void onAdLoadError(AdTypeStrategy adTypeStrategy, AdLoaderException adLoaderException) {
                    Objects.onNotNull(weakReference.get(), new Consumer(adLoaderException, str, str2) {
                        public final /* synthetic */ AdLoaderException f$1;
                        public final /* synthetic */ String f$2;
                        public final /* synthetic */ String f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void accept(Object obj) {
                            RewardedInterstitialInstance.C88251.this.lambda$onAdLoadError$5$RewardedInterstitialInstance$1(this.f$1, this.f$2, this.f$3, (EventListener) obj);
                        }
                    });
                }

                public /* synthetic */ void lambda$onAdLoadError$5$RewardedInterstitialInstance$1(AdLoaderException adLoaderException, String str, String str2, EventListener eventListener) {
                    Threads.runOnUi(new Runnable(eventListener, adLoaderException, str, str2) {
                        public final /* synthetic */ EventListener f$1;
                        public final /* synthetic */ AdLoaderException f$2;
                        public final /* synthetic */ String f$3;
                        public final /* synthetic */ String f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        public final void run() {
                            RewardedInterstitialInstance.C88251.this.lambda$null$4$RewardedInterstitialInstance$1(this.f$1, this.f$2, this.f$3, this.f$4);
                        }
                    });
                }

                public /* synthetic */ void lambda$null$4$RewardedInterstitialInstance$1(EventListener eventListener, AdLoaderException adLoaderException, String str, String str2) {
                    RewardedAdErrorMapper unused = RewardedInterstitialInstance.this.rewardedAdErrorMapper;
                    eventListener.onAdFailedToLoad(new RewardedRequestError(RewardedAdErrorMapper.map(adLoaderException.getErrorType()), str, str2));
                }
            }, this.objectExtras);
        }
    }
}
