package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class GoogleMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final String APP_ID_PARAMETER = "app_id";
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    /* access modifiers changed from: private */
    public AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private RewardedAd mRewardBasedVideoAd;

    public String getAdapterVersion() {
        return "19.1.0.2";
    }

    public GoogleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Google SDK...");
        checkExistence(MobileAds.class, InterstitialAd.class, RewardedVideoAd.class, AdListener.class);
        if (INITIALIZED.compareAndSet(false, true)) {
            MobileAds.initialize((Context) activity, maxAdapterInitializationParameters.getServerParameters().getString("app_id", (String) null));
        }
        if (AppLovinSdk.VERSION_CODE >= 90800) {
            onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
        } else {
            onCompletionListener.onCompletion();
        }
    }

    public String getSdkVersion() {
        String adapterVersion = getAdapterVersion();
        return adapterVersion.substring(0, adapterVersion.lastIndexOf(46));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial for ad unit ID: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        InterstitialAd interstitialAd = new InterstitialAd(activity);
        this.mInterstitialAd = interstitialAd;
        interstitialAd.setAdUnitId(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.mInterstitialAd.setAdListener(new AdListener() {
            public void onAdClicked() {
            }

            public void onAdImpression() {
            }

            public void onAdLoaded() {
                GoogleMediationAdapter.this.log("Interstitial ad loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }

            public void onAdFailedToLoad(int i) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Interstitial ad failed to load with error: " + i);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(GoogleMediationAdapter.toMaxError(i));
            }

            public void onAdOpened() {
                GoogleMediationAdapter.this.log("Interstitial ad opened");
                maxInterstitialAdapterListener.onInterstitialAdDisplayed();
            }

            public void onAdLeftApplication() {
                GoogleMediationAdapter.this.log("Interstitial ad left application");
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }

            public void onAdClosed() {
                GoogleMediationAdapter.this.log("Interstitial ad closed");
                maxInterstitialAdapterListener.onInterstitialAdHidden();
            }
        });
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        this.mInterstitialAd.loadAd(createAdRequest(maxAdapterResponseParameters, activity));
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial for ad unit ID: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isLoaded()) {
            log("Interstitial ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
            return;
        }
        this.mInterstitialAd.show();
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad for ad unit ID: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        RewardedAd rewardedAd = new RewardedAd(activity, maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.mRewardBasedVideoAd = rewardedAd;
        if (rewardedAd.isLoaded()) {
            maxRewardedAdapterListener.onRewardedAdLoaded();
            return;
        }
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        this.mRewardBasedVideoAd.loadAd(createAdRequest(maxAdapterResponseParameters, activity), (RewardedAdLoadCallback) new RewardedAdLoadCallback() {
            public void onRewardedAdLoaded() {
                GoogleMediationAdapter.this.log("Rewarded ad loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }

            public void onRewardedAdFailedToLoad(int i) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded ad failed to load with error: " + i);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(GoogleMediationAdapter.toMaxError(i));
            }
        });
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        RewardedAd rewardedAd = this.mRewardBasedVideoAd;
        if (rewardedAd == null || !rewardedAd.isLoaded()) {
            log("Rewarded ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
            return;
        }
        configureReward(maxAdapterResponseParameters);
        this.mRewardBasedVideoAd.show(activity, new RewardedAdCallback() {
            private boolean hasGrantedReward;

            public void onRewardedAdOpened() {
                GoogleMediationAdapter.this.log("Rewarded ad opened");
                maxRewardedAdapterListener.onRewardedAdDisplayed();
                maxRewardedAdapterListener.onRewardedAdVideoStarted();
            }

            public void onRewardedAdClosed() {
                maxRewardedAdapterListener.onRewardedAdVideoCompleted();
                if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = GoogleMediationAdapter.this.getReward();
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    googleMediationAdapter.log("Rewarded user with reward: " + reward);
                    maxRewardedAdapterListener.onUserRewarded(reward);
                }
                GoogleMediationAdapter.this.log("Rewarded ad hidden");
                maxRewardedAdapterListener.onRewardedAdHidden();
            }

            public void onUserEarnedReward(RewardItem rewardItem) {
                GoogleMediationAdapter.this.log("Rewarded ad earned reward");
                this.hasGrantedReward = true;
            }

            public void onRewardedAdFailedToShow(int i) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded ad failed to show with error: " + i);
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(GoogleMediationAdapter.toMaxError(i));
            }
        });
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        log("Loading banner ad for ad unit ID: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AdView adView = new AdView(activity);
        this.mAdView = adView;
        adView.setAdUnitId(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.mAdView.setAdSize(toAdSize(maxAdFormat));
        this.mAdView.setAdListener(new AdListener() {
            public void onAdClicked() {
            }

            public void onAdImpression() {
            }

            public void onAdLoaded() {
                GoogleMediationAdapter.this.log("Banner ad loaded");
                maxAdViewAdapterListener.onAdViewAdLoaded(GoogleMediationAdapter.this.mAdView);
            }

            public void onAdFailedToLoad(int i) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Banner ad failed to load with error code: " + i);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(GoogleMediationAdapter.toMaxError(i));
            }

            public void onAdOpened() {
                GoogleMediationAdapter.this.log("Banner ad opened");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onAdLeftApplication() {
                GoogleMediationAdapter.this.log("Banner ad left application");
            }

            public void onAdClosed() {
                GoogleMediationAdapter.this.log("Banner ad closed");
            }
        });
        setRequestConfiguration(maxAdapterResponseParameters);
        this.mAdView.loadAd(createAdRequest(maxAdapterResponseParameters, activity));
    }

    public void onDestroy() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdListener((AdListener) null);
            this.mInterstitialAd = null;
        }
        this.mRewardBasedVideoAd = null;
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(int i) {
        return new MaxAdapterError(i == 0 ? MaxAdapterError.ERROR_CODE_INTERNAL_ERROR : i == 1 ? MaxAdapterError.ERROR_CODE_BAD_REQUEST : i == 2 ? MaxAdapterError.ERROR_CODE_NO_CONNECTION : i == 3 ? 204 : MaxAdapterError.ERROR_CODE_UNSPECIFIED, i);
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static void setRequestConfiguration(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        RequestConfiguration.Builder tagForChildDirectedTreatment = MobileAds.getRequestConfiguration().toBuilder().setTagForChildDirectedTreatment(getTagForChildDirectedTreatment(maxAdapterResponseParameters));
        String string = serverParameters.getString("test_device_ids", (String) null);
        if (!TextUtils.isEmpty(string)) {
            tagForChildDirectedTreatment.setTestDeviceIds(Arrays.asList(string.split(",")));
        }
        MobileAds.setRequestConfiguration(tagForChildDirectedTreatment.build());
    }

    private static AdRequest createAdRequest(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        AdRequest.Builder builder = new AdRequest.Builder();
        if (serverParameters.containsKey("is_designed_for_families")) {
            builder.setIsDesignedForFamilies(serverParameters.getBoolean("is_designed_for_families"));
        }
        if (serverParameters.getBoolean("set_mediation_identifier", true)) {
            builder.setRequestAgent(mediationTag());
        }
        Bundle bundle = new Bundle();
        if (!maxAdapterResponseParameters.hasUserConsent()) {
            bundle.putString("npa", "1");
        }
        if (AppLovinSdk.VERSION_CODE >= 91100 && maxAdapterResponseParameters.isDoNotSell()) {
            bundle.putInt("rdp", 1);
            activity.getPreferences(0).edit().putInt("gad_rdp", 1).commit();
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    private static void updateMuteState(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("is_muted")) {
            MobileAds.setAppMuted(serverParameters.getBoolean("is_muted"));
        }
    }

    private static int getTagForChildDirectedTreatment(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        return maxAdapterResponseParameters.isAgeRestrictedUser() ? 1 : 0;
    }
}
