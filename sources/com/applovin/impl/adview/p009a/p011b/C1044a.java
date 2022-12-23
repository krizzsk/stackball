package com.applovin.impl.adview.p009a.p011b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.adview.C1072c;
import com.applovin.impl.adview.C1101l;
import com.applovin.impl.adview.C1102m;
import com.applovin.impl.adview.p009a.C1040a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1452e;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p023a.C1333b;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1399ad;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.p027d.C1451z;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1554p;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.impl.sdk.utils.C1558s;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.a.b.a */
public abstract class C1044a implements C1333b.C1341a {

    /* renamed from: a */
    protected final C1355g f1831a;

    /* renamed from: b */
    protected final C1469j f1832b;

    /* renamed from: c */
    protected final C1505q f1833c;

    /* renamed from: d */
    protected final AppLovinFullscreenActivity f1834d;

    /* renamed from: e */
    protected final C1382d f1835e;

    /* renamed from: f */
    protected final AppLovinAdView f1836f;

    /* renamed from: g */
    protected final C1101l f1837g;

    /* renamed from: h */
    protected final long f1838h = SystemClock.elapsedRealtime();

    /* renamed from: i */
    protected long f1839i = -1;

    /* renamed from: j */
    protected int f1840j = C1452e.f3420a;

    /* renamed from: k */
    protected boolean f1841k;

    /* renamed from: l */
    protected final AppLovinAdClickListener f1842l;

    /* renamed from: m */
    protected final AppLovinAdDisplayListener f1843m;

    /* renamed from: n */
    protected final AppLovinAdVideoPlaybackListener f1844n;

    /* renamed from: o */
    protected final C1333b f1845o;

    /* renamed from: p */
    protected C1554p f1846p;

    /* renamed from: q */
    private final Handler f1847q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    private final C1512a f1848r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final AppLovinBroadcastManager.Receiver f1849s;

    /* renamed from: t */
    private final C1452e.C1454a f1850t;

    /* renamed from: u */
    private final AtomicBoolean f1851u = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final AtomicBoolean f1852v = new AtomicBoolean();

    /* renamed from: w */
    private long f1853w;

    /* renamed from: com.applovin.impl.adview.a.b.a$a */
    private class C1056a implements View.OnClickListener, AppLovinAdClickListener {
        private C1056a() {
        }

        public void adClicked(AppLovinAd appLovinAd) {
            C1044a.this.f1833c.mo13277b("InterActivityV2", "Clicking through graphic");
            C1522j.m3504a(C1044a.this.f1842l, appLovinAd);
            C1044a.this.f1835e.mo12900b();
        }

        public void onClick(View view) {
            if (view == C1044a.this.f1837g) {
                if (C1044a.this.f1831a.mo12789ac()) {
                    C1044a.this.mo11825b("javascript:al_onCloseButtonTapped();");
                }
                C1044a.this.mo11831f();
                return;
            }
            C1505q qVar = C1044a.this.f1833c;
            qVar.mo13281e("InterActivityV2", "Unhandled click on widget: " + view);
        }
    }

    C1044a(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, final C1469j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1831a = gVar;
        this.f1832b = jVar;
        this.f1833c = jVar.mo13139v();
        this.f1834d = appLovinFullscreenActivity;
        this.f1842l = appLovinAdClickListener;
        this.f1843m = appLovinAdDisplayListener;
        this.f1844n = appLovinAdVideoPlaybackListener;
        C1333b bVar = new C1333b(appLovinFullscreenActivity, jVar);
        this.f1845o = bVar;
        bVar.mo12628a((C1333b.C1341a) this);
        this.f1835e = new C1382d(gVar, jVar);
        C1056a aVar = new C1056a();
        C1102m mVar = new C1102m(jVar.mo13078R(), AppLovinAdSize.INTERSTITIAL, appLovinFullscreenActivity);
        this.f1836f = mVar;
        mVar.setAdClickListener(aVar);
        this.f1836f.setAdDisplayListener(new AppLovinAdDisplayListener() {
            public void adDisplayed(AppLovinAd appLovinAd) {
                C1044a.this.f1833c.mo13277b("InterActivityV2", "Web content rendered");
            }

            public void adHidden(AppLovinAd appLovinAd) {
                C1044a.this.f1833c.mo13277b("InterActivityV2", "Closing from WebView");
                C1044a.this.mo11831f();
            }
        });
        AdViewControllerImpl adViewControllerImpl = (AdViewControllerImpl) this.f1836f.getAdViewController();
        adViewControllerImpl.setStatsManagerHelper(this.f1835e);
        adViewControllerImpl.getAdWebView().setIsShownOutOfContext(gVar.mo12808av());
        jVar.mo13131o().trackImpression(gVar);
        if (gVar.mo12821r() >= 0) {
            C1101l lVar = new C1101l(gVar.mo12822s(), appLovinFullscreenActivity);
            this.f1837g = lVar;
            lVar.setVisibility(8);
            this.f1837g.setOnClickListener(aVar);
        } else {
            this.f1837g = null;
        }
        if (((Boolean) jVar.mo13088a(C1369c.f2983cU)).booleanValue()) {
            Intent intent = new Intent(appLovinFullscreenActivity.getApplicationContext(), AppKilledService.class);
            final C1469j jVar2 = jVar;
            final C1355g gVar2 = gVar;
            final AppLovinFullscreenActivity appLovinFullscreenActivity2 = appLovinFullscreenActivity;
            final Intent intent2 = intent;
            this.f1849s = new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    jVar2.mo13131o().trackAppKilled(gVar2);
                    appLovinFullscreenActivity2.stopService(intent2);
                    jVar2.mo13108ae().unregisterReceiver(this);
                }
            };
            jVar.mo13108ae().registerReceiver(this.f1849s, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
            appLovinFullscreenActivity.startService(intent);
        } else {
            this.f1849s = null;
        }
        if (gVar.mo12807au()) {
            this.f1850t = new C1452e.C1454a() {
                public void onRingerModeChanged(int i) {
                    String str;
                    if (C1044a.this.f1840j != C1452e.f3420a) {
                        C1044a.this.f1841k = true;
                    }
                    C1072c adWebView = ((AdViewControllerImpl) C1044a.this.f1836f.getAdViewController()).getAdWebView();
                    if (!C1452e.m2996a(i) || C1452e.m2996a(C1044a.this.f1840j)) {
                        if (i == 2) {
                            str = "javascript:al_muteSwitchOff();";
                        }
                        C1044a.this.f1840j = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    adWebView.mo11889a(str);
                    C1044a.this.f1840j = i;
                }
            };
            jVar.mo13107ad().mo13040a(this.f1850t);
        } else {
            this.f1850t = null;
        }
        if (((Boolean) jVar.mo13088a(C1369c.f3088eV)).booleanValue()) {
            this.f1848r = new C1512a() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!C1044a.this.f1852v.get()) {
                        if (activity.getClass().getName().equals(C1557r.m3626d(activity.getApplicationContext()))) {
                            jVar.mo13071K().mo13014a((C1392a) new C1399ad(jVar, new Runnable() {
                                public void run() {
                                    C1505q.m3345i("InterActivityV2", "Dismissing on-screen ad due to app relaunched via launcher.");
                                    C1044a.this.mo11831f();
                                }
                            }), C1435s.C1437a.MAIN);
                        }
                    }
                }
            };
            jVar.mo13086Z().mo12602a(this.f1848r);
            return;
        }
        this.f1848r = null;
    }

    /* renamed from: a */
    public void mo11815a(int i, KeyEvent keyEvent) {
        C1505q qVar = this.f1833c;
        qVar.mo13279c("InterActivityV2", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11816a(int i, boolean z, boolean z2, long j) {
        int i2 = i;
        if (this.f1851u.compareAndSet(false, true)) {
            if (this.f1831a.hasVideoUrl() || mo11836k()) {
                C1522j.m3510a(this.f1844n, this.f1831a, (double) i2, z2);
            }
            if (this.f1831a.hasVideoUrl()) {
                this.f1835e.mo12903c((long) i2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1838h;
            this.f1832b.mo13131o().trackVideoEnd(this.f1831a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long j2 = -1;
            if (this.f1839i != -1) {
                j2 = SystemClock.elapsedRealtime() - this.f1839i;
            }
            this.f1832b.mo13131o().trackFullScreenAdClosed(this.f1831a, j2, j, this.f1841k, this.f1840j);
            C1505q qVar = this.f1833c;
            qVar.mo13277b("InterActivityV2", "Video ad ended at percent: " + i2 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + j2 + "ms");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11817a(long j) {
        C1505q qVar = this.f1833c;
        qVar.mo13277b("InterActivityV2", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        this.f1846p = C1554p.m3559a(j, this.f1832b, new Runnable() {
            public void run() {
                if (!C1044a.this.f1831a.mo12802ap().getAndSet(true)) {
                    C1044a.this.f1832b.mo13071K().mo13014a((C1392a) new C1451z(C1044a.this.f1831a, C1044a.this.f1832b), C1435s.C1437a.REWARD);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo11818a(Configuration configuration) {
        C1505q qVar = this.f1833c;
        qVar.mo13279c("InterActivityV2", "onConfigurationChanged(Configuration) -  " + configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11819a(final C1101l lVar, long j, final Runnable runnable) {
        this.f1832b.mo13071K().mo13016a((C1392a) new C1399ad(this.f1832b, new Runnable() {
            public void run() {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        C1558s.m3634a((View) lVar, 400, (Runnable) new Runnable() {
                            public void run() {
                                runnable.run();
                            }
                        });
                    }
                });
            }
        }), C1435s.C1437a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11820a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f1847q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11821a(String str) {
        if (this.f1831a.mo12791ae()) {
            mo11822a(str, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11822a(final String str, long j) {
        if (j >= 0) {
            mo11820a((Runnable) new Runnable() {
                public void run() {
                    C1072c adWebView;
                    if (C1553o.m3554b(str) && (adWebView = ((AdViewControllerImpl) C1044a.this.f1836f.getAdViewController()).getAdWebView()) != null) {
                        adWebView.mo11889a(str);
                    }
                }
            }, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11823a(boolean z) {
        List<Uri> a = C1557r.m3598a(z, this.f1831a, this.f1832b, (Context) this.f1834d);
        if (a.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f1832b.mo13088a(C1369c.f3123fe)).booleanValue()) {
            this.f1831a.mo11655a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11824a(boolean z, long j) {
        if (this.f1831a.mo12788ab()) {
            mo11822a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11825b(String str) {
        mo11822a(str, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11826b(boolean z) {
        mo11824a(z, ((Long) this.f1832b.mo13088a(C1369c.f3053dm)).longValue());
        C1522j.m3505a(this.f1843m, (AppLovinAd) this.f1831a);
        this.f1832b.mo13085Y().mo13266a((Object) this.f1831a);
        if (this.f1831a.hasVideoUrl() || mo11836k()) {
            C1522j.m3509a(this.f1844n, (AppLovinAd) this.f1831a);
        }
        new C1040a(this.f1834d).mo11810a(this.f1831a);
        this.f1835e.mo12898a();
        this.f1831a.setHasShown(true);
    }

    /* renamed from: c */
    public abstract void mo11827c();

    /* renamed from: c */
    public void mo11828c(boolean z) {
        C1505q qVar = this.f1833c;
        qVar.mo13279c("InterActivityV2", "onWindowFocusChanged(boolean) - " + z);
        mo11821a("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* renamed from: d */
    public void mo11829d() {
        this.f1833c.mo13279c("InterActivityV2", "onResume()");
        this.f1835e.mo12905d(SystemClock.elapsedRealtime() - this.f1853w);
        mo11821a("javascript:al_onAppResumed();");
        mo11840o();
        if (this.f1845o.mo12631d()) {
            this.f1845o.mo12627a();
        }
    }

    /* renamed from: e */
    public void mo11830e() {
        this.f1833c.mo13279c("InterActivityV2", "onPause()");
        this.f1853w = SystemClock.elapsedRealtime();
        mo11821a("javascript:al_onAppPaused();");
        this.f1845o.mo12627a();
        mo11839n();
    }

    /* renamed from: f */
    public void mo11831f() {
        this.f1833c.mo13279c("InterActivityV2", "dismiss()");
        this.f1847q.removeCallbacksAndMessages((Object) null);
        mo11822a("javascript:al_onPoststitialDismiss();", (long) this.f1831a.mo12787aa());
        mo11838m();
        this.f1835e.mo12902c();
        if (this.f1849s != null) {
            C1554p.m3559a(TimeUnit.SECONDS.toMillis(2), this.f1832b, new Runnable() {
                public void run() {
                    C1044a.this.f1834d.stopService(new Intent(C1044a.this.f1834d.getApplicationContext(), AppKilledService.class));
                    C1044a.this.f1832b.mo13108ae().unregisterReceiver(C1044a.this.f1849s);
                }
            });
        }
        if (this.f1850t != null) {
            this.f1832b.mo13107ad().mo13041b(this.f1850t);
        }
        if (this.f1848r != null) {
            this.f1832b.mo13086Z().mo12604b(this.f1848r);
        }
        this.f1834d.finish();
    }

    /* renamed from: g */
    public void mo11832g() {
        this.f1833c.mo13279c("InterActivityV2", "onStop()");
    }

    /* renamed from: h */
    public void mo11833h() {
        AppLovinAdView appLovinAdView = this.f1836f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f1836f.destroy();
        }
        mo11837l();
        mo11838m();
    }

    /* renamed from: i */
    public void mo11834i() {
        C1505q.m3345i("InterActivityV2", "---low memory detected - running garbage collection---");
        System.gc();
    }

    /* renamed from: j */
    public void mo11835j() {
        this.f1833c.mo13279c("InterActivityV2", "onBackPressed()");
        if (this.f1831a.mo12789ac()) {
            mo11825b("javascript:onBackPressed();");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo11836k() {
        return this.f1831a.getType() == AppLovinAdType.INCENTIVIZED;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo11837l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo11838m() {
        if (this.f1852v.compareAndSet(false, true)) {
            C1522j.m3516b(this.f1843m, (AppLovinAd) this.f1831a);
            this.f1832b.mo13085Y().mo13269b((Object) this.f1831a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo11839n() {
        C1554p pVar = this.f1846p;
        if (pVar != null) {
            pVar.mo13345b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo11840o() {
        C1554p pVar = this.f1846p;
        if (pVar != null) {
            pVar.mo13346c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo11841p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo11842q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo11843r() {
        return ((Boolean) this.f1832b.mo13088a(C1369c.f3041da)).booleanValue() ? this.f1832b.mo13128l().isMuted() : ((Boolean) this.f1832b.mo13088a(C1369c.f2987cY)).booleanValue();
    }
}
