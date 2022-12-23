package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.cl */
class C11119cl {

    /* renamed from: a */
    private final C11090bl f26665a;

    /* renamed from: b */
    private final C11090bl f26666b;

    /* renamed from: c */
    private final C11090bl f26667c;

    /* renamed from: d */
    private final C11090bl f26668d;

    /* renamed from: com.yandex.metrica.impl.ob.cl$a */
    static class C11120a {
        C11120a() {
        }
    }

    C11119cl(C11052al alVar, C10378Il il) {
        this(new C11090bl(alVar.mo62654c(), m28655a(il.f24923e)), new C11090bl(alVar.mo62653b(), m28655a(il.f24924f)), new C11090bl(alVar.mo62655d(), m28655a(il.f24926h)), new C11090bl(alVar.mo62651a(), m28655a(il.f24925g)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11090bl mo62733a() {
        return this.f26668d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11090bl mo62734b() {
        return this.f26666b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C11090bl mo62735c() {
        return this.f26665a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C11090bl mo62736d() {
        return this.f26667c;
    }

    /* renamed from: a */
    private static int m28655a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    C11119cl(C11090bl blVar, C11090bl blVar2, C11090bl blVar3, C11090bl blVar4) {
        this.f26665a = blVar;
        this.f26666b = blVar2;
        this.f26667c = blVar3;
        this.f26668d = blVar4;
    }
}
