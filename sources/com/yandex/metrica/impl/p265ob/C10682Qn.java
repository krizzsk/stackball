package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10265Fn;

/* renamed from: com.yandex.metrica.impl.ob.Qn */
public class C10682Qn<V, M extends C10265Fn> implements C10265Fn {

    /* renamed from: a */
    public final V f25555a;

    /* renamed from: b */
    public final M f25556b;

    public C10682Qn(V v, M m) {
        this.f25555a = v;
        this.f25556b = m;
    }

    /* renamed from: a */
    public int mo61250a() {
        return this.f25556b.mo61250a();
    }

    public String toString() {
        return "TrimmingResult{value=" + this.f25555a + ", metaInfo=" + this.f25556b + '}';
    }
}
