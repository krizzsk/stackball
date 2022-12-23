package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.dm */
public class C11165dm {

    /* renamed from: a */
    private final C10868W0 f26750a;

    /* renamed from: b */
    private final C11091bm f26751b;

    /* renamed from: com.yandex.metrica.impl.ob.dm$a */
    static class C11166a {
        C11166a() {
        }
    }

    C11165dm(C11091bm bmVar, C10868W0 w0) {
        this.f26751b = bmVar;
        this.f26750a = w0;
    }

    /* renamed from: a */
    public void mo62798a(String str, Throwable th) {
        if (this.f26751b.f26624f) {
            this.f26750a.reportError(str, th);
        }
    }
}
