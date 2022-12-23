package com.ogury.p245ed.internal;

import android.app.Activity;
import android.content.Context;
import com.ogury.p245ed.internal.C8098cg;

/* renamed from: com.ogury.ed.internal.bx */
public final class C8087bx {

    /* renamed from: a */
    private final C8095cd f21003a;

    /* renamed from: b */
    private final C8105ck f21004b;

    /* renamed from: c */
    private final C8106cl f21005c;

    /* renamed from: d */
    private final C8233fn f21006d;

    public C8087bx(C8095cd cdVar, C8105ck ckVar, C8106cl clVar, C8233fn fnVar) {
        C8467mq.m23881b(cdVar, "publisherActivityFilter");
        C8467mq.m23881b(ckVar, "publisherFragmentFilter");
        C8467mq.m23881b(clVar, "supportLibraryChecker");
        C8467mq.m23881b(fnVar, "profigGateway");
        this.f21003a = cdVar;
        this.f21004b = ckVar;
        this.f21005c = clVar;
        this.f21006d = fnVar;
    }

    public /* synthetic */ C8087bx(C8095cd cdVar, C8105ck ckVar) {
        this(cdVar, ckVar, C8106cl.f21036a, C8233fn.f21330a);
    }

    /* renamed from: a */
    public final C8086bw mo53252a(Activity activity, C8248g gVar, C8020aj ajVar) {
        C8226fh fhVar;
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        C8080bu buVar = new C8080bu(gVar, ajVar);
        C8232fm a = C8233fn.m23113a((Context) activity);
        C8228fj fjVar = null;
        if (a == null) {
            fhVar = null;
        } else {
            fhVar = a.mo53555n();
        }
        if (fhVar == null) {
            fhVar = new C8226fh();
        }
        if (a != null) {
            fjVar = a.mo53556o();
        }
        if (fjVar == null) {
            fjVar = new C8228fj();
        }
        new C8070bo();
        C8073bq a2 = C8070bo.m22485a(activity, this.f21003a, fhVar);
        C8098cg.C8099a aVar = C8098cg.f21020a;
        C8098cg a3 = C8098cg.C8099a.m22574a(activity, fjVar, this.f21004b);
        if (this.f21004b.mo53275c() || !fjVar.mo53505a()) {
            return new C8074br(activity, buVar, a2);
        }
        if (C8106cl.m22596a()) {
            return new C8102cj(activity, buVar, new C8101ci(a3));
        }
        C8250ga gaVar = C8250ga.f21371a;
        C8250ga.m23180a("Fragment filter defined for thumbnail but no fragment dependency found. Only AndroidX is supported");
        return new C8074br(activity, buVar, a2);
    }
}
