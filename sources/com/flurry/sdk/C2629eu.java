package com.flurry.sdk;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.flurry.sdk.C2622ep;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.eu */
public class C2629eu {

    /* renamed from: a */
    public static final String f6184a = C2629eu.class.getSimpleName();

    /* renamed from: a */
    public static Map<String, String> m5725a(boolean z) {
        final HashMap hashMap = new HashMap();
        try {
            hashMap.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e) {
            C2530db.m5477a(f6184a, "Error retrieving max memory", (Throwable) e);
        }
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            hashMap.put("mem.pss", Long.toString((long) (memoryInfo.getTotalPss() * 1024)));
        } catch (RuntimeException e2) {
            C2530db.m5477a(f6184a, "Error retrieving pss memory", (Throwable) e2);
        }
        if (C2494ck.m5375c()) {
            hashMap.put("application.state", Integer.toString(C2622ep.C2623a.ACTIVE.f6158e));
        } else {
            hashMap.put("application.state", Integer.toString(C2622ep.C2623a.BACKGROUND.f6158e));
        }
        int i = -1;
        try {
            C2449bq.m5261a();
            i = C2449bq.m5274l() - 1;
        } catch (Exception unused) {
        }
        hashMap.put("net.status", Integer.toString(i));
        int i2 = 0;
        try {
            i2 = C2616ek.m5685a();
        } catch (RuntimeException unused2) {
        }
        hashMap.put("orientation", Integer.toString(i2));
        if (!z) {
            C2494ck.m5371a().mo17685b(new Runnable() {
                public final void run() {
                    C2629eu.m5729d(hashMap);
                    C2629eu.m5726a((Map<String, String>) hashMap);
                    C2629eu.m5727b(hashMap);
                }
            });
        } else {
            m5729d(hashMap);
            m5726a((Map<String, String>) hashMap);
            m5727b(hashMap);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:65:0x00d8=Splitter:B:65:0x00d8, B:60:0x00cf=Splitter:B:60:0x00cf} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5729d(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "^Vm(RSS|Size|Peak):\\s+(\\d+)\\s+kB$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "/proc/"
            r2.<init>(r3)
            int r3 = android.os.Process.myPid()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "status"
            r2.<init>(r1, r3)
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00cd, all -> 0x00ca }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00cd, all -> 0x00ca }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00c6, IOException -> 0x00c2, all -> 0x00be }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00c6, IOException -> 0x00c2, all -> 0x00be }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00c6, IOException -> 0x00c2, all -> 0x00be }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00c6, IOException -> 0x00c2, all -> 0x00be }
            java.lang.String r1 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
        L_0x003f:
            if (r1 == 0) goto L_0x00b1
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            boolean r4 = r1.find()     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            if (r4 == 0) goto L_0x00ac
            r4 = 1
            java.lang.String r5 = r1.group(r4)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            r6 = 2
            java.lang.String r1 = r1.group(r6)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            if (r7 != 0) goto L_0x00ac
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            if (r7 == 0) goto L_0x0062
            goto L_0x00ac
        L_0x0062:
            r7 = -1
            int r8 = r5.hashCode()     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            r9 = 81458(0x13e32, float:1.14147E-40)
            if (r8 == r9) goto L_0x008b
            r9 = 2483455(0x25e4ff, float:3.480062E-39)
            if (r8 == r9) goto L_0x0081
            r9 = 2577441(0x275421, float:3.611764E-39)
            if (r8 == r9) goto L_0x0077
            goto L_0x0094
        L_0x0077:
            java.lang.String r8 = "Size"
            boolean r5 = r5.equals(r8)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            if (r5 == 0) goto L_0x0094
            r7 = 1
            goto L_0x0094
        L_0x0081:
            java.lang.String r8 = "Peak"
            boolean r5 = r5.equals(r8)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            if (r5 == 0) goto L_0x0094
            r7 = 2
            goto L_0x0094
        L_0x008b:
            java.lang.String r8 = "RSS"
            boolean r5 = r5.equals(r8)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            if (r5 == 0) goto L_0x0094
            r7 = 0
        L_0x0094:
            if (r7 == 0) goto L_0x00a7
            if (r7 == r4) goto L_0x00a1
            if (r7 == r6) goto L_0x009b
            goto L_0x00ac
        L_0x009b:
            java.lang.String r4 = "mem.virt.max"
            r10.put(r4, r1)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            goto L_0x00ac
        L_0x00a1:
            java.lang.String r4 = "mem.virt"
            r10.put(r4, r1)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            goto L_0x00ac
        L_0x00a7:
            java.lang.String r4 = "mem.rss"
            r10.put(r4, r1)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
        L_0x00ac:
            java.lang.String r1 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ba, all -> 0x00b8 }
            goto L_0x003f
        L_0x00b1:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r3)
        L_0x00b4:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r2)
            return
        L_0x00b8:
            r10 = move-exception
            goto L_0x00c0
        L_0x00ba:
            r10 = move-exception
            goto L_0x00c4
        L_0x00bc:
            r10 = move-exception
            goto L_0x00c8
        L_0x00be:
            r10 = move-exception
            r2 = r1
        L_0x00c0:
            r1 = r3
            goto L_0x00dd
        L_0x00c2:
            r10 = move-exception
            r2 = r1
        L_0x00c4:
            r1 = r3
            goto L_0x00cf
        L_0x00c6:
            r10 = move-exception
            r2 = r1
        L_0x00c8:
            r1 = r3
            goto L_0x00d8
        L_0x00ca:
            r10 = move-exception
            r2 = r1
            goto L_0x00dd
        L_0x00cd:
            r10 = move-exception
            r2 = r1
        L_0x00cf:
            r10.printStackTrace()     // Catch:{ all -> 0x00dc }
        L_0x00d2:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r1)
            goto L_0x00b4
        L_0x00d6:
            r10 = move-exception
            r2 = r1
        L_0x00d8:
            r10.printStackTrace()     // Catch:{ all -> 0x00dc }
            goto L_0x00d2
        L_0x00dc:
            r10 = move-exception
        L_0x00dd:
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r1)
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2629eu.m5729d(java.util.Map):void");
    }

    /* renamed from: a */
    static void m5726a(Map<String, String> map) {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
        } else {
            j = (long) statFs.getBlockSize();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getAvailableBlocks();
        }
        map.put("disk.size.free", Long.toString(j2 * j));
    }

    /* renamed from: b */
    static void m5727b(Map<String, String> map) {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
        } else {
            j = (long) statFs.getBlockSize();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockCountLong();
        } else {
            j2 = (long) statFs.getBlockCount();
        }
        map.put("disk.size.total", Long.toString(j2 * j));
    }
}
