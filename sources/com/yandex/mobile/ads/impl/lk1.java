package com.yandex.mobile.ads.impl;

public class lk1<T> implements yk1 {

    /* renamed from: a */
    private final ck1<T> f36728a;

    /* renamed from: b */
    private final wk1<T> f36729b;

    /* renamed from: c */
    private final gl1 f36730c;

    /* renamed from: d */
    private final fl1 f36731d;

    /* renamed from: e */
    private final mk1<T> f36732e;

    /* renamed from: f */
    private final tn1 f36733f;

    /* renamed from: g */
    private final ll1 f36734g;

    /* renamed from: h */
    private final C15230y2 f36735h;

    /* renamed from: i */
    private final ln1 f36736i;

    /* renamed from: j */
    private vk1 f36737j;

    /* renamed from: k */
    private boolean f36738k;

    /* renamed from: l */
    private boolean f36739l;

    public lk1(ck1<T> ck1, wk1<T> wk1, rn1 rn1, fl1 fl1, gl1 gl1, ll1 ll1, C15230y2 y2Var, ln1 ln1, mk1<T> mk1) {
        this.f36728a = ck1;
        this.f36729b = wk1;
        this.f36731d = fl1;
        this.f36730c = gl1;
        this.f36732e = mk1;
        this.f36734g = ll1;
        this.f36735h = y2Var;
        this.f36736i = ln1;
        this.f36733f = new rp0().mo69802a(rn1);
    }

    /* renamed from: a */
    public void mo67187a(ok1 ok1, float f) {
        this.f36736i.mo65754a(f);
        vk1 vk1 = this.f36737j;
        if (vk1 != null) {
            vk1.mo70501a(f);
        }
        this.f36732e.mo66685a(this.f36728a, f);
    }

    /* renamed from: b */
    public void mo67189b(ok1 ok1) {
        this.f36739l = false;
        this.f36738k = false;
        this.f36734g.mo68489b(kl1.FINISHED);
        this.f36736i.mo65763e();
        this.f36731d.mo67032b();
        this.f36730c.mo67324c();
        this.f36732e.mo66694i(this.f36728a);
        m38814b();
    }

    /* renamed from: c */
    public void mo67190c(ok1 ok1) {
        this.f36734g.mo68489b(kl1.PAUSED);
        if (this.f36738k) {
            this.f36736i.mo65765g();
        }
        this.f36732e.mo66691f(this.f36728a);
    }

    /* renamed from: d */
    public void mo67191d(ok1 ok1) {
        if (this.f36739l) {
            this.f36734g.mo68489b(kl1.BUFFERING);
            this.f36736i.mo65770l();
        }
    }

    /* renamed from: e */
    public void mo67192e(ok1 ok1) {
        this.f36734g.mo68489b(kl1.PLAYING);
        if (this.f36738k) {
            this.f36736i.mo65764f();
        } else {
            m38815c();
        }
        this.f36731d.mo67031a();
        this.f36732e.mo66693h(this.f36728a);
    }

    /* renamed from: f */
    public void mo67193f(ok1 ok1) {
        this.f36736i.mo65766h();
        m38813a();
        this.f36732e.mo66684a(this.f36728a);
        m38814b();
    }

    /* renamed from: g */
    public void mo67194g(ok1 ok1) {
        if (this.f36739l) {
            this.f36734g.mo68489b(kl1.PLAYING);
            this.f36736i.mo65762d();
        }
    }

    /* renamed from: h */
    public void mo67195h(ok1 ok1) {
        this.f36739l = true;
        this.f36734g.mo68489b(kl1.PLAYING);
        m38815c();
        this.f36731d.mo67031a();
        this.f36737j = new vk1(this.f36729b, this.f36736i);
        this.f36732e.mo66688c(this.f36728a);
    }

    /* renamed from: i */
    public void mo67196i(ok1 ok1) {
        this.f36734g.mo68489b(kl1.PREPARED);
        this.f36735h.mo70965a(C15139x2.VIDEO_AD_PREPARE);
        this.f36732e.mo66689d(this.f36728a);
    }

    /* renamed from: a */
    public void mo67186a(ok1 ok1) {
        this.f36736i.mo65772n();
        m38813a();
        this.f36732e.mo66690e(this.f36728a);
        m38814b();
    }

    /* renamed from: c */
    private void m38815c() {
        if (this.f36733f.mo70209a()) {
            this.f36738k = true;
            this.f36736i.mo65755a(this.f36729b.mo68215c(), 0.0f);
        }
    }

    /* renamed from: b */
    private void m38814b() {
        this.f36729b.mo68213a((yk1) null);
        this.f36732e.mo66692g(this.f36728a);
    }

    /* renamed from: a */
    private void m38813a() {
        this.f36739l = false;
        this.f36738k = false;
        this.f36734g.mo68489b(kl1.STOPPED);
        this.f36731d.mo67032b();
        this.f36730c.mo67325d();
    }

    /* renamed from: a */
    public void mo67188a(ok1 ok1, xk1 xk1) {
        this.f36739l = false;
        this.f36738k = false;
        this.f36734g.mo68489b(kl1.ERROR);
        this.f36731d.mo67032b();
        this.f36730c.mo67322a(xk1);
        this.f36736i.mo65759a(xk1);
        this.f36732e.mo66686a(this.f36728a, xk1);
        m38814b();
    }
}
