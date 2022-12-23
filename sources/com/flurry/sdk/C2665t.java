package com.flurry.sdk;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: com.flurry.sdk.t */
public class C2665t {

    /* renamed from: a */
    public static final Charset f6271a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final String f6272b = C2665t.class.getSimpleName();

    /* renamed from: c */
    private static X509TrustManagerExtensions f6273c;

    static {
        f6273c = null;
        if (Build.VERSION.SDK_INT >= 17) {
            f6273c = new X509TrustManagerExtensions(m5813b());
        }
    }

    /* renamed from: d */
    private static String m5818d(Context context) {
        return context.getPackageName() + ".variants";
    }

    /* renamed from: a */
    public static synchronized boolean m5808a(Context context) {
        boolean b;
        synchronized (C2665t.class) {
            b = m5814b(context, m5818d(context));
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized boolean m5814b(Context context, String str) {
        boolean exists;
        synchronized (C2665t.class) {
            exists = context.getFileStreamPath(str).exists();
        }
        return exists;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:40|(2:42|43)|44|45) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0059 A[SYNTHETIC, Splitter:B:42:0x0059] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x002a=Splitter:B:13:0x002a, B:44:0x005c=Splitter:B:44:0x005c} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0048=Splitter:B:32:0x0048, B:22:0x0039=Splitter:B:22:0x0039} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m5812b(android.content.Context r6) {
        /*
            java.lang.Class<com.flurry.sdk.t> r0 = com.flurry.sdk.C2665t.class
            monitor-enter(r0)
            r1 = 0
            java.lang.String r2 = m5818d(r6)     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0037, all -> 0x0032 }
            java.io.FileInputStream r6 = r6.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0037, all -> 0x0032 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
        L_0x001b:
            java.lang.String r4 = r3.readLine()     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            if (r4 == 0) goto L_0x0025
            r2.append(r4)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0030 }
            goto L_0x001b
        L_0x0025:
            if (r6 == 0) goto L_0x002a
            r6.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x005d }
            monitor-exit(r0)
            return r6
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x0057
        L_0x0037:
            r2 = move-exception
            r6 = r1
        L_0x0039:
            java.lang.String r3 = f6272b     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "Error in reading file!"
            com.flurry.sdk.C2530db.m5477a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0045
            r6.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            monitor-exit(r0)
            return r1
        L_0x0047:
            r6 = r1
        L_0x0048:
            java.lang.String r2 = f6272b     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "File not found!"
            com.flurry.sdk.C2530db.m5490e(r2, r3)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0054
            r6.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            monitor-exit(r0)
            return r1
        L_0x0056:
            r1 = move-exception
        L_0x0057:
            if (r6 == 0) goto L_0x005c
            r6.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2665t.m5812b(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x003b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m5805a(android.content.Context r4, java.lang.String r5) {
        /*
            java.lang.Class<com.flurry.sdk.t> r0 = com.flurry.sdk.C2665t.class
            monitor-enter(r0)
            if (r5 != 0) goto L_0x0007
            monitor-exit(r0)
            return
        L_0x0007:
            r1 = 0
            java.lang.String r2 = m5818d(r4)     // Catch:{ IOException -> 0x0023 }
            r3 = 0
            java.io.FileOutputStream r1 = r4.openFileOutput(r2, r3)     // Catch:{ IOException -> 0x0023 }
            byte[] r4 = r5.getBytes()     // Catch:{ IOException -> 0x0023 }
            r1.write(r4)     // Catch:{ IOException -> 0x0023 }
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x001f }
            monitor-exit(r0)
            return
        L_0x001f:
            monitor-exit(r0)
            return
        L_0x0021:
            r4 = move-exception
            goto L_0x0036
        L_0x0023:
            r4 = move-exception
            java.lang.String r5 = f6272b     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = "Error in writing data to file"
            com.flurry.sdk.C2530db.m5477a((java.lang.String) r5, (java.lang.String) r2, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0032 }
            monitor-exit(r0)
            return
        L_0x0032:
            monitor-exit(r0)
            return
        L_0x0034:
            monitor-exit(r0)
            return
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2665t.m5805a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    public static synchronized boolean m5816c(Context context) {
        boolean deleteFile;
        synchronized (C2665t.class) {
            deleteFile = context.deleteFile(m5818d(context));
            if (deleteFile) {
                C2530db.m5490e(f6272b, "File removed from memory");
            } else {
                C2530db.m5490e(f6272b, "Error in clearing data from memory");
            }
        }
        return deleteFile;
    }

    /* renamed from: a */
    public static void m5806a(HttpsURLConnection httpsURLConnection) throws SSLException {
        if (Build.VERSION.SDK_INT >= 17 && f6273c != null) {
            String str = "";
            try {
                Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
                List<X509Certificate> checkServerTrusted = f6273c.checkServerTrusted((X509Certificate[]) Arrays.copyOf(serverCertificates, serverCertificates.length, X509Certificate[].class), "RSA", httpsURLConnection.getURL().getHost());
                if (checkServerTrusted != null) {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    for (X509Certificate next : checkServerTrusted) {
                        byte[] encoded = next.getPublicKey().getEncoded();
                        instance.update(encoded, 0, encoded.length);
                        String encodeToString = Base64.encodeToString(instance.digest(), 2);
                        if (C2666u.f6275b.contains(encodeToString)) {
                            C2530db.m5476a(f6272b, "Found matched pin: ".concat(String.valueOf(encodeToString)));
                            return;
                        }
                        str = str + "    sha256/" + encodeToString + ": " + next.getSubjectDN().toString() + "\n";
                    }
                    throw new SSLPeerUnverifiedException("Certificate pinning failure!\n  Peer certificate chain:\n".concat(String.valueOf(str)));
                }
                throw new SSLPeerUnverifiedException("Empty trusted chain Certificate.");
            } catch (NoSuchAlgorithmException e) {
                C2530db.m5477a(f6272b, "Error in validating pinning: ", (Throwable) e);
            } catch (CertificateException e2) {
                C2530db.m5477a(f6272b, "Error in getting certificate: ", (Throwable) e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static javax.net.ssl.X509TrustManager m5813b() {
        /*
            java.lang.String r0 = "Error in getting trust manager: "
            r1 = 0
            java.lang.String r2 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ NoSuchAlgorithmException -> 0x001b, KeyStoreException -> 0x0013 }
            javax.net.ssl.TrustManagerFactory r2 = javax.net.ssl.TrustManagerFactory.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x001b, KeyStoreException -> 0x0013 }
            r2.init(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0011, KeyStoreException -> 0x000f }
            goto L_0x0022
        L_0x000f:
            r3 = move-exception
            goto L_0x0015
        L_0x0011:
            r3 = move-exception
            goto L_0x001d
        L_0x0013:
            r3 = move-exception
            r2 = r1
        L_0x0015:
            java.lang.String r4 = f6272b
            com.flurry.sdk.C2530db.m5477a((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r3)
            goto L_0x0022
        L_0x001b:
            r3 = move-exception
            r2 = r1
        L_0x001d:
            java.lang.String r4 = f6272b
            com.flurry.sdk.C2530db.m5477a((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r3)
        L_0x0022:
            if (r2 != 0) goto L_0x0025
            return r1
        L_0x0025:
            javax.net.ssl.TrustManager[] r0 = r2.getTrustManagers()
            int r2 = r0.length
            r3 = 0
        L_0x002b:
            if (r3 >= r2) goto L_0x003a
            r4 = r0[r3]
            boolean r5 = r4 instanceof javax.net.ssl.X509TrustManager
            if (r5 == 0) goto L_0x0037
            r1 = r4
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2665t.m5813b():javax.net.ssl.X509TrustManager");
    }

    /* renamed from: a */
    public static boolean m5810a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || (str4 = C2666u.f6274a.get(str)) == null) {
            return false;
        }
        if (str.indexOf("com.flurry.configkey.prod.ec.") != -1) {
            return m5817c(str4, str2, str3);
        }
        return m5815b(str4, str2, str3);
    }

    /* renamed from: b */
    public static boolean m5815b(String str, String str2, String str3) {
        return m5811a(str, str2, str3, "RSA", "SHA256withRSA");
    }

    /* renamed from: c */
    public static boolean m5817c(String str, String str2, String str3) {
        return m5811a(str, str2, str3, "EC", "SHA256withECDSA");
    }

    /* renamed from: a */
    private static boolean m5811a(String str, String str2, String str3, String str4, String str5) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str4).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            Signature instance = Signature.getInstance(str5);
            instance.initVerify(generatePublic);
            instance.update(str2.getBytes(f6271a));
            return instance.verify(Base64.decode(str3, 0));
        } catch (GeneralSecurityException e) {
            C2530db.m5482b(f6272b, "GeneralSecurityException for Signature: ".concat(String.valueOf(e)));
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5807a() {
        try {
            KeyFactory.getInstance("EC");
            Signature.getInstance("SHA256withECDSA");
            return true;
        } catch (NoSuchAlgorithmException e) {
            C2530db.m5476a(f6272b, "ECDSA encryption is not available: ".concat(String.valueOf(e)));
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5809a(String str) {
        return "com.flurry.configkey.prod.ec.1".equals(str) || "com.flurry.configkey.prod.rot.6".equals(str) || "com.flurry.configkey.prod.fs.0".equals(str);
    }
}
