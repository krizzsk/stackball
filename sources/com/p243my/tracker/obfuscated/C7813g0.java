package com.p243my.tracker.obfuscated;

import com.p243my.tracker.MyTrackerConfig;
import com.p243my.tracker.obfuscated.C7872t;
import okhttp3.MediaType;

/* renamed from: com.my.tracker.obfuscated.g0 */
public final class C7813g0 extends C7872t<String> {

    /* renamed from: d */
    static final MediaType f19879d = MediaType.parse("application/octet-stream");

    /* renamed from: a */
    final C7872t.C7873a f19880a;

    /* renamed from: b */
    final MyTrackerConfig.OkHttpClientProvider f19881b;

    /* renamed from: c */
    final boolean f19882c;

    C7813g0(C7872t.C7873a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.f19880a = aVar;
        this.f19881b = okHttpClientProvider;
        this.f19882c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db A[SYNTHETIC, Splitter:B:45:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0 A[Catch:{ all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p243my.tracker.obfuscated.C7872t.C7874b<java.lang.String> mo52289a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "OkHttpPostRequest error: error while sending data"
            com.my.tracker.obfuscated.t$b r1 = com.p243my.tracker.obfuscated.C7872t.C7874b.m21537c()
            r2 = 0
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r4.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = "OkHttpPostRequest: send request to "
            r4.append(r5)     // Catch:{ all -> 0x00e4 }
            r4.append(r10)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00e4 }
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r4)     // Catch:{ all -> 0x00e4 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00d6 }
            r4.<init>()     // Catch:{ all -> 0x00d6 }
            boolean r5 = r9.f19882c     // Catch:{ all -> 0x00d3 }
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = "OkHttpPostRequest: populating post request body using gzip"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00d3 }
            r5.<init>(r4)     // Catch:{ all -> 0x00d3 }
            com.my.tracker.obfuscated.t$a r6 = r9.f19880a     // Catch:{ all -> 0x0038 }
            r6.mo52384a(r5)     // Catch:{ all -> 0x0038 }
            r5.finish()     // Catch:{ all -> 0x0038 }
            goto L_0x0049
        L_0x0038:
            r10 = move-exception
            goto L_0x00d9
        L_0x003b:
            java.lang.String r5 = "OkHttpPostRequest: populating post request body without using gzip"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            com.my.tracker.obfuscated.t$a r5 = r9.f19880a     // Catch:{ all -> 0x00d3 }
            r5.mo52384a(r4)     // Catch:{ all -> 0x00d3 }
            r4.flush()     // Catch:{ all -> 0x00d3 }
            r5 = r3
        L_0x0049:
            okhttp3.Request$Builder r6 = new okhttp3.Request$Builder     // Catch:{ all -> 0x0038 }
            r6.<init>()     // Catch:{ all -> 0x0038 }
            okhttp3.Request$Builder r10 = r6.url((java.lang.String) r10)     // Catch:{ all -> 0x0038 }
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            okhttp3.Request$Builder r10 = r10.header(r6, r7)     // Catch:{ all -> 0x0038 }
            byte[] r6 = r4.toByteArray()     // Catch:{ all -> 0x0038 }
            okhttp3.MediaType r7 = f19879d     // Catch:{ all -> 0x0038 }
            okhttp3.RequestBody r6 = okhttp3.RequestBody.create(r6, r7)     // Catch:{ all -> 0x0038 }
            okhttp3.Request$Builder r10 = r10.post(r6)     // Catch:{ all -> 0x0038 }
            okhttp3.Request r10 = r10.build()     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x0071
            r5.close()     // Catch:{ all -> 0x00e4 }
        L_0x0071:
            r4.close()     // Catch:{ all -> 0x00e4 }
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r4 = r9.f19881b     // Catch:{ all -> 0x00e4 }
            okhttp3.OkHttpClient r4 = r4.getOkHttpClient()     // Catch:{ all -> 0x00e4 }
            okhttp3.Call r10 = r4.newCall(r10)     // Catch:{ all -> 0x00e4 }
            okhttp3.Response r10 = r10.execute()     // Catch:{ all -> 0x00e4 }
            int r4 = r10.code()     // Catch:{ all -> 0x00ce }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x00a6
            r6 = 204(0xcc, float:2.86E-43)
            if (r4 != r6) goto L_0x008f
            goto L_0x00a6
        L_0x008f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r6.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = "OkHttpPostRequest error: response code "
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            r6.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ce }
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r6)     // Catch:{ all -> 0x00ce }
            r1.f20166a = r2     // Catch:{ all -> 0x00ce }
            goto L_0x00ae
        L_0x00a6:
            java.lang.String r6 = "OkHttpPostRequest: response successfully received"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r6)     // Catch:{ all -> 0x00ce }
            r6 = 1
            r1.f20166a = r6     // Catch:{ all -> 0x00ce }
        L_0x00ae:
            if (r4 != r5) goto L_0x00ef
            java.lang.String r4 = "OkHttpPostRequest: processing server response"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r4)     // Catch:{ all -> 0x00ce }
            okhttp3.ResponseBody r4 = r10.body()     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x00bf
            java.lang.String r3 = r4.string()     // Catch:{ all -> 0x00ce }
        L_0x00bf:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x00c8
            r1.f20167b = r3     // Catch:{ all -> 0x00ce }
            goto L_0x00ef
        L_0x00c8:
            java.lang.String r3 = "OkHttpPostRequest: response data is empty"
            com.p243my.tracker.obfuscated.C7877u0.m21547a((java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            goto L_0x00ef
        L_0x00ce:
            r3 = move-exception
            r8 = r3
            r3 = r10
            r10 = r8
            goto L_0x00e5
        L_0x00d3:
            r10 = move-exception
            r5 = r3
            goto L_0x00d9
        L_0x00d6:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x00d9:
            if (r5 == 0) goto L_0x00de
            r5.close()     // Catch:{ all -> 0x00e4 }
        L_0x00de:
            if (r4 == 0) goto L_0x00e3
            r4.close()     // Catch:{ all -> 0x00e4 }
        L_0x00e3:
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r10 = move-exception
        L_0x00e5:
            com.p243my.tracker.obfuscated.C7877u0.m21548a(r0, r10)     // Catch:{ all -> 0x00f3 }
            r1.f20166a = r2     // Catch:{ all -> 0x00f3 }
            r1.f20168c = r0     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x00f2
            r10 = r3
        L_0x00ef:
            r10.close()
        L_0x00f2:
            return r1
        L_0x00f3:
            r10 = move-exception
            if (r3 == 0) goto L_0x00f9
            r3.close()
        L_0x00f9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.tracker.obfuscated.C7813g0.mo52289a(java.lang.String):com.my.tracker.obfuscated.t$b");
    }
}
