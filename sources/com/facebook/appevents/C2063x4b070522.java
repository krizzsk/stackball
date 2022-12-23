package com.facebook.appevents;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.AppEventsLoggerImpl$Companion$initializeTimersIfNeeded$attributionRecheckRunnable$1 */
/* compiled from: AppEventsLoggerImpl.kt */
final class C2063x4b070522 implements Runnable {
    public static final C2063x4b070522 INSTANCE = new C2063x4b070522();

    C2063x4b070522() {
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Set<String> hashSet = new HashSet<>();
                for (AccessTokenAppIdPair applicationId : AppEventQueue.getKeySet()) {
                    hashSet.add(applicationId.getApplicationId());
                }
                for (String queryAppSettings : hashSet) {
                    FetchedAppSettingsManager.queryAppSettings(queryAppSettings, true);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
