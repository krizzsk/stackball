package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;
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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.interstitialvideo.out.MBBidInterstitialVideoHandler;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.system.C6812a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6921g;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class MintegralMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final String APP_ID_PARAMETER = "app_id";
    private static final String APP_KEY_PARAMETER = "app_key";
    private static final String BAD_REQUEST = "request parameter is null";
    private static final String EXCEPTION_APP_ID_EMPTY = "EXCEPTION_APP_ID_EMPTY";
    private static final String EXCEPTION_APP_NOT_FOUND = "EXCEPTION_APP_NOT_FOUND";
    private static final String EXCEPTION_IV_RECALLNET_INVALIDATE = "EXCEPTION_IV_RECALLNET_INVALIDATE";
    private static final String EXCEPTION_RETURN_EMPTY = "EXCEPTION_RETURN_EMPTY";
    private static final String EXCEPTION_SIGN_ERROR = "EXCEPTION_SIGN_ERROR";
    private static final String EXCEPTION_TIMEOUT = "EXCEPTION_TIMEOUT";
    private static final String EXCEPTION_UNIT_ADTYPE_ERROR = "EXCEPTION_UNIT_ADTYPE_ERROR";
    private static final String EXCEPTION_UNIT_ID_EMPTY = "EXCEPTION_UNIT_ID_EMPTY";
    private static final String EXCEPTION_UNIT_NOT_FOUND = "EXCEPTION_UNIT_NOT_FOUND";
    private static final String EXCEPTION_UNIT_NOT_FOUND_IN_APP = "EXCEPTION_UNIT_NOT_FOUND_IN_APP";
    private static final String NETWORK_ERROR = "network exception";
    private static final String NETWORK_IO_ERROR = "Network error,I/O exception";
    private static final String NOT_INITIALIZED = "init error";
    private static final String NO_FILL_1 = "no ads available can show";
    private static final String NO_FILL_2 = "no ads available";
    private static final String NO_FILL_3 = "no server ads available";
    private static final String NO_FILL_4 = "no ads source";
    private static final String TIMEOUT = "load timeout";
    private static final String UNIT_ID_EMPTY = "UnitId is null";
    private static final AtomicBoolean initialized = new AtomicBoolean();
    /* access modifiers changed from: private */
    public static final Map<String, MBBidInterstitialVideoHandler> mbBidInterstitialVideoHandlers = new HashMap();
    /* access modifiers changed from: private */
    public static final Map<String, MBBidRewardVideoHandler> mbBidRewardVideoHandlers = new HashMap();
    /* access modifiers changed from: private */
    public static final Map<String, MBInterstitialVideoHandler> mbInterstitialVideoHandlers = new HashMap();
    /* access modifiers changed from: private */
    public static final Map<String, MBRewardVideoHandler> mbRewardVideoHandlers = new HashMap();
    private static final MintegralMediationAdapterRouter router = ((MintegralMediationAdapterRouter) MediationAdapterRouter.getSharedInstance(MintegralMediationAdapterRouter.class));
    private static String sSdkVersion;
    /* access modifiers changed from: private */
    public MBBannerView mbBannerView;
    private MBBidInterstitialVideoHandler mbBidInterstitialVideoHandler;
    private MBBidRewardVideoHandler mbBidRewardVideoHandler;
    private MBInterstitialVideoHandler mbInterstitialVideoHandler;
    private MBRewardVideoHandler mbRewardVideoHandler;

    public String getAdapterVersion() {
        return "15.7.21.0";
    }

    public MintegralMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        Boolean privacySetting;
        MBridgeConstans.DEBUG = maxAdapterInitializationParameters.isTesting();
        if (initialized.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id");
            String string2 = maxAdapterInitializationParameters.getServerParameters().getString("app_key");
            log("Initializing Mintegral SDK with app id: " + string + " and app key: " + string2 + "...");
            C6812a mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            Boolean privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterInitializationParameters);
            if (privacySetting2 != null) {
                boolean booleanValue = privacySetting2.booleanValue();
                mBridgeSDK.setUserPrivateInfoType(activity, MBridgeConstans.AUTHORITY_ALL_INFO, booleanValue ? 1 : 0);
                mBridgeSDK.setConsentStatus(activity, booleanValue);
            }
            if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterInitializationParameters)) != null && privacySetting.booleanValue()) {
                mBridgeSDK.setDoNotTrackStatus(true);
            }
            mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(string, string2), (Context) activity);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        if (sSdkVersion == null) {
            sSdkVersion = getVersionString(MBConfiguration.class, "SDK_VERSION");
        }
        return sSdkVersion;
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(BidManager.getBuyerUid(activity));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        boolean containsKey = maxAdapterResponseParameters.getServerParameters().containsKey("is_muted");
        int i = maxAdapterResponseParameters.getServerParameters().getBoolean("is_muted") ? 1 : 2;
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = maxAdapterResponseParameters.getServerParameters().getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID);
        router.addInterstitialAdapter(this, maxInterstitialAdapterListener, thirdPartyAdPlacementId);
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding interstitial ad for unit id: " + thirdPartyAdPlacementId + " and placement id: " + string + "...");
            if (mbBidInterstitialVideoHandlers.containsKey(thirdPartyAdPlacementId)) {
                this.mbBidInterstitialVideoHandler = mbBidInterstitialVideoHandlers.get(thirdPartyAdPlacementId);
            } else {
                MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = new MBBidInterstitialVideoHandler(activity, string, thirdPartyAdPlacementId);
                this.mbBidInterstitialVideoHandler = mBBidInterstitialVideoHandler;
                mbBidInterstitialVideoHandlers.put(thirdPartyAdPlacementId, mBBidInterstitialVideoHandler);
            }
            this.mbBidInterstitialVideoHandler.setInterstitialVideoListener(router.getInterstitialListener());
            if (this.mbBidInterstitialVideoHandler.isBidReady()) {
                log("A bidding interstitial ad is ready already");
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbBidInterstitialVideoHandler.getRequestId())) {
                    router.onAdLoaded(thirdPartyAdPlacementId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbBidInterstitialVideoHandler.getRequestId());
                router.onAdLoaded(thirdPartyAdPlacementId, bundle);
                return;
            }
            if (containsKey) {
                this.mbBidInterstitialVideoHandler.playVideoMute(i);
            }
            this.mbBidInterstitialVideoHandler.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log("Loading mediated interstitial ad for unit id: " + thirdPartyAdPlacementId + " and placement id: " + string + "...");
        if (mbInterstitialVideoHandlers.containsKey(thirdPartyAdPlacementId)) {
            this.mbInterstitialVideoHandler = mbInterstitialVideoHandlers.get(thirdPartyAdPlacementId);
        } else {
            MBInterstitialVideoHandler mBInterstitialVideoHandler = new MBInterstitialVideoHandler(activity, string, thirdPartyAdPlacementId);
            this.mbInterstitialVideoHandler = mBInterstitialVideoHandler;
            mbInterstitialVideoHandlers.put(thirdPartyAdPlacementId, mBInterstitialVideoHandler);
        }
        this.mbInterstitialVideoHandler.setInterstitialVideoListener(router.getInterstitialListener());
        if (this.mbInterstitialVideoHandler.isReady()) {
            log("A mediated interstitial ad is ready already");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbInterstitialVideoHandler.getRequestId())) {
                router.onAdLoaded(thirdPartyAdPlacementId);
                return;
            }
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbInterstitialVideoHandler.getRequestId());
            router.onAdLoaded(thirdPartyAdPlacementId, bundle2);
            return;
        }
        if (containsKey) {
            this.mbInterstitialVideoHandler.playVideoMute(i);
        }
        this.mbInterstitialVideoHandler.load();
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        router.addShowingAdapter(this);
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = this.mbBidInterstitialVideoHandler;
        if (mBBidInterstitialVideoHandler == null || !mBBidInterstitialVideoHandler.isBidReady()) {
            MBInterstitialVideoHandler mBInterstitialVideoHandler = this.mbInterstitialVideoHandler;
            if (mBInterstitialVideoHandler == null || !mBInterstitialVideoHandler.isReady()) {
                log("Unable to show interstitial - no ad loaded...");
                router.onAdDisplayFailed(maxAdapterResponseParameters.getThirdPartyAdPlacementId(), MaxAdapterError.AD_NOT_READY);
                return;
            }
            log("Showing mediated interstitial...");
            this.mbInterstitialVideoHandler.show();
            return;
        }
        log("Showing bidding interstitial...");
        this.mbBidInterstitialVideoHandler.showFromBid();
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        boolean containsKey = maxAdapterResponseParameters.getServerParameters().containsKey("is_muted");
        int i = maxAdapterResponseParameters.getServerParameters().getBoolean("is_muted") ? 1 : 2;
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = maxAdapterResponseParameters.getServerParameters().getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID);
        router.addRewardedAdapter(this, maxRewardedAdapterListener, thirdPartyAdPlacementId);
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding rewarded ad for unit id: " + thirdPartyAdPlacementId + " and placement id: " + string + "...");
            if (mbBidRewardVideoHandlers.containsKey(thirdPartyAdPlacementId)) {
                this.mbBidRewardVideoHandler = mbBidRewardVideoHandlers.get(thirdPartyAdPlacementId);
            } else {
                MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(activity, string, thirdPartyAdPlacementId);
                this.mbBidRewardVideoHandler = mBBidRewardVideoHandler;
                mbBidRewardVideoHandlers.put(thirdPartyAdPlacementId, mBBidRewardVideoHandler);
            }
            this.mbBidRewardVideoHandler.setRewardVideoListener(router.getRewardedListener());
            if (this.mbBidRewardVideoHandler.isBidReady()) {
                log("A bidding rewarded ad is ready already");
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbBidRewardVideoHandler.getRequestId())) {
                    router.onAdLoaded(thirdPartyAdPlacementId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbBidRewardVideoHandler.getRequestId());
                router.onAdLoaded(thirdPartyAdPlacementId, bundle);
                return;
            }
            if (containsKey) {
                this.mbBidRewardVideoHandler.playVideoMute(i);
            }
            this.mbBidRewardVideoHandler.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log("Loading mediated rewarded ad for unit id: " + thirdPartyAdPlacementId + " and placement id: " + string + "...");
        if (mbRewardVideoHandlers.containsKey(thirdPartyAdPlacementId)) {
            this.mbRewardVideoHandler = mbRewardVideoHandlers.get(thirdPartyAdPlacementId);
        } else {
            MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(activity, string, thirdPartyAdPlacementId);
            this.mbRewardVideoHandler = mBRewardVideoHandler;
            mbRewardVideoHandlers.put(thirdPartyAdPlacementId, mBRewardVideoHandler);
        }
        this.mbRewardVideoHandler.setRewardVideoListener(router.getRewardedListener());
        if (this.mbRewardVideoHandler.isReady()) {
            log("A mediated rewarded ad is ready already");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(this.mbRewardVideoHandler.getRequestId())) {
                router.onAdLoaded(thirdPartyAdPlacementId);
                return;
            }
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbRewardVideoHandler.getRequestId());
            router.onAdLoaded(thirdPartyAdPlacementId, bundle2);
            return;
        }
        if (containsKey) {
            this.mbRewardVideoHandler.playVideoMute(i);
        }
        this.mbRewardVideoHandler.load();
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        router.addShowingAdapter(this);
        configureReward(maxAdapterResponseParameters);
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        String string = serverParameters.getString("reward_id", "");
        String string2 = serverParameters.getString("user_id", "");
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler == null || !mBBidRewardVideoHandler.isBidReady()) {
            MBRewardVideoHandler mBRewardVideoHandler = this.mbRewardVideoHandler;
            if (mBRewardVideoHandler == null || !mBRewardVideoHandler.isReady()) {
                log("Unable to show rewarded ad - no ad loaded...");
                router.onAdDisplayFailed(maxAdapterResponseParameters.getThirdPartyAdPlacementId(), MaxAdapterError.AD_NOT_READY);
                return;
            }
            log("Showing mediated rewarded ad...");
            this.mbRewardVideoHandler.show(string, string2);
            return;
        }
        log("Showing bidding rewarded ad...");
        this.mbBidRewardVideoHandler.showFromBid(string, string2);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        BannerSize bannerSize = toBannerSize(maxAdFormat);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = maxAdapterResponseParameters.getServerParameters().getString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID);
        MBBannerView mBBannerView = new MBBannerView(activity);
        this.mbBannerView = mBBannerView;
        mBBannerView.init(bannerSize, string, thirdPartyAdPlacementId);
        this.mbBannerView.setAllowShowCloseBtn(false);
        this.mbBannerView.setRefreshTime(0);
        this.mbBannerView.setBannerAdListener(new BannerAdListener() {
            public void onLoadSuccessed(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                mintegralMediationAdapter.log("Banner ad loaded for: " + mBridgeIds);
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(MintegralMediationAdapter.this.mbBannerView.getRequestId())) {
                    maxAdViewAdapterListener.onAdViewAdLoaded(MintegralMediationAdapter.this.mbBannerView);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, MintegralMediationAdapter.this.mbBannerView.getRequestId());
                maxAdViewAdapterListener.onAdViewAdLoaded(MintegralMediationAdapter.this.mbBannerView, bundle);
            }

            public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                mintegralMediationAdapter.log("Banner ad failed to load: " + str + " for: " + mBridgeIds);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MintegralMediationAdapter.toMaxError(str));
            }

            public void onLogImpression(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad displayed");
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }

            public void onClick(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            public void onLeaveApp(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad will leave application");
            }

            public void showFullScreen(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad expanded");
                maxAdViewAdapterListener.onAdViewAdExpanded();
            }

            public void closeFullScreen(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad collapsed");
                maxAdViewAdapterListener.onAdViewAdCollapsed();
            }

            public void onCloseBanner(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad closed");
            }
        });
        if (!TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding banner ad for unit id: " + thirdPartyAdPlacementId + " and placement id: " + string + "...");
            this.mbBannerView.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log("Loading mediated banner ad for unit id: " + thirdPartyAdPlacementId + " and placement id: " + string + "...");
        this.mbBannerView.load();
    }

    public void onDestroy() {
        MBInterstitialVideoHandler mBInterstitialVideoHandler = this.mbInterstitialVideoHandler;
        if (mBInterstitialVideoHandler != null) {
            mBInterstitialVideoHandler.setInterstitialVideoListener((InterstitialVideoListener) null);
            this.mbInterstitialVideoHandler = null;
        }
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = this.mbBidInterstitialVideoHandler;
        if (mBBidInterstitialVideoHandler != null) {
            mBBidInterstitialVideoHandler.setInterstitialVideoListener((InterstitialVideoListener) null);
            this.mbBidInterstitialVideoHandler = null;
        }
        MBRewardVideoHandler mBRewardVideoHandler = this.mbRewardVideoHandler;
        if (mBRewardVideoHandler != null) {
            mBRewardVideoHandler.setRewardVideoListener((C6921g) null);
            this.mbRewardVideoHandler = null;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler != null) {
            mBBidRewardVideoHandler.setRewardVideoListener((C6921g) null);
            this.mbBidRewardVideoHandler = null;
        }
        MBBannerView mBBannerView = this.mbBannerView;
        if (mBBannerView != null) {
            mBBannerView.release();
            this.mbBannerView = null;
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

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(String str) {
        MaxAdapterError maxAdapterError;
        if (NOT_INITIALIZED.equals(str) || str.contains(EXCEPTION_IV_RECALLNET_INVALIDATE)) {
            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
        } else if (NO_FILL_1.contains(str) || NO_FILL_2.contains(str) || NO_FILL_3.contains(str) || NO_FILL_4.contains(str) || str.contains(EXCEPTION_RETURN_EMPTY)) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (NETWORK_ERROR.equalsIgnoreCase(str) || str.contains(NETWORK_IO_ERROR)) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (BAD_REQUEST.equalsIgnoreCase(str)) {
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else if (TIMEOUT.equalsIgnoreCase(str) || str.contains(EXCEPTION_TIMEOUT)) {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        } else if (str.contains(EXCEPTION_SIGN_ERROR) || str.contains(EXCEPTION_UNIT_NOT_FOUND) || str.contains(EXCEPTION_UNIT_ID_EMPTY) || str.contains(EXCEPTION_UNIT_NOT_FOUND_IN_APP) || str.contains(EXCEPTION_UNIT_ADTYPE_ERROR) || str.contains(EXCEPTION_APP_ID_EMPTY) || str.contains(EXCEPTION_APP_NOT_FOUND) || str.contains(UNIT_ID_EMPTY)) {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), 0, str);
    }

    private BannerSize toBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) {
            return new BannerSize(3, 0, 0);
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return new BannerSize(2, 0, 0);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static class MintegralMediationAdapterRouter extends MediationAdapterRouter {
        private final InterstitialVideoListener interstitialVideoListener = new InterstitialVideoListener() {
            public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
                String str;
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial successfully loaded and video has been downloaded for: " + mBridgeIds);
                String unitId = mBridgeIds.getUnitId();
                MBInterstitialVideoHandler mBInterstitialVideoHandler = (MBInterstitialVideoHandler) MintegralMediationAdapter.mbInterstitialVideoHandlers.get(unitId);
                MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = (MBBidInterstitialVideoHandler) MintegralMediationAdapter.mbBidInterstitialVideoHandlers.get(unitId);
                if (mBBidInterstitialVideoHandler != null) {
                    str = mBBidInterstitialVideoHandler.getRequestId();
                } else {
                    str = mBInterstitialVideoHandler.getRequestId();
                }
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(str)) {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
                MintegralMediationAdapterRouter.this.onAdLoaded(unitId, bundle);
            }

            public void onLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial successfully loaded but video still needs to be downloaded for: " + mBridgeIds);
            }

            public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial failed to load: " + str + " for: " + mBridgeIds);
                MintegralMediationAdapterRouter.this.onAdLoadFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            public void onAdShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial displayed");
                MintegralMediationAdapterRouter.this.onAdDisplayed(mBridgeIds.getUnitId());
            }

            public void onShowFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Interstitial failed to show: " + str);
                MintegralMediationAdapterRouter.this.onAdDisplayFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            public void onVideoAdClicked(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial clicked");
                MintegralMediationAdapterRouter.this.onAdClicked(mBridgeIds.getUnitId());
            }

            public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Interstitial hidden");
                MintegralMediationAdapterRouter.this.onAdHidden(mBridgeIds.getUnitId());
            }

            public void onVideoComplete(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial video completed");
            }

            public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Interstitial with reward hidden");
            }

            public void onEndcardShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial endcard shown");
            }
        };
        private final RewardVideoListener rewardVideoListener = new RewardVideoListener() {
            public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
                String str;
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad successfully loaded and video has been downloaded for: " + mBridgeIds);
                String unitId = mBridgeIds.getUnitId();
                MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) MintegralMediationAdapter.mbRewardVideoHandlers.get(unitId);
                MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) MintegralMediationAdapter.mbBidRewardVideoHandlers.get(unitId);
                if (mBBidRewardVideoHandler != null) {
                    str = mBBidRewardVideoHandler.getRequestId();
                } else {
                    str = mBRewardVideoHandler.getRequestId();
                }
                if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(str)) {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, str);
                MintegralMediationAdapterRouter.this.onAdLoaded(unitId, bundle);
            }

            public void onLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad successfully loaded but video still needs to be downloaded for: " + mBridgeIds);
            }

            public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad failed to load: " + str + " for: " + mBridgeIds);
                MintegralMediationAdapterRouter.this.onAdLoadFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            public void onAdShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad displayed");
                String unitId = mBridgeIds.getUnitId();
                MintegralMediationAdapterRouter.this.onAdDisplayed(unitId);
                MintegralMediationAdapterRouter.this.onRewardedAdVideoStarted(unitId);
            }

            public void onShowFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                mintegralMediationAdapterRouter.log("Rewarded ad failed to show: " + str);
                MintegralMediationAdapterRouter.this.onAdDisplayFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            public void onVideoAdClicked(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad clicked");
                MintegralMediationAdapterRouter.this.onAdClicked(mBridgeIds.getUnitId());
            }

            public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad hidden");
                String unitId = mBridgeIds.getUnitId();
                if (rewardInfo.isCompleteView()) {
                    MintegralMediationAdapterRouter.this.onRewardedAdVideoCompleted(unitId);
                    MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                    mintegralMediationAdapterRouter.onUserRewarded(unitId, mintegralMediationAdapterRouter.getReward(unitId));
                } else if (MintegralMediationAdapterRouter.this.shouldAlwaysRewardUser(unitId)) {
                    MintegralMediationAdapterRouter mintegralMediationAdapterRouter2 = MintegralMediationAdapterRouter.this;
                    mintegralMediationAdapterRouter2.onUserRewarded(unitId, mintegralMediationAdapterRouter2.getReward(unitId));
                }
                MintegralMediationAdapterRouter.this.onAdHidden(unitId);
            }

            public void onVideoComplete(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad video completed");
            }

            public void onEndcardShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad endcard shown");
            }
        };

        /* access modifiers changed from: package-private */
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }

        private MintegralMediationAdapterRouter() {
        }

        /* access modifiers changed from: package-private */
        public InterstitialVideoListener getInterstitialListener() {
            return this.interstitialVideoListener;
        }

        /* access modifiers changed from: package-private */
        public RewardVideoListener getRewardedListener() {
            return this.rewardVideoListener;
        }
    }
}
