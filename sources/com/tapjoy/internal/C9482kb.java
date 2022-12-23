package com.tapjoy.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.kb */
public abstract class C9482kb implements C9488ke {

    /* renamed from: a */
    private final C9483a f23573a = new C9483a();

    /* renamed from: b */
    private final C9486kd f23574b = new C9486kd();

    public Object get(long j, TimeUnit timeUnit) {
        C9483a aVar = this.f23573a;
        if (aVar.tryAcquireSharedNanos(-1, timeUnit.toNanos(j))) {
            return aVar.mo58469a();
        }
        throw new TimeoutException("Timeout waiting for task.");
    }

    public Object get() {
        C9483a aVar = this.f23573a;
        aVar.acquireSharedInterruptibly(-1);
        return aVar.mo58469a();
    }

    public boolean isDone() {
        return this.f23573a.mo58471b();
    }

    public boolean isCancelled() {
        return this.f23573a.mo58472c();
    }

    public boolean cancel(boolean z) {
        if (!this.f23573a.mo58470a((Object) null, (Throwable) null, 4)) {
            return false;
        }
        this.f23574b.mo58479a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58462a(@Nullable Object obj) {
        boolean a = this.f23573a.mo58470a(obj, (Throwable) null, 2);
        if (a) {
            this.f23574b.mo58479a();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58463a(Throwable th) {
        boolean a = this.f23573a.mo58470a((Object) null, (Throwable) C9464jp.m25446a(th), 2);
        if (a) {
            this.f23574b.mo58479a();
        }
        if (!(th instanceof Error)) {
            return a;
        }
        throw ((Error) th);
    }

    /* renamed from: com.tapjoy.internal.kb$a */
    static final class C9483a extends AbstractQueuedSynchronizer {

        /* renamed from: a */
        private Object f23575a;

        /* renamed from: b */
        private Throwable f23576b;

        C9483a() {
        }

        /* access modifiers changed from: protected */
        public final int tryAcquireShared(int i) {
            return mo58471b() ? 1 : -1;
        }

        /* access modifiers changed from: protected */
        public final boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Object mo58469a() {
            int state = getState();
            if (state != 2) {
                if (state != 4) {
                    throw new IllegalStateException("Error, synchronizer in invalid state: " + state);
                }
                throw new CancellationException("Task was cancelled.");
            } else if (this.f23576b == null) {
                return this.f23575a;
            } else {
                throw new ExecutionException(this.f23576b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo58471b() {
            return (getState() & 6) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo58472c() {
            return getState() == 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo58470a(@Nullable Object obj, @Nullable Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.f23575a = obj;
                this.f23576b = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }
    }
}
