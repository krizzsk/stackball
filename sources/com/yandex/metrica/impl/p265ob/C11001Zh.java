package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Zh */
class C11001Zh {

    /* renamed from: a */
    private final String f26464a;

    /* renamed from: b */
    private final C10691R2 f26465b;

    /* renamed from: c */
    private final C10616Om f26466c;

    /* renamed from: d */
    private final C10929Xh f26467d;

    C11001Zh(String str, C10889Wh wh) {
        this(str, new C10691R2(), new C10580Nm(), new C10929Xh(wh));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62592a(C11288gi giVar, int i, C10226Ei ei) {
        this.f26467d.mo62487a(ei.f24599g);
        C10691R2 r2 = this.f26465b;
        long a = this.f26467d.mo62485a(i);
        long j = ei.f24599g;
        if (r2.mo62107b(a, j, "report " + this.f26464a)) {
            ((C11390ji) giVar).mo63112a(this.f26464a, Integer.valueOf(i));
            this.f26467d.mo62486a(i, this.f26466c.mo61841b());
        }
    }

    C11001Zh(String str, C10691R2 r2, C10616Om om, C10929Xh xh) {
        this.f26464a = str;
        this.f26465b = r2;
        this.f26466c = om;
        this.f26467d = xh;
    }
}
