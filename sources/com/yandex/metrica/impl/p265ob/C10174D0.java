package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.D0 */
public abstract class C10174D0<T> {

    /* renamed from: a */
    private final C10264Fm<C10202E0, Integer> f24462a;

    public C10174D0() {
        C10264Fm<C10202E0, Integer> fm = new C10264Fm<>(0);
        fm.mo61336a(C10202E0.UNDEFINED, 0);
        fm.mo61336a(C10202E0.APP, 1);
        fm.mo61336a(C10202E0.SATELLITE, 2);
        fm.mo61336a(C10202E0.RETAIL, 3);
        this.f24462a = fm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C10264Fm<C10202E0, Integer> mo61161a() {
        return this.f24462a;
    }

    /* renamed from: a */
    public abstract boolean mo61162a(T t, T t2);
}
