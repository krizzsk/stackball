package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020$H\u0007J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0007J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, mo72093d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "()V", "INCORRECT_IMPL_WARNING", "", "INTERRUPTION_THRESHOLD_MILLISECONDS", "", "TAG", "activityReferences", "", "appId", "currActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivityAppearTime", "currentFuture", "Ljava/util/concurrent/ScheduledFuture;", "currentFutureLock", "currentSession", "Lcom/facebook/appevents/internal/SessionInfo;", "foregroundActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "sessionTimeoutInSeconds", "getSessionTimeoutInSeconds", "()I", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "tracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelCurrentTask", "", "getCurrentActivity", "getCurrentSessionGuid", "Ljava/util/UUID;", "isInBackground", "", "isTracking", "onActivityCreated", "activity", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "startTracking", "application", "Landroid/app/Application;", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: ActivityLifecycleTracker.kt */
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    /* access modifiers changed from: private */
    public static final String TAG;
    /* access modifiers changed from: private */
    public static int activityReferences;
    /* access modifiers changed from: private */
    public static String appId;
    private static WeakReference<Activity> currActivity;
    /* access modifiers changed from: private */
    public static long currentActivityAppearTime;
    /* access modifiers changed from: private */
    public static volatile ScheduledFuture<?> currentFuture;
    /* access modifiers changed from: private */
    public static final Object currentFutureLock = new Object();
    /* access modifiers changed from: private */
    public static volatile SessionInfo currentSession;
    /* access modifiers changed from: private */
    public static final AtomicInteger foregroundActivityCount = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static final AtomicBoolean tracking = new AtomicBoolean(false);

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
    }

    private ActivityLifecycleTracker() {
    }

    @JvmStatic
    public static final void startTracking(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, ActivityLifecycleTracker$startTracking$1.INSTANCE);
            appId = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleTracker$startTracking$2());
        }
    }

    @JvmStatic
    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    @JvmStatic
    public static final boolean isTracking() {
        return tracking.get();
    }

    @JvmStatic
    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    @JvmStatic
    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(ActivityLifecycleTracker$onActivityCreated$1.INSTANCE);
    }

    @JvmStatic
    public static final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = currentTimeMillis;
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        InAppPurchaseManager.startTracking();
        singleThreadExecutor.execute(new C2084x44fa3e13(currentTimeMillis, activityName, activity.getApplicationContext()));
    }

    /* access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        if (foregroundActivityCount.decrementAndGet() < 0) {
            foregroundActivityCount.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new ActivityLifecycleTracker$onActivityPaused$handleActivityPaused$1(currentTimeMillis, activityName));
    }

    /* access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    /* access modifiers changed from: private */
    public final int getSessionTimeoutInSeconds() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery != null) {
            return appSettingsWithoutQuery.getSessionTimeoutInSeconds();
        }
        return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
    }

    private final void cancelCurrentTask() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (!(currentFuture == null || (scheduledFuture = currentFuture) == null)) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }
}
