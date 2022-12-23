package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityResumed$handleActivityResume$1 */
/* compiled from: ActivityLifecycleTracker.kt */
final class C2084x44fa3e13 implements Runnable {
    final /* synthetic */ String $activityName;
    final /* synthetic */ Context $appContext;
    final /* synthetic */ long $currentTime;

    C2084x44fa3e13(long j, String str, Context context) {
        this.$currentTime = j;
        this.$activityName = str;
        this.$appContext = context;
    }

    public final void run() {
        SessionInfo access$getCurrentSession$p;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                SessionInfo access$getCurrentSession$p2 = ActivityLifecycleTracker.currentSession;
                Long sessionLastEventTime = access$getCurrentSession$p2 != null ? access$getCurrentSession$p2.getSessionLastEventTime() : null;
                if (ActivityLifecycleTracker.currentSession == null) {
                    ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(this.$currentTime), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
                    String str = this.$activityName;
                    String access$getAppId$p = ActivityLifecycleTracker.appId;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNullExpressionValue(context, "appContext");
                    SessionLogger.logActivateApp(str, (SourceApplicationInfo) null, access$getAppId$p, context);
                } else if (sessionLastEventTime != null) {
                    long longValue = this.$currentTime - sessionLastEventTime.longValue();
                    if (longValue > ((long) (ActivityLifecycleTracker.INSTANCE.getSessionTimeoutInSeconds() * 1000))) {
                        SessionLogger.logDeactivateApp(this.$activityName, ActivityLifecycleTracker.currentSession, ActivityLifecycleTracker.appId);
                        String str2 = this.$activityName;
                        String access$getAppId$p2 = ActivityLifecycleTracker.appId;
                        Context context2 = this.$appContext;
                        Intrinsics.checkNotNullExpressionValue(context2, "appContext");
                        SessionLogger.logActivateApp(str2, (SourceApplicationInfo) null, access$getAppId$p2, context2);
                        ActivityLifecycleTracker.currentSession = new SessionInfo(Long.valueOf(this.$currentTime), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
                    } else if (longValue > 1000 && (access$getCurrentSession$p = ActivityLifecycleTracker.currentSession) != null) {
                        access$getCurrentSession$p.incrementInterruptionCount();
                    }
                }
                SessionInfo access$getCurrentSession$p3 = ActivityLifecycleTracker.currentSession;
                if (access$getCurrentSession$p3 != null) {
                    access$getCurrentSession$p3.setSessionLastEventTime(Long.valueOf(this.$currentTime));
                }
                SessionInfo access$getCurrentSession$p4 = ActivityLifecycleTracker.currentSession;
                if (access$getCurrentSession$p4 != null) {
                    access$getCurrentSession$p4.writeSessionToDisk();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
