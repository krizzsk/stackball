package com.flurry.sdk;

import com.flurry.sdk.C2625eq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.cz */
public class C2515cz<T extends C2625eq> {

    /* renamed from: a */
    private static final String f5888a = C2515cz.class.getSimpleName();

    /* renamed from: b */
    private final C2504cq<Object, T> f5889b = new C2504cq<>();

    /* renamed from: c */
    private final HashMap<T, Object> f5890c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<T, Future<?>> f5891d = new HashMap<>();

    /* renamed from: e */
    private final ThreadPoolExecutor f5892e;

    public C2515cz(String str, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        C25161 r0 = new ThreadPoolExecutor(timeUnit, blockingQueue) {
            /* access modifiers changed from: protected */
            public final void beforeExecute(Thread thread, Runnable runnable) {
                super.beforeExecute(thread, runnable);
                final C2625eq a = C2515cz.m5430a(runnable);
                if (a != null) {
                    new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                        }
                    }.run();
                }
            }

            /* access modifiers changed from: protected */
            public final void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                final C2625eq a = C2515cz.m5430a(runnable);
                if (a != null) {
                    synchronized (C2515cz.this.f5891d) {
                        C2515cz.this.f5891d.remove(a);
                    }
                    C2515cz.this.m5433a(a);
                    new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                        }
                    }.run();
                }
            }

            /* access modifiers changed from: protected */
            public final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
                C2514cy cyVar = new C2514cy(runnable, v);
                synchronized (C2515cz.this.f5891d) {
                    C2515cz.this.f5891d.put((C2625eq) runnable, cyVar);
                }
                return cyVar;
            }

            /* access modifiers changed from: protected */
            public final <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
                throw new UnsupportedOperationException("Callable not supported");
            }
        };
        this.f5892e = r0;
        r0.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                super.rejectedExecution(runnable, threadPoolExecutor);
                final C2625eq a = C2515cz.m5430a(runnable);
                if (a != null) {
                    synchronized (C2515cz.this.f5891d) {
                        C2515cz.this.f5891d.remove(a);
                    }
                    C2515cz.this.m5433a(a);
                    new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                        }
                    }.run();
                }
            }
        });
        this.f5892e.setThreadFactory(new C2614ei(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5433a(T t) {
        m5435b(this.f5890c.get(t), t);
    }

    /* renamed from: b */
    private synchronized void m5435b(Object obj, T t) {
        this.f5889b.mo17707b(obj, t);
        this.f5890c.remove(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17728a(java.lang.Object r1, T r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L_0x0013
            if (r2 != 0) goto L_0x0006
            goto L_0x0013
        L_0x0006:
            r0.m5436c(r1, r2)     // Catch:{ all -> 0x0010 }
            java.util.concurrent.ThreadPoolExecutor r1 = r0.f5892e     // Catch:{ all -> 0x0010 }
            r1.submit(r2)     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)
            return
        L_0x0010:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0013:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2515cz.mo17728a(java.lang.Object, com.flurry.sdk.eq):void");
    }

    /* renamed from: c */
    private synchronized void m5436c(Object obj, T t) {
        this.f5889b.mo17704a(obj, t);
        this.f5890c.put(t, obj);
    }

    /* renamed from: c */
    public final synchronized void mo17729c() {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.addAll(this.f5889b.f5865a.keySet());
        for (Object a : hashSet) {
            mo17727a(a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17727a(Object obj) {
        if (obj != null) {
            HashSet<C2625eq> hashSet = new HashSet<>();
            hashSet.addAll(this.f5889b.mo17701a(obj));
            for (C2625eq b : hashSet) {
                m5434b(b);
            }
        }
    }

    /* renamed from: b */
    private synchronized void m5434b(final T t) {
        Future remove;
        if (t != null) {
            synchronized (this.f5891d) {
                remove = this.f5891d.remove(t);
            }
            m5433a(t);
            if (remove != null) {
                remove.cancel(true);
            }
            new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    t.mo17766h();
                }
            }.run();
        }
    }

    /* renamed from: a */
    static /* synthetic */ C2625eq m5430a(Runnable runnable) {
        if (runnable instanceof C2514cy) {
            return (C2625eq) ((C2514cy) runnable).mo17726a();
        }
        if (runnable instanceof C2625eq) {
            return (C2625eq) runnable;
        }
        String str = f5888a;
        C2530db.m5474a(6, str, "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }
}
