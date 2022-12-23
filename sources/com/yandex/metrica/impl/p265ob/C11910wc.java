package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.wc */
public abstract class C11910wc {

    /* renamed from: a */
    protected final C10364I9 f28641a;

    /* renamed from: b */
    protected final C11425kd f28642b;

    /* renamed from: c */
    protected final C11012a2 f28643c;

    /* renamed from: d */
    private final C10602Oc f28644d;

    /* renamed from: e */
    private final C11787tc f28645e;

    /* renamed from: f */
    private final C11814uc f28646f;

    public C11910wc(C11425kd kdVar, C10364I9 i9, C11012a2 a2Var) {
        this.f28642b = kdVar;
        this.f28641a = i9;
        this.f28643c = a2Var;
        C10602Oc a = mo61793a();
        this.f28644d = a;
        this.f28645e = new C11787tc(a, mo61796c());
        this.f28646f = new C11814uc(kdVar.f27389a.f28887b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10602Oc mo61793a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11281ge mo61794a(C11241fe feVar);

    /* renamed from: a */
    public C11526md<C10220Ec> mo64027a(C11943xd xdVar, C10220Ec ec) {
        C12025zc zcVar = this.f28642b.f27389a;
        Context context = zcVar.f28886a;
        Looper b = zcVar.f28887b.mo63615b();
        C11425kd kdVar = this.f28642b;
        return new C11526md(new C10134Bd(context, b, kdVar.f27390b, mo61794a(kdVar.f27389a.f28888c), mo61795b(), new C11313hd(xdVar)), this.f28645e, new C11847vc(this.f28644d, new C10580Nm()), this.f28646f, ec);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo61795b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo61796c();
}
