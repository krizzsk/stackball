package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.billing_interface.C10072d;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.v3 */
public class C11835v3 implements C11771t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11517m4 f28444a;

    /* renamed from: b */
    private final C11769sn f28445b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    class C11836a extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ C10072d f28446a;

        C11836a(C10072d dVar) {
            this.f28446a = dVar;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11517m4 a = C11835v3.this.f28444a;
            C11835v3 v3Var = C11835v3.this;
            C10072d dVar = this.f28446a;
            v3Var.getClass();
            a.mo62276a(C11411k0.m29404a().mo62212a(new C10124B3(dVar).mo61093a()));
        }
    }

    public C11835v3(C11517m4 m4Var, C11769sn snVar) {
        this.f28444a = m4Var;
        this.f28445b = snVar;
    }

    /* renamed from: a */
    public void mo63817a(List<C10072d> list) {
        for (C10072d aVar : list) {
            ((C11725rn) this.f28445b).execute(new C11836a(aVar));
        }
    }
}
