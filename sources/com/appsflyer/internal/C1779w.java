package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.w */
public final class C1779w {

    /* renamed from: ǃ */
    private static C1779w f4252 = new C1779w();

    private C1779w() {
    }

    /* renamed from: ı */
    public static C1779w m3910() {
        return f4252;
    }

    /* renamed from: Ι */
    public static File m3913(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    /* renamed from: ɩ */
    public static List<AFFacebookDeferredDeeplink> m3911(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    AFLogger.afInfoLog(sb.toString());
                    arrayList.add(m3912(file2));
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Could not cache request", e);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0036 A[SYNTHETIC, Splitter:B:23:0x0036] */
    /* renamed from: Ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.AFFacebookDeferredDeeplink m3912(java.io.File r4) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0033, all -> 0x0027 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0033, all -> 0x0027 }
            long r2 = r4.length()     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            int r3 = (int) r2     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            char[] r2 = new char[r3]     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            r1.read(r2)     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            com.appsflyer.AFFacebookDeferredDeeplink r3 = new com.appsflyer.AFFacebookDeferredDeeplink     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            r3.f3959 = r4     // Catch:{ Exception -> 0x0034, all -> 0x0024 }
            r1.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r4 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r4)
        L_0x0023:
            return r3
        L_0x0024:
            r4 = move-exception
            r0 = r1
            goto L_0x0028
        L_0x0027:
            r4 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r0 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0)
        L_0x0032:
            throw r4
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r4 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r4)
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1779w.m3912(java.io.File):com.appsflyer.AFFacebookDeferredDeeplink");
    }

    /* renamed from: ι */
    public static void m3914(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.afErrorLog(sb2.toString(), e);
            }
        }
    }
}
