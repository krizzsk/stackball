package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C1750d;

/* renamed from: com.appsflyer.internal.ad */
public final class C1743ad {
    C1743ad() {
    }

    /* renamed from: ı */
    public static boolean m3851(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            if (AndroidUtils.m3737(context, new Intent("com.google.firebase.MESSAGING_EVENT", (Uri) null, context, FirebaseMessagingServiceListener.class))) {
                return true;
            }
            AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
            return false;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    /* renamed from: ı */
    public static void m3850(Context context, String str) {
        if (str != null) {
            AFLogger.afInfoLog("updateServerUninstallToken called with: ".concat(String.valueOf(str)));
            C1750d.C1751c.C1752d r0 = C1750d.C1751c.C1752d.m3871(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(context);
            if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false) || r0.f4179 == null || !r0.f4179.equals(str)) {
                AppsFlyerProperties.getInstance().set("afUninstallToken", str);
                if (AppsFlyerLibCore.m3747(sharedPreferences)) {
                    AppsFlyerLibCore.getInstance().mo13949(context, str);
                }
            }
        }
    }
}
