package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.ra */
public class C11711ra implements Object<C10807Uc, C11428kg.C11441k.C11442a> {

    /* renamed from: a */
    private final C11523ma f28079a;

    /* renamed from: b */
    private final C11595oa f28080b;

    public C11711ra() {
        this(new C11523ma(), new C11595oa());
    }

    C11711ra(C11523ma maVar, C11595oa oaVar) {
        this.f28079a = maVar;
        this.f28080b = oaVar;
    }

    /* renamed from: a */
    public C11428kg.C11441k.C11442a mo63596b(C10807Uc uc) {
        C11428kg.C11441k.C11442a aVar = new C11428kg.C11441k.C11442a();
        aVar.f27498b = uc.f25910a;
        aVar.f27499c = uc.f25911b;
        aVar.f27500d = uc.f25912c;
        aVar.f27501e = uc.f25913d;
        aVar.f27502f = uc.f25914e;
        aVar.f27503g = uc.f25915f;
        aVar.f27504h = uc.f25916g;
        aVar.f27507k = uc.f25917h;
        aVar.f27505i = uc.f25918i;
        aVar.f27506j = uc.f25919j;
        aVar.f27513q = uc.f25920k;
        aVar.f27514r = uc.f25921l;
        C10220Ec ec = uc.f25922m;
        if (ec != null) {
            aVar.f27508l = this.f28079a.mo63320b(ec);
        }
        C10220Ec ec2 = uc.f25923n;
        if (ec2 != null) {
            aVar.f27509m = this.f28079a.mo63320b(ec2);
        }
        C10220Ec ec3 = uc.f25924o;
        if (ec3 != null) {
            aVar.f27510n = this.f28079a.mo63320b(ec3);
        }
        C10220Ec ec4 = uc.f25925p;
        if (ec4 != null) {
            aVar.f27511o = this.f28079a.mo63320b(ec4);
        }
        C10401Jc jc = uc.f25926q;
        if (jc != null) {
            aVar.f27512p = this.f28080b.mo63429b(jc);
        }
        return aVar;
    }

    /* renamed from: a */
    public C10807Uc mo63595a(C11428kg.C11441k.C11442a aVar) {
        C11428kg.C11441k.C11442a aVar2 = aVar;
        C11428kg.C11441k.C11442a.C11443a aVar3 = aVar2.f27508l;
        C10401Jc jc = null;
        C10220Ec a = aVar3 != null ? this.f28079a.mo63319a(aVar3) : null;
        C11428kg.C11441k.C11442a.C11443a aVar4 = aVar2.f27509m;
        C10220Ec a2 = aVar4 != null ? this.f28079a.mo63319a(aVar4) : null;
        C11428kg.C11441k.C11442a.C11443a aVar5 = aVar2.f27510n;
        C10220Ec a3 = aVar5 != null ? this.f28079a.mo63319a(aVar5) : null;
        C11428kg.C11441k.C11442a.C11443a aVar6 = aVar2.f27511o;
        C10220Ec a4 = aVar6 != null ? this.f28079a.mo63319a(aVar6) : null;
        C11428kg.C11441k.C11442a.C11445b bVar = aVar2.f27512p;
        if (bVar != null) {
            jc = this.f28080b.mo63428a(bVar);
        }
        return new C10807Uc(aVar2.f27498b, aVar2.f27499c, aVar2.f27500d, aVar2.f27501e, aVar2.f27502f, aVar2.f27503g, aVar2.f27504h, aVar2.f27507k, aVar2.f27505i, aVar2.f27506j, aVar2.f27513q, aVar2.f27514r, a, a2, a3, a4, jc);
    }
}
