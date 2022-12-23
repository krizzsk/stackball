package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.amazon.device.ads.AdConstants;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.banner.p247ad.AutoReloadInterval;
import com.smaato.sdk.banner.p247ad.BannerAdSize;
import com.smaato.sdk.banner.widget.BannerError;
import com.smaato.sdk.banner.widget.BannerView;
import com.smaato.sdk.core.Config;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.log.LogLevel;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.iahb.InAppBid;
import com.smaato.sdk.iahb.InAppBiddingException;
import com.smaato.sdk.iahb.SmaatoSdkInAppBidding;
import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.Interstitial;
import com.smaato.sdk.interstitial.InterstitialAd;
import com.smaato.sdk.interstitial.InterstitialError;
import com.smaato.sdk.interstitial.InterstitialRequestError;
import com.smaato.sdk.rewarded.RewardedError;
import com.smaato.sdk.rewarded.RewardedInterstitial;
import com.smaato.sdk.rewarded.RewardedInterstitialAd;
import com.smaato.sdk.rewarded.RewardedRequestError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class SmaatoMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final SmaatoMediationAdapterRouter ROUTER;
    /* access modifiers changed from: private */
    public BannerView adView;
    private InterstitialAd interstitialAd;
    private String placementId;
    private RewardedInterstitialAd rewardedAd;

    public String getAdapterVersion() {
        return "21.5.7.1";
    }

    static {
        if (AppLovinSdk.VERSION_CODE >= 90802) {
            ROUTER = (SmaatoMediationAdapterRouter) MediationAdapterRouter.getSharedInstance(SmaatoMediationAdapterRouter.class);
        } else {
            ROUTER = new SmaatoMediationAdapterRouter();
        }
    }

    public SmaatoMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return SmaatoSdk.getVersion();
    }

    public void onDestroy() {
        BannerView bannerView = this.adView;
        if (bannerView != null) {
            bannerView.setEventListener((BannerView.EventListener) null);
            this.adView.destroy();
            this.adView = null;
        }
        this.interstitialAd = null;
        this.rewardedAd = null;
        ROUTER.removeAdapter(this, this.placementId);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("pub_id", "");
            log("Initializing Smaato SDK with publisher id: " + string + "...");
            removeUnsupportedUserConsent(activity);
            SmaatoSdk.init(activity.getApplication(), Config.builder().setLogLevel(maxAdapterInitializationParameters.isTesting() ? LogLevel.DEBUG : LogLevel.ERROR).setHttpsOnly(maxAdapterInitializationParameters.getServerParameters().getBoolean(CoreDiNames.NAME_HTTPS_ONLY)).build(), string);
            updateAgeRestrictedUser(maxAdapterInitializationParameters);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        BannerView bannerView = new BannerView(activity);
        this.adView = bannerView;
        bannerView.setAutoReloadInterval(AutoReloadInterval.DISABLED);
        this.adView.setEventListener(new BannerView.EventListener() {
            public void onAdLoaded(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView loaded");
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(bannerView.getCreativeId())) {
                    maxAdViewAdapterListener.onAdViewAdLoaded(SmaatoMediationAdapter.this.adView);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, bannerView.getCreativeId());
                maxAdViewAdapterListener.onAdViewAdLoaded(SmaatoMediationAdapter.this.adView, bundle);
            }

            public void onAdFailedToLoad(BannerView bannerView, BannerError bannerError) {
                SmaatoMediationAdapter smaatoMediationAdapter = SmaatoMediationAdapter.this;
                smaatoMediationAdapter.log("AdView load failed to load with error: " + bannerError);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(SmaatoMediationAdapter.this.toMaxError(bannerError));
            }

            public void onAdImpression(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView displayed");
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }

            public void onAdClicked(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onAdTTLExpired(BannerView bannerView) {
                SmaatoMediationAdapter.this.log("AdView ad expired");
            }
        });
        this.adView.loadAd(thirdPartyAdPlacementId, toAdSize(maxAdFormat), createBiddingAdRequestParams(bidResponse));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("interstitial ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        ROUTER.addInterstitialAdapter(this, maxInterstitialAdapterListener, thirdPartyAdPlacementId);
        InterstitialAd interstitialAd2 = ROUTER.getInterstitialAd(thirdPartyAdPlacementId);
        if (interstitialAd2 == null || !interstitialAd2.isAvailableForPresentation()) {
            Interstitial.loadAd(thirdPartyAdPlacementId, ROUTER, createBiddingAdRequestParams(bidResponse));
            return;
        }
        log("Interstitial already loaded for placement: " + thirdPartyAdPlacementId + "...");
        maxInterstitialAdapterListener.onInterstitialAdLoaded();
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for placement: " + thirdPartyAdPlacementId + "...");
        ROUTER.addShowingAdapter(this);
        InterstitialAd interstitialAd2 = ROUTER.getInterstitialAd(thirdPartyAdPlacementId);
        this.interstitialAd = interstitialAd2;
        if (interstitialAd2 == null || !interstitialAd2.isAvailableForPresentation()) {
            log("Interstitial not ready.");
            ROUTER.onAdDisplayFailed(thirdPartyAdPlacementId, MaxAdapterError.AD_NOT_READY);
            return;
        }
        this.interstitialAd.showAd(activity);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("rewarded ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        ROUTER.addRewardedAdapter(this, maxRewardedAdapterListener, thirdPartyAdPlacementId);
        RewardedInterstitialAd rewardedAd2 = ROUTER.getRewardedAd(thirdPartyAdPlacementId);
        if (rewardedAd2 == null || !rewardedAd2.isAvailableForPresentation()) {
            RewardedInterstitial.loadAd(thirdPartyAdPlacementId, ROUTER, createBiddingAdRequestParams(bidResponse));
            return;
        }
        log("Rewarded ad already loaded for placement: " + thirdPartyAdPlacementId + "...");
        maxRewardedAdapterListener.onRewardedAdLoaded();
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for placement: " + thirdPartyAdPlacementId + "...");
        ROUTER.addShowingAdapter(this);
        RewardedInterstitialAd rewardedAd2 = ROUTER.getRewardedAd(thirdPartyAdPlacementId);
        this.rewardedAd = rewardedAd2;
        if (rewardedAd2 == null || !rewardedAd2.isAvailableForPresentation()) {
            log("Rewarded ad not ready.");
            ROUTER.onAdDisplayFailed(thirdPartyAdPlacementId, MaxAdapterError.AD_NOT_READY);
            return;
        }
        configureReward(maxAdapterResponseParameters);
        this.rewardedAd.showAd();
    }

    private void removeUnsupportedUserConsent(Activity activity) {
        PreferenceManager.getDefaultSharedPreferences(activity).edit().remove(AdConstants.IABCONSENT_SUBJECT_TO_GDPR).remove(AdConstants.IABCONSENT_CONSENT_STRING).apply();
    }

    private void updateAgeRestrictedUser(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            SmaatoSdk.setCoppa(privacySetting.booleanValue());
        }
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    private BannerAdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return BannerAdSize.XX_LARGE_320x50;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return BannerAdSize.MEDIUM_RECTANGLE_300x250;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return BannerAdSize.LEADERBOARD_728x90;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* access modifiers changed from: private */
    public MaxAdapterError toMaxError(BannerError bannerError) {
        MaxAdapterError maxAdapterError;
        if (bannerError == BannerError.NO_AD_AVAILABLE) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (bannerError == BannerError.INVALID_REQUEST) {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        } else if (bannerError == BannerError.NETWORK_ERROR) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (bannerError == BannerError.INTERNAL_ERROR) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (bannerError == BannerError.CREATIVE_RESOURCE_EXPIRED) {
            maxAdapterError = MaxAdapterError.AD_EXPIRED;
        } else if (bannerError == BannerError.AD_UNLOADED) {
            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), bannerError.ordinal(), bannerError.name());
    }

    private AdRequestParams createBiddingAdRequestParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return AdRequestParams.builder().setUBUniqueId(SmaatoSdkInAppBidding.saveBid(InAppBid.create(str))).build();
        } catch (InAppBiddingException e) {
            log("Error occurred in saving pre-bid: " + e);
            return null;
        }
    }

    private static class SmaatoMediationAdapterRouter extends MediationAdapterRouter implements EventListener, com.smaato.sdk.rewarded.EventListener {
        private boolean hasGrantedReward;
        private final Map<String, InterstitialAd> interstitialAds;
        private final Object interstitialAdsLock;
        private final Map<String, RewardedInterstitialAd> rewardedAds;
        private final Object rewardedAdsLock;

        /* access modifiers changed from: package-private */
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }

        public void onAdOpened(InterstitialAd interstitialAd) {
        }

        private SmaatoMediationAdapterRouter() {
            this.interstitialAds = new HashMap();
            this.interstitialAdsLock = new Object();
            this.rewardedAds = new HashMap();
            this.rewardedAdsLock = new Object();
        }

        public InterstitialAd getInterstitialAd(String str) {
            InterstitialAd interstitialAd;
            synchronized (this.interstitialAdsLock) {
                interstitialAd = this.interstitialAds.get(str);
            }
            return interstitialAd;
        }

        public RewardedInterstitialAd getRewardedAd(String str) {
            RewardedInterstitialAd rewardedInterstitialAd;
            synchronized (this.rewardedAdsLock) {
                rewardedInterstitialAd = this.rewardedAds.get(str);
            }
            return rewardedInterstitialAd;
        }

        public void onAdLoaded(InterstitialAd interstitialAd) {
            String adSpaceId = interstitialAd.getAdSpaceId();
            synchronized (this.interstitialAdsLock) {
                this.interstitialAds.put(adSpaceId, interstitialAd);
            }
            log("Interstitial loaded for placement: " + adSpaceId + "...");
            onAdLoaded(adSpaceId, interstitialAd.getCreativeId());
        }

        public void onAdFailedToLoad(InterstitialRequestError interstitialRequestError) {
            String adSpaceId = interstitialRequestError.getAdSpaceId();
            log("Interstitial failed to load for placement: " + adSpaceId + "...with error: " + interstitialRequestError.getInterstitialError());
            onAdLoadFailed(adSpaceId, toMaxError(interstitialRequestError.getInterstitialError()));
        }

        public void onAdError(InterstitialAd interstitialAd, InterstitialError interstitialError) {
            log("Interstitial failed to display with error: " + interstitialError);
            if (interstitialAd != null) {
                String adSpaceId = interstitialAd.getAdSpaceId();
                synchronized (this.interstitialAdsLock) {
                    this.interstitialAds.remove(adSpaceId);
                }
                onAdDisplayFailed(adSpaceId, toMaxError(interstitialError));
            }
        }

        public void onAdImpression(InterstitialAd interstitialAd) {
            String adSpaceId = interstitialAd.getAdSpaceId();
            synchronized (this.interstitialAdsLock) {
                this.interstitialAds.remove(adSpaceId);
            }
            log("Interstitial displayed");
            onAdDisplayed(adSpaceId);
        }

        public void onAdClicked(InterstitialAd interstitialAd) {
            log("Interstitial clicked");
            onAdClicked(interstitialAd.getAdSpaceId());
        }

        public void onAdClosed(InterstitialAd interstitialAd) {
            log("Interstitial hidden");
            onAdHidden(interstitialAd.getAdSpaceId());
        }

        public void onAdTTLExpired(InterstitialAd interstitialAd) {
            log("Interstitial expired");
            synchronized (this.interstitialAdsLock) {
                this.interstitialAds.remove(interstitialAd.getAdSpaceId());
            }
        }

        private MaxAdapterError toMaxError(InterstitialError interstitialError) {
            MaxAdapterError maxAdapterError;
            if (interstitialError == InterstitialError.NO_AD_AVAILABLE) {
                maxAdapterError = MaxAdapterError.NO_FILL;
            } else if (interstitialError == InterstitialError.INVALID_REQUEST) {
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
            } else if (interstitialError == InterstitialError.NETWORK_ERROR) {
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
            } else if (interstitialError == InterstitialError.INTERNAL_ERROR) {
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            } else if (interstitialError == InterstitialError.CREATIVE_RESOURCE_EXPIRED) {
                maxAdapterError = MaxAdapterError.AD_EXPIRED;
            } else if (interstitialError == InterstitialError.AD_UNLOADED) {
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            } else {
                maxAdapterError = MaxAdapterError.UNSPECIFIED;
            }
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), interstitialError.ordinal(), interstitialError.name());
        }

        public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
            String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
            synchronized (this.rewardedAdsLock) {
                this.rewardedAds.put(adSpaceId, rewardedInterstitialAd);
            }
            log("Rewarded ad loaded for placement: " + adSpaceId + "...");
            onAdLoaded(adSpaceId, rewardedInterstitialAd.getCreativeId());
        }

        public void onAdFailedToLoad(RewardedRequestError rewardedRequestError) {
            String adSpaceId = rewardedRequestError.getAdSpaceId();
            log("Rewarded ad failed to load for placement: " + adSpaceId + "...with error: " + rewardedRequestError.getRewardedError());
            onAdLoadFailed(adSpaceId, toMaxError(rewardedRequestError.getRewardedError()));
        }

        public void onAdError(RewardedInterstitialAd rewardedInterstitialAd, RewardedError rewardedError) {
            log("Rewarded ad failed to display with error: " + rewardedError);
            if (rewardedInterstitialAd != null) {
                String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
                synchronized (this.rewardedAdsLock) {
                    this.rewardedAds.remove(adSpaceId);
                }
                onAdDisplayFailed(adSpaceId, toMaxError(rewardedError));
            }
        }

        public void onAdStarted(RewardedInterstitialAd rewardedInterstitialAd) {
            String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
            synchronized (this.rewardedAdsLock) {
                this.rewardedAds.remove(adSpaceId);
            }
            log("Rewarded ad displayed");
            onAdDisplayed(adSpaceId);
            onRewardedAdVideoStarted(adSpaceId);
        }

        public void onAdClicked(RewardedInterstitialAd rewardedInterstitialAd) {
            log("Rewarded ad clicked");
            onAdClicked(rewardedInterstitialAd.getAdSpaceId());
        }

        public void onAdReward(RewardedInterstitialAd rewardedInterstitialAd) {
            log("Rewarded ad video completed");
            onRewardedAdVideoCompleted(rewardedInterstitialAd.getAdSpaceId());
            this.hasGrantedReward = true;
        }

        public void onAdClosed(RewardedInterstitialAd rewardedInterstitialAd) {
            String adSpaceId = rewardedInterstitialAd.getAdSpaceId();
            if (this.hasGrantedReward || shouldAlwaysRewardUser(adSpaceId)) {
                MaxReward reward = getReward(adSpaceId);
                log("Rewarded user with reward: " + reward);
                onUserRewarded(adSpaceId, reward);
            }
            log("Rewarded ad hidden");
            onAdHidden(adSpaceId);
        }

        public void onAdTTLExpired(RewardedInterstitialAd rewardedInterstitialAd) {
            log("Rewarded ad expired");
            synchronized (this.rewardedAdsLock) {
                this.rewardedAds.remove(rewardedInterstitialAd.getAdSpaceId());
            }
        }

        private void onAdLoaded(String str, String str2) {
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(str)) {
                onAdLoaded(str2);
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
            onAdLoaded(str2, bundle);
        }

        private MaxAdapterError toMaxError(RewardedError rewardedError) {
            int i;
            if (rewardedError == RewardedError.NO_AD_AVAILABLE) {
                i = 204;
            } else if (rewardedError == RewardedError.INVALID_REQUEST) {
                i = MaxAdapterError.ERROR_CODE_INVALID_CONFIGURATION;
            } else if (rewardedError == RewardedError.NETWORK_ERROR) {
                i = MaxAdapterError.ERROR_CODE_NO_CONNECTION;
            } else if (rewardedError == RewardedError.INTERNAL_ERROR) {
                i = MaxAdapterError.ERROR_CODE_INTERNAL_ERROR;
            } else {
                i = rewardedError == RewardedError.CREATIVE_RESOURCE_EXPIRED ? MaxAdapterError.ERROR_CODE_AD_EXPIRED : MaxAdapterError.ERROR_CODE_UNSPECIFIED;
            }
            return new MaxAdapterError(i, rewardedError.name());
        }
    }
}
