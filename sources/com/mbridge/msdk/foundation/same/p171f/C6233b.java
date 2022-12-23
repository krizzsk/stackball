package com.mbridge.msdk.foundation.same.p171f;

import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.f.b */
/* compiled from: ThreadPoolUtils */
public final class C6233b {

    /* renamed from: a */
    public static ThreadPoolExecutor f15484a;

    /* renamed from: a */
    public static ThreadPoolExecutor m15776a() {
        if (f15484a == null) {
            f15484a = new ThreadPoolExecutor(5, 200, 15, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactory() {
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f15484a;
    }
}
