package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.mediation.p020b.C1230g;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
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
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.i */
public class C1264i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f2448a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1469j f2449b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1505q f2450c;

    /* renamed from: d */
    private final String f2451d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1227e f2452e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f2453f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MaxAdapter f2454g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f2455h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1223a f2456i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f2457j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1280a f2458k = new C1280a();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MaxAdapterResponseParameters f2459l;

    /* renamed from: m */
    private final AtomicBoolean f2460m = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final AtomicBoolean f2461n = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f2462o = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.i$a */
    private class C1280a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxRewardedAdapterListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1252d f2504b;

        private C1280a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2278a(C1252d dVar) {
            if (dVar != null) {
                this.f2504b = dVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* renamed from: a */
        private void m2281a(String str) {
            C1264i.this.f2462o.set(true);
            m2283a(str, (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1264i.this.f2461n.compareAndSet(false, true)) {
                        C1280a.this.f2504b.onAdLoaded(C1264i.this.f2456i);
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2282a(String str, int i) {
            m2284a(str, new MaxAdapterError(i));
        }

        /* renamed from: a */
        private void m2283a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            C1264i.this.f2448a.post(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        MaxAdListener maxAdListener = maxAdListener;
                        String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                        C1505q e2 = C1264i.this.f2450c;
                        e2.mo13278b("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e);
                    }
                }
            });
        }

        /* renamed from: a */
        private void m2284a(String str, final MaxAdapterError maxAdapterError) {
            m2283a(str, (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1264i.this.f2461n.compareAndSet(false, true)) {
                        C1280a.this.f2504b.mo12128a(C1264i.this.f2455h, (C1258e) maxAdapterError);
                    }
                }
            });
        }

        /* renamed from: b */
        private void m2286b(String str) {
            if (C1264i.this.f2456i.mo12296j().compareAndSet(false, true)) {
                m2283a(str, (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                    public void run() {
                        C1280a.this.f2504b.onAdDisplayed(C1264i.this.f2456i);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m2287b(String str, int i) {
            m2288b(str, new MaxAdapterError(i));
        }

        /* renamed from: b */
        private void m2288b(String str, final MaxAdapterError maxAdapterError) {
            m2283a(str, (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.mo12127a((MaxAd) C1264i.this.f2456i, (C1258e) maxAdapterError);
                }
            });
        }

        public void onAdViewAdClicked() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad clicked");
            m2283a("onAdViewAdClicked", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.onAdClicked(C1264i.this.f2456i);
                }
            });
        }

        public void onAdViewAdCollapsed() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad collapsed");
            m2283a("onAdViewAdCollapsed", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1280a.this.f2504b instanceof MaxAdViewAdListener) {
                        ((MaxAdViewAdListener) C1280a.this.f2504b).onAdCollapsed(C1264i.this.f2456i);
                    }
                }
            });
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C1505q e = C1264i.this.f2450c;
            e.mo13280d("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad failed to display with code: " + maxAdapterError);
            m2288b("onAdViewAdDisplayFailed", maxAdapterError);
        }

        public void onAdViewAdDisplayed() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad displayed");
            m2286b("onAdViewAdDisplayed");
        }

        public void onAdViewAdExpanded() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad expanded");
            m2283a("onAdViewAdExpanded", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1280a.this.f2504b instanceof MaxAdViewAdListener) {
                        ((MaxAdViewAdListener) C1280a.this.f2504b).onAdExpanded(C1264i.this.f2456i);
                    }
                }
            });
        }

        public void onAdViewAdHidden() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad hidden");
            m2283a("onAdViewAdHidden", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.onAdHidden(C1264i.this.f2456i);
                }
            });
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1505q e = C1264i.this.f2450c;
            e.mo13280d("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad ad failed to load with code: " + maxAdapterError);
            m2284a("onAdViewAdLoadFailed", maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": adview ad loaded");
            View unused = C1264i.this.f2457j = view;
            m2281a("onAdViewAdLoaded");
        }

        public void onInterstitialAdClicked() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": interstitial ad clicked");
            m2283a("onInterstitialAdClicked", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.onAdClicked(C1264i.this.f2456i);
                }
            });
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C1505q e = C1264i.this.f2450c;
            e.mo13280d("MediationAdapterWrapper", C1264i.this.f2453f + ": interstitial ad failed to display with code " + maxAdapterError);
            m2288b("onInterstitialAdDisplayFailed", maxAdapterError);
        }

        public void onInterstitialAdDisplayed() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": interstitial ad displayed");
            m2286b("onInterstitialAdDisplayed");
        }

        public void onInterstitialAdHidden() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": interstitial ad hidden");
            m2283a("onInterstitialAdHidden", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.onAdHidden(C1264i.this.f2456i);
                }
            });
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1505q e = C1264i.this.f2450c;
            e.mo13280d("MediationAdapterWrapper", C1264i.this.f2453f + ": interstitial ad failed to load with error " + maxAdapterError);
            m2284a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": interstitial ad loaded");
            m2281a("onInterstitialAdLoaded");
        }

        public void onRewardedAdClicked() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded ad clicked");
            m2283a("onRewardedAdClicked", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.onAdClicked(C1264i.this.f2456i);
                }
            });
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C1505q e = C1264i.this.f2450c;
            e.mo13280d("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded ad display failed with error: " + maxAdapterError);
            m2288b("onRewardedAdDisplayFailed", maxAdapterError);
        }

        public void onRewardedAdDisplayed() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded ad displayed");
            m2286b("onRewardedAdDisplayed");
        }

        public void onRewardedAdHidden() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded ad hidden");
            m2283a("onRewardedAdHidden", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    C1280a.this.f2504b.onAdHidden(C1264i.this.f2456i);
                }
            });
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1505q e = C1264i.this.f2450c;
            e.mo13280d("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded ad failed to load with code: " + maxAdapterError);
            m2284a("onRewardedAdLoadFailed", maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded ad loaded");
            m2281a("onRewardedAdLoaded");
        }

        public void onRewardedAdVideoCompleted() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded video completed");
            m2283a("onRewardedAdVideoCompleted", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1280a.this.f2504b instanceof MaxRewardedAdListener) {
                        ((MaxRewardedAdListener) C1280a.this.f2504b).onRewardedVideoCompleted(C1264i.this.f2456i);
                    }
                }
            });
        }

        public void onRewardedAdVideoStarted() {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": rewarded video started");
            m2283a("onRewardedAdVideoStarted", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1280a.this.f2504b instanceof MaxRewardedAdListener) {
                        ((MaxRewardedAdListener) C1280a.this.f2504b).onRewardedVideoStarted(C1264i.this.f2456i);
                    }
                }
            });
        }

        public void onUserRewarded(final MaxReward maxReward) {
            C1505q e = C1264i.this.f2450c;
            e.mo13279c("MediationAdapterWrapper", C1264i.this.f2453f + ": user was rewarded: " + maxReward);
            m2283a("onUserRewarded", (MaxAdListener) this.f2504b, (Runnable) new Runnable() {
                public void run() {
                    if (C1280a.this.f2504b instanceof MaxRewardedAdListener) {
                        ((MaxRewardedAdListener) C1280a.this.f2504b).onUserRewarded(C1264i.this.f2456i, maxReward);
                    }
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.mediation.i$b */
    private static class C1297b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1230g f2527a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final MaxSignalCollectionListener f2528b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicBoolean f2529c = new AtomicBoolean();

        C1297b(C1230g gVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f2527a = gVar;
            this.f2528b = maxSignalCollectionListener;
        }
    }

    /* renamed from: com.applovin.impl.mediation.i$c */
    private class C1298c extends C1392a {
        private C1298c() {
            super("TaskTimeoutMediatedAd", C1264i.this.f2449b);
        }

        public void run() {
            if (!C1264i.this.f2461n.get()) {
                mo12949d(C1264i.this.f2453f + " is timing out " + C1264i.this.f2456i + "...");
                this.f3279b.mo13062A().mo12494a(C1264i.this.f2456i);
                C1264i.this.f2458k.m2282a(mo12950e(), -5101);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.i$d */
    private class C1299d extends C1392a {

        /* renamed from: c */
        private final C1297b f2532c;

        private C1299d(C1297b bVar) {
            super("TaskTimeoutSignalCollection", C1264i.this.f2449b);
            this.f2532c = bVar;
        }

        public void run() {
            if (!this.f2532c.f2529c.get()) {
                mo12949d(C1264i.this.f2453f + " is timing out " + this.f2532c.f2527a + "...");
                C1264i iVar = C1264i.this;
                iVar.m2254b("The adapter (" + C1264i.this.f2453f + ") timed out", this.f2532c);
            }
        }
    }

    C1264i(C1227e eVar, MaxAdapter maxAdapter, C1469j jVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        } else if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        } else if (jVar != null) {
            this.f2451d = eVar.mo12337I();
            this.f2454g = maxAdapter;
            this.f2449b = jVar;
            this.f2450c = jVar.mo13139v();
            this.f2452e = eVar;
            this.f2453f = maxAdapter.getClass().getSimpleName();
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2249a(String str) {
        C1505q qVar = this.f2450c;
        qVar.mo13279c("MediationAdapterWrapper", "Marking " + this.f2453f + " as disabled due to: " + str);
        this.f2460m.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2250a(String str, C1297b bVar) {
        if (bVar.f2529c.compareAndSet(false, true) && bVar.f2528b != null) {
            bVar.f2528b.onSignalCollected(str);
        }
    }

    /* renamed from: a */
    private void m2251a(final String str, final Runnable runnable) {
        C12733 r0 = new Runnable() {
            public void run() {
                try {
                    C1505q e = C1264i.this.f2450c;
                    e.mo13277b("MediationAdapterWrapper", C1264i.this.f2453f + ": running " + str + "...");
                    runnable.run();
                    C1505q e2 = C1264i.this.f2450c;
                    e2.mo13277b("MediationAdapterWrapper", C1264i.this.f2453f + ": finished " + str + "");
                } catch (Throwable th) {
                    C1505q e3 = C1264i.this.f2450c;
                    e3.mo13278b("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + C1264i.this.f2453f + " as disabled", th);
                    C1264i iVar = C1264i.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fail_");
                    sb.append(str);
                    iVar.m2249a(sb.toString());
                }
            }
        };
        if (this.f2452e.mo12340L()) {
            this.f2448a.post(r0);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2254b(String str, C1297b bVar) {
        if (bVar.f2529c.compareAndSet(false, true) && bVar.f2528b != null) {
            bVar.f2528b.onSignalCollectionFailed(str);
        }
    }

    /* renamed from: a */
    public View mo12417a() {
        return this.f2457j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12418a(final C1223a aVar, final Activity activity) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (aVar.mo12286c() == null) {
            this.f2458k.m2287b("ad_show", -5201);
        } else if (aVar.mo12286c() != this) {
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else if (!this.f2460m.get()) {
            C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is disabled. Showing ads with this adapter is disabled.");
            this.f2458k.m2287b("ad_show", -5103);
        } else if (mo12425d()) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                if (this.f2454g instanceof MaxInterstitialAdapter) {
                    runnable = new Runnable() {
                        public void run() {
                            ((MaxInterstitialAdapter) C1264i.this.f2454g).showInterstitialAd(C1264i.this.f2459l, activity, C1264i.this.f2458k);
                        }
                    };
                } else {
                    C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is not an interstitial adapter.");
                    this.f2458k.m2287b("showFullscreenAd", -5104);
                    return;
                }
            } else if (aVar.getFormat() != MaxAdFormat.REWARDED) {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            } else if (this.f2454g instanceof MaxRewardedAdapter) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C1264i.this.f2454g).showRewardedAd(C1264i.this.f2459l, activity, C1264i.this.f2458k);
                    }
                };
            } else {
                C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is not an incentivized adapter.");
                this.f2458k.m2287b("showFullscreenAd", -5104);
                return;
            }
            m2251a("ad_render", (Runnable) new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        C1505q e = C1264i.this.f2450c;
                        e.mo13278b("MediationAdapterWrapper", "Failed to start displaying ad" + aVar, th);
                        C1264i.this.f2458k.m2287b("ad_render", (int) MaxAdapterError.ERROR_CODE_UNSPECIFIED);
                    }
                }
            });
        } else {
            throw new IllegalStateException("Mediation adapter '" + this.f2453f + "' does not have an ad loaded. Please load an ad first");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12419a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity) {
        m2251a("initialize", (Runnable) new Runnable() {
            public void run() {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                C1264i.this.f2454g.initialize(maxAdapterInitializationParameters, activity, new MaxAdapter.OnCompletionListener() {
                    public void onCompletion() {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                            public void run() {
                                C1264i.this.f2449b.mo13141x().mo12408a(C1264i.this.f2452e, SystemClock.elapsedRealtime() - elapsedRealtime, MaxAdapter.InitializationStatus.ADAPTER_NOT_SUPPORTED, (String) null);
                            }
                        }, C1264i.this.f2452e.mo12343O());
                    }

                    public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                            public void run() {
                                C1264i.this.f2449b.mo13141x().mo12408a(C1264i.this.f2452e, SystemClock.elapsedRealtime() - elapsedRealtime, initializationStatus, str);
                            }
                        }, C1264i.this.f2452e.mo12343O());
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12420a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, C1230g gVar, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (!this.f2460m.get()) {
            C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is disabled. Signal collection ads with this adapter is disabled.");
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f2453f + ") is disabled");
        } else {
            final C1297b bVar = new C1297b(gVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f2454g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters2 = maxAdapterSignalCollectionParameters;
                final Activity activity2 = activity;
                final C1230g gVar2 = gVar;
                m2251a("collect_signal", (Runnable) new Runnable() {
                    public void run() {
                        StringBuilder sb;
                        maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters2, activity2, new MaxSignalCollectionListener() {
                            public void onSignalCollected(String str) {
                                C1264i.this.m2250a(str, bVar);
                            }

                            public void onSignalCollectionFailed(String str) {
                                C1264i.this.m2254b(str, bVar);
                            }
                        });
                        if (bVar.f2529c.get()) {
                            return;
                        }
                        if (gVar2.mo12342N() == 0) {
                            C1505q e = C1264i.this.f2450c;
                            e.mo13277b("MediationAdapterWrapper", "Failing signal collection " + gVar2 + " since it has 0 timeout");
                            C1264i iVar = C1264i.this;
                            iVar.m2254b("The adapter (" + C1264i.this.f2453f + ") has 0 timeout", bVar);
                            return;
                        }
                        int i = (gVar2.mo12342N() > 0 ? 1 : (gVar2.mo12342N() == 0 ? 0 : -1));
                        C1505q e2 = C1264i.this.f2450c;
                        if (i > 0) {
                            sb.append("Setting timeout ");
                            sb.append(gVar2.mo12342N());
                            sb.append("ms. for ");
                            sb.append(gVar2);
                            e2.mo13277b("MediationAdapterWrapper", sb.toString());
                            C1264i.this.f2449b.mo13071K().mo13015a(new C1299d(bVar), C1435s.C1437a.MEDIATION_TIMEOUT, gVar2.mo12342N());
                            return;
                        }
                        sb = new StringBuilder();
                        sb.append("Negative timeout set for ");
                        sb.append(gVar2);
                        sb.append(", not scheduling a timeout");
                        e2.mo13277b("MediationAdapterWrapper", sb.toString());
                    }
                });
                return;
            }
            m2254b("The adapter (" + this.f2453f + ") does not support signal collection", bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12421a(String str, C1223a aVar) {
        this.f2455h = str;
        this.f2456i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12422a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final C1223a aVar, final Activity activity, C1252d dVar) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (!this.f2460m.get()) {
            C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.");
            dVar.onAdLoadFailed(str, -5103);
        } else {
            this.f2459l = maxAdapterResponseParameters;
            this.f2458k.m2278a(dVar);
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                if (this.f2454g instanceof MaxInterstitialAdapter) {
                    runnable = new Runnable() {
                        public void run() {
                            ((MaxInterstitialAdapter) C1264i.this.f2454g).loadInterstitialAd(maxAdapterResponseParameters, activity, C1264i.this.f2458k);
                        }
                    };
                } else {
                    C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is not an interstitial adapter.");
                    this.f2458k.m2282a("loadAd", -5104);
                    return;
                }
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                if (this.f2454g instanceof MaxRewardedAdapter) {
                    runnable = new Runnable() {
                        public void run() {
                            ((MaxRewardedAdapter) C1264i.this.f2454g).loadRewardedAd(maxAdapterResponseParameters, activity, C1264i.this.f2458k);
                        }
                    };
                } else {
                    C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is not an incentivized adapter.");
                    this.f2458k.m2282a("loadAd", -5104);
                    return;
                }
            } else if (aVar.getFormat() != MaxAdFormat.BANNER && aVar.getFormat() != MaxAdFormat.LEADER && aVar.getFormat() != MaxAdFormat.MREC) {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            } else if (this.f2454g instanceof MaxAdViewAdapter) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAdViewAdapter) C1264i.this.f2454g).loadAdViewAd(maxAdapterResponseParameters, aVar.getFormat(), activity, C1264i.this.f2458k);
                    }
                };
            } else {
                C1505q.m3345i("MediationAdapterWrapper", "Mediation adapter '" + this.f2453f + "' is not an adview-based adapter.");
                this.f2458k.m2282a("loadAd", -5104);
                return;
            }
            m2251a("ad_load", (Runnable) new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        C1505q e = C1264i.this.f2450c;
                        e.mo13278b("MediationAdapterWrapper", "Failed start loading " + aVar, th);
                        C1264i.this.f2458k.m2282a("loadAd", -1);
                    }
                    if (!C1264i.this.f2461n.get()) {
                        long N = C1264i.this.f2452e.mo12342N();
                        if (N > 0) {
                            C1505q e2 = C1264i.this.f2450c;
                            e2.mo13277b("MediationAdapterWrapper", "Setting timeout " + N + "ms. for " + aVar);
                            C1264i.this.f2449b.mo13071K().mo13015a(new C1298c(), C1435s.C1437a.MEDIATION_TIMEOUT, N);
                            return;
                        }
                        C1505q e3 = C1264i.this.f2450c;
                        e3.mo13277b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public String mo12423b() {
        return this.f2451d;
    }

    /* renamed from: c */
    public boolean mo12424c() {
        return this.f2460m.get();
    }

    /* renamed from: d */
    public boolean mo12425d() {
        return this.f2461n.get() && this.f2462o.get();
    }

    /* renamed from: e */
    public String mo12426e() {
        MaxAdapter maxAdapter = this.f2454g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            C1505q qVar = this.f2450c;
            qVar.mo13278b("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
            m2249a("fail_version");
            return null;
        }
    }

    /* renamed from: f */
    public String mo12427f() {
        MaxAdapter maxAdapter = this.f2454g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            C1505q qVar = this.f2450c;
            qVar.mo13278b("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
            m2249a("fail_version");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo12428g() {
        m2251a("destroy", (Runnable) new Runnable() {
            public void run() {
                C1264i.this.m2249a("destroy");
                C1264i.this.f2454g.onDestroy();
                MaxAdapter unused = C1264i.this.f2454g = null;
            }
        });
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f2453f + "'" + '}';
    }
}
