package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.my.target.t8 */
public class C7679t8 {

    /* renamed from: a */
    public boolean f19434a;

    /* renamed from: b */
    public C7599p3 f19435b;

    /* renamed from: c */
    public Set<C7303a3> f19436c;

    /* renamed from: d */
    public C7343c3 f19437d;

    /* renamed from: e */
    public Context f19438e;

    /* renamed from: f */
    public String f19439f;

    /* renamed from: g */
    public C7680a f19440g;

    /* renamed from: h */
    public float f19441h;

    /* renamed from: i */
    public boolean f19442i = true;

    /* renamed from: com.my.target.t8$a */
    public interface C7680a {
        /* renamed from: a */
        void mo49471a();
    }

    public C7679t8(C7413g2 g2Var, C7599p3 p3Var, Context context) {
        this.f19435b = p3Var;
        if (context != null) {
            this.f19438e = context.getApplicationContext();
        }
        if (g2Var != null) {
            this.f19437d = g2Var.getStatHolder();
            this.f19436c = g2Var.getStatHolder().mo49807c();
            this.f19439f = g2Var.getId();
            this.f19441h = g2Var.getDuration();
            this.f19442i = g2Var.isLogErrors();
        }
    }

    /* renamed from: a */
    public static C7679t8 m20486a(C7413g2 g2Var, C7599p3 p3Var, Context context) {
        return new C7679t8(g2Var, p3Var, context);
    }

    /* renamed from: b */
    public static C7679t8 m20487b() {
        return new C7679t8((C7413g2) null, (C7599p3) null, (Context) null);
    }

    /* renamed from: a */
    public void mo51600a(float f, float f2) {
        if (!mo51606a()) {
            if (!this.f19434a) {
                C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("playbackStarted"), this.f19438e);
                C7680a aVar = this.f19440g;
                if (aVar != null) {
                    aVar.mo49471a();
                }
                this.f19434a = true;
            }
            if (!this.f19436c.isEmpty()) {
                Iterator<C7303a3> it = this.f19436c.iterator();
                while (it.hasNext()) {
                    C7303a3 next = it.next();
                    if (C7489j8.m19522a(next.mo49575e(), f) <= 0) {
                        C7741x8.m20825c((C7328b3) next, this.f19438e);
                        it.remove();
                    }
                }
            }
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51327b(f, f2);
            }
            if (this.f19441h > 0.0f && f2 > 0.0f && !TextUtils.isEmpty(this.f19439f) && this.f19442i && Math.abs(f2 - this.f19441h) > 1.5f) {
                C7498k3 a = C7498k3.m19572a("Bad value");
                a.mo50704d("Media duration error: expected " + this.f19441h + ", but was " + f2).mo50703c(this.f19439f).mo50702b(this.f19438e);
                this.f19442i = false;
            }
        }
    }

    /* renamed from: a */
    public void mo51601a(Context context) {
        this.f19438e = context;
    }

    /* renamed from: a */
    public void mo51602a(C7413g2 g2Var) {
        if (g2Var != null) {
            if (g2Var.getStatHolder() != this.f19437d) {
                this.f19434a = false;
            }
            this.f19437d = g2Var.getStatHolder();
            this.f19436c = g2Var.getStatHolder().mo49807c();
            this.f19442i = g2Var.isLogErrors();
        } else {
            this.f19437d = null;
            this.f19436c = null;
        }
        this.f19439f = null;
        this.f19441h = 0.0f;
    }

    /* renamed from: a */
    public void mo51603a(C7599p3 p3Var) {
        this.f19435b = p3Var;
    }

    /* renamed from: a */
    public void mo51604a(C7680a aVar) {
        this.f19440g = aVar;
    }

    /* renamed from: a */
    public void mo51605a(boolean z) {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a(z ? "fullscreenOn" : "fullscreenOff"), this.f19438e);
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51325a(z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo51606a() {
        return this.f19438e == null || this.f19437d == null || this.f19436c == null;
    }

    /* renamed from: b */
    public void mo51607b(float f, float f2) {
        C7343c3 c3Var;
        String str;
        if (C7489j8.m19522a(f, f2) != 0) {
            if (!mo51606a()) {
                if (C7489j8.m19522a(0.0f, f) == 0) {
                    c3Var = this.f19437d;
                    str = "volumeOn";
                } else if (C7489j8.m19522a(0.0f, f2) == 0) {
                    c3Var = this.f19437d;
                    str = "volumeOff";
                }
                C7741x8.m20827c((List<C7328b3>) c3Var.mo49800a(str), this.f19438e);
            }
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51320a(f2);
            }
        }
    }

    /* renamed from: b */
    public void mo51608b(boolean z) {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a(z ? "volumeOn" : "volumeOff"), this.f19438e);
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51320a(z ? 1.0f : 0.0f);
            }
        }
    }

    /* renamed from: c */
    public void mo51609c() {
        if (!mo51606a()) {
            this.f19436c = this.f19437d.mo49807c();
            this.f19434a = false;
        }
    }

    /* renamed from: d */
    public void mo51610d() {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("closedByUser"), this.f19438e);
        }
    }

    /* renamed from: e */
    public void mo51611e() {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("playbackPaused"), this.f19438e);
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51321a(0);
            }
        }
    }

    /* renamed from: f */
    public void mo51612f() {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("playbackError"), this.f19438e);
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51321a(3);
            }
        }
    }

    /* renamed from: g */
    public void mo51613g() {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("playbackTimeout"), this.f19438e);
        }
    }

    /* renamed from: h */
    public void mo51614h() {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("playbackResumed"), this.f19438e);
            C7599p3 p3Var = this.f19435b;
            if (p3Var != null) {
                p3Var.mo51321a(1);
            }
        }
    }

    /* renamed from: i */
    public void mo51615i() {
        if (!mo51606a()) {
            C7741x8.m20827c((List<C7328b3>) this.f19437d.mo49800a("playbackStopped"), this.f19438e);
        }
    }
}
