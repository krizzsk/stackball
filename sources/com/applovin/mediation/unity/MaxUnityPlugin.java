package com.applovin.mediation.unity;

import android.text.TextUtils;
import com.applovin.mediation.unity.MaxUnityAdManager;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Arrays;
import java.util.List;

public class MaxUnityPlugin {
    private static final String TAG = "MaxUnityPlugin";
    private static MaxUnityAdManager sAdManager = null;
    private static boolean sIsPluginInitialized = false;
    /* access modifiers changed from: private */
    public static boolean sIsSdkInitialized = false;
    private static AppLovinSdk sSdk;
    /* access modifiers changed from: private */
    public static AppLovinSdkConfiguration sSdkConfiguration;
    private static String sSdkKey;
    private static List<String> sTestDeviceAdvertisingIds;
    private static String sUserIdToSet;
    private static Boolean sVerboseLogging;

    private static boolean isPluginInitialized() {
        return sIsPluginInitialized;
    }

    private static void maybeInitializePlugin() {
        if (!isPluginInitialized()) {
            sAdManager = new MaxUnityAdManager();
            sIsPluginInitialized = true;
            sSdkKey = Utils.retrieveSdkKey();
        }
    }

    public static void setSdkKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            maybeInitializePlugin();
            sSdkKey = str;
        }
    }

    public static void initializeSdk(String str) {
        maybeInitializePlugin();
        sSdk = sAdManager.initializeSdkWithCompletionHandler(sSdkKey, str, new MaxUnityAdManager.Listener() {
            public void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                AppLovinSdkConfiguration unused = MaxUnityPlugin.sSdkConfiguration = appLovinSdkConfiguration;
                boolean unused2 = MaxUnityPlugin.sIsSdkInitialized = true;
            }
        });
        if (!TextUtils.isEmpty(sUserIdToSet)) {
            sSdk.setUserIdentifier(sUserIdToSet);
            sUserIdToSet = null;
        }
        List<String> list = sTestDeviceAdvertisingIds;
        if (list != null && !list.isEmpty()) {
            sSdk.getSettings().setTestDeviceAdvertisingIds(sTestDeviceAdvertisingIds);
            sTestDeviceAdvertisingIds = null;
        }
        if (sVerboseLogging != null) {
            sSdk.getSettings().setVerboseLogging(sVerboseLogging.booleanValue());
            sVerboseLogging = null;
        }
    }

    public static boolean isInitialized() {
        return sIsPluginInitialized && sIsSdkInitialized;
    }

    public static void setUserId(String str) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.setUserIdentifier(str);
            sUserIdToSet = null;
            return;
        }
        sUserIdToSet = str;
    }

    public static void showMediationDebugger() {
        sSdk.showMediationDebugger();
    }

    public static int getConsentDialogState() {
        if (!isPluginInitialized()) {
            return AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN.ordinal();
        }
        return sSdkConfiguration.getConsentDialogState().ordinal();
    }

    public static void setHasUserConsent(boolean z) {
        AppLovinPrivacySettings.setHasUserConsent(z, Utils.getCurrentActivity());
    }

    public static boolean hasUserConsent() {
        return AppLovinPrivacySettings.hasUserConsent(Utils.getCurrentActivity());
    }

    public static void setIsAgeRestrictedUser(boolean z) {
        AppLovinPrivacySettings.setIsAgeRestrictedUser(z, Utils.getCurrentActivity());
    }

    public static boolean isAgeRestrictedUser() {
        return AppLovinPrivacySettings.isAgeRestrictedUser(Utils.getCurrentActivity());
    }

    public static void setDoNotSell(boolean z) {
        AppLovinPrivacySettings.setDoNotSell(z, Utils.getCurrentActivity());
    }

    public static boolean isDoNotSell() {
        return AppLovinPrivacySettings.isDoNotSell(Utils.getCurrentActivity());
    }

    public static void createBanner(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.createBanner(str, str2);
        }
    }

    public static void setBannerExtraParameter(String str, String str2, String str3) {
        sAdManager.setBannerExtraParameter(str, str2, str3);
    }

    public static void setBannerPlacement(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.setBannerPlacement(str, str2);
        }
    }

    public static void updateBannerPosition(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.updateBannerPosition(str, str2);
        }
    }

    public static void showBanner(String str) {
        if (isPluginInitialized()) {
            sAdManager.showBanner(str);
        }
    }

    public static void destroyBanner(String str) {
        if (isPluginInitialized()) {
            sAdManager.destroyBanner(str);
        }
    }

    public static void hideBanner(String str) {
        if (isPluginInitialized()) {
            sAdManager.hideBanner(str);
        }
    }

    public static void setBannerBackgroundColor(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.setBannerBackgroundColor(str, str2);
        }
    }

    public static void createMRec(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.createMRec(str, str2);
        }
    }

    public static void setMRecPlacement(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.setMRecPlacement(str, str2);
        }
    }

    public static void updateMRecPosition(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.updateMRecPosition(str, str2);
        }
    }

    public static void showMRec(String str) {
        if (isPluginInitialized()) {
            sAdManager.showMRec(str);
        }
    }

    public static void destroyMRec(String str) {
        if (isPluginInitialized()) {
            sAdManager.destroyMRec(str);
        }
    }

    public static void hideMRec(String str) {
        if (isPluginInitialized()) {
            sAdManager.hideMRec(str);
        }
    }

    public static void loadInterstitial(String str) {
        if (isPluginInitialized()) {
            sAdManager.loadInterstitial(str);
        }
    }

    public static boolean isInterstitialReady(String str) {
        if (!isPluginInitialized()) {
            return false;
        }
        return sAdManager.isInterstitialReady(str);
    }

    public static void showInterstitial(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.showInterstitial(str, str2);
        }
    }

    public static void setInterstitialExtraParameter(String str, String str2, String str3) {
        sAdManager.setInterstitialExtraParameter(str, str2, str3);
    }

    public static void loadRewardedAd(String str) {
        if (isPluginInitialized()) {
            sAdManager.loadRewardedAd(str);
        }
    }

    public static boolean isRewardedAdReady(String str) {
        if (!isPluginInitialized()) {
            return false;
        }
        return sAdManager.isRewardedAdReady(str);
    }

    public static void showRewardedAd(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.showRewardedAd(str, str2);
        }
    }

    public static void setRewardedAdExtraParameter(String str, String str2, String str3) {
        sAdManager.setRewardedAdExtraParameter(str, str2, str3);
    }

    public static void trackEvent(String str, String str2) {
        if (isPluginInitialized()) {
            sAdManager.trackEvent(str, str2);
        }
    }

    public static void loadVariables() {
        if (isPluginInitialized()) {
            sAdManager.loadVariables();
        }
    }

    public static boolean isTablet() {
        return AppLovinSdkUtils.isTablet(Utils.getCurrentActivity());
    }

    public static boolean getBoolean(String str, boolean z) {
        if (!isPluginInitialized()) {
            return z;
        }
        return sSdk.getVariableService().getBoolean(str, z);
    }

    public static String getString(String str, String str2) {
        if (!isPluginInitialized()) {
            return str2;
        }
        return sSdk.getVariableService().getString(str, str2);
    }

    public static boolean isMuted() {
        if (!isPluginInitialized()) {
            return false;
        }
        return sSdk.getSettings().isMuted();
    }

    public static void setMuted(boolean z) {
        if (isPluginInitialized()) {
            sSdk.getSettings().setMuted(z);
        }
    }

    public static float getScreenDensity() {
        return Utils.getCurrentActivity().getResources().getDisplayMetrics().density;
    }

    public static String getAdInfo(String str) {
        return sAdManager.getAdInfo(str);
    }

    public static void setVerboseLogging(boolean z) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.getSettings().setVerboseLogging(z);
            sVerboseLogging = null;
            return;
        }
        sVerboseLogging = Boolean.valueOf(z);
    }

    public static void setTestDeviceAdvertisingIds(String[] strArr) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.getSettings().setTestDeviceAdvertisingIds(Arrays.asList(strArr));
            sTestDeviceAdvertisingIds = null;
            return;
        }
        sTestDeviceAdvertisingIds = Arrays.asList(strArr);
    }
}
