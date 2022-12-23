package com.tapjoy.internal;

import com.tapjoy.internal.C9489kf;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tapjoy.internal.kc */
public abstract class C9484kc implements C9489kf {

    /* renamed from: a */
    private final ReentrantLock f23577a = new ReentrantLock();

    /* renamed from: b */
    private final C9485a f23578b = new C9485a(this, (byte) 0);

    /* renamed from: c */
    private final C9485a f23579c = new C9485a(this, (byte) 0);

    /* renamed from: d */
    private C9489kf.C9490a f23580d = C9489kf.C9490a.NEW;

    /* renamed from: e */
    private boolean f23581e = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58458a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo58459b();

    /* renamed from: e */
    public final C9488ke mo58455e() {
        this.f23577a.lock();
        try {
            if (this.f23580d == C9489kf.C9490a.NEW) {
                this.f23580d = C9489kf.C9490a.STARTING;
                mo58458a();
            }
        } catch (Throwable th) {
            this.f23577a.unlock();
            throw th;
        }
        this.f23577a.unlock();
        return this.f23578b;
    }

    /* renamed from: g */
    private C9488ke m25481g() {
        this.f23577a.lock();
        try {
            if (this.f23580d == C9489kf.C9490a.NEW) {
                this.f23580d = C9489kf.C9490a.TERMINATED;
                this.f23578b.mo58462a((Object) C9489kf.C9490a.TERMINATED);
                this.f23579c.mo58462a((Object) C9489kf.C9490a.TERMINATED);
            } else if (this.f23580d == C9489kf.C9490a.STARTING) {
                this.f23581e = true;
                this.f23578b.mo58462a((Object) C9489kf.C9490a.STOPPING);
            } else if (this.f23580d == C9489kf.C9490a.RUNNING) {
                this.f23580d = C9489kf.C9490a.STOPPING;
                mo58459b();
            }
        } catch (Throwable th) {
            this.f23577a.unlock();
            throw th;
        }
        this.f23577a.unlock();
        return this.f23579c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58476c() {
        this.f23577a.lock();
        try {
            if (this.f23580d == C9489kf.C9490a.STARTING) {
                this.f23580d = C9489kf.C9490a.RUNNING;
                if (this.f23581e) {
                    m25481g();
                } else {
                    this.f23578b.mo58462a((Object) C9489kf.C9490a.RUNNING);
                }
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f23580d);
            mo58475a(illegalStateException);
            throw illegalStateException;
        } finally {
            this.f23577a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo58477d() {
        this.f23577a.lock();
        try {
            if (this.f23580d != C9489kf.C9490a.STOPPING) {
                if (this.f23580d != C9489kf.C9490a.RUNNING) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStopped() when the service is " + this.f23580d);
                    mo58475a(illegalStateException);
                    throw illegalStateException;
                }
            }
            this.f23580d = C9489kf.C9490a.TERMINATED;
            this.f23579c.mo58462a((Object) C9489kf.C9490a.TERMINATED);
        } finally {
            this.f23577a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58475a(Throwable th) {
        C9464jp.m25446a(th);
        this.f23577a.lock();
        try {
            if (this.f23580d == C9489kf.C9490a.STARTING) {
                this.f23578b.mo58463a(th);
                this.f23579c.mo58463a((Throwable) new Exception("Service failed to start.", th));
            } else if (this.f23580d == C9489kf.C9490a.STOPPING) {
                this.f23579c.mo58463a(th);
            } else if (this.f23580d == C9489kf.C9490a.RUNNING) {
                this.f23579c.mo58463a((Throwable) new Exception("Service failed while running", th));
            } else if (this.f23580d == C9489kf.C9490a.NEW || this.f23580d == C9489kf.C9490a.TERMINATED) {
                throw new IllegalStateException("Failed while in state:" + this.f23580d, th);
            }
            this.f23580d = C9489kf.C9490a.FAILED;
        } finally {
            this.f23577a.unlock();
        }
    }

    /* renamed from: f */
    public final C9489kf.C9490a mo58456f() {
        C9489kf.C9490a aVar;
        this.f23577a.lock();
        try {
            if (!this.f23581e || this.f23580d != C9489kf.C9490a.STARTING) {
                aVar = this.f23580d;
            } else {
                aVar = C9489kf.C9490a.STOPPING;
            }
            return aVar;
        } finally {
            this.f23577a.unlock();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + mo58456f() + "]";
    }

    /* renamed from: com.tapjoy.internal.kc$a */
    class C9485a extends C9482kb {
        private C9485a() {
        }

        /* synthetic */ C9485a(C9484kc kcVar, byte b) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C9489kf.C9490a get(long j, TimeUnit timeUnit) {
            try {
                return (C9489kf.C9490a) super.get(j, timeUnit);
            } catch (TimeoutException unused) {
                throw new TimeoutException(C9484kc.this.toString());
            }
        }
    }
}
