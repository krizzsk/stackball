package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0580a0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.p0 */
class C0776p0 {

    /* renamed from: a */
    private final ScheduledExecutorService f1279a = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ScheduledFuture<?> f1280b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledFuture<?> f1281c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0769o0 f1282d;

    /* renamed from: com.adcolony.sdk.p0$a */
    class C0777a implements Runnable {
        C0777a() {
        }

        public void run() {
            ScheduledFuture unused = C0776p0.this.f1280b = null;
            C0776p0.this.m731e();
        }
    }

    /* renamed from: com.adcolony.sdk.p0$b */
    class C0778b implements Runnable {
        C0778b() {
        }

        public void run() {
            if (C0776p0.this.f1282d.mo9806i()) {
                C0578a.m143c().mo9617u().mo9551i();
                ScheduledFuture unused = C0776p0.this.f1281c = null;
            }
        }
    }

    C0776p0(C0769o0 o0Var) {
        this.f1282d = o0Var;
    }

    /* renamed from: d */
    private void m730d() {
        if (this.f1280b == null) {
            try {
                this.f1280b = this.f1279a.schedule(new C0777a(), this.f1282d.mo9790a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0580a0.C0581a().mo9419a("RejectedExecutionException when scheduling session stop ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m731e() {
        new C0580a0.C0581a().mo9419a("AdColony session ending, releasing Context.").mo9421a(C0580a0.f187e);
        C0578a.m143c().mo9596c(true);
        C0578a.m137a((Context) null);
        this.f1282d.mo9801f(true);
        this.f1282d.mo9803g(true);
        this.f1282d.mo9807l();
        if (C0578a.m143c().mo9617u().mo9549f()) {
            ScheduledFuture<?> scheduledFuture = this.f1281c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f1281c.cancel(false);
            }
            try {
                this.f1281c = this.f1279a.schedule(new C0778b(), 10, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                new C0580a0.C0581a().mo9419a("RejectedExecutionException when scheduling message pumping stop ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9814c() {
        m726a();
    }

    /* renamed from: a */
    private void m726a() {
        ScheduledFuture<?> scheduledFuture = this.f1280b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f1280b.cancel(false);
            this.f1280b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9813b() {
        m730d();
    }
}
