package com.mbridge.msdk.playercommon.exoplayer2.offline;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DummyDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.PriorityDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;

public final class DownloaderConstructorHelper {
    private final Cache cache;
    private final DataSource.Factory cacheReadDataSourceFactory;
    private final DataSink.Factory cacheWriteDataSinkFactory;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamDataSourceFactory;

    public DownloaderConstructorHelper(Cache cache2, DataSource.Factory factory) {
        this(cache2, factory, (DataSource.Factory) null, (DataSink.Factory) null, (PriorityTaskManager) null);
    }

    public DownloaderConstructorHelper(Cache cache2, DataSource.Factory factory, DataSource.Factory factory2, DataSink.Factory factory3, PriorityTaskManager priorityTaskManager2) {
        Assertions.checkNotNull(factory);
        this.cache = cache2;
        this.upstreamDataSourceFactory = factory;
        this.cacheReadDataSourceFactory = factory2;
        this.cacheWriteDataSinkFactory = factory3;
        this.priorityTaskManager = priorityTaskManager2;
    }

    public final Cache getCache() {
        return this.cache;
    }

    public final PriorityTaskManager getPriorityTaskManager() {
        PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
        return priorityTaskManager2 != null ? priorityTaskManager2 : new PriorityTaskManager();
    }

    public final CacheDataSource buildCacheDataSource(boolean z) {
        DataSink dataSink;
        PriorityDataSource priorityDataSource;
        DataSource.Factory factory = this.cacheReadDataSourceFactory;
        DataSource createDataSource = factory != null ? factory.createDataSource() : new FileDataSource();
        if (z) {
            return new CacheDataSource(this.cache, DummyDataSource.INSTANCE, createDataSource, (DataSink) null, 1, (CacheDataSource.EventListener) null);
        }
        DataSink.Factory factory2 = this.cacheWriteDataSinkFactory;
        if (factory2 != null) {
            dataSink = factory2.createDataSink();
        } else {
            dataSink = new CacheDataSink(this.cache, 2097152);
        }
        DataSink dataSink2 = dataSink;
        DataSource createDataSource2 = this.upstreamDataSourceFactory.createDataSource();
        PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
        if (priorityTaskManager2 == null) {
            priorityDataSource = createDataSource2;
        } else {
            priorityDataSource = new PriorityDataSource(createDataSource2, priorityTaskManager2, -1000);
        }
        return new CacheDataSource(this.cache, priorityDataSource, createDataSource, dataSink2, 1, (CacheDataSource.EventListener) null);
    }
}
