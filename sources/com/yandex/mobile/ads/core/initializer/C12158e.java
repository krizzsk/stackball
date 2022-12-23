package com.yandex.mobile.ads.core.initializer;

import android.content.Context;
import com.yandex.mobile.ads.core.initializer.C12158e;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C12456av;
import com.yandex.mobile.ads.impl.C14240p0;
import com.yandex.mobile.ads.impl.C14564s6;
import com.yandex.mobile.ads.impl.C15136x1;
import com.yandex.mobile.ads.impl.C15139x2;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.C15295z6;
import com.yandex.mobile.ads.impl.C15356zu;
import com.yandex.mobile.ads.impl.f71;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.le0;
import com.yandex.mobile.ads.impl.p71;
import com.yandex.mobile.ads.impl.qc0;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.sc0;
import com.yandex.mobile.ads.impl.y71;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.mobile.ads.core.initializer.e */
public class C12158e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f29482a;

    /* renamed from: b */
    private final Executor f29483b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15230y2 f29484c;

    /* renamed from: d */
    private final C14240p0 f29485d;

    /* renamed from: e */
    private final sc0 f29486e;

    /* renamed from: f */
    private final rc0 f29487f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C15295z6 f29488g = new C15295z6();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final f71 f29489h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C14564s6 f29490i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final y71 f29491j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C15136x1 f29492k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12150a f29493l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final p71 f29494m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C15356zu f29495n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C12456av f29496o;

    /* renamed from: com.yandex.mobile.ads.core.initializer.e$a */
    class C12159a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ le0 f29497b;

        /* renamed from: c */
        final /* synthetic */ C12160b f29498c;

        C12159a(le0 le0, C12160b bVar) {
            this.f29497b = le0;
            this.f29498c = bVar;
        }

        public void run() {
            if (this.f29497b != null) {
                C12158e.this.f29493l.mo64745a(this.f29497b);
            }
            C12158e.m31640a(C12158e.this, this.f29498c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.core.initializer.e$b */
    public interface C12160b {
        /* renamed from: a */
        void mo64611a(C12350a2 a2Var);

        /* renamed from: a */
        void mo64612a(C14564s6 s6Var, l30 l30);
    }

    public C12158e(Context context, Executor executor, C15230y2 y2Var) {
        this.f29482a = context.getApplicationContext();
        this.f29483b = executor;
        this.f29484c = y2Var;
        C14564s6 s6Var = new C14564s6();
        this.f29490i = s6Var;
        C12150a aVar = new C12150a(context);
        this.f29493l = aVar;
        this.f29486e = new sc0(aVar);
        this.f29487f = new rc0(aVar.mo64744a());
        this.f29485d = new C14240p0(context);
        this.f29489h = new f71(context, s6Var, aVar);
        this.f29491j = new y71();
        this.f29492k = new C15136x1();
        this.f29494m = new p71(context);
        this.f29495n = new C15356zu();
        this.f29496o = new C12456av();
    }

    /* renamed from: l */
    static void m31654l(C12158e eVar) {
        eVar.f29483b.execute(new C12166i(eVar));
    }

    /* renamed from: c */
    static void m31645c(C12158e eVar, C12160b bVar) {
        eVar.f29483b.execute(new C12164h(eVar, bVar));
    }

    /* renamed from: a */
    public void mo64752a(le0 le0, C12160b bVar) {
        this.f29483b.execute(new C12159a(le0, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31642b(C12160b bVar) {
        this.f29484c.mo70970b(C15139x2.IDENTIFIERS_LOADING);
        this.f29483b.execute(new Runnable(bVar) {
            public final /* synthetic */ C12158e.C12160b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12158e.this.m31638a(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo64751a() {
        this.f29485d.mo69290a();
        this.f29488g.mo71157a(this.f29482a);
        this.f29489h.mo66934a();
    }

    /* renamed from: a */
    static void m31640a(C12158e eVar, C12160b bVar) {
        eVar.f29485d.mo69291a(new C12161f(eVar, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31638a(C12160b bVar) {
        this.f29486e.mo69940a(new sc0.C14582a(bVar) {
            public final /* synthetic */ C12158e.C12160b f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo64737a(qc0 qc0) {
                C12158e.this.m31639a(this.f$1, qc0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31639a(C12160b bVar, qc0 qc0) {
        this.f29487f.mo69752a(qc0);
        this.f29484c.mo70965a(C15139x2.IDENTIFIERS_LOADING);
        this.f29484c.mo70970b(C15139x2.ADVERTISING_INFO_LOADING);
        this.f29483b.execute(new C12162g(this, bVar));
    }
}
