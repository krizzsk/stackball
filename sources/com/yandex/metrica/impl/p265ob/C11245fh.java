package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11115ch;
import com.yandex.metrica.impl.p265ob.C11156dh;
import com.yandex.metrica.impl.p265ob.C11156dh.C11160d;
import com.yandex.metrica.impl.p265ob.C11616p1;

/* renamed from: com.yandex.metrica.impl.ob.fh */
public abstract class C11245fh<T extends C11156dh, IA, A extends C11115ch<IA, A>, L extends C11156dh.C11160d<T, C11156dh.C11159c<A>>> implements C11616p1.C11617a {

    /* renamed from: a */
    private T f26913a;

    /* renamed from: b */
    private L f26914b;

    /* renamed from: c */
    private C11156dh.C11159c<A> f26915c;

    public C11245fh(L l, C10675Qi qi, A a) {
        this.f26914b = l;
        C11616p1.m29998a(C10619P0.m27164i().mo61879f()).mo63448a((C11616p1.C11617a) this);
        mo62905a(new C11156dh.C11159c(qi, a));
    }

    /* renamed from: a */
    public void mo62903a() {
        synchronized (this) {
            this.f26913a = null;
        }
    }

    /* renamed from: b */
    public synchronized T mo62907b() {
        if (this.f26913a == null) {
            this.f26913a = this.f26914b.mo61924a(this.f26915c);
        }
        return this.f26913a;
    }

    /* renamed from: c */
    public synchronized A mo62908c() {
        return (C11115ch) this.f26915c.f26747b;
    }

    /* renamed from: d */
    public synchronized C10675Qi mo62909d() {
        return this.f26915c.f26746a;
    }

    /* renamed from: e */
    public synchronized void mo62910e() {
        this.f26913a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo62905a(C11156dh.C11159c<A> cVar) {
        this.f26915c = cVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo62906a(IA r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.yandex.metrica.impl.ob.dh$c<A> r0 = r3.f26915c     // Catch:{ all -> 0x0035 }
            A r0 = r0.f26747b     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.ch r0 = (com.yandex.metrica.impl.p265ob.C11115ch) r0     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.mo62468b(r4)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.dh$c r0 = new com.yandex.metrica.impl.ob.dh$c     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.dh$c<A> r1 = r3.f26915c     // Catch:{ all -> 0x0030 }
            com.yandex.metrica.impl.ob.Qi r2 = r1.f26746a     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            A r1 = r1.f26747b     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.ch r1 = (com.yandex.metrica.impl.p265ob.C11115ch) r1     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r1.mo62467a(r4)     // Catch:{ all -> 0x0035 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            r3.f26915c = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            r4 = 0
            r3.f26913a = r4     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11245fh.mo62906a(java.lang.Object):void");
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
    public synchronized void mo62904a(com.yandex.metrica.impl.p265ob.C10675Qi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.dh$c r0 = new com.yandex.metrica.impl.ob.dh$c     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            com.yandex.metrica.impl.ob.dh$c<A> r1 = r2.f26915c     // Catch:{ all -> 0x001f }
            A r1 = r1.f26747b     // Catch:{ all -> 0x001f }
            com.yandex.metrica.impl.ob.ch r1 = (com.yandex.metrica.impl.p265ob.C11115ch) r1     // Catch:{ all -> 0x001f }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            r2.f26915c = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            r3 = 0
            r2.f26913a = r3     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11245fh.mo62904a(com.yandex.metrica.impl.ob.Qi):void");
    }
}
