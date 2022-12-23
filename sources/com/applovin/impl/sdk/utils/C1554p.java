package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.C1469j;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.sdk.utils.p */
public class C1554p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f3785a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Timer f3786b;

    /* renamed from: c */
    private long f3787c;

    /* renamed from: d */
    private long f3788d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Runnable f3789e;

    /* renamed from: f */
    private long f3790f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f3791g = new Object();

    private C1554p(C1469j jVar, Runnable runnable) {
        this.f3785a = jVar;
        this.f3789e = runnable;
    }

    /* renamed from: a */
    public static C1554p m3559a(long j, C1469j jVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            C1554p pVar = new C1554p(jVar, runnable);
            pVar.f3787c = System.currentTimeMillis();
            pVar.f3788d = j;
            try {
                Timer timer = new Timer();
                pVar.f3786b = timer;
                timer.schedule(pVar.m3564e(), j);
            } catch (OutOfMemoryError e) {
                jVar.mo13139v().mo13278b("Timer", "Failed to create timer due to OOM error", e);
            }
            return pVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    /* renamed from: e */
    private TimerTask m3564e() {
        return new TimerTask() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    r0 = 0
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.C1554p.this     // Catch:{ all -> 0x001b }
                    java.lang.Runnable r1 = r1.f3789e     // Catch:{ all -> 0x001b }
                    r1.run()     // Catch:{ all -> 0x001b }
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.C1554p.this
                    java.lang.Object r1 = r1.f3791g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C1554p.this     // Catch:{ all -> 0x0018 }
                    java.util.Timer unused = r2.f3786b = r0     // Catch:{ all -> 0x0018 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    goto L_0x0042
                L_0x0018:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    throw r0
                L_0x001b:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C1554p.this     // Catch:{ all -> 0x0046 }
                    com.applovin.impl.sdk.j r2 = r2.f3785a     // Catch:{ all -> 0x0046 }
                    if (r2 == 0) goto L_0x0035
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C1554p.this     // Catch:{ all -> 0x0046 }
                    com.applovin.impl.sdk.j r2 = r2.f3785a     // Catch:{ all -> 0x0046 }
                    com.applovin.impl.sdk.q r2 = r2.mo13139v()     // Catch:{ all -> 0x0046 }
                    java.lang.String r3 = "Timer"
                    java.lang.String r4 = "Encountered error while executing timed task"
                    r2.mo13278b(r3, r4, r1)     // Catch:{ all -> 0x0046 }
                L_0x0035:
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.C1554p.this
                    java.lang.Object r1 = r1.f3791g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C1554p.this     // Catch:{ all -> 0x0043 }
                    java.util.Timer unused = r2.f3786b = r0     // Catch:{ all -> 0x0043 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0043 }
                L_0x0042:
                    return
                L_0x0043:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0043 }
                    throw r0
                L_0x0046:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C1554p.this
                    java.lang.Object r2 = r2.f3791g
                    monitor-enter(r2)
                    com.applovin.impl.sdk.utils.p r3 = com.applovin.impl.sdk.utils.C1554p.this     // Catch:{ all -> 0x0055 }
                    java.util.Timer unused = r3.f3786b = r0     // Catch:{ all -> 0x0055 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                    throw r1
                L_0x0055:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C1554p.C15551.run():void");
            }
        };
    }

    /* renamed from: a */
    public long mo13344a() {
        if (this.f3786b == null) {
            return this.f3788d - this.f3790f;
        }
        return this.f3788d - (System.currentTimeMillis() - this.f3787c);
    }

    /* renamed from: b */
    public void mo13345b() {
        synchronized (this.f3791g) {
            if (this.f3786b != null) {
                try {
                    this.f3786b.cancel();
                    this.f3790f = System.currentTimeMillis() - this.f3787c;
                } catch (Throwable th) {
                    this.f3786b = null;
                    throw th;
                }
                this.f3786b = null;
            }
        }
    }

    /* renamed from: c */
    public void mo13346c() {
        synchronized (this.f3791g) {
            if (this.f3790f > 0) {
                try {
                    long j = this.f3788d - this.f3790f;
                    this.f3788d = j;
                    if (j < 0) {
                        this.f3788d = 0;
                    }
                    Timer timer = new Timer();
                    this.f3786b = timer;
                    timer.schedule(m3564e(), this.f3788d);
                    this.f3787c = System.currentTimeMillis();
                } catch (Throwable th) {
                    this.f3790f = 0;
                    throw th;
                }
                this.f3790f = 0;
            }
        }
    }

    /* renamed from: d */
    public void mo13347d() {
        synchronized (this.f3791g) {
            if (this.f3786b != null) {
                try {
                    this.f3786b.cancel();
                    this.f3786b = null;
                } catch (Throwable th) {
                    this.f3786b = null;
                    this.f3790f = 0;
                    throw th;
                }
                this.f3790f = 0;
            }
        }
    }
}
