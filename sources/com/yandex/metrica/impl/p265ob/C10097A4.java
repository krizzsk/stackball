package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.A4 */
public abstract class C10097A4 implements C10210E4 {

    /* renamed from: a */
    private final C11703r4 f24304a;

    /* renamed from: b */
    private final C10188Dd f24305b;

    public C10097A4(Context context, C11703r4 r4Var) {
        this(context, r4Var, new C10188Dd(C11146dd.m28727a(context), C11065b3.m28563a(context), C10619P0.m27164i().mo61893u()));
    }

    /* renamed from: a */
    public void mo61043a(C11411k0 k0Var, C10910X3 x3) {
        mo61045b(k0Var, x3);
    }

    /* renamed from: b */
    public C11703r4 mo61044b() {
        return this.f24304a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo61045b(C11411k0 k0Var, C10910X3 x3);

    /* renamed from: c */
    public C10188Dd mo61046c() {
        return this.f24305b;
    }

    /* renamed from: a */
    public void mo61042a() {
        this.f24304a.mo63570b(this);
        this.f24305b.mo61189b(this);
    }

    C10097A4(Context context, C11703r4 r4Var, C10188Dd dd) {
        context.getApplicationContext();
        this.f24304a = r4Var;
        this.f24305b = dd;
        r4Var.mo63567a((C10210E4) this);
        dd.mo61187a((Object) this);
    }
}
