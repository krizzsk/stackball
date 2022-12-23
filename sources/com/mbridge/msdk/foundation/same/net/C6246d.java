package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import java.util.concurrent.Executor;

/* renamed from: com.mbridge.msdk.foundation.same.net.d */
/* compiled from: ExecutorDelivery */
public class C6246d implements C6243c {

    /* renamed from: a */
    private final String f15498a = C6246d.class.getSimpleName();

    /* renamed from: b */
    private final Executor f15499b;

    public C6246d(final Handler handler) {
        this.f15499b = new Executor() {
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public final void mo43820a(C6290i<?> iVar, C6293k<?> kVar) {
        Executor executor = this.f15499b;
        if (executor != null) {
            executor.execute(new C6253a(iVar, kVar));
        }
    }

    /* renamed from: a */
    public final void mo43819a(C6290i<?> iVar, C6240a aVar) {
        if (this.f15499b != null) {
            this.f15499b.execute(new C6253a(iVar, C6293k.m15929a(aVar)));
        }
    }

    /* renamed from: a */
    public final void mo43817a(final C6290i<?> iVar) {
        Executor executor = this.f15499b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo43891k();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo43821b(final C6290i<?> iVar) {
        Executor executor = this.f15499b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo43889i();
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo43822c(final C6290i<?> iVar) {
        Executor executor = this.f15499b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo43890j();
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo43823d(final C6290i<?> iVar) {
        Executor executor = this.f15499b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo43892l();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo43818a(C6290i<?> iVar, long j, long j2) {
        Executor executor = this.f15499b;
        if (executor != null) {
            final C6290i<?> iVar2 = iVar;
            final long j3 = j;
            final long j4 = j2;
            executor.execute(new Runnable() {
                public final void run() {
                    iVar2.mo43877a(j3, j4);
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.d$a */
    /* compiled from: ExecutorDelivery */
    private class C6253a implements Runnable {

        /* renamed from: b */
        private final C6290i f15515b;

        /* renamed from: c */
        private final C6293k f15516c;

        public C6253a(C6290i iVar, C6293k kVar) {
            this.f15515b = iVar;
            this.f15516c = kVar;
        }

        public final void run() {
            if (this.f15515b.mo43884c()) {
                this.f15515b.mo43881a("canceled-at-delivery");
                this.f15515b.mo43889i();
                return;
            }
            if (this.f15516c.f15628b == null) {
                this.f15515b.mo43880a(this.f15516c);
            } else {
                this.f15515b.mo43878a(this.f15516c.f15628b);
            }
            this.f15515b.mo43881a("done");
            this.f15515b.mo43891k();
        }
    }
}
