package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.q7 */
public final class C14360q7 extends C14587se {

    /* renamed from: b */
    private final X509TrustManager f39014b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f39015c;

    public C14360q7(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f39014b = x509TrustManager;
        this.f39015c = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List<Certificate> mo69500a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(list, "chain");
        Intrinsics.checkNotNullParameter(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f39015c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensions.checkServerTrusted(certificates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14360q7) && ((C14360q7) obj).f39014b == this.f39014b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f39014b);
    }
}
