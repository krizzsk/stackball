package com.appsflyer;

import com.appsflyer.internal.model.event.BackgroundEvent;

public class BackgroundHttpTask {

    /* renamed from: Ι */
    private final BackgroundEvent f4080;

    public BackgroundHttpTask(BackgroundEvent backgroundEvent) {
        this.f4080 = backgroundEvent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection doInBackground() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = ""
            com.appsflyer.internal.model.event.BackgroundEvent r0 = r1.f4080
            java.lang.String r3 = r0.urlString()
            com.appsflyer.internal.model.event.BackgroundEvent r0 = r1.f4080
            java.lang.String r0 = r0.body()
            com.appsflyer.internal.model.event.BackgroundEvent r4 = r1.f4080
            boolean r4 = r4.trackingStopped()
            com.appsflyer.internal.model.event.BackgroundEvent r5 = r1.f4080
            boolean r5 = r5.readResponse()
            com.appsflyer.internal.model.event.BackgroundEvent r6 = r1.f4080
            boolean r6 = r6.proxyMode()
            com.appsflyer.internal.model.event.BackgroundEvent r7 = r1.f4080
            boolean r7 = r7.isEncrypt()
            byte[] r8 = r0.getBytes()
            r9 = 0
            if (r4 == 0) goto L_0x0030
            return r9
        L_0x0030:
            r4 = 0
            r10 = 1
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x0177 }
            r11.<init>(r3)     // Catch:{ all -> 0x0177 }
            if (r6 == 0) goto L_0x0080
            com.appsflyer.internal.aa r12 = com.appsflyer.internal.C1740aa.m3833()     // Catch:{ all -> 0x0177 }
            java.lang.String r13 = r11.toString()     // Catch:{ all -> 0x0177 }
            java.lang.String r14 = "server_request"
            java.lang.String[] r15 = new java.lang.String[r10]     // Catch:{ all -> 0x0177 }
            r15[r4] = r0     // Catch:{ all -> 0x0177 }
            r12.mo14060(r14, r13, r15)     // Catch:{ all -> 0x0177 }
            java.lang.String r12 = "UTF-8"
            byte[] r12 = r0.getBytes(r12)     // Catch:{ all -> 0x0177 }
            int r12 = r12.length     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            java.lang.String r14 = "call = "
            r13.<init>(r14)     // Catch:{ all -> 0x0177 }
            r13.append(r11)     // Catch:{ all -> 0x0177 }
            java.lang.String r14 = "; size = "
            r13.append(r14)     // Catch:{ all -> 0x0177 }
            r13.append(r12)     // Catch:{ all -> 0x0177 }
            java.lang.String r14 = " byte"
            r13.append(r14)     // Catch:{ all -> 0x0177 }
            if (r12 <= r10) goto L_0x006d
            java.lang.String r12 = "s"
            goto L_0x006e
        L_0x006d:
            r12 = r2
        L_0x006e:
            r13.append(r12)     // Catch:{ all -> 0x0177 }
            java.lang.String r12 = "; body = "
            r13.append(r12)     // Catch:{ all -> 0x0177 }
            r13.append(r0)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0177 }
            com.appsflyer.internal.C1741ab.m3849(r0)     // Catch:{ all -> 0x0177 }
        L_0x0080:
            java.lang.String r0 = "AppsFlyer"
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0177 }
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x0177 }
            java.net.URLConnection r0 = r11.openConnection()     // Catch:{ all -> 0x0177 }
            r12 = r0
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ all -> 0x0177 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r12.setReadTimeout(r0)     // Catch:{ all -> 0x0174 }
            r12.setConnectTimeout(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "POST"
            r12.setRequestMethod(r0)     // Catch:{ all -> 0x0174 }
            r12.setDoInput(r10)     // Catch:{ all -> 0x0174 }
            r12.setDoOutput(r10)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "Content-Type"
            if (r7 == 0) goto L_0x00aa
            java.lang.String r13 = "application/octet-stream"
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r13 = "application/json"
        L_0x00ac:
            r12.setRequestProperty(r0, r13)     // Catch:{ all -> 0x0174 }
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch:{ all -> 0x0174 }
            if (r7 == 0) goto L_0x010b
            com.appsflyer.internal.model.event.BackgroundEvent r7 = r1.f4080     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r7.key()     // Catch:{ all -> 0x0174 }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x0102 }
            r13[r4] = r7     // Catch:{ all -> 0x0102 }
            r7 = 24
            java.lang.Object r14 = com.appsflyer.internal.C1753e.m3880(r7, r7, r4)     // Catch:{ all -> 0x0102 }
            java.lang.Class r14 = (java.lang.Class) r14     // Catch:{ all -> 0x0102 }
            java.lang.String r15 = "ǃ"
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x0102 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r7[r4] = r16     // Catch:{ all -> 0x0102 }
            java.lang.reflect.Method r7 = r14.getMethod(r15, r7)     // Catch:{ all -> 0x0102 }
            java.lang.Object r7 = r7.invoke(r9, r13)     // Catch:{ all -> 0x0102 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ all -> 0x00f9 }
            r9[r4] = r8     // Catch:{ all -> 0x00f9 }
            r8 = 24
            java.lang.Object r8 = com.appsflyer.internal.C1753e.m3880(r8, r8, r4)     // Catch:{ all -> 0x00f9 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x00f9 }
            java.lang.String r13 = "ı"
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f9 }
            java.lang.Class<byte[]> r15 = byte[].class
            r14[r4] = r15     // Catch:{ all -> 0x00f9 }
            java.lang.reflect.Method r8 = r8.getMethod(r13, r14)     // Catch:{ all -> 0x00f9 }
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ all -> 0x00f9 }
            r8 = r7
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x00f9 }
            goto L_0x010b
        L_0x00f9:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x0101
            throw r4     // Catch:{ all -> 0x0174 }
        L_0x0101:
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x0102:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0174 }
            if (r4 == 0) goto L_0x010a
            throw r4     // Catch:{ all -> 0x0174 }
        L_0x010a:
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x010b:
            r0.write(r8)     // Catch:{ all -> 0x0174 }
            r0.close()     // Catch:{ all -> 0x0174 }
            r12.connect()     // Catch:{ all -> 0x0174 }
            int r0 = r12.getResponseCode()     // Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x0122
            com.appsflyer.AppsFlyerLibCore r5 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = r5.readServerResponse(r12)     // Catch:{ all -> 0x0174 }
        L_0x0122:
            if (r6 == 0) goto L_0x013c
            com.appsflyer.internal.aa r5 = com.appsflyer.internal.C1740aa.m3833()     // Catch:{ all -> 0x0174 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = "server_response"
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x0174 }
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0174 }
            r8[r4] = r9     // Catch:{ all -> 0x0174 }
            r8[r10] = r2     // Catch:{ all -> 0x0174 }
            r5.mo14060(r7, r6, r8)     // Catch:{ all -> 0x0174 }
        L_0x013c:
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x0186
            java.lang.String r0 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x0174 }
            com.appsflyer.internal.model.event.BackgroundEvent r0 = r1.f4080     // Catch:{ all -> 0x0174 }
            android.app.Application r0 = r0.context()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x0174 }
            java.lang.String r6 = com.appsflyer.AppsFlyerLibCore.REGISTER_URL     // Catch:{ all -> 0x0174 }
            java.lang.String r6 = com.appsflyer.ServerConfigHandler.getUrl(r6)     // Catch:{ all -> 0x0174 }
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x0174 }
            if (r5 == 0) goto L_0x0187
            if (r0 == 0) goto L_0x0187
            android.content.SharedPreferences r0 = com.appsflyer.AppsFlyerLibCore.getSharedPreferences(r0)     // Catch:{ all -> 0x0174 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = "sentRegisterRequestToAF"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r10)     // Catch:{ all -> 0x0174 }
            r0.apply()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "Successfully registered for Uninstall Measurement"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x0174 }
            goto L_0x0187
        L_0x0174:
            r0 = move-exception
            r9 = r12
            goto L_0x0178
        L_0x0177:
            r0 = move-exception
        L_0x0178:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Error while calling "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.afErrorLog(r3, r0)
            r12 = r9
        L_0x0186:
            r4 = 1
        L_0x0187:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connection "
            r0.<init>(r3)
            if (r4 == 0) goto L_0x0193
            java.lang.String r3 = "error"
            goto L_0x0195
        L_0x0193:
            java.lang.String r3 = "call succeeded"
        L_0x0195:
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.BackgroundHttpTask.doInBackground():java.net.HttpURLConnection");
    }
}
