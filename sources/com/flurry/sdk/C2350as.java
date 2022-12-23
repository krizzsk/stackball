package com.flurry.sdk;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.flurry.sdk.C2345aq;
import com.flurry.sdk.C2385az;
import com.flurry.sdk.C2612eh;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.as */
public class C2350as implements C2612eh.C2613a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f5396e = C2350as.class.getSimpleName();

    /* renamed from: a */
    public final Runnable f5397a = new C2621eo() {
        /* renamed from: a */
        public final void mo17573a() {
            C2350as.this.m5024e();
        }
    };

    /* renamed from: b */
    public final C2510cv<C2461bt> f5398b = new C2510cv<C2461bt>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2350as.this.m5024e();
        }
    };

    /* renamed from: c */
    public final C2510cv<C2462bu> f5399c = new C2510cv<C2462bu>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2350as.this.m5024e();
        }
    };

    /* renamed from: d */
    public final C2510cv<C2467bx> f5400d = new C2510cv<C2467bx>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo17521a(C2509cu cuVar) {
            if (((C2467bx) cuVar).f5758a) {
                C2350as.this.m5024e();
            }
        }
    };

    /* renamed from: f */
    private final C2535dg<C2333ae> f5401f = new C2535dg<>("proton config request", new C2403be());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2535dg<C2334af> f5402g = new C2535dg<>("proton config response", new C2405bf());

    /* renamed from: h */
    private final C2349ar f5403h = new C2349ar();

    /* renamed from: i */
    private final C2504cq<String, C2337ai> f5404i = new C2504cq<>();

    /* renamed from: j */
    private final List<C2385az> f5405j = new ArrayList();

    /* renamed from: k */
    private C2508ct<C2345aq> f5406k;

    /* renamed from: l */
    private C2508ct<List<C2385az>> f5407l;

    /* renamed from: m */
    private boolean f5408m;

    /* renamed from: n */
    private String f5409n;

    /* renamed from: o */
    private boolean f5410o = true;

    /* renamed from: p */
    private boolean f5411p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f5412q = TapjoyConstants.TIMER_INCREMENT;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f5413r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f5414s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C2334af f5415t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f5416u;

    public C2350as() {
        C2611eg a = C2611eg.m5674a();
        this.f5408m = ((Boolean) a.mo17819a("ProtonEnabled")).booleanValue();
        a.mo17820a("ProtonEnabled", (C2612eh.C2613a) this);
        String str = f5396e;
        C2530db.m5474a(4, str, "initSettings, protonEnabled = " + this.f5408m);
        this.f5409n = (String) a.mo17819a("ProtonConfigUrl");
        a.mo17820a("ProtonConfigUrl", (C2612eh.C2613a) this);
        String str2 = f5396e;
        C2530db.m5474a(4, str2, "initSettings, protonConfigUrl = " + this.f5409n);
        this.f5410o = ((Boolean) a.mo17819a("analyticsEnabled")).booleanValue();
        a.mo17820a("analyticsEnabled", (C2612eh.C2613a) this);
        String str3 = f5396e;
        C2530db.m5474a(4, str3, "initSettings, AnalyticsEnabled = " + this.f5410o);
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.IdProviderFinishedEvent", this.f5398b);
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.IdProviderUpdatedAdvertisingId", this.f5399c);
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.NetworkStateEvent", this.f5400d);
        Context context = C2494ck.m5371a().f5832a;
        this.f5406k = new C2508ct<>(context.getFileStreamPath(".yflurryprotonconfig." + Long.toString(C2619em.m5709g(C2494ck.m5371a().f5833b), 16)), ".yflurryprotonconfig.", 1, new C2592dz<C2345aq>() {
            /* renamed from: a */
            public final C2587dw<C2345aq> mo17575a(int i) {
                return new C2345aq.C2346a();
            }
        });
        this.f5407l = new C2508ct<>(context.getFileStreamPath(".yflurryprotonreport." + Long.toString(C2619em.m5709g(C2494ck.m5371a().f5833b), 16)), ".yflurryprotonreport.", 1, new C2592dz<List<C2385az>>() {
            /* renamed from: a */
            public final C2587dw<List<C2385az>> mo17575a(int i) {
                return new C2584dv(new C2385az.C2386a());
            }
        });
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2350as.this.m5037l();
            }
        });
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2350as.this.m5038m();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17569a(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -1720015653(0xffffffff997aa4db, float:-1.2957989E-23)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 640941243(0x2633fcbb, float:6.2445614E-16)
            if (r0 == r1) goto L_0x0020
            r1 = 1591403975(0x5edae5c7, float:7.886616E18)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "ProtonConfigUrl"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "ProtonEnabled"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "analyticsEnabled"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            r0 = 4
            if (r5 == 0) goto L_0x007d
            if (r5 == r3) goto L_0x0063
            if (r5 == r2) goto L_0x0045
            r5 = 6
            java.lang.String r6 = f5396e
            java.lang.String r0 = "onSettingUpdate internal error!"
            com.flurry.sdk.C2530db.m5474a((int) r5, (java.lang.String) r6, (java.lang.String) r0)
            return
        L_0x0045:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r4.f5410o = r5
            java.lang.String r5 = f5396e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "onSettingUpdate, AnalyticsEnabled = "
            r6.<init>(r1)
            boolean r1 = r4.f5410o
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r5, (java.lang.String) r6)
            return
        L_0x0063:
            java.lang.String r6 = (java.lang.String) r6
            r4.f5409n = r6
            java.lang.String r5 = f5396e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "onSettingUpdate, protonConfigUrl = "
            r6.<init>(r1)
            java.lang.String r1 = r4.f5409n
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r5, (java.lang.String) r6)
            return
        L_0x007d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r4.f5408m = r5
            java.lang.String r5 = f5396e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "onSettingUpdate, protonEnabled = "
            r6.<init>(r1)
            boolean r1 = r4.f5408m
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r5, (java.lang.String) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2350as.mo17569a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final synchronized void mo17567a() {
        if (this.f5408m) {
            C2619em.m5697a();
            C2449bq.m5261a();
            C2364au.f5440a = C2449bq.m5266d();
            this.f5416u = false;
            m5024e();
        }
    }

    /* renamed from: b */
    public final synchronized void mo17571b() {
        if (this.f5408m) {
            C2619em.m5697a();
            C2449bq.m5261a();
            m5016b(C2449bq.m5266d());
            m5031i();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17568a(long j) {
        if (this.f5408m) {
            C2619em.m5697a();
            m5016b(j);
            m5018b("flurry.session_end", (Map<String, String>) null);
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2350as.this.m5036k();
                }
            });
        }
    }

    /* renamed from: c */
    public final synchronized void mo17572c() {
        if (this.f5408m) {
            C2619em.m5697a();
            m5031i();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17570a(String str, Map<String, String> map) {
        if (this.f5408m) {
            C2619em.m5697a();
            m5018b(str, map);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [byte[], RequestObjectType] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5024e() {
        /*
            r15 = this;
            monitor-enter(r15)
            boolean r0 = r15.f5408m     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r15)
            return
        L_0x0007:
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ all -> 0x00f8 }
            boolean r0 = r15.f5411p     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r15)
            return
        L_0x0010:
            com.flurry.sdk.bs r0 = com.flurry.sdk.C2451bs.m5276a()     // Catch:{ all -> 0x00f8 }
            boolean r0 = r0.mo17649c()     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x001c
            monitor-exit(r15)
            return
        L_0x001c:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.bs r2 = com.flurry.sdk.C2451bs.m5276a()     // Catch:{ all -> 0x00f8 }
            boolean r2 = r2.mo17652f()     // Catch:{ all -> 0x00f8 }
            r3 = 1
            if (r2 != 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            com.flurry.sdk.af r4 = r15.f5415t     // Catch:{ all -> 0x00f8 }
            r5 = 3
            if (r4 == 0) goto L_0x008b
            boolean r4 = r15.f5414s     // Catch:{ all -> 0x00f8 }
            r6 = 0
            if (r4 == r2) goto L_0x0042
            java.lang.String r3 = f5396e     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "Limit ad tracking value has changed, purging"
            com.flurry.sdk.C2530db.m5474a((int) r5, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00f8 }
            r15.f5415t = r6     // Catch:{ all -> 0x00f8 }
            goto L_0x008b
        L_0x0042:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f8 }
            long r9 = r15.f5413r     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.af r4 = r15.f5415t     // Catch:{ all -> 0x00f8 }
            long r11 = r4.f5361b     // Catch:{ all -> 0x00f8 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            long r9 = r9 + r11
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0069
            java.lang.String r0 = f5396e     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "Cached Proton config valid, no need to refresh"
            com.flurry.sdk.C2530db.m5474a((int) r5, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00f8 }
            boolean r0 = r15.f5416u     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x0067
            r15.f5416u = r3     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "flurry.session_start"
            r15.m5018b((java.lang.String) r0, (java.util.Map<java.lang.String, java.lang.String>) r6)     // Catch:{ all -> 0x00f8 }
        L_0x0067:
            monitor-exit(r15)
            return
        L_0x0069:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f8 }
            long r7 = r15.f5413r     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.af r9 = r15.f5415t     // Catch:{ all -> 0x00f8 }
            long r9 = r9.f5362c     // Catch:{ all -> 0x00f8 }
            java.lang.Long.signum(r9)
            long r9 = r9 * r13
            long r7 = r7 + r9
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x008b
            java.lang.String r3 = f5396e     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "Cached Proton config expired, purging"
            com.flurry.sdk.C2530db.m5474a((int) r5, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00f8 }
            r15.f5415t = r6     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.cq<java.lang.String, com.flurry.sdk.ai> r3 = r15.f5404i     // Catch:{ all -> 0x00f8 }
            r3.mo17703a()     // Catch:{ all -> 0x00f8 }
        L_0x008b:
            com.flurry.sdk.cg r3 = com.flurry.sdk.C2485cg.m5355a()     // Catch:{ all -> 0x00f8 }
            r3.mo17727a((java.lang.Object) r15)     // Catch:{ all -> 0x00f8 }
            java.lang.String r3 = f5396e     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "Requesting proton config"
            com.flurry.sdk.C2530db.m5474a((int) r5, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00f8 }
            byte[] r3 = r15.m5026f()     // Catch:{ all -> 0x00f8 }
            if (r3 != 0) goto L_0x00a1
            monitor-exit(r15)
            return
        L_0x00a1:
            com.flurry.sdk.di r4 = new com.flurry.sdk.di     // Catch:{ all -> 0x00f8 }
            r4.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = r15.f5409n     // Catch:{ all -> 0x00f8 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f8 }
            if (r5 == 0) goto L_0x00b1
            java.lang.String r5 = "https://proton.flurry.com/sdk/v1/config"
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r5 = r15.f5409n     // Catch:{ all -> 0x00f8 }
        L_0x00b3:
            r4.f5970g = r5     // Catch:{ all -> 0x00f8 }
            r5 = 5000(0x1388, float:7.006E-42)
            r4.f6169u = r5     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.dk$a r5 = com.flurry.sdk.C2542dk.C2545a.kPost     // Catch:{ all -> 0x00f8 }
            r4.f5971h = r5     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = "application/x-flurry;version=2"
            java.lang.String r6 = "application/x-flurry;version=2"
            int r7 = com.flurry.sdk.C2535dg.m5499a(r3)     // Catch:{ all -> 0x00f8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00f8 }
            java.lang.String r8 = "Content-Type"
            r4.mo17759a(r8, r5)     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = "Accept"
            r4.mo17759a(r5, r6)     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = "FM-Checksum"
            r4.mo17759a(r5, r7)     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.ds r5 = new com.flurry.sdk.ds     // Catch:{ all -> 0x00f8 }
            r5.<init>()     // Catch:{ all -> 0x00f8 }
            r4.f5955c = r5     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.ds r5 = new com.flurry.sdk.ds     // Catch:{ all -> 0x00f8 }
            r5.<init>()     // Catch:{ all -> 0x00f8 }
            r4.f5956d = r5     // Catch:{ all -> 0x00f8 }
            r4.f5954b = r3     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.as$2 r3 = new com.flurry.sdk.as$2     // Catch:{ all -> 0x00f8 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x00f8 }
            r4.f5953a = r3     // Catch:{ all -> 0x00f8 }
            com.flurry.sdk.cg r0 = com.flurry.sdk.C2485cg.m5355a()     // Catch:{ all -> 0x00f8 }
            r0.mo17728a((java.lang.Object) r15, r4)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r15)
            return
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2350as.m5024e():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0106  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5018b(java.lang.String r34, java.util.Map<java.lang.String, java.lang.String> r35) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            r2 = r35
            monitor-enter(r33)
            java.lang.String r3 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r4 = "Event triggered: "
            java.lang.String r5 = java.lang.String.valueOf(r34)     // Catch:{ all -> 0x021d }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x021d }
            r11 = 3
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x021d }
            boolean r3 = r1.f5410o     // Catch:{ all -> 0x021d }
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r2 = "Analytics and pulse have been disabled."
            com.flurry.sdk.C2530db.m5490e(r0, r2)     // Catch:{ all -> 0x021d }
            monitor-exit(r33)
            return
        L_0x0024:
            com.flurry.sdk.af r3 = r1.f5415t     // Catch:{ all -> 0x021d }
            if (r3 != 0) goto L_0x0031
            java.lang.String r0 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r2 = "Config response is empty. No events to fire."
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x021d }
            monitor-exit(r33)
            return
        L_0x0031:
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ all -> 0x021d }
            boolean r3 = android.text.TextUtils.isEmpty(r34)     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x003c
            monitor-exit(r33)
            return
        L_0x003c:
            com.flurry.sdk.cq<java.lang.String, com.flurry.sdk.ai> r3 = r1.f5404i     // Catch:{ all -> 0x021d }
            java.util.List r3 = r3.mo17701a(r0)     // Catch:{ all -> 0x021d }
            if (r3 != 0) goto L_0x004d
            java.lang.String r0 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r2 = "No events to fire. Returning."
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x021d }
            monitor-exit(r33)
            return
        L_0x004d:
            int r4 = r3.size()     // Catch:{ all -> 0x021d }
            if (r4 != 0) goto L_0x005c
            java.lang.String r0 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r2 = "No events to fire. Returning."
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x021d }
            monitor-exit(r33)
            return
        L_0x005c:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x021d }
            r7 = 1
            if (r2 == 0) goto L_0x0065
            r8 = 1
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            r9 = -1
            int r10 = r34.hashCode()     // Catch:{ all -> 0x021d }
            r12 = 645204782(0x26750b2e, float:8.50166E-16)
            r13 = 2
            if (r10 == r12) goto L_0x0090
            r12 = 1371447545(0x51bea0f9, float:1.02343057E11)
            if (r10 == r12) goto L_0x0086
            r12 = 1579613685(0x5e26fdf5, float:3.00826079E18)
            if (r10 == r12) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            java.lang.String r10 = "flurry.session_start"
            boolean r10 = r0.equals(r10)     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0099
            r9 = 0
            goto L_0x0099
        L_0x0086:
            java.lang.String r10 = "flurry.app_install"
            boolean r10 = r0.equals(r10)     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0099
            r9 = 2
            goto L_0x0099
        L_0x0090:
            java.lang.String r10 = "flurry.session_end"
            boolean r10 = r0.equals(r10)     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0099
            r9 = 1
        L_0x0099:
            if (r9 == 0) goto L_0x00a8
            if (r9 == r7) goto L_0x00a5
            if (r9 == r13) goto L_0x00a2
            com.flurry.sdk.bd r9 = com.flurry.sdk.C2402bd.APPLICATION_EVENT     // Catch:{ all -> 0x021d }
            goto L_0x00aa
        L_0x00a2:
            com.flurry.sdk.bd r9 = com.flurry.sdk.C2402bd.INSTALL     // Catch:{ all -> 0x021d }
            goto L_0x00aa
        L_0x00a5:
            com.flurry.sdk.bd r9 = com.flurry.sdk.C2402bd.SESSION_END     // Catch:{ all -> 0x021d }
            goto L_0x00aa
        L_0x00a8:
            com.flurry.sdk.bd r9 = com.flurry.sdk.C2402bd.SESSION_START     // Catch:{ all -> 0x021d }
        L_0x00aa:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x021d }
            r10.<init>()     // Catch:{ all -> 0x021d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021d }
        L_0x00b3:
            boolean r12 = r3.hasNext()     // Catch:{ all -> 0x021d }
            if (r12 == 0) goto L_0x01c7
            java.lang.Object r12 = r3.next()     // Catch:{ all -> 0x021d }
            com.flurry.sdk.ai r12 = (com.flurry.sdk.C2337ai) r12     // Catch:{ all -> 0x021d }
            boolean r13 = r12 instanceof com.flurry.sdk.C2338aj     // Catch:{ all -> 0x021d }
            if (r13 == 0) goto L_0x012b
            java.lang.String r13 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r14 = "Event contains triggers."
            r15 = 4
            com.flurry.sdk.C2530db.m5474a((int) r15, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x021d }
            r13 = r12
            com.flurry.sdk.aj r13 = (com.flurry.sdk.C2338aj) r13     // Catch:{ all -> 0x021d }
            java.lang.String[] r13 = r13.f5372d     // Catch:{ all -> 0x021d }
            if (r13 != 0) goto L_0x00db
            java.lang.String r14 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r6 = "Template does not contain trigger values. Firing."
            com.flurry.sdk.C2530db.m5474a((int) r15, (java.lang.String) r14, (java.lang.String) r6)     // Catch:{ all -> 0x021d }
        L_0x00d9:
            r6 = 1
            goto L_0x00f1
        L_0x00db:
            int r6 = r13.length     // Catch:{ all -> 0x021d }
            if (r6 != 0) goto L_0x00e6
            java.lang.String r6 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r14 = "Template does not contain trigger values. Firing."
            com.flurry.sdk.C2530db.m5474a((int) r15, (java.lang.String) r6, (java.lang.String) r14)     // Catch:{ all -> 0x021d }
            goto L_0x00d9
        L_0x00e6:
            if (r2 != 0) goto L_0x00f0
            java.lang.String r6 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r12 = "Publisher has not passed in params list. Not firing."
            com.flurry.sdk.C2530db.m5474a((int) r15, (java.lang.String) r6, (java.lang.String) r12)     // Catch:{ all -> 0x021d }
            goto L_0x00b3
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            r14 = r12
            com.flurry.sdk.aj r14 = (com.flurry.sdk.C2338aj) r14     // Catch:{ all -> 0x021d }
            java.lang.String r14 = r14.f5371c     // Catch:{ all -> 0x021d }
            java.lang.Object r14 = r2.get(r14)     // Catch:{ all -> 0x021d }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x021d }
            if (r14 != 0) goto L_0x0106
            java.lang.String r6 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r12 = "Publisher params has no value associated with proton key. Not firing."
            com.flurry.sdk.C2530db.m5474a((int) r15, (java.lang.String) r6, (java.lang.String) r12)     // Catch:{ all -> 0x021d }
            goto L_0x00b3
        L_0x0106:
            int r7 = r13.length     // Catch:{ all -> 0x021d }
            r11 = 0
        L_0x0108:
            if (r11 >= r7) goto L_0x0118
            r15 = r13[r11]     // Catch:{ all -> 0x021d }
            boolean r15 = r15.equals(r14)     // Catch:{ all -> 0x021d }
            if (r15 == 0) goto L_0x0114
            r6 = 1
            goto L_0x0118
        L_0x0114:
            int r11 = r11 + 1
            r15 = 4
            goto L_0x0108
        L_0x0118:
            if (r6 != 0) goto L_0x0123
            java.lang.String r6 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r7 = "Publisher params list does not match proton param values. Not firing."
            r11 = 4
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x021d }
            goto L_0x0137
        L_0x0123:
            java.lang.String r6 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r7 = "Publisher params match proton values. Firing."
            r11 = 4
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x021d }
        L_0x012b:
            com.flurry.sdk.ac r6 = r12.f5370b     // Catch:{ all -> 0x021d }
            if (r6 != 0) goto L_0x013b
            java.lang.String r6 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r7 = "Template is empty. Not firing current event."
            r11 = 3
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x021d }
        L_0x0137:
            r7 = 1
            r11 = 3
            goto L_0x00b3
        L_0x013b:
            java.lang.String r7 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x021d }
            java.lang.String r12 = "Creating callback report for partner: "
            r11.<init>(r12)     // Catch:{ all -> 0x021d }
            java.lang.String r12 = r6.f5335b     // Catch:{ all -> 0x021d }
            r11.append(r12)     // Catch:{ all -> 0x021d }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x021d }
            r12 = 3
            com.flurry.sdk.C2530db.m5474a((int) r12, (java.lang.String) r7, (java.lang.String) r11)     // Catch:{ all -> 0x021d }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x021d }
            r7.<init>()     // Catch:{ all -> 0x021d }
            java.lang.String r11 = "event_name"
            r7.put(r11, r0)     // Catch:{ all -> 0x021d }
            java.lang.String r11 = "event_time_millis"
            java.lang.String r12 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x021d }
            r7.put(r11, r12)     // Catch:{ all -> 0x021d }
            com.flurry.sdk.ar r11 = r1.f5403h     // Catch:{ all -> 0x021d }
            java.lang.String r12 = r6.f5338e     // Catch:{ all -> 0x021d }
            java.lang.String r20 = r11.mo17566a(r12, r7)     // Catch:{ all -> 0x021d }
            r11 = 0
            java.lang.String r12 = r6.f5339f     // Catch:{ all -> 0x021d }
            if (r12 == 0) goto L_0x017c
            com.flurry.sdk.ar r11 = r1.f5403h     // Catch:{ all -> 0x021d }
            java.lang.String r12 = r6.f5339f     // Catch:{ all -> 0x021d }
            java.lang.String r7 = r11.mo17566a(r12, r7)     // Catch:{ all -> 0x021d }
            r29 = r7
            goto L_0x017e
        L_0x017c:
            r29 = r11
        L_0x017e:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x021d }
            r13 = 259200000(0xf731400, double:1.280618154E-315)
            long r21 = r11 + r13
            com.flurry.sdk.av r7 = new com.flurry.sdk.av     // Catch:{ all -> 0x021d }
            java.lang.String r11 = r6.f5335b     // Catch:{ all -> 0x021d }
            long r12 = r6.f5334a     // Catch:{ all -> 0x021d }
            com.flurry.sdk.af r14 = r1.f5415t     // Catch:{ all -> 0x021d }
            com.flurry.sdk.ad r14 = r14.f5364e     // Catch:{ all -> 0x021d }
            int r14 = r14.f5345b     // Catch:{ all -> 0x021d }
            int r15 = r6.f5340g     // Catch:{ all -> 0x021d }
            com.flurry.sdk.bc r2 = r6.f5337d     // Catch:{ all -> 0x021d }
            r30 = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f5343j     // Catch:{ all -> 0x021d }
            r31 = r4
            int r4 = r6.f5342i     // Catch:{ all -> 0x021d }
            int r5 = r6.f5341h     // Catch:{ all -> 0x021d }
            r16 = r7
            r17 = r11
            r18 = r12
            r23 = r14
            r24 = r15
            r25 = r2
            r26 = r3
            r27 = r4
            r28 = r5
            r16.<init>(r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x021d }
            long r2 = r6.f5334a     // Catch:{ all -> 0x021d }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x021d }
            r10.put(r2, r7)     // Catch:{ all -> 0x021d }
            r2 = r35
            r3 = r30
            r4 = r31
            goto L_0x0137
        L_0x01c7:
            int r2 = r10.size()     // Catch:{ all -> 0x021d }
            if (r2 == 0) goto L_0x021b
            com.flurry.sdk.az r11 = new com.flurry.sdk.az     // Catch:{ all -> 0x021d }
            com.flurry.sdk.C2449bq.m5261a()     // Catch:{ all -> 0x021d }
            long r5 = com.flurry.sdk.C2449bq.m5266d()     // Catch:{ all -> 0x021d }
            com.flurry.sdk.C2449bq.m5261a()     // Catch:{ all -> 0x021d }
            long r12 = com.flurry.sdk.C2449bq.m5269g()     // Catch:{ all -> 0x021d }
            r2 = r11
            r3 = r34
            r4 = r8
            r7 = r12
            r2.<init>(r3, r4, r5, r7, r9, r10)     // Catch:{ all -> 0x021d }
            java.lang.String r2 = "flurry.session_end"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x021d }
            if (r2 == 0) goto L_0x0204
            java.lang.String r2 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "Storing Pulse callbacks for event: "
            java.lang.String r0 = java.lang.String.valueOf(r34)     // Catch:{ all -> 0x021d }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x021d }
            r3 = 3
            com.flurry.sdk.C2530db.m5474a((int) r3, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x021d }
            java.util.List<com.flurry.sdk.az> r0 = r1.f5405j     // Catch:{ all -> 0x021d }
            r0.add(r11)     // Catch:{ all -> 0x021d }
            monitor-exit(r33)
            return
        L_0x0204:
            java.lang.String r2 = f5396e     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "Firing Pulse callbacks for event: "
            java.lang.String r0 = java.lang.String.valueOf(r34)     // Catch:{ all -> 0x021d }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x021d }
            r3 = 3
            com.flurry.sdk.C2530db.m5474a((int) r3, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x021d }
            com.flurry.sdk.ay r0 = com.flurry.sdk.C2377ay.m5100d()     // Catch:{ all -> 0x021d }
            r0.mo17589a((com.flurry.sdk.C2385az) r11)     // Catch:{ all -> 0x021d }
        L_0x021b:
            monitor-exit(r33)
            return
        L_0x021d:
            r0 = move-exception
            monitor-exit(r33)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2350as.m5018b(java.lang.String, java.util.Map):void");
    }

    /* renamed from: f */
    private byte[] m5026f() {
        try {
            C2333ae aeVar = new C2333ae();
            aeVar.f5349a = C2494ck.m5371a().f5833b;
            aeVar.f5350b = C2615ej.m5682a(C2494ck.m5371a().f5832a);
            aeVar.f5351c = C2615ej.m5683b(C2494ck.m5371a().f5832a);
            aeVar.f5352d = C2495cl.m5382b();
            aeVar.f5353e = 3;
            C2476cb.m5335a();
            aeVar.f5354f = C2476cb.m5339c();
            aeVar.f5355g = !C2451bs.m5276a().mo17652f();
            aeVar.f5356h = new C2336ah();
            aeVar.f5356h.f5368a = new C2330ab();
            aeVar.f5356h.f5368a.f5328a = Build.MODEL;
            aeVar.f5356h.f5368a.f5329b = Build.BRAND;
            aeVar.f5356h.f5368a.f5330c = Build.ID;
            aeVar.f5356h.f5368a.f5331d = Build.DEVICE;
            aeVar.f5356h.f5368a.f5332e = Build.PRODUCT;
            aeVar.f5356h.f5368a.f5333f = Build.VERSION.RELEASE;
            aeVar.f5357i = new ArrayList();
            for (Map.Entry next : Collections.unmodifiableMap(C2451bs.m5276a().f5716a).entrySet()) {
                C2335ag agVar = new C2335ag();
                agVar.f5366a = ((C2475ca) next.getKey()).f5789d;
                if (((C2475ca) next.getKey()).f5790e) {
                    agVar.f5367b = new String((byte[]) next.getValue());
                } else {
                    agVar.f5367b = C2619em.m5704b((byte[]) next.getValue());
                }
                aeVar.f5357i.add(agVar);
            }
            Location g = C2464bw.m5304a().mo17656g();
            if (g != null) {
                int d = C2464bw.m5311d();
                aeVar.f5358j = new C2340al();
                aeVar.f5358j.f5376a = new C2339ak();
                aeVar.f5358j.f5376a.f5373a = C2619em.m5693a(g.getLatitude(), d);
                aeVar.f5358j.f5376a.f5374b = C2619em.m5693a(g.getLongitude(), d);
                aeVar.f5358j.f5376a.f5375c = (float) C2619em.m5693a((double) g.getAccuracy(), d);
            }
            String str = (String) C2611eg.m5674a().mo17819a("UserId");
            if (!str.equals("")) {
                aeVar.f5359k = new C2343ao();
                aeVar.f5359k.f5387a = str;
            }
            C2535dg<C2333ae> dgVar = this.f5401f;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dgVar.f5951c.mo17563a(byteArrayOutputStream, aeVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str2 = C2535dg.f5948a;
            C2530db.m5474a(3, str2, "Encoding " + dgVar.f5950b + ": " + new String(byteArray));
            C2583du duVar = new C2583du(new C2581ds());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            duVar.mo17563a(byteArrayOutputStream2, byteArray);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            C2535dg.m5500b(byteArray2);
            return byteArray2;
        } catch (Exception e) {
            C2530db.m5474a(5, f5396e, "Proton config request failed with exception: ".concat(String.valueOf(e)));
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5009a(long j, boolean z, byte[] bArr) {
        if (bArr != null) {
            C2530db.m5474a(4, f5396e, "Saving proton config response");
            C2345aq aqVar = new C2345aq();
            aqVar.f5390a = j;
            aqVar.f5391b = z;
            aqVar.f5392c = bArr;
            this.f5406k.mo17717a(aqVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5019b(com.flurry.sdk.C2334af r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.flurry.sdk.ad r1 = r12.f5364e
            r2 = 3
            r3 = 1
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x0085
            java.util.List<com.flurry.sdk.ac> r5 = r1.f5344a
            if (r5 == 0) goto L_0x0085
            r5 = 0
        L_0x0011:
            java.util.List<com.flurry.sdk.ac> r6 = r1.f5344a
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0085
            java.util.List<com.flurry.sdk.ac> r6 = r1.f5344a
            java.lang.Object r6 = r6.get(r5)
            com.flurry.sdk.ac r6 = (com.flurry.sdk.C2331ac) r6
            if (r6 == 0) goto L_0x0082
            java.lang.String r7 = r6.f5335b
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0079
            long r7 = r6.f5334a
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0079
            java.lang.String r7 = r6.f5338e
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0079
            java.util.List<com.flurry.sdk.ai> r6 = r6.f5336c
            if (r6 == 0) goto L_0x0076
            java.util.Iterator r6 = r6.iterator()
        L_0x0043:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r6.next()
            com.flurry.sdk.ai r7 = (com.flurry.sdk.C2337ai) r7
            java.lang.String r8 = r7.f5369a
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0060
            java.lang.String r6 = f5396e
            java.lang.String r7 = "An event is missing a name"
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r6, (java.lang.String) r7)
        L_0x005e:
            r6 = 0
            goto L_0x0077
        L_0x0060:
            boolean r8 = r7 instanceof com.flurry.sdk.C2338aj
            if (r8 == 0) goto L_0x0043
            com.flurry.sdk.aj r7 = (com.flurry.sdk.C2338aj) r7
            java.lang.String r7 = r7.f5371c
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0043
            java.lang.String r6 = f5396e
            java.lang.String r7 = "An event trigger is missing a param name"
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r6, (java.lang.String) r7)
            goto L_0x005e
        L_0x0076:
            r6 = 1
        L_0x0077:
            if (r6 != 0) goto L_0x0082
        L_0x0079:
            java.lang.String r1 = f5396e
            java.lang.String r5 = "A callback template is missing required values"
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r1, (java.lang.String) r5)
            r1 = 0
            goto L_0x0086
        L_0x0082:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0085:
            r1 = 1
        L_0x0086:
            if (r1 == 0) goto L_0x009e
            com.flurry.sdk.ad r1 = r12.f5364e
            if (r1 == 0) goto L_0x009d
            com.flurry.sdk.ad r1 = r12.f5364e
            java.lang.String r1 = r1.f5348e
            if (r1 == 0) goto L_0x009d
            com.flurry.sdk.ad r12 = r12.f5364e
            java.lang.String r12 = r12.f5348e
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            return r3
        L_0x009e:
            java.lang.String r12 = f5396e
            java.lang.String r1 = "Config response is missing required values."
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r12, (java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2350as.m5019b(com.flurry.sdk.af):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m5027g() {
        List<C2331ac> list;
        List<C2337ai> list2;
        if (this.f5415t != null) {
            C2530db.m5474a(5, f5396e, "Processing config response");
            C2377ay.m5094a(this.f5415t.f5364e.f5346c);
            C2377ay.m5096b(this.f5415t.f5364e.f5347d * 1000);
            C2394ba a = C2394ba.m5156a();
            String str = this.f5415t.f5364e.f5348e;
            if (str != null && !str.endsWith(".do")) {
                C2530db.m5474a(5, C2394ba.f5528a, "overriding analytics agent report URL without an endpoint, are you sure?");
            }
            a.f5530b = str;
            if (this.f5408m) {
                C2611eg.m5674a().mo17821a("analyticsEnabled", (Object) Boolean.valueOf(this.f5415t.f5365f.f5389b));
            }
            this.f5404i.mo17703a();
            C2332ad adVar = this.f5415t.f5364e;
            if (adVar != null && (list = adVar.f5344a) != null) {
                for (C2331ac next : list) {
                    if (!(next == null || (list2 = next.f5336c) == null)) {
                        for (C2337ai next2 : list2) {
                            if (next2 != null && !TextUtils.isEmpty(next2.f5369a)) {
                                next2.f5370b = next;
                                this.f5404i.mo17704a(next2.f5369a, next2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5029h() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f5408m     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ all -> 0x0034 }
            com.flurry.sdk.ck r0 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ all -> 0x0034 }
            android.content.Context r0 = r0.f5832a     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "FLURRY_SHARED_PREFERENCES"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "com.flurry.android.flurryAppInstall"
            r3 = 1
            boolean r1 = r0.getBoolean(r1, r3)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "flurry.app_install"
            r3 = 0
            r4.m5018b((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "com.flurry.android.flurryAppInstall"
            r0.putBoolean(r1, r2)     // Catch:{ all -> 0x0034 }
            r0.apply()     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r4)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2350as.m5029h():void");
    }

    /* renamed from: b */
    private synchronized void m5016b(long j) {
        Iterator<C2385az> it = this.f5405j.iterator();
        while (it.hasNext()) {
            if (j == it.next().f5503a) {
                it.remove();
            }
        }
    }

    /* renamed from: i */
    private synchronized void m5031i() {
        if (!this.f5410o) {
            C2530db.m5490e(f5396e, "Analytics disabled, not sending pulse reports.");
            return;
        }
        String str = f5396e;
        C2530db.m5474a(4, str, "Sending " + this.f5405j.size() + " queued reports.");
        for (C2385az next : this.f5405j) {
            String str2 = f5396e;
            C2530db.m5474a(3, str2, "Firing Pulse callbacks for event: " + next.f5506d);
            C2377ay.m5100d().mo17589a(next);
        }
        m5034j();
    }

    /* renamed from: j */
    private synchronized void m5034j() {
        this.f5405j.clear();
        this.f5407l.mo17718b();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public synchronized void m5036k() {
        C2530db.m5474a(4, f5396e, "Saving queued report data.");
        this.f5407l.mo17717a(this.f5405j);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public synchronized void m5037l() {
        C2334af afVar;
        C2345aq a = this.f5406k.mo17716a();
        if (a != null) {
            C2334af afVar2 = null;
            try {
                afVar = this.f5402g.mo17750c(a.f5392c);
            } catch (Exception e) {
                C2530db.m5474a(5, f5396e, "Failed to decode saved proton config response: ".concat(String.valueOf(e)));
                this.f5406k.mo17718b();
                afVar = null;
            }
            if (m5019b(afVar)) {
                afVar2 = afVar;
            }
            if (afVar2 != null) {
                C2530db.m5474a(4, f5396e, "Loaded saved proton config response");
                this.f5412q = TapjoyConstants.TIMER_INCREMENT;
                this.f5413r = a.f5390a;
                this.f5414s = a.f5391b;
                this.f5415t = afVar2;
                m5027g();
            }
        }
        this.f5411p = true;
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2350as.this.m5024e();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public synchronized void m5038m() {
        C2530db.m5474a(4, f5396e, "Loading queued report data.");
        List a = this.f5407l.mo17716a();
        if (a != null) {
            this.f5405j.addAll(a);
        }
    }
}
