package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.TeeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InterruptedIOException;

public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final long DEFAULT_MAX_CACHE_FILE_SIZE = 2097152;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final DataSource cacheReadDataSource;
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private DataSource currentDataSource;
    private boolean currentDataSpecLengthUnset;
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final EventListener eventListener;
    private int flags;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private String key;
    private long readPosition;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;
    private Uri uri;

    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    public @interface Flags {
    }

    public CacheDataSource(Cache cache2, DataSource dataSource) {
        this(cache2, dataSource, 0, 2097152);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, int i) {
        this(cache2, dataSource, i, 2097152);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, int i, long j) {
        this(cache2, dataSource, new FileDataSource(), new CacheDataSink(cache2, j), i, (EventListener) null);
    }

    public CacheDataSource(Cache cache2, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, EventListener eventListener2) {
        this.cache = cache2;
        this.cacheReadDataSource = dataSource2;
        boolean z = false;
        this.blockOnCache = (i & 1) != 0;
        this.ignoreCacheOnError = (i & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i & 4) != 0 ? true : z;
        this.upstreamDataSource = dataSource;
        if (dataSink != null) {
            this.cacheWriteDataSource = new TeeDataSource(dataSource, dataSink);
        } else {
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener2;
    }

    public final long open(DataSpec dataSpec) throws IOException {
        try {
            this.key = CacheUtil.getKey(dataSpec);
            Uri uri2 = dataSpec.uri;
            this.uri = uri2;
            this.actualUri = getRedirectedUriOrDefault(this.cache, this.key, uri2);
            this.flags = dataSpec.flags;
            this.readPosition = dataSpec.position;
            int shouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = shouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(shouldIgnoreCacheForRequest);
            }
            if (dataSpec.length == -1) {
                if (!this.currentRequestIgnoresCache) {
                    long contentLength = this.cache.getContentLength(this.key);
                    this.bytesRemaining = contentLength;
                    if (contentLength != -1) {
                        long j = contentLength - dataSpec.position;
                        this.bytesRemaining = j;
                        if (j <= 0) {
                            throw new DataSourceException(0);
                        }
                    }
                    openNextSource(false);
                    return this.bytesRemaining;
                }
            }
            this.bytesRemaining = dataSpec.length;
            openNextSource(false);
            return this.bytesRemaining;
        } catch (IOException e) {
            handleBeforeThrow(e);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(true);
            }
            int read = this.currentDataSource.read(bArr, i, i2);
            if (read != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += (long) read;
                }
                long j = (long) read;
                this.readPosition += j;
                if (this.bytesRemaining != -1) {
                    this.bytesRemaining -= j;
                }
            } else if (this.currentDataSpecLengthUnset) {
                setNoBytesRemainingAndMaybeStoreLength();
            } else {
                if (this.bytesRemaining <= 0) {
                    if (this.bytesRemaining == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (!this.currentDataSpecLengthUnset || !isCausedByPositionOutOfRange(e)) {
                handleBeforeThrow(e);
                throw e;
            }
            setNoBytesRemainingAndMaybeStoreLength();
            return -1;
        }
    }

    public final Uri getUri() {
        return this.actualUri;
    }

    public final void close() throws IOException {
        this.uri = null;
        this.actualUri = null;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (IOException e) {
            handleBeforeThrow(e);
            throw e;
        }
    }

    private void openNextSource(boolean z) throws IOException {
        CacheSpan cacheSpan;
        DataSpec dataSpec;
        DataSource dataSource;
        long j;
        if (this.currentRequestIgnoresCache) {
            cacheSpan = null;
        } else if (this.blockOnCache) {
            try {
                cacheSpan = this.cache.startReadWrite(this.key, this.readPosition);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpan = this.cache.startReadWriteNonBlocking(this.key, this.readPosition);
        }
        if (cacheSpan == null) {
            dataSource = this.upstreamDataSource;
            dataSpec = new DataSpec(this.uri, this.readPosition, this.bytesRemaining, this.key, this.flags);
        } else if (cacheSpan.isCached) {
            Uri fromFile = Uri.fromFile(cacheSpan.file);
            long j2 = this.readPosition - cacheSpan.position;
            long j3 = cacheSpan.length - j2;
            long j4 = this.bytesRemaining;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            dataSpec = new DataSpec(fromFile, this.readPosition, j2, j3, this.key, this.flags);
            dataSource = this.cacheReadDataSource;
        } else {
            if (cacheSpan.isOpenEnded()) {
                j = this.bytesRemaining;
            } else {
                j = cacheSpan.length;
                long j5 = this.bytesRemaining;
                if (j5 != -1) {
                    j = Math.min(j, j5);
                }
            }
            DataSpec dataSpec2 = new DataSpec(this.uri, this.readPosition, j, this.key, this.flags);
            DataSource dataSource2 = this.cacheWriteDataSource;
            if (dataSource2 == null) {
                dataSource2 = this.upstreamDataSource;
                this.cache.releaseHoleSpan(cacheSpan);
                cacheSpan = null;
            }
            dataSpec = dataSpec2;
            dataSource = dataSource2;
        }
        this.checkCachePosition = (this.currentRequestIgnoresCache || dataSource != this.upstreamDataSource) ? Long.MAX_VALUE : this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
        if (z) {
            Assertions.checkState(isBypassingCache());
            if (dataSource != this.upstreamDataSource) {
                try {
                    closeCurrentSource();
                } catch (Throwable th) {
                    if (cacheSpan.isHoleSpan()) {
                        this.cache.releaseHoleSpan(cacheSpan);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
        if (cacheSpan != null && cacheSpan.isHoleSpan()) {
            this.currentHoleSpan = cacheSpan;
        }
        this.currentDataSource = dataSource;
        this.currentDataSpecLengthUnset = dataSpec.length == -1;
        long open = dataSource.open(dataSpec);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (this.currentDataSpecLengthUnset && open != -1) {
            this.bytesRemaining = open;
            ContentMetadataInternal.setContentLength(contentMetadataMutations, this.readPosition + open);
        }
        if (isReadingFromUpstream()) {
            Uri uri2 = this.currentDataSource.getUri();
            this.actualUri = uri2;
            if (true ^ this.uri.equals(uri2)) {
                ContentMetadataInternal.setRedirectedUri(contentMetadataMutations, this.actualUri);
            } else {
                ContentMetadataInternal.removeRedirectedUri(contentMetadataMutations);
            }
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength() throws IOException {
        this.bytesRemaining = 0;
        if (isWritingToCache()) {
            this.cache.setContentLength(this.key, this.readPosition);
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache2, String str, Uri uri2) {
        Uri redirectedUri = ContentMetadataInternal.getRedirectedUri(cache2.getContentMetadata(str));
        return redirectedUri == null ? uri2 : redirectedUri;
    }

    private static boolean isCausedByPositionOutOfRange(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof DataSourceException) && ((DataSourceException) th).reason == 0) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void closeCurrentSource() throws IOException {
        DataSource dataSource = this.currentDataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.currentDataSource = null;
                this.currentDataSpecLengthUnset = false;
                CacheSpan cacheSpan = this.currentHoleSpan;
                if (cacheSpan != null) {
                    this.cache.releaseHoleSpan(cacheSpan);
                    this.currentHoleSpan = null;
                }
            }
        }
    }

    private void handleBeforeThrow(IOException iOException) {
        if (isReadingFromCache() || (iOException instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (!this.ignoreCacheOnError || !this.seenCacheError) {
            return (!this.ignoreCacheForUnsetLengthRequests || dataSpec.length != -1) ? -1 : 1;
        }
        return 0;
    }

    private void notifyCacheIgnored(int i) {
        EventListener eventListener2 = this.eventListener;
        if (eventListener2 != null) {
            eventListener2.onCacheIgnored(i);
        }
    }

    private void notifyBytesRead() {
        EventListener eventListener2 = this.eventListener;
        if (eventListener2 != null && this.totalCachedBytesRead > 0) {
            eventListener2.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
            this.totalCachedBytesRead = 0;
        }
    }
}
