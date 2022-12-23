package com.applovin.impl.mediation.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.p020b.C1224b;
import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.C1389d;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.C1568w;
import com.applovin.impl.sdk.C1569x;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1399ad;
import com.applovin.impl.sdk.utils.C1513b;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.impl.sdk.utils.C1558s;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.TimeUnit;

public class MaxAdViewImpl extends C1220a implements C1389d.C1391a, C1569x.C1572a {

    /* renamed from: q */
    private static final int[] f2288q = {10, 14};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f2289a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final MaxAdView f2290b;

    /* renamed from: c */
    private final View f2291c;

    /* renamed from: d */
    private long f2292d = Long.MAX_VALUE;

    /* renamed from: e */
    private C1224b f2293e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f2294f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1204a f2295g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1206c f2296h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1389d f2297i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1568w f2298j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1569x f2299k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f2300l = new Object();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1224b f2301m = null;

    /* renamed from: n */
    private boolean f2302n;

    /* renamed from: o */
    private boolean f2303o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f2304p = false;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$a */
    private class C1204a extends C1205b {
        private C1204a() {
            super();
        }

        public void onAdLoadFailed(String str, int i) {
            C1522j.m3503a(MaxAdViewImpl.this.adListener, str, i);
            MaxAdViewImpl.this.m1973a(i);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f2304p) {
                C1505q qVar = MaxAdViewImpl.this.logger;
                String str = MaxAdViewImpl.this.tag;
                qVar.mo13277b(str, "Pre-cache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                MaxAdViewImpl.this.sdk.mo13142y().destroyAd(maxAd);
            } else if (maxAd instanceof C1224b) {
                C1224b bVar = (C1224b) maxAd;
                bVar.mo12364d(MaxAdViewImpl.this.f2294f);
                MaxAdViewImpl.this.m1984a(bVar);
                if (bVar.mo12309v()) {
                    long w = bVar.mo12310w();
                    C1505q v = MaxAdViewImpl.this.sdk.mo13139v();
                    String str2 = MaxAdViewImpl.this.tag;
                    v.mo13277b(str2, "Scheduling banner ad refresh " + w + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    MaxAdViewImpl.this.f2297i.mo12935a(w);
                }
                C1522j.m3500a(MaxAdViewImpl.this.adListener, maxAd);
            } else {
                C1505q qVar2 = MaxAdViewImpl.this.logger;
                String str3 = MaxAdViewImpl.this.tag;
                qVar2.mo13281e(str3, "Not a MediatedAdViewAd received: " + maxAd);
                onAdLoadFailed(MaxAdViewImpl.this.adUnitId, -5201);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    private abstract class C1205b implements MaxAdListener, MaxAdViewAdListener {
        private C1205b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2301m)) {
                C1522j.m3521d(MaxAdViewImpl.this.adListener, maxAd);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2301m)) {
                if (MaxAdViewImpl.this.f2301m.mo12311x()) {
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C1522j.m3525h(MaxAdViewImpl.this.adListener, maxAd);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, int i) {
            if (maxAd.equals(MaxAdViewImpl.this.f2301m)) {
                C1522j.m3501a(MaxAdViewImpl.this.adListener, maxAd, i);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2301m)) {
                C1522j.m3515b(MaxAdViewImpl.this.adListener, maxAd);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2301m)) {
                if (MaxAdViewImpl.this.f2301m.mo12311x()) {
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C1522j.m3524g(MaxAdViewImpl.this.adListener, maxAd);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2301m)) {
                C1522j.m3519c(MaxAdViewImpl.this.adListener, maxAd);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    private class C1206c extends C1205b {
        private C1206c() {
            super();
        }

        public void onAdLoadFailed(String str, int i) {
            C1505q qVar = MaxAdViewImpl.this.logger;
            String str2 = MaxAdViewImpl.this.tag;
            qVar.mo13277b(str2, "Failed to pre-cache ad for refresh with error code " + i);
            MaxAdViewImpl.this.m1973a(i);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f2304p) {
                C1505q qVar = MaxAdViewImpl.this.logger;
                String str = MaxAdViewImpl.this.tag;
                qVar.mo13277b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                MaxAdViewImpl.this.sdk.mo13142y().destroyAd(maxAd);
                return;
            }
            MaxAdViewImpl.this.logger.mo13277b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            MaxAdViewImpl.this.m1987a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, C1469j jVar, Activity activity) {
        super(str, maxAdFormat, "MaxAdView", jVar);
        if (activity != null) {
            this.f2289a = activity;
            this.f2290b = maxAdView;
            this.f2291c = view;
            this.f2295g = new C1204a();
            this.f2296h = new C1206c();
            this.f2297i = new C1389d(jVar, this);
            this.f2298j = new C1568w(maxAdView, jVar);
            this.f2299k = new C1569x(maxAdView, jVar, this);
            C1505q qVar = this.logger;
            String str2 = this.tag;
            qVar.mo13277b(str2, "Created new MaxAdView (" + this + ")");
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1972a() {
        C1224b bVar;
        MaxAdView maxAdView = this.f2290b;
        if (maxAdView != null) {
            C1513b.m3409a(maxAdView, this.f2291c);
        }
        this.f2299k.mo13386a();
        synchronized (this.f2300l) {
            bVar = this.f2301m;
        }
        if (bVar != null) {
            this.sdk.mo13109af().mo13157b(bVar);
            this.sdk.mo13142y().destroyAd(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1973a(int i) {
        if (this.sdk.mo13114b((C1369c) C1368b.f2839r).contains(String.valueOf(i))) {
            C1505q v = this.sdk.mo13139v();
            String str = this.tag;
            v.mo13277b(str, "Ignoring banner ad refresh for error code '" + i + "'...");
            return;
        }
        this.f2302n = true;
        long longValue = ((Long) this.sdk.mo13088a(C1368b.f2838q)).longValue();
        if (longValue >= 0) {
            C1505q v2 = this.sdk.mo13139v();
            String str2 = this.tag;
            v2.mo13277b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
            this.f2297i.mo12935a(longValue);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1974a(long j) {
        if (C1557r.m3606a(j, ((Long) this.sdk.mo13088a(C1368b.f2805A)).longValue())) {
            C1505q qVar = this.logger;
            String str = this.tag;
            qVar.mo13277b(str, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            this.logger.mo13277b(this.tag, "Waiting for refresh timer to manually fire request");
            this.f2302n = true;
            return;
        }
        this.logger.mo13277b(this.tag, "No undesired viewability flags matched - scheduling viewability");
        this.f2302n = false;
        m1990b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1975a(AnimatorListenerAdapter animatorListenerAdapter) {
        C1224b bVar = this.f2301m;
        if (bVar == null || bVar.mo12301n() == null) {
            animatorListenerAdapter.onAnimationEnd((Animator) null);
            return;
        }
        View n = this.f2301m.mo12301n();
        n.animate().alpha(0.0f).setDuration(((Long) this.sdk.mo13088a(C1368b.f2845x)).longValue()).setListener(animatorListenerAdapter).start();
    }

    /* renamed from: a */
    private void m1976a(View view, C1224b bVar) {
        int l = bVar.mo12299l();
        int m = bVar.mo12300m();
        int i = -1;
        int dpToPx = l == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), l);
        if (m != -1) {
            i = AppLovinSdkUtils.dpToPx(view.getContext(), m);
        }
        int height = this.f2290b.getHeight();
        int width = this.f2290b.getWidth();
        if ((height > 0 && height < i) || (width > 0 && width < dpToPx)) {
            int pxToDp = AppLovinSdkUtils.pxToDp(view.getContext(), height);
            C1505q.m3344h("AppLovinSdk", "\n**************************************************\n`MaxAdView` size " + AppLovinSdkUtils.pxToDp(view.getContext(), width) + "x" + pxToDp + " dp smaller than required size: " + l + "x" + m + " dp\n**************************************************\n");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, i);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = i;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            this.logger.mo13277b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + i + ".");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int addRule : C1558s.m3637a(this.f2290b.getGravity(), 10, 14)) {
                layoutParams2.addRule(addRule);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1984a(final C1224b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                String str;
                String str2;
                C1505q qVar;
                if (bVar.mo12301n() != null) {
                    final MaxAdView d = MaxAdViewImpl.this.f2290b;
                    if (d != null) {
                        MaxAdViewImpl.this.m1975a((AnimatorListenerAdapter) new AnimatorListenerAdapter() {
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                MaxAdViewImpl.this.m1972a();
                                MaxAdViewImpl.this.sdk.mo13109af().mo13156a((Object) bVar);
                                if (bVar.mo12307t()) {
                                    MaxAdViewImpl.this.f2299k.mo13387a((Context) MaxAdViewImpl.this.f2289a, bVar);
                                }
                                MaxAdViewImpl.this.m1986a(bVar, d);
                                synchronized (MaxAdViewImpl.this.f2300l) {
                                    C1224b unused = MaxAdViewImpl.this.f2301m = bVar;
                                }
                                MaxAdViewImpl.this.logger.mo13277b(MaxAdViewImpl.this.tag, "Scheduling impression for ad manually...");
                                MaxAdViewImpl.this.sdk.mo13142y().maybeScheduleRawAdImpressionPostback(bVar);
                                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                                    public void run() {
                                        long a = MaxAdViewImpl.this.f2298j.mo13385a(bVar);
                                        if (!bVar.mo12307t()) {
                                            MaxAdViewImpl.this.m1985a(bVar, a);
                                        }
                                        MaxAdViewImpl.this.m1974a(a);
                                    }
                                }, bVar.mo12302o());
                            }
                        });
                        return;
                    }
                    qVar = MaxAdViewImpl.this.logger;
                    str2 = MaxAdViewImpl.this.tag;
                    str = "Max ad view does not have a parent View";
                } else {
                    qVar = MaxAdViewImpl.this.logger;
                    str2 = MaxAdViewImpl.this.tag;
                    str = "Max ad does not have a loaded ad view";
                }
                qVar.mo13281e(str2, str);
                MaxAdViewImpl.this.f2295g.onAdDisplayFailed(bVar, -5201);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1985a(C1224b bVar, long j) {
        this.logger.mo13277b(this.tag, "Scheduling viewability impression for ad...");
        this.sdk.mo13142y().maybeScheduleViewabilityAdImpressionPostback(bVar, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1986a(C1224b bVar, MaxAdView maxAdView) {
        View n = bVar.mo12301n();
        n.setAlpha(0.0f);
        if (bVar.mo12312y() != Long.MAX_VALUE) {
            this.f2291c.setBackgroundColor((int) bVar.mo12312y());
        } else {
            long j = this.f2292d;
            if (j != Long.MAX_VALUE) {
                this.f2291c.setBackgroundColor((int) j);
            } else {
                this.f2291c.setBackgroundColor(0);
            }
        }
        maxAdView.addView(n);
        m1976a(n, bVar);
        n.animate().alpha(1.0f).setDuration(((Long) this.sdk.mo13088a(C1368b.f2844w)).longValue()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1987a(MaxAd maxAd) {
        this.sdk.mo13109af().mo13156a((Object) maxAd);
        if (this.f2303o) {
            this.f2303o = false;
            C1505q qVar = this.logger;
            String str = this.tag;
            qVar.mo13277b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            this.f2295g.onAdLoaded(maxAd);
            return;
        }
        this.f2293e = (C1224b) maxAd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1988a(final MaxAdListener maxAdListener) {
        if (m1995d()) {
            C1505q.m3345i(this.tag, "Unable to load new ad; ad is already destroyed");
            C1522j.m3503a(this.adListener, this.adUnitId, -1);
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (MaxAdViewImpl.this.f2301m != null) {
                    MaxAdViewImpl.this.loadRequestBuilder.mo12405a("visible_ad_ad_unit_id", MaxAdViewImpl.this.f2301m.getAdUnitId()).mo12405a("viewability_flags", String.valueOf(MaxAdViewImpl.this.f2298j.mo13385a(MaxAdViewImpl.this.f2301m)));
                } else {
                    MaxAdViewImpl.this.loadRequestBuilder.mo12404a("visible_ad_ad_unit_id").mo12404a("viewability_flags");
                }
                C1505q qVar = MaxAdViewImpl.this.logger;
                String str = MaxAdViewImpl.this.tag;
                qVar.mo13277b(str, "Loading banner ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + maxAdListener + "...");
                MaxAdViewImpl.this.sdk.mo13142y().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.adFormat, MaxAdViewImpl.this.loadRequestBuilder.mo12406a(), false, MaxAdViewImpl.this.f2289a, maxAdListener);
            }
        });
    }

    /* renamed from: b */
    private void m1990b() {
        if (m1993c()) {
            long longValue = ((Long) this.sdk.mo13088a(C1368b.f2806B)).longValue();
            C1505q qVar = this.logger;
            String str = this.tag;
            qVar.mo13277b(str, "Scheduling refresh precache request in " + TimeUnit.MICROSECONDS.toSeconds(longValue) + " seconds...");
            this.sdk.mo13071K().mo13015a(new C1399ad(this.sdk, new Runnable() {
                public void run() {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.m1988a((MaxAdListener) maxAdViewImpl.f2296h);
                }
            }), C1255c.m2220a(this.adFormat), longValue);
        }
    }

    /* renamed from: c */
    private boolean m1993c() {
        return ((Long) this.sdk.mo13088a(C1368b.f2806B)).longValue() > 0;
    }

    /* renamed from: d */
    private boolean m1995d() {
        boolean z;
        synchronized (this.f2300l) {
            z = this.f2304p;
        }
        return z;
    }

    public void destroy() {
        m1972a();
        if (this.f2293e != null) {
            this.sdk.mo13109af().mo13157b(this.f2293e);
            this.sdk.mo13142y().destroyAd(this.f2293e);
        }
        synchronized (this.f2300l) {
            this.f2304p = true;
        }
        this.f2297i.mo12938c();
    }

    public String getPlacement() {
        return this.f2294f;
    }

    public void loadAd() {
        C1505q qVar = this.logger;
        String str = this.tag;
        qVar.mo13277b(str, "" + this + " Loading ad for " + this.adUnitId + "...");
        if (m1995d()) {
            C1505q.m3345i(this.tag, "Unable to load new ad; ad is already destroyed");
            C1522j.m3503a(this.adListener, this.adUnitId, -1);
        } else if (!((Boolean) this.sdk.mo13088a(C1368b.f2807C)).booleanValue() || !this.f2297i.mo12936a()) {
            m1988a((MaxAdListener) this.f2295g);
        } else {
            String str2 = this.tag;
            C1505q.m3345i(str2, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f2297i.mo12937b()) + " seconds.");
        }
    }

    public void onAdRefresh() {
        String str;
        String str2;
        C1505q qVar;
        this.f2303o = false;
        if (this.f2293e != null) {
            C1505q qVar2 = this.logger;
            String str3 = this.tag;
            qVar2.mo13277b(str3, "Refreshing for cached ad: " + this.f2293e.getAdUnitId() + "...");
            this.f2295g.onAdLoaded(this.f2293e);
            this.f2293e = null;
            return;
        }
        if (!m1993c()) {
            qVar = this.logger;
            str2 = this.tag;
            str = "Refreshing ad from network...";
        } else if (this.f2302n) {
            qVar = this.logger;
            str2 = this.tag;
            str = "Refreshing ad from network due to viewability requirements not met for refresh request...";
        } else {
            this.logger.mo13281e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            this.f2303o = true;
            return;
        }
        qVar.mo13277b(str2, str);
        loadAd();
    }

    public void onLogVisibilityImpression() {
        m1985a(this.f2301m, this.f2298j.mo13385a(this.f2301m));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.mo13088a(C1368b.f2843v)).booleanValue() && this.f2297i.mo12936a()) {
            if (C1558s.m3635a(i)) {
                this.logger.mo13277b(this.tag, "Ad view visible");
                this.f2297i.mo12942g();
                return;
            }
            this.logger.mo13277b(this.tag, "Ad view hidden");
            this.f2297i.mo12941f();
        }
    }

    public void setPlacement(String str) {
        this.f2294f = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f2292d = (long) i;
    }

    public void startAutoRefresh() {
        this.f2297i.mo12940e();
        C1505q qVar = this.logger;
        String str = this.tag;
        qVar.mo13277b(str, "Resumed auto-refresh with remaining time: " + this.f2297i.mo12937b());
    }

    public void stopAutoRefresh() {
        if (this.f2301m != null) {
            C1505q qVar = this.logger;
            String str = this.tag;
            qVar.mo13277b(str, "Pausing auto-refresh with remaining time: " + this.f2297i.mo12937b());
            this.f2297i.mo12939d();
            return;
        }
        C1505q.m3344h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
    }

    public String toString() {
        return "MaxAdView{adUnitId='" + this.adUnitId + '\'' + ", adListener=" + this.adListener + ", isDestroyed=" + m1995d() + '}';
    }
}
