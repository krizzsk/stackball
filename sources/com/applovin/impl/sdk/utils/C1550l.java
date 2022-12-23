package com.applovin.impl.sdk.utils;

import android.content.pm.PackageManager;

/* renamed from: com.applovin.impl.sdk.utils.l */
public class C1550l {
    /* renamed from: a */
    public static int m3530a(String str, String str2, PackageManager packageManager) {
        try {
            return packageManager.checkPermission(str, str2);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
