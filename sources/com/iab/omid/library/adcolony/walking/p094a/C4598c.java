package com.iab.omid.library.adcolony.walking.p094a;

import com.iab.omid.library.adcolony.walking.p094a.C4595b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.adcolony.walking.a.c */
public class C4598c implements C4595b.C4596a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10362a;

    /* renamed from: b */
    private final ThreadPoolExecutor f10363b;

    /* renamed from: c */
    private final ArrayDeque<C4595b> f10364c = new ArrayDeque<>();

    /* renamed from: d */
    private C4595b f10365d = null;

    public C4598c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f10362a = linkedBlockingQueue;
        this.f10363b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m9698a() {
        C4595b poll = this.f10364c.poll();
        this.f10365d = poll;
        if (poll != null) {
            poll.mo38673a(this.f10363b);
        }
    }

    /* renamed from: a */
    public void mo38675a(C4595b bVar) {
        this.f10365d = null;
        m9698a();
    }

    /* renamed from: b */
    public void mo38678b(C4595b bVar) {
        bVar.mo38671a((C4595b.C4596a) this);
        this.f10364c.add(bVar);
        if (this.f10365d == null) {
            m9698a();
        }
    }
}
