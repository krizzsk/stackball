package com.iab.omid.library.corpmailru.walking.p100a;

import com.iab.omid.library.corpmailru.walking.p100a.C4645b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.c */
public class C4648c implements C4645b.C4646a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10475a;

    /* renamed from: b */
    private final ThreadPoolExecutor f10476b;

    /* renamed from: c */
    private final ArrayDeque<C4645b> f10477c = new ArrayDeque<>();

    /* renamed from: d */
    private C4645b f10478d = null;

    public C4648c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f10475a = linkedBlockingQueue;
        this.f10476b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m9922a() {
        C4645b poll = this.f10477c.poll();
        this.f10478d = poll;
        if (poll != null) {
            poll.mo38867a(this.f10476b);
        }
    }

    /* renamed from: a */
    public void mo38869a(C4645b bVar) {
        this.f10478d = null;
        m9922a();
    }

    /* renamed from: b */
    public void mo38872b(C4645b bVar) {
        bVar.mo38865a((C4645b.C4646a) this);
        this.f10477c.add(bVar);
        if (this.f10478d == null) {
            m9922a();
        }
    }
}
