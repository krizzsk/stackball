package com.yandex.metrica.impl.p265ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.ud */
class C11815ud {

    /* renamed from: a */
    private final C11379jd f28378a;

    /* renamed from: b */
    private final C10633Pc f28379b;

    /* renamed from: c */
    private final C10106Ad f28380c;

    /* renamed from: d */
    private final C11982yc f28381d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11815ud(com.yandex.metrica.impl.p265ob.C11848vd r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.wd r0 = new com.yandex.metrica.impl.ob.wd
            com.yandex.metrica.impl.ob.zc r1 = r10.f28478a
            android.content.Context r1 = r1.f28886a
            r0.<init>(r1)
            com.yandex.metrica.impl.ob.Ad r1 = new com.yandex.metrica.impl.ob.Ad
            com.yandex.metrica.impl.ob.zc r2 = r10.f28478a
            android.content.Context r3 = r2.f28886a
            com.yandex.metrica.impl.ob.Qi r4 = r10.f28479b
            com.yandex.metrica.impl.ob.Uc r5 = r10.f28480c
            com.yandex.metrica.impl.ob.B8 r6 = r10.f28481d
            com.yandex.metrica.impl.ob.A8 r7 = r10.f28482e
            com.yandex.metrica.impl.ob.rn r8 = r2.f28887b
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.yandex.metrica.impl.ob.yc r2 = new com.yandex.metrica.impl.ob.yc
            com.yandex.metrica.impl.ob.Uc r3 = r10.f28480c
            com.yandex.metrica.impl.ob.B8 r4 = r10.f28481d
            com.yandex.metrica.impl.ob.A8 r5 = r10.f28482e
            r2.<init>(r3, r4, r5)
            r9.<init>(r10, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11815ud.<init>(com.yandex.metrica.impl.ob.vd):void");
    }

    /* renamed from: a */
    public void mo63782a() {
        this.f28380c.mo61056a();
    }

    /* renamed from: b */
    public Location mo63785b() {
        return this.f28378a.mo63066b();
    }

    /* renamed from: c */
    public void mo63786c() {
        this.f28378a.mo61387a();
        this.f28379b.mo61916b();
    }

    /* renamed from: d */
    public void mo63787d() {
        this.f28378a.mo63067c();
        this.f28379b.mo61917d();
    }

    /* renamed from: e */
    public void mo63788e() {
        this.f28378a.mo63068d();
        this.f28379b.mo61918e();
    }

    private C11815ud(C11848vd vdVar, C11911wd wdVar, C10106Ad ad, C11982yc ycVar) {
        this(vdVar, wdVar, C11425kd.m29478a(vdVar, ad, ycVar, wdVar.mo64028a()), ad, ycVar);
    }

    /* renamed from: a */
    public void mo63783a(C10675Qi qi) {
        this.f28380c.mo61057a(qi);
        this.f28378a.mo63064a(qi);
    }

    /* renamed from: a */
    public void mo63784a(C10807Uc uc) {
        this.f28380c.mo61058a(uc);
        this.f28381d.mo64141a(uc);
        this.f28378a.mo63065a(uc);
        this.f28379b.mo61915a(uc);
    }

    private C11815ud(C11848vd vdVar, C11911wd wdVar, C11425kd kdVar, C10106Ad ad, C11982yc ycVar) {
        this(vdVar, wdVar, kdVar, new C11943xd(vdVar.f28478a.f28886a, vdVar.f28480c, ad, ycVar, vdVar.f28479b.mo62012d()), ad, ycVar);
    }

    private C11815ud(C11848vd vdVar, C11911wd wdVar, C11425kd kdVar, C11943xd xdVar, C10106Ad ad, C11982yc ycVar) {
        this(vdVar, new C11379jd(kdVar, xdVar), new C10633Pc(C10666Qc.m27329a(vdVar, ad, ycVar, wdVar.mo64030c(), wdVar.mo64029b())), ad, ycVar);
    }

    C11815ud(C11848vd vdVar, C11379jd jdVar, C10633Pc pc, C10106Ad ad, C11982yc ycVar) {
        this.f28378a = jdVar;
        this.f28379b = pc;
        this.f28380c = ad;
        this.f28381d = ycVar;
    }
}
