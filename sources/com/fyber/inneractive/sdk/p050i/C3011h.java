package com.fyber.inneractive.sdk.p050i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.C2789g;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2845j;
import com.fyber.inneractive.sdk.p037d.C2847l;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2922g;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.p049h.C2973p;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.C3312g;
import com.fyber.inneractive.sdk.player.p058b.C3154b;
import com.fyber.inneractive.sdk.player.p058b.C3185j;
import com.fyber.inneractive.sdk.player.p083e.C3600e;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.i.h */
public final class C3011h extends C2847l<C2857q, InneractiveFullscreenAdEventsListener> implements C2900c, C3185j {

    /* renamed from: l */
    C2900c.C2901a f7360l;

    /* renamed from: m */
    C3600e f7361m;

    /* renamed from: n */
    C3154b f7362n;

    /* renamed from: o */
    WeakReference<InneractiveFullscreenVideoContentController> f7363o;

    /* renamed from: p */
    boolean f7364p = false;

    /* renamed from: q */
    private boolean f7365q = false;

    /* renamed from: r */
    private boolean f7366r = false;

    /* renamed from: s */
    private C2900c.C2902b f7367s;

    /* renamed from: t */
    private UnitDisplayType f7368t = UnitDisplayType.INTERSTITIAL;

    /* renamed from: u */
    private C3013i f7369u;

    /* renamed from: v */
    private final C3145b.C3151a f7370v = new C3145b.C3151a() {
        /* renamed from: a */
        public final void mo18475a() {
            C3011h.this.f7362n.mo18791a(false);
            C3011h.this.f7362n.mo18796d();
        }

        /* renamed from: a */
        public final void mo18476a(Bitmap bitmap) {
            if (bitmap != null) {
                C3011h.this.f7362n.mo18789a(bitmap);
            }
        }

        /* renamed from: a */
        public final void mo18477a(C3145b bVar) {
            if (C3011h.this.f7362n != null) {
                C3011h.this.f7362n.mo18788a();
            }
            if (C3011h.this.f6749b != null) {
                ((C2857q) C3011h.this.f6749b).mo18127b();
            }
            if (bVar != null) {
                bVar.mo18738a();
            }
            C3011h.this.mo18489c_();
        }
    };

    /* renamed from: w */
    private final RelativeLayout.LayoutParams f7371w = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: x */
    private boolean f7372x = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18187a(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo18188b(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo18193h() {
        return false;
    }

    /* renamed from: k */
    public final void mo18264k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ boolean mo18189c(C2836g gVar) {
        C2916a aVar;
        boolean z;
        C2857q qVar = (C2857q) gVar;
        if (IAConfigManager.m5929c().f6586a.mo18047a(IAConfigManager.m5940k()).f6583a.containsKey(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD) || qVar.mo18129f() == null || (aVar = ((C3020g) qVar.mo18129f()).f7426E) == null || aVar.f6946g == null || aVar.f6946g.f6949a != C2922g.Static) {
            return false;
        }
        C2746f fVar = (C2746f) qVar.mo18132i().mo18010a(C2746f.class);
        int i = C2746f.C27471.f6473a[this.f7368t.ordinal()];
        if (i == 1) {
            z = fVar.mo17984a("countdown_rv", false);
        } else if (i != 2) {
            return false;
        } else {
            z = fVar.mo17984a("countdown_iv", false);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo18185a(C2900c.C2901a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.mo18185a(aVar, activity);
        this.f7360l = aVar;
        this.f7365q = false;
        this.f7366r = false;
        this.f7372x = false;
        InneractiveUnitController selectedUnitController = this.f6748a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (!(selectedUnitController instanceof InneractiveFullscreenUnitController)) {
                IAlog.m9036d("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", IAlog.m9029a((Object) this));
            } else {
                InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof InneractiveFullscreenVideoContentController) {
                        this.f7363o = new WeakReference<>((InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        IAlog.m9036d("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m9029a((Object) this), selectedContentController.getClass().getSimpleName());
                    }
                }
            }
        }
        C2809u h = this.f6748a.getAdContent().mo18131h();
        if (!(h == null || h.mo18070g() == null)) {
            this.f7368t = h.mo18070g().mo18080h();
        }
        C3312g gVar = ((C2857q) this.f6749b).f6799a;
        Context context = this.f7360l.getLayout().getContext();
        if (gVar != null) {
            if (gVar.f8554d != null && gVar.f8554d.mo18671b()) {
                C3013i a = gVar.mo19112a(true);
                this.f7369u = a;
                this.f7361m = a.mo18449a(context);
                C3154b a2 = this.f7369u.mo18448a(this.f6748a, (C2857q) this.f6749b);
                this.f7362n = a2;
                a2.mo18791a(this.f7369u.mo18451a());
                this.f7362n.mo18790a(this);
                this.f7361m.mo19487c();
                this.f7371w.addRule(13);
                this.f7360l.getLayout().addView((View) this.f7361m, this.f7371w);
                this.f7369u.mo18450a(this.f7370v);
                this.f7365q = true;
                return;
            }
            IAlog.m9036d("%sFull screen video ad renderer is not valid.", IAlog.m9029a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
        }
    }

    /* renamed from: a */
    public final void mo18261a(C2900c.C2902b bVar) {
        this.f7367s = bVar;
    }

    /* renamed from: b */
    public final void mo18487b() {
        IAConfigManager.m5943n().mo18086a(this.f7368t == UnitDisplayType.INTERSTITIAL ? C2689b.INTERSTITIAL_VIDEO : C2689b.REWARDED_VIDEO, C2688a.f6336a);
        mo18147m();
    }

    /* renamed from: a */
    public final C3685u.C3686a mo18479a(C3629aj ajVar) {
        Context context;
        m6978y();
        if (this.f7361m.getContext() == null) {
            context = C3657l.m9125p();
        } else {
            context = this.f7361m.getContext();
        }
        return mo18136a(context, ((C2857q) this.f6749b).mo18217c(), ajVar);
    }

    /* renamed from: y */
    private void m6978y() {
        if (this.f6749b != null && ((C2857q) this.f6749b).mo18131h() != null && ((C2857q) this.f6749b).mo18131h().mo18071h() != null) {
            IAConfigManager.m5943n().mo18086a(((C2857q) this.f6749b).mo18131h().mo18071h().mo18057a() == UnitDisplayType.REWARDED ? C2689b.REWARDED_VIDEO : C2689b.INTERSTITIAL_VIDEO, C2688a.f6337b);
        }
    }

    /* renamed from: p */
    public final void mo18494p() {
        this.f7364p = true;
        if (this.f6785k != null) {
            this.f6785k.cancel();
            this.f6785k = null;
        }
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null && aVar.isCloseButtonDisplay()) {
            mo18186a(true);
        }
    }

    /* renamed from: a */
    public final void mo18485a(boolean z, Orientation orientation) {
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    /* renamed from: a */
    public final void mo18484a(String str, String str2) {
        IAlog.m9034b(IAlog.m9029a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null && aVar.getLayout() != null && this.f7360l.getLayout().getContext() != null) {
            if (!this.f7372x) {
                C2973p.m6655a(this.f7360l.getLayout().getContext(), str, str2, this.f6749b);
                this.f7372x = true;
                IAlog.m9034b(IAlog.m9029a((Object) this) + "reporting auto redirect", new Object[0]);
                return;
            }
            IAlog.m9034b(IAlog.m9029a((Object) this) + "redirect already reported for this ad", new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo18488c() {
        C2917b bVar;
        if (this.f6749b != null && ((C2857q) this.f6749b).mo18130g() != null && ((C2857q) this.f6749b).mo18129f() != null) {
            String str = null;
            m6978y();
            C2916a aVar = ((C3020g) ((C2857q) this.f6749b).mo18129f()).f7426E;
            if (!(aVar == null || (bVar = aVar.f6946g) == null || bVar.f6950b == null)) {
                str = bVar.f6950b.toString();
            }
            mo18139a(str);
        }
    }

    /* renamed from: a */
    public final C3685u.C3686a mo18480a(String str, C3629aj ajVar) {
        Context context;
        if (!(this.f6749b == null || ((C2857q) this.f6749b).mo18129f() == null || ((C2857q) this.f6749b).mo18129f() == null)) {
            C2916a aVar = ((C3020g) ((C2857q) this.f6749b).mo18129f()).f7426E;
            m6978y();
            if (aVar != null) {
                C2917b bVar = aVar.f6946g;
                String str2 = null;
                if (!(bVar == null || bVar.f6950b == null)) {
                    str2 = bVar.f6950b.toString();
                }
                mo18139a(str2);
                if (this.f7361m.getContext() == null) {
                    context = C3657l.m9125p();
                } else {
                    context = this.f7361m.getContext();
                }
                C3685u.C3686a a = mo18136a(context, str, ajVar);
                if (!(bVar == null || a.f9977a == C3685u.C3688c.FAILED)) {
                    ((C2857q) this.f6749b).mo18216a("EVENT_TRACKING", C2933r.EVENT_CLICK.toString());
                }
                return a;
            }
        }
        return new C3685u.C3686a(C3685u.C3688c.FAILED, new Exception("Internal SDK Error"), "null");
    }

    /* renamed from: d */
    public final void mo18490d() {
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: a */
    public final void mo18482a(int i, int i2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C3670q.m9152a(this.f7363o);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    /* renamed from: l */
    public final void mo18493l() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C3670q.m9152a(this.f7363o);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        IAConfigManager.m5943n().mo18086a(this.f7368t == UnitDisplayType.REWARDED ? C2689b.REWARDED_VIDEO : C2689b.INTERSTITIAL_VIDEO, C2688a.f6338c);
        if (this.f7368t == UnitDisplayType.REWARDED) {
            C2900c.C2902b bVar = this.f7367s;
            if (bVar != null) {
                bVar.mo18274a();
            }
            mo18145g_();
        }
        if (((C2857q) this.f6749b).f6799a != null) {
            mo18195u();
        }
    }

    /* renamed from: a_ */
    public final void mo18486a_(boolean z) {
        C2900c.C2901a aVar;
        if (((C2857q) this.f6749b).f6799a != null) {
            ((C2857q) this.f6749b).f6799a.mo19113a("TRACKING_COMPLETED", new String[0]);
            mo18195u();
            ((C2857q) this.f6749b).mo18216a("TRACKING_COMPLETED", new String[0]);
            if (IAConfigManager.m5929c().f6586a.mo18050b(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).mo18043b("dsos") && z && (aVar = this.f7360l) != null) {
                aVar.dismissAd(true);
            }
        }
    }

    /* renamed from: c_ */
    public final void mo18489c_() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) C3670q.m9152a(this.f7363o);
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    /* renamed from: a */
    public final void mo18483a(View view, String str) {
        if (view != null && view.getContext() != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            mo18148n();
        }
    }

    /* renamed from: d_ */
    public final void mo18491d_() {
        mo18148n();
    }

    /* renamed from: e_ */
    public final void mo18492e_() {
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        mo18137a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: j */
    public final void mo18263j() {
        m6979z();
        if (this.f6748a != null && (this.f6748a instanceof C2845j)) {
            ((C2845j) this.f6748a).mo18154a();
        }
    }

    /* renamed from: z */
    private void m6979z() {
        if (!this.f7366r && this.f6750c != null) {
            this.f7366r = true;
            C2900c.C2901a aVar = this.f7360l;
            if (aVar != null && aVar.wasDismissedByUser()) {
                m6976a(C2933r.EVENT_CLOSE);
                m6976a(C2933r.EVENT_CLOSE_LINEAR);
            }
            ((InneractiveFullscreenAdEventsListener) this.f6750c).onAdDismissed(this.f6748a);
        }
    }

    public final void destroy() {
        C2900c.C2901a aVar = this.f7360l;
        if (aVar != null) {
            aVar.destroy();
        }
        if (this.f7365q) {
            m6979z();
        }
        C3154b bVar = this.f7362n;
        if (bVar != null) {
            bVar.mo18788a();
            this.f7362n = null;
        }
        C3600e eVar = this.f7361m;
        if (eVar != null) {
            eVar.mo19484a();
            this.f7361m = null;
        }
        this.f7360l = null;
        this.f7363o = null;
        super.destroy();
    }

    /* renamed from: i */
    public final boolean mo18262i() {
        if (this.f6749b == null || ((C2857q) this.f6749b).f6799a == null || this.f7362n == null || this.f7360l == null || this.f7361m == null) {
            return false;
        }
        C3312g gVar = ((C2857q) this.f6749b).f6799a;
        gVar.f8554d.mo18669a(this, this.f7362n, this.f7361m, this.f7360l);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo18190e() {
        C3600e eVar = this.f7361m;
        return eVar != null && eVar.mo19496e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo18191f() {
        C2916a aVar;
        C2789g b = IAConfigManager.m5929c().f6586a.mo18050b(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        String str = "endcard_cr";
        if (b.mo18042a(str) || b.mo18042a("endcard_ci")) {
            if (this.f7368t != UnitDisplayType.REWARDED) {
                str = "endcard_ci";
            }
            long d = b.mo18045d(str);
            if (d < 0 || d > 5) {
                return 3000;
            }
            return d * 1000;
        }
        long j = 3;
        try {
            j = Long.parseLong(IAConfigManager.m5929c().f6586a.mo18048a("vast_endcard_x_delay", Long.toString(3)));
        } catch (Throwable unused) {
        }
        if (!(this.f6749b == null || ((C2857q) this.f6749b).mo18129f() == null || (aVar = ((C3020g) ((C2857q) this.f6749b).mo18129f()).f7426E) == null || aVar.f6946g == null || aVar.f6946g.f6949a != C2922g.Static)) {
            C2746f fVar = (C2746f) ((C2857q) this.f6749b).mo18132i().mo18010a(C2746f.class);
            int i = C2746f.C27471.f6473a[this.f7368t.ordinal()];
            int i2 = 3;
            if (i == 1) {
                i2 = fVar.mo17981a("endcard_x_btn_delay_rv", 3);
            } else if (i == 2) {
                i2 = fVar.mo17981a("endcard_x_btn_delay_iv", 3);
            }
            j = (long) i2;
        }
        return j * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18183a(long j) {
        long j2 = 12;
        try {
            j2 = Long.parseLong(IAConfigManager.m5929c().f6586a.mo18048a("vast_endcard_x_fallback_delay", Long.toString(12)));
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo18192g() {
        return this.f7364p;
    }

    /* renamed from: a */
    private void m6976a(C2933r rVar) {
        if (this.f6749b != null && ((C2857q) this.f6749b).f6799a != null) {
            ((C2857q) this.f6749b).mo18216a("EVENT_TRACKING", rVar.f7056w);
        }
    }

    /* renamed from: a */
    public final boolean mo18230a() {
        return this.f6783i;
    }
}
