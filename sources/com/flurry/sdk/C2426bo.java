package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.sdk.C2414bl;
import com.flurry.sdk.C2468by;
import com.flurry.sdk.C2612eh;
import com.flurry.sdk.C2622ep;
import com.google.common.net.HttpHeaders;
import com.tapjoy.TJAdUnitConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.bo */
public class C2426bo implements C2612eh.C2613a {

    /* renamed from: a */
    static final String f5636a = C2426bo.class.getSimpleName();

    /* renamed from: b */
    static int f5637b = TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;

    /* renamed from: c */
    static int f5638c = 10;

    /* renamed from: d */
    static int f5639d = 1000;

    /* renamed from: e */
    static int f5640e = 160000;

    /* renamed from: f */
    static int f5641f = 50;

    /* renamed from: A */
    private final C2672y f5642A = new C2672y();

    /* renamed from: B */
    private long f5643B;

    /* renamed from: C */
    private String f5644C;

    /* renamed from: D */
    private String f5645D;

    /* renamed from: E */
    private int f5646E = -1;

    /* renamed from: F */
    private boolean f5647F = true;

    /* renamed from: G */
    private int f5648G = 0;

    /* renamed from: H */
    private int f5649H = 0;

    /* renamed from: I */
    private int f5650I = 0;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C2510cv<C2597ec> f5651J = new C2510cv<C2597ec>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2597ec ecVar = (C2597ec) cuVar;
            if (C2426bo.this.f5652g == null || ecVar.f6084b == C2426bo.this.f5652g.get()) {
                int i = C24459.f5707a[ecVar.f6085d - 1];
                if (i == 1) {
                    C2426bo boVar = C2426bo.this;
                    C2595eb ebVar = ecVar.f6084b;
                    Context context = (Context) ecVar.f6083a.get();
                    boVar.f5652g = new WeakReference<>(ebVar);
                    C2611eg a = C2611eg.m5674a();
                    boVar.f5656k = ((Boolean) a.mo17819a("LogEvents")).booleanValue();
                    a.mo17820a("LogEvents", (C2612eh.C2613a) boVar);
                    String str = C2426bo.f5636a;
                    C2530db.m5474a(4, str, "initSettings, LogEvents = " + boVar.f5656k);
                    boVar.f5657l = (String) a.mo17819a("UserId");
                    a.mo17820a("UserId", (C2612eh.C2613a) boVar);
                    String str2 = C2426bo.f5636a;
                    C2530db.m5474a(4, str2, "initSettings, UserId = " + boVar.f5657l);
                    boVar.f5658m = ((Byte) a.mo17819a("Gender")).byteValue();
                    a.mo17820a("Gender", (C2612eh.C2613a) boVar);
                    String str3 = C2426bo.f5636a;
                    C2530db.m5474a(4, str3, "initSettings, Gender = " + boVar.f5658m);
                    boVar.f5659n = (Long) a.mo17819a(HttpHeaders.AGE);
                    a.mo17820a(HttpHeaders.AGE, (C2612eh.C2613a) boVar);
                    String str4 = C2426bo.f5636a;
                    C2530db.m5474a(4, str4, "initSettings, BirthDate = " + boVar.f5659n);
                    boVar.f5661p = ((Boolean) a.mo17819a("analyticsEnabled")).booleanValue();
                    a.mo17820a("analyticsEnabled", (C2612eh.C2613a) boVar);
                    String str5 = C2426bo.f5636a;
                    C2530db.m5474a(4, str5, "initSettings, AnalyticsEnabled = " + boVar.f5661p);
                    boVar.f5653h = context.getFileStreamPath(".flurryagent." + Integer.toString(C2494ck.m5371a().f5833b.hashCode(), 16));
                    boVar.f5654i = new C2508ct<>(context.getFileStreamPath(".yflurryreport." + Long.toString(C2619em.m5709g(C2494ck.m5371a().f5833b), 16)), ".yflurryreport.", 1, new C2592dz<List<C2414bl>>() {
                        /* renamed from: a */
                        public final C2587dw<List<C2414bl>> mo17575a(int i) {
                            return new C2584dv(new C2414bl.C2415a());
                        }
                    });
                    boVar.f5660o = ebVar.mo17798a();
                    boVar.mo17638a(context);
                    boVar.mo17641a(true);
                    if (C2669x.m5819a().f6288a != null) {
                        C2494ck.m5371a().mo17685b(new C2621eo() {
                            /* renamed from: a */
                            public final void mo17573a() {
                                C2669x.m5819a().f6288a.mo17567a();
                            }
                        });
                    }
                    C2494ck.m5371a().mo17685b(new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            C2426bo.this.m5222e();
                        }
                    });
                    C2494ck.m5371a().mo17685b(new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            C2426bo.m5221d(C2426bo.this);
                        }
                    });
                    C2494ck.m5371a().mo17685b(new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            C2426bo.m5223e(C2426bo.this);
                        }
                    });
                    if (C2451bs.m5276a().mo17649c()) {
                        C2494ck.m5371a().mo17685b(new C2621eo() {
                            /* renamed from: a */
                            public final void mo17573a() {
                                C2426bo boVar = C2426bo.this;
                                C2449bq.m5261a();
                                boVar.m5216a(true, C2449bq.m5266d());
                            }
                        });
                    } else {
                        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.IdProviderFinishedEvent", boVar.f5662q);
                    }
                } else if (i == 2) {
                    C2426bo boVar2 = C2426bo.this;
                    ecVar.f6083a.get();
                    boVar2.mo17636a();
                } else if (i == 3) {
                    C2426bo boVar3 = C2426bo.this;
                    ecVar.f6083a.get();
                    boVar3.mo17642b();
                } else if (i == 4) {
                    C2511cw.m5419a().mo17724b("com.flurry.android.sdk.FlurrySessionEvent", C2426bo.this.f5651J);
                    C2426bo.this.mo17637a(ecVar.f6086e);
                }
            }
        }
    };
    /* access modifiers changed from: package-private */

    /* renamed from: g */
    public WeakReference<C2595eb> f5652g;

    /* renamed from: h */
    File f5653h;

    /* renamed from: i */
    C2508ct<List<C2414bl>> f5654i;

    /* renamed from: j */
    public boolean f5655j;

    /* renamed from: k */
    boolean f5656k;

    /* renamed from: l */
    String f5657l;

    /* renamed from: m */
    byte f5658m;

    /* renamed from: n */
    Long f5659n;

    /* renamed from: o */
    boolean f5660o;
    /* access modifiers changed from: package-private */

    /* renamed from: p */
    public boolean f5661p = true;

    /* renamed from: q */
    final C2510cv<C2461bt> f5662q = new C2510cv<C2461bt>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2426bo boVar = C2426bo.this;
                    C2449bq.m5261a();
                    boVar.m5216a(true, C2449bq.m5266d());
                }
            });
        }
    };

    /* renamed from: r */
    private final AtomicInteger f5663r = new AtomicInteger(0);

    /* renamed from: s */
    private final AtomicInteger f5664s = new AtomicInteger(0);

    /* renamed from: t */
    private final List<C2414bl> f5665t = new ArrayList();

    /* renamed from: u */
    private final Map<String, List<String>> f5666u = new HashMap();

    /* renamed from: v */
    private final Map<String, String> f5667v = new HashMap();

    /* renamed from: w */
    private final Map<String, C2407bh> f5668w = new HashMap();

    /* renamed from: x */
    private final List<C2408bi> f5669x = new ArrayList();

    /* renamed from: y */
    private final List<C2406bg> f5670y = new ArrayList();

    /* renamed from: z */
    private final List<String> f5671z = new ArrayList();

    /* renamed from: com.flurry.sdk.bo$9 */
    static /* synthetic */ class C24459 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5707a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                int[] r0 = com.flurry.sdk.C2597ec.C2598a.m5641a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5707a = r0
                r1 = 1
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6087a     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f5707a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6088b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f5707a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6089c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5707a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6090d     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r1 = 4
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2426bo.C24459.<clinit>():void");
        }
    }

    public C2426bo() {
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.FlurrySessionEvent", this.f5651J);
    }

    /* renamed from: d */
    private static String m5220d() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null && i < 1000) {
                    sb.append(readLine);
                    sb.append("\n");
                    i++;
                }
            }
            return sb.toString();
        } catch (IOException e) {
            String str = f5636a;
            C2530db.m5474a(6, str, "There was an issue grabbing logcat. " + e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17638a(Context context) {
        Bundle extras;
        if ((context instanceof Activity) && (extras = ((Activity) context).getIntent().getExtras()) != null) {
            String str = f5636a;
            C2530db.m5474a(3, str, "Launch Options Bundle is present " + extras.toString());
            for (String str2 : extras.keySet()) {
                if (str2 != null) {
                    Object obj = extras.get(str2);
                    String obj2 = obj != null ? obj.toString() : "null";
                    this.f5666u.put(str2, Collections.singletonList(obj2));
                    String str3 = f5636a;
                    C2530db.m5474a(3, str3, "Launch options Key: " + str2 + ". Its value: " + obj2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17641a(boolean r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x00c7
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r3
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "boot.time"
            r0.put(r2, r1)
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getRootDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.<init>(r1)
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            java.lang.String r4 = "disk.size.available.external"
            java.lang.String r5 = "disk.size.total.external"
            java.lang.String r6 = "disk.size.available.internal"
            java.lang.String r7 = "disk.size.total.internal"
            if (r2 < r3) goto L_0x0073
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.f5667v
            long r8 = r0.getAvailableBlocksLong()
            java.lang.String r3 = java.lang.Long.toString(r8)
            r2.put(r7, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.f5667v
            long r7 = r0.getAvailableBlocksLong()
            java.lang.String r0 = java.lang.Long.toString(r7)
            r2.put(r6, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            long r2 = r1.getAvailableBlocksLong()
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.put(r5, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            long r1 = r1.getAvailableBlocksLong()
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.put(r4, r1)
            goto L_0x00ab
        L_0x0073:
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.f5667v
            int r3 = r0.getAvailableBlocks()
            long r8 = (long) r3
            java.lang.String r3 = java.lang.Long.toString(r8)
            r2.put(r7, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r10.f5667v
            int r0 = r0.getAvailableBlocks()
            long r7 = (long) r0
            java.lang.String r0 = java.lang.Long.toString(r7)
            r2.put(r6, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            int r2 = r1.getAvailableBlocks()
            long r2 = (long) r2
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.put(r5, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            int r1 = r1.getAvailableBlocks()
            long r1 = (long) r1
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.put(r4, r1)
        L_0x00ab:
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            com.flurry.sdk.C2472bz.m5328a()
            java.lang.String r1 = com.flurry.sdk.C2472bz.m5330c()
            java.lang.String r2 = "carrier.name"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            com.flurry.sdk.C2472bz.m5328a()
            java.lang.String r1 = com.flurry.sdk.C2472bz.m5331d()
            java.lang.String r2 = "carrier.details"
            r0.put(r2, r1)
        L_0x00c7:
            com.flurry.sdk.ck r0 = com.flurry.sdk.C2494ck.m5371a()
            android.content.Context r0 = r0.f5832a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            r0.getMemoryInfo(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "memory.available"
            r2.<init>(r3)
            java.lang.String r3 = ".start"
            java.lang.String r4 = ".end"
            if (r11 == 0) goto L_0x00ee
            r5 = r3
            goto L_0x00ef
        L_0x00ee:
            r5 = r4
        L_0x00ef:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            long r5 = r1.availMem
            java.lang.String r5 = java.lang.Long.toString(r5)
            r0.put(r2, r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x0123
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "memory.total"
            r2.<init>(r5)
            if (r11 == 0) goto L_0x0112
            r5 = r3
            goto L_0x0113
        L_0x0112:
            r5 = r4
        L_0x0113:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            long r5 = r1.availMem
            java.lang.String r1 = java.lang.Long.toString(r5)
            r0.put(r2, r1)
        L_0x0123:
            r0 = 5
            r1 = 0
            r2 = -1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ Exception -> 0x0156 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ Exception -> 0x0156 }
            com.flurry.sdk.ck r6 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ Exception -> 0x0156 }
            android.content.Context r6 = r6.f5832a     // Catch:{ Exception -> 0x0156 }
            r7 = 0
            android.content.Intent r5 = r6.registerReceiver(r7, r5)     // Catch:{ Exception -> 0x0156 }
            if (r5 == 0) goto L_0x0168
            java.lang.String r6 = "status"
            int r6 = r5.getIntExtra(r6, r2)     // Catch:{ Exception -> 0x0156 }
            r7 = 2
            if (r6 == r7) goto L_0x0145
            if (r6 != r0) goto L_0x0146
        L_0x0145:
            r1 = 1
        L_0x0146:
            java.lang.String r6 = "level"
            int r6 = r5.getIntExtra(r6, r2)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = "scale"
            int r0 = r5.getIntExtra(r7, r2)     // Catch:{ Exception -> 0x0154 }
            r2 = r6
            goto L_0x0169
        L_0x0154:
            r5 = move-exception
            goto L_0x0158
        L_0x0156:
            r5 = move-exception
            r6 = -1
        L_0x0158:
            java.lang.String r7 = f5636a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = "Error getting battery status: "
            java.lang.String r5 = r8.concat(r5)
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r7, (java.lang.String) r5)
            r2 = r6
        L_0x0168:
            r0 = -1
        L_0x0169:
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "battery.charging"
            r5.<init>(r6)
            if (r11 == 0) goto L_0x0179
            r6 = r3
            goto L_0x017a
        L_0x0179:
            r6 = r4
        L_0x017a:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = java.lang.Boolean.toString(r1)
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "battery.remaining"
            r1.<init>(r5)
            if (r11 == 0) goto L_0x0194
            goto L_0x0195
        L_0x0194:
            r3 = r4
        L_0x0195:
            r1.append(r3)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = java.lang.Float.toString(r2)
            r0.put(r11, r1)
            com.flurry.sdk.da r11 = com.flurry.sdk.C2529da.m5470a()
            boolean r11 = r11.f5936b
            if (r11 == 0) goto L_0x01cf
            com.flurry.sdk.da r11 = com.flurry.sdk.C2529da.m5470a()
            java.lang.String r11 = r11.mo17746b()
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.f5667v
            if (r11 == 0) goto L_0x01b9
            r1 = r11
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r1 = "instant app"
        L_0x01bb:
            java.lang.String r2 = "instantapp.name"
            r0.put(r2, r1)
            java.lang.String r0 = f5636a
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r1 = "instantAppName: "
            java.lang.String r11 = r1.concat(r11)
            com.flurry.sdk.C2530db.m5486c(r0, r11)
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2426bo.mo17641a(boolean):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5222e() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = f5636a     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Loading persistent session report data."
            r2 = 4
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0063 }
            com.flurry.sdk.ct<java.util.List<com.flurry.sdk.bl>> r0 = r7.f5654i     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r0.mo17716a()     // Catch:{ all -> 0x0063 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x001d
            java.util.List<com.flurry.sdk.bl> r1 = r7.f5665t     // Catch:{ all -> 0x0063 }
            r1.addAll(r0)     // Catch:{ all -> 0x0063 }
            monitor-exit(r7)
            return
        L_0x001d:
            java.io.File r0 = r7.f5653h     // Catch:{ all -> 0x0063 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = f5636a     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Legacy persistent agent data found, converting."
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0063 }
            java.io.File r0 = r7.f5653h     // Catch:{ all -> 0x0063 }
            com.flurry.sdk.bp r0 = com.flurry.sdk.C2329aa.m5003a(r0)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0059
            boolean r1 = r0.f5710b     // Catch:{ all -> 0x0063 }
            long r2 = r0.f5711c     // Catch:{ all -> 0x0063 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0045
            com.flurry.sdk.C2449bq.m5261a()     // Catch:{ all -> 0x0063 }
            long r2 = com.flurry.sdk.C2449bq.m5266d()     // Catch:{ all -> 0x0063 }
        L_0x0045:
            r7.f5655j = r1     // Catch:{ all -> 0x0063 }
            r7.f5643B = r2     // Catch:{ all -> 0x0063 }
            r7.m5224f()     // Catch:{ all -> 0x0063 }
            java.util.List<com.flurry.sdk.bl> r0 = r0.f5709a     // Catch:{ all -> 0x0063 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0059
            java.util.List<com.flurry.sdk.bl> r1 = r7.f5665t     // Catch:{ all -> 0x0063 }
            r1.addAll(r0)     // Catch:{ all -> 0x0063 }
        L_0x0059:
            java.io.File r0 = r7.f5653h     // Catch:{ all -> 0x0063 }
            r0.delete()     // Catch:{ all -> 0x0063 }
            r7.m5226g()     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r7)
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2426bo.m5222e():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5216a(boolean z, long j) {
        synchronized (this) {
            if (!this.f5661p) {
                C2530db.m5474a(3, f5636a, "Analytics disabled, not sending agent report.");
                return;
            }
            if (!z) {
                if (this.f5665t.isEmpty()) {
                    return;
                }
            }
            String str = f5636a;
            C2530db.m5474a(3, str, "generating agent report with " + this.f5665t.size() + " session reports.");
            byte[] bArr = null;
            try {
                String str2 = C2494ck.m5371a().f5833b;
                String e = C2476cb.m5335a().mo17667e();
                boolean z2 = this.f5655j;
                boolean f = C2451bs.m5276a().mo17652f();
                long j2 = this.f5643B;
                List<C2414bl> list = this.f5665t;
                Map<C2475ca, byte[]> unmodifiableMap = Collections.unmodifiableMap(C2451bs.m5276a().f5716a);
                Map<String, List<String>> a = this.f5642A.mo17880a();
                Map<String, List<String>> map = this.f5666u;
                bArr = new C2409bj(str2, e, z2, f, j2, j, list, unmodifiableMap, a, map, C2496cm.m5384a().mo17688c(), System.currentTimeMillis(), C2611eg.m5674a(), this.f5660o).f5574a;
            } catch (Exception e2) {
                C2530db.m5490e(f5636a, "Exception while generating report: ".concat(String.valueOf(e2)));
            }
            if (bArr == null) {
                C2530db.m5490e(f5636a, "Error generating report");
            } else {
                String str3 = f5636a;
                C2530db.m5474a(3, str3, "generated report of size " + bArr.length + " with " + this.f5665t.size() + " reports.");
                C2410bk bkVar = C2669x.m5819a().f6289b;
                StringBuilder sb = new StringBuilder();
                sb.append(C2495cl.m5382b());
                bkVar.mo17775b(bArr, C2494ck.m5371a().f5833b, sb.toString());
            }
            this.f5665t.clear();
            this.f5654i.mo17718b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m5224f() {
        SharedPreferences.Editor edit = C2494ck.m5371a().f5832a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putBoolean("com.flurry.sdk.previous_successful_report", this.f5655j);
        edit.putLong("com.flurry.sdk.initial_run_time", this.f5643B);
        edit.putString("com.flurry.sdk.api_key", C2494ck.m5371a().f5833b);
        edit.apply();
    }

    /* renamed from: g */
    private synchronized void m5226g() {
        C2530db.m5474a(4, f5636a, "Saving persistent agent data.");
        this.f5654i.mo17717a(this.f5665t);
    }

    /* renamed from: a */
    public final synchronized void mo17636a() {
        this.f5646E = C2616ek.m5685a();
        if (C2669x.m5819a().f6290c != null) {
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2364au auVar = C2669x.m5819a().f6290c;
                    auVar.f6005c = false;
                    C2494ck.m5371a().mo17685b(new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            C2549dn.this.m5539b();
                        }
                    });
                }
            });
        }
        if (this.f5661p && C2669x.m5819a().f6288a != null) {
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2669x.m5819a().f6288a.mo17571b();
                }
            });
        }
    }

    /* renamed from: b */
    public final synchronized void mo17642b() {
        m5228h();
    }

    /* renamed from: h */
    private synchronized void m5228h() {
        mo17641a(false);
        C2449bq.m5261a();
        final long d = C2449bq.m5266d();
        final long f = C2449bq.m5268f();
        final long h = C2449bq.m5270h();
        final int l = C2449bq.m5274l() - 1;
        final String i = C2449bq.m5271i();
        final String j = C2449bq.m5272j();
        final Map<String, String> k = C2449bq.m5273k();
        if (this.f5661p && C2669x.m5819a().f6288a != null) {
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2669x.m5819a().f6288a.mo17568a(d);
                }
            });
        }
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2426bo.this.m5224f();
            }
        });
        if (C2451bs.m5276a().mo17649c()) {
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2426bo.m5214a(C2426bo.this, d, f, h, l, i, j, k);
                }
            });
        }
    }

    /* renamed from: a */
    private synchronized C2414bl m5211a(long j, long j2, long j3, int i, String str, String str2, Map<String, String> map) {
        C2414bl blVar;
        C2418bm bmVar = new C2418bm();
        bmVar.f5608s = ((Boolean) C2611eg.m5674a().mo17819a("IncludeBackgroundSessionsInMetrics")).booleanValue();
        if (this.f5660o) {
            bmVar.f5607r = C2622ep.C2623a.BACKGROUND.f6158e;
        } else {
            bmVar.f5607r = C2622ep.C2623a.ACTIVE.f6158e;
        }
        bmVar.f5590a = C2476cb.m5335a().mo17667e();
        bmVar.f5591b = j;
        bmVar.f5592c = j2;
        bmVar.f5593d = j3;
        bmVar.f5594e = this.f5667v;
        bmVar.f5595f = str;
        bmVar.f5596g = str2;
        bmVar.f5597h = map;
        C2463bv.m5299a();
        bmVar.f5598i = C2463bv.m5300b();
        C2463bv.m5299a();
        bmVar.f5599j = TimeZone.getDefault().getID();
        bmVar.f5600k = i;
        bmVar.f5601l = this.f5646E != -1 ? this.f5646E : C2616ek.m5685a();
        bmVar.f5602m = this.f5657l == null ? "" : this.f5657l;
        bmVar.f5603n = C2464bw.m5304a().mo17656g();
        bmVar.f5604o = this.f5650I;
        bmVar.f5613x = C2622ep.m5712a(C2494ck.m5371a().f5832a).f6168i;
        bmVar.f5605p = this.f5658m;
        bmVar.f5606q = this.f5659n;
        bmVar.f5609t = this.f5668w;
        List<C2408bi> list = this.f5669x;
        String str3 = f5636a;
        C2530db.m5474a(3, str3, "Total events in session report: " + list.size());
        bmVar.f5610u = list;
        bmVar.f5612w = this.f5647F;
        bmVar.f5615z = this.f5670y;
        bmVar.f5614y = this.f5649H;
        String str4 = f5636a;
        C2530db.m5474a(3, str4, "Total errors in session report: " + this.f5649H);
        bmVar.f5611v = this.f5671z;
        bmVar.f5589A = this.f5645D;
        blVar = null;
        try {
            blVar = new C2414bl(bmVar);
        } catch (IOException e) {
            C2530db.m5474a(5, f5636a, "Error creating analytics session report: ".concat(String.valueOf(e)));
        }
        if (blVar == null) {
            C2530db.m5490e(f5636a, "New session report wasn't created");
        }
        return blVar;
    }

    /* renamed from: a */
    private synchronized C2414bl m5212a(long j, long j2, C2406bg bgVar) {
        C2414bl blVar;
        C2418bm bmVar = new C2418bm();
        bmVar.f5608s = false;
        bmVar.f5607r = C2622ep.C2623a.UNKNOWN.f6158e;
        bmVar.f5590a = C2476cb.m5335a().mo17667e();
        bmVar.f5591b = j;
        bmVar.f5592c = j2;
        bmVar.f5593d = 0;
        blVar = null;
        bmVar.f5594e = null;
        bmVar.f5595f = null;
        bmVar.f5596g = null;
        bmVar.f5597h = null;
        bmVar.f5598i = "";
        bmVar.f5599j = "";
        bmVar.f5600k = C2468by.C2471a.f5768a - 1;
        bmVar.f5601l = 0;
        bmVar.f5602m = "";
        bmVar.f5603n = null;
        bmVar.f5604o = 0;
        bmVar.f5613x = C2622ep.m5712a(C2494ck.m5371a().f5832a).f6168i;
        bmVar.f5605p = -1;
        bmVar.f5606q = null;
        bmVar.f5609t = null;
        bmVar.f5610u = null;
        bmVar.f5612w = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bgVar);
        bmVar.f5615z = arrayList;
        bmVar.f5614y = arrayList.size();
        String str = f5636a;
        C2530db.m5474a(3, str, "Total errors in native crash session report: " + arrayList.size());
        bmVar.f5611v = new ArrayList();
        bmVar.f5589A = null;
        try {
            blVar = new C2414bl(bmVar);
        } catch (IOException e) {
            C2530db.m5474a(5, f5636a, "Error creating analytics native crash session report: ".concat(String.valueOf(e)));
        }
        if (blVar == null) {
            C2530db.m5490e(f5636a, "New native crash session report wasn't created");
        }
        return blVar;
    }

    /* renamed from: b */
    private synchronized void m5218b(long j) {
        for (C2408bi next : this.f5669x) {
            if (next.f5567b && !next.f5568c) {
                next.mo17620a(j);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17637a(long j) {
        synchronized (this) {
            C2511cw.m5419a().mo17722a((C2510cv<?>) this.f5662q);
            C2449bq.m5261a();
            m5218b(C2449bq.m5268f());
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    if (C2426bo.this.f5661p && C2669x.m5819a().f6288a != null) {
                        C2669x.m5819a().f6288a.mo17572c();
                    }
                    if (C2669x.m5819a().f6290c != null) {
                        C2494ck.m5371a().mo17685b(new C2621eo() {
                            /* renamed from: a */
                            public final void mo17573a() {
                                C2669x.m5819a().f6290c.f6005c = true;
                            }
                        });
                    }
                }
            });
            if (C2451bs.m5276a().mo17649c()) {
                C2449bq.m5261a();
                final long f = C2449bq.m5268f();
                final long h = C2449bq.m5270h();
                final int l = C2449bq.m5274l() - 1;
                final String i = C2449bq.m5271i();
                final String j2 = C2449bq.m5272j();
                final Map<String, String> k = C2449bq.m5273k();
                final long j3 = j;
                C2494ck.m5371a().mo17685b(new C2621eo() {
                    /* renamed from: a */
                    public final void mo17573a() {
                        C2426bo.m5214a(C2426bo.this, j3, f, h, l, i, j2, k);
                        C2426bo.this.m5216a(false, j3);
                    }
                });
            }
            C2611eg.m5674a().mo17822b("Gender", this);
            C2611eg.m5674a().mo17822b("UserId", this);
            C2611eg.m5674a().mo17822b(HttpHeaders.AGE, this);
            C2611eg.m5674a().mo17822b("LogEvents", this);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17569a(java.lang.String r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 4
            switch(r0) {
                case -1752163738: goto L_0x0034;
                case -1720015653: goto L_0x002a;
                case -738063011: goto L_0x0020;
                case 65759: goto L_0x0016;
                case 2129321697: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "Gender"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "Age"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 3
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "LogEvents"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 0
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "analyticsEnabled"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 4
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "UserId"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003e
            r6 = 1
            goto L_0x003f
        L_0x003e:
            r6 = -1
        L_0x003f:
            if (r6 == 0) goto L_0x00c2
            if (r6 == r3) goto L_0x00a8
            if (r6 == r2) goto L_0x008a
            if (r6 == r1) goto L_0x0070
            if (r6 == r4) goto L_0x0052
            r6 = 6
            java.lang.String r7 = f5636a
            java.lang.String r0 = "onSettingUpdate internal error!"
            com.flurry.sdk.C2530db.m5474a((int) r6, (java.lang.String) r7, (java.lang.String) r0)
            return
        L_0x0052:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            r5.f5661p = r6
            java.lang.String r6 = f5636a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onSettingUpdate, AnalyticsEnabled = "
            r7.<init>(r0)
            boolean r0 = r5.f5661p
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r6, (java.lang.String) r7)
            return
        L_0x0070:
            java.lang.Long r7 = (java.lang.Long) r7
            r5.f5659n = r7
            java.lang.String r6 = f5636a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onSettingUpdate, Birthdate = "
            r7.<init>(r0)
            java.lang.Long r0 = r5.f5659n
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r6, (java.lang.String) r7)
            return
        L_0x008a:
            java.lang.Byte r7 = (java.lang.Byte) r7
            byte r6 = r7.byteValue()
            r5.f5658m = r6
            java.lang.String r6 = f5636a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onSettingUpdate, Gender = "
            r7.<init>(r0)
            byte r0 = r5.f5658m
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r6, (java.lang.String) r7)
            return
        L_0x00a8:
            java.lang.String r7 = (java.lang.String) r7
            r5.f5657l = r7
            java.lang.String r6 = f5636a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onSettingUpdate, UserId = "
            r7.<init>(r0)
            java.lang.String r0 = r5.f5657l
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r6, (java.lang.String) r7)
            return
        L_0x00c2:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            r5.f5656k = r6
            java.lang.String r6 = f5636a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "onSettingUpdate, LogEvents = "
            r7.<init>(r0)
            boolean r0 = r5.f5656k
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r6, (java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2426bo.mo17569a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: c */
    public final synchronized void mo17643c() {
        this.f5650I++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016b, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.flurry.android.FlurryEventRecordStatus mo17635a(java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, boolean r16, int r17) {
        /*
            r13 = this;
            r1 = r13
            monitor-enter(r13)
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventRecorded     // Catch:{ all -> 0x016c }
            boolean r2 = r1.f5661p     // Catch:{ all -> 0x016c }
            if (r2 != 0) goto L_0x0013
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventAnalyticsDisabled     // Catch:{ all -> 0x016c }
            java.lang.String r2 = f5636a     // Catch:{ all -> 0x016c }
            java.lang.String r3 = "Analytics has been disabled, not logging event."
            com.flurry.sdk.C2530db.m5490e(r2, r3)     // Catch:{ all -> 0x016c }
            monitor-exit(r13)
            return r0
        L_0x0013:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x016c }
            com.flurry.sdk.C2449bq.m5261a()     // Catch:{ all -> 0x016c }
            long r4 = com.flurry.sdk.C2449bq.m5267e()     // Catch:{ all -> 0x016c }
            long r10 = r2 - r4
            java.lang.String r2 = com.flurry.sdk.C2619em.m5703b((java.lang.String) r14)     // Catch:{ all -> 0x016c }
            int r3 = r2.length()     // Catch:{ all -> 0x016c }
            if (r3 != 0) goto L_0x002e
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventFailed     // Catch:{ all -> 0x016c }
            monitor-exit(r13)
            return r0
        L_0x002e:
            java.util.Map<java.lang.String, com.flurry.sdk.bh> r3 = r1.f5668w     // Catch:{ all -> 0x016c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x016c }
            com.flurry.sdk.bh r3 = (com.flurry.sdk.C2407bh) r3     // Catch:{ all -> 0x016c }
            r4 = 1
            if (r3 != 0) goto L_0x0071
            java.util.Map<java.lang.String, com.flurry.sdk.bh> r3 = r1.f5668w     // Catch:{ all -> 0x016c }
            int r3 = r3.size()     // Catch:{ all -> 0x016c }
            int r5 = f5637b     // Catch:{ all -> 0x016c }
            if (r3 >= r5) goto L_0x005f
            com.flurry.sdk.bh r3 = new com.flurry.sdk.bh     // Catch:{ all -> 0x016c }
            r3.<init>()     // Catch:{ all -> 0x016c }
            r3.f5565a = r4     // Catch:{ all -> 0x016c }
            java.util.Map<java.lang.String, com.flurry.sdk.bh> r4 = r1.f5668w     // Catch:{ all -> 0x016c }
            r4.put(r2, r3)     // Catch:{ all -> 0x016c }
            java.lang.String r3 = f5636a     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "Event count started: "
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x016c }
            com.flurry.sdk.C2530db.m5490e(r3, r4)     // Catch:{ all -> 0x016c }
            goto L_0x0087
        L_0x005f:
            java.lang.String r0 = f5636a     // Catch:{ all -> 0x016c }
            java.lang.String r3 = "Too many different events. Event not counted: "
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x016c }
            com.flurry.sdk.C2530db.m5490e(r0, r3)     // Catch:{ all -> 0x016c }
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventUniqueCountExceeded     // Catch:{ all -> 0x016c }
            goto L_0x0087
        L_0x0071:
            int r0 = r3.f5565a     // Catch:{ all -> 0x016c }
            int r0 = r0 + r4
            r3.f5565a = r0     // Catch:{ all -> 0x016c }
            java.lang.String r0 = f5636a     // Catch:{ all -> 0x016c }
            java.lang.String r3 = "Event count incremented: "
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x016c }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x016c }
            com.flurry.sdk.C2530db.m5490e(r0, r3)     // Catch:{ all -> 0x016c }
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventRecorded     // Catch:{ all -> 0x016c }
        L_0x0087:
            boolean r3 = r1.f5656k     // Catch:{ all -> 0x016c }
            r4 = 0
            if (r3 == 0) goto L_0x0168
            java.util.List<com.flurry.sdk.bi> r3 = r1.f5669x     // Catch:{ all -> 0x016c }
            int r3 = r3.size()     // Catch:{ all -> 0x016c }
            int r5 = f5639d     // Catch:{ all -> 0x016c }
            if (r3 >= r5) goto L_0x0168
            int r3 = r1.f5648G     // Catch:{ all -> 0x016c }
            int r5 = f5640e     // Catch:{ all -> 0x016c }
            if (r3 >= r5) goto L_0x0168
            if (r15 != 0) goto L_0x00a3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x016c }
            goto L_0x00a4
        L_0x00a3:
            r0 = r15
        L_0x00a4:
            int r3 = r0.size()     // Catch:{ all -> 0x016c }
            int r3 = r3 - r17
            int r5 = f5638c     // Catch:{ all -> 0x016c }
            if (r3 <= r5) goto L_0x00cb
            java.lang.String r2 = f5636a     // Catch:{ all -> 0x016c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            java.lang.String r4 = "MaxEventParams exceeded: "
            r3.<init>(r4)     // Catch:{ all -> 0x016c }
            int r0 = r0.size()     // Catch:{ all -> 0x016c }
            int r0 = r0 - r17
            r3.append(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x016c }
            com.flurry.sdk.C2530db.m5490e(r2, r0)     // Catch:{ all -> 0x016c }
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventParamsCountExceeded     // Catch:{ all -> 0x016c }
            goto L_0x016a
        L_0x00cb:
            com.flurry.sdk.bi r3 = new com.flurry.sdk.bi     // Catch:{ all -> 0x016c }
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f5663r     // Catch:{ all -> 0x016c }
            int r7 = r5.incrementAndGet()     // Catch:{ all -> 0x016c }
            r6 = r3
            r8 = r2
            r9 = r0
            r12 = r16
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x016c }
            byte[] r5 = r3.mo17623b()     // Catch:{ all -> 0x016c }
            int r5 = r5.length     // Catch:{ all -> 0x016c }
            int r6 = r1.f5648G     // Catch:{ all -> 0x016c }
            int r5 = r5 + r6
            int r6 = f5640e     // Catch:{ all -> 0x016c }
            if (r5 > r6) goto L_0x0158
            java.util.List<com.flurry.sdk.bi> r4 = r1.f5669x     // Catch:{ all -> 0x016c }
            r4.add(r3)     // Catch:{ all -> 0x016c }
            int r4 = r1.f5648G     // Catch:{ all -> 0x016c }
            byte[] r5 = r3.mo17623b()     // Catch:{ all -> 0x016c }
            int r5 = r5.length     // Catch:{ all -> 0x016c }
            int r4 = r4 + r5
            r1.f5648G = r4     // Catch:{ all -> 0x016c }
            com.flurry.android.FlurryEventRecordStatus r4 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventRecorded     // Catch:{ all -> 0x016c }
            java.lang.String r5 = "Flurry.purchase"
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x016c }
            if (r5 == 0) goto L_0x013e
            java.util.Map r5 = r3.mo17619a()     // Catch:{ all -> 0x016c }
            java.lang.String r6 = "fl.OrderJSON"
            java.lang.Object r6 = r5.get(r6)     // Catch:{ all -> 0x016c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x016c }
            java.lang.String r7 = "fl.OrderJSONSignature"
            java.lang.Object r7 = r5.get(r7)     // Catch:{ all -> 0x016c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x013e
            if (r7 == 0) goto L_0x013e
            java.lang.String r8 = "fl.OrderJSON"
            r5.remove(r8)     // Catch:{ all -> 0x016c }
            java.lang.String r8 = "fl.OrderJSONSignature"
            r5.remove(r8)     // Catch:{ all -> 0x016c }
            r3.mo17622b(r5)     // Catch:{ all -> 0x016c }
            java.util.List<java.lang.String> r3 = r1.f5671z     // Catch:{ all -> 0x016c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            r5.<init>()     // Catch:{ all -> 0x016c }
            r5.append(r7)     // Catch:{ all -> 0x016c }
            r7 = 10
            r5.append(r7)     // Catch:{ all -> 0x016c }
            r5.append(r6)     // Catch:{ all -> 0x016c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x016c }
            r3.add(r5)     // Catch:{ all -> 0x016c }
        L_0x013e:
            boolean r3 = r1.f5661p     // Catch:{ all -> 0x016c }
            if (r3 == 0) goto L_0x0156
            com.flurry.sdk.x r3 = com.flurry.sdk.C2669x.m5819a()     // Catch:{ all -> 0x016c }
            com.flurry.sdk.as r3 = r3.f6288a     // Catch:{ all -> 0x016c }
            if (r3 == 0) goto L_0x0156
            com.flurry.sdk.ck r3 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ all -> 0x016c }
            com.flurry.sdk.bo$8 r5 = new com.flurry.sdk.bo$8     // Catch:{ all -> 0x016c }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x016c }
            r3.mo17685b(r5)     // Catch:{ all -> 0x016c }
        L_0x0156:
            r0 = r4
            goto L_0x016a
        L_0x0158:
            int r0 = f5640e     // Catch:{ all -> 0x016c }
            r1.f5648G = r0     // Catch:{ all -> 0x016c }
            r1.f5647F = r4     // Catch:{ all -> 0x016c }
            java.lang.String r0 = f5636a     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "Event Log size exceeded. No more event details logged."
            com.flurry.sdk.C2530db.m5490e(r0, r2)     // Catch:{ all -> 0x016c }
            com.flurry.android.FlurryEventRecordStatus r0 = com.flurry.android.FlurryEventRecordStatus.kFlurryEventLogCountExceeded     // Catch:{ all -> 0x016c }
            goto L_0x016a
        L_0x0168:
            r1.f5647F = r4     // Catch:{ all -> 0x016c }
        L_0x016a:
            monitor-exit(r13)
            return r0
        L_0x016c:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2426bo.mo17635a(java.lang.String, java.util.Map, boolean, int):com.flurry.android.FlurryEventRecordStatus");
    }

    /* renamed from: a */
    public final synchronized void mo17640a(String str, Map<String, String> map) {
        boolean z;
        for (C2408bi next : this.f5669x) {
            if (!next.f5567b || next.f5569d != 0 || !next.f5566a.equals(str)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C2449bq.m5261a();
                long e = elapsedRealtime - C2449bq.m5267e();
                if (map != null && map.size() > 0 && this.f5648G < f5640e) {
                    int length = this.f5648G - next.mo17623b().length;
                    HashMap hashMap = new HashMap(next.mo17619a());
                    next.mo17621a(map);
                    if (next.mo17623b().length + length > f5640e) {
                        next.mo17622b(hashMap);
                        this.f5647F = false;
                        this.f5648G = f5640e;
                        C2530db.m5490e(f5636a, "Event Log size exceeded. No more event details logged.");
                    } else if (next.mo17619a().size() > f5638c) {
                        String str2 = f5636a;
                        C2530db.m5490e(str2, "MaxEventParams exceeded on endEvent: " + next.mo17619a().size());
                        next.mo17622b(hashMap);
                    } else {
                        this.f5648G = length + next.mo17623b().length;
                    }
                }
                next.mo17620a(e);
                return;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17639a(C2667v vVar) {
        int i = 0;
        boolean z = vVar.f6276a != null && "uncaught".equals(vVar.f6276a);
        this.f5649H++;
        if (this.f5670y.size() < f5641f) {
            C2406bg bgVar = new C2406bg(this.f5664s.incrementAndGet(), Long.valueOf(System.currentTimeMillis()).longValue(), vVar.f6276a, vVar.f6277b, vVar.f6278c, vVar.f6279d, vVar.f6280e, vVar.f6281f);
            bgVar.mo17616a(vVar.f6282g);
            this.f5670y.add(bgVar);
            C2530db.m5490e(f5636a, "Error logged: " + bgVar.f5554a);
        } else if (z) {
            while (i < this.f5670y.size()) {
                C2406bg bgVar2 = this.f5670y.get(i);
                if (bgVar2.f5554a == null || "uncaught".equals(bgVar2.f5554a)) {
                    i++;
                } else {
                    C2406bg bgVar3 = new C2406bg(this.f5664s.incrementAndGet(), Long.valueOf(System.currentTimeMillis()).longValue(), vVar.f6276a, vVar.f6277b, vVar.f6278c, vVar.f6279d, vVar.f6280e, vVar.f6281f);
                    bgVar3.mo17616a(vVar.f6282g);
                    this.f5670y.set(i, bgVar3);
                    return;
                }
            }
        } else {
            C2530db.m5490e(f5636a, "Max errors logged. No more errors logged.");
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m5221d(C2426bo boVar) {
        SharedPreferences sharedPreferences = C2494ck.m5371a().f5832a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
        boVar.f5655j = sharedPreferences.getBoolean("com.flurry.sdk.previous_successful_report", false);
        C2449bq.m5261a();
        boVar.f5643B = sharedPreferences.getLong("com.flurry.sdk.initial_run_time", C2449bq.m5266d());
        boVar.f5644C = sharedPreferences.getString("com.flurry.sdk.api_key", "");
        boVar.f5645D = sharedPreferences.getString("com.flurry.sdk.variant_ids", (String) null);
        if (TextUtils.isEmpty(boVar.f5644C) && boVar.f5643B > 0) {
            boVar.f5644C = C2494ck.m5371a().f5833b;
        } else if (!boVar.f5644C.equals(C2494ck.m5371a().f5833b)) {
            C2449bq.m5261a();
            boVar.f5643B = C2449bq.m5266d();
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m5223e(C2426bo boVar) {
        boolean z;
        long j;
        int i;
        C2619em.m5697a();
        File fileStreamPath = C2494ck.m5371a().f5832a.getFileStreamPath(".yflurrynativecrash");
        for (String str : C2617el.m5690a(fileStreamPath, Pattern.compile(".*" + Pattern.quote(".dmp") + "$"))) {
            C2530db.m5474a(3, f5636a, "Native crash occurred in previous session! Found minidump file - ".concat(String.valueOf(str)));
            String a = C2622ep.m5713a(fileStreamPath, str);
            boolean z2 = true;
            if (TextUtils.isEmpty(a)) {
                C2530db.m5474a(6, f5636a, "There was no breadcrumbs file associated with the minidump file.");
                z = true;
            } else {
                z = false;
            }
            C2530db.m5474a(2, f5636a, "Breadcrumbs file associated with minidump file - ".concat(String.valueOf(a)));
            String a2 = C2622ep.m5714a(a);
            String b = C2622ep.m5715b(a);
            if (TextUtils.isEmpty(a2)) {
                C2530db.m5474a(6, f5636a, "There is no session id specified with crash breadcrumbs file: ".concat(String.valueOf(a)));
                z = true;
            }
            long j2 = 0;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                j2 = Long.parseLong(a2);
                j = Long.parseLong(b);
            } catch (NumberFormatException unused) {
                C2530db.m5474a(6, f5636a, "Issue parsing session id into start time: ".concat(String.valueOf(a2)));
                j = currentTimeMillis;
                z = true;
            }
            long j3 = j2;
            C2406bg bgVar = new C2406bg(1, j, "native", "", "", (Throwable) null, (Map<String, String>) null, (Map<String, String>) null);
            bgVar.f5555b = m5220d();
            File file = new File(fileStreamPath, a);
            if (file.exists()) {
                List<C2627es> a3 = new C2628et(file).mo17829a();
                C2530db.m5474a(2, f5636a, "Number of crash breadcrumbs - " + a3.size());
                bgVar.mo17616a(a3);
                file.delete();
                z2 = z;
                i = 6;
            } else {
                i = 6;
                C2530db.m5474a(6, f5636a, "Breadcrumbs file does not exist.");
            }
            File file2 = new File(fileStreamPath, str);
            if (!file2.exists()) {
                C2426bo boVar2 = boVar;
                C2530db.m5474a(6, f5636a, "Minidump file doesn't exist.");
            } else if (z2) {
                C2530db.m5474a(i, f5636a, "Some error occurred with minidump file. Deleting it.");
                file2.delete();
                C2426bo boVar3 = boVar;
            } else {
                bgVar.f5556c = C2617el.m5692c(file2);
                file2.delete();
                C2414bl a4 = boVar.m5212a(j3, j - j3, bgVar);
                C2426bo boVar4 = boVar;
                if (a4 != null) {
                    boVar4.f5665t.add(a4);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5214a(C2426bo boVar, long j, long j2, long j3, int i, String str, String str2, Map map) {
        C2414bl a = boVar.m5211a(j, j2, j3, i, str, str2, map);
        boVar.f5665t.clear();
        boVar.f5665t.add(a);
        boVar.m5226g();
    }
}
