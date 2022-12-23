package com.flurry.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.flurry.sdk.ey */
final class C2636ey {

    /* renamed from: a */
    private static final String f6194a = C2636ey.class.getSimpleName();

    /* renamed from: b */
    private static String f6195b;

    private C2636ey() {
    }

    /* renamed from: a */
    static String m5737a(Context context) {
        String str = f6195b;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f6195b = null;
        } else if (arrayList.size() == 1) {
            f6195b = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2) && !m5738a(context, intent) && arrayList.contains(str2)) {
            f6195b = str2;
        } else if (arrayList.contains("com.android.chrome")) {
            f6195b = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f6195b = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f6195b = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f6195b = "com.google.android.apps.chrome";
        }
        return f6195b;
    }

    /* renamed from: a */
    private static boolean m5738a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo next : queryIntentActivities) {
                        IntentFilter intentFilter = next.filter;
                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            C2530db.m5482b(f6194a, "Runtime exception while getting specialized handlers");
        }
    }
}
