package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.appsetid.C10035a;
import com.yandex.metrica.appsetid.C10038c;
import com.yandex.metrica.appsetid.C10039d;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.ic */
public final class C11344ic {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C11312hc f27109a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f27110b = new CountDownLatch(1);

    /* renamed from: c */
    private final long f27111c = 20;

    /* renamed from: d */
    private final C10035a f27112d = new C11345a(this);

    /* renamed from: e */
    private final Context f27113e;

    /* renamed from: f */
    private final C10039d f27114f;

    public C11344ic(Context context, C10039d dVar) {
        this.f27113e = context;
        this.f27114f = dVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ic$a */
    public static final class C11345a implements C10035a {

        /* renamed from: a */
        final /* synthetic */ C11344ic f27115a;

        C11345a(C11344ic icVar) {
            this.f27115a = icVar;
        }

        /* renamed from: a */
        public void mo60933a(String str, C10038c cVar) {
            this.f27115a.f27109a = new C11312hc(str, cVar);
            this.f27115a.f27110b.countDown();
        }

        /* renamed from: a */
        public void mo60934a(Throwable th) {
            this.f27115a.f27110b.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(2:4|5)|6|7|(1:9)(1:10)|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.yandex.metrica.impl.p265ob.C11312hc mo63037a() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.hc r0 = r4.f27109a     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x001f }
            r1 = 1
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            r4.f27110b = r0     // Catch:{ all -> 0x001f }
            com.yandex.metrica.appsetid.d r0 = r4.f27114f     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r4.f27113e     // Catch:{ all -> 0x001f }
            com.yandex.metrica.appsetid.a r2 = r4.f27112d     // Catch:{ all -> 0x001f }
            r0.mo60935a(r1, r2)     // Catch:{ all -> 0x001f }
            java.util.concurrent.CountDownLatch r0 = r4.f27110b     // Catch:{ all -> 0x001f }
            long r1 = r4.f27111c     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x001f }
            r0.await(r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001f:
            com.yandex.metrica.impl.ob.hc r0 = r4.f27109a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0024
            goto L_0x002e
        L_0x0024:
            com.yandex.metrica.impl.ob.hc r0 = new com.yandex.metrica.impl.ob.hc     // Catch:{ all -> 0x0030 }
            com.yandex.metrica.appsetid.c r1 = com.yandex.metrica.appsetid.C10038c.UNKNOWN     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0030 }
            r4.f27109a = r0     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r4)
            return r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11344ic.mo63037a():com.yandex.metrica.impl.ob.hc");
    }
}
