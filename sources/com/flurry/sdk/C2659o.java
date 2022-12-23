package com.flurry.sdk;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.flurry.sdk.o */
public class C2659o extends C2662r {

    /* renamed from: i */
    private static final String f6252i = C2659o.class.getSimpleName();

    /* renamed from: j */
    private static String f6253j;

    /* renamed from: k */
    private HttpsURLConnection f6254k;

    /* renamed from: l */
    private String f6255l;

    /* renamed from: m */
    private boolean f6256m;

    C2659o(String str) {
        this.f6262a = str;
        f6253j = "Flurry-Config/1.0 (Android " + Build.VERSION.RELEASE + "/" + Build.ID + ")";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream mo17863a() throws java.io.IOException {
        /*
            r6 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r6.f6262a
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
            r6.f6254k = r0
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            r1 = 15000(0x3a98, float:2.102E-41)
            r0.setConnectTimeout(r1)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            java.lang.String r1 = "POST"
            r0.setRequestMethod(r1)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            java.lang.String r1 = f6253j
            java.lang.String r2 = "User-Agent"
            r0.setRequestProperty(r2, r1)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.setRequestProperty(r1, r2)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            r1 = 1
            r0.setDoInput(r1)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            r0.setDoOutput(r1)
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            r0.connect()
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            com.flurry.sdk.C2665t.m5806a((javax.net.ssl.HttpsURLConnection) r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r1)
            r6.f6264c = r0
            r0 = 0
            javax.net.ssl.HttpsURLConnection r1 = r6.f6254k     // Catch:{ all -> 0x0110 }
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch:{ all -> 0x0110 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ all -> 0x010b }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x010b }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x010b }
            r2.<init>(r3)     // Catch:{ all -> 0x010b }
            java.lang.String r0 = r6.f6264c     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = com.flurry.sdk.C2661q.m5793a(r0)     // Catch:{ all -> 0x0109 }
            r2.write(r0)     // Catch:{ all -> 0x0109 }
            r2.close()
            if (r1 == 0) goto L_0x007d
            r1.close()
        L_0x007d:
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            int r0 = r0.getResponseCode()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 >= r1) goto L_0x00f9
            javax.net.ssl.HttpsURLConnection r1 = r6.f6254k
            java.lang.String r2 = "Content-Signature"
            java.lang.String r1 = r1.getHeaderField(r2)
            r6.f6255l = r1
            javax.net.ssl.HttpsURLConnection r1 = r6.f6254k
            java.lang.String r2 = "ETag"
            java.lang.String r1 = r1.getHeaderField(r2)
            r6.f6268g = r1
            java.lang.String r1 = f6252i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Content-Signature: "
            r2.<init>(r3)
            java.lang.String r3 = r6.f6255l
            r2.append(r3)
            java.lang.String r3 = ", ETag: "
            r2.append(r3)
            java.lang.String r3 = r6.f6268g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.flurry.sdk.C2530db.m5476a(r1, r2)
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L_0x00f2
            java.lang.String r0 = r6.f6264c
            boolean r0 = r6.mo17864a(r0)
            if (r0 == 0) goto L_0x00d2
            com.flurry.sdk.g r0 = com.flurry.sdk.C2649g.f6212b
            r6.f6263b = r0
            java.lang.String r0 = f6252i
            java.lang.String r1 = "Empty 304 payload; No Change."
            com.flurry.sdk.C2530db.m5476a(r0, r1)
            goto L_0x00f2
        L_0x00d2:
            com.flurry.sdk.g r0 = new com.flurry.sdk.g
            com.flurry.sdk.g$a r1 = com.flurry.sdk.C2649g.C2650a.AUTHENTICATE
            java.lang.String r2 = "GUID Signature Error."
            r0.<init>(r1, r2)
            r6.f6263b = r0
            java.lang.String r0 = f6252i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Authentication error: "
            r1.<init>(r2)
            com.flurry.sdk.g r2 = r6.f6263b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.flurry.sdk.C2530db.m5482b(r0, r1)
        L_0x00f2:
            javax.net.ssl.HttpsURLConnection r0 = r6.f6254k
            java.io.InputStream r0 = r0.getInputStream()
            return r0
        L_0x00f9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Server response code is "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0109:
            r0 = move-exception
            goto L_0x0114
        L_0x010b:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x0114
        L_0x0110:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x0114:
            if (r2 == 0) goto L_0x0119
            r2.close()
        L_0x0119:
            if (r1 == 0) goto L_0x011e
            r1.close()
        L_0x011e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2659o.mo17863a():java.io.InputStream");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17865b() {
        HttpsURLConnection httpsURLConnection = this.f6254k;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
    }

    /* renamed from: c */
    public final boolean mo17866c() {
        return "https://cfg.flurry.com/sdk/v1/config".equals(this.f6262a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17864a(String str) {
        boolean z;
        if (!m5786b(this.f6255l)) {
            return false;
        }
        if (this.f6256m) {
            z = C2665t.m5817c(this.f6266e, str, this.f6267f);
        } else {
            z = C2665t.m5815b(this.f6266e, str, this.f6267f);
        }
        if (z) {
            return true;
        }
        C2530db.m5482b(f6252i, "Incorrect signature for response.");
        return false;
    }

    /* renamed from: b */
    private boolean m5786b(String str) {
        if (TextUtils.isEmpty(str)) {
            C2530db.m5482b(f6252i, "Content-Signature is empty.");
            return false;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(";")) {
            int indexOf = str2.indexOf("=");
            if (indexOf > 0) {
                hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
        this.f6265d = (String) hashMap.get("keyid");
        if (TextUtils.isEmpty(this.f6265d)) {
            C2530db.m5482b(f6252i, "Error to get keyid from Signature.");
            return false;
        }
        this.f6266e = C2666u.f6274a.get(this.f6265d);
        C2530db.m5476a(f6252i, "Signature keyid: " + this.f6265d + ", key: " + this.f6266e);
        if (this.f6266e == null) {
            C2530db.m5482b(f6252i, "Unknown keyid from Signature.");
            return false;
        }
        String str3 = "sha256ecdsa";
        boolean containsKey = hashMap.containsKey(str3);
        this.f6256m = containsKey;
        if (!containsKey) {
            str3 = "sha256rsa";
        }
        this.f6267f = (String) hashMap.get(str3);
        if (TextUtils.isEmpty(this.f6267f)) {
            C2530db.m5482b(f6252i, "Error to get rsa from Signature.");
            return false;
        }
        C2530db.m5476a(f6252i, "Signature rsa: " + this.f6267f);
        return true;
    }
}
