package com.flurry.sdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.flurry.sdk.cw */
public final class C2511cw {

    /* renamed from: a */
    private static C2511cw f5879a;

    /* renamed from: b */
    private final C2504cq<String, C2547dl<C2510cv<?>>> f5880b = new C2504cq<>();

    /* renamed from: c */
    private final C2504cq<C2547dl<C2510cv<?>>, String> f5881c = new C2504cq<>();

    private C2511cw() {
    }

    /* renamed from: a */
    public static synchronized C2511cw m5419a() {
        C2511cw cwVar;
        synchronized (C2511cw.class) {
            if (f5879a == null) {
                f5879a = new C2511cw();
            }
            cwVar = f5879a;
        }
        return cwVar;
    }

    /* renamed from: b */
    public static synchronized void m5421b() {
        synchronized (C2511cw.class) {
            if (f5879a != null) {
                f5879a.m5422c();
                f5879a = null;
            }
        }
    }

    /* renamed from: c */
    private synchronized void m5422c() {
        this.f5880b.mo17703a();
        this.f5881c.mo17703a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17723a(java.lang.String r3, com.flurry.sdk.C2510cv<?> r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            if (r4 != 0) goto L_0x000a
            goto L_0x002c
        L_0x000a:
            com.flurry.sdk.dl r0 = new com.flurry.sdk.dl     // Catch:{ all -> 0x002e }
            r0.<init>(r4)     // Catch:{ all -> 0x002e }
            com.flurry.sdk.cq<java.lang.String, com.flurry.sdk.dl<com.flurry.sdk.cv<?>>> r4 = r2.f5880b     // Catch:{ all -> 0x002e }
            r1 = 0
            java.util.List r4 = r4.mo17702a(r3, (boolean) r1)     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x001c
            boolean r1 = r4.contains(r0)     // Catch:{ all -> 0x002e }
        L_0x001c:
            if (r1 == 0) goto L_0x0020
            monitor-exit(r2)
            return
        L_0x0020:
            com.flurry.sdk.cq<java.lang.String, com.flurry.sdk.dl<com.flurry.sdk.cv<?>>> r4 = r2.f5880b     // Catch:{ all -> 0x002e }
            r4.mo17704a(r3, r0)     // Catch:{ all -> 0x002e }
            com.flurry.sdk.cq<com.flurry.sdk.dl<com.flurry.sdk.cv<?>>, java.lang.String> r4 = r2.f5881c     // Catch:{ all -> 0x002e }
            r4.mo17704a(r0, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r2)
            return
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2511cw.mo17723a(java.lang.String, com.flurry.sdk.cv):void");
    }

    /* renamed from: b */
    public final synchronized void mo17724b(String str, C2510cv<?> cvVar) {
        if (!TextUtils.isEmpty(str)) {
            C2547dl dlVar = new C2547dl(cvVar);
            this.f5880b.mo17707b(str, dlVar);
            this.f5881c.mo17707b(dlVar, str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo17722a(C2510cv<?> cvVar) {
        if (cvVar != null) {
            C2547dl dlVar = new C2547dl(cvVar);
            for (String b : this.f5881c.mo17701a(dlVar)) {
                this.f5880b.mo17707b(b, dlVar);
            }
            this.f5881c.mo17706b(dlVar);
        }
    }

    /* renamed from: a */
    public final void mo17721a(final C2509cu cuVar) {
        for (final C2510cv next : m5420a(cuVar.mo17719a())) {
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    next.mo17521a(cuVar);
                }
            });
        }
    }

    /* renamed from: a */
    private synchronized List<C2510cv<?>> m5420a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C2547dl<C2510cv<?>>> it = this.f5880b.mo17701a(str).iterator();
        while (it.hasNext()) {
            C2510cv cvVar = (C2510cv) it.next().get();
            if (cvVar == null) {
                it.remove();
            } else {
                arrayList.add(cvVar);
            }
        }
        return arrayList;
    }
}
