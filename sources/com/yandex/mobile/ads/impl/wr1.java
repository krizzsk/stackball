package com.yandex.mobile.ads.impl;

import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.jvm.internal.Intrinsics;

public final class wr1 extends X509ExtendedTrustManager implements os1 {

    /* renamed from: a */
    private final ps1 f42206a;

    public wr1(C15051wi wiVar) {
        Intrinsics.checkNotNullParameter(wiVar, "customCertificatesProvider");
        this.f42206a = new ps1(wiVar);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.f42206a.mo69428a(x509CertificateArr, str, socket);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f42206a.mo69430b(x509CertificateArr, str);
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f42206a.mo69433c();
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.f42206a.mo69429a(x509CertificateArr, str, sSLEngine);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.f42206a.mo69431b(x509CertificateArr, str, socket);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f42206a.mo69427a(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.f42206a.mo69432b(x509CertificateArr, str, sSLEngine);
    }
}
