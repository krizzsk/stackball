package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: com.inmobi.media.if */
/* compiled from: WifiScanner */
public class C5379if {

    /* renamed from: a */
    private static final String f12320a = C5379if.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Context f12321b = null;

    /* renamed from: c */
    private static Handler f12322c = null;

    /* renamed from: d */
    private static boolean f12323d = false;

    /* renamed from: e */
    private static final IntentFilter f12324e = new IntentFilter("android.net.wifi.SCAN_RESULTS");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static List<C5377id> f12325f;

    /* renamed from: g */
    private static Runnable f12326g = new Runnable() {
        public final void run() {
            C5379if.m12460e();
        }
    };

    /* renamed from: h */
    private static final BroadcastReceiver f12327h = new BroadcastReceiver() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.inmobi.media.id} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r8, android.content.Intent r9) {
            /*
                r7 = this;
                android.content.Context r8 = com.inmobi.media.C5379if.f12321b
                java.lang.String r9 = "wifi"
                java.lang.Object r8 = r8.getSystemService(r9)
                android.net.wifi.WifiManager r8 = (android.net.wifi.WifiManager) r8
                com.inmobi.media.C5379if.m12460e()
                java.util.List r8 = r8.getScanResults()
                com.inmobi.media.C5371hz.m12430a()
                com.inmobi.media.fl$b r9 = com.inmobi.media.C5371hz.m12431d()
                com.inmobi.media.fl$c r9 = r9.f12045w
                int r9 = r9.f12046wf
                boolean r0 = com.inmobi.media.C5378ie.m12451a((int) r9)
                r1 = 1
                boolean r9 = com.inmobi.media.C5378ie.m12452a((int) r9, (int) r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                if (r8 == 0) goto L_0x0066
                java.util.Iterator r8 = r8.iterator()
            L_0x0032:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L_0x0066
                java.lang.Object r2 = r8.next()
                android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
                java.lang.String r3 = r2.SSID
                boolean r3 = com.inmobi.media.C5378ie.m12453a((boolean) r0, (java.lang.String) r3)
                if (r3 != 0) goto L_0x0032
                r3 = 0
                if (r2 == 0) goto L_0x0062
                com.inmobi.media.id r4 = new com.inmobi.media.id
                r4.<init>()
                java.lang.String r5 = r2.BSSID
                long r5 = com.inmobi.media.C5378ie.m12449a((java.lang.String) r5)
                r4.f12316a = r5
                if (r9 == 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                java.lang.String r3 = r2.SSID
            L_0x005b:
                r4.f12317b = r3
                int r2 = r2.level
                r4.f12318c = r2
                r3 = r4
            L_0x0062:
                r1.add(r3)
                goto L_0x0032
            L_0x0066:
                java.util.List unused = com.inmobi.media.C5379if.f12325f = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5379if.C53812.onReceive(android.content.Context, android.content.Intent):void");
        }
    };

    /* renamed from: a */
    public static void m12455a() {
        f12321b = C5314go.m12203c();
        m12456a(Looper.myLooper());
    }

    /* renamed from: b */
    public static List<C5377id> m12457b() {
        return f12325f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m12456a(android.os.Looper r6) {
        /*
            java.lang.Class<com.inmobi.media.if> r0 = com.inmobi.media.C5379if.class
            monitor-enter(r0)
            android.os.Handler r1 = f12322c     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            android.content.Context r1 = com.inmobi.media.C5314go.m12203c()     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x004a }
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            boolean r2 = r1.isWifiEnabled()     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0022
            goto L_0x0048
        L_0x0022:
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x004a }
            r2.<init>(r6)     // Catch:{ all -> 0x004a }
            f12322c = r2     // Catch:{ all -> 0x004a }
            java.lang.Runnable r6 = f12326g     // Catch:{ all -> 0x004a }
            r3 = 10000(0x2710, double:4.9407E-320)
            r2.postDelayed(r6, r3)     // Catch:{ all -> 0x004a }
            boolean r6 = f12323d     // Catch:{ all -> 0x004a }
            if (r6 != 0) goto L_0x0043
            r6 = 1
            f12323d = r6     // Catch:{ all -> 0x004a }
            android.content.Context r6 = f12321b     // Catch:{ all -> 0x004a }
            android.content.BroadcastReceiver r2 = f12327h     // Catch:{ all -> 0x004a }
            android.content.IntentFilter r3 = f12324e     // Catch:{ all -> 0x004a }
            r4 = 0
            android.os.Handler r5 = f12322c     // Catch:{ all -> 0x004a }
            r6.registerReceiver(r2, r3, r4, r5)     // Catch:{ all -> 0x004a }
        L_0x0043:
            r1.startScan()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return
        L_0x0048:
            monitor-exit(r0)
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5379if.m12456a(android.os.Looper):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m12460e() {
        synchronized (C5379if.class) {
            if (f12322c != null) {
                f12322c.removeCallbacks(f12326g);
                if (f12323d) {
                    f12323d = false;
                    try {
                        f12321b.unregisterReceiver(f12327h);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                f12322c = null;
                f12321b = null;
            }
        }
    }
}
