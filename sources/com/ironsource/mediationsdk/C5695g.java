package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5789b;
import com.ironsource.mediationsdk.utils.C5797g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.g */
public final class C5695g {

    /* renamed from: a */
    ISBannerSize f13558a;

    /* renamed from: b */
    private final String f13559b = "1";

    /* renamed from: c */
    private final String f13560c = "102";

    /* renamed from: d */
    private final String f13561d = "103";

    /* renamed from: e */
    private final String f13562e = "102";

    /* renamed from: f */
    private final String f13563f = "GenericNotifications";

    /* renamed from: g */
    private String f13564g;

    /* renamed from: h */
    private String f13565h;

    /* renamed from: i */
    private C5789b f13566i;

    /* renamed from: j */
    private C5694f f13567j;

    /* renamed from: com.ironsource.mediationsdk.g$a */
    static class C5696a extends AsyncTask<Object, Void, Boolean> {

        /* renamed from: a */
        private WeakReference<C5694f> f13568a;

        /* renamed from: b */
        private JSONObject f13569b;

        /* renamed from: c */
        private int f13570c;

        /* renamed from: d */
        private String f13571d;

        /* renamed from: e */
        private String f13572e;

        /* renamed from: f */
        private List<C5782b> f13573f;

        /* renamed from: g */
        private C5782b f13574g;

        /* renamed from: h */
        private JSONObject f13575h;

        /* renamed from: i */
        private long f13576i;

        /* renamed from: j */
        private int f13577j;

        /* renamed from: k */
        private String f13578k = "other";

        C5696a(C5694f fVar) {
            this.f13568a = new WeakReference<>(fVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: java.lang.String} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0257, code lost:
            r1.f13570c = 1008;
            r0 = "Auction decompression error";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0260, code lost:
            r1.f13570c = 1002;
            r0 = "Auction parsing error";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0271, code lost:
            r5 = r22;
            r4 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0276, code lost:
            r4 = r2;
            r5 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x027a, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0286, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0287, code lost:
            r20 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0289, code lost:
            r16 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x028c, code lost:
            r5 = r3;
            r20 = r4;
            r19 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x02a4, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x02a5, code lost:
            r20 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x02a7, code lost:
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("getting exception " + r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ba, code lost:
            if (r16 != null) goto L_0x02bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x02bc, code lost:
            r16.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x02bf, code lost:
            r1.f13570c = 1000;
            r1.f13571d = r0.getMessage();
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x02d0, code lost:
            r5 = r3;
            r19 = r6;
            r21 = r13;
            r24 = r4;
            r4 = r2;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x02dd, code lost:
            r16.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
            r4 = r2;
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
            r5 = r22;
            r4 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
            r4 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
            r5 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c2, code lost:
            r4 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c6, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c7, code lost:
            r4 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e6, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e7, code lost:
            r5 = r22;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0257 A[Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0260 A[Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x027a A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:16:0x00cd] */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x0286 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:10:0x00b3] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x02a4 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:6:0x0063] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x02bc  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x02dd  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Object... r26) {
            /*
                r25 = this;
                r1 = r25
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                long r5 = r0.getTime()
                r1.f13576i = r5
                r5 = 0
                java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x0306 }
                r0 = r26[r5]     // Catch:{ Exception -> 0x0306 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0306 }
                r6.<init>(r0)     // Catch:{ Exception -> 0x0306 }
                r7 = 1
                r0 = r26[r7]     // Catch:{ Exception -> 0x0306 }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x0306 }
                r1.f13569b = r0     // Catch:{ Exception -> 0x0306 }
                r8 = 2
                r0 = r26[r8]     // Catch:{ Exception -> 0x0306 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0306 }
                boolean r9 = r0.booleanValue()     // Catch:{ Exception -> 0x0306 }
                r0 = 3
                r0 = r26[r0]     // Catch:{ Exception -> 0x0306 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0306 }
                int r10 = r0.intValue()     // Catch:{ Exception -> 0x0306 }
                r0 = 4
                r0 = r26[r0]     // Catch:{ Exception -> 0x0306 }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0306 }
                long r11 = r0.longValue()     // Catch:{ Exception -> 0x0306 }
                r0 = 5
                r0 = r26[r0]     // Catch:{ Exception -> 0x0306 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0306 }
                boolean r13 = r0.booleanValue()     // Catch:{ Exception -> 0x0306 }
                r0 = 6
                r0 = r26[r0]     // Catch:{ Exception -> 0x0306 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0306 }
                boolean r14 = r0.booleanValue()     // Catch:{ Exception -> 0x0306 }
                r0 = 7
                r0 = r26[r0]     // Catch:{ Exception -> 0x0306 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0306 }
                int r15 = r0.intValue()     // Catch:{ Exception -> 0x0306 }
                r1.f13577j = r5
                r0 = 0
                r16 = r0
            L_0x005f:
                int r0 = r1.f13577j
                if (r0 >= r10) goto L_0x02fd
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x02d0, Exception -> 0x02a4 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                long r17 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.String r8 = "Auction Handler: auction trial "
                r0.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                int r8 = r1.f13577j     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                int r8 = r8 + r7
                r0.append(r8)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.String r8 = " out of "
                r0.append(r8)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                r0.append(r10)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.String r8 = " max trials"
                r0.append(r8)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                r8.log(r7, r0, r5)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                int r0 = (int) r11     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.net.URLConnection r7 = r6.openConnection()     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.String r8 = "POST"
                r7.setRequestMethod(r8)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                java.lang.String r8 = "Content-Type"
                java.lang.String r5 = "application/json; charset=utf-8"
                r7.setRequestProperty(r8, r5)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                r7.setReadTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                r5 = 1
                r7.setDoInput(r5)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                r7.setDoOutput(r5)     // Catch:{ SocketTimeoutException -> 0x029a, Exception -> 0x02a4 }
                org.json.JSONObject r0 = r1.f13569b     // Catch:{ SocketTimeoutException -> 0x028c, Exception -> 0x0286 }
                java.io.OutputStream r5 = r7.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x028c, Exception -> 0x0286 }
                java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x028c, Exception -> 0x0286 }
                r19 = r6
                java.lang.String r6 = "UTF-8"
                r8.<init>(r5, r6)     // Catch:{ SocketTimeoutException -> 0x0282, Exception -> 0x0286 }
                java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x0282, Exception -> 0x0286 }
                r6.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x0282, Exception -> 0x0286 }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0282, Exception -> 0x0286 }
                r20 = r4
                java.lang.String r4 = m14026a((int) r15)     // Catch:{ SocketTimeoutException -> 0x027c, Exception -> 0x027a }
                if (r13 == 0) goto L_0x00e7
                r21 = r13
                com.ironsource.mediationsdk.logger.IronLog r13 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x00e3, Exception -> 0x027a }
                r22 = r3
                java.lang.String r3 = "compressing and encrypting auction request"
                r13.info(r3)     // Catch:{ SocketTimeoutException -> 0x0276, Exception -> 0x027a }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r4, r0)     // Catch:{ SocketTimeoutException -> 0x0276, Exception -> 0x027a }
                goto L_0x00ef
            L_0x00e3:
                r4 = r2
                r5 = r3
                goto L_0x0280
            L_0x00e7:
                r22 = r3
                r21 = r13
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r4, r0)     // Catch:{ SocketTimeoutException -> 0x0276, Exception -> 0x027a }
            L_0x00ef:
                r3 = 2
                if (r15 != r3) goto L_0x0116
                com.ironsource.mediationsdk.utils.g r4 = com.ironsource.mediationsdk.utils.C5797g.m14321a()     // Catch:{ SocketTimeoutException -> 0x0111, Exception -> 0x027a }
                java.lang.String r4 = r4.mo42125d()     // Catch:{ SocketTimeoutException -> 0x0111, Exception -> 0x027a }
                java.lang.String r13 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                r23 = r2
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ SocketTimeoutException -> 0x010b, Exception -> 0x027a }
                r3 = 0
                r2[r3] = r4     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r3 = 1
                r2[r3] = r0     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                java.lang.String r0 = java.lang.String.format(r13, r2)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                goto L_0x0124
            L_0x010b:
                r5 = r22
                r4 = r23
                goto L_0x0295
            L_0x0111:
                r4 = r2
            L_0x0112:
                r5 = r22
                goto L_0x0295
            L_0x0116:
                r23 = r2
                java.lang.String r2 = "{\"request\" : \"%1$s\"}"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r3 = 0
                r4[r3] = r0     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                java.lang.String r0 = java.lang.String.format(r2, r4)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
            L_0x0124:
                r6.write(r0)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r6.flush()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r6.close()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r8.close()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r5.close()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                int r0 = r7.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 == r2) goto L_0x0180
                r2 = 1001(0x3e9, float:1.403E-42)
                r1.f13570c = r2     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                java.lang.String r3 = "Auction status not 200 error, error code response from server - "
                r2.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r2.append(r0)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                java.lang.String r0 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r1.f13571d = r0     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                java.lang.String r2 = r1.f13571d     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r0.error(r2)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r7.disconnect()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                int r0 = r1.f13577j     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                int r2 = r10 + -1
                if (r0 >= r2) goto L_0x0175
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                long r2 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                long r2 = r2 - r17
                long r2 = r11 - r2
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0175
                android.os.SystemClock.sleep(r2)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
            L_0x0175:
                r16 = r7
                r2 = r20
                r5 = r22
                r4 = r23
                r3 = 2
                goto L_0x02e8
            L_0x0180:
                java.lang.String r0 = m14027a((java.net.HttpURLConnection) r7)     // Catch:{ SocketTimeoutException -> 0x0271, Exception -> 0x027a }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0229 }
                if (r2 != 0) goto L_0x021a
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0229 }
                r2.<init>(r0)     // Catch:{ JSONException -> 0x0229 }
                if (r9 == 0) goto L_0x01f0
                java.lang.String r0 = m14026a((int) r15)     // Catch:{ JSONException -> 0x0229 }
                r3 = 2
                if (r15 != r3) goto L_0x019b
                java.lang.String r4 = "ct"
                goto L_0x019d
            L_0x019b:
                java.lang.String r4 = "response"
            L_0x019d:
                java.lang.String r2 = r2.getString(r4)     // Catch:{ JSONException -> 0x01ea }
                if (r14 == 0) goto L_0x01ca
                com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x01c6, SocketTimeoutException -> 0x01c2, Exception -> 0x027a }
                java.lang.String r5 = "decrypting and decompressing auction response"
                r4.info(r5)     // Catch:{ JSONException -> 0x01c6, SocketTimeoutException -> 0x01c2, Exception -> 0x027a }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r2)     // Catch:{ JSONException -> 0x01c6, SocketTimeoutException -> 0x01c2, Exception -> 0x027a }
                if (r0 == 0) goto L_0x01ba
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01ea }
                r2.<init>(r0)     // Catch:{ JSONException -> 0x01ea }
                r5 = r22
                r4 = r23
                goto L_0x01f5
            L_0x01ba:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01c6, SocketTimeoutException -> 0x01c2, Exception -> 0x027a }
                r4 = r23
                r0.<init>(r4)     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
                throw r0     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
            L_0x01c2:
                r4 = r23
                goto L_0x0112
            L_0x01c6:
                r0 = move-exception
                r4 = r23
                goto L_0x01e7
            L_0x01ca:
                r4 = r23
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r2)     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
                if (r2 != 0) goto L_0x01de
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
                r2.<init>(r0)     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
                r5 = r22
                goto L_0x01f5
            L_0x01de:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e6, SocketTimeoutException -> 0x0112, Exception -> 0x027a }
                r5 = r22
                r0.<init>(r5)     // Catch:{ JSONException -> 0x0227 }
                throw r0     // Catch:{ JSONException -> 0x0227 }
            L_0x01e6:
                r0 = move-exception
            L_0x01e7:
                r5 = r22
                goto L_0x022f
            L_0x01ea:
                r0 = move-exception
                r5 = r22
                r4 = r23
                goto L_0x022f
            L_0x01f0:
                r5 = r22
                r4 = r23
                r3 = 2
            L_0x01f5:
                com.ironsource.mediationsdk.C5690e.m13999a()     // Catch:{ JSONException -> 0x0227 }
                com.ironsource.mediationsdk.e$a r0 = com.ironsource.mediationsdk.C5690e.m13998a((org.json.JSONObject) r2)     // Catch:{ JSONException -> 0x0227 }
                java.lang.String r2 = r0.f13546a     // Catch:{ JSONException -> 0x0227 }
                r1.f13572e = r2     // Catch:{ JSONException -> 0x0227 }
                java.util.List<com.ironsource.mediationsdk.server.b> r2 = r0.f13547b     // Catch:{ JSONException -> 0x0227 }
                r1.f13573f = r2     // Catch:{ JSONException -> 0x0227 }
                com.ironsource.mediationsdk.server.b r2 = r0.f13548c     // Catch:{ JSONException -> 0x0227 }
                r1.f13574g = r2     // Catch:{ JSONException -> 0x0227 }
                org.json.JSONObject r2 = r0.f13549d     // Catch:{ JSONException -> 0x0227 }
                r1.f13575h = r2     // Catch:{ JSONException -> 0x0227 }
                int r2 = r0.f13550e     // Catch:{ JSONException -> 0x0227 }
                r1.f13570c = r2     // Catch:{ JSONException -> 0x0227 }
                java.lang.String r0 = r0.f13551f     // Catch:{ JSONException -> 0x0227 }
                r1.f13571d = r0     // Catch:{ JSONException -> 0x0227 }
                r7.disconnect()     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                return r0
            L_0x021a:
                r5 = r22
                r4 = r23
                r3 = 2
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0227 }
                java.lang.String r2 = "empty response"
                r0.<init>(r2)     // Catch:{ JSONException -> 0x0227 }
                throw r0     // Catch:{ JSONException -> 0x0227 }
            L_0x0227:
                r0 = move-exception
                goto L_0x022f
            L_0x0229:
                r0 = move-exception
                r5 = r22
                r4 = r23
                r3 = 2
            L_0x022f:
                java.lang.String r2 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                if (r2 == 0) goto L_0x0247
                java.lang.String r2 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                boolean r2 = r2.equalsIgnoreCase(r5)     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                if (r2 == 0) goto L_0x0247
                r2 = 1003(0x3eb, float:1.406E-42)
                r1.f13570c = r2     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                java.lang.String r2 = "Auction decryption error"
                r1.f13571d = r2     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
            L_0x0247:
                java.lang.String r2 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                if (r2 == 0) goto L_0x0260
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                if (r0 == 0) goto L_0x0260
                r0 = 1008(0x3f0, float:1.413E-42)
                r1.f13570c = r0     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                java.lang.String r0 = "Auction decompression error"
            L_0x025d:
                r1.f13571d = r0     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                goto L_0x0267
            L_0x0260:
                r0 = 1002(0x3ea, float:1.404E-42)
                r1.f13570c = r0     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                java.lang.String r0 = "Auction parsing error"
                goto L_0x025d
            L_0x0267:
                java.lang.String r0 = "parsing"
                r1.f13578k = r0     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                r7.disconnect()     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ SocketTimeoutException -> 0x0295, Exception -> 0x027a }
                return r0
            L_0x0271:
                r5 = r22
                r4 = r23
                goto L_0x0280
            L_0x0276:
                r4 = r2
                r5 = r22
                goto L_0x0280
            L_0x027a:
                r0 = move-exception
                goto L_0x0289
            L_0x027c:
                r4 = r2
                r5 = r3
                r21 = r13
            L_0x0280:
                r3 = 2
                goto L_0x0295
            L_0x0282:
                r5 = r3
                r20 = r4
                goto L_0x0291
            L_0x0286:
                r0 = move-exception
                r20 = r4
            L_0x0289:
                r16 = r7
                goto L_0x02a7
            L_0x028c:
                r5 = r3
                r20 = r4
                r19 = r6
            L_0x0291:
                r21 = r13
                r3 = 2
                r4 = r2
            L_0x0295:
                r16 = r7
            L_0x0297:
                r2 = r20
                goto L_0x02db
            L_0x029a:
                r5 = r3
                r20 = r4
                r19 = r6
                r21 = r13
                r3 = 2
                r4 = r2
                goto L_0x0297
            L_0x02a4:
                r0 = move-exception
                r20 = r4
            L_0x02a7:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "getting exception "
                r3.<init>(r4)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r16 == 0) goto L_0x02bf
                r16.disconnect()
            L_0x02bf:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.f13570c = r2
                java.lang.String r0 = r0.getMessage()
                r1.f13571d = r0
                r2 = r20
            L_0x02cb:
                r1.f13578k = r2
            L_0x02cd:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x02d0:
                r5 = r3
                r19 = r6
                r21 = r13
                r3 = 2
                r24 = r4
                r4 = r2
                r2 = r24
            L_0x02db:
                if (r16 == 0) goto L_0x02e0
                r16.disconnect()
            L_0x02e0:
                r0 = 1006(0x3ee, float:1.41E-42)
                r1.f13570c = r0
                java.lang.String r0 = "Connection timed out"
                r1.f13571d = r0
            L_0x02e8:
                int r0 = r1.f13577j
                r6 = 1
                int r0 = r0 + r6
                r1.f13577j = r0
                r3 = r5
                r6 = r19
                r13 = r21
                r5 = 0
                r7 = 1
                r8 = 2
                r24 = r4
                r4 = r2
                r2 = r24
                goto L_0x005f
            L_0x02fd:
                r6 = 1
                int r10 = r10 - r6
                r1.f13577j = r10
                java.lang.String r0 = "trials_fail"
                r1.f13578k = r0
                goto L_0x02cd
            L_0x0306:
                r0 = move-exception
                r2 = r4
                r3 = 1007(0x3ef, float:1.411E-42)
                r1.f13570c = r3
                java.lang.String r0 = r0.getMessage()
                r1.f13571d = r0
                r3 = 0
                r1.f13577j = r3
                goto L_0x02cb
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5695g.C5696a.doInBackground(java.lang.Object[]):java.lang.Boolean");
        }

        /* renamed from: a */
        private static String m14026a(int i) {
            return i == 2 ? C5797g.m14321a().mo42124c() : C5797g.m14321a().mo42123b();
        }

        /* renamed from: a */
        private static String m14027a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            C5694f fVar = (C5694f) this.f13568a.get();
            if (fVar != null) {
                long time = new Date().getTime() - this.f13576i;
                if (bool.booleanValue()) {
                    fVar.mo41406a(this.f13573f, this.f13572e, this.f13574g, this.f13575h, this.f13577j + 1, time);
                } else {
                    fVar.mo41398a(this.f13570c, this.f13571d, this.f13577j + 1, this.f13578k, time);
                }
            }
        }
    }

    public C5695g(String str, C5789b bVar, C5694f fVar) {
        this.f13564g = str;
        this.f13566i = bVar;
        this.f13567j = fVar;
        this.f13565h = IronSourceUtils.getSessionId();
    }

    /* renamed from: a */
    private JSONObject m14019a(Context context, Map<String, Object> map, List<String> list, C5697h hVar, int i, boolean z) {
        new JSONObject();
        if (C5556E.m13257a().f12853i.f14083c.f13748e.mo42551c().f14120c) {
            return C5690e.m13999a().mo41846a(this.f13564g, z, map, list, hVar, i, this.f13558a);
        }
        JSONObject a = C5690e.m13999a().mo41845a(context, map, list, hVar, i, this.f13565h, this.f13566i, this.f13558a);
        a.put(IronSourceConstants.EVENTS_AD_UNIT, this.f13564g);
        a.put("doNotEncryptResponse", z ? "false" : "true");
        return a;
    }

    /* renamed from: a */
    public static void m14020a(C5782b bVar, int i, C5782b bVar2) {
        for (String a : bVar.mo42087f()) {
            String a2 = C5690e.m13999a().mo41844a(a, i, bVar, "", "", "");
            C5690e.m13999a();
            C5690e.m14004a("reportLoadSuccess", bVar.mo42082a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo42087f()) {
                String a4 = C5690e.m13999a().mo41844a(a3, i, bVar, "", "102", "");
                C5690e.m13999a();
                C5690e.m14004a("reportLoadSuccess", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m14021a(C5782b bVar, int i, C5782b bVar2, String str) {
        for (String a : bVar.mo42085d()) {
            String a2 = C5690e.m13999a().mo41844a(a, i, bVar, "", "", str);
            C5690e.m13999a();
            C5690e.m14004a("reportImpression", bVar.mo42082a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo42085d()) {
                String a4 = C5690e.m13999a().mo41844a(a3, i, bVar, "", "102", str);
                C5690e.m13999a();
                C5690e.m14004a("reportImpression", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m14022a(ArrayList<String> arrayList, ConcurrentHashMap<String, C5782b> concurrentHashMap, int i, C5782b bVar, C5782b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.mo42082a())) {
                z2 = i == 2;
                z = true;
            } else {
                int i2 = i;
                C5782b bVar3 = concurrentHashMap.get(next);
                String c = bVar3.mo42084c();
                String str = z ? z2 ? "102" : "103" : "1";
                for (String a : bVar3.mo42086e()) {
                    String a2 = C5690e.m13999a().mo41844a(a, i, bVar2, c, str, "");
                    C5690e.m13999a();
                    C5690e.m14004a("reportAuctionLose", bVar3.mo42082a(), a2);
                }
            }
        }
        int i3 = i;
        if (bVar != null) {
            for (String a3 : bVar.mo42086e()) {
                String a4 = C5690e.m13999a().mo41844a(a3, i, bVar2, "", "102", "");
                C5690e.m13999a();
                C5690e.m14004a("reportAuctionLose", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public final void mo41850a(Context context, Map<String, Object> map, List<String> list, C5697h hVar, int i) {
        try {
            boolean z = IronSourceUtils.getSerr() == 1;
            new C5696a(this.f13567j).execute(new Object[]{this.f13566i.f13916d, m14019a(context, map, list, hVar, i, z), Boolean.valueOf(z), Integer.valueOf(this.f13566i.f13917e), Long.valueOf(this.f13566i.f13920h), Boolean.valueOf(this.f13566i.f13928p), Boolean.valueOf(this.f13566i.f13929q), Integer.valueOf(this.f13566i.f13930r)});
        } catch (Exception e) {
            this.f13567j.mo41398a(1000, e.getMessage(), 0, "other", 0);
        }
    }

    /* renamed from: a */
    public final void mo41851a(CopyOnWriteArrayList<C5606U> copyOnWriteArrayList, ConcurrentHashMap<String, C5782b> concurrentHashMap, int i, C5782b bVar, C5782b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<C5606U> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo41606k());
        }
        m14022a((ArrayList<String>) arrayList, concurrentHashMap, i, bVar, bVar2);
    }
}
