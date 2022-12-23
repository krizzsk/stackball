package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.utils.l */
public final class C5802l {

    /* renamed from: a */
    private Map<String, Integer> f14109a = new HashMap();

    /* renamed from: b */
    private Map<String, Integer> f14110b = new HashMap();

    /* renamed from: com.ironsource.mediationsdk.utils.l$a */
    public interface C5803a {
        /* renamed from: j */
        int mo41605j();

        /* renamed from: k */
        String mo41606k();
    }

    public C5802l(List<C5803a> list) {
        for (C5803a next : list) {
            this.f14109a.put(next.mo41606k(), 0);
            this.f14110b.put(next.mo41606k(), Integer.valueOf(next.mo41605j()));
        }
    }

    /* renamed from: a */
    public final void mo42131a(C5803a aVar) {
        synchronized (this) {
            String k = aVar.mo41606k();
            if (this.f14109a.containsKey(k)) {
                this.f14109a.put(k, Integer.valueOf(this.f14109a.get(k).intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo42132a() {
        for (String next : this.f14110b.keySet()) {
            if (this.f14109a.get(next).intValue() < this.f14110b.get(next).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42133b(com.ironsource.mediationsdk.utils.C5802l.C5803a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.mo41606k()     // Catch:{ all -> 0x0025 }
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f14109a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f14109a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0025 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0025 }
            int r4 = r4.mo41605j()     // Catch:{ all -> 0x0025 }
            if (r0 < r4) goto L_0x0021
            r2 = 1
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5802l.mo42133b(com.ironsource.mediationsdk.utils.l$a):boolean");
    }
}
