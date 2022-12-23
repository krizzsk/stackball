package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.dc */
public class C11143dc implements C11109cc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11109cc f26693a;

    /* renamed from: com.yandex.metrica.impl.ob.dc$a */
    class C11144a implements C10971Ym<C11078bc> {

        /* renamed from: a */
        final /* synthetic */ Context f26694a;

        C11144a(Context context) {
            this.f26694a = context;
        }

        /* renamed from: b */
        public C11078bc mo62554a() {
            return C11143dc.this.f26693a.mo62727a(this.f26694a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dc$b */
    class C11145b implements C10971Ym<C11078bc> {

        /* renamed from: a */
        final /* synthetic */ Context f26696a;

        /* renamed from: b */
        final /* synthetic */ C11560nc f26697b;

        C11145b(Context context, C11560nc ncVar) {
            this.f26696a = context;
            this.f26697b = ncVar;
        }

        /* renamed from: a */
        public Object mo62554a() {
            return C11143dc.this.f26693a.mo62728a(this.f26696a, this.f26697b);
        }
    }

    public C11143dc(C11109cc ccVar) {
        this.f26693a = ccVar;
    }

    /* renamed from: a */
    public C11078bc mo62727a(Context context) {
        return m28720a((C10971Ym<C11078bc>) new C11144a(context));
    }

    /* renamed from: a */
    public C11078bc mo62728a(Context context, C11560nc ncVar) {
        return m28720a((C10971Ym<C11078bc>) new C11145b(context, ncVar));
    }

    /* renamed from: a */
    private C11078bc m28720a(C10971Ym<C11078bc> ym) {
        C11078bc a = ym.mo62554a();
        C11037ac acVar = a.f26600a;
        return (acVar == null || !"00000000-0000-0000-0000-000000000000".equals(acVar.f26512b)) ? a : new C11078bc((C11037ac) null, C11171e1.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
