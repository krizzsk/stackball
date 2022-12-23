package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.ed.internal.df */
public final class C8144df {

    /* renamed from: a */
    public static final C8144df f21099a = new C8144df();

    private C8144df() {
    }

    /* renamed from: a */
    public static void m22704a(Context context) {
        C8467mq.m23881b(context, "context");
        if (!m22707b(context)) {
            OguryIntegrationLogger.m22104d("[Ads][setup] Checking permissions...");
            if (!C8257gh.m23192a(context, "android.permission.INTERNET")) {
                OguryIntegrationLogger.m22105e("[Ads][setup] No Internet permission");
            } else {
                OguryIntegrationLogger.m22104d("[Ads][setup] Permissions checked");
            }
            m22708c(context);
        }
    }

    /* renamed from: b */
    private static boolean m22707b(Context context) {
        return (context.getApplicationInfo().flags & 2) == 0;
    }

    /* renamed from: c */
    private static void m22708c(Context context) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        OguryIntegrationLogger.m22104d("[Ads][setup] Checking components...");
        C8467mq.m23878a((Object) packageInfo, "activitiesInfo");
        m22705a(packageInfo);
        OguryIntegrationLogger.m22104d("[Ads][setup] Components checked");
    }

    /* renamed from: a */
    private static void m22705a(PackageInfo packageInfo) {
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr != null) {
            m22706a(activityInfoArr, "io.presage.interstitial.ui.InterstitialActivity");
            m22706a(activityInfoArr, "io.presage.interstitial.ui.InterstitialAndroid8TransparentActivity");
            m22706a(activityInfoArr, "io.presage.interstitial.ui.InterstitialAndroid8RotableActivity");
        }
    }

    /* renamed from: a */
    private static void m22706a(ActivityInfo[] activityInfoArr, String str) {
        int length = activityInfoArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (C8467mq.m23880a((Object) activityInfoArr[i].name, (Object) str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            OguryIntegrationLogger.m22105e(C8467mq.m23873a("[Ads][setup] Missing activity: ", (Object) str));
        }
    }
}
