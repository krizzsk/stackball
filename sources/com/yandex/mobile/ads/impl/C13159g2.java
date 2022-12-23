package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C12948e1;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.g2 */
public class C13159g2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12564b2 f33836a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final sf0 f33837b;

    /* renamed from: c */
    private final og0 f33838c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C13373i2 f33839d;

    /* renamed from: e */
    private final pj1 f33840e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C13022f2 f33841f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12951e2 f33842g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final hg0 f33843h = hg0.m36966a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f33844i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f33845j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f33846k;

    /* renamed from: com.yandex.mobile.ads.impl.g2$b */
    private final class C13161b implements C14760ui {

        /* renamed from: a */
        private final C13373i2 f33847a;

        /* renamed from: a */
        public void mo67168a(ck1<VideoAd> ck1) {
            C13373i2 f = C13159g2.this.f33839d;
            Objects.requireNonNull(f);
            m36432a((Runnable) new Runnable() {
                public final void run() {
                    C13373i2.this.mo66736a();
                }
            });
        }

        /* renamed from: b */
        public void mo67170b(ck1<VideoAd> ck1) {
            C12948e1.C12950b bVar = (C12948e1.C12950b) this.f33847a;
            if (C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a).equals(C13270h1.PLAYING)) {
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PAUSED);
            }
        }

        /* renamed from: c */
        public void mo67171c(ck1<VideoAd> ck1) {
            if (!C13159g2.this.f33846k) {
                boolean unused = C13159g2.this.f33846k = true;
                C12948e1.C12950b bVar = (C12948e1.C12950b) this.f33847a;
                boolean c = C12948e1.this.f32879g;
                boolean unused2 = C12948e1.this.f32879g = false;
                if (C13270h1.PREPARING.equals(C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a))) {
                    C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PREPARED);
                    if (c) {
                        C12948e1.this.m35537i();
                    } else if (C12948e1.this.f32878f != null) {
                        C12948e1.this.f32878f.mo66904d();
                    }
                }
            }
            C12948e1.C12950b bVar2 = (C12948e1.C12950b) this.f33847a;
            if (C13270h1.PREPARING.equals(C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a))) {
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PREPARED);
            }
            if (C13159g2.this.f33844i) {
                boolean unused3 = C13159g2.this.f33844i = false;
                C13159g2.this.mo67164e();
            }
        }

        /* renamed from: d */
        public void mo67172d(ck1<VideoAd> ck1) {
            C12948e1.C12950b bVar = (C12948e1.C12950b) this.f33847a;
            if (C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a).equals(C13270h1.PAUSED)) {
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PLAYING);
            }
        }

        /* renamed from: e */
        public void mo67173e(ck1<VideoAd> ck1) {
            if (C13159g2.this.f33843h.mo67553d()) {
                C13159g2.this.f33841f.mo66911c();
                C13159g2.this.f33836a.mo65940a();
            }
            C13373i2 f = C13159g2.this.f33839d;
            Objects.requireNonNull(f);
            m36432a((Runnable) new Runnable() {
                public final void run() {
                    C13373i2.this.mo66736a();
                }
            });
        }

        /* renamed from: f */
        public void mo67174f(ck1<VideoAd> ck1) {
            if (!C13159g2.this.f33845j) {
                boolean unused = C13159g2.this.f33845j = true;
                C12948e1.C12950b bVar = (C12948e1.C12950b) this.f33847a;
                if (C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a).equals(C13270h1.PREPARED)) {
                    C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PLAYING);
                    C12948e1.this.f32877e.mo68306c();
                    if (C12948e1.this.f32878f != null) {
                        C12948e1.this.f32878f.mo66905f();
                    }
                }
            }
            boolean unused2 = C13159g2.this.f33844i = false;
            C13159g2.this.m36410a();
            ((C12948e1.C12950b) this.f33847a).mo66738c();
        }

        /* renamed from: g */
        public void mo67175g(ck1<VideoAd> ck1) {
            if (!(C13159g2.this.f33836a.mo65944f() != null)) {
                C13373i2 f = C13159g2.this.f33839d;
                Objects.requireNonNull(f);
                $$Lambda$BPcINa8I90W6FnzUeMZu8nU2A4 r0 = new Runnable() {
                    public final void run() {
                        C13373i2.this.mo66736a();
                    }
                };
                C13159g2.this.f33837b.mo69966a();
                r0.run();
                return;
            }
            C13159g2.this.f33837b.mo69966a();
        }

        private C13161b(C13373i2 i2Var) {
            this.f33847a = i2Var;
        }

        /* renamed from: a */
        public void mo67169a(ck1<VideoAd> ck1, xk1 xk1) {
            C13373i2 f = C13159g2.this.f33839d;
            Objects.requireNonNull(f);
            m36432a((Runnable) new Runnable() {
                public final void run() {
                    C13373i2.this.mo66737b();
                }
            });
        }

        /* renamed from: a */
        private void m36432a(Runnable runnable) {
            if (C13159g2.this.f33836a.mo65944f() != null) {
                C13159g2.this.f33842g.mo66741a();
                return;
            }
            C13159g2.this.f33837b.mo69966a();
            runnable.run();
        }
    }

    public C13159g2(Context context, og0 og0, gf0 gf0, sf0 sf0, vf0 vf0, C13373i2 i2Var) {
        this.f33838c = og0;
        this.f33837b = sf0;
        this.f33839d = i2Var;
        pj1 pj1 = new pj1();
        this.f33840e = pj1;
        C13271h2 h2Var = new C13271h2(new C14734u1(sf0, pj1), new C13161b(i2Var));
        C12564b2 a = new C12695c2(context, og0, gf0, vf0, h2Var).mo66188a();
        this.f33836a = a;
        h2Var.mo67391a(a);
        this.f33841f = new C13022f2(a);
        this.f33842g = new C12951e2(a, sf0, i2Var, this);
    }

    /* renamed from: d */
    public void mo67163d() {
        lg0 d = this.f33836a.mo65942d();
        if (d != null) {
            d.mo68427b();
        }
    }

    /* renamed from: e */
    public void mo67164e() {
        lg0 d = this.f33836a.mo65942d();
        if (d != null) {
            this.f33844i = false;
            d.mo68428c();
        }
        this.f33841f.mo66910b();
    }

    /* renamed from: f */
    public void mo67165f() {
        lg0 d = this.f33836a.mo65942d();
        if (d != null) {
            d.mo68429d();
        }
    }

    /* renamed from: g */
    public void mo67166g() {
        m36410a();
        lg0 d = this.f33836a.mo65942d();
        if (d != null) {
            d.mo68431f();
        }
    }

    /* renamed from: h */
    public void mo67167h() {
        lg0 d = this.f33836a.mo65942d();
        if (d != null) {
            d.mo68432g();
        }
        this.f33841f.mo66911c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36410a() {
        ck1<VideoAd> c = this.f33836a.mo65941c();
        ln1 e = this.f33836a.mo65943e();
        if (c != null && e != null) {
            this.f33837b.mo69968a(this.f33838c, c, e, this.f33840e);
        }
    }

    /* renamed from: b */
    public void mo67161b() {
        lg0 d = this.f33836a.mo65942d();
        if (d != null) {
            d.mo68426a();
        }
        this.f33841f.mo66909a();
        this.f33844i = false;
        this.f33846k = false;
        this.f33845j = false;
    }

    /* renamed from: c */
    public void mo67162c() {
        this.f33844i = true;
    }

    /* renamed from: a */
    public void mo67160a(oj1 oj1) {
        this.f33840e.mo69372a(oj1);
    }
}
