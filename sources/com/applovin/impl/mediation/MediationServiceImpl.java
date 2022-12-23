package com.applovin.impl.mediation;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.C1259f;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.mediation.p020b.C1224b;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.mediation.p020b.C1228f;
import com.applovin.impl.mediation.p020b.C1230g;
import com.applovin.impl.mediation.p021c.C1236b;
import com.applovin.impl.mediation.p021c.C1241c;
import com.applovin.impl.mediation.p021c.C1243d;
import com.applovin.impl.mediation.p021c.C1250g;
import com.applovin.impl.mediation.p021c.C1251h;
import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxErrorCodes;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

public class MediationServiceImpl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f2158a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1505q f2159b;

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    private class C1166a implements C1252d, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b */
        private final C1223a f2178b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final MaxAdListener f2179c;

        private C1166a(C1223a aVar, MaxAdListener maxAdListener) {
            this.f2178b = aVar;
            this.f2179c = maxAdListener;
        }

        /* renamed from: a */
        public void mo12127a(MaxAd maxAd, C1258e eVar) {
            MediationServiceImpl.this.m1843b(this.f2178b, eVar, this.f2179c);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof C1225c)) {
                ((C1225c) maxAd).mo12333z();
            }
        }

        /* renamed from: a */
        public void mo12128a(String str, C1258e eVar) {
            this.f2178b.mo12295i();
            MediationServiceImpl.this.m1833a(this.f2178b, eVar, this.f2179c);
        }

        public void onAdClicked(MaxAd maxAd) {
            MediationServiceImpl.this.f2158a.mo13105ab().mo13044a((C1223a) maxAd, "DID_CLICKED");
            MediationServiceImpl.this.m1844c(this.f2178b);
            C1522j.m3521d(this.f2179c, maxAd);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            C1522j.m3525h(this.f2179c, maxAd);
        }

        public void onAdDisplayFailed(MaxAd maxAd, int i) {
            MediationServiceImpl.this.m1843b(this.f2178b, new C1258e(i), this.f2179c);
        }

        public void onAdDisplayed(MaxAd maxAd) {
            MediationServiceImpl.this.f2159b.mo13277b("MediationService", "Scheduling impression for ad via callback...");
            MediationServiceImpl.this.maybeScheduleCallbackAdImpressionPostback(this.f2178b);
            if (maxAd.getFormat() == MaxAdFormat.INTERSTITIAL || maxAd.getFormat() == MaxAdFormat.REWARDED) {
                MediationServiceImpl.this.f2158a.mo13085Y().mo13266a((Object) maxAd);
            }
            C1522j.m3515b(this.f2179c, maxAd);
        }

        public void onAdExpanded(MaxAd maxAd) {
            C1522j.m3524g(this.f2179c, maxAd);
        }

        public void onAdHidden(final MaxAd maxAd) {
            MediationServiceImpl.this.f2158a.mo13105ab().mo13044a((C1223a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (maxAd.getFormat() == MaxAdFormat.INTERSTITIAL || maxAd.getFormat() == MaxAdFormat.REWARDED) {
                        MediationServiceImpl.this.f2158a.mo13085Y().mo13269b((Object) maxAd);
                    }
                    C1522j.m3519c(C1166a.this.f2179c, maxAd);
                }
            }, maxAd instanceof C1225c ? ((C1225c) maxAd).mo12329v() : 0);
        }

        public void onAdLoadFailed(String str, int i) {
            this.f2178b.mo12295i();
            MediationServiceImpl.this.m1833a(this.f2178b, new C1258e(i), this.f2179c);
        }

        public void onAdLoaded(MaxAd maxAd) {
            this.f2178b.mo12295i();
            MediationServiceImpl.this.m1842b(this.f2178b);
            C1522j.m3500a(this.f2179c, maxAd);
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C1522j.m3523f(this.f2179c, maxAd);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C1522j.m3522e(this.f2179c, maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C1522j.m3502a(this.f2179c, maxAd, maxReward);
            MediationServiceImpl.this.f2158a.mo13071K().mo13014a((C1392a) new C1250g((C1225c) maxAd, MediationServiceImpl.this.f2158a), C1435s.C1437a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(C1469j jVar) {
        this.f2158a = jVar;
        this.f2159b = jVar.mo13139v();
    }

    /* renamed from: a */
    private void m1832a(C1223a aVar) {
        C1505q qVar = this.f2159b;
        qVar.mo13277b("MediationService", "Firing ad preload postback for " + aVar.mo12337I());
        m1835a("mpreload", (C1227e) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1833a(C1223a aVar, C1258e eVar, MaxAdListener maxAdListener) {
        m1834a(eVar, aVar);
        destroyAd(aVar);
        C1522j.m3503a(maxAdListener, aVar.getAdUnitId(), eVar.getErrorCode());
    }

    /* renamed from: a */
    private void m1834a(C1258e eVar, C1223a aVar) {
        long f = aVar.mo12289f();
        C1505q qVar = this.f2159b;
        qVar.mo13277b("MediationService", "Firing ad load failure postback with load time: " + f);
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(f));
        m1838a("mlerr", (Map<String, String>) hashMap, eVar, (C1227e) aVar);
    }

    /* renamed from: a */
    private void m1835a(String str, C1227e eVar) {
        m1838a(str, (Map<String, String>) Collections.EMPTY_MAP, (C1258e) null, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1836a(String str, C1230g gVar) {
        m1838a("serr", (Map<String, String>) Collections.EMPTY_MAP, new C1258e(str), (C1227e) gVar);
    }

    /* renamed from: a */
    private void m1837a(String str, Map<String, String> map, C1227e eVar) {
        m1838a(str, map, (C1258e) null, eVar);
    }

    /* renamed from: a */
    private void m1838a(String str, Map<String, String> map, C1258e eVar, C1227e eVar2) {
        HashMap hashMap = new HashMap(map);
        String str2 = "";
        hashMap.put("{PLACEMENT}", eVar2.mo12344P() != null ? eVar2.mo12344P() : str2);
        if (eVar2 instanceof C1225c) {
            C1225c cVar = (C1225c) eVar2;
            if (cVar.mo12322o() != null) {
                str2 = cVar.mo12322o();
            }
            hashMap.put("{PUBLISHER_AD_UNIT_ID}", str2);
        }
        this.f2158a.mo13071K().mo13014a((C1392a) new C1243d(str, hashMap, eVar, eVar2, this.f2158a), C1435s.C1437a.MEDIATION_POSTBACKS);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1842b(C1223a aVar) {
        long f = aVar.mo12289f();
        C1505q qVar = this.f2159b;
        qVar.mo13277b("MediationService", "Firing ad load success postback with load time: " + f);
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(f));
        m1837a("load", (Map<String, String>) hashMap, (C1227e) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1843b(C1223a aVar, C1258e eVar, MaxAdListener maxAdListener) {
        this.f2158a.mo13105ab().mo13044a(aVar, "DID_FAIL_DISPLAY");
        maybeScheduleAdDisplayErrorPostback(eVar, aVar);
        if (aVar.mo12296j().compareAndSet(false, true)) {
            C1522j.m3501a(maxAdListener, (MaxAd) aVar, eVar.getErrorCode());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1844c(C1223a aVar) {
        m1835a("mclick", (C1227e) aVar);
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final C1230g gVar, Activity activity, final C1228f.C1229a aVar) {
        String str;
        C1505q qVar;
        String str2;
        StringBuilder sb;
        if (gVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else if (aVar != null) {
            final C1264i a = this.f2158a.mo13140w().mo12414a((C1227e) gVar);
            if (a != null) {
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m1827a(gVar, maxAdFormat, activity.getApplicationContext());
                a.mo12419a((MaxAdapterInitializationParameters) a2, activity);
                C11654 r1 = new MaxSignalCollectionListener() {
                    public void onSignalCollected(String str) {
                        aVar.mo12371a(C1228f.m2121a(gVar, a, str));
                    }

                    public void onSignalCollectionFailed(String str) {
                        MediationServiceImpl.this.m1836a(str, gVar);
                        aVar.mo12371a(C1228f.m2123b(gVar, a, str));
                    }
                };
                if (!gVar.mo12285b()) {
                    qVar = this.f2159b;
                    sb = new StringBuilder();
                    str2 = "Collecting signal for adapter: ";
                } else if (this.f2158a.mo13141x().mo12411a((C1227e) gVar)) {
                    qVar = this.f2159b;
                    sb = new StringBuilder();
                    str2 = "Collecting signal for now-initialized adapter: ";
                } else {
                    C1505q qVar2 = this.f2159b;
                    qVar2.mo13281e("MediationService", "Skip collecting signal for not-initialized adapter: " + a.mo12423b());
                    str = "Adapter not initialized yet";
                }
                sb.append(str2);
                sb.append(a.mo12423b());
                qVar.mo13277b("MediationService", sb.toString());
                a.mo12420a(a2, gVar, activity, r1);
                return;
            }
            str = "Could not load adapter";
            aVar.mo12371a(C1228f.m2122a(gVar, str));
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof C1223a) {
            C1505q qVar = this.f2159b;
            qVar.mo13279c("MediationService", "Destroying " + maxAd);
            C1223a aVar = (C1223a) maxAd;
            C1264i c = aVar.mo12286c();
            if (c != null) {
                c.mo12428g();
                aVar.mo12297k();
            }
        }
    }

    public void loadAd(String str, MaxAdFormat maxAdFormat, C1259f fVar, boolean z, Activity activity, MaxAdListener maxAdListener) {
        final MaxAdListener maxAdListener2 = maxAdListener;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else if (maxAdListener2 != null) {
            if (!this.f2158a.mo13120d()) {
                C1505q.m3344h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            this.f2158a.mo13091a();
            MaxAdFormat maxAdFormat2 = maxAdFormat;
            final C1225c a = this.f2158a.mo13063B().mo12486a(maxAdFormat);
            if (a != null) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        maxAdListener2.onAdLoaded(a);
                    }
                }, a.mo12320m());
            }
            final C1259f fVar2 = fVar;
            final String str2 = str;
            final MaxAdFormat maxAdFormat3 = maxAdFormat;
            final Activity activity2 = activity;
            final MaxAdListener maxAdListener3 = maxAdListener;
            this.f2158a.mo13071K().mo13014a((C1392a) new C1236b(maxAdFormat, z, activity, this.f2158a, new C1236b.C1240a() {
                /* renamed from: a */
                public void mo12123a(JSONArray jSONArray) {
                    C1259f fVar = fVar2;
                    if (fVar == null) {
                        fVar = new C1259f.C1261a().mo12406a();
                    }
                    MediationServiceImpl.this.f2158a.mo13071K().mo13013a((C1392a) new C1241c(str2, maxAdFormat3, fVar, jSONArray, activity2, MediationServiceImpl.this.f2158a, maxAdListener3));
                }
            }), C1255c.m2220a(maxAdFormat));
        } else {
            throw new IllegalArgumentException("No listener specified");
        }
    }

    public void loadThirdPartyMediatedAd(String str, C1223a aVar, Activity activity, MaxAdListener maxAdListener) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (activity != null) {
            C1505q qVar = this.f2159b;
            qVar.mo13277b("MediationService", "Loading " + aVar + "...");
            this.f2158a.mo13105ab().mo13044a(aVar, "WILL_LOAD");
            m1832a(aVar);
            C1264i a = this.f2158a.mo13140w().mo12414a((C1227e) aVar);
            if (a != null) {
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m1825a(aVar, activity.getApplicationContext());
                a.mo12419a((MaxAdapterInitializationParameters) a2, activity);
                C1223a a3 = aVar.mo12283a(a);
                a.mo12421a(str, a3);
                a3.mo12290g();
                a.mo12422a(str, a2, a3, activity, new C1166a(a3, maxAdListener));
                return;
            }
            C1505q qVar2 = this.f2159b;
            qVar2.mo13280d("MediationService", "Failed to load " + aVar + ": adapter not loaded");
            m1833a(aVar, new C1258e((int) MaxErrorCodes.MEDIATION_ADAPTER_LOAD_FAILED), maxAdListener);
        } else {
            throw new IllegalArgumentException("A valid Activity is required");
        }
    }

    public void maybeScheduleAdDisplayErrorPostback(C1258e eVar, C1223a aVar) {
        m1838a("mierr", (Map<String, String>) Collections.EMPTY_MAP, eVar, (C1227e) aVar);
    }

    public void maybeScheduleAdapterInitializationPostback(C1227e eVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        m1838a("minit", (Map<String, String>) hashMap, new C1258e(str), eVar);
    }

    public void maybeScheduleCallbackAdImpressionPostback(C1223a aVar) {
        m1835a("mcimp", (C1227e) aVar);
    }

    public void maybeScheduleRawAdImpressionPostback(C1223a aVar) {
        this.f2158a.mo13105ab().mo13044a(aVar, "WILL_DISPLAY");
        HashMap hashMap = new HashMap(1);
        if (aVar instanceof C1225c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((C1225c) aVar).mo12327t()));
        }
        m1837a("mimp", (Map<String, String>) hashMap, (C1227e) aVar);
    }

    public void maybeScheduleViewabilityAdImpressionPostback(C1224b bVar, long j) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(bVar.mo12307t()));
        m1837a("mvimp", (Map<String, String>) hashMap, (C1227e) bVar);
    }

    public void showFullscreenAd(MaxAd maxAd, String str, final Activity activity) {
        if (maxAd == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else if (maxAd instanceof C1225c) {
            this.f2158a.mo13085Y().mo13267a(true);
            final C1225c cVar = (C1225c) maxAd;
            final C1264i c = cVar.mo12286c();
            if (c != null) {
                cVar.mo12364d(str);
                long u = cVar.mo12328u();
                C1505q qVar = this.f2159b;
                qVar.mo13279c("MediationService", "Showing ad " + maxAd.getAdUnitId() + " with delay of " + u + "ms...");
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        if (cVar.getFormat() == MaxAdFormat.REWARDED) {
                            MediationServiceImpl.this.f2158a.mo13071K().mo13014a((C1392a) new C1251h(cVar, MediationServiceImpl.this.f2158a), C1435s.C1437a.MEDIATION_REWARD);
                        }
                        c.mo12418a((C1223a) cVar, activity);
                        MediationServiceImpl.this.f2158a.mo13085Y().mo13267a(false);
                        MediationServiceImpl.this.f2159b.mo13277b("MediationService", "Scheduling impression for ad manually...");
                        MediationServiceImpl.this.maybeScheduleRawAdImpressionPostback(cVar);
                    }
                }, u);
                return;
            }
            this.f2158a.mo13085Y().mo13267a(false);
            C1505q qVar2 = this.f2159b;
            qVar2.mo13280d("MediationService", "Failed to show " + maxAd + ": adapter not found");
            C1505q.m3345i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
            throw new IllegalStateException("Could not find adapter for provided ad");
        } else {
            C1505q.m3345i("MediationService", "Unable to show ad for '" + maxAd.getAdUnitId() + "': only REWARDED or INTERSTITIAL ads are eligible for showFullscreenAd(). " + maxAd.getFormat() + " ad was provided.");
            throw new IllegalArgumentException("Provided ad is not a MediatedFullscreenAd");
        }
    }
}
