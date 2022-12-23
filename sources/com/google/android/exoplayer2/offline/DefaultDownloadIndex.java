package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.offline.DownloadCursor;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;

public final class DefaultDownloadIndex implements WritableDownloadIndex {
    private static final String[] COLUMNS = {"id", COLUMN_MIME_TYPE, "uri", COLUMN_STREAM_KEYS, COLUMN_CUSTOM_CACHE_KEY, "data", "state", COLUMN_START_TIME_MS, COLUMN_UPDATE_TIME_MS, COLUMN_CONTENT_LENGTH, "stop_reason", COLUMN_FAILURE_REASON, COLUMN_PERCENT_DOWNLOADED, COLUMN_BYTES_DOWNLOADED, COLUMN_KEY_SET_ID};
    private static final String COLUMN_BYTES_DOWNLOADED = "bytes_downloaded";
    private static final String COLUMN_CONTENT_LENGTH = "content_length";
    private static final String COLUMN_CUSTOM_CACHE_KEY = "custom_cache_key";
    private static final String COLUMN_DATA = "data";
    private static final String COLUMN_FAILURE_REASON = "failure_reason";
    private static final String COLUMN_ID = "id";
    private static final int COLUMN_INDEX_BYTES_DOWNLOADED = 13;
    private static final int COLUMN_INDEX_CONTENT_LENGTH = 9;
    private static final int COLUMN_INDEX_CUSTOM_CACHE_KEY = 4;
    private static final int COLUMN_INDEX_DATA = 5;
    private static final int COLUMN_INDEX_FAILURE_REASON = 11;
    private static final int COLUMN_INDEX_ID = 0;
    private static final int COLUMN_INDEX_KEY_SET_ID = 14;
    private static final int COLUMN_INDEX_MIME_TYPE = 1;
    private static final int COLUMN_INDEX_PERCENT_DOWNLOADED = 12;
    private static final int COLUMN_INDEX_START_TIME_MS = 7;
    private static final int COLUMN_INDEX_STATE = 6;
    private static final int COLUMN_INDEX_STOP_REASON = 10;
    private static final int COLUMN_INDEX_STREAM_KEYS = 3;
    private static final int COLUMN_INDEX_UPDATE_TIME_MS = 8;
    private static final int COLUMN_INDEX_URI = 2;
    private static final String COLUMN_KEY_SET_ID = "key_set_id";
    private static final String COLUMN_MIME_TYPE = "mime_type";
    private static final String COLUMN_PERCENT_DOWNLOADED = "percent_downloaded";
    private static final String COLUMN_START_TIME_MS = "start_time_ms";
    private static final String COLUMN_STATE = "state";
    private static final String COLUMN_STOP_REASON = "stop_reason";
    private static final String COLUMN_STREAM_KEYS = "stream_keys";
    private static final String COLUMN_UPDATE_TIME_MS = "update_time_ms";
    private static final String COLUMN_URI = "uri";
    private static final String TABLE_PREFIX = "ExoPlayerDownloads";
    private static final String TABLE_SCHEMA = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    static final int TABLE_VERSION = 3;
    private static final String TRUE = "1";
    private static final String WHERE_ID_EQUALS = "id = ?";
    private static final String WHERE_STATE_IS_DOWNLOADING = "state = 2";
    private static final String WHERE_STATE_IS_TERMINAL = getStateQuery(3, 4);
    private final DatabaseProvider databaseProvider;
    private final Object initializationLock;
    private boolean initialized;
    private final String name;
    private final String tableName;

    public DefaultDownloadIndex(DatabaseProvider databaseProvider2) {
        this(databaseProvider2, "");
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider2, String str) {
        this.name = str;
        this.databaseProvider = databaseProvider2;
        this.tableName = TABLE_PREFIX + str;
        this.initializationLock = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        if (r4 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        $closeResource(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.offline.Download getDownload(java.lang.String r4) throws com.google.android.exoplayer2.database.DatabaseIOException {
        /*
            r3 = this;
            r3.ensureInitialized()
            java.lang.String r0 = "id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0032 }
            r2 = 0
            r1[r2] = r4     // Catch:{ SQLiteException -> 0x0032 }
            android.database.Cursor r4 = r3.getCursor(r0, r1)     // Catch:{ SQLiteException -> 0x0032 }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            if (r4 == 0) goto L_0x001b
            $closeResource(r1, r4)     // Catch:{ SQLiteException -> 0x0032 }
        L_0x001b:
            return r1
        L_0x001c:
            r4.moveToNext()     // Catch:{ all -> 0x0029 }
            com.google.android.exoplayer2.offline.Download r0 = getDownloadForCurrentRow(r4)     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x0028
            $closeResource(r1, r4)     // Catch:{ SQLiteException -> 0x0032 }
        L_0x0028:
            return r0
        L_0x0029:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            if (r4 == 0) goto L_0x0031
            $closeResource(r0, r4)     // Catch:{ SQLiteException -> 0x0032 }
        L_0x0031:
            throw r1     // Catch:{ SQLiteException -> 0x0032 }
        L_0x0032:
            r4 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DefaultDownloadIndex.getDownload(java.lang.String):com.google.android.exoplayer2.offline.Download");
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public DownloadCursor getDownloads(int... iArr) throws DatabaseIOException {
        ensureInitialized();
        return new DownloadCursorImpl(getCursor(getStateQuery(iArr), (String[]) null));
    }

    public void putDownload(Download download) throws DatabaseIOException {
        ensureInitialized();
        try {
            putDownloadInternal(download, this.databaseProvider.getWritableDatabase());
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void removeDownload(String str) throws DatabaseIOException {
        ensureInitialized();
        try {
            this.databaseProvider.getWritableDatabase().delete(this.tableName, WHERE_ID_EQUALS, new String[]{str});
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void setDownloadingStatesToQueued() throws DatabaseIOException {
        ensureInitialized();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 0);
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, WHERE_STATE_IS_DOWNLOADING, (String[]) null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void setStatesToRemoving() throws DatabaseIOException {
        ensureInitialized();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 5);
            contentValues.put(COLUMN_FAILURE_REASON, 0);
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, (String) null, (String[]) null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void setStopReason(int i) throws DatabaseIOException {
        ensureInitialized();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.databaseProvider.getWritableDatabase().update(this.tableName, contentValues, WHERE_STATE_IS_TERMINAL, (String[]) null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void setStopReason(String str, int i) throws DatabaseIOException {
        ensureInitialized();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            String str2 = this.tableName;
            writableDatabase.update(str2, contentValues, WHERE_STATE_IS_TERMINAL + " AND " + WHERE_ID_EQUALS, new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    private void ensureInitialized() throws DatabaseIOException {
        SQLiteDatabase writableDatabase;
        synchronized (this.initializationLock) {
            if (!this.initialized) {
                try {
                    int version = VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 0, this.name);
                    if (version != 3) {
                        writableDatabase = this.databaseProvider.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        VersionTable.setVersion(writableDatabase, 0, this.name, 3);
                        List<Download> loadDownloadsFromVersion2 = version == 2 ? loadDownloadsFromVersion2(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.tableName);
                        writableDatabase.execSQL("CREATE TABLE " + this.tableName + " " + TABLE_SCHEMA);
                        for (Download putDownloadInternal : loadDownloadsFromVersion2) {
                            putDownloadInternal(putDownloadInternal, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    }
                    this.initialized = true;
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        }
    }

    private void putDownloadInternal(Download download, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = download.request.keySetId == null ? Util.EMPTY_BYTE_ARRAY : download.request.keySetId;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", download.request.f10057id);
        contentValues.put(COLUMN_MIME_TYPE, download.request.mimeType);
        contentValues.put("uri", download.request.uri.toString());
        contentValues.put(COLUMN_STREAM_KEYS, encodeStreamKeys(download.request.streamKeys));
        contentValues.put(COLUMN_CUSTOM_CACHE_KEY, download.request.customCacheKey);
        contentValues.put("data", download.request.data);
        contentValues.put("state", Integer.valueOf(download.state));
        contentValues.put(COLUMN_START_TIME_MS, Long.valueOf(download.startTimeMs));
        contentValues.put(COLUMN_UPDATE_TIME_MS, Long.valueOf(download.updateTimeMs));
        contentValues.put(COLUMN_CONTENT_LENGTH, Long.valueOf(download.contentLength));
        contentValues.put("stop_reason", Integer.valueOf(download.stopReason));
        contentValues.put(COLUMN_FAILURE_REASON, Integer.valueOf(download.failureReason));
        contentValues.put(COLUMN_PERCENT_DOWNLOADED, Float.valueOf(download.getPercentDownloaded()));
        contentValues.put(COLUMN_BYTES_DOWNLOADED, Long.valueOf(download.getBytesDownloaded()));
        contentValues.put(COLUMN_KEY_SET_ID, bArr);
        sQLiteDatabase.replaceOrThrow(this.tableName, (String) null, contentValues);
    }

    private List<Download> loadDownloadsFromVersion2(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        if (!Util.tableExists(sQLiteDatabase, this.tableName)) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(this.tableName, new String[]{"id", "title", "uri", COLUMN_STREAM_KEYS, COLUMN_CUSTOM_CACHE_KEY, "data", "state", COLUMN_START_TIME_MS, COLUMN_UPDATE_TIME_MS, COLUMN_CONTENT_LENGTH, "stop_reason", COLUMN_FAILURE_REASON, COLUMN_PERCENT_DOWNLOADED, COLUMN_BYTES_DOWNLOADED}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(getDownloadForCurrentRowV2(query));
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (query != null) {
                    $closeResource(th, query);
                }
                throw th3;
            }
        }
        if (query != null) {
            $closeResource((Throwable) null, query);
        }
        return arrayList;
    }

    private static String inferMimeType(String str) {
        if ("dash".equals(str)) {
            return "application/dash+xml";
        }
        if ("hls".equals(str)) {
            return "application/x-mpegURL";
        }
        return "ss".equals(str) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
    }

    private Cursor getCursor(String str, String[] strArr) throws DatabaseIOException {
        try {
            return this.databaseProvider.getReadableDatabase().query(this.tableName, COLUMNS, str, strArr, (String) null, (String) null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    static String encodeStreamKeys(List<StreamKey> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            StreamKey streamKey = list.get(i);
            sb.append(streamKey.periodIndex);
            sb.append('.');
            sb.append(streamKey.groupIndex);
            sb.append('.');
            sb.append(streamKey.trackIndex);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static String getStateQuery(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state");
        sb.append(" IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public static Download getDownloadForCurrentRow(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        DownloadRequest.Builder streamKeys = new DownloadRequest.Builder(cursor.getString(0), Uri.parse(cursor.getString(2))).setMimeType(cursor.getString(1)).setStreamKeys(decodeStreamKeys(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest build = streamKeys.setKeySetId(blob).setCustomCacheKey(cursor.getString(4)).setData(cursor.getBlob(5)).build();
        DownloadProgress downloadProgress = new DownloadProgress();
        downloadProgress.bytesDownloaded = cursor.getLong(13);
        downloadProgress.percentDownloaded = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new Download(build, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    private static Download getDownloadForCurrentRowV2(Cursor cursor) {
        DownloadRequest build = new DownloadRequest.Builder(cursor.getString(0), Uri.parse(cursor.getString(2))).setMimeType(inferMimeType(cursor.getString(1))).setStreamKeys(decodeStreamKeys(cursor.getString(3))).setCustomCacheKey(cursor.getString(4)).setData(cursor.getBlob(5)).build();
        DownloadProgress downloadProgress = new DownloadProgress();
        downloadProgress.bytesDownloaded = cursor.getLong(13);
        downloadProgress.percentDownloaded = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new Download(build, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    private static List<StreamKey> decodeStreamKeys(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            return arrayList;
        }
        for (String split : Util.split(str, ",")) {
            String[] split2 = Util.split(split, "\\.");
            Assertions.checkState(split2.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2])));
        }
        return arrayList;
    }

    private static final class DownloadCursorImpl implements DownloadCursor {
        private final Cursor cursor;

        public /* synthetic */ boolean isAfterLast() {
            return DownloadCursor.CC.$default$isAfterLast(this);
        }

        public /* synthetic */ boolean isBeforeFirst() {
            return DownloadCursor.CC.$default$isBeforeFirst(this);
        }

        public /* synthetic */ boolean isFirst() {
            return DownloadCursor.CC.$default$isFirst(this);
        }

        public /* synthetic */ boolean isLast() {
            return DownloadCursor.CC.$default$isLast(this);
        }

        public /* synthetic */ boolean moveToFirst() {
            return DownloadCursor.CC.$default$moveToFirst(this);
        }

        public /* synthetic */ boolean moveToLast() {
            return DownloadCursor.CC.$default$moveToLast(this);
        }

        public /* synthetic */ boolean moveToNext() {
            return DownloadCursor.CC.$default$moveToNext(this);
        }

        public /* synthetic */ boolean moveToPrevious() {
            return DownloadCursor.CC.$default$moveToPrevious(this);
        }

        private DownloadCursorImpl(Cursor cursor2) {
            this.cursor = cursor2;
        }

        public Download getDownload() {
            return DefaultDownloadIndex.getDownloadForCurrentRow(this.cursor);
        }

        public int getCount() {
            return this.cursor.getCount();
        }

        public int getPosition() {
            return this.cursor.getPosition();
        }

        public boolean moveToPosition(int i) {
            return this.cursor.moveToPosition(i);
        }

        public void close() {
            this.cursor.close();
        }

        public boolean isClosed() {
            return this.cursor.isClosed();
        }
    }
}
