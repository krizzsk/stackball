package com.tapjoy.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.z */
public final class C9509z {
    @Nullable
    /* renamed from: a */
    public static String m25553a(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m25552a(Context context) {
        return m25554b(context.getPackageManager(), context.getPackageName());
    }

    /* renamed from: b */
    public static int m25554b(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static long m25555c(PackageManager packageManager, String str) {
        if (Build.VERSION.SDK_INT >= 9) {
            try {
                long j = packageManager.getPackageInfo(str, 0).firstInstallTime;
                if (j > 0) {
                    return j;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static String m25556d(PackageManager packageManager, String str) {
        try {
            return C9465jq.m25448b(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public static Signature[] m25557e(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
