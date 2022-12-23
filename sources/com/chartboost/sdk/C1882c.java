package com.chartboost.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.impl.C2014x;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.c */
public final class C1882c {
    /* renamed from: a */
    static void m4357a(String str) {
        if (C2026k.f5248e == null) {
            CBLogging.m3993b("CBConfig", "Set a valid CBFramework first");
        } else if (TextUtils.isEmpty(str)) {
            CBLogging.m3993b("CBConfig", "Invalid Version String");
        } else {
            C2026k.f5246c = str;
        }
    }

    /* renamed from: b */
    private static boolean m4361b() {
        return C2022j.m4955b() != null;
    }

    /* renamed from: c */
    public static boolean m4363c() {
        return m4358a() && m4361b();
    }

    /* renamed from: b */
    public static boolean m4362b(Context context) {
        int i;
        int i2;
        if (context != null) {
            try {
                if (C2014x.m4911b().mo14883a(23)) {
                    i2 = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                    i = context.checkSelfPermission("android.permission.INTERNET");
                } else {
                    i2 = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                    i = context.checkCallingOrSelfPermission("android.permission.INTERNET");
                }
                C2026k.f5255l = i != 0;
                C2026k.f5256m = i2 != 0;
                if (C2026k.f5255l) {
                    throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
                } else if (!C2026k.f5256m) {
                    return true;
                } else {
                    throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            throw new RuntimeException("Invalid activity context passed during intitalization");
        }
    }

    /* renamed from: a */
    public static boolean m4360a(AtomicReference<C1844h> atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new C1844h(jSONObject));
            return true;
        } catch (Exception e) {
            CBLogging.m3993b("CBConfig", "updateConfig: " + e.toString());
            return false;
        }
    }

    /* renamed from: a */
    static boolean m4358a() {
        try {
            if (C2022j.m4955b() == null) {
                throw new Exception("SDK Initialization error. SDK seems to be not initialized properly, check for any integration issues");
            } else if (TextUtils.isEmpty(C2026k.f5253j)) {
                throw new Exception("SDK Initialization error. AppId is missing");
            } else if (!TextUtils.isEmpty(C2026k.f5254k)) {
                return true;
            } else {
                throw new Exception("SDK Initialization error. AppSignature is missing");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4359a(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(context, CBImpressionActivity.class), 0);
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
        int i = activityInfo.flags;
        if ((i & 512) == 0 || (i & 32) == 0) {
            return false;
        }
        int i2 = activityInfo.configChanges;
        if ((i2 & 128) == 0 || (i2 & 32) == 0 || (i2 & 1024) == 0) {
            return false;
        }
        return true;
    }
}
