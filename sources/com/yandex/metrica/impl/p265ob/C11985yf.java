package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11042ag;

/* renamed from: com.yandex.metrica.impl.ob.yf */
public abstract class C11985yf implements C10339Hf, C11600of {

    /* renamed from: a */
    private final String f28781a;

    /* renamed from: b */
    private final int f28782b;

    /* renamed from: c */
    private final C11829uo<String> f28783c;

    /* renamed from: d */
    private final C11683qf f28784d;

    /* renamed from: e */
    private C10380Im f28785e = C12038zm.m31085a();

    C11985yf(int i, String str, C11829uo<String> uoVar, C11683qf qfVar) {
        this.f28782b = i;
        this.f28781a = str;
        this.f28783c = uoVar;
        this.f28784d = qfVar;
    }

    /* renamed from: a */
    public final C11042ag.C11043a mo64148a() {
        C11042ag.C11043a aVar = new C11042ag.C11043a();
        aVar.f26525c = this.f28782b;
        aVar.f26524b = this.f28781a.getBytes();
        aVar.f26527e = new C11042ag.C11045c();
        aVar.f26526d = new C11042ag.C11044b();
        return aVar;
    }

    /* renamed from: b */
    public C11683qf mo64150b() {
        return this.f28784d;
    }

    /* renamed from: c */
    public String mo64151c() {
        return this.f28781a;
    }

    /* renamed from: d */
    public int mo64152d() {
        return this.f28782b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo64153e() {
        C11770so a = this.f28783c.mo61590a(this.f28781a);
        if (a.mo63695b()) {
            return true;
        }
        if (!this.f28785e.mo64227c()) {
            return false;
        }
        C10380Im im = this.f28785e;
        im.mo64225c("Attribute " + this.f28781a + " of type " + C10254Ff.m26310a(this.f28782b) + " is skipped because " + a.mo63694a());
        return false;
    }

    /* renamed from: a */
    public void mo64149a(C10380Im im) {
        this.f28785e = im;
    }
}
