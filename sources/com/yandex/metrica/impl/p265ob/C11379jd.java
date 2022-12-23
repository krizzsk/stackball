package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import com.yandex.metrica.impl.p265ob.C10683R0;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jd */
public class C11379jd implements C10765T0 {

    /* renamed from: a */
    private C11943xd f27186a;

    /* renamed from: b */
    private C11425kd f27187b;

    /* renamed from: c */
    private final List<C11526md<?>> f27188c;

    /* renamed from: d */
    private final C10924Xc<C10220Ec> f27189d;

    /* renamed from: e */
    private final C10924Xc<C10220Ec> f27190e;

    /* renamed from: f */
    private final C10924Xc<C10220Ec> f27191f;

    /* renamed from: g */
    private final C10924Xc<C10401Jc> f27192g;

    /* renamed from: h */
    private final C10683R0 f27193h;

    /* renamed from: i */
    private boolean f27194i;

    public C11379jd(C11425kd kdVar, C11943xd xdVar) {
        this(kdVar, xdVar, C10619P0.m27164i().mo61893u());
    }

    /* renamed from: a */
    public void mo61387a() {
        if (this.f27194i) {
            for (C11526md<?> c : this.f27188c) {
                c.mo63324c();
            }
        }
    }

    /* renamed from: b */
    public Location mo63066b() {
        if (this.f27194i) {
            return this.f27186a.mo64071a();
        }
        return null;
    }

    /* renamed from: c */
    public void mo63067c() {
        if (this.f27194i) {
            this.f27193h.mo62095a();
            for (C11526md<?> a : this.f27188c) {
                a.mo63321a();
            }
        }
    }

    /* renamed from: d */
    public void mo63068d() {
        this.f27193h.mo62097c();
        for (C11526md<?> b : this.f27188c) {
            b.mo63323b();
        }
    }

    private C11379jd(C11425kd kdVar, C11943xd xdVar, C10364I9 i9) {
        this(kdVar, xdVar, new C10518Mc(kdVar, i9), new C10748Sc(kdVar, i9), new C11788td(kdVar), new C10456Lc(kdVar, i9, xdVar), new C10683R0.C10686c());
    }

    C11379jd(C11425kd kdVar, C11943xd xdVar, C11910wc wcVar, C11910wc wcVar2, C11788td tdVar, C10456Lc lc, C10683R0.C10686c cVar) {
        C10220Ec ec;
        C10220Ec ec2;
        C10220Ec ec3;
        this.f27187b = kdVar;
        C10807Uc uc = kdVar.f27391c;
        C10401Jc jc = null;
        if (uc != null) {
            this.f27194i = uc.f25916g;
            C10220Ec ec4 = uc.f25923n;
            ec3 = uc.f25924o;
            ec2 = uc.f25925p;
            C10220Ec ec5 = ec4;
            jc = uc.f25926q;
            ec = ec5;
        } else {
            ec = null;
            ec3 = null;
            ec2 = null;
        }
        this.f27186a = xdVar;
        C11526md<C10220Ec> a = wcVar.mo64027a(xdVar, ec3);
        C11526md<C10220Ec> a2 = wcVar2.mo64027a(xdVar, ec);
        C11526md<C10220Ec> a3 = tdVar.mo63724a(xdVar, ec2);
        C11526md<C10401Jc> a4 = lc.mo61726a(jc);
        this.f27188c = Arrays.asList(new C11526md[]{a, a2, a3, a4});
        this.f27189d = a2;
        this.f27190e = a;
        this.f27191f = a3;
        this.f27192g = a4;
        C10683R0 a5 = cVar.mo62100a(this.f27187b.f27389a.f28887b, this, this.f27186a.mo64075b());
        this.f27193h = a5;
        this.f27186a.mo64075b().mo61941a(a5);
    }

    /* renamed from: a */
    public void mo63064a(C10675Qi qi) {
        this.f27186a.mo64073a(qi);
    }

    /* renamed from: a */
    public void mo63065a(C10807Uc uc) {
        this.f27194i = uc != null && uc.f25916g;
        this.f27186a.mo64074a(uc);
        C10401Jc jc = null;
        ((C11526md) this.f27189d).mo63322a(uc == null ? null : uc.f25923n);
        ((C11526md) this.f27190e).mo63322a(uc == null ? null : uc.f25924o);
        ((C11526md) this.f27191f).mo63322a(uc == null ? null : uc.f25925p);
        C10924Xc<C10401Jc> xc = this.f27192g;
        if (uc != null) {
            jc = uc.f25926q;
        }
        ((C11526md) xc).mo63322a(jc);
        mo61387a();
    }
}
