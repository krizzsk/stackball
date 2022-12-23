package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.R7 */
public class C10696R7 {

    /* renamed from: a */
    private String f25578a;

    /* renamed from: b */
    private final Context f25579b;

    /* renamed from: c */
    private final List<C10743S7> f25580c;

    /* renamed from: d */
    private final C10395J7 f25581d;

    /* renamed from: e */
    private boolean f25582e;

    /* renamed from: f */
    private boolean f25583f;

    /* renamed from: g */
    private C10743S7 f25584g;

    /* renamed from: h */
    private final C10442L0 f25585h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10696R7(android.content.Context r3, com.yandex.metrica.impl.p265ob.C10797U3 r4) {
        /*
            r2 = this;
            r0 = 21
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r0)
            if (r0 == 0) goto L_0x0020
            r0 = 2
            com.yandex.metrica.impl.ob.S7[] r0 = new com.yandex.metrica.impl.p265ob.C10743S7[r0]
            com.yandex.metrica.impl.ob.i8 r1 = new com.yandex.metrica.impl.ob.i8
            r1.<init>(r3, r4)
            r4 = 0
            r0[r4] = r1
            com.yandex.metrica.impl.ob.W7 r4 = new com.yandex.metrica.impl.ob.W7
            r4.<init>()
            r1 = 1
            r0[r1] = r4
            java.util.List r4 = java.util.Arrays.asList(r0)
            goto L_0x0029
        L_0x0020:
            com.yandex.metrica.impl.ob.W7 r4 = new com.yandex.metrica.impl.ob.W7
            r4.<init>()
            java.util.List r4 = java.util.Collections.singletonList(r4)
        L_0x0029:
            com.yandex.metrica.impl.ob.L0 r0 = new com.yandex.metrica.impl.ob.L0
            r0.<init>()
            com.yandex.metrica.impl.ob.J7 r1 = new com.yandex.metrica.impl.ob.J7
            r1.<init>()
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10696R7.<init>(android.content.Context, com.yandex.metrica.impl.ob.U3):void");
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
    private synchronized void m27472a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f25583f     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x0049 }
            java.util.List<com.yandex.metrica.impl.ob.S7> r0 = r4.f25580c     // Catch:{ all -> 0x0041 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0041 }
        L_0x000c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0041 }
            com.yandex.metrica.impl.ob.S7 r1 = (com.yandex.metrica.impl.p265ob.C10743S7) r1     // Catch:{ all -> 0x0041 }
            com.yandex.metrica.impl.ob.J7 r2 = r4.f25581d     // Catch:{ all -> 0x000c }
            java.lang.String r3 = r1.mo62225c()     // Catch:{ all -> 0x000c }
            r2.getClass()     // Catch:{ all -> 0x000c }
            java.lang.System.loadLibrary(r3)     // Catch:{ all -> 0x000c }
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            goto L_0x0028
        L_0x0026:
            r1 = 0
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
        L_0x0028:
            r4.f25584g = r1     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0044
            r0 = 0
            r1.mo62223a((boolean) r0)     // Catch:{ all -> 0x0030 }
        L_0x0030:
            com.yandex.metrica.impl.ob.L0 r0 = r4.f25585h     // Catch:{ all -> 0x0049 }
            android.content.Context r1 = r4.f25579b     // Catch:{ all -> 0x0049 }
            com.yandex.metrica.impl.ob.S7 r2 = r4.f25584g     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r2.mo62220a()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.mo61701b((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0049 }
            r4.f25578a = r0     // Catch:{ all -> 0x0049 }
            goto L_0x0044
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r0 = 1
            r4.f25583f = r0     // Catch:{ all -> 0x0049 }
            monitor-exit(r4)
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10696R7.m27472a():void");
    }

    C10696R7(Context context, List<C10743S7> list, C10442L0 l0, C10395J7 j7) {
        this.f25579b = context;
        this.f25580c = list;
        this.f25585h = l0;
        this.f25581d = j7;
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
    public synchronized void mo62110a(boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x002c
            monitor-enter(r4)     // Catch:{ all -> 0x004a }
            r4.m27472a()     // Catch:{ all -> 0x0025 }
            monitor-enter(r4)     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.S7 r5 = r4.f25584g     // Catch:{ all -> 0x0022 }
            if (r5 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            monitor-exit(r4)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r4.f25578a     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0027
            boolean r3 = r4.f25582e     // Catch:{ all -> 0x0025 }
            if (r3 != 0) goto L_0x0027
            r5.mo62222a(r6, r2, r7)     // Catch:{ all -> 0x0025 }
            r4.f25582e = r0     // Catch:{ all -> 0x0025 }
            goto L_0x0027
        L_0x0022:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0025 }
            throw r5     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r4.f25582e = r1     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            goto L_0x0045
        L_0x0029:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x002c:
            monitor-enter(r4)     // Catch:{ all -> 0x004a }
            monitor-enter(r4)     // Catch:{ all -> 0x0042 }
            com.yandex.metrica.impl.ob.S7 r5 = r4.f25584g     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0042
            boolean r6 = r4.f25582e     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0042
            r5.mo62224b()     // Catch:{ all -> 0x0042 }
            goto L_0x0042
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r4.f25582e = r1     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
        L_0x0045:
            monitor-exit(r4)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10696R7.mo62110a(boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo62109a(String str) {
        C10743S7 s7 = this.f25584g;
        if (s7 != null) {
            s7.mo62221a(str);
        }
    }
}
