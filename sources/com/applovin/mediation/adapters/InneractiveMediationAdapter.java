package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
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
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

public class InneractiveMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    /* access modifiers changed from: private */
    public ViewGroup adViewGroup;
    private InneractiveAdSpot adViewSpot;
    /* access modifiers changed from: private */
    public boolean hasGrantedReward;
    private InneractiveAdSpot interstitialSpot;
    private InneractiveAdSpot rewardedSpot;

    public String getAdapterVersion() {
        return "7.8.4.0";
    }

    public InneractiveMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        checkExistence(InneractiveAdManager.class, InneractiveAdSpot.class, InneractiveFullscreenUnitController.class, InneractiveAdViewUnitController.class);
        if (initialized.compareAndSet(false, true)) {
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id", (String) null);
            log("Initializing Inneractive SDK with app id: " + string + "...");
            InneractiveAdManager.setUserId(getWrappingSdk().getUserIdentifier());
            InneractiveAdManager.initialize(activity, string, new OnFyberMarketplaceInitializedListener() {
                public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        InneractiveMediationAdapter.this.log("Inneractive SDK initialized");
                        MaxAdapter.InitializationStatus unused = InneractiveMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                        onCompletionListener.onCompletion(InneractiveMediationAdapter.status, (String) null);
                        return;
                    }
                    InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                    inneractiveMediationAdapter.log("Inneractive SDK failed to initialize with error: " + fyberInitStatus);
                    MaxAdapter.InitializationStatus unused2 = InneractiveMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(InneractiveMediationAdapter.status, fyberInitStatus.toString());
                }
            });
            return;
        }
        if (InneractiveAdManager.wasInitialized()) {
            log("Inneractive SDK already initialized");
        }
        onCompletionListener.onCompletion(status, (String) null);
    }

    public String getSdkVersion() {
        return InneractiveAdManager.getVersion();
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial ad...");
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
        inneractiveFullscreenUnitController.setEventsListener(new InneractiveFullscreenAdEventsListenerWithImpressionData() {
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
                InneractiveMediationAdapter.this.log("Interstitial shown");
                String creativeId = impressionData.getCreativeId();
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(creativeId)) {
                    maxInterstitialAdapterListener.onInterstitialAdDisplayed();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, creativeId);
                maxInterstitialAdapterListener.onInterstitialAdDisplayed(bundle);
            }

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Interstitial clicked");
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }

            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Interstitial hidden");
                maxInterstitialAdapterListener.onInterstitialAdHidden();
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
                InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                inneractiveMediationAdapter.log("Interstitial failed to show: " + adDisplayError);
                maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.UNSPECIFIED.getErrorCode(), MaxAdapterError.UNSPECIFIED.getErrorMessage(), 0, adDisplayError.toString()));
            }
        });
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        this.interstitialSpot = createSpot;
        createSpot.addUnitController(inneractiveFullscreenUnitController);
        this.interstitialSpot.setMediationName("Max");
        this.interstitialSpot.setMediationVersion(getAdapterVersion());
        this.interstitialSpot.setRequestListener(new InneractiveAdSpot.RequestListener() {
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Interstitial loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                inneractiveMediationAdapter.log("Interstitial failed to load with Inneractive error: " + inneractiveErrorCode + " " + inneractiveErrorCode.toString());
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(InneractiveMediationAdapter.toMaxError(inneractiveErrorCode));
            }
        });
        this.interstitialSpot.requestAd(createAdRequest(maxAdapterResponseParameters));
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (this.interstitialSpot.isReady()) {
            ((InneractiveFullscreenUnitController) this.interstitialSpot.getSelectedUnitController()).show(activity);
            return;
        }
        log("Interstitial ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad...");
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        inneractiveFullscreenVideoContentController.setEventsListener(new VideoContentListener() {
            public void onProgress(int i, int i2) {
                if (i2 == 0) {
                    InneractiveMediationAdapter.this.log("Rewarded video started");
                }
            }

            public void onCompleted() {
                InneractiveMediationAdapter.this.log("Rewarded video completed");
                maxRewardedAdapterListener.onRewardedAdVideoCompleted();
            }

            public void onPlayerError() {
                InneractiveMediationAdapter.this.log("Rewarded video failed to display for unspecified error");
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
            }
        });
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
        inneractiveFullscreenUnitController.setEventsListener(new InneractiveFullscreenAdEventsListenerWithImpressionData() {
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
                InneractiveMediationAdapter.this.log("Rewarded ad shown");
                String creativeId = impressionData.getCreativeId();
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(creativeId)) {
                    maxRewardedAdapterListener.onRewardedAdDisplayed();
                } else {
                    Bundle bundle = new Bundle(1);
                    bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, creativeId);
                    maxRewardedAdapterListener.onRewardedAdDisplayed(bundle);
                }
                maxRewardedAdapterListener.onRewardedAdVideoStarted();
            }

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Rewarded ad clicked");
                maxRewardedAdapterListener.onRewardedAdClicked();
            }

            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
                if (InneractiveMediationAdapter.this.hasGrantedReward || InneractiveMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = InneractiveMediationAdapter.this.getReward();
                    InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                    inneractiveMediationAdapter.log("Rewarded user with reward: " + reward);
                    maxRewardedAdapterListener.onUserRewarded(reward);
                }
                InneractiveMediationAdapter.this.log("Rewarded ad hidden");
                maxRewardedAdapterListener.onRewardedAdHidden();
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
                InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                inneractiveMediationAdapter.log("Rewarded ad failed to show: " + adDisplayError);
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.UNSPECIFIED.getErrorCode(), MaxAdapterError.UNSPECIFIED.getErrorMessage(), 0, adDisplayError.toString()));
            }
        });
        inneractiveFullscreenUnitController.setRewardedListener(new InneractiveFullScreenAdRewardedListener() {
            public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("User earned reward.");
                boolean unused = InneractiveMediationAdapter.this.hasGrantedReward = true;
            }
        });
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        this.rewardedSpot = createSpot;
        createSpot.addUnitController(inneractiveFullscreenUnitController);
        this.rewardedSpot.setMediationName("Max");
        this.rewardedSpot.setMediationVersion(getAdapterVersion());
        this.rewardedSpot.setRequestListener(new InneractiveAdSpot.RequestListener() {
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Rewarded ad loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                inneractiveMediationAdapter.log("Rewarded ad failed to load with Inneractive error: " + inneractiveErrorCode + " " + inneractiveErrorCode.toString());
                maxRewardedAdapterListener.onRewardedAdLoadFailed(InneractiveMediationAdapter.toMaxError(inneractiveErrorCode));
            }
        });
        this.rewardedSpot.requestAd(createAdRequest(maxAdapterResponseParameters));
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedSpot.isReady()) {
            configureReward(maxAdapterResponseParameters);
            ((InneractiveFullscreenUnitController) this.rewardedSpot.getSelectedUnitController()).show(activity);
            return;
        }
        log("Rewarded ad not ready");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_NOT_READY);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        log("Loading " + maxAdFormat.getLabel() + " AdView ad...");
        final InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        inneractiveAdViewUnitController.setEventsListener(new InneractiveAdViewEventsListenerWithImpressionData() {
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            }

            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
                InneractiveMediationAdapter.this.log("AdView shown");
                String creativeId = impressionData.getCreativeId();
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(creativeId)) {
                    maxAdViewAdapterListener.onAdViewAdDisplayed();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, creativeId);
                maxAdViewAdapterListener.onAdViewAdDisplayed(bundle);
            }

            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("AdView clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("AdView expanded");
                maxAdViewAdapterListener.onAdViewAdExpanded();
            }

            public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("AdView collapsed");
                maxAdViewAdapterListener.onAdViewAdCollapsed();
            }

            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
                InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                inneractiveMediationAdapter.log("AdView failed to show: " + adDisplayError);
                maxAdViewAdapterListener.onAdViewAdDisplayFailed(new MaxAdapterError(MaxAdapterError.UNSPECIFIED.getErrorCode(), MaxAdapterError.UNSPECIFIED.getErrorMessage(), 0, adDisplayError.toString()));
            }
        });
        this.adViewGroup = new RelativeLayout(activity);
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        this.adViewSpot = createSpot;
        createSpot.addUnitController(inneractiveAdViewUnitController);
        this.adViewSpot.setMediationName("Max");
        this.adViewSpot.setMediationVersion(getAdapterVersion());
        this.adViewSpot.setRequestListener(new InneractiveAdSpot.RequestListener() {
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                if (inneractiveAdSpot.isReady()) {
                    InneractiveMediationAdapter.this.log("AdView loaded");
                    inneractiveAdViewUnitController.bindView(InneractiveMediationAdapter.this.adViewGroup);
                    maxAdViewAdapterListener.onAdViewAdLoaded(InneractiveMediationAdapter.this.adViewGroup);
                    return;
                }
                InneractiveMediationAdapter.this.log("AdView not ready");
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.AD_NOT_READY);
            }

            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                InneractiveMediationAdapter inneractiveMediationAdapter = InneractiveMediationAdapter.this;
                inneractiveMediationAdapter.log("AdView failed to load with Inneractive error: " + inneractiveErrorCode + " " + inneractiveErrorCode.toString());
                maxAdViewAdapterListener.onAdViewAdLoadFailed(InneractiveMediationAdapter.toMaxError(inneractiveErrorCode));
            }
        });
        this.adViewSpot.requestAd(createAdRequest(maxAdapterResponseParameters));
    }

    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.interstitialSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.interstitialSpot = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.rewardedSpot;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.rewardedSpot = null;
        }
        InneractiveAdSpot inneractiveAdSpot3 = this.adViewSpot;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.destroy();
            this.adViewSpot = null;
        }
    }

    private InneractiveAdRequest createAdRequest(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        InneractiveAdManager.setUserId(getWrappingSdk().getUserIdentifier());
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            Boolean privacySetting = getPrivacySetting("hasUserConsent", maxAdapterResponseParameters);
            if (privacySetting != null) {
                InneractiveAdManager.setGdprConsent(privacySetting.booleanValue());
            }
        } else {
            InneractiveAdManager.clearGdprConsentData();
        }
        InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("is_muted")) {
            inneractiveAdRequest.setMuteVideo(serverParameters.getBoolean("is_muted"));
        }
        return inneractiveAdRequest;
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    /* renamed from: com.applovin.mediation.adapters.InneractiveMediationAdapter$10 */
    static /* synthetic */ class C159810 {

        /* renamed from: $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode */
        static final /* synthetic */ int[] f3840x835eef5;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.external.InneractiveErrorCode[] r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3840x835eef5 = r0
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.CANCELLED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.LOAD_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.IN_FLIGHT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x009c }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNKNOWN_APP_ID     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f3840x835eef5     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.InneractiveMediationAdapter.C159810.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(InneractiveErrorCode inneractiveErrorCode) {
        String str;
        int i;
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (C159810.f3840x835eef5[inneractiveErrorCode.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 9:
                maxAdapterError = MaxAdapterError.AD_NOT_READY;
                break;
            case 10:
            case 11:
            case 12:
                maxAdapterError = MaxAdapterError.TIMEOUT;
                break;
            case 13:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 18:
            case 19:
            case 20:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 21:
                maxAdapterError = MaxAdapterError.UNSPECIFIED;
                break;
        }
        if (inneractiveErrorCode != null) {
            i = inneractiveErrorCode.ordinal();
            str = inneractiveErrorCode.name();
        } else {
            i = 0;
            str = "";
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, str);
    }
}
