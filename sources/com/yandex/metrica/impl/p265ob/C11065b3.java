package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.b3 */
public class C11065b3 {

    /* renamed from: l */
    private static volatile C11065b3 f26568l;

    /* renamed from: m */
    private static final Object f26569m = new Object();

    /* renamed from: a */
    private final Context f26570a;

    /* renamed from: b */
    private final WifiManager f26571b;

    /* renamed from: c */
    private C11241fe f26572c;

    /* renamed from: d */
    private C11491le f26573d;

    /* renamed from: e */
    private C10530Mm f26574e;

    /* renamed from: f */
    private C10791Tm<Context, Intent, Void> f26575f;

    /* renamed from: g */
    private C10675Qi f26576g;

    /* renamed from: h */
    private final C11281ge f26577h;

    /* renamed from: i */
    private final C11281ge f26578i;

    /* renamed from: j */
    private final C11100c3 f26579j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C11130d3 f26580k;

    private C11065b3(Context context, WifiManager wifiManager, C11491le leVar) {
        this(context, wifiManager, leVar, new C11241fe(leVar.mo63280a()));
    }

    /* access modifiers changed from: private */
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
    /* renamed from: c */
    public java.util.List<com.yandex.metrica.impl.p265ob.C10977Z2> m28566c() {
        /*
            r15 = this;
            monitor-enter(r15)
            monitor-enter(r15)     // Catch:{ all -> 0x0143 }
            com.yandex.metrica.impl.ob.Qi r0 = r15.f26576g     // Catch:{ all -> 0x0140 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            monitor-exit(r15)     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x0018
            com.yandex.metrica.impl.ob.si r0 = r0.mo62014f()     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.f28195q     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r15)
            r3 = 0
            if (r0 == 0) goto L_0x0030
            com.yandex.metrica.impl.ob.ge r0 = r15.f26577h
            android.content.Context r4 = r15.f26570a
            boolean r0 = r0.mo62489a(r4)
            if (r0 == 0) goto L_0x0030
            android.net.wifi.WifiManager r0 = r15.f26571b
            if (r0 == 0) goto L_0x0030
            java.util.List r0 = r0.getScanResults()     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            monitor-enter(r15)
            monitor-enter(r15)     // Catch:{ all -> 0x013d }
            com.yandex.metrica.impl.ob.Qi r4 = r15.f26576g     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            monitor-exit(r15)     // Catch:{ all -> 0x013d }
            if (r5 == 0) goto L_0x0047
            com.yandex.metrica.impl.ob.si r4 = r4.mo62014f()     // Catch:{ all -> 0x013d }
            boolean r4 = r4.f28196r     // Catch:{ all -> 0x013d }
            if (r4 == 0) goto L_0x0047
            r4 = 1
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            monitor-exit(r15)
            if (r4 == 0) goto L_0x007d
            com.yandex.metrica.impl.ob.fe r4 = r15.f26572c
            android.content.Context r5 = r15.f26570a
            boolean r4 = r4.mo62900c(r5)
            if (r4 == 0) goto L_0x007d
            android.net.wifi.WifiManager r4 = r15.f26571b
            if (r4 == 0) goto L_0x007d
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x007e
            java.lang.String r5 = r4.getBSSID()     // Catch:{ all -> 0x007d }
            java.lang.String r6 = "00:00:00:00:00:00"
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = r4.getBSSID()     // Catch:{ all -> 0x007d }
            java.lang.String r6 = "02:00:00:00:00:00"
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007d
            int r5 = r4.getIpAddress()     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007e
        L_0x007d:
            r4 = r3
        L_0x007e:
            if (r4 != 0) goto L_0x0082
            r5 = r3
            goto L_0x0086
        L_0x0082:
            java.lang.String r5 = r4.getBSSID()
        L_0x0086:
            java.util.ArrayList r6 = new java.util.ArrayList
            if (r0 != 0) goto L_0x008c
            r7 = 0
            goto L_0x0090
        L_0x008c:
            int r7 = r0.size()
        L_0x0090:
            if (r4 != 0) goto L_0x0093
            r1 = 0
        L_0x0093:
            int r7 = r7 + r1
            r6.<init>(r7)
            boolean r1 = com.yandex.metrica.impl.p265ob.C10796U2.m27896b((java.util.Collection) r0)
            if (r1 != 0) goto L_0x00fc
            java.util.Iterator r0 = r0.iterator()
        L_0x00a1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r0.next()
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
            if (r1 == 0) goto L_0x00a1
            java.lang.String r4 = r1.BSSID
            java.lang.String r7 = "02:00:00:00:00:00"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x00a1
            java.lang.String r4 = r1.BSSID     // Catch:{ NoSuchFieldError -> 0x00d4 }
            if (r4 == 0) goto L_0x00d1
            boolean r7 = r4.equals(r5)     // Catch:{ NoSuchFieldError -> 0x00d4 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ NoSuchFieldError -> 0x00d5 }
            java.lang.String r4 = r4.toUpperCase(r8)     // Catch:{ NoSuchFieldError -> 0x00d5 }
            java.lang.String r8 = ":"
            java.lang.String r9 = ""
            java.lang.String r4 = r4.replace(r8, r9)     // Catch:{ NoSuchFieldError -> 0x00d5 }
            r9 = r4
            goto L_0x00d6
        L_0x00d1:
            r9 = r3
            r11 = 0
            goto L_0x00d7
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            r9 = r3
        L_0x00d6:
            r11 = r7
        L_0x00d7:
            com.yandex.metrica.impl.ob.Z2 r4 = new com.yandex.metrica.impl.ob.Z2
            java.lang.String r10 = r1.SSID
            int r12 = r1.level
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 17
            if (r7 < r8) goto L_0x00f3
            com.yandex.metrica.impl.ob.Mm r7 = r15.f26574e
            long r13 = r1.timestamp
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r7 = r7.mo61804a(r13, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r13 = r1
            goto L_0x00f4
        L_0x00f3:
            r13 = r3
        L_0x00f4:
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r6.add(r4)
            goto L_0x00a1
        L_0x00fc:
            if (r4 == 0) goto L_0x0135
            if (r5 != 0) goto L_0x0102
            r8 = r3
            goto L_0x0111
        L_0x0102:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r5.toUpperCase(r0)
            java.lang.String r1 = ":"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            r8 = r0
        L_0x0111:
            java.lang.String r0 = r4.getSSID()
            if (r0 != 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            java.lang.String r1 = "\""
            java.lang.String r2 = ""
            java.lang.String r3 = r0.replace(r1, r2)
        L_0x0120:
            r9 = r3
            com.yandex.metrica.impl.ob.Z2 r0 = new com.yandex.metrica.impl.ob.Z2
            int r11 = r4.getRssi()
            r1 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            r10 = 1
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r6.add(r0)
        L_0x0135:
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            return r0
        L_0x013a:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0140:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11065b3.m28566c():java.util.List");
    }

    /* renamed from: a */
    public static C11065b3 m28563a(Context context) {
        if (f26568l == null) {
            synchronized (f26569m) {
                if (f26568l == null) {
                    Context applicationContext = context.getApplicationContext();
                    f26568l = new C11065b3(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI), new C11491le());
                }
            }
        }
        return f26568l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.yandex.metrica.impl.p265ob.C10977Z2> mo62683b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.fe r0 = r2.f26572c     // Catch:{ all -> 0x0033 }
            android.content.Context r1 = r2.f26570a     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.mo62900c(r1)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x0025
        L_0x000d:
            android.net.wifi.WifiManager r0 = r2.f26571b     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isWifiEnabled()     // Catch:{ all -> 0x001c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r0
        L_0x0021:
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0033 }
        L_0x0025:
            if (r0 != 0) goto L_0x002d
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.util.List r0 = r2.m28566c()     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11065b3.mo62683b():java.util.List");
    }

    private C11065b3(Context context, WifiManager wifiManager, C11491le leVar, C11241fe feVar) {
        this(context, wifiManager, leVar, new C10530Mm(), feVar, new C11012a2(), new C11100c3(), C10619P0.m27164i().mo61882j().mo63394d());
    }

    /* renamed from: a */
    public void mo62680a(C10675Qi qi) {
        this.f26576g = qi;
        this.f26573d.mo63281a(qi);
        this.f26572c.mo62897a(this.f26573d.mo63280a());
        if (qi.mo62012d() != null) {
            C11100c3 c3Var = this.f26579j;
            C11659pi d = qi.mo62012d();
            c3Var.f25435a.mo61845a(d.f27982b, c3Var.mo61940a(d));
        }
    }

    C11065b3(Context context, WifiManager wifiManager, C11491le leVar, C10530Mm mm, C11241fe feVar, C11012a2 a2Var, C11100c3 c3Var, C11130d3 d3Var) {
        this.f26570a = context;
        this.f26571b = wifiManager;
        this.f26573d = leVar;
        this.f26572c = feVar;
        this.f26577h = a2Var.mo62632d(feVar);
        this.f26578i = a2Var.mo62633e(feVar);
        this.f26574e = mm;
        this.f26579j = c3Var;
        this.f26580k = d3Var;
    }

    /* renamed from: a */
    public void mo62681a(boolean z) {
        this.f26573d.mo63282a(z);
        this.f26572c.mo62897a(this.f26573d.mo63280a());
    }

    /* renamed from: a */
    public synchronized boolean mo62682a(CountDownLatch countDownLatch, C11125d0<List<C10977Z2>> d0Var) {
        Boolean bool;
        if (!this.f26578i.mo62489a(this.f26570a)) {
            return false;
        }
        if (this.f26575f == null) {
            this.f26575f = new C11022a3(this, d0Var, countDownLatch);
        }
        this.f26580k.mo62739a(this.f26575f);
        WifiManager wifiManager = this.f26571b;
        if (wifiManager != null) {
            try {
                bool = Boolean.valueOf(wifiManager.startScan());
            } catch (Throwable unused) {
            }
            return Boolean.TRUE.equals(bool);
        }
        bool = null;
        return Boolean.TRUE.equals(bool);
    }

    /* renamed from: a */
    public C11100c3 mo62679a() {
        return this.f26579j;
    }
}
