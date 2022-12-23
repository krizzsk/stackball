package com.iab.omid.library.ironsrc.walking.p112a;

import com.iab.omid.library.ironsrc.walking.p112a.C4743b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.c */
public class C4746c implements C4743b.C4744a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10691a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10692b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10691a);

    /* renamed from: c */
    private final ArrayDeque<C4743b> f10693c = new ArrayDeque<>();

    /* renamed from: d */
    private C4743b f10694d = null;

    /* renamed from: a */
    private void m10353a() {
        C4743b poll = this.f10693c.poll();
        this.f10694d = poll;
        if (poll != null) {
            poll.mo39219a(this.f10692b);
        }
    }

    /* renamed from: a */
    public void mo39221a(C4743b bVar) {
        this.f10694d = null;
        m10353a();
    }

    /* renamed from: b */
    public void mo39224b(C4743b bVar) {
        bVar.mo39217a((C4743b.C4744a) this);
        this.f10693c.add(bVar);
        if (this.f10694d == null) {
            m10353a();
        }
    }
}
