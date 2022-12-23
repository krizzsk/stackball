package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11042ag;

/* renamed from: com.yandex.metrica.impl.ob.tf */
public abstract class C11790tf<T> extends C11985yf {

    /* renamed from: f */
    private final T f28325f;

    C11790tf(int i, String str, T t, C11829uo<String> uoVar, C11683qf qfVar) {
        super(i, str, uoVar, qfVar);
        this.f28325f = t;
    }

    /* renamed from: a */
    public void mo61115a(C10313Gf gf) {
        C11042ag.C11043a a;
        if (mo64153e() && (a = mo64150b().mo61061a(gf, gf.mo61393a(mo64152d(), mo64151c()), this)) != null) {
            mo61239a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61239a(C11042ag.C11043a aVar);

    /* renamed from: f */
    public T mo63741f() {
        return this.f28325f;
    }
}
