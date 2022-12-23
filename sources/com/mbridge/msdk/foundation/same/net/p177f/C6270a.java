package com.mbridge.msdk.foundation.same.net.p177f;

import com.mbridge.msdk.foundation.same.net.C6243c;
import com.mbridge.msdk.foundation.same.net.C6273g;
import com.mbridge.msdk.foundation.same.net.p176e.C6264a;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.a */
/* compiled from: BasicNetwork */
public class C6270a implements C6273g {

    /* renamed from: a */
    private static final String f15546a = C6270a.class.getSimpleName();

    /* renamed from: b */
    private C6264a f15547b;

    /* renamed from: c */
    private C6243c f15548c;

    public C6270a(C6264a aVar, C6243c cVar) {
        this.f15547b = aVar;
        this.f15548c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r7 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r3 = r2.mo43852a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r7 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = new com.mbridge.msdk.foundation.same.net.p177f.C6272c(r3, r7, r2.mo43853b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r3 < 400) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r3 < 500) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(2, (com.mbridge.msdk.foundation.same.net.p177f.C6272c) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(2, (com.mbridge.msdk.foundation.same.net.p177f.C6272c) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        android.os.SystemClock.elapsedRealtime();
        r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(4, (com.mbridge.msdk.foundation.same.net.p177f.C6272c) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0099, code lost:
        android.os.SystemClock.elapsedRealtime();
        r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a4, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(3, (com.mbridge.msdk.foundation.same.net.p177f.C6272c) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a5, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        android.os.SystemClock.elapsedRealtime();
        r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b1, code lost:
        throw new com.mbridge.msdk.foundation.same.net.p172a.C6240a(3, (com.mbridge.msdk.foundation.same.net.p177f.C6272c) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[ExcHandler: MalformedURLException (r7v6 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:3:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098 A[ExcHandler: ConnectTimeoutException (r7v4 'e' org.apache.http.conn.ConnectTimeoutException A[CUSTOM_DECLARE]), Splitter:B:3:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a5 A[ExcHandler: SocketTimeoutException (r7v2 'e' java.net.SocketTimeoutException A[CUSTOM_DECLARE]), Splitter:B:3:0x000b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.foundation.same.net.p177f.C6272c mo43851a(com.mbridge.msdk.foundation.same.net.C6290i<?> r7) throws com.mbridge.msdk.foundation.same.net.p172a.C6240a {
        /*
            r6 = this;
            android.os.SystemClock.elapsedRealtime()
            boolean r0 = r7.mo43884c()
            r1 = 0
            if (r0 != 0) goto L_0x00b2
            r0 = 3
            r7.mo43887f()     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x003e }
            com.mbridge.msdk.foundation.same.net.e.a r2 = r6.f15547b     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x003e }
            com.mbridge.msdk.foundation.same.net.f.b r2 = r2.mo43846a(r7)     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x003e }
            int r3 = r2.mo43852a()     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x003b }
            com.mbridge.msdk.foundation.same.net.c r4 = r6.f15548c     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x003b }
            byte[] r7 = r7.mo43838a((com.mbridge.msdk.foundation.same.net.p177f.C6271b) r2, (com.mbridge.msdk.foundation.same.net.C6243c) r4)     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x003b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 < r4) goto L_0x0033
            r4 = 399(0x18f, float:5.59E-43)
            if (r3 > r4) goto L_0x0033
            com.mbridge.msdk.foundation.same.net.f.c r4 = new com.mbridge.msdk.foundation.same.net.f.c     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
            java.util.List r5 = r2.mo43853b()     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
            r4.<init>(r3, r7, r5)     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
            return r4
        L_0x0033:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
            throw r3     // Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x0098, MalformedURLException -> 0x008a, IOException -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            goto L_0x0041
        L_0x003b:
            r0 = move-exception
            r7 = r1
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            r7 = r1
            r2 = r7
        L_0x0041:
            android.os.SystemClock.elapsedRealtime()
            r0.getMessage()
            r0 = 2
            if (r2 == 0) goto L_0x0084
            int r3 = r2.mo43852a()
            if (r7 == 0) goto L_0x007e
            com.mbridge.msdk.foundation.same.net.f.c r1 = new com.mbridge.msdk.foundation.same.net.f.c
            java.util.List r2 = r2.mo43853b()
            r1.<init>(r3, r7, r2)
            r7 = 400(0x190, float:5.6E-43)
            if (r3 < r7) goto L_0x0069
            r7 = 499(0x1f3, float:6.99E-43)
            if (r3 <= r7) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r0 = 6
            r7.<init>(r0, r1)
            throw r7
        L_0x0069:
            r7 = 500(0x1f4, float:7.0E-43)
            if (r3 < r7) goto L_0x0078
            r7 = 599(0x257, float:8.4E-43)
            if (r3 > r7) goto L_0x0078
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r0 = 7
            r7.<init>(r0, r1)
            throw r7
        L_0x0078:
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r7.<init>(r0, r1)
            throw r7
        L_0x007e:
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r7.<init>(r0, r1)
            throw r7
        L_0x0084:
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r7.<init>(r0, r1)
            throw r7
        L_0x008a:
            r7 = move-exception
            android.os.SystemClock.elapsedRealtime()
            r7.getMessage()
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r0 = 4
            r7.<init>(r0, r1)
            throw r7
        L_0x0098:
            r7 = move-exception
            android.os.SystemClock.elapsedRealtime()
            r7.getMessage()
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r7.<init>(r0, r1)
            throw r7
        L_0x00a5:
            r7 = move-exception
            android.os.SystemClock.elapsedRealtime()
            r7.getMessage()
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r7.<init>(r0, r1)
            throw r7
        L_0x00b2:
            java.lang.String r0 = "perform-discard-cancelled"
            r7.mo43881a((java.lang.String) r0)
            com.mbridge.msdk.foundation.same.net.c r0 = r6.f15548c
            r0.mo43821b(r7)
            com.mbridge.msdk.foundation.same.net.a.a r7 = new com.mbridge.msdk.foundation.same.net.a.a
            r0 = -2
            r7.<init>(r0, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p177f.C6270a.mo43851a(com.mbridge.msdk.foundation.same.net.i):com.mbridge.msdk.foundation.same.net.f.c");
    }
}
