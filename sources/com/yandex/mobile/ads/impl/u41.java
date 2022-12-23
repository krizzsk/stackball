package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class u41 {

    /* renamed from: a */
    private final AtomicInteger f40565a = new AtomicInteger();

    /* renamed from: b */
    private final Set<l41<?>> f40566b = new HashSet();

    /* renamed from: c */
    private final PriorityBlockingQueue<l41<?>> f40567c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final PriorityBlockingQueue<l41<?>> f40568d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private final C13045fd f40569e;

    /* renamed from: f */
    private final cv0 f40570f;

    /* renamed from: g */
    private final h51 f40571g;

    /* renamed from: h */
    private final dv0[] f40572h;

    /* renamed from: i */
    private C13971md f40573i;

    /* renamed from: j */
    private final List<C14741c> f40574j = new ArrayList();

    /* renamed from: k */
    private final List<C14739a> f40575k = new ArrayList();

    /* renamed from: com.yandex.mobile.ads.impl.u41$a */
    public interface C14739a {
        /* renamed from: a */
        void mo70289a(l41<?> l41, int i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.u41$b */
    public interface C14740b {
        /* renamed from: a */
        boolean mo69871a(l41<?> l41);
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.u41$c */
    public interface C14741c<T> {
        /* renamed from: a */
        void mo70290a(l41<T> l41);
    }

    public u41(C13045fd fdVar, cv0 cv0, int i, h51 h51) {
        this.f40569e = fdVar;
        this.f40570f = cv0;
        this.f40572h = new dv0[i];
        this.f40571g = h51;
    }

    /* renamed from: a */
    public void mo70285a() {
        C13971md mdVar = this.f40573i;
        if (mdVar != null) {
            mdVar.mo68646b();
        }
        for (dv0 dv0 : this.f40572h) {
            if (dv0 != null) {
                dv0.mo66704b();
            }
        }
        C13971md mdVar2 = new C13971md(this.f40567c, this.f40568d, this.f40569e, this.f40571g);
        this.f40573i = mdVar2;
        mdVar2.start();
        for (int i = 0; i < this.f40572h.length; i++) {
            dv0 dv02 = new dv0(this.f40568d, this.f40570f, this.f40569e, this.f40571g);
            this.f40572h[i] = dv02;
            dv02.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void mo70288b(l41<T> l41) {
        synchronized (this.f40566b) {
            this.f40566b.remove(l41);
        }
        synchronized (this.f40574j) {
            for (C14741c a : this.f40574j) {
                a.mo70290a(l41);
            }
        }
        mo70286a(l41, 5);
    }

    /* renamed from: a */
    public void mo70287a(C14740b bVar) {
        synchronized (this.f40566b) {
            for (l41 next : this.f40566b) {
                if (bVar.mo69871a(next)) {
                    next.mo66995a();
                }
            }
        }
    }

    /* renamed from: a */
    public <T> l41<T> mo70284a(l41<T> l41) {
        l41.mo68331a(this);
        synchronized (this.f40566b) {
            this.f40566b.add(l41);
        }
        l41.mo68338b(this.f40565a.incrementAndGet());
        l41.mo68337a("add-to-queue");
        mo70286a(l41, 0);
        if (!l41.mo68353q()) {
            this.f40568d.add(l41);
        } else {
            this.f40567c.add(l41);
        }
        return l41;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70286a(l41<?> l41, int i) {
        synchronized (this.f40575k) {
            for (C14739a a : this.f40575k) {
                a.mo70289a(l41, i);
            }
        }
    }
}
