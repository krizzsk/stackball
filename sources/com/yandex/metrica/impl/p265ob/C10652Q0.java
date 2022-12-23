package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10683R0;

/* renamed from: com.yandex.metrica.impl.ob.Q0 */
public abstract class C10652Q0<T> implements C10683R0.C10687d {

    /* renamed from: a */
    protected final C10582O<T> f25435a;

    /* renamed from: b */
    private C10683R0 f25436b;

    public C10652Q0(long j, long j2) {
        this.f25435a = new C10582O<>(j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo61940a(C11659pi piVar);

    /* renamed from: a */
    public T mo61900a() {
        C10683R0 r0;
        if (mo61902b() && (r0 = this.f25436b) != null) {
            r0.mo62096b();
        }
        if (this.f25435a.mo61848c()) {
            this.f25435a.mo61846a(null);
        }
        return this.f25435a.mo61844a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo61942a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo61943b(C11659pi piVar);

    /* renamed from: b */
    public void mo61901b(T t) {
        if (mo61942a(t)) {
            this.f25435a.mo61846a(t);
            C10683R0 r0 = this.f25436b;
            if (r0 != null) {
                r0.mo62095a();
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo61902b();

    /* renamed from: c */
    public void mo61944c(C11659pi piVar) {
        this.f25435a.mo61845a(mo61943b(piVar), mo61940a(piVar));
    }

    /* renamed from: a */
    public void mo61941a(C10683R0 r0) {
        this.f25436b = r0;
    }
}
