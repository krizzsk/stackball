package com.yandex.mobile.ads.impl;

import java.util.Arrays;

public final class wd1<V> {

    /* renamed from: a */
    private long[] f41963a;

    /* renamed from: b */
    private V[] f41964b;

    /* renamed from: c */
    private int f41965c;

    /* renamed from: d */
    private int f41966d;

    public wd1() {
        this(10);
    }

    /* renamed from: a */
    public synchronized void mo70682a() {
        this.f41965c = 0;
        this.f41966d = 0;
        Arrays.fill(this.f41964b, (Object) null);
    }

    public wd1(int i) {
        this.f41963a = new long[i];
        this.f41964b = m43593a(i);
    }

    /* renamed from: a */
    public synchronized V mo70681a(long j) {
        V v;
        v = null;
        while (true) {
            int i = this.f41966d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.f41963a;
            int i2 = this.f41965c;
            if (j - jArr[i2] < 0) {
                break;
            }
            V[] vArr = this.f41964b;
            V v2 = vArr[i2];
            vArr[i2] = null;
            this.f41965c = (i2 + 1) % vArr.length;
            this.f41966d = i - 1;
            v = v2;
        }
        return v;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo70683a(long r7, V r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f41966d     // Catch:{ all -> 0x006f }
            r1 = 0
            if (r0 <= 0) goto L_0x0027
            int r2 = r6.f41965c     // Catch:{ all -> 0x006f }
            int r2 = r2 + r0
            int r2 = r2 + -1
            V[] r0 = r6.f41964b     // Catch:{ all -> 0x006f }
            int r0 = r0.length     // Catch:{ all -> 0x006f }
            int r2 = r2 % r0
            long[] r0 = r6.f41963a     // Catch:{ all -> 0x006f }
            r2 = r0[r2]     // Catch:{ all -> 0x006f }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0027
            monitor-enter(r6)     // Catch:{ all -> 0x006f }
            r6.f41965c = r1     // Catch:{ all -> 0x0024 }
            r6.f41966d = r1     // Catch:{ all -> 0x0024 }
            V[] r0 = r6.f41964b     // Catch:{ all -> 0x0024 }
            r2 = 0
            java.util.Arrays.fill(r0, r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x0027
        L_0x0024:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            throw r7     // Catch:{ all -> 0x006f }
        L_0x0027:
            V[] r0 = r6.f41964b     // Catch:{ all -> 0x006f }
            int r0 = r0.length     // Catch:{ all -> 0x006f }
            int r2 = r6.f41966d     // Catch:{ all -> 0x006f }
            if (r2 >= r0) goto L_0x002f
            goto L_0x005a
        L_0x002f:
            int r2 = r0 * 2
            long[] r3 = new long[r2]     // Catch:{ all -> 0x006f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x006f }
            int r4 = r6.f41965c     // Catch:{ all -> 0x006f }
            int r0 = r0 - r4
            long[] r5 = r6.f41963a     // Catch:{ all -> 0x006f }
            java.lang.System.arraycopy(r5, r4, r3, r1, r0)     // Catch:{ all -> 0x006f }
            V[] r4 = r6.f41964b     // Catch:{ all -> 0x006f }
            int r5 = r6.f41965c     // Catch:{ all -> 0x006f }
            java.lang.System.arraycopy(r4, r5, r2, r1, r0)     // Catch:{ all -> 0x006f }
            int r4 = r6.f41965c     // Catch:{ all -> 0x006f }
            if (r4 <= 0) goto L_0x0054
            long[] r5 = r6.f41963a     // Catch:{ all -> 0x006f }
            java.lang.System.arraycopy(r5, r1, r3, r0, r4)     // Catch:{ all -> 0x006f }
            V[] r4 = r6.f41964b     // Catch:{ all -> 0x006f }
            int r5 = r6.f41965c     // Catch:{ all -> 0x006f }
            java.lang.System.arraycopy(r4, r1, r2, r0, r5)     // Catch:{ all -> 0x006f }
        L_0x0054:
            r6.f41963a = r3     // Catch:{ all -> 0x006f }
            r6.f41964b = r2     // Catch:{ all -> 0x006f }
            r6.f41965c = r1     // Catch:{ all -> 0x006f }
        L_0x005a:
            int r0 = r6.f41965c     // Catch:{ all -> 0x006f }
            int r1 = r6.f41966d     // Catch:{ all -> 0x006f }
            int r0 = r0 + r1
            V[] r2 = r6.f41964b     // Catch:{ all -> 0x006f }
            int r3 = r2.length     // Catch:{ all -> 0x006f }
            int r0 = r0 % r3
            long[] r3 = r6.f41963a     // Catch:{ all -> 0x006f }
            r3[r0] = r7     // Catch:{ all -> 0x006f }
            r2[r0] = r9     // Catch:{ all -> 0x006f }
            int r1 = r1 + 1
            r6.f41966d = r1     // Catch:{ all -> 0x006f }
            monitor-exit(r6)
            return
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wd1.mo70683a(long, java.lang.Object):void");
    }

    /* renamed from: a */
    private static <V> V[] m43593a(int i) {
        return new Object[i];
    }
}
