package com.smaato.sdk.interstitial;

import android.app.Application;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdLoaderException;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdRequest;
import com.smaato.sdk.core.p248ad.AdSettings;
import com.smaato.sdk.core.p248ad.FullscreenAdDimensionMapper;
import com.smaato.sdk.core.p248ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.interstitial.InterstitialErrorMapperUtil;
import com.smaato.sdk.interstitial.InterstitialEventsCache;
import java.util.HashMap;
import java.util.Map;

final class InterstitialLoader {
    private final Application applicationContext;
    private final FullscreenAdDimensionMapper fullscreenAdDimensionMapper;
    /* access modifiers changed from: private */
    public final InterstitialEventsCache interstitialEventsCache;
    Map<String, Object> objectExtras = new HashMap();
    private final AdRepository repository;
    private final SdkConfiguration sdkConfiguration;
    final SharedKeyValuePairsHolder sharedKeyValuePairsHolder;

    InterstitialLoader(AdRepository adRepository, InterstitialEventsCache interstitialEventsCache2, Application application, SdkConfiguration sdkConfiguration2, SharedKeyValuePairsHolder sharedKeyValuePairsHolder2, FullscreenAdDimensionMapper fullscreenAdDimensionMapper2) {
        this.repository = (AdRepository) Objects.requireNonNull(adRepository);
        this.interstitialEventsCache = (InterstitialEventsCache) Objects.requireNonNull(interstitialEventsCache2);
        this.applicationContext = (Application) Objects.requireNonNull(application);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.sharedKeyValuePairsHolder = (SharedKeyValuePairsHolder) Objects.requireNonNull(sharedKeyValuePairsHolder2);
        this.fullscreenAdDimensionMapper = (FullscreenAdDimensionMapper) Objects.requireNonNull(fullscreenAdDimensionMapper2);
    }

    /* access modifiers changed from: package-private */
    public final void loadAd$731824c5(String str, String str2, EventListener eventListener, AdFormat adFormat, String str3, String str4, String str5, AdRequestParams adRequestParams) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        Objects.requireNonNull(eventListener);
        Objects.requireNonNull(adFormat);
        Threads.runOnUi(new Runnable(str, str2, adFormat, str3, str4, str5, eventListener, adRequestParams, false) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ AdFormat f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ EventListener f$7;
            public final /* synthetic */ AdRequestParams f$8;
            public final /* synthetic */ boolean f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
            }

            public final void run() {
                InterstitialLoader.this.lambda$loadAd$0$InterstitialLoader(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
            }
        });
    }

    public /* synthetic */ void lambda$loadAd$0$InterstitialLoader(final String str, final String str2, AdFormat adFormat, String str3, String str4, String str5, EventListener eventListener, AdRequestParams adRequestParams, boolean z) {
        try {
            AdSettings build = new AdSettings.Builder().setPublisherId(str).setAdSpaceId(str2).setAdFormat(adFormat).setWidth(UIUtils.getDisplayWidthInDp()).setHeight(UIUtils.getDisplayHeightInDp()).setMediationNetworkName(str3).setMediationNetworkSDKVersion(str4).setMediationAdapterVersion(str5).setAdDimension(this.fullscreenAdDimensionMapper.getDimension(this.applicationContext.getString(C8759R.string.smaato_sdk_core_fullscreen_dimension))).build();
            InterstitialAdTypeStrategy interstitialAdTypeStrategy = new InterstitialAdTypeStrategy(str, str2);
            InterstitialEventsCache interstitialEventsCache2 = this.interstitialEventsCache;
            String uniqueKey = interstitialAdTypeStrategy.getUniqueKey();
            Objects.requireNonNull(uniqueKey);
            Objects.requireNonNull(eventListener);
            String str6 = null;
            interstitialEventsCache2.saveAd(uniqueKey, InterstitialEventsCache.C8757Ad.create(eventListener, (InterstitialAd) null));
            AdRequest.Builder keyValuePairs = new AdRequest.Builder().setAdSettings(build).setUserInfo(this.sdkConfiguration.getUserInfo()).setKeyValuePairs(this.sharedKeyValuePairsHolder.getKeyValuePairs());
            if (adRequestParams != null) {
                str6 = adRequestParams.getUBUniqueId();
            }
            this.repository.loadAd(interstitialAdTypeStrategy, keyValuePairs.setUbUniqueId(str6).setIsSplash(Boolean.valueOf(z)).build(), new AdRepository.Listener() {
                public final void onAdLoadSuccess(AdTypeStrategy adTypeStrategy, AdPresenter adPresenter) {
                    InterstitialLoader.this.interstitialEventsCache.handleAdLoaded(adPresenter, adTypeStrategy.getUniqueKey());
                }

                public final void onAdLoadError(AdTypeStrategy adTypeStrategy, AdLoaderException adLoaderException) {
                    InterstitialError interstitialError;
                    AdLoader.Error errorType = adLoaderException.getErrorType();
                    Objects.requireNonNull(errorType);
                    switch (InterstitialErrorMapperUtil.C87551.$SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error[errorType.ordinal()]) {
                        case 1:
                        case 2:
                            interstitialError = InterstitialError.NO_AD_AVAILABLE;
                            break;
                        case 3:
                            interstitialError = InterstitialError.INVALID_REQUEST;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            interstitialError = InterstitialError.INTERNAL_ERROR;
                            break;
                        case 11:
                            interstitialError = InterstitialError.CACHE_LIMIT_REACHED;
                            break;
                        case 12:
                        case 13:
                            interstitialError = InterstitialError.NETWORK_ERROR;
                            break;
                        case 14:
                            interstitialError = InterstitialError.CREATIVE_RESOURCE_EXPIRED;
                            break;
                        default:
                            throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{AdLoader.Error.class.getSimpleName(), errorType}));
                    }
                    InterstitialLoader.this.interstitialEventsCache.handleAdFailedToLoad(new InterstitialRequestError(interstitialError, str, str2), adTypeStrategy.getUniqueKey());
                }
            }, this.objectExtras);
        } catch (Exception unused) {
            eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.INVALID_REQUEST, str, str2));
        }
    }
}
