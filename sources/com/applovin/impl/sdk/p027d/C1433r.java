package com.applovin.impl.sdk.p027d;

import android.app.Activity;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.sdk.C1456g;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1549k;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.d.r */
public class C1433r extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f3339a;

    public C1433r(C1469j jVar) {
        super("TaskInitializeSdk", jVar);
        this.f3339a = jVar;
    }

    /* renamed from: a */
    private void m2938a() {
        if (!this.f3339a.mo13141x().mo12410a()) {
            Activity ag = this.f3339a.mo13110ag();
            if (ag != null) {
                this.f3339a.mo13141x().mo12407a(ag);
            } else {
                this.f3339a.mo13071K().mo13015a(new C1399ad(this.f3339a, true, new Runnable() {
                    public void run() {
                        C1433r.this.f3339a.mo13141x().mo12407a(C1433r.this.f3339a.mo13086Z().mo12601a());
                    }
                }), C1435s.C1437a.MAIN, TimeUnit.SECONDS.toMillis(1));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.b.c<java.lang.Boolean>, com.applovin.impl.sdk.b.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2939a(com.applovin.impl.sdk.p025b.C1369c<java.lang.Boolean> r3) {
        /*
            r2 = this;
            com.applovin.impl.sdk.j r0 = r2.f3339a
            java.lang.Object r3 = r0.mo13088a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0021
            com.applovin.sdk.AppLovinAdSize r3 = com.applovin.sdk.AppLovinAdSize.INTERSTITIAL
            com.applovin.sdk.AppLovinAdType r0 = com.applovin.sdk.AppLovinAdType.INCENTIVIZED
            com.applovin.impl.sdk.j r1 = r2.f3339a
            com.applovin.impl.sdk.ad.d r3 = com.applovin.impl.sdk.p024ad.C1349d.m2452a((com.applovin.sdk.AppLovinAdSize) r3, (com.applovin.sdk.AppLovinAdType) r0, (com.applovin.impl.sdk.C1469j) r1)
            com.applovin.impl.sdk.j r0 = r2.f3339a
            com.applovin.impl.sdk.c r0 = r0.mo13079S()
            r0.mo12875f(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p027d.C1433r.m2939a(com.applovin.impl.sdk.b.c):void");
    }

    /* renamed from: b */
    private void m2940b() {
        this.f3339a.mo13071K().mo13014a((C1392a) new C1403b(this.f3339a), C1435s.C1437a.MAIN);
    }

    /* renamed from: c */
    private void m2941c() {
        this.f3339a.mo13079S().mo12864a();
        this.f3339a.mo13080T().mo13282a();
    }

    /* renamed from: h */
    private void m2942h() {
        m2943i();
        m2944j();
        m2945k();
    }

    /* renamed from: i */
    private void m2943i() {
        LinkedHashSet<C1349d> a = this.f3339a.mo13082V().mo12726a();
        if (!a.isEmpty()) {
            mo12944a("Scheduling preload(s) for " + a.size() + " zone(s)");
            Iterator it = a.iterator();
            while (it.hasNext()) {
                C1349d dVar = (C1349d) it.next();
                if (dVar.mo12717e()) {
                    this.f3339a.mo13132p().preloadAds(dVar);
                } else {
                    this.f3339a.mo13131o().preloadAds(dVar);
                }
            }
        }
    }

    /* renamed from: j */
    private void m2944j() {
        C1369c<Boolean> cVar = C1369c.f2940bd;
        String str = (String) this.f3339a.mo13088a(C1369c.f2939bc);
        boolean z = false;
        if (str.length() > 0) {
            for (String fromString : C1517e.m3423a(str)) {
                AppLovinAdSize fromString2 = AppLovinAdSize.fromString(fromString);
                if (fromString2 != null) {
                    this.f3339a.mo13079S().mo12875f(C1349d.m2452a(fromString2, AppLovinAdType.REGULAR, this.f3339a));
                    if (AppLovinAdSize.INTERSTITIAL.getLabel().equals(fromString2.getLabel())) {
                        m2939a(cVar);
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            m2939a(cVar);
        }
    }

    /* renamed from: k */
    private void m2945k() {
        if (((Boolean) this.f3339a.mo13088a(C1369c.f2941be)).booleanValue()) {
            this.f3339a.mo13080T().mo12875f(C1349d.m2466h(this.f3339a));
        }
    }

    /* renamed from: l */
    private void m2946l() {
        String str;
        if (!this.f3339a.mo13121e()) {
            C1549k kVar = new C1549k();
            kVar.mo13334a().mo13335a("AppLovinSdk");
            kVar.mo13336a("Version", AppLovinSdk.VERSION).mo13336a("Plugin Version", this.f3339a.mo13088a(C1369c.f3036dV)).mo13336a("SafeDK Version", C1557r.m3633f());
            boolean e = this.f3339a.mo13064C().mo12850e();
            if (e) {
                str = this.f3339a.mo13074N().mo13152d().f3528b + " (use this for test devices)";
            } else {
                str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            }
            kVar.mo13336a("OS", C1557r.m3630e() + " " + Build.VERSION.SDK_INT).mo13336a(IronSourceConstants.TYPE_GAID, str).mo13336a("SDK Key", this.f3339a.mo13136t());
            C1473k.C1478d b = this.f3339a.mo13074N().mo13150b();
            kVar.mo13336a(ExifInterface.TAG_MODEL, b.f3561d).mo13336a("Locale", b.f3568k).mo13336a("Emulator", Boolean.valueOf(b.f3540A));
            kVar.mo13336a("Application ID", mo12951f().getPackageName()).mo13336a("Test Mode On", Boolean.valueOf(this.f3339a.mo13111ah())).mo13336a("Verbose Logging On", Boolean.valueOf(e));
            kVar.mo13336a("Mediation Provider", this.f3339a.mo13130n()).mo13336a("TG", C1557r.m3588a(C1371e.f3155g, this.f3339a)).mo13336a("LTG", C1557r.m3588a(C1371e.f3156h, this.f3339a)).mo13336a("ARU", C1456g.m3012b(mo12951f())).mo13336a("HUC", C1456g.m3008a(mo12951f())).mo13336a("DNS", C1456g.m3014c(mo12951f()));
            kVar.mo13334a();
            C1505q.m3342f("AppLovinSdk", kVar.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x013c, code lost:
        if (r12.f3339a.mo13120d() == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x013f, code lost:
        r2 = "failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0140, code lost:
        r8.append(r2);
        r8.append(" in ");
        r8.append(java.lang.System.currentTimeMillis() - r6);
        r8.append("ms");
        mo12944a(r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0158, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00f4, code lost:
        if (r12.f3339a.mo13120d() != false) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = " in "
            java.lang.String r2 = "succeeded"
            java.lang.String r3 = "failed"
            java.lang.String r4 = " initialization "
            java.lang.String r5 = "AppLovin SDK "
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Initializing AppLovin SDK "
            r8.append(r9)
            java.lang.String r9 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r9)
            java.lang.String r9 = "..."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12.mo12944a(r8)
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.c.h r8 = r8.mo13072L()     // Catch:{ all -> 0x00f7 }
            r8.mo12934d()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.c.h r8 = r8.mo13072L()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.c.g r9 = com.applovin.impl.sdk.p026c.C1387g.f3249b     // Catch:{ all -> 0x00f7 }
            r8.mo12933c(r9)     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.o r8 = r8.mo13081U()     // Catch:{ all -> 0x00f7 }
            android.content.Context r9 = r12.mo12951f()     // Catch:{ all -> 0x00f7 }
            r8.mo13261a((android.content.Context) r9)     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.o r8 = r8.mo13081U()     // Catch:{ all -> 0x00f7 }
            android.content.Context r9 = r12.mo12951f()     // Catch:{ all -> 0x00f7 }
            r8.mo13264b((android.content.Context) r9)     // Catch:{ all -> 0x00f7 }
            r12.m2941c()     // Catch:{ all -> 0x00f7 }
            r12.m2942h()     // Catch:{ all -> 0x00f7 }
            r12.m2938a()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.c.c r8 = r8.mo13083W()     // Catch:{ all -> 0x00f7 }
            r8.mo12886a()     // Catch:{ all -> 0x00f7 }
            r12.m2940b()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.k r8 = r8.mo13074N()     // Catch:{ all -> 0x00f7 }
            r8.mo13153e()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.utils.n r8 = r8.mo13106ac()     // Catch:{ all -> 0x00f7 }
            r8.mo13339a()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            r9 = 1
            r8.mo13103a((boolean) r9)     // Catch:{ all -> 0x00f7 }
            r12.m2946l()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.network.e r8 = r8.mo13073M()     // Catch:{ all -> 0x00f7 }
            r8.mo13214a()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.sdk.AppLovinEventService r8 = r8.mo13133q()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.EventServiceImpl r8 = (com.applovin.impl.sdk.EventServiceImpl) r8     // Catch:{ all -> 0x00f7 }
            r8.maybeTrackAppOpenEvent()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.mediation.j r8 = r8.mo13063B()     // Catch:{ all -> 0x00f7 }
            r8.mo12487a()     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.mediation.a.a r8 = r8.mo13143z()     // Catch:{ all -> 0x00f7 }
            boolean r8 = r8.mo12148a()     // Catch:{ all -> 0x00f7 }
            if (r8 == 0) goto L_0x00bb
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x00f7 }
            com.applovin.impl.mediation.a.a r8 = r8.mo13143z()     // Catch:{ all -> 0x00f7 }
            r8.mo12149b()     // Catch:{ all -> 0x00f7 }
        L_0x00bb:
            com.applovin.impl.sdk.j r8 = r12.f3339a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r9 = com.applovin.impl.sdk.p025b.C1369c.f2902as
            java.lang.Object r8 = r8.mo13088a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00de
            com.applovin.impl.sdk.j r8 = r12.f3339a
            com.applovin.impl.sdk.b.c<java.lang.Long> r9 = com.applovin.impl.sdk.p025b.C1369c.f2903at
            java.lang.Object r8 = r8.mo13088a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.j r10 = r12.f3339a
            r10.mo13092a((long) r8)
        L_0x00de:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r5)
            r8.append(r4)
            com.applovin.impl.sdk.j r4 = r12.f3339a
            boolean r4 = r4.mo13120d()
            if (r4 == 0) goto L_0x013f
            goto L_0x0140
        L_0x00f7:
            r8 = move-exception
            java.lang.String r9 = "Unable to initialize SDK."
            r12.mo12945a(r9, r8)     // Catch:{ all -> 0x0159 }
            com.applovin.impl.sdk.j r8 = r12.f3339a     // Catch:{ all -> 0x0159 }
            r9 = 0
            r8.mo13103a((boolean) r9)     // Catch:{ all -> 0x0159 }
            com.applovin.impl.sdk.j r8 = r12.f3339a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r9 = com.applovin.impl.sdk.p025b.C1369c.f2902as
            java.lang.Object r8 = r8.mo13088a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0126
            com.applovin.impl.sdk.j r8 = r12.f3339a
            com.applovin.impl.sdk.b.c<java.lang.Long> r9 = com.applovin.impl.sdk.p025b.C1369c.f2903at
            java.lang.Object r8 = r8.mo13088a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.j r10 = r12.f3339a
            r10.mo13092a((long) r8)
        L_0x0126:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r5)
            r8.append(r4)
            com.applovin.impl.sdk.j r4 = r12.f3339a
            boolean r4 = r4.mo13120d()
            if (r4 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r2 = r3
        L_0x0140:
            r8.append(r2)
            r8.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r12.mo12944a(r0)
            return
        L_0x0159:
            r8 = move-exception
            com.applovin.impl.sdk.j r9 = r12.f3339a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r10 = com.applovin.impl.sdk.p025b.C1369c.f2902as
            java.lang.Object r9 = r9.mo13088a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x017d
            com.applovin.impl.sdk.j r9 = r12.f3339a
            com.applovin.impl.sdk.b.c<java.lang.Long> r10 = com.applovin.impl.sdk.p025b.C1369c.f2903at
            java.lang.Object r9 = r9.mo13088a(r10)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.applovin.impl.sdk.j r11 = r12.f3339a
            r11.mo13092a((long) r9)
        L_0x017d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r9.append(r5)
            r9.append(r4)
            com.applovin.impl.sdk.j r4 = r12.f3339a
            boolean r4 = r4.mo13120d()
            if (r4 == 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r2 = r3
        L_0x0197:
            r9.append(r2)
            r9.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r9.append(r1)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r12.mo12944a(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p027d.C1433r.run():void");
    }
}
