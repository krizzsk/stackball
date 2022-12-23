package com.yandex.mobile.ads.base;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.base.v */
public class C12130v extends BroadcastReceiver {

    /* renamed from: d */
    private static volatile C12130v f29388d;

    /* renamed from: e */
    private static final Object f29389e = new Object();

    /* renamed from: a */
    private boolean f29390a = false;

    /* renamed from: b */
    private C12131a f29391b = C12131a.USER_PRESENT;

    /* renamed from: c */
    private WeakHashMap<C12132b, Object> f29392c = new WeakHashMap<>();

    /* renamed from: com.yandex.mobile.ads.base.v$a */
    enum C12131a {
        SCREEN_ON,
        SCREEN_OFF,
        USER_PRESENT
    }

    /* renamed from: com.yandex.mobile.ads.base.v$b */
    public interface C12132b {
        /* renamed from: a */
        void mo64403a(Intent intent);
    }

    private C12130v() {
    }

    /* renamed from: a */
    public static C12130v m31590a() {
        if (f29388d == null) {
            synchronized (f29389e) {
                if (f29388d == null) {
                    f29388d = new C12130v();
                }
            }
        }
        return f29388d;
    }

    /* renamed from: b */
    public synchronized void mo64671b(C12132b bVar, Context context) {
        if (context != null) {
            this.f29392c.remove(bVar);
            try {
                if (this.f29390a && this.f29392c.isEmpty()) {
                    context.getApplicationContext().unregisterReceiver(this);
                    this.f29390a = false;
                }
            } catch (Exception unused) {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void onReceive(android.content.Context r2, android.content.Intent r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L_0x0053
            r3.getAction()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = r3.getAction()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0017
            com.yandex.mobile.ads.base.v$a r2 = com.yandex.mobile.ads.base.C12130v.C12131a.SCREEN_OFF     // Catch:{ all -> 0x0050 }
            r1.f29391b = r2     // Catch:{ all -> 0x0050 }
            goto L_0x0030
        L_0x0017:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0024
            com.yandex.mobile.ads.base.v$a r2 = com.yandex.mobile.ads.base.C12130v.C12131a.USER_PRESENT     // Catch:{ all -> 0x0050 }
            r1.f29391b = r2     // Catch:{ all -> 0x0050 }
            goto L_0x0030
        L_0x0024:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0030
            com.yandex.mobile.ads.base.v$a r2 = com.yandex.mobile.ads.base.C12130v.C12131a.SCREEN_ON     // Catch:{ all -> 0x0050 }
            r1.f29391b = r2     // Catch:{ all -> 0x0050 }
        L_0x0030:
            monitor-enter(r1)     // Catch:{ all -> 0x0050 }
            java.util.WeakHashMap<com.yandex.mobile.ads.base.v$b, java.lang.Object> r2 = r1.f29392c     // Catch:{ all -> 0x004d }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x004d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x004d }
        L_0x003b:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x004d }
            com.yandex.mobile.ads.base.v$b r0 = (com.yandex.mobile.ads.base.C12130v.C12132b) r0     // Catch:{ all -> 0x004d }
            r0.mo64403a(r3)     // Catch:{ all -> 0x004d }
            goto L_0x003b
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            goto L_0x0053
        L_0x004d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            throw r2     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0053:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12130v.onReceive(android.content.Context, android.content.Intent):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public synchronized boolean mo64672b(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "power"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ all -> 0x0039 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x0039 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0039 }
            r2 = 20
            if (r1 < r2) goto L_0x0015
            boolean r0 = r0.isInteractive()     // Catch:{ all -> 0x0039 }
            goto L_0x0019
        L_0x0015:
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x0039 }
        L_0x0019:
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            com.yandex.mobile.ads.impl.l71 r1 = com.yandex.mobile.ads.impl.l71.m38631c()     // Catch:{ all -> 0x003c }
            com.yandex.mobile.ads.impl.d71 r1 = r1.mo68362a((android.content.Context) r4)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.mo66437B()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002c
            monitor-exit(r3)
            return r0
        L_0x002c:
            if (r0 == 0) goto L_0x0036
            boolean r4 = r3.m31591a(r4)     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            monitor-exit(r3)
            return r4
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12130v.mo64672b(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        mo64671b(r4, r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64670a(com.yandex.mobile.ads.base.C12130v.C12132b r4, android.content.Context r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r5 == 0) goto L_0x0034
            java.util.WeakHashMap<com.yandex.mobile.ads.base.v$b, java.lang.Object> r0 = r3.f29392c     // Catch:{ Exception -> 0x002e }
            r1 = 0
            r0.put(r4, r1)     // Catch:{ Exception -> 0x002e }
            boolean r0 = r3.f29390a     // Catch:{ Exception -> 0x002e }
            if (r0 != 0) goto L_0x0034
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ Exception -> 0x002e }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ Exception -> 0x002e }
            r1.<init>()     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            r1.addAction(r2)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            r1.addAction(r2)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "android.intent.action.USER_PRESENT"
            r1.addAction(r2)     // Catch:{ Exception -> 0x002e }
            r0.registerReceiver(r3, r1)     // Catch:{ Exception -> 0x002e }
            r0 = 1
            r3.f29390a = r0     // Catch:{ Exception -> 0x002e }
            goto L_0x0034
        L_0x002c:
            r4 = move-exception
            goto L_0x0032
        L_0x002e:
            r3.mo64671b(r4, r5)     // Catch:{ all -> 0x002c }
            goto L_0x0034
        L_0x0032:
            monitor-exit(r3)
            throw r4
        L_0x0034:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12130v.mo64670a(com.yandex.mobile.ads.base.v$b, android.content.Context):void");
    }

    /* renamed from: a */
    private synchronized boolean m31591a(Context context) {
        boolean z;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            z = keyguardManager.isKeyguardLocked();
        } else {
            z = this.f29391b == C12131a.SCREEN_OFF;
        }
        return z;
    }
}
