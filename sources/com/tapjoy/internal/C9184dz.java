package com.tapjoy.internal;

import com.tapjoy.internal.C9181dy;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.dz */
public final class C9184dz implements C9181dy.C9182a {

    /* renamed from: a */
    private final BlockingQueue f22568a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f22569b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f22568a);

    /* renamed from: c */
    private final ArrayDeque f22570c = new ArrayDeque();

    /* renamed from: d */
    private C9181dy f22571d = null;

    /* renamed from: a */
    public final void mo57975a() {
        this.f22571d = null;
        m24576b();
    }

    /* renamed from: a */
    public final void mo57978a(C9181dy dyVar) {
        dyVar.f22566d = this;
        this.f22570c.add(dyVar);
        if (this.f22571d == null) {
            m24576b();
        }
    }

    /* renamed from: b */
    private void m24576b() {
        C9181dy dyVar = (C9181dy) this.f22570c.poll();
        this.f22571d = dyVar;
        if (dyVar != null) {
            dyVar.executeOnExecutor(this.f22569b, new Object[0]);
        }
    }
}
