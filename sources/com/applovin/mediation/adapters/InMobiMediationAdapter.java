package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.applovin.impl.sdk.utils.BundleUtils;
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
import com.facebook.appevents.AppEventsConstants;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.vungle.warren.model.Cookie;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class InMobiMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxSignalProvider {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    private InMobiBanner adView;
    private AdViewListener adViewListener;
    private InMobiInterstitial interstitialAd;
    private InterstitialListener interstitialAdListener;
    private InMobiInterstitial rewardedAd;
    private RewardedAdListener rewardedAdListener;
    private InMobiBanner signalAdView;
    private InMobiInterstitial signalInterstitial;

    public String getAdapterVersion() {
        return "9.1.1.4";
    }

    public InMobiMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return InMobiSdk.getVersion();
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        int i;
        int i2;
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE == status) {
            maxSignalCollectionListener.onSignalCollectionFailed("InMobi SDK initialization failed.");
            return;
        }
        Bundle bundle = maxAdapterSignalCollectionParameters.getServerParameters().getBundle("placement_ids");
        if (bundle == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("No \"placement_ids\" provided.");
            return;
        }
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        String lowerCase = (MaxAdFormat.LEADER == adFormat ? MaxAdFormat.BANNER : adFormat).getLabel().toLowerCase(Locale.ENGLISH);
        if (!bundle.containsKey(lowerCase)) {
            maxSignalCollectionListener.onSignalCollectionFailed("No placement id for \"" + lowerCase + "\" found.");
            return;
        }
        try {
            long parseLong = Long.parseLong(BundleUtils.getString(lowerCase, bundle));
            log("Collecting signal for " + adFormat + " ad with placement id: \"" + parseLong + "\"...");
            if (MaxAdFormat.INTERSTITIAL == adFormat || MaxAdFormat.REWARDED == adFormat) {
                InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(activity, parseLong, new InterstitialAdEventListener() {
                    public void onRequestPayloadCreated(byte[] bArr) {
                        InMobiMediationAdapter.this.log("Signal collection successful");
                        maxSignalCollectionListener.onSignalCollected(new String(bArr, Charset.forName("UTF-8")));
                    }

                    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
                        String message = inMobiAdRequestStatus.getMessage();
                        InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                        inMobiMediationAdapter.log("Signal collection failed with error: " + message);
                        maxSignalCollectionListener.onSignalCollectionFailed(message);
                    }
                });
                this.signalInterstitial = inMobiInterstitial;
                inMobiInterstitial.setExtras(getExtras(maxAdapterSignalCollectionParameters));
                this.signalInterstitial.getSignals();
                return;
            }
            if (adFormat == MaxAdFormat.BANNER) {
                i2 = 320;
                i = 50;
            } else if (adFormat == MaxAdFormat.LEADER) {
                i2 = 728;
                i = 90;
            } else if (adFormat == MaxAdFormat.MREC) {
                i2 = ErrorCode.GENERAL_WRAPPER_ERROR;
                i = 250;
            } else {
                throw new IllegalArgumentException("Unsupported ad format: " + adFormat);
            }
            InMobiBanner inMobiBanner = new InMobiBanner((Context) activity, parseLong);
            this.signalAdView = inMobiBanner;
            inMobiBanner.setListener(new BannerAdEventListener() {
                public void onRequestPayloadCreated(byte[] bArr) {
                    InMobiMediationAdapter.this.log("Collecting signal succeeded");
                    maxSignalCollectionListener.onSignalCollected(new String(bArr, Charset.forName("UTF-8")));
                }

                public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
                    String message = inMobiAdRequestStatus.getMessage();
                    InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                    inMobiMediationAdapter.log("Collecting signal failed with error: " + message);
                    maxSignalCollectionListener.onSignalCollectionFailed(message);
                }
            });
            this.signalAdView.setBannerSize(i2, i);
            this.signalAdView.setExtras(getExtras(maxAdapterSignalCollectionParameters));
            this.signalAdView.getSignals();
        } catch (NumberFormatException unused) {
            maxSignalCollectionListener.onSignalCollectionFailed("Placement id for " + adFormat.getLabel() + " is invalid.");
        }
    }

    public void onDestroy() {
        InMobiBanner inMobiBanner = this.adView;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
            this.adView = null;
            this.adViewListener = null;
        }
        this.interstitialAd = null;
        this.interstitialAdListener = null;
        this.rewardedAd = null;
        this.rewardedAdListener = null;
        this.signalInterstitial = null;
        this.signalAdView = null;
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("account_id");
            log("Initializing InMobi SDK with account id: " + string + "...");
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            checkExistence(InMobiSdk.class, InMobiBanner.class);
            InMobiSdk.init(activity, string, getConsentJSONObject(maxAdapterInitializationParameters), new SdkInitializationListener() {
                public void onInitializationComplete(Error error) {
                    if (error != null) {
                        InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                        inMobiMediationAdapter.log("InMobi SDK initialization failed with error: " + error.getMessage());
                        MaxAdapter.InitializationStatus unused = InMobiMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                        onCompletionListener.onCompletion(InMobiMediationAdapter.status, error.getMessage());
                        return;
                    }
                    InMobiMediationAdapter.this.log("InMobi SDK successfully initialized.");
                    MaxAdapter.InitializationStatus unused2 = InMobiMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(InMobiMediationAdapter.status, (String) null);
                }
            });
            InMobiSdk.setLogLevel(maxAdapterInitializationParameters.isTesting() ? InMobiSdk.LogLevel.DEBUG : InMobiSdk.LogLevel.ERROR);
            return;
        }
        log("InMobi SDK already initialized");
        onCompletionListener.onCompletion(status, (String) null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        int i;
        int i2;
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading " + maxAdFormat.getLabel() + " AdView ad for placement: " + parseLong + "...");
        InMobiBanner inMobiBanner = new InMobiBanner((Context) activity, parseLong);
        this.adView = inMobiBanner;
        inMobiBanner.setExtras(getExtras(maxAdapterResponseParameters));
        this.adView.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        this.adView.setEnableAutoRefresh(false);
        AdViewListener adViewListener2 = new AdViewListener(maxAdViewAdapterListener);
        this.adViewListener = adViewListener2;
        this.adView.setListener(adViewListener2);
        InMobiSdk.updateGDPRConsent(getConsentJSONObject(maxAdapterResponseParameters));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (maxAdFormat == MaxAdFormat.BANNER) {
            i2 = 320;
            i = 50;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            i2 = 728;
            i = 90;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            i2 = ErrorCode.GENERAL_WRAPPER_ERROR;
            i = 250;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
        this.adView.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) i2) * displayMetrics.density), Math.round(((float) i) * displayMetrics.density)));
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.adView.load(bidResponse.getBytes());
        } else {
            this.adView.load();
        }
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading interstitial ad for placement: " + parseLong + "...");
        InterstitialListener interstitialListener = new InterstitialListener(maxInterstitialAdapterListener);
        this.interstitialAdListener = interstitialListener;
        this.interstitialAd = createFullscreenAd(parseLong, maxAdapterResponseParameters, interstitialListener, activity);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.interstitialAd.load(bidResponse.getBytes());
        } else {
            this.interstitialAd.load();
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (!showFullscreenAd(this.interstitialAd)) {
            log("Interstitial ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
        }
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading rewarded ad for placement: " + parseLong + "...");
        RewardedAdListener rewardedAdListener2 = new RewardedAdListener(maxRewardedAdapterListener);
        this.rewardedAdListener = rewardedAdListener2;
        this.rewardedAd = createFullscreenAd(parseLong, maxAdapterResponseParameters, rewardedAdListener2, activity);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.rewardedAd.load(bidResponse.getBytes());
        } else {
            this.rewardedAd.load();
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        configureReward(maxAdapterResponseParameters);
        if (!showFullscreenAd(this.rewardedAd)) {
            log("Rewarded ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
        }
    }

    private InMobiInterstitial createFullscreenAd(long j, MaxAdapterResponseParameters maxAdapterResponseParameters, InterstitialAdEventListener interstitialAdEventListener, Activity activity) {
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(activity, j, interstitialAdEventListener);
        inMobiInterstitial.setExtras(getExtras(maxAdapterResponseParameters));
        InMobiSdk.updateGDPRConsent(getConsentJSONObject(maxAdapterResponseParameters));
        return inMobiInterstitial;
    }

    private boolean showFullscreenAd(InMobiInterstitial inMobiInterstitial) {
        if (!inMobiInterstitial.isReady()) {
            return false;
        }
        inMobiInterstitial.show();
        return true;
    }

    private JSONObject getConsentJSONObject(MaxAdapterParameters maxAdapterParameters) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                jSONObject.put("gdpr", 1);
                Boolean privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters);
                if (privacySetting != null) {
                    jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, privacySetting);
                }
            } else if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY) {
                jSONObject.put("gdpr", 0);
            }
        } catch (JSONException e) {
            log("Failed to create consent JSON object", e);
        }
        return jSONObject;
    }

    private Map<String, String> getExtras(MaxAdapterParameters maxAdapterParameters) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("tp", "c_applovin");
        hashMap.put("tp-ver", AppLovinSdk.VERSION);
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            hashMap.put(Cookie.COPPA_KEY, privacySetting.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        return hashMap;
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    /* access modifiers changed from: private */
    public MaxAdapterError toMaxError(InMobiAdRequestStatus inMobiAdRequestStatus) {
        MaxAdapterError maxAdapterError;
        InMobiAdRequestStatus.StatusCode statusCode = inMobiAdRequestStatus.getStatusCode();
        if (statusCode == InMobiAdRequestStatus.StatusCode.NO_FILL) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (statusCode == InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT) {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        } else if (statusCode == InMobiAdRequestStatus.StatusCode.SERVER_ERROR) {
            maxAdapterError = MaxAdapterError.SERVER_ERROR;
        } else if (statusCode == InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (statusCode == InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (statusCode == InMobiAdRequestStatus.StatusCode.REQUEST_INVALID) {
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), statusCode.ordinal(), inMobiAdRequestStatus.getMessage());
    }

    private class AdViewListener extends BannerAdEventListener {
        final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("AdView loaded");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onAdViewAdLoaded(inMobiBanner);
            } else {
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo.getCreativeID());
                this.listener.onAdViewAdLoaded(inMobiBanner, bundle);
            }
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("AdView failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getMessage());
            this.listener.onAdViewAdLoadFailed(InMobiMediationAdapter.this.toMaxError(inMobiAdRequestStatus));
        }

        public void onAdDisplayed(InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView expanded");
            this.listener.onAdViewAdExpanded();
        }

        public void onAdDismissed(InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        public void onAdClicked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("AdView clicked");
            this.listener.onAdViewAdClicked();
        }

        public void onUserLeftApplication(InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView will leave application");
        }
    }

    private class InterstitialListener extends InterstitialAdEventListener {
        final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial request succeeded");
        }

        public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial loaded");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onInterstitialAdLoaded();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo.getCreativeID());
            this.listener.onInterstitialAdLoaded(bundle);
        }

        public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("Interstitial failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getMessage());
            this.listener.onInterstitialAdLoadFailed(InMobiMediationAdapter.this.toMaxError(inMobiAdRequestStatus));
        }

        public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial failed to display");
            this.listener.onInterstitialAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
        }

        public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial will show");
        }

        public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial did show");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial will leave application");
        }
    }

    private class RewardedAdListener extends InterstitialAdEventListener {
        private boolean hasGrantedReward;
        final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad request succeeded");
        }

        public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad loaded");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onRewardedAdLoaded();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo.getCreativeID());
            this.listener.onRewardedAdLoaded(bundle);
        }

        public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("Rewarded ad failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getMessage());
            this.listener.onRewardedAdLoadFailed(InMobiMediationAdapter.this.toMaxError(inMobiAdRequestStatus));
        }

        public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad failed to display");
            this.listener.onRewardedAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
        }

        public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad did show");
        }

        public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad did show");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || InMobiMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = InMobiMediationAdapter.this.getReward();
                InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                inMobiMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad will leave application");
        }

        public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Rewarded ad granted reward");
            this.hasGrantedReward = true;
        }
    }
}
