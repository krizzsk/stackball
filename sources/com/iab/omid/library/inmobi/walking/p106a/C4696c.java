package com.iab.omid.library.inmobi.walking.p106a;

import com.iab.omid.library.inmobi.walking.p106a.C4693b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.inmobi.walking.a.c */
public class C4696c implements C4693b.C4694a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10577a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10578b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10577a);

    /* renamed from: c */
    private final ArrayDeque<C4693b> f10579c = new ArrayDeque<>();

    /* renamed from: d */
    private C4693b f10580d = null;

    /* renamed from: a */
    private void m10132a() {
        C4693b poll = this.f10579c.poll();
        this.f10580d = poll;
        if (poll != null) {
            poll.mo39033a(this.f10578b);
        }
    }

    /* renamed from: a */
    public void mo39035a(C4693b bVar) {
        this.f10580d = null;
        m10132a();
    }

    /* renamed from: b */
    public void mo39038b(C4693b bVar) {
        bVar.mo39031a((C4693b.C4694a) this);
        this.f10579c.add(bVar);
        if (this.f10580d == null) {
            m10132a();
        }
    }
}
