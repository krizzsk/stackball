package com.chartboost.sdk.Networking;

import android.os.Handler;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;

/* renamed from: com.chartboost.sdk.Networking.l */
public class C1862l<T> implements Runnable, Comparable<C1862l> {

    /* renamed from: a */
    private final Executor f4597a;

    /* renamed from: b */
    private final C1863m f4598b;

    /* renamed from: c */
    private final C1856h f4599c;

    /* renamed from: d */
    private final C1832j f4600d;

    /* renamed from: e */
    private final Handler f4601e;

    /* renamed from: f */
    public final C1851c<T> f4602f;

    /* renamed from: g */
    private C1853e<T> f4603g;

    /* renamed from: h */
    private C1854f f4604h;

    C1862l(Executor executor, C1863m mVar, C1856h hVar, C1832j jVar, Handler handler, C1851c<T> cVar) {
        this.f4597a = executor;
        this.f4598b = mVar;
        this.f4599c = hVar;
        this.f4600d = jVar;
        this.f4601e = handler;
        this.f4602f = cVar;
    }

    /* renamed from: a */
    private C1854f m4203a(C1851c<T> cVar) throws IOException {
        int i = 10000;
        int i2 = 0;
        while (true) {
            try {
                return m4204a(cVar, i);
            } catch (SocketTimeoutException e) {
                if (i2 < 1) {
                    i *= 2;
                    i2++;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m4205a(int i) {
        return ((100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    public void run() {
        C1853e<T> eVar = this.f4603g;
        if (eVar != null) {
            try {
                if (eVar.f4573b == null) {
                    this.f4602f.mo14333a(eVar.f4572a, this.f4604h);
                } else {
                    this.f4602f.mo14332a(eVar.f4573b, this.f4604h);
                }
            } catch (Exception e) {
                CBLogging.m3993b("NetworkDispatcher", "deliver result" + e.toString());
            }
        } else if (this.f4602f.f4563d.compareAndSet(0, 1)) {
            long b = this.f4600d.mo14255b();
            try {
                if (this.f4599c.mo14340d()) {
                    C1854f a = m4203a(this.f4602f);
                    this.f4604h = a;
                    int i = a.f4574a;
                    if (i < 200 || i >= 300) {
                        CBError.C1835b bVar = CBError.C1835b.NETWORK_FAILURE;
                        this.f4603g = C1853e.m4180a(new CBError(bVar, "Failure due to HTTP status code " + i));
                    } else {
                        this.f4603g = this.f4602f.mo14331a(a);
                    }
                } else {
                    this.f4603g = C1853e.m4180a(new CBError(CBError.C1835b.INTERNET_UNAVAILABLE, "Internet Unavailable"));
                }
                this.f4602f.f4565f = this.f4600d.mo14255b() - b;
                int i2 = this.f4602f.f4568i;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return;
                    }
                    this.f4597a.execute(this);
                    return;
                }
            } catch (Throwable th) {
                this.f4602f.f4565f = this.f4600d.mo14255b() - b;
                int i3 = this.f4602f.f4568i;
                if (i3 == 0) {
                    this.f4601e.post(this);
                } else if (i3 == 1) {
                    this.f4597a.execute(this);
                }
                throw th;
            }
            this.f4601e.post(this);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:84|85) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:83|(2:93|94)|95|96) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|(2:26|27)|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:66|67|(2:72|73)|(2:76|77)|78|79) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:38|39|(2:41|(13:43|44|45|46|47|48|49|(2:51|52)|53|54|55|56|(3:58|59|(3:61|62|63)(2:64|65)))(5:80|81|82|(1:87)(1:88)|(2:90|91)))(1:97)|98|99|100|101) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:48|49|(2:51|52)|53|54|55|56|(3:58|59|(3:61|62|63)(2:64|65))) */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r0 = r2.getErrorStream();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x015e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0167 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0185 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0188 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[SYNTHETIC, Splitter:B:26:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00df A[Catch:{ all -> 0x0165, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0154 A[SYNTHETIC, Splitter:B:72:0x0154] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b A[SYNTHETIC, Splitter:B:76:0x015b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:95:0x0185=Splitter:B:95:0x0185, B:55:0x00d7=Splitter:B:55:0x00d7, B:78:0x015e=Splitter:B:78:0x015e} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:98:0x0188=Splitter:B:98:0x0188, B:28:0x007d=Splitter:B:28:0x007d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.chartboost.sdk.Networking.C1854f m4204a(com.chartboost.sdk.Networking.C1851c<T> r10, int r11) throws java.io.IOException {
        /*
            r9 = this;
            com.chartboost.sdk.Networking.d r0 = r10.mo14330a()
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f4569a
            com.chartboost.sdk.Networking.m r2 = r9.f4598b
            java.net.HttpURLConnection r2 = r2.mo14357a(r10)
            r2.setConnectTimeout(r11)
            r2.setReadTimeout(r11)
            r11 = 0
            r2.setUseCaches(r11)
            r3 = 1
            r2.setDoInput(r3)
            if (r1 == 0) goto L_0x003a
            java.util.Set r4 = r1.keySet()     // Catch:{ all -> 0x01b8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01b8 }
        L_0x0024:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01b8 }
            if (r5 == 0) goto L_0x003a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01b8 }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x01b8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01b8 }
            r2.addRequestProperty(r5, r6)     // Catch:{ all -> 0x01b8 }
            goto L_0x0024
        L_0x003a:
            java.lang.String r1 = r10.f4560a     // Catch:{ all -> 0x01b8 }
            r2.setRequestMethod(r1)     // Catch:{ all -> 0x01b8 }
            java.lang.String r1 = r10.f4560a     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = "POST"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x01b8 }
            r4 = 0
            if (r1 == 0) goto L_0x007e
            byte[] r1 = r0.f4570b     // Catch:{ all -> 0x01b8 }
            if (r1 == 0) goto L_0x007e
            r2.setDoOutput(r3)     // Catch:{ all -> 0x01b8 }
            byte[] r1 = r0.f4570b     // Catch:{ all -> 0x01b8 }
            int r1 = r1.length     // Catch:{ all -> 0x01b8 }
            r2.setFixedLengthStreamingMode(r1)     // Catch:{ all -> 0x01b8 }
            java.lang.String r1 = r0.f4571c     // Catch:{ all -> 0x01b8 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = r0.f4571c     // Catch:{ all -> 0x01b8 }
            r2.addRequestProperty(r1, r3)     // Catch:{ all -> 0x01b8 }
        L_0x0062:
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x0077 }
            java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0077 }
            r1.<init>(r3)     // Catch:{ all -> 0x0077 }
            byte[] r0 = r0.f4570b     // Catch:{ all -> 0x0074 }
            r1.write(r0)     // Catch:{ all -> 0x0074 }
            r1.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x007e
        L_0x0074:
            r10 = move-exception
            r4 = r1
            goto L_0x0078
        L_0x0077:
            r10 = move-exception
        L_0x0078:
            if (r4 == 0) goto L_0x007d
            r4.close()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            throw r10     // Catch:{ all -> 0x01b8 }
        L_0x007e:
            com.chartboost.sdk.Libraries.j r0 = r9.f4600d     // Catch:{ all -> 0x01b8 }
            long r0 = r0.mo14255b()     // Catch:{ all -> 0x01b8 }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x01ad }
            com.chartboost.sdk.Libraries.j r5 = r9.f4600d     // Catch:{ all -> 0x01b8 }
            long r5 = r5.mo14255b()     // Catch:{ all -> 0x01b8 }
            long r0 = r5 - r0
            r10.f4566g = r0     // Catch:{ all -> 0x01b8 }
            r0 = -1
            if (r3 == r0) goto L_0x01a5
            boolean r0 = m4205a((int) r3)     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0186
            java.io.File r0 = r10.f4564e     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x015f
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x019a }
            java.io.File r1 = r10.f4564e     // Catch:{ all -> 0x019a }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r7.<init>()     // Catch:{ all -> 0x019a }
            java.io.File r8 = r10.f4564e     // Catch:{ all -> 0x019a }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x019a }
            r7.append(r8)     // Catch:{ all -> 0x019a }
            java.lang.String r8 = ".tmp"
            r7.append(r8)     // Catch:{ all -> 0x019a }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x019a }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x019a }
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x019a }
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ all -> 0x0150 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x014e }
            r7.<init>(r0)     // Catch:{ all -> 0x014e }
            com.chartboost.sdk.Libraries.C1827f.m4027a((java.io.InputStream) r1, (java.io.OutputStream) r7)     // Catch:{ all -> 0x014b }
            if (r1 == 0) goto L_0x00d4
            r1.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            r7.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            java.io.File r1 = r10.f4564e     // Catch:{ all -> 0x019a }
            boolean r1 = r0.renameTo(r1)     // Catch:{ all -> 0x019a }
            if (r1 != 0) goto L_0x0188
            boolean r11 = r0.delete()     // Catch:{ all -> 0x019a }
            java.lang.String r1 = "response_data_write_error"
            java.lang.String r3 = ""
            if (r11 != 0) goto L_0x011a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r4 = "Unable to delete "
            r11.append(r4)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x019a }
            r11.append(r0)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = " after failing to rename to "
            r11.append(r0)     // Catch:{ all -> 0x019a }
            java.io.File r0 = r10.f4564e     // Catch:{ all -> 0x019a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x019a }
            r11.append(r0)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.chartboost.sdk.Tracking.a r0 = new com.chartboost.sdk.Tracking.a     // Catch:{ all -> 0x019a }
            r0.<init>(r1, r11, r3, r3)     // Catch:{ all -> 0x019a }
            com.chartboost.sdk.Tracking.C1874e.m4311e(r0)     // Catch:{ all -> 0x019a }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x019a }
            r0.<init>(r11)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x011a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r4 = "Unable to move "
            r11.append(r4)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x019a }
            r11.append(r0)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = " to "
            r11.append(r0)     // Catch:{ all -> 0x019a }
            java.io.File r0 = r10.f4564e     // Catch:{ all -> 0x019a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x019a }
            r11.append(r0)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.chartboost.sdk.Tracking.a r0 = new com.chartboost.sdk.Tracking.a     // Catch:{ all -> 0x019a }
            r0.<init>(r1, r11, r3, r3)     // Catch:{ all -> 0x019a }
            com.chartboost.sdk.Tracking.C1874e.m4311e(r0)     // Catch:{ all -> 0x019a }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x019a }
            r0.<init>(r11)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x014b:
            r11 = move-exception
            r4 = r7
            goto L_0x0152
        L_0x014e:
            r11 = move-exception
            goto L_0x0152
        L_0x0150:
            r11 = move-exception
            r1 = r4
        L_0x0152:
            if (r1 == 0) goto L_0x0159
            r1.close()     // Catch:{ IOException -> 0x0158 }
            goto L_0x0159
        L_0x0158:
        L_0x0159:
            if (r4 == 0) goto L_0x015e
            r4.close()     // Catch:{ IOException -> 0x015e }
        L_0x015e:
            throw r11     // Catch:{ all -> 0x019a }
        L_0x015f:
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0167 }
        L_0x0163:
            r4 = r0
            goto L_0x016c
        L_0x0165:
            r11 = move-exception
            goto L_0x0180
        L_0x0167:
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ all -> 0x0165 }
            goto L_0x0163
        L_0x016c:
            if (r4 == 0) goto L_0x0178
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0165 }
            r11.<init>(r4)     // Catch:{ all -> 0x0165 }
            byte[] r11 = com.chartboost.sdk.Libraries.C1827f.m4031a((java.io.InputStream) r11)     // Catch:{ all -> 0x0165 }
            goto L_0x017a
        L_0x0178:
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0165 }
        L_0x017a:
            if (r4 == 0) goto L_0x0188
            r4.close()     // Catch:{ IOException -> 0x0188 }
            goto L_0x0188
        L_0x0180:
            if (r4 == 0) goto L_0x0185
            r4.close()     // Catch:{ IOException -> 0x0185 }
        L_0x0185:
            throw r11     // Catch:{ all -> 0x019a }
        L_0x0186:
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x019a }
        L_0x0188:
            com.chartboost.sdk.Libraries.j r0 = r9.f4600d     // Catch:{ all -> 0x01b8 }
            long r0 = r0.mo14255b()     // Catch:{ all -> 0x01b8 }
            long r0 = r0 - r5
            r10.f4567h = r0     // Catch:{ all -> 0x01b8 }
            com.chartboost.sdk.Networking.f r10 = new com.chartboost.sdk.Networking.f     // Catch:{ all -> 0x01b8 }
            r10.<init>(r3, r11)     // Catch:{ all -> 0x01b8 }
            r2.disconnect()
            return r10
        L_0x019a:
            r11 = move-exception
            com.chartboost.sdk.Libraries.j r0 = r9.f4600d     // Catch:{ all -> 0x01b8 }
            long r0 = r0.mo14255b()     // Catch:{ all -> 0x01b8 }
            long r0 = r0 - r5
            r10.f4567h = r0     // Catch:{ all -> 0x01b8 }
            throw r11     // Catch:{ all -> 0x01b8 }
        L_0x01a5:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x01b8 }
            java.lang.String r11 = "Could not retrieve response code from HttpUrlConnection."
            r10.<init>(r11)     // Catch:{ all -> 0x01b8 }
            throw r10     // Catch:{ all -> 0x01b8 }
        L_0x01ad:
            r11 = move-exception
            com.chartboost.sdk.Libraries.j r3 = r9.f4600d     // Catch:{ all -> 0x01b8 }
            long r3 = r3.mo14255b()     // Catch:{ all -> 0x01b8 }
            long r3 = r3 - r0
            r10.f4566g = r3     // Catch:{ all -> 0x01b8 }
            throw r11     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r10 = move-exception
            r2.disconnect()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Networking.C1862l.m4204a(com.chartboost.sdk.Networking.c, int):com.chartboost.sdk.Networking.f");
    }

    /* renamed from: a */
    public int compareTo(C1862l lVar) {
        return this.f4602f.f4562c - lVar.f4602f.f4562c;
    }
}
