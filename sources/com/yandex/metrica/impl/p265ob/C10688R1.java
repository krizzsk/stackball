package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.R1 */
public class C10688R1 extends C11890vn implements C10237F2 {

    /* renamed from: b */
    private final Executor f25564b;

    /* renamed from: c */
    private Executor f25565c;

    /* renamed from: d */
    private final BlockingQueue<C10690b> f25566d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final Object f25567e = new Object();

    /* renamed from: f */
    private final Object f25568f = new Object();

    /* renamed from: g */
    private volatile C10690b f25569g;

    /* renamed from: h */
    private C10703Rd f25570h;

    /* renamed from: i */
    private final C10364I9 f25571i;

    /* renamed from: com.yandex.metrica.impl.ob.R1$b */
    private static class C10690b {

        /* renamed from: a */
        final C10766T1 f25572a;

        /* renamed from: b */
        private final String f25573b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10690b.class != obj.getClass()) {
                return false;
            }
            return this.f25573b.equals(((C10690b) obj).f25573b);
        }

        public int hashCode() {
            return this.f25573b.hashCode();
        }

        private C10690b(C10766T1 t1) {
            this.f25572a = t1;
            this.f25573b = t1.mo61642a();
        }
    }

    public C10688R1(Context context, Executor executor, C10364I9 i9) {
        this.f25564b = executor;
        this.f25571i = i9;
        this.f25565c = new C11612on();
        this.f25570h = new C10703Rd(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10869W1 mo62101a(C10766T1 t1) {
        return new C10869W1(this.f25570h, new C10750Sd(new C10782Td(this.f25571i, t1.mo61644b()), t1.mo61646j()), t1, this, new C10824V1(), "NetworkTaskQueue");
    }

    /* renamed from: a */
    public void mo61207a() {
    }

    /* renamed from: b */
    public void mo62102b(C10766T1 t1) {
        boolean z;
        synchronized (this.f25567e) {
            C10690b bVar = new C10690b(t1);
            if (mo63616c()) {
                if (!this.f25566d.contains(bVar)) {
                    if (!bVar.equals(this.f25569g)) {
                        z = false;
                        if (!z && bVar.f25572a.mo62267u()) {
                            this.f25566d.offer(bVar);
                        }
                    }
                }
                z = true;
                this.f25566d.offer(bVar);
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r4.mo63616c()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r4.f25568f     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            java.util.concurrent.BlockingQueue<com.yandex.metrica.impl.ob.R1$b> r2 = r4.f25566d     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            com.yandex.metrica.impl.ob.R1$b r2 = (com.yandex.metrica.impl.p265ob.C10688R1.C10690b) r2     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            r4.f25569g = r2     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            com.yandex.metrica.impl.ob.R1$b r2 = r4.f25569g     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            com.yandex.metrica.impl.ob.T1 r1 = r2.f25572a     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            boolean r2 = r1.mo61652z()     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            if (r2 == 0) goto L_0x0023
            java.util.concurrent.Executor r2 = r4.f25564b     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            goto L_0x0025
        L_0x0023:
            java.util.concurrent.Executor r2 = r4.f25565c     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
        L_0x0025:
            com.yandex.metrica.impl.ob.W1 r3 = r4.mo62101a(r1)     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            r2.execute(r3)     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
            java.lang.Object r2 = r4.f25568f
            monitor-enter(r2)
            r4.f25569g = r0     // Catch:{ all -> 0x0039 }
            r1.mo62269w()     // Catch:{ all -> 0x0039 }
            r1.mo62270x()     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            goto L_0x0002
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r3     // Catch:{ InterruptedException -> 0x0052, all -> 0x003f }
        L_0x003f:
            r2 = move-exception
            java.lang.Object r3 = r4.f25568f
            monitor-enter(r3)
            r4.f25569g = r0     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004d
            r1.mo62269w()     // Catch:{ all -> 0x004f }
            r1.mo62270x()     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            throw r2
        L_0x004f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x0052:
            java.lang.Object r2 = r4.f25568f
            monitor-enter(r2)
            r4.f25569g = r0     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x005f
            r1.mo62269w()     // Catch:{ all -> 0x0061 }
            r1.mo62270x()     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            goto L_0x0002
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10688R1.run():void");
    }

    /* renamed from: b */
    public void mo61209b() {
        synchronized (this.f25568f) {
            C10690b bVar = this.f25569g;
            if (bVar != null) {
                bVar.f25572a.mo62270x();
            }
            ArrayList arrayList = new ArrayList(this.f25566d.size());
            this.f25566d.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C10690b) it.next()).f25572a.mo62270x();
            }
        }
    }
}
