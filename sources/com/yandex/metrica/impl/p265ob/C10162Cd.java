package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Cd */
public abstract class C10162Cd<T> implements C11746sc<T> {

    /* renamed from: a */
    private final C10691R2 f24452a;

    /* renamed from: b */
    private final C10602Oc f24453b;

    public C10162Cd(C10602Oc oc, C10691R2 r2) {
        this.f24453b = oc;
        this.f24452a = r2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo61148a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo61149a(long j) {
        C10691R2 r2 = this.f24452a;
        long a = this.f24453b.mo61727a();
        return r2.mo62107b(a, j, "last " + mo61148a() + " scan attempt");
    }
}
