package com.facebook.appevents.internal;

import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ActivityLifecycleTracker.kt */
final class ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 implements Runnable {
    final /* synthetic */ String $activityName;
    final /* synthetic */ long $currentTime;

    ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1(long j, String str) {
        this.$currentTime = j;
        this.$activityName = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r8)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.SessionInfo r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0024
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.SessionInfo r7 = new com.facebook.appevents.internal.SessionInfo     // Catch:{ all -> 0x0092 }
            long r1 = r8.$currentTime     // Catch:{ all -> 0x0092 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0092 }
            r3 = 0
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession = r7     // Catch:{ all -> 0x0092 }
        L_0x0024:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.SessionInfo r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0035
            long r1 = r8.$currentTime     // Catch:{ all -> 0x0092 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0092 }
            r0.setSessionLastEventTime(r1)     // Catch:{ all -> 0x0092 }
        L_0x0035:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.foregroundActivityCount     // Catch:{ all -> 0x0092 }
            int r0 = r0.get()     // Catch:{ all -> 0x0092 }
            if (r0 > 0) goto L_0x006e
            com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1$task$1 r0 = new com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1$task$1     // Catch:{ all -> 0x0092 }
            r0.<init>(r8)     // Catch:{ all -> 0x0092 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r1 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentFutureLock     // Catch:{ all -> 0x0092 }
            monitor-enter(r1)     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r2 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x006b }
            com.facebook.appevents.internal.ActivityLifecycleTracker r3 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x006b }
            java.util.concurrent.ScheduledExecutorService r3 = com.facebook.appevents.internal.ActivityLifecycleTracker.singleThreadExecutor     // Catch:{ all -> 0x006b }
            com.facebook.appevents.internal.ActivityLifecycleTracker r4 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x006b }
            int r4 = r4.getSessionTimeoutInSeconds()     // Catch:{ all -> 0x006b }
            long r4 = (long) r4     // Catch:{ all -> 0x006b }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x006b }
            java.util.concurrent.ScheduledFuture r0 = r3.schedule(r0, r4, r6)     // Catch:{ all -> 0x006b }
            com.facebook.appevents.internal.ActivityLifecycleTracker.currentFuture = r0     // Catch:{ all -> 0x006b }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006b }
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x006e:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            long r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentActivityAppearTime     // Catch:{ all -> 0x0092 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0081
            long r2 = r8.$currentTime     // Catch:{ all -> 0x0092 }
            long r2 = r2 - r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ all -> 0x0092 }
            long r2 = r2 / r0
        L_0x0081:
            java.lang.String r0 = r8.$activityName     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.AutomaticAnalyticsLogger.logActivityTimeSpentEvent(r0, r2)     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0092 }
            com.facebook.appevents.internal.SessionInfo r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0091
            r0.writeSessionToDisk()     // Catch:{ all -> 0x0092 }
        L_0x0091:
            return
        L_0x0092:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1.run():void");
    }
}
