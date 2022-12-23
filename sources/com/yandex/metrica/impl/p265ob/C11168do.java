package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.do */
public abstract class C11168do<T> {

    /* renamed from: a */
    public final T f26753a;

    public C11168do(T t) {
        this.f26753a = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo62555a(C11168do<T> doVar);

    public boolean equals(Object obj) {
        if (obj instanceof C11168do) {
            try {
                return mo62555a((C11168do) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
