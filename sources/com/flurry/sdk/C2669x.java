package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.FlurryEventRecordStatus;
import com.google.android.instantapps.InstantApps;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.flurry.sdk.x */
public class C2669x implements C2534df {

    /* renamed from: f */
    private static final String f6287f = C2669x.class.getSimpleName();

    /* renamed from: a */
    public C2350as f6288a;

    /* renamed from: b */
    public C2410bk f6289b;

    /* renamed from: c */
    public C2364au f6290c;

    /* renamed from: d */
    public C2628et f6291d;

    /* renamed from: e */
    public boolean f6292e = false;

    /* renamed from: g */
    private final Object f6293g = new Object();

    /* renamed from: h */
    private Queue<C2668w> f6294h = new LinkedList();

    /* renamed from: i */
    private Queue<C2668w> f6295i = new LinkedList();

    /* renamed from: j */
    private Queue<C2667v> f6296j = new LinkedList();

    /* renamed from: k */
    private final C2510cv<C2597ec> f6297k = new C2510cv<C2597ec>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo17521a(C2509cu cuVar) {
            if (C26712.f6299a[((C2597ec) cuVar).f6085d - 1] == 1) {
                C2669x.m5820a(C2669x.this);
            }
        }
    };

    /* renamed from: a */
    public static synchronized C2669x m5819a() {
        C2669x xVar;
        Class<C2669x> cls = C2669x.class;
        synchronized (cls) {
            xVar = (C2669x) C2494ck.m5371a().mo17682a((Class<? extends C2534df>) cls);
        }
        return xVar;
    }

    public void init(Context context) {
        C2595eb.m5632a((Class<?>) C2426bo.class);
        this.f6289b = new C2410bk();
        this.f6288a = new C2350as();
        this.f6290c = new C2364au();
        this.f6291d = new C2628et();
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.FlurrySessionEvent", this.f6297k);
        if (!C2619em.m5700a(context, "android.permission.INTERNET")) {
            C2530db.m5482b(f6287f, "Application must declare permission: android.permission.INTERNET");
        }
        if (!C2619em.m5700a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            C2530db.m5490e(f6287f, "It is highly recommended that the application declare permission: android.permission.ACCESS_NETWORK_STATE");
        }
        int identifier = context.getResources().getIdentifier("FLURRY_IS_YAHOO_APP", "bool", context.getPackageName());
        if (identifier != 0) {
            this.f6292e = context.getResources().getBoolean(identifier);
            String str = f6287f;
            C2530db.m5486c(str, "Found FLURRY_IS_YAHOO_APP resource id. Value: " + this.f6292e);
        }
        C2529da a = C2529da.m5470a();
        try {
            Class.forName("com.google.android.instantapps.InstantApps");
            a.f5936b = InstantApps.isInstantApp(context);
            String str2 = C2529da.f5934a;
            C2530db.m5476a(str2, "isInstantApp: " + String.valueOf(a.f5936b));
        } catch (ClassNotFoundException unused) {
            C2530db.m5476a(C2529da.f5934a, "isInstantApps dependency is not added");
        }
    }

    public void destroy() {
        C2364au auVar = this.f6290c;
        if (auVar != null) {
            C2494ck.m5371a().mo17686c(auVar.f6007e);
            C2511cw.m5419a().mo17724b("com.flurry.android.sdk.NetworkStateEvent", auVar.f6008f);
            this.f6290c = null;
        }
        C2410bk bkVar = this.f6289b;
        if (bkVar != null) {
            C2611eg.m5674a().mo17822b("UseHttps", bkVar);
            C2611eg.m5674a().mo17822b("ReportUrl", bkVar);
            this.f6289b = null;
        }
        C2350as asVar = this.f6288a;
        if (asVar != null) {
            C2494ck.m5371a().mo17686c(asVar.f5397a);
            C2511cw.m5419a().mo17724b("com.flurry.android.sdk.NetworkStateEvent", asVar.f5400d);
            C2511cw.m5419a().mo17724b("com.flurry.android.sdk.IdProviderUpdatedAdvertisingId", asVar.f5399c);
            C2511cw.m5419a().mo17724b("com.flurry.android.sdk.IdProviderFinishedEvent", asVar.f5398b);
            C2377ay.m5093a();
            C2611eg.m5674a().mo17822b("ProtonEnabled", asVar);
            this.f6288a = null;
        }
        C2628et etVar = this.f6291d;
        if (etVar != null) {
            etVar.f6181a = null;
            this.f6291d = null;
        }
        C2511cw.m5419a().mo17724b("com.flurry.android.sdk.FlurrySessionEvent", this.f6297k);
        C2595eb.m5633b(C2426bo.class);
    }

    /* renamed from: b */
    public static C2426bo m5822b() {
        C2595eb f = C2599ed.m5642a().mo17813f();
        if (f == null) {
            return null;
        }
        return (C2426bo) f.mo17802c(C2426bo.class);
    }

    /* renamed from: a */
    public final FlurryEventRecordStatus mo17874a(String str, Map<String, String> map, int i) {
        return mo17876a(str, map, false, i);
    }

    /* renamed from: a */
    public final FlurryEventRecordStatus mo17875a(String str, Map<String, String> map, boolean z) {
        return mo17876a(str, map, z, 0);
    }

    /* renamed from: a */
    public final FlurryEventRecordStatus mo17876a(String str, Map<String, String> map, boolean z, int i) {
        C2668w wVar = new C2668w(str, map, z, i);
        synchronized (this.f6293g) {
            int i2 = C26712.f6300b[m5824c() - 1];
            if (i2 == 1) {
                String str2 = f6287f;
                C2530db.m5476a(str2, "There is no active Flurry session. Adding this event to deferred queue and flush them when the session initializes. Event: " + wVar.f6283a);
                this.f6294h.add(wVar);
                FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventLoggingDelayed;
                return flurryEventRecordStatus;
            } else if (i2 == 2) {
                String str3 = f6287f;
                C2530db.m5476a(str3, "Waiting for Flurry session to initialize before logging event: " + wVar.f6283a);
                this.f6294h.add(wVar);
                FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventLoggingDelayed;
                return flurryEventRecordStatus2;
            } else if (i2 != 3) {
                FlurryEventRecordStatus flurryEventRecordStatus3 = FlurryEventRecordStatus.kFlurryEventFailed;
                return flurryEventRecordStatus3;
            } else {
                FlurryEventRecordStatus b = m5821b(wVar);
                return b;
            }
        }
    }

    /* renamed from: com.flurry.sdk.x$2 */
    static /* synthetic */ class C26712 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6299a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6300b;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.flurry.sdk.C2595eb.C2596a.m5640a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6300b = r0
                r1 = 1
                int r2 = com.flurry.sdk.C2595eb.C2596a.f6079a     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f6300b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.flurry.sdk.C2595eb.C2596a.f6080b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f6300b     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.flurry.sdk.C2595eb.C2596a.f6081c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = com.flurry.sdk.C2597ec.C2598a.m5641a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6299a = r0
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6091e     // Catch:{ NoSuchFieldError -> 0x002d }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2669x.C26712.<clinit>():void");
        }
    }

    /* renamed from: b */
    private static FlurryEventRecordStatus m5821b(C2668w wVar) {
        C2426bo b = m5822b();
        return b != null ? b.mo17635a(wVar.f6283a, wVar.f6284b, wVar.f6285c, wVar.f6286d) : FlurryEventRecordStatus.kFlurryEventFailed;
    }

    /* renamed from: c */
    private synchronized int m5824c() {
        return C2599ed.m5642a().mo17812e();
    }

    /* renamed from: a */
    public final void mo17878a(C2668w wVar) {
        synchronized (this.f6293g) {
            int i = C26712.f6300b[m5824c() - 1];
            if (i == 1) {
                String str = f6287f;
                C2530db.m5476a(str, "There is no active Flurry session. Adding this timed event to deferred queue and flush them when the session initializes. Timed event: " + wVar.f6283a);
                this.f6295i.add(wVar);
            } else if (i == 2) {
                String str2 = f6287f;
                C2530db.m5476a(str2, "Waiting for Flurry session to initialize before ending timed event: " + wVar.f6283a);
                this.f6295i.add(wVar);
            } else if (i == 3) {
                m5825c(wVar);
            }
        }
    }

    /* renamed from: c */
    private static void m5825c(C2668w wVar) {
        C2426bo b = m5822b();
        if (b != null) {
            b.mo17640a(wVar.f6283a, wVar.f6284b);
        }
    }

    /* renamed from: a */
    public final void mo17879a(String str, String str2, Throwable th, Map<String, String> map) {
        C2628et etVar;
        boolean z = str != null && "uncaught".equals(str);
        C2667v vVar = new C2667v(str, str2, th.getClass().getName(), th, C2629eu.m5725a(z), map);
        if (z && (etVar = this.f6291d) != null) {
            List<C2627es> a = etVar.mo17829a();
            vVar.f6282g = a;
            String str3 = f6287f;
            C2530db.m5474a(4, str3, "Total breadcrumbs - " + a.size());
        }
        mo17877a(vVar);
    }

    /* renamed from: a */
    public final void mo17877a(C2667v vVar) {
        synchronized (this.f6293g) {
            int i = C26712.f6300b[m5824c() - 1];
            if (i == 1) {
                String str = f6287f;
                C2530db.m5476a(str, "There is no active Flurry session. Adding this logging error to deferred queue and flush them when the session initializes. Error: " + vVar.f6276a);
                this.f6296j.add(vVar);
            } else if (i == 2) {
                String str2 = f6287f;
                C2530db.m5476a(str2, "Waiting for Flurry session to initialize before logging error: " + vVar.f6276a);
                this.f6296j.add(vVar);
            } else if (i == 3) {
                m5823b(vVar);
            }
        }
    }

    /* renamed from: b */
    private static void m5823b(C2667v vVar) {
        C2426bo b = m5822b();
        if (b != null) {
            b.mo17639a(vVar);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5820a(C2669x xVar) {
        C2530db.m5476a(f6287f, "Flushing deferred events queues.");
        synchronized (xVar.f6293g) {
            while (xVar.f6294h.peek() != null) {
                m5821b(xVar.f6294h.poll());
            }
            while (xVar.f6296j.peek() != null) {
                m5823b(xVar.f6296j.poll());
            }
            while (xVar.f6295i.peek() != null) {
                m5825c(xVar.f6295i.poll());
            }
        }
    }
}
