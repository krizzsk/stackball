package com.mbridge.msdk.foundation.same.p170e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.e.b */
/* compiled from: CommonTaskLoader */
public final class C6228b {

    /* renamed from: a */
    ThreadPoolExecutor f15475a;

    /* renamed from: b */
    HashMap<Long, C6225a> f15476b;

    /* renamed from: c */
    WeakReference<Context> f15477c;

    public C6228b(Context context, int i) {
        if (i == 0) {
            this.f15475a = new ThreadPoolExecutor(1, 5, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f15475a = new ThreadPoolExecutor(i, (i * 2) + 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f15475a.allowCoreThreadTimeOut(true);
        this.f15476b = new HashMap<>();
        this.f15477c = new WeakReference<>(context);
    }

    public C6228b(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
        this.f15475a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15476b = new HashMap<>();
        this.f15477c = new WeakReference<>(context);
    }

    /* renamed from: b */
    private synchronized void m15768b(final C6225a aVar, final C6225a.C6227b bVar) {
        this.f15476b.put(Long.valueOf(C6225a.f15466b), aVar);
        aVar.f15468d = new C6225a.C6227b() {
            /* renamed from: a */
            public final void mo42873a(C6225a.C6226a aVar) {
                if (aVar == C6225a.C6226a.CANCEL) {
                    C6228b.this.f15476b.remove(Long.valueOf(C6225a.f15466b));
                } else if (aVar == C6225a.C6226a.FINISH) {
                    C6228b.this.f15476b.remove(Long.valueOf(C6225a.f15466b));
                } else if (aVar == C6225a.C6226a.RUNNING && ((Context) C6228b.this.f15477c.get()) == null) {
                    C6228b.this.mo43806a();
                }
                C6225a.C6227b bVar = bVar;
                if (bVar != null) {
                    bVar.mo42873a(aVar);
                }
            }
        };
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43806a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.Long, com.mbridge.msdk.foundation.same.e.a> r0 = r2.f15476b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            com.mbridge.msdk.foundation.same.e.a r1 = (com.mbridge.msdk.foundation.same.p170e.C6225a) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r1.mo43804d()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x000b
        L_0x0021:
            java.util.HashMap<java.lang.Long, com.mbridge.msdk.foundation.same.e.a> r0 = r2.f15476b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r0.clear()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002a:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p170e.C6228b.mo43806a():void");
    }

    /* renamed from: a */
    public final void mo43807a(C6225a aVar) {
        m15768b(aVar, (C6225a.C6227b) null);
        this.f15475a.execute(aVar);
    }

    /* renamed from: a */
    public final void mo43808a(C6225a aVar, C6225a.C6227b bVar) {
        m15768b(aVar, bVar);
        this.f15475a.execute(aVar);
    }
}
