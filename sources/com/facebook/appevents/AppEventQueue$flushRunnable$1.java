package com.facebook.appevents;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AppEventQueue.kt */
final class AppEventQueue$flushRunnable$1 implements Runnable {
    public static final AppEventQueue$flushRunnable$1 INSTANCE = new AppEventQueue$flushRunnable$1();

    AppEventQueue$flushRunnable$1() {
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AppEventQueue.access$setScheduledFuture$p(AppEventQueue.INSTANCE, (ScheduledFuture) null);
                if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                    AppEventQueue.flushAndWait(FlushReason.TIMER);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
