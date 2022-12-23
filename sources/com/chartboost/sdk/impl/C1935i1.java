package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.UUID;

/* renamed from: com.chartboost.sdk.impl.i1 */
public class C1935i1 {

    /* renamed from: a */
    private static int f4930a = 4;

    /* renamed from: b */
    private static int f4931b = 5;

    /* renamed from: a */
    public static String m4635a(Context context, boolean z) {
        String a = m4634a(context);
        if (z || a == null) {
            return m4637c(context);
        }
        return a;
    }

    /* renamed from: b */
    public static Integer m4636b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        float f2 = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        if (Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.5d) {
            return Integer.valueOf(f4931b);
        }
        return Integer.valueOf(f4930a);
    }

    /* renamed from: c */
    private static String m4637c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null) {
            edit.putString("cbUUID", uuid).apply();
        }
        return uuid;
    }

    /* renamed from: d */
    public static String m4638d(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i = configuration.uiMode & 15;
        int i2 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            return "chromebook";
        }
        String str = Build.BRAND;
        if (str != null && str.equals("chromium") && Build.MANUFACTURER.equals("chromium")) {
            return "chromebook";
        }
        String str2 = Build.DEVICE;
        if (str2 != null && str2.matches(".+_cheets")) {
            return "chromebook";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.watch") || i == 6) {
            return "watch";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.television") || i == 4) {
            return "tv";
        }
        String str3 = Build.MANUFACTURER;
        if ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i2 != 4) {
            return "phone";
        }
        return "tablet";
    }

    /* renamed from: e */
    private static boolean m4639e(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static String m4634a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || m4639e(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return string;
        } catch (Exception unused2) {
            return null;
        }
    }
}
