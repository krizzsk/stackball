package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.utils.C1513b;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1549k;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicReference;

public class AdViewControllerImpl implements AdViewController, AppLovinCommunicatorSubscriber {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f1731a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewGroup f1732b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1469j f1733c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinAdServiceImpl f1734d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1505q f1735e;

    /* renamed from: f */
    private AppLovinCommunicator f1736f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AppLovinAdSize f1737g;

    /* renamed from: h */
    private String f1738h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1382d f1739i;

    /* renamed from: j */
    private C1079d f1740j;

    /* renamed from: k */
    private C1030c f1741k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1072c f1742l;

    /* renamed from: m */
    private Runnable f1743m;

    /* renamed from: n */
    private Runnable f1744n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C1355g f1745o = null;

    /* renamed from: p */
    private volatile AppLovinAd f1746p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1093k f1747q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1093k f1748r = null;

    /* renamed from: s */
    private final AtomicReference<AppLovinAd> f1749s = new AtomicReference<>();

    /* renamed from: t */
    private volatile boolean f1750t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public volatile boolean f1751u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile AppLovinAdLoadListener f1752v;

    /* renamed from: w */
    private volatile AppLovinAdDisplayListener f1753w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile AppLovinAdViewEventListener f1754x;

    /* renamed from: y */
    private volatile AppLovinAdClickListener f1755y;

    /* renamed from: com.applovin.impl.adview.AdViewControllerImpl$a */
    private class C1028a implements Runnable {
        private C1028a() {
        }

        public void run() {
            if (AdViewControllerImpl.this.f1742l != null) {
                AdViewControllerImpl.this.f1742l.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.AdViewControllerImpl$b */
    private class C1029b implements Runnable {
        private C1029b() {
        }

        public void run() {
            if (AdViewControllerImpl.this.f1745o == null) {
                return;
            }
            if (AdViewControllerImpl.this.f1742l != null) {
                AdViewControllerImpl.this.m1413f();
                C1505q c = AdViewControllerImpl.this.f1735e;
                c.mo13277b("AppLovinAdView", "Rendering advertisement ad for #" + AdViewControllerImpl.this.f1745o.getAdIdNumber() + "...");
                AdViewControllerImpl.m1405b((View) AdViewControllerImpl.this.f1742l, AdViewControllerImpl.this.f1745o.getSize());
                AdViewControllerImpl.this.f1742l.mo11888a(AdViewControllerImpl.this.f1745o);
                if (AdViewControllerImpl.this.f1745o.getSize() != AppLovinAdSize.INTERSTITIAL && !AdViewControllerImpl.this.f1751u) {
                    AdViewControllerImpl adViewControllerImpl = AdViewControllerImpl.this;
                    C1382d unused = adViewControllerImpl.f1739i = new C1382d(adViewControllerImpl.f1745o, AdViewControllerImpl.this.f1733c);
                    AdViewControllerImpl.this.f1739i.mo12898a();
                    AdViewControllerImpl.this.f1742l.setStatsManagerHelper(AdViewControllerImpl.this.f1739i);
                    AdViewControllerImpl.this.f1745o.setHasShown(true);
                }
                if (AdViewControllerImpl.this.f1742l.getStatsManagerHelper() != null) {
                    AdViewControllerImpl.this.f1742l.getStatsManagerHelper().mo12899a(AdViewControllerImpl.this.f1745o.mo12825v() ? 0 : 1);
                    return;
                }
                return;
            }
            C1505q.m3345i("AppLovinAdView", "Unable to render advertisement for ad #" + AdViewControllerImpl.this.f1745o.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
        }
    }

    /* renamed from: com.applovin.impl.adview.AdViewControllerImpl$c */
    static class C1030c implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final AdViewControllerImpl f1770a;

        C1030c(AdViewControllerImpl adViewControllerImpl, C1469j jVar) {
            if (adViewControllerImpl == null) {
                throw new IllegalArgumentException("No view specified");
            } else if (jVar != null) {
                this.f1770a = adViewControllerImpl;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private AdViewControllerImpl m1428a() {
            return this.f1770a;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            AdViewControllerImpl a = m1428a();
            if (a != null) {
                a.mo11751a(appLovinAd);
            } else {
                C1505q.m3345i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        public void failedToReceiveAd(int i) {
            AdViewControllerImpl a = m1428a();
            if (a != null) {
                a.mo11749a(i);
            }
        }
    }

    /* renamed from: a */
    private void m1400a(AppLovinAdView appLovinAdView, C1469j jVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (appLovinAdSize != null) {
            this.f1733c = jVar;
            this.f1734d = jVar.mo13131o();
            this.f1735e = jVar.mo13139v();
            this.f1736f = AppLovinCommunicator.getInstance(context);
            this.f1737g = appLovinAdSize;
            this.f1738h = str;
            this.f1731a = context;
            this.f1732b = appLovinAdView;
            this.f1740j = new C1079d(this, jVar);
            this.f1744n = new C1028a();
            this.f1743m = new C1029b();
            this.f1741k = new C1030c(this, jVar);
            attachNewAdView(appLovinAdSize);
        } else {
            throw new IllegalArgumentException("No ad size specified");
        }
    }

    /* renamed from: a */
    private void m1401a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* renamed from: b */
    private void m1404b() {
        C1505q qVar = this.f1735e;
        if (qVar != null) {
            qVar.mo13277b("AppLovinAdView", "Destroying...");
        }
        C1072c cVar = this.f1742l;
        if (cVar != null) {
            ViewParent parent = cVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1742l);
            }
            this.f1742l.removeAllViews();
            if (this.f1742l.mo11891a()) {
                this.f1742l.loadUrl("about:blank");
                this.f1742l.clearHistory();
            } else {
                if (((Boolean) this.f1733c.mo13088a(C1369c.f3085eS)).booleanValue()) {
                    this.f1742l.loadUrl("about:blank");
                    this.f1742l.onPause();
                    this.f1742l.destroyDrawingCache();
                }
                this.f1742l.destroy();
            }
            this.f1742l = null;
            this.f1733c.mo13109af().mo13157b(this.f1745o);
        }
        this.f1751u = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1405b(View view, AppLovinAdSize appLovinAdSize) {
        if (view != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int i = -1;
            int applyDimension = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getWidth(), displayMetrics);
            if (!appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel())) {
                i = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getHeight(), displayMetrics);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = applyDimension;
            layoutParams.height = i;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(10);
                layoutParams2.addRule(9);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    private void m1407c() {
        m1401a((Runnable) new Runnable() {
            public void run() {
                if (AdViewControllerImpl.this.f1747q != null) {
                    C1505q c = AdViewControllerImpl.this.f1735e;
                    c.mo13277b("AppLovinAdView", "Detaching expanded ad: " + AdViewControllerImpl.this.f1747q.mo11965a());
                    AdViewControllerImpl adViewControllerImpl = AdViewControllerImpl.this;
                    C1093k unused = adViewControllerImpl.f1748r = adViewControllerImpl.f1747q;
                    C1093k unused2 = AdViewControllerImpl.this.f1747q = null;
                    AdViewControllerImpl adViewControllerImpl2 = AdViewControllerImpl.this;
                    adViewControllerImpl2.attachNewAdView(adViewControllerImpl2.f1737g);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m1409d() {
        m1401a((Runnable) new Runnable() {
            public void run() {
                C1345a aVar;
                if (AdViewControllerImpl.this.f1748r != null || AdViewControllerImpl.this.f1747q != null) {
                    if (AdViewControllerImpl.this.f1748r != null) {
                        aVar = AdViewControllerImpl.this.f1748r.mo11965a();
                        AdViewControllerImpl.this.f1748r.dismiss();
                        C1093k unused = AdViewControllerImpl.this.f1748r = null;
                    } else {
                        aVar = AdViewControllerImpl.this.f1747q.mo11965a();
                        AdViewControllerImpl.this.f1747q.dismiss();
                        C1093k unused2 = AdViewControllerImpl.this.f1747q = null;
                    }
                    C1522j.m3514b(AdViewControllerImpl.this.f1754x, (AppLovinAd) aVar, (AppLovinAdView) AdViewControllerImpl.this.f1732b);
                }
            }
        });
    }

    /* renamed from: e */
    private void m1411e() {
        C1382d dVar = this.f1739i;
        if (dVar != null) {
            dVar.mo12902c();
            this.f1739i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m1413f() {
        C1355g gVar = this.f1745o;
        C1549k kVar = new C1549k();
        kVar.mo13334a().mo13336a("Format", gVar.getAdZone().mo12714b().getLabel()).mo13336a("Ad Id", Long.valueOf(gVar.getAdIdNumber())).mo13336a("Zone Id", gVar.getAdZone().mo12712a()).mo13336a("Source", gVar.getSource()).mo13336a("Ad Class", gVar.getClass().getSimpleName());
        if (gVar instanceof C1000a) {
            kVar.mo13336a("VAST DSP", ((C1000a) gVar).mo11675j());
        }
        if (!C1557r.m3611a(gVar.getSize())) {
            kVar.mo13334a().mo13335a("Fullscreen Ad Properties");
            kVar.mo13336a("Target", gVar.mo12818o()).mo13336a("close_style", gVar.mo12822s()).mo13337a("close_delay_graphic", Long.valueOf(gVar.mo12821r()), "s");
            if (gVar.hasVideoUrl()) {
                kVar.mo13337a("close_delay", Long.valueOf(gVar.mo12819p()), "s").mo13336a("skip_style", gVar.mo12823t()).mo13336a("Streaming", Boolean.valueOf(gVar.mo11665d())).mo13336a("Video Location", gVar.mo11664c()).mo13336a("video_button_properties", gVar.mo12828y());
            }
        }
        kVar.mo13334a();
        C1505q.m3342f("AppLovinAdView", kVar.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11748a() {
        if (this.f1747q == null && this.f1748r == null) {
            C1505q qVar = this.f1735e;
            qVar.mo13277b("AppLovinAdView", "Ad: " + this.f1745o + " closed.");
            m1401a(this.f1744n);
            C1522j.m3516b(this.f1753w, (AppLovinAd) this.f1745o);
            this.f1733c.mo13109af().mo13157b(this.f1745o);
            this.f1745o = null;
        } else if (((Boolean) this.f1733c.mo13088a(C1369c.f3001cm)).booleanValue()) {
            contractAd();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11749a(final int i) {
        if (!this.f1751u) {
            m1401a(this.f1744n);
        }
        m1401a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (AdViewControllerImpl.this.f1752v != null) {
                        AdViewControllerImpl.this.f1752v.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    C1505q.m3341c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11750a(C1355g gVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        C1522j.m3504a(this.f1755y, (AppLovinAd) gVar);
        if (appLovinAdView != null) {
            this.f1734d.trackAndLaunchClick(gVar, appLovinAdView, this, uri, pointF);
        } else {
            this.f1735e.mo13281e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11751a(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f1751u) {
                renderAd(appLovinAd);
            } else {
                this.f1749s.set(appLovinAd);
                this.f1735e.mo13277b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
            }
            m1401a((Runnable) new Runnable() {
                public void run() {
                    try {
                        if (AdViewControllerImpl.this.f1752v != null) {
                            AdViewControllerImpl.this.f1752v.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        C1505q.m3345i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                    }
                }
            });
            return;
        }
        this.f1735e.mo13281e("AppLovinAdView", "No provided when to the view controller");
        mo11749a(-1);
    }

    /* access modifiers changed from: protected */
    public void attachNewAdView(AppLovinAdSize appLovinAdSize) {
        C1072c a = C1072c.m1568a(appLovinAdSize, this.f1740j, this.f1733c, this.f1731a);
        this.f1742l = a;
        a.setBackgroundColor(0);
        this.f1742l.setWillNotCacheDrawing(false);
        this.f1732b.setBackgroundColor(0);
        this.f1732b.addView(this.f1742l);
        m1405b((View) this.f1742l, appLovinAdSize);
        if (!this.f1750t) {
            m1401a(this.f1744n);
        }
        m1401a((Runnable) new Runnable() {
            public void run() {
                AdViewControllerImpl.this.f1742l.loadDataWithBaseURL("/", "<html></html>", WebRequest.CONTENT_TYPE_HTML, (String) null, "");
            }
        });
        this.f1750t = true;
    }

    public void contractAd() {
        m1401a((Runnable) new Runnable() {
            public void run() {
                AdViewControllerImpl.this.m1409d();
                if (AdViewControllerImpl.this.f1732b != null && AdViewControllerImpl.this.f1742l != null && AdViewControllerImpl.this.f1742l.getParent() == null) {
                    AdViewControllerImpl.this.f1732b.addView(AdViewControllerImpl.this.f1742l);
                    AdViewControllerImpl.m1405b((View) AdViewControllerImpl.this.f1742l, AdViewControllerImpl.this.f1745o.getSize());
                }
            }
        });
    }

    public void destroy() {
        if (!(this.f1742l == null || this.f1747q == null)) {
            contractAd();
        }
        m1404b();
    }

    public void dismissInterstitialIfRequired() {
        if ((this.f1731a instanceof C1092j) && this.f1745o != null) {
            if (this.f1745o.mo12750J() == C1355g.C1357a.DISMISS) {
                ((C1092j) this.f1731a).dismiss();
            }
        }
    }

    public void expandAd(final PointF pointF) {
        m1401a((Runnable) new Runnable() {
            public void run() {
                if (AdViewControllerImpl.this.f1747q == null && (AdViewControllerImpl.this.f1745o instanceof C1345a) && AdViewControllerImpl.this.f1742l != null) {
                    C1345a aVar = (C1345a) AdViewControllerImpl.this.f1745o;
                    Activity a = AdViewControllerImpl.this.f1731a instanceof Activity ? (Activity) AdViewControllerImpl.this.f1731a : C1557r.m3579a((View) AdViewControllerImpl.this.f1742l, AdViewControllerImpl.this.f1733c);
                    if (a != null) {
                        if (AdViewControllerImpl.this.f1732b != null) {
                            AdViewControllerImpl.this.f1732b.removeView(AdViewControllerImpl.this.f1742l);
                        }
                        C1093k unused = AdViewControllerImpl.this.f1747q = new C1093k(aVar, AdViewControllerImpl.this.f1742l, a, AdViewControllerImpl.this.f1733c);
                        AdViewControllerImpl.this.f1747q.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            public void onDismiss(DialogInterface dialogInterface) {
                                AdViewControllerImpl.this.contractAd();
                            }
                        });
                        AdViewControllerImpl.this.f1747q.show();
                        C1522j.m3499a(AdViewControllerImpl.this.f1754x, (AppLovinAd) AdViewControllerImpl.this.f1745o, (AppLovinAdView) AdViewControllerImpl.this.f1732b);
                        if (AdViewControllerImpl.this.f1739i != null) {
                            AdViewControllerImpl.this.f1739i.mo12904d();
                            return;
                        }
                        return;
                    }
                    C1505q.m3345i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    Uri h = aVar.mo11671h();
                    if (h != null && ((Boolean) AdViewControllerImpl.this.f1733c.mo13088a(C1369c.f3008ct)).booleanValue()) {
                        AdViewControllerImpl.this.f1734d.trackAndLaunchClick(aVar, AdViewControllerImpl.this.getParentView(), AdViewControllerImpl.this, h, pointF);
                        if (AdViewControllerImpl.this.f1739i != null) {
                            AdViewControllerImpl.this.f1739i.mo12900b();
                        }
                    }
                    AdViewControllerImpl.this.f1742l.mo11889a("javascript:al_onFailedExpand();");
                }
            }
        });
    }

    public AppLovinAdViewEventListener getAdViewEventListener() {
        return this.f1754x;
    }

    public C1072c getAdWebView() {
        return this.f1742l;
    }

    public String getCommunicatorId() {
        return AdViewControllerImpl.class.getSimpleName();
    }

    public C1355g getCurrentAd() {
        return this.f1745o;
    }

    public AppLovinAdView getParentView() {
        return (AppLovinAdView) this.f1732b;
    }

    public C1469j getSdk() {
        return this.f1733c;
    }

    public AppLovinAdSize getSize() {
        return this.f1737g;
    }

    public String getZoneId() {
        return this.f1738h;
    }

    public void initializeAdView(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (context == null) {
            C1505q.m3345i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
        } else {
            if (appLovinAdSize == null && (appLovinAdSize = C1513b.m3408a(attributeSet)) == null) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            }
            AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
            if (appLovinSdk == null) {
                appLovinSdk = AppLovinSdk.getInstance(context);
            }
            if (appLovinSdk != null && !appLovinSdk.hasCriticalErrors()) {
                m1400a(appLovinAdView, C1557r.m3585a(appLovinSdk), appLovinAdSize2, str, context);
                if (C1513b.m3411b(attributeSet)) {
                    loadNextAd();
                }
            }
        }
    }

    public boolean isAdReadyToDisplay() {
        return !TextUtils.isEmpty(this.f1738h) ? this.f1734d.hasPreloadedAdForZoneId(this.f1738h) : this.f1734d.hasPreloadedAd(this.f1737g);
    }

    public void loadNextAd() {
        if (this.f1733c == null || this.f1741k == null || this.f1731a == null || !this.f1750t) {
            C1505q.m3343g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f1734d.loadNextAd(this.f1738h, this.f1737g, this.f1741k);
        }
    }

    public void onAdHtmlLoaded(WebView webView) {
        webView.setVisibility(0);
        try {
            if (this.f1745o != this.f1746p && this.f1753w != null) {
                this.f1746p = this.f1745o;
                C1522j.m3505a(this.f1753w, (AppLovinAd) this.f1745o);
                this.f1733c.mo13109af().mo13156a((Object) this.f1745o);
            }
        } catch (Throwable th) {
            C1505q.m3341c("AppLovinAdView", "Exception while notifying ad display listener", th);
        }
    }

    public void onAttachedToWindow() {
        if (C1513b.m3410a((View) this.f1742l)) {
            this.f1733c.mo13072L().mo12926a(C1387g.f3260m);
        }
    }

    public void onDetachedFromWindow() {
        if (this.f1750t) {
            C1522j.m3516b(this.f1753w, (AppLovinAd) this.f1745o);
            this.f1733c.mo13109af().mo13157b(this.f1745o);
            if (this.f1742l == null || this.f1747q == null) {
                this.f1735e.mo13277b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                return;
            }
            this.f1735e.mo13277b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            if (((Boolean) this.f1733c.mo13088a(C1369c.f3000cl)).booleanValue()) {
                contractAd();
            } else {
                m1407c();
            }
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m1401a((Runnable) new Runnable() {
                public void run() {
                    AdViewControllerImpl.this.getAdWebView().loadUrl("chrome://crash");
                }
            });
        }
    }

    public void pause() {
        if (this.f1750t && !this.f1751u) {
            this.f1751u = true;
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        renderAd(appLovinAd, (String) null);
    }

    public void renderAd(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            C1557r.m3619b(appLovinAd, this.f1733c);
            if (this.f1750t) {
                C1355g gVar = (C1355g) C1557r.m3586a(appLovinAd, this.f1733c);
                if (gVar != null && gVar != this.f1745o) {
                    C1505q qVar = this.f1735e;
                    qVar.mo13277b("AppLovinAdView", "Rendering ad #" + gVar.getAdIdNumber() + " (" + gVar.getSize() + ")");
                    C1522j.m3516b(this.f1753w, (AppLovinAd) this.f1745o);
                    this.f1733c.mo13109af().mo13157b(this.f1745o);
                    if (gVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
                        m1411e();
                    }
                    this.f1749s.set((Object) null);
                    this.f1746p = null;
                    this.f1745o = gVar;
                    if (!this.f1751u && C1557r.m3611a(this.f1737g)) {
                        this.f1733c.mo13131o().trackImpression(gVar);
                    }
                    if (this.f1747q != null) {
                        if (((Boolean) this.f1733c.mo13088a(C1369c.f2999ck)).booleanValue()) {
                            m1409d();
                            this.f1735e.mo13277b("AppLovinAdView", "Fade out the old ad scheduled");
                        } else {
                            m1407c();
                        }
                    }
                    m1401a(this.f1743m);
                } else if (gVar == null) {
                    this.f1735e.mo13280d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                } else {
                    C1505q qVar2 = this.f1735e;
                    qVar2.mo13280d("AppLovinAdView", "Ad #" + gVar.getAdIdNumber() + " is already showing, ignoring");
                    if (((Boolean) this.f1733c.mo13088a(C1369c.f3009cu)).booleanValue()) {
                        throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                    }
                }
            } else {
                C1505q.m3343g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            }
        } else {
            throw new IllegalArgumentException("No ad specified");
        }
    }

    public void resume() {
        if (this.f1750t) {
            AppLovinAd andSet = this.f1749s.getAndSet((Object) null);
            if (andSet != null) {
                renderAd(andSet);
            }
            this.f1751u = false;
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1755y = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1753w = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1752v = appLovinAdLoadListener;
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f1754x = appLovinAdViewEventListener;
    }

    public void setStatsManagerHelper(C1382d dVar) {
        C1072c cVar = this.f1742l;
        if (cVar != null) {
            cVar.setStatsManagerHelper(dVar);
        }
    }
}
