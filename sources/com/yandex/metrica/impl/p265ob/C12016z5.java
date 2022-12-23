package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10501Ma;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.z5 */
public class C12016z5 extends C11737s5 {

    /* renamed from: b */
    private final C11380je f28872b;

    /* renamed from: c */
    private final C10662Q9<C11040ae> f28873c;

    /* renamed from: d */
    private final C10350I f28874d;

    /* renamed from: e */
    private final C10173D f28875e;

    /* renamed from: f */
    private final C10234F f28876f;

    public C12016z5(C11229f4 f4Var, C11380je jeVar) {
        this(f4Var, jeVar, C10501Ma.C10503b.m26925a(C11040ae.class).mo61785a(f4Var.mo62874g()), new C10350I(f4Var.mo62874g()), new C10173D(), new C10234F(f4Var.mo62874g()));
    }

    /* renamed from: a */
    public boolean mo61047a(C11411k0 k0Var) {
        C11040ae aeVar;
        C11229f4 a = mo63623a();
        a.mo62872e().toString();
        if (!a.mo62889w().mo61498m() || !a.mo62891z()) {
            return false;
        }
        C11040ae aeVar2 = (C11040ae) this.f28873c.mo61953b();
        List<C11347ie> list = aeVar2.f26519a;
        C10322H h = aeVar2.f26520b;
        C10322H a2 = this.f28874d.mo61473a();
        List<String> list2 = aeVar2.f26521c;
        List<String> a3 = this.f28876f.mo61252a();
        List<C11347ie> a4 = this.f28872b.mo63069a(mo63623a().mo62874g(), list);
        if (a4 != null || !C10796U2.m27892a((Object) h, (Object) a2) || !C11327i.m29173a((Collection<?>) list2, (Collection<?>) a3)) {
            if (a4 != null) {
                list = a4;
            }
            aeVar = new C11040ae(list, a2, a3);
        } else {
            aeVar = null;
        }
        if (aeVar != null) {
            a.mo62885r().mo63767e(C11411k0.m29412a(k0Var, aeVar.f26519a, aeVar.f26520b, this.f28875e, aeVar.f26521c));
            this.f28873c.mo61952a(aeVar);
            return false;
        } else if (!a.mo62863D()) {
            return false;
        } else {
            a.mo62885r().mo63767e(C11411k0.m29412a(k0Var, aeVar2.f26519a, aeVar2.f26520b, this.f28875e, aeVar2.f26521c));
            return false;
        }
    }

    C12016z5(C11229f4 f4Var, C11380je jeVar, C10662Q9<C11040ae> q9, C10350I i, C10173D d, C10234F f) {
        super(f4Var);
        this.f28872b = jeVar;
        this.f28873c = q9;
        this.f28874d = i;
        this.f28875e = d;
        this.f28876f = f;
    }
}
