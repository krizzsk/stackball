package com.fyber.inneractive.sdk.player.p058b;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p058b.C3183i;
import com.fyber.inneractive.sdk.player.p083e.C3602g;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.b.g */
public final class C3172g extends C3174h<C3183i.C3184a> implements C3183i {

    /* renamed from: a */
    Runnable f7875a;

    /* renamed from: b */
    boolean f7876b = false;

    /* renamed from: c */
    boolean f7877c = false;

    /* renamed from: t */
    private float f7878t = (((float) this.f7886e.mo18068e().f6662b.intValue()) / 100.0f);

    /* renamed from: u */
    private float f7879u = 0.0f;

    /* renamed from: v */
    private boolean f7880v = false;

    /* renamed from: c */
    public final boolean mo18795c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo18810f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo18811g() {
        return 0;
    }

    public C3172g(C3145b bVar, C3602g gVar, C2808t tVar, C2767s sVar, boolean z) {
        super(bVar, gVar, tVar, sVar, z);
        m7589B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo18809e() {
        if (!super.mo18809e()) {
            return false;
        }
        if (!(this.f7885d == null || this.f7885d.mo18752f() == null)) {
            IAlog.m9034b("%sconnectToTextureView playing state = %s", IAlog.m9029a((Object) this), this.f7885d.mo18752f().mo18824p());
            if (this.f7885d.mo18752f().mo18799m()) {
                this.f7888g.mo19509f(!this.f7885d.mo18750d());
                this.f7888g.mo19504b(false, false);
                this.f7888g.mo19501a(false);
                m7589B();
            }
        }
        mo18842a(this.f7879u);
        return true;
    }

    /* renamed from: a */
    public final void mo18791a(boolean z) {
        Bitmap bitmap;
        if (!(this.f7885d == null || this.f7885d.mo18752f() == null || this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i))) {
            m7592z();
        }
        if (this.f7885d != null) {
            bitmap = this.f7885d.f7779g;
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            this.f7888g.mo19501a(true);
            this.f7888g.setLastFrameBitmap(bitmap);
        }
        super.mo18791a(z);
    }

    /* renamed from: e */
    public final void mo18808e(boolean z) {
        if (z) {
            mo18842a(this.f7879u);
        }
        super.mo18808e(z);
    }

    /* renamed from: o */
    public final void mo18845o() {
        super.mo18845o();
    }

    /* renamed from: b */
    public final void mo18794b(int i) {
        if (this.f7885d != null && this.f7885d.mo18752f() != null && this.f7885d.mo18752f().mo18824p() != C3608b.Playing && this.f7875a == null) {
            IAlog.m9034b("%splayVideo %s", IAlog.m9029a((Object) this), this.f7888g);
            if (i == 0) {
                mo18843f(false);
                return;
            }
            this.f7875a = new Runnable() {
                public final void run() {
                    C3172g.this.mo18843f(false);
                    C3172g.this.f7875a = null;
                }
            };
            this.f7888g.postDelayed(this.f7875a, (long) i);
        }
    }

    /* renamed from: b */
    public final void mo18793b() {
        m7591y();
        super.mo18793b();
    }

    /* renamed from: a */
    public final void mo18788a() {
        m7591y();
        this.f7891j = null;
        super.mo18788a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo18813i() {
        return IAConfigManager.m5929c().f6586a.mo18046a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    /* renamed from: y */
    private void m7591y() {
        if (this.f7875a != null) {
            IAlog.m9034b("%sCancelling play runnable", IAlog.m9029a((Object) this));
            this.f7888g.removeCallbacks(this.f7875a);
            this.f7875a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo18815k() {
        super.mo18815k();
        m7592z();
        this.f7888g.mo19501a(false);
        this.f7876b = true;
    }

    /* renamed from: z */
    private void m7592z() {
        if (this.f7886e.mo18070g().mo18079g() != TapAction.FULLSCREEN) {
            C3602g gVar = this.f7888g;
            if (gVar.f9815t != null) {
                gVar.f9815t.setVisibility(0);
                gVar.f9815t.setSelected(false);
            }
        }
        this.f7888g.mo19502a(true, ((C2746f) this.f7887f.mo18010a(C2746f.class)).mo17984a("cta_text_all_caps", false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo18846p() {
        super.mo18846p();
        m7591y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo18812h() {
        if (this.f7885d != null && this.f7885d.mo18752f() != null) {
            mo18809e();
            mo18843f(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo18847q() {
        m7591y();
        super.mo18847q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18807a(C3629aj ajVar) {
        TapAction g = this.f7886e.mo18070g().mo18079g();
        if (this.f7885d != null && this.f7885d.mo18752f() != null && this.f7879u < this.f7878t) {
            return;
        }
        if (g == TapAction.CTR) {
            Bitmap b = mo18792b(false);
            if (super.mo18852a(false, VideoClickOrigin.CTA, ajVar) && b != null) {
                this.f7888g.setLastFrameBitmap(b);
                this.f7888g.mo19501a(true);
            }
        } else if (g == TapAction.FULLSCREEN) {
            m7588A();
        } else if (g != TapAction.DO_NOTHING) {
            IAlog.m9034b("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m9029a((Object) this), g);
        } else if (this.f7885d != null) {
            this.f7885d.mo18751e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo18817m() {
        m7588A();
    }

    /* renamed from: A */
    private void m7588A() {
        if (this.f7891j != null && !this.f7880v) {
            mo18847q();
            ((C3183i.C3184a) this.f7891j).mo18481a();
            IAlog.m9034b("%sopening fullscreen", IAlog.m9029a((Object) this));
            this.f7880v = true;
            if (this.f7885d != null) {
                this.f7885d.mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_FULLSCREEN, C2933r.EVENT_EXPAND);
            }
        }
    }

    /* renamed from: a */
    public final void mo18842a(float f) {
        this.f7879u = f;
        if (IAlog.f9870a >= 3) {
            IAlog.m9035c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.m9029a((Object) this), Float.valueOf(f), Float.valueOf(this.f7878t), Float.valueOf(1.0f - this.f7878t));
        }
        if (this.f7885d != null && this.f7885d.mo18752f() != null) {
            if (this.f7885d.mo18752f().mo18824p() != C3608b.Playing) {
                m7590C();
            } else if (f <= this.f7878t) {
                IAlog.m9033a("%sonVisibilityChanged pausing player", IAlog.m9029a((Object) this));
                if (this.f7885d.mo18752f().f7857m != null) {
                    this.f7876b = false;
                    mo18792b(false);
                    mo18793b();
                    mo18853h(false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo18848r() {
        super.mo18848r();
        m7590C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo18843f(boolean z) {
        if (this.f7885d != null && this.f7885d.mo18752f() != null) {
            m7589B();
            super.mo18843f(z);
        }
    }

    /* renamed from: B */
    private void m7589B() {
        if (this.f7885d != null && this.f7885d.mo18752f() != null && !this.f7885d.mo18752f().mo18825q()) {
            if (this.f7886e.mo18070g().mo18075b().booleanValue()) {
                this.f7885d.mo18752f().mo18773a(false);
            } else if (!mo18856v()) {
                this.f7885d.mo18752f().mo18775b(false);
            }
        }
    }

    /* renamed from: g */
    public final void mo18844g(boolean z) {
        this.f7877c = z;
        if (z && this.f7885d != null && this.f7885d.mo18752f() != null && this.f7885d.mo18752f().f7857m == null && this.f7888g.mo19486b() && !this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i)) {
            mo18809e();
            mo18842a(this.f7879u);
        }
    }

    /* renamed from: C */
    private void m7590C() {
        if (this.f7879u >= this.f7878t && this.f7885d != null && this.f7885d.mo18752f() != null && !this.f7885d.mo18752f().mo18824p().equals(C3608b.f9847i) && this.f7888g != null && !this.f7888g.mo19496e() && this.f7885d.mo18752f().f7857m != null) {
            if (this.f7886e.mo18070g().mo18073a().booleanValue() || this.f7876b) {
                mo18794b(IAConfigManager.f6419n.f6436h.f6608c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18814j() {
        IAlog.m9034b("%s onBufferingTimeout reached. Skipping to end card", IAlog.m9029a((Object) this));
        if (this.f7888g.mo19486b()) {
            this.f7898q = true;
            mo18797d(false);
        }
    }

    /* renamed from: s */
    public final void mo18849s() {
        IAlog.m9034b("%sfullscreenExited called", IAlog.m9029a((Object) this));
        this.f7880v = false;
        mo18844g(this.f7877c);
        if (this.f7885d != null && this.f7885d.mo18752f() != null) {
            mo18743a(this.f7885d.mo18752f().mo18824p());
            mo18837a(this.f7885d.mo18752f().mo18782g());
        }
    }
}
