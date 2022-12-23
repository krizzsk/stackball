package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.h41;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class qp0 implements tv0 {

    /* renamed from: a */
    private final Context f39203a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14405b f39204b = new C14405b(Looper.getMainLooper());

    /* renamed from: c */
    private final oe1 f39205c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f39206d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C14404a> f39207e;

    /* renamed from: f */
    private final wd0 f39208f;

    /* renamed from: g */
    private final C12356a5 f39209g;

    /* renamed from: h */
    private final l71 f39210h;

    /* renamed from: i */
    private xd0 f39211i;

    /* renamed from: j */
    private boolean f39212j;

    /* renamed from: k */
    private int f39213k;

    /* renamed from: l */
    private boolean f39214l;

    /* renamed from: m */
    private boolean f39215m;

    /* renamed from: com.yandex.mobile.ads.impl.qp0$a */
    static class C14404a {

        /* renamed from: a */
        String f39216a;

        /* renamed from: b */
        long f39217b;

        /* renamed from: c */
        int f39218c;

        /* renamed from: d */
        Long f39219d;

        C14404a(String str, long j, int i) {
            this.f39216a = str;
            this.f39217b = j;
            this.f39218c = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qp0$b */
    static class C14405b extends Handler {
        C14405b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            qp0 qp0;
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                qp0 qp02 = (qp0) ((WeakReference) pair.first).get();
                if (qp02 != null) {
                    C14404a aVar = (C14404a) pair.second;
                    String unused = qp02.f39206d;
                    C12135y a = qp0.m41310a(qp02, aVar);
                    qp0.m41312a(qp02, aVar, a);
                    if (qp02.m41315b(a)) {
                        qp02.f39207e.remove(aVar);
                        if (qp02.f39207e.isEmpty()) {
                            qp02.mo69629a(a.mo64678c());
                            return;
                        }
                        return;
                    }
                    aVar.f39219d = null;
                    qp02.mo69631b();
                }
            } else if (i == 2 && (qp0 = (qp0) ((WeakReference) message.obj).get()) != null) {
                qp0.f39207e.size();
                String unused2 = qp0.f39206d;
                int size = qp0.f39207e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C14404a aVar2 = (C14404a) qp0.f39207e.get(i2);
                    C12135y a2 = qp0.m41310a(qp0, aVar2);
                    if (qp0.m41315b(a2)) {
                        if (aVar2.f39219d == null) {
                            aVar2.f39219d = Long.valueOf(SystemClock.elapsedRealtime());
                        }
                        if (SystemClock.elapsedRealtime() - aVar2.f39219d.longValue() >= aVar2.f39217b) {
                            qp0.f39204b.sendMessage(Message.obtain(qp0.f39204b, 1, new Pair(new WeakReference(qp0), aVar2)));
                        }
                        qp0.mo69632b(a2.mo64679d());
                    } else {
                        aVar2.f39219d = null;
                        qp0.mo69628a(a2);
                    }
                }
                if (qp0.m41317d(qp0)) {
                    qp0.f39204b.sendMessageDelayed(Message.obtain(qp0.f39204b, 2, new WeakReference(qp0)), 200);
                }
            }
        }
    }

    qp0(Context context, C14645t1 t1Var, wd0 wd0, oe1 oe1, String str) {
        this.f39203a = context;
        this.f39205c = oe1;
        this.f39208f = wd0;
        this.f39206d = str;
        this.f39207e = new ArrayList();
        this.f39209g = new C12356a5(context, t1Var);
        this.f39210h = l71.m38631c();
    }

    /* renamed from: d */
    static boolean m41317d(qp0 qp0) {
        boolean z;
        synchronized (qp0) {
            z = qp0.f39207e.size() > 0;
        }
        return z;
    }

    /* renamed from: a */
    static void m41312a(qp0 qp0, C14404a aVar, C12135y yVar) {
        synchronized (qp0) {
            if (qp0.m41315b(yVar)) {
                qp0.f39209g.mo65674a(aVar.f39216a);
            } else {
                qp0.mo69628a(yVar);
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
    /* renamed from: b */
    public synchronized void mo69631b() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.mobile.ads.base.v r0 = com.yandex.mobile.ads.base.C12130v.m31590a()     // Catch:{ all -> 0x0046 }
            android.content.Context r1 = r4.f39203a     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.mo64672b(r1)     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            r0 = 1
            java.util.Collection[] r1 = new java.util.Collection[r0]     // Catch:{ all -> 0x0046 }
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r2 = r4.f39207e     // Catch:{ all -> 0x0046 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0046 }
            boolean r1 = com.yandex.mobile.ads.impl.C13378i5.m37281a((java.util.Collection[]) r1)     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x0046 }
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r1 = r4.f39207e     // Catch:{ all -> 0x0041 }
            int r1 = r1.size()     // Catch:{ all -> 0x0041 }
            if (r1 <= 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            com.yandex.mobile.ads.impl.qp0$b r0 = r4.f39204b     // Catch:{ all -> 0x0046 }
            r1 = 2
            boolean r0 = r0.hasMessages(r1)     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            com.yandex.mobile.ads.impl.qp0$b r0 = r4.f39204b     // Catch:{ all -> 0x0046 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0046 }
            r2.<init>(r4)     // Catch:{ all -> 0x0046 }
            android.os.Message r1 = android.os.Message.obtain(r0, r1, r2)     // Catch:{ all -> 0x0046 }
            r0.sendMessage(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0044
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qp0.mo69631b():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public synchronized void mo69633c() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r0 = r8.f39207e     // Catch:{ all -> 0x00ac }
            r0.size()     // Catch:{ all -> 0x00ac }
            r8.mo69625a()     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.h41$b r0 = com.yandex.mobile.ads.impl.h41.C13276b.IMPRESSION_TRACKING_SUCCESS     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            r2 = 0
            r8.f39215m = r2     // Catch:{ all -> 0x00ac }
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r3 = r8.f39207e     // Catch:{ all -> 0x00ac }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0019:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.qp0$a r4 = (com.yandex.mobile.ads.impl.qp0.C14404a) r4     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.l71 r5 = r8.f39210h     // Catch:{ all -> 0x00ac }
            android.content.Context r6 = r8.f39203a     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.d71 r5 = r5.mo68362a((android.content.Context) r6)     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x0034
            boolean r5 = r5.mo66473u()     // Catch:{ all -> 0x00ac }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0040
            com.yandex.mobile.ads.impl.oe1 r5 = r8.f39205c     // Catch:{ all -> 0x00ac }
            int r6 = r4.f39218c     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.base.y r5 = r5.mo68679b(r6)     // Catch:{ all -> 0x00ac }
            goto L_0x0048
        L_0x0040:
            com.yandex.mobile.ads.impl.oe1 r5 = r8.f39205c     // Catch:{ all -> 0x00ac }
            int r6 = r4.f39218c     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.base.y r5 = r5.mo68678a(r6)     // Catch:{ all -> 0x00ac }
        L_0x0048:
            com.yandex.mobile.ads.base.y$a r6 = r5.mo64680e()     // Catch:{ all -> 0x00ac }
            r6.mo64681a()     // Catch:{ all -> 0x00ac }
            monitor-enter(r8)     // Catch:{ all -> 0x00ac }
            monitor-enter(r8)     // Catch:{ all -> 0x008e }
            boolean r6 = r8.m41315b((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x005f
            com.yandex.mobile.ads.impl.a5 r6 = r8.f39209g     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r4.f39216a     // Catch:{ all -> 0x008b }
            r6.mo65674a(r7)     // Catch:{ all -> 0x008b }
            goto L_0x0062
        L_0x005f:
            r8.mo69628a((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x008b }
        L_0x0062:
            monitor-exit(r8)     // Catch:{ all -> 0x008e }
            boolean r6 = r8.f39215m     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.m41315b((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0075
            com.yandex.mobile.ads.impl.wd0 r6 = r8.f39208f     // Catch:{ all -> 0x008e }
            r6.mo70678b(r5)     // Catch:{ all -> 0x008e }
            r6 = 1
            r8.f39215m = r6     // Catch:{ all -> 0x008e }
        L_0x0075:
            monitor-exit(r8)     // Catch:{ all -> 0x00ac }
            boolean r6 = r8.m41315b((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x00ac }
            if (r6 == 0) goto L_0x0019
            r1.add(r4)     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.h41$b r0 = r5.mo64678c()     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.h41$b r4 = r5.mo64679d()     // Catch:{ all -> 0x00ac }
            r8.mo69632b((com.yandex.mobile.ads.impl.h41.C13276b) r4)     // Catch:{ all -> 0x00ac }
            goto L_0x0019
        L_0x008b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x0091:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r2 != 0) goto L_0x00a7
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r2 = r8.f39207e     // Catch:{ all -> 0x00ac }
            r2.removeAll(r1)     // Catch:{ all -> 0x00ac }
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r1 = r8.f39207e     // Catch:{ all -> 0x00ac }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x00a7
            r8.mo69629a((com.yandex.mobile.ads.impl.h41.C13276b) r0)     // Catch:{ all -> 0x00ac }
        L_0x00a7:
            r8.mo69631b()     // Catch:{ all -> 0x00ac }
            monitor-exit(r8)
            return
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qp0.mo69633c():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m41315b(C12135y yVar) {
        return yVar.mo64680e() == C12135y.C12136a.SUCCESS;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo69627a(com.yandex.mobile.ads.base.AdResponse r6, java.util.List<com.yandex.mobile.ads.impl.k81> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.mobile.ads.impl.wd0 r0 = r5.f39208f     // Catch:{ all -> 0x0045 }
            r0.mo70675a((com.yandex.mobile.ads.base.AdResponse) r6)     // Catch:{ all -> 0x0045 }
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r6 = r5.f39207e     // Catch:{ all -> 0x0045 }
            r6.clear()     // Catch:{ all -> 0x0045 }
            r6 = 0
            r5.f39213k = r6     // Catch:{ all -> 0x0045 }
            r5.f39212j = r6     // Catch:{ all -> 0x0045 }
            r5.f39214l = r6     // Catch:{ all -> 0x0045 }
            r5.f39215m = r6     // Catch:{ all -> 0x0045 }
            r5.mo69625a()     // Catch:{ all -> 0x0045 }
            monitor-enter(r5)     // Catch:{ all -> 0x0045 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0042 }
        L_0x001c:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0042 }
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0042 }
            com.yandex.mobile.ads.impl.k81 r7 = (com.yandex.mobile.ads.impl.k81) r7     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r7.mo68162b()     // Catch:{ all -> 0x0042 }
            long r1 = r7.mo68158a()     // Catch:{ all -> 0x0042 }
            int r7 = r7.mo68163c()     // Catch:{ all -> 0x0042 }
            java.util.List<com.yandex.mobile.ads.impl.qp0$a> r3 = r5.f39207e     // Catch:{ all -> 0x0042 }
            com.yandex.mobile.ads.impl.qp0$a r4 = new com.yandex.mobile.ads.impl.qp0$a     // Catch:{ all -> 0x0042 }
            r4.<init>(r0, r1, r7)     // Catch:{ all -> 0x0042 }
            r3.add(r4)     // Catch:{ all -> 0x0042 }
            goto L_0x001c
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0045 }
            monitor-exit(r5)
            return
        L_0x0042:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0045 }
            throw r6     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qp0.mo69627a(com.yandex.mobile.ads.base.AdResponse, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo69632b(h41.C13276b bVar) {
        if (!this.f39214l) {
            this.f39208f.mo70677a(bVar);
            c21.m34569b("Ad binding successful", new Object[0]);
            this.f39214l = true;
        }
    }

    /* renamed from: a */
    public synchronized void mo69625a() {
        this.f39204b.removeMessages(2);
        this.f39204b.removeMessages(1);
        for (C14404a aVar : this.f39207e) {
            aVar.f39219d = null;
        }
    }

    /* renamed from: a */
    static C12135y m41310a(qp0 qp0, C14404a aVar) {
        C12135y b = qp0.f39205c.mo68679b(aVar.f39218c);
        b.mo64680e().getClass();
        return b;
    }

    /* renamed from: a */
    public synchronized void mo69626a(Intent intent, boolean z) {
        String action = intent.getAction();
        action.getClass();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -2128145023) {
            if (hashCode != -1454123155) {
                if (hashCode == 823795052) {
                    if (action.equals("android.intent.action.USER_PRESENT")) {
                        c = 2;
                    }
                }
            } else if (action.equals("android.intent.action.SCREEN_ON")) {
                c = 1;
            }
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            c = 0;
        }
        if (c == 0) {
            mo69625a();
        } else if (c == 1 || c == 2) {
            if (z) {
                mo69631b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo69629a(h41.C13276b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("failure_tracked", Boolean.valueOf(this.f39212j));
        this.f39208f.mo70679b(bVar, hashMap);
        xd0 xd0 = this.f39211i;
        if (xd0 != null) {
            xd0.mo69956f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo69628a(C12135y yVar) {
        int i = this.f39213k + 1;
        this.f39213k = i;
        if (i == 20) {
            this.f39208f.mo70680c(yVar);
            this.f39212j = true;
        }
    }

    /* renamed from: a */
    public void mo69630a(xd0 xd0) {
        this.f39211i = xd0;
    }
}
