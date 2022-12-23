package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.e1 */
public class C12948e1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final og0 f32873a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13372i1 f32874b;

    /* renamed from: c */
    private final sf0 f32875c;

    /* renamed from: d */
    private final C13159g2 f32876d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C13825l1 f32877e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C13020f1 f32878f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f32879g;

    /* renamed from: com.yandex.mobile.ads.impl.e1$b */
    private class C12950b implements C13373i2 {
        private C12950b() {
        }

        /* renamed from: a */
        public void mo66736a() {
            C13270h1 a = C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a);
            if (a.equals(C13270h1.PLAYING) || a.equals(C13270h1.PAUSED)) {
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.FINISHED);
                C12948e1.this.f32877e.mo68304a();
                if (C12948e1.this.f32878f != null) {
                    C12948e1.this.f32878f.mo66903c();
                }
            }
        }

        /* renamed from: b */
        public void mo66737b() {
            C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.ERROR);
            C12948e1.this.f32877e.mo68305b();
            if (C12948e1.this.f32878f != null) {
                C12948e1.this.f32878f.mo66907i();
            }
        }

        /* renamed from: c */
        public void mo66738c() {
            if (C12948e1.this.f32874b.mo67707a(C12948e1.this.f32873a).equals(C13270h1.PREPARED)) {
                C12948e1.this.f32874b.mo67708a(C12948e1.this.f32873a, C13270h1.PLAYING);
            }
        }
    }

    public C12948e1(Context context, og0 og0, gf0 gf0, sf0 sf0, vf0 vf0, C13372i1 i1Var) {
        this.f32873a = og0;
        this.f32874b = i1Var;
        this.f32875c = sf0;
        this.f32876d = new C13159g2(context, og0, gf0, sf0, vf0, new C12950b());
        this.f32877e = new C13825l1(context, og0.mo69155a());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m35537i() {
        if (this.f32874b.mo67707a(this.f32873a).equals(C13270h1.PREPARED)) {
            C13020f1 f1Var = this.f32878f;
            if (f1Var != null) {
                f1Var.mo66906h();
            }
            this.f32876d.mo67164e();
        }
    }

    /* renamed from: g */
    public void mo66734g() {
        int ordinal = this.f32874b.mo67707a(this.f32873a).ordinal();
        if (ordinal == 0) {
            m35535e();
        } else if (ordinal == 2) {
            m35537i();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f32876d.mo67166g();
        }
    }

    /* renamed from: h */
    public void mo66735h() {
        m35537i();
    }

    /* renamed from: e */
    private void m35535e() {
        if (this.f32874b.mo67707a(this.f32873a).equals(C13270h1.INITIAL)) {
            this.f32874b.mo67708a(this.f32873a, C13270h1.PREPARING);
            this.f32876d.mo67165f();
        }
    }

    /* renamed from: b */
    public void mo66730b() {
        int ordinal = this.f32874b.mo67707a(this.f32873a).ordinal();
        if (ordinal == 1) {
            this.f32874b.mo67708a(this.f32873a, C13270h1.INITIAL);
            this.f32876d.mo67167h();
            this.f32876d.mo67161b();
        } else if (ordinal == 2) {
            this.f32879g = false;
            this.f32874b.mo67708a(this.f32873a, C13270h1.INITIAL);
            this.f32876d.mo67167h();
            this.f32876d.mo67161b();
        } else if (ordinal == 5) {
            this.f32874b.mo67708a(this.f32873a, C13270h1.INITIAL);
            this.f32876d.mo67161b();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f32879g = true;
            this.f32874b.mo67708a(this.f32873a, C13270h1.INITIAL);
            this.f32876d.mo67167h();
            this.f32876d.mo67161b();
        }
        this.f32875c.mo69966a();
    }

    /* renamed from: c */
    public void mo66731c() {
        int ordinal = this.f32874b.mo67707a(this.f32873a).ordinal();
        if (ordinal == 1) {
            this.f32874b.mo67708a(this.f32873a, C13270h1.INITIAL);
            this.f32876d.mo67167h();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f32874b.mo67708a(this.f32873a, C13270h1.PAUSED);
            this.f32876d.mo67163d();
        }
        this.f32875c.mo69966a();
    }

    /* renamed from: d */
    public void mo66732d() {
        m35535e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 != 7) goto L_0x003e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66733f() {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.i1 r0 = r3.f32874b
            com.yandex.mobile.ads.impl.og0 r1 = r3.f32873a
            com.yandex.mobile.ads.impl.h1 r0 = r0.mo67707a((com.yandex.mobile.ads.impl.og0) r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 2
            if (r0 == r1) goto L_0x002b
            r1 = 5
            if (r0 == r1) goto L_0x001c
            r1 = 6
            if (r0 == r1) goto L_0x002b
            r1 = 7
            if (r0 == r1) goto L_0x002b
            goto L_0x003e
        L_0x001c:
            com.yandex.mobile.ads.impl.i1 r0 = r3.f32874b
            com.yandex.mobile.ads.impl.og0 r1 = r3.f32873a
            com.yandex.mobile.ads.impl.h1 r2 = com.yandex.mobile.ads.impl.C13270h1.INITIAL
            r0.mo67708a(r1, r2)
            com.yandex.mobile.ads.impl.g2 r0 = r3.f32876d
            r0.mo67161b()
            goto L_0x003e
        L_0x002b:
            com.yandex.mobile.ads.impl.i1 r0 = r3.f32874b
            com.yandex.mobile.ads.impl.og0 r1 = r3.f32873a
            com.yandex.mobile.ads.impl.h1 r2 = com.yandex.mobile.ads.impl.C13270h1.INITIAL
            r0.mo67708a(r1, r2)
            com.yandex.mobile.ads.impl.g2 r0 = r3.f32876d
            r0.mo67167h()
            com.yandex.mobile.ads.impl.g2 r0 = r3.f32876d
            r0.mo67161b()
        L_0x003e:
            r0 = 0
            r3.f32879g = r0
            com.yandex.mobile.ads.impl.sf0 r0 = r3.f32875c
            r0.mo69966a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12948e1.mo66733f():void");
    }

    /* renamed from: a */
    public void mo66728a(C13020f1 f1Var) {
        this.f32878f = f1Var;
    }

    /* renamed from: a */
    public void mo66729a(oj1 oj1) {
        this.f32876d.mo67160a(oj1);
    }

    /* renamed from: a */
    public void mo66727a() {
        int ordinal = this.f32874b.mo67707a(this.f32873a).ordinal();
        if (ordinal == 6 || ordinal == 7) {
            this.f32874b.mo67708a(this.f32873a, C13270h1.PAUSED);
            this.f32876d.mo67163d();
        }
    }
}
