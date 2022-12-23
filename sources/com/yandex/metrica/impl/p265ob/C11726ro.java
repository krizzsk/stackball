package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.ValidationException;

/* renamed from: com.yandex.metrica.impl.ob.ro */
public class C11726ro<T> implements C11829uo<T> {

    /* renamed from: a */
    private final C11829uo<T> f28098a;

    public C11726ro(C11829uo<T> uoVar) {
        this.f28098a = uoVar;
    }

    /* renamed from: a */
    public C11770so mo61590a(T t) {
        C11770so a = this.f28098a.mo61590a(t);
        if (a.mo63695b()) {
            return a;
        }
        throw new ValidationException(a.mo63694a());
    }
}
