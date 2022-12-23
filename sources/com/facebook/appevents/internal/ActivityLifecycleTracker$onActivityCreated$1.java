package com.facebook.appevents.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ActivityLifecycleTracker.kt */
final class ActivityLifecycleTracker$onActivityCreated$1 implements Runnable {
    public static final ActivityLifecycleTracker$onActivityCreated$1 INSTANCE = new ActivityLifecycleTracker$onActivityCreated$1();

    ActivityLifecycleTracker$onActivityCreated$1() {
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (ActivityLifecycleTracker.currentSession == null) {
                    ActivityLifecycleTracker.currentSession = SessionInfo.Companion.getStoredSessionInfo();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
