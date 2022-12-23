package com.yandex.mobile.ads.impl;

import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.a8 */
public final class C12364a8 {
    /* renamed from: a */
    public static final os1 m33629a(C15051wi wiVar) {
        Intrinsics.checkNotNullParameter(wiVar, "customCertificatesProvider");
        return new wr1(wiVar);
    }

    /* renamed from: b */
    public static final void m33632b(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    public static final void m33630a(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: b */
    public static final void m33633b(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    public static final void m33631a(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }
}
