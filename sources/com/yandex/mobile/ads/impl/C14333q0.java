package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.q0 */
public final class C14333q0 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f38901f = new Object();

    /* renamed from: g */
    private static volatile C14333q0 f38902g;

    /* renamed from: a */
    private final ia0 f38903a;

    /* renamed from: b */
    private final C14644t0 f38904b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14550s0 f38905c = new C14550s0();

    /* renamed from: d */
    private final C14335b f38906d = new C14335b();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f38907e;

    /* renamed from: com.yandex.mobile.ads.impl.q0$b */
    private class C14335b implements C14434r0 {
        private C14335b() {
        }

        /* renamed from: a */
        public void mo64754a() {
            synchronized (C14333q0.f38901f) {
                boolean unused = C14333q0.this.f38907e = false;
                C14333q0.this.f38905c.mo69846a();
            }
        }
    }

    private C14333q0(Context context) {
        this.f38903a = new ia0(context);
        this.f38904b = new C14644t0(context);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public void mo69463b(com.yandex.mobile.ads.impl.C14434r0 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = f38901f
            monitor-enter(r0)
            com.yandex.mobile.ads.impl.t0 r1 = r2.f38904b     // Catch:{ all -> 0x0029 }
            boolean r1 = r1.mo70079a()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0024
            monitor-enter(r0)     // Catch:{ all -> 0x0029 }
            com.yandex.mobile.ads.impl.s0 r1 = r2.f38905c     // Catch:{ all -> 0x0021 }
            r1.mo69847a(r3)     // Catch:{ all -> 0x0021 }
            boolean r3 = r2.f38907e     // Catch:{ all -> 0x0021 }
            if (r3 != 0) goto L_0x001f
            r3 = 1
            r2.f38907e = r3     // Catch:{ all -> 0x0021 }
            com.yandex.mobile.ads.impl.ia0 r3 = r2.f38903a     // Catch:{ all -> 0x0021 }
            com.yandex.mobile.ads.impl.q0$b r1 = r2.f38906d     // Catch:{ all -> 0x0021 }
            r3.mo67762a((com.yandex.mobile.ads.impl.C14434r0) r1)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0027
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0024:
            r3.mo64754a()     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14333q0.mo69463b(com.yandex.mobile.ads.impl.r0):void");
    }

    /* renamed from: a */
    public static C14333q0 m41022a(Context context) {
        if (f38902g == null) {
            synchronized (f38901f) {
                if (f38902g == null) {
                    f38902g = new C14333q0(context);
                }
            }
        }
        return f38902g;
    }

    /* renamed from: a */
    public void mo69462a(C14434r0 r0Var) {
        synchronized (f38901f) {
            this.f38905c.mo69848b(r0Var);
        }
    }
}
