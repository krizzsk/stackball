package com.facebook.appevents.internal;

import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1$task$1 */
/* compiled from: ActivityLifecycleTracker.kt */
final class C2083x66d03 implements Runnable {
    final /* synthetic */ ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 this$0;

    C2083x66d03(ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 activityLifecycleTracker$onActivityPaused$handleActivityPaused$1) {
        this.this$0 = activityLifecycleTracker$onActivityPaused$handleActivityPaused$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
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
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.SessionInfo r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0026
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.SessionInfo r7 = new com.facebook.appevents.internal.SessionInfo     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 r1 = r8.this$0     // Catch:{ all -> 0x0068 }
            long r1 = r1.$currentTime     // Catch:{ all -> 0x0068 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0068 }
            r3 = 0
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession = r7     // Catch:{ all -> 0x0068 }
        L_0x0026:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.foregroundActivityCount     // Catch:{ all -> 0x0068 }
            int r0 = r0.get()     // Catch:{ all -> 0x0068 }
            r1 = 0
            if (r0 > 0) goto L_0x0053
            com.facebook.appevents.internal.ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1 r0 = r8.this$0     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = r0.$activityName     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r2 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.SessionInfo r2 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r3 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = com.facebook.appevents.internal.ActivityLifecycleTracker.appId     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.SessionLogger.logDeactivateApp(r0, r2, r3)     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.SessionInfo$Companion r0 = com.facebook.appevents.internal.SessionInfo.Companion     // Catch:{ all -> 0x0068 }
            r0.clearSavedSessionFromDisk()     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            r2 = r1
            com.facebook.appevents.internal.SessionInfo r2 = (com.facebook.appevents.internal.SessionInfo) r2     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker.currentSession = r2     // Catch:{ all -> 0x0068 }
        L_0x0053:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.currentFutureLock     // Catch:{ all -> 0x0068 }
            monitor-enter(r0)     // Catch:{ all -> 0x0068 }
            com.facebook.appevents.internal.ActivityLifecycleTracker r2 = com.facebook.appevents.internal.ActivityLifecycleTracker.INSTANCE     // Catch:{ all -> 0x0065 }
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1     // Catch:{ all -> 0x0065 }
            com.facebook.appevents.internal.ActivityLifecycleTracker.currentFuture = r1     // Catch:{ all -> 0x0065 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0065 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0065:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.C2083x66d03.run():void");
    }
}
