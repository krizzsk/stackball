package com.yandex.mobile.ads.core.initializer;

import android.content.Context;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.core.initializer.C12158e;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C14564s6;
import com.yandex.mobile.ads.impl.fo0;
import com.yandex.mobile.ads.impl.go0;
import com.yandex.mobile.ads.impl.jo0;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.le0;

/* renamed from: com.yandex.mobile.ads.core.initializer.b */
public final class C12151b {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Object f29463e = new Object();

    /* renamed from: f */
    private static volatile C12151b f29464f;

    /* renamed from: a */
    private final fo0 f29465a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final jo0 f29466b;

    /* renamed from: c */
    private final C12157d f29467c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C12154c f29468d = C12154c.INITIALIZATION_NOT_STARTED;

    /* renamed from: com.yandex.mobile.ads.core.initializer.b$c */
    private enum C12154c {
        INITIALIZATION_NOT_STARTED,
        INITIALIZING,
        INITIALIZED
    }

    private C12151b(fo0 fo0, jo0 jo0, C12157d dVar) {
        this.f29465a = fo0;
        this.f29466b = jo0;
        this.f29467c = dVar;
    }

    /* renamed from: b */
    public static C12151b m31627b() {
        if (f29464f == null) {
            synchronized (f29463e) {
                if (f29464f == null) {
                    f29464f = new C12151b(new fo0(new go0()), new jo0(), new C12157d());
                }
            }
        }
        return f29464f;
    }

    /* renamed from: com.yandex.mobile.ads.core.initializer.b$b */
    private class C12153b implements C12158e.C12160b {
        private C12153b() {
        }

        /* renamed from: a */
        public void mo64612a(C14564s6 s6Var, l30 l30) {
            synchronized (C12151b.f29463e) {
                C12154c unused = C12151b.this.f29468d = C12154c.INITIALIZED;
                C12151b.this.f29466b.mo68071a();
            }
        }

        /* renamed from: a */
        public void mo64611a(C12350a2 a2Var) {
            synchronized (C12151b.f29463e) {
                C12154c unused = C12151b.this.f29468d = C12154c.INITIALIZATION_NOT_STARTED;
                C12151b.this.f29466b.mo68071a();
            }
        }
    }

    /* renamed from: a */
    public void mo64748a(Context context, le0 le0, InitializationListener initializationListener) {
        this.f29465a.mo67052a(new Runnable(context, le0, initializationListener) {
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ le0 f$2;
            public final /* synthetic */ InitializationListener f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C12151b.this.m31628b(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m31628b(android.content.Context r4, com.yandex.mobile.ads.impl.le0 r5, com.yandex.mobile.ads.common.InitializationListener r6) {
        /*
            r3 = this;
            java.lang.Object r0 = f29463e
            monitor-enter(r0)
            com.yandex.mobile.ads.impl.me0 r1 = new com.yandex.mobile.ads.impl.me0     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.impl.fo0 r2 = r3.f29465a     // Catch:{ all -> 0x0037 }
            r1.<init>(r2, r6)     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.b$c r6 = r3.f29468d     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.b$c r2 = com.yandex.mobile.ads.core.initializer.C12151b.C12154c.INITIALIZED     // Catch:{ all -> 0x0037 }
            if (r6 != r2) goto L_0x0015
            r1.mo68672a()     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0036
        L_0x0015:
            com.yandex.mobile.ads.impl.jo0 r6 = r3.f29466b     // Catch:{ all -> 0x0037 }
            r6.mo68072a(r1)     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.b$c r6 = r3.f29468d     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.b$c r1 = com.yandex.mobile.ads.core.initializer.C12151b.C12154c.INITIALIZATION_NOT_STARTED     // Catch:{ all -> 0x0037 }
            if (r6 != r1) goto L_0x0035
            com.yandex.mobile.ads.core.initializer.b$c r6 = com.yandex.mobile.ads.core.initializer.C12151b.C12154c.INITIALIZING     // Catch:{ all -> 0x0037 }
            r3.f29468d = r6     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.b$b r6 = new com.yandex.mobile.ads.core.initializer.b$b     // Catch:{ all -> 0x0037 }
            r1 = 0
            r6.<init>()     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.d r1 = r3.f29467c     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.core.initializer.c r4 = r1.mo64750a(r4, r5, r6)     // Catch:{ all -> 0x0037 }
            com.yandex.mobile.ads.impl.fo0 r5 = r3.f29465a     // Catch:{ all -> 0x0037 }
            r5.mo67052a(r4)     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.core.initializer.C12151b.m31628b(android.content.Context, com.yandex.mobile.ads.impl.le0, com.yandex.mobile.ads.common.InitializationListener):void");
    }
}
