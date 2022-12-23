package com.chartboost.sdk;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Networking.requests.models.MediationModel;

/* renamed from: com.chartboost.sdk.g */
class C1891g implements Runnable {

    /* renamed from: a */
    private final int f4735a;

    /* renamed from: b */
    boolean f4736b = false;

    /* renamed from: c */
    Chartboost.CBFramework f4737c = null;

    /* renamed from: d */
    String f4738d = null;

    /* renamed from: e */
    MediationModel f4739e = null;

    /* renamed from: f */
    String f4740f = null;

    /* renamed from: g */
    CBLogging.Level f4741g = null;

    /* renamed from: h */
    ChartboostDelegate f4742h = null;

    /* renamed from: i */
    Context f4743i = null;

    /* renamed from: j */
    String f4744j = null;

    /* renamed from: k */
    String f4745k = null;

    C1891g(int i) {
        this.f4735a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.util.concurrent.ScheduledExecutorService} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb A[Catch:{ all -> 0x00f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            int r0 = r11.f4735a     // Catch:{ Exception -> 0x012e }
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x005f;
                case 2: goto L_0x0005;
                case 3: goto L_0x0059;
                case 4: goto L_0x002e;
                case 5: goto L_0x0027;
                case 6: goto L_0x0021;
                case 7: goto L_0x0014;
                case 8: goto L_0x0007;
                default: goto L_0x0005;
            }     // Catch:{ Exception -> 0x012e }
        L_0x0005:
            goto L_0x0153
        L_0x0007:
            com.chartboost.sdk.ChartboostDelegate r0 = r11.f4742h     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5247d = r0     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = "SdkSettings.assignDelegate"
            com.chartboost.sdk.ChartboostDelegate r1 = r11.f4742h     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.impl.C1925h1.m4594a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x0014:
            boolean r0 = com.chartboost.sdk.C1882c.m4358a()     // Catch:{ Exception -> 0x012e }
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            com.chartboost.sdk.Libraries.CBLogging$Level r0 = r11.f4741g     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.Libraries.CBLogging.f4375a = r0     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x0021:
            java.lang.String r0 = r11.f4740f     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5245b = r0     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x0027:
            java.lang.String r0 = r11.f4738d     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C1882c.m4357a((java.lang.String) r0)     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x002e:
            com.chartboost.sdk.Chartboost$CBFramework r0 = r11.f4737c     // Catch:{ Exception -> 0x012e }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "ChartboostCommand"
            java.lang.String r1 = "Pass a valid CBFramework enum value"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r0, r1)     // Catch:{ Exception -> 0x012e }
            return
        L_0x003a:
            com.chartboost.sdk.Chartboost$CBFramework r0 = r11.f4737c     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5248e = r0     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = r11.f4738d     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5249f = r0     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = "%s %s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x012e }
            r2 = 0
            com.chartboost.sdk.Chartboost$CBFramework r3 = r11.f4737c     // Catch:{ Exception -> 0x012e }
            r1[r2] = r3     // Catch:{ Exception -> 0x012e }
            r2 = 1
            java.lang.String r3 = r11.f4738d     // Catch:{ Exception -> 0x012e }
            r1[r2] = r3     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5250g = r0     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x0059:
            com.chartboost.sdk.Networking.requests.models.MediationModel r0 = r11.f4739e     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5252i = r0     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x005f:
            boolean r0 = r11.f4736b     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.C2026k.f5258o = r0     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x0065:
            com.chartboost.sdk.j r0 = com.chartboost.sdk.C2022j.m4955b()     // Catch:{ Exception -> 0x012e }
            r1 = 3
            if (r0 != 0) goto L_0x0115
            java.lang.Class<com.chartboost.sdk.j> r0 = com.chartboost.sdk.C2022j.class
            monitor-enter(r0)     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.j r2 = com.chartboost.sdk.C2022j.m4955b()     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x0110
            android.content.Context r2 = r11.f4743i     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x0082
            java.lang.String r1 = "ChartboostCommand"
            java.lang.String r2 = "Context object is null. Please pass a valid activity object"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r1, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0082:
            android.content.Context r2 = r11.f4743i     // Catch:{ all -> 0x0112 }
            boolean r2 = com.chartboost.sdk.C1882c.m4362b(r2)     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x0093
            java.lang.String r1 = "ChartboostCommand"
            java.lang.String r2 = "Permissions not set correctly"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r1, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0093:
            android.content.Context r2 = r11.f4743i     // Catch:{ all -> 0x0112 }
            boolean r2 = com.chartboost.sdk.C1882c.m4359a((android.content.Context) r2)     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x00a2
            java.lang.String r2 = "ChartboostCommand"
            java.lang.String r3 = "Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions."
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r2, r3)     // Catch:{ all -> 0x0112 }
        L_0x00a2:
            java.lang.String r2 = r11.f4744j     // Catch:{ all -> 0x0112 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = r11.f4745k     // Catch:{ all -> 0x0112 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00b3
            goto L_0x0107
        L_0x00b3:
            com.chartboost.sdk.impl.x r7 = com.chartboost.sdk.impl.C2014x.m4911b()     // Catch:{ all -> 0x0112 }
            com.chartboost.sdk.h r2 = com.chartboost.sdk.C1892h.m4431a()     // Catch:{ all -> 0x0112 }
            android.os.Handler r9 = r7.f5197a     // Catch:{ all -> 0x0112 }
            r3 = 0
            java.util.concurrent.ScheduledExecutorService r4 = com.chartboost.sdk.Networking.C1849b.m4174a()     // Catch:{ all -> 0x00f8 }
            java.lang.Object r4 = r2.mo14549a(r4)     // Catch:{ all -> 0x00f8 }
            r8 = r4
            java.util.concurrent.ScheduledExecutorService r8 = (java.util.concurrent.ScheduledExecutorService) r8     // Catch:{ all -> 0x00f8 }
            r3 = 4
            java.util.concurrent.ExecutorService r3 = com.chartboost.sdk.Networking.C1849b.m4173a(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r2 = r2.mo14549a(r3)     // Catch:{ all -> 0x00f5 }
            r10 = r2
            java.util.concurrent.ExecutorService r10 = (java.util.concurrent.ExecutorService) r10     // Catch:{ all -> 0x00f5 }
            com.chartboost.sdk.j r2 = new com.chartboost.sdk.j     // Catch:{ all -> 0x0112 }
            android.content.Context r4 = r11.f4743i     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r11.f4744j     // Catch:{ all -> 0x0112 }
            java.lang.String r6 = r11.f4745k     // Catch:{ all -> 0x0112 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0112 }
            com.chartboost.sdk.C2022j.m4959c((com.chartboost.sdk.C2022j) r2)     // Catch:{ all -> 0x0112 }
            com.chartboost.sdk.impl.n r3 = r2.f5218h     // Catch:{ all -> 0x0112 }
            r3.mo14710b()     // Catch:{ all -> 0x0112 }
            com.chartboost.sdk.j$b r3 = new com.chartboost.sdk.j$b     // Catch:{ all -> 0x0112 }
            r2.getClass()     // Catch:{ all -> 0x0112 }
            r3.<init>(r1)     // Catch:{ all -> 0x0112 }
            r2.mo14898c((java.lang.Runnable) r3)     // Catch:{ all -> 0x0112 }
            goto L_0x0110
        L_0x00f5:
            r1 = move-exception
            r3 = r8
            goto L_0x00f9
        L_0x00f8:
            r1 = move-exception
        L_0x00f9:
            if (r3 == 0) goto L_0x00fe
            r3.shutdown()     // Catch:{ all -> 0x0112 }
        L_0x00fe:
            java.lang.String r2 = "ChartboostCommand"
            java.lang.String r3 = "Unable to start threads"
            com.chartboost.sdk.Libraries.CBLogging.m3992a(r2, r3, r1)     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0107:
            java.lang.String r1 = "ChartboostCommand"
            java.lang.String r2 = "AppId or AppSignature is null. Please pass a valid id's"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r1, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0110:
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0153
        L_0x0112:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            throw r1     // Catch:{ Exception -> 0x012e }
        L_0x0115:
            com.chartboost.sdk.a r0 = com.chartboost.sdk.C2026k.f5247d     // Catch:{ Exception -> 0x012e }
            if (r0 == 0) goto L_0x011e
            com.chartboost.sdk.a r0 = com.chartboost.sdk.C2026k.f5247d     // Catch:{ Exception -> 0x012e }
            r0.didInitialize()     // Catch:{ Exception -> 0x012e }
        L_0x011e:
            com.chartboost.sdk.j r0 = com.chartboost.sdk.C2022j.m4955b()     // Catch:{ Exception -> 0x012e }
            com.chartboost.sdk.j$b r2 = new com.chartboost.sdk.j$b     // Catch:{ Exception -> 0x012e }
            r0.getClass()     // Catch:{ Exception -> 0x012e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x012e }
            r0.mo14898c((java.lang.Runnable) r2)     // Catch:{ Exception -> 0x012e }
            goto L_0x0153
        L_0x012e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run ("
            r1.append(r2)
            int r2 = r11.f4735a
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ChartboostCommand"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r1, r0)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.C1891g.run():void");
    }
}
