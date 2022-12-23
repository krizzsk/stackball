package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.j */
public final class C3654j<T> {

    /* renamed from: a */
    private final Queue<T> f9935a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private C3655a<T> f9936b;

    /* renamed from: com.fyber.inneractive.sdk.util.j$a */
    public interface C3655a<TT> {
        /* renamed from: a */
        TT mo18457a();
    }

    public C3654j(int i, C3655a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f9935a.offer(aVar.mo18457a());
        }
        this.f9936b = aVar;
    }

    /* renamed from: a */
    public final T mo19573a() {
        T poll = this.f9935a.poll();
        return poll == null ? this.f9936b.mo18457a() : poll;
    }

    /* renamed from: a */
    public final void mo19574a(T t) {
        this.f9935a.offer(t);
    }
}
