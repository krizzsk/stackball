package com.mbridge.msdk.foundation.download.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class DefaultExecutorSupplier implements ExecutorSupplier {
    private static int DEFAULT_MAX_NUM_THREADS;
    private final ExecutorService backgroundExecutor;
    private final ExecutorService downloadResultExecutor;
    private final DownloadExecutor networkExecutor;

    DefaultExecutorSupplier() {
        try {
            DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors() + 1;
        } catch (Exception unused) {
            DEFAULT_MAX_NUM_THREADS = 5;
        }
        this.networkExecutor = new DownloadExecutor(DEFAULT_MAX_NUM_THREADS, new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.backgroundExecutor = Executors.newSingleThreadExecutor();
        this.downloadResultExecutor = Executors.newCachedThreadPool();
    }

    public DownloadExecutor getDownloadTasks() {
        return this.networkExecutor;
    }

    public ExecutorService getDownloadResultTasks() {
        return this.downloadResultExecutor;
    }

    public ExecutorService getBackgroundTasks() {
        return this.backgroundExecutor;
    }

    public ExecutorService getLruCacheThreadTasks() {
        return this.backgroundExecutor;
    }
}
