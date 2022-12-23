package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.cg */
public final class C2485cg extends C2515cz<C2542dk> {

    /* renamed from: a */
    private static C2485cg f5812a;

    protected C2485cg() {
        super(C2485cg.class.getName(), TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C2513cx()));
    }

    /* renamed from: a */
    public static synchronized C2485cg m5355a() {
        C2485cg cgVar;
        synchronized (C2485cg.class) {
            if (f5812a == null) {
                f5812a = new C2485cg();
            }
            cgVar = f5812a;
        }
        return cgVar;
    }

    /* renamed from: b */
    public static synchronized void m5356b() {
        synchronized (C2485cg.class) {
            if (f5812a != null) {
                f5812a.mo17729c();
            }
            f5812a = null;
        }
    }
}
