package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import com.yandex.mobile.ads.impl.lz0;
import com.yandex.mobile.ads.impl.x21;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class b31 {

    /* renamed from: a */
    private final int f31215a;

    /* renamed from: b */
    private final long f31216b;

    /* renamed from: c */
    private final bd1 f31217c;

    /* renamed from: d */
    private final C12566a f31218d = new C12566a(this, Intrinsics.stringPlus(jh1.f35311g, " ConnectionPool"));

    /* renamed from: e */
    private final ConcurrentLinkedQueue<y21> f31219e = new ConcurrentLinkedQueue<>();

    /* renamed from: com.yandex.mobile.ads.impl.b31$a */
    public static final class C12566a extends xc1 {

        /* renamed from: e */
        final /* synthetic */ b31 f31220e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12566a(b31 b31, String str) {
            super(str, false, 2);
            this.f31220e = b31;
        }

        /* renamed from: e */
        public long mo65736e() {
            return this.f31220e.mo65960a(System.nanoTime());
        }
    }

    public b31(cd1 cd1, int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(cd1, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f31215a = i;
        this.f31216b = timeUnit.toNanos(j);
        this.f31217c = cd1.mo66262e();
        if (!(j > 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    /* renamed from: a */
    public final boolean mo65961a(C14563s5 s5Var, x21 x21, List<k61> list, boolean z) {
        Intrinsics.checkNotNullParameter(s5Var, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        Iterator<y21> it = this.f31219e.iterator();
        while (it.hasNext()) {
            y21 next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.mo70985h()) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (next.mo70976a(s5Var, list)) {
                    x21.mo70795a(next);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo65963b(y21 y21) {
        Intrinsics.checkNotNullParameter(y21, "connection");
        if (!jh1.f35310f || Thread.holdsLock(y21)) {
            this.f31219e.add(y21);
            this.f31217c.mo66046a(this.f31218d, 0);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + y21);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        com.yandex.mobile.ads.impl.jh1.m37827a(r3.mo70989l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (r10.f31219e.isEmpty() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        r10.f31217c.mo66044a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo65960a(long r11) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.y21> r0 = r10.f31219e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x000d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r0.next()
            com.yandex.mobile.ads.impl.y21 r6 = (com.yandex.mobile.ads.impl.y21) r6
            java.lang.String r7 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            monitor-enter(r6)
            int r7 = r10.m34124a(r6, r11)     // Catch:{ all -> 0x003a }
            if (r7 <= 0) goto L_0x0028
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0028:
            int r1 = r1 + 1
            long r7 = r6.mo70980c()     // Catch:{ all -> 0x003a }
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0036
            r3 = r6
            r4 = r7
        L_0x0036:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r6)
            goto L_0x000d
        L_0x003a:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L_0x003d:
            long r6 = r10.f31216b
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            int r0 = r10.f31215a
            if (r1 <= r0) goto L_0x0048
            goto L_0x0052
        L_0x0048:
            if (r1 <= 0) goto L_0x004c
            long r6 = r6 - r4
            return r6
        L_0x004c:
            if (r2 <= 0) goto L_0x004f
            return r6
        L_0x004f:
            r11 = -1
            return r11
        L_0x0052:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.mo70978b()     // Catch:{ all -> 0x008f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008f }
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L_0x0066
            monitor-exit(r3)
            return r6
        L_0x0066:
            long r8 = r3.mo70980c()     // Catch:{ all -> 0x008f }
            long r8 = r8 + r4
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            monitor-exit(r3)
            return r6
        L_0x0071:
            r3.mo70979b(r1)     // Catch:{ all -> 0x008f }
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.y21> r11 = r10.f31219e     // Catch:{ all -> 0x008f }
            r11.remove(r3)     // Catch:{ all -> 0x008f }
            monitor-exit(r3)
            java.net.Socket r11 = r3.mo70989l()
            com.yandex.mobile.ads.impl.jh1.m37827a((java.net.Socket) r11)
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.y21> r11 = r10.f31219e
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x008e
            com.yandex.mobile.ads.impl.bd1 r11 = r10.f31217c
            r11.mo66044a()
        L_0x008e:
            return r6
        L_0x008f:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b31.mo65960a(long):long");
    }

    /* renamed from: a */
    public final boolean mo65962a(y21 y21) {
        Intrinsics.checkNotNullParameter(y21, "connection");
        if (jh1.f35310f && !Thread.holdsLock(y21)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + y21);
        } else if (y21.mo70981d() || this.f31215a == 0) {
            y21.mo70979b(true);
            this.f31219e.remove(y21);
            if (!this.f31219e.isEmpty()) {
                return true;
            }
            this.f31217c.mo66044a();
            return true;
        } else {
            this.f31217c.mo66046a(this.f31218d, 0);
            return false;
        }
    }

    /* renamed from: a */
    private final int m34124a(y21 y21, long j) {
        if (!jh1.f35310f || Thread.holdsLock(y21)) {
            List<Reference<x21>> b = y21.mo70978b();
            int i = 0;
            while (i < b.size()) {
                Reference reference = b.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    lz0.C13944a aVar = lz0.f37135a;
                    lz0.f37136b.mo68535a("A connection to " + y21.mo70988k().mo68140a().mo69885k() + " was leaked. Did you forget to close a response body?", ((x21.C15141b) reference).mo70810a());
                    b.remove(i);
                    y21.mo70979b(true);
                    if (b.isEmpty()) {
                        y21.mo70974a(j - this.f31216b);
                        return 0;
                    }
                }
            }
            return b.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + y21);
    }
}
