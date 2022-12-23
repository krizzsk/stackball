package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo72093d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRDetector;", "", "()V", "DETECTION_INTERVAL_IN_MS", "", "anrDetectorRunnable", "Ljava/lang/Runnable;", "myUid", "previousStackTrace", "", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "checkProcessError", "", "am", "Landroid/app/ActivityManager;", "start", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: ANRDetector.kt */
public final class ANRDetector {
    private static final int DETECTION_INTERVAL_IN_MS = 500;
    public static final ANRDetector INSTANCE = new ANRDetector();
    private static final Runnable anrDetectorRunnable = ANRDetector$anrDetectorRunnable$1.INSTANCE;
    private static final int myUid = Process.myUid();
    private static String previousStackTrace = "";
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    private ANRDetector() {
    }

    @JvmStatic
    public static final void checkProcessError(ActivityManager activityManager) {
        Class<ANRDetector> cls = ANRDetector.class;
        if (!CrashShieldHandler.isObjectCrashing(cls) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                            Looper mainLooper = Looper.getMainLooper();
                            Intrinsics.checkNotNullExpressionValue(mainLooper, "Looper.getMainLooper()");
                            Thread thread = mainLooper.getThread();
                            Intrinsics.checkNotNullExpressionValue(thread, "Looper.getMainLooper().thread");
                            String stackTrace = InstrumentUtility.getStackTrace(thread);
                            if (!Intrinsics.areEqual((Object) stackTrace, (Object) previousStackTrace)) {
                                if (InstrumentUtility.isSDKRelatedThread(thread)) {
                                    previousStackTrace = stackTrace;
                                    InstrumentData.Builder.build(processErrorStateInfo.shortMsg, stackTrace).save();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void start() {
        Class<ANRDetector> cls = ANRDetector.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                scheduledExecutorService.scheduleAtFixedRate(anrDetectorRunnable, 0, (long) 500, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
