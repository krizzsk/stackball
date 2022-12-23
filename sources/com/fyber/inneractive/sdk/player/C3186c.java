package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.p058b.C3161f;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.fyber.inneractive.sdk.player.c */
public final class C3186c {

    /* renamed from: a */
    C3161f f7914a;

    /* renamed from: b */
    public ScheduledThreadPoolExecutor f7915b;

    /* renamed from: c */
    public Runnable f7916c;

    /* renamed from: d */
    int f7917d;

    /* renamed from: e */
    boolean f7918e = false;

    public C3186c(C3161f fVar) {
        this.f7914a = fVar;
        this.f7916c = new Runnable() {
            public final void run() {
                C3186c cVar = C3186c.this;
                IAlog.m9034b("player progress monitor: run started", new Object[0]);
                int g = cVar.f7914a.mo18782g();
                if (!cVar.f7918e) {
                    IAlog.m9034b("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(g - cVar.f7917d));
                    if (g - cVar.f7917d >= 2000) {
                        IAlog.m9034b("run: setting played 2 seconds flag", new Object[0]);
                        cVar.f7918e = true;
                    }
                }
                cVar.f7914a.mo18774b(g);
            }
        };
    }
}
