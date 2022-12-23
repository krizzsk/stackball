package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.entity.C6191a;
import com.mbridge.msdk.foundation.entity.C6201k;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.same.report.p181b.C6306a;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.p156a.C6067a;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6083c;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.controller.b */
/* compiled from: SDKController */
public final class C6130b {

    /* renamed from: h */
    private static C6130b f15157h;

    /* renamed from: a */
    public final int f15158a = 1;

    /* renamed from: b */
    public final int f15159b = 2;

    /* renamed from: c */
    public final int f15160c = 3;

    /* renamed from: d */
    public final int f15161d = 4;

    /* renamed from: e */
    public final int f15162e = 5;

    /* renamed from: f */
    public final int f15163f = 6;

    /* renamed from: g */
    Handler f15164g = new Handler() {
        public final void handleMessage(Message message) {
            List list;
            try {
                int i = message.what;
                if (i != 2) {
                    if (i == 3) {
                        File file = (File) message.obj;
                        if (file != null) {
                            String a = C6355o.m16137a(file);
                            if (!TextUtils.isEmpty(a)) {
                                String[] split = a.split("====");
                                if (split.length > 0) {
                                    new C6308c(C6130b.this.f15165i).mo43929a(split[0], file);
                                }
                            }
                        }
                    } else if (i == 4) {
                        String str = (String) message.obj;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (C6301a.m15945a().mo43913c()) {
                            C6301a.m15945a().mo43911a(str);
                        } else {
                            new C6308c(C6130b.this.f15165i, 0).mo43932a("click_duration", str, (String) null, (Frame) null);
                        }
                    } else if (i == 5) {
                        String str2 = (String) message.obj;
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        if (C6301a.m15945a().mo43913c()) {
                            C6301a.m15945a().mo43911a(str2);
                        } else {
                            new C6308c(C6130b.this.f15165i, 0).mo43932a("load_duration", str2, (String) null, (Frame) null);
                        }
                    } else if (i != 6) {
                        if (i == 9) {
                            if (((C6072a) message.obj).mo42718l() == 1) {
                                C6306a.m15972a(C6130b.this.f15165i).mo43921a();
                            }
                        }
                    } else if (message.obj != null && (message.obj instanceof String)) {
                        String str3 = (String) message.obj;
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        if (C6301a.m15945a().mo43913c()) {
                            C6301a.m15945a().mo43911a(str3);
                        } else {
                            new C6308c(C6130b.this.f15165i, 0).mo43932a("device_data", str3, (String) null, (Frame) null);
                        }
                    }
                } else if ((message.obj instanceof List) && (list = (List) message.obj) != null && list.size() > 0) {
                    C6308c cVar = new C6308c(C6130b.this.f15165i, 0);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C6201k kVar = (C6201k) list.get(i2);
                        boolean z = false;
                        if (i2 == list.size()) {
                            z = true;
                        }
                        cVar.mo43927a(kVar, z);
                    }
                }
            } catch (Exception e) {
                C6361q.m16158d("SDKController", e.getMessage());
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f15165i;

    /* renamed from: j */
    private String f15166j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f15167k;

    /* renamed from: l */
    private String f15168l;

    /* renamed from: m */
    private boolean f15169m = false;

    /* renamed from: n */
    private C6067a f15170n;

    /* renamed from: o */
    private String f15171o;

    /* renamed from: p */
    private boolean f15172p = false;

    /* renamed from: q */
    private Map<String, Object> f15173q;

    /* renamed from: r */
    private int f15174r;

    private C6130b() {
    }

    /* renamed from: a */
    public static synchronized C6130b m15341a() {
        C6130b bVar;
        synchronized (C6130b.class) {
            if (f15157h == null) {
                f15157h = new C6130b();
            }
            bVar = f15157h;
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0182 A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018f A[Catch:{ Exception -> 0x01aa }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42929a(java.util.Map r10, final android.content.Context r11) {
        /*
            r9 = this;
            java.lang.String r0 = "SDKController"
            if (r11 == 0) goto L_0x01bc
            java.lang.String r1 = "mbridge_appid"
            boolean r2 = r10.containsKey(r1)
            if (r2 == 0) goto L_0x0014
            java.lang.Object r2 = r10.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r9.f15167k = r2
        L_0x0014:
            android.content.Context r2 = r11.getApplicationContext()
            r9.f15165i = r2
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r3 = r9.f15165i
            r2.mo42886a((android.content.Context) r3)
            java.lang.Object r2 = r10.get(r1)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            if (r3 != 0) goto L_0x0044
            com.mbridge.msdk.foundation.a.a.a r3 = com.mbridge.msdk.foundation.p162a.p163a.C6121a.m15293a()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r4 = "sdk_app_id"
            r3.mo42880a((java.lang.String) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            goto L_0x0044
        L_0x0039:
            r2 = move-exception
            goto L_0x003d
        L_0x003b:
            r2 = move-exception
            goto L_0x0041
        L_0x003d:
            r2.printStackTrace()
            goto L_0x0044
        L_0x0041:
            r2.printStackTrace()
        L_0x0044:
            boolean r2 = r9.f15169m
            r3 = 1
            if (r2 != r3) goto L_0x0052
            com.mbridge.msdk.foundation.same.report.c r10 = new com.mbridge.msdk.foundation.same.report.c
            r10.<init>(r11)
            r10.mo43924a()
            return
        L_0x0052:
            com.mbridge.msdk.foundation.tools.C6349m.m16121m(r11)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            com.mbridge.msdk.foundation.controller.b$1 r4 = new com.mbridge.msdk.foundation.controller.b$1
            r4.<init>(r11)
            r5 = 300(0x12c, double:1.48E-321)
            r2.postDelayed(r4, r5)
            if (r10 == 0) goto L_0x01bc
            boolean r11 = r10.containsKey(r1)
            if (r11 == 0) goto L_0x0074
            java.lang.Object r11 = r10.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            r9.f15167k = r11
        L_0x0074:
            java.lang.String r11 = "mbridge_appkey"
            boolean r1 = r10.containsKey(r11)
            if (r1 == 0) goto L_0x0084
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r9.f15168l = r11
        L_0x0084:
            java.lang.String r11 = "applicationID"
            boolean r1 = r10.containsKey(r11)
            if (r1 == 0) goto L_0x0094
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r9.f15171o = r11
        L_0x0094:
            java.lang.String r11 = "mbridge_appstartupcarsh"
            boolean r1 = r10.containsKey(r11)
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            r9.f15166j = r10
        L_0x00a4:
            r9.m15347e()
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r11 = r9.f15167k
            r10.mo42891b((java.lang.String) r11)
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r11 = r9.f15168l
            r10.mo42894c((java.lang.String) r11)
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r11 = r9.f15171o
            r10.mo42888a((java.lang.String) r11)
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            com.mbridge.msdk.foundation.controller.b$6 r11 = new com.mbridge.msdk.foundation.controller.b$6
            r11.<init>()
            android.os.Handler r1 = r9.f15164g
            r10.mo42887a((com.mbridge.msdk.foundation.controller.C6122a.C6128b) r11, (android.os.Handler) r1)
            android.content.Context r10 = r9.f15165i
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.String r11 = "H+tU+FeXHM=="
            java.lang.String r11 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r11)     // Catch:{ all -> 0x0176 }
            r1 = 0
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r11, r1)     // Catch:{ all -> 0x0176 }
            java.lang.String r11 = "H+tU+Fz8"
            java.lang.String r1 = "H+tU+bfPhM=="
            java.lang.String r2 = ""
            if (r10 == 0) goto L_0x00fd
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r1)     // Catch:{ all -> 0x0176 }
            java.lang.String r4 = r10.getString(r4, r2)     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r11)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = r10.getString(r5, r2)     // Catch:{ all -> 0x0176 }
            r8 = r4
            r4 = r2
            r2 = r8
            goto L_0x00fe
        L_0x00fd:
            r4 = r2
        L_0x00fe:
            java.lang.String r5 = com.mbridge.msdk.foundation.same.C6204a.f15401k     // Catch:{ all -> 0x0176 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = "c"
            java.lang.String r7 = "b"
            if (r5 == 0) goto L_0x0126
            java.lang.String r5 = com.mbridge.msdk.foundation.same.C6204a.f15402l     // Catch:{ all -> 0x0176 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0176 }
            if (r5 == 0) goto L_0x0126
            com.mbridge.msdk.foundation.a.a.a r5 = com.mbridge.msdk.foundation.p162a.p163a.C6121a.m15293a()     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = r5.mo42882b(r7)     // Catch:{ all -> 0x0176 }
            com.mbridge.msdk.foundation.same.C6204a.f15401k = r5     // Catch:{ all -> 0x0176 }
            com.mbridge.msdk.foundation.a.a.a r5 = com.mbridge.msdk.foundation.p162a.p163a.C6121a.m15293a()     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = r5.mo42882b(r6)     // Catch:{ all -> 0x0176 }
            com.mbridge.msdk.foundation.same.C6204a.f15402l = r5     // Catch:{ all -> 0x0176 }
        L_0x0126:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0176 }
            if (r5 == 0) goto L_0x015f
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0176 }
            if (r5 == 0) goto L_0x015f
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C6204a.f15401k     // Catch:{ all -> 0x0176 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0176 }
            if (r2 == 0) goto L_0x0143
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C6204a.f15402l     // Catch:{ all -> 0x0176 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0176 }
            if (r2 == 0) goto L_0x0143
            goto L_0x017e
        L_0x0143:
            if (r10 == 0) goto L_0x017e
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x0176 }
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r1)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C6204a.f15401k     // Catch:{ all -> 0x0176 }
            r10.putString(r1, r2)     // Catch:{ all -> 0x0176 }
            java.lang.String r11 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r11)     // Catch:{ all -> 0x0176 }
            java.lang.String r1 = com.mbridge.msdk.foundation.same.C6204a.f15402l     // Catch:{ all -> 0x0176 }
            r10.putString(r11, r1)     // Catch:{ all -> 0x0176 }
            r10.apply()     // Catch:{ all -> 0x0176 }
            goto L_0x017e
        L_0x015f:
            com.mbridge.msdk.foundation.same.C6204a.f15401k = r2     // Catch:{ all -> 0x0176 }
            com.mbridge.msdk.foundation.same.C6204a.f15402l = r4     // Catch:{ all -> 0x0176 }
            com.mbridge.msdk.foundation.a.a.a r10 = com.mbridge.msdk.foundation.p162a.p163a.C6121a.m15293a()     // Catch:{ all -> 0x0176 }
            java.lang.String r11 = com.mbridge.msdk.foundation.same.C6204a.f15401k     // Catch:{ all -> 0x0176 }
            r10.mo42880a((java.lang.String) r7, (java.lang.String) r11)     // Catch:{ all -> 0x0176 }
            com.mbridge.msdk.foundation.a.a.a r10 = com.mbridge.msdk.foundation.p162a.p163a.C6121a.m15293a()     // Catch:{ all -> 0x0176 }
            java.lang.String r11 = com.mbridge.msdk.foundation.same.C6204a.f15402l     // Catch:{ all -> 0x0176 }
            r10.mo42880a((java.lang.String) r6, (java.lang.String) r11)     // Catch:{ all -> 0x0176 }
            goto L_0x017e
        L_0x0176:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r11, r10)
        L_0x017e:
            boolean r10 = com.mbridge.msdk.MBridgeConstans.INIT_UA_IN     // Catch:{ Exception -> 0x01aa }
            if (r10 == 0) goto L_0x018f
            java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.p171f.C6233b.m15776a()     // Catch:{ Exception -> 0x01aa }
            com.mbridge.msdk.foundation.controller.b$2 r11 = new com.mbridge.msdk.foundation.controller.b$2     // Catch:{ Exception -> 0x01aa }
            r11.<init>()     // Catch:{ Exception -> 0x01aa }
            r10.execute(r11)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b2
        L_0x018f:
            android.os.Looper r10 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x01aa }
            android.os.Looper r11 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x01aa }
            if (r10 != r11) goto L_0x01a6
            java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.p171f.C6233b.m15776a()     // Catch:{ Exception -> 0x01aa }
            com.mbridge.msdk.foundation.controller.b$3 r11 = new com.mbridge.msdk.foundation.controller.b$3     // Catch:{ Exception -> 0x01aa }
            r11.<init>()     // Catch:{ Exception -> 0x01aa }
            r10.execute(r11)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b2
        L_0x01a6:
            r9.m15346d()     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b2
        L_0x01aa:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r0, r10)
        L_0x01b2:
            r9.mo42931c()
            android.content.Context r10 = r9.f15165i
            com.mbridge.msdk.foundation.tools.C6363s.m16166a((android.content.Context) r10)
            r9.f15169m = r3
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C6130b.mo42929a(java.util.Map, android.content.Context):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m15346d() {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.c.b");
            cls.getDeclaredMethod("start", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            C6361q.m16155a("SDKController", th.getMessage(), th);
        }
    }

    /* renamed from: e */
    private void m15347e() {
        List<C6191a> a;
        Class<?> cls;
        Object newInstance;
        Object newInstance2;
        try {
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b != null && (a = b.mo42682a()) != null && a.size() > 0) {
                for (C6191a next : a) {
                    if (next.mo43590a() == 287) {
                        Class<?> cls2 = Class.forName("com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler");
                        if (!(this.f15165i == null || cls2 == null || (newInstance2 = cls2.getConstructor(new Class[]{String.class, String.class}).newInstance(new Object[]{"", next.mo43591b()})) == null)) {
                            cls2.getMethod("loadFormSelfFilling", new Class[0]).invoke(newInstance2, new Object[0]);
                        }
                    } else if (!(next.mo43590a() != 94 || (cls = Class.forName("com.mbridge.msdk.out.MBRewardVideoHandler")) == null || (newInstance = cls.getConstructor(new Class[]{String.class, String.class}).newInstance(new Object[]{"", next.mo43591b()})) == null)) {
                        cls.getMethod("loadFormSelfFilling", new Class[0]).invoke(newInstance, new Object[0]);
                    }
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo42930b() {
        Handler handler = this.f15164g;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: c */
    public final void mo42931c() {
        new Thread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x005b A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007d A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0228 A[Catch:{ Exception -> 0x025c }] */
            /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r10 = this;
                    com.mbridge.msdk.foundation.same.report.p182c.C6322a.m16023a()     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.content.Context r0 = r0.f15165i     // Catch:{ Exception -> 0x025c }
                    r1 = 0
                    r2 = 20
                    if (r0 != 0) goto L_0x000f
                    goto L_0x002a
                L_0x000f:
                    com.mbridge.msdk.foundation.db.f r3 = com.mbridge.msdk.foundation.p164db.C6148f.m15420a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.m r3 = com.mbridge.msdk.foundation.p164db.C6155m.m15456a((com.mbridge.msdk.foundation.p164db.C6146e) r3)     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.mo43023a()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x002a
                    com.mbridge.msdk.foundation.db.f r0 = com.mbridge.msdk.foundation.p164db.C6148f.m15420a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.m r0 = com.mbridge.msdk.foundation.p164db.C6155m.m15456a((com.mbridge.msdk.foundation.p164db.C6146e) r0)     // Catch:{ Exception -> 0x025c }
                    java.util.List r0 = r0.mo43026a((int) r2)     // Catch:{ Exception -> 0x025c }
                    goto L_0x002b
                L_0x002a:
                    r0 = r1
                L_0x002b:
                    if (r0 == 0) goto L_0x0047
                    int r3 = r0.size()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0047
                    com.mbridge.msdk.foundation.controller.b r3 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r3 = r3.f15164g     // Catch:{ Exception -> 0x025c }
                    android.os.Message r3 = r3.obtainMessage()     // Catch:{ Exception -> 0x025c }
                    r4 = 2
                    r3.what = r4     // Catch:{ Exception -> 0x025c }
                    r3.obj = r0     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r0 = r0.f15164g     // Catch:{ Exception -> 0x025c }
                    r0.sendMessage(r3)     // Catch:{ Exception -> 0x025c }
                L_0x0047:
                    com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.content.Context r0 = r0.f15165i     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.f r0 = com.mbridge.msdk.foundation.p164db.C6148f.m15420a((android.content.Context) r0)     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.db.c r3 = com.mbridge.msdk.foundation.p164db.C6142c.m15363a((com.mbridge.msdk.foundation.p164db.C6146e) r0)     // Catch:{ Exception -> 0x025c }
                    int r4 = r3.mo42950a()     // Catch:{ Exception -> 0x025c }
                    if (r4 < r2) goto L_0x0073
                    java.util.List r3 = r3.mo42951a((int) r2)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = com.mbridge.msdk.foundation.entity.C6193c.m15509a((java.util.List<com.mbridge.msdk.foundation.entity.C6193c>) r3)     // Catch:{ Exception -> 0x025c }
                    android.os.Message r4 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r4.obj = r3     // Catch:{ Exception -> 0x025c }
                    r3 = 4
                    r4.what = r3     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r3 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r3 = r3.f15164g     // Catch:{ Exception -> 0x025c }
                    r3.sendMessage(r4)     // Catch:{ Exception -> 0x025c }
                L_0x0073:
                    com.mbridge.msdk.foundation.db.k r0 = com.mbridge.msdk.foundation.p164db.C6153k.m15448a((com.mbridge.msdk.foundation.p164db.C6146e) r0)     // Catch:{ Exception -> 0x025c }
                    int r3 = r0.mo43017a()     // Catch:{ Exception -> 0x025c }
                    if (r3 <= r2) goto L_0x0208
                    java.util.List r0 = r0.mo43018a((int) r2)     // Catch:{ Exception -> 0x025c }
                    if (r0 == 0) goto L_0x01f8
                    int r2 = r0.size()     // Catch:{ Exception -> 0x025c }
                    if (r2 <= 0) goto L_0x01f8
                    java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x025c }
                    r1.<init>()     // Catch:{ Exception -> 0x025c }
                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x025c }
                L_0x0092:
                    boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x025c }
                    if (r2 == 0) goto L_0x01f4
                    java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.entity.g r2 = (com.mbridge.msdk.foundation.entity.C6197g) r2     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.authoritycontroller.a r3 = com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a.m15330a()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = "authority_general_data"
                    boolean r3 = r3.mo42922a((java.lang.String) r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = "&fb="
                    java.lang.String r5 = "&key=2000006"
                    java.lang.String r6 = "&unit_id="
                    java.lang.String r7 = "&num="
                    java.lang.String r8 = "&time="
                    java.lang.String r9 = "ad_source_id="
                    if (r3 == 0) goto L_0x0158
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r9)     // Catch:{ Exception -> 0x025c }
                    int r9 = r2.mo43643b()     // Catch:{ Exception -> 0x025c }
                    r3.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r8 = r2.mo43646c()     // Catch:{ Exception -> 0x025c }
                    r3.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r7)     // Catch:{ Exception -> 0x025c }
                    int r7 = r2.mo43649d()     // Catch:{ Exception -> 0x025c }
                    r3.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r6 = r2.mo43651e()     // Catch:{ Exception -> 0x025c }
                    r3.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    r1.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    int r4 = r2.mo43652f()     // Catch:{ Exception -> 0x025c }
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = "&network_str="
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = r2.mo43655i()     // Catch:{ Exception -> 0x025c }
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = "&network_type="
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    int r4 = r2.mo43654h()     // Catch:{ Exception -> 0x025c }
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    goto L_0x01c9
                L_0x0158:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r9)     // Catch:{ Exception -> 0x025c }
                    int r9 = r2.mo43643b()     // Catch:{ Exception -> 0x025c }
                    r3.append(r9)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r8 = r2.mo43646c()     // Catch:{ Exception -> 0x025c }
                    r3.append(r8)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r7)     // Catch:{ Exception -> 0x025c }
                    int r7 = r2.mo43649d()     // Catch:{ Exception -> 0x025c }
                    r3.append(r7)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r6 = r2.mo43651e()     // Catch:{ Exception -> 0x025c }
                    r3.append(r6)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                    r1.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    int r4 = r2.mo43652f()     // Catch:{ Exception -> 0x025c }
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                L_0x01c9:
                    int r3 = r2.mo43640a()     // Catch:{ Exception -> 0x025c }
                    r4 = 1
                    if (r3 != r4) goto L_0x01d5
                    java.lang.String r3 = "&hb=1"
                    r1.append(r3)     // Catch:{ Exception -> 0x025c }
                L_0x01d5:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r3.<init>()     // Catch:{ Exception -> 0x025c }
                    java.lang.String r4 = "&timeout="
                    r3.append(r4)     // Catch:{ Exception -> 0x025c }
                    int r2 = r2.mo43653g()     // Catch:{ Exception -> 0x025c }
                    r3.append(r2)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r2 = "\n"
                    r3.append(r2)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x025c }
                    r1.append(r2)     // Catch:{ Exception -> 0x025c }
                    goto L_0x0092
                L_0x01f4:
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x025c }
                L_0x01f8:
                    android.os.Message r0 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r0.obj = r1     // Catch:{ Exception -> 0x025c }
                    r1 = 5
                    r0.what = r1     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r1 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r1 = r1.f15164g     // Catch:{ Exception -> 0x025c }
                    r1.sendMessage(r0)     // Catch:{ Exception -> 0x025c }
                L_0x0208:
                    com.mbridge.msdk.foundation.same.b.c r0 = com.mbridge.msdk.foundation.same.p167b.C6211c.MBRIDGE_CRASH_INFO     // Catch:{ Exception -> 0x025c }
                    java.lang.String r0 = com.mbridge.msdk.foundation.same.p167b.C6213e.m15725b(r0)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r1 = "/"
                    java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x025c }
                    r2.<init>(r0)     // Catch:{ Exception -> 0x025c }
                    boolean r3 = r2.exists()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x0266
                    boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x025c }
                    if (r3 == 0) goto L_0x0266
                    java.lang.String[] r3 = r2.list()     // Catch:{ Exception -> 0x025c }
                    int r3 = r3.length     // Catch:{ Exception -> 0x025c }
                    if (r3 <= 0) goto L_0x0266
                    java.lang.String[] r2 = r2.list()     // Catch:{ Exception -> 0x025c }
                    int r3 = r2.length     // Catch:{ Exception -> 0x025c }
                    r4 = 0
                L_0x022e:
                    if (r4 >= r3) goto L_0x0266
                    r5 = r2[r4]     // Catch:{ Exception -> 0x025c }
                    java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x025c }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
                    r7.<init>()     // Catch:{ Exception -> 0x025c }
                    r7.append(r0)     // Catch:{ Exception -> 0x025c }
                    r7.append(r1)     // Catch:{ Exception -> 0x025c }
                    r7.append(r5)     // Catch:{ Exception -> 0x025c }
                    java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x025c }
                    r6.<init>(r5)     // Catch:{ Exception -> 0x025c }
                    android.os.Message r5 = android.os.Message.obtain()     // Catch:{ Exception -> 0x025c }
                    r5.obj = r6     // Catch:{ Exception -> 0x025c }
                    r6 = 3
                    r5.what = r6     // Catch:{ Exception -> 0x025c }
                    com.mbridge.msdk.foundation.controller.b r6 = com.mbridge.msdk.foundation.controller.C6130b.this     // Catch:{ Exception -> 0x025c }
                    android.os.Handler r6 = r6.f15164g     // Catch:{ Exception -> 0x025c }
                    r6.sendMessage(r5)     // Catch:{ Exception -> 0x025c }
                    int r4 = r4 + 1
                    goto L_0x022e
                L_0x025c:
                    r0 = move-exception
                    java.lang.String r0 = r0.getMessage()
                    java.lang.String r1 = "SDKController"
                    com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)
                L_0x0266:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C6130b.C61355.run():void");
            }
        }).start();
    }

    /* renamed from: a */
    public final void mo42928a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            this.f15173q = map;
            this.f15174r = i;
            C6122a.m15302b().mo42896e();
            if (map != null) {
                if (this.f15170n == null) {
                    this.f15170n = new C6067a();
                }
                try {
                    if (this.f15173q != null && this.f15173q.size() > 0 && this.f15173q.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE) && ((Integer) this.f15173q.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue() == 0) {
                        Map<String, Object> map2 = this.f15173q;
                        int i2 = this.f15174r;
                        try {
                            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.f.a");
                            Object newInstance = cls.newInstance();
                            cls.getMethod("preload", new Class[]{Map.class, Integer.TYPE}).invoke(newInstance, new Object[]{map2, Integer.valueOf(i2)});
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m15343a(C6130b bVar, String str) {
        if (C6076b.m15089a() != null) {
            if (!C6076b.m15089a().mo42745a(str) || !C6076b.m15089a().mo42746a(str, 1, (String) null)) {
                new C6308c(bVar.f15165i).mo43924a();
                C6076b a = C6076b.m15089a();
                if (a != null) {
                    C6072a b = a.mo42749b(str);
                    if (b != null) {
                        MBridgeConstans.OMID_JS_SERVICE_URL = b.mo42675T();
                        C6280d.m15868c().f15567c = b.mo42703e();
                        C6280d.m15868c().mo43862e();
                        return;
                    }
                    MBridgeConstans.OMID_JS_SERVICE_URL = "https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js";
                    return;
                }
                return;
            }
            new C6083c().mo42766a(bVar.f15165i, str, bVar.f15168l);
        }
    }
}
