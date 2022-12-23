package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.xj */
public final class C15174xj implements C13477j7 {

    /* renamed from: a */
    private final boolean f42565a;

    /* renamed from: b */
    private final int f42566b;

    /* renamed from: c */
    private final byte[] f42567c;

    /* renamed from: d */
    private final C13383i7[] f42568d;

    /* renamed from: e */
    private int f42569e;

    /* renamed from: f */
    private int f42570f;

    /* renamed from: g */
    private int f42571g;

    /* renamed from: h */
    private C13383i7[] f42572h;

    public C15174xj(boolean z, int i) {
        this(z, i, 0);
    }

    /* renamed from: a */
    public synchronized void mo70900a(int i) {
        boolean z = i < this.f42569e;
        this.f42569e = i;
        if (z) {
            mo70906e();
        }
    }

    /* renamed from: b */
    public int mo70903b() {
        return this.f42566b;
    }

    /* renamed from: c */
    public synchronized int mo70904c() {
        return this.f42570f * this.f42566b;
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
    /* renamed from: d */
    public synchronized void mo70905d() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f42565a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            monitor-enter(r2)     // Catch:{ all -> 0x001c }
            int r0 = r2.f42569e     // Catch:{ all -> 0x0017 }
            r1 = 0
            if (r0 <= 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r2.f42569e = r1     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            r2.mo70906e()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15174xj.mo70905d():void");
    }

    /* renamed from: e */
    public synchronized void mo70906e() {
        int i = 0;
        int max = Math.max(0, ih1.m37366a(this.f42569e, this.f42566b) - this.f42570f);
        int i2 = this.f42571g;
        if (max < i2) {
            if (this.f42567c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C13383i7[] i7VarArr = this.f42572h;
                    C13383i7 i7Var = i7VarArr[i];
                    byte[] bArr = i7Var.f34752a;
                    byte[] bArr2 = this.f42567c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        C13383i7 i7Var2 = i7VarArr[i3];
                        if (i7Var2.f34752a != bArr2) {
                            i3--;
                        } else {
                            i7VarArr[i] = i7Var2;
                            i7VarArr[i3] = i7Var;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f42571g) {
                    return;
                }
            }
            Arrays.fill(this.f42572h, max, this.f42571g, (Object) null);
            this.f42571g = max;
        }
    }

    public C15174xj(boolean z, int i, int i2) {
        C13479j9.m37705a(i > 0);
        C13479j9.m37705a(i2 >= 0);
        this.f42565a = z;
        this.f42566b = i;
        this.f42571g = i2;
        this.f42572h = new C13383i7[(i2 + 100)];
        if (i2 > 0) {
            this.f42567c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f42572h[i3] = new C13383i7(this.f42567c, i3 * i);
            }
        } else {
            this.f42567c = null;
        }
        this.f42568d = new C13383i7[1];
    }

    /* renamed from: a */
    public synchronized C13383i7 mo70899a() {
        C13383i7 i7Var;
        this.f42570f++;
        int i = this.f42571g;
        if (i > 0) {
            C13383i7[] i7VarArr = this.f42572h;
            int i2 = i - 1;
            this.f42571g = i2;
            i7Var = i7VarArr[i2];
            i7VarArr[i2] = null;
        } else {
            i7Var = new C13383i7(new byte[this.f42566b], 0);
        }
        return i7Var;
    }

    /* renamed from: a */
    public synchronized void mo70901a(C13383i7 i7Var) {
        C13383i7[] i7VarArr = this.f42568d;
        i7VarArr[0] = i7Var;
        mo70902a(i7VarArr);
    }

    /* renamed from: a */
    public synchronized void mo70902a(C13383i7[] i7VarArr) {
        int i = this.f42571g;
        int length = i7VarArr.length + i;
        C13383i7[] i7VarArr2 = this.f42572h;
        if (length >= i7VarArr2.length) {
            this.f42572h = (C13383i7[]) Arrays.copyOf(i7VarArr2, Math.max(i7VarArr2.length * 2, i + i7VarArr.length));
        }
        for (C13383i7 i7Var : i7VarArr) {
            C13383i7[] i7VarArr3 = this.f42572h;
            int i2 = this.f42571g;
            this.f42571g = i2 + 1;
            i7VarArr3[i2] = i7Var;
        }
        this.f42570f -= i7VarArr.length;
        notifyAll();
    }
}
