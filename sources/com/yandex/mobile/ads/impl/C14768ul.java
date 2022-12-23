package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.yandex.mobile.ads.impl.x21;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ul */
public final class C14768ul {

    /* renamed from: a */
    private ExecutorService f40783a;

    /* renamed from: b */
    private final ArrayDeque<x21.C15140a> f40784b = new ArrayDeque<>();

    /* renamed from: c */
    private final ArrayDeque<x21.C15140a> f40785c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<x21> f40786d = new ArrayDeque<>();

    /* renamed from: a */
    public final synchronized void mo70366a(x21 x21) {
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        this.f40786d.add(x21);
    }

    /* renamed from: b */
    public final void mo70367b(x21 x21) {
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        m42739a(this.f40786d, x21);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    private final <T> void m42739a(java.util.Deque<T> r1, T r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r1.remove(r2)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0010
            monitor-enter(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            r0.m42740a()
            return
        L_0x0010:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "Call wasn't in-flight!"
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14768ul.m42739a(java.util.Deque, java.lang.Object):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    private final boolean m42740a() {
        /*
            r12 = this;
            boolean r0 = com.yandex.mobile.ads.impl.jh1.f35310f
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r12)
            if (r0 != 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r12)
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.x21$a> r1 = r12.f40784b     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ all -> 0x00c1 }
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c1 }
            r3 = 0
            if (r2 == 0) goto L_0x0061
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x00c1 }
            com.yandex.mobile.ads.impl.x21$a r1 = (com.yandex.mobile.ads.impl.x21.C15140a) r1     // Catch:{ all -> 0x00c1 }
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.x21$a> r2 = r12.f40785c     // Catch:{ all -> 0x00c1 }
            int r2 = r2.size()     // Catch:{ all -> 0x00c1 }
            monitor-enter(r12)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r12)     // Catch:{ all -> 0x00c1 }
            r4 = 64
            if (r2 < r4) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            r1.getClass()     // Catch:{ all -> 0x00c1 }
            throw r3     // Catch:{ all -> 0x00c1 }
        L_0x0061:
            monitor-enter(r12)     // Catch:{ all -> 0x00c1 }
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.x21$a> r1 = r12.f40785c     // Catch:{ all -> 0x00be }
            int r1 = r1.size()     // Catch:{ all -> 0x00be }
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.x21> r2 = r12.f40786d     // Catch:{ all -> 0x00be }
            int r2 = r2.size()     // Catch:{ all -> 0x00be }
            int r1 = r1 + r2
            monitor-exit(r12)     // Catch:{ all -> 0x00c1 }
            r2 = 0
            if (r1 <= 0) goto L_0x0075
            r1 = 1
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00c1 }
            monitor-exit(r12)
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x00bd
            java.lang.Object r0 = r0.get(r2)
            com.yandex.mobile.ads.impl.x21$a r0 = (com.yandex.mobile.ads.impl.x21.C15140a) r0
            monitor-enter(r12)
            java.util.concurrent.ExecutorService r1 = r12.f40783a     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x00ab
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00ba }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ba }
            java.util.concurrent.SynchronousQueue r10 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = com.yandex.mobile.ads.impl.jh1.f35311g     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = " Dispatcher"
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r5)     // Catch:{ all -> 0x00ba }
            java.util.concurrent.ThreadFactory r11 = com.yandex.mobile.ads.impl.jh1.m37824a((java.lang.String) r4, (boolean) r2)     // Catch:{ all -> 0x00ba }
            r5 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 60
            r4 = r1
            r4.<init>(r5, r6, r7, r9, r10, r11)     // Catch:{ all -> 0x00ba }
            r12.f40783a = r1     // Catch:{ all -> 0x00ba }
        L_0x00ab:
            java.util.concurrent.ExecutorService r1 = r12.f40783a     // Catch:{ all -> 0x00ba }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x00ba }
            monitor-exit(r12)
            r0.getClass()
            java.lang.String r0 = "executorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            throw r3
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x00bd:
            return r1
        L_0x00be:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14768ul.m42740a():boolean");
    }
}
