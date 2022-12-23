package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class OkHTTPFileDownloadTask implements IDownloadTask {
    private final IDatabaseHelper databaseHelper;
    private volatile DownloadMessage downloadMessage;
    private DownloadModel downloadModel;
    private final DownloadRequest downloadRequest;
    private DownloadResponse downloadResponse;
    private String etag = "";
    private InputStream inputStream;
    private DownloadFileOutputStream outputStream;
    private ResponseBody responseBody;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest2, DownloadModel downloadModel2, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage2) {
        this.downloadRequest = downloadRequest2;
        this.downloadModel = downloadModel2;
        this.databaseHelper = iDatabaseHelper;
        this.downloadMessage = downloadMessage2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0286, code lost:
        if (r10.isCanceled() == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02da, code lost:
        if (r10.isCanceled() == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e0, code lost:
        return r13.downloadResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0182, code lost:
        if (r10.isCanceled() != false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e1, code lost:
        if (r10.isCanceled() == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022e, code lost:
        if (r10.isCanceled() == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0230, code lost:
        r10.cancel();
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x024a A[SYNTHETIC, Splitter:B:103:0x024a] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0259 A[SYNTHETIC, Splitter:B:108:0x0259] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0266 A[SYNTHETIC, Splitter:B:113:0x0266] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029e A[SYNTHETIC, Splitter:B:128:0x029e] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ad A[SYNTHETIC, Splitter:B:133:0x02ad] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ba A[SYNTHETIC, Splitter:B:138:0x02ba] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02e9 A[SYNTHETIC, Splitter:B:151:0x02e9] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02f8 A[SYNTHETIC, Splitter:B:156:0x02f8] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0305 A[SYNTHETIC, Splitter:B:161:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0146 A[SYNTHETIC, Splitter:B:20:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0155 A[SYNTHETIC, Splitter:B:25:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0162 A[SYNTHETIC, Splitter:B:30:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a5 A[SYNTHETIC, Splitter:B:52:0x01a5] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b4 A[SYNTHETIC, Splitter:B:57:0x01b4] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c1 A[SYNTHETIC, Splitter:B:62:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f2 A[SYNTHETIC, Splitter:B:77:0x01f2] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0201 A[SYNTHETIC, Splitter:B:82:0x0201] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020e A[SYNTHETIC, Splitter:B:87:0x020e] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0225  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x01e7=Splitter:B:73:0x01e7, B:99:0x0238=Splitter:B:99:0x0238, B:48:0x019a=Splitter:B:48:0x019a, B:124:0x028c=Splitter:B:124:0x028c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.mbridge.msdk.foundation.download.DownloadResponse run() {
        /*
            r13 = this;
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = new com.mbridge.msdk.foundation.download.DownloadResponse
            r0.<init>()
            r13.downloadResponse = r0
            com.mbridge.msdk.foundation.download.DownloadMessage r0 = r13.downloadMessage
            java.lang.String r0 = r0.getSaveFileName()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r1 = r13.downloadRequest
            java.lang.String r7 = r1.getCacheDirectoryPath()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r1 = r13.downloadRequest
            java.lang.String r8 = r1.getDownloadId()
            com.mbridge.msdk.foundation.download.core.GlobalComponent r1 = com.mbridge.msdk.foundation.download.core.GlobalComponent.getInstance()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient r1 = r1.getOkHttpClient()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.newBuilder()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r13.downloadRequest
            long r2 = r2.getConnectTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.connectTimeout(r2, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r13.downloadRequest
            long r2 = r2.getReadTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.readTimeout(r2, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r13.downloadRequest
            long r2 = r2.getWriteTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.writeTimeout(r2, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r13.downloadRequest
            long r2 = r2.getTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.callTimeout(r2, r4)
            r2 = 1
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.retryOnConnectionFailure(r2)
            com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask$1 r3 = new com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask$1
            r3.<init>()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.addNetworkInterceptor(r3)
            com.mbridge.msdk.thrid.okhttp.OkHttpClient r9 = r1.build()
            com.mbridge.msdk.thrid.okhttp.CacheControl$Builder r1 = new com.mbridge.msdk.thrid.okhttp.CacheControl$Builder
            r1.<init>()
            com.mbridge.msdk.thrid.okhttp.CacheControl$Builder r1 = r1.noCache()
            com.mbridge.msdk.thrid.okhttp.CacheControl r1 = r1.build()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.mbridge.msdk.foundation.download.core.DownloadRequest r5 = r13.downloadRequest
            long r5 = r5.getDownloadedBytes()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "bytes=%d-"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r4 = r13.downloadRequest
            com.mbridge.msdk.foundation.download.DownloadStatus r4 = r4.getStatus()
            com.mbridge.msdk.foundation.download.DownloadStatus r5 = com.mbridge.msdk.foundation.download.DownloadStatus.CANCELLED
            if (r4 != r5) goto L_0x009d
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r13.downloadResponse
            r0.setCancelled(r2)
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r13.downloadResponse
            return r0
        L_0x009d:
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = new com.mbridge.msdk.thrid.okhttp.Request$Builder
            r2.<init>()
            com.mbridge.msdk.foundation.download.DownloadMessage r4 = r13.downloadMessage
            java.lang.String r4 = r4.getDownloadUrl()
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r2.url((java.lang.String) r4)
            com.mbridge.msdk.thrid.okhttp.Request$Builder r1 = r2.cacheControl(r1)
            java.lang.String r2 = "Range"
            com.mbridge.msdk.thrid.okhttp.Request$Builder r1 = r1.addHeader(r2, r3)
            com.mbridge.msdk.thrid.okhttp.Request r1 = r1.build()
            com.mbridge.msdk.thrid.okhttp.Call r10 = r9.newCall(r1)
            r1 = 0
            com.mbridge.msdk.thrid.okhttp.Response r11 = r10.execute()     // Catch:{ SocketTimeoutException -> 0x0289, UnknownHostException -> 0x0235, IOException -> 0x01e4, IllegalAccessException -> 0x0197, all -> 0x0194 }
            boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r11)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            if (r1 != 0) goto L_0x0128
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r11.body()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            if (r1 == 0) goto L_0x00d4
            goto L_0x0128
        L_0x00d4:
            int r12 = r11.code()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            boolean r1 = r11.isSuccessful()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            if (r1 != 0) goto L_0x0114
            com.mbridge.msdk.foundation.download.DownloadError r1 = new com.mbridge.msdk.foundation.download.DownloadError     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.lang.String r4 = "responseCode "
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r3.append(r12)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.lang.String r4 = "\n"
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            com.mbridge.msdk.thrid.okhttp.ResponseBody r4 = r11.body()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.lang.String r4 = r4.string()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.lang.String r3 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r2.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r1.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            com.mbridge.msdk.foundation.download.DownloadResponse r2 = r13.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r2.setError(r1)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            com.mbridge.msdk.foundation.download.DownloadResponse r1 = r13.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r1.setSuccessful(r6)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            goto L_0x013e
        L_0x0114:
            java.lang.String r1 = "ETag"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.header(r1, r2)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r13.etag = r1     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r1 = r13
            r2 = r0
            r3 = r7
            r4 = r8
            r5 = r11
            r6 = r12
            r1.handlerRequestSuccessful(r2, r3, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            goto L_0x013e
        L_0x0128:
            com.mbridge.msdk.foundation.download.DownloadError r1 = new com.mbridge.msdk.foundation.download.DownloadError     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            java.lang.String r3 = "response is null"
            r2.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r1.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            com.mbridge.msdk.foundation.download.DownloadResponse r2 = r13.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r2.setError(r1)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            com.mbridge.msdk.foundation.download.DownloadResponse r1 = r13.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
            r1.setSuccessful(r6)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018c, IllegalAccessException -> 0x018a }
        L_0x013e:
            java.io.InputStream r0 = r13.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x014d
            java.io.InputStream r0 = r13.inputStream     // Catch:{ IOException -> 0x014c }
            r0.close()     // Catch:{ IOException -> 0x014c }
            goto L_0x014d
        L_0x014c:
        L_0x014d:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x015c
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream     // Catch:{ IOException -> 0x015b }
            r0.close()     // Catch:{ IOException -> 0x015b }
            goto L_0x015c
        L_0x015b:
        L_0x015c:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x0171
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x016d }
            r0.close()     // Catch:{ Exception -> 0x016d }
            r11.close()     // Catch:{ Exception -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0171:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x017e
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            r0.close()
        L_0x017e:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02de
            goto L_0x0230
        L_0x0186:
            r0 = move-exception
            r1 = r11
            goto L_0x02e1
        L_0x018a:
            r1 = move-exception
            goto L_0x019a
        L_0x018c:
            r1 = move-exception
            goto L_0x01e7
        L_0x018e:
            r1 = move-exception
            goto L_0x0238
        L_0x0191:
            r1 = move-exception
            goto L_0x028c
        L_0x0194:
            r0 = move-exception
            goto L_0x02e1
        L_0x0197:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x019a:
            r13.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0186 }
            java.io.InputStream r0 = r13.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01ac
            java.io.InputStream r0 = r13.inputStream     // Catch:{ IOException -> 0x01ab }
            r0.close()     // Catch:{ IOException -> 0x01ab }
            goto L_0x01ac
        L_0x01ab:
        L_0x01ac:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01bb
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream     // Catch:{ IOException -> 0x01ba }
            r0.close()     // Catch:{ IOException -> 0x01ba }
            goto L_0x01bb
        L_0x01ba:
        L_0x01bb:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x01d0
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x01cc }
            r0.close()     // Catch:{ Exception -> 0x01cc }
            r11.close()     // Catch:{ Exception -> 0x01cc }
            goto L_0x01d0
        L_0x01cc:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01d0:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01dd
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            r0.close()
        L_0x01dd:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02de
            goto L_0x0230
        L_0x01e4:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x01e7:
            r13.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0186 }
            java.io.InputStream r0 = r13.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01f9
            java.io.InputStream r0 = r13.inputStream     // Catch:{ IOException -> 0x01f8 }
            r0.close()     // Catch:{ IOException -> 0x01f8 }
            goto L_0x01f9
        L_0x01f8:
        L_0x01f9:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0208
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream     // Catch:{ IOException -> 0x0207 }
            r0.close()     // Catch:{ IOException -> 0x0207 }
            goto L_0x0208
        L_0x0207:
        L_0x0208:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x021d
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x0219 }
            r0.close()     // Catch:{ Exception -> 0x0219 }
            r11.close()     // Catch:{ Exception -> 0x0219 }
            goto L_0x021d
        L_0x0219:
            r0 = move-exception
            r0.printStackTrace()
        L_0x021d:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x022a
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            r0.close()
        L_0x022a:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02de
        L_0x0230:
            r10.cancel()
            goto L_0x02de
        L_0x0235:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x0238:
            com.mbridge.msdk.thrid.okhttp.ConnectionPool r2 = r9.connectionPool()     // Catch:{ all -> 0x0186 }
            r2.evictAll()     // Catch:{ all -> 0x0186 }
            r13.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0186 }
            java.io.InputStream r0 = r13.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0251
            java.io.InputStream r0 = r13.inputStream     // Catch:{ IOException -> 0x0250 }
            r0.close()     // Catch:{ IOException -> 0x0250 }
            goto L_0x0251
        L_0x0250:
        L_0x0251:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0260
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream     // Catch:{ IOException -> 0x025f }
            r0.close()     // Catch:{ IOException -> 0x025f }
            goto L_0x0260
        L_0x025f:
        L_0x0260:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x0275
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x0271 }
            r0.close()     // Catch:{ Exception -> 0x0271 }
            r11.close()     // Catch:{ Exception -> 0x0271 }
            goto L_0x0275
        L_0x0271:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0275:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0282
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            r0.close()
        L_0x0282:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02de
            goto L_0x0230
        L_0x0289:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x028c:
            com.mbridge.msdk.thrid.okhttp.ConnectionPool r2 = r9.connectionPool()     // Catch:{ all -> 0x0186 }
            r2.evictAll()     // Catch:{ all -> 0x0186 }
            r13.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0186 }
            java.io.InputStream r0 = r13.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02a5
            java.io.InputStream r0 = r13.inputStream     // Catch:{ IOException -> 0x02a4 }
            r0.close()     // Catch:{ IOException -> 0x02a4 }
            goto L_0x02a5
        L_0x02a4:
        L_0x02a5:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02b4
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r13.outputStream     // Catch:{ IOException -> 0x02b3 }
            r0.close()     // Catch:{ IOException -> 0x02b3 }
            goto L_0x02b4
        L_0x02b3:
        L_0x02b4:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x02c9
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x02c5 }
            r0.close()     // Catch:{ Exception -> 0x02c5 }
            r11.close()     // Catch:{ Exception -> 0x02c5 }
            goto L_0x02c9
        L_0x02c5:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02c9:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02d6
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r13.responseBody
            r0.close()
        L_0x02d6:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02de
            goto L_0x0230
        L_0x02de:
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r13.downloadResponse
            return r0
        L_0x02e1:
            java.io.InputStream r2 = r13.inputStream
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r2)
            if (r2 == 0) goto L_0x02f0
            java.io.InputStream r2 = r13.inputStream     // Catch:{ IOException -> 0x02ef }
            r2.close()     // Catch:{ IOException -> 0x02ef }
            goto L_0x02f0
        L_0x02ef:
        L_0x02f0:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r2 = r13.outputStream
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r2)
            if (r2 == 0) goto L_0x02ff
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r2 = r13.outputStream     // Catch:{ IOException -> 0x02fe }
            r2.close()     // Catch:{ IOException -> 0x02fe }
            goto L_0x02ff
        L_0x02fe:
        L_0x02ff:
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r1)
            if (r2 == 0) goto L_0x0314
            com.mbridge.msdk.thrid.okhttp.ResponseBody r2 = r1.body()     // Catch:{ Exception -> 0x0310 }
            r2.close()     // Catch:{ Exception -> 0x0310 }
            r1.close()     // Catch:{ Exception -> 0x0310 }
            goto L_0x0314
        L_0x0310:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0314:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r13.responseBody
            boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r1)
            if (r1 == 0) goto L_0x0321
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r13.responseBody
            r1.close()
        L_0x0321:
            boolean r1 = r10.isCanceled()
            if (r1 != 0) goto L_0x032a
            r10.cancel()
        L_0x032a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.run():com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void handlerRequestSuccessful(String str, String str2, String str3, Response response, int i) throws IOException, IllegalAccessException {
        boolean z = !isSupportResume(i, this.downloadModel);
        if (!(!z || response == null || this.downloadRequest == null || i != 206 || response.body() == null || response.body().contentLength() == this.downloadRequest.getTotalBytes() - this.downloadRequest.getDownloadedBytes())) {
            ILogger logger = GlobalComponent.getInstance().getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("移除： handlerRequestSuccessful： isSupportResume ");
            sb.append(z);
            sb.append(" etag: ");
            sb.append(this.etag);
            sb.append(" etag: ");
            DownloadModel downloadModel2 = this.downloadModel;
            sb.append(downloadModel2 == null ? "null" : downloadModel2.getEtag());
            sb.append(" responseCode: ");
            sb.append(i);
            logger.log(IDownloadTask.TAG, sb.toString());
            this.downloadRequest.setDownloadedBytes(0);
            this.downloadRequest.setTotalBytes(0);
            if (Objects.isNotNull(this.databaseHelper)) {
                this.databaseHelper.remove(str3, str2);
            }
            this.downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this.downloadRequest.getCacheDirectoryPath() + this.downloadMessage.getSaveFileName()));
        }
        ResponseBody body = response.body();
        this.responseBody = body;
        if (Objects.isNull(body)) {
            this.downloadResponse.setError(new DownloadError(new IOException("response body is null")));
            this.downloadRequest.setTotalBytes(0);
            this.downloadRequest.setDownloadedBytes(0);
            this.downloadResponse.setSuccessful(false);
            return;
        }
        long contentLength = this.responseBody.contentLength();
        if (this.downloadRequest.getTotalBytes() == 0) {
            this.downloadRequest.setTotalBytes(contentLength);
        }
        InputStream byteStream = this.responseBody.byteStream();
        this.inputStream = byteStream;
        if (Objects.isNotNull(byteStream)) {
            handelInputStream(str, str2, str3, this.etag);
            return;
        }
        this.downloadResponse.setError(new DownloadError(new IOException("response inputStream is null")));
        this.downloadResponse.setSuccessful(false);
    }

    private void handelInputStream(String str, String str2, String str3, String str4) throws IOException, IllegalAccessException {
        String str5;
        String str6 = str2;
        if (Objects.isNull(this.downloadModel)) {
            DownloadModel create = DownloadModel.create(this.downloadRequest.getDownloadId(), this.downloadMessage.getDownloadUrl(), this.downloadMessage.getResourceUrl(), str4, str2, this.downloadMessage.getSaveFileName(), this.downloadRequest.getTotalBytes(), 0, this.downloadMessage.getDownloadRate(), 1, this.downloadMessage.getDownloadResourceType());
            this.downloadModel = create;
            this.databaseHelper.insert(create);
        } else {
            DownloadModel create2 = DownloadModel.create(this.downloadModel.getDownloadId(), this.downloadModel.getDownloadUrl(), this.downloadMessage.getResourceUrl(), this.downloadModel.getEtag(), this.downloadModel.getSaveDirectorPath(), this.downloadModel.getSaveFileName(), this.downloadRequest.getTotalBytes(), this.downloadModel.getDownloadedBytes(), this.downloadMessage.getDownloadRate(), this.downloadModel.getUsageCounter() + 1, this.downloadMessage.getDownloadResourceType());
            this.downloadModel = create2;
            this.databaseHelper.update(create2, str6);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str6, str));
        this.outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this.downloadRequest.getDownloadedBytes());
        byte[] bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        while (true) {
            int read = this.inputStream.read(bArr);
            if (read == -1) {
                str5 = str6;
                break;
            }
            this.outputStream.write(bArr, 0, read);
            DownloadRequest downloadRequest2 = this.downloadRequest;
            downloadRequest2.setDownloadedBytes(downloadRequest2.getDownloadedBytes() + ((long) read));
            this.outputStream.flushAndSync();
            int downloadRate = Utils.getDownloadRate(this.downloadRequest.getTotalBytes(), this.downloadRequest.getDownloadedBytes());
            str5 = str6;
            sendProgress(this.downloadRequest, this.downloadMessage, this.downloadRequest.getDownloadedBytes(), this.downloadRequest.getTotalBytes(), downloadRate);
            if (this.downloadMessage.getDownloadRate() != 100 && downloadRate >= this.downloadMessage.getDownloadRate()) {
                break;
            } else if (this.downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                this.downloadResponse.setCancelled(true);
                break;
            } else {
                str6 = str5;
            }
        }
        String str7 = str3;
        GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str7, str5, DownloadModel.create(str3, this.downloadMessage.getDownloadUrl(), this.downloadMessage.getResourceUrl(), str4, str2, this.downloadMessage.getSaveFileName(), this.downloadRequest.getTotalBytes(), this.downloadRequest.getDownloadedBytes(), this.downloadMessage.getDownloadRate(), this.downloadModel.getUsageCounter(), this.downloadMessage.getDownloadResourceType()));
        if (!this.downloadResponse.isCancelled()) {
            this.downloadResponse.setSuccessful(true);
        }
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        if (Objects.isNotNull(this.databaseHelper)) {
            this.databaseHelper.remove(str3, str2);
        }
        this.downloadResponse.setError(new DownloadError(exc));
        this.downloadResponse.setSuccessful(false);
    }

    public static IDownloadTask create(DownloadRequest downloadRequest2, DownloadModel downloadModel2, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage2) {
        return new OkHTTPFileDownloadTask(downloadRequest2, downloadModel2, iDatabaseHelper, downloadMessage2);
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel2) {
        return i == 206 && (downloadModel2 == null || TextUtils.equals(this.etag, downloadModel2.getEtag()));
    }

    private void sendProgress(DownloadRequest downloadRequest2, DownloadMessage downloadMessage2, long j, long j2, int i) {
        if (downloadRequest2.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest2.handlerProcessEvent(downloadMessage2, new DownloadProgress(j, j2, i));
        }
    }
}
