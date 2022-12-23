package com.applovin.impl.sdk;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.sdk.network.C1496f;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p024ad.C1361h;
import com.applovin.impl.sdk.p024ad.NativeAdImpl;
import com.applovin.impl.sdk.p026c.C1374a;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1423l;
import com.applovin.impl.sdk.p027d.C1424m;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdUpdateListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AppLovinAdServiceImpl implements AppLovinAdService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f2557a;

    /* renamed from: b */
    private final C1505q f2558b;

    /* renamed from: c */
    private final Handler f2559c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Map<C1349d, C1312b> f2560d;

    /* renamed from: e */
    private final Object f2561e = new Object();

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$a */
    private class C1311a implements AppLovinAdLoadListener {

        /* renamed from: b */
        private final C1312b f2569b;

        private C1311a(C1312b bVar) {
            this.f2569b = bVar;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            HashSet<AppLovinAdLoadListener> hashSet;
            C1349d adZone = ((AppLovinAdBase) appLovinAd).getAdZone();
            if (!(appLovinAd instanceof C1361h)) {
                AppLovinAdServiceImpl.this.f2557a.mo13079S().adReceived(appLovinAd);
                appLovinAd = new C1361h(adZone, AppLovinAdServiceImpl.this.f2557a);
            }
            synchronized (this.f2569b.f2570a) {
                hashSet = new HashSet<>(this.f2569b.f2572c);
                this.f2569b.f2572c.clear();
                this.f2569b.f2571b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m2326a(appLovinAd, a);
            }
        }

        public void failedToReceiveAd(int i) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.f2569b.f2570a) {
                hashSet = new HashSet<>(this.f2569b.f2572c);
                this.f2569b.f2572c.clear();
                this.f2569b.f2571b = false;
            }
            for (AppLovinAdLoadListener a : hashSet) {
                AppLovinAdServiceImpl.this.m2318a(i, a);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    private static class C1312b {

        /* renamed from: a */
        final Object f2570a;

        /* renamed from: b */
        boolean f2571b;

        /* renamed from: c */
        final Collection<AppLovinAdLoadListener> f2572c;

        private C1312b() {
            this.f2570a = new Object();
            this.f2572c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f2571b + ", pendingAdListeners=" + this.f2572c + '}';
        }
    }

    AppLovinAdServiceImpl(C1469j jVar) {
        this.f2557a = jVar;
        this.f2558b = jVar.mo13139v();
        HashMap hashMap = new HashMap(5);
        this.f2560d = hashMap;
        hashMap.put(C1349d.m2461c(jVar), new C1312b());
        this.f2560d.put(C1349d.m2462d(jVar), new C1312b());
        this.f2560d.put(C1349d.m2463e(jVar), new C1312b());
        this.f2560d.put(C1349d.m2464f(jVar), new C1312b());
        this.f2560d.put(C1349d.m2465g(jVar), new C1312b());
    }

    /* renamed from: a */
    private C1312b m2314a(C1349d dVar) {
        C1312b bVar;
        synchronized (this.f2561e) {
            bVar = this.f2560d.get(dVar);
            if (bVar == null) {
                bVar = new C1312b();
                this.f2560d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private String m2316a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!C1553o.m3554b(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter(NativeAdImpl.QUERY_PARAM_VIDEO_PERCENT_VIEWED, Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            C1505q qVar = this.f2558b;
            qVar.mo13278b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            return null;
        }
    }

    /* renamed from: a */
    private String m2317a(String str, long j, long j2, boolean z, int i) {
        if (!C1553o.m3554b(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (i != C1452e.f3420a) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C1452e.m2996a(i)));
        }
        return appendQueryParameter.build().toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2318a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2559c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                } catch (Throwable th) {
                    C1505q.m3341c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    /* renamed from: a */
    private void m2319a(Uri uri, C1355g gVar, AppLovinAdView appLovinAdView, AdViewControllerImpl adViewControllerImpl) {
        if (appLovinAdView != null) {
            if (C1557r.m3608a(appLovinAdView.getContext(), uri, this.f2557a)) {
                C1522j.m3518c(adViewControllerImpl.getAdViewEventListener(), (AppLovinAd) gVar, appLovinAdView);
            }
            adViewControllerImpl.dismissInterstitialIfRequired();
            return;
        }
        this.f2558b.mo13281e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
    }

    /* renamed from: a */
    private void m2322a(C1349d dVar, C1311a aVar) {
        AppLovinAd appLovinAd = (AppLovinAd) this.f2557a.mo13079S().mo12874e(dVar);
        if (appLovinAd != null) {
            C1505q qVar = this.f2558b;
            qVar.mo13277b("AppLovinAdService", "Using pre-loaded ad: " + appLovinAd + " for " + dVar);
            this.f2557a.mo13082V().mo12727a((AppLovinAdBase) appLovinAd, true, false);
            aVar.adReceived(appLovinAd);
            if (dVar.mo12724j() || dVar.mo12721h() > 0) {
                this.f2557a.mo13079S().mo12878i(dVar);
                return;
            }
            return;
        }
        m2325a((C1392a) new C1424m(dVar, aVar, this.f2557a), (AppLovinAdLoadListener) aVar);
    }

    /* renamed from: a */
    private void m2323a(C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        C1505q qVar;
        String str;
        String str2;
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        } else if (appLovinAdLoadListener != null) {
            C1505q v = this.f2557a.mo13139v();
            v.mo13277b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
            C1312b a = m2314a(dVar);
            synchronized (a.f2570a) {
                a.f2572c.add(appLovinAdLoadListener);
                if (!a.f2571b) {
                    this.f2558b.mo13277b("AppLovinAdService", "Loading next ad...");
                    a.f2571b = true;
                    C1311a aVar = new C1311a(a);
                    if (!dVar.mo12723i()) {
                        this.f2558b.mo13277b("AppLovinAdService", "Task merge not necessary.");
                    } else if (this.f2557a.mo13079S().mo12869a(dVar, (AppLovinAdLoadListener) aVar)) {
                        qVar = this.f2558b;
                        str = "AppLovinAdService";
                        str2 = "Attaching load listener to initial preload task...";
                    } else {
                        this.f2558b.mo13277b("AppLovinAdService", "Skipped attach of initial preload callback.");
                    }
                    m2322a(dVar, aVar);
                } else {
                    qVar = this.f2558b;
                    str = "AppLovinAdService";
                    str2 = "Already waiting on an ad load...";
                }
                qVar.mo13277b(str, str2);
            }
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    /* renamed from: a */
    private void m2324a(C1374a aVar) {
        if (C1553o.m3554b(aVar.mo12879a())) {
            this.f2557a.mo13073M().mo13215a(C1496f.m3253l().mo13233a(C1557r.m3617b(aVar.mo12879a())).mo13237b(C1553o.m3554b(aVar.mo12880b()) ? C1557r.m3617b(aVar.mo12880b()) : null).mo13238b(aVar.mo12881c()).mo13235a(false).mo13236a());
            return;
        }
        this.f2558b.mo13280d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
    }

    /* renamed from: a */
    private void m2325a(C1392a aVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!this.f2557a.mo13120d()) {
            C1505q.m3344h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f2557a.mo13091a();
        this.f2557a.mo13071K().mo13014a(aVar, C1435s.C1437a.MAIN);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2326a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2559c.post(new Runnable() {
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    C1505q.m3341c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                }
            }
        });
    }

    /* renamed from: a */
    private void m2327a(List<C1374a> list) {
        if (list != null && !list.isEmpty()) {
            for (C1374a a : list) {
                m2324a(a);
            }
        }
    }

    public void addAdUpdateListener(AppLovinAdUpdateListener appLovinAdUpdateListener) {
    }

    public void addAdUpdateListener(AppLovinAdUpdateListener appLovinAdUpdateListener, AppLovinAdSize appLovinAdSize) {
    }

    public AppLovinAd dequeueAd(C1349d dVar) {
        AppLovinAd appLovinAd = (AppLovinAd) this.f2557a.mo13079S().mo12873d(dVar);
        C1505q qVar = this.f2558b;
        qVar.mo13277b("AppLovinAdService", "Dequeued ad: " + appLovinAd + " for zone: " + dVar + "...");
        return appLovinAd;
    }

    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String a = this.f2557a.mo13074N().mo13148a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a;
    }

    public boolean hasPreloadedAd(AppLovinAdSize appLovinAdSize) {
        return this.f2557a.mo13079S().mo12876g(C1349d.m2452a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2557a));
    }

    public boolean hasPreloadedAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            C1505q.m3345i("AppLovinAdService", "Unable to check if ad is preloaded - invalid zone id");
            return false;
        }
        return this.f2557a.mo13079S().mo12876g(C1349d.m2454a(str, this.f2557a));
    }

    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m2323a(C1349d.m2452a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2557a), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        C1505q qVar = this.f2558b;
        qVar.mo13277b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        m2323a(C1349d.m2453a(appLovinAdSize, AppLovinAdType.REGULAR, str, this.f2557a), appLovinAdLoadListener);
    }

    /* JADX WARNING: type inference failed for: r11v22, types: [com.applovin.impl.sdk.d.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadNextAdForAdToken(java.lang.String r11, com.applovin.sdk.AppLovinAdLoadListener r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0007
            java.lang.String r11 = r11.trim()
            goto L_0x0008
        L_0x0007:
            r11 = 0
        L_0x0008:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = -8
            java.lang.String r2 = "AppLovinAdService"
            if (r0 == 0) goto L_0x001a
            java.lang.String r11 = "Invalid ad token specified"
            com.applovin.impl.sdk.C1505q.m3345i(r2, r11)
            r10.m2318a((int) r1, (com.applovin.sdk.AppLovinAdLoadListener) r12)
            return
        L_0x001a:
            com.applovin.impl.sdk.ad.c r0 = new com.applovin.impl.sdk.ad.c
            com.applovin.impl.sdk.j r3 = r10.f2557a
            r0.<init>(r11, r3)
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo12705b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p024ad.C1347c.C1348a.REGULAR
            if (r11 != r3) goto L_0x004b
            com.applovin.impl.sdk.q r11 = r10.f2558b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Loading next ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r11.mo13277b(r2, r1)
            com.applovin.impl.sdk.d.o r11 = new com.applovin.impl.sdk.d.o
            com.applovin.impl.sdk.j r1 = r10.f2557a
            r11.<init>(r0, r12, r1)
        L_0x0046:
            r10.m2325a((com.applovin.impl.sdk.p027d.C1392a) r11, (com.applovin.sdk.AppLovinAdLoadListener) r12)
            goto L_0x00f7
        L_0x004b:
            com.applovin.impl.sdk.ad.c$a r11 = r0.mo12705b()
            com.applovin.impl.sdk.ad.c$a r3 = com.applovin.impl.sdk.p024ad.C1347c.C1348a.AD_RESPONSE_JSON
            if (r11 != r3) goto L_0x00e0
            org.json.JSONObject r5 = r0.mo12707d()
            if (r5 == 0) goto L_0x00c9
            com.applovin.impl.sdk.j r11 = r10.f2557a
            com.applovin.impl.sdk.utils.C1520h.m3456g(r5, r11)
            com.applovin.impl.sdk.j r11 = r10.f2557a
            com.applovin.impl.sdk.utils.C1520h.m3450d(r5, r11)
            com.applovin.impl.sdk.j r11 = r10.f2557a
            com.applovin.impl.sdk.utils.C1520h.m3449c(r5, r11)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            com.applovin.impl.sdk.j r1 = r10.f2557a
            java.lang.String r3 = "ads"
            org.json.JSONArray r11 = com.applovin.impl.sdk.utils.C1521i.m3491b((org.json.JSONObject) r5, (java.lang.String) r3, (org.json.JSONArray) r11, (com.applovin.impl.sdk.C1469j) r1)
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x00ad
            com.applovin.impl.sdk.q r11 = r10.f2558b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Rendering ad for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo13277b(r2, r0)
            com.applovin.impl.sdk.j r11 = r10.f2557a
            com.applovin.impl.sdk.ad.d r6 = com.applovin.impl.sdk.utils.C1557r.m3584a((org.json.JSONObject) r5, (com.applovin.impl.sdk.C1469j) r11)
            com.applovin.impl.sdk.ad.f$a r8 = new com.applovin.impl.sdk.ad.f$a
            com.applovin.impl.sdk.j r11 = r10.f2557a
            r8.<init>(r6, r12, r11)
            r11 = 1
            r8.mo12738a(r11)
            com.applovin.impl.sdk.d.t r11 = new com.applovin.impl.sdk.d.t
            com.applovin.impl.sdk.ad.b r7 = com.applovin.impl.sdk.p024ad.C1346b.DECODED_AD_TOKEN_JSON
            com.applovin.impl.sdk.j r9 = r10.f2557a
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x00ad:
            com.applovin.impl.sdk.q r11 = r10.f2558b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No ad returned from the server for token: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.mo13281e(r2, r0)
            r11 = 204(0xcc, float:2.86E-43)
            r12.failedToReceiveAd(r11)
            goto L_0x00f7
        L_0x00c9:
            com.applovin.impl.sdk.q r11 = r10.f2558b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to retrieve ad response JSON from token: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r11.mo13281e(r2, r0)
            goto L_0x00f4
        L_0x00e0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "Invalid ad token specified: "
            r11.append(r3)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.applovin.impl.sdk.C1505q.m3345i(r2, r11)
        L_0x00f4:
            r12.failedToReceiveAd(r1)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinAdServiceImpl.loadNextAdForAdToken(java.lang.String, com.applovin.sdk.AppLovinAdLoadListener):void");
    }

    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            C1505q qVar = this.f2558b;
            qVar.mo13277b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            m2323a(C1349d.m2454a(str, this.f2557a), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> a = C1517e.m3425a(list);
        if (a == null || a.isEmpty()) {
            C1505q.m3345i("AppLovinAdService", "No zones were provided");
            m2318a(-7, appLovinAdLoadListener);
            return;
        }
        C1505q qVar = this.f2558b;
        qVar.mo13277b("AppLovinAdService", "Loading next ad for zones: " + a);
        m2325a((C1392a) new C1423l(a, appLovinAdLoadListener, this.f2557a), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        C1505q qVar = this.f2558b;
        qVar.mo13277b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        m2323a(C1349d.m2459b(str, this.f2557a), appLovinAdLoadListener);
    }

    public void preloadAd(AppLovinAdSize appLovinAdSize) {
        this.f2557a.mo13091a();
        this.f2557a.mo13079S().mo12878i(C1349d.m2452a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2557a));
    }

    public void preloadAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            C1505q.m3345i("AppLovinAdService", "Unable to preload ad for invalid zone identifier");
            return;
        }
        C1349d a = C1349d.m2454a(str, this.f2557a);
        this.f2557a.mo13079S().mo12877h(a);
        this.f2557a.mo13079S().mo12878i(a);
    }

    public void preloadAds(C1349d dVar) {
        this.f2557a.mo13079S().mo12877h(dVar);
        int h = dVar.mo12721h();
        if (h == 0 && this.f2557a.mo13079S().mo12871b(dVar)) {
            h = 1;
        }
        this.f2557a.mo13079S().mo12870b(dVar, h);
    }

    public void removeAdUpdateListener(AppLovinAdUpdateListener appLovinAdUpdateListener, AppLovinAdSize appLovinAdSize) {
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f2560d + '}';
    }

    public void trackAndLaunchClick(C1355g gVar, AppLovinAdView appLovinAdView, AdViewControllerImpl adViewControllerImpl, Uri uri, PointF pointF) {
        if (gVar == null) {
            this.f2558b.mo13281e("AppLovinAdService", "Unable to track ad view click. No ad specified");
            return;
        }
        this.f2558b.mo13277b("AppLovinAdService", "Tracking click on an ad...");
        m2327a(gVar.mo12768a(pointF));
        m2319a(uri, gVar, appLovinAdView, adViewControllerImpl);
    }

    public void trackAndLaunchVideoClick(C1355g gVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (gVar == null) {
            this.f2558b.mo13281e("AppLovinAdService", "Unable to track video click. No ad specified");
            return;
        }
        this.f2558b.mo13277b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        m2327a(gVar.mo12812b(pointF));
        C1557r.m3608a(appLovinAdView.getContext(), uri, this.f2557a);
    }

    public void trackAppKilled(C1355g gVar) {
        if (gVar == null) {
            this.f2558b.mo13281e("AppLovinAdService", "Unable to track app killed. No ad specified");
            return;
        }
        this.f2558b.mo13277b("AppLovinAdService", "Tracking app killed during ad...");
        List<C1374a> ay = gVar.mo12811ay();
        if (ay == null || ay.isEmpty()) {
            C1505q qVar = this.f2558b;
            qVar.mo13280d("AppLovinAdService", "Unable to track app killed during AD #" + gVar.getAdIdNumber() + ". Missing app killed tracking URL.");
            return;
        }
        for (C1374a next : ay) {
            m2324a(new C1374a(next.mo12879a(), next.mo12880b()));
        }
    }

    public void trackFullScreenAdClosed(C1355g gVar, long j, long j2, boolean z, int i) {
        C1505q qVar = this.f2558b;
        if (gVar == null) {
            qVar.mo13281e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
            return;
        }
        qVar.mo13277b("AppLovinAdService", "Tracking ad closed...");
        List<C1374a> ax = gVar.mo12810ax();
        if (ax == null || ax.isEmpty()) {
            C1505q qVar2 = this.f2558b;
            qVar2.mo13280d("AppLovinAdService", "Unable to track ad closed for AD #" + gVar.getAdIdNumber() + ". Missing ad close tracking URL." + gVar.getAdIdNumber());
            return;
        }
        for (C1374a next : ax) {
            long j3 = j;
            long j4 = j2;
            boolean z2 = z;
            int i2 = i;
            String a = m2317a(next.mo12879a(), j3, j4, z2, i2);
            String a2 = m2317a(next.mo12880b(), j3, j4, z2, i2);
            if (C1553o.m3554b(a)) {
                m2324a(new C1374a(a, a2));
            } else {
                C1505q qVar3 = this.f2558b;
                qVar3.mo13281e("AppLovinAdService", "Failed to parse url: " + next.mo12879a());
            }
        }
    }

    public void trackImpression(C1355g gVar) {
        if (gVar == null) {
            this.f2558b.mo13281e("AppLovinAdService", "Unable to track impression click. No ad specified");
            return;
        }
        this.f2558b.mo13277b("AppLovinAdService", "Tracking impression on ad...");
        m2327a(gVar.mo11662az());
        this.f2557a.mo13082V().mo12729a(gVar);
    }

    public void trackVideoEnd(C1355g gVar, long j, int i, boolean z) {
        C1505q qVar = this.f2558b;
        if (gVar == null) {
            qVar.mo13281e("AppLovinAdService", "Unable to track video end. No ad specified");
            return;
        }
        qVar.mo13277b("AppLovinAdService", "Tracking video end on ad...");
        List<C1374a> aw = gVar.mo12809aw();
        if (aw == null || aw.isEmpty()) {
            C1505q qVar2 = this.f2558b;
            qVar2.mo13280d("AppLovinAdService", "Unable to submit persistent postback for AD #" + gVar.getAdIdNumber() + ". Missing video end tracking URL.");
            return;
        }
        String l = Long.toString(System.currentTimeMillis());
        for (C1374a next : aw) {
            if (C1553o.m3554b(next.mo12879a())) {
                long j2 = j;
                int i2 = i;
                String str = l;
                boolean z2 = z;
                String a = m2316a(next.mo12879a(), j2, i2, str, z2);
                String a2 = m2316a(next.mo12880b(), j2, i2, str, z2);
                if (a != null) {
                    m2324a(new C1374a(a, a2));
                } else {
                    C1505q qVar3 = this.f2558b;
                    qVar3.mo13281e("AppLovinAdService", "Failed to parse url: " + next.mo12879a());
                }
            } else {
                this.f2558b.mo13280d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
