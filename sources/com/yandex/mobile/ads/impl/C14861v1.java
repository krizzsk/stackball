package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.v1 */
public final class C14861v1 {

    /* renamed from: a */
    private final ts1 f41172a;

    private C14861v1(ts1 ts1) {
        this.f41172a = ts1;
    }

    /* renamed from: a */
    public static C14861v1 m43013a(C14165o4 o4Var) {
        ts1 ts1 = (ts1) o4Var;
        if (ts1.mo70228i().mo69865c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        } else if (!ts1.mo70229j()) {
            C14861v1 v1Var = new C14861v1(ts1);
            ts1.mo70228i().mo69861a(v1Var);
            return v1Var;
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public void mo70435a() {
        wt1.m43866a(this.f41172a);
        if (this.f41172a.mo70230k()) {
            if (!this.f41172a.mo70225f()) {
                try {
                    this.f41172a.mo69108b();
                } catch (Exception unused) {
                }
            }
            if (this.f41172a.mo70225f()) {
                this.f41172a.mo70223d();
                return;
            }
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: a */
    public void mo70436a(ji1 ji1) {
        wt1.m43869b(this.f41172a);
        if (this.f41172a.mo70230k()) {
            this.f41172a.mo70221a(ji1.mo68005a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
