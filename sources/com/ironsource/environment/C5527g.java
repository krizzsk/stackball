package com.ironsource.environment;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.ironsource.environment.g */
public final class C5527g {

    /* renamed from: a */
    private static String f12743a = null;

    /* renamed from: b */
    private static String f12744b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f12745c = "";

    /* renamed from: A */
    public static int m13129A(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    /* renamed from: B */
    public static String m13130B(Context context) {
        return m13144d(context) ? "Tablet" : "Phone";
    }

    /* renamed from: a */
    public static long m13131a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    /* renamed from: a */
    private static long m13132a(File file) {
        long j;
        long j2;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT < 19) {
            j2 = (long) statFs.getAvailableBlocks();
            j = (long) statFs.getBlockSize();
        } else {
            j2 = statFs.getAvailableBlocksLong();
            j = statFs.getBlockSizeLong();
        }
        return (j2 * j) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* renamed from: a */
    public static long m13133a(String str) {
        return m13132a(new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m13134a(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.ironsource.environment.g> r0 = com.ironsource.environment.C5527g.class
            monitor-enter(r0)
            java.lang.String r1 = "Mediation_Shared_Preferences"
            java.lang.String r2 = "browser_user_agent"
            com.ironsource.environment.C5530i.m13184a(r3, r1, r2, r4)     // Catch:{ Exception -> 0x000f, all -> 0x000c }
            monitor-exit(r0)
            return
        L_0x000c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x000f:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C5527g.m13134a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m13135a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    /* renamed from: a */
    public static String[] m13136a(Context context) {
        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        Method method = invoke.getClass().getMethod("getId", new Class[0]);
        Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
        String obj = method.invoke(invoke, new Object[0]).toString();
        boolean booleanValue = ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(booleanValue);
        return new String[]{obj, sb.toString()};
    }

    /* renamed from: b */
    public static int m13137b() {
        return -(TimeZone.getDefault().getOffset(m13131a()) / 60000);
    }

    /* renamed from: b */
    public static String m13138b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    /* renamed from: c */
    public static String m13140c() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    /* renamed from: c */
    public static String m13141c(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    /* renamed from: c */
    private static boolean m13142c(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                String str2 = strArr[i];
                if (new File(str2 + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m13143d() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
    }

    /* renamed from: d */
    public static boolean m13144d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m13145e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return -1;
    }

    /* renamed from: e */
    public static String m13146e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public static int m13147f() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: f */
    public static boolean m13148f(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        return i == 2 || i == 5;
    }

    /* renamed from: g */
    public static int m13149g(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    /* renamed from: g */
    public static String m13150g() {
        return Build.MODEL;
    }

    /* renamed from: h */
    public static String m13151h() {
        return Build.MANUFACTURER;
    }

    /* renamed from: h */
    public static boolean m13152h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 && Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: i */
    public static String m13153i() {
        return "android";
    }

    /* renamed from: i */
    public static boolean m13154i(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 && Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13155j(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkOperatorName()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C5527g.m13155j(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public static boolean m13156j() {
        return m13142c("su");
    }

    /* renamed from: k */
    public static int m13157k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13158k(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkCountryIso()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C5527g.m13158k(android.content.Context):java.lang.String");
    }

    /* renamed from: l */
    public static int m13159l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: l */
    public static int m13160l(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: m */
    public static float m13161m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return ((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3));
        } catch (Exception e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    /* renamed from: m */
    public static int m13162m() {
        return m13157k();
    }

    /* renamed from: n */
    public static int m13163n() {
        return m13159l();
    }

    /* renamed from: n */
    public static int m13164n(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    /* renamed from: o */
    public static float m13165o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: o */
    public static String m13166o(Context context) {
        if (context == null) {
            return "";
        }
        int n = m13164n(context);
        if (n != 0) {
            if (n != 1) {
                if (n != 11) {
                    if (n != 12) {
                        switch (n) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    /* renamed from: p */
    public static int m13167p(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: p */
    public static long m13168p() {
        return m13132a(Environment.getDataDirectory());
    }

    /* renamed from: q */
    public static List<ApplicationInfo> m13169q(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    /* renamed from: q */
    public static void m13170q() {
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
                f12745c = defaultUserAgent;
                m13134a(applicationContext, defaultUserAgent);
            } catch (Exception unused) {
            }
        } else {
            ContextProvider.getInstance().runOnUIThread(new Runnable() {
                public final void run() {
                    try {
                        WebView webView = new WebView(applicationContext);
                        webView.setLayerType(1, (Paint) null);
                        String unused = C5527g.f12745c = webView.getSettings().getUserAgentString();
                        webView.destroy();
                        C5527g.m13134a(applicationContext, C5527g.f12745c);
                    } catch (Exception unused2) {
                    }
                }
            });
        }
    }

    /* renamed from: r */
    public static String m13171r() {
        Context applicationContext;
        if (!f12745c.isEmpty() || (applicationContext = ContextProvider.getInstance().getApplicationContext()) == null) {
            return f12745c;
        }
        try {
            return C5530i.m13185b(applicationContext, "Mediation_Shared_Preferences", "browser_user_agent", "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: r */
    public static boolean m13172r(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    /* renamed from: s */
    public static File m13173s(Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: t */
    public static File m13175t(Context context) {
        return context.getExternalFilesDir((String) null);
    }

    /* renamed from: u */
    public static File m13176u(Context context) {
        return context.getCacheDir();
    }

    /* renamed from: v */
    public static File m13177v(Context context) {
        return context.getFilesDir();
    }

    /* renamed from: w */
    public static int m13178w(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: x */
    public static boolean m13179x(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: y */
    public static synchronized String m13180y(Context context) {
        synchronized (C5527g.class) {
            if (!TextUtils.isEmpty(f12743a)) {
                String str = f12743a;
                return str;
            }
            boolean z = true;
            if (context != null) {
                z = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean("uuidEnabled", true);
            }
            if (z) {
                String b = C5530i.m13185b(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(b)) {
                    String uuid = UUID.randomUUID().toString();
                    f12743a = uuid;
                    C5530i.m13184a(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    f12743a = b;
                }
            }
            String str2 = f12743a;
            return str2;
        }
    }

    /* renamed from: z */
    public static synchronized String m13181z(Context context) {
        synchronized (C5527g.class) {
            if (!TextUtils.isEmpty(f12744b)) {
                String str = f12744b;
                return str;
            } else if (context == null) {
                return "";
            } else {
                String b = C5530i.m13185b(context, "supersonic_shared_preferen", "auid", "");
                f12744b = b;
                if (TextUtils.isEmpty(b)) {
                    String uuid = UUID.randomUUID().toString();
                    f12744b = uuid;
                    C5530i.m13184a(context, "supersonic_shared_preferen", "auid", uuid);
                }
                String str2 = f12744b;
                return str2;
            }
        }
    }
}
