package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.el */
class C11214el implements C10144Bl {

    /* renamed from: a */
    private final C10614Ok f26844a;

    C11214el() {
        this(new C10614Ok());
    }

    /* renamed from: a */
    public boolean mo61117a(String str, C11091bm bmVar) {
        if (!bmVar.f26625g) {
            return !C10796U2.m27892a((Object) "allow-parsing", (Object) str);
        }
        this.f26844a.getClass();
        return C10796U2.m27892a((Object) "do-not-parse", (Object) str);
    }

    C11214el(C10614Ok ok) {
        this.f26844a = ok;
    }
}
