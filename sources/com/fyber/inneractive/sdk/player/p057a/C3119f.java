package com.fyber.inneractive.sdk.player.p057a;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.a.f */
public final class C3119f {

    /* renamed from: j */
    private static C3119f f7691j = new C3119f();

    /* renamed from: a */
    public AtomicBoolean f7692a = new AtomicBoolean(false);

    /* renamed from: b */
    public ServerSocket f7693b;

    /* renamed from: c */
    public int f7694c;

    /* renamed from: d */
    public Thread f7695d;

    /* renamed from: e */
    public boolean f7696e = false;

    /* renamed from: f */
    List<C3103a> f7697f = new CopyOnWriteArrayList();

    /* renamed from: g */
    Executor f7698g = Executors.newCachedThreadPool(new ThreadFactory() {

        /* renamed from: a */
        AtomicInteger f7701a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MediaCacheStreamer-HandlerThread-" + this.f7701a.getAndIncrement());
        }
    });

    /* renamed from: h */
    List<C3138k> f7699h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public Runnable f7700i = new Runnable() {
        public final void run() {
            while (C3119f.this.f7692a.compareAndSet(true, true)) {
                try {
                    Socket accept = C3119f.this.f7693b.accept();
                    IAlog.m9033a("MediaCacheStreamer Got a possible connection - %s", accept);
                    C3119f.m7379a(C3119f.this, accept);
                } catch (IOException e) {
                    IAlog.m9032a("MediaCacheStreamer Failed accepting connections", (Throwable) e, new Object[0]);
                }
            }
        }
    };

    private C3119f() {
    }

    /* renamed from: a */
    public static C3119f m7377a() {
        return f7691j;
    }

    /* renamed from: a */
    public final C3103a mo18710a(String str) {
        for (C3103a next : this.f7697f) {
            if (next.f7630g.startsWith(str.contains("?") ? str.substring(1).substring(0, str.indexOf("?") - 1) : str.substring(1))) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m7379a(C3119f fVar, Socket socket) {
        C3138k kVar = new C3138k(fVar, socket);
        Executor newSingleThreadExecutor = kVar.f7746a == null ? Executors.newSingleThreadExecutor() : kVar.f7746a;
        IAlog.m9033a("StreamingHandler[%s] requesting execution of a new runnable", kVar);
        newSingleThreadExecutor.execute(new Runnable() {
            public final void run() {
                IAlog.m9033a("StreamingHandler[%s] execution start", this);
                try {
                    C3138k.m7405a(C3138k.this);
                } catch (Throwable th) {
                    C3142m.m7409a((Closeable) C3138k.this);
                    throw th;
                }
                C3142m.m7409a((Closeable) C3138k.this);
                IAlog.m9033a("StreamingHandler[%s] execution finish", this);
            }
        });
        fVar.f7699h.add(kVar);
    }
}
