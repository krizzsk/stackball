package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.cd */
public class C12724cd {

    /* renamed from: e */
    protected static final Comparator<byte[]> f31889e = new C12725a();

    /* renamed from: a */
    private final List<byte[]> f31890a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f31891b = new ArrayList(64);

    /* renamed from: c */
    private int f31892c = 0;

    /* renamed from: d */
    private final int f31893d;

    /* renamed from: com.yandex.mobile.ads.impl.cd$a */
    class C12725a implements Comparator<byte[]> {
        C12725a() {
        }

        public int compare(Object obj, Object obj2) {
            return ((byte[]) obj).length - ((byte[]) obj2).length;
        }
    }

    public C12724cd(int i) {
        this.f31893d = i;
    }

    /* renamed from: a */
    public synchronized byte[] mo66255a(int i) {
        for (int i2 = 0; i2 < this.f31891b.size(); i2++) {
            byte[] bArr = this.f31891b.get(i2);
            if (bArr.length >= i) {
                this.f31892c -= bArr.length;
                this.f31891b.remove(i2);
                this.f31890a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
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
    public synchronized void mo66254a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x004b
            int r0 = r3.length     // Catch:{ all -> 0x0048 }
            int r1 = r2.f31893d     // Catch:{ all -> 0x0048 }
            if (r0 <= r1) goto L_0x0009
            goto L_0x004b
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f31890a     // Catch:{ all -> 0x0048 }
            r0.add(r3)     // Catch:{ all -> 0x0048 }
            java.util.List<byte[]> r0 = r2.f31891b     // Catch:{ all -> 0x0048 }
            java.util.Comparator<byte[]> r1 = f31889e     // Catch:{ all -> 0x0048 }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x0048 }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f31891b     // Catch:{ all -> 0x0048 }
            r1.add(r0, r3)     // Catch:{ all -> 0x0048 }
            int r0 = r2.f31892c     // Catch:{ all -> 0x0048 }
            int r3 = r3.length     // Catch:{ all -> 0x0048 }
            int r0 = r0 + r3
            r2.f31892c = r0     // Catch:{ all -> 0x0048 }
            monitor-enter(r2)     // Catch:{ all -> 0x0048 }
        L_0x0027:
            int r3 = r2.f31892c     // Catch:{ all -> 0x0045 }
            int r0 = r2.f31893d     // Catch:{ all -> 0x0045 }
            if (r3 <= r0) goto L_0x0042
            java.util.List<byte[]> r3 = r2.f31890a     // Catch:{ all -> 0x0045 }
            r0 = 0
            java.lang.Object r3 = r3.remove(r0)     // Catch:{ all -> 0x0045 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0045 }
            java.util.List<byte[]> r0 = r2.f31891b     // Catch:{ all -> 0x0045 }
            r0.remove(r3)     // Catch:{ all -> 0x0045 }
            int r0 = r2.f31892c     // Catch:{ all -> 0x0045 }
            int r3 = r3.length     // Catch:{ all -> 0x0045 }
            int r0 = r0 - r3
            r2.f31892c = r0     // Catch:{ all -> 0x0045 }
            goto L_0x0027
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x004b:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12724cd.mo66254a(byte[]):void");
    }
}
