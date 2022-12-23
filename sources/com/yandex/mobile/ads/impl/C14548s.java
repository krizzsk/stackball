package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.s */
class C14548s implements C14332q {

    /* renamed from: f */
    private static final Object f39765f = new Object();

    /* renamed from: g */
    private static volatile C14548s f39766g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f39767a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C15287z, Void> f39768b = new WeakHashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<j51, Void> f39769c = new WeakHashMap();

    /* renamed from: d */
    private boolean f39770d;

    /* renamed from: e */
    private final Application.ActivityLifecycleCallbacks f39771e = new C14549a();

    /* renamed from: com.yandex.mobile.ads.impl.s$a */
    class C14549a implements Application.ActivityLifecycleCallbacks {
        C14549a() {
        }

        /* renamed from: a */
        private <T> Set<T> m41764a(Map<T, Void> map) {
            Set<T> keySet = map.keySet();
            HashSet hashSet = new HashSet(keySet.size());
            for (T next : keySet) {
                if (next != null) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            synchronized (C14548s.this.f39767a) {
                Iterator it = ((HashSet) m41764a(C14548s.this.f39769c)).iterator();
                while (it.hasNext()) {
                    ((j51) it.next()).mo67930a(activity, bundle);
                }
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            synchronized (C14548s.this.f39767a) {
                Iterator it = ((HashSet) m41764a(C14548s.this.f39768b)).iterator();
                while (it.hasNext()) {
                    ((C15287z) it.next()).mo70432a(activity);
                }
            }
        }

        public void onActivityResumed(Activity activity) {
            synchronized (C14548s.this.f39767a) {
                Iterator it = ((HashSet) m41764a(C14548s.this.f39768b)).iterator();
                while (it.hasNext()) {
                    ((C15287z) it.next()).mo70433b(activity);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            synchronized (C14548s.this.f39767a) {
                Iterator it = ((HashSet) m41764a(C14548s.this.f39769c)).iterator();
                while (it.hasNext()) {
                    ((j51) it.next()).mo67931b(activity, bundle);
                }
            }
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            C14548s.this.m41755a((Context) activity);
        }
    }

    C14548s() {
    }

    /* renamed from: b */
    public boolean mo69838b() {
        boolean z;
        synchronized (this.f39767a) {
            z = this.f39770d;
        }
        return z;
    }

    /* renamed from: a */
    public static C14548s m41753a() {
        if (f39766g == null) {
            synchronized (f39765f) {
                if (f39766g == null) {
                    f39766g = new C14548s();
                }
            }
        }
        return f39766g;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69461b(android.content.Context r4, com.yandex.mobile.ads.impl.C15287z r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f39767a
            monitor-enter(r0)
            java.util.Map<com.yandex.mobile.ads.impl.z, java.lang.Void> r1 = r3.f39768b     // Catch:{ all -> 0x001f }
            r2 = 0
            r1.put(r5, r2)     // Catch:{ all -> 0x001f }
            boolean r5 = r3.mo69838b()     // Catch:{ all -> 0x001f }
            if (r5 != 0) goto L_0x001d
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x001d }
            android.app.Application r4 = (android.app.Application) r4     // Catch:{ all -> 0x001d }
            android.app.Application$ActivityLifecycleCallbacks r5 = r3.f39771e     // Catch:{ all -> 0x001d }
            r4.registerActivityLifecycleCallbacks(r5)     // Catch:{ all -> 0x001d }
            r4 = 1
            r3.f39770d = r4     // Catch:{ all -> 0x001d }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14548s.mo69461b(android.content.Context, com.yandex.mobile.ads.impl.z):void");
    }

    /* renamed from: a */
    public void mo69459a(Context context, C15287z zVar) {
        synchronized (this.f39767a) {
            this.f39768b.remove(zVar);
            m41755a(context);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69460b(android.content.Context r4, com.yandex.mobile.ads.impl.j51 r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f39767a
            monitor-enter(r0)
            java.util.Map<com.yandex.mobile.ads.impl.j51, java.lang.Void> r1 = r3.f39769c     // Catch:{ all -> 0x001f }
            r2 = 0
            r1.put(r5, r2)     // Catch:{ all -> 0x001f }
            boolean r5 = r3.mo69838b()     // Catch:{ all -> 0x001f }
            if (r5 != 0) goto L_0x001d
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x001d }
            android.app.Application r4 = (android.app.Application) r4     // Catch:{ all -> 0x001d }
            android.app.Application$ActivityLifecycleCallbacks r5 = r3.f39771e     // Catch:{ all -> 0x001d }
            r4.registerActivityLifecycleCallbacks(r5)     // Catch:{ all -> 0x001d }
            r4 = 1
            r3.f39770d = r4     // Catch:{ all -> 0x001d }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14548s.mo69460b(android.content.Context, com.yandex.mobile.ads.impl.j51):void");
    }

    /* renamed from: a */
    public void mo69458a(Context context, j51 j51) {
        synchronized (this.f39767a) {
            this.f39769c.remove(j51);
            m41755a(context);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(3:7|8|(1:10))|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m41755a(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f39767a
            monitor-enter(r0)
            java.util.Map<com.yandex.mobile.ads.impl.z, java.lang.Void> r1 = r2.f39768b     // Catch:{ all -> 0x0029 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            java.util.Map<com.yandex.mobile.ads.impl.j51, java.lang.Void> r1 = r2.f39769c     // Catch:{ all -> 0x0029 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            boolean r1 = r2.mo69838b()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0027
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0027 }
            android.app.Application r3 = (android.app.Application) r3     // Catch:{ all -> 0x0027 }
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.f39771e     // Catch:{ all -> 0x0027 }
            r3.unregisterActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0027 }
            r3 = 0
            r2.f39770d = r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14548s.m41755a(android.content.Context):void");
    }
}
