package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.p167b.C6210b;
import com.mbridge.msdk.foundation.same.p167b.C6212d;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.UUID;

/* renamed from: com.mbridge.msdk.foundation.tools.s */
/* compiled from: SameSDCardTool */
public final class C6363s {

    /* renamed from: a */
    static boolean f15781a = false;

    /* renamed from: b */
    static String f15782b = "";

    /* renamed from: c */
    public static char[] f15783c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: d */
    private static boolean f15784d = false;

    /* renamed from: e */
    private static int f15785e = -1;

    /* renamed from: f */
    private static int f15786f = -1;

    /* renamed from: g */
    private static int f15787g = -1;

    /* renamed from: h */
    private static int f15788h = -1;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16166a(android.content.Context r2) {
        /*
            boolean r0 = f15784d
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r0.<init>()     // Catch:{ Exception -> 0x0026 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0026 }
            r0.append(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x0026 }
            r0.append(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0026 }
            f15782b = r0     // Catch:{ Exception -> 0x0026 }
            r0 = 0
            f15781a = r0     // Catch:{ Exception -> 0x0026 }
            m16168b(r2)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0044
        L_0x0026:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044 }
            r0.<init>()     // Catch:{ Exception -> 0x0044 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0044 }
            r0.append(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x0044 }
            r0.append(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0044 }
            f15782b = r0     // Catch:{ Exception -> 0x0044 }
            m16168b(r2)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            r2 = 1
            f15784d = r2
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6363s.m16166a(android.content.Context):void");
    }

    /* renamed from: b */
    private static void m16168b(Context context) {
        C6213e.m15723a((C6210b) new C6212d(m16169c(context)));
        C6213e.m15721a().mo43783b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if ((m16171d() > 31457280) == false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m16169c(android.content.Context r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 18
            if (r0 < r2) goto L_0x001a
            java.io.File r0 = r7.getExternalFilesDir(r1)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x001a
            java.io.File r0 = m16165a((java.io.File) r0)     // Catch:{ all -> 0x0012 }
            goto L_0x001b
        L_0x0012:
            r0 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r2, r3, r0)
        L_0x001a:
            r0 = r1
        L_0x001b:
            boolean r2 = f15781a
            if (r2 == 0) goto L_0x006f
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "Android"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "data"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = r7.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.File r0 = m16165a((java.io.File) r2)
        L_0x005e:
            long r2 = m16171d()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r0
        L_0x0070:
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0080
        L_0x0078:
            java.io.File r7 = r7.getFilesDir()
            java.io.File r1 = r7.getAbsoluteFile()
        L_0x0080:
            java.lang.String r7 = r1.getAbsolutePath()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6363s.m16169c(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static File m16165a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    /* renamed from: c */
    private static boolean m16170c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            C6361q.m16158d("", "hasSDCard is failed");
            return false;
        }
    }

    /* renamed from: a */
    public static int m16164a() {
        try {
            Context d = C6122a.m15302b().mo42895d();
            long longValue = ((Long) C6368w.m16234b(d, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f15786f == -1) {
                f15786f = Long.valueOf((m16171d() / 1000) / 1000).intValue();
                C6368w.m16233a(d, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            C6361q.m16155a("SameSDCardTool", th.getMessage(), th);
        }
        return f15786f;
    }

    /* renamed from: d */
    private static long m16171d() {
        if (m16170c()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m16167b() {
        if (f15785e == -1) {
            try {
                f15785e = new Long((m16172e() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                C6361q.m16155a("SameSDCardTool", th.getMessage(), th);
            }
        }
        return f15785e;
    }

    /* renamed from: e */
    private static long m16172e() {
        if (m16170c()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
