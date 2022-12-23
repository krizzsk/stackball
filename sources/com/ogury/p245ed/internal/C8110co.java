package com.ogury.p245ed.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ogury.ed.internal.co */
public final class C8110co implements C8117ct {

    /* renamed from: a */
    public static final C8111a f21040a = new C8111a((byte) 0);

    /* renamed from: b */
    private final ExecutorService f21041b;

    public C8110co() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(4, Runtime.getRuntime().availableProcessors()));
        C8467mq.m23878a((Object) newFixedThreadPool, "newFixedThreadPool(nrOfCachedThreads)");
        this.f21041b = newFixedThreadPool;
    }

    /* renamed from: com.ogury.ed.internal.co$a */
    public static final class C8111a {
        public /* synthetic */ C8111a(byte b) {
            this();
        }

        private C8111a() {
        }
    }

    /* renamed from: a */
    public final void mo53278a(Runnable runnable) {
        C8467mq.m23881b(runnable, "runnable");
        this.f21041b.execute(runnable);
    }
}
