package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0849u0;
import java.util.Date;

/* renamed from: com.adcolony.sdk.v */
class C0853v {

    /* renamed from: a */
    private boolean f1459a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Runnable f1460b = new C0854a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f1461c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0856c f1462d;

    /* renamed from: com.adcolony.sdk.v$a */
    class C0854a implements Runnable {
        C0854a() {
        }

        public void run() {
            new C0645d0("AdColony.heartbeat", 1).mo9536d();
            C0853v.this.m961c();
        }
    }

    /* renamed from: com.adcolony.sdk.v$b */
    class C0855b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0849u0.C0852c f1464a;

        C0855b(C0849u0.C0852c cVar) {
            this.f1464a = cVar;
        }

        public void run() {
            Runnable unused = C0853v.this.f1461c = null;
            if (C0578a.m145e()) {
                C0693i c = C0578a.m143c();
                if (!this.f1464a.mo9910a() || !c.mo9579K()) {
                    C0849u0.m916a(C0853v.this.f1460b, c.mo9605i());
                    return;
                }
                c.mo9584a();
                C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("Controller heartbeat timeout occurred. ");
                C0580a0.C0581a a2 = a.mo9419a("Timeout set to: " + this.f1464a.mo9911b() + " ms. ");
                a2.mo9419a("Interval set to: " + c.mo9605i() + " ms. ").mo9419a("Heartbeat last reply: ").mo9418a((Object) C0853v.this.f1462d).mo9421a(C0580a0.f192j);
                C0853v.this.m958a();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v$c */
    private static class C0856c {

        /* renamed from: a */
        private final C0897z0 f1466a;

        /* synthetic */ C0856c(C0897z0 z0Var, C0854a aVar) {
            this(z0Var);
        }

        public String toString() {
            return this.f1466a.toString();
        }

        private C0856c(C0897z0 z0Var) {
            C0897z0 o = z0Var != null ? z0Var.mo10086o("payload") : C0894y.m1151b();
            this.f1466a = o;
            C0894y.m1148a(o, "heartbeatLastTimestamp", C0587b0.f213e.format(new Date()));
        }
    }

    C0853v() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m961c() {
        if (C0578a.m145e()) {
            C0849u0.C0852c cVar = new C0849u0.C0852c(C0578a.m143c().mo9606j());
            C0855b bVar = new C0855b(cVar);
            this.f1461c = bVar;
            C0849u0.m916a((Runnable) bVar, cVar.mo9914e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9918b() {
        m958a();
        this.f1459a = false;
        C0849u0.m916a(this.f1460b, C0578a.m143c().mo9605i());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m958a() {
        this.f1459a = true;
        C0849u0.m935c(this.f1460b);
        C0849u0.m935c(this.f1461c);
        this.f1461c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9917a(C0645d0 d0Var) {
        if (C0578a.m145e() && !this.f1459a) {
            this.f1462d = new C0856c(d0Var.mo9532b(), (C0854a) null);
            Runnable runnable = this.f1461c;
            if (runnable != null) {
                C0849u0.m935c(runnable);
                C0849u0.m931b(this.f1461c);
                return;
            }
            C0849u0.m935c(this.f1460b);
            C0849u0.m916a(this.f1460b, C0578a.m143c().mo9605i());
        }
    }
}
