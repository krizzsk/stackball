package com.yandex.metrica.impl.p265ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yh */
public class C11987yh {

    /* renamed from: a */
    private C10662Q9<C10225Eh> f28802a;

    /* renamed from: b */
    private C10225Eh f28803b;

    /* renamed from: c */
    private C10580Nm f28804c;

    /* renamed from: d */
    private C10315Gh f28805d;

    /* renamed from: e */
    private C11988a f28806e;

    /* renamed from: com.yandex.metrica.impl.ob.yh$a */
    interface C11988a {
    }

    public C11987yh(C10662Q9<C10225Eh> q9, C11988a aVar) {
        this(q9, aVar, new C10580Nm(), new C10315Gh(q9));
    }

    /* renamed from: a */
    public void mo64173a(C10225Eh eh) {
        this.f28802a.mo61952a(eh);
        this.f28803b = eh;
        this.f28805d.mo61398a();
        C10139Bh bh = (C10139Bh) this.f28806e;
        bh.f24406a.mo61197b();
        boolean unused = bh.f24406a.f24510h = false;
    }

    C11987yh(C10662Q9<C10225Eh> q9, C11988a aVar, C10580Nm nm, C10315Gh gh) {
        this.f28802a = q9;
        this.f28803b = (C10225Eh) q9.mo61953b();
        this.f28804c = nm;
        this.f28805d = gh;
        this.f28806e = aVar;
    }

    /* renamed from: a */
    public void mo64172a() {
        C10225Eh eh = this.f28803b;
        List<C10341Hh> list = eh.f24588a;
        String str = eh.f24589b;
        this.f28804c.getClass();
        C10225Eh eh2 = new C10225Eh(list, str, System.currentTimeMillis(), true, true);
        this.f28802a.mo61952a(eh2);
        this.f28803b = eh2;
        C10139Bh bh = (C10139Bh) this.f28806e;
        bh.f24406a.mo61197b();
        boolean unused = bh.f24406a.f24510h = false;
    }
}
