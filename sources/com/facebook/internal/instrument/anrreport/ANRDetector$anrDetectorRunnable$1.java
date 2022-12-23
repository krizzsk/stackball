package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ANRDetector.kt */
final class ANRDetector$anrDetectorRunnable$1 implements Runnable {
    public static final ANRDetector$anrDetectorRunnable$1 INSTANCE = new ANRDetector$anrDetectorRunnable$1();

    ANRDetector$anrDetectorRunnable$1() {
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object systemService = FacebookSdk.getApplicationContext().getSystemService("activity");
                if (systemService != null) {
                    ANRDetector.checkProcessError((ActivityManager) systemService);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
