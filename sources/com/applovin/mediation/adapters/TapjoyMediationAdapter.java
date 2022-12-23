package com.applovin.mediation.adapters;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.appevents.AppEventsConstants;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyConnectFlag;
import java.util.HashMap;
import java.util.Hashtable;
import org.json.JSONObject;

public class TapjoyMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final String MEDIATION_AGENT = "applovin";
    private TJPlacement interstitialPlacement;
    private TJPlacement rewardedPlacement;

    public String getAdapterVersion() {
        return "12.4.2.0";
    }

    public void onDestroy() {
    }

    public TapjoyMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return Tapjoy.getVersion();
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Tapjoy SDK...");
        checkExistence(Tapjoy.class, TJPlacement.class);
        if (!Tapjoy.isConnected()) {
            Tapjoy.setDebugEnabled(maxAdapterInitializationParameters.isTesting());
            Hashtable hashtable = new Hashtable(1);
            hashtable.put(TapjoyConnectFlag.ENABLE_LOGGING, String.valueOf(maxAdapterInitializationParameters.isTesting()));
            updateConsentAndActivity(maxAdapterInitializationParameters, activity);
            Tapjoy.connect(activity, maxAdapterInitializationParameters.getServerParameters().getString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY), hashtable, new TJConnectListener() {
                public void onConnectSuccess() {
                    TapjoyMediationAdapter.this.log("Tapjoy SDK initialized");
                    if (AppLovinSdk.VERSION_CODE >= 90800) {
                        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, (String) null);
                    } else {
                        onCompletionListener.onCompletion();
                    }
                }

                public void onConnectFailure() {
                    TapjoyMediationAdapter.this.log("Tapjoy SDK failed to initialized");
                    if (AppLovinSdk.VERSION_CODE >= 90800) {
                        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE, (String) null);
                    } else {
                        onCompletionListener.onCompletion();
                    }
                }
            });
            return;
        }
        updateConsentAndActivity(maxAdapterInitializationParameters, activity);
        if (AppLovinSdk.VERSION_CODE >= 90800) {
            onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS, (String) null);
        } else {
            onCompletionListener.onCompletion();
        }
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        updateConsentAndActivity(maxAdapterSignalCollectionParameters, activity);
        maxSignalCollectionListener.onSignalCollected(Tapjoy.getUserToken());
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial...");
        if (!Tapjoy.isConnected()) {
            log("Tapjoy SDK is not initialized");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateConsentAndActivity(maxAdapterResponseParameters, activity);
        TJPlacement createPlacement = createPlacement(activity, maxAdapterResponseParameters, new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialPlacement = createPlacement;
        if (createPlacement != null) {
            createPlacement.requestContent();
        } else {
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.BAD_REQUEST);
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial...");
        if (this.interstitialPlacement.isContentReady()) {
            this.interstitialPlacement.showContent();
            return;
        }
        log("Interstitial ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad...");
        if (!Tapjoy.isConnected()) {
            log("Tapjoy SDK is not initialized");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateConsentAndActivity(maxAdapterResponseParameters, activity);
        TJPlacement createPlacement = createPlacement(activity, maxAdapterResponseParameters, new RewardedListener(maxRewardedAdapterListener));
        this.rewardedPlacement = createPlacement;
        if (createPlacement != null) {
            createPlacement.requestContent();
        } else {
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.BAD_REQUEST);
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedPlacement.isContentReady()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedPlacement.showContent();
            return;
        }
        log("Rewarded ad not ready");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
    }

    private void updateConsentAndActivity(MaxAdapterParameters maxAdapterParameters, Activity activity) {
        Tapjoy.setUserConsent(maxAdapterParameters.hasUserConsent() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        Tapjoy.belowConsentAge(maxAdapterParameters.isAgeRestrictedUser());
        Tapjoy.setActivity(activity);
    }

    private TJPlacement createPlacement(Activity activity, MaxAdapterResponseParameters maxAdapterResponseParameters, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement = new TJPlacement(activity, maxAdapterResponseParameters.getThirdPartyAdPlacementId(), tJPlacementListener);
        tJPlacement.setMediationName(maxAdapterResponseParameters.getServerParameters().getBoolean("set_mediation_identifier", true) ? MEDIATION_AGENT : "");
        tJPlacement.setAdapterVersion("12.4.2.0");
        if (tJPlacementListener instanceof TJPlacementVideoListener) {
            tJPlacement.setVideoListener((TJPlacementVideoListener) tJPlacementListener);
        }
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            try {
                tJPlacement.setAuctionData((HashMap) AppLovinSdkUtils.toMap(new JSONObject(maxAdapterResponseParameters.getBidResponse())));
            } catch (Throwable th) {
                log("Failed to load ad due to JSON deserialization error: ", th);
                return null;
            }
        }
        return tJPlacement;
    }

    /* access modifiers changed from: private */
    public MaxAdapterError maxErrorCodeFromTapjoyError(TJError tJError) {
        int i;
        if (tJError != null) {
            i = tJError.code;
        } else {
            i = 0;
        }
        int i2 = 204;
        if (i != 204) {
            i2 = i == -1011 ? MaxAdapterError.ERROR_CODE_NOT_INITIALIZED : MaxAdapterError.ERROR_CODE_UNSPECIFIED;
        }
        return new MaxAdapterError(i2, i);
    }

    private class InterstitialListener implements TJPlacementListener, TJPlacementVideoListener {
        final MaxInterstitialAdapterListener listener;

        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onRequestSuccess(TJPlacement tJPlacement) {
            if (tJPlacement.isContentAvailable()) {
                TapjoyMediationAdapter.this.log("Interstitial request succeeded");
                return;
            }
            TapjoyMediationAdapter.this.log("Interstitial request failed");
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Interstitial failed to load with error code: " + tJError.code + " and message: " + tJError.message);
            this.listener.onInterstitialAdLoadFailed(TapjoyMediationAdapter.this.maxErrorCodeFromTapjoyError(tJError));
        }

        public void onContentReady(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial loaded");
            this.listener.onInterstitialAdLoaded();
        }

        public void onContentShow(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial shown");
        }

        public void onClick(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onContentDismiss(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        public void onVideoStart(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial video start");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onVideoError(TJPlacement tJPlacement, String str) {
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Interstitial failed with error message: " + str);
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        public void onVideoComplete(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Interstitial video completed");
        }
    }

    private class RewardedListener implements TJPlacementListener, TJPlacementVideoListener {
        private boolean hasGrantedReward;
        final MaxRewardedAdapterListener listener;

        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        RewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onRequestSuccess(TJPlacement tJPlacement) {
            if (tJPlacement.isContentAvailable()) {
                TapjoyMediationAdapter.this.log("Rewarded request succeeded");
                return;
            }
            TapjoyMediationAdapter.this.log("Rewarded request failed");
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Rewarded failed to load with error code: " + tJError.code + " and message: " + tJError.message);
            this.listener.onRewardedAdLoadFailed(TapjoyMediationAdapter.this.maxErrorCodeFromTapjoyError(tJError));
        }

        public void onContentReady(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded loaded");
            this.listener.onRewardedAdLoaded();
        }

        public void onContentShow(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded shown");
            this.listener.onRewardedAdDisplayed();
        }

        public void onClick(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded clicked");
            this.listener.onRewardedAdClicked();
        }

        public void onContentDismiss(TJPlacement tJPlacement) {
            if (this.hasGrantedReward || TapjoyMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = TapjoyMediationAdapter.this.getReward();
                TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
                tapjoyMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            TapjoyMediationAdapter.this.log("Rewarded hidden");
            this.listener.onRewardedAdHidden();
        }

        public void onVideoStart(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded video began");
            this.listener.onRewardedAdVideoStarted();
        }

        public void onVideoError(TJPlacement tJPlacement, String str) {
            TapjoyMediationAdapter tapjoyMediationAdapter = TapjoyMediationAdapter.this;
            tapjoyMediationAdapter.log("Rewarded failed with error message: " + str);
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        public void onVideoComplete(TJPlacement tJPlacement) {
            TapjoyMediationAdapter.this.log("Rewarded video completed");
            this.listener.onRewardedAdVideoCompleted();
            this.hasGrantedReward = true;
        }
    }
}
