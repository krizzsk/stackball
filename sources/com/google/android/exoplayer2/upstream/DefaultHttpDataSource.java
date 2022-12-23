package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesSkipped;
    private long bytesToRead;
    private long bytesToSkip;
    private final int connectTimeoutMillis;
    private HttpURLConnection connection;
    private Predicate<String> contentTypePredicate;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private InputStream inputStream;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private byte[] skipBuffer;
    private final String userAgent;

    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private int connectTimeoutMs = 8000;
        private Predicate<String> contentTypePredicate;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int readTimeoutMs = 8000;
        private TransferListener transferListener;
        private String userAgent;

        @Deprecated
        public final HttpDataSource.RequestProperties getDefaultRequestProperties() {
            return this.defaultRequestProperties;
        }

        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        public Factory setConnectTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        public Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        public Factory setAllowCrossProtocolRedirects(boolean z) {
            this.allowCrossProtocolRedirects = z;
            return this;
        }

        public Factory setContentTypePredicate(Predicate<String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        public Factory setTransferListener(TransferListener transferListener2) {
            this.transferListener = transferListener2;
            return this;
        }

        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.defaultRequestProperties, this.contentTypePredicate);
            TransferListener transferListener2 = this.transferListener;
            if (transferListener2 != null) {
                defaultHttpDataSource.addTransferListener(transferListener2);
            }
            return defaultHttpDataSource;
        }
    }

    @Deprecated
    public DefaultHttpDataSource() {
        this((String) null, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, int i, int i2) {
        this(str, i, i2, false, (HttpDataSource.RequestProperties) null);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, int i, int i2, boolean z, HttpDataSource.RequestProperties requestProperties2) {
        this(str, i, i2, z, requestProperties2, (Predicate<String>) null);
    }

    private DefaultHttpDataSource(String str, int i, int i2, boolean z, HttpDataSource.RequestProperties requestProperties2, Predicate<String> predicate) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = requestProperties2;
        this.contentTypePredicate = predicate;
        this.requestProperties = new HttpDataSource.RequestProperties();
    }

    @Deprecated
    public void setContentTypePredicate(Predicate<String> predicate) {
        this.contentTypePredicate = predicate;
    }

    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public int getResponseCode() {
        int i;
        if (this.connection == null || (i = this.responseCode) <= 0) {
            return -1;
        }
        return i;
    }

    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    public long open(DataSpec dataSpec2) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        this.dataSpec = dataSpec2;
        long j = 0;
        this.bytesRead = 0;
        this.bytesSkipped = 0;
        transferInitializing(dataSpec2);
        try {
            HttpURLConnection makeConnection = makeConnection(dataSpec2);
            this.connection = makeConnection;
            try {
                this.responseCode = makeConnection.getResponseCode();
                String responseMessage = makeConnection.getResponseMessage();
                int i = this.responseCode;
                if (i < 200 || i > 299) {
                    Map headerFields = makeConnection.getHeaderFields();
                    InputStream errorStream = makeConnection.getErrorStream();
                    if (errorStream != null) {
                        try {
                            bArr = Util.toByteArray(errorStream);
                        } catch (IOException unused) {
                            bArr = Util.EMPTY_BYTE_ARRAY;
                        }
                    } else {
                        bArr = Util.EMPTY_BYTE_ARRAY;
                    }
                    byte[] bArr2 = bArr;
                    closeConnectionQuietly();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, headerFields, dataSpec2, bArr2);
                    if (this.responseCode == 416) {
                        invalidResponseCodeException.initCause(new DataSourceException(0));
                    }
                    throw invalidResponseCodeException;
                }
                String contentType = makeConnection.getContentType();
                Predicate<String> predicate = this.contentTypePredicate;
                if (predicate == null || predicate.apply(contentType)) {
                    if (this.responseCode == 200 && dataSpec2.position != 0) {
                        j = dataSpec2.position;
                    }
                    this.bytesToSkip = j;
                    boolean isCompressed = isCompressed(makeConnection);
                    if (!isCompressed) {
                        long j2 = -1;
                        if (dataSpec2.length != -1) {
                            this.bytesToRead = dataSpec2.length;
                        } else {
                            long contentLength = getContentLength(makeConnection);
                            if (contentLength != -1) {
                                j2 = contentLength - this.bytesToSkip;
                            }
                            this.bytesToRead = j2;
                        }
                    } else {
                        this.bytesToRead = dataSpec2.length;
                    }
                    try {
                        this.inputStream = makeConnection.getInputStream();
                        if (isCompressed) {
                            this.inputStream = new GZIPInputStream(this.inputStream);
                        }
                        this.opened = true;
                        transferStarted(dataSpec2);
                        return this.bytesToRead;
                    } catch (IOException e) {
                        closeConnectionQuietly();
                        throw new HttpDataSource.HttpDataSourceException(e, dataSpec2, 1);
                    }
                } else {
                    closeConnectionQuietly();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec2);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e2, dataSpec2, 1);
            }
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (message == null || !Util.toLowerInvariant(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e3, dataSpec2, 1);
            }
            throw new HttpDataSource.CleartextNotPermittedException(e3, dataSpec2);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream2 = this.inputStream;
            if (inputStream2 != null) {
                maybeTerminateInputStream(this.connection, bytesRemaining());
                inputStream2.close();
            }
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, (DataSpec) Util.castNonNull(this.dataSpec), 3);
        } catch (Throwable th) {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    /* access modifiers changed from: protected */
    public final long bytesSkipped() {
        return this.bytesSkipped;
    }

    /* access modifiers changed from: protected */
    public final long bytesRead() {
        return this.bytesRead;
    }

    /* access modifiers changed from: protected */
    public final long bytesRemaining() {
        long j = this.bytesToRead;
        return j == -1 ? j : j - this.bytesRead;
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec2) throws IOException {
        HttpURLConnection makeConnection;
        DataSpec dataSpec3 = dataSpec2;
        URL url = new URL(dataSpec3.uri.toString());
        int i = dataSpec3.httpMethod;
        byte[] bArr = dataSpec3.httpBody;
        long j = dataSpec3.position;
        long j2 = dataSpec3.length;
        boolean isFlagSet = dataSpec3.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects) {
            return makeConnection(url, i, bArr, j, j2, isFlagSet, true, dataSpec3.httpRequestHeaders);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                Map<String, String> map = dataSpec3.httpRequestHeaders;
                int i4 = i3;
                byte[] bArr2 = bArr;
                long j3 = j2;
                long j4 = j;
                makeConnection = makeConnection(url, i, bArr, j, j2, isFlagSet, false, map);
                int responseCode2 = makeConnection.getResponseCode();
                String headerField = makeConnection.getHeaderField(HttpHeaders.LOCATION);
                if ((i == 1 || i == 3) && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303 || responseCode2 == 307 || responseCode2 == 308)) {
                    makeConnection.disconnect();
                    url = handleRedirect(url, headerField);
                } else if (i != 2 || (responseCode2 != 300 && responseCode2 != 301 && responseCode2 != 302 && responseCode2 != 303)) {
                    return makeConnection;
                } else {
                    makeConnection.disconnect();
                    url = handleRedirect(url, headerField);
                    bArr2 = null;
                    i = 1;
                }
                i2 = i4;
                bArr = bArr2;
                j2 = j3;
                j = j4;
                dataSpec3 = dataSpec2;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i3);
            }
        }
        return makeConnection;
    }

    private HttpURLConnection makeConnection(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection openConnection = openConnection(url);
        openConnection.setConnectTimeout(this.connectTimeoutMillis);
        openConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties2 = this.defaultRequestProperties;
        if (requestProperties2 != null) {
            hashMap.putAll(requestProperties2.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            openConnection.setRequestProperty("Range", str);
        }
        String str2 = this.userAgent;
        if (str2 != null) {
            openConnection.setRequestProperty("User-Agent", str2);
        }
        openConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity");
        openConnection.setInstanceFollowRedirects(z2);
        openConnection.setDoOutput(bArr != null);
        openConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i));
        if (bArr != null) {
            openConnection.setFixedLengthStreamingMode(bArr.length);
            openConnection.connect();
            OutputStream outputStream = openConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            openConnection.connect();
        }
        return openConnection;
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long getContentLength(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Log.m9243e(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00b0
            java.util.regex.Pattern r1 = CONTENT_RANGE_HEADER
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00b0
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0099 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0099 }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0099 }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0099 }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0070
            r4 = r6
            goto L_0x00b0
        L_0x0070:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0099 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0099 }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x0099 }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x0099 }
            com.google.android.exoplayer2.util.Log.m9247w(r3, r0)     // Catch:{ NumberFormatException -> 0x0099 }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x0099 }
            r4 = r0
            goto L_0x00b0
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9243e(r3, r10)
        L_0x00b0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.getContentLength(java.net.HttpURLConnection):long");
    }

    private void skipInternal() throws IOException {
        if (this.bytesSkipped != this.bytesToSkip) {
            if (this.skipBuffer == null) {
                this.skipBuffer = new byte[4096];
            }
            while (true) {
                long j = this.bytesSkipped;
                long j2 = this.bytesToSkip;
                if (j != j2) {
                    int read = ((InputStream) Util.castNonNull(this.inputStream)).read(this.skipBuffer, 0, (int) Math.min(j2 - j, (long) this.skipBuffer.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.bytesSkipped += (long) read;
                        bytesTransferred(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read != -1) {
            this.bytesRead += (long) read;
            bytesTransferred(read);
            return read;
        } else if (this.bytesToRead == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    private static void maybeTerminateInputStream(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null && Util.SDK_INT >= 19 && Util.SDK_INT <= 20) {
            try {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream2.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream2.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) Assertions.checkNotNull(inputStream2.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream2, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.m9244e(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
    }
}
