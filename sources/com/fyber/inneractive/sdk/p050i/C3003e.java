package com.fyber.inneractive.sdk.p050i;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.p032b.C2722c;
import com.fyber.inneractive.sdk.p033c.C2723a;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2837h;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p045e.C2899b;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p049h.C2973p;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.C3304d;
import com.fyber.inneractive.sdk.player.C3312g;
import com.fyber.inneractive.sdk.player.p058b.C3183i;
import com.fyber.inneractive.sdk.player.p083e.C3600e;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.C3691w;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.i.e */
public final class C3003e extends C2837h<C2857q, InneractiveAdViewEventsListener> implements C2899b, InneractiveNativeVideoContentController.Renderer, C3691w.C3696b {

    /* renamed from: h */
    FrameLayout f7320h;

    /* renamed from: i */
    C3600e f7321i;

    /* renamed from: j */
    C3183i f7322j;

    /* renamed from: k */
    VideoContentListener f7323k;

    /* renamed from: l */
    ViewGroup f7324l;

    /* renamed from: m */
    Runnable f7325m;

    /* renamed from: n */
    private final C3145b.C3151a f7326n = new C3145b.C3151a() {
        /* renamed from: a */
        public final void mo18475a() {
            if (C3003e.this.f7322j != null) {
                C3003e.this.f7322j.mo18791a(false);
                C3003e.this.f7322j.mo18796d();
            }
        }

        /* renamed from: a */
        public final void mo18476a(Bitmap bitmap) {
            if (bitmap != null && C3003e.this.f7322j != null) {
                C3003e.this.f7322j.mo18789a(bitmap);
            }
        }

        /* renamed from: a */
        public final void mo18477a(C3145b bVar) {
            if (C3003e.this.f7323k != null && C3003e.this.f7321i != null && C3003e.this.f7321i.mo19486b()) {
                C3003e.this.f7323k.onPlayerError();
            }
        }
    };

    /* renamed from: o */
    private C3013i f7327o;

    /* renamed from: p */
    private float f7328p = 0.0f;

    /* renamed from: q */
    private Rect f7329q = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f7330r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7331s = false;

    /* renamed from: t */
    private final C3183i.C3184a f7332t = new C3183i.C3184a() {
        /* renamed from: a */
        public final void mo18485a(boolean z, Orientation orientation) {
        }

        /* renamed from: a_ */
        public final void mo18486a_(boolean z) {
        }

        /* renamed from: d */
        public final void mo18490d() {
        }

        /* renamed from: p */
        public final void mo18494p() {
        }

        /* renamed from: a */
        public final void mo18481a() {
            if (C3003e.this.f6750c != null) {
                ((InneractiveAdViewEventsListener) C3003e.this.f6750c).onAdExpanded(C3003e.this.f6748a);
            }
            if (C3003e.this.f7324l != null && C3003e.this.f7324l.getContext() != null && (C2723a.m5894a(C3003e.this.f6749b) instanceof C2722c)) {
                Context context = C3003e.this.f7324l.getContext();
                InneractiveAdSpot g = C3003e.this.f6748a;
                Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                intent.putExtra(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, g.getLocalUniqueId());
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                try {
                    IAlog.m9034b("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m9029a((Object) context), g.getLocalUniqueId());
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    IAlog.m9035c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m9029a((Object) context));
                }
            }
        }

        /* renamed from: a */
        public final void mo18484a(String str, String str2) {
            IAlog.m9034b("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.m9029a((Object) C3003e.this));
            if (C3003e.this.f7324l != null && C3003e.this.f7324l.getContext() != null) {
                if (!C3003e.this.f7331s) {
                    C2973p.m6655a(C3003e.this.f7324l.getContext(), str, str2, C3003e.this.f6749b);
                    boolean unused = C3003e.this.f7331s = true;
                    IAlog.m9034b("%s reporting auto redirect", IAlog.m9029a((Object) C3003e.this));
                    return;
                }
                IAlog.m9034b("%s redirect already reported for this ad", IAlog.m9029a((Object) C3003e.this));
            }
        }

        /* renamed from: a */
        public final void mo18483a(View view, String str) {
            if (view != null && view.getContext() != null) {
                InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
                C3003e.this.mo18148n();
            }
        }

        /* renamed from: b */
        public final void mo18487b() {
            if (!((C2857q) C3003e.this.f6749b).f6800b) {
                ((C2857q) C3003e.this.f6749b).f6800b = true;
                C3003e.this.mo18147m();
            }
        }

        /* renamed from: a */
        public final C3685u.C3686a mo18479a(C3629aj ajVar) {
            Context context;
            C3003e eVar = C3003e.this;
            if (eVar.f7321i.getContext() == null) {
                context = C3657l.m9125p();
            } else {
                context = C3003e.this.f7321i.getContext();
            }
            return eVar.mo18136a(context, ((C2857q) C3003e.this.f6749b).mo18217c(), ajVar);
        }

        /* renamed from: c */
        public final void mo18488c() {
            C2917b bVar;
            if (C3003e.this.f6749b != null && ((C2857q) C3003e.this.f6749b).mo18130g() != null && ((C2857q) C3003e.this.f6749b).mo18129f() != null) {
                String str = null;
                C2916a aVar = ((C3020g) ((C2857q) C3003e.this.f6749b).mo18129f()).f7426E;
                if (!(aVar == null || (bVar = aVar.f6946g) == null || bVar.f6950b == null)) {
                    str = bVar.f6950b.toString();
                }
                C3003e.this.mo18139a(str);
            }
        }

        /* renamed from: a */
        public final C3685u.C3686a mo18480a(String str, C3629aj ajVar) {
            C2917b bVar;
            if (!(C3003e.this.f6749b == null || ((C2857q) C3003e.this.f6749b).mo18130g() == null || ((C2857q) C3003e.this.f6749b).mo18129f() == null)) {
                String str2 = null;
                C2916a aVar = ((C3020g) ((C2857q) C3003e.this.f6749b).mo18129f()).f7426E;
                if (!(aVar == null || (bVar = aVar.f6946g) == null || bVar.f6950b == null)) {
                    str2 = bVar.f6950b.toString();
                }
                C3003e.this.mo18139a(str2);
            }
            Context p = C3657l.m9125p();
            if (!(C3003e.this.f7324l == null || C3003e.this.f7324l.getContext() == null)) {
                p = C3003e.this.f7324l.getContext();
            }
            if (TextUtils.isEmpty(str)) {
                str = ((C2857q) C3003e.this.f6749b).mo18218e();
            }
            return C3003e.this.mo18136a(p, str, ajVar);
        }

        /* renamed from: a */
        public final void mo18482a(int i, int i2) {
            if (C3003e.this.f7323k != null && C3003e.this.f7321i != null && C3003e.this.f7321i.mo19486b()) {
                C3003e.this.f7323k.onProgress(i, i2);
            }
        }

        /* renamed from: l */
        public final void mo18493l() {
            if (C3003e.this.f7323k != null && C3003e.this.f7321i != null && C3003e.this.f7321i.mo19486b()) {
                C3003e.this.f7323k.onCompleted();
            }
        }

        /* renamed from: c_ */
        public final void mo18489c_() {
            if (C3003e.this.f7323k != null && C3003e.this.f7321i != null && C3003e.this.f7321i.mo19486b()) {
                C3003e.this.f7323k.onPlayerError();
            }
        }

        /* renamed from: d_ */
        public final void mo18491d_() {
            if (C3003e.this.f6750c != null) {
                C3003e.this.mo18148n();
            }
        }

        /* renamed from: e_ */
        public final void mo18492e_() {
            C3003e.this.mo18137a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        }
    };

    /* renamed from: a */
    public final void mo18231a(int i) {
    }

    /* renamed from: c */
    public final void mo18236c() {
    }

    /* renamed from: g */
    public final int mo18240g() {
        return 0;
    }

    /* renamed from: h */
    public final int mo18241h() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo18234a(C2836g gVar) {
        return gVar instanceof C2857q;
    }

    /* renamed from: a */
    public final void mo18232a(ViewGroup viewGroup) {
        if (this.f6748a == null) {
            IAlog.m9036d("%sYou must set the spot to render before calling renderAd", IAlog.m9029a((Object) this));
            return;
        }
        this.f7324l = viewGroup;
        InneractiveUnitController selectedUnitController = this.f6748a.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.m9036d("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.m9029a((Object) this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.f7323k = (VideoContentListener) ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.m9036d("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m9029a((Object) this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.f7331s = false;
        this.f7320h = new FrameLayout(viewGroup.getContext());
        C3312g gVar = ((C2857q) this.f6749b).f6799a;
        Context context = viewGroup.getContext();
        if (gVar != null) {
            C3013i a = gVar.mo19112a(false);
            this.f7327o = a;
            this.f7321i = a.mo18449a(context);
            this.f7322j = (C3183i) this.f7327o.mo18448a(this.f6748a, (C2857q) this.f6749b);
            this.f7324l.addView(this.f7320h, new ViewGroup.LayoutParams(-1, -2));
            this.f7324l.setLayoutTransition((LayoutTransition) null);
            this.f7320h.addView((View) this.f7321i, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f7322j.mo18790a(this.f7332t);
            this.f7322j.mo18791a(this.f7327o.mo18451a());
            this.f7327o.mo18450a(this.f7326n);
            if (this.f7327o instanceof C2991a) {
                C3304d dVar = (C3304d) gVar.f8554d;
                Bitmap bitmap = dVar.f7779g;
                if (bitmap != null) {
                    this.f7322j.mo18789a(bitmap);
                }
                dVar.mo18748c();
            }
            C3691w a2 = C3691w.m9191a();
            ViewGroup viewGroup2 = this.f7324l;
            a2.mo19598a(viewGroup2.getContext(), (View) viewGroup2, (C3691w.C3696b) this);
        }
    }

    public final void destroy() {
        mo18238e();
        super.destroy();
    }

    public final void playVideo() {
        C3183i iVar = this.f7322j;
        if (iVar != null) {
            iVar.mo18794b(0);
        }
    }

    public final void pauseVideo() {
        C3183i iVar = this.f7322j;
        if (iVar != null) {
            iVar.mo18793b();
        }
    }

    /* renamed from: a */
    public final void mo18474a(float f, Rect rect) {
        if (this.f7328p != f || !this.f7329q.equals(rect)) {
            this.f7328p = f;
            this.f7329q.set(rect);
            this.f7330r = false;
            C3183i iVar = this.f7322j;
            if (iVar != null) {
                iVar.mo18844g(false);
                this.f7321i.mo19487c();
                this.f7322j.mo18842a(f);
            }
            if (f > 0.0f) {
                m6802a();
                C30052 r3 = new Runnable() {
                    public final void run() {
                        if (C3003e.this.f7325m != null) {
                            boolean unused = C3003e.this.f7330r = true;
                            IAlog.m9034b("%sIdle state reached!", IAlog.m9029a((Object) C3003e.this));
                            if (C3003e.this.f7322j != null) {
                                C3003e.this.f7322j.mo18844g(true);
                            }
                            C3003e.this.f7325m = null;
                        }
                    }
                };
                this.f7325m = r3;
                this.f7324l.postDelayed(r3, 100);
                return;
            }
            m6802a();
        }
    }

    /* renamed from: a */
    private void m6802a() {
        ViewGroup viewGroup;
        Runnable runnable = this.f7325m;
        if (runnable != null && (viewGroup = this.f7324l) != null) {
            viewGroup.removeCallbacks(runnable);
            this.f7325m = null;
        }
    }

    /* renamed from: e */
    public final void mo18238e() {
        m6802a();
        C3691w.m9191a().mo19599a(this.f7324l);
        IAlog.m9034b("%sunbind called. root is %s", IAlog.m9029a((Object) this), this.f7324l);
        if (this.f7322j != null) {
            IAlog.m9034b("%sdestroying video ui controller", IAlog.m9029a((Object) this));
            this.f7322j.mo18790a(null);
            this.f7322j.mo18788a();
            this.f7322j = null;
        }
        if (this.f7321i != null) {
            this.f7324l.setLayoutTransition((LayoutTransition) null);
            this.f7324l.removeView(this.f7320h);
            this.f7321i.mo19484a();
            this.f7321i = null;
        }
    }

    /* renamed from: a */
    public final boolean mo18233a(View view) {
        return view.equals(this.f7324l);
    }

    /* renamed from: d */
    public final void mo18237d() {
        C3183i iVar = this.f7322j;
        if (iVar != null) {
            iVar.mo18791a(false);
        }
    }

    /* renamed from: f */
    public final void mo18239f() {
        C3183i iVar = this.f7322j;
        if (iVar != null) {
            iVar.mo18849s();
        }
    }
}
