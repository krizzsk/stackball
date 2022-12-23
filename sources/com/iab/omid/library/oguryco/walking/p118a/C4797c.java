package com.iab.omid.library.oguryco.walking.p118a;

import com.iab.omid.library.oguryco.walking.p118a.C4794b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.oguryco.walking.a.c */
public class C4797c implements C4794b.C4795a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10812a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10813b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10812a);

    /* renamed from: c */
    private final ArrayDeque<C4794b> f10814c = new ArrayDeque<>();

    /* renamed from: d */
    private C4794b f10815d = null;

    /* renamed from: a */
    private void m10582a() {
        C4794b poll = this.f10814c.poll();
        this.f10815d = poll;
        if (poll != null) {
            poll.mo39433a(this.f10813b);
        }
    }

    /* renamed from: a */
    public void mo39435a(C4794b bVar) {
        this.f10815d = null;
        m10582a();
    }

    /* renamed from: b */
    public void mo39438b(C4794b bVar) {
        bVar.mo39431a((C4794b.C4795a) this);
        this.f10814c.add(bVar);
        if (this.f10815d == null) {
            m10582a();
        }
    }
}
