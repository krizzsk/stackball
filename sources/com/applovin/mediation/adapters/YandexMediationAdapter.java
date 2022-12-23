package com.applovin.mediation.adapters;

import android.app.Activity;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import com.yandex.mobile.ads.banner.AdSize;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class YandexMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    /* access modifiers changed from: private */
    public BannerAdView adView;
    private InterstitialAd interstitialAd;
    private RewardedAd rewardedAd;

    public String getAdapterVersion() {
        return "5.2.0.1";
    }

    public YandexMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return MobileAds.getLibraryVersion();
    }

    public void onDestroy() {
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.destroy();
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.destroy();
            this.rewardedAd = null;
        }
        BannerAdView bannerAdView = this.adView;
        if (bannerAdView != null) {
            bannerAdView.destroy();
            this.adView = null;
        }
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Initializing Yandex SDK");
            sb.append(maxAdapterInitializationParameters.isTesting() ? " in test mode " : "");
            sb.append("...");
            log(sb.toString());
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            updateUserConsent(maxAdapterInitializationParameters);
            if (maxAdapterInitializationParameters.isTesting()) {
                MobileAds.enableLogging(true);
            }
            MobileAds.initialize(activity != null ? activity.getApplicationContext() : getApplicationContext(), new InitializationListener() {
                public void onInitializationCompleted() {
                    YandexMediationAdapter.this.log("Yandex SDK initialized");
                    MaxAdapter.InitializationStatus unused = YandexMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                    onCompletionListener.onCompletion(YandexMediationAdapter.status, (String) null);
                }
            });
            return;
        }
        onCompletionListener.onCompletion(status, (String) null);
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserConsent(maxAdapterSignalCollectionParameters);
        BidderTokenLoader.loadBidderToken(activity, new BidderTokenLoadListener() {
            public void onBidderTokenLoaded(String str) {
                YandexMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }

            public void onBidderTokenFailedToLoad(String str) {
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                yandexMediationAdapter.log("Signal collection failed: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }
        });
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb.append("interstitial ad for placement: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateUserConsent(maxAdapterResponseParameters);
        InterstitialAd interstitialAd2 = new InterstitialAd(activity.getApplicationContext());
        this.interstitialAd = interstitialAd2;
        interstitialAd2.setAdUnitId(thirdPartyAdPlacementId);
        this.interstitialAd.setInterstitialAdEventListener(new InterstitialAdListener(maxAdapterResponseParameters, maxInterstitialAdapterListener));
        this.interstitialAd.loadAd(createAdRequest(maxAdapterResponseParameters));
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 == null || !interstitialAd2.isLoaded()) {
            log("Interstitial ad failed to load - ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(-4205, "Ad Display Failed"));
            return;
        }
        this.interstitialAd.show();
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad for placement: " + thirdPartyAdPlacementId + "...");
        updateUserConsent(maxAdapterResponseParameters);
        RewardedAd rewardedAd2 = new RewardedAd(activity.getApplicationContext());
        this.rewardedAd = rewardedAd2;
        rewardedAd2.setAdUnitId(thirdPartyAdPlacementId);
        this.rewardedAd.setRewardedAdEventListener(new RewardedAdListener(maxAdapterResponseParameters, maxRewardedAdapterListener));
        this.rewardedAd.loadAd(createAdRequest(maxAdapterResponseParameters));
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 == null || !rewardedAd2.isLoaded()) {
            log("Rewarded ad failed to load - ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(-4205, "Ad Display Failed"));
            return;
        }
        configureReward(maxAdapterResponseParameters);
        this.rewardedAd.show();
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String label = maxAdFormat.getLabel();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading " + label + " ad for placement: " + thirdPartyAdPlacementId + "...");
        updateUserConsent(maxAdapterResponseParameters);
        BannerAdView bannerAdView = new BannerAdView(activity.getApplicationContext());
        this.adView = bannerAdView;
        bannerAdView.setAdUnitId(thirdPartyAdPlacementId);
        this.adView.setAdSize(toAdSize(maxAdFormat));
        this.adView.setBannerAdEventListener(new AdViewListener(label, maxAdViewAdapterListener));
        this.adView.loadAd(createAdRequest(maxAdapterResponseParameters));
    }

    private void updateUserConsent(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting;
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null) {
            MobileAds.setUserConsent(privacySetting.booleanValue());
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

    private AdRequest createAdRequest(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("adapter_network_name", "applovin");
        hashMap.put(TapjoyConstants.TJC_ADAPTER_VERSION, getAdapterVersion());
        hashMap.put("adapter_network_sdk_version", AppLovinSdk.VERSION);
        return new AdRequest.Builder().setBiddingData(maxAdapterResponseParameters.getBidResponse()).setParameters(hashMap).build();
    }

    private static AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_320x50;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.BANNER_300x250;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_728x90;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 != 5) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.yandex.mobile.ads.common.AdRequestError r4) {
        /*
            int r0 = r4.getCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 == r2) goto L_0x0021
            r2 = 2
            if (r0 == r2) goto L_0x001e
            r2 = 3
            if (r0 == r2) goto L_0x001b
            r2 = 4
            if (r0 == r2) goto L_0x0018
            r2 = 5
            if (r0 == r2) goto L_0x0021
            goto L_0x0026
        L_0x0018:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L_0x0026
        L_0x001b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L_0x0026
        L_0x001e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L_0x0026
        L_0x0021:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            goto L_0x0026
        L_0x0024:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
        L_0x0026:
            com.applovin.mediation.adapter.MaxAdapterError r0 = new com.applovin.mediation.adapter.MaxAdapterError
            int r2 = r1.getErrorCode()
            java.lang.String r1 = r1.getErrorMessage()
            int r3 = r4.getCode()
            java.lang.String r4 = r4.getDescription()
            r0.<init>(r2, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.YandexMediationAdapter.toMaxError(com.yandex.mobile.ads.common.AdRequestError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private class InterstitialAdListener implements InterstitialAdEventListener {
        private final MaxInterstitialAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        InterstitialAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdLoaded() {
            YandexMediationAdapter.this.log("Interstitial ad loaded");
            this.listener.onInterstitialAdLoaded();
        }

        public void onAdFailedToLoad(AdRequestError adRequestError) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log("Interstitial ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onInterstitialAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        public void onAdShown() {
            YandexMediationAdapter.this.log("Interstitial ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onInterstitialAdDisplayed();
            }
        }

        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Interstitial ad impression tracked");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdClicked() {
            YandexMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onLeftApplication() {
            YandexMediationAdapter.this.log("Interstitial left application after click");
        }

        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log("Interstitial returned to application");
        }

        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Interstitial ad dismissed");
            this.listener.onInterstitialAdHidden();
        }
    }

    private class RewardedAdListener implements RewardedAdEventListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        RewardedAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxRewardedAdapterListener;
        }

        public void onAdLoaded() {
            YandexMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        public void onAdFailedToLoad(AdRequestError adRequestError) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log("Rewarded ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onRewardedAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        public void onAdShown() {
            YandexMediationAdapter.this.log("Rewarded ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onRewardedAdDisplayed();
                this.listener.onRewardedAdVideoStarted();
            }
        }

        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Rewarded ad impression tracked");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onAdClicked() {
            YandexMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        public void onLeftApplication() {
            YandexMediationAdapter.this.log("Rewarded ad left application after click");
        }

        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log("Rewarded ad returned to application");
        }

        public void onRewarded(Reward reward) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log("Rewarded user with reward: " + reward.getAmount() + " " + reward.getType());
            this.hasGrantedReward = true;
        }

        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || YandexMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = YandexMediationAdapter.this.getReward();
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                yandexMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }
    }

    private class AdViewListener implements BannerAdEventListener {
        private final String adFormatLabel;
        private final MaxAdViewAdapterListener listener;

        AdViewListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoaded() {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log(this.adFormatLabel + " ad loaded");
            this.listener.onAdViewAdLoaded(YandexMediationAdapter.this.adView);
        }

        public void onAdFailedToLoad(AdRequestError adRequestError) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log(this.adFormatLabel + " ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onAdViewAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        public void onAdClicked() {
            YandexMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        public void onLeftApplication() {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log(this.adFormatLabel + " ad left application after click");
        }

        public void onReturnedToApplication() {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            yandexMediationAdapter.log(this.adFormatLabel + " ad returned to application");
        }

        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter.this.log("AdView ad impression tracked");
            this.listener.onAdViewAdDisplayed();
        }
    }
}
