package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.chartboost.sdk.CBLocation;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.GDPR;
import java.util.concurrent.atomic.AtomicBoolean;

public class ChartboostMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final ChartboostMediationAdapterRouter ROUTER;
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus sStatus;
    private String mLocation;

    public String getAdapterVersion() {
        return "8.2.1.0";
    }

    static {
        if (AppLovinSdk.VERSION_CODE >= 90802) {
            ROUTER = (ChartboostMediationAdapterRouter) MediationAdapterRouter.getSharedInstance(ChartboostMediationAdapterRouter.class);
        } else {
            ROUTER = new ChartboostMediationAdapterRouter();
        }
    }

    public ChartboostMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        checkExistence(Chartboost.class);
        if (INITIALIZED.compareAndSet(false, true)) {
            sStatus = MaxAdapter.InitializationStatus.INITIALIZING;
            Bundle serverParameters = maxAdapterInitializationParameters.getServerParameters();
            String string = serverParameters.getString("app_id");
            log("Initializing Chartboost SDK with app id: " + string + "...");
            ROUTER.setOnCompletionListener(onCompletionListener);
            updateConsentStatus(maxAdapterInitializationParameters, activity.getApplicationContext());
            Chartboost.startWithAppId(activity.getApplicationContext(), string, serverParameters.getString("app_signature"));
            Chartboost.setDelegate(ROUTER.getDelegate());
            Chartboost.setMediation(Chartboost.CBMediation.CBMediationOther, AppLovinSdk.VERSION, getAdapterVersion());
            Chartboost.setAutoCacheAds(serverParameters.getBoolean("auto_cache_ads"));
            if (maxAdapterInitializationParameters.isTesting()) {
                Chartboost.setLoggingLevel(CBLogging.Level.ALL);
            }
            if (serverParameters.containsKey("prefetch_video_content")) {
                Chartboost.setShouldPrefetchVideoContent(serverParameters.getBoolean("prefetch_video_content"));
                return;
            }
            return;
        }
        log("Chartboost SDK already initialized...");
        if (Chartboost.getDelegate() == null) {
            Chartboost.setDelegate(ROUTER.getDelegate());
        }
        onCompletionListener.onCompletion(sStatus, (String) null);
    }

    public String getSdkVersion() {
        return Chartboost.getSDKVersion();
    }

    public void onDestroy() {
        ROUTER.removeAdapter(this, this.mLocation);
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        this.mLocation = retrieveLocation(maxAdapterResponseParameters);
        log("Loading interstitial ad for location \"" + this.mLocation + "\"...");
        updateConsentStatus(maxAdapterResponseParameters, activity.getApplicationContext());
        ROUTER.addInterstitialAdapter(this, maxInterstitialAdapterListener, this.mLocation);
        if (Chartboost.hasInterstitial(this.mLocation)) {
            log("Ad is available already");
            ROUTER.onAdLoaded(this.mLocation);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Chartboost.cacheInterstitial(this.mLocation);
        } else {
            log("Ad load failed: Chartboost does not support showing interstitial ads for devices with Android versions lower than 21");
            ROUTER.onAdLoadFailed(maxAdapterResponseParameters.getThirdPartyAdPlacementId(), MaxAdapterError.INVALID_CONFIGURATION);
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad for location \"" + this.mLocation + "\"...");
        ROUTER.addShowingAdapter(this);
        updateShowConfigurations(maxAdapterResponseParameters);
        if (Chartboost.hasInterstitial(this.mLocation)) {
            Chartboost.showInterstitial(this.mLocation);
            return;
        }
        log("Interstitial ad not ready");
        ROUTER.onAdDisplayFailed(this.mLocation, MaxAdapterError.AD_NOT_READY);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        this.mLocation = retrieveLocation(maxAdapterResponseParameters);
        log("Loading rewarded ad for location \"" + this.mLocation + "\"...");
        updateConsentStatus(maxAdapterResponseParameters, activity.getApplicationContext());
        ROUTER.addRewardedAdapter(this, maxRewardedAdapterListener, this.mLocation);
        if (Chartboost.hasRewardedVideo(this.mLocation)) {
            log("Ad is available already");
            ROUTER.onAdLoaded(this.mLocation);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Chartboost.cacheRewardedVideo(this.mLocation);
        } else {
            log("Ad load failed: Chartboost does not support showing rewarded ads for devices with Android versions lower than 21");
            ROUTER.onAdLoadFailed(maxAdapterResponseParameters.getThirdPartyAdPlacementId(), MaxAdapterError.INVALID_CONFIGURATION);
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad for location \"" + this.mLocation + "\"...");
        ROUTER.addShowingAdapter(this);
        updateShowConfigurations(maxAdapterResponseParameters);
        if (Chartboost.hasRewardedVideo(this.mLocation)) {
            configureReward(maxAdapterResponseParameters);
            Chartboost.showRewardedVideo(this.mLocation);
            return;
        }
        log("Rewarded ad not ready");
        ROUTER.onAdDisplayFailed(this.mLocation, MaxAdapterError.AD_NOT_READY);
    }

    /* access modifiers changed from: package-private */
    public void updateConsentStatus(MaxAdapterParameters maxAdapterParameters, Context context) {
        Boolean privacySetting;
        Boolean privacySetting2;
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null) {
            Chartboost.addDataUseConsent(context, new GDPR(privacySetting2.booleanValue() ? GDPR.GDPR_CONSENT.BEHAVIORAL : GDPR.GDPR_CONSENT.NON_BEHAVIORAL));
        }
        if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterParameters)) != null) {
            Chartboost.addDataUseConsent(context, new CCPA(privacySetting.booleanValue() ? CCPA.CCPA_CONSENT.OPT_OUT_SALE : CCPA.CCPA_CONSENT.OPT_IN_SALE));
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

    private String retrieveLocation(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        return !TextUtils.isEmpty(maxAdapterResponseParameters.getThirdPartyAdPlacementId()) ? maxAdapterResponseParameters.getThirdPartyAdPlacementId() : CBLocation.LOCATION_DEFAULT;
    }

    private void updateShowConfigurations(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("hide_system_ui")) {
            Chartboost.setShouldHideSystemUI(Boolean.valueOf(serverParameters.getBoolean("hide_system_ui")));
        }
    }

    private static class ChartboostMediationAdapterRouter extends MediationAdapterRouter {
        private final ChartboostDelegate chartboostDelegate;
        /* access modifiers changed from: private */
        public boolean hasGrantedReward;
        /* access modifiers changed from: private */
        public final AtomicBoolean isShowingAd;
        /* access modifiers changed from: private */
        public MaxAdapter.OnCompletionListener onCompletionListener;

        /* access modifiers changed from: package-private */
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener2) {
        }

        private ChartboostMediationAdapterRouter() {
            this.isShowingAd = new AtomicBoolean();
            this.chartboostDelegate = new ChartboostDelegate() {
                public void didInitialize() {
                    ChartboostMediationAdapterRouter.this.log("Chartboost SDK initialized");
                    MaxAdapter.InitializationStatus unused = ChartboostMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                    if (ChartboostMediationAdapterRouter.this.onCompletionListener != null) {
                        ChartboostMediationAdapterRouter.this.onCompletionListener.onCompletion(ChartboostMediationAdapter.sStatus, (String) null);
                        MaxAdapter.OnCompletionListener unused2 = ChartboostMediationAdapterRouter.this.onCompletionListener = null;
                    }
                }

                public void didCacheInterstitial(String str) {
                    ChartboostMediationAdapterRouter.this.log("Interstitial loaded");
                    ChartboostMediationAdapterRouter.this.onAdLoaded(str);
                }

                public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
                    MaxAdapterError access$300 = ChartboostMediationAdapterRouter.toMaxError(cBImpressionError);
                    if (ChartboostMediationAdapterRouter.this.isShowingAd.compareAndSet(true, false)) {
                        ChartboostMediationAdapterRouter chartboostMediationAdapterRouter = ChartboostMediationAdapterRouter.this;
                        chartboostMediationAdapterRouter.log("Interstitial failed to show with error: " + cBImpressionError);
                        ChartboostMediationAdapterRouter.this.onAdDisplayFailed(str, access$300);
                        return;
                    }
                    ChartboostMediationAdapterRouter chartboostMediationAdapterRouter2 = ChartboostMediationAdapterRouter.this;
                    chartboostMediationAdapterRouter2.log("Interstitial failed to load with error: " + cBImpressionError);
                    ChartboostMediationAdapterRouter.this.onAdLoadFailed(str, access$300);
                }

                public void didDisplayInterstitial(String str) {
                    ChartboostMediationAdapterRouter.this.log("Interstitial shown");
                    ChartboostMediationAdapterRouter.this.onAdDisplayed(str);
                }

                public void didClickInterstitial(String str) {
                    ChartboostMediationAdapterRouter.this.log("Interstitial clicked");
                    ChartboostMediationAdapterRouter.this.onAdClicked(str);
                }

                public void didDismissInterstitial(String str) {
                    ChartboostMediationAdapterRouter.this.isShowingAd.set(false);
                    ChartboostMediationAdapterRouter.this.log("Interstitial hidden");
                    ChartboostMediationAdapterRouter.this.onAdHidden(str);
                }

                public void didCacheRewardedVideo(String str) {
                    ChartboostMediationAdapterRouter.this.log("Rewarded ad loaded");
                    ChartboostMediationAdapterRouter.this.onAdLoaded(str);
                }

                public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
                    MaxAdapterError access$300 = ChartboostMediationAdapterRouter.toMaxError(cBImpressionError);
                    if (ChartboostMediationAdapterRouter.this.isShowingAd.compareAndSet(true, false)) {
                        ChartboostMediationAdapterRouter chartboostMediationAdapterRouter = ChartboostMediationAdapterRouter.this;
                        chartboostMediationAdapterRouter.log("Rewarded ad failed to show with error: " + cBImpressionError);
                        ChartboostMediationAdapterRouter.this.onAdDisplayFailed(str, access$300);
                        return;
                    }
                    ChartboostMediationAdapterRouter chartboostMediationAdapterRouter2 = ChartboostMediationAdapterRouter.this;
                    chartboostMediationAdapterRouter2.log("Rewarded ad failed to load with error: " + cBImpressionError);
                    ChartboostMediationAdapterRouter.this.onAdLoadFailed(str, access$300);
                }

                public void didDisplayRewardedVideo(String str) {
                    ChartboostMediationAdapterRouter.this.log("Rewarded ad shown");
                    ChartboostMediationAdapterRouter.this.onAdDisplayed(str);
                    ChartboostMediationAdapterRouter.this.onRewardedAdVideoStarted(str);
                }

                public void didClickRewardedVideo(String str) {
                    ChartboostMediationAdapterRouter.this.log("Rewarded ad clicked");
                    ChartboostMediationAdapterRouter.this.onAdClicked(str);
                }

                public void didDismissRewardedVideo(String str) {
                    ChartboostMediationAdapterRouter.this.isShowingAd.set(false);
                    if (ChartboostMediationAdapterRouter.this.hasGrantedReward || ChartboostMediationAdapterRouter.this.shouldAlwaysRewardUser(str)) {
                        MaxReward reward = ChartboostMediationAdapterRouter.this.getReward(str);
                        ChartboostMediationAdapterRouter chartboostMediationAdapterRouter = ChartboostMediationAdapterRouter.this;
                        chartboostMediationAdapterRouter.log("Rewarded ad user with reward: " + reward);
                        ChartboostMediationAdapterRouter.this.onUserRewarded(str, reward);
                        boolean unused = ChartboostMediationAdapterRouter.this.hasGrantedReward = false;
                    }
                    ChartboostMediationAdapterRouter.this.log("Rewarded ad hidden");
                    ChartboostMediationAdapterRouter.this.onAdHidden(str);
                }

                public void didCompleteRewardedVideo(String str, int i) {
                    ChartboostMediationAdapterRouter.this.log("Rewarded ad video completed");
                    ChartboostMediationAdapterRouter.this.onRewardedAdVideoCompleted(str);
                    boolean unused = ChartboostMediationAdapterRouter.this.hasGrantedReward = true;
                }

                public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
                    ChartboostMediationAdapterRouter chartboostMediationAdapterRouter = ChartboostMediationAdapterRouter.this;
                    chartboostMediationAdapterRouter.log("Failed to record click at \"" + str + "\" because of error: " + cBClickError);
                }
            };
        }

        /* access modifiers changed from: package-private */
        public ChartboostDelegate getDelegate() {
            return this.chartboostDelegate;
        }

        /* access modifiers changed from: package-private */
        public void setOnCompletionListener(MaxAdapter.OnCompletionListener onCompletionListener2) {
            this.onCompletionListener = onCompletionListener2;
        }

        public void addShowingAdapter(MaxAdapter maxAdapter) {
            super.addShowingAdapter(maxAdapter);
            this.isShowingAd.set(true);
        }

        /* access modifiers changed from: private */
        public static MaxAdapterError toMaxError(CBError.CBImpressionError cBImpressionError) {
            MaxAdapterError maxAdapterError;
            if (cBImpressionError == CBError.CBImpressionError.INTERNAL) {
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            } else if (cBImpressionError == CBError.CBImpressionError.INTERNET_UNAVAILABLE) {
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
            } else if (cBImpressionError == CBError.CBImpressionError.TOO_MANY_CONNECTIONS) {
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            } else if (cBImpressionError == CBError.CBImpressionError.WRONG_ORIENTATION) {
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
            } else if (cBImpressionError == CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED) {
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
            } else if (cBImpressionError == CBError.CBImpressionError.NETWORK_FAILURE) {
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
            } else if (cBImpressionError == CBError.CBImpressionError.NO_AD_FOUND) {
                maxAdapterError = MaxAdapterError.NO_FILL;
            } else if (cBImpressionError == CBError.CBImpressionError.SESSION_NOT_STARTED) {
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
            } else if (cBImpressionError == CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE) {
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            } else if (cBImpressionError == CBError.CBImpressionError.USER_CANCELLATION) {
                maxAdapterError = MaxAdapterError.UNSPECIFIED;
            } else if (cBImpressionError == CBError.CBImpressionError.INVALID_LOCATION) {
                maxAdapterError = MaxAdapterError.UNSPECIFIED;
            } else if (cBImpressionError == CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE) {
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
            } else if (cBImpressionError == CBError.CBImpressionError.ASSET_PREFETCH_IN_PROGRESS) {
                maxAdapterError = MaxAdapterError.AD_NOT_READY;
            } else if (cBImpressionError == CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW || cBImpressionError == CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT || cBImpressionError == CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR) {
                maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
            } else if (cBImpressionError == CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW) {
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
            } else if (cBImpressionError == CBError.CBImpressionError.NO_HOST_ACTIVITY) {
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            } else {
                maxAdapterError = MaxAdapterError.UNSPECIFIED;
            }
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), cBImpressionError.ordinal(), cBImpressionError.name());
        }
    }
}
