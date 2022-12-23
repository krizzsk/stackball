package com.ironsource.mediationsdk.p137a;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C5715c;

/* renamed from: com.ironsource.mediationsdk.a.h */
public final class C5646h extends Thread {

    /* renamed from: b */
    private static C5646h f13352b;

    /* renamed from: a */
    private C5647a f13353a;

    /* renamed from: com.ironsource.mediationsdk.a.h$a */
    class C5647a extends HandlerThread {

        /* renamed from: a */
        Handler f13354a;

        C5647a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C5715c());
        }
    }

    private C5646h() {
        C5647a aVar = new C5647a(getClass().getSimpleName());
        this.f13353a = aVar;
        aVar.start();
        C5647a aVar2 = this.f13353a;
        aVar2.f13354a = new Handler(aVar2.getLooper());
    }

    /* renamed from: a */
    public static synchronized C5646h m13816a() {
        C5646h hVar;
        synchronized (C5646h.class) {
            if (f13352b == null) {
                f13352b = new C5646h();
            }
            hVar = f13352b;
        }
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41712a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.a.h$a r0 = r1.f13353a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            com.ironsource.mediationsdk.a.h$a r0 = r1.f13353a     // Catch:{ all -> 0x0012 }
            android.os.Handler r0 = r0.f13354a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            r0.post(r2)     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p137a.C5646h.mo41712a(java.lang.Runnable):void");
    }
}
