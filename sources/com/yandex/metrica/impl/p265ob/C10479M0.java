package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11892w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.M0 */
public class C10479M0 {

    /* renamed from: a */
    private final List<C10483d> f25155a = new ArrayList();

    /* renamed from: b */
    private C10675Qi f25156b;

    /* renamed from: com.yandex.metrica.impl.ob.M0$b */
    public static class C10481b {

        /* renamed from: a */
        private boolean f25157a = false;

        /* renamed from: b */
        private long f25158b;

        /* renamed from: c */
        private long f25159c;

        /* renamed from: d */
        private long f25160d;

        /* renamed from: e */
        private final C10482c f25161e;

        public C10481b(C10675Qi qi, C10482c cVar, String str) {
            long j;
            this.f25161e = cVar;
            long j2 = 0;
            if (qi == null) {
                j = 0;
            } else {
                j = qi.mo62024p();
            }
            this.f25159c = j;
            this.f25158b = qi != null ? qi.mo61987B() : j2;
            this.f25160d = Long.MAX_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61758a(long j, TimeUnit timeUnit) {
            this.f25160d = timeUnit.toMillis(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo61760b() {
            if (this.f25157a) {
                return true;
            }
            C10482c cVar = this.f25161e;
            long j = this.f25159c;
            long j2 = this.f25158b;
            long j3 = this.f25160d;
            cVar.getClass();
            if (j2 - j >= j3) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61757a() {
            this.f25157a = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61759a(C10675Qi qi) {
            this.f25158b = qi.mo61987B();
            this.f25159c = qi.mo62024p();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M0$c */
    public static class C10482c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.M0$d */
    public static class C10483d {

        /* renamed from: a */
        private C10481b f25162a;

        /* renamed from: b */
        private final C11892w.C11894b f25163b;

        /* renamed from: c */
        private final C11769sn f25164c;

        /* renamed from: a */
        public void mo61762a(C10675Qi qi) {
            this.f25162a.mo61759a(qi);
        }

        private C10483d(C11769sn snVar, C11892w.C11894b bVar, C10481b bVar2) {
            this.f25163b = bVar;
            this.f25162a = bVar2;
            this.f25164c = snVar;
        }

        /* renamed from: a */
        public void mo61761a(long j) {
            this.f25162a.mo61758a(j, TimeUnit.SECONDS);
        }

        /* renamed from: a */
        public boolean mo61763a(int i) {
            if (!this.f25162a.mo61760b()) {
                return false;
            }
            this.f25163b.mo63997a(TimeUnit.SECONDS.toMillis((long) i), this.f25164c);
            this.f25162a.mo61757a();
            return true;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized com.yandex.metrica.impl.p265ob.C10479M0.C10483d mo61755a(java.lang.Runnable r4, com.yandex.metrica.impl.p265ob.C11769sn r5, java.lang.String r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.yandex.metrica.impl.ob.w$b r0 = new com.yandex.metrica.impl.ob.w$b     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.P0 r1 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.w r1 = r1.mo61872a()     // Catch:{ all -> 0x002c }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.M0$b r4 = new com.yandex.metrica.impl.ob.M0$b     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.Qi r1 = r3.f25156b     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.M0$c r2 = new com.yandex.metrica.impl.ob.M0$c     // Catch:{ all -> 0x002c }
            r2.<init>()     // Catch:{ all -> 0x002c }
            r4.<init>(r1, r2, r6)     // Catch:{ all -> 0x002c }
            monitor-enter(r3)     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.M0$d r6 = new com.yandex.metrica.impl.ob.M0$d     // Catch:{ all -> 0x0029 }
            r1 = 0
            r6.<init>(r5, r0, r4)     // Catch:{ all -> 0x0029 }
            java.util.List<com.yandex.metrica.impl.ob.M0$d> r4 = r3.f25155a     // Catch:{ all -> 0x0029 }
            r4.add(r6)     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return r6
        L_0x0029:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r4     // Catch:{ all -> 0x002c }
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10479M0.mo61755a(java.lang.Runnable, com.yandex.metrica.impl.ob.sn, java.lang.String):com.yandex.metrica.impl.ob.M0$d");
    }

    /* renamed from: a */
    public void mo61756a(C10675Qi qi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f25156b = qi;
            arrayList = new ArrayList(this.f25155a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10483d) it.next()).mo61762a(qi);
        }
    }
}
