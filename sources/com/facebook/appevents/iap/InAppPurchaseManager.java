package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;

public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    public static void enableAutoLogging() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                enabled.set(true);
                startTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static void startTracking() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!enabled.get()) {
                    return;
                }
                if (!usingBillingLib2Plus() || !FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging();
                } else {
                    InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static boolean usingBillingLib2Plus() {
        Class<InAppPurchaseManager> cls = InAppPurchaseManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null || Integer.parseInt(applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION).split("\\.", 3)[0]) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }
}
