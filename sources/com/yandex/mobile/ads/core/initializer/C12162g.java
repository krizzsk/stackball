package com.yandex.mobile.ads.core.initializer;

import com.yandex.mobile.ads.core.initializer.C12158e;
import com.yandex.mobile.ads.impl.C12958e7;
import com.yandex.mobile.ads.impl.C15033w6;
import com.yandex.mobile.ads.impl.C15139x2;

/* renamed from: com.yandex.mobile.ads.core.initializer.g */
class C12162g implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C12158e.C12160b f29502b;

    /* renamed from: c */
    final /* synthetic */ C12158e f29503c;

    /* renamed from: com.yandex.mobile.ads.core.initializer.g$a */
    class C12163a implements C12958e7 {
        C12163a() {
        }

        /* renamed from: a */
        public void mo64756a(C15033w6 w6Var) {
            C12162g.this.f29503c.f29484c.mo70965a(C15139x2.ADVERTISING_INFO_LOADING);
            if (w6Var != null) {
                C12162g.this.f29503c.f29490i.mo69890a(w6Var.mo70651a());
                C12162g.this.f29503c.f29490i.mo69893b(w6Var.mo70652b());
                C12162g.this.f29503c.f29490i.mo69891a(w6Var.mo70653c());
            }
            C12162g gVar = C12162g.this;
            C12158e.m31645c(gVar.f29503c, gVar.f29502b);
        }
    }

    C12162g(C12158e eVar, C12158e.C12160b bVar) {
        this.f29503c = eVar;
        this.f29502b = bVar;
    }

    public void run() {
        this.f29503c.f29488g.mo71158a(this.f29503c.f29482a, new C12163a());
    }
}
