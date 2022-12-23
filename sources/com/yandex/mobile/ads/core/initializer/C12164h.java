package com.yandex.mobile.ads.core.initializer;

import android.content.Context;
import com.yandex.mobile.ads.base.C12100g;
import com.yandex.mobile.ads.core.initializer.C12158e;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C13529jp;
import com.yandex.mobile.ads.impl.C14559s3;
import com.yandex.mobile.ads.impl.C15026w1;
import com.yandex.mobile.ads.impl.C15356zu;
import com.yandex.mobile.ads.impl.f71;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.op1;

/* renamed from: com.yandex.mobile.ads.core.initializer.h */
class C12164h implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C12158e.C12160b f29505b;

    /* renamed from: c */
    final /* synthetic */ C12158e f29506c;

    C12164h(C12158e eVar, C12158e.C12160b bVar) {
        this.f29506c = eVar;
        this.f29505b = bVar;
    }

    public void run() {
        this.f29506c.f29489h.mo66935a(this.f29506c.f29491j, new C12165a());
    }

    /* renamed from: com.yandex.mobile.ads.core.initializer.h$a */
    class C12165a implements f71.C13035a {
        C12165a() {
        }

        /* renamed from: a */
        public void mo64758a() {
            C12158e.m31654l(C12164h.this.f29506c);
            l30 a = C12164h.this.f29506c.f29493l.mo64744a();
            if (C12164h.this.f29506c.f29496o.mo65893a(C12164h.this.f29506c.f29482a)) {
                C15356zu c = C12164h.this.f29506c.f29495n;
                Context g = C12164h.this.f29506c.f29482a;
                c.getClass();
                try {
                    C13529jp.m37935a().mo68073a(g);
                } catch (Throwable unused) {
                }
            }
            C12164h hVar = C12164h.this;
            hVar.f29505b.mo64612a(hVar.f29506c.f29490i, a);
        }

        /* renamed from: a */
        public void mo64759a(op1 op1) {
            C12350a2 a2Var;
            C12164h.this.f29506c.f29492k.getClass();
            if (op1 instanceof C15026w1) {
                a2Var = C12100g.m31393a(((C15026w1) op1).mo70619a());
            } else {
                a2Var = C14559s3.f39811d;
            }
            C12164h.this.f29505b.mo64611a(a2Var);
        }
    }
}
