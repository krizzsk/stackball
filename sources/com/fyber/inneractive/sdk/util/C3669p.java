package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.util.p */
public final class C3669p {
    /* renamed from: a */
    public static boolean m9149a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[SYNTHETIC, Splitter:B:30:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC, Splitter:B:34:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9148a(java.lang.String r8, int r9, java.io.OutputStream r10) throws java.io.IOException {
        /*
            com.fyber.inneractive.sdk.util.c r0 = com.fyber.inneractive.sdk.util.C3645c.m9069a()
            java.nio.ByteBuffer r0 = r0.mo19569b()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x007b, all -> 0x006d }
            r2.<init>(r8)     // Catch:{ IOException -> 0x007b, all -> 0x006d }
            java.net.URLConnection r8 = r2.openConnection()     // Catch:{ IOException -> 0x007b, all -> 0x006d }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x007b, all -> 0x006d }
            java.lang.String r2 = "Range"
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            java.lang.String r4 = "bytes=%d-"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r6 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r5[r6] = r9     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            java.lang.String r9 = java.lang.String.format(r3, r4, r5)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r8.setRequestProperty(r2, r9)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r8.connect()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            int r9 = r8.getResponseCode()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r2 = 206(0xce, float:2.89E-43)
            if (r9 != r2) goto L_0x005c
            java.io.InputStream r1 = r8.getInputStream()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            byte[] r9 = r0.array()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
        L_0x003e:
            int r0 = r1.read(r9)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r2 = -1
            if (r0 == r2) goto L_0x0049
            r10.write(r9)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            goto L_0x003e
        L_0x0049:
            r1.close()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            r8.disconnect()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            if (r8 == 0) goto L_0x0056
            r8.disconnect()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r1 == 0) goto L_0x007a
            r1.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            return
        L_0x005c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            java.lang.String r10 = "Server did not reply with proper range."
            r9.<init>(r10)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
            throw r9     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
        L_0x0064:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L_0x006e
        L_0x0068:
            r9 = move-exception
            r7 = r1
            r1 = r8
            r8 = r7
            goto L_0x007d
        L_0x006d:
            r8 = r1
        L_0x006e:
            if (r1 == 0) goto L_0x0075
            r1.disconnect()     // Catch:{ Exception -> 0x0074 }
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            if (r8 == 0) goto L_0x007a
            r8.close()     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            return
        L_0x007b:
            r9 = move-exception
            r8 = r1
        L_0x007d:
            throw r9     // Catch:{ all -> 0x007e }
        L_0x007e:
            r9 = move-exception
            if (r1 == 0) goto L_0x0086
            r1.disconnect()     // Catch:{ Exception -> 0x0085 }
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            if (r8 == 0) goto L_0x008b
            r8.close()     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3669p.m9148a(java.lang.String, int, java.io.OutputStream):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc A[Catch:{ Exception -> 0x00d3, all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5 A[Catch:{ Exception -> 0x00d3, all -> 0x00ca }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9147a(java.lang.String r8, int r9, int r10, int r11) throws java.lang.Exception {
        /*
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r2.<init>(r8)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.net.URLConnection r8 = r2.openConnection()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r8.setConnectTimeout(r9)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r8.setReadTimeout(r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r8.connect()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.io.InputStream r2 = m9146a(r8)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r3 = 1
            if (r8 == 0) goto L_0x006f
            int r4 = r8.getResponseCode()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x002d
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x002d
            r5 = 307(0x133, float:4.3E-43)
            if (r4 != r5) goto L_0x006f
        L_0x002d:
            java.lang.String r5 = "getRedirectUrl: received redirect code %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r7 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r6[r1] = r7     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r5, r6)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            com.fyber.inneractive.sdk.h.i r5 = com.fyber.inneractive.sdk.p049h.C2960i.LOCATION     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r5 = r5.f7154E     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r5 = r8.getHeaderField(r5)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            if (r6 != 0) goto L_0x0052
            java.lang.String r4 = "getRedirectUrl: redirecting target url: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r6[r1] = r5     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r4, r6)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            goto L_0x0070
        L_0x0052:
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r10 = "Server returned HTTP "
            r9.<init>(r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r10 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r9.append(r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r10 = " with empty location header!"
            r9.append(r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            throw r8     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
        L_0x006f:
            r5 = r0
        L_0x0070:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            if (r4 != 0) goto L_0x0099
            if (r11 < 0) goto L_0x0080
            r8.disconnect()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r8 = m9147a(r5, r10, r9, r11)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            return r8
        L_0x0080:
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r10 = "AdServer returned HTTP redirect response more than "
            r9.<init>(r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r9.append(r11)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r10 = " times! aborting"
            r9.append(r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            throw r8     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
        L_0x0099:
            if (r8 != 0) goto L_0x00a4
            java.lang.String r9 = "null connection returned"
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r10)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
        L_0x00a2:
            r3 = 0
            goto L_0x00ba
        L_0x00a4:
            int r9 = r8.getResponseCode()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 == r10) goto L_0x00ba
            java.lang.String r10 = "isResponseValid: found invalid response status: %s"
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            r11[r1] = r9     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r10, r11)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            goto L_0x00a2
        L_0x00ba:
            if (r3 == 0) goto L_0x00c5
            java.lang.StringBuffer r9 = com.fyber.inneractive.sdk.util.C3670q.m9156a((java.io.InputStream) r2)     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            goto L_0x00c6
        L_0x00c5:
            r9 = r0
        L_0x00c6:
            r8.disconnect()     // Catch:{ Exception -> 0x00d3, all -> 0x00ca }
            return r9
        L_0x00ca:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "getBodyFromUrl failed with error"
            com.fyber.inneractive.sdk.util.IAlog.m9032a((java.lang.String) r10, (java.lang.Throwable) r8, (java.lang.Object[]) r9)
            return r0
        L_0x00d3:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "getBodyFromUrl failed with exception"
            com.fyber.inneractive.sdk.util.IAlog.m9032a((java.lang.String) r10, (java.lang.Throwable) r8, (java.lang.Object[]) r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3669p.m9147a(java.lang.String, int, int, int):java.lang.String");
    }

    /* renamed from: a */
    private static InputStream m9146a(URLConnection uRLConnection) {
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                return new GZIPInputStream(inputStream);
            }
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }
}
