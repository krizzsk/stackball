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
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.C2043Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class FacebookMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus sStatus;
    /* access modifiers changed from: private */
    public AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private RewardedVideoAd mRewardedVideoAd;
    /* access modifiers changed from: private */
    public AtomicBoolean onInterstitialAdHiddenCalled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public AtomicBoolean onRewardedAdHiddenCalled = new AtomicBoolean();
    /* access modifiers changed from: private */
    public AtomicBoolean onRewardedAdVideoCompletedCalled = new AtomicBoolean();

    public String getAdapterVersion() {
        return "5.8.0.1";
    }

    public FacebookMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        checkExistence(InterstitialAd.class, InterstitialAdListener.class, AdSettings.class);
        updateAdSettings(maxAdapterInitializationParameters);
        if (INITIALIZED.compareAndSet(false, true)) {
            if (AppLovinSdk.VERSION_CODE >= 90800) {
                sStatus = MaxAdapter.InitializationStatus.INITIALIZING;
            }
            ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("placement_ids");
            C15861 r1 = new AudienceNetworkAds.InitListener() {
                public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                    if (initResult.isSuccess()) {
                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                        facebookMediationAdapter.log("Facebook SDK successfully finished initialization: " + initResult.getMessage());
                        if (AppLovinSdk.VERSION_CODE >= 90800) {
                            MaxAdapter.InitializationStatus unused = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                            onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, (String) null);
                            return;
                        }
                        onCompletionListener.onCompletion();
                        return;
                    }
                    FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                    facebookMediationAdapter2.log("Facebook SDK failed to finished initialization: " + initResult.getMessage());
                    if (AppLovinSdk.VERSION_CODE >= 90800) {
                        MaxAdapter.InitializationStatus unused2 = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                        onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, initResult.getMessage());
                        return;
                    }
                    onCompletionListener.onCompletion();
                }
            };
            if (maxAdapterInitializationParameters.isTesting()) {
                AdSettings.setDebugBuild(true);
            }
            log("Initializing Facebook SDK with placements: " + stringArrayList);
            AudienceNetworkAds.buildInitSettings(activity).withMediationService(getMediationIdentifier()).withPlacementIds(stringArrayList).withInitListener(r1).initialize();
            return;
        }
        log("Facebook attempted initialization already - marking initialization as completed");
        if (AppLovinSdk.VERSION_CODE >= 90800) {
            onCompletionListener.onCompletion(sStatus, (String) null);
        } else {
            onCompletionListener.onCompletion();
        }
    }

    public String getSdkVersion() {
        return getVersionString(BuildConfig.class, "VERSION_NAME");
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mInterstitialAd = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(new InterstitialAdExtendedListener() {
            public void onRewardedAdCompleted() {
            }

            public void onRewardedAdServerFailed() {
            }

            public void onRewardedAdServerSucceeded() {
            }

            public void onAdLoaded(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad loaded: " + thirdPartyAdPlacementId);
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }

            public void onError(C2043Ad ad, AdError adError) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error code (" + adError.getErrorCode() + ") and message: " + adError.getErrorMessage());
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(FacebookMediationAdapter.toMaxError(adError));
            }

            public void onAdClicked(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad clicked: " + thirdPartyAdPlacementId);
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }

            public void onLoggingImpression(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad logging impression: " + thirdPartyAdPlacementId);
                maxInterstitialAdapterListener.onInterstitialAdDisplayed();
            }

            public void onInterstitialDisplayed(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad displayed: " + thirdPartyAdPlacementId);
            }

            public void onInterstitialDismissed(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad hidden: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                    maxInterstitialAdapterListener.onInterstitialAdHidden();
                }
            }

            public void onInterstitialActivityDestroyed() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Interstitial ad Activity destroyed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                    maxInterstitialAdapterListener.onInterstitialAdHidden();
                }
            }
        });
        if (this.mInterstitialAd.isAdLoaded() && !this.mInterstitialAd.isAdInvalidated()) {
            log("An interstitial ad has been loaded already");
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
        } else if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading mediated interstitial ad...");
            this.mInterstitialAd.loadAd(withAdListener.build());
        } else {
            log("Loading bidding interstitial ad...");
            this.mInterstitialAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
            log("Unable to show interstitial - no ad loaded...");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
        } else if (!this.mInterstitialAd.isAdInvalidated()) {
            this.mInterstitialAd.show();
        } else {
            log("Unable to show interstitial - ad expired...");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        }
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedVideoAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener = rewardedVideoAd.buildLoadAdConfig().withAdListener(new RewardedVideoAdExtendedListener() {
            private boolean hasGrantedReward;

            public void onAdLoaded(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad loaded: " + thirdPartyAdPlacementId);
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }

            public void onError(C2043Ad ad, AdError adError) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad (" + thirdPartyAdPlacementId + ") failed to load with error code (" + adError.getErrorCode() + ") and message: " + adError.getErrorMessage());
                maxRewardedAdapterListener.onRewardedAdLoadFailed(FacebookMediationAdapter.toMaxError(adError));
            }

            public void onAdClicked(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad clicked: " + thirdPartyAdPlacementId);
                maxRewardedAdapterListener.onRewardedAdClicked();
            }

            public void onRewardedVideoClosed() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad hidden: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                        MaxReward reward = FacebookMediationAdapter.this.getReward();
                        FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                        facebookMediationAdapter2.log("Rewarded user with reward: " + reward);
                        maxRewardedAdapterListener.onUserRewarded(reward);
                    }
                    maxRewardedAdapterListener.onRewardedAdHidden();
                }
            }

            public void onRewardedVideoCompleted() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad video completed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedAdapterListener.onRewardedAdVideoCompleted();
                    this.hasGrantedReward = true;
                }
            }

            public void onLoggingImpression(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad logging impression: " + thirdPartyAdPlacementId);
                maxRewardedAdapterListener.onRewardedAdDisplayed();
                maxRewardedAdapterListener.onRewardedAdVideoStarted();
            }

            public void onRewardedVideoActivityDestroyed() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Rewarded ad Activity destroyed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedAdapterListener.onRewardedAdVideoCompleted();
                }
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    maxRewardedAdapterListener.onRewardedAdHidden();
                }
            }
        });
        if (this.mRewardedVideoAd.isAdLoaded() && !this.mRewardedVideoAd.isAdInvalidated()) {
            log("A rewarded ad has been loaded already");
            maxRewardedAdapterListener.onRewardedAdLoaded();
        } else if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading mediated rewarded ad...");
            this.mRewardedVideoAd.loadAd(withAdListener.build());
        } else {
            log("Loading bidding rewarded ad...");
            this.mRewardedVideoAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            log("Unable to show rewarded ad - no ad loaded...");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
        } else if (!this.mRewardedVideoAd.isAdInvalidated()) {
            configureReward(maxAdapterResponseParameters);
            this.mRewardedVideoAd.show();
        } else {
            log("Unable to show rewarded ad - ad expired...");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        }
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(BidderTokenProvider.getBidderToken(activity));
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading banner ad: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        AdView adView = new AdView((Context) activity, thirdPartyAdPlacementId, toAdSize(maxAdFormat));
        this.mAdView = adView;
        AdView.AdViewLoadConfigBuilder withAdListener = adView.buildLoadAdConfig().withAdListener(new AdListener() {
            public void onAdLoaded(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Banner ad loaded: " + thirdPartyAdPlacementId);
                maxAdViewAdapterListener.onAdViewAdLoaded(FacebookMediationAdapter.this.mAdView);
            }

            public void onError(C2043Ad ad, AdError adError) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Banner ad (" + thirdPartyAdPlacementId + ") failed to load with error code (" + adError.getErrorCode() + ") and message: " + adError.getErrorMessage());
                maxAdViewAdapterListener.onAdViewAdLoadFailed(FacebookMediationAdapter.toMaxError(adError));
            }

            public void onAdClicked(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Banner ad clicked: " + thirdPartyAdPlacementId);
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onLoggingImpression(C2043Ad ad) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                facebookMediationAdapter.log("Banner ad displayed: " + thirdPartyAdPlacementId);
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }
        });
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading mediated banner ad...");
            this.mAdView.loadAd(withAdListener.build());
            return;
        }
        log("Loading bidding banner ad...");
        this.mAdView.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
    }

    public void onDestroy() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.mInterstitialAd = null;
        }
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.mRewardedVideoAd = null;
        }
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_HEIGHT_50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_HEIGHT_90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    private void updateAdSettings(MaxAdapterParameters maxAdapterParameters) {
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        if (serverParameters.containsKey("video_autoplay")) {
            AdSettings.setVideoAutoplay(serverParameters.getBoolean("video_autoplay"));
        }
        AdSettings.setMixedAudience(maxAdapterParameters.isAgeRestrictedUser());
        String string = serverParameters.getString("test_device_ids", (String) null);
        if (!TextUtils.isEmpty(string)) {
            AdSettings.addTestDevices(Arrays.asList(string.split(",")));
        }
        AdSettings.setMediationService(getMediationIdentifier());
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(AdError adError) {
        int i;
        int errorCode = adError.getErrorCode();
        if (errorCode == AdError.NETWORK_ERROR.getErrorCode()) {
            i = MaxAdapterError.ERROR_CODE_NO_CONNECTION;
        } else if (errorCode == AdError.NO_FILL.getErrorCode()) {
            i = 204;
        } else if (errorCode == AdError.LOAD_TOO_FREQUENTLY.getErrorCode()) {
            i = -5201;
        } else if (errorCode == AdError.SERVER_ERROR.getErrorCode()) {
            i = MaxAdapterError.ERROR_CODE_SERVER_ERROR;
        } else {
            i = errorCode == AdError.INTERNAL_ERROR.getErrorCode() ? MaxAdapterError.ERROR_CODE_TIMEOUT : MaxAdapterError.ERROR_CODE_UNSPECIFIED;
        }
        return new MaxAdapterError(i, errorCode);
    }

    private String getMediationIdentifier() {
        return "APPLOVIN_" + AppLovinSdk.VERSION + CertificateUtil.DELIMITER + getAdapterVersion();
    }
}
