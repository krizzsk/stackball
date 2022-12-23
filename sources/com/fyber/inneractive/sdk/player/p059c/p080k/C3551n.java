package com.fyber.inneractive.sdk.player.p059c.p080k;

import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.n */
public final class C3551n {

    /* renamed from: a */
    public final Object f9632a;

    /* renamed from: b */
    public final PriorityQueue<Integer> f9633b;

    /* renamed from: c */
    public int f9634c;

    /* renamed from: a */
    public final void mo19413a() {
        synchronized (this.f9632a) {
            this.f9633b.remove(0);
            this.f9634c = this.f9633b.isEmpty() ? Integer.MIN_VALUE : this.f9633b.peek().intValue();
            this.f9632a.notifyAll();
        }
    }
}
