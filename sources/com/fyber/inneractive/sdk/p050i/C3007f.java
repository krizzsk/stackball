package com.fyber.inneractive.sdk.p050i;

import android.content.Context;
import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveNativeAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a;
import com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2847l;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.p049h.C2973p;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.p058b.C3154b;
import com.fyber.inneractive.sdk.player.p058b.C3185j;
import com.fyber.inneractive.sdk.player.p083e.C3600e;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.i.f */
public final class C3007f extends C2847l<C2857q, InneractiveNativeAdEventsListener> implements C2900c, C3185j {

    /* renamed from: l */
    C2900c.C2901a f7336l;

    /* renamed from: m */
    C3600e f7337m;

    /* renamed from: n */
    C3154b f7338n;

    /* renamed from: o */
    VideoContentListener f7339o;

    /* renamed from: p */
    InneractiveAdViewUnitController f7340p;

    /* renamed from: q */
    private boolean f7341q = false;

    /* renamed from: r */
    private boolean f7342r = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18183a(long j) {
        return 0;
    }

    /* renamed from: a */
    public final void mo18261a(C2900c.C2902b bVar) {
    }

    /* renamed from: a */
    public final void mo18485a(boolean z, Orientation orientation) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18187a(C2836g gVar) {
        return false;
    }

    /* renamed from: a_ */
    public final void mo18486a_(boolean z) {
    }

    /* renamed from: b */
    public final void mo18487b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo18188b(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo18189c(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo18191f() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo18192g() {
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

    /* renamed from: w */
    public final void mo18197w() {
    }

    /* renamed from: x */
    public final void mo18198x() {
    }

    /* renamed from: a */
    public final C3685u.C3686a mo18479a(C3629aj ajVar) {
        m6860a();
        return mo18136a(this.f7337m.getContext() == null ? C3657l.m9125p() : this.f7337m.getContext(), ((C2857q) this.f6749b).mo18217c(), ajVar);
    }

    /* renamed from: a */
    private void m6860a() {
        if (this.f6749b != null && ((C2857q) this.f6749b).mo18131h() != null && ((C2857q) this.f6749b).mo18131h().mo18071h() != null) {
            IAConfigManager.m5943n().mo18086a(((C2857q) this.f6749b).mo18131h().mo18071h().mo18057a() == UnitDisplayType.REWARDED ? C2689b.REWARDED_VIDEO : C2689b.INTERSTITIAL_VIDEO, C2688a.f6337b);
        }
    }

    /* renamed from: a */
    public final void mo18484a(String str, String str2) {
        IAlog.m9034b(IAlog.m9029a((Object) this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        C2900c.C2901a aVar = this.f7336l;
        if (aVar != null && aVar.getLayout() != null && this.f7336l.getLayout().getContext() != null) {
            if (!this.f7342r) {
                C2973p.m6655a(this.f7336l.getLayout().getContext(), str, str2, this.f6749b);
                this.f7342r = true;
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
        C2917b bVar;
        if (!(this.f6749b == null || ((C2857q) this.f6749b).mo18130g() == null || ((C2857q) this.f6749b).mo18129f() == null)) {
            m6860a();
            String str2 = null;
            C2916a aVar = ((C3020g) ((C2857q) this.f6749b).mo18129f()).f7426E;
            if (!(aVar == null || (bVar = aVar.f6946g) == null || bVar.f6950b == null)) {
                str2 = bVar.f6950b.toString();
            }
            mo18139a(str2);
        }
        if (this.f7337m.getContext() == null) {
            context = C3657l.m9125p();
        } else {
            context = this.f7337m.getContext();
        }
        return mo18136a(context, str, ajVar);
    }

    /* renamed from: d */
    public final void mo18490d() {
        C2900c.C2901a aVar = this.f7336l;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    /* renamed from: a */
    public final void mo18482a(int i, int i2) {
        VideoContentListener videoContentListener = this.f7339o;
        if (videoContentListener != null) {
            videoContentListener.onProgress(i, i2);
        }
    }

    /* renamed from: l */
    public final void mo18493l() {
        VideoContentListener videoContentListener = this.f7339o;
        if (videoContentListener != null) {
            videoContentListener.onCompleted();
        }
    }

    /* renamed from: c_ */
    public final void mo18489c_() {
        C2900c.C2901a aVar = this.f7336l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        VideoContentListener videoContentListener = this.f7339o;
        if (videoContentListener != null) {
            videoContentListener.onPlayerError();
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
        C2900c.C2901a aVar = this.f7336l;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        mo18137a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
    }

    /* renamed from: j */
    public final void mo18263j() {
        C2900c.C2901a aVar;
        this.f7341q = true;
        if (!(this.f6749b == null || ((C2857q) this.f6749b).f6799a == null || (aVar = this.f7336l) == null || !aVar.wasDismissedByUser())) {
            C2933r rVar = C2933r.EVENT_COLLAPSE;
            if (this.f6749b != null) {
                ((C2857q) this.f6749b).mo18216a("EVENT_TRACKING", rVar.toString());
            }
        }
        C3154b bVar = this.f7338n;
        if (bVar != null) {
            bVar.mo18792b(false);
            this.f7338n.mo18788a();
        }
        if (this.f7340p != null) {
            IAlog.m9034b("%sunbinding native full screen ad renderer", IAlog.m9029a((Object) this));
            this.f7340p.unbindFullscreenRenderer(this);
            return;
        }
        IAlog.m9034b("%sunit controller is null!", IAlog.m9029a((Object) this));
    }

    public final void destroy() {
        if (!this.f7341q) {
            mo18263j();
        }
        C2900c.C2901a aVar = this.f7336l;
        if (aVar != null) {
            aVar.destroy();
            this.f7336l = null;
        }
        C3154b bVar = this.f7338n;
        if (bVar != null) {
            bVar.mo18788a();
            this.f7338n = null;
        }
        C3600e eVar = this.f7337m;
        if (eVar != null) {
            eVar.mo19484a();
            this.f7337m = null;
        }
        this.f7339o = null;
        this.f6749b = null;
        super.destroy();
    }

    /* renamed from: i */
    public final boolean mo18262i() {
        C2900c.C2901a aVar = this.f7336l;
        if (aVar == null) {
            return false;
        }
        aVar.dismissAd(true);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo18190e() {
        C3600e eVar = this.f7337m;
        return eVar != null && eVar.mo19496e();
    }

    /* renamed from: p */
    public final void mo18494p() {
        IAlog.m9034b("%snShownCloseButton", IAlog.m9029a((Object) this));
    }
}
