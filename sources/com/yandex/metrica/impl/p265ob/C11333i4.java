package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.i4 */
public class C11333i4 {

    /* renamed from: a */
    private final C10158C9 f27095a;

    /* renamed from: b */
    private final C10363I8 f27096b;

    public C11333i4(C10363I8 i8) {
        this(i8, new C10158C9(i8));
    }

    /* renamed from: a */
    public int mo63030a() {
        int d = this.f27096b.mo61489d();
        this.f27096b.mo61479a(d + 1);
        return d;
    }

    C11333i4(C10363I8 i8, C10158C9 c9) {
        this.f27096b = i8;
        this.f27095a = c9;
    }

    /* renamed from: a */
    public int mo63031a(int i) {
        int a = this.f27095a.mo61141a(i);
        this.f27095a.mo61142a(i, a + 1);
        return a;
    }
}
