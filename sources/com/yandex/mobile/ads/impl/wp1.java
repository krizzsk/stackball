package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13045fd;
import com.yandex.mobile.ads.impl.l41;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

class wp1 implements l41.C13832b {

    /* renamed from: a */
    private final Map<String, List<l41<?>>> f42081a = new HashMap();

    /* renamed from: b */
    private final h51 f42082b;

    /* renamed from: c */
    private final C13971md f42083c;

    /* renamed from: d */
    private final BlockingQueue<l41<?>> f42084d;

    wp1(C13971md mdVar, BlockingQueue<l41<?>> blockingQueue, h51 h51) {
        this.f42082b = h51;
        this.f42083c = mdVar;
        this.f42084d = blockingQueue;
    }

    /* renamed from: a */
    public void mo70736a(l41<?> l41, c51<?> c51) {
        List<l41> remove;
        C13045fd.C13046a aVar = c51.f31811b;
        if (aVar == null || aVar.mo66993a()) {
            mo70738b(l41);
            return;
        }
        String d = l41.mo68343d();
        synchronized (this) {
            remove = this.f42081a.remove(d);
        }
        if (remove != null) {
            if (pp1.f38780b) {
                pp1.m40901d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), d);
            }
            for (l41 a : remove) {
                ((g40) this.f42082b).mo67181a((l41<?>) a, c51);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo70738b(l41<?> l41) {
        BlockingQueue<l41<?>> blockingQueue;
        String d = l41.mo68343d();
        List remove = this.f42081a.remove(d);
        if (remove != null && !remove.isEmpty()) {
            if (pp1.f38780b) {
                pp1.m40901d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), d);
            }
            l41 l412 = (l41) remove.remove(0);
            this.f42081a.put(d, remove);
            l412.mo68335a((l41.C13832b) this);
            if (!(this.f42083c == null || (blockingQueue = this.f42084d) == null)) {
                try {
                    blockingQueue.put(l412);
                } catch (InterruptedException e) {
                    pp1.m40900c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f42083c.mo68646b();
                }
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo70737a(com.yandex.mobile.ads.impl.l41<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo68343d()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.yandex.mobile.ads.impl.l41<?>>> r1 = r5.f42081a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.yandex.mobile.ads.impl.l41<?>>> r1 = r5.f42081a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo68337a((java.lang.String) r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.yandex.mobile.ads.impl.l41<?>>> r6 = r5.f42081a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.yandex.mobile.ads.impl.pp1.f38780b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.yandex.mobile.ads.impl.pp1.m40899b(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.yandex.mobile.ads.impl.l41<?>>> r1 = r5.f42081a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo68335a((com.yandex.mobile.ads.impl.l41.C13832b) r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.yandex.mobile.ads.impl.pp1.f38780b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "new request, sending to network %s"
            com.yandex.mobile.ads.impl.pp1.m40899b(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wp1.mo70737a(com.yandex.mobile.ads.impl.l41):boolean");
    }
}
