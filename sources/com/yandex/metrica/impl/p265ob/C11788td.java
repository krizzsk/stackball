package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.td */
public class C11788td {

    /* renamed from: a */
    protected final C11425kd f28290a;

    /* renamed from: b */
    private final C11012a2 f28291b;

    /* renamed from: c */
    private final C11681qd f28292c;

    public C11788td(C11425kd kdVar) {
        this(kdVar, new C11012a2());
    }

    /* renamed from: a */
    private C11681qd m30425a() {
        return new C11681qd();
    }

    C11788td(C11425kd kdVar, C11012a2 a2Var) {
        this.f28290a = kdVar;
        this.f28291b = a2Var;
        this.f28292c = m30425a();
    }

    /* renamed from: a */
    public C11526md<C10220Ec> mo63724a(C11943xd xdVar, C10220Ec ec) {
        C12025zc zcVar = this.f28290a.f27389a;
        Context context = zcVar.f28886a;
        Looper b = zcVar.f28887b.mo63615b();
        C11425kd kdVar = this.f28290a;
        return new C11526md(new C10134Bd(context, b, kdVar.f27390b, this.f28291b.mo62631c(kdVar.f27389a.f28888c), "passive", new C11313hd(xdVar)), this.f28292c, new C11747sd(), new C11714rd(), ec);
    }
}
