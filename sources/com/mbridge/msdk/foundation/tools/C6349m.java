package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.p171f.C6233b;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.m */
/* compiled from: SameDiTool */
public final class C6349m extends C6333d {

    /* renamed from: a */
    private static String f15747a = null;

    /* renamed from: b */
    private static String f15748b = null;

    /* renamed from: c */
    private static int f15749c = -1;

    /* renamed from: d */
    private static int f15750d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile int f15751e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f15752f = "";

    /* renamed from: g */
    private static String f15753g = "";

    /* renamed from: h */
    private static String f15754h = "";

    /* renamed from: i */
    private static String f15755i = "";

    /* renamed from: j */
    private static int f15756j = 0;

    /* renamed from: k */
    private static String f15757k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static String f15758l = "";

    /* renamed from: m */
    private static int f15759m = -1;

    /* renamed from: n */
    private static String f15760n = "";

    /* renamed from: o */
    private static int f15761o = 0;

    /* renamed from: p */
    private static String f15762p = "";

    /* renamed from: a */
    public static int m16090a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static void m16098b(Context context) {
        try {
            m16106f();
            m16117k(context);
            m16107f(context);
            m16104e(context);
            m16102d(context);
            m16091a();
            m16099c();
            m16113i();
            m16100c(context);
            m16105e();
            C6204a.f15393c = false;
            C6204a.f15392b = C6366u.m16201a("android.permission.ACCESS_NETWORK_STATE", context);
            m16109g(context);
            m16134t();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m16091a() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MODEL;
    }

    /* renamed from: b */
    public static String m16096b() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: c */
    public static String m16099c() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    /* renamed from: c */
    public static String m16100c(Context context) {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f15757k)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() != null) {
                    if (context.getResources().getConfiguration() != null) {
                        Locale locale = context.getResources().getConfiguration().locale;
                        if (locale == null) {
                            return "en-US";
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            f15757k = locale.toLanguageTag();
                        } else {
                            f15757k = locale.getLanguage() + "-" + locale.getCountry();
                        }
                        return f15757k;
                    }
                }
                return "en-US";
            } catch (Throwable th) {
                C6361q.m16154a("SameDiTool", th.getMessage());
                f15757k = "en-US";
            }
        }
        return f15757k;
    }

    /* renamed from: d */
    public static int m16102d(Context context) {
        Configuration configuration;
        if (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null) {
            return 1;
        }
        int i = configuration.orientation;
        if (i == 2) {
            return 2;
        }
        if (i == 1) {
        }
        return 1;
    }

    /* renamed from: e */
    public static int m16104e(Context context) {
        if (context == null) {
            return f15756j;
        }
        int i = f15756j;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f15756j = i2;
            return i2;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: f */
    public static String m16107f(Context context) {
        if (context == null) {
            return f15755i;
        }
        try {
            if (!TextUtils.isEmpty(f15755i)) {
                return f15755i;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f15755i = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static int m16109g(Context context) {
        if (context == null) {
            return f15761o;
        }
        if (f15761o == 0) {
            try {
                f15761o = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e) {
                C6361q.m16158d("SameDiTool", e.getMessage());
            }
        }
        return f15761o;
    }

    /* renamed from: h */
    public static int m16111h(Context context) {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap j = m16115j(context);
            return j.get("width") == null ? displayMetrics.widthPixels : ((Integer) j.get("width")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static int m16112i(Context context) {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap j = m16115j(context);
            return j.get("height") == null ? displayMetrics.heightPixels : ((Integer) j.get("height")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public static HashMap m16115j(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e) {
            C6361q.m16155a("SameDiTool", e.getMessage(), e);
        }
        return hashMap;
    }

    /* renamed from: k */
    public static String m16117k(Context context) {
        if (context == null) {
            return f15754h;
        }
        try {
            if (!TextUtils.isEmpty(f15754h)) {
                return f15754h;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f15754h = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: l */
    public static void m16119l(final Context context) {
        if (context != null) {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    m16060a(context);
                } else {
                    new Handler(context.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C6333d.m16060a(context);
                        }
                    });
                }
            } catch (Exception e) {
                C6361q.m16155a("SameDiTool", "", e);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16121m(final android.content.Context r8) {
        /*
            com.mbridge.msdk.foundation.controller.authoritycontroller.a r0 = com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a.m15330a()
            java.lang.String r1 = "authority_general_data"
            boolean r0 = r0.mo42922a((java.lang.String) r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r0 = f15752f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "SameDiTool"
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "mbridge_ua"
            java.lang.String r3 = ""
            java.lang.Object r0 = com.mbridge.msdk.foundation.tools.C6368w.m16234b(r8, r0, r3)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0027 }
            f15752f = r0     // Catch:{ all -> 0x0027 }
            goto L_0x002f
        L_0x0027:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r2, r3, r0)
        L_0x002f:
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x00c9 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00c9 }
            r4 = 1
            r5 = 0
            if (r0 != r3) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = f15752f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b2
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0054 }
            r3 = 17
            if (r0 < r3) goto L_0x0054
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r8)     // Catch:{ all -> 0x0054 }
            f15752f = r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            java.lang.String r0 = f15752f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Class<android.webkit.WebSettings> r0 = android.webkit.WebSettings.class
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0086 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r5] = r7     // Catch:{ all -> 0x0086 }
            java.lang.Class<android.webkit.WebView> r7 = android.webkit.WebView.class
            r6[r4] = r7     // Catch:{ all -> 0x0086 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r6)     // Catch:{ all -> 0x0086 }
            r0.setAccessible(r4)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0086 }
            r3[r5] = r8     // Catch:{ all -> 0x0086 }
            r3[r4] = r1     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = r0.newInstance(r3)     // Catch:{ all -> 0x0086 }
            android.webkit.WebSettings r1 = (android.webkit.WebSettings) r1     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.getUserAgentString()     // Catch:{ all -> 0x0086 }
            f15752f = r1     // Catch:{ all -> 0x0086 }
            r0.setAccessible(r5)     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c9 }
        L_0x008a:
            java.lang.String r0 = f15752f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00a6
            android.webkit.WebView r0 = new android.webkit.WebView     // Catch:{ all -> 0x00a2 }
            r0.<init>(r8)     // Catch:{ all -> 0x00a2 }
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r0.getUserAgentString()     // Catch:{ all -> 0x00a2 }
            f15752f = r0     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c9 }
        L_0x00a6:
            java.lang.String r0 = f15752f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00d1
            m16130r()     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00b2:
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ Exception -> 0x00c0 }
            com.mbridge.msdk.foundation.tools.m$2 r1 = new com.mbridge.msdk.foundation.tools.m$2     // Catch:{ Exception -> 0x00c0 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c0 }
            r0.start()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00d1
        L_0x00c0:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00c5:
            m16130r()     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00c9:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r2, r1, r0)
        L_0x00d1:
            m16133s(r8)
            java.lang.String r8 = f15752f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6349m.m16121m(android.content.Context):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static void m16133s(Context context) {
        try {
            C6368w.m16233a(context, "mbridge_ua", f15752f);
        } catch (Throwable th) {
            C6361q.m16155a("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: d */
    public static String m16103d() {
        if (TextUtils.isEmpty(f15752f)) {
            m16121m(C6122a.m15302b().mo42895d());
        }
        return f15752f;
    }

    /* renamed from: r */
    private static void m16130r() {
        String str = Build.VERSION.RELEASE;
        String a = m16091a();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a)) {
            f15752f = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        f15752f = "Mozilla/5.0 (Linux; Android " + str + "; " + a + " Build/) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    /* renamed from: n */
    public static int m16123n(Context context) {
        try {
            final Context d = C6122a.m15302b().mo42895d();
            if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f15751e;
            }
            if (d == null) {
                return f15751e;
            }
            if (f15751e != 0) {
                C6233b.m15776a().execute(new Runnable() {
                    public final void run() {
                        ConnectivityManager connectivityManager;
                        try {
                            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA) && d != null && (connectivityManager = (ConnectivityManager) d.getSystemService("connectivity")) != null && C6204a.f15392b) {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                if (activeNetworkInfo == null) {
                                    int unused = C6349m.f15751e = 0;
                                } else if (activeNetworkInfo.getType() == 1) {
                                    int unused2 = C6349m.f15751e = 9;
                                } else {
                                    TelephonyManager telephonyManager = (TelephonyManager) d.getSystemService("phone");
                                    if (telephonyManager == null) {
                                        int unused3 = C6349m.f15751e = 0;
                                    } else {
                                        int unused4 = C6349m.f15751e = C6349m.m16090a(telephonyManager.getNetworkType());
                                    }
                                }
                            }
                        } catch (Exception e) {
                            C6361q.m16155a("SameDiTool", e.getMessage(), e);
                            int unused5 = C6349m.f15751e = 0;
                        }
                    }
                });
                return f15751e;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) d.getSystemService("connectivity");
            if (connectivityManager == null) {
                return f15751e;
            }
            if (C6204a.f15392b) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    f15751e = 0;
                    return f15751e;
                } else if (activeNetworkInfo.getType() == 1) {
                    f15751e = 9;
                    return f15751e;
                } else {
                    TelephonyManager telephonyManager = (TelephonyManager) d.getSystemService("phone");
                    if (telephonyManager == null) {
                        f15751e = 0;
                        return f15751e;
                    }
                    f15751e = telephonyManager.getNetworkType();
                    return m16090a(f15751e);
                }
            } else {
                f15751e = 0;
                return f15751e;
            }
        } catch (Exception e) {
            C6361q.m16155a("SameDiTool", e.getMessage(), e);
            f15751e = 0;
            return f15751e;
        }
    }

    /* renamed from: a */
    public static String m16092a(Context context, int i) {
        TelephonyManager telephonyManager;
        if (i == 0 || i == 9) {
            return "";
        }
        try {
            if (!C6204a.f15392b || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return "";
            }
            return String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            C6361q.m16155a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: e */
    public static String m16105e() {
        try {
            if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f15758l)) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            String unused = C6349m.f15758l = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }).start();
                return f15758l;
            }
            return f15758l;
        } catch (Throwable th) {
            C6361q.m16155a("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: f */
    public static String m16106f() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f15753g)) {
            int g = m16108g();
            f15753g = g + "";
        }
        return f15753g;
    }

    /* renamed from: g */
    public static int m16108g() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static int m16110h() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m16094a(String str) {
        f15748b = C6348l.m16087a(str);
        f15747a = str;
    }

    /* renamed from: i */
    public static String m16113i() {
        String str;
        if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_DEVICE_ID) && (str = f15747a) != null) {
            return str;
        }
        return "";
    }

    /* renamed from: j */
    public static String m16114j() {
        String str;
        if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_DEVICE_ID) && (str = f15748b) != null) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public static String m16093a(String str, Context context) {
        try {
            if (!TextUtils.isEmpty(f15760n)) {
                return f15760n;
            }
            if (!TextUtils.isEmpty(str) && context != null) {
                f15760n = context.getPackageManager().getInstallerPackageName(str);
                C6361q.m16154a("SameDiTool", "PKGSource:" + f15760n);
            }
            return f15760n;
        } catch (Exception e) {
            C6361q.m16155a("SameDiTool", e.getMessage(), e);
        }
    }

    /* renamed from: o */
    public static boolean m16125o(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            if (Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 6.0d) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C6361q.m16155a("SameDiTool", e.getMessage(), e);
        }
    }

    /* renamed from: k */
    public static String m16116k() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|8|9|(2:11|12)|13|14|15|16|47|48) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0050 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074 A[SYNTHETIC, Splitter:B:30:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b A[SYNTHETIC, Splitter:B:34:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c A[SYNTHETIC, Splitter:B:41:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[SYNTHETIC, Splitter:B:45:0x0093] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0083=Splitter:B:38:0x0083, B:27:0x006b=Splitter:B:27:0x006b} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16118l() {
        /*
            java.lang.String r0 = "SameDiTool"
            com.mbridge.msdk.foundation.controller.authoritycontroller.a r1 = com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a.m15330a()
            java.lang.String r2 = "authority_general_data"
            boolean r1 = r1.mo42922a((java.lang.String) r2)
            if (r1 != 0) goto L_0x0011
            java.lang.String r0 = ""
            return r0
        L_0x0011:
            java.lang.String r1 = "/proc/meminfo"
            r2 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x007f, all -> 0x0067 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x007f, all -> 0x0067 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0062, all -> 0x005d }
            r5 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r5)     // Catch:{ Exception -> 0x0062, all -> 0x005d }
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            r5 = 1
            r3 = r3[r5]     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            r1.close()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            if (r3 == 0) goto L_0x004d
            java.lang.Float r5 = new java.lang.Float     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            float r3 = r3.floatValue()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            r6 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r3 / r6
            r5.<init>(r3)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            double r5 = r5.doubleValue()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            double r2 = java.lang.Math.ceil(r5)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            int r0 = (int) r2
            r2 = r0
        L_0x004d:
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0096
        L_0x0054:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0096
        L_0x0059:
            r3 = move-exception
            goto L_0x006b
        L_0x005b:
            r3 = move-exception
            goto L_0x0083
        L_0x005d:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x006b
        L_0x0062:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0083
        L_0x0067:
            r1 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
        L_0x006b:
            java.lang.String r5 = r3.getMessage()     // Catch:{ all -> 0x00a8 }
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r5, r3)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0079
            r4.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0079
        L_0x0078:
        L_0x0079:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0096
        L_0x007f:
            r1 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
        L_0x0083:
            java.lang.String r5 = r3.getMessage()     // Catch:{ all -> 0x00a8 }
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r5, r3)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0091
            r4.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0091
        L_0x0090:
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0096:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "GB"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00a8:
            r0 = move-exception
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00ba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6349m.m16118l():java.lang.String");
    }

    /* renamed from: p */
    public static String m16127p(Context context) {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e) {
            C6361q.m16155a("SameDiTool", e.getMessage(), e);
            return "";
        } catch (Throwable th) {
            C6361q.m16155a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.FileReader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC, Splitter:B:32:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c A[SYNTHETIC, Splitter:B:37:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b A[SYNTHETIC, Splitter:B:44:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC, Splitter:B:49:0x0099] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x0082=Splitter:B:41:0x0082, B:29:0x0065=Splitter:B:29:0x0065} */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16129q(android.content.Context r9) {
        /*
            java.lang.String r0 = "SameDiTool"
            com.mbridge.msdk.foundation.controller.authoritycontroller.a r1 = com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a.m15330a()
            java.lang.String r2 = "authority_general_data"
            boolean r1 = r1.mo42922a((java.lang.String) r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            if (r9 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r1 = "/proc/meminfo"
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0080, all -> 0x0063 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0080, all -> 0x0063 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r5 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            java.lang.String r3 = r1.readLine()     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            r5 = 1
            r3 = r3[r5]     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            long r5 = r3.longValue()     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            r7 = 1024(0x400, double:5.06E-321)
            long r5 = r5 * r7
            java.lang.String r9 = android.text.format.Formatter.formatFileSize(r9, r5)     // Catch:{ IOException -> 0x005c, all -> 0x0059 }
            r1.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x004c
        L_0x0044:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r2, r1)
        L_0x004c:
            r4.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0058
        L_0x0050:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r2, r1)
        L_0x0058:
            return r9
        L_0x0059:
            r9 = move-exception
            r3 = r1
            goto L_0x0065
        L_0x005c:
            r9 = move-exception
            r3 = r1
            goto L_0x0082
        L_0x005f:
            r9 = move-exception
            goto L_0x0065
        L_0x0061:
            r9 = move-exception
            goto L_0x0082
        L_0x0063:
            r9 = move-exception
            r4 = r3
        L_0x0065:
            java.lang.String r1 = r9.getMessage()     // Catch:{ all -> 0x00a6 }
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r1, r9)     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x007a
            r3.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007a
        L_0x0072:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r1, r9)
        L_0x007a:
            if (r4 == 0) goto L_0x00a5
            r4.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a5
        L_0x0080:
            r9 = move-exception
            r4 = r3
        L_0x0082:
            java.lang.String r1 = r9.getMessage()     // Catch:{ all -> 0x00a6 }
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r1, r9)     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x0097
            r3.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0097
        L_0x008f:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r1, r9)
        L_0x0097:
            if (r4 == 0) goto L_0x00a5
            r4.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a5
        L_0x009d:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r1, r9)
        L_0x00a5:
            return r2
        L_0x00a6:
            r9 = move-exception
            if (r3 == 0) goto L_0x00b5
            r3.close()     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b5
        L_0x00ad:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r2, r1)
        L_0x00b5:
            if (r4 == 0) goto L_0x00c3
            r4.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00c3
        L_0x00bb:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r2, r1)
        L_0x00c3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6349m.m16129q(android.content.Context):java.lang.String");
    }

    /* renamed from: m */
    public static String m16120m() {
        String str = "";
        try {
            Context d = C6122a.m15302b().mo42895d();
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            long s = m16132s();
            String str2 = "app_tki_" + currentTimeMillis + "_" + s;
            String str3 = (String) C6368w.m16234b(d, str2, str);
            try {
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", str);
                    jSONObject.put("2", String.valueOf(s));
                    jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(currentTimeMillis));
                    jSONObject.put("4", str);
                    jSONObject.put(CampaignEx.CLICKMODE_ON, str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                str = C6328a.m16055a(jSONObject.toString());
                C6368w.m16233a(d, str2, str);
                return str;
            } catch (Exception e2) {
                e = e2;
                str = str3;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: n */
    public static int m16122n() {
        try {
            if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            Context d = C6122a.m15302b().mo42895d();
            long j = 0;
            long longValue = ((Long) C6368w.m16234b(d, "FreeRamSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f15750d == -1) {
                Context d2 = C6122a.m15302b().mo42895d();
                if (d2 != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) d2.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                }
                f15750d = Long.valueOf((j / 1000) / 1000).intValue();
                C6368w.m16233a(d, "FreeRamSize", Long.valueOf(currentTimeMillis));
            }
            return f15750d;
        } catch (Throwable th) {
            C6361q.m16155a("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: s */
    private static long m16132s() {
        Context d = C6122a.m15302b().mo42895d();
        if (d == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) d.getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return 0;
    }

    /* renamed from: o */
    public static int m16124o() {
        if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        if (f15749c < 1) {
            try {
                Context d = C6122a.m15302b().mo42895d();
                long longValue = ((Long) C6368w.m16234b(d, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f15749c == -1) {
                    f15749c = Long.valueOf((m16132s() / 1000) / 1000).intValue();
                    C6368w.m16233a(d, "TotalRamSize", Long.valueOf(currentTimeMillis));
                }
            } catch (Throwable th) {
                C6361q.m16155a("SameDiTool", th.getMessage(), th);
            }
        }
        return f15749c;
    }

    /* renamed from: p */
    public static int m16126p() {
        return f15759m;
    }

    /* renamed from: t */
    private static String m16134t() {
        if (!TextUtils.isEmpty(f15762p)) {
            return f15762p;
        }
        JSONObject jSONObject = new JSONObject();
        String str = null;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            C6361q.m16158d("SameDiTool", th.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str) || !str.equals("harmony")) {
                f15762p = "android";
                return f15762p;
            }
            jSONObject.put("osType", str);
            Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
            jSONObject.put("version", (String) cls2.getMethod("getVersion", new Class[0]).invoke(cls2, new Object[0]));
            try {
                jSONObject.put("pure_state", Settings.Secure.getInt(C6122a.m15302b().mo42895d().getContentResolver(), "pure_mode_state", -1));
            } catch (Throwable th2) {
                C6361q.m16158d("SameDiTool", th2.getMessage());
            }
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                jSONObject2 = C6348l.m16087a(jSONObject2);
            }
            f15762p = jSONObject2;
            return f15762p;
        } catch (Throwable th3) {
            C6361q.m16158d("SameDiTool", th3.getMessage());
        }
    }
}
