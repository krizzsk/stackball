package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1515d;

/* renamed from: com.applovin.impl.mediation.c */
public class C1231c {

    /* renamed from: a */
    private final C1469j f2373a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1505q f2374b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1233a f2375c;

    /* renamed from: d */
    private C1515d f2376d;

    /* renamed from: com.applovin.impl.mediation.c$a */
    public interface C1233a {
        /* renamed from: c */
        void mo12281c(C1225c cVar);
    }

    C1231c(C1469j jVar, C1233a aVar) {
        this.f2373a = jVar;
        this.f2374b = jVar.mo13139v();
        this.f2375c = aVar;
    }

    /* renamed from: a */
    public void mo12372a() {
        this.f2374b.mo13277b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        C1515d dVar = this.f2376d;
        if (dVar != null) {
            dVar.mo13306a();
            this.f2376d = null;
        }
    }

    /* renamed from: a */
    public void mo12373a(final C1225c cVar, long j) {
        C1505q qVar = this.f2374b;
        qVar.mo13277b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        this.f2376d = C1515d.m3417a(j, this.f2373a, new Runnable() {
            public void run() {
                C1231c.this.f2374b.mo13277b("AdHiddenCallbackTimeoutManager", "Timing out...");
                C1231c.this.f2375c.mo12281c(cVar);
            }
        });
    }
}
