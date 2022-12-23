package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import com.tapjoy.internal.C9232ev;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.gz */
public final class C9344gz {

    /* renamed from: q */
    private static final C9344gz f23107q;

    /* renamed from: r */
    private static C9344gz f23108r;

    /* renamed from: w */
    private static Handler f23109w;

    /* renamed from: x */
    private static File f23110x;

    /* renamed from: a */
    public final C9366hh f23111a = new C9366hh(this);

    /* renamed from: b */
    public C9367hi f23112b;

    /* renamed from: c */
    public boolean f23113c = false;

    /* renamed from: d */
    public String f23114d = null;

    /* renamed from: e */
    public Context f23115e;

    /* renamed from: f */
    public C9357hc f23116f;

    /* renamed from: g */
    public C9343gy f23117g;

    /* renamed from: h */
    public C9373hm f23118h;

    /* renamed from: i */
    public C9341gx f23119i;

    /* renamed from: j */
    public String f23120j;

    /* renamed from: k */
    public boolean f23121k;

    /* renamed from: l */
    public String f23122l;

    /* renamed from: m */
    public String f23123m;

    /* renamed from: n */
    public boolean f23124n = false;

    /* renamed from: o */
    public String f23125o;

    /* renamed from: p */
    public C9347ha f23126p = C9347ha.m25088a((C9327go) null);

    /* renamed from: s */
    private boolean f23127s = false;

    /* renamed from: t */
    private boolean f23128t = false;

    /* renamed from: u */
    private String f23129u;

    /* renamed from: v */
    private String f23130v;

    static {
        C9344gz gzVar = new C9344gz();
        f23107q = gzVar;
        f23108r = gzVar;
    }

    /* renamed from: a */
    public static C9344gz m25060a() {
        return f23108r;
    }

    private C9344gz() {
    }

    /* renamed from: b */
    public final synchronized void mo58248b(Context context) {
        if (this.f23115e == null) {
            Context applicationContext = context.getApplicationContext();
            this.f23115e = applicationContext;
            C9300ga.m24929a().mo58171a(applicationContext);
            this.f23116f = C9357hc.m25129a(applicationContext);
            File file = new File(m25065c(applicationContext), "events2");
            if (this.f23119i == null) {
                this.f23119i = new C9341gx(file);
            }
            C9343gy gyVar = new C9343gy(this.f23116f, this.f23119i);
            this.f23117g = gyVar;
            this.f23118h = new C9373hm(gyVar);
            this.f23112b = new C9367hi(applicationContext);
            C9314gf.m24957a(new C9318gh(new File(m25065c(applicationContext), "usages"), this.f23117g));
            C9386ht htVar = C9386ht.f23261a;
            htVar.f23262b = applicationContext.getApplicationContext();
            htVar.f23263c = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2E", 0);
            htVar.f23264d = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2U", 0);
            htVar.mo58321a();
        }
    }

    /* renamed from: a */
    public final C9250fb mo58239a(boolean z) {
        if (z) {
            this.f23116f.mo58284a();
        }
        return this.f23116f.mo58290b();
    }

    /* renamed from: b */
    public final synchronized void mo58247b() {
        if (this.f23121k) {
            C9355hb.m25106b(this.f23115e).mo58269e(this.f23114d);
            mo58241a((String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58241a(@javax.annotation.Nullable final java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f23121k     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0040
            if (r6 != 0) goto L_0x000d
            java.lang.String r0 = r5.f23125o     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x000d
            java.lang.String r6 = r5.f23125o     // Catch:{ all -> 0x0046 }
        L_0x000d:
            r0 = 0
            r5.f23125o = r0     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x0044
            com.tapjoy.internal.hc r0 = r5.f23116f     // Catch:{ all -> 0x0046 }
            com.tapjoy.internal.fb r0 = r0.mo58290b()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "GCM registration id of device {} updated for sender {}: {}"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            r3 = 0
            com.tapjoy.internal.fa r4 = r0.f22800d     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = r4.f22764h     // Catch:{ all -> 0x0046 }
            r2[r3] = r4     // Catch:{ all -> 0x0046 }
            r3 = 1
            java.lang.String r4 = r5.f23114d     // Catch:{ all -> 0x0046 }
            r2[r3] = r4     // Catch:{ all -> 0x0046 }
            r3 = 2
            r2[r3] = r6     // Catch:{ all -> 0x0046 }
            com.tapjoy.internal.C9340gw.m25045a((java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0046 }
            com.tapjoy.internal.il r1 = new com.tapjoy.internal.il     // Catch:{ all -> 0x0046 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x0046 }
            com.tapjoy.internal.gz$1 r0 = new com.tapjoy.internal.gz$1     // Catch:{ all -> 0x0046 }
            r0.<init>(r6)     // Catch:{ all -> 0x0046 }
            java.util.concurrent.ExecutorService r6 = com.tapjoy.internal.C9120ca.f22437a     // Catch:{ all -> 0x0046 }
            r1.mo57903a((com.tapjoy.internal.C9125cf) r0, (java.util.concurrent.ExecutorService) r6)     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return
        L_0x0040:
            if (r6 == 0) goto L_0x0044
            r5.f23125o = r6     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r5)
            return
        L_0x0046:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9344gz.mo58241a(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo58249b(String str) {
        C9343gy gyVar = this.f23117g;
        C9232ev.C9233a a = gyVar.mo58234a(C9241ey.APP, "push_ignore");
        a.f22725s = new C9253fc((String) null, (String) null, str);
        gyVar.mo58235a(a);
    }

    /* renamed from: a */
    public final boolean mo58246a(Context context, String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        mo58248b(context);
        if (!this.f23116f.mo58288a(str, currentTimeMillis, z)) {
            return false;
        }
        C9343gy gyVar = this.f23117g;
        C9232ev.C9233a a = gyVar.mo58234a(C9241ey.APP, "push_show");
        a.f22725s = new C9253fc((String) null, (String) null, str);
        gyVar.mo58235a(a);
        return true;
    }

    /* renamed from: a */
    public static void m25063a(GLSurfaceView gLSurfaceView) {
        if (C9340gw.m25046a((Object) gLSurfaceView, "setGLSurfaceView: The given GLSurfaceView was null")) {
            C9330gr.m25023a(gLSurfaceView);
        }
    }

    /* renamed from: c */
    public final Set mo58250c() {
        if (!mo58253d("getUserTags")) {
            return new HashSet();
        }
        return this.f23116f.mo58296e();
    }

    /* renamed from: a */
    public final void mo58245a(Set set) {
        if (mo58253d("setUserTags")) {
            if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        String trim = str.trim();
                        if (!trim.isEmpty() && trim.length() <= 200) {
                            hashSet.add(trim);
                            if (hashSet.size() >= 200) {
                                break;
                            }
                        }
                    }
                }
                set = hashSet;
            }
            C9357hc hcVar = this.f23116f;
            synchronized (hcVar) {
                if (set != null) {
                    if (!set.isEmpty()) {
                        hcVar.f23156c.f23223z.mo58487a(Base64.encodeToString(C9265fg.f22858c.mo57999b(new C9265fg(new ArrayList(set))), 2));
                        hcVar.f23155b.f22903A.clear();
                        hcVar.f23155b.f22903A.addAll(set);
                    }
                }
                hcVar.f23156c.f23223z.mo58484c();
                hcVar.f23155b.f22903A.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061 A[SYNTHETIC, Splitter:B:39:0x0061] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58240a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f23121k     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r3.mo58248b((android.content.Context) r4)     // Catch:{ all -> 0x0115 }
            android.content.Context r4 = r3.f23115e     // Catch:{ all -> 0x0115 }
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0012
            r4 = 1
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            java.lang.String r2 = "The given context was null"
            boolean r4 = com.tapjoy.internal.C9340gw.m25047a((boolean) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x001d
            monitor-exit(r3)
            return
        L_0x001d:
            if (r8 == 0) goto L_0x0031
            int r4 = r8.length()     // Catch:{ all -> 0x0115 }
            r2 = 24
            if (r4 != r2) goto L_0x0031
            java.lang.String r4 = "[0-9a-f]{24}"
            boolean r4 = r8.matches(r4)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x0031
            r4 = 1
            goto L_0x003b
        L_0x0031:
            java.lang.String r4 = "Invalid App ID: {}"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0115 }
            r2[r1] = r8     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.C9340gw.m25049b(r4, r2)     // Catch:{ all -> 0x0115 }
            r4 = 0
        L_0x003b:
            if (r4 != 0) goto L_0x003f
            monitor-exit(r3)
            return
        L_0x003f:
            if (r9 == 0) goto L_0x0053
            int r4 = r9.length()     // Catch:{ all -> 0x0115 }
            r2 = 20
            if (r4 != r2) goto L_0x0053
            java.lang.String r4 = "[0-9A-Za-z\\-_]{20}"
            boolean r4 = r9.matches(r4)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x0053
            r4 = 1
            goto L_0x005d
        L_0x0053:
            java.lang.String r4 = "Invalid App Key: {}"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0115 }
            r2[r1] = r9     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.C9340gw.m25049b(r4, r2)     // Catch:{ all -> 0x0115 }
            r4 = 0
        L_0x005d:
            if (r4 != 0) goto L_0x0061
            monitor-exit(r3)
            return
        L_0x0061:
            r3.f23122l = r5     // Catch:{ all -> 0x0115 }
            r3.f23123m = r6     // Catch:{ all -> 0x0115 }
            r3.f23129u = r8     // Catch:{ all -> 0x0115 }
            r3.f23130v = r9     // Catch:{ all -> 0x0115 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x010e }
            r4.<init>(r7)     // Catch:{ MalformedURLException -> 0x010e }
            java.lang.String r5 = "TapjoySDK"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r7.<init>()     // Catch:{ all -> 0x0115 }
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = " "
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            r7.append(r6)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = " ("
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0115 }
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "; Android "
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0115 }
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "; "
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0115 }
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = ")"
            r7.append(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.ce r6 = new com.tapjoy.internal.ce     // Catch:{ all -> 0x0115 }
            r6.<init>(r5, r4)     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.C9120ca.f22438b = r6     // Catch:{ all -> 0x0115 }
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.C9120ca.f22437a = r4     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.gx r4 = r3.f23119i     // Catch:{ all -> 0x0115 }
            r4.f23097b = r6     // Catch:{ all -> 0x0115 }
            r4.mo58230a()     // Catch:{ all -> 0x0115 }
            r3.f23121k = r0     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.hd r4 = new com.tapjoy.internal.hd     // Catch:{ all -> 0x0115 }
            android.content.Context r5 = r3.f23115e     // Catch:{ all -> 0x0115 }
            java.io.File r5 = m25066d((android.content.Context) r5)     // Catch:{ all -> 0x0115 }
            r4.<init>(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = r4.mo58299b()     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r0 = 0
        L_0x00d2:
            if (r0 != 0) goto L_0x00e7
            boolean r4 = r4.mo58298a()     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x00e7
            com.tapjoy.internal.gy r4 = r3.f23117g     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.ey r5 = com.tapjoy.internal.C9241ey.APP     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = "install"
            com.tapjoy.internal.ev$a r5 = r4.mo58234a(r5, r6)     // Catch:{ all -> 0x0115 }
            r4.mo58235a(r5)     // Catch:{ all -> 0x0115 }
        L_0x00e7:
            com.tapjoy.internal.hc r4 = r3.f23116f     // Catch:{ all -> 0x0115 }
            boolean r5 = com.tapjoy.internal.C9465jq.m25449c(r8)     // Catch:{ all -> 0x0115 }
            if (r5 != 0) goto L_0x0109
            com.tapjoy.internal.hj r5 = r4.f23156c     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.o r5 = r5.f23197D     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = r5.mo58486a()     // Catch:{ all -> 0x0115 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0115 }
            if (r5 != 0) goto L_0x0109
            com.tapjoy.internal.hj r5 = r4.f23156c     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.o r5 = r5.f23197D     // Catch:{ all -> 0x0115 }
            r5.mo58487a(r8)     // Catch:{ all -> 0x0115 }
            com.tapjoy.internal.hj r4 = r4.f23156c     // Catch:{ all -> 0x0115 }
            r4.mo58307a((boolean) r1)     // Catch:{ all -> 0x0115 }
        L_0x0109:
            r3.mo58247b()     // Catch:{ all -> 0x0115 }
            monitor-exit(r3)
            return
        L_0x010e:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0115 }
            r5.<init>(r4)     // Catch:{ all -> 0x0115 }
            throw r5     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9344gz.mo58240a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: c */
    public final boolean mo58251c(String str) {
        if ((this.f23121k || this.f23120j != null) && this.f23115e != null) {
            return true;
        }
        if (!C9340gw.f23095a) {
            return false;
        }
        C9340gw.m25048b(str + ": Should be called after initializing the SDK");
        return false;
    }

    /* renamed from: d */
    public final boolean mo58253d(String str) {
        if (this.f23115e != null) {
            return true;
        }
        if (!C9340gw.f23095a) {
            return false;
        }
        C9340gw.m25048b(str + ": Should be called after initializing the SDK");
        return false;
    }

    /* renamed from: d */
    public final boolean mo58252d() {
        C9373hm hmVar = this.f23118h;
        return hmVar != null && hmVar.f23235b.get();
    }

    /* renamed from: e */
    public final boolean mo58254e() {
        boolean z;
        C9373hm hmVar = this.f23118h;
        if (hmVar.f23236c != null) {
            hmVar.f23236c.cancel(false);
            hmVar.f23236c = null;
        }
        if (hmVar.f23235b.compareAndSet(false, true)) {
            C9340gw.m25043a("New session started");
            C9343gy gyVar = hmVar.f23234a;
            C9253fc d = gyVar.f23102a.mo58295d();
            C9357hc hcVar = gyVar.f23102a;
            synchronized (hcVar) {
                int b = hcVar.f23156c.f23205h.mo58454b() + 1;
                hcVar.f23156c.f23205h.mo58452a(b);
                hcVar.f23155b.f22910h = Integer.valueOf(b);
            }
            C9232ev.C9233a a = gyVar.mo58234a(C9241ey.APP, "bootup");
            gyVar.f23104c = SystemClock.elapsedRealtime();
            if (d != null) {
                a.f22725s = d;
            }
            gyVar.mo58235a(a);
            C9288fs.f22967c.notifyObservers();
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        C9366hh hhVar = this.f23111a;
        synchronized (hhVar) {
            hhVar.f23188b = null;
        }
        C9386ht.f23261a.mo58321a();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58242a(Map map) {
        C9343gy gyVar = this.f23117g;
        C9232ev.C9233a a = gyVar.mo58234a(C9241ey.CAMPAIGN, "impression");
        if (map != null) {
            a.f22724r = C9092bh.m24336a((Object) map);
        }
        gyVar.mo58235a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58243a(Map map, long j) {
        C9343gy gyVar = this.f23117g;
        C9232ev.C9233a a = gyVar.mo58234a(C9241ey.CAMPAIGN, "view");
        a.f22715i = Long.valueOf(j);
        if (map != null) {
            a.f22724r = C9092bh.m24336a((Object) map);
        }
        gyVar.mo58235a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58244a(Map map, String str) {
        C9343gy gyVar = this.f23117g;
        C9232ev.C9233a a = gyVar.mo58234a(C9241ey.CAMPAIGN, "click");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("region", str);
        a.f22724r = C9092bh.m24336a((Object) linkedHashMap);
        gyVar.mo58235a(a);
    }

    /* renamed from: a */
    public static synchronized void m25064a(Runnable runnable) {
        synchronized (C9344gz.class) {
            if (f23109w == null) {
                f23109w = new Handler(Looper.getMainLooper());
            }
            f23109w.post(runnable);
        }
    }

    /* renamed from: c */
    public static synchronized File m25065c(Context context) {
        File file;
        synchronized (C9344gz.class) {
            if (f23110x == null) {
                f23110x = context.getDir("fiverocks", 0);
            }
            file = f23110x;
        }
        return file;
    }

    /* renamed from: d */
    static File m25066d(Context context) {
        return new File(m25065c(context), "install");
    }

    /* renamed from: a */
    public static String m25062a(Context context, Intent intent) {
        String a = C9146d.m24489a(intent);
        if (a != null) {
            C9344gz gzVar = f23108r;
            gzVar.mo58248b(context);
            if (C9465jq.m25449c(gzVar.f23116f.mo58293c()) || intent.getBooleanExtra("fiverocks:force", false)) {
                C9357hc hcVar = gzVar.f23116f;
                synchronized (hcVar) {
                    hcVar.f23156c.f23201d.mo58487a(a);
                    hcVar.f23155b.f22906d = a;
                }
                if (a.length() > 0) {
                    C9343gy gyVar = gzVar.f23117g;
                    gyVar.mo58235a(gyVar.mo58234a(C9241ey.APP, "referrer"));
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static C9344gz m25061a(Context context) {
        C9344gz gzVar = f23108r;
        gzVar.mo58248b(context);
        return gzVar;
    }
}
