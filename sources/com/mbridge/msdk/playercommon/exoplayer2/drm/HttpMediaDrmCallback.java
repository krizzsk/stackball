package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.playercommon.exoplayer2.C6603C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final HttpDataSource.Factory dataSourceFactory;
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(String str, HttpDataSource.Factory factory) {
        this(str, false, factory);
    }

    public HttpMediaDrmCallback(String str, boolean z, HttpDataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = new HashMap();
    }

    public final void setKeyRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public final void clearKeyRequestProperty(String str) {
        Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    public final void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    public final byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) throws IOException {
        return executePost(this.dataSourceFactory, provisionRequest.getDefaultUrl() + "&signedRequest=" + Util.fromUtf8Bytes(provisionRequest.getData()), new byte[0], (Map<String, String>) null);
    }

    public final byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest, String str) throws Exception {
        String str2;
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!TextUtils.isEmpty(defaultUrl)) {
            str = defaultUrl;
        }
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(str)) {
            str = this.defaultLicenseUrl;
        }
        HashMap hashMap = new HashMap();
        if (C6603C.PLAYREADY_UUID.equals(uuid)) {
            str2 = "text/xml";
        } else {
            str2 = C6603C.CLEARKEY_UUID.equals(uuid) ? WebRequest.CONTENT_TYPE_JSON : "application/octet-stream";
        }
        hashMap.put("Content-Type", str2);
        if (C6603C.PLAYREADY_UUID.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            hashMap.putAll(this.keyRequestProperties);
        }
        return executePost(this.dataSourceFactory, str, keyRequest.getData(), hashMap);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[Catch:{ InvalidResponseCodeException -> 0x0051, all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[LOOP:1: B:7:0x002e->B:29:0x0073, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[EDGE_INSN: B:30:0x007c->B:31:? ?: BREAK  , SYNTHETIC, Splitter:B:30:0x007c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] executePost(com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory r17, java.lang.String r18, byte[] r19, java.util.Map<java.lang.String, java.lang.String> r20) throws java.io.IOException {
        /*
            com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource r1 = r17.createDataSource()
            if (r20 == 0) goto L_0x002a
            java.util.Set r0 = r20.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.setRequestProperty(r3, r2)
            goto L_0x000e
        L_0x002a:
            r2 = 0
            r0 = r18
            r3 = 0
        L_0x002e:
            com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec r15 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec
            android.net.Uri r5 = android.net.Uri.parse(r0)
            r7 = 0
            r9 = 0
            r11 = -1
            r13 = 0
            r14 = 1
            r4 = r15
            r6 = r19
            r4.<init>(r5, r6, r7, r9, r11, r13, r14)
            com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceInputStream r4 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceInputStream
            r4.<init>(r1, r15)
            byte[] r0 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.toByteArray(r4)     // Catch:{ InvalidResponseCodeException -> 0x0051 }
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly((java.io.Closeable) r4)
            return r0
        L_0x004f:
            r0 = move-exception
            goto L_0x007d
        L_0x0051:
            r0 = move-exception
            r5 = r0
            int r0 = r5.responseCode     // Catch:{ all -> 0x004f }
            r6 = 307(0x133, float:4.3E-43)
            if (r0 == r6) goto L_0x005f
            int r0 = r5.responseCode     // Catch:{ all -> 0x004f }
            r6 = 308(0x134, float:4.32E-43)
            if (r0 != r6) goto L_0x0067
        L_0x005f:
            int r0 = r3 + 1
            r6 = 5
            if (r3 >= r6) goto L_0x0066
            r3 = 1
            goto L_0x0069
        L_0x0066:
            r3 = r0
        L_0x0067:
            r0 = r3
            r3 = 0
        L_0x0069:
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = getRedirectUrl(r5)     // Catch:{ all -> 0x004f }
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 == 0) goto L_0x007c
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly((java.io.Closeable) r4)
            r16 = r3
            r3 = r0
            r0 = r16
            goto L_0x002e
        L_0x007c:
            throw r5     // Catch:{ all -> 0x004f }
        L_0x007d:
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly((java.io.Closeable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.drm.HttpMediaDrmCallback.executePost(com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource$Factory, java.lang.String, byte[], java.util.Map):byte[]");
    }

    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException) {
        List list;
        Map<String, List<String>> map = invalidResponseCodeException.headerFields;
        if (map == null || (list = map.get(HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }
}
