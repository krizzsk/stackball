package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

public final class o61 {

    /* renamed from: a */
    private final X509TrustManager f38105a;

    public o61(X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        this.f38105a = x509TrustManager;
    }

    /* renamed from: a */
    public final SSLContext mo69124a() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, new X509TrustManager[]{this.f38105a}, (SecureRandom) null);
            Intrinsics.checkNotNullExpressionValue(instance, "{\n            val sslCon…     sslContext\n        }");
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No system TLS", e);
        } catch (KeyManagementException e2) {
            throw new IllegalStateException("Failed to initialize SSLContext", e2);
        }
    }
}
