package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.y */
public class C11962y extends C11728s0 {

    /* renamed from: a */
    private Application f28733a;

    /* renamed from: b */
    private volatile C11965c f28734b = C11965c.NOT_WATCHING_YET;

    /* renamed from: c */
    private final C11007Zm<C11963a, C11964b> f28735c = new C11007Zm<>(true);

    /* renamed from: com.yandex.metrica.impl.ob.y$a */
    public enum C11963a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$b */
    interface C11964b {
        /* renamed from: a */
        void mo61122a(Activity activity, C11963a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$c */
    public enum C11965c {
        WATCHING((String) null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");
        

        /* renamed from: a */
        public final String f28747a;

        private C11965c(String str) {
            this.f28747a = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m30866b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.y$c r0 = r2.f28734b     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.y$c r1 = com.yandex.metrica.impl.p265ob.C11962y.C11965c.WATCHING     // Catch:{ all -> 0x0025 }
            if (r0 == r1) goto L_0x0023
            com.yandex.metrica.impl.ob.Zm<com.yandex.metrica.impl.ob.y$a, com.yandex.metrica.impl.ob.y$b> r0 = r2.f28735c     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.mo62605b()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0010
            goto L_0x0023
        L_0x0010:
            android.app.Application r0 = r2.f28733a     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001a
            com.yandex.metrica.impl.ob.y$c r0 = com.yandex.metrica.impl.p265ob.C11962y.C11965c.NO_APPLICATION     // Catch:{ all -> 0x0025 }
            r2.f28734b = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return
        L_0x001a:
            r2.f28734b = r1     // Catch:{ all -> 0x0025 }
            android.app.Application r0 = r2.f28733a     // Catch:{ all -> 0x0025 }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11962y.m30866b():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64106a(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.app.Application r0 = r1.f28733a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x000d
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x000d }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x000d }
            r1.f28733a = r2     // Catch:{ all -> 0x000d }
        L_0x000d:
            r1.m30866b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11962y.mo64106a(android.content.Context):void");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m30865a(C11963a.CREATED, activity);
    }

    public void onActivityDestroyed(Activity activity) {
        m30865a(C11963a.DESTROYED, activity);
    }

    public void onActivityPaused(Activity activity) {
        m30865a(C11963a.PAUSED, activity);
    }

    public void onActivityResumed(Activity activity) {
        m30865a(C11963a.RESUMED, activity);
    }

    public void onActivityStarted(Activity activity) {
        m30865a(C11963a.STARTED, activity);
    }

    public void onActivityStopped(Activity activity) {
        m30865a(C11963a.STOPPED, activity);
    }

    /* renamed from: a */
    public synchronized void mo64105a(Application application) {
        if (this.f28733a == null) {
            this.f28733a = application;
        }
        m30866b();
    }

    /* renamed from: a */
    public C11965c mo64104a() {
        return this.f28734b;
    }

    /* renamed from: a */
    private void m30865a(C11963a aVar, Activity activity) {
        Collection<C11964b> a;
        synchronized (this) {
            a = this.f28735c.mo62600a(aVar);
        }
        if (a != null) {
            for (C11964b a2 : a) {
                a2.mo61122a(activity, aVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo64107a(C11964b bVar, C11963a... aVarArr) {
        if (C10796U2.m27894a((T[]) aVarArr)) {
            aVarArr = C11963a.values();
        }
        for (C11963a a : aVarArr) {
            this.f28735c.mo62601a(a, bVar);
        }
        m30866b();
    }
}
