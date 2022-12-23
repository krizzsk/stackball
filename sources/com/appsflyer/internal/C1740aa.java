package com.appsflyer.internal;

import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.ProxyEvent;
import com.tapjoy.TapjoyConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.aa */
public final class C1740aa {

    /* renamed from: ǃ */
    private static String f4129 = "https://%smonitorsdk.%s/remote-debug?app_id=";

    /* renamed from: ɩ */
    private static C1740aa f4130;

    /* renamed from: ı */
    public boolean f4131;

    /* renamed from: Ɩ */
    private int f4132 = 0;

    /* renamed from: ɹ */
    private String f4133 = "-1";

    /* renamed from: Ι */
    private boolean f4134 = true;

    /* renamed from: ι */
    private JSONObject f4135;

    /* renamed from: І */
    private boolean f4136;

    /* renamed from: і */
    private boolean f4137;

    /* renamed from: Ӏ */
    private final List<String> f4138 = new ArrayList();

    private C1740aa() {
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.f4136 = z;
        this.f4131 = true ^ z;
        this.f4132 = 0;
        this.f4137 = false;
    }

    /* renamed from: ǃ */
    public static C1740aa m3833() {
        if (f4130 == null) {
            f4130 = new C1740aa();
        }
        return f4130;
    }

    /* renamed from: Ι */
    public final synchronized void mo14062(String str) {
        this.f4133 = str;
    }

    /* renamed from: ɩ */
    public final synchronized void mo14059() {
        this.f4137 = true;
        mo14060("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* renamed from: ı */
    public final synchronized void mo14058() {
        mo14060("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f4137 = false;
        this.f4134 = false;
    }

    /* renamed from: Ι */
    public final synchronized void mo14061() {
        this.f4135 = null;
        f4130 = null;
    }

    /* renamed from: Ӏ */
    private boolean m3840() {
        if (this.f4131) {
            return this.f4134 || this.f4137;
        }
        return false;
    }

    /* renamed from: ι */
    private synchronized void m3838(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f4135.put(ServerParameters.BRAND, str);
            this.f4135.put(ServerParameters.MODEL, str2);
            this.f4135.put("platform", "Android");
            this.f4135.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f4135.put(ServerParameters.ADVERTISING_ID_PARAM, str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f4135.put(ServerParameters.IMEI, str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f4135.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ι */
    private synchronized void m3837(String str, String str2, String str3, String str4) {
        try {
            this.f4135.put(ServerParameters.SDK_DATA_SDK_VERSION, str);
            if (str2 != null && str2.length() > 0) {
                this.f4135.put(ServerParameters.DEV_KEY, str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f4135.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f4135.put(ServerParameters.AF_USER_ID, str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ɩ */
    private synchronized void m3834(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f4135.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f4135.put(TapjoyConstants.TJC_APP_VERSION_NAME, str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f4135.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f4135.put("preInstall", str4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        return;
     */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14060(java.lang.String r4, java.lang.String r5, java.lang.String... r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m3840()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0091
            int r0 = r3.f4132     // Catch:{ all -> 0x0093 }
            r1 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r1) goto L_0x0010
            goto L_0x0091
        L_0x0010:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r2.<init>()     // Catch:{ all -> 0x008f }
            r2.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " "
            r2.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008f }
            long r0 = r0.getId()     // Catch:{ all -> 0x008f }
            r2.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " _/AppsFlyer_6.1.3 ["
            r2.append(r0)     // Catch:{ all -> 0x008f }
            r2.append(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "] "
            r2.append(r4)     // Catch:{ all -> 0x008f }
            r2.append(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = " "
            r2.append(r4)     // Catch:{ all -> 0x008f }
            r2.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x008f }
            goto L_0x007d
        L_0x0051:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            r4.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " "
            r4.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008f }
            long r0 = r0.getId()     // Catch:{ all -> 0x008f }
            r4.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " "
            r4.append(r0)     // Catch:{ all -> 0x008f }
            r4.append(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "/AppsFlyer_6.1.3 "
            r4.append(r5)     // Catch:{ all -> 0x008f }
            r4.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008f }
        L_0x007d:
            java.util.List<java.lang.String> r5 = r3.f4138     // Catch:{ all -> 0x008f }
            r5.add(r4)     // Catch:{ all -> 0x008f }
            int r5 = r3.f4132     // Catch:{ all -> 0x008f }
            int r4 = r4.length()     // Catch:{ all -> 0x008f }
            int r4 = r4 << 1
            int r5 = r5 + r4
            r3.f4132 = r5     // Catch:{ all -> 0x008f }
            monitor-exit(r3)
            return
        L_0x008f:
            monitor-exit(r3)
            return
        L_0x0091:
            monitor-exit(r3)
            return
        L_0x0093:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1740aa.mo14060(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: ɹ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String m3835() {
        /*
            r4 = this;
            monitor-enter(r4)
            org.json.JSONObject r0 = r4.f4135     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            java.lang.String r1 = "data"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            java.util.List<java.lang.String> r3 = r4.f4138     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            org.json.JSONObject r0 = r4.f4135     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x001c, all -> 0x0019 }
            r4.m3832()     // Catch:{ JSONException -> 0x001d, all -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x001c:
            r0 = 0
        L_0x001d:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1740aa.m3835():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)(8:6|7|8|9|10|11|13|14)|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x007e */
    /* renamed from: ı */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m3831(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x008f }
            com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x007e }
            r11.<init>(r2)     // Catch:{ all -> 0x007e }
            r10.f4135 = r11     // Catch:{ all -> 0x007e }
            goto L_0x007e
        L_0x0019:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x008f }
            r2.<init>()     // Catch:{ all -> 0x008f }
            r10.f4135 = r2     // Catch:{ all -> 0x008f }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ all -> 0x008f }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x008f }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "advertiserId"
            java.lang.String r7 = r0.getString(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r1.f4019     // Catch:{ all -> 0x008f }
            java.lang.String r9 = r1.f4030     // Catch:{ all -> 0x008f }
            r3 = r10
            r3.m3838(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "6.1.3."
            r1.<init>(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = com.appsflyer.AppsFlyerLibCore.f4015     // Catch:{ all -> 0x008f }
            r1.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "uid"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x008f }
            r10.m3837(r1, r2, r3, r4)     // Catch:{ all -> 0x008f }
            r1 = 0
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r11, r1)     // Catch:{ all -> 0x0073 }
            int r12 = r12.versionCode     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = "channel"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "preInstallName"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0073 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0073 }
            r10.m3834(r11, r12, r1, r2)     // Catch:{ all -> 0x0073 }
        L_0x0073:
            java.lang.String r11 = "remote_debug_static_data"
            org.json.JSONObject r12 = r10.f4135     // Catch:{ all -> 0x008f }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x008f }
            r0.set((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x008f }
        L_0x007e:
            org.json.JSONObject r11 = r10.f4135     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r12 = "launch_counter"
            java.lang.String r0 = r10.f4133     // Catch:{ JSONException -> 0x0089 }
            r11.put(r12, r0)     // Catch:{ JSONException -> 0x0089 }
            monitor-exit(r10)
            return
        L_0x0089:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x008f }
            monitor-exit(r10)
            return
        L_0x008f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1740aa.m3831(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: ι */
    public static String[] m3839(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[(stackTraceElementArr.length + 1)];
        strArr[0] = str;
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            strArr[i] = stackTraceElementArr[i].toString();
        }
        return strArr;
    }

    /* renamed from: Ɩ */
    private synchronized void m3832() {
        this.f4138.clear();
        this.f4132 = 0;
    }

    /* renamed from: ι */
    public final synchronized void mo14063() {
        this.f4134 = false;
        m3832();
    }

    /* renamed from: і */
    public final boolean mo14064() {
        return this.f4137;
    }

    /* renamed from: Ι */
    public static void m3836(String str, PackageManager packageManager) {
        try {
            if (f4130 == null) {
                f4130 = new C1740aa();
            }
            f4130.m3831(str, packageManager);
            if (f4130 == null) {
                f4130 = new C1740aa();
            }
            BackgroundEvent trackingStopped = new ProxyEvent().body(f4130.m3835()).trackingStopped(AppsFlyerLib.getInstance().isStopped());
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f4129));
            sb.append(str);
            new Thread(new Runnable() {
                public final void run() {
                    BackgroundHttpTask.this.doInBackground();
                }
            }).start();
        } catch (Throwable th) {
            AFLogger.afErrorLog(th);
        }
    }
}
