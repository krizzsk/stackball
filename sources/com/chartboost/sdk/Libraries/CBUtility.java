package com.chartboost.sdk.Libraries;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Model.C1844h;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class CBUtility {
    private CBUtility() {
    }

    /* renamed from: a */
    public static float m3999a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static boolean m4004a(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    public static int m4006b(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        int rotation = defaultDisplay.getRotation();
        boolean z = defaultDisplay.getWidth() != defaultDisplay.getHeight() ? defaultDisplay.getWidth() < defaultDisplay.getHeight() : context.getResources().getConfiguration().orientation != 2;
        if (!(rotation == 0 || rotation == 2)) {
            z = !z;
        }
        if (z) {
            if (rotation == 1) {
                return 1;
            }
            if (rotation == 2) {
                return 2;
            }
            if (rotation != 3) {
                return 0;
            }
            return 3;
        } else if (rotation == 1) {
            return 2;
        } else {
            if (rotation == 2) {
                return 3;
            }
            if (rotation != 3) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m4009b(int i) {
        return i == 0 || i == 2;
    }

    /* renamed from: c */
    public static String m4010c(Context context) {
        int b = m4006b(context);
        if (b == 0) {
            return "portrait";
        }
        if (b == 1) {
            return "landscape";
        }
        if (b != 2) {
            return b != 3 ? "unknown" : "landscape";
        }
        return "portrait";
    }

    /* renamed from: d */
    public static String m4012d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: e */
    public static String m4013e() {
        Object[] objArr = new Object[3];
        objArr[0] = "Chartboost-Android-SDK";
        Object obj = C2026k.f5248e;
        if (obj == null) {
            obj = "";
        }
        objArr[1] = obj;
        objArr[2] = "8.2.1";
        return String.format("%s %s %s", objArr);
    }

    /* renamed from: f */
    public static boolean m4014f() {
        return m4003a() || m4011c() || m4008b();
    }

    public static void throwProguardError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            CBLogging.m3993b("CBUtility", "Chartboost library error! Have you used proguard on your application? Make sure to add the line '-keep class com.chartboost.sdk.** { *; }' to your proguard config file.");
        } else if (exc == null || exc.getMessage() == null) {
            CBLogging.m3993b("CBUtility", "Unknown Proguard error");
        } else {
            CBLogging.m3993b("CBUtility", exc.getMessage());
        }
    }

    /* renamed from: a */
    public static int m4000a(int i, Context context) {
        return Math.round(((float) i) * m3999a(context));
    }

    /* renamed from: c */
    private static boolean m4011c() {
        return new File("/system/app/Superuser.apk").exists();
    }

    /* renamed from: a */
    public static float m3998a(float f, Context context) {
        return f * m3999a(context);
    }

    /* renamed from: a */
    private static boolean m4003a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: a */
    public static void m4002a(Activity activity, int i, C1844h hVar) {
        if (activity != null && !m4005a(activity)) {
            if ((i == 1 && hVar.f4536q && hVar.f4539t) || (i == 0 && hVar.f4524e && hVar.f4527h)) {
                int b = m4006b((Context) activity);
                if (b == 0) {
                    activity.setRequestedOrientation(1);
                } else if (b == 2) {
                    activity.setRequestedOrientation(9);
                } else if (b == 1) {
                    activity.setRequestedOrientation(0);
                } else {
                    activity.setRequestedOrientation(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static ArrayList<File> m4001a(File file, boolean z) {
        if (file == null) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && !file2.getName().equals(".nomedia")) {
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z) {
                    arrayList.addAll(m4001a(file2, z));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m4008b() {
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i = 0; i < 8; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m4007b(Activity activity, int i, C1844h hVar) {
        if (activity != null && !m4005a(activity)) {
            if ((i == 1 && hVar.f4536q && hVar.f4539t) || (i == 0 && hVar.f4524e && hVar.f4527h)) {
                activity.setRequestedOrientation(-1);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4005a(Activity activity) {
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getBackground() == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26 || activity.getWindow().getDecorView().getBackground().getAlpha() == 255) {
            return false;
        }
        return true;
    }
}
