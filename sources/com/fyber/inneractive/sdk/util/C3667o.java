package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.fyber.inneractive.sdk.player.p057a.C3103a;

/* renamed from: com.fyber.inneractive.sdk.util.o */
public final class C3667o extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: a */
    Context f9949a;

    /* renamed from: b */
    C3668a f9950b;

    /* renamed from: c */
    String f9951c;

    /* renamed from: d */
    String f9952d;

    /* renamed from: e */
    int f9953e;

    /* renamed from: f */
    private C3103a f9954f;

    /* renamed from: com.fyber.inneractive.sdk.util.o$a */
    public interface C3668a {
        /* renamed from: a */
        void mo18767a();

        /* renamed from: a */
        void mo18768a(Bitmap bitmap);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m9142b();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C3668a aVar = this.f9950b;
        if (aVar != null) {
            if (bitmap != null) {
                aVar.mo18768a(bitmap);
            } else {
                aVar.mo18767a();
            }
            this.f9950b = null;
        }
    }

    private C3667o(Context context, C3668a aVar, String str) {
        this.f9954f = null;
        this.f9949a = context;
        this.f9950b = aVar;
        this.f9951c = str;
        this.f9952d = null;
        this.f9953e = 81920;
    }

    public C3667o(Context context, C3668a aVar, String str, byte b) {
        this(context, aVar, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r7v7, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b3 A[SYNTHETIC, Splitter:B:62:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8 A[Catch:{ IOException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd A[Catch:{ IOException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc A[SYNTHETIC, Splitter:B:79:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e1 A[Catch:{ IOException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00e6 A[Catch:{ IOException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f2 A[SYNTHETIC, Splitter:B:91:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00f7 A[Catch:{ IOException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00fc A[Catch:{ IOException -> 0x0100 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m9142b() {
        /*
            r11 = this;
            com.fyber.inneractive.sdk.player.a.a r0 = r11.f9954f
            r1 = 1
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L_0x0104
            byte[] r0 = new byte[r2]
            java.io.File r5 = new java.io.File     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            android.content.Context r6 = r11.f9949a     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.lang.String r7 = r11.f9952d     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            if (r7 == 0) goto L_0x0035
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            r7.<init>()     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.util.UUID r8 = java.util.UUID.randomUUID()     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.lang.String r8 = r8.toString()     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            r7.append(r8)     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.lang.String r8 = ".mp4"
            r7.append(r8)     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.lang.String r7 = r7.toString()     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            goto L_0x0037
        L_0x0035:
            java.lang.String r7 = r11.f9952d     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
        L_0x0037:
            r5.<init>(r6, r7)     // Catch:{ MalformedURLException -> 0x00c5, IOException -> 0x009c, all -> 0x0097 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ MalformedURLException -> 0x0094, IOException -> 0x0091, all -> 0x008e }
            r6.<init>(r5)     // Catch:{ MalformedURLException -> 0x0094, IOException -> 0x0091, all -> 0x008e }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x008b, IOException -> 0x0088, all -> 0x0084 }
            java.lang.String r8 = r11.f9951c     // Catch:{ MalformedURLException -> 0x008b, IOException -> 0x0088, all -> 0x0084 }
            r7.<init>(r8)     // Catch:{ MalformedURLException -> 0x008b, IOException -> 0x0088, all -> 0x0084 }
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ MalformedURLException -> 0x008b, IOException -> 0x0088, all -> 0x0084 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ MalformedURLException -> 0x008b, IOException -> 0x0088, all -> 0x0084 }
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x007e, all -> 0x007a }
            r9 = 0
        L_0x0051:
            int r10 = r11.f9953e     // Catch:{ MalformedURLException -> 0x0077, IOException -> 0x0075 }
            int r10 = r10 - r2
            if (r9 >= r10) goto L_0x0061
            int r10 = r8.read(r0, r3, r2)     // Catch:{ MalformedURLException -> 0x0077, IOException -> 0x0075 }
            if (r10 < 0) goto L_0x0051
            r6.write(r0, r3, r10)     // Catch:{ MalformedURLException -> 0x0077, IOException -> 0x0075 }
            int r9 = r9 + r10
            goto L_0x0051
        L_0x0061:
            if (r7 == 0) goto L_0x0066
            r7.disconnect()     // Catch:{ IOException -> 0x0070 }
        L_0x0066:
            r6.close()     // Catch:{ IOException -> 0x0070 }
            if (r8 == 0) goto L_0x0108
            r8.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0108
        L_0x0070:
            r5.delete()
            goto L_0x0108
        L_0x0075:
            r0 = move-exception
            goto L_0x00a1
        L_0x0077:
            r0 = move-exception
            goto L_0x00ca
        L_0x007a:
            r0 = move-exception
            r8 = r4
            goto L_0x00ef
        L_0x007e:
            r0 = move-exception
            r8 = r4
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            r8 = r4
            goto L_0x00ca
        L_0x0084:
            r0 = move-exception
            r8 = r4
            goto L_0x00f0
        L_0x0088:
            r0 = move-exception
            r7 = r4
            goto L_0x00a0
        L_0x008b:
            r0 = move-exception
            r7 = r4
            goto L_0x00c9
        L_0x008e:
            r0 = move-exception
            r6 = r4
            goto L_0x009a
        L_0x0091:
            r0 = move-exception
            r6 = r4
            goto L_0x009f
        L_0x0094:
            r0 = move-exception
            r6 = r4
            goto L_0x00c8
        L_0x0097:
            r0 = move-exception
            r5 = r4
            r6 = r5
        L_0x009a:
            r8 = r6
            goto L_0x00f0
        L_0x009c:
            r0 = move-exception
            r5 = r4
            r6 = r5
        L_0x009f:
            r7 = r6
        L_0x00a0:
            r8 = r7
        L_0x00a1:
            java.lang.String r2 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C3670q.m9154a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00ee }
            r1[r3] = r0     // Catch:{ all -> 0x00ee }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)     // Catch:{ all -> 0x00ee }
            r5.delete()     // Catch:{ all -> 0x00ee }
            if (r7 == 0) goto L_0x00b6
            r7.disconnect()     // Catch:{ IOException -> 0x00c1 }
        L_0x00b6:
            if (r6 == 0) goto L_0x00bb
            r6.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00bb:
            if (r8 == 0) goto L_0x00c4
            r8.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00c4
        L_0x00c1:
            r5.delete()
        L_0x00c4:
            return r4
        L_0x00c5:
            r0 = move-exception
            r5 = r4
            r6 = r5
        L_0x00c8:
            r7 = r6
        L_0x00c9:
            r8 = r7
        L_0x00ca:
            java.lang.String r2 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C3670q.m9154a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00ee }
            r1[r3] = r0     // Catch:{ all -> 0x00ee }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)     // Catch:{ all -> 0x00ee }
            r5.delete()     // Catch:{ all -> 0x00ee }
            if (r7 == 0) goto L_0x00df
            r7.disconnect()     // Catch:{ IOException -> 0x00ea }
        L_0x00df:
            if (r6 == 0) goto L_0x00e4
            r6.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00e4:
            if (r8 == 0) goto L_0x00ed
            r8.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00ed
        L_0x00ea:
            r5.delete()
        L_0x00ed:
            return r4
        L_0x00ee:
            r0 = move-exception
        L_0x00ef:
            r4 = r7
        L_0x00f0:
            if (r4 == 0) goto L_0x00f5
            r4.disconnect()     // Catch:{ IOException -> 0x0100 }
        L_0x00f5:
            if (r6 == 0) goto L_0x00fa
            r6.close()     // Catch:{ IOException -> 0x0100 }
        L_0x00fa:
            if (r8 == 0) goto L_0x0103
            r8.close()     // Catch:{ IOException -> 0x0100 }
            goto L_0x0103
        L_0x0100:
            r5.delete()
        L_0x0103:
            throw r0
        L_0x0104:
            java.io.File r5 = r0.mo18672a()
        L_0x0108:
            com.fyber.inneractive.sdk.player.a.a r0 = r11.f9954f
            if (r0 != 0) goto L_0x0112
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            goto L_0x0114
        L_0x0112:
            java.lang.Object r0 = r0.f7628e
        L_0x0114:
            android.media.MediaMetadataRetriever r6 = new android.media.MediaMetadataRetriever
            r6.<init>()
            monitor-enter(r0)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r7 = r5.getPath()     // Catch:{ all -> 0x0131 }
            r6.setDataSource(r7)     // Catch:{ all -> 0x0131 }
            r6.extractMetadata(r2)     // Catch:{ all -> 0x0131 }
            r7 = 1
            android.graphics.Bitmap r4 = r6.getFrameAtTime(r7)     // Catch:{ all -> 0x0131 }
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
        L_0x012b:
            r6.release()     // Catch:{ all -> 0x012f }
            goto L_0x0145
        L_0x012f:
            goto L_0x0145
        L_0x0131:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
            throw r2     // Catch:{ Exception -> 0x0136 }
        L_0x0134:
            r0 = move-exception
            goto L_0x014f
        L_0x0136:
            r0 = move-exception
            java.lang.String r2 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C3670q.m9154a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0134 }
            r1[r3] = r0     // Catch:{ all -> 0x0134 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)     // Catch:{ all -> 0x0134 }
            goto L_0x012b
        L_0x0145:
            com.fyber.inneractive.sdk.player.a.a r0 = r11.f9954f
            if (r0 != 0) goto L_0x014e
            if (r5 == 0) goto L_0x014e
            r5.delete()
        L_0x014e:
            return r4
        L_0x014f:
            r6.release()     // Catch:{ all -> 0x0152 }
        L_0x0152:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3667o.m9142b():android.graphics.Bitmap");
    }

    /* renamed from: a */
    public final void mo19580a() {
        super.cancel(true);
        this.f9950b = null;
    }
}
