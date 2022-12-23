package com.smaato.sdk.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public interface Scheduler extends ExecutorService {
    Disposable scheduleWithDelay(Runnable runnable, long j, TimeUnit timeUnit);

    Disposable scheduleWithRate(Runnable runnable, long j, TimeUnit timeUnit);
}
