package com.iab.omid.library.vungle.walking.p130a;

import com.iab.omid.library.vungle.walking.p130a.C4892b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.vungle.walking.a.c */
public class C4895c implements C4892b.C4893a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f11024a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f11025b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f11024a);

    /* renamed from: c */
    private final ArrayDeque<C4892b> f11026c = new ArrayDeque<>();

    /* renamed from: d */
    private C4892b f11027d = null;

    /* renamed from: a */
    private void m11010a() {
        C4892b poll = this.f11026c.poll();
        this.f11027d = poll;
        if (poll != null) {
            poll.mo39789a(this.f11025b);
        }
    }

    /* renamed from: a */
    public void mo39791a(C4892b bVar) {
        this.f11027d = null;
        m11010a();
    }

    /* renamed from: b */
    public void mo39794b(C4892b bVar) {
        bVar.mo39787a((C4892b.C4893a) this);
        this.f11026c.add(bVar);
        if (this.f11027d == null) {
            m11010a();
        }
    }
}
