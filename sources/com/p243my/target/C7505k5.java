package com.p243my.target;

import android.content.Context;
import com.appsflyer.ServerParameters;

/* renamed from: com.my.target.k5 */
public class C7505k5 extends C7438h5 {

    /* renamed from: a */
    public boolean f18901a = false;

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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final void m19600b(android.content.Context r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "com.huawei.hms.ads.identifier.AdvertisingIdClient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "send huawei AId"
            com.p243my.target.C7374e0.m18989a(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "getAdvertisingIdInfo"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x009a }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x009a }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x009a
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x009a }
            r2[r6] = r9     // Catch:{ all -> 0x009a }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x009a
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "getId"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x009a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0051
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x009a }
            java.lang.Object r2 = r2.invoke(r1, r4)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r4.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "huawei AId: "
            r4.append(r5)     // Catch:{ all -> 0x0097 }
            r4.append(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0097 }
            com.p243my.target.C7374e0.m18989a(r4)     // Catch:{ all -> 0x0097 }
            goto L_0x0052
        L_0x0051:
            r2 = r0
        L_0x0052:
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x0097 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0097
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r4.invoke(r1, r5)     // Catch:{ all -> 0x0097 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r4.<init>()     // Catch:{ all -> 0x0097 }
            boolean r5 = r1.booleanValue()     // Catch:{ all -> 0x0097 }
            r5 = r5 ^ r3
            r4.append(r5)     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = ""
            r4.append(r5)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r4.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "huawei ad tracking enabled: "
            r4.append(r5)     // Catch:{ all -> 0x0097 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0097 }
            r1 = r1 ^ r3
            r4.append(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0097 }
            com.p243my.target.C7374e0.m18989a(r1)     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = r0
            r0 = r2
            goto L_0x009b
        L_0x009a:
            r1 = r0
        L_0x009b:
            monitor-enter(r8)
            java.lang.String r2 = "oaid"
            r8.addParam(r2, r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = "oaid_tracking_enabled"
            r8.addParam(r2, r1)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r8)     // Catch:{ all -> 0x00b6 }
            com.my.target.u8 r2 = com.p243my.target.C7695u8.m20613a((android.content.Context) r9)
            r2.mo51697c(r0)
            com.my.target.u8 r9 = com.p243my.target.C7695u8.m20613a((android.content.Context) r9)
            r9.mo51699d(r1)
            return
        L_0x00b6:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b6 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7505k5.m19600b(android.content.Context):void");
    }

    public synchronized void collectData(Context context) {
        if (C7395f0.m19089b()) {
            C7374e0.m18989a("You must not call collectData method from main thread");
        } else if (!this.f18901a) {
            C7695u8 a = C7695u8.m20613a(context);
            try {
                Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
                String c = a.mo51696c();
                String b = a.mo51694b();
                if (c != null) {
                    if (c.length() != 0) {
                        addParam(ServerParameters.OAID, c);
                        addParam("oaid_tracking_enabled", b);
                        C7395f0.m19088b(new Runnable(context) {
                            public final /* synthetic */ Context f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C7505k5.this.m19600b(this.f$1);
                            }
                        });
                        this.f18901a = true;
                    }
                }
                m19600b(context);
                this.f18901a = true;
            } catch (Throwable unused) {
                a.mo51697c((String) null);
                a.mo51699d((String) null);
                this.f18901a = true;
            }
        }
    }
}
