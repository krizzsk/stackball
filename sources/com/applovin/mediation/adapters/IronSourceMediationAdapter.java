package com.applovin.mediation.adapters;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
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
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final IronSourceRouter ROUTER = new IronSourceRouter();
    private static final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (!activity.getClass().getName().startsWith("com.ironsource.sdk")) {
                IronSource.onResume(activity);
            }
        }

        public void onActivityPaused(Activity activity) {
            if (!activity.getClass().getName().startsWith("com.ironsource.sdk")) {
                IronSource.onPause(activity);
            }
        }
    };
    private String mRouterPlacementIdentifier;

    public String getAdapterVersion() {
        return "7.1.10.1.0";
    }

    public IronSourceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        Boolean privacySetting;
        checkExistence(InterstitialListener.class, RewardedVideoListener.class);
        if (INITIALIZED.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString(MBridgeConstans.APP_KEY);
            log("Initializing IronSource SDK with app key: " + string + "...");
            if (maxAdapterInitializationParameters.getServerParameters().getBoolean("set_mediation_identifier")) {
                IronSource.setMediationType(mediationTag());
            }
            setPrivacySettings(maxAdapterInitializationParameters);
            if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterInitializationParameters)) != null) {
                IronSource.setMetaData("do_not_sell", Boolean.toString(privacySetting.booleanValue()));
            }
            Boolean privacySetting2 = getPrivacySetting("isAgeRestrictedUser", maxAdapterInitializationParameters);
            if (privacySetting2 != null) {
                IronSource.setMetaData("is_child_directed", Boolean.toString(privacySetting2.booleanValue()));
            }
            IronSource.setAdaptersDebug(maxAdapterInitializationParameters.isTesting());
            IronSource.setISDemandOnlyInterstitialListener(ROUTER);
            IronSource.setISDemandOnlyRewardedVideoListener(ROUTER);
            if (maxAdapterInitializationParameters.getServerParameters().getBoolean("should_track_network_state", false)) {
                IronSource.shouldTrackNetworkState(activity, true);
            }
            IronSource.initISDemandOnly(activity.getApplicationContext(), string, getAdFormatsToInitialize(maxAdapterInitializationParameters));
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        return IronSourceUtils.getSDKVersion();
    }

    public void onDestroy() {
        ROUTER.removeAdapter(this, this.mRouterPlacementIdentifier);
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        setPrivacySettings(maxAdapterResponseParameters);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading ironSource interstitial for instance ID: " + thirdPartyAdPlacementId);
        String access$100 = IronSourceRouter.getInterstitialRouterIdentifier(thirdPartyAdPlacementId);
        this.mRouterPlacementIdentifier = access$100;
        ROUTER.addInterstitialAdapter(this, maxInterstitialAdapterListener, access$100);
        if (IronSource.isISDemandOnlyInterstitialReady(thirdPartyAdPlacementId)) {
            log("Ad is available already for instance ID: " + thirdPartyAdPlacementId);
            ROUTER.onAdLoaded(this.mRouterPlacementIdentifier);
            return;
        }
        IronSource.loadISDemandOnlyInterstitial(activity, thirdPartyAdPlacementId);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing ironSource interstitial for instance ID: " + thirdPartyAdPlacementId);
        ROUTER.addShowingAdapter(this);
        if (IronSource.isISDemandOnlyInterstitialReady(thirdPartyAdPlacementId)) {
            IronSource.showISDemandOnlyInterstitial(thirdPartyAdPlacementId);
            return;
        }
        log("Unable to show ironSource interstitial - no ad loaded for instance ID: " + thirdPartyAdPlacementId);
        ROUTER.onAdDisplayFailed(IronSourceRouter.getInterstitialRouterIdentifier(thirdPartyAdPlacementId), MaxAdapterError.AD_NOT_READY);
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        setPrivacySettings(maxAdapterResponseParameters);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading ironSource rewarded for instance ID: " + thirdPartyAdPlacementId);
        String access$200 = IronSourceRouter.getRewardedVideoRouterIdentifier(thirdPartyAdPlacementId);
        ROUTER.addRewardedAdapter(this, maxRewardedAdapterListener, access$200);
        if (IronSource.isISDemandOnlyRewardedVideoAvailable(thirdPartyAdPlacementId)) {
            log("Ad is available already for instance ID: " + thirdPartyAdPlacementId);
            ROUTER.onAdLoaded(access$200);
            return;
        }
        IronSource.loadISDemandOnlyRewardedVideo(activity, thirdPartyAdPlacementId);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing ironSource rewarded for instance ID: " + thirdPartyAdPlacementId);
        ROUTER.addShowingAdapter(this);
        if (IronSource.isISDemandOnlyRewardedVideoAvailable(thirdPartyAdPlacementId)) {
            configureReward(maxAdapterResponseParameters);
            IronSource.showISDemandOnlyRewardedVideo(thirdPartyAdPlacementId);
            return;
        }
        log("Unable to show ironSource rewarded - no ad loaded...");
        ROUTER.onAdDisplayFailed(IronSourceRouter.getRewardedVideoRouterIdentifier(thirdPartyAdPlacementId), MaxAdapterError.AD_NOT_READY);
    }

    private void setPrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting;
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null) {
            IronSource.setConsent(privacySetting.booleanValue());
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

    private IronSource.AD_UNIT[] getAdFormatsToInitialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("init_ad_formats");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return new IronSource.AD_UNIT[]{IronSource.AD_UNIT.INTERSTITIAL, IronSource.AD_UNIT.REWARDED_VIDEO};
        }
        ArrayList arrayList = new ArrayList();
        if (stringArrayList.contains("inter")) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (stringArrayList.contains("rewarded")) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]);
    }

    private static class IronSourceRouter extends MediationAdapterRouter implements ISDemandOnlyInterstitialListener, ISDemandOnlyRewardedVideoListener {
        private boolean hasGrantedReward;

        /* access modifiers changed from: package-private */
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }

        private IronSourceRouter() {
        }

        public void onInterstitialAdReady(String str) {
            log("Interstitial loaded for instance ID: " + str);
            onAdLoaded(getInterstitialRouterIdentifier(str));
        }

        public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
            log("Interstitial ad failed to load for instance ID: " + str + " with error: " + ironSourceError);
            onAdLoadFailed(getInterstitialRouterIdentifier(str), toMaxError(ironSourceError));
        }

        public void onInterstitialAdOpened(String str) {
            log("Interstitial ad displayed for instance ID: " + str);
            onAdDisplayed(getInterstitialRouterIdentifier(str));
        }

        public void onInterstitialAdClosed(String str) {
            log("Interstitial ad closed for instance ID: " + str);
            onAdHidden(getInterstitialRouterIdentifier(str));
        }

        public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
            log("Interstitial ad failed to show for instance ID: " + str + " with error: " + ironSourceError);
            onAdDisplayFailed(getInterstitialRouterIdentifier(str), toMaxError(ironSourceError));
        }

        public void onInterstitialAdClicked(String str) {
            log("Interstitial ad clicked for instance ID: " + str);
            onAdClicked(getInterstitialRouterIdentifier(str));
        }

        public void onRewardedVideoAdOpened(String str) {
            log("Rewarded ad shown for instance ID: " + str);
            String rewardedVideoRouterIdentifier = getRewardedVideoRouterIdentifier(str);
            onAdDisplayed(rewardedVideoRouterIdentifier);
            onRewardedAdVideoStarted(rewardedVideoRouterIdentifier);
        }

        public void onRewardedVideoAdClosed(String str) {
            String rewardedVideoRouterIdentifier = getRewardedVideoRouterIdentifier(str);
            if (this.hasGrantedReward || shouldAlwaysRewardUser(rewardedVideoRouterIdentifier)) {
                MaxReward reward = getReward(rewardedVideoRouterIdentifier);
                log("Rewarded  ad rewarded user with reward: " + reward + " for instance ID: " + str);
                onUserRewarded(rewardedVideoRouterIdentifier, reward);
                this.hasGrantedReward = false;
            }
            log("Rewarded ad hidden for instance ID: " + str);
            onAdHidden(rewardedVideoRouterIdentifier);
        }

        public void onRewardedVideoAdLoadSuccess(String str) {
            log("Rewarded ad loaded for instance ID: " + str);
            onAdLoaded(getRewardedVideoRouterIdentifier(str));
        }

        public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
            log("Rewarded ad failed to load for instance ID: " + str);
            onAdLoadFailed(getRewardedVideoRouterIdentifier(str), toMaxError(ironSourceError));
        }

        public void onRewardedVideoAdRewarded(String str) {
            log("Rewarded ad granted reward for instance ID: " + str);
            onRewardedAdVideoCompleted(getRewardedVideoRouterIdentifier(str));
            this.hasGrantedReward = true;
        }

        public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
            log("Rewarded ad failed to show for instance ID: " + str + " with error: " + ironSourceError);
            onAdDisplayFailed(getRewardedVideoRouterIdentifier(str), toMaxError(ironSourceError));
        }

        public void onRewardedVideoAdClicked(String str) {
            log("Rewarded ad clicked for instance ID: " + str);
            onAdClicked(getRewardedVideoRouterIdentifier(str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
            r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0055, code lost:
            r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.ironsource.mediationsdk.logger.IronSourceError r4) {
            /*
                int r0 = r4.getErrorCode()
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
                r2 = 1
                if (r0 == r2) goto L_0x006a
                r2 = 520(0x208, float:7.29E-43)
                if (r0 == r2) goto L_0x0067
                r2 = 524(0x20c, float:7.34E-43)
                if (r0 == r2) goto L_0x0064
                r2 = 1010(0x3f2, float:1.415E-42)
                if (r0 == r2) goto L_0x0061
                r2 = 1158(0x486, float:1.623E-42)
                if (r0 == r2) goto L_0x005e
                r2 = 501(0x1f5, float:7.02E-43)
                if (r0 == r2) goto L_0x005b
                r2 = 502(0x1f6, float:7.03E-43)
                if (r0 == r2) goto L_0x005b
                r2 = 505(0x1f9, float:7.08E-43)
                if (r0 == r2) goto L_0x005b
                r2 = 506(0x1fa, float:7.09E-43)
                if (r0 == r2) goto L_0x005b
                r2 = 526(0x20e, float:7.37E-43)
                if (r0 == r2) goto L_0x0064
                r2 = 527(0x20f, float:7.38E-43)
                if (r0 == r2) goto L_0x006a
                r2 = 1060(0x424, float:1.485E-42)
                if (r0 == r2) goto L_0x006a
                r2 = 1061(0x425, float:1.487E-42)
                if (r0 == r2) goto L_0x006a
                switch(r0) {
                    case 508: goto L_0x0061;
                    case 509: goto L_0x005e;
                    case 510: goto L_0x0058;
                    default: goto L_0x003c;
                }
            L_0x003c:
                switch(r0) {
                    case 600: goto L_0x0061;
                    case 601: goto L_0x0061;
                    case 602: goto L_0x0061;
                    case 603: goto L_0x0061;
                    case 604: goto L_0x0064;
                    case 605: goto L_0x006a;
                    case 606: goto L_0x005e;
                    case 607: goto L_0x0061;
                    case 608: goto L_0x0055;
                    case 609: goto L_0x0055;
                    case 610: goto L_0x006a;
                    case 611: goto L_0x006a;
                    case 612: goto L_0x0061;
                    case 613: goto L_0x006a;
                    case 614: goto L_0x006a;
                    case 615: goto L_0x005b;
                    case 616: goto L_0x005b;
                    default: goto L_0x003f;
                }
            L_0x003f:
                switch(r0) {
                    case 1000: goto L_0x006a;
                    case 1001: goto L_0x006a;
                    case 1002: goto L_0x006a;
                    case 1003: goto L_0x006a;
                    case 1004: goto L_0x006a;
                    case 1005: goto L_0x006a;
                    case 1006: goto L_0x0052;
                    case 1007: goto L_0x006a;
                    case 1008: goto L_0x006a;
                    default: goto L_0x0042;
                }
            L_0x0042:
                switch(r0) {
                    case 1020: goto L_0x005b;
                    case 1021: goto L_0x005b;
                    case 1022: goto L_0x004f;
                    case 1023: goto L_0x004f;
                    case 1024: goto L_0x005e;
                    case 1025: goto L_0x0055;
                    case 1026: goto L_0x004f;
                    case 1027: goto L_0x004f;
                    case 1028: goto L_0x006a;
                    case 1029: goto L_0x005b;
                    case 1030: goto L_0x006a;
                    case 1031: goto L_0x005b;
                    case 1032: goto L_0x0055;
                    case 1033: goto L_0x0055;
                    case 1034: goto L_0x006a;
                    case 1035: goto L_0x005e;
                    case 1036: goto L_0x004f;
                    case 1037: goto L_0x004f;
                    case 1038: goto L_0x006a;
                    case 1039: goto L_0x006a;
                    case 1040: goto L_0x006a;
                    case 1041: goto L_0x006a;
                    default: goto L_0x0045;
                }
            L_0x0045:
                switch(r0) {
                    case 1050: goto L_0x004f;
                    case 1051: goto L_0x004c;
                    case 1052: goto L_0x0055;
                    case 1053: goto L_0x004f;
                    case 1054: goto L_0x004c;
                    case 1055: goto L_0x0055;
                    case 1056: goto L_0x004f;
                    case 1057: goto L_0x0049;
                    case 1058: goto L_0x005e;
                    default: goto L_0x0048;
                }
            L_0x0048:
                goto L_0x006c
            L_0x0049:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
                goto L_0x006c
            L_0x004c:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY
                goto L_0x006c
            L_0x004f:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE
                goto L_0x006c
            L_0x0052:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.SIGNAL_COLLECTION_TIMEOUT
                goto L_0x006c
            L_0x0055:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
                goto L_0x006c
            L_0x0058:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
                goto L_0x006c
            L_0x005b:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
                goto L_0x006c
            L_0x005e:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
                goto L_0x006c
            L_0x0061:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NOT_INITIALIZED
                goto L_0x006c
            L_0x0064:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_FREQUENCY_CAPPED
                goto L_0x006c
            L_0x0067:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
                goto L_0x006c
            L_0x006a:
                com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            L_0x006c:
                com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
                int r3 = r1.getErrorCode()
                java.lang.String r1 = r1.getErrorMessage()
                java.lang.String r4 = r4.getErrorMessage()
                r2.<init>(r3, r1, r0, r4)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.IronSourceMediationAdapter.IronSourceRouter.toMaxError(com.ironsource.mediationsdk.logger.IronSourceError):com.applovin.mediation.adapter.MaxAdapterError");
        }

        /* access modifiers changed from: private */
        public static String getInterstitialRouterIdentifier(String str) {
            return str + "-" + IronSource.AD_UNIT.INTERSTITIAL.toString();
        }

        /* access modifiers changed from: private */
        public static String getRewardedVideoRouterIdentifier(String str) {
            return str + "-" + IronSource.AD_UNIT.REWARDED_VIDEO.toString();
        }
    }
}
