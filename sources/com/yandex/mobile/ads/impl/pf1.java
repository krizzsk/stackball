package com.yandex.mobile.ads.impl;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class pf1 {

    /* renamed from: a */
    private static final Lazy f38604a = LazyKt.lazy(C14277a.f38606b);

    /* renamed from: b */
    public static final /* synthetic */ int f38605b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.pf1$a */
    static final class C14277a extends Lambda implements Function0<CertificateFactory> {

        /* renamed from: b */
        public static final C14277a f38606b = new C14277a();

        C14277a() {
            super(0);
        }

        public Object invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static final X509TrustManager m40774a(KeyStore keyStore) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore);
            TrustManager[] trustManagers = instance.getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.firstOrNull(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final X509Certificate m40773a(byte[] bArr) {
        Certificate certificate;
        Intrinsics.checkNotNullParameter(bArr, "certBytes");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f38604a.getValue();
            if (certificateFactory == null) {
                certificate = null;
            } else {
                certificate = certificateFactory.generateCertificate(byteArrayInputStream);
            }
            return (X509Certificate) certificate;
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m40775a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
