package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.kx0;
import java.lang.Exception;
import java.util.ArrayDeque;

public abstract class p81<I extends C14387qj, O extends kx0, E extends Exception> implements C14187oj<I, O, E> {

    /* renamed from: a */
    private final Thread f38548a;

    /* renamed from: b */
    private final Object f38549b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f38550c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f38551d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f38552e;

    /* renamed from: f */
    private final O[] f38553f;

    /* renamed from: g */
    private int f38554g;

    /* renamed from: h */
    private int f38555h;

    /* renamed from: i */
    private I f38556i;

    /* renamed from: j */
    private E f38557j;

    /* renamed from: k */
    private boolean f38558k;

    /* renamed from: l */
    private boolean f38559l;

    /* renamed from: m */
    private int f38560m;

    /* renamed from: com.yandex.mobile.ads.impl.p81$a */
    class C14264a extends Thread {
        C14264a() {
        }

        public void run() {
            p81.m40694a(p81.this);
        }
    }

    protected p81(I[] iArr, O[] oArr) {
        this.f38552e = iArr;
        this.f38554g = iArr.length;
        for (int i = 0; i < this.f38554g; i++) {
            this.f38552e[i] = mo69332c();
        }
        this.f38553f = oArr;
        this.f38555h = oArr.length;
        for (int i2 = 0; i2 < this.f38555h; i2++) {
            this.f38553f[i2] = mo69333d();
        }
        C14264a aVar = new C14264a();
        this.f38548a = aVar;
        aVar.start();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* renamed from: e */
    private boolean m40696e() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f38549b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.f38559l     // Catch:{ all -> 0x009e }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0020
            java.util.ArrayDeque<I> r1 = r8.f38550c     // Catch:{ all -> 0x009e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x0017
            int r1 = r8.f38555h     // Catch:{ all -> 0x009e }
            if (r1 <= 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 != 0) goto L_0x0020
            java.lang.Object r1 = r8.f38549b     // Catch:{ all -> 0x009e }
            r1.wait()     // Catch:{ all -> 0x009e }
            goto L_0x0003
        L_0x0020:
            boolean r1 = r8.f38559l     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r3
        L_0x0026:
            java.util.ArrayDeque<I> r1 = r8.f38550c     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x009e }
            com.yandex.mobile.ads.impl.qj r1 = (com.yandex.mobile.ads.impl.C14387qj) r1     // Catch:{ all -> 0x009e }
            O[] r4 = r8.f38553f     // Catch:{ all -> 0x009e }
            int r5 = r8.f38555h     // Catch:{ all -> 0x009e }
            int r5 = r5 - r2
            r8.f38555h = r5     // Catch:{ all -> 0x009e }
            r4 = r4[r5]     // Catch:{ all -> 0x009e }
            boolean r5 = r8.f38558k     // Catch:{ all -> 0x009e }
            r8.f38558k = r3     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            r0 = 4
            boolean r6 = r1.mo71019d(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x0049
            r4.mo71015b(r0)
            goto L_0x0075
        L_0x0049:
            boolean r0 = r1.mo71019d(r7)
            if (r0 == 0) goto L_0x0052
            r4.mo71015b(r7)
        L_0x0052:
            java.lang.Exception r0 = r8.mo69329a(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0060, OutOfMemoryError -> 0x0057 }
            goto L_0x0069
        L_0x0057:
            r0 = move-exception
            com.yandex.mobile.ads.impl.ac1 r5 = new com.yandex.mobile.ads.impl.ac1
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x0068
        L_0x0060:
            r0 = move-exception
            com.yandex.mobile.ads.impl.ac1 r5 = new com.yandex.mobile.ads.impl.ac1
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x0068:
            r0 = r5
        L_0x0069:
            if (r0 == 0) goto L_0x0075
            java.lang.Object r5 = r8.f38549b
            monitor-enter(r5)
            r8.f38557j = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            return r3
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            java.lang.Object r5 = r8.f38549b
            monitor-enter(r5)
            boolean r0 = r8.f38558k     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0080
            r4.mo68281g()     // Catch:{ all -> 0x009b }
            goto L_0x0096
        L_0x0080:
            boolean r0 = r4.mo71019d(r7)     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008f
            int r0 = r8.f38560m     // Catch:{ all -> 0x009b }
            int r0 = r0 + r2
            r8.f38560m = r0     // Catch:{ all -> 0x009b }
            r4.mo68281g()     // Catch:{ all -> 0x009b }
            goto L_0x0096
        L_0x008f:
            r8.f38560m = r3     // Catch:{ all -> 0x009b }
            java.util.ArrayDeque<O> r0 = r8.f38551d     // Catch:{ all -> 0x009b }
            r0.addLast(r4)     // Catch:{ all -> 0x009b }
        L_0x0096:
            r8.m40695a(r1)     // Catch:{ all -> 0x009b }
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
            return r2
        L_0x009b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
            throw r0
        L_0x009e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p81.m40696e():boolean");
    }

    /* renamed from: f */
    private void m40697f() {
        if (!this.f38550c.isEmpty() && this.f38555h > 0) {
            this.f38549b.notify();
        }
    }

    /* renamed from: g */
    private void m40698g() throws Exception {
        E e = this.f38557j;
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo69329a(I i, O o, boolean z);

    /* renamed from: a */
    public void mo69165a(Object obj) throws Exception {
        I i = (C14387qj) obj;
        synchronized (this.f38549b) {
            m40698g();
            C13479j9.m37705a(i == this.f38556i);
            this.f38550c.addLast(i);
            m40697f();
            this.f38556i = null;
        }
    }

    /* renamed from: b */
    public Object mo69166b() throws Exception {
        I i;
        synchronized (this.f38549b) {
            m40698g();
            C13479j9.m37708b(this.f38556i == null);
            int i2 = this.f38554g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f38552e;
                int i3 = i2 - 1;
                this.f38554g = i3;
                i = iArr[i3];
            }
            this.f38556i = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract I mo69332c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract O mo69333d();

    public final void flush() {
        synchronized (this.f38549b) {
            this.f38558k = true;
            this.f38560m = 0;
            I i = this.f38556i;
            if (i != null) {
                m40695a(i);
                this.f38556i = null;
            }
            while (!this.f38550c.isEmpty()) {
                m40695a((C14387qj) this.f38550c.removeFirst());
            }
            while (!this.f38551d.isEmpty()) {
                ((kx0) this.f38551d.removeFirst()).mo68281g();
            }
            this.f38557j = null;
        }
    }

    public void release() {
        synchronized (this.f38549b) {
            this.f38559l = true;
            this.f38549b.notify();
        }
        try {
            this.f38548a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    static void m40694a(p81 p81) {
        p81.getClass();
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (p81.m40696e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69330a(int i) {
        C13479j9.m37708b(this.f38554g == this.f38552e.length);
        for (I g : this.f38552e) {
            g.mo69601g(i);
        }
    }

    /* renamed from: a */
    public Object mo69164a() throws Exception {
        kx0 kx0;
        synchronized (this.f38549b) {
            m40698g();
            if (this.f38551d.isEmpty()) {
                kx0 = null;
            } else {
                kx0 = (kx0) this.f38551d.removeFirst();
            }
        }
        return kx0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69331a(O o) {
        synchronized (this.f38549b) {
            o.mo66557b();
            O[] oArr = this.f38553f;
            int i = this.f38555h;
            this.f38555h = i + 1;
            oArr[i] = o;
            m40697f();
        }
    }

    /* renamed from: a */
    private void m40695a(I i) {
        i.mo66557b();
        I[] iArr = this.f38552e;
        int i2 = this.f38554g;
        this.f38554g = i2 + 1;
        iArr[i2] = i;
    }
}
