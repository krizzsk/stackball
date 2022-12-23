package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cd1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class bd1 {

    /* renamed from: a */
    private final cd1 f31304a;

    /* renamed from: b */
    private final String f31305b;

    /* renamed from: c */
    private boolean f31306c;

    /* renamed from: d */
    private xc1 f31307d;

    /* renamed from: e */
    private final List<xc1> f31308e = new ArrayList();

    /* renamed from: f */
    private boolean f31309f;

    public bd1(cd1 cd1, String str) {
        Intrinsics.checkNotNullParameter(cd1, "taskRunner");
        Intrinsics.checkNotNullParameter(str, "name");
        this.f31304a = cd1;
        this.f31305b = str;
    }

    /* renamed from: a */
    public final void mo66045a(xc1 xc1) {
        this.f31307d = xc1;
    }

    /* renamed from: b */
    public final boolean mo66049b() {
        xc1 xc1 = this.f31307d;
        if (xc1 != null) {
            Intrinsics.checkNotNull(xc1);
            if (xc1.mo70878a()) {
                this.f31309f = true;
            }
        }
        boolean z = false;
        int size = this.f31308e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (this.f31308e.get(size).mo70878a()) {
                    xc1 xc12 = this.f31308e.get(size);
                    cd1.C12727b bVar = cd1.f31894h;
                    if (cd1.f31896j.isLoggable(Level.FINE)) {
                        zc1.m44530a(xc12, this, "canceled");
                    }
                    this.f31308e.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final xc1 mo66050c() {
        return this.f31307d;
    }

    /* renamed from: d */
    public final boolean mo66051d() {
        return this.f31309f;
    }

    /* renamed from: e */
    public final List<xc1> mo66052e() {
        return this.f31308e;
    }

    /* renamed from: f */
    public final String mo66053f() {
        return this.f31305b;
    }

    /* renamed from: g */
    public final boolean mo66054g() {
        return this.f31306c;
    }

    /* renamed from: h */
    public final cd1 mo66055h() {
        return this.f31304a;
    }

    /* renamed from: i */
    public final void mo66056i() {
        if (!jh1.f35310f || !Thread.holdsLock(this)) {
            synchronized (this.f31304a) {
                this.f31306c = true;
                if (mo66049b()) {
                    this.f31304a.mo66258a(this);
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.f31305b;
    }

    /* renamed from: a */
    public final void mo66047a(boolean z) {
        this.f31309f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66046a(com.yandex.mobile.ads.impl.xc1 r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.yandex.mobile.ads.impl.cd1 r0 = r2.f31304a
            monitor-enter(r0)
            boolean r1 = r2.f31306c     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.mo70878a()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0027
            com.yandex.mobile.ads.impl.cd1$b r4 = com.yandex.mobile.ads.impl.cd1.f31894h     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = com.yandex.mobile.ads.impl.cd1.f31896j     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            com.yandex.mobile.ads.impl.zc1.m44530a(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0025:
            monitor-exit(r0)
            return
        L_0x0027:
            com.yandex.mobile.ads.impl.cd1$b r4 = com.yandex.mobile.ads.impl.cd1.f31894h     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = com.yandex.mobile.ads.impl.cd1.f31896j     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            com.yandex.mobile.ads.impl.zc1.m44530a(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.mo66048a(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            com.yandex.mobile.ads.impl.cd1 r3 = r2.f31304a     // Catch:{ all -> 0x0050 }
            r3.mo66258a(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bd1.mo66046a(com.yandex.mobile.ads.impl.xc1, long):void");
    }

    /* renamed from: a */
    public final boolean mo66048a(xc1 xc1, long j, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(xc1, "task");
        xc1.mo70877a(this);
        long a = this.f31304a.mo66261d().mo66263a();
        long j2 = a + j;
        int indexOf = this.f31308e.indexOf(xc1);
        if (indexOf != -1) {
            if (xc1.mo70880c() <= j2) {
                cd1.C12727b bVar = cd1.f31894h;
                if (cd1.f31896j.isLoggable(Level.FINE)) {
                    zc1.m44530a(xc1, this, "already scheduled");
                }
                return false;
            }
            this.f31308e.remove(indexOf);
        }
        xc1.mo70876a(j2);
        cd1.C12727b bVar2 = cd1.f31894h;
        if (cd1.f31896j.isLoggable(Level.FINE)) {
            if (z) {
                str = Intrinsics.stringPlus("run again after ", zc1.m44529a(j2 - a));
            } else {
                str = Intrinsics.stringPlus("scheduled after ", zc1.m44529a(j2 - a));
            }
            zc1.m44530a(xc1, this, str);
        }
        Iterator<xc1> it = this.f31308e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().mo70880c() - a > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f31308e.size();
        }
        this.f31308e.add(i, xc1);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66044a() {
        if (!jh1.f35310f || !Thread.holdsLock(this)) {
            synchronized (this.f31304a) {
                if (mo66049b()) {
                    this.f31304a.mo66258a(this);
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
