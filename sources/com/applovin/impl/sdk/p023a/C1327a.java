package com.applovin.impl.sdk.p023a;

import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p024ad.C1361h;
import com.applovin.impl.sdk.p024ad.C1362i;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1400ae;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.p027d.C1451z;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.a.a */
public class C1327a {

    /* renamed from: a */
    protected final C1469j f2626a;

    /* renamed from: b */
    protected final AppLovinAdServiceImpl f2627b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAd f2628c;

    /* renamed from: d */
    private String f2629d;

    /* renamed from: e */
    private SoftReference<AppLovinAdLoadListener> f2630e;

    /* renamed from: f */
    private final Object f2631f = new Object();

    /* renamed from: g */
    private volatile String f2632g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f2633h = false;

    /* renamed from: com.applovin.impl.sdk.a.a$a */
    private class C1329a implements AppLovinAdLoadListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AppLovinAdLoadListener f2636b;

        C1329a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f2636b = appLovinAdLoadListener;
        }

        public void adReceived(final AppLovinAd appLovinAd) {
            AppLovinAd unused = C1327a.this.f2628c = appLovinAd;
            if (this.f2636b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1329a.this.f2636b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            C1505q.m3341c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        public void failedToReceiveAd(final int i) {
            if (this.f2636b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1329a.this.f2636b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            C1505q.m3341c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.a.a$b */
    private class C1332b implements C1362i, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b */
        private final AppLovinAdDisplayListener f2642b;

        /* renamed from: c */
        private final AppLovinAdClickListener f2643c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f2644d;

        /* renamed from: e */
        private final AppLovinAdRewardListener f2645e;

        private C1332b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f2642b = appLovinAdDisplayListener;
            this.f2643c = appLovinAdClickListener;
            this.f2644d = appLovinAdVideoPlaybackListener;
            this.f2645e = appLovinAdRewardListener;
        }

        /* renamed from: a */
        private void m2390a(C1355g gVar) {
            String str;
            int i;
            if (!C1553o.m3554b(C1327a.this.m2382e()) || !C1327a.this.f2633h) {
                gVar.mo12784aN();
                if (C1327a.this.f2633h) {
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                gVar.mo12769a(C1342c.m2403a(str));
                C1522j.m3507a(this.f2645e, (AppLovinAd) gVar, i);
            }
            C1327a.this.m2373a((AppLovinAd) gVar);
            C1522j.m3516b(this.f2642b, (AppLovinAd) gVar);
            if (!gVar.mo12802ap().getAndSet(true)) {
                C1327a.this.f2626a.mo13071K().mo13014a((C1392a) new C1451z(gVar, C1327a.this.f2626a), C1435s.C1437a.REWARD);
            }
        }

        public void adClicked(AppLovinAd appLovinAd) {
            C1522j.m3504a(this.f2643c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            C1522j.m3505a(this.f2642b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof C1361h) {
                appLovinAd = ((C1361h) appLovinAd).mo12829a();
            }
            if (appLovinAd instanceof C1355g) {
                m2390a((C1355g) appLovinAd);
                return;
            }
            C1505q v = C1327a.this.f2626a.mo13139v();
            v.mo13281e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
        }

        public void onAdDisplayFailed(String str) {
            C1522j.m3506a(this.f2642b, str);
        }

        public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            C1327a.this.m2376a("quota_exceeded");
            C1522j.m3517b(this.f2645e, appLovinAd, map);
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            C1327a.this.m2376a("rejected");
            C1522j.m3520c(this.f2645e, appLovinAd, map);
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            C1327a.this.m2376a("accepted");
            C1522j.m3508a(this.f2645e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1327a.this.m2376a("network_timeout");
            C1522j.m3507a(this.f2645e, appLovinAd, i);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            C1522j.m3509a(this.f2644d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            C1522j.m3510a(this.f2644d, appLovinAd, d, z);
            boolean unused = C1327a.this.f2633h = z;
        }
    }

    public C1327a(String str, AppLovinSdk appLovinSdk) {
        this.f2626a = C1557r.m3585a(appLovinSdk);
        this.f2627b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f2629d = str;
    }

    /* renamed from: a */
    private void m2369a(AppLovinAdBase appLovinAdBase, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (!appLovinAdBase.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            C1505q v = this.f2626a.mo13139v();
            v.mo13281e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdBase.getType() + " in an Incentivized Ad interstitial.");
            m2375a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd a = C1557r.m3586a((AppLovinAd) appLovinAdBase, this.f2626a);
        if (a != null) {
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f2626a.mo13078R(), context);
            C1332b bVar = new C1332b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            create.showAndRender(a);
            if (a instanceof C1355g) {
                m2372a((C1355g) a, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        m2375a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
    }

    /* renamed from: a */
    private void m2372a(C1355g gVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f2626a.mo13071K().mo13014a((C1392a) new C1400ae(gVar, appLovinAdRewardListener, this.f2626a), C1435s.C1437a.REWARD);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2373a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f2628c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof C1361h) {
                if (appLovinAd != ((C1361h) appLovinAd2).mo12829a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f2628c = null;
        }
    }

    /* renamed from: a */
    private void m2374a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f2628c;
        }
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
        if (appLovinAdBase != null) {
            m2369a(appLovinAdBase, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        C1505q.m3345i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        m2381d();
    }

    /* renamed from: a */
    private void m2375a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f2626a.mo13072L().mo12926a(C1387g.f3257j);
        C1522j.m3510a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        C1522j.m3516b(appLovinAdDisplayListener, appLovinAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2376a(String str) {
        synchronized (this.f2631f) {
            this.f2632g = str;
        }
    }

    /* renamed from: b */
    private void m2379b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2627b.loadNextIncentivizedAd(this.f2629d, appLovinAdLoadListener);
    }

    /* renamed from: d */
    private void m2381d() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f2630e;
        if (softReference != null && (appLovinAdLoadListener = softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m2382e() {
        String str;
        synchronized (this.f2631f) {
            str = this.f2632g;
        }
        return str;
    }

    /* renamed from: f */
    private AppLovinAdRewardListener m2383f() {
        return new AppLovinAdRewardListener() {
            public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
                C1327a.this.f2626a.mo13139v().mo13277b("IncentivizedAdController", "User declined to view");
            }

            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                C1505q v = C1327a.this.f2626a.mo13139v();
                v.mo13277b("IncentivizedAdController", "User over quota: " + map);
            }

            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                C1505q v = C1327a.this.f2626a.mo13139v();
                v.mo13277b("IncentivizedAdController", "Reward rejected: " + map);
            }

            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                C1505q v = C1327a.this.f2626a.mo13139v();
                v.mo13277b("IncentivizedAdController", "Reward validated: " + map);
            }

            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                C1505q v = C1327a.this.f2626a.mo13139v();
                v.mo13277b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        };
    }

    /* renamed from: a */
    public void mo12612a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m2383f();
        }
        m2374a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo12613a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2626a.mo13139v().mo13277b("IncentivizedAdController", "User requested preload of incentivized ad...");
        this.f2630e = new SoftReference<>(appLovinAdLoadListener);
        if (mo12614a()) {
            C1505q.m3345i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f2628c);
                return;
            }
            return;
        }
        m2379b((AppLovinAdLoadListener) new C1329a(appLovinAdLoadListener));
    }

    /* renamed from: a */
    public boolean mo12614a() {
        return this.f2628c != null;
    }

    /* renamed from: b */
    public String mo12615b() {
        return this.f2629d;
    }

    /* renamed from: c */
    public void mo12616c() {
    }
}
