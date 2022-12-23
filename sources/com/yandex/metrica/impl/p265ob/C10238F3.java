package com.yandex.metrica.impl.p265ob;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.F3 */
public class C10238F3 {

    /* renamed from: a */
    private final C11890vn f24632a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BlockingQueue<C10240b> f24633b = new LinkedBlockingQueue();

    /* renamed from: c */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C10388J3<? extends C10327H3>>> f24634c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private WeakHashMap<Object, CopyOnWriteArrayList<C10242d>> f24635d = new WeakHashMap<>();

    /* renamed from: e */
    private ConcurrentHashMap<Class, C10327H3> f24636e = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.F3$a */
    class C10239a implements Runnable {
        C10239a() {
        }

        public void run() {
            while (true) {
                C10238F3.this.getClass();
                try {
                    ((C10240b) C10238F3.this.f24633b.take()).mo61259a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$b */
    private static class C10240b {

        /* renamed from: a */
        private final C10327H3 f24638a;

        /* renamed from: b */
        private final C10388J3<? extends C10327H3> f24639b;

        /* synthetic */ C10240b(C10327H3 h3, C10388J3 j3, C10239a aVar) {
            this(h3, j3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61259a() {
            try {
                if (!this.f24639b.mo61592a(this.f24638a)) {
                    this.f24639b.mo61593b(this.f24638a);
                }
            } catch (Throwable unused) {
            }
        }

        private C10240b(C10327H3 h3, C10388J3<? extends C10327H3> j3) {
            this.f24638a = h3;
            this.f24639b = j3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$c */
    private static final class C10241c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10238F3 f24640a = new C10238F3();
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$d */
    private static class C10242d {

        /* renamed from: a */
        final CopyOnWriteArrayList<C10388J3<? extends C10327H3>> f24641a;

        /* renamed from: b */
        final C10388J3<? extends C10327H3> f24642b;

        /* synthetic */ C10242d(CopyOnWriteArrayList copyOnWriteArrayList, C10388J3 j3, C10239a aVar) {
            this(copyOnWriteArrayList, j3);
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            super.finalize();
            this.f24641a.remove(this.f24642b);
        }

        private C10242d(CopyOnWriteArrayList<C10388J3<? extends C10327H3>> copyOnWriteArrayList, C10388J3<? extends C10327H3> j3) {
            this.f24641a = copyOnWriteArrayList;
            this.f24642b = j3;
        }
    }

    C10238F3() {
        C11890vn a = C11922wn.m30799a("YMM-BD", new C10239a());
        this.f24632a = a;
        a.start();
    }

    /* renamed from: a */
    public static final C10238F3 m26224a() {
        return C10241c.f24640a;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo61255a(com.yandex.metrica.impl.p265ob.C10327H3 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.util.concurrent.CopyOnWriteArrayList<com.yandex.metrica.impl.ob.J3<? extends com.yandex.metrica.impl.ob.H3>>> r0 = r5.f24634c     // Catch:{ all -> 0x0038 }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x0014:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0038 }
            com.yandex.metrica.impl.ob.J3 r1 = (com.yandex.metrica.impl.p265ob.C10388J3) r1     // Catch:{ all -> 0x0038 }
            java.util.concurrent.BlockingQueue<com.yandex.metrica.impl.ob.F3$b> r2 = r5.f24633b     // Catch:{ all -> 0x0038 }
            com.yandex.metrica.impl.ob.F3$b r3 = new com.yandex.metrica.impl.ob.F3$b     // Catch:{ all -> 0x0038 }
            r4 = 0
            r3.<init>(r6, r1, r4)     // Catch:{ all -> 0x0038 }
            r2.add(r3)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, com.yandex.metrica.impl.ob.H3> r0 = r5.f24636e     // Catch:{ all -> 0x003b }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x003b }
            r0.put(r1, r6)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return
        L_0x0038:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r6     // Catch:{ all -> 0x003b }
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10238F3.mo61255a(com.yandex.metrica.impl.ob.H3):void");
    }

    /* renamed from: a */
    public synchronized void mo61257a(Object obj, Class cls, C10388J3<? extends C10327H3> j3) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24634c.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f24634c.put(cls, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(j3);
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f24635d.get(obj);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            this.f24635d.put(obj, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new C10242d(copyOnWriteArrayList, j3, (C10239a) null));
        C10327H3 h3 = this.f24636e.get(cls);
        if (h3 != null) {
            this.f24633b.add(new C10240b(h3, j3, (C10239a) null));
        }
    }

    /* renamed from: a */
    public synchronized void mo61256a(Object obj) {
        List<C10242d> remove = this.f24635d.remove(obj);
        if (remove != null) {
            for (C10242d dVar : remove) {
                dVar.f24641a.remove(dVar.f24642b);
            }
        }
    }
}
