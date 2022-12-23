package com.facebook.appevents;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AppEventQueue.kt */
final class AppEventQueue$add$1 implements Runnable {
    final /* synthetic */ AccessTokenAppIdPair $accessTokenAppId;
    final /* synthetic */ AppEvent $appEvent;

    AppEventQueue$add$1(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        this.$accessTokenAppId = accessTokenAppIdPair;
        this.$appEvent = appEvent;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AppEventQueue.access$getAppEventCollection$p(AppEventQueue.INSTANCE).addEvent(this.$accessTokenAppId, this.$appEvent);
                if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && AppEventQueue.access$getAppEventCollection$p(AppEventQueue.INSTANCE).getEventCount() > AppEventQueue.access$getNUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER$p(AppEventQueue.INSTANCE)) {
                    AppEventQueue.flushAndWait(FlushReason.EVENT_THRESHOLD);
                } else if (AppEventQueue.access$getScheduledFuture$p(AppEventQueue.INSTANCE) == null) {
                    AppEventQueue.access$setScheduledFuture$p(AppEventQueue.INSTANCE, AppEventQueue.access$getSingleThreadExecutor$p(AppEventQueue.INSTANCE).schedule(AppEventQueue.access$getFlushRunnable$p(AppEventQueue.INSTANCE), (long) 15, TimeUnit.SECONDS));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
