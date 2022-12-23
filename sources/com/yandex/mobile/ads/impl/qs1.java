package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;

public final class qs1 implements os1 {

    /* renamed from: a */
    private final ps1 f39283a;

    public qs1(C15051wi wiVar) {
        Intrinsics.checkNotNullParameter(wiVar, "customCertificatesProvider");
        this.f39283a = new ps1(wiVar);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f39283a.mo69427a(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f39283a.mo69430b(x509CertificateArr, str);
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f39283a.mo69433c();
    }
}
