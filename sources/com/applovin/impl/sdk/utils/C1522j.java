package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1362i;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.j */
public class C1522j {
    /* renamed from: a */
    public static void m3499a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdViewEventListener.adOpenedFullscreen(C1522j.m3513b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3500a(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        maxAdListener.onAdLoaded(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being loaded", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3501a(final MaxAdListener maxAdListener, final MaxAd maxAd, final int i) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        maxAdListener.onAdDisplayFailed(maxAd, i);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to display", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3502a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about user being rewarded", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3503a(final MaxAdListener maxAdListener, final String str, final int i) {
        if (str != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        maxAdListener.onAdLoadFailed(str, i);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to load", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3504a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdClickListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdClickListener.adClicked(C1522j.m3513b(appLovinAd));
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3505a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdDisplayListener.adDisplayed(C1522j.m3513b(appLovinAd));
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3506a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof C1362i) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    ((C1362i) appLovinAdDisplayListener).onAdDisplayFailed(str);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3507a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdRewardListener.validationRequestFailed(C1522j.m3513b(appLovinAd), i);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3508a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdRewardListener.userRewardVerified(C1522j.m3513b(appLovinAd), map);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3509a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdVideoPlaybackListener.videoPlaybackBegan(C1522j.m3513b(appLovinAd));
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3510a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
            final AppLovinAd appLovinAd2 = appLovinAd;
            final double d2 = d;
            final boolean z2 = z;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdVideoPlaybackListener2.videoPlaybackEnded(C1522j.m3513b(appLovinAd2), d2, z2);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3511a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinPostbackListener.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3512a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinPostbackListener.onPostbackFailure(str, i);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static AppLovinAd m3513b(AppLovinAd appLovinAd) {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
        return appLovinAdBase.getDummyAd() != null ? appLovinAdBase.getDummyAd() : appLovinAd;
    }

    /* renamed from: b */
    public static void m3514b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdViewEventListener.adClosedFullscreen(C1522j.m3513b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m3515b(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        maxAdListener.onAdDisplayed(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m3516b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdDisplayListener.adHidden(C1522j.m3513b(appLovinAd));
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m3517b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdRewardListener.userOverQuota(C1522j.m3513b(appLovinAd), map);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m3518c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdViewEventListener.adLeftApplication(C1522j.m3513b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m3519c(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        maxAdListener.onAdHidden(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m3520c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        appLovinAdRewardListener.userRewardRejected(C1522j.m3513b(appLovinAd), map);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public static void m3521d(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        maxAdListener.onAdClicked(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public static void m3522e(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video starting", th);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public static void m3523f(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video completing", th);
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public static void m3524g(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being expanded", th);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public static void m3525h(final MaxAdListener maxAdListener, final MaxAd maxAd) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                    } catch (Throwable th) {
                        C1505q.m3341c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being collapsed", th);
                    }
                }
            });
        }
    }
}
