package com.fyber.inneractive.sdk.p050i;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.C2801o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2742b;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2845j;
import com.fyber.inneractive.sdk.p037d.C2847l;
import com.fyber.inneractive.sdk.p037d.C2853m;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p049h.C2973p;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3019f;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.p084ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3622ad;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3640ao;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.i.g */
public final class C3008g extends C2847l<C2853m, InneractiveFullscreenAdEventsListener> implements C2900c {

    /* renamed from: l */
    C3039d.C3051c f7343l;

    /* renamed from: m */
    boolean f7344m = false;

    /* renamed from: n */
    private IAmraidWebViewController f7345n;

    /* renamed from: o */
    private boolean f7346o = false;

    /* renamed from: p */
    private boolean f7347p = false;

    /* renamed from: q */
    private boolean f7348q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f7349r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7350s = false;

    /* renamed from: t */
    private C3640ao f7351t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f7352u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public UnitDisplayType f7353v = UnitDisplayType.INTERSTITIAL;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f7354w = false;

    /* renamed from: x */
    private boolean f7355x = false;

    /* renamed from: y */
    private C2900c.C2902b f7356y;

    /* renamed from: z */
    private C3622ad f7357z;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo18189c(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo18190e() {
        return false;
    }

    /* renamed from: q */
    public final boolean mo18150q() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ boolean mo18187a(C2836g gVar) {
        return this.f7353v != UnitDisplayType.REWARDED && ((C2742b) ((C2853m) gVar).mo18132i().mo18010a(C2742b.class)).mo17984a("show_fallback_close_btn", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ boolean mo18188b(C2836g gVar) {
        return this.f7353v != UnitDisplayType.REWARDED && ((C2742b) ((C2853m) gVar).mo18132i().mo18010a(C2742b.class)).mo17984a("add_transparent_close_btn", false);
    }

    /* renamed from: a */
    public final void mo18185a(C2900c.C2901a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        IAmraidWebViewController iAmraidWebViewController;
        super.mo18185a(aVar, activity);
        C2801o h = (this.f6749b == null || ((C2853m) this.f6749b).mo18131h() == null) ? null : ((C2853m) this.f6749b).mo18131h().mo18071h();
        boolean z = false;
        if (h != null) {
            if (this.f6749b != null) {
                iAmraidWebViewController = ((C2853m) this.f6749b).f6798a;
            } else {
                iAmraidWebViewController = null;
            }
            this.f7345n = iAmraidWebViewController;
            if (iAmraidWebViewController == null || !iAmraidWebViewController.mo18555d()) {
                IAlog.m9036d("%sWeb view controller content is not valid. Web view might have crashed", IAlog.m9029a((Object) this));
                throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
            }
            this.f7353v = h.mo18057a();
            this.f7346o = false;
            this.f7347p = false;
            this.f7357z = new C3622ad(this.f6748a);
            this.f6782h = aVar;
            if (this.f7345n != null) {
                int i = ((C3019f) ((C2853m) this.f6749b).mo18129f()).f7404g;
                int i2 = ((C3019f) ((C2853m) this.f6749b).mo18129f()).f7405h;
                if ((i == 300 && i2 == 250) || (i == 600 && i2 == 500)) {
                    z = true;
                }
                this.f7348q = z;
                if (z) {
                    this.f7345n.setAdDefaultSize(C3657l.m9105a((float) i), C3657l.m9105a((float) i2));
                }
                if (this.f7343l == null) {
                    this.f7343l = new C3039d.C3051c() {
                        /* renamed from: c */
                        public final void mo18469c() {
                            IAlog.m9034b("%sweb view callback: onExpand", IAlog.m9029a((Object) C3008g.this));
                            boolean unused = C3008g.this.f7349r = true;
                            C3008g.this.m6923d();
                        }

                        /* renamed from: d */
                        public final void mo18470d() {
                            IAlog.m9034b("%sweb view callback: onResize", IAlog.m9029a((Object) C3008g.this));
                        }

                        /* renamed from: e */
                        public final void mo18471e() {
                            IAlog.m9034b("%sweb view callback: onClose", IAlog.m9029a((Object) C3008g.this));
                            if (C3008g.this.f7349r) {
                                boolean unused = C3008g.this.f7349r = false;
                                C3008g.this.m6923d();
                                return;
                            }
                            if (C3008g.this.f7353v == UnitDisplayType.REWARDED) {
                                C3008g.this.m6913a();
                            }
                            if (C3008g.this.f6782h != null) {
                                C3008g.this.f6782h.dismissAd(true);
                            }
                        }

                        /* renamed from: a */
                        public final C3685u.C3686a mo18460a(String str, C3629aj ajVar) {
                            IAlog.m9034b("%sweb view callback: onClicked", IAlog.m9029a((Object) C3008g.this));
                            Context p = C3657l.m9125p();
                            if (!(C3008g.this.f6782h == null || C3008g.this.f6782h.getLayout() == null || C3008g.this.f6782h.getLayout().getContext() == null)) {
                                p = C3008g.this.f6782h.getLayout().getContext();
                            }
                            if (p == null || !C3008g.this.f6754g) {
                                return new C3685u.C3686a(C3685u.C3688c.FAILED, new Exception("No context or no native click detected"), p == null ? "null" : p.getClass().getName());
                            }
                            C3019f fVar = C3008g.this.f6749b == null ? null : (C3019f) ((C2853m) C3008g.this.f6749b).mo18129f();
                            if (fVar != null) {
                                C3008g.this.mo18140b((C3018e) fVar);
                            }
                            C3008g.m6230a(C2688a.f6337b, C3008g.this.f7353v == UnitDisplayType.REWARDED ? C2689b.REWARDED_DISPLAY : C2689b.INTERSTITIAL_DISPLAY);
                            return C3008g.this.mo18136a(p, str, ajVar);
                        }

                        /* renamed from: b */
                        public final void mo18467b() {
                            C3008g.this.mo18137a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
                            C3008g.this.destroy();
                        }

                        /* renamed from: a */
                        public final void mo18463a(String str, String str2) {
                            IAlog.m9034b("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m9029a((Object) C3008g.this));
                            if (C3008g.this.f6782h != null && C3008g.this.f6782h.getLayout() != null) {
                                if (!C3008g.this.f7350s) {
                                    C2973p.m6655a(C3008g.this.f6782h.getLayout().getContext(), str, str2, C3008g.this.f6749b);
                                    boolean unused = C3008g.this.f7350s = true;
                                    IAlog.m9034b("%sreporting auto redirect", IAlog.m9029a((Object) C3008g.this));
                                    return;
                                }
                                IAlog.m9034b("%sredirect already reported for this ad", IAlog.m9029a((Object) C3008g.this));
                            }
                        }

                        /* renamed from: b */
                        public final void mo18468b(boolean z) {
                            if (z && !C3008g.this.f7344m) {
                                C3008g.this.f7344m = true;
                                C3008g.m6891B(C3008g.this);
                            }
                            IAlog.m9034b("%sweb view callback: onVisibilityChanged: %s", IAlog.m9029a((Object) C3008g.this), Boolean.valueOf(z));
                        }

                        /* renamed from: a */
                        public final void mo18465a(boolean z, Orientation orientation) {
                            if (C3008g.this.f6782h != null) {
                                C3008g.this.f6782h.setActivityOrientation(z, orientation);
                            }
                        }

                        /* renamed from: a */
                        public final boolean mo18466a(String str) {
                            if (C3008g.this.f6782h == null || C3008g.this.f6782h.getLayout() == null) {
                                return false;
                            }
                            boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(C3008g.this.f6782h.getLayout().getContext(), str);
                            if (!startRichMediaIntent) {
                                return startRichMediaIntent;
                            }
                            C3008g.this.mo18148n();
                            return startRichMediaIntent;
                        }

                        /* renamed from: a */
                        public final void mo18464a(boolean z) {
                            if (z) {
                                if (C3008g.this.f7353v != UnitDisplayType.REWARDED && !C3008g.this.f7352u) {
                                    boolean unused = C3008g.this.f7352u = true;
                                    if (C3008g.this.f6782h != null) {
                                        C3008g gVar = C3008g.this;
                                        C3008g.m6919b(gVar, gVar.f6782h.isCloseButtonDisplay());
                                    }
                                }
                                C3008g.this.mo18196v();
                                if (C3008g.this.f6782h != null && C3008g.this.f6782h.isCloseButtonDisplay()) {
                                    C3008g.this.mo18186a(true);
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void mo18461a() {
                            C3008g.this.mo18148n();
                        }

                        /* renamed from: a */
                        public final void mo18462a(InneractiveUnitController.AdDisplayError adDisplayError) {
                            C3008g.this.mo18186a(false);
                            if (C3008g.this.f6750c != null) {
                                ((InneractiveFullscreenAdEventsListener) C3008g.this.f6750c).onAdEnteredErrorState(C3008g.this.f6748a, adDisplayError);
                            }
                        }
                    };
                }
                this.f7345n.setListener(this.f7343l);
                m6923d();
                this.f7345n.mo18542a(this.f6782h.getLayout(), (ViewGroup.LayoutParams) null);
                this.f7346o = true;
                if (this.f7353v == UnitDisplayType.REWARDED) {
                    C3640ao aoVar = new C3640ao(TimeUnit.SECONDS, (long) m6920c());
                    this.f7351t = aoVar;
                    aoVar.f9916b = new C3640ao.C3642b() {
                        /* renamed from: a */
                        public final void mo18022a() {
                            boolean unused = C3008g.this.f7354w = true;
                        }
                    };
                    this.f7351t.mo19562a();
                    return;
                }
                return;
            }
            IAlog.m9036d("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f6749b);
            return;
        }
        IAlog.m9036d("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.m9029a((Object) this));
        throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
    }

    /* renamed from: k */
    public final void mo18264k() {
        m6923d();
    }

    /* renamed from: w */
    public final void mo18197w() {
        C3640ao aoVar;
        super.mo18197w();
        if (this.f7353v == UnitDisplayType.REWARDED && (aoVar = this.f7351t) != null) {
            aoVar.mo19564b();
        }
        C3622ad adVar = this.f7357z;
        if (adVar != null) {
            adVar.f9888c = System.currentTimeMillis();
        }
    }

    /* renamed from: x */
    public final void mo18198x() {
        C3640ao aoVar;
        super.mo18198x();
        if (this.f7353v == UnitDisplayType.REWARDED && (aoVar = this.f7351t) != null) {
            aoVar.mo19565c();
        }
        C3622ad adVar = this.f7357z;
        if (adVar != null) {
            if (adVar.f9887b == 0) {
                adVar.f9887b = System.currentTimeMillis();
            }
            if (adVar.f9888c > 0) {
                adVar.f9889d += System.currentTimeMillis() - adVar.f9888c;
                adVar.f9888c = 0;
            }
        }
    }

    /* renamed from: b */
    private void m6917b() {
        if (!this.f7347p && this.f6750c != null) {
            this.f7347p = true;
            ((InneractiveFullscreenAdEventsListener) this.f6750c).onAdDismissed(this.f6748a);
        }
    }

    /* renamed from: j */
    public final void mo18263j() {
        if (this.f7353v == UnitDisplayType.REWARDED) {
            m6913a();
        }
        m6917b();
        if (this.f6748a != null && (this.f6748a instanceof C2845j)) {
            ((C2845j) this.f6748a).mo18154a();
        }
        C3622ad adVar = this.f7357z;
        if (adVar != null && adVar.f9887b != 0) {
            String format = new SimpleDateFormat("ss:S", Locale.getDefault()).format(new Date((System.currentTimeMillis() - adVar.f9887b) - adVar.f9889d));
            adVar.f9887b = 0;
            adVar.f9888c = 0;
            adVar.f9889d = 0;
            C2836g adContent = adVar.f9886a != null ? adVar.f9886a.getAdContent() : null;
            C2968n.C2969a aVar = new C2968n.C2969a(C2967m.INTERSTITIAL_VIEW_TIME, adContent != null ? adContent.mo18130g() : null, adContent != null ? adContent.mo18129f() : null, (adContent == null || adContent.mo18132i() == null) ? null : adContent.mo18132i().mo18013b());
            aVar.mo18435a("time", format);
            aVar.mo18436b((String) null);
        }
    }

    public final void destroy() {
        if (this.f7346o) {
            m6917b();
        }
        this.f7343l = null;
        C3640ao aoVar = this.f7351t;
        if (aoVar != null) {
            aoVar.f9916b = null;
            this.f7351t = null;
        }
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo18191f() {
        int i = 2;
        if (this.f7353v == UnitDisplayType.REWARDED) {
            int c = m6920c();
            IAlog.m9034b("%sGetting rewarded total delay of %d seconds", IAlog.m9029a((Object) this), Integer.valueOf(c));
            i = c;
        } else {
            try {
                i = Integer.parseInt(IAConfigManager.m5929c().f6586a.mo18048a("mraid_x_delay", Long.toString(2)));
            } catch (Throwable unused) {
            }
        }
        return (long) (i * 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18183a(long j) {
        if (this.f7353v == UnitDisplayType.REWARDED) {
            return 0;
        }
        long j2 = 13;
        if (this.f6749b != null) {
            j2 = ((long) ((C2742b) ((C2853m) this.f6749b).mo18132i().mo18010a(C2742b.class)).mo17981a("fallback_close_btn_delay", 15)) - (j / 1000);
        }
        return j2 * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo18193h() {
        return this.f7353v != UnitDisplayType.REWARDED;
    }

    /* renamed from: c */
    private static int m6920c() {
        return IAConfigManager.m5929c().f6586a.mo18046a("rewarded_mraid_delay", 31, 30);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo18192g() {
        return !this.f7348q && this.f7345n.f7510w;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m6923d() {
        if (this.f6749b == null || this.f7345n == null) {
            IAlog.m9034b("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C3037c e = this.f7345n.mo18556e();
        layoutParams.gravity = 17;
        e.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo18261a(C2900c.C2902b bVar) {
        this.f7356y = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6913a() {
        IAlog.m9034b("%sprovide reward called", IAlog.m9029a((Object) this));
        if (this.f7355x) {
            IAlog.m9034b("%sreward was already provided", IAlog.m9029a((Object) this));
            return;
        }
        IAlog.m9034b("%sreward sent", IAlog.m9029a((Object) this));
        if (this.f7356y != null) {
            m6230a(C2688a.f6338c, C2689b.REWARDED_DISPLAY);
            this.f7356y.mo18274a();
        }
        mo18145g_();
        this.f7355x = true;
    }

    /* renamed from: i */
    public final boolean mo18262i() {
        boolean z;
        if (this.f6782h == null) {
            z = true;
        } else if (this.f7353v == UnitDisplayType.REWARDED) {
            if (this.f7354w) {
                m6913a();
            }
            z = this.f7354w;
        } else {
            z = this.f6783i;
        }
        if (!z) {
            return true;
        }
        if (this.f6782h == null) {
            return false;
        }
        this.f6782h.dismissAd(true);
        return true;
    }

    /* renamed from: B */
    static /* synthetic */ void m6891B(C3008g gVar) {
        String str;
        if (gVar.f6749b != null) {
            IAmraidWebViewController iAmraidWebViewController = gVar.f7345n;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.mo19531b();
            }
            C3018e f = ((C2853m) gVar.f6749b).mo18129f();
            if (!(f == null || (str = f.f7411n) == null || str.trim().length() <= 0)) {
                IAlog.m9033a("%sfiring impression!", IAlog.m9029a((Object) gVar));
                IAlog.m9030a(IAlog.f9871b, "AD_IMPRESSION", new Object[0]);
                gVar.mo18141b(str);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                gVar.f7345n.mo18550b("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
            }
            m6230a(C2688a.f6336a, gVar.f7353v == UnitDisplayType.REWARDED ? C2689b.REWARDED_DISPLAY : C2689b.INTERSTITIAL_DISPLAY);
            gVar.mo18147m();
            gVar.mo18195u();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m6919b(C3008g gVar, boolean z) {
        C2968n.C2969a aVar;
        if (gVar.f6749b == null) {
            aVar = new C2968n.C2969a(C2967m.MRAID_CUSTOM_CLOSE_DETECTED, (InneractiveAdRequest) null, (C3018e) null, (JSONArray) null);
        } else {
            aVar = new C2968n.C2969a(C2967m.MRAID_CUSTOM_CLOSE_DETECTED, ((C2853m) gVar.f6749b).mo18130g(), ((C2853m) gVar.f6749b).mo18129f(), ((C2853m) gVar.f6749b).mo18132i().mo18013b());
        }
        aVar.mo18433a(new C2968n.C2971b().mo18438a("fyber_close_enabled", Boolean.valueOf(z)));
        aVar.mo18436b((String) null);
    }
}
