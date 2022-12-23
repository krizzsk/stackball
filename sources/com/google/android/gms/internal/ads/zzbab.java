package com.google.android.gms.internal.ads;

import com.chartboost.sdk.CBLocation;
import com.facebook.appevents.AppEventsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbab {
    public static final zzdrh zzdzr = zza(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), zzff(CBLocation.LOCATION_DEFAULT)));
    public static final zzdrh zzdzs;
    public static final zzdrh zzdzt;
    public static final ScheduledExecutorService zzdzu = new ScheduledThreadPoolExecutor(3, zzff(AppEventsConstants.EVENT_NAME_SCHEDULE));
    public static final zzdrh zzdzv = zza(new zzbad());
    public static final zzdrh zzdzw = zza(zzdrk.zzawr());

    private static ThreadFactory zzff(String str) {
        return new zzbae(str);
    }

    private static zzdrh zza(Executor executor) {
        return new zzbag(executor, (zzbae) null);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzff("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzdzs = zza(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzff("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzdzt = zza(threadPoolExecutor2);
    }
}
