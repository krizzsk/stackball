package com.applovin.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.unity3d.player.UnityPlayer;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class MaxUnityAdManager implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, AppLovinVariableService.OnVariablesUpdateListener {
    private static final String SDK_TAG = "AppLovinSdk";
    private static final String SERIALIZED_KEY_VALUE_PAIR_SEPARATOR = String.valueOf(29);
    private static final String SERIALIZED_KEY_VALUE_SEPARATOR = String.valueOf(28);
    private static final String TAG = "MaxUnityAdManager";
    private static final String VERSION = "2.4.6";
    private static final ScheduledThreadPoolExecutor sThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new SdkThreadFactory());
    private final Map<String, MaxAd> mAdInfoMap;
    private final Object mAdInfoMapLock;
    /* access modifiers changed from: private */
    public final Map<String, MaxAdFormat> mAdViewAdFormats;
    /* access modifiers changed from: private */
    public final Map<String, String> mAdViewPositions;
    /* access modifiers changed from: private */
    public final Map<String, MaxAdView> mAdViews;
    private final Activity mCurrentActivity;
    private final Map<String, MaxInterstitialAd> mInterstitials;
    private final Map<String, MaxRewardedAd> mRewardedAds;
    /* access modifiers changed from: private */
    public final Map<String, MaxAdFormat> mVerticalAdViewFormats;
    private AppLovinSdk sdk;

    public interface Listener {
        void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
    }

    public MaxUnityAdManager() {
        this((Activity) null);
    }

    public MaxUnityAdManager(Activity activity) {
        this.mCurrentActivity = activity;
        this.mInterstitials = new HashMap(2);
        this.mRewardedAds = new HashMap(2);
        this.mAdViews = new HashMap(2);
        this.mAdViewAdFormats = new HashMap(2);
        this.mAdViewPositions = new HashMap(2);
        this.mAdInfoMap = new HashMap();
        this.mAdInfoMapLock = new Object();
        this.mVerticalAdViewFormats = new HashMap(2);
        new OrientationEventListener(getCurrentActivity()) {
            public void onOrientationChanged(int i) {
                for (Map.Entry entry : MaxUnityAdManager.this.mVerticalAdViewFormats.entrySet()) {
                    MaxUnityAdManager.this.positionAdView((String) entry.getKey(), (MaxAdFormat) entry.getValue());
                }
            }
        }.enable();
    }

    public AppLovinSdk initializeSdkWithCompletionHandler(String str, String str2, final Listener listener) {
        Activity currentActivity = getCurrentActivity();
        AppLovinSdk instance = AppLovinSdk.getInstance(str, generateSdkSettings(str2, currentActivity), currentActivity);
        this.sdk = instance;
        instance.getVariableService().setOnVariablesUpdateListener(this);
        this.sdk.setPluginVersion("Max-Unity-2.4.6");
        this.sdk.setMediationProvider("max");
        this.sdk.initializeSdk((AppLovinSdk.SdkInitializationListener) new AppLovinSdk.SdkInitializationListener() {
            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                listener.onSdkInitializationComplete(appLovinSdkConfiguration);
                HashMap hashMap = new HashMap(2);
                hashMap.put("name", "OnSdkInitializedEvent");
                hashMap.put("consentDialogState", Integer.toString(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
                MaxUnityAdManager.forwardUnityEventWithArgs(hashMap);
            }
        });
        return this.sdk;
    }

    public void createBanner(String str, String str2) {
        createAdView(str, getDeviceSpecificAdViewAdFormat(), str2);
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getDeviceSpecificAdViewAdFormat(), str2);
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, getDeviceSpecificAdViewAdFormat());
    }

    public void showBanner(String str) {
        showAdView(str, getDeviceSpecificAdViewAdFormat());
    }

    public void hideBanner(String str) {
        hideAdView(str, getDeviceSpecificAdViewAdFormat());
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getDeviceSpecificAdViewAdFormat());
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getDeviceSpecificAdViewAdFormat(), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameters(str, getDeviceSpecificAdViewAdFormat(), str3, str2);
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2);
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, MaxAdFormat.MREC);
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public boolean isInterstitialReady(String str) {
        return retrieveInterstitial(str).isReady();
    }

    public void showInterstitial(String str, String str2) {
        retrieveInterstitial(str).showAd(str2);
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    public boolean isRewardedAdReady(String str) {
        return retrieveRewardedAd(str).isReady();
    }

    public void showRewardedAd(String str, String str2) {
        retrieveRewardedAd(str).showAd(str2);
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void trackEvent(String str, String str2) {
        if (this.sdk != null) {
            this.sdk.getEventService().trackEvent(str, deserializeParameters(str2));
        }
    }

    public void loadVariables() {
        this.sdk.getVariableService().loadVariables();
    }

    public void onVariablesUpdate(Bundle bundle) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("name", "OnVariablesUpdatedEvent");
        forwardUnityEventWithArgs(hashMap);
    }

    public String getAdInfo(String str) {
        MaxAd maxAd;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        synchronized (this.mAdInfoMapLock) {
            maxAd = this.mAdInfoMap.get(str);
        }
        if (maxAd == null) {
            return "";
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("adUnitId", str);
        hashMap.put("networkName", maxAd.getNetworkName());
        return propsStrFromDictionary(hashMap);
    }

    public void onAdLoaded(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format || MaxAdFormat.MREC == format) {
            String str2 = MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            positionAdView(maxAd);
            MaxAdView retrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (!(retrieveAdView == null || retrieveAdView.getVisibility() == 0)) {
                retrieveAdView.stopAutoRefresh();
            }
            str = str2;
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        synchronized (this.mAdInfoMapLock) {
            this.mAdInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("name", str);
        hashMap.put("adUnitId", maxAd.getAdUnitId());
        forwardUnityEventWithArgs(hashMap);
    }

    public void onAdLoadFailed(String str, int i) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.mAdViews.containsKey(str)) {
            str2 = MaxAdFormat.MREC == this.mAdViewAdFormats.get(str) ? "OnMRecAdLoadFailedEvent" : "OnBannerAdLoadFailedEvent";
        } else if (this.mInterstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.mRewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            logStackTrace(new IllegalStateException("invalid adUnitId: " + str));
            return;
        }
        synchronized (this.mAdInfoMapLock) {
            this.mAdInfoMap.remove(str);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("name", str2);
        hashMap.put("adUnitId", str);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(i));
        forwardUnityEventWithArgs(hashMap);
    }

    public void onAdClicked(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("name", str);
        hashMap.put("adUnitId", maxAd.getAdUnitId());
        forwardUnityEventWithArgs(hashMap);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL || format == MaxAdFormat.REWARDED) {
            String str = MaxAdFormat.INTERSTITIAL == format ? "OnInterstitialDisplayedEvent" : "OnRewardedAdDisplayedEvent";
            HashMap hashMap = new HashMap(2);
            hashMap.put("name", str);
            hashMap.put("adUnitId", maxAd.getAdUnitId());
            forwardUnityEventWithArgs(hashMap);
        }
    }

    public void onAdDisplayFailed(MaxAd maxAd, int i) {
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL || format == MaxAdFormat.REWARDED) {
            String str = MaxAdFormat.INTERSTITIAL == format ? "OnInterstitialAdFailedToDisplayEvent" : "OnRewardedAdFailedToDisplayEvent";
            HashMap hashMap = new HashMap(3);
            hashMap.put("name", str);
            hashMap.put("adUnitId", maxAd.getAdUnitId());
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(i));
            forwardUnityEventWithArgs(hashMap);
        }
    }

    public void onAdHidden(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL || format == MaxAdFormat.REWARDED) {
            String str = MaxAdFormat.INTERSTITIAL == format ? "OnInterstitialHiddenEvent" : "OnRewardedAdHiddenEvent";
            HashMap hashMap = new HashMap(2);
            hashMap.put("name", str);
            hashMap.put("adUnitId", maxAd.getAdUnitId());
            forwardUnityEventWithArgs(hashMap);
        }
    }

    public void onAdCollapsed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.BANNER || format == MaxAdFormat.LEADER || format == MaxAdFormat.MREC) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("name", MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent");
            hashMap.put("adUnitId", maxAd.getAdUnitId());
            forwardUnityEventWithArgs(hashMap);
            return;
        }
        logInvalidAdFormat(format);
    }

    public void onAdExpanded(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.BANNER || format == MaxAdFormat.LEADER || format == MaxAdFormat.MREC) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("name", MaxAdFormat.MREC == format ? "OnMrecAdCollapsedEvent" : "OnBannerAdExpandedEvent");
            hashMap.put("adUnitId", maxAd.getAdUnitId());
            forwardUnityEventWithArgs(hashMap);
            return;
        }
        logInvalidAdFormat(format);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward != null ? maxReward.getLabel() : "";
        String num = Integer.toString(maxReward != null ? maxReward.getAmount() : 0);
        HashMap hashMap = new HashMap(4);
        hashMap.put("name", "OnRewardedAdReceivedRewardEvent");
        hashMap.put("adUnitId", maxAd.getAdUnitId());
        hashMap.put("rewardLabel", label);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, num);
        forwardUnityEventWithArgs(hashMap);
    }

    private void createAdView(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
                MaxAdView access$500 = MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat, str2);
                if (access$500 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                access$500.setVisibility(8);
                if (access$500.getParent() == null) {
                    Activity access$700 = MaxUnityAdManager.this.getCurrentActivity();
                    RelativeLayout relativeLayout = new RelativeLayout(access$700);
                    access$700.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
                    relativeLayout.addView(access$500);
                    MaxUnityAdManager.this.mAdViewAdFormats.put(str, maxAdFormat);
                    MaxUnityAdManager.this.positionAdView(str, maxAdFormat);
                }
                access$500.loadAd();
            }
        });
    }

    private void setAdViewPlacement(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Setting placement \"" + str2 + "\" for " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
                MaxAdView access$900 = MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat);
                if (access$900 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                access$900.setPlacement(str2);
            }
        });
    }

    private void updateAdViewPosition(final String str, final String str2, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Updating " + maxAdFormat.getLabel() + " position to \"" + str2 + "\" for ad unit id \"" + str + "\"");
                if (MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat) == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                String str = (String) MaxUnityAdManager.this.mAdViewPositions.get(str);
                String str2 = str2;
                if (str2 != null && !str2.equals(str)) {
                    MaxUnityAdManager.this.mAdViewPositions.put(str, str2);
                    MaxUnityAdManager.this.positionAdView(str, maxAdFormat);
                }
            }
        });
    }

    private void showAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
                MaxAdView access$900 = MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat);
                if (access$900 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                access$900.setVisibility(0);
                access$900.startAutoRefresh();
            }
        });
    }

    private void hideAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
                MaxAdView access$900 = MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat);
                if (access$900 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                access$900.setVisibility(8);
                access$900.stopAutoRefresh();
            }
        });
    }

    private void destroyAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
                MaxAdView access$900 = MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat);
                if (access$900 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                ViewParent parent = access$900.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(access$900);
                }
                access$900.setListener((MaxAdViewAdListener) null);
                access$900.destroy();
                MaxUnityAdManager.this.mAdViews.remove(str);
                MaxUnityAdManager.this.mAdViewAdFormats.remove(str);
                MaxUnityAdManager.this.mAdViewPositions.remove(str);
                MaxUnityAdManager.this.mVerticalAdViewFormats.remove(str);
            }
        });
    }

    private void setAdViewBackgroundColor(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
                MaxAdView access$900 = MaxUnityAdManager.this.retrieveAdView(str, maxAdFormat);
                if (access$900 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat.getLabel() + " does not exist");
                    return;
                }
                access$900.setBackgroundColor(Color.parseColor(str2));
            }
        });
    }

    private void setAdViewExtraParameters(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        final MaxAdFormat maxAdFormat2 = maxAdFormat;
        final String str4 = str3;
        final String str5 = str2;
        final String str6 = str;
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() {
            public void run() {
                MaxAdFormat maxAdFormat;
                MaxUnityAdManager maxUnityAdManager = MaxUnityAdManager.this;
                maxUnityAdManager.m3686d("Setting " + maxAdFormat2.getLabel() + " extra with key: \"" + str4 + "\" value: " + str5);
                MaxAdView access$900 = MaxUnityAdManager.this.retrieveAdView(str6, maxAdFormat2);
                if (access$900 == null) {
                    MaxUnityAdManager maxUnityAdManager2 = MaxUnityAdManager.this;
                    maxUnityAdManager2.m3687e(maxAdFormat2.getLabel() + " does not exist");
                    return;
                }
                access$900.setExtraParameter(str4, str5);
                if ("force_banner".equalsIgnoreCase(str4) && MaxAdFormat.MREC != maxAdFormat2) {
                    if (Boolean.parseBoolean(str5)) {
                        maxAdFormat = MaxAdFormat.BANNER;
                    } else {
                        maxAdFormat = MaxUnityAdManager.this.getDeviceSpecificAdViewAdFormat();
                    }
                    MaxUnityAdManager.this.mAdViewAdFormats.put(str6, maxAdFormat);
                    MaxUnityAdManager.this.positionAdView(str6, maxAdFormat);
                }
            }
        });
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        m3687e(Log.getStackTraceString(exc));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m3686d(String str) {
        Log.d(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m3687e(String str) {
        Log.e(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.mInterstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str, this.sdk, getCurrentActivity());
        maxInterstitialAd2.setListener(this);
        this.mInterstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.mRewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd instance = MaxRewardedAd.getInstance(str, this.sdk, getCurrentActivity());
        instance.setListener(this);
        this.mRewardedAds.put(str, instance);
        return instance;
    }

    /* access modifiers changed from: private */
    public MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, (String) null);
    }

    /* access modifiers changed from: private */
    public MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2) {
        MaxAdView maxAdView = this.mAdViews.get(str);
        if (maxAdView != null || str2 == null) {
            return maxAdView;
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, this.sdk, getCurrentActivity());
        maxAdView2.setListener(this);
        this.mAdViews.put(str, maxAdView2);
        this.mAdViewPositions.put(str, str2);
        return maxAdView2;
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    /* access modifiers changed from: private */
    public void positionAdView(String str, MaxAdFormat maxAdFormat) {
        int i;
        int i2;
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            m3687e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str2 = this.mAdViewPositions.get(str);
        RelativeLayout relativeLayout = (RelativeLayout) retrieveAdView.getParent();
        AdViewSize adViewSize = getAdViewSize(maxAdFormat);
        int dpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), adViewSize.mWidthDp);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), adViewSize.mHeightDp);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) retrieveAdView.getLayoutParams();
        layoutParams.height = dpToPx2;
        retrieveAdView.setLayoutParams(layoutParams);
        retrieveAdView.setRotation(0.0f);
        retrieveAdView.setTranslationX(0.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.mVerticalAdViewFormats.remove(str);
        if ("Centered".equalsIgnoreCase(str2)) {
            i = 17;
        } else {
            if (str2.contains("Top")) {
                i2 = 48;
            } else {
                i2 = str2.contains("Bottom") ? 80 : 0;
            }
            if (str2.contains("Center")) {
                i2 |= 1;
                if (MaxAdFormat.MREC != maxAdFormat) {
                    dpToPx = -1;
                }
                layoutParams.width = dpToPx;
                boolean contains = str2.contains("Left");
                boolean contains2 = str2.contains("Right");
                if (contains || contains2) {
                    int i3 = i2 | 16;
                    if (MaxAdFormat.MREC == maxAdFormat) {
                        i3 |= str2.contains("Left") ? 3 : 5;
                    } else {
                        Rect rect = new Rect();
                        relativeLayout.getWindowVisibleDisplayFrame(rect);
                        int i4 = -((Math.max(rect.right, rect.bottom) - Math.min(rect.right, rect.bottom)) / 2);
                        layoutParams.setMargins(i4, 0, i4, 0);
                        int i5 = (rect.right / 2) - (dpToPx2 / 2);
                        if (contains) {
                            i5 = -i5;
                        }
                        retrieveAdView.setTranslationX((float) i5);
                        retrieveAdView.setRotation(270.0f);
                        this.mVerticalAdViewFormats.put(str, maxAdFormat);
                    }
                    relativeLayout.setBackgroundColor(0);
                }
            } else {
                layoutParams.width = dpToPx;
                if (str2.contains("Left")) {
                    i = i2 | 3;
                } else if (str2.contains("Right")) {
                    i = i2 | 5;
                }
            }
            i = i2;
        }
        relativeLayout.setGravity(i);
    }

    /* access modifiers changed from: private */
    public static void forwardUnityEventWithArgs(final Map<String, String> map) {
        sThreadPoolExecutor.execute(new Runnable() {
            public void run() {
                UnityPlayer.UnitySendMessage("MaxSdkCallbacks", "ForwardEvent", MaxUnityAdManager.propsStrFromDictionary(map));
            }
        });
    }

    /* access modifiers changed from: private */
    public static String propsStrFromDictionary(Map<String, String> map) {
        StringBuilder sb = new StringBuilder(64);
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append((String) next.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    private static Map<String, String> deserializeParameters(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        String[] split = str.split(SERIALIZED_KEY_VALUE_PAIR_SEPARATOR);
        HashMap hashMap = new HashMap(split.length);
        for (String split2 : split) {
            String[] split3 = split2.split(SERIALIZED_KEY_VALUE_SEPARATOR);
            if (split3.length == 2) {
                hashMap.put(split3[0], split3[1]);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public MaxAdFormat getDeviceSpecificAdViewAdFormat() {
        return AppLovinSdkUtils.isTablet(getCurrentActivity()) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    private static AppLovinSdkSettings generateSdkSettings(String str, Context context) {
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings(context);
        Map<String, String> deserializeParameters = deserializeParameters(str);
        if (AppLovinSdk.VERSION_CODE >= 91201) {
            try {
                Field declaredField = AppLovinSdkSettings.class.getDeclaredField("metaData");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(appLovinSdkSettings);
                for (Map.Entry next : deserializeParameters.entrySet()) {
                    map.put(next.getKey(), next.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return appLovinSdkSettings;
    }

    private static class AdViewSize {
        /* access modifiers changed from: private */
        public final int mHeightDp;
        /* access modifiers changed from: private */
        public final int mWidthDp;

        private AdViewSize(int i, int i2) {
            this.mWidthDp = i;
            this.mHeightDp = i2;
        }
    }

    private AdViewSize getAdViewSize(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return new AdViewSize(728, 90);
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return new AdViewSize(320, 50);
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return new AdViewSize(ErrorCode.GENERAL_WRAPPER_ERROR, 250);
        }
        throw new IllegalArgumentException("Invalid ad format");
    }

    /* access modifiers changed from: private */
    public Activity getCurrentActivity() {
        return Utils.getCurrentActivity();
    }

    private static class SdkThreadFactory implements ThreadFactory {
        private SdkThreadFactory() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:Max-Unity-Plugin:shared");
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    Log.e(MaxUnityAdManager.TAG, "Caught unhandled exception", th);
                }
            });
            return thread;
        }
    }
}
