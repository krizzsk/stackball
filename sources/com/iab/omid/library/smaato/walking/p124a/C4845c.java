package com.iab.omid.library.smaato.walking.p124a;

import com.iab.omid.library.smaato.walking.p124a.C4842b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.smaato.walking.a.c */
public class C4845c implements C4842b.C4843a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10911a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10912b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10911a);

    /* renamed from: c */
    private final ArrayDeque<C4842b> f10913c = new ArrayDeque<>();

    /* renamed from: d */
    private C4842b f10914d = null;

    /* renamed from: a */
    private void m10786a() {
        C4842b poll = this.f10913c.poll();
        this.f10914d = poll;
        if (poll != null) {
            poll.mo39595a(this.f10912b);
        }
    }

    /* renamed from: a */
    public void mo39597a(C4842b bVar) {
        this.f10914d = null;
        m10786a();
    }

    /* renamed from: b */
    public void mo39600b(C4842b bVar) {
        bVar.mo39593a((C4842b.C4843a) this);
        this.f10913c.add(bVar);
        if (this.f10914d == null) {
            m10786a();
        }
    }
}
