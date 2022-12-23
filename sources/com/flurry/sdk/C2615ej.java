package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.flurry.sdk.ej */
public final class C2615ej {

    /* renamed from: a */
    private static final String f6145a = C2615ej.class.getSimpleName();

    /* renamed from: a */
    public static String m5682a(Context context) {
        PackageInfo c = m5684c(context);
        return (c == null || c.packageName == null) ? "" : c.packageName;
    }

    /* renamed from: c */
    private static PackageInfo m5684c(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                String str = f6145a;
                C2530db.m5476a(str, "Cannot find package info for package: " + context.getPackageName());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m5683b(Context context) {
        PackageInfo c = m5684c(context);
        return (c == null || c.versionName == null) ? "" : c.versionName;
    }
}
